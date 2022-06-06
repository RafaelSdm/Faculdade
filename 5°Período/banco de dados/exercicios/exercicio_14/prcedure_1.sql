CREATE PROCEDURE todosCuponsItemFuncionario4(@pDataIni date, @pDataFim date)
AS
BEGIN
  SELECT FUN.nome, E.nome_fantasia, CA.descricao, IC.item, P.nome
  FROM dbo.cupon_fiscal AS C  
		INNER JOIN dbo.item_cupom_fiscal AS IC
		ON C.ccf = IC.cupom_fiscal_ccf
		
		INNER JOIN dbo.empresa AS E 
		ON E.cnpj = C.empresa_cnpj
		INNER JOIN dbo.funcionario_caixa AS FC
		ON FC.idfuncionario_caixa = C.funcionario_caixa_idfuncionario_caixa
		INNER JOIN dbo.funcionario as FUN
		ON FUN.cpf = FC.funcionario_cpf
		INNER JOIN dbo.caixa AS CA
		ON CA.idcaixa = FC.caixa_idcaixa

		INNER JOIN dbo.produto as P
		ON P.idproduto = IC.produto_idproduto
		
		
  where FC.hora_fechamento = null 
END
GO


DECLARE @RC int
DECLARE @pDataIni date
DECLARE @pDataFim date

set @pDataIni = '1997-01-01';
set @pDataFim = '1997-01-02';

EXECUTE @RC = [dbo].[todosCuponsItemFuncionario4] 
   @pDataIni
  ,@pDataFim
GO

/*f.	Todos os Cupons Fiscais com: A Empresa, O Funcionário que fechou o caixa, a descrição do caixa, quais itens compõem cada cupom com seus respectivos produtos.; */