function calcular(){
    //window.alert('Voce esta mandando os dados!')
    document.getElementById("show").innerHTML  = ''

    var valor = document.getElementById('valor')

    var qtd = document.getElementById('qtd')

    var resultadoElement = document.getElementById("resultado");




    let valor1 = valor.value

    let qtd1 = qtd.value

    qtd.value = ''

    valor.value = ''


    if(qtd1 < 0){
        window.alert('Numero negativo')
    }else{

            //window.alert(valor1 * qtd1)

           //resultadoElement.textContent = resultado;
            document.getElementById("show").innerHTML += valor1  *   qtd1


            console.log(valor1 * qtd1)


        

    }

    return false




}

//document.getElementById("mostrar").innerHTML += valor1  *   qtd1