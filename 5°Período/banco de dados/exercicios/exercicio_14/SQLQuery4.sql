CREATE PROCEDURE todosCuponsCaixaFechado(@pDataIni date, @pDataFim date)
AS
BEGIN
  SELECT  *
  FROM dbo.cupon_fiscal AS C  
		INNER JOIN dbo.funcionario_caixa AS IC
		ON C.funcionario_caixa_idfuncionario_caixa = IC.caixa_idcaixa
	
  where IC.hora_fechamento = NULL 
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