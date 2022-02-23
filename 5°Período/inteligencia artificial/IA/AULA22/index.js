function funcSum(arr = []){

    return arr.reduce((a,b) => a + b);

}


function gradientDescent(n =0){
    return n * (1-n);
}

function feedForward(inputs=[], target=0, epochs=1){
    if(target <=0){
        target = 0.1
    }else if(target >1){
        target  = 1;
    }

    // PESOS ( 1  peso para cada quantidade, quantidade de elemtnos em weightts tem que ser igual a quantidade de elemtos em inputsd)

    let weights = [];


    // inicializar os pesos com valores aleatorios para a primeira epoca 

    for(let i =0; i< inputs.length; i++){
        weights.push(Math.random())
    }

    for(let i = 1; i <=epochs; i++){
        let multply = [];

        for(let j=0; j< inputs.length;j++){
            if(inputs[j] <=0){
                inputs[j] = 0.1;
            }

            multply.push(inputs[j] * weights[j])
        }


        let sum = funcSum(multply)

        let output = parseFloat(Math.tanh(sum)).toFixed(4)


        let error = parseFloat(Math.abs(target - output)).toFixed(4)


        for(let j =0; j< inputs.length; j++){
            weights[j] += inputs[j] * gradientDescent(error)
        }

        let epoch = i.toString().padStart(7,'0')

        console.log(`epoca ${epoch} - taxa de erro: ${error} + saida: ${output} `)
    }
}


feedForward([0.04], 0.1 , 40000);