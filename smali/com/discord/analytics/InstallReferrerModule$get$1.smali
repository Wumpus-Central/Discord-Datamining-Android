.class final Lcom/discord/analytics/InstallReferrerModule$get$1;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/analytics/InstallReferrerModule;->get(Lcom/facebook/react/bridge/Promise;)V
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
    c = "com.discord.analytics.InstallReferrerModule$get$1"
    f = "InstallReferrerModule.kt"
    l = {
        0x23
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $attempts:I

.field final synthetic $client:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcom/android/installreferrer/api/InstallReferrerClient;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $prefs:Landroid/content/SharedPreferences;

.field final synthetic $promise:Lcom/facebook/react/bridge/Promise;

.field final synthetic $referrer:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field label:I

.field final synthetic this$0:Lcom/discord/analytics/InstallReferrerModule;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/discord/analytics/InstallReferrerModule;Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/content/SharedPreferences;Lcom/facebook/react/bridge/Promise;ILkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcom/android/installreferrer/api/InstallReferrerClient;",
            ">;",
            "Lcom/discord/analytics/InstallReferrerModule;",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Ljava/lang/String;",
            ">;",
            "Landroid/content/SharedPreferences;",
            "Lcom/facebook/react/bridge/Promise;",
            "I",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/discord/analytics/InstallReferrerModule$get$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/discord/analytics/InstallReferrerModule$get$1;->$client:Lkotlin/jvm/internal/Ref$ObjectRef;

    iput-object p2, p0, Lcom/discord/analytics/InstallReferrerModule$get$1;->this$0:Lcom/discord/analytics/InstallReferrerModule;

    iput-object p3, p0, Lcom/discord/analytics/InstallReferrerModule$get$1;->$referrer:Lkotlin/jvm/internal/Ref$ObjectRef;

    iput-object p4, p0, Lcom/discord/analytics/InstallReferrerModule$get$1;->$prefs:Landroid/content/SharedPreferences;

    iput-object p5, p0, Lcom/discord/analytics/InstallReferrerModule$get$1;->$promise:Lcom/facebook/react/bridge/Promise;

    iput p6, p0, Lcom/discord/analytics/InstallReferrerModule$get$1;->$attempts:I

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

    new-instance p1, Lcom/discord/analytics/InstallReferrerModule$get$1;

    iget-object v1, p0, Lcom/discord/analytics/InstallReferrerModule$get$1;->$client:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v2, p0, Lcom/discord/analytics/InstallReferrerModule$get$1;->this$0:Lcom/discord/analytics/InstallReferrerModule;

    iget-object v3, p0, Lcom/discord/analytics/InstallReferrerModule$get$1;->$referrer:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v4, p0, Lcom/discord/analytics/InstallReferrerModule$get$1;->$prefs:Landroid/content/SharedPreferences;

    iget-object v5, p0, Lcom/discord/analytics/InstallReferrerModule$get$1;->$promise:Lcom/facebook/react/bridge/Promise;

    iget v6, p0, Lcom/discord/analytics/InstallReferrerModule$get$1;->$attempts:I

    move-object v0, p1

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/discord/analytics/InstallReferrerModule$get$1;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/discord/analytics/InstallReferrerModule;Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/content/SharedPreferences;Lcom/facebook/react/bridge/Promise;ILkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/discord/analytics/InstallReferrerModule$get$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/discord/analytics/InstallReferrerModule$get$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/discord/analytics/InstallReferrerModule$get$1;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/discord/analytics/InstallReferrerModule$get$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    invoke-static {}, Lrf/b;->d()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/discord/analytics/InstallReferrerModule$get$1;->label:I

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
    invoke-static {p1}, Llf/t;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, Llf/t;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    new-instance p1, Lcom/discord/analytics/InstallReferrerModule$get$1$1;

    .line 28
    .line 29
    iget-object v4, p0, Lcom/discord/analytics/InstallReferrerModule$get$1;->$client:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 30
    .line 31
    iget-object v5, p0, Lcom/discord/analytics/InstallReferrerModule$get$1;->this$0:Lcom/discord/analytics/InstallReferrerModule;

    .line 32
    .line 33
    iget-object v6, p0, Lcom/discord/analytics/InstallReferrerModule$get$1;->$referrer:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 34
    .line 35
    iget-object v7, p0, Lcom/discord/analytics/InstallReferrerModule$get$1;->$prefs:Landroid/content/SharedPreferences;

    .line 36
    .line 37
    iget-object v8, p0, Lcom/discord/analytics/InstallReferrerModule$get$1;->$promise:Lcom/facebook/react/bridge/Promise;

    .line 38
    .line 39
    iget v9, p0, Lcom/discord/analytics/InstallReferrerModule$get$1;->$attempts:I

    .line 40
    .line 41
    const/4 v10, 0x0

    .line 42
    move-object v3, p1

    .line 43
    invoke-direct/range {v3 .. v10}, Lcom/discord/analytics/InstallReferrerModule$get$1$1;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/discord/analytics/InstallReferrerModule;Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/content/SharedPreferences;Lcom/facebook/react/bridge/Promise;ILkotlin/coroutines/Continuation;)V

    .line 44
    .line 45
    .line 46
    iput v2, p0, Lcom/discord/analytics/InstallReferrerModule$get$1;->label:I

    .line 47
    .line 48
    const-wide/16 v1, 0x3e8

    .line 49
    .line 50
    invoke-static {v1, v2, p1, p0}, Lkotlinx/coroutines/u2;->c(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    if-ne p1, v0, :cond_2

    .line 55
    .line 56
    return-object v0

    .line 57
    :cond_2
    :goto_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 58
    .line 59
    return-object p1
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
    .line 188
    .line 189
.end method