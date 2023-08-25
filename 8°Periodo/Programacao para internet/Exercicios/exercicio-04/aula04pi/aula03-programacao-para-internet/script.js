function dados(){
    alert('teste de envio')

    //var nome = prompt('Informe seu nome')

    //console.log(nome)
}   


function pegarNome(){
    var nome = prompt('Informe seu nome:')

    console.log(nome)

    
    frase = nome

    console.log(frase)

    document.querySelector(".nomePessoa").innerHTML +=  frase
}

function teste(){
    var nomeForm = document.getElementById('nome').value

    //alert('Existe um campo vazio:')
    if(nomeForm  == ""){
        window.alert('Erro no campo nome')
        document.getElementById('nome').style.border = '2px solid red'

        return false
    }

    var email = document.getElementById('email').value
    if(email  == ""){
        window.alert('Erro no campo email')
        document.getElementById('email').style.border = '2px solid red'

        return false
    }


    var estado_civil = document.querySelector('input[name="estado_civil"]:checked')
    //alert(estado_civil)
    if(estado_civil  == null){
        window.alert('Erro no campo estado civil')
        document.getElementById('solteiro').style.outline = "2px solid #ff0000" 
        document.getElementById('casado').style.outline = "2px solid #ff0000" 
        document.getElementById('enrolado').style.outline = "2px solid #ff0000" 

        return false
    }

    
    var sexo = document.querySelector('input[name="sexo"]:checked')
    //alert(estado_civil)
    if(sexo  == null){
        window.alert('Erro no campo sexo')
        document.getElementById('masculino').style.outline = "2px solid #ff0000"
        document.getElementById('feminino').style.outline = "2px solid #ff0000" 

        return false
    }


    var casa = document.querySelector("input[name='casa']:checked")
    var moto = document.querySelector("input[name='moto']:checked")
    var carro = document.querySelector("input[name='carro']:checked")

    if((casa == null) && (moto == null) && (carro == null)){
        alert('Selecione alguma opcao do campo bens');


    

    return false

    }






}