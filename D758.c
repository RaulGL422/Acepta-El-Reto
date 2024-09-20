#include <stdio.h>

int main() {
    int casos;
    scanf("%d", &casos);
    while (casos--) {
        int n;
        scanf("%d", &n);
        int negras = ((n - 1) * 2 - 1) + n * 4 - 6;
        int blancas = n * n - negras;
        printf("%d %d\n", negras, blancas);
    }
}