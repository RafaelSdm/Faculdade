
function atualizar(){

    const ListaProdutos = JSON.parse(localStorage.getItem('products')) || [];

    console.log(productList)

    const container = document.getElementById('productList');


    ListaProdutos.forEach((product, index) => {
        const divProduto = document.createElement('div');
        divProduto.classList.add('product-card');

        const imagemProduto = document.createElement('img');
        imagemProduto.classList.add('product-image');
        imagemProduto.src = product.imagem;

        const nomeProduto = document.createElement('p');
        nomeProduto.innerHTML = `Nome: ${product.name}`;

        const precoProduto = document.createElement('p');
        precoProduto.innerHTML = `Valor Unitário: R$ ${parseFloat(product.preco).toFixed(2)}`;

        /*
        const btn = this.document.createElement('button')
        btn.addEventListener('click', excluir)
        btn.innerHTML = 'Excluir'

        */

        const btn = this.document.createElement ('div')
        btn.innerHTML = `<button type="button" onclick="excluir(${index})">Excluir</button>`

        divProduto.appendChild(imagemProduto);
        divProduto.appendChild(nomeProduto);
        divProduto.appendChild(precoProduto);
        container.appendChild(divProduto);
        divProduto.appendChild(btn)
    
}

)}




window.addEventListener('load', atualizar);


function excluir(index){
    //window.alert(index)


    const ListaProdutos = JSON.parse(localStorage.getItem('products')) || [];

    ListaProdutos.splice(index, 1)
    localStorage.setItem('products', JSON.stringify(ListaProdutos));

    //alert('recarregar!')

    window.addEventListener('load', atualizar);
    window.location.href = 'exibir.html' ;


}