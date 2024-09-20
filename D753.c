#include <stdio.h>
#include <stdlib.h>

int min(int, int);
int min(int a, int b) {
    return (a) < (b) ? (a) : (b);
}

int calcularPeso(int [], int, int);
int calcularPeso(int valores[], int n, int restante) {
    if (n == 0 || restante == 0) 
        return restante;
    else if (valores[n - 1] > restante) 
        return calcularPeso(valores, n - 1, restante);
    else
        return min(calcularPeso(valores, n - 1, restante), calcularPeso(valores, n - 1, restante - valores[n - 1]));
}

int main() {
    int n;
    while (1) {
        scanf("%d", &n);
        if (n == 0) break;

        int *valores = (int *)malloc(n * sizeof(int));
        int suma = 0;

        int i;
        for (i = 0; i < n; i++) {
            scanf("%d", &valores[i]);
            suma += valores[i];
        }
        suma >>= 1;

        int resultado = calcularPeso(valores, n - 1, suma - valores[n - 1]);

        printf("%s\n", resultado == 0 ? "SI" : "NO");
        free(valores);
    }
}