.class final Lcom/discord/misc/utilities/time/IntervalFlowKt$intervalFlow$2;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/misc/utilities/time/IntervalFlowKt;->intervalFlow(JJ)Lkotlinx/coroutines/flow/Flow;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/k;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/flow/FlowCollector<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"
    }
    d2 = {
        "Lkotlinx/coroutines/flow/FlowCollector;",
        "",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/e;
    c = "com.discord.misc.utilities.time.IntervalFlowKt$intervalFlow$2"
    f = "IntervalFlow.kt"
    l = {
        0x1a,
        0x1c,
        0x1d
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $initialDelayMs:J

.field final synthetic $periodMs:J

.field private synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(JJLkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/discord/misc/utilities/time/IntervalFlowKt$intervalFlow$2;",
            ">;)V"
        }
    .end annotation

    iput-wide p1, p0, Lcom/discord/misc/utilities/time/IntervalFlowKt$intervalFlow$2;->$initialDelayMs:J

    iput-wide p3, p0, Lcom/discord/misc/utilities/time/IntervalFlowKt$intervalFlow$2;->$periodMs:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v6, Lcom/discord/misc/utilities/time/IntervalFlowKt$intervalFlow$2;

    iget-wide v1, p0, Lcom/discord/misc/utilities/time/IntervalFlowKt$intervalFlow$2;->$initialDelayMs:J

    iget-wide v3, p0, Lcom/discord/misc/utilities/time/IntervalFlowKt$intervalFlow$2;->$periodMs:J

    move-object v0, v6

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/discord/misc/utilities/time/IntervalFlowKt$intervalFlow$2;-><init>(JJLkotlin/coroutines/Continuation;)V

    iput-object p1, v6, Lcom/discord/misc/utilities/time/IntervalFlowKt$intervalFlow$2;->L$0:Ljava/lang/Object;

    return-object v6
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/flow/FlowCollector;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/discord/misc/utilities/time/IntervalFlowKt$intervalFlow$2;->invoke(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/flow/FlowCollector<",
            "-",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/discord/misc/utilities/time/IntervalFlowKt$intervalFlow$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/discord/misc/utilities/time/IntervalFlowKt$intervalFlow$2;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/discord/misc/utilities/time/IntervalFlowKt$intervalFlow$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-static {}, Lrf/b;->d()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/discord/misc/utilities/time/IntervalFlowKt$intervalFlow$2;->label:I

    .line 6
    .line 7
    const/4 v2, 0x3

    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v4, 0x1

    .line 10
    if-eqz v1, :cond_3

    .line 11
    .line 12
    if-eq v1, v4, :cond_0

    .line 13
    .line 14
    if-eq v1, v3, :cond_2

    .line 15
    .line 16
    if-ne v1, v2, :cond_1

    .line 17
    .line 18
    :cond_0
    iget-object v1, p0, Lcom/discord/misc/utilities/time/IntervalFlowKt$intervalFlow$2;->L$0:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Lkotlinx/coroutines/flow/FlowCollector;

    .line 21
    .line 22
    invoke-static {p1}, Llf/t;->b(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 27
    .line 28
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 29
    .line 30
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw p1

    .line 34
    :cond_2
    iget-object v1, p0, Lcom/discord/misc/utilities/time/IntervalFlowKt$intervalFlow$2;->L$0:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v1, Lkotlinx/coroutines/flow/FlowCollector;

    .line 37
    .line 38
    invoke-static {p1}, Llf/t;->b(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    move-object p1, p0

    .line 42
    goto :goto_1

    .line 43
    :cond_3
    invoke-static {p1}, Llf/t;->b(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    iget-object p1, p0, Lcom/discord/misc/utilities/time/IntervalFlowKt$intervalFlow$2;->L$0:Ljava/lang/Object;

    .line 47
    .line 48
    move-object v1, p1

    .line 49
    check-cast v1, Lkotlinx/coroutines/flow/FlowCollector;

    .line 50
    .line 51
    iget-wide v5, p0, Lcom/discord/misc/utilities/time/IntervalFlowKt$intervalFlow$2;->$initialDelayMs:J

    .line 52
    .line 53
    iput-object v1, p0, Lcom/discord/misc/utilities/time/IntervalFlowKt$intervalFlow$2;->L$0:Ljava/lang/Object;

    .line 54
    .line 55
    iput v4, p0, Lcom/discord/misc/utilities/time/IntervalFlowKt$intervalFlow$2;->label:I

    .line 56
    .line 57
    invoke-static {v5, v6, p0}, Lkotlinx/coroutines/t0;->a(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    if-ne p1, v0, :cond_4

    .line 62
    .line 63
    return-object v0

    .line 64
    :cond_4
    :goto_0
    move-object p1, p0

    .line 65
    :cond_5
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 66
    .line 67
    iput-object v1, p1, Lcom/discord/misc/utilities/time/IntervalFlowKt$intervalFlow$2;->L$0:Ljava/lang/Object;

    .line 68
    .line 69
    iput v3, p1, Lcom/discord/misc/utilities/time/IntervalFlowKt$intervalFlow$2;->label:I

    .line 70
    .line 71
    invoke-interface {v1, v4, p1}, Lkotlinx/coroutines/flow/FlowCollector;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    if-ne v4, v0, :cond_6

    .line 76
    .line 77
    return-object v0

    .line 78
    :cond_6
    :goto_1
    iget-wide v4, p1, Lcom/discord/misc/utilities/time/IntervalFlowKt$intervalFlow$2;->$periodMs:J

    .line 79
    .line 80
    iput-object v1, p1, Lcom/discord/misc/utilities/time/IntervalFlowKt$intervalFlow$2;->L$0:Ljava/lang/Object;

    .line 81
    .line 82
    iput v2, p1, Lcom/discord/misc/utilities/time/IntervalFlowKt$intervalFlow$2;->label:I

    .line 83
    .line 84
    invoke-static {v4, v5, p1}, Lkotlinx/coroutines/t0;->a(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    if-ne v4, v0, :cond_5

    .line 89
    .line 90
    return-object v0
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
