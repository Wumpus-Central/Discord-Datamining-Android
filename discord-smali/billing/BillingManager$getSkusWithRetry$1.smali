.class final Lcom/discord/billing/BillingManager$getSkusWithRetry$1;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/billing/BillingManager;->getSkusWithRetry(Ljava/util/List;Lcom/discord/billing/types/SkuType;Lcom/facebook/react/bridge/Promise;Lkotlin/jvm/functions/Function1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/k;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
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
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"
    }
    d2 = {
        "Lkotlinx/coroutines/CoroutineScope;",
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
    c = "com.discord.billing.BillingManager$getSkusWithRetry$1"
    f = "BillingManager.kt"
    l = {
        0x11d
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $getSkusBackoff:Lcom/discord/misc/utilities/backoff/ExponentialBackoff;

.field final synthetic $onError:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Exception;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $reactPromise:Lcom/facebook/react/bridge/Promise;

.field final synthetic $skuIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $skuType:Lcom/discord/billing/types/SkuType;

.field label:I

.field final synthetic this$0:Lcom/discord/billing/BillingManager;


# direct methods
.method constructor <init>(Lcom/discord/misc/utilities/backoff/ExponentialBackoff;Lcom/discord/billing/BillingManager;Lkotlin/jvm/functions/Function1;Lcom/facebook/react/bridge/Promise;Lcom/discord/billing/types/SkuType;Ljava/util/List;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/misc/utilities/backoff/ExponentialBackoff;",
            "Lcom/discord/billing/BillingManager;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Exception;",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/facebook/react/bridge/Promise;",
            "Lcom/discord/billing/types/SkuType;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/discord/billing/BillingManager$getSkusWithRetry$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/discord/billing/BillingManager$getSkusWithRetry$1;->$getSkusBackoff:Lcom/discord/misc/utilities/backoff/ExponentialBackoff;

    iput-object p2, p0, Lcom/discord/billing/BillingManager$getSkusWithRetry$1;->this$0:Lcom/discord/billing/BillingManager;

    iput-object p3, p0, Lcom/discord/billing/BillingManager$getSkusWithRetry$1;->$onError:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lcom/discord/billing/BillingManager$getSkusWithRetry$1;->$reactPromise:Lcom/facebook/react/bridge/Promise;

    iput-object p5, p0, Lcom/discord/billing/BillingManager$getSkusWithRetry$1;->$skuType:Lcom/discord/billing/types/SkuType;

    iput-object p6, p0, Lcom/discord/billing/BillingManager$getSkusWithRetry$1;->$skuIds:Ljava/util/List;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 8
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

    new-instance p1, Lcom/discord/billing/BillingManager$getSkusWithRetry$1;

    iget-object v1, p0, Lcom/discord/billing/BillingManager$getSkusWithRetry$1;->$getSkusBackoff:Lcom/discord/misc/utilities/backoff/ExponentialBackoff;

    iget-object v2, p0, Lcom/discord/billing/BillingManager$getSkusWithRetry$1;->this$0:Lcom/discord/billing/BillingManager;

    iget-object v3, p0, Lcom/discord/billing/BillingManager$getSkusWithRetry$1;->$onError:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Lcom/discord/billing/BillingManager$getSkusWithRetry$1;->$reactPromise:Lcom/facebook/react/bridge/Promise;

    iget-object v5, p0, Lcom/discord/billing/BillingManager$getSkusWithRetry$1;->$skuType:Lcom/discord/billing/types/SkuType;

    iget-object v6, p0, Lcom/discord/billing/BillingManager$getSkusWithRetry$1;->$skuIds:Ljava/util/List;

    move-object v0, p1

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/discord/billing/BillingManager$getSkusWithRetry$1;-><init>(Lcom/discord/misc/utilities/backoff/ExponentialBackoff;Lcom/discord/billing/BillingManager;Lkotlin/jvm/functions/Function1;Lcom/facebook/react/bridge/Promise;Lcom/discord/billing/types/SkuType;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/discord/billing/BillingManager$getSkusWithRetry$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/discord/billing/BillingManager$getSkusWithRetry$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/discord/billing/BillingManager$getSkusWithRetry$1;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/discord/billing/BillingManager$getSkusWithRetry$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    invoke-static {}, Ltf/b;->d()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/discord/billing/BillingManager$getSkusWithRetry$1;->label:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    :try_start_0
    invoke-static {p1}, Lnf/t;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catch_0
    move-exception p1

    .line 17
    goto/16 :goto_1

    .line 18
    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_1
    invoke-static {p1}, Lnf/t;->b(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    :try_start_1
    iget-object p1, p0, Lcom/discord/billing/BillingManager$getSkusWithRetry$1;->$getSkusBackoff:Lcom/discord/misc/utilities/backoff/ExponentialBackoff;

    .line 31
    .line 32
    new-instance v1, Lcom/discord/billing/BillingManager$getSkusWithRetry$1$1;

    .line 33
    .line 34
    iget-object v4, p0, Lcom/discord/billing/BillingManager$getSkusWithRetry$1;->this$0:Lcom/discord/billing/BillingManager;

    .line 35
    .line 36
    iget-object v5, p0, Lcom/discord/billing/BillingManager$getSkusWithRetry$1;->$skuType:Lcom/discord/billing/types/SkuType;

    .line 37
    .line 38
    iget-object v6, p0, Lcom/discord/billing/BillingManager$getSkusWithRetry$1;->$skuIds:Ljava/util/List;

    .line 39
    .line 40
    iget-object v7, p0, Lcom/discord/billing/BillingManager$getSkusWithRetry$1;->$onError:Lkotlin/jvm/functions/Function1;

    .line 41
    .line 42
    const/4 v8, 0x0

    .line 43
    move-object v3, v1

    .line 44
    invoke-direct/range {v3 .. v8}, Lcom/discord/billing/BillingManager$getSkusWithRetry$1$1;-><init>(Lcom/discord/billing/BillingManager;Lcom/discord/billing/types/SkuType;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    .line 45
    .line 46
    .line 47
    new-instance v3, Lcom/discord/billing/BillingManager$getSkusWithRetry$1$2;

    .line 48
    .line 49
    iget-object v4, p0, Lcom/discord/billing/BillingManager$getSkusWithRetry$1;->this$0:Lcom/discord/billing/BillingManager;

    .line 50
    .line 51
    const/4 v5, 0x0

    .line 52
    invoke-direct {v3, v4, v5}, Lcom/discord/billing/BillingManager$getSkusWithRetry$1$2;-><init>(Lcom/discord/billing/BillingManager;Lkotlin/coroutines/Continuation;)V

    .line 53
    .line 54
    .line 55
    iput v2, p0, Lcom/discord/billing/BillingManager$getSkusWithRetry$1;->label:I

    .line 56
    .line 57
    invoke-virtual {p1, v1, v3, p0}, Lcom/discord/misc/utilities/backoff/ExponentialBackoff;->performBackoff(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    if-ne p1, v0, :cond_2

    .line 62
    .line 63
    return-object v0

    .line 64
    :cond_2
    :goto_0
    check-cast p1, Lcom/discord/billing/BillingManager$SkuDetailsResponse;

    .line 65
    .line 66
    invoke-virtual {p1}, Lcom/discord/billing/BillingManager$SkuDetailsResponse;->component1()Lcom/android/billingclient/api/BillingResult;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {p1}, Lcom/discord/billing/BillingManager$SkuDetailsResponse;->component2()Ljava/util/List;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    if-nez p1, :cond_3

    .line 75
    .line 76
    iget-object p1, p0, Lcom/discord/billing/BillingManager$getSkusWithRetry$1;->this$0:Lcom/discord/billing/BillingManager;

    .line 77
    .line 78
    iget-object v0, p0, Lcom/discord/billing/BillingManager$getSkusWithRetry$1;->$onError:Lkotlin/jvm/functions/Function1;

    .line 79
    .line 80
    const-string v1, "Sku fetch, details not found"

    .line 81
    .line 82
    invoke-static {p1, v0, v1}, Lcom/discord/billing/BillingManager;->access$invoke(Lcom/discord/billing/BillingManager;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_3
    iget-object v1, p0, Lcom/discord/billing/BillingManager$getSkusWithRetry$1;->this$0:Lcom/discord/billing/BillingManager;

    .line 87
    .line 88
    invoke-static {v1, v0}, Lcom/discord/billing/BillingManager;->access$isNotOk(Lcom/discord/billing/BillingManager;Lcom/android/billingclient/api/BillingResult;)Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-eqz v1, :cond_4

    .line 93
    .line 94
    iget-object p1, p0, Lcom/discord/billing/BillingManager$getSkusWithRetry$1;->this$0:Lcom/discord/billing/BillingManager;

    .line 95
    .line 96
    iget-object v1, p0, Lcom/discord/billing/BillingManager$getSkusWithRetry$1;->$onError:Lkotlin/jvm/functions/Function1;

    .line 97
    .line 98
    invoke-virtual {v0}, Lcom/android/billingclient/api/BillingResult;->a()I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    new-instance v2, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 105
    .line 106
    .line 107
    const-string v3, "Sku fetch, bad response code: "

    .line 108
    .line 109
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-static {p1, v1, v0}, Lcom/discord/billing/BillingManager;->access$invoke(Lcom/discord/billing/BillingManager;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_4
    iget-object v0, p0, Lcom/discord/billing/BillingManager$getSkusWithRetry$1;->$reactPromise:Lcom/facebook/react/bridge/Promise;

    .line 124
    .line 125
    invoke-static {p1}, Lcom/discord/billing/react/events/serialization/SerializeSkuDetailsKt;->serializeSkuDetails(Ljava/util/List;)Lcom/facebook/react/bridge/ReadableNativeArray;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 130
    .line 131
    .line 132
    goto :goto_2

    .line 133
    :goto_1
    instance-of v0, p1, Lcom/discord/misc/utilities/backoff/MaxAttemptsExceededException;

    .line 134
    .line 135
    if-eqz v0, :cond_5

    .line 136
    .line 137
    sget-object v0, Lcom/discord/crash_reporting/CrashReporting;->INSTANCE:Lcom/discord/crash_reporting/CrashReporting;

    .line 138
    .line 139
    invoke-virtual {v0, p1}, Lcom/discord/crash_reporting/CrashReporting;->captureException(Ljava/lang/Throwable;)V

    .line 140
    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_5
    sget-object v0, Lcom/discord/crash_reporting/CrashReporting;->INSTANCE:Lcom/discord/crash_reporting/CrashReporting;

    .line 144
    .line 145
    const-string v1, "Found exception when exponentially retrying querySkuDetails call"

    .line 146
    .line 147
    invoke-virtual {v0, v1, p1}, Lcom/discord/crash_reporting/CrashReporting;->captureMessage(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 148
    .line 149
    .line 150
    :goto_2
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 151
    .line 152
    return-object p1
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
.end method
