#include <stdio.h>
#include <stdlib.h>
#include <strings.h>

typedef struct{
    int cod;
    char nome[50];
}TipoAluno;

void gravar(FILE *arquivo, TipoAluno aluno){
    //posiciona o ponteiro no final do arquivo
    fseek(arquivo, 0, SEEK_END);
    fwrite(&aluno, sizeof(TipoAluno), 1, arquivo);
}

void imprimir(FILE *arquivo){
    TipoAluno aluno;
    //posiciona o ponteiro no inicio do arquivo
    fseek(arquivo, 0, SEEK_SET);
    while(feof(arquivo)==0){
        fread(&aluno, sizeof(TipoAluno), 1, arquivo);
        if(feof(arquivo)==0){
            printf("Codigo: %d / Nome: %s\n", aluno.cod, aluno.nome);
        }
    }
}

int main()
{
    FILE *arquivo;
    TipoAluno aluno;

    arquivo = fopen("arquivo.dat", "w+b");

    if(arquivo==NULL){
        printf("Falha ao ler o arquivo");
        return 1;
    }

    do{
        printf("Informe o codigo do aluno ou -1 para sair: ");
        scanf("%d", &aluno.cod);
        getchar();
        if(aluno.cod>=0){
            printf("Informe o nome do aluno: ");
            fgets(aluno.nome, 50, stdin);
            gravar(arquivo, aluno);
        }
    }while(aluno.cod!=-1);

    imprimir(arquivo);

    fclose(arquivo);

    return 0;
}
