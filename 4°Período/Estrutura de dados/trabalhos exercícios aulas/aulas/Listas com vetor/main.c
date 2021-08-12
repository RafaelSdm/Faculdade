#include <stdio.h>
#include <stdlib.h>

#define tamanhoLista 10
typedef struct{
    int id;
    float preco;



}TipoItem;


typedef struct{
    TipoItem itens[tamanhoLista];
    int inicio,fim;


}TipoLista;


void criarLista(TipoLista *lista){
    lista->inicio =0;
    lista->fim = 0;


}

int vazia(TipoLista lista){
    if(lista.inicio==lista.fim){
        return 1;
    }else{
        return 0;

    }



}


void inserse (TipoLista *lista, TipoItem item){
    if(lista->fim > tamanhoLista){
        printf("lista cheia");
    }else{
        lista->itens[lista->fim] = item;
        lista->fim++;
    }

}



void imprime(TipoLista lista){
    int i;

    for(i=lista.inicio; i<lista.fim; i++){
        printf("%d - preco: %f\n", lista.itens[i].id, lista.itens[i].preco);
    }

}


void remove(TipoLista *lista){
    int i;

    //verifica se a lista esta vazia

    if(vazia(*lista)==1){
        printf("a lista esta vazia");
    }else if(pos>=lista->fim){
        printf("operacao invalida");

    }else{
        for(i=pos; i<Lista->fim;i++){
            lista->itens[i] = lista->itens[i+1];
        }


    }
}
int main()
{
    TipoLista l;
    criarLista(&l);

    criarLista(&lista);

    item.id = 1;
    item.preco = 50.0;
    inserse(*&lista, item);

    imprime(lista);

    printf("%d", vazia(l));
    return 0;
}
