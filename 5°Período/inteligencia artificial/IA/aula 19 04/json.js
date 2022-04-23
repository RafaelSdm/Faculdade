var arr = [2 , 10 , 'teste', 12.34 , 'teste de string'];

//console.log(Object.keys(arr))



var obg = {
    nome: 'Rafael',
    age: 20,
    height: 1.8,
    
    
}

console.log(obg.nome)
console.log(Object.keys(obg))


var user = {
    user1:{
        nome: 'rafael',
        idade: 20,
        altura: 1.9,
        depend:{
            dp1 : 'kfiferfrei',

        }
    },

    user2:{
        nome: 'jose',
        idade: 23,
        altura: 1.7
    }
}


console.log('--------------------------------------------')
console.log(user)
console.log(Object.keys(user.user1))
console.log(user.user1.nome)
console.log(user.user1.depend.dp1)