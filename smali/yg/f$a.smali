.class final Lyg/f$a;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyg/f;->e(Llh/c;)Lzg/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Lzg/h;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic k:Lyg/f;

.field final synthetic l:Lch/u;


# direct methods
.method constructor <init>(Lyg/f;Lch/u;)V
    .locals 0

    iput-object p1, p0, Lyg/f$a;->k:Lyg/f;

    iput-object p2, p0, Lyg/f$a;->l:Lch/u;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lzg/h;
    .locals 3

    new-instance v0, Lzg/h;

    iget-object v1, p0, Lyg/f$a;->k:Lyg/f;

    invoke-static {v1}, Lyg/f;->d(Lyg/f;)Lyg/g;

    move-result-object v1

    iget-object v2, p0, Lyg/f$a;->l:Lch/u;

    invoke-direct {v0, v1, v2}, Lzg/h;-><init>(Lyg/g;Lch/u;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lyg/f$a;->a()Lzg/h;

    move-result-object v0

    return-object v0
.end method
