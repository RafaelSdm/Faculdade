#include <stdio.h>
#include <stdlib.h>
#include <time.h>

typedef struct item{

    int senha;
    struct item *prox;



}node;

typedef struct item2{


    int senha2;
    struct item2 *prox2;

}node2;


void criarFila(node *fila){
    fila->prox = NULL;



}

void criarFila2(node2 *fila){


    fila->prox2 = NULL;

}


int vazia(node fila){

    if(fila.prox == NULL){
        return 1;
    }else{

        return 0;

    }


}

int vazia2(node2 fila2){

    if(fila2.prox2 == NULL){
        return 1;
    }else{

        return 0;

    }


}



void inserir(node *fila, int senha){

    node *novo = (node*) malloc(sizeof(node));
    if(novo == NULL){
        printf("\nsem espaco na memoria\n");
    }else{

        novo->senha = senha;
        novo->prox = NULL;
        if(vazia(*fila)==1){
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

void inserir2(node2 *fila2, int senha){
    int i =0;

    node2 *novo = (node2*) malloc(sizeof(node2));
    if(novo == NULL){
        printf("\nsem espaco na memoria\n");
    }else{

        novo->senha2 = senha;
        novo->prox2 = NULL;
        if(vazia2(*fila2)==1){
            //senha = i + 2;
            fila2->prox2 = novo;
        }else{

            node2 *aux = fila2->prox2;
            while(aux->prox2 != NULL){
                aux = aux->prox2;
            }

            aux->prox2 = novo;

        }
    }



}

void imprimir(node fila){

    if(vazia(fila) ==1){
        printf("\nA fila esta vazia\n");
    }else{
         printf("\n------------------------Fila normal-----------------\n");

        node *aux = fila.prox;
        while(aux != NULL){
            printf("\n Senha: %d", aux->senha);
            aux = aux->prox;
        }

        printf("\n-------------------------------------------------\n");


    }


}


void imprimir2(node2 fila2){

    if(vazia2(fila2) ==1){
        printf("\nA fila esta vazia\n");
    }else{

        printf("\n------------------------Fila preferencial-----------------\n");

        node2 *aux2 = fila2.prox2;
        while(aux2 != NULL){
            printf("\n Senha: %d", aux2->senha2);
            aux2 = aux2->prox2;
        }

        printf("\n----------------------------------\n");


    }


}


/*


void desinfeleirar(node fila, node2 fila2){

    if(vazia(fila) == 1){

            node2 *aux = fila2.prox2;
            while(aux != NULL){
                printf("\n Senha: %d\n", aux->senha2);
                aux = aux->prox2;
            }

    }else if(vazia2(fila2)== 1){

        node *aux = fila.prox;
        while(aux != NULL){
             printf("\n Senha: %d\n", aux->senha);
             aux = aux->prox;
        }

    }else{
        int i =0;
        int j =0;
        node2 *aux2 = fila2.prox2;
        node *aux = fila.prox;
        while((aux != NULL) && (aux2 != NULL)){
            if((j >=1) && (aux != NULL)){
                j =0;

            }

            if((i >=1) &&(aux2 != NULL)){

                i =0;
            }

            if((i <= 1) || (aux == NULL)){

                if(aux2 != NULL){

                    printf("\nSenha preferencial: %d\n", aux2->senha2);



                    if(aux != NULL){
                        j =0;
                    }
                    aux2 = aux2->prox2;
                    i++;
                }

            }else if((j <1) || (aux2 == NULL)){
                if(aux != NULL){

                        printf("\nSenha normal: %d\n", aux->senha);


                    if(aux2 != NULL){
                        i =0;
                    }
                    aux = aux->prox;
                    j++;
            }
            }

            }
        }

    }

*/


/*

void desinfeleirar(node fila, node2 fila2){


    if(vazia(fila) == 1){

            node2 *aux = fila2.prox2;
            while(aux != NULL){
                printf("\n Senha prioridade: %d\n", aux->senha2);
                aux = aux->prox2;
            }

    }else if(vazia2(fila2)== 1){

        node *aux = fila.prox;
        while(aux != NULL){
             printf("\n Senha normal: %d\n", aux->senha);
             aux = aux->prox;
        }

    }

    else{
        int i =0;
        int j =0;
        node *aux = fila.prox;
        node2 *aux2 = fila2.prox2;
        while((aux != NULL) &&(aux != NULL)){
            if((i <= 1) || (aux == NULL)){
                    printf("\nSenha prioridade: %d\n", aux2->senha2);


                    aux2 = aux2->prox2;
                    if((aux != NULL) &&(i >= 1)){
                        j =0;
                    }
                    if(aux2 != NULL){
                        i++;
                    }else{
                        i =2;
                    }
            }else if((j < 1) || (aux2 == NULL)){


                    printf("\nSenha normal: %d\n", aux->senha);


                    aux = aux->prox;

                    if(aux2 != NULL){
                        i =0;
                    }
                    if(aux != NULL){
                        j++;
                    }else{
                        j = 1;
                    }


            }





        }

    }


}



*/


/*

void desinfeleirar(node fila, node2 fila2){

    if(vazia(fila) == 1){

            node2 *aux = fila2.prox2;
            while(aux != NULL){
                printf("\n Senha prioridade: %d\n", aux->senha2);
                aux = aux->prox2;
            }
    }else if(vazia2(fila2)== 1){

        node *aux = fila.prox;
        while(aux != NULL){
             printf("\n Senha normal: %d\n", aux->senha);
             aux = aux->prox;
        }

    }else{
        int i =0;
        int j =0;
        node *aux = fila.prox;
        node2 *aux2 = fila2.prox2;

        while((aux != NULL) && (aux2 != NULL)){
            if(i <= 1){
                if(aux2 != NULL){
                    printf("\nSenha prioritaria: %d\n", aux2->senha2);
                    i++;
                    aux2 = aux2->prox2;
                }else if( aux2 == NULL){
                   // i++;


                }

                if((aux != NULL)&&(i ==2)){
                   // i =0;
                    j =0;

                }
            }else if(j < 1){

                if(aux != NULL){
                    printf("\nSenha Normal: %d\n", aux->senha);
                    j++;
                    aux = aux->prox;
                }else if(aux == NULL){

                  //  j++;

                }
                if((aux2 != NULL) &&(j==1)){
                    i =0;

                }else if((aux2 == NULL)&&(j ==1)){
                    j =0;
                }

            }
        }


    }






}

*/



void desinfeleirar(node fila, node2 fila2){

    if(vazia(fila) == 1){

            node2 *aux = fila2.prox2;
            while(aux != NULL){
                printf("\n Senha prioridade: %d\n", aux->senha2);
                aux = aux->prox2;
            }
    }else if(vazia2(fila2)== 1){

        node *aux = fila.prox;
        while(aux != NULL){
             printf("\n Senha normal: %d\n", aux->senha);
             aux = aux->prox;
        }

    }else{

        int i =0;
        int j =0;

        node *aux = fila.prox;
        node2 *aux2 = fila2.prox2;

        while((aux !=NULL) ||(aux2 != NULL)){
            if(i <=1){
                if(aux2 != NULL){
                    printf("\nSenha prioritaria: %d\n", aux2->senha2);
                    aux2 = aux2->prox2;
                    i++;
                }else if(aux2 == NULL){
                    i = 2;
                }

                if((aux != NULL) && (i == 2)){
                    j =0;
                }
            }else if(j < 1){

                if(aux != NULL){
                    printf("\nSenha normal: %d\n", aux->senha);
                    aux = aux->prox;
                    j++;
                }else if(aux == NULL){

                    j =1;
                }

                if(aux2 != NULL){
                    i =0;

                }

            }else if(aux  !=NULL){
                j =0;
            }else if(aux2 != NULL){
                i =0;
            }
        }

    }



}


int main()
{
    int k =0;
    int d = 1;


    node fila1;
    criarFila(&fila1);



    node2 fila2;
    criarFila2(&fila2);


    srand(time(NULL));
    int j = 1;
    printf("\n----------------------------------\n");
    printf("---------------------Seja bem vindo :) ----------------  \n");



    while(j != 5){
        printf("\n-----------------------------------------\n");
        printf("\n[1] Gerar senha da fila normal:\n");
     //   scanf("%d", &j);
        printf("\n[2] Gerar senha da fila preferencial\n");
     //   scanf("%d", &j);
        printf("\n[3] Desenfileirar\n");
      //  scanf("%d", &j);
        printf("\n[4] Imprimir Fila\n");
     //   scanf("%d", &j);
        printf("\n[5] Sair\n");
        printf("\n-----------------------------------------\n");
        scanf("%d", &j);
        if(j == 1){
            k = k + 2;
        }else if(j == 2){

            d = d + 2;

        }












        switch(j){

        case 1:
          //  filanormal();

          inserir(&fila1, k);
            break;

        case 2:
           // filapreferencial();
           inserir2(&fila2, d);
            break;

        case 3:
            desinfeleirar(fila1, fila2);
         //   chamadaFila();
            break;

        case 4:
           // imprimirFila();
           imprimir(fila1);
           imprimir2(fila2);
            break;

        case 5:
            printf("\n-----------Obrigado ;) ---------------\n");
            break;

        default:
            printf("\nnumero informado não corresponde! Tente novamente\n");
        }

    }


    return 0;
}
