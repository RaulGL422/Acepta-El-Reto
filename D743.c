#include <stdio.h>
#include <stdbool.h>

int main() {
    while (true) {
        int documentos;
        scanf("%d", &documentos);
        if (documentos == 0) {
            break;
        }
        int ahorradas = 0;
        while (documentos--) {
            int paginas;
            scanf("%d", &paginas);
            ahorradas += paginas / 2;
        }
        printf("%d\n", ahorradas);
    }
}