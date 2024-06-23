#include <stdio.h>
#include <stdbool.h>
int main()
{
    int casos;
    scanf("%d", &casos);
    while (casos--)
    {
        int contador = 5;
        float suma = 0;
        bool cero = false;
        bool nueve = false;

        while (contador--)
        {
            float nota;
            scanf("%f", &nota); 
            if (nota == 0.0) {
                cero = true;
            } else if (nota >= 9.0) {
                nueve = true;
            }
        }
        if (cero && !nueve) {
            printf("SUSPENSO DIRECTO\n");
        } else {
            printf("MEDIA\n");
        }
        


    }
    
    return 0;
}
