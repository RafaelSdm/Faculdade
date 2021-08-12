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

void criaLista(TipoLista *lista){
    lista->inicio = 0;
    lista->fim = 0;
}

int vazia (TipoLista lista){
    if(lista.inicio==lista.fim){
        return 1;
    }else{
        return 0;
    }
}

void insere (TipoLista *lista, TipoItem item){
    if(lista->fim > tamanhoLista){
        printf("Lista Cheia");
    }else{
        lista->itens[lista->fim] = item;
        lista->fim++;
    }
}

void imprime(TipoLista lista){
    int i;
    printf("Impressao da lista:\n");
    for(i=lista.inicio; i< lista.fim; i++){
        printf("%d - Preco: %.2f - Desconto: %2.f\n", lista.itens[i].id, lista.itens[i].preco, lista.itens[i].desconto);
    }
    printf("\n");
}

void remover(TipoLista *lista, int pos){
    int i;

    //verifica se a lista está vazia
    if(vazia(*lista)==1){
        printf("A lista esta vazia");
    }else if(pos >= lista->fim){
        printf("Operacao invalida");
    }else{
        for(i=pos;i<lista->fim;i++){
            lista->itens[i] = lista->itens[i+1];
        }
        lista->fim--;
    }

}

// verificar se um determinado esta na list
// paramentro para iiso sera o id
int busca(TipoLista lista, int id ){
    int i;
    for(i=lista.inicio; i<lista.fim; i++){
        if(lista.itens[i].id == id){
            return 1;
        }else{
            return 0;
        }
    }

}


//trocar dois intens da lista
// funcao vai receber a posicao ou indice dos dois itens


void trocarPosicao(TipoLista *lista, int positem1, int positem2 ){
    TipoItem aux;
    if((positem1<0) || (positem1>=lista->fim)){
        printf("posicao do item 1 invalida");
    }else if((positem2 <0)||(positem1>-lista->fim)){
        printf("posicao do item 2 invalida");

    }else{
        aux = lista->itens[positem1];
        lista->itens[positem1] = lista->itens[positem2];
        lista->itens[positem2] = aux;

    }



}







int main(){

    TipoLista lista;

    TipoItem item;

    criaLista(&lista);

    item.id = 10;
    item.preco = 50.0;
    item.desconto = 5.0;
    insere(&lista, item);

    item.id = 8;
    item.preco = 500.10;
    item.desconto = 10.0;
    insere(&lista, item);

    item.id = 7;
    item.preco = 1.20;
    item.desconto = 12.0;
    insere(&lista, item);

    item.id = 400;
    item.preco = 200.50;
    item.desconto = 0.0;
    insere(&lista, item);

    item.id = 3;
    item.preco = 0.50;
    item.desconto = 35.0;
    insere(&lista, item);

    imprime(lista);

    remover(&lista, 3);

    imprime(lista);



    if(busca(lista, 10) == 1){
        printf("item localizado");
    }else{
        printf("item nao localizado");
    }

    return 0;
}
