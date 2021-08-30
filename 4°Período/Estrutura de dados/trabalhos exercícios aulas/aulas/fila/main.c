#include <stdio.h>
#include <stdlib.h>


typedef struct item{

    int id;
    struct item *prox;


}node;



void criarFila(node *fila){

    fila->prox = NULL;


}

int vazia(node fila){

    if(fila.prox == NULL){
        return 1;
    }else{
        return 0;
    }


}

void inserir(node *fila, int id){

    node *novo = (node*)  malloc(sizeof(node));

    if(novo == NULL){
        printf("\nsem espaco na memoria\n");
    }else{

        novo->id = id;
        novo->prox = NULL;
        if(vazia(*fila) == 1){
            fila->prox = novo;
        }else{

            node *aux = fila->prox;
            while(aux->prox != NULL){
                    aux = aux->prox;

            }
            aux->prox = novo;

        }

    }


}


void imprimir(node fila){

    if(vazia(fila) == 1){
        printf("\n a fila esta vazia\n");
    }else{

        node *aux = fila.prox;
        while(aux != NULL){
            printf("\n ID: %d ", aux->id);
            aux = aux->prox;
        }

    }


}

int remover(node *fila){

    node *aux = fila->prox;
    fila->prox = aux->prox;
    return aux;


}

int contador(node fila){

    int contador =0;

    if(vazia(fila) == 1){
        return 0;
    }else{

        node *aux = fila.prox;


        while(aux != NULL){
            contador++;
            aux = aux->prox;
        }

        return contador;
    }



}

int main()
{
    node fila;

    criarFila(&fila);

    printf("\nvazia: %d\n", vazia(fila));


    printf("\n-------------imprimindo fila ---------------\n");


    inserir(&fila, 10);
    inserir(&fila, 20);
    inserir(&fila, 30);
    inserir(&fila, 40);

     printf("\nvazia: %d\n", vazia(fila));

    imprimir(fila);

    printf("\n---------removendo----------------\n");

    node *removido;
    removido = remover(&fila);

    printf("\nitem removido: %d\n", removido->id);
    imprimir(fila);

    /*

    removido = remover(&fila);

    printf("\nitem removido: %d\n", removido->id);
    imprimir(fila);

     removido = remover(&fila);

    printf("\nitem removido: %d\n", removido->id);
    imprimir(fila);

     removido = remover(&fila);

    printf("\nitem removido: %d\n", removido->id);
    imprimir(fila);

    */


    printf("\n----------contador de itens-----------\n");
    printf("contador: %d", contador(fila));
    imprimir(fila);
    return 0;
}


