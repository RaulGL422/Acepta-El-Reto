#include <stdio.h>
#include <stdbool.h>

bool esCapicua(int numero);
int invertir(int numero);

bool esCapicua(int numero) {
    int invertido = invertir(numero);
    return invertido == numero;
}

int invertir(int numero) {
    int invertido = 0;
    while (numero > 0) {
        invertido = invertido * 10 + (numero % 10);
        numero /= 10;
    }
    return invertido;
}

int main() {
    int casos;
    scanf("%d", &casos);
    while (casos--) {
        long numero;
        scanf("%d", &numero);
        int iteraciones = 0;
        while (true) {
            numero = numero + invertir(numero);
            iteraciones++;
            if (numero >= 1000000000 || esCapicua(numero)) {
                break;
            }
        }
        if (numero >= 1000000000) {
            printf("Lychrel?\n");
        } else {
            printf("%d %d\n", iteraciones, numero);
        }
    }
}