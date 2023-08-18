function dados(){
    alert('teste de envio')

    var nome = prompt('Informe seu nome')

    console.log(nome)
}


function pegarNome(){
    var nome = prompt('Informe seu nome:')

    console.log(nome)

    
    frase = nome

    console.log(frase)

    document.querySelector(".nomePessoa").innerHTML +=  frase;
}