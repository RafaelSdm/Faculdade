#include <stdio.h>
#include <stdlib.h>

int main()
{
    FILE *arquivo, *arquivo_invertido;
    char c, texto[5000], pos=0;
    int i;

    arquivo = fopen("arquivo.txt", "r");

    if(arquivo==NULL){
        printf("Falha ao ler o arquivo");
        return 1;
    }

    while(feof(arquivo)==0){
        c = fgetc(arquivo);
        texto[pos] = c;
        pos++;
    }

    arquivo_invertido = fopen("arquivo_invertido.txt", "w");

    if(arquivo_invertido==NULL){
        printf("Falha ao ler o arquivo");
        return 1;
    }

    for (i=pos-2; i>=0; i--){
        fputc(texto[i], arquivo_invertido);
    }

    fclose(arquivo);
    fclose(arquivo_invertido);

    return 0;
}
