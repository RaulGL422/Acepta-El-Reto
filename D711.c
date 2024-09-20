#include <stdio.h>

int main() {

    int casos, suma, mayor, menor;
    char codigo[20];
    scanf("%d", &casos);
    while (casos--) {
        scanf("%s", &codigo);
        int i = 0;
        while (codigo[i] == '0') {
            i++;
        }
        suma = 0;
        for (i = i; codigo[i] != '\0'; i++) {
            menor = 10;
            mayor = 0;
            int digito = codigo[i] - '0';
            int h;
            if ((i + 1) % 2 == 0) {
                
                for (h = 0; h < i; h++) {
                    if (i == 0) continue;
                    int digitoIzquierda = codigo[h] - '0';
                    if (digitoIzquierda > mayor) mayor = digitoIzquierda;
                }
                suma += (digito * 2) + mayor;
            } else {
                for ( h = i + 1; codigo[h] != '\0'; h++) {
                    int digitoDerecha = codigo[h] - '0';
                    if (digitoDerecha < menor) menor = digitoDerecha;
                }
                suma += (digito * 3) + menor;
                
            }
        }
        printf("%d\n", suma);
    }
}