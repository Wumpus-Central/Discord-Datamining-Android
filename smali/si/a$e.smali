.class public final Lsi/a$e;
.super Lkotlinx/coroutines/internal/p$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsi/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1c
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lkotlinx/coroutines/internal/p$d<",
        "Lsi/w;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0004\u0018\u0000*\u0004\u0008\u0001\u0010\u00012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\u0008\u0012\u0004\u0012\u00020\u0003`\u0004B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0012\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J\u0016\u0010\u000c\u001a\u0004\u0018\u00010\u00072\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a8\u0006\u0013"
    }
    d2 = {
        "Lsi/a$e;",
        "E",
        "Lkotlinx/coroutines/internal/p$d;",
        "Lsi/w;",
        "Lkotlinx/coroutines/internal/RemoveFirstDesc;",
        "Lkotlinx/coroutines/internal/p;",
        "affected",
        "",
        "e",
        "Lkotlinx/coroutines/internal/p$c;",
        "Lkotlinx/coroutines/internal/PrepareOp;",
        "prepareOp",
        "j",
        "",
        "k",
        "Lkotlinx/coroutines/internal/n;",
        "queue",
        "<init>",
        "(Lkotlinx/coroutines/internal/n;)V",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/internal/n;)V
    .locals 0

    invoke-direct {p0, p1}, Lkotlinx/coroutines/internal/p$d;-><init>(Lkotlinx/coroutines/internal/p;)V

    return-void
.end method


# virtual methods
.method protected e(Lkotlinx/coroutines/internal/p;)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of v0, p1, Lsi/l;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    instance-of p1, p1, Lsi/w;

    .line 7
    .line 8
    if-nez p1, :cond_1

    .line 9
    .line 10
    sget-object p1, Lsi/b;->d:Lkotlinx/coroutines/internal/d0;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_1
    const/4 p1, 0x0

    .line 14
    :goto_0
    return-object p1
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public j(Lkotlinx/coroutines/internal/p$c;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p1, Lkotlinx/coroutines/internal/p$c;->a:Lkotlinx/coroutines/internal/p;

    .line 2
    .line 3
    check-cast v0, Lsi/w;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lsi/w;->Z(Lkotlinx/coroutines/internal/p$c;)Lkotlinx/coroutines/internal/d0;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    sget-object p1, Lkotlinx/coroutines/internal/q;->a:Ljava/lang/Object;

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    sget-object v0, Lkotlinx/coroutines/internal/c;->b:Ljava/lang/Object;

    .line 15
    .line 16
    if-ne p1, v0, :cond_1

    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_1
    const/4 p1, 0x0

    .line 20
    return-object p1
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public k(Lkotlinx/coroutines/internal/p;)V
    .locals 0

    check-cast p1, Lsi/w;

    invoke-virtual {p1}, Lsi/w;->a0()V

    return-void
.end method
