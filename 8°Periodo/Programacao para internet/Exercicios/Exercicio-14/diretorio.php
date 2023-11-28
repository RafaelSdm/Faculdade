<?php
    $turma5 = 'Turma 105';
    if(mkdir($turma5, 0755)){
        echo "Diretório criado com sucesso!";
    }else{
        echo "Falha ao criar o diretório!";
    }
?>  