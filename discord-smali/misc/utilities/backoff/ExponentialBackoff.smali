.class public final Lcom/discord/misc/utilities/backoff/ExponentialBackoff;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\tJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0008\u0010\u0010\u001a\u00020\u000fH\u0002J,\u0010\u0011\u001a\u00020\u000f2\u001c\u0010\u0012\u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000f0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015JY\u0010\u0016\u001a\u0002H\u0017\"\u0004\u0008\u0000\u0010\u00172\u001c\u0010\u0018\u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002H\u00170\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00132\"\u0010\u0019\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u0002H\u0017\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001b0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001aH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u0008\u0010\u001d\u001a\u00020\u000fH\u0002J\u0006\u0010\u001e\u001a\u00020\u000fR\u000e\u0010\n\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000c\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/discord/misc/utilities/backoff/ExponentialBackoff;",
        "",
        "scope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "initialDelay",
        "",
        "maxDelay",
        "maxAttempts",
        "",
        "(Lkotlinx/coroutines/CoroutineScope;JJI)V",
        "currentAttempt",
        "currentDelay",
        "job",
        "Lkotlinx/coroutines/Job;",
        "cancel",
        "",
        "cancelCurrentJob",
        "fail",
        "action",
        "Lkotlin/Function1;",
        "Lkotlin/coroutines/Continuation;",
        "(Lkotlin/jvm/functions/Function1;)V",
        "performBackoff",
        "T",
        "networkRequest",
        "shouldRetry",
        "Lkotlin/Function2;",
        "",
        "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "reset",
        "succeed",
        "misc_utilities_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private currentAttempt:I

.field private currentDelay:J

.field private final initialDelay:J

.field private job:Lkotlinx/coroutines/Job;

.field private final maxAttempts:I

.field private final maxDelay:J

.field private final scope:Lkotlinx/coroutines/CoroutineScope;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/CoroutineScope;JJI)V
    .locals 1

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/discord/misc/utilities/backoff/ExponentialBackoff;->scope:Lkotlinx/coroutines/CoroutineScope;

    .line 3
    iput-wide p2, p0, Lcom/discord/misc/utilities/backoff/ExponentialBackoff;->initialDelay:J

    .line 4
    iput-wide p4, p0, Lcom/discord/misc/utilities/backoff/ExponentialBackoff;->maxDelay:J

    .line 5
    iput p6, p0, Lcom/discord/misc/utilities/backoff/ExponentialBackoff;->maxAttempts:I

    const/4 p1, 0x1

    .line 6
    iput p1, p0, Lcom/discord/misc/utilities/backoff/ExponentialBackoff;->currentAttempt:I

    return-void
.end method

