<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="styles.css">
    <title>Document</title>
</head>

<body>

    <h1>Cadastro de Aluno</h1>
    <form action="cadastro.php" method="post">

        <label for="nome">Nome do Aluno:</label>
        <input type="text" id="nome" name="nome" required>
        <br>

        <label for="disc">Disciplina:</label>
        <select name="disc" id="disciplina">
            <option value="">Selecione</option>
            <option value="Matematica">Matematica</option>
            <option value="Historia">Historia</option>
            <option value="portugues">Portugues</option>
            <option value="geografia">Geografia</option>
            <option value="fisica">Fisica</option>
        </select>
        <br>

        <label for="nota">Nota:</label>
        <input type="text" id="nota" name="nota" required>
        <br>

        <label for="turma">Selecionar turma:</label>
        <select name="turma" id="turma">
            <?php
                $diretorios = array_filter(glob('*'), 'is_dir');
                foreach($diretorios as $diretorio) {
                    echo "<option value='$diretorio'>$diretorio</option>";
                }
            ?>
        </select>

        <br>

        <input name="cadastrar" type="submit" value="Cadastrar">
    </form>
</form>
</body>