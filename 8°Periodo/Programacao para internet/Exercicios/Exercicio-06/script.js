
function gerarResultadoMaquina(){

    var escolhaMaquina = ['PEDRA', 'PAPEL', 'TESOURA']; 

    var geradorRand =  escolhaMaquina[Math.floor(Math.random() * escolhaMaquina.length)];

    return geradorRand;
}


function conferirResultado(jogador, maquina){

    if(jogador == maquina){
        //window.alert('jogo empatado')
        document.getElementById('resultado').innerHTML = `Voce escolheu ${jogador}. A maquina escolheu ${maquina}. Resultado: Empate!`
    }else if(jogador == 'PEDRA' && maquina == 'TESOURA'){
        //window.alert('jogador ganhou com pedra')
        document.getElementById('resultado').innerHTML = `Voce escolheu ${jogador}. A maquina escolheu ${maquina}. Resultado: Voce Ganhou!`

    }else if(jogador == 'PAPEL' && maquina == 'PEDRA'){
        //window.alert('jogador ganhou com papel')
        document.getElementById('resultado').innerHTML = `Voce escolheu ${jogador}. A maquina escolheu ${maquina}. Resultado: Voce Ganhou!`


    }else if(jogador == 'TESOURA' && maquina == 'PAPEL'){
        //window.alert('jogador venceu com tesoura')
        document.getElementById('resultado').innerHTML = `Voce escolheu ${jogador}. A maquina escolheu ${maquina}. Resultado: Voce Ganhou!`
    }else{
        //window.alert('maquina venceu')
        document.getElementById('resultado').innerHTML = `Voce escolheu ${jogador}. A maquina escolheu ${maquina}. Resultado: Voce Perdeu!`
    }


}


function gerarJogo(index){
    var escolha = index.toUpperCase();

    var maquina = ''

    var mostrarResultado = document.getElementById('resultado')

   // window.alert(escolha)

   

    if(escolha == 'TESOURA'){

        //window.alert('Voce escolheu tesoura')
       // document.getElementById('resultado').innerHTML = 'Tesoura'

        maquina = gerarResultadoMaquina()

       // window.alert(maquina)

        conferirResultado(escolha, maquina)

    }else if(escolha == 'PEDRA'){
        //window.alert('Voce escolheu pedra')
        //document.getElementById('resultado').innerHTML = 'Pedra'

        var maquina = gerarResultadoMaquina()

        //window.alert(maquina)
        conferirResultado(escolha, maquina)


    }else{
        //window.alert('Voce escolheu papel')
        //document.getElementById('resultado').innerHTML = 'Papel'

        var maquina = gerarResultadoMaquina()

       // window.alert(maquina)

        conferirResultado(escolha, maquina)


    }

}