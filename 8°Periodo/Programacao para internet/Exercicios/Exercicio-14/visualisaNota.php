<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="styles.css">
    <title>Document</title>
</head>

<body>

<h1>Vizualizar Nota</h1>

<?php
// Lista de turmas
$turmas = ["Turma 101", "Turma 102", "Turma 103", "Turma 104", "Turma 105"];

// Obtém todos os alunos em todas as turmas
$alunos = [];
foreach ($turmas as $turma) {
    $alunos = array_merge($alunos, glob($turma . '/*.txt'));
}
?>
<form action="visualizar.php" method="post">

    <label for="aluno">Selecionar aluno:</label>
    <select name="aluno" id="aluno">
        <?php foreach ($alunos as $aluno): ?>
        <option value="<?= $aluno ?>"><?= basename(dirname($aluno)) . " - " . basename($aluno, '.txt') ?></option>
        <?php endforeach; ?>
    </select>

    <br>

    <input name="consultar" type="submit" value="Consultar">
</form>
</body>