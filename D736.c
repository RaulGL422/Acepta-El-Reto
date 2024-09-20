#include <stdio.h>

int main() {
    int casos;
    scanf("%d", &casos);
    while (casos--) {
        int total, saltos;
        scanf("%d %d", &total, &saltos);
        printf("%d\n", (total + saltos - 1) / saltos);
    }
}