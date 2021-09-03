
#include <stdio.h>
#include <stdlib.h>

typedef struct item {
    int id;
    int prioridade;
    struct item *prox;
}node;




void criaFila(node *fila) {
    fila->prox = NULL;
}

int vazia(node fila) {
    if(fila.prox == NULL) {
        return 1;
    } else{
        return 0;
    }
}

void inserir(node *fila, int id, int prioridade) {
    node *novo = (node*) malloc(sizeof(node));

    if(novo == NULL) {
        printf("Sem espaco na memoria");
    }else
    {
        novo->id = id;
        novo->prox = NULL;
        novo->prioridade = prioridade;
        if(vazia(*fila)==1) {
            fila->prox = novo;
        }else {
            node *atual = fila->prox;
            node *ant = fila;
            while((atual->prox != NULL)&&(atual->prioridade < novo->prioridade)) {
                ant = atual;
                atual = atual->prox;
            }
            novo->prox = ant->prox;
            ant->prox = novo;

        }
    }
}

 node* remover(node *fila) {
        node *aux = fila->prox;
        fila->prox = aux->prox;
        return aux;
}


void imprimir(node fila){
    if(vazia(fila)==1){
        printf("A fila esta vazia!!!");
    }else{
        node *aux = fila.prox;
        printf("FILA\n ");
        while(aux != NULL){
            printf("<- [%d] ", aux->id);
            aux = aux->prox;
        }
    }
    printf("\n");
}




void quantElementos(node fila) {
    int contador = 0;
    if(vazia(fila) == 1) {
        printf("\nFila vazia");
    } else {
        node *aux = fila.prox;
        while(aux != NULL) {
            contador++;
            aux = aux->prox;
        }
    }
        printf("\nQuantidade de elementos: %d", contador);
}


int main()
{
    node fila;

    criaFila(&fila);

    inserir(&fila, 10,1);
    inserir(&fila, 26,2);
    inserir(&fila, 40,1);
    inserir(&fila, 60,2);
    inserir(&fila, 80,1);
    inserir(&fila, 300,5);






    //printf("%d", vazia(fila));

    imprimir(fila);

    node *removido = remover(&fila);

    printf("Elemento removido: %d\n", removido->id);


    imprimir(fila);

    quantElementos(fila);




    return 0;
}
