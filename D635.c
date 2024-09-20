#include <stdio.h>

int main() {
    int casos;
    scanf("%d", &casos);
    while (casos--) {
        int anio;
        scanf("%d", &anio);
        printf("%d\n", anio % 100 > 0 ? anio / 100 + 1 : anio / 100);
    }
}