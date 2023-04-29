.class final Lcom/discord/misc/utilities/backoff/ExponentialBackoff$performBackoff$1;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/misc/utilities/backoff/ExponentialBackoff;->performBackoff(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lkotlin/coroutines/jvm/internal/d;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/e;
    c = "com.discord.misc.utilities.backoff.ExponentialBackoff"
    f = "ExponentialBackoff.kt"
    l = {
        0x3f,
        0x41,
        0x4c,
        0x4d
    }
    m = "performBackoff"
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcom/discord/misc/utilities/backoff/ExponentialBackoff;


# direct methods
.method constructor <init>(Lcom/discord/misc/utilities/backoff/ExponentialBackoff;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/misc/utilities/backoff/ExponentialBackoff;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/discord/misc/utilities/backoff/ExponentialBackoff$performBackoff$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/discord/misc/utilities/backoff/ExponentialBackoff$performBackoff$1;->this$0:Lcom/discord/misc/utilities/backoff/ExponentialBackoff;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/discord/misc/utilities/backoff/ExponentialBackoff$performBackoff$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcom/discord/misc/utilities/backoff/ExponentialBackoff$performBackoff$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/discord/misc/utilities/backoff/ExponentialBackoff$performBackoff$1;->label:I

    iget-object p1, p0, Lcom/discord/misc/utilities/backoff/ExponentialBackoff$performBackoff$1;->this$0:Lcom/discord/misc/utilities/backoff/ExponentialBackoff;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Lcom/discord/misc/utilities/backoff/ExponentialBackoff;->performBackoff(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
