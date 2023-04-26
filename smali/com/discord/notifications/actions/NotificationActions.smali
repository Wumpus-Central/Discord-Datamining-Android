.class public final Lcom/discord/notifications/actions/NotificationActions;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/notifications/actions/NotificationActions$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008H\u0016\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/discord/notifications/actions/NotificationActions;",
        "Landroid/content/BroadcastReceiver;",
        "()V",
        "onReceive",
        "",
        "context",
        "Landroid/content/Context;",
        "intent",
        "Landroid/content/Intent;",
        "Companion",
        "notification_actions_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final ACTION:Ljava/lang/String; = "com.discord.intent.action.NOTIFICATION_ACTION"

.field public static final Companion:Lcom/discord/notifications/actions/NotificationActions$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/discord/notifications/actions/NotificationActions$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/notifications/actions/NotificationActions$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/notifications/actions/NotificationActions;->Companion:Lcom/discord/notifications/actions/NotificationActions$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "intent"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lcom/discord/notifications/actions/intents/NotificationAction;->Companion:Lcom/discord/notifications/actions/intents/NotificationAction$Companion;

    .line 12
    .line 13
    const-class v0, Lcom/discord/notifications/actions/intents/MarkAsReadAction;

    .line 14
    .line 15
    invoke-static {v0}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {p2, v0}, Lcom/discord/misc/utilities/intent/IntentUtilsKt;->hasExtra(Landroid/content/Intent;Lkotlin/reflect/KClass;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v1, 0x0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-static {p2}, Lcom/discord/misc/utilities/intent/IntentUtilsKt;->getIntentParcelable(Landroid/content/Intent;)Landroid/os/Parcelable;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Lcom/discord/notifications/actions/intents/NotificationAction;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move-object v0, v1

    .line 34
    :goto_0
    check-cast v0, Lcom/discord/notifications/actions/intents/MarkAsReadAction;

    .line 35
    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    goto/16 :goto_5

    .line 39
    .line 40
    :cond_1
    const-class v0, Lcom/discord/notifications/actions/intents/MuteAction;

    .line 41
    .line 42
    invoke-static {v0}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-static {p2, v0}, Lcom/discord/misc/utilities/intent/IntentUtilsKt;->hasExtra(Landroid/content/Intent;Lkotlin/reflect/KClass;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    invoke-static {p2}, Lcom/discord/misc/utilities/intent/IntentUtilsKt;->getIntentParcelable(Landroid/content/Intent;)Landroid/os/Parcelable;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, Lcom/discord/notifications/actions/intents/NotificationAction;

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    move-object v0, v1

    .line 60
    :goto_1
    check-cast v0, Lcom/discord/notifications/actions/intents/MuteAction;

    .line 61
    .line 62
    if-eqz v0, :cond_3

    .line 63
    .line 64
    goto :goto_5

    .line 65
    :cond_3
    const-class v0, Lcom/discord/notifications/actions/intents/DismissCallAction;

    .line 66
    .line 67
    invoke-static {v0}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-static {p2, v0}, Lcom/discord/misc/utilities/intent/IntentUtilsKt;->hasExtra(Landroid/content/Intent;Lkotlin/reflect/KClass;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_4

    .line 76
    .line 77
    invoke-static {p2}, Lcom/discord/misc/utilities/intent/IntentUtilsKt;->getIntentParcelable(Landroid/content/Intent;)Landroid/os/Parcelable;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    check-cast v0, Lcom/discord/notifications/actions/intents/NotificationAction;

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_4
    move-object v0, v1

    .line 85
    :goto_2
    check-cast v0, Lcom/discord/notifications/actions/intents/DismissCallAction;

    .line 86
    .line 87
    if-eqz v0, :cond_5

    .line 88
    .line 89
    goto :goto_5

    .line 90
    :cond_5
    const-class v0, Lcom/discord/notifications/actions/intents/DirectReplyAction;

    .line 91
    .line 92
    invoke-static {v0}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-static {p2, v0}, Lcom/discord/misc/utilities/intent/IntentUtilsKt;->hasExtra(Landroid/content/Intent;Lkotlin/reflect/KClass;)Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-eqz v0, :cond_6

    .line 101
    .line 102
    invoke-static {p2}, Lcom/discord/misc/utilities/intent/IntentUtilsKt;->getIntentParcelable(Landroid/content/Intent;)Landroid/os/Parcelable;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    check-cast v0, Lcom/discord/notifications/actions/intents/NotificationAction;

    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_6
    move-object v0, v1

    .line 110
    :goto_3
    check-cast v0, Lcom/discord/notifications/actions/intents/DirectReplyAction;

    .line 111
    .line 112
    if-eqz v0, :cond_7

    .line 113
    .line 114
    goto :goto_5

    .line 115
    :cond_7
    const-class v0, Lcom/discord/notifications/actions/intents/DeleteAction;

    .line 116
    .line 117
    invoke-static {v0}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-static {p2, v0}, Lcom/discord/misc/utilities/intent/IntentUtilsKt;->hasExtra(Landroid/content/Intent;Lkotlin/reflect/KClass;)Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    if-eqz v0, :cond_8

    .line 126
    .line 127
    invoke-static {p2}, Lcom/discord/misc/utilities/intent/IntentUtilsKt;->getIntentParcelable(Landroid/content/Intent;)Landroid/os/Parcelable;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    check-cast v0, Lcom/discord/notifications/actions/intents/NotificationAction;

    .line 132
    .line 133
    goto :goto_4

    .line 134
    :cond_8
    move-object v0, v1

    .line 135
    :goto_4
    check-cast v0, Lcom/discord/notifications/actions/intents/DeleteAction;

    .line 136
    .line 137
    if-eqz v0, :cond_9

    .line 138
    .line 139
    goto :goto_5

    .line 140
    :cond_9
    const-class v0, Lcom/discord/notifications/actions/intents/GenericAction;

    .line 141
    .line 142
    invoke-static {v0}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-static {p2, v0}, Lcom/discord/misc/utilities/intent/IntentUtilsKt;->hasExtra(Landroid/content/Intent;Lkotlin/reflect/KClass;)Z

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    if-eqz v0, :cond_a

    .line 151
    .line 152
    invoke-static {p2}, Lcom/discord/misc/utilities/intent/IntentUtilsKt;->getIntentParcelable(Landroid/content/Intent;)Landroid/os/Parcelable;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    move-object v1, v0

    .line 157
    check-cast v1, Lcom/discord/notifications/actions/intents/NotificationAction;

    .line 158
    .line 159
    :cond_a
    move-object v0, v1

    .line 160
    :goto_5
    if-eqz v0, :cond_b

    .line 161
    .line 162
    invoke-interface {v0, p1, p2}, Lcom/discord/notifications/actions/intents/NotificationAction;->onNotificationAction(Landroid/content/Context;Landroid/content/Intent;)V

    .line 163
    .line 164
    .line 165
    invoke-interface {v0, p1}, Lcom/discord/notifications/actions/intents/NotificationAction;->onNotificationActionComplete(Landroid/content/Context;)V

    .line 166
    .line 167
    .line 168
    :cond_b
    return-void
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
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
.end method
