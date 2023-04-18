.class final Lzg/f$e;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzg/f;-><init>(Lyg/g;Lmg/m;Lch/g;Lmg/e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Ljava/util/List<",
        "+",
        "Lch/a;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic k:Lzg/f;


# direct methods
.method constructor <init>(Lzg/f;)V
    .locals 0

    iput-object p1, p0, Lzg/f$e;->k:Lzg/f;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lzg/f$e;->invoke()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lch/a;",
            ">;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lzg/f$e;->k:Lzg/f;

    invoke-static {v0}, Lth/c;->k(Lmg/h;)Llh/b;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lzg/f$e;->k:Lzg/f;

    invoke-virtual {v1}, Lzg/f;->R0()Lyg/g;

    move-result-object v1

    invoke-virtual {v1}, Lyg/g;->a()Lyg/b;

    move-result-object v1

    invoke-virtual {v1}, Lyg/b;->f()Lvg/u;

    move-result-object v1

    invoke-interface {v1, v0}, Lvg/u;->a(Llh/b;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method
