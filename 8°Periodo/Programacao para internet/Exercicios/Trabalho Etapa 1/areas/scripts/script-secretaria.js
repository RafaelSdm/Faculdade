function cadastrarDisciplina() {


    const nomeDisciplina = document.getElementById("disciplina").value;
    const codDisciplina = document.getElementById('codDisciplina').value

    var validacao = 1


    const cadDisciplina ={
        disciplina: nomeDisciplina,
        codDisciplina: codDisciplina
    }


    const disciplinas = JSON.parse(localStorage.getItem("disciplinas")) || [];
    

    
    for(i = 0; i < disciplinas.length; i++){
        console.log(disciplinas[i].disciplina)

        if(disciplinas[i].codDisciplina == codDisciplina){
            validacao = 0
        }
    }


    
    if(validacao == 1){

        disciplinas.push(cadDisciplina);
        localStorage.setItem("disciplinas", JSON.stringify(disciplinas));
        alert(`Disciplina "${disciplina}" cadastrada com sucesso.`);

        document.getElementById('cadastroDisciplina').reset();

    }else{
        alert('Id da disciplina ja pertence a uma materia.')
        console.log(validacao)
    }
    

    

}

function cadastrarAluno() {

    const nome = document.getElementById('aluno').value;
    const matricula = document.getElementById('matricula').value
    var validacao = 1
    var numMatricula = 0

    //const aluno = document.getElementById("aluno").value;

    const cadAluno = {
        nome: nome,
        matricula: matricula
    };

    const alunos = JSON.parse(localStorage.getItem("alunos")) || [];

    for(i = 0; i < alunos.length; i++){
        console.log(alunos[i].nome)

        if(alunos[i].matricula == matricula){
            validacao = 0
        }
    }


    if(validacao == 1){

        alunos.push(cadAluno);
        localStorage.setItem("alunos", JSON.stringify(alunos));
        alert(`Aluno "${aluno}" cadastrado com sucesso.`);

        document.getElementById('cadastroAluno').reset();

    }else{
        alert('Id do aluno ja pertence a um  aluno.')
        console.log(validacao)
    }


    

}