.class final Lzg/j$l;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzg/j;->J(Lch/n;)Lmg/u0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Lci/j<",
        "+",
        "Lrh/g<",
        "*>;>;>;"
    }
.end annotation


# instance fields
.field final synthetic k:Lzg/j;

.field final synthetic l:Lch/n;

.field final synthetic m:Lpg/c0;


# direct methods
.method constructor <init>(Lzg/j;Lch/n;Lpg/c0;)V
    .locals 0

    iput-object p1, p0, Lzg/j$l;->k:Lzg/j;

    iput-object p2, p0, Lzg/j$l;->l:Lch/n;

    iput-object p3, p0, Lzg/j$l;->m:Lpg/c0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lci/j;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lci/j<",
            "Lrh/g<",
            "*>;>;"
        }
    .end annotation

    iget-object v0, p0, Lzg/j$l;->k:Lzg/j;

    invoke-virtual {v0}, Lzg/j;->w()Lyg/g;

    move-result-object v0

    invoke-virtual {v0}, Lyg/g;->e()Lci/n;

    move-result-object v0

    new-instance v1, Lzg/j$l$a;

    iget-object v2, p0, Lzg/j$l;->k:Lzg/j;

    iget-object v3, p0, Lzg/j$l;->l:Lch/n;

    iget-object v4, p0, Lzg/j$l;->m:Lpg/c0;

    invoke-direct {v1, v2, v3, v4}, Lzg/j$l$a;-><init>(Lzg/j;Lch/n;Lpg/c0;)V

    invoke-interface {v0, v1}, Lci/n;->f(Lkotlin/jvm/functions/Function0;)Lci/j;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzg/j$l;->a()Lci/j;

    move-result-object v0

    return-object v0
.end method
