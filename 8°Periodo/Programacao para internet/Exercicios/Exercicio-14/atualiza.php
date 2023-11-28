<?php
    if (isset($_POST['atualizar'])) {
        $aluno = $_POST['aluno'];
        $novaNota = $_POST['nota'];

        $conteudo = file_get_contents($aluno);

        $linhas = explode("\n", $conteudo);
        foreach ($linhas as $i => $linha) {
            if (strpos($linha, 'Nota:') !== false) {
                $linhas[$i] = 'Nota: ' . $novaNota;
                break;
            }
        }

        file_put_contents($aluno, implode("\n", $linhas));
    }
?>