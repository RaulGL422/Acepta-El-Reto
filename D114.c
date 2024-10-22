#include <stdio.h>

int main() {
    int casos;
    scanf("%d", &casos);
    int num;
    while (casos--) {
        scanf("%d", &num);
        printf("%d\n", num >= 5 ? 0 : num == 3 ? 6 : num == 0 ? 1 : num);
    }
    return 0;
}