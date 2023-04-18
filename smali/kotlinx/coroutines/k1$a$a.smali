.class final Lkotlinx/coroutines/k1$a$a;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlinx/coroutines/k1$a;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/coroutines/CoroutineContext$b;",
        "Lkotlinx/coroutines/k1;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lkotlin/coroutines/CoroutineContext$b;",
        "it",
        "Lkotlinx/coroutines/k1;",
        "a",
        "(Lkotlin/coroutines/CoroutineContext$b;)Lkotlinx/coroutines/k1;"
    }
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# static fields
.field public static final k:Lkotlinx/coroutines/k1$a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkotlinx/coroutines/k1$a$a;

    invoke-direct {v0}, Lkotlinx/coroutines/k1$a$a;-><init>()V

    sput-object v0, Lkotlinx/coroutines/k1$a$a;->k:Lkotlinx/coroutines/k1$a$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lkotlin/coroutines/CoroutineContext$b;)Lkotlinx/coroutines/k1;
    .locals 1

    instance-of v0, p1, Lkotlinx/coroutines/k1;

    if-eqz v0, :cond_0

    check-cast p1, Lkotlinx/coroutines/k1;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/coroutines/CoroutineContext$b;

    invoke-virtual {p0, p1}, Lkotlinx/coroutines/k1$a$a;->a(Lkotlin/coroutines/CoroutineContext$b;)Lkotlinx/coroutines/k1;

    move-result-object p1

    return-object p1
.end method
