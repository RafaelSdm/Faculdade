#include <stdio.h>
#include <stdlib.h>
#include <strings.h>

typedef struct{
    int cod;
    char nome[50];
    int pontos;

}TipoTime;

void gravar(FILE *times, TipoTime time){
    //posiciona o ponteiro no final do arquivo
    fseek(times, 0, SEEK_END);
    fwrite(&time, sizeof(TipoTime), 1, times);
}

void imprimir(FILE *times){
    TipoTime time;
    //posiciona o ponteiro no inicio do arquivo
    fseek(times, 0, SEEK_SET);
    while(feof(times)==0){
        fread(&time, sizeof(TipoTime), 1, times);
        if(feof(times)==0){
            printf("Codigo: %d - Nome: %s - Pontuacao: %d\n", time.cod, time.nome, time.pontos);
        }
    }
}

int main()
{
    FILE *times;
    TipoTime time;
    int contador = 0;

    times = fopen("times.dat", "w+b");

    if(times==NULL){
        printf("Falha ao ler o arquivo");
        return 1;
    }

    do{
        printf("Informe o codigo do time  ");
        scanf("%d", &time.cod);
        getchar();

        printf("Informe o nome do time: ");
        fgets(time.nome, 50, stdin);

        printf("\npontuacao do time:");
        scanf("%d", &time.pontos);


        gravar(times, time);

        printf("\n");
        contador++;
    }while(contador <= 5);

    imprimir(times);

    fclose(times);

    return 0;
}
