#include <stdio.h>
#include <stdlib.h>

int compare (const void *a, const void *b) {
    return (*(int *)b - *(int *)a);
}

int main() {
    int libros;
    while (1) {
        if ((scanf("%d", &libros)) == EOF) return 0;
        
        int *arrLibros = (int *)malloc(libros * sizeof(int));
        int i;
        for (i = 0; i < libros; i++) {
            scanf("%d", &arrLibros[i]);
        }

        qsort(arrLibros, libros, sizeof(int), compare);

        int descuento = 0;
        for (i = 2; i < libros; i += 3) {
            descuento += arrLibros[i];
        }
        printf("%d\n", descuento);
        free(arrLibros);
    }
}