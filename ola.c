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
    noh *raiz;
    raiz = NULL;
    int n, qno, vno, i, j;
    scanf("%d", &n);
    for(i=0;i<n;i++){
        scanf("%d",&qno);
        for(j=0;j<qno;j++){
            scanf("%d",&vno);
            insere_noh(&raiz, vno);
        }
        imprime_inordem(&raiz);
    }
 return 0;
}

noh *cria_noh(int nno){
    noh *new;
    new = malloc(sizeof(noh));
    new->no = nno;
    new->esq = NULL;
    new->dir = NULL;
    return new;
}

void insere_noh(noh **raiz, int nno){
    if(*raiz == NULL){                                                                                      
        *raiz = cria_noh(nno);
    }
    if(raiz!=NULL && (*raiz)->no < nno){
        insere_noh(&((*raiz)->esq), nno);
    }
    if(raiz!=NULL && (*raiz)->no < nno){
        insere_noh(&((*raiz)->dir), nno);
    }
}

void imprime_inordem(noh **raiz){
    if((*raiz)->esq!=NULL){
        imprime_inordem(&((*raiz)->esq));
    }
    printf("%d ",(*raiz)->no);
    if((*raiz)->dir!=NULL){
        imprime_inordem(&((*raiz)->dir));
    }
}