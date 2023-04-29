.class final Lcom/discord/billing/BillingManager$getSkusWithRetry$1$1;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/billing/BillingManager$getSkusWithRetry$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/k;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lcom/discord/billing/BillingManager$SkuDetailsResponse;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"
    }
    d2 = {
        "Lcom/discord/billing/BillingManager$SkuDetailsResponse;",
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
    c = "com.discord.billing.BillingManager$getSkusWithRetry$1$1"
    f = "BillingManager.kt"
    l = {
        0x1e9
    }
    m = "invokeSuspend"
.end annotation


# instance fields
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

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/discord/billing/BillingManager;


# direct methods
.method constructor <init>(Lcom/discord/billing/BillingManager;Lcom/discord/billing/types/SkuType;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/billing/BillingManager;",
            "Lcom/discord/billing/types/SkuType;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Exception;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/discord/billing/BillingManager$getSkusWithRetry$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/discord/billing/BillingManager$getSkusWithRetry$1$1;->this$0:Lcom/discord/billing/BillingManager;

    iput-object p2, p0, Lcom/discord/billing/BillingManager$getSkusWithRetry$1$1;->$skuType:Lcom/discord/billing/types/SkuType;

    iput-object p3, p0, Lcom/discord/billing/BillingManager$getSkusWithRetry$1$1;->$skuIds:Ljava/util/List;

    iput-object p4, p0, Lcom/discord/billing/BillingManager$getSkusWithRetry$1$1;->$onError:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v6, Lcom/discord/billing/BillingManager$getSkusWithRetry$1$1;

    iget-object v1, p0, Lcom/discord/billing/BillingManager$getSkusWithRetry$1$1;->this$0:Lcom/discord/billing/BillingManager;

    iget-object v2, p0, Lcom/discord/billing/BillingManager$getSkusWithRetry$1$1;->$skuType:Lcom/discord/billing/types/SkuType;

    iget-object v3, p0, Lcom/discord/billing/BillingManager$getSkusWithRetry$1$1;->$skuIds:Ljava/util/List;

    iget-object v4, p0, Lcom/discord/billing/BillingManager$getSkusWithRetry$1$1;->$onError:Lkotlin/jvm/functions/Function1;

    move-object v0, v6

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lcom/discord/billing/BillingManager$getSkusWithRetry$1$1;-><init>(Lcom/discord/billing/BillingManager;Lcom/discord/billing/types/SkuType;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    return-object v6
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/discord/billing/BillingManager$getSkusWithRetry$1$1;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/discord/billing/BillingManager$SkuDetailsResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/discord/billing/BillingManager$getSkusWithRetry$1$1;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/discord/billing/BillingManager$getSkusWithRetry$1$1;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lcom/discord/billing/BillingManager$getSkusWithRetry$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-static {}, Ltf/b;->d()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/discord/billing/BillingManager$getSkusWithRetry$1$1;->label:I

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
    iget-object v0, p0, Lcom/discord/billing/BillingManager$getSkusWithRetry$1$1;->L$3:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 15
    .line 16
    iget-object v0, p0, Lcom/discord/billing/BillingManager$getSkusWithRetry$1$1;->L$2:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Ljava/util/List;

    .line 19
    .line 20
    iget-object v0, p0, Lcom/discord/billing/BillingManager$getSkusWithRetry$1$1;->L$1:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lcom/discord/billing/types/SkuType;

    .line 23
    .line 24
    iget-object v0, p0, Lcom/discord/billing/BillingManager$getSkusWithRetry$1$1;->L$0:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Lcom/discord/billing/BillingManager;

    .line 27
    .line 28
    invoke-static {p1}, Lnf/t;->b(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 33
    .line 34
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 35
    .line 36
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw p1

    .line 40
    :cond_1
    invoke-static {p1}, Lnf/t;->b(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iget-object p1, p0, Lcom/discord/billing/BillingManager$getSkusWithRetry$1$1;->this$0:Lcom/discord/billing/BillingManager;

    .line 44
    .line 45
    iget-object v1, p0, Lcom/discord/billing/BillingManager$getSkusWithRetry$1$1;->$skuType:Lcom/discord/billing/types/SkuType;

    .line 46
    .line 47
    iget-object v3, p0, Lcom/discord/billing/BillingManager$getSkusWithRetry$1$1;->$skuIds:Ljava/util/List;

    .line 48
    .line 49
    iget-object v4, p0, Lcom/discord/billing/BillingManager$getSkusWithRetry$1$1;->$onError:Lkotlin/jvm/functions/Function1;

    .line 50
    .line 51
    iput-object p1, p0, Lcom/discord/billing/BillingManager$getSkusWithRetry$1$1;->L$0:Ljava/lang/Object;

    .line 52
    .line 53
    iput-object v1, p0, Lcom/discord/billing/BillingManager$getSkusWithRetry$1$1;->L$1:Ljava/lang/Object;

    .line 54
    .line 55
    iput-object v3, p0, Lcom/discord/billing/BillingManager$getSkusWithRetry$1$1;->L$2:Ljava/lang/Object;

    .line 56
    .line 57
    iput-object v4, p0, Lcom/discord/billing/BillingManager$getSkusWithRetry$1$1;->L$3:Ljava/lang/Object;

    .line 58
    .line 59
    iput v2, p0, Lcom/discord/billing/BillingManager$getSkusWithRetry$1$1;->label:I

    .line 60
    .line 61
    new-instance v5, Lkotlinx/coroutines/p;

    .line 62
    .line 63
    invoke-static {p0}, Ltf/b;->c(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    invoke-direct {v5, v6, v2}, Lkotlinx/coroutines/p;-><init>(Lkotlin/coroutines/Continuation;I)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v5}, Lkotlinx/coroutines/p;->C()V

    .line 71
    .line 72
    .line 73
    invoke-static {p1}, Lcom/discord/billing/BillingManager;->access$getBillingClient$p(Lcom/discord/billing/BillingManager;)Lcom/android/billingclient/api/BillingClient;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    if-nez v2, :cond_2

    .line 78
    .line 79
    const-string v2, "billingClient"

    .line 80
    .line 81
    invoke-static {v2}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    const/4 v2, 0x0

    .line 85
    :cond_2
    sget-object v6, Lcom/discord/billing/types/SkuDetailsParams;->INSTANCE:Lcom/discord/billing/types/SkuDetailsParams;

    .line 86
    .line 87
    invoke-virtual {v6, v1, v3}, Lcom/discord/billing/types/SkuDetailsParams;->create(Lcom/discord/billing/types/SkuType;Ljava/util/List;)Lcom/android/billingclient/api/SkuDetailsParams;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    new-instance v3, Lcom/discord/billing/BillingManager$getSkusWithRetry$1$1$1$1;

    .line 92
    .line 93
    invoke-direct {v3, v5, p1, v4}, Lcom/discord/billing/BillingManager$getSkusWithRetry$1$1$1$1;-><init>(Lkotlinx/coroutines/CancellableContinuation;Lcom/discord/billing/BillingManager;Lkotlin/jvm/functions/Function1;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2, v1, v3}, Lcom/android/billingclient/api/BillingClient;->i(Lcom/android/billingclient/api/SkuDetailsParams;Lv2/g;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v5}, Lkotlinx/coroutines/p;->y()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-static {}, Ltf/b;->d()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    if-ne p1, v1, :cond_3

    .line 108
    .line 109
    invoke-static {p0}, Lkotlin/coroutines/jvm/internal/g;->c(Lkotlin/coroutines/Continuation;)V

    .line 110
    .line 111
    .line 112
    :cond_3
    if-ne p1, v0, :cond_4

    .line 113
    .line 114
    return-object v0

    .line 115
    :cond_4
    :goto_0
    return-object p1
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
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
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
