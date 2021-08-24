#include <stdio.h>
#include <stdlib.h>
#define tamanhLista 10

typedef struct {
    int id;
    float preco;


}TipoItem;

typedef struct{

    TipoItem itens[tamanhLista];
    int inicio, fim;

}TipoLista;


int vazia(TipoLista lista){

    if(lista.inicio == lista.fim){
        return 1;
    }else{
        return 0;

    }


}

void criarLista(TipoLista *lista){


    lista->inicio =0;
    lista->fim =0;

}



void inserir(TipoLista *lista, TipoItem item){

    if(lista->fim > tamanhLista){
        printf("\n lista cheia\n");
    }else{
        lista->itens[lista->fim] = item;
        lista->fim++;

    }


}

void imprimir(TipoLista lista){


    int i;

    if(vazia(lista) == 1){
        printf("\n lista vazia\n");
    }else{

        for(i=lista.inicio;i<lista.fim;i++){
        printf("\n %d - preco: %f \n", lista.itens[i].id, lista.itens[i].preco);
        }

    }

}


void remover(TipoLista *lista, int pos){

    int i;

    if(vazia(*lista) ==1){
        printf("\n a lista esta vazia");
    }else if(pos>=lista->fim){
        printf("\n operacao invalida\n");
    }else{
        for(i=pos; i<lista->fim;i++){
            lista->itens[i] = lista->itens[i+1];

        }

        lista->fim--;

    }



}

int buscar(TipoLista lista, int id){

    int i;

    for(i = lista.inicio; i< lista.fim;i++){
        if(lista.itens[i].id == id){

            return i;

        }else{

        }
    }
    return -1;





}


void trocarPosicao(TipoLista *lista, int pos1, int pos2){

    TipoItem aux;
    if((pos1<0) || (pos1 >= lista->fim)){
        printf("\n  posicao 1 invalisa \n");
    }else if((pos2 <0) ||(pos2 >=lista->fim)){
        printf("\n posicao 2 invalida\n");
    }else{

        aux = lista->itens[pos1];
        lista->itens[pos1] = lista->itens[pos2];
        lista->itens[pos2] = aux;

    }


}


void alterar(TipoLista *lista, int id){


    int idItem = buscar(*lista, id);
    if(idItem == -1){
        printf("\no id noa esta presente\n");
    }else{
        printf("\n informe o novo id\n");
        scanf("%d", &lista->itens[idItem].id);
        printf("\n informe o novo preco> \n");
        scanf("%f", &lista->itens[idItem].preco);
    }


}

void imprimeItem(TipoLista lista, int id){


    int posItem = buscar(lista, id);

    if(posItem == -1){
        printf("\n o id nao esta presente na lista \n");
    }else{
        printf("\n%d - preco: %f\n", lista.itens[posItem].id, lista.itens[posItem].preco);


    }


}


void zerar(TipoLista *lista){
    lista->inicio =0;
    lista->fim =0;




}

void unir(TipoLista *lista, TipoLista lista2){


    int i;

    for(i = lista2.inicio; i<lista2.fim;i++){
        lista->itens[lista->fim] = lista2.itens[i];
        lista->fim++;

    }

}


void clonar(TipoLista lista, TipoLista *lista2){

    int i;

    for(i=lista.inicio; i<lista.fim;i++){
        lista2->itens[lista2->fim] = lista.itens[i];
        lista2->fim++;
    }



}
int main()
{
    TipoLista lista;
    TipoItem item;

    TipoLista lista2;

    criarLista(&lista);
    criarLista(&lista2);

    item.id = 1;
    item.preco = 34.56;
    inserir(&lista, item);

    item.id = 4;
    item.preco = 56.78;
    inserir(&lista, item);


    item.id = 45;
    item.preco = 45.88;
    inserir(&lista, item);

    item.id = 789;
    item.preco = 1.78;
    inserir(&lista, item);

    item.id = 99;
    item.preco = 78.78;
    inserir(&lista, item);

    // --------------------------------------------


     item.id = 1;
    item.preco = 34.56;
    inserir(&lista2, item);

    item.id = 4;
    item.preco = 56.78;
    inserir(&lista2, item);


    item.id = 45;
    item.preco = 45.88;
    inserir(&lista2, item);

    item.id = 789;
    item.preco = 1.78;
    inserir(&lista2, item);

    item.id = 99;
    item.preco = 78.78;
    inserir(&lista2, item);

    printf("%d", vazia(lista));
    imprimir(lista);

    printf("\n-------------------removendo--------------\n");

    remover(&lista, 1);



    imprimir(lista);

    printf("\n verificando item, 1 existe e 0 nao existe: %d \n", buscar(lista,99));



    printf("\n-------------------trocando--------------\n");

    trocarPosicao(&lista, 0,2);
    imprimir(lista);

    printf("\n------------alterando----------\n");

    alterar(&lista, 99);

    imprimir(lista);


    printf("\n--------------- lista especifica---------------\n");

    imprimeItem(lista, 789);

    printf("\n-------zerar---------\n");
   // zerar(&lista);

    imprimir(lista);
    printf("\nvazia? : %d\n", vazia(lista));

    printf("\n--------------lista2----------------\n");

    imprimir(lista2);

    printf("\n------------------ unir --------\n");


    unir(&lista, lista2);
    imprimir(lista);


    printf("\n----------------------clonar---------------\n");

    zerar(&lista2);
    clonar(lista, &lista2);
    imprimir(lista2);

    return 0;
}
