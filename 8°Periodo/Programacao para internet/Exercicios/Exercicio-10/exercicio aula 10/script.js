function calcular(){
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
}
