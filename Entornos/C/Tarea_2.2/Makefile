EXEC = programa

SRCS = entrada.c factorial.c imprime.c main.c

OBJS = entrada.o factorial.o imprime.o main.o

CFLAGS = -g -Wall

CC = cc


$(EXEC): $(OBJS)
	$(CC) $(CFLAGS) -o $@ $(OBJS)

%.o: %.c %.h
	$(CC) $(CFLAGS) -c $< -o $@
clean:
	rm -f $(OBJS) $(EXEC)

.PHONY: clean