.method public synthetic constructor <init>(Lkotlinx/coroutines/CoroutineScope;JJIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_0

    const-wide/16 p2, 0x3e8

    :cond_0
    move-wide v2, p2

    and-int/lit8 p2, p7, 0x4

    if-eqz p2, :cond_1

    const-wide/32 p4, 0x493e0

    :cond_1
    move-wide v4, p4

    and-int/lit8 p2, p7, 0x8

    if-eqz p2, :cond_2

    const/16 p6, 0xa

    :cond_2
    move v6, p6

    move-object v0, p0

    move-object v1, p1

    .line 7
    invoke-direct/range {v0 .. v6}, Lcom/discord/misc/utilities/backoff/ExponentialBackoff;-><init>(Lkotlinx/coroutines/CoroutineScope;JJI)V

    return-void
.end method

.method public static final synthetic access$getCurrentDelay$p(Lcom/discord/misc/utilities/backoff/ExponentialBackoff;)J
    .locals 2

    iget-wide v0, p0, Lcom/discord/misc/utilities/backoff/ExponentialBackoff;->currentDelay:J

    return-wide v0
.end method

.method private final cancelCurrentJob()V
    .locals 3

    iget-object v0, p0, Lcom/discord/misc/utilities/backoff/ExponentialBackoff;->job:Lkotlinx/coroutines/Job;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2}, Lkotlinx/coroutines/Job$a;->a(Lkotlinx/coroutines/Job;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method private final reset()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/discord/misc/utilities/backoff/ExponentialBackoff;->cancelCurrentJob()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    iput-wide v0, p0, Lcom/discord/misc/utilities/backoff/ExponentialBackoff;->currentDelay:J

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    iput v0, p0, Lcom/discord/misc/utilities/backoff/ExponentialBackoff;->currentAttempt:I

    .line 10
    .line 11
    return-void
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
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
.end method


# virtual methods
.method public final cancel()V
    .locals 0

    invoke-direct {p0}, Lcom/discord/misc/utilities/backoff/ExponentialBackoff;->reset()V

    return-void
.end method

.method public final fail(Lkotlin/jvm/functions/Function1;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "action"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/discord/misc/utilities/backoff/ExponentialBackoff;->cancelCurrentJob()V

    .line 7
    .line 8
    .line 9
    iget v0, p0, Lcom/discord/misc/utilities/backoff/ExponentialBackoff;->currentAttempt:I

    .line 10
    .line 11
    iget v1, p0, Lcom/discord/misc/utilities/backoff/ExponentialBackoff;->maxAttempts:I

    .line 12
    .line 13
    if-gt v0, v1, :cond_1

    .line 14
    .line 15
    iget-wide v0, p0, Lcom/discord/misc/utilities/backoff/ExponentialBackoff;->currentDelay:J

    .line 16
    .line 17
    const-wide/16 v2, 0x0

    .line 18
    .line 19
    cmp-long v2, v0, v2

    .line 20
    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    iget-wide v0, p0, Lcom/discord/misc/utilities/backoff/ExponentialBackoff;->initialDelay:J

    .line 24
    .line 25
    const-wide/16 v2, 0x1

    .line 26
    .line 27
    invoke-static {v0, v1, v2, v3}, Leg/h;->d(JJ)J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 v2, 0x2

    .line 33
    int-to-long v2, v2

    .line 34
    mul-long/2addr v0, v2

    .line 35
    :goto_0
    iget-wide v2, p0, Lcom/discord/misc/utilities/backoff/ExponentialBackoff;->maxDelay:J

    .line 36
    .line 37
    invoke-static {v0, v1, v2, v3}, Leg/h;->h(JJ)J

    .line 38
    .line 39
    .line 40
    move-result-wide v0

    .line 41
    iput-wide v0, p0, Lcom/discord/misc/utilities/backoff/ExponentialBackoff;->currentDelay:J

    .line 42
    .line 43
    iget v0, p0, Lcom/discord/misc/utilities/backoff/ExponentialBackoff;->currentAttempt:I

    .line 44
    .line 45
    add-int/lit8 v0, v0, 0x1

    .line 46
    .line 47
    iput v0, p0, Lcom/discord/misc/utilities/backoff/ExponentialBackoff;->currentAttempt:I

    .line 48
    .line 49
    iget-object v1, p0, Lcom/discord/misc/utilities/backoff/ExponentialBackoff;->scope:Lkotlinx/coroutines/CoroutineScope;

    .line 50
    .line 51
    const/4 v2, 0x0

    .line 52
    const/4 v3, 0x0

    .line 53
    new-instance v4, Lcom/discord/misc/utilities/backoff/ExponentialBackoff$fail$1;

    .line 54
    .line 55
    const/4 v0, 0x0

    .line 56
    invoke-direct {v4, p0, p1, v0}, Lcom/discord/misc/utilities/backoff/ExponentialBackoff$fail$1;-><init>(Lcom/discord/misc/utilities/backoff/ExponentialBackoff;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    .line 57
    .line 58
    .line 59
    const/4 v5, 0x3

    .line 60
    const/4 v6, 0x0

    .line 61
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/j;->d(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/l0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    iput-object p1, p0, Lcom/discord/misc/utilities/backoff/ExponentialBackoff;->job:Lkotlinx/coroutines/Job;

    .line 66
    .line 67
    return-void

    .line 68
    :cond_1
    new-instance p1, Lcom/discord/misc/utilities/backoff/MaxAttemptsExceededException;

    .line 69
    .line 70
    invoke-direct {p1}, Lcom/discord/misc/utilities/backoff/MaxAttemptsExceededException;-><init>()V

    .line 71
    .line 72
    .line 73
    throw p1
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
.end method

.method public final performBackoff(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-TT;-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p3, Lcom/discord/misc/utilities/backoff/ExponentialBackoff$performBackoff$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lcom/discord/misc/utilities/backoff/ExponentialBackoff$performBackoff$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/discord/misc/utilities/backoff/ExponentialBackoff$performBackoff$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/discord/misc/utilities/backoff/ExponentialBackoff$performBackoff$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/discord/misc/utilities/backoff/ExponentialBackoff$performBackoff$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lcom/discord/misc/utilities/backoff/ExponentialBackoff$performBackoff$1;-><init>(Lcom/discord/misc/utilities/backoff/ExponentialBackoff;Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lcom/discord/misc/utilities/backoff/ExponentialBackoff$performBackoff$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ltf/b;->d()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/discord/misc/utilities/backoff/ExponentialBackoff$performBackoff$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x4

    .line 34
    const/4 v4, 0x3

    .line 35
    const/4 v5, 0x2

    .line 36
    const/4 v6, 0x1

    .line 37
    if-eqz v2, :cond_6

    .line 38
    .line 39
    if-eq v2, v6, :cond_5

    .line 40
    .line 41
    if-eq v2, v5, :cond_4

    .line 42
    .line 43
    if-eq v2, v4, :cond_3

    .line 44
    .line 45
    if-ne v2, v3, :cond_2

    .line 46
    .line 47
    iget-object p1, v0, Lcom/discord/misc/utilities/backoff/ExponentialBackoff$performBackoff$1;->L$2:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p1, Lkotlin/jvm/functions/Function2;

    .line 50
    .line 51
    iget-object p2, v0, Lcom/discord/misc/utilities/backoff/ExponentialBackoff$performBackoff$1;->L$1:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p2, Lkotlin/jvm/functions/Function1;

    .line 54
    .line 55
    iget-object v2, v0, Lcom/discord/misc/utilities/backoff/ExponentialBackoff$performBackoff$1;->L$0:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v2, Lcom/discord/misc/utilities/backoff/ExponentialBackoff;

    .line 58
    .line 59
    invoke-static {p3}, Lnf/t;->b(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    :cond_1
    move-object v7, v2

    .line 63
    move-object v2, p2

    .line 64
    move-object p2, p1

    .line 65
    goto :goto_2

    .line 66
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 67
    .line 68
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 69
    .line 70
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw p1

    .line 74
    :cond_3
    iget-object p1, v0, Lcom/discord/misc/utilities/backoff/ExponentialBackoff$performBackoff$1;->L$2:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p1, Lkotlin/jvm/functions/Function2;

    .line 77
    .line 78
    iget-object p2, v0, Lcom/discord/misc/utilities/backoff/ExponentialBackoff$performBackoff$1;->L$1:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast p2, Lkotlin/jvm/functions/Function1;

    .line 81
    .line 82
    iget-object v2, v0, Lcom/discord/misc/utilities/backoff/ExponentialBackoff$performBackoff$1;->L$0:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v2, Lcom/discord/misc/utilities/backoff/ExponentialBackoff;

    .line 85
    .line 86
    invoke-static {p3}, Lnf/t;->b(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    goto/16 :goto_5

    .line 90
    .line 91
    :cond_4
    iget-object p1, v0, Lcom/discord/misc/utilities/backoff/ExponentialBackoff$performBackoff$1;->L$3:Ljava/lang/Object;

    .line 92
    .line 93
    iget-object p2, v0, Lcom/discord/misc/utilities/backoff/ExponentialBackoff$performBackoff$1;->L$2:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast p2, Lkotlin/jvm/functions/Function2;

    .line 96
    .line 97
    iget-object v2, v0, Lcom/discord/misc/utilities/backoff/ExponentialBackoff$performBackoff$1;->L$1:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 100
    .line 101
    iget-object v7, v0, Lcom/discord/misc/utilities/backoff/ExponentialBackoff$performBackoff$1;->L$0:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v7, Lcom/discord/misc/utilities/backoff/ExponentialBackoff;

    .line 104
    .line 105
    invoke-static {p3}, Lnf/t;->b(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_5
    iget-object p1, v0, Lcom/discord/misc/utilities/backoff/ExponentialBackoff$performBackoff$1;->L$2:Ljava/lang/Object;

    .line 110
    .line 111
    move-object p2, p1

    .line 112
    check-cast p2, Lkotlin/jvm/functions/Function2;

    .line 113
    .line 114
    iget-object p1, v0, Lcom/discord/misc/utilities/backoff/ExponentialBackoff$performBackoff$1;->L$1:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast p1, Lkotlin/jvm/functions/Function1;

    .line 117
    .line 118
    iget-object v2, v0, Lcom/discord/misc/utilities/backoff/ExponentialBackoff$performBackoff$1;->L$0:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v2, Lcom/discord/misc/utilities/backoff/ExponentialBackoff;

    .line 121
    .line 122
    invoke-static {p3}, Lnf/t;->b(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_6
    invoke-static {p3}, Lnf/t;->b(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    iput-object p0, v0, Lcom/discord/misc/utilities/backoff/ExponentialBackoff$performBackoff$1;->L$0:Ljava/lang/Object;

    .line 130
    .line 131
    iput-object p1, v0, Lcom/discord/misc/utilities/backoff/ExponentialBackoff$performBackoff$1;->L$1:Ljava/lang/Object;

    .line 132
    .line 133
    iput-object p2, v0, Lcom/discord/misc/utilities/backoff/ExponentialBackoff$performBackoff$1;->L$2:Ljava/lang/Object;

    .line 134
    .line 135
    iput v6, v0, Lcom/discord/misc/utilities/backoff/ExponentialBackoff$performBackoff$1;->label:I

    .line 136
    .line 137
    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p3

    .line 141
    if-ne p3, v1, :cond_7

    .line 142
    .line 143
    return-object v1

    .line 144
    :cond_7
    move-object v2, p0

    .line 145
    :goto_1
    move-object v7, v2

    .line 146
    move-object v2, p1

    .line 147
    :goto_2
    move-object p1, p3

    .line 148
    iput-object v7, v0, Lcom/discord/misc/utilities/backoff/ExponentialBackoff$performBackoff$1;->L$0:Ljava/lang/Object;

    .line 149
    .line 150
    iput-object v2, v0, Lcom/discord/misc/utilities/backoff/ExponentialBackoff$performBackoff$1;->L$1:Ljava/lang/Object;

    .line 151
    .line 152
    iput-object p2, v0, Lcom/discord/misc/utilities/backoff/ExponentialBackoff$performBackoff$1;->L$2:Ljava/lang/Object;

    .line 153
    .line 154
    iput-object p1, v0, Lcom/discord/misc/utilities/backoff/ExponentialBackoff$performBackoff$1;->L$3:Ljava/lang/Object;

    .line 155
    .line 156
    iput v5, v0, Lcom/discord/misc/utilities/backoff/ExponentialBackoff$performBackoff$1;->label:I

    .line 157
    .line 158
    invoke-interface {p2, p1, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object p3

    .line 162
    if-ne p3, v1, :cond_8

    .line 163
    .line 164
    return-object v1

    .line 165
    :cond_8
    :goto_3
    check-cast p3, Ljava/lang/Boolean;

    .line 166
    .line 167
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 168
    .line 169
    .line 170
    move-result p3

    .line 171
    if-eqz p3, :cond_c

    .line 172
    .line 173
    iget p1, v7, Lcom/discord/misc/utilities/backoff/ExponentialBackoff;->currentAttempt:I

    .line 174
    .line 175
    iget p3, v7, Lcom/discord/misc/utilities/backoff/ExponentialBackoff;->maxAttempts:I

    .line 176
    .line 177
    if-gt p1, p3, :cond_b

    .line 178
    .line 179
    iget-wide v8, v7, Lcom/discord/misc/utilities/backoff/ExponentialBackoff;->currentDelay:J

    .line 180
    .line 181
    const-wide/16 v10, 0x0

    .line 182
    .line 183
    cmp-long p1, v8, v10

    .line 184
    .line 185
    if-nez p1, :cond_9

    .line 186
    .line 187
    iget-wide v8, v7, Lcom/discord/misc/utilities/backoff/ExponentialBackoff;->initialDelay:J

    .line 188
    .line 189
    goto :goto_4

    .line 190
    :cond_9
    int-to-long v10, v5

    .line 191
    mul-long/2addr v8, v10

    .line 192
    :goto_4
    iget-wide v10, v7, Lcom/discord/misc/utilities/backoff/ExponentialBackoff;->maxDelay:J

    .line 193
    .line 194
    invoke-static {v8, v9, v10, v11}, Leg/h;->h(JJ)J

    .line 195
    .line 196
    .line 197
    move-result-wide v8

    .line 198
    iput-wide v8, v7, Lcom/discord/misc/utilities/backoff/ExponentialBackoff;->currentDelay:J

    .line 199
    .line 200
    iget p1, v7, Lcom/discord/misc/utilities/backoff/ExponentialBackoff;->currentAttempt:I

    .line 201
    .line 202
    add-int/2addr p1, v6

    .line 203
    iput p1, v7, Lcom/discord/misc/utilities/backoff/ExponentialBackoff;->currentAttempt:I

    .line 204
    .line 205
    iput-object v7, v0, Lcom/discord/misc/utilities/backoff/ExponentialBackoff$performBackoff$1;->L$0:Ljava/lang/Object;

    .line 206
    .line 207
    iput-object v2, v0, Lcom/discord/misc/utilities/backoff/ExponentialBackoff$performBackoff$1;->L$1:Ljava/lang/Object;

    .line 208
    .line 209
    iput-object p2, v0, Lcom/discord/misc/utilities/backoff/ExponentialBackoff$performBackoff$1;->L$2:Ljava/lang/Object;

    .line 210
    .line 211
    const/4 p1, 0x0

    .line 212
    iput-object p1, v0, Lcom/discord/misc/utilities/backoff/ExponentialBackoff$performBackoff$1;->L$3:Ljava/lang/Object;

    .line 213
    .line 214
    iput v4, v0, Lcom/discord/misc/utilities/backoff/ExponentialBackoff$performBackoff$1;->label:I

    .line 215
    .line 216
    invoke-static {v8, v9, v0}, Lkotlinx/coroutines/t0;->a(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    if-ne p1, v1, :cond_a

    .line 221
    .line 222
    return-object v1

    .line 223
    :cond_a
    move-object p1, p2

    .line 224
    move-object p2, v2

    .line 225
    move-object v2, v7

    .line 226
    :goto_5
    iput-object v2, v0, Lcom/discord/misc/utilities/backoff/ExponentialBackoff$performBackoff$1;->L$0:Ljava/lang/Object;

    .line 227
    .line 228
    iput-object p2, v0, Lcom/discord/misc/utilities/backoff/ExponentialBackoff$performBackoff$1;->L$1:Ljava/lang/Object;

    .line 229
    .line 230
    iput-object p1, v0, Lcom/discord/misc/utilities/backoff/ExponentialBackoff$performBackoff$1;->L$2:Ljava/lang/Object;

    .line 231
    .line 232
    iput v3, v0, Lcom/discord/misc/utilities/backoff/ExponentialBackoff$performBackoff$1;->label:I

    .line 233
    .line 234
    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object p3

    .line 238
    if-ne p3, v1, :cond_1

    .line 239
    .line 240
    return-object v1

    .line 241
    :cond_b
    new-instance p1, Lcom/discord/misc/utilities/backoff/MaxAttemptsExceededException;

    .line 242
    .line 243
    invoke-direct {p1}, Lcom/discord/misc/utilities/backoff/MaxAttemptsExceededException;-><init>()V

    .line 244
    .line 245
    .line 246
    throw p1

    .line 247
    :cond_c
    return-object p1
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
.end method

.method public final succeed()V
    .locals 0

    invoke-direct {p0}, Lcom/discord/misc/utilities/backoff/ExponentialBackoff;->reset()V

    return-void
.end method
