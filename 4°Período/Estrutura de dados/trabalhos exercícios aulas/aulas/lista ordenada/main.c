#include <stdio.h>
#include <stdlib.h>

typedef struct{
     int id;
    //demais campos


}TipoItem;


typedef struct celula_struct *apontador;

typedef struct celula_struct {

    TipoItem item;
    apontador prox;

}celula;


typedef struct{

    apontador primeiro, ultimo;

}TipoLista;

void criarLista(TipoLista *lista){

    lista->primeiro = (apontador) malloc(sizeof(celula));
    lista->primeiro->prox = NULL;
    lista->ultimo = lista->primeiro;




}


int vazia(TipoLista lista){
    if(lista.primeiro == lista.ultimo){
        return 1;

    }else{

        return 0;
    }


}


void inserir(TipoLista *lista, TipoItem item){

    lista->ultimo->prox = (apontador) malloc(sizeof(celula));
    lista->ultimo = lista->ultimo->prox;
    lista->ultimo->prox = NULL;
    lista->ultimo->item = item;



}


void imprimir(TipoLista lista){

    if(vazia(lista)){
        printf("lista vazia");
    }else{
        apontador aux = lista.primeiro->prox;

        while(aux != NULL){

            printf("%d \n", aux->item.id);
            aux = aux->prox;
        }

    }



}

void remover(TipoLista *lista, int id){

    if(vazia(*lista)){
        printf("lista vazia \n");
    }else{
        if(lista->primeiro->prox->item.id == id){

            apontador aux = lista->primeiro->prox;
            lista->primeiro->prox-> = aux->prox;
            free(aux);
        }else{
            apontador aux, anterior;
            aux =lista->primeiro->prox;
            while(aux != NULL){
                if(aux->item.id == id){
                        anterior->prox = aux->prox;
                        free(aux); // liberar memoria;
                        break;

                }

                anterior = aux;
                aux = aux->prox;
            }

        }

    }





}


int main()
{

    TipoLista lista;

    TipoItem item;

    criarLista(&lista);

    item.id = 10;

    inserir(&lista, item);

     item.id = 20;

    inserir(&lista, item);

     item.id = 30;

    inserir(&lista, item);





    imprimir(lista);



    remover(&lista, 20 );

    printf("\n");
    imprimir(lista);


    printf(" vazia? : %d", vazia(lista) );
    return 0;
}
