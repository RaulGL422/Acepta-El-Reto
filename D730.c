#include <stdio.h>

long countBit(long);

long countBit(long num) {
    int count = 0;
    while (num) {
        count += num & 1;
        num >>= 1;
    }
    return count;
}

int main() {
    long casos;
    scanf("%d", &casos);
    while (casos--) {
        long num;
        scanf("%d", &num);
        printf("%d\n", countBit(num));
    }
}