.class Lpg/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpg/e;-><init>(Lci/n;Lmg/m;Lng/g;Llh/f;Ldi/w1;ZILmg/a1;Lmg/d1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function0<",
        "Ldi/g1;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic k:Lci/n;

.field final synthetic l:Lmg/d1;

.field final synthetic m:Lpg/e;


# direct methods
.method constructor <init>(Lpg/e;Lci/n;Lmg/d1;)V
    .locals 0

    iput-object p1, p0, Lpg/e$a;->m:Lpg/e;

    iput-object p2, p0, Lpg/e$a;->k:Lci/n;

    iput-object p3, p0, Lpg/e$a;->l:Lmg/d1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ldi/g1;
    .locals 4

    new-instance v0, Lpg/e$c;

    iget-object v1, p0, Lpg/e$a;->m:Lpg/e;

    iget-object v2, p0, Lpg/e$a;->k:Lci/n;

    iget-object v3, p0, Lpg/e$a;->l:Lmg/d1;

    invoke-direct {v0, v1, v2, v3}, Lpg/e$c;-><init>(Lpg/e;Lci/n;Lmg/d1;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lpg/e$a;->a()Ldi/g1;

    move-result-object v0

    return-object v0
.end method
