#include <stdio.h>
#include <string.h>

int main() {
    printf("Inicio del programa\n");
    char texto[1000];

//Leer texto por teclado

    printf ("Introduce un string: ");
    fgets(texto, 1000, stdin);

    printf("El texto es: %s", texto);

//Contar las palabras
    int i;
    int contador = 0;

    for (i = 0; texto[i] != '\0'; i++) {
        if(texto[i] == ' ') {
            contador++;
        }
    }

//Mostrar cantidad de palabras
    printf("Cantidad de palabras: %d\n", contador+1);

//Mostrar palabras en lineas distintas
    for (i = 0; texto[i] != '\0'; i++) {
        if(texto[i] == ' ') {
            printf("\n");
        } else {
            printf("%c", texto[i]);
        }
    }
    printf("Fin del programa");
    return 0;
}

