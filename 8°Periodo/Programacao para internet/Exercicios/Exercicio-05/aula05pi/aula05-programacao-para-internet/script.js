document.getElementById('cadastrarButton').addEventListener('click', function() {


    alert('Produto cadastrado com sucesso!');

    const productId = document.getElementById('identificador').value;
    const productName = document.getElementById('nomeProduto').value;
    const productImage = document.getElementById('productImage').files[0];
    const productPrice = document.getElementById('valorProduto').value;
    const productWeight = document.getElementById('pesoProduto').value;
    const productAvailability = document.getElementById('estoque').value;


    const product = {
        id: productId,
        name: productName,
        image: productImage.name,
        price: productPrice,
        weight: productWeight,
        availability: productAvailability
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