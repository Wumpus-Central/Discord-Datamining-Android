.class public final Lcom/discord/chat/input/ChatInputManagerModule$replaceRange$$inlined$uiManagerResolveView$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/uimanager/UIBlock;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/chat/input/ChatInputManagerModule;->replaceRange(IIILjava/lang/String;Lcom/facebook/react/bridge/ReadableArray;ZLjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0000\u001a\u00020\u0001\"\n\u0008\u0000\u0010\u0002\u0018\u0001*\u00020\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n\u00a2\u0006\u0002\u0008\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "<anonymous>",
        "",
        "T",
        "Landroid/view/View;",
        "nativeViewHierarchyManager",
        "Lcom/facebook/react/uimanager/NativeViewHierarchyManager;",
        "kotlin.jvm.PlatformType",
        "execute",
        "com/discord/react/utilities/ReactContextExtensionsKt$uiManagerResolveView$1"
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
.field final synthetic $editId$inlined:Ljava/lang/String;

.field final synthetic $keepCursorPosition$inlined:Z

.field final synthetic $length$inlined:I

.field final synthetic $location$inlined:I

.field final synthetic $styleBlocks$inlined:Lcom/facebook/react/bridge/ReadableArray;

.field final synthetic $tag:I

.field final synthetic $text$inlined:Ljava/lang/String;

.field final synthetic this$0:Lcom/discord/chat/input/ChatInputManagerModule;


# direct methods
.method public constructor <init>(IIILjava/lang/String;Lcom/discord/chat/input/ChatInputManagerModule;Lcom/facebook/react/bridge/ReadableArray;ZLjava/lang/String;)V
    .locals 0

    iput p1, p0, Lcom/discord/chat/input/ChatInputManagerModule$replaceRange$$inlined$uiManagerResolveView$1;->$tag:I

    iput p2, p0, Lcom/discord/chat/input/ChatInputManagerModule$replaceRange$$inlined$uiManagerResolveView$1;->$location$inlined:I

    iput p3, p0, Lcom/discord/chat/input/ChatInputManagerModule$replaceRange$$inlined$uiManagerResolveView$1;->$length$inlined:I

    iput-object p4, p0, Lcom/discord/chat/input/ChatInputManagerModule$replaceRange$$inlined$uiManagerResolveView$1;->$text$inlined:Ljava/lang/String;

    iput-object p5, p0, Lcom/discord/chat/input/ChatInputManagerModule$replaceRange$$inlined$uiManagerResolveView$1;->this$0:Lcom/discord/chat/input/ChatInputManagerModule;

    iput-object p6, p0, Lcom/discord/chat/input/ChatInputManagerModule$replaceRange$$inlined$uiManagerResolveView$1;->$styleBlocks$inlined:Lcom/facebook/react/bridge/ReadableArray;

    iput-boolean p7, p0, Lcom/discord/chat/input/ChatInputManagerModule$replaceRange$$inlined$uiManagerResolveView$1;->$keepCursorPosition$inlined:Z

    iput-object p8, p0, Lcom/discord/chat/input/ChatInputManagerModule$replaceRange$$inlined$uiManagerResolveView$1;->$editId$inlined:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final execute(Lcom/facebook/react/uimanager/NativeViewHierarchyManager;)V
    .locals 7

    .line 1
    iget v0, p0, Lcom/discord/chat/input/ChatInputManagerModule$replaceRange$$inlined$uiManagerResolveView$1;->$tag:I

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lcom/facebook/react/uimanager/NativeViewHierarchyManager;->resolveView(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    move-object v0, p1

    .line 10
    check-cast v0, Lcom/discord/chat/input/views/ChatInputRootView;

    .line 11
    .line 12
    iget v1, p0, Lcom/discord/chat/input/ChatInputManagerModule$replaceRange$$inlined$uiManagerResolveView$1;->$location$inlined:I

    .line 13
    .line 14
    iget v2, p0, Lcom/discord/chat/input/ChatInputManagerModule$replaceRange$$inlined$uiManagerResolveView$1;->$length$inlined:I

    .line 15
    .line 16
    iget-object v3, p0, Lcom/discord/chat/input/ChatInputManagerModule$replaceRange$$inlined$uiManagerResolveView$1;->$text$inlined:Ljava/lang/String;

    .line 17
    .line 18
    iget-object p1, p0, Lcom/discord/chat/input/ChatInputManagerModule$replaceRange$$inlined$uiManagerResolveView$1;->this$0:Lcom/discord/chat/input/ChatInputManagerModule;

    .line 19
    .line 20
    iget-object v4, p0, Lcom/discord/chat/input/ChatInputManagerModule$replaceRange$$inlined$uiManagerResolveView$1;->$styleBlocks$inlined:Lcom/facebook/react/bridge/ReadableArray;

    .line 21
    .line 22
    invoke-static {p1, v4}, Lcom/discord/chat/input/ChatInputManagerModule;->access$toStyleBlocks(Lcom/discord/chat/input/ChatInputManagerModule;Lcom/facebook/react/bridge/ReadableArray;)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    iget-boolean v5, p0, Lcom/discord/chat/input/ChatInputManagerModule$replaceRange$$inlined$uiManagerResolveView$1;->$keepCursorPosition$inlined:Z

    .line 27
    .line 28
    iget-object v6, p0, Lcom/discord/chat/input/ChatInputManagerModule$replaceRange$$inlined$uiManagerResolveView$1;->$editId$inlined:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual/range {v0 .. v6}, Lcom/discord/chat/input/views/ChatInputRootView;->replaceRange(IILjava/lang/String;Ljava/util/List;ZLjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 35
    .line 36
    const-string v0, "null cannot be cast to non-null type com.discord.chat.input.views.ChatInputRootView"

    .line 37
    .line 38
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw p1
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