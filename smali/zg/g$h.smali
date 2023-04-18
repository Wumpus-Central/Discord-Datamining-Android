.class final Lzg/g$h;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzg/g;-><init>(Lyg/g;Lmg/e;Lch/g;ZLzg/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Ljava/util/Set<",
        "+",
        "Llh/f;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic k:Lyg/g;

.field final synthetic l:Lzg/g;


# direct methods
.method constructor <init>(Lyg/g;Lzg/g;)V
    .locals 0

    iput-object p1, p0, Lzg/g$h;->k:Lyg/g;

    iput-object p2, p0, Lzg/g$h;->l:Lzg/g;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Llh/f;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lzg/g$h;->k:Lyg/g;

    iget-object v1, p0, Lzg/g$h;->l:Lzg/g;

    invoke-virtual {v0}, Lyg/g;->a()Lyg/b;

    move-result-object v2

    invoke-virtual {v2}, Lyg/b;->w()Luh/f;

    move-result-object v2

    invoke-virtual {v1}, Lzg/g;->z0()Lmg/e;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Luh/f;->b(Lyg/g;Lmg/e;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/h;->H0(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzg/g$h;->a()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
