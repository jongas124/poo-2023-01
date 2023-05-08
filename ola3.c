#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct Noh{
    int no;
    struct Noh *esq;
    struct Noh *dir;
}noh;

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

void limpa_arvore(noh *raiz){
    if(raiz!=NULL){
        limpa_arvore(raiz->esq);
        limpa_arvore(raiz->dir);
        free(raiz);
    }
}

void imprime_posordem(noh *raiz, char veti[]){
    if(raiz!=NULL){
        imprime_posordem(raiz->esq, veti);
        imprime_posordem(raiz->dir, veti);
        printf("%c",veti[raiz->no]);
    }
}

int main(){
    noh *raiz;
    raiz = NULL;
    int n, vetn, posi, i, j, k;
    char *vetp, *veti;
    scanf("%d",&n);
    for(i=0;i<n;i++){
        scanf("%d", &vetn);
        vetp = malloc((vetn+1) * sizeof(char));
        veti = malloc((vetn+1) * sizeof(char));
        scanf("%s", vetp);
        scanf("%s", veti);
        for(j=0;j<vetn;j++){
            for(k=0;k<vetn;k++){
                if(vetp[j]==veti[k]){
                    insere_noh(&raiz, k);
                    break;
                }
            }
        }
        imprime_posordem(raiz, veti);
        printf("\n");
        limpa_arvore(raiz);
        free(veti);
        free(vetp);
        raiz = NULL;
    }
    return 0;
}