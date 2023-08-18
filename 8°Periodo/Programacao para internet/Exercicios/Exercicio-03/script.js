function calcular(){
    //window.alert('Voce esta mandando os dados!')

    var valor = document.getElementById('valor')

    var qtd = document.getElementById('qtd')

    const valor1 = valor.value

    const qtd1 = qtd.value


    //window.alert(valor1 * qtd1)


    document.getElementById("mostrar").innerHTML += valor1

    console.log(valor1 * qtd)

}