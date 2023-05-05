#include <stdio.h>
#include <stdlib.h>
typedef struct Noh{
    int no;
    struct Noh *esq;
    struct Noh *dir;
}noh;

noh *cria_noh(int nno);

void insere_noh(noh **raiz, int nno);

void obtem_horizontal(noh *raiz, int pre[], int nivel[], int *pv, int nivela);

int encontra_maior(int vet[], int tama);

void imprime_horizontal(int pre[], int nivel[], int hor[], int tam);

void limpa_arvore(noh *raiz);

int main(){
    noh *raiz;
    raiz = NULL;
    int n, qno, vno, i, j,*pre, *nivel, *hor, nivela = -1, pv = 0;
    scanf("%d", &n);
    for(i=0;i<n;i++){
        scanf("%d",&qno);
        for(j=0;j<qno;j++){
            scanf("%d",&vno);
            insere_noh(&raiz, vno);
        }
        pre = malloc(qno * sizeof(int));
        nivel = malloc(qno * sizeof(int));
        hor  = malloc(qno * sizeof(int));
        printf("Case %d:", i+1);
        printf("\n");
        obtem_horizontal(raiz, pre, nivel, &pv, nivela);
        imprime_horizontal(pre, nivel, qno);
        limpa_arvore(raiz);
        free(pre);
        free(nivel);
        free(hor);
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

void obtem_horizontal(noh *raiz, int pre[], int nivel[], int *pv, int nivela){
    nivela++;
    if(raiz!=NULL){
        pre[*pv] = raiz->no;
        nivel[*pv] = nivela;
        *pv = (*pv) + 1;
        printf("%d\n",pv);
        obtem_horizontal(raiz->esq, pre, nivel, pv, nivela);
        obtem_horizontal(raiz->dir, pre, nivel, pv, nivela);
        nivela--;
    }
    if(raiz==NULL){
        nivela--;
    }
}

int encontra_maior(int vet[], int tama){
    int i, ma;
    for(i=0;i<tama;i++){
        

    }
}

void imprime_horizontal(int pre[], int nivel[], int hor[], int tam){
    int i, j;
    hor[0] = pre[0];
    for(i=1;i<tam;i++){
        for(j=1;j<)
    }
}

void limpa_arvore(noh *raiz){
    if(raiz!=NULL){
        limpa_arvore(raiz->esq);
        limpa_arvore(raiz->dir);
        free(raiz);
    }
}

