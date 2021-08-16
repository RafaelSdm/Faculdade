#include <stdio.h>
#include <stdlib.h>
#define tamanhoLista 10

typedef struct{

    int id;
    float preco;
    float desconto;



}TipoItem;

typedef struct{

    TipoItem itens[tamanhoLista];
    int inicio, fim;


}TipoLista;


void criaLista (TipoLista *lista){
    lista->inicio =0;
    lista->fim =0;


}


int vazia (TipoLista lista){

    if(lista.inicio==lista.fim){
        return 1;
    }else{

        return 0;
    }

}

void insere (TipoLista *lista, TipoItem item ){
    if(lista->fim > tamanhoLista){
        printf("lista cheia!");
    }else{
        lista->itens[lista->fim] = item;
        lista->fim++;

    }


}


void imprime(TipoLista lista){
    int i;
    printf("impressao da lista \n");
    for(i=lista.inicio; i< lista.fim;i++){
        printf("%d - preco: %.2f - Desconto: %2.f \n", lista.itens[i].id, lista.itens[i].preco, lista.itens[i].desconto);
    }


    printf("\n");

}



void remover(TipoLista *lista, int pos){
    int i;
    // veridica se a lista esta vazia;
    if(vazia(*lista)==1){
        printf("a lista está  vazia");
    }else if(pos>=lista->fim){
        printf("operacao invalida!");

    }else{

        for(i=pos; i<lista->fim;i++){
            lista->itens[i] = lista->itens[i+1];
        }
        lista->fim--;

    }

}



// veriricar se um item esta na lista
// paramentro para isso sera o ID

int busca(TipoLista lista, int id){
    int i;
    for(i=lista.inicio; i<lista.fim; i++ ){
        if(lista.itens[i].id == id){
            return i;
        }else{

        }
    }

    return -1;


}


//trocar a posicao da lista;

// funcao vai receber a posicao indice dois dois itens;


void trocar(TipoLista *lista, int posI1, int posI2){
    TipoItem aux;
    if((posI1<0)||(posI1>=lista->fim)){
        printf("posicao do item invalida");
    }else if((posI2 <0)||(posI2 >= lista->fim)){
        printf("posicao do tem invalida");

    }else{
        aux = lista->itens[posI1];
        lista->itens[posI1] = lista->itens[posI2];
        lista->itens[posI2] = aux;


    }


}


void alterar(TipoLista *lista, int id){

    int posItem =  busca(*lista, id);

    if(posItem == -1){
        printf("o id nao esta presenta na lista \n");
    }else{
        printf("informe um novo id");
        scanf("%d", &lista->itens[posItem].id);
        printf("informe um novo preco:");
        scanf("%f", &lista->itens[posItem].preco);
        printf("informe desconto:");
        scanf("%f", &lista->itens->[posItem].desconto);

    }



}


int main()
{
    TipoLista lista;

    TipoItem item;


    criaLista(&lista);


    item.id = 1;
    item.preco = 12.200;
    insere(&lista, item);

    item.id = 2;
    item.preco = 10.000;
    item.desconto = 10;
    insere(&lista, item);


    item.id = 3;
    item.preco = 120.00;
    insere(&lista, item);


    item.id = 4;
    item.preco = 2.70;
    insere(&lista, item);


    item.id = 5;
    item.preco = 14.00;
    insere(&lista, item);




    imprime(lista);


    remover(&lista, 3);

    imprime(lista);



    if(busca(lista, 2)!=-1){
        printf("\n item localizado\n");
    }else{
        printf("\n item nao localizado");
    }

    trocar(&lista, 1,0);
    imprime(lista);
   printf("%d", vazia(lista));


   printf("--------------------------------- \n");


   alterar(&lista, 1);
   imprime(lista);

    return 0;
}
