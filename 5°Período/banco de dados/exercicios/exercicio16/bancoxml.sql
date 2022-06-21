SELECT * FROM Medico
FOR XML RAW('Medico'),
ELEMENTS, ROOT('Hospital');

SELECT * FROM ambulatorio
FOR XML RAW('ambulatorio'),
ELEMENTS, ROOT('Hospital');

SELECT * FROM paciente
FOR XML RAW('paciente'),
ELEMENTS, ROOT('Hospital');

SELECT * FROM consulta
FOR XML RAW('consulta'),
ELEMENTS, ROOT('Hospital');

SELECT * FROM funcionario
FOR XML RAW('funcionario'),
ELEMENTS, ROOT('Hospital');