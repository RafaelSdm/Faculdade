CREATE PROCEDURE todosCuponsItem1(@pDataIni date, @pDataFim date)
AS
BEGIN
  SELECT C.ccf, C.data, C.empresa_cnpj, C.funcionario_caixa_idfuncionario_caixa, C.hora, C.valor_total, IC.qtd, E.nome_fantasia
  FROM dbo.cupon_fiscal AS C  
		INNER JOIN dbo.item_cupom_fiscal AS IC
		ON C.ccf = IC.cupom_fiscal_ccf
		INNER JOIN dbo.empresa AS E 
		ON E.cnpj = C.empresa_cnpj
  where data between @pDataIni and @pDataFim 
END
GO


DECLARE @RC int
DECLARE @pDataIni date
DECLARE @pDataFim date

set @pDataIni = '1997-01-01';
set @pDataFim = '1997-01-02';

EXECUTE @RC = [dbo].[todosCuponsItem1] 
   @pDataIni
  ,@pDataFim
GO

/*e.	Todos os Cupons Fiscais com seu total e número de itens mostrando também a empresa; */