window.addEventListener('load', function() {
    // Buscar a lista de produtos do localStorage
    const productList = JSON.parse(localStorage.getItem('products')) || [];

    console.log(productList)

    // Exibir os produtos na página
    const productListDiv = document.getElementById('productList');
// ...

    productList.forEach(product => {
        const productCard = document.createElement('div');
        productCard.classList.add('product-card');

        // Exibir a imagem, o nome e o valor do produto
        const productImage = document.createElement('img');
        productImage.classList.add('product-image');
        productImage.src = product.image;

        const productName = document.createElement('p');
        productName.innerHTML = `Nome: ${product.name}`;

        // Converter o preço para número antes de chamar toFixed()
        const productPrice = document.createElement('p');
        productPrice.innerHTML = `Valor Unitário: R$ ${parseFloat(product.price).toFixed(2)}`;

        productCard.appendChild(productImage);
        productCard.appendChild(productName);
        productCard.appendChild(productPrice);

        productListDiv.appendChild(productCard);
    });

// ...

});