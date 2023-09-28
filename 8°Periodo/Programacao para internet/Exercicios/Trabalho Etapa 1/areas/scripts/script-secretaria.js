function cadastrarDisciplina() {
    const disciplina = document.getElementById("disciplina").value;
    const disciplinas = JSON.parse(localStorage.getItem("disciplinas")) || [];
    disciplinas.push(disciplina);
    localStorage.setItem("disciplinas", JSON.stringify(disciplinas));
    alert(`Disciplina "${disciplina}" cadastrada com sucesso.`);
}

function cadastrarAluno() {
    const aluno = document.getElementById("aluno").value;
    const alunos = JSON.parse(localStorage.getItem("alunos")) || [];
    alunos.push(aluno);
    localStorage.setItem("alunos", JSON.stringify(alunos));
    alert(`Aluno "${aluno}" cadastrado com sucesso.`);
}