.class final Lkotlinx/coroutines/internal/h0$c;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlinx/coroutines/internal/h0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/internal/k0;",
        "Lkotlin/coroutines/CoroutineContext$b;",
        "Lkotlinx/coroutines/internal/k0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lkotlinx/coroutines/internal/k0;",
        "state",
        "Lkotlin/coroutines/CoroutineContext$b;",
        "element",
        "a",
        "(Lkotlinx/coroutines/internal/k0;Lkotlin/coroutines/CoroutineContext$b;)Lkotlinx/coroutines/internal/k0;"
    }
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# static fields
.field public static final k:Lkotlinx/coroutines/internal/h0$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkotlinx/coroutines/internal/h0$c;

    invoke-direct {v0}, Lkotlinx/coroutines/internal/h0$c;-><init>()V

    sput-object v0, Lkotlinx/coroutines/internal/h0$c;->k:Lkotlinx/coroutines/internal/h0$c;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lkotlinx/coroutines/internal/k0;Lkotlin/coroutines/CoroutineContext$b;)Lkotlinx/coroutines/internal/k0;
    .locals 1

    .line 1
    instance-of v0, p2, Lkotlinx/coroutines/q2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p2, Lkotlinx/coroutines/q2;

    .line 6
    .line 7
    iget-object v0, p1, Lkotlinx/coroutines/internal/k0;->a:Lkotlin/coroutines/CoroutineContext;

    .line 8
    .line 9
    invoke-interface {p2, v0}, Lkotlinx/coroutines/q2;->B0(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p1, p2, v0}, Lkotlinx/coroutines/internal/k0;->a(Lkotlinx/coroutines/q2;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-object p1
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
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/internal/k0;

    check-cast p2, Lkotlin/coroutines/CoroutineContext$b;

    invoke-virtual {p0, p1, p2}, Lkotlinx/coroutines/internal/h0$c;->a(Lkotlinx/coroutines/internal/k0;Lkotlin/coroutines/CoroutineContext$b;)Lkotlinx/coroutines/internal/k0;

    move-result-object p1

    return-object p1
.end method
