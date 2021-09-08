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
    }else{
        return 0;
    }


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

            while(aux->prox != NULL){
                aux = aux->prox;
            }

            aux->prox = novo;
        }
    }

}


node* pop(node *pilha){

    if(vazia(*pilha) ==1){
        printf("\npilha vazia\n");
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




void imprmirContrario(node pilha1){
    node *retira;
    int i =0;
    node pilha2;

    criarPilha(&pilha2);

    node *aux = pilha1.prox;

    while(aux != NULL){
        push(&pilha2, aux->id);
        aux = aux->prox;
    }




    int cont = contador(pilha2);
    printf("\nImprimindo lista ao contrario:\n");
    for(i =0; i < cont ; i++){

            retira = pop(&pilha2);
            printf("\n%d\n", retira->id);

    }


}


void imprimir(node pilha){

    if(vazia(pilha) == 1){
        printf("a pilha esta vazia");
    }else{

        node *aux = pilha.prox;
        while(aux != NULL){
            printf("\n%d\n", aux->id);
            aux = aux->prox;
        }
    }


}

void zerar(node *pilha){

    if(vazia(*pilha) ==0){
        node *prox, *atual;
        atual = pilha->prox;

        while(atual != NULL){
            prox = atual->prox;
            free(atual);
            atual = prox;
        }

        criarPilha(pilha);
    }


}


int contador(node pilha){

    int i =0;

    if(vazia(pilha) == 1){
        printf("\na pilha esta vazia\n");
        return i;
    }else{

        node *aux = pilha.prox;
        while(aux != NULL){
            i++;
            aux = aux->prox;
        }

        return i;

    }



}



int main()
{

    node pilha;

    criarPilha(&pilha);


    push(&pilha, 10);
    push(&pilha, 20);
    push(&pilha, 30);
    push(&pilha, 40);
     printf("contador da pilha: %d", contador(pilha));

    imprimir(pilha);
    printf("\n=============\n");

    node *retirado;
    retirado = pop(&pilha);

    printf("contador da pilha: %d", contador(pilha));
    imprimir(pilha);

//    copiarPilha(pilha);

    imprmirContrario(pilha);
    return 0;
}
