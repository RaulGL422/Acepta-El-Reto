#include <stdio.h>
#include <stdbool.h>
int main() {
    int ancho, alto;

    while (true) {
        scanf("%d %d", &ancho, &alto);
        if (ancho < 0 || alto < 0)
            break;

        int resultado = ancho * 2 + alto * 2;

        printf("%d\n", resultado);
    }
    return 0;
}