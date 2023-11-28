<?php
    if(isset($_POST['cadastrar'])) {
        $nome = $_POST['nome'];
        $nota = $_POST['nota'];
        $turma = $_POST['turma'];
        $disc = $_POST['disc'];

        $arquivo_aluno = $turma . '/' . $nome . '.txt';

        if (!file_exists($arquivo_aluno)) {
            $resultado = file_put_contents($arquivo_aluno, "Nome: " . $nome . "\n\n", FILE_APPEND);
        } else {
            $resultado = file_put_contents($arquivo_aluno, "-----------------------------------------------------------\n", FILE_APPEND);
        }

        $dados_aluno = "Disciplina: " . $disc . " \ " . "Nota: " . $nota . "\n";
        $resultado = file_put_contents($arquivo_aluno, $dados_aluno, FILE_APPEND);

        if ($resultado !== false) {
            echo "Cadastro efetuado com sucesso!";
        } else {
            echo "Erro ao efetuar o cadastro.";
        }
    }
?>