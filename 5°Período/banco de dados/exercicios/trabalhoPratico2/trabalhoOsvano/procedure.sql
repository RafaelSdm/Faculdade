CREATE PROCEDURE alunosFaculdade(@pturma VARCHAR(30))
AS
BEGIN
  SELECT a.matricula, a.nome
  FROM aluno AS  A 
		
  where A.turma_codigo = @pturma
END
GO


DECLARE @RC int
DECLARE @pturma VARCHAR(30);


set @pturma = '852258';


EXECUTE @RC = [dbo].[alunosFaculdade] 
   @pturma
GO