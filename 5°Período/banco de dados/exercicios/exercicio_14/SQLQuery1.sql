
CREATE PROCEDURE todosCuponsPeriodo_3(@pDataIni date, @pDataFim date)
AS
BEGIN
  SELECT *
  FROM dbo.cupon_fiscal
  where data between @pDataIni and @pDataFim
END
GO

DECLARE @RC int
DECLARE @pDataIni date
DECLARE @pDataFim date

set @pDataIni = '1997-01-01';
set @pDataFim = '1997-01-02';

EXECUTE @RC = [dbo].[todosCuponsPeriodo_3] 
   @pDataIni
  ,@pDataFim
GO

