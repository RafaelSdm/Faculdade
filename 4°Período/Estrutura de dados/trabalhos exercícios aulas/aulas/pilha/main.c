#include <stdio.h>
#include <stdlib.h>

typedef struct item{

    int id;
    struct item *prox;

}node;



void criarPilha(node *pilha){

    pilha->prox = NULL;

}


int vazia(node pilha){

    if(pilha.prox == NULL){
        return 1;
    }return 0;

}



void push(node *pilha, int id){


    node *novo = (node*) malloc(sizeof(node));

    if(novo == NULL){
        printf("\nsem memoria disponivel\n");
    }else{
        novo->id = id;
        novo->prox = NULL;
        if(vazia(*pilha) == 1){
            pilha->prox = novo;
        }else{

            node *aux = pilha->prox;
            while(aux->prox !=NULL){
                aux = aux->prox;
            }

            aux->prox = novo;

        }

    }


}

node * pop(node *pilha){


    if(vazia(*pilha) ==1){
        printf("\n a pilha esta vazia\n");
    }else{

        node *ultimo = pilha->prox;
        node *penultimo = pilha;
        while(ultimo->prox != NULL){
            penultimo = ultimo;
            ultimo = ultimo->prox;
        }

        penultimo->prox = NULL;
        return ultimo;

    }


}
void imprimir(node pilha){

    if(vazia(pilha) == 1){
        printf("\nvazia\n");
    }else{

        node *aux = pilha.prox;
        while(aux!= NULL){
            printf("\nID:%d\n", aux->id);
            aux = aux->prox;
        }

    }


}

void zerarPilha(node *pilha){
    if(vazia(*pilha)==0){
        node *prox, *atual;
        atual = pilha->prox;

        while(atual != NULL){
            prox = atual->prox;
            free(atual);
            atual = prox;
        }



    }
    criarPilha(pilha);


}


int main()
{

    node pilha;

    criarPilha(&pilha);


    push(&pilha, 1);
    push(&pilha, 2);
    push(&pilha, 3);
    push(&pilha, 4);
    push(&pilha, 15);


    imprimir(pilha);

    node *retirado = pop(&pilha);

    printf("\nelemento retirado %d\n", retirado->id);

    imprimir(pilha);

    zerarPilha(&pilha);

    imprimir(pilha);

}
