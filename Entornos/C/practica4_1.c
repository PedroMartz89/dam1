

int main() {
    // Código del programa
    int i, j, aux;
    int numeros[10];
    
    printf("Inicio del programa\n");

    // Pedir los números 
    for(i = 0; i < 10; i++) {
        printf("Introduce el %d numero: ", (i + 1)); // Mostrar i+1, pero no incrementarlo
        scanf("%d", &numeros[i]);
    }
    printf("\n");

    // Mostrar los números sin ordenar
    printf("Números sin ordenar: ");
    for(i = 0; i < 10; i++) {
        printf("%d ", numeros[i]);
    }
    printf("\n");

    // Ordenar números con algoritmo burbuja
    for (i = 0; i < 10; i++) {
        for(j = i + 1; j < 10; j++) {
            if (numeros[j] < numeros[i]) {
                aux = numeros[i];
                numeros[i] = numeros[j];
                numeros[j] = aux;
            }
        }
    }

    // Mostrar números ordenados
    printf("Números ordenados: ");
    for(i = 0; i < 10; i++) {
        printf("%d ", numeros[i]);
    }

    printf("\nFin del programa\n");
}
