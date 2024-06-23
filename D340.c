#include <stdio.h>
int fast_read();
void fast_write(int number);

// Función para lectura rápida de enteros
inline int fast_read() {
    int number = 0;
    int c = getchar();  // Lee el primer carácter
    // Ignora los caracteres no numéricos
    while (c < '0' || c > '9') {
        c = getchar();
    }
    // Construye el número
    while (c >= '0' && c <= '9') {
        number = number * 10 + c - '0';
        c = getchar();
    }
    return number;
}

// Función para escritura rápida de enteros
void fast_write(int number) {
    if (number == 0) {
        putchar('0');
        putchar('\n');
        return;
    }
    char buffer[12]; // Buffer para el número convertido a cadena
    int index = 0;
    while (number > 0) {
        buffer[index++] = (number % 10) + '0';
        number /= 10;
    }
    // Escribe el número en orden inverso
    while (index > 0) {
        putchar(buffer[--index]);
    }
    putchar('\n');
}

int main() {
    int casos = fast_read(); // Lectura rápida del número de casos
    
    while (casos--) {
        int h = fast_read();
        int v = fast_read();
        
        // Optimización del cálculo
        int resultado = 2 * h * v + h + v;
        
        // Escritura rápida del resultado
        fast_write(resultado);
    }

    return 0;
}
