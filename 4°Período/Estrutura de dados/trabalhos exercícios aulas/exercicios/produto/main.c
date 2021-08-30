#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <strings.h>


typedef struct{

    int codigo;
    char nome[50];
    float preco;
    int estoque;

}TipoItem;


typedef struct celula_struct *apontador;


typedef struct celula_struct{

    TipoItem item;
    apontador prox;




}celula;


typedef struct {

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



void inserirProduto(TipoLista *lista, TipoItem item){


        lista->ultimo->prox = (apontador) malloc(sizeof(celula));
        lista->ultimo = lista->ultimo->prox;
        lista->ultimo->prox = NULL;
        lista->ultimo->item = item;








}


void imprimir(TipoLista lista){


    if(vazia(lista)){
        printf("\nA lista esta vazia\n");
    }else{

        apontador aux = lista.primeiro->prox;

        printf("\n========== Impressao dos produtos =============\n");

        while(aux != NULL){
            printf("\n - Código: %d\n - Nome: %s - Preço de compra: R$ %.2f\n - Quantidade no estoque(Un): %d\n - Valor do estoque: R$ %.2f\n ---------------------------------\n" , aux->item.codigo, aux->item.nome, aux->item.preco, aux->item.estoque,(aux->item.preco * aux->item.estoque));
            aux = aux->prox;

        }






    }

    printf("\n");


}



int buscar(TipoLista lista, int codigo){


        apontador aux = lista.primeiro->prox;
        while(aux != NULL){
            if(aux->item.codigo == codigo){
                return 1;

            }
            aux = aux->prox;
        }

    return 0;
}


void valorEstoque(TipoLista lista) {
    float soma;
    float somaFinal;
    apontador aux = lista.primeiro->prox;
    while(aux != NULL) {
        soma = (aux->item.preco * aux->item.estoque);
        aux= aux->prox;
        somaFinal += soma;

    }

    printf("\nValor do Estoque: R$ %.2f\n", somaFinal);

}

int baixaEstoque(TipoLista lista, int codProduto, int quantVendida) {
    int estoqueFinal, achou = 0;
    apontador aux = lista.primeiro->prox;
    while(aux != NULL) {
        estoqueFinal = (aux->item.estoque - quantVendida);

    if ((aux->item.codigo == codProduto) && (quantVendida <= aux->item.estoque)) {
            printf("\n");
            achou++;
            aux->item.estoque = estoqueFinal;
            printf("SUCESSO!! - Operação Realizada!!\n");
            break;

    }
         aux = aux->prox;
        } if (achou < 1) {
            printf("\n\n\n################## ERRO!! - Código ou quantidade incorretos! ##################\n\n\n");
        }
    }


int main()
{
    setlocale(LC_ALL, "portuguese");
    int j =1;
    int valorCodigo, valor =0;

    TipoLista lista;
    TipoItem item;

    criarLista(&lista);
    printf("\n===========================\n");


    while(j != 0){
        printf("\n===========================\n");
        printf("\n[1] - Inserir Produto\n");
        printf("\n[2] - Calcular valor total do estoque\n");
        printf("\n[3] - Imprimir\n");
        printf("\n[4] - Dar baixa no estoque\n");
        printf("\n[0] - Sair\n");
        printf("\n==============================\n");
        scanf("%d", &j);




        switch(j){

        case 1:

            printf("\nCodigo do produto:\n");
            scanf("%d",&item.codigo);

            if(buscar(lista, item.codigo) == 1){
                    printf("\nCódigo fornecido ja existente!\n");
                break;
            }else{


                fflush(stdin);
                printf("\nNome do produto:\n");
                fgets(item.nome, 50, stdin);
                printf("\nPreco de compra:\n");
                scanf("%f", &item.preco);
                printf("\nQuantidade do estoque:\n");
                scanf("%d",&item.estoque);
                inserirProduto(&lista, item);




                break;
            }


        case 2:
            valorEstoque(lista);

            break;

        case 3:
            imprimir(lista);
            break;

        case 4:


            imprimir(lista);

            printf("\nInforme o código do produto que deseja modificar: ");
            scanf("%d", &valorCodigo);
            printf("\nInforme a quantidade vendida: ");
            scanf("%d", &valor);
            baixaEstoque(lista, valorCodigo, valor);
            break;
        case 0:
            break;

        default:
            printf("\nnumero informado nao correspondente!\n Informe novamente!");
            break;


        }
    }


    printf("\n============= Obrigado :) ======================\n");
    return 0;
}
