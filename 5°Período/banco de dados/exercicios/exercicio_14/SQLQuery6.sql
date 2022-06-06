CREATE PROCEDURE todosCuponsItemDescFunc2(@pDataIni date, @pDataFim date)
AS
BEGIN
  SELECT FUN.nome, E.nome_fantasia, CA.descricao, IC.item, P.nome
  FROM dbo.cupon_fiscal AS C  
		INNER JOIN dbo.item_cupom_fiscal AS IC
		ON IC.cupom_fiscal_ccf = C.ccf
		INNER JOIN dbo.empresa AS E 
		ON E.cnpj = C.empresa_cnpj
		INNER JOIN dbo.funcionario_caixa as FCA
		ON  FCA.idfuncionario_caixa = C.funcionario_caixa_idfuncionario_caixa
		INNER JOIN dbo.caixa AS CA
		ON CA.idcaixa = FCA.caixa_idcaixa
		INNER JOIN dbo.funcionario AS FUN
		ON FUN.cpf = FCA.funcionario_cpf
		INNER JOIN dbo.produto AS P
		ON P.idproduto = IC.produto_idproduto
  where data between @pDataIni and @pDataFim and  FCA.hora_fechamento = NULL AND FCA.hora_abertura = NULL 
END
GO


DECLARE @RC int
DECLARE @pDataIni date
DECLARE @pDataFim date

set @pDataIni = '1997-01-01';
set @pDataFim = '1997-01-02';

EXECUTE @RC = [dbo].[todosCuponsItemDescFunc2] 
   @pDataIni
  ,@pDataFim
GO