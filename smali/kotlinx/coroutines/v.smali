.class public final Lkotlinx/coroutines/v;
.super Lkotlinx/coroutines/v1;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/u;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u000c\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0013\u0010\u0006\u001a\u00020\u00052\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\u0010\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\u000c\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0013"
    }
    d2 = {
        "Lkotlinx/coroutines/v;",
        "Lkotlinx/coroutines/v1;",
        "Lkotlinx/coroutines/u;",
        "",
        "cause",
        "",
        "W",
        "",
        "k",
        "Lkotlinx/coroutines/w;",
        "o",
        "Lkotlinx/coroutines/w;",
        "childJob",
        "Lkotlinx/coroutines/Job;",
        "getParent",
        "()Lkotlinx/coroutines/Job;",
        "parent",
        "<init>",
        "(Lkotlinx/coroutines/w;)V",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field public final o:Lkotlinx/coroutines/w;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/w;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lkotlinx/coroutines/v1;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lkotlinx/coroutines/v;->o:Lkotlinx/coroutines/w;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
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


# virtual methods
.method public W(Ljava/lang/Throwable;)V
    .locals 1

    iget-object p1, p0, Lkotlinx/coroutines/v;->o:Lkotlinx/coroutines/w;

    invoke-virtual {p0}, Lkotlinx/coroutines/a2;->X()Lkotlinx/coroutines/b2;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlinx/coroutines/w;->Q(Lkotlinx/coroutines/j2;)V

    return-void
.end method

.method public getParent()Lkotlinx/coroutines/Job;
    .locals 1

    invoke-virtual {p0}, Lkotlinx/coroutines/a2;->X()Lkotlinx/coroutines/b2;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lkotlinx/coroutines/v;->W(Ljava/lang/Throwable;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public k(Ljava/lang/Throwable;)Z
    .locals 1

    invoke-virtual {p0}, Lkotlinx/coroutines/a2;->X()Lkotlinx/coroutines/b2;

    move-result-object v0

    invoke-virtual {v0, p1}, Lkotlinx/coroutines/b2;->N(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method
