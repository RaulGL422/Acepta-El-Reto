#include <stdio.h>
int formas, minimoCuerdas, minimoPrecio;

void antonio(int [], int [], int, int, int, int);

void antonio(int arrCordeles[], int arrPrecio[], int tamanioRestante, int cuerdasUsadas, int precioAcumulado, int cordel) {
    if (cordel != 0) {
        if (tamanioRestante == 0) {

        } else if (tamanioRestante < arrCordeles[cordel - 1]) {
            
        } else {

        }
    }
}

int main() {
    int cordeles, tamanioDeseado;
    
    while (scanf("%d %d", &cordeles, &tamanioDeseado) != EOF) {
        formas = 0;
        minimoCuerdas = 1000000;
        minimoPrecio = 1000000;
        int arrCordeles[cordeles];
        int arrPrecio[cordeles];

        long sumaCordeles = 0;
        int i;
        for (i = 0; i < cordeles; i++)
        {
            scanf("%d %d", &arrCordeles[i], &arrPrecio[i]);
            sumaCordeles += arrCordeles[i];
        }

        if (sumaCordeles < tamanioDeseado) {
            printf("NO\n");
        } else {
            for (i = cordeles - 1; i >= 0; i--){
                antonio(arrCordeles, arrPrecio, tamanioDeseado - arrCordeles[i], 1, arrPrecio[i], i);
            }
            if (formas == 0)
                printf("NO\n");
            else
                printf("SI %d %d %d\n", formas, minimoCuerdas, minimoPrecio);
            
        }
        
    }

    return 0;
}