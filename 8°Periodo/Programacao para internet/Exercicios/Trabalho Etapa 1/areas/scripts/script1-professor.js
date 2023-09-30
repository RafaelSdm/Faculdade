var selectedAluno = 0
var selectedDisciplina = 0



function carregarDisciplinasAlunos() {
    const disciplinas = JSON.parse(localStorage.getItem("disciplinas")) || [];
    const alunos = JSON.parse(localStorage.getItem("alunos")) || [];

    const disciplinaSelect = document.getElementById("disciplina");
    const alunoSelect = document.getElementById("aluno");

    console.log('Resutado das disciplinas')
    console.log(disciplinas)

    console.log('Resultados dos alunos')
    console.log(alunos)


            for(i = 0; i < disciplinas.length; i++){
                /*
                console.log(disciplinas[i].disciplina)
                const option = document.createElement("option");
                option.value = disciplinas[i].disciplina;
                option.textContent = disciplinas[i].disciplina;
                disciplinaSelect.appendChild(option);
                //console.log(option)
                */

                const disciplina = disciplinas[i];
                console.log(disciplina.nome);
              
                const option = document.createElement("option");
                option.value = JSON.stringify(disciplina); // Armazena o objeto aluno como uma string JSON
                option.textContent = disciplina.disciplina;
                disciplinaSelect.appendChild(option);
            }

            for(i =0; i < alunos.length; i++){
                /*
                console.log(alunos[i].nome)
                const option = document.createElement("option");
                option.value = alunos[i].nome;
                option.textContent = alunos[i].nome;
                alunoSelect.appendChild(option);

                */

                const aluno = alunos[i];
                console.log(aluno.nome);
              
                const option = document.createElement("option");
                option.value = JSON.stringify(aluno); // Armazena o objeto aluno como uma string JSON
                option.textContent = aluno.nome;
                alunoSelect.appendChild(option);
            }


            alunoSelect.addEventListener("change", function () {
                selectedAluno = JSON.parse(alunoSelect.value); // Converte a string JSON de volta para objeto
                console.log("ID do aluno selecionado:", selectedAluno.matricula);
                console.log("Nome do aluno selecionado:", selectedAluno.nome);
                console.log(selectedAluno)
              });

              
            disciplinaSelect.addEventListener("change", function () {
                selectedDisciplina = JSON.parse(disciplinaSelect.value); // Converte a string JSON de volta para objeto
                console.log("Codigo da disciplina:", selectedDisciplina.disciplina);
                console.log("Nome da disciplina:", selectedDisciplina.codDisciplina);
                console.log(selectedDisciplina)
              });



         


            /*

            disciplinas.forEach((disciplina) => {
                const option = document.createElement("option");
                option.value = disciplina;
                option.textContent = disciplina;
                disciplinaSelect.appendChild(option);
            });

            alunos.forEach((aluno) => {
                const option = document.createElement("option");
                option.value = aluno;_
                option.textContent = aluno;
                alunoSelect.appendChild(option);
            });

            */
    }

        function cadastrarNotaFrequencia() {
            /*
            const disciplina = document.getElementById("disciplina").value;
            const aluno = document.getElementById("aluno").value;
            const nota = parseFloat(document.getElementById("nota").value);
            const frequencia = parseFloat(document.getElementById("frequencia").value);



            alert(`Nota e frequência cadastradas para ${aluno} na disciplina ${disciplina}.`);
            //var val = document.getElementById['disciplina'];
            //console.log(val)
            //var value2 = value.options[value.selectedIndex].value;
            //alert(value2)
            */

            const container = document.querySelector('.container');
            
            if (container.style.display === 'none' || container.style.display === '') {
              container.style.display = 'block'; // Mostra a div quando oculta
            } else {
              container.style.display = 'none'; // Oculta a div quando visível
            }


            window.alert(selectedDisciplina.codDisciplina)
        }

        window.addEventListener("load", carregarDisciplinasAlunos);