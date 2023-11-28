<h1>Excluir Aluno</h1>

    <?php
    // Lista de turmas
    $turmas = ["Turma 101", "Turma 102", "Turma 103", "Turma 104", "Turma 105"];

    // Obtém todos os alunos em todas as turmas
    $alunos = [];
    foreach ($turmas as $turma) {
        $alunos = array_merge($alunos, glob($turma . '/*.txt'));
    }
?>
    <form action="excluir.php" method="post">

        <label for="aluno">Selecionar aluno:</label>
        <select name="aluno" id="aluno">
            <?php foreach ($alunos as $aluno): ?>
            <option value="<?= $aluno ?>"><?= basename(dirname($aluno)) . " - " . basename($aluno, '.txt') ?></option>
            <?php endforeach; ?>
        </select>

        <br>

        <input name="excluir" type="submit" value="Excluir">
    </form>