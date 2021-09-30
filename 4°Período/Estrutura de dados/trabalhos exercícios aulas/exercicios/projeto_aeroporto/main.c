#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int guardar_contadr =0;
typedef struct item
{
    int id;
    int emergencia;
    struct item *prox;

}node;


void criarFila(node *fila)
{
    fila->prox = NULL;
}


int vazia(node fila)
{
    if(fila.prox == NULL)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}


void inserir(node *fila, int id)
{
    node *novo = (node*) malloc(sizeof(node));

    if(novo == NULL)
    {
        printf("Sem espaco na memoria");
    }
    else
    {
        novo->id = id;
        novo->prox = NULL;
        if(vazia(*fila)==1)
        {
            fila->prox = novo;
        }
        else
        {
            node *aux = fila->prox;
            while(aux->prox != NULL)
            {
                aux = aux->prox;
            }
            aux->prox = novo;
        }
    }
}


void PousoEmergencia(node *fila_AT, int id, int emergencia)
{
     node *novo = (node*) malloc(sizeof(node));

    if(novo == NULL)
    {
        printf("Sem espaco na memoria");
    }
    else
    {
        novo->id = id;
        novo->emergencia = emergencia;
        novo->prox = NULL;
        if(vazia(*fila_AT)==1)
        {
            fila_AT->prox = novo;
        }
        else
        {
            node *atual = fila_AT->prox;
            node *ant = fila_AT;
            while((atual!= NULL) && (atual->emergencia <= novo->emergencia))
            {
                ant =atual;
                atual = atual->prox;
            }
            novo->prox = ant->prox;
            ant->prox = novo;
        }
    }
}


void imprimir(node fila_DEC, node fila_AT)
{
    if(vazia(fila_DEC)==1)
    {
        printf("\nA fila de decolagem esta vazia!!!\n");
    }
    else
    {
        node *aux = fila_DEC.prox;
        printf("\n===========================\n");
        printf("FILA DE DECOLAGEM:  ");

        while(aux != NULL)
        {
            printf("<- [%d] ", aux->id);
            aux = aux->prox;
        }
    }
    printf("\n==========================\n");
    printf("\n");

    if(vazia(fila_AT)==1)
    {
        printf("\nA fila aterrissagem esta vazia!!!\n");
    }
    else
    {
        node *aux = fila_AT.prox;
        printf("\n==========================\n");
        printf("FILA DE ATERRISSAGEM:  ");

        while(aux != NULL)
        {
            if(aux->emergencia == 1)
            {
                printf("<- [*%d]", aux->id, aux->emergencia);
            }
            else
            {
                printf("<- [%d]", aux->id, aux->emergencia);
            }
            aux = aux->prox;
        }
    }
     printf("\n==========================\n");
     printf("\n");
}


int contador(node fila)
{
    int i =0;
    node *aux = fila.prox;

    while(aux != NULL)
    {
        i++;
        aux = aux->prox;
    }
    return i;
}


int remover(node *fila)
{
        node *aux = fila->prox;
        fila->prox = aux->prox;
        return aux->id;
}


