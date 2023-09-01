document.getElementById('cadastrarButton').addEventListener('click', function() {


    //alert('Produto cadastrado com sucesso!');

    const id = document.getElementById('identificador').value;
    const nome = document.getElementById('nomeProduto').value;
    const img = document.getElementById('productImage').files[0];
    const preco = document.getElementById('valorProduto').value;
    const peso = document.getElementById('pesoProduto').value;
    const estoque = document.getElementById('estoque').value;


    const produto = {
        id: id,
        name: nome, 
        imagem: img.name,
        preco: preco,
        peso: peso,
        estoque: estoque
    };

    console.log(produto)

    let listaProdutos = JSON.parse(localStorage.getItem('products')) || [];

    productList.push(produto);

    localStorage.setItem('products', JSON.stringify(listaProdutos));

    document.getElementById('cadastroForm').reset();

    alert('Produto cadastrado com sucesso!');

    

    localStorage.setItem('products', JSON.stringify(listaProdutos));

    document.getElementById('cadastroForm').reset();

    alert('Produto cadastrado com sucesso!');

    window.location.href = 'exibir.html' ;

});