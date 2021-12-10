#include <stdio.h>
#include <stdlib.h>
#include <strings.h>
#include <string.h>

int main()
{
    FILE *arquivo;
    FILE *arquivo2;


    int c;
    int maior =0;
    char cidade[50];
    char pop[20];

    char maiorcidade[50];

    arquivo = fopen("prova.txt", "r");

    if(arquivo == NULL){
        printf("Arquivo inválido!");
        return 1;
    }


    /*

    while(feof(arquivo)==0){
        c = fgetc(arquivo);
        printf("%c", c);
    }

    */

    c = fgetc(arquivo);


    while(feof(arquivo)==0){
        memset(cidade, 0, 50);
        memset(pop, 0, 20);

        while(c != '@'){
            cidade[strlen(cidade)] = c;
            c = fgetc(arquivo);

        }

         c = fgetc(arquivo);

         while(c != '@'){
            pop[strlen(pop)] = c;
            c = fgetc(arquivo);

        }

        c = fgetc(arquivo);

       // printf("%s", cidade);
        //printf("%d", pop);

        if(maior < atoi(pop)){
            maior = atoi(pop);
            strcpy(maiorcidade, cidade);
        }


    }




    fclose(arquivo);




    arquivo2 = fopen("prova2.txt", "w");

    if(arquivo2 == NULL){
        printf("invalido");
        return 1;
    }


    fprintf(arquivo2, "A maior cidade é %s com %d habitantes", maiorcidade, maior);


    fclose(arquivo2);






    return 0;






}
