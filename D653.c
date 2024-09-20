#include <stdio.h>

int transladarValores(int arrSegundos[]);
int main()
{
    while (1)
    {
        int hectometros;
        scanf("%d", &hectometros);
        if (hectometros == 0)
            return 0;

        int segundos = 0, menorTiempo = 0;
        int menorSegundos;

        int arrSegundos[10];
        int i;
        // Pilla el primer kilometro
        for (i = 0; i < 10; i++)
        {
            scanf("%d", &arrSegundos[i]);
            segundos += arrSegundos[i];
        }
        menorSegundos = segundos;
        for (i = 1; i <= hectometros - 10; i++)
        {
            segundos -= arrSegundos[0];
            transladarValores(arrSegundos);
            scanf("%d", &arrSegundos[9]);
            segundos += arrSegundos[9];
            if (segundos <= menorSegundos)
            {
                menorTiempo = i;
                menorSegundos = segundos;
            }
        }
        printf("%d-%d %d:%02d\n", menorTiempo * 100, (menorTiempo + 10) * 100, menorSegundos / 60, menorSegundos % 60);
    }
}

int transladarValores(int arrSegundos[])
{
    int i;
    for (i = 0; i < 9; i++)
    {
        arrSegundos[i] = arrSegundos[i + 1];
    }
    
    return arrSegundos;
}
