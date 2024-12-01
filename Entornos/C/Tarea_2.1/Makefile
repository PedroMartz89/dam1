CFLAGS = -g -Wall
TARGET = programa
OBJETIVOS = principal.o libreria.o

programa: compilar_a compilar_b
	gcc $(CFLAGS) $(OBJETIVOS) -o $@

compilar_a: libreria.c
	gcc -c $<

compilar_b: principal.c
	gcc -c $<

.PHONY:limpiar

limpiar:
	rm $(OBJETIVOS)
	
borrartodo:
	ram $(OBJETIVOS) $(TARGET)