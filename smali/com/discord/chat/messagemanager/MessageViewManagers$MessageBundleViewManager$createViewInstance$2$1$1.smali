.class final Lcom/discord/chat/messagemanager/MessageViewManagers$MessageBundleViewManager$createViewInstance$2$1$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/chat/messagemanager/MessageViewManagers$MessageBundleViewManager;->createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/discord/misc/utilities/measure/ViewMeasuringWrapper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/discord/primitives/MessageId;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "messageId",
        "Lcom/discord/primitives/MessageId;",
        "invoke-1xi1bu0",
        "(Ljava/lang/String;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $this_apply:Lcom/discord/chat/presentation/list/messagebundling/MessageBundleView;

.field final synthetic $wrapper:Lcom/discord/misc/utilities/measure/ViewMeasuringWrapper;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/discord/misc/utilities/measure/ViewMeasuringWrapper<",
            "Lcom/discord/chat/presentation/list/messagebundling/MessageBundleView;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/discord/chat/messagemanager/MessageViewManagers$MessageBundleViewManager;


# direct methods
.method constructor <init>(Lcom/discord/chat/messagemanager/MessageViewManagers$MessageBundleViewManager;Lcom/discord/chat/presentation/list/messagebundling/MessageBundleView;Lcom/discord/misc/utilities/measure/ViewMeasuringWrapper;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/chat/messagemanager/MessageViewManagers$MessageBundleViewManager;",
            "Lcom/discord/chat/presentation/list/messagebundling/MessageBundleView;",
            "Lcom/discord/misc/utilities/measure/ViewMeasuringWrapper<",
            "Lcom/discord/chat/presentation/list/messagebundling/MessageBundleView;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/discord/chat/messagemanager/MessageViewManagers$MessageBundleViewManager$createViewInstance$2$1$1;->this$0:Lcom/discord/chat/messagemanager/MessageViewManagers$MessageBundleViewManager;

    iput-object p2, p0, Lcom/discord/chat/messagemanager/MessageViewManagers$MessageBundleViewManager$createViewInstance$2$1$1;->$this_apply:Lcom/discord/chat/presentation/list/messagebundling/MessageBundleView;

    iput-object p3, p0, Lcom/discord/chat/messagemanager/MessageViewManagers$MessageBundleViewManager$createViewInstance$2$1$1;->$wrapper:Lcom/discord/misc/utilities/measure/ViewMeasuringWrapper;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/discord/primitives/MessageId;

    invoke-virtual {p1}, Lcom/discord/primitives/MessageId;->unbox-impl()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/discord/chat/messagemanager/MessageViewManagers$MessageBundleViewManager$createViewInstance$2$1$1;->invoke-1xi1bu0(Ljava/lang/String;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke-1xi1bu0(Ljava/lang/String;)V
    .locals 3

    .line 1
    const-string v0, "messageId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/discord/chat/messagemanager/MessageViewManagers$MessageBundleViewManager$createViewInstance$2$1$1;->this$0:Lcom/discord/chat/messagemanager/MessageViewManagers$MessageBundleViewManager;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/discord/chat/messagemanager/MessageViewManagers$MessageBundleViewManager$createViewInstance$2$1$1;->$this_apply:Lcom/discord/chat/presentation/list/messagebundling/MessageBundleView;

    .line 9
    .line 10
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const-string v2, "context"

    .line 15
    .line 16
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget-object v2, p0, Lcom/discord/chat/messagemanager/MessageViewManagers$MessageBundleViewManager$createViewInstance$2$1$1;->$wrapper:Lcom/discord/misc/utilities/measure/ViewMeasuringWrapper;

    .line 20
    .line 21
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-static {v0, v1, v2, p1}, Lcom/discord/chat/messagemanager/MessageViewManagers$MessageBundleViewManager;->access$emitOnTruncateMessage-JPrav84(Lcom/discord/chat/messagemanager/MessageViewManagers$MessageBundleViewManager;Landroid/content/Context;ILjava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-void
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
    .line 252
.end method
