#include <stdio.h>
#include <stdbool.h>

int main() {
    int personas, vagones;
    while (true) {
        scanf("%d %d", &personas, &vagones);
        if (personas == 0 && vagones == 0) break;

        int tren[vagones];
        int i;
        for (i = 0; i < vagones; i++) {
            scanf("%d", &tren[i]);
        }

        int li = 0, ld = 0, vi = 0, tamanio;
        int suma = tren[0];

        while (suma < personas && ld < vagones - 1) {
            ld++;
            suma += tren[ld];
        }
        tamanio = ld + 1;

        if (suma >= personas) {
            while (li < vagones - 1) {
                suma -= tren[li];
                li++;
                if (suma >= personas) {
                    tamanio = ld - li + 1;
                    vi = li;
                } else if (ld < vagones - 1) {
                    ld++;
                    suma += tren[ld];
                    if (suma >= personas && tamanio != ld - li + 1) {
                        tamanio = ld - li + 1;
                        vi = li;
                    }
                }

            }
            printf("%d %d\n", tamanio, ++vi);
        } else printf("%s\n", "NO ENTRAN");
        
    }
}