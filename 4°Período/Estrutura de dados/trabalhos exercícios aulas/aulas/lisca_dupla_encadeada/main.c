#include <stdio.h>
#include <stdlib.h>


typedef struct{

    int id;


}TipoItem;

typedef struct celula_struct *apontador;

typedef struct  celula_struct{

    TipoItem item;
    apontador prox;
    apontador ant;


}celula;

typedef struct{

    apontador primeiro, ultimo;


}TipoLista;



void criarLista(TipoLista *lista){
    lista->primeiro = (apontador) malloc(sizeof(celula));
    lista->primeiro->prox = NULL;
    lista->primeiro->ant = NULL;
    lista->ultimo = lista->primeiro;


}




int vazia (TipoLista lista){

    if(lista.primeiro == lista.ultimo){
        return 1;
    }else{

        return 0;
    }

}



void inserirFinal(TipoLista *lista, TipoItem item){


    lista->ultimo->prox = (apontador) malloc(sizeof(celula));
    lista->ultimo->prox->ant = lista->ultimo;
    lista->ultimo = lista->ultimo->prox;
    lista->ultimo->prox = NULL;
    lista->ultimo->item = item;

}


void imprimir(TipoLista lista){

    if(vazia(lista) == 1){
        printf("\nlista vazia");
    }else{

    apontador aux = lista.primeiro->prox;
    while(aux != NULL){

        printf("\n- %d \n ", aux->item.id);
        aux = aux->prox;
    }

    }


}

void removerItem(TipoLista *lista, int id){

    int achou =0;
    if(vazia(*lista) ==1){
        printf("\nlista vazia\n");
    }else{
        if(lista->primeiro->prox->item.id == id){
            apontador aux = lista->primeiro->prox;
            lista->primeiro->prox = aux->prox;
            lista->primeiro->prox->ant = lista->primeiro;
            free(aux);
            achou =1;
        }else if(lista->ultimo->item.id == id){
            apontador aux;
            aux = lista->ultimo;
            lista->ultimo = aux->ant;
            lista->ultimo->prox = NULL;
            free(aux);
            achou =1;





        }else{
            apontador aux, anterior;
            aux = lista->primeiro->prox;

            while(aux != NULL){

                if(aux->item.id == id){
                    aux->ant->prox = aux->prox;
                    aux->prox->ant = aux->ant;
                    free(aux);
                    achou = 1;
                    break;

                }

                aux = aux->prox;
            }

    }

    if(achou ==0){
        printf("\n id informado nao presente na lista\n");
    }

    }


}


void imprimirItem(TipoLista lista, int id){


    if(vazia(lista) ==1){
        printf("\nlista vazia\n");
    }else{
        int achou =0;

        apontador aux = lista.primeiro->prox;

        while(aux != NULL){
            if(aux->item.id == id){
                printf("\nID ESPECIFICO: %d\n", aux->item.id);
                achou =1;
                break;
            }

            aux = aux->prox;
        }

        if(achou ==0){

            printf("\n nenhum id encntrado\n");

        }

    }



}


void imprimirContrario(TipoLista lista){

    if(vazia(lista) ==1){
        printf("\n lista vazia\n");
    }else{

        apontador aux = lista.ultimo;

        while(aux != lista.primeiro){
            printf("\nID: %d\n", aux->item.id);
            aux = aux->ant;
        }

    }




}

int main()
{
    TipoLista lista;
    TipoItem item;

    criarLista(&lista);


    item.id = 12;
    inserirFinal(&lista, item);

    item.id = 45;
    inserirFinal(&lista, item);

    item.id = 20;
    inserirFinal(&lista, item);

    item.id = 30;
    inserirFinal(&lista, item);



    printf("\nvazia?: %d", vazia(lista));

    printf("\n-----------imprimindo lista------------\n");

    imprimir(lista);



    printf("\n------------removendo item---------\n");

    removerItem(&lista, 30);
    imprimir(lista);


    printf("\n----------listando um item específico--------\n");

    imprimirItem(lista, 306);


    printf("\n-------------lista ao contrario---------\n");
    imprimirContrario(lista);

    return 0;
}
