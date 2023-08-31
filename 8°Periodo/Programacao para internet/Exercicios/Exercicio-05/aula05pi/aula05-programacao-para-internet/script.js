document.getElementById('cadastrarButton').addEventListener('click', function() {


    alert('Produto cadastrado com sucesso!');

    // Recuperar os valores dos campos
    const productId = document.getElementById('identificador').value;
    const productName = document.getElementById('nomeProduto').value;
    const productImage = document.getElementById('productImage').files[0];
    const productPrice = document.getElementById('valorProduto').value;
    const productWeight = document.getElementById('pesoProduto').value;
    const productAvailability = document.getElementById('estoque').value;

    // Validar os campos (adicione suas próprias regras de validação aqui)

    // Criar um objeto de produto
    const product = {
        id: productId,
        name: productName,
        image: productImage.name,
        price: productPrice,
        weight: productWeight,
        availability: productAvailability
    };

    console.log(product)

    // Obter a lista de produtos do localStorage
    let productList = JSON.parse(localStorage.getItem('products')) || [];

    // Adicionar o novo produto à lista
    productList.push(product);

    // Armazenar a lista atualizada de produtos no localStorage
    localStorage.setItem('products', JSON.stringify(productList));

    // Limpar o formulário
    document.getElementById('cadastroForm').reset();

    alert('Produto cadastrado com sucesso!');

    // ...

    // Armazenar a lista atualizada de produtos no localStorage
    localStorage.setItem('products', JSON.stringify(productList));

    // Limpar o formulário
    document.getElementById('cadastroForm').reset();

    alert('Produto cadastrado com sucesso!');

    // Redirecionar para a página de exibição após o cadastro
    window.location.href = 'exibir.html';

});