<?php
    if (isset($_POST['consultar'])) {
        $aluno = $_POST['aluno'];
        echo nl2br(file_get_contents($aluno));
    }
?>