var produtosId = []

document.getElementById('cadastrarButton').addEventListener('click', function() {


    //alert('Produto cadastrado com sucesso!');

    const id = document.getElementById('identificador').value;
    const nome = document.getElementById('nomeProduto').value;
    const img = document.getElementById('productImage').files[0];
    const preco = document.getElementById('valorProduto').value;
    const peso = document.getElementById('pesoProduto').value;
    const estoque = document.getElementById('estoque').value;

    var peso1 = parseInt(peso)
    var preco1 = parseFloat(preco)

    console.log(peso1)
    console.log(peso1)
    //window.alert(typeof(peso1))


    if(id == '' || nome == '' || preco == '' || peso == '' || estoque == '' || img == ''){
        window.alert('nem todos os campos estao preenchidos')

    }

    else{

    console.log(img)

    let existeId = 0    
    const produto = {
        id: id,
        name: nome, 
        imagem: img.name,
        preco: preco,
        peso: peso,
        estoque: estoque
    };

    console.log(produto.name)

    // Verifica se ja existe um id na lista

    if(peso1 <=0 || preco1 <= 0){
        window.alert('Peso ou preco cadastrados com numeros negativos')
    }

    else{

    //window.alert(typeof(peso));  
    produtosId.push(produto.id)


    console.log('Lista de todos os nomes dos produtos')
    produtosId.forEach((prod) =>{
        console.log('---------------------')
        console.log(prod)
        console.log('------------------')
    })

    console.log('---====================----')
    console.log(produtosId)
    console.log('=--============================')


    



    let listaProdutos = JSON.parse(localStorage.getItem('products')) || [];

    console.log('-------------------lista')

    console.log('Verificando se existe produto com esse id')
    listaProdutos.forEach((prod) =>{
        console.log('---------------------')
        console.log(prod.id)
        console.log('------------------')
        if(prod.id == id){
            window.alert('Ja existe um produto com este ID');
            existeId = 1
            
        }else{
            //window.alert('Nao existe produto com esse id')
        }
    })


   
    if(existeId == 1){
        window.alert('Informe um id valido para este produto')


    }else{

        console.log(listaProdutos)

        listaProdutos.push(produto);
    
        localStorage.setItem('products', JSON.stringify(listaProdutos));
    
        //document.getElementById('cadastroForm').reset();
    
        //alert('Produto cadastrado com sucesso!');
    
      
    
        localStorage.setItem('products', JSON.stringify(listaProdutos));
    
        document.getElementById('cadastroForm').reset();
    
        alert('Produto cadastrado com sucesso!');
    
        window.location.href = 'exibir.html' ;
    }





    }

    }






});