#include <stdio.h>
#include <stdlib.h>

int main()
{
    int diferenca, maior, menor;
    int n1, n2 =0;
    int matriz[];
    printf("informe o n1:");
    scanf("%d", &n1);

    printf("\ninforme o n2:");
    scanf("%d", &n2);

    if(n1 > n2){
        maior = n1;
        menor = n2;
    }else {
        maior = n2;
        menor = n1;
    }

    int matriz[diferenca];
    diferenca = n1 - n2;

    for(i=menor;i< maior; i++){
        for(j=0;j<i;j++){
            if((j / i) == 1){
                k++
            }
        }
        if(k ==2){
            matriz[i] = i;
            printf("%d é primo", i );
            k =0;
        }
        k =0;
    }





    return 0;
}
