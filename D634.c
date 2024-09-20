#include <stdio.h>

int main() {
    int casos;
    scanf("%d", &casos);
    while (casos--) {
        char linea[10000];
        scanf("%s", &linea);

        int i, acumulador = 1, suma = 0;
        for (i = 0; linea[i] != '\0'; i++) {
            if (linea[i] == 'O') {
                suma += 10 * acumulador;
                acumulador++;
            } else {
                acumulador = 1;
            }
        }
        printf("%d\n", suma);
    }
    
}