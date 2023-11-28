<?php
    if (isset($_POST['excluir'])) {
        $aluno = $_POST['aluno'];
        if (unlink($aluno)) {
            echo "O aluno foi excluído com sucesso.";
        } else {
            echo "Houve um erro ao excluir o aluno.";
        }
    }
?>