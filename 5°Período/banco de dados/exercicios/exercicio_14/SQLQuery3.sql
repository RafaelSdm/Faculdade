CREATE PROCEDURE todosNOMESPeriodo2(@pDataIni date, @pDataFim date)
AS
BEGIN
  SELECT F.nome, C.ccf, C.data, C.empresa_cnpj, C.valor_total, C.funcionario_caixa_idfuncionario_caixa, C.hora
  FROM funcionario AS F  
		INNER JOIN dbo.funcionario_caixa AS FC
		ON FC.funcionario_cpf = F.cpf
		INNER JOIN dbo.cupon_fiscal AS C 
		ON FC.idfuncionario_caixa = C.funcionario_caixa_idfuncionario_caixa
	
  where data between @pDataIni and @pDataFim 
END
GO


DECLARE @RC int
DECLARE @pDataIni date
DECLARE @pDataFim date

set @pDataIni = '1997-01-01';
set @pDataFim = '1997-01-02';

EXECUTE @RC = [dbo].[todosNOMESPeriodo2] 
   @pDataIni
  ,@pDataFim
GO