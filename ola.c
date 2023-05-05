#include <stdio.h>
#include <stdlib.h>
typedef struct Noh{
    int no;
    struct Noh *esq;
    struct Noh *dir;
}noh;

noh *cria_noh(int nno);

void insere_noh(noh **raiz, int nno);

void imprime_inordem(noh *raiz);

void imprime_preordem(noh *raiz);

void imprime_posordem(noh *raiz);

void limpa_arvore(noh *raiz);

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
        printf("Case %d:", i+1);
        printf("\n");
        printf("Pre.: ");
        imprime_preordem(raiz);
        printf("\n");
        printf("In..: ");
        imprime_inordem(raiz);
        printf("\n");
        printf("Post: ");
        imprime_posordem(raiz);
        printf("\n");
        printf("\n");
        limpa_arvore(raiz);
        raiz = NULL;
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
    if(raiz!=NULL && nno < (*raiz)->no){
        insere_noh(&((*raiz)->esq), nno);
    }
    if(raiz!=NULL && nno > (*raiz)->no){
        insere_noh(&((*raiz)->dir), nno);
    }
}

void imprime_preordem(noh *raiz){
    if(raiz!=NULL){
        printf("%d ",raiz->no);
        imprime_preordem(raiz->esq);
        imprime_preordem(raiz->dir);
    }
}

void imprime_inordem(noh *raiz){
    if(raiz!=NULL){
        imprime_inordem(raiz->esq);
        printf("%d ",raiz->no);
        imprime_inordem(raiz->dir);
    }
}

void imprime_posordem(noh *raiz){
    if(raiz!=NULL){
        imprime_posordem(raiz->esq);
        imprime_posordem(raiz->dir);
        printf("%d ",raiz->no);
    }
}

void limpa_arvore(noh *raiz){
    if(raiz!=NULL){
        limpa_arvore(raiz->esq);
        limpa_arvore(raiz->dir);
        free(raiz);
    }
}

