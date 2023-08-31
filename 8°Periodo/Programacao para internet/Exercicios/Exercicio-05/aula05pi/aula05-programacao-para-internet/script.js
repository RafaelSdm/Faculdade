document.getElementById('cadastrarButton').addEventListener('click', function() {


    alert('Produto cadastrado com sucesso!');

    const id = document.getElementById('identificador').value;
    const nome = document.getElementById('nomeProduto').value;
    const imagem = document.getElementById('productImage').files[0];
    const preco = document.getElementById('valorProduto').value;
    const peso = document.getElementById('pesoProduto').value;
    const estoque = document.getElementById('estoque').value;


    const product = {
        id: id,
        name: nome,
        imagem: imagem.name,
        preco: preco,
        peso: peso,
        estoque: estoque
    };

    console.log(product)

    let productList = JSON.parse(localStorage.getItem('products')) || [];

    productList.push(product);

    localStorage.setItem('products', JSON.stringify(productList));

    document.getElementById('cadastroForm').reset();

    alert('Produto cadastrado com sucesso!');

    

    localStorage.setItem('products', JSON.stringify(productList));

    document.getElementById('cadastroForm').reset();

    alert('Produto cadastrado com sucesso!');

    window.location.href = 'exibir.html';

});