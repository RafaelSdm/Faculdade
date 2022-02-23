//  Funcao tangente hiperbolica: retorna valores entre 1 e -1

function tanh (n=0){

    return Math.sinh(n)/ Math.cosh(n)
    
}


console.log("hiperbolica")
console.log(tanh(3));
console.log(tanh(-3));
console.log("-------------")



// funcao sigmoide: retorva valores entre 0 e 1
function sigmoid(n=0){
    return  1/ (1 + Math.pow(Math.E, -n))
}

console.log("sigmoide")
console.log(sigmoid(3))
console.log(sigmoid(0))
console.log(sigmoid(-3))

console.log("-----------")


// funcao linear retificada relu: retorna somente valores nulos e positivos


function relu(n=0){

    return Math.max(n,0)
}


console.log("relu")
console.log(relu(3))
console.log(relu(-3))
console.log("--------------")



// funcao linear retificada com vazamento: leaky relu : retonar somente valores maiores que 0



function leakyRelu(n=0){
    return Math.max(n, 0.01)
}


console.log("leaky")
console.log(leakyRelu(3))
console.log(leakyRelu(-3))
console.log(leakyRelu(0.03))
console.log("----------------")


// funcao binary Step : retonar somete 0  ou 1


function binaryStep(n=0){

    return n >=0 ? 1 : 0;
}

console.log("binary step")
console.log(binaryStep(3))
console.log(binaryStep(-3))
console.log("---------------")