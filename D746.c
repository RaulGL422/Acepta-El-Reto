#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int compare(const void *a, const void *b) {
    return (*(int *)a - *(int *)b);
}

int main() {
    while (true) {
        int guirnaldas, distancia;
        scanf("%d %d", &guirnaldas, &distancia);
        if (guirnaldas == 0 && distancia == 0) {
            break;
        }
        int i = 0;
        int *arrGuirnaldas = (int *)malloc(guirnaldas * sizeof(int));
        for (i = 0; i < guirnaldas; i++)
        {
            scanf("%d", &arrGuirnaldas[i]);
        }
        qsort(arrGuirnaldas, guirnaldas, sizeof(int), compare);

        int parejas = 0;
        int left = 0;
        int right = guirnaldas - 1;

        while (left < right) {
            int sum = arrGuirnaldas[left] + arrGuirnaldas[right];
            if (sum == distancia) {
                parejas++;
                left++;
                right--;
            } else if (sum < distancia) {
                left++;
            } else {
                right--;
            }
        }
        printf("%d\n", parejas);
        free(arrGuirnaldas);
    }
    return 0;
}