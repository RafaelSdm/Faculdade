window.addEventListener('load', function() {
    const productList = JSON.parse(localStorage.getItem('products')) || [];

    console.log(productList)

    const productListDiv = document.getElementById('productList');


    productList.forEach(product => {
        const productCard = document.createElement('div');
        productCard.classList.add('product-card');

        const productImage = document.createElement('img');
        productImage.classList.add('product-image');
        productImage.src = product.image;

        const productName = document.createElement('p');
        productName.innerHTML = `Nome: ${product.name}`;

        const productPrice = document.createElement('p');
        productPrice.innerHTML = `Valor Unitário: R$ ${parseFloat(product.price).toFixed(2)}`;

        productCard.appendChild(productImage);
        productCard.appendChild(productName);
        productCard.appendChild(productPrice);

        productListDiv.appendChild(productCard);
    });



});