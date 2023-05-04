#include <stdio.h>
#include <stdlib.h>
typedef struct Noh{
    int no;
    struct Noh *esq;
    struct Noh *dir;
}noh;

noh *cria_noh(int nno);

void insere_noh(noh **raiz, int nno);

void imprime_inordem(noh **raiz);

int main(){
    printf("ola\n");
    return 0;
}