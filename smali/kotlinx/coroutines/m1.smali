.class public final Lkotlinx/coroutines/m1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003*\u000c\u0008\u0007\u0010\u0004\"\u00020\u00012\u00020\u0001\u00a8\u0006\u0005"
    }
    d2 = {
        "Ljava/util/concurrent/ExecutorService;",
        "Lkotlinx/coroutines/k1;",
        "a",
        "(Ljava/util/concurrent/ExecutorService;)Lkotlinx/coroutines/k1;",
        "CloseableCoroutineDispatcher",
        "kotlinx-coroutines-core"
    }
    k = 0x2
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# direct methods
.method public static final a(Ljava/util/concurrent/ExecutorService;)Lkotlinx/coroutines/k1;
    .locals 1

    new-instance v0, Lkotlinx/coroutines/l1;

    invoke-direct {v0, p0}, Lkotlinx/coroutines/l1;-><init>(Ljava/util/concurrent/Executor;)V

    return-object v0
.end method
