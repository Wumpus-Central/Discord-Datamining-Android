.class final Lzg/i$d;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzg/i;-><init>(Lyg/g;Lch/u;Lzg/h;)V
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
        "Ljava/lang/String;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic k:Lyg/g;

.field final synthetic l:Lzg/i;


# direct methods
.method constructor <init>(Lyg/g;Lzg/i;)V
    .locals 0

    iput-object p1, p0, Lzg/i$d;->k:Lyg/g;

    iput-object p2, p0, Lzg/i$d;->l:Lzg/i;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lzg/i$d;->k:Lyg/g;

    invoke-virtual {v0}, Lyg/g;->a()Lyg/b;

    move-result-object v0

    invoke-virtual {v0}, Lyg/b;->d()Lvg/p;

    move-result-object v0

    iget-object v1, p0, Lzg/i$d;->l:Lzg/i;

    invoke-virtual {v1}, Lzg/i;->Q()Lzg/h;

    move-result-object v1

    invoke-virtual {v1}, Lpg/z;->d()Llh/c;

    move-result-object v1

    invoke-interface {v0, v1}, Lvg/p;->a(Llh/c;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzg/i$d;->a()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
