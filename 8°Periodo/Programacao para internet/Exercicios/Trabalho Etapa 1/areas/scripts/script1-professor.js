        function carregarDisciplinasAlunos() {
            const disciplinas = JSON.parse(localStorage.getItem("disciplinas")) || [];
            const alunos = JSON.parse(localStorage.getItem("alunos")) || [];

            const disciplinaSelect = document.getElementById("disciplina");
            const alunoSelect = document.getElementById("aluno");

            disciplinas.forEach((disciplina) => {
                const option = document.createElement("option");
                option.value = disciplina;
                option.textContent = disciplina;
                disciplinaSelect.appendChild(option);
            });

            alunos.forEach((aluno) => {
                const option = document.createElement("option");
                option.value = aluno;
                option.textContent = aluno;
                alunoSelect.appendChild(option);
            });
        }

        function cadastrarNotaFrequencia() {
            const disciplina = document.getElementById("disciplina").value;
            const aluno = document.getElementById("aluno").value;
            const nota = parseFloat(document.getElementById("nota").value);
            const frequencia = parseFloat(document.getElementById("frequencia").value);



            alert(`Nota e frequência cadastradas para ${aluno} na disciplina ${disciplina}.`);
        }

        window.addEventListener("load", carregarDisciplinasAlunos);