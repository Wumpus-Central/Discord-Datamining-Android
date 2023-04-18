.class final Lzg/e$b;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzg/e;-><init>(Lyg/g;Lch/a;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Llh/c;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic k:Lzg/e;


# direct methods
.method constructor <init>(Lzg/e;)V
    .locals 0

    iput-object p1, p0, Lzg/e$b;->k:Lzg/e;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Llh/c;
    .locals 1

    iget-object v0, p0, Lzg/e$b;->k:Lzg/e;

    invoke-static {v0}, Lzg/e;->e(Lzg/e;)Lch/a;

    move-result-object v0

    invoke-interface {v0}, Lch/a;->f()Llh/b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Llh/b;->b()Llh/c;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzg/e$b;->a()Llh/c;

    move-result-object v0

    return-object v0
.end method
