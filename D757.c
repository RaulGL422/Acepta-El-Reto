#include <stdio.h>

int main() {
    int casos;
    scanf("%d", &casos);
    while (casos--) {
       char lin[1000];
       scanf("%s", lin);
       int max = 0;
       int contador = 0;
       int i = 0;
       char c;
       while ((c = lin[i]) != '\0') {
        if (c == 'T') contador++;
        else contador = 0;

        if (contador > max) {
            max = contador;
        }
        i++;
       }
       printf("%d\n", max);
    }
}