void controlePista(node *fila_AT, node *fila_DEC)
{
    int pista =0;
    int pista2 =0;
    int pista3 =0;

    int i =0;
    int j =0;
    int k =0;
    int l =0;
    int m =0;

    int cont =0;
    int atende =0;

    for(i=0;i<1;i++)
    {
        if(vazia(*fila_AT) == 0)
        {
            node *aux1 = fila_AT->prox;
            fila_AT->prox = aux1->prox;
            pista = aux1->id;
            j =0;

            guardar_contadr = guardar_contadr + 1;

        }
        else if(vazia(*fila_DEC) ==0)
        {
            node *aux2 = fila_DEC->prox;
            fila_DEC->prox = aux2->prox;
            pista = aux2->id;
            j =1;

            guardar_contadr = guardar_contadr + 1;
        }
         if(vazia(*fila_AT) == 0)
        {
            node *aux3 = fila_AT->prox;
            fila_AT->prox = aux3->prox;
            pista2 = aux3->id;
            k =0;

            guardar_contadr = guardar_contadr + 1;
        }
        else if(vazia(*fila_DEC) ==0)
        {

            node *aux4 = fila_DEC->prox;
            fila_DEC->prox = aux4->prox;
            pista2 = aux4->id;
            k =1;

            guardar_contadr = guardar_contadr + 1;
        }
        if(vazia(*fila_DEC) == 0)
        {
            node *aux5 = fila_DEC->prox;
            fila_DEC->prox = aux5->prox;
            pista3 = aux5->id;
            l =0;

            guardar_contadr = guardar_contadr + 1;
        }
        else if(vazia(*fila_AT) ==0)
        {
            node *aux6 = fila_AT->prox;
            fila_AT->prox = aux6->prox;
            pista3 = aux6->id;
            l = 1;

            guardar_contadr = guardar_contadr + 1;
        }
    }
        imprimir(*fila_DEC, *fila_AT);

        if(pista == 0)
        {
            printf("\nPista 1 - Completamente vazia\n");
        }
        else if(j ==0)
        {
            printf("\nPista 1: [%d] - Aterrissando\n", pista );
        }
        else if(j ==1)
        {
            printf("\nPista 1: [%d] - Decolando\n", pista);
        }
        if(pista2 == 0)
        {
            printf("\nPista 2: - Completamente vazia\n");
        }
        else if(k ==0)
        {
            printf("\nPista 2: [%d] - Aterrissando\n", pista2 );
        }
        else if((k == 1) != 0)
        {
            printf("\nPista 2: [%d] - Decolando\n", pista2);
        }
        if(pista3 == 0)
        {
            printf("\nPista 3: - Completamente vazia\n");
        }
        else if(l ==0)
        {
            printf("\nPista 3: [%d] - Decolando\n", pista3 );
        }
        else if(l ==1)
        {
            printf("\nPista 3: [%d] - Aterrissando\n", pista3);
        }
            printf("\nAvioes atendidos: %d\n", guardar_contadr);
}

int main()
{
    int i =0;
    int j =1;
    int p =0;
    int sort;
    int sort2;
    int v =1;
    int k = 0;
    int e =0;
    int prioridade;
    srand(time(NULL));

    node fila_DEC;
    node fila_AT;

    criarFila(&fila_AT);
    criarFila(&fila_DEC);


    do{
        system("cls");

        printf("\n==============================================\n");
        printf("\n\tCONTROLE DE TRAFEGO AEREO\n");
        printf("\n==============================================\n");

        printf("\n[ENTER] PARA CONTINUAR\n");

        system("pause");

        switch(j)
        {

        case 0:
            i = 1;
            break;

        case 1:
            sort = rand()%6;


           for(p =0; p< sort; p++)
           {
                sort2 = rand()%2;

                if(sort2 %2 == 0)
                {
                    k = k +2;
                    //DECOLAGEM

                    inserir(&fila_DEC, k);
                    //inserirPAR;
                }
                else
                {
                    v = v+2;
                    //ATERRISSAGEM
                    prioridade = rand()%8;

                    if(prioridade == 1)
                    {
                        PousoEmergencia(&fila_AT, v, prioridade);
                        e++;
                    //INSERIRIMPAR;
                    }
                    else
                    {
                        PousoEmergencia(&fila_AT, v, 2);
                    }
                }
           }
           printf("\n\t ---------------- Check-in --------------------\n");
           imprimir(fila_DEC, fila_AT);
           printf("\n");
           printf("\n\t ---------------- Check-out -------------------\n");
           controlePista(&fila_AT, &fila_DEC);

           printf("\nTotal de emergencias: %d\n\n", e);
        break;

        }
        system("\npause");
    }while(i!=1);
}
