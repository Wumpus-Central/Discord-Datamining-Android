.class public interface abstract Lkotlinx/coroutines/Job;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/coroutines/CoroutineContext$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlinx/coroutines/Job$b;,
        Lkotlinx/coroutines/Job$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008f\u0018\u0000  2\u00020\u0001:\u0001\u0017J\u000c\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\'J\u0008\u0010\u0006\u001a\u00020\u0005H&J\u001a\u0010\t\u001a\u00020\u00082\u0010\u0008\u0002\u0010\u0007\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003H&J\u0010\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\'J\"\u0010\u0013\u001a\u00020\u00122\u0018\u0010\u0011\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00080\u000ej\u0002`\u0010H&J6\u0010\u0016\u001a\u00020\u00122\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00052\u0018\u0010\u0011\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00080\u000ej\u0002`\u0010H\'R\u0014\u0010\u0019\u001a\u00020\u00058&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00058&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u0018R\u001a\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u001c8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\u001e\u00a8\u0006!"
    }
    d2 = {
        "Lkotlinx/coroutines/Job;",
        "Lkotlin/coroutines/CoroutineContext$b;",
        "Ljava/util/concurrent/CancellationException;",
        "Lkotlinx/coroutines/CancellationException;",
        "K",
        "",
        "start",
        "cause",
        "",
        "k",
        "Lkotlinx/coroutines/w;",
        "child",
        "Lkotlinx/coroutines/u;",
        "F0",
        "Lkotlin/Function1;",
        "",
        "Lkotlinx/coroutines/CompletionHandler;",
        "handler",
        "Lkotlinx/coroutines/a1;",
        "g0",
        "onCancelling",
        "invokeImmediately",
        "F",
        "b",
        "()Z",
        "isActive",
        "i",
        "isCompleted",
        "Lkotlin/sequences/Sequence;",
        "x",
        "()Lkotlin/sequences/Sequence;",
        "children",
        "d",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# static fields
.field public static final d:Lkotlinx/coroutines/Job$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lkotlinx/coroutines/Job$b;->k:Lkotlinx/coroutines/Job$b;

    sput-object v0, Lkotlinx/coroutines/Job;->d:Lkotlinx/coroutines/Job$b;

    return-void
.end method


# virtual methods
.method public abstract F(ZZLkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/a1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Throwable;",
            "Lkotlin/Unit;",
            ">;)",
            "Lkotlinx/coroutines/a1;"
        }
    .end annotation
.end method

.method public abstract F0(Lkotlinx/coroutines/w;)Lkotlinx/coroutines/u;
.end method

.method public abstract K()Ljava/util/concurrent/CancellationException;
.end method

.method public abstract b()Z
.end method

.method public abstract g0(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/a1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Throwable;",
            "Lkotlin/Unit;",
            ">;)",
            "Lkotlinx/coroutines/a1;"
        }
    .end annotation
.end method

.method public abstract i()Z
.end method

.method public abstract k(Ljava/util/concurrent/CancellationException;)V
.end method

.method public abstract start()Z
.end method

.method public abstract x()Lkotlin/sequences/Sequence;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/sequences/Sequence<",
            "Lkotlinx/coroutines/Job;",
            ">;"
        }
    .end annotation
.end method
