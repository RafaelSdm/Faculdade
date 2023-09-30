var selectedAluno = 0
var selectedDisciplina = 0
var validaNota = 0

var codDisciplina = 0 
var codAluno = 0

function carregarDisciplinasAlunos() {
    const disciplinas = JSON.parse(localStorage.getItem("disciplinas")) || [];
    const alunos = JSON.parse(localStorage.getItem("alunos")) || [];

    const disciplinaSelect = document.getElementById("disciplina");
    const alunoSelect = document.getElementById("aluno");


    var n1 = 0
    var n2 = 0
    var n3 = 0
    var n4 = 0


    var f1 = 0
    var f2 = 0
    var f3 = 0
    var f4 = 0

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
                codAluno = selectedAluno.matricula

              });

              
            disciplinaSelect.addEventListener("change", function () {
                selectedDisciplina = JSON.parse(disciplinaSelect.value); // Converte a string JSON de volta para objeto
                console.log("Codigo da disciplina:", selectedDisciplina.disciplina);
                console.log("Nome da disciplina:", selectedDisciplina.codDisciplina);
                console.log(selectedDisciplina)
                codDisciplina = selectedDisciplina.codDisciplina

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
              //container.style.display = 'none'; // Oculta a div quando visível
            }

            const infoNota ={
                codDisciplinad:0 ,
                codAluno: 0,
                nota1: 0,
                nota2: 0,
                nota3: 0,
                nota4: 0,
                falta1:0,
                falta2:0,
                falta3:0,
                falta4:0
            }

            

            const notas = JSON.parse(localStorage.getItem("notas")) || [];
            console.log(notas)


            for(i = 0; i < notas.length; i++){
                console.log(notas[i].codAluno)
                //                if(Number(notas[i].codAluno) == Number(selectedAluno.matricula) && Number(notas[i].codDisciplina) ==  Number(selectedDisciplina.codDisciplina ) ){

                if( (Number(notas[i].codAluno) == Number(selectedAluno.matricula)) && (Number(notas[i].codDisciplinad) ==  Number(selectedDisciplina.codDisciplina ) ) ){
                    validaNota = 1
                    console.log('Existe um aluno com esse matricula')
                    n1 = notas[i].nota1;
                    n2 = notas[i].nota2;
                    n3 = notas[i].nota3;
                    n4 = notas[i].nota4;
                    console.log(notas[i].nota1)
                    f1 = notas[i].falta1
                    f2 = notas[i].falta2
                    f3 = notas[i].falta3
                    f4 = notas[i].falta4






                }else{
                    //validaNota = 0
                    console.log('Nao existe nota cadastrada para esse usuário')
                    console.log(notas[i].codDisciplina)
                    console.log(selectedDisciplina.codDisciplina)

                }
            }


            //const inputNota1 = document.getElementById("n3");
            //const inputFaltas = document.getElementById("f3");

            //inputNota1.innerHTML = 0

            const alterarNome = document.getElementById('disc')
            alterarNome.innerHTML = selectedDisciplina.disciplina

            if(validaNota == 0){
                    
                const inputN1 = document.getElementById("n1");
                const inputF1 = document.getElementById("f1");
            
                inputN1.value = "0";
                inputF1.value = "0";

                const inputN2 = document.getElementById("n2");
                const inputF2 = document.getElementById("f2");
            
                inputN2.value = "0";
                inputF2.value = "0";

                const inputN3 = document.getElementById("n3");
                const inputF3 = document.getElementById("f3");
            
                inputN3.value = "0";
                inputF3.value = "0";

                const inputN4 = document.getElementById("n4");
                const inputF4 = document.getElementById("f4");
            
                inputN4.value = "0";
                inputF4.value = "0";

            }else{

                const inputN1 = document.getElementById("n1");
                const inputF1 = document.getElementById("f1");
                console.log('validando as notas aqui ------')
                inputN1.value = n1;
                inputF1.value = f1;
                console.log(n1)

                const inputN2 = document.getElementById("n2");
                const inputF2 = document.getElementById("f2");
            
                inputN2.value = n2;
                inputF2.value = f2;

                const inputN3 = document.getElementById("n3");
                const inputF3 = document.getElementById("f3");
            
                inputN3.value = n3;
                inputF3.value = f3;

                const inputN4 = document.getElementById("n4");
                const inputF4 = document.getElementById("f4");
            
                inputN4.value = n4;
                inputF4.value = f4;



            }



            //notas.push(infoNota);
            //localStorage.setItem("notas", JSON.stringify(notas));
            //alert(`nota cadastrada com sucesso.`);

            

            



            window.alert(selectedDisciplina.codDisciplina)


            calcular(selectedDisciplina.codDisciplina, selectedAluno.matricula, validaNota)
        }

        window.addEventListener("load", carregarDisciplinasAlunos);

