.class final Lzg/j$h;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzg/j;-><init>(Lyg/g;Lzg/j;)V
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
.field final synthetic k:Lzg/j;


# direct methods
.method constructor <init>(Lzg/j;)V
    .locals 0

    iput-object p1, p0, Lzg/j$h;->k:Lzg/j;

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

    iget-object v0, p0, Lzg/j$h;->k:Lzg/j;

    sget-object v1, Lwh/d;->v:Lwh/d;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lzg/j;->n(Lwh/d;Lkotlin/jvm/functions/Function1;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzg/j$h;->a()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
