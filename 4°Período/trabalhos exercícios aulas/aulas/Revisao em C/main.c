#include <stdio.h>
#include <stdlib.h>


typedef struct {

    char nome[50];
    float altura, peso;
    float imc;


} Pessoa;
int main()
{
    Pessoa P;


    printf("\nnome");
    scanf("%s", &P.nome);

    printf("\naltura:");
    scanf("%f", &P.altura);

    printf("\npeso");
    scanf("%f", &P.peso);








    //printf("%f", p.peso);

    printf("%f", P.peso);
    printf("\n");
    printf("%f \n", P.altura);
    printf(" %s \n", P.nome);

    P.imc = P.peso /(P.altura * P.altura);

    printf("%f", P.imc);

    if(P.imc < 17){
        printf("ABAIXO DO PESO");
    }else if(P.imc >= 17) && (P.imc < 18){
        printf("ABAIXO DO PESO AINDA POREM POUCO");

    }else if ((P.imc >= 18) && (P.imc < 24)){
            printf("peso normal");

    }else if(( P.imc >= 24) && (P.imc < 29)){

            printf("OBESIDADE");
    }else{
        printf("obesidade morbida!");

    }






    return 0;
}