/*

        document.addEventListener("DOMContentLoaded", function() {
            // Obtém os elementos de entrada com os IDs n3 e f3
            const inputNota = document.getElementById("n3");
            const inputFaltas = document.getElementById("f3");
        
            // Define o valor 0 nos campos de entrada usando a propriedade value
            inputNota.value = "0";
            inputFaltas.value = "0";
        });

        */



        function calcular(){
            var valida = 0
            var n1 = $('#n1').val()
            var n2 = $('#n2').val()
            var n3 = $('#n3').val()
            var n4 = $('#n4').val()
        
        
            var f1 = $('#f1').val()
            var f2 = $('#f2').val()
            var f3 = $('#f3').val()
            var f4 = $('#f4').val()
        
            if(n1 > 100 || n2 > 100 || n3  > 100 || n4 > 100){
                window.alert('Voce passou numeros maiores que 100 na nota')
                var notaTotal = 'Informe o valor corretamente'
                
                var faltaFinal = 'Informe o valor corretamente'
            }else if(n1 < 0 || n2 < 0 || n3  < 0 || n4 < 0){
                window.alert('Voce adicionou nota(s) menores que 0')
                var notaTotal = 'Informe o valor corretamente'
                
                var faltaFinal = 'Informe o valor corretamente'
        
            }else if(f1 > 100 || f2 > 100 || f3  > 100 || f4 > 100){    
                window.alert('Voce adicionou faltas maiores do que 100')
                var notaTotal = 'Informe o valor corretamente'
                
                var faltaFinal = 'Informe o valor corretamente'
        
            }else if(f1 < 0 || f2 < 0 || f3  < 0 || f4 < 0){
                window.alert('Voce adicionou faltas menores do que 0')
                var notaTotal = 'Informe o valor corretamente'
                
                var faltaFinal = 'Informe o valor corretamente'
        
            }else{
                var notaTotal = Number(n1) + Number(n2) + Number(n3) + Number(n4)
                
                var faltaFinal = (Number(f1) + Number(f2) + Number(f3) + Number(f4) )/ 4
        
            }
        
           // var notaTotal = Number(n1) + Number(n2) + Number(n3) + Number(n4)
        
        
        
        
        
        
        
        
        
            console.log(notaTotal)
        
            if(notaTotal >=60){
                $('#notat').addClass('notaAzul')
                $('#notat').removeClass('notaVermelha');
        
            }else{
                $('#notat').addClass('notaVermelha')
                $('#notat').removeClass('notaAzul');
            }
        
        
            
            if(faltaFinal >=25){
                $('#faltat').addClass('faltaVermelha')
                $('#faltat').removeClass('faltaAzul');
        
            }else{
                $('#faltat').addClass('faltaAzul')
                $('#faltat').removeClass('faltaVermelha');
            }
        
        
            $('#notat').text(notaTotal)
            $('#faltat').text(faltaFinal)
        
            if(notaTotal < 60 && faltaFinal > 25){
                $('#situacaot').addClass('faltaVermelha')
                $('#situacapt').removeClass('faltaAzul');
                $('#situacaot').text('Reprovado por nota e falta');
            }else if(notaTotal < 60){
                $('#situacaot').addClass('faltaVermelha')
                $('#situacapt').removeClass('faltaAzul');
                $('#situacaot').text('Reprovado por nota');
        
            }else if(faltaFinal > 25){
                $('#situacaot').addClass('faltaVermelha')
                $('#situacapt').removeClass('faltaAzul');
                $('#situacaot').text('Reprovado por falta');
        
            }else{
                $('#situacaot').addClass('faltaAzul')
                $('#situacapt').removeClass('faltaVermelha');
                $('#situacaot').text('Aprovado');
        
            }


            const notas = JSON.parse(localStorage.getItem("notas")) || [];

            console.log('------------------')
            console.log(codAluno)
            console.log('------------------')

            const infoNota ={
                codDisciplinad: codDisciplina ,
                codAluno: codAluno,
                nota1: n1,
                nota2: n2,
                nota3: n3,
                nota4: n4,
                falta1:f1,
                falta2:f2,
                falta3:f3,
                falta4:f4
            }

            for(i = 0; i < notas.length; i++){
                console.log(notas[i].codAluno)

                if( (Number(notas[i].codAluno) == Number(infoNota.codAluno)) && (Number(notas[i].codDisciplinad) ==  Number(infoNota.codDisciplinad ) ) ){
                    valida= 1
                    notas[i] = infoNota;
                    console.log('dkcdcdk')
                    localStorage.setItem("notas", JSON.stringify(notas));

                }else{
                    //validaNota = 0
                    console.log('Nao existe nota cadastrada para esse usuário ---')
                    console.log(notas[i].codDisciplina)
                    console.log(selectedDisciplina.codDisciplina)

                }
            }

            if(valida == 0){
                notas.push(infoNota);
                localStorage.setItem("notas", JSON.stringify(notas));
                const inputNota4 = document.getElementById("n4");
                const inputFaltas4 = document.getElementById("f4");
            
                // Define os valores dos inputs como zero
                inputNota4.value = "0";
                inputFaltas4.value = "0";
            }else{
                alert(`nota cadastrada com sucesso.`);

            }

}


        