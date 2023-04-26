.class final Lcom/discord/notifications/renderer/NotificationRenderer$display$1;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/notifications/renderer/NotificationRenderer;->display(Landroid/content/Context;Lcom/discord/notifications/api/NotificationData;Ljava/lang/String;Ljava/util/Map;Lcom/discord/notifications/renderer/NotificationBehaviors;ZZ)V
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
    c = "com.discord.notifications.renderer.NotificationRenderer$display$1"
    f = "NotificationRenderer.kt"
    l = {
        0x86
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $behaviors:Lcom/discord/notifications/renderer/NotificationBehaviors;

.field final synthetic $context:Landroid/content/Context;

.field final synthetic $currentUsername:Ljava/lang/String;

.field final synthetic $makeOrUpdateShortcut:Z

.field final synthetic $notification:Lcom/discord/notifications/api/NotificationData;

.field final synthetic $notificationDataMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $notifyEveryTime:Z

.field private synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Lcom/discord/notifications/api/NotificationData;Landroid/content/Context;ZLjava/util/Map;Lcom/discord/notifications/renderer/NotificationBehaviors;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/notifications/api/NotificationData;",
            "Landroid/content/Context;",
            "Z",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/discord/notifications/renderer/NotificationBehaviors;",
            "Ljava/lang/String;",
            "Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/discord/notifications/renderer/NotificationRenderer$display$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;->$notification:Lcom/discord/notifications/api/NotificationData;

    iput-object p2, p0, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;->$context:Landroid/content/Context;

    iput-boolean p3, p0, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;->$notifyEveryTime:Z

    iput-object p4, p0, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;->$notificationDataMap:Ljava/util/Map;

    iput-object p5, p0, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;->$behaviors:Lcom/discord/notifications/renderer/NotificationBehaviors;

    iput-object p6, p0, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;->$currentUsername:Ljava/lang/String;

    iput-boolean p7, p0, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;->$makeOrUpdateShortcut:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p8}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method public static final synthetic access$invokeSuspend$fetchImage(Landroid/content/Context;Lkotlin/jvm/internal/Ref$ObjectRef;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;->invokeSuspend$fetchImage(Landroid/content/Context;Lkotlin/jvm/internal/Ref$ObjectRef;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final invokeSuspend$fetchImage(Landroid/content/Context;Lkotlin/jvm/internal/Ref$ObjectRef;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcom/discord/image/fresco/postprocessors/PostProcessor;",
            ">;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Landroid/graphics/Bitmap;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p1, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->k:Ljava/lang/Object;

    check-cast p1, Lcom/discord/image/fresco/postprocessors/PostProcessor;

    const/4 v0, 0x1

    invoke-static {p0, p2, p1, v0, p3}, Lcom/discord/image/fresco/FrescoFetchDecodedImageKt;->fetchDecodedImage(Landroid/content/Context;Ljava/lang/String;Lcom/discord/image/fresco/postprocessors/PostProcessor;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 10
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

    new-instance v9, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;

    iget-object v1, p0, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;->$notification:Lcom/discord/notifications/api/NotificationData;

    iget-object v2, p0, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;->$context:Landroid/content/Context;

    iget-boolean v3, p0, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;->$notifyEveryTime:Z

    iget-object v4, p0, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;->$notificationDataMap:Ljava/util/Map;

    iget-object v5, p0, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;->$behaviors:Lcom/discord/notifications/renderer/NotificationBehaviors;

    iget-object v6, p0, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;->$currentUsername:Ljava/lang/String;

    iget-boolean v7, p0, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;->$makeOrUpdateShortcut:Z

    move-object v0, v9

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;-><init>(Lcom/discord/notifications/api/NotificationData;Landroid/content/Context;ZLjava/util/Map;Lcom/discord/notifications/renderer/NotificationBehaviors;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)V

    iput-object p1, v9, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;->L$0:Ljava/lang/Object;

    return-object v9
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {}, Lrf/b;->d()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget v2, v0, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;->label:I

    .line 8
    .line 9
    const/4 v3, 0x2

    .line 10
    const/4 v4, 0x0

    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x1

    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    if-ne v2, v6, :cond_0

    .line 16
    .line 17
    invoke-static/range {p1 .. p1}, Llf/t;->b(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    move-object/from16 v2, p1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw v1

    .line 31
    :cond_1
    invoke-static/range {p1 .. p1}, Llf/t;->b(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object v2, v0, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;->L$0:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v2, Lkotlinx/coroutines/CoroutineScope;

    .line 37
    .line 38
    new-instance v13, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 39
    .line 40
    invoke-direct {v13}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 41
    .line 42
    .line 43
    sget-object v7, Lcom/discord/image/fresco/postprocessors/PostProcessor$Circle;->INSTANCE:Lcom/discord/image/fresco/postprocessors/PostProcessor$Circle;

    .line 44
    .line 45
    iput-object v7, v13, Lkotlin/jvm/internal/Ref$ObjectRef;->k:Ljava/lang/Object;

    .line 46
    .line 47
    new-instance v7, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 48
    .line 49
    invoke-direct {v7}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 50
    .line 51
    .line 52
    iget-object v8, v0, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;->$notification:Lcom/discord/notifications/api/NotificationData;

    .line 53
    .line 54
    iget-object v9, v0, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;->$context:Landroid/content/Context;

    .line 55
    .line 56
    invoke-static {v8, v9}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt;->getIconUrl(Lcom/discord/notifications/api/NotificationData;Landroid/content/Context;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v8

    .line 60
    iput-object v8, v7, Lkotlin/jvm/internal/Ref$ObjectRef;->k:Ljava/lang/Object;

    .line 61
    .line 62
    iget-object v8, v0, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;->$notification:Lcom/discord/notifications/api/NotificationData;

    .line 63
    .line 64
    invoke-virtual {v8}, Lcom/discord/notifications/api/NotificationData;->getImageAttachmentUrl()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v8

    .line 68
    if-eqz v8, :cond_3

    .line 69
    .line 70
    iget-object v8, v0, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;->$notification:Lcom/discord/notifications/api/NotificationData;

    .line 71
    .line 72
    invoke-virtual {v8}, Lcom/discord/notifications/api/NotificationData;->getImageAttachmentUrl()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v8

    .line 76
    if-nez v8, :cond_2

    .line 77
    .line 78
    const-string v8, ""

    .line 79
    .line 80
    :cond_2
    iput-object v8, v7, Lkotlin/jvm/internal/Ref$ObjectRef;->k:Ljava/lang/Object;

    .line 81
    .line 82
    iput-object v5, v13, Lkotlin/jvm/internal/Ref$ObjectRef;->k:Ljava/lang/Object;

    .line 83
    .line 84
    :cond_3
    new-array v14, v3, [Lkotlinx/coroutines/q0;

    .line 85
    .line 86
    const/4 v8, 0x0

    .line 87
    const/4 v9, 0x0

    .line 88
    new-instance v10, Lcom/discord/notifications/renderer/NotificationRenderer$display$1$1;

    .line 89
    .line 90
    iget-object v11, v0, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;->$context:Landroid/content/Context;

    .line 91
    .line 92
    invoke-direct {v10, v7, v11, v13, v5}, Lcom/discord/notifications/renderer/NotificationRenderer$display$1$1;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/content/Context;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/coroutines/Continuation;)V

    .line 93
    .line 94
    .line 95
    const/4 v11, 0x3

    .line 96
    const/4 v12, 0x0

    .line 97
    move-object v7, v2

    .line 98
    invoke-static/range {v7 .. v12}, Lkotlinx/coroutines/j;->b(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/l0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/q0;

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    aput-object v7, v14, v4

    .line 103
    .line 104
    new-instance v10, Lcom/discord/notifications/renderer/NotificationRenderer$display$1$2;

    .line 105
    .line 106
    iget-object v7, v0, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;->$notification:Lcom/discord/notifications/api/NotificationData;

    .line 107
    .line 108
    iget-object v11, v0, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;->$context:Landroid/content/Context;

    .line 109
    .line 110
    invoke-direct {v10, v7, v11, v13, v5}, Lcom/discord/notifications/renderer/NotificationRenderer$display$1$2;-><init>(Lcom/discord/notifications/api/NotificationData;Landroid/content/Context;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/coroutines/Continuation;)V

    .line 111
    .line 112
    .line 113
    const/4 v11, 0x3

    .line 114
    move-object v7, v2

    .line 115
    invoke-static/range {v7 .. v12}, Lkotlinx/coroutines/j;->b(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/l0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/q0;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    aput-object v2, v14, v6

    .line 120
    .line 121
    iput v6, v0, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;->label:I

    .line 122
    .line 123
    invoke-static {v14, v0}, Lkotlinx/coroutines/f;->a([Lkotlinx/coroutines/q0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    if-ne v2, v1, :cond_4

    .line 128
    .line 129
    return-object v1

    .line 130
    :cond_4
    :goto_0
    check-cast v2, Ljava/util/List;

    .line 131
    .line 132
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    check-cast v1, Landroid/graphics/Bitmap;

    .line 137
    .line 138
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    check-cast v2, Landroid/graphics/Bitmap;

    .line 143
    .line 144
    iget-object v7, v0, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;->$notification:Lcom/discord/notifications/api/NotificationData;

    .line 145
    .line 146
    iget-object v8, v0, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;->$context:Landroid/content/Context;

    .line 147
    .line 148
    invoke-static {v7, v8}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt;->getContent(Lcom/discord/notifications/api/NotificationData;Landroid/content/Context;)Ljava/lang/CharSequence;

    .line 149
    .line 150
    .line 151
    move-result-object v7

    .line 152
    iget-object v8, v0, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;->$context:Landroid/content/Context;

    .line 153
    .line 154
    iget-object v9, v0, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;->$notification:Lcom/discord/notifications/api/NotificationData;

    .line 155
    .line 156
    invoke-static {v9}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt;->getTag(Lcom/discord/notifications/api/NotificationData;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v9

    .line 160
    invoke-static {v8, v9}, Lcom/discord/notifications/renderer/utils/NotificationManagerUtilsKt;->getActiveNotificationMessageCount(Landroid/content/Context;Ljava/lang/String;)I

    .line 161
    .line 162
    .line 163
    move-result v8

    .line 164
    add-int/2addr v8, v6

    .line 165
    iget-object v9, v0, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;->$context:Landroid/content/Context;

    .line 166
    .line 167
    sget-object v10, Lcom/discord/notifications/renderer/NotificationChannels;->INSTANCE:Lcom/discord/notifications/renderer/NotificationChannels;

    .line 168
    .line 169
    iget-object v11, v0, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;->$notification:Lcom/discord/notifications/api/NotificationData;

    .line 170
    .line 171
    invoke-virtual {v10, v11}, Lcom/discord/notifications/renderer/NotificationChannels;->getNotificationChannelId(Lcom/discord/notifications/api/NotificationData;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v10

    .line 175
    iget-object v11, v0, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;->$context:Landroid/content/Context;

    .line 176
    .line 177
    iget-object v12, v0, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;->$notification:Lcom/discord/notifications/api/NotificationData;

    .line 178
    .line 179
    invoke-static {v12}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt;->getTag(Lcom/discord/notifications/api/NotificationData;)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v12

    .line 183
    invoke-static {v11, v12}, Lcom/discord/notifications/renderer/utils/NotificationManagerUtilsKt;->getActiveNotification(Landroid/content/Context;Ljava/lang/String;)Landroid/app/Notification;

    .line 184
    .line 185
    .line 186
    move-result-object v11

    .line 187
    invoke-static {v9, v10, v11}, Lcom/discord/notifications/renderer/utils/NotificationManagerUtilsKt;->getNotificationBuilderOrCreate(Landroid/content/Context;Ljava/lang/String;Landroid/app/Notification;)Landroidx/core/app/NotificationCompat$Builder;

    .line 188
    .line 189
    .line 190
    move-result-object v9

    .line 191
    invoke-virtual {v9, v6}, Landroidx/core/app/NotificationCompat$Builder;->t(Z)Landroidx/core/app/NotificationCompat$Builder;

    .line 192
    .line 193
    .line 194
    move-result-object v9

    .line 195
    iget-boolean v10, v0, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;->$notifyEveryTime:Z

    .line 196
    .line 197
    xor-int/2addr v10, v6

    .line 198
    invoke-virtual {v9, v10}, Landroidx/core/app/NotificationCompat$Builder;->R(Z)Landroidx/core/app/NotificationCompat$Builder;

    .line 199
    .line 200
    .line 201
    move-result-object v9

    .line 202
    iget-object v10, v0, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;->$notification:Lcom/discord/notifications/api/NotificationData;

    .line 203
    .line 204
    invoke-static {v10}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt;->getSmallIcon(Lcom/discord/notifications/api/NotificationData;)I

    .line 205
    .line 206
    .line 207
    move-result v10

    .line 208
    invoke-virtual {v9, v10}, Landroidx/core/app/NotificationCompat$Builder;->Z(I)Landroidx/core/app/NotificationCompat$Builder;

    .line 209
    .line 210
    .line 211
    move-result-object v9

    .line 212
    iget-object v10, v0, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;->$context:Landroid/content/Context;

    .line 213
    .line 214
    sget v11, Lcom/discord/notifications/renderer/R$color;->brand_500:I

    .line 215
    .line 216
    invoke-static {v10, v11}, Lcom/discord/theme/utils/ColorUtilsKt;->getColorCompat(Landroid/content/Context;I)I

    .line 217
    .line 218
    .line 219
    move-result v10

    .line 220
    invoke-virtual {v9, v10}, Landroidx/core/app/NotificationCompat$Builder;->z(I)Landroidx/core/app/NotificationCompat$Builder;

    .line 221
    .line 222
    .line 223
    move-result-object v9

    .line 224
    iget-object v10, v0, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;->$notification:Lcom/discord/notifications/api/NotificationData;

    .line 225
    .line 226
    invoke-static {v10}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt;->getNotificationCategory(Lcom/discord/notifications/api/NotificationData;)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v10

    .line 230
    invoke-virtual {v9, v10}, Landroidx/core/app/NotificationCompat$Builder;->w(Ljava/lang/String;)Landroidx/core/app/NotificationCompat$Builder;

    .line 231
    .line 232
    .line 233
    move-result-object v9

    .line 234
    iget-object v10, v0, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;->$notification:Lcom/discord/notifications/api/NotificationData;

    .line 235
    .line 236
    iget-object v11, v0, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;->$context:Landroid/content/Context;

    .line 237
    .line 238
    invoke-static {v10, v11}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt;->getTitle(Lcom/discord/notifications/api/NotificationData;Landroid/content/Context;)Ljava/lang/CharSequence;

    .line 239
    .line 240
    .line 241
    move-result-object v10

    .line 242
    invoke-virtual {v9, v10}, Landroidx/core/app/NotificationCompat$Builder;->E(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    .line 243
    .line 244
    .line 245
    move-result-object v9

    .line 246
    invoke-virtual {v9, v7}, Landroidx/core/app/NotificationCompat$Builder;->D(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    .line 247
    .line 248
    .line 249
    move-result-object v9

    .line 250
    iget-object v10, v0, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;->$notification:Lcom/discord/notifications/api/NotificationData;

    .line 251
    .line 252
    invoke-static {v10}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt;->getGroupKey(Lcom/discord/notifications/api/NotificationData;)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v10

    .line 256
    invoke-virtual {v9, v10}, Landroidx/core/app/NotificationCompat$Builder;->J(Ljava/lang/String;)Landroidx/core/app/NotificationCompat$Builder;

    .line 257
    .line 258
    .line 259
    move-result-object v9

    .line 260
    invoke-virtual {v9, v8}, Landroidx/core/app/NotificationCompat$Builder;->P(I)Landroidx/core/app/NotificationCompat$Builder;

    .line 261
    .line 262
    .line 263
    move-result-object v9

    .line 264
    invoke-virtual {v9, v1}, Landroidx/core/app/NotificationCompat$Builder;->L(Landroid/graphics/Bitmap;)Landroidx/core/app/NotificationCompat$Builder;

    .line 265
    .line 266
    .line 267
    move-result-object v9

    .line 268
    iget-object v10, v0, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;->$notification:Lcom/discord/notifications/api/NotificationData;

    .line 269
    .line 270
    iget-object v11, v0, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;->$context:Landroid/content/Context;

    .line 271
    .line 272
    invoke-static {v10, v11}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt;->getDeletePendingIntent(Lcom/discord/notifications/api/NotificationData;Landroid/content/Context;)Landroid/app/PendingIntent;

    .line 273
    .line 274
    .line 275
    move-result-object v10

    .line 276
    invoke-virtual {v9, v10}, Landroidx/core/app/NotificationCompat$Builder;->G(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    .line 277
    .line 278
    .line 279
    move-result-object v9

    .line 280
    iget-object v10, v0, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;->$notification:Lcom/discord/notifications/api/NotificationData;

    .line 281
    .line 282
    iget-object v11, v0, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;->$context:Landroid/content/Context;

    .line 283
    .line 284
    iget-object v12, v0, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;->$notificationDataMap:Ljava/util/Map;

    .line 285
    .line 286
    invoke-static {v10, v11, v12}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt;->getContentPendingIntent(Lcom/discord/notifications/api/NotificationData;Landroid/content/Context;Ljava/util/Map;)Landroid/app/PendingIntent;

    .line 287
    .line 288
    .line 289
    move-result-object v10

    .line 290
    invoke-virtual {v9, v10}, Landroidx/core/app/NotificationCompat$Builder;->C(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    .line 291
    .line 292
    .line 293
    move-result-object v9

    .line 294
    const-string v10, "context.getNotificationB\u2026xt, notificationDataMap))"

    .line 295
    .line 296
    invoke-static {v9, v10}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    iget-object v10, v0, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;->$context:Landroid/content/Context;

    .line 300
    .line 301
    iget-object v11, v0, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;->$behaviors:Lcom/discord/notifications/renderer/NotificationBehaviors;

    .line 302
    .line 303
    iget-object v12, v0, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;->$notification:Lcom/discord/notifications/api/NotificationData;

    .line 304
    .line 305
    invoke-static {v12, v10}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt;->getSound(Lcom/discord/notifications/api/NotificationData;Landroid/content/Context;)Landroid/net/Uri;

    .line 306
    .line 307
    .line 308
    move-result-object v12

    .line 309
    invoke-static {v9, v10, v11, v12}, Lcom/discord/notifications/renderer/utils/NotificationManagerUtilsKt;->setLegacyNotificationBehaviors(Landroidx/core/app/NotificationCompat$Builder;Landroid/content/Context;Lcom/discord/notifications/renderer/NotificationBehaviors;Landroid/net/Uri;)Landroidx/core/app/NotificationCompat$Builder;

    .line 310
    .line 311
    .line 312
    move-result-object v9

    .line 313
    invoke-virtual {v9}, Landroidx/core/app/NotificationCompat$Builder;->h()Landroidx/core/app/NotificationCompat$Builder;

    .line 314
    .line 315
    .line 316
    move-result-object v9

    .line 317
    iget-object v10, v0, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;->$notification:Lcom/discord/notifications/api/NotificationData;

    .line 318
    .line 319
    iget-object v11, v0, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;->$currentUsername:Ljava/lang/String;

    .line 320
    .line 321
    iget-object v12, v0, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;->$context:Landroid/content/Context;

    .line 322
    .line 323
    iget-boolean v13, v0, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;->$makeOrUpdateShortcut:Z

    .line 324
    .line 325
    iget-object v14, v0, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;->$notificationDataMap:Ljava/util/Map;

    .line 326
    .line 327
    invoke-static {v10}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt;->isConversation(Lcom/discord/notifications/api/NotificationData;)Z

    .line 328
    .line 329
    .line 330
    move-result v15

    .line 331
    if-eqz v15, :cond_7

    .line 332
    .line 333
    new-instance v15, Landroidx/core/app/NotificationCompat$MessagingStyle;

    .line 334
    .line 335
    new-instance v6, Landroidx/core/app/Person$c;

    .line 336
    .line 337
    invoke-direct {v6}, Landroidx/core/app/Person$c;-><init>()V

    .line 338
    .line 339
    .line 340
    if-eqz v11, :cond_5

    .line 341
    .line 342
    goto :goto_1

    .line 343
    :cond_5
    sget-object v11, Lcom/discord/react_strings/I18nMessage;->ME:Lcom/discord/react_strings/I18nMessage;

    .line 344
    .line 345
    invoke-static {v12, v11, v5, v3, v5}, Lcom/discord/react_strings/I18nUtilsKt;->i18nFormat$default(Landroid/content/Context;Lcom/discord/react_strings/I18nMessage;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/CharSequence;

    .line 346
    .line 347
    .line 348
    move-result-object v11

    .line 349
    :goto_1
    invoke-virtual {v6, v11}, Landroidx/core/app/Person$c;->f(Ljava/lang/CharSequence;)Landroidx/core/app/Person$c;

    .line 350
    .line 351
    .line 352
    move-result-object v5

    .line 353
    const-string v6, "me"

    .line 354
    .line 355
    invoke-virtual {v5, v6}, Landroidx/core/app/Person$c;->e(Ljava/lang/String;)Landroidx/core/app/Person$c;

    .line 356
    .line 357
    .line 358
    move-result-object v5

    .line 359
    invoke-virtual {v5}, Landroidx/core/app/Person$c;->a()Landroidx/core/app/Person;

    .line 360
    .line 361
    .line 362
    move-result-object v5

    .line 363
    invoke-direct {v15, v5}, Landroidx/core/app/NotificationCompat$MessagingStyle;-><init>(Landroidx/core/app/Person;)V

    .line 364
    .line 365
    .line 366
    invoke-static {v10}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt;->getConversationTitle(Lcom/discord/notifications/api/NotificationData;)Ljava/lang/CharSequence;

    .line 367
    .line 368
    .line 369
    move-result-object v5

    .line 370
    invoke-virtual {v15, v5}, Landroidx/core/app/NotificationCompat$MessagingStyle;->G(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$MessagingStyle;

    .line 371
    .line 372
    .line 373
    move-result-object v5

    .line 374
    invoke-static {v10}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt;->isGroupConversation(Lcom/discord/notifications/api/NotificationData;)Z

    .line 375
    .line 376
    .line 377
    move-result v6

    .line 378
    invoke-virtual {v5, v6}, Landroidx/core/app/NotificationCompat$MessagingStyle;->H(Z)Landroidx/core/app/NotificationCompat$MessagingStyle;

    .line 379
    .line 380
    .line 381
    move-result-object v5

    .line 382
    invoke-static {v10}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt;->getTag(Lcom/discord/notifications/api/NotificationData;)Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v6

    .line 386
    invoke-static {v12, v6}, Lcom/discord/notifications/renderer/utils/NotificationManagerUtilsKt;->getActiveNotification(Landroid/content/Context;Ljava/lang/String;)Landroid/app/Notification;

    .line 387
    .line 388
    .line 389
    move-result-object v6

    .line 390
    if-eqz v6, :cond_6

    .line 391
    .line 392
    invoke-static {v6}, Lcom/discord/notifications/renderer/utils/NotificationManagerUtilsKt;->getMessagingStyle(Landroid/app/Notification;)Landroidx/core/app/NotificationCompat$MessagingStyle;

    .line 393
    .line 394
    .line 395
    move-result-object v6

    .line 396
    if-eqz v6, :cond_6

    .line 397
    .line 398
    invoke-virtual {v6}, Landroidx/core/app/NotificationCompat$MessagingStyle;->B()Ljava/util/List;

    .line 399
    .line 400
    .line 401
    move-result-object v6

    .line 402
    if-eqz v6, :cond_6

    .line 403
    .line 404
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 405
    .line 406
    .line 407
    move-result-object v6

    .line 408
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 409
    .line 410
    .line 411
    move-result v11

    .line 412
    if-eqz v11, :cond_6

    .line 413
    .line 414
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object v11

    .line 418
    check-cast v11, Landroidx/core/app/NotificationCompat$MessagingStyle$a;

    .line 419
    .line 420
    invoke-virtual {v5, v11}, Landroidx/core/app/NotificationCompat$MessagingStyle;->x(Landroidx/core/app/NotificationCompat$MessagingStyle$a;)Landroidx/core/app/NotificationCompat$MessagingStyle;

    .line 421
    .line 422
    .line 423
    goto :goto_2

    .line 424
    :cond_6
    invoke-static {v10}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt;->getSendTime(Lcom/discord/notifications/api/NotificationData;)J

    .line 425
    .line 426
    .line 427
    move-result-wide v3

    .line 428
    invoke-static {v10, v2}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt;->getSenderForMessageNotification(Lcom/discord/notifications/api/NotificationData;Landroid/graphics/Bitmap;)Landroidx/core/app/Person;

    .line 429
    .line 430
    .line 431
    move-result-object v15

    .line 432
    invoke-virtual {v5, v7, v3, v4, v15}, Landroidx/core/app/NotificationCompat$MessagingStyle;->y(Ljava/lang/CharSequence;JLandroidx/core/app/Person;)Landroidx/core/app/NotificationCompat$MessagingStyle;

    .line 433
    .line 434
    .line 435
    invoke-virtual {v9, v5}, Landroidx/core/app/NotificationCompat$Builder;->e0(Landroidx/core/app/NotificationCompat$g;)Landroidx/core/app/NotificationCompat$Builder;

    .line 436
    .line 437
    .line 438
    if-eqz v13, :cond_8

    .line 439
    .line 440
    const-string v3, "builder"

    .line 441
    .line 442
    invoke-static {v9, v3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 443
    .line 444
    .line 445
    invoke-static {v10, v12, v14, v1, v2}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt;->getShortcutInfo(Lcom/discord/notifications/api/NotificationData;Landroid/content/Context;Ljava/util/Map;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)Landroidx/core/content/pm/ShortcutInfoCompat;

    .line 446
    .line 447
    .line 448
    move-result-object v1

    .line 449
    invoke-static {v9, v12, v1}, Lcom/discord/shortcuts/ShortcutUtilsKt;->addShortcut(Landroidx/core/app/NotificationCompat$Builder;Landroid/content/Context;Landroidx/core/content/pm/ShortcutInfoCompat;)Landroidx/core/app/NotificationCompat$Builder;

    .line 450
    .line 451
    .line 452
    goto :goto_3

    .line 453
    :cond_7
    invoke-static {v10}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt;->shouldUseBigText(Lcom/discord/notifications/api/NotificationData;)Z

    .line 454
    .line 455
    .line 456
    move-result v1

    .line 457
    if-eqz v1, :cond_8

    .line 458
    .line 459
    new-instance v1, Landroidx/core/app/NotificationCompat$c;

    .line 460
    .line 461
    invoke-direct {v1}, Landroidx/core/app/NotificationCompat$c;-><init>()V

    .line 462
    .line 463
    .line 464
    invoke-virtual {v1, v7}, Landroidx/core/app/NotificationCompat$c;->x(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$c;

    .line 465
    .line 466
    .line 467
    move-result-object v1

    .line 468
    invoke-virtual {v9, v1}, Landroidx/core/app/NotificationCompat$Builder;->e0(Landroidx/core/app/NotificationCompat$g;)Landroidx/core/app/NotificationCompat$Builder;

    .line 469
    .line 470
    .line 471
    :cond_8
    :goto_3
    const/4 v1, 0x5

    .line 472
    new-array v1, v1, [Landroidx/core/app/NotificationCompat$Action;

    .line 473
    .line 474
    invoke-static {v10, v12}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt;->getMarkAsReadAction(Lcom/discord/notifications/api/NotificationData;Landroid/content/Context;)Landroidx/core/app/NotificationCompat$Action;

    .line 475
    .line 476
    .line 477
    move-result-object v2

    .line 478
    const/4 v3, 0x0

    .line 479
    aput-object v2, v1, v3

    .line 480
    .line 481
    invoke-static {v10, v12}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt;->getDirectReplyAction(Lcom/discord/notifications/api/NotificationData;Landroid/content/Context;)Landroidx/core/app/NotificationCompat$Action;

    .line 482
    .line 483
    .line 484
    move-result-object v2

    .line 485
    const/4 v4, 0x1

    .line 486
    aput-object v2, v1, v4

    .line 487
    .line 488
    invoke-static {v10, v12, v3, v14}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt;->getCallAction(Lcom/discord/notifications/api/NotificationData;Landroid/content/Context;ZLjava/util/Map;)Landroidx/core/app/NotificationCompat$Action;

    .line 489
    .line 490
    .line 491
    move-result-object v2

    .line 492
    const/4 v3, 0x2

    .line 493
    aput-object v2, v1, v3

    .line 494
    .line 495
    const/4 v2, 0x3

    .line 496
    invoke-static {v10, v12, v4, v14}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt;->getCallAction(Lcom/discord/notifications/api/NotificationData;Landroid/content/Context;ZLjava/util/Map;)Landroidx/core/app/NotificationCompat$Action;

    .line 497
    .line 498
    .line 499
    move-result-object v3

    .line 500
    aput-object v3, v1, v2

    .line 501
    .line 502
    const/4 v2, 0x4

    .line 503
    invoke-static {v10, v12, v8}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt;->getTimedMuteAction(Lcom/discord/notifications/api/NotificationData;Landroid/content/Context;I)Landroidx/core/app/NotificationCompat$Action;

    .line 504
    .line 505
    .line 506
    move-result-object v3

    .line 507
    aput-object v3, v1, v2

    .line 508
    .line 509
    invoke-static {v1}, Lkotlin/collections/h;->l([Ljava/lang/Object;)Ljava/util/List;

    .line 510
    .line 511
    .line 512
    move-result-object v1

    .line 513
    new-instance v2, Ljava/util/ArrayList;

    .line 514
    .line 515
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 516
    .line 517
    .line 518
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 519
    .line 520
    .line 521
    move-result-object v1

    .line 522
    :cond_9
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 523
    .line 524
    .line 525
    move-result v3

    .line 526
    if-eqz v3, :cond_a

    .line 527
    .line 528
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 529
    .line 530
    .line 531
    move-result-object v3

    .line 532
    check-cast v3, Landroidx/core/app/NotificationCompat$Action;

    .line 533
    .line 534
    invoke-virtual {v9, v3}, Landroidx/core/app/NotificationCompat$Builder;->b(Landroidx/core/app/NotificationCompat$Action;)Landroidx/core/app/NotificationCompat$Builder;

    .line 535
    .line 536
    .line 537
    move-result-object v3

    .line 538
    if-eqz v3, :cond_9

    .line 539
    .line 540
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 541
    .line 542
    .line 543
    goto :goto_4

    .line 544
    :cond_a
    const-string v1, "context.getNotificationB\u2026n(action) }\n            }"

    .line 545
    .line 546
    invoke-static {v9, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 547
    .line 548
    .line 549
    iget-object v1, v0, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;->$context:Landroid/content/Context;

    .line 550
    .line 551
    invoke-static {v1}, Lcom/discord/notifications/renderer/utils/NotificationManagerUtilsKt;->getNotificationManagerCompat(Landroid/content/Context;)Landroidx/core/app/NotificationManagerCompat;

    .line 552
    .line 553
    .line 554
    move-result-object v1

    .line 555
    iget-object v2, v0, Lcom/discord/notifications/renderer/NotificationRenderer$display$1;->$notification:Lcom/discord/notifications/api/NotificationData;

    .line 556
    .line 557
    invoke-static {v2}, Lcom/discord/notifications/renderer/utils/NotificationDataUtilsKt;->getTag(Lcom/discord/notifications/api/NotificationData;)Ljava/lang/String;

    .line 558
    .line 559
    .line 560
    move-result-object v2

    .line 561
    invoke-static {v1, v2, v9}, Lcom/discord/notifications/renderer/utils/NotificationManagerUtilsKt;->notify(Landroidx/core/app/NotificationManagerCompat;Ljava/lang/String;Landroidx/core/app/NotificationCompat$Builder;)V

    .line 562
    .line 563
    .line 564
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 565
    .line 566
    return-object v1
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
.end method
