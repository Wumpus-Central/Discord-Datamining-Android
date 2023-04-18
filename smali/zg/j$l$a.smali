.class final Lzg/j$l$a;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzg/j$l;->a()Lci/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Lrh/g<",
        "*>;>;"
    }
.end annotation


# instance fields
.field final synthetic k:Lzg/j;

.field final synthetic l:Lch/n;

.field final synthetic m:Lpg/c0;


# direct methods
.method constructor <init>(Lzg/j;Lch/n;Lpg/c0;)V
    .locals 0

    iput-object p1, p0, Lzg/j$l$a;->k:Lzg/j;

    iput-object p2, p0, Lzg/j$l$a;->l:Lch/n;

    iput-object p3, p0, Lzg/j$l$a;->m:Lpg/c0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lrh/g;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lrh/g<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lzg/j$l$a;->k:Lzg/j;

    invoke-virtual {v0}, Lzg/j;->w()Lyg/g;

    move-result-object v0

    invoke-virtual {v0}, Lyg/g;->a()Lyg/b;

    move-result-object v0

    invoke-virtual {v0}, Lyg/b;->g()Lwg/f;

    move-result-object v0

    iget-object v1, p0, Lzg/j$l$a;->l:Lch/n;

    iget-object v2, p0, Lzg/j$l$a;->m:Lpg/c0;

    invoke-interface {v0, v1, v2}, Lwg/f;->a(Lch/n;Lmg/u0;)Lrh/g;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzg/j$l$a;->a()Lrh/g;

    move-result-object v0

    return-object v0
.end method
