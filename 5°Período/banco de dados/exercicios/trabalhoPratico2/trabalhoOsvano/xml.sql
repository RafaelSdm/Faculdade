SELECT A.nome, CONT.item FROM aluno as A
INNER JOIN curso AS C ON C.codigo = A.codigo_curso
INNER JOIN disciplina AS D ON D.codigo_curso = C.codigo
INNER JOIN conteudo AS CONT ON CONT.disciplina_codigo = D.codigo

FOR XML RAW('aluno'),
ELEMENTS, ROOT('alunos');