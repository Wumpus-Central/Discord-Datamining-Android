.class final Lzg/g$j;
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
.field final synthetic k:Lzg/g;


# direct methods
.method constructor <init>(Lzg/g;)V
    .locals 0

    iput-object p1, p0, Lzg/g$j;->k:Lzg/g;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Llh/f;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lzg/g$j;->k:Lzg/g;

    invoke-static {v0}, Lzg/g;->Q(Lzg/g;)Lch/g;

    move-result-object v0

    invoke-interface {v0}, Lch/g;->J()Ljava/util/Collection;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/h;->H0(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzg/g$j;->a()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
