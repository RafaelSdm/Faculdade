CREATE PROCEDURE todosCuponsPeriodoB2(@pDataIni date, @pDataFim date)
AS
BEGIN
  SELECT C.data, P.nome, IC.qtd, IC.valor_item
  FROM dbo.cupon_fiscal AS C  
		INNER JOIN dbo.item_cupom_fiscal AS IC
		ON C.ccf = IC.cupom_fiscal_ccf
		INNER JOIN dbo.produto AS P ON
		IC.produto_idproduto = P.idproduto	
  where data between @pDataIni and @pDataFim 
END
GO


DECLARE @RC int
DECLARE @pDataIni date
DECLARE @pDataFim date

set @pDataIni = '1997-01-01';
set @pDataFim = '1997-01-02';

EXECUTE @RC = [dbo].[todosCuponsPeriodoB2] 
   @pDataIni
  ,@pDataFim
GO