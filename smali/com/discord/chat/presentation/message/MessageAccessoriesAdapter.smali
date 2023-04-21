.class public final Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$MessageContentViewLifecycleListener;,
        Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$ViewTypes;,
        Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0002BCB\u0015\u0012\u000c\u00103\u001a\u0008\u0012\u0004\u0012\u00020\u000e02\u00a2\u0006\u0004\u0008@\u0010AJM\u0010\u0011\u001a\u00020\u000e*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00072\u0008\u0010\n\u001a\u0004\u0018\u00010\t2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J=\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u0016H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u000e\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001cJ\u0010\u0010!\u001a\u00020\u000e2\u0008\u0010 \u001a\u0004\u0018\u00010\u001fJ\u000e\u0010$\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\"J\u0010\u0010&\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u0002H\u0016J\u0010\u0010\'\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u0002H\u0016J\u0018\u0010+\u001a\u00020\u00022\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u0005H\u0016J\u0018\u0010-\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u0005H\u0016J\u0008\u0010.\u001a\u00020\u0005H\u0016J\u0010\u0010/\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u0005H\u0016J\u0010\u00101\u001a\u0002002\u0006\u0010,\u001a\u00020\u0005H\u0016R\u001a\u00103\u001a\u0008\u0012\u0004\u0012\u00020\u000e028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00083\u00104R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u001d\u00105R\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008 \u00106R\u001c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0018\u00107R!\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e\u00f8\u0001\u0001\u00f8\u0001\u0000\u00f8\u0001\u0002\u00a2\u0006\u0006\n\u0004\u0008\u0004\u00108R!\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e\u00f8\u0001\u0001\u00f8\u0001\u0000\u00f8\u0001\u0002\u00a2\u0006\u0006\n\u0004\u0008\u0013\u00109R!\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e\u00f8\u0001\u0001\u00f8\u0001\u0000\u00f8\u0001\u0002\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010:R\u0016\u0010;\u001a\u00020\"8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008;\u0010<R\"\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0=8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008>\u0010?\u0082\u0002\u000f\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\n\u0002\u0008!\u00a8\u0006D"
    }
    d2 = {
        "Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;",
        "Landroidx/recyclerview/widget/RecyclerView$Adapter;",
        "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;",
        "Lcom/discord/primitives/MessageId;",
        "messageId",
        "",
        "attachmentIndex",
        "",
        "type",
        "",
        "portal",
        "embedIndex",
        "Lcom/discord/chat/reactevents/ViewResizeMode;",
        "viewResizeMode",
        "",
        "onMediaClicked-l3ndG-o",
        "(Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Lcom/discord/chat/reactevents/ViewResizeMode;)V",
        "onMediaClicked",
        "Lcom/discord/primitives/ChannelId;",
        "channelId",
        "Lcom/discord/primitives/GuildId;",
        "guildId",
        "",
        "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;",
        "items",
        "setItems-bo5iIEc",
        "(Ljava/lang/String;JLcom/discord/primitives/GuildId;Ljava/util/List;)V",
        "setItems",
        "Lcom/discord/chat/presentation/events/ChatEventHandler;",
        "eventHandler",
        "setEventHandler",
        "Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;",
        "botComponentProvider",
        "setComponentProvider",
        "Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$MessageContentViewLifecycleListener;",
        "listener",
        "setMessageContentViewLifecycleListener",
        "holder",
        "onViewAttachedToWindow",
        "onViewDetachedFromWindow",
        "Landroid/view/ViewGroup;",
        "parent",
        "viewType",
        "onCreateViewHolder",
        "position",
        "onBindViewHolder",
        "getItemCount",
        "getItemViewType",
        "",
        "getItemId",
        "Lkotlin/Function0;",
        "measureAndLayout",
        "Lkotlin/jvm/functions/Function0;",
        "Lcom/discord/chat/presentation/events/ChatEventHandler;",
        "Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;",
        "Ljava/util/List;",
        "Ljava/lang/String;",
        "Lcom/discord/primitives/ChannelId;",
        "Lcom/discord/primitives/GuildId;",
        "messageContentViewLifecycleListener",
        "Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$MessageContentViewLifecycleListener;",
        "Lkotlin/Function1;",
        "onTapSpoiler",
        "Lkotlin/jvm/functions/Function1;",
        "<init>",
        "(Lkotlin/jvm/functions/Function0;)V",
        "MessageContentViewLifecycleListener",
        "ViewTypes",
        "chat_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private botComponentProvider:Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;

.field private channelId:Lcom/discord/primitives/ChannelId;

.field private eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;

.field private guildId:Lcom/discord/primitives/GuildId;

.field private items:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;",
            ">;"
        }
    .end annotation
.end field

.field private final measureAndLayout:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private messageContentViewLifecycleListener:Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$MessageContentViewLifecycleListener;

.field private messageId:Ljava/lang/String;

.field private onTapSpoiler:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "measureAndLayout"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->measureAndLayout:Lkotlin/jvm/functions/Function0;

    .line 10
    .line 11
    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->items:Ljava/util/List;

    .line 16
    .line 17
    new-instance p1, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onTapSpoiler$1;

    .line 18
    .line 19
    invoke-direct {p1, p0}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onTapSpoiler$1;-><init>(Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->onTapSpoiler:Lkotlin/jvm/functions/Function1;

    .line 23
    .line 24
    const/4 p1, 0x1

    .line 25
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->setHasStableIds(Z)V

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

.method public static synthetic a(Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->onBindViewHolder$lambda$1(Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic access$getChannelId$p(Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;)Lcom/discord/primitives/ChannelId;
    .locals 0

    iget-object p0, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->channelId:Lcom/discord/primitives/ChannelId;

    return-object p0
.end method

.method public static final synthetic access$getEventHandler$p(Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;)Lcom/discord/chat/presentation/events/ChatEventHandler;
    .locals 0

    iget-object p0, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;

    return-object p0
.end method

.method public static final synthetic access$getMeasureAndLayout$p(Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;)Lkotlin/jvm/functions/Function0;
    .locals 0

    iget-object p0, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->measureAndLayout:Lkotlin/jvm/functions/Function0;

    return-object p0
.end method

.method public static final synthetic access$getMessageId$p(Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->messageId:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getOnTapSpoiler$p(Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;)Lkotlin/jvm/functions/Function1;
    .locals 0

    iget-object p0, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->onTapSpoiler:Lkotlin/jvm/functions/Function1;

    return-object p0
.end method

.method public static final synthetic access$onMediaClicked-l3ndG-o(Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Lcom/discord/chat/reactevents/ViewResizeMode;)V
    .locals 0

    invoke-direct/range {p0 .. p7}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->onMediaClicked-l3ndG-o(Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Lcom/discord/chat/reactevents/ViewResizeMode;)V

    return-void
.end method

.method public static synthetic b(Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->onBindViewHolder$lambda$0(Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic c(Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->onBindViewHolder$lambda$6(Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic d(Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->onBindViewHolder$lambda$2(Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic e(Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->onBindViewHolder$lambda$4(Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic f(Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->onBindViewHolder$lambda$3(Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic g(Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->onBindViewHolder$lambda$5(Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;Landroid/view/View;)V

    return-void
.end method

.method private static final onBindViewHolder$lambda$0(Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;Landroid/view/View;)V
    .locals 8

    .line 1
    const-string p3, "$part"

    .line 2
    .line 3
    invoke-static {p0, p3}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p3, "this$0"

    .line 7
    .line 8
    invoke-static {p1, p3}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p3, "$holder"

    .line 12
    .line 13
    invoke-static {p2, p3}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;->getMessageId-3Eiw7ao()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast p0, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;

    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->getAttachmentIndex()I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    sget-object v7, Lcom/discord/chat/reactevents/ViewResizeMode;->Fill:Lcom/discord/chat/reactevents/ViewResizeMode;

    .line 27
    .line 28
    const-string v4, "attachment"

    .line 29
    .line 30
    const/4 v5, 0x0

    .line 31
    const/4 v6, 0x0

    .line 32
    move-object v0, p1

    .line 33
    move-object v1, p2

    .line 34
    invoke-direct/range {v0 .. v7}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->onMediaClicked-l3ndG-o(Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Lcom/discord/chat/reactevents/ViewResizeMode;)V

    .line 35
    .line 36
    .line 37
    return-void
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
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
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
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
.end method

.method private static final onBindViewHolder$lambda$1(Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;Landroid/view/View;)V
    .locals 6

    .line 1
    const-string p1, "this$0"

    .line 2
    .line 3
    invoke-static {p0, p1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    const-string p1, "eventHandler"

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    :cond_0
    move-object v0, p1

    .line 17
    iget-object v1, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->messageId:Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {v1}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    const/4 v3, 0x0

    .line 24
    const/4 v4, 0x4

    .line 25
    const/4 v5, 0x0

    .line 26
    invoke-static/range {v0 .. v5}, Lcom/discord/chat/presentation/events/ChatEventHandler$DefaultImpls;->onTapReaction-u7_MRrM$default(Lcom/discord/chat/presentation/events/ChatEventHandler;Ljava/lang/String;Lcom/discord/reactions/ReactionView$Reaction;Ljava/lang/Boolean;ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-void
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
.end method

.method private static final onBindViewHolder$lambda$2(Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;Landroid/view/View;)V
    .locals 2

    .line 1
    const-string p1, "this$0"

    .line 2
    .line 3
    invoke-static {p0, p1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    const-string p1, "eventHandler"

    .line 12
    .line 13
    invoke-static {p1}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    move-object p1, v0

    .line 17
    :cond_0
    iget-object p0, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->messageId:Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {p0}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 23
    .line 24
    invoke-interface {p1, p0, v0, v1}, Lcom/discord/chat/presentation/events/ChatEventHandler;->onTapReaction-u7_MRrM(Ljava/lang/String;Lcom/discord/reactions/ReactionView$Reaction;Ljava/lang/Boolean;)V

    .line 25
    .line 26
    .line 27
    return-void
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
.end method

.method private static final onBindViewHolder$lambda$3(Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;Landroid/view/View;)V
    .locals 3

    .line 1
    const-string p1, "this$0"

    .line 2
    .line 3
    invoke-static {p0, p1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    const-string p1, "eventHandler"

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    :cond_0
    iget-object v0, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->messageId:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iget-object p0, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->channelId:Lcom/discord/primitives/ChannelId;

    .line 22
    .line 23
    invoke-static {p0}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/discord/primitives/ChannelId;->unbox-impl()J

    .line 27
    .line 28
    .line 29
    move-result-wide v1

    .line 30
    invoke-interface {p1, v0, v1, v2}, Lcom/discord/chat/presentation/events/ChatEventHandler;->onTapFollowForumPost-pfaIj0E(Ljava/lang/String;J)V

    .line 31
    .line 32
    .line 33
    return-void
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
.end method

.method private static final onBindViewHolder$lambda$4(Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;Landroid/view/View;)V
    .locals 4

    .line 1
    const-string p1, "this$0"

    .line 2
    .line 3
    invoke-static {p0, p1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    const-string p1, "eventHandler"

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    :cond_0
    iget-object v0, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->channelId:Lcom/discord/primitives/ChannelId;

    .line 17
    .line 18
    invoke-static {v0}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/discord/primitives/ChannelId;->unbox-impl()J

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    iget-object p0, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->guildId:Lcom/discord/primitives/GuildId;

    .line 26
    .line 27
    invoke-static {p0}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/discord/primitives/GuildId;->unbox-impl()J

    .line 31
    .line 32
    .line 33
    move-result-wide v2

    .line 34
    invoke-interface {p1, v0, v1, v2, v3}, Lcom/discord/chat/presentation/events/ChatEventHandler;->onTapShareForumPost-mgk6anA(JJ)V

    .line 35
    .line 36
    .line 37
    return-void
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
.end method

.method private static final onBindViewHolder$lambda$5(Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;Landroid/view/View;)V
    .locals 6

    .line 1
    const-string p1, "this$0"

    .line 2
    .line 3
    invoke-static {p0, p1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    const-string p1, "eventHandler"

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    :cond_0
    move-object v0, p1

    .line 17
    iget-object v1, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->messageId:Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {v1}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    const/4 v3, 0x0

    .line 24
    const/4 v4, 0x4

    .line 25
    const/4 v5, 0x0

    .line 26
    invoke-static/range {v0 .. v5}, Lcom/discord/chat/presentation/events/ChatEventHandler$DefaultImpls;->onTapReaction-u7_MRrM$default(Lcom/discord/chat/presentation/events/ChatEventHandler;Ljava/lang/String;Lcom/discord/reactions/ReactionView$Reaction;Ljava/lang/Boolean;ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-void
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
.end method

.method private static final onBindViewHolder$lambda$6(Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;Landroid/view/View;)V
    .locals 3

    .line 1
    const-string p1, "this$0"

    .line 2
    .line 3
    invoke-static {p0, p1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    const-string p1, "eventHandler"

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    :cond_0
    iget-object v0, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->messageId:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iget-object p0, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->channelId:Lcom/discord/primitives/ChannelId;

    .line 22
    .line 23
    invoke-static {p0}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/discord/primitives/ChannelId;->unbox-impl()J

    .line 27
    .line 28
    .line 29
    move-result-wide v1

    .line 30
    invoke-interface {p1, v0, v1, v2}, Lcom/discord/chat/presentation/events/ChatEventHandler;->onTapReactionOverflow-pfaIj0E(Ljava/lang/String;J)V

    .line 31
    .line 32
    .line 33
    return-void
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
.end method

.method private final onMediaClicked-l3ndG-o(Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Lcom/discord/chat/reactevents/ViewResizeMode;)V
    .locals 15

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 4
    .line 5
    const-string v2, "itemView"

    .line 6
    .line 7
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v1}, Lcom/discord/misc/utilities/view/ViewLocationUtilsKt;->getLocationInWindow(Landroid/view/View;)Landroid/graphics/Point;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    move-object v2, p0

    .line 15
    iget-object v3, v2, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;

    .line 16
    .line 17
    if-nez v3, :cond_0

    .line 18
    .line 19
    const-string v3, "eventHandler"

    .line 20
    .line 21
    invoke-static {v3}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    :cond_0
    move-object v4, v3

    .line 26
    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 27
    .line 28
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    .line 29
    .line 30
    .line 31
    move-result v8

    .line 32
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 33
    .line 34
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 35
    .line 36
    .line 37
    move-result v9

    .line 38
    iget v10, v1, Landroid/graphics/Point;->x:I

    .line 39
    .line 40
    iget v11, v1, Landroid/graphics/Point;->y:I

    .line 41
    .line 42
    move-object/from16 v5, p2

    .line 43
    .line 44
    move/from16 v6, p3

    .line 45
    .line 46
    move-object/from16 v7, p4

    .line 47
    .line 48
    move-object/from16 v12, p7

    .line 49
    .line 50
    move-object/from16 v13, p5

    .line 51
    .line 52
    move-object/from16 v14, p6

    .line 53
    .line 54
    invoke-interface/range {v4 .. v14}, Lcom/discord/chat/presentation/events/ChatEventHandler;->onTapImage-a6FnO-k(Ljava/lang/String;ILjava/lang/String;IIIILcom/discord/chat/reactevents/ViewResizeMode;Ljava/lang/Double;Ljava/lang/Integer;)V

    .line 55
    .line 56
    .line 57
    return-void
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
.end method


# virtual methods
.method public getItemCount()I
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->items:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItemId(I)J
    .locals 2

    iget-object v0, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->items:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;

    invoke-virtual {p1}, Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;->getItemId()Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public getItemViewType(I)I
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->items:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;

    .line 2
    instance-of v0, p1, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    goto/16 :goto_0

    .line 3
    :cond_0
    instance-of v0, p1, Lcom/discord/chat/presentation/message/messagepart/GiftMessageAccessory;

    if-eqz v0, :cond_1

    const/16 v1, 0x10

    goto/16 :goto_0

    .line 4
    :cond_1
    instance-of v0, p1, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;

    if-eqz v0, :cond_2

    const/4 v1, 0x0

    goto/16 :goto_0

    .line 5
    :cond_2
    instance-of v0, p1, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;

    const/4 v2, 0x2

    if-eqz v0, :cond_3

    move v1, v2

    goto/16 :goto_0

    .line 6
    :cond_3
    instance-of v0, p1, Lcom/discord/chat/presentation/message/messagepart/UploadProgressMessageAccessory;

    const/4 v3, 0x3

    if-eqz v0, :cond_4

    move v1, v3

    goto/16 :goto_0

    .line 7
    :cond_4
    instance-of v0, p1, Lcom/discord/chat/presentation/message/messagepart/GuildInviteMessageAccessory;

    if-eqz v0, :cond_5

    const/4 v1, 0x5

    goto/16 :goto_0

    .line 8
    :cond_5
    instance-of v0, p1, Lcom/discord/chat/presentation/message/messagepart/ActivityLauncherMessageAccessory;

    if-eqz v0, :cond_6

    const/16 v1, 0x1e

    goto/16 :goto_0

    .line 9
    :cond_6
    instance-of v0, p1, Lcom/discord/chat/presentation/message/messagepart/EmbeddedActivityInviteMessageAccessory;

    if-eqz v0, :cond_7

    const/16 v1, 0x1f

    goto/16 :goto_0

    .line 10
    :cond_7
    instance-of v0, p1, Lcom/discord/chat/presentation/message/messagepart/GuildInviteDisabledMessageAccessory;

    if-eqz v0, :cond_8

    const/16 v1, 0x19

    goto/16 :goto_0

    .line 11
    :cond_8
    instance-of v0, p1, Lcom/discord/chat/presentation/message/messagepart/GuildEventInviteMessageAccessory;

    if-eqz v0, :cond_9

    const/16 v1, 0xf

    goto/16 :goto_0

    .line 12
    :cond_9
    instance-of v0, p1, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;

    const/4 v4, 0x4

    if-eqz v0, :cond_a

    move v1, v4

    goto/16 :goto_0

    .line 13
    :cond_a
    instance-of v0, p1, Lcom/discord/chat/presentation/message/messagepart/StickerMessageAccessory;

    if-eqz v0, :cond_f

    .line 14
    check-cast p1, Lcom/discord/chat/presentation/message/messagepart/StickerMessageAccessory;

    invoke-virtual {p1}, Lcom/discord/chat/presentation/message/messagepart/StickerMessageAccessory;->getSticker()Lcom/discord/chat/bridge/sticker/Sticker;

    move-result-object p1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/sticker/Sticker;->getFormatType()Lcom/discord/chat/bridge/sticker/StickerFormatType;

    move-result-object p1

    sget-object v0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    if-eq p1, v1, :cond_e

    if-eq p1, v2, :cond_d

    if-eq p1, v3, :cond_c

    if-ne p1, v4, :cond_b

    const/16 v1, 0x1b

    goto/16 :goto_0

    .line 15
    :cond_b
    new-instance p1, Llf/q;

    invoke-direct {p1}, Llf/q;-><init>()V

    throw p1

    :cond_c
    const/16 v1, 0x8

    goto/16 :goto_0

    :cond_d
    const/4 v1, 0x7

    goto/16 :goto_0

    :cond_e
    const/4 v1, 0x6

    goto/16 :goto_0

    .line 16
    :cond_f
    instance-of v0, p1, Lcom/discord/chat/presentation/message/messagepart/ThreadEmbedMessageAccessory;

    if-eqz v0, :cond_10

    const/16 v1, 0x9

    goto/16 :goto_0

    .line 17
    :cond_10
    instance-of v0, p1, Lcom/discord/chat/presentation/message/messagepart/VideoAttachmentMessageAccessory;

    if-eqz v0, :cond_11

    const/16 v1, 0xa

    goto/16 :goto_0

    .line 18
    :cond_11
    instance-of v0, p1, Lcom/discord/chat/presentation/message/messagepart/FileAttachmentMessageAccessory;

    if-eqz v0, :cond_12

    const/16 v1, 0xb

    goto/16 :goto_0

    .line 19
    :cond_12
    instance-of v0, p1, Lcom/discord/chat/presentation/message/messagepart/MessageComponentsAccessory;

    if-eqz v0, :cond_13

    const/16 v1, 0xc

    goto/16 :goto_0

    .line 20
    :cond_13
    instance-of v0, p1, Lcom/discord/chat/presentation/message/messagepart/TimestampMessageAccessory;

    if-eqz v0, :cond_14

    const/16 v1, 0xd

    goto/16 :goto_0

    .line 21
    :cond_14
    instance-of v0, p1, Lcom/discord/chat/presentation/message/messagepart/WelcomeStickerAccessory;

    if-eqz v0, :cond_15

    const/16 v1, 0xe

    goto :goto_0

    .line 22
    :cond_15
    instance-of v0, p1, Lcom/discord/chat/presentation/message/messagepart/ActivityInviteEmbedMessageAccessory;

    if-eqz v0, :cond_16

    const/16 v1, 0x11

    goto :goto_0

    .line 23
    :cond_16
    instance-of v0, p1, Lcom/discord/chat/presentation/message/messagepart/EphemeralIndicationMessageAccessory;

    if-eqz v0, :cond_17

    const/16 v1, 0x12

    goto :goto_0

    .line 24
    :cond_17
    instance-of v0, p1, Lcom/discord/chat/presentation/message/messagepart/SurveyIndicationMessageAccessory;

    if-eqz v0, :cond_18

    const/16 v1, 0x18

    goto :goto_0

    .line 25
    :cond_18
    instance-of v0, p1, Lcom/discord/chat/presentation/message/messagepart/InteractionStatusMessageAccessory;

    if-eqz v0, :cond_19

    const/16 v1, 0x13

    goto :goto_0

    .line 26
    :cond_19
    instance-of v0, p1, Lcom/discord/chat/presentation/message/messagepart/ForumPostActionBar;

    if-eqz v0, :cond_1a

    const/16 v1, 0x14

    goto :goto_0

    .line 27
    :cond_1a
    instance-of v0, p1, Lcom/discord/chat/presentation/message/messagepart/FlaggedMessageEmbedAccessory;

    if-eqz v0, :cond_1b

    const/16 v1, 0x15

    goto :goto_0

    .line 28
    :cond_1b
    instance-of v0, p1, Lcom/discord/chat/presentation/message/messagepart/FlaggedMessageActionBarAccessory;

    if-eqz v0, :cond_1c

    const/16 v1, 0x16

    goto :goto_0

    .line 29
    :cond_1c
    instance-of v0, p1, Lcom/discord/chat/presentation/message/messagepart/RoleSubscriptionPurchaseAccessory;

    if-eqz v0, :cond_1d

    const/16 v1, 0x17

    goto :goto_0

    .line 30
    :cond_1d
    instance-of v0, p1, Lcom/discord/chat/presentation/message/messagepart/MediaMosaicAttachmentMessageAccessory;

    if-eqz v0, :cond_1e

    const/16 v1, 0x1a

    goto :goto_0

    .line 31
    :cond_1e
    instance-of v0, p1, Lcom/discord/chat/presentation/message/messagepart/InviteToSpeakAccessory;

    if-eqz v0, :cond_1f

    const/16 v1, 0x1c

    goto :goto_0

    .line 32
    :cond_1f
    instance-of v0, p1, Lcom/discord/chat/presentation/message/messagepart/AudioAttachmentMessageAccessory;

    if-eqz v0, :cond_20

    const/16 v1, 0x1d

    goto :goto_0

    .line 33
    :cond_20
    instance-of p1, p1, Lcom/discord/chat/presentation/message/messagepart/PostPreviewEmbedMessageAccessory;

    if-eqz p1, :cond_21

    const/16 v1, 0x20

    :goto_0
    return v1

    :cond_21
    new-instance p1, Llf/q;

    invoke-direct {p1}, Llf/q;-><init>()V

    throw p1
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->onBindViewHolder(Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;I)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "holder"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v2, v0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->items:Ljava/util/List;

    move/from16 v3, p2

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;

    .line 3
    instance-of v3, v2, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;

    if-eqz v3, :cond_1

    .line 4
    move-object v5, v1

    check-cast v5, Lcom/discord/chat/presentation/message/viewholder/EmbedViewHolder;

    .line 5
    iget-object v3, v1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    .line 6
    sget v6, Lcom/discord/chat/R$dimen;->message_media_max_height:I

    invoke-virtual {v3, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v7

    .line 7
    move-object v6, v2

    check-cast v6, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;

    invoke-virtual {v6}, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->getRadiusPx()I

    move-result v8

    .line 8
    invoke-virtual {v6}, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->getOnLongClick()Landroid/view/View$OnLongClickListener;

    move-result-object v12

    .line 9
    invoke-virtual {v6}, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->getSpoilerAttributes()Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;

    move-result-object v3

    if-eqz v3, :cond_0

    new-instance v4, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$1;

    invoke-direct {v4, v0, v1}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$1;-><init>(Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;)V

    invoke-virtual {v3, v4}, Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;->configure(Lkotlin/jvm/functions/Function0;)Lcom/discord/chat/bridge/spoiler/SpoilerConfig;

    move-result-object v4

    move-object v10, v4

    goto :goto_0

    :cond_0
    const/4 v10, 0x0

    .line 10
    :goto_0
    invoke-virtual {v6}, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;->getPortal()D

    move-result-wide v13

    .line 11
    new-instance v9, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$2;

    invoke-direct {v9, v0, v1}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$2;-><init>(Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;)V

    new-instance v11, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$3;

    invoke-direct {v11, v0, v1, v2}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$3;-><init>(Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;)V

    invoke-virtual/range {v5 .. v14}, Lcom/discord/chat/presentation/message/viewholder/EmbedViewHolder;->bind(Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;IILkotlin/jvm/functions/Function0;Lcom/discord/chat/bridge/spoiler/SpoilerConfig;Lkotlin/jvm/functions/Function2;Landroid/view/View$OnLongClickListener;D)V

    goto/16 :goto_7

    .line 12
    :cond_1
    instance-of v3, v2, Lcom/discord/chat/presentation/message/messagepart/GiftMessageAccessory;

    const-string v5, "eventHandler"

    if-eqz v3, :cond_4

    check-cast v1, Lcom/discord/chat/presentation/message/viewholder/GiftViewHolder;

    .line 13
    check-cast v2, Lcom/discord/chat/presentation/message/messagepart/GiftMessageAccessory;

    .line 14
    new-instance v3, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$4;

    iget-object v6, v0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;

    if-nez v6, :cond_2

    invoke-static {v5}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    const/4 v6, 0x0

    :cond_2
    invoke-direct {v3, v6}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$4;-><init>(Ljava/lang/Object;)V

    .line 15
    new-instance v6, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$5;

    iget-object v7, v0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;

    if-nez v7, :cond_3

    invoke-static {v5}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    const/4 v4, 0x0

    goto :goto_1

    :cond_3
    move-object v4, v7

    :goto_1
    invoke-direct {v6, v4}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$5;-><init>(Ljava/lang/Object;)V

    .line 16
    invoke-virtual {v1, v2, v3, v6}, Lcom/discord/chat/presentation/message/viewholder/GiftViewHolder;->bind(Lcom/discord/chat/presentation/message/messagepart/GiftMessageAccessory;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    goto/16 :goto_7

    .line 17
    :cond_4
    instance-of v3, v2, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;

    if-eqz v3, :cond_f

    .line 18
    move-object v6, v1

    check-cast v6, Lcom/discord/chat/presentation/message/viewholder/MessageContentViewHolder;

    .line 19
    new-instance v8, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$6;

    iget-object v3, v0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;

    if-nez v3, :cond_5

    invoke-static {v5}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    const/4 v3, 0x0

    :cond_5
    invoke-direct {v8, v3}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$6;-><init>(Ljava/lang/Object;)V

    .line 20
    new-instance v9, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$7;

    iget-object v3, v0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;

    if-nez v3, :cond_6

    invoke-static {v5}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    const/4 v3, 0x0

    :cond_6
    invoke-direct {v9, v3}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$7;-><init>(Ljava/lang/Object;)V

    .line 21
    new-instance v10, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$8;

    iget-object v3, v0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;

    if-nez v3, :cond_7

    invoke-static {v5}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    const/4 v3, 0x0

    :cond_7
    invoke-direct {v10, v3}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$8;-><init>(Ljava/lang/Object;)V

    .line 22
    new-instance v11, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$9;

    iget-object v3, v0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;

    if-nez v3, :cond_8

    invoke-static {v5}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    const/4 v3, 0x0

    :cond_8
    invoke-direct {v11, v3}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$9;-><init>(Ljava/lang/Object;)V

    .line 23
    new-instance v12, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$10;

    iget-object v3, v0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;

    if-nez v3, :cond_9

    invoke-static {v5}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    const/4 v3, 0x0

    :cond_9
    invoke-direct {v12, v3}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$10;-><init>(Ljava/lang/Object;)V

    .line 24
    new-instance v13, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$11;

    iget-object v3, v0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;

    if-nez v3, :cond_a

    invoke-static {v5}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    const/4 v3, 0x0

    :cond_a
    invoke-direct {v13, v3}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$11;-><init>(Ljava/lang/Object;)V

    .line 25
    new-instance v14, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$12;

    iget-object v3, v0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;

    if-nez v3, :cond_b

    invoke-static {v5}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    const/4 v3, 0x0

    :cond_b
    invoke-direct {v14, v3}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$12;-><init>(Ljava/lang/Object;)V

    .line 26
    new-instance v3, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$13;

    iget-object v7, v0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;

    if-nez v7, :cond_c

    invoke-static {v5}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    const/4 v7, 0x0

    :cond_c
    invoke-direct {v3, v7}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$13;-><init>(Ljava/lang/Object;)V

    .line 27
    new-instance v15, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$14;

    iget-object v7, v0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;

    if-nez v7, :cond_d

    invoke-static {v5}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    const/4 v7, 0x0

    :cond_d
    invoke-direct {v15, v7}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$14;-><init>(Ljava/lang/Object;)V

    .line 28
    new-instance v7, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$15;

    iget-object v4, v0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;

    if-nez v4, :cond_e

    invoke-static {v5}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    const/4 v4, 0x0

    :cond_e
    invoke-direct {v7, v4}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$15;-><init>(Ljava/lang/Object;)V

    .line 29
    check-cast v2, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;

    .line 30
    new-instance v4, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$16;

    invoke-direct {v4, v0, v1}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$16;-><init>(Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;)V

    move-object v1, v7

    move-object v7, v2

    move-object v2, v15

    move-object v15, v4

    move-object/from16 v16, v3

    move-object/from16 v17, v2

    move-object/from16 v18, v1

    invoke-virtual/range {v6 .. v18}, Lcom/discord/chat/presentation/message/viewholder/MessageContentViewHolder;->bind(Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    goto/16 :goto_7

    .line 31
    :cond_f
    instance-of v3, v2, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;

    if-eqz v3, :cond_11

    move-object v6, v1

    check-cast v6, Lcom/discord/chat/presentation/message/viewholder/ImageAttachmentViewHolder;

    .line 32
    move-object v3, v2

    check-cast v3, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;

    invoke-virtual {v3}, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->getAttachment()Lcom/discord/chat/bridge/attachment/Attachment;

    move-result-object v7

    .line 33
    sget-object v4, Lcom/discord/chat/presentation/message/MessageAccessoriesView;->Companion:Lcom/discord/chat/presentation/message/MessageAccessoriesView$Companion;

    invoke-virtual {v3}, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->getConstrainedWidth()I

    move-result v5

    invoke-virtual {v4, v5}, Lcom/discord/chat/presentation/message/MessageAccessoriesView$Companion;->getWidth(I)I

    move-result v8

    .line 34
    iget-object v4, v1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    .line 35
    sget v5, Lcom/discord/chat/R$dimen;->message_media_max_height:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v9

    .line 36
    invoke-virtual {v3}, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->getRadiusPx()I

    move-result v10

    .line 37
    sget-object v11, Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;->Fill:Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;

    .line 38
    new-instance v12, Lcom/discord/chat/presentation/message/b;

    invoke-direct {v12, v2, v0, v1}, Lcom/discord/chat/presentation/message/b;-><init>(Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;)V

    .line 39
    invoke-virtual {v3}, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->getOnLongClick()Landroid/view/View$OnLongClickListener;

    move-result-object v13

    .line 40
    invoke-virtual {v3}, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->getSpoilerAttributes()Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;

    move-result-object v2

    if-eqz v2, :cond_10

    new-instance v4, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$18;

    invoke-direct {v4, v0, v1}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$18;-><init>(Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;)V

    invoke-virtual {v2, v4}, Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;->configure(Lkotlin/jvm/functions/Function0;)Lcom/discord/chat/bridge/spoiler/SpoilerConfig;

    move-result-object v4

    move-object v14, v4

    goto :goto_2

    :cond_10
    const/4 v14, 0x0

    .line 41
    :goto_2
    invoke-virtual {v3}, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->getUseNewAltTextButton()Z

    move-result v15

    .line 42
    invoke-virtual {v3}, Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;->getAttachmentsOpacity()Ljava/lang/Float;

    move-result-object v16

    .line 43
    invoke-virtual/range {v6 .. v16}, Lcom/discord/chat/presentation/message/viewholder/ImageAttachmentViewHolder;->bind(Lcom/discord/chat/bridge/attachment/Attachment;IIILcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;Landroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;Lcom/discord/chat/bridge/spoiler/SpoilerConfig;ZLjava/lang/Float;)V

    goto/16 :goto_7

    .line 44
    :cond_11
    instance-of v3, v2, Lcom/discord/chat/presentation/message/messagepart/VideoAttachmentMessageAccessory;

    if-eqz v3, :cond_13

    .line 45
    move-object v6, v1

    check-cast v6, Lcom/discord/chat/presentation/message/viewholder/VideoAttachmentViewHolder;

    .line 46
    move-object v7, v2

    check-cast v7, Lcom/discord/chat/presentation/message/messagepart/VideoAttachmentMessageAccessory;

    .line 47
    sget-object v3, Lcom/discord/chat/presentation/message/MessageAccessoriesView;->Companion:Lcom/discord/chat/presentation/message/MessageAccessoriesView$Companion;

    invoke-virtual {v7}, Lcom/discord/chat/presentation/message/messagepart/VideoAttachmentMessageAccessory;->getConstrainedWidth()I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/discord/chat/presentation/message/MessageAccessoriesView$Companion;->getWidth(I)I

    move-result v8

    .line 48
    iget-object v3, v1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    .line 49
    sget v4, Lcom/discord/chat/R$dimen;->message_media_max_height:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v9

    .line 50
    invoke-virtual {v7}, Lcom/discord/chat/presentation/message/messagepart/VideoAttachmentMessageAccessory;->getRadiusPx()I

    move-result v10

    .line 51
    new-instance v11, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$19;

    invoke-direct {v11, v2, v0, v1}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$19;-><init>(Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;)V

    .line 52
    invoke-virtual {v7}, Lcom/discord/chat/presentation/message/messagepart/VideoAttachmentMessageAccessory;->getOnLongClick()Landroid/view/View$OnLongClickListener;

    move-result-object v12

    .line 53
    invoke-virtual {v7}, Lcom/discord/chat/presentation/message/messagepart/VideoAttachmentMessageAccessory;->getSpoilerAttributes()Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;

    move-result-object v2

    if-eqz v2, :cond_12

    new-instance v3, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$20;

    invoke-direct {v3, v0, v1}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$20;-><init>(Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;)V

    invoke-virtual {v2, v3}, Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;->configure(Lkotlin/jvm/functions/Function0;)Lcom/discord/chat/bridge/spoiler/SpoilerConfig;

    move-result-object v4

    move-object v13, v4

    goto :goto_3

    :cond_12
    const/4 v13, 0x0

    .line 54
    :goto_3
    invoke-virtual {v7}, Lcom/discord/chat/presentation/message/messagepart/VideoAttachmentMessageAccessory;->getPortal()D

    move-result-wide v14

    const/16 v16, 0x1

    .line 55
    invoke-virtual {v7}, Lcom/discord/chat/presentation/message/messagepart/VideoAttachmentMessageAccessory;->getUseNewAltTextButton()Z

    move-result v17

    .line 56
    invoke-virtual {v7}, Lcom/discord/chat/presentation/message/messagepart/VideoAttachmentMessageAccessory;->getHideMediaPlayButton()Z

    move-result v18

    .line 57
    invoke-virtual {v7}, Lcom/discord/chat/presentation/message/messagepart/VideoAttachmentMessageAccessory;->getAttachmentsOpacity()Ljava/lang/Float;

    move-result-object v19

    .line 58
    invoke-virtual/range {v6 .. v19}, Lcom/discord/chat/presentation/message/viewholder/VideoAttachmentViewHolder;->bind(Lcom/discord/chat/presentation/message/messagepart/VideoAttachmentMessageAccessory;IIILkotlin/jvm/functions/Function1;Landroid/view/View$OnLongClickListener;Lcom/discord/chat/bridge/spoiler/SpoilerConfig;DZZZLjava/lang/Float;)V

    goto/16 :goto_7

    .line 59
    :cond_13
    instance-of v3, v2, Lcom/discord/chat/presentation/message/messagepart/MediaMosaicAttachmentMessageAccessory;

    if-eqz v3, :cond_14

    .line 60
    move-object v3, v1

    check-cast v3, Lcom/discord/chat/presentation/message/viewholder/MediaMosaicAttachmentViewHolder;

    .line 61
    check-cast v2, Lcom/discord/chat/presentation/message/messagepart/MediaMosaicAttachmentMessageAccessory;

    invoke-virtual {v2}, Lcom/discord/chat/presentation/message/messagepart/MediaMosaicAttachmentMessageAccessory;->getAttachments()Ljava/util/List;

    move-result-object v4

    .line 62
    invoke-virtual {v2}, Lcom/discord/chat/presentation/message/messagepart/MediaMosaicAttachmentMessageAccessory;->getConstrainedWidth()I

    move-result v2

    .line 63
    new-instance v5, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$21;

    invoke-direct {v5, v0, v1}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$21;-><init>(Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;)V

    new-instance v1, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$22;

    invoke-direct {v1, v0}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$22;-><init>(Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;)V

    invoke-virtual {v3, v4, v2, v5, v1}, Lcom/discord/chat/presentation/message/viewholder/MediaMosaicAttachmentViewHolder;->bind(Ljava/util/List;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)V

    goto/16 :goto_7

    .line 64
    :cond_14
    instance-of v3, v2, Lcom/discord/chat/presentation/message/messagepart/UploadProgressMessageAccessory;

    if-eqz v3, :cond_16

    .line 65
    check-cast v1, Lcom/discord/chat/presentation/message/viewholder/UploadProgressViewHolder;

    check-cast v2, Lcom/discord/chat/presentation/message/messagepart/UploadProgressMessageAccessory;

    invoke-virtual {v2}, Lcom/discord/chat/presentation/message/messagepart/UploadProgressMessageAccessory;->getUploadProgress()Lcom/discord/chat/bridge/UploadProgress;

    move-result-object v2

    iget-object v3, v0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;

    if-nez v3, :cond_15

    invoke-static {v5}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    const/4 v4, 0x0

    goto :goto_4

    :cond_15
    move-object v4, v3

    :goto_4
    invoke-virtual {v1, v2, v4}, Lcom/discord/chat/presentation/message/viewholder/UploadProgressViewHolder;->bind(Lcom/discord/chat/bridge/UploadProgress;Lcom/discord/chat/presentation/events/ChatEventHandler;)V

    goto/16 :goto_7

    .line 66
    :cond_16
    instance-of v3, v2, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;

    if-eqz v3, :cond_17

    .line 67
    move-object v6, v1

    check-cast v6, Lcom/discord/chat/presentation/message/viewholder/ReactionsViewHolder;

    .line 68
    invoke-virtual {v2}, Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;->getMessageId-3Eiw7ao()Ljava/lang/String;

    move-result-object v7

    .line 69
    check-cast v2, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;

    invoke-virtual {v2}, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->getReactions()Ljava/util/List;

    move-result-object v8

    .line 70
    invoke-virtual {v2}, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->getCanAddNewReactions()Z

    move-result v9

    .line 71
    invoke-virtual {v2}, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->getCanAddNewBurstReactions()Z

    move-result v10

    .line 72
    invoke-virtual {v2}, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->getAddReactionLabel()Ljava/lang/String;

    move-result-object v11

    .line 73
    invoke-virtual {v2}, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->getAddNewReactionAccessibilityLabel()Ljava/lang/String;

    move-result-object v12

    .line 74
    invoke-virtual {v2}, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->getAddNewBurstReactionAccessibilityLabel()Ljava/lang/String;

    move-result-object v13

    .line 75
    invoke-virtual {v2}, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->getReactionsTheme()Lcom/discord/chat/bridge/reaction/ReactionsTheme;

    move-result-object v14

    .line 76
    new-instance v15, Lcom/discord/chat/presentation/message/c;

    invoke-direct {v15, v0}, Lcom/discord/chat/presentation/message/c;-><init>(Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;)V

    new-instance v1, Lcom/discord/chat/presentation/message/d;

    invoke-direct {v1, v0}, Lcom/discord/chat/presentation/message/d;-><init>(Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;)V

    new-instance v3, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$25;

    invoke-direct {v3, v0}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$25;-><init>(Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;)V

    new-instance v4, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$26;

    invoke-direct {v4, v0}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$26;-><init>(Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;)V

    .line 77
    invoke-virtual {v2}, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v19

    .line 78
    invoke-virtual {v2}, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;->getUseSortedReactions()Z

    move-result v20

    move-object/from16 v16, v1

    move-object/from16 v17, v3

    move-object/from16 v18, v4

    .line 79
    invoke-virtual/range {v6 .. v20}, Lcom/discord/chat/presentation/message/viewholder/ReactionsViewHolder;->bind-oSm889w(Ljava/lang/String;Ljava/util/List;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/reaction/ReactionsTheme;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/discord/theme/DiscordTheme;Z)V

    goto/16 :goto_7

    .line 80
    :cond_17
    instance-of v3, v2, Lcom/discord/chat/presentation/message/messagepart/StickerMessageAccessory;

    if-eqz v3, :cond_18

    .line 81
    move-object v6, v1

    check-cast v6, Lcom/discord/chat/presentation/message/viewholder/StickerPartViewHolder;

    .line 82
    move-object v1, v2

    check-cast v1, Lcom/discord/chat/presentation/message/messagepart/StickerMessageAccessory;

    invoke-virtual {v1}, Lcom/discord/chat/presentation/message/messagepart/StickerMessageAccessory;->getSticker()Lcom/discord/chat/bridge/sticker/Sticker;

    move-result-object v7

    .line 83
    new-instance v8, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$27;

    invoke-direct {v8, v0, v2}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$27;-><init>(Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;)V

    new-instance v9, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$28;

    invoke-direct {v9, v0, v2}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$28;-><init>(Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;)V

    const/16 v10, 0xa0

    const/16 v11, 0xa0

    invoke-virtual/range {v6 .. v11}, Lcom/discord/chat/presentation/message/viewholder/StickerPartViewHolder;->bind(Lcom/discord/chat/bridge/sticker/Sticker;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;II)V

    goto/16 :goto_7

    .line 84
    :cond_18
    instance-of v3, v2, Lcom/discord/chat/presentation/message/messagepart/GuildInviteMessageAccessory;

    if-eqz v3, :cond_19

    check-cast v1, Lcom/discord/chat/presentation/message/viewholder/GuildInviteViewHolder;

    check-cast v2, Lcom/discord/chat/presentation/message/messagepart/GuildInviteMessageAccessory;

    invoke-virtual {v1, v2}, Lcom/discord/chat/presentation/message/viewholder/GuildInviteViewHolder;->bind(Lcom/discord/chat/presentation/message/messagepart/GuildInviteMessageAccessory;)V

    goto/16 :goto_7

    .line 85
    :cond_19
    instance-of v3, v2, Lcom/discord/chat/presentation/message/messagepart/ActivityLauncherMessageAccessory;

    if-eqz v3, :cond_1a

    check-cast v1, Lcom/discord/chat/presentation/message/viewholder/ActivityLauncherViewHolder;

    check-cast v2, Lcom/discord/chat/presentation/message/messagepart/ActivityLauncherMessageAccessory;

    invoke-virtual {v1, v2}, Lcom/discord/chat/presentation/message/viewholder/ActivityLauncherViewHolder;->bind(Lcom/discord/chat/presentation/message/messagepart/ActivityLauncherMessageAccessory;)V

    goto/16 :goto_7

    .line 86
    :cond_1a
    instance-of v3, v2, Lcom/discord/chat/presentation/message/messagepart/EmbeddedActivityInviteMessageAccessory;

    if-eqz v3, :cond_1b

    check-cast v1, Lcom/discord/chat/presentation/message/viewholder/EmbeddedActivityInviteViewHolder;

    check-cast v2, Lcom/discord/chat/presentation/message/messagepart/EmbeddedActivityInviteMessageAccessory;

    invoke-virtual {v1, v2}, Lcom/discord/chat/presentation/message/viewholder/EmbeddedActivityInviteViewHolder;->bind(Lcom/discord/chat/presentation/message/messagepart/EmbeddedActivityInviteMessageAccessory;)V

    goto/16 :goto_7

    .line 87
    :cond_1b
    instance-of v3, v2, Lcom/discord/chat/presentation/message/messagepart/GuildInviteDisabledMessageAccessory;

    if-eqz v3, :cond_1c

    check-cast v1, Lcom/discord/chat/presentation/message/viewholder/GuildInviteDisabledViewHolder;

    check-cast v2, Lcom/discord/chat/presentation/message/messagepart/GuildInviteDisabledMessageAccessory;

    invoke-virtual {v1, v2}, Lcom/discord/chat/presentation/message/viewholder/GuildInviteDisabledViewHolder;->bind(Lcom/discord/chat/presentation/message/messagepart/GuildInviteDisabledMessageAccessory;)V

    goto/16 :goto_7

    .line 88
    :cond_1c
    instance-of v3, v2, Lcom/discord/chat/presentation/message/messagepart/GuildEventInviteMessageAccessory;

    if-eqz v3, :cond_1d

    check-cast v1, Lcom/discord/chat/presentation/message/viewholder/GuildEventInviteViewHolder;

    check-cast v2, Lcom/discord/chat/presentation/message/messagepart/GuildEventInviteMessageAccessory;

    invoke-virtual {v1, v2}, Lcom/discord/chat/presentation/message/viewholder/GuildEventInviteViewHolder;->bind(Lcom/discord/chat/presentation/message/messagepart/GuildEventInviteMessageAccessory;)V

    goto/16 :goto_7

    .line 89
    :cond_1d
    instance-of v3, v2, Lcom/discord/chat/presentation/message/messagepart/ThreadEmbedMessageAccessory;

    if-eqz v3, :cond_1f

    check-cast v1, Lcom/discord/chat/presentation/message/viewholder/ThreadEmbedViewHolder;

    .line 90
    check-cast v2, Lcom/discord/chat/presentation/message/messagepart/ThreadEmbedMessageAccessory;

    .line 91
    new-instance v3, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$29;

    iget-object v4, v0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;

    if-nez v4, :cond_1e

    invoke-static {v5}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    const/4 v4, 0x0

    :cond_1e
    invoke-direct {v3, v4}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$29;-><init>(Ljava/lang/Object;)V

    .line 92
    invoke-virtual {v1, v2, v3}, Lcom/discord/chat/presentation/message/viewholder/ThreadEmbedViewHolder;->bind(Lcom/discord/chat/presentation/message/messagepart/ThreadEmbedMessageAccessory;Lkotlin/jvm/functions/Function1;)V

    goto/16 :goto_7

    .line 93
    :cond_1f
    instance-of v3, v2, Lcom/discord/chat/presentation/message/messagepart/ForumPostActionBar;

    if-eqz v3, :cond_20

    move-object v6, v1

    check-cast v6, Lcom/discord/chat/presentation/message/viewholder/ForumPostActionBarViewHolder;

    .line 94
    move-object v7, v2

    check-cast v7, Lcom/discord/chat/presentation/message/messagepart/ForumPostActionBar;

    .line 95
    invoke-virtual {v7}, Lcom/discord/chat/presentation/message/messagepart/ForumPostActionBar;->getReactionsTheme()Lcom/discord/chat/bridge/reaction/ReactionsTheme;

    move-result-object v8

    .line 96
    new-instance v9, Lcom/discord/chat/presentation/message/e;

    invoke-direct {v9, v0}, Lcom/discord/chat/presentation/message/e;-><init>(Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;)V

    new-instance v10, Lcom/discord/chat/presentation/message/f;

    invoke-direct {v10, v0}, Lcom/discord/chat/presentation/message/f;-><init>(Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;)V

    new-instance v11, Lcom/discord/chat/presentation/message/g;

    invoke-direct {v11, v0}, Lcom/discord/chat/presentation/message/g;-><init>(Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;)V

    new-instance v12, Lcom/discord/chat/presentation/message/h;

    invoke-direct {v12, v0}, Lcom/discord/chat/presentation/message/h;-><init>(Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;)V

    new-instance v13, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$34;

    invoke-direct {v13, v0}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$34;-><init>(Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;)V

    new-instance v14, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$35;

    invoke-direct {v14, v0}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$35;-><init>(Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;)V

    .line 97
    invoke-virtual {v7}, Lcom/discord/chat/presentation/message/messagepart/ForumPostActionBar;->getUseSortedReactions()Z

    move-result v15

    .line 98
    invoke-virtual/range {v6 .. v15}, Lcom/discord/chat/presentation/message/viewholder/ForumPostActionBarViewHolder;->bind(Lcom/discord/chat/presentation/message/messagepart/ForumPostActionBar;Lcom/discord/chat/bridge/reaction/ReactionsTheme;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Z)V

    goto/16 :goto_7

    .line 99
    :cond_20
    instance-of v3, v2, Lcom/discord/chat/presentation/message/messagepart/FileAttachmentMessageAccessory;

    if-eqz v3, :cond_22

    move-object v3, v1

    check-cast v3, Lcom/discord/chat/presentation/message/viewholder/FileAttachmentViewHolder;

    .line 100
    check-cast v2, Lcom/discord/chat/presentation/message/messagepart/FileAttachmentMessageAccessory;

    .line 101
    new-instance v4, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$36;

    invoke-direct {v4, v0}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$36;-><init>(Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;)V

    .line 102
    invoke-virtual {v2}, Lcom/discord/chat/presentation/message/messagepart/FileAttachmentMessageAccessory;->getSpoilerAttributes()Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;

    move-result-object v5

    if-eqz v5, :cond_21

    new-instance v6, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$37;

    invoke-direct {v6, v0, v1}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$37;-><init>(Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;)V

    invoke-virtual {v5, v6}, Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;->configure(Lkotlin/jvm/functions/Function0;)Lcom/discord/chat/bridge/spoiler/SpoilerConfig;

    move-result-object v1

    goto :goto_5

    :cond_21
    const/4 v1, 0x0

    .line 103
    :goto_5
    invoke-virtual {v2}, Lcom/discord/chat/presentation/message/messagepart/FileAttachmentMessageAccessory;->getAttachmentsOpacity()Ljava/lang/Float;

    move-result-object v5

    .line 104
    invoke-virtual {v3, v2, v4, v1, v5}, Lcom/discord/chat/presentation/message/viewholder/FileAttachmentViewHolder;->bind(Lcom/discord/chat/presentation/message/messagepart/FileAttachmentMessageAccessory;Lkotlin/jvm/functions/Function2;Lcom/discord/chat/bridge/spoiler/SpoilerConfig;Ljava/lang/Float;)V

    goto/16 :goto_7

    .line 105
    :cond_22
    instance-of v3, v2, Lcom/discord/chat/presentation/message/messagepart/MessageComponentsAccessory;

    if-eqz v3, :cond_23

    check-cast v1, Lcom/discord/chat/presentation/message/viewholder/MessageComponentsViewHolder;

    .line 106
    check-cast v2, Lcom/discord/chat/presentation/message/messagepart/MessageComponentsAccessory;

    .line 107
    iget-object v3, v0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->botComponentProvider:Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;

    .line 108
    invoke-virtual {v1, v2, v3}, Lcom/discord/chat/presentation/message/viewholder/MessageComponentsViewHolder;->bind(Lcom/discord/chat/presentation/message/messagepart/MessageComponentsAccessory;Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;)V

    goto/16 :goto_7

    .line 109
    :cond_23
    instance-of v3, v2, Lcom/discord/chat/presentation/message/messagepart/FlaggedMessageEmbedAccessory;

    if-eqz v3, :cond_24

    check-cast v1, Lcom/discord/chat/presentation/message/viewholder/FlaggedMessageEmbedViewHolder;

    .line 110
    check-cast v2, Lcom/discord/chat/presentation/message/messagepart/FlaggedMessageEmbedAccessory;

    .line 111
    invoke-virtual {v1, v2}, Lcom/discord/chat/presentation/message/viewholder/FlaggedMessageEmbedViewHolder;->bind(Lcom/discord/chat/presentation/message/messagepart/FlaggedMessageEmbedAccessory;)V

    goto/16 :goto_7

    .line 112
    :cond_24
    instance-of v3, v2, Lcom/discord/chat/presentation/message/messagepart/FlaggedMessageActionBarAccessory;

    if-eqz v3, :cond_27

    check-cast v1, Lcom/discord/chat/presentation/message/viewholder/FlaggedMessageActionBarViewHolder;

    .line 113
    check-cast v2, Lcom/discord/chat/presentation/message/messagepart/FlaggedMessageActionBarAccessory;

    .line 114
    new-instance v3, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$38;

    iget-object v4, v0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;

    if-nez v4, :cond_25

    invoke-static {v5}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    const/4 v4, 0x0

    :cond_25
    invoke-direct {v3, v4}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$38;-><init>(Ljava/lang/Object;)V

    .line 115
    new-instance v4, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$39;

    iget-object v6, v0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;

    if-nez v6, :cond_26

    invoke-static {v5}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    const/4 v6, 0x0

    :cond_26
    invoke-direct {v4, v6}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$39;-><init>(Ljava/lang/Object;)V

    .line 116
    invoke-virtual {v1, v2, v3, v4}, Lcom/discord/chat/presentation/message/viewholder/FlaggedMessageActionBarViewHolder;->bind(Lcom/discord/chat/presentation/message/messagepart/FlaggedMessageActionBarAccessory;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V

    goto/16 :goto_7

    .line 117
    :cond_27
    instance-of v3, v2, Lcom/discord/chat/presentation/message/messagepart/TimestampMessageAccessory;

    if-eqz v3, :cond_28

    check-cast v1, Lcom/discord/chat/presentation/message/viewholder/TimestampViewHolder;

    .line 118
    check-cast v2, Lcom/discord/chat/presentation/message/messagepart/TimestampMessageAccessory;

    .line 119
    invoke-virtual {v1, v2}, Lcom/discord/chat/presentation/message/viewholder/TimestampViewHolder;->bind(Lcom/discord/chat/presentation/message/messagepart/TimestampMessageAccessory;)V

    goto/16 :goto_7

    .line 120
    :cond_28
    instance-of v3, v2, Lcom/discord/chat/presentation/message/messagepart/WelcomeStickerAccessory;

    if-eqz v3, :cond_29

    check-cast v1, Lcom/discord/chat/presentation/message/viewholder/WelcomeStickerViewHolder;

    .line 121
    check-cast v2, Lcom/discord/chat/presentation/message/messagepart/WelcomeStickerAccessory;

    .line 122
    invoke-virtual {v1, v2}, Lcom/discord/chat/presentation/message/viewholder/WelcomeStickerViewHolder;->bind(Lcom/discord/chat/presentation/message/messagepart/WelcomeStickerAccessory;)V

    goto/16 :goto_7

    .line 123
    :cond_29
    instance-of v3, v2, Lcom/discord/chat/presentation/message/messagepart/ActivityInviteEmbedMessageAccessory;

    if-eqz v3, :cond_2b

    check-cast v1, Lcom/discord/chat/presentation/message/viewholder/ActivityInviteEmbedViewHolder;

    .line 124
    check-cast v2, Lcom/discord/chat/presentation/message/messagepart/ActivityInviteEmbedMessageAccessory;

    .line 125
    new-instance v3, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$40;

    iget-object v4, v0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;

    if-nez v4, :cond_2a

    invoke-static {v5}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    const/4 v4, 0x0

    :cond_2a
    invoke-direct {v3, v4}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$40;-><init>(Ljava/lang/Object;)V

    .line 126
    invoke-virtual {v1, v2, v3}, Lcom/discord/chat/presentation/message/viewholder/ActivityInviteEmbedViewHolder;->bind(Lcom/discord/chat/presentation/message/messagepart/ActivityInviteEmbedMessageAccessory;Lkotlin/jvm/functions/Function1;)V

    goto/16 :goto_7

    .line 127
    :cond_2b
    instance-of v3, v2, Lcom/discord/chat/presentation/message/messagepart/EphemeralIndicationMessageAccessory;

    if-eqz v3, :cond_2c

    check-cast v1, Lcom/discord/chat/presentation/message/viewholder/EphemeralIndicationViewHolder;

    .line 128
    check-cast v2, Lcom/discord/chat/presentation/message/messagepart/EphemeralIndicationMessageAccessory;

    .line 129
    invoke-virtual {v1, v2}, Lcom/discord/chat/presentation/message/viewholder/EphemeralIndicationViewHolder;->bind(Lcom/discord/chat/presentation/message/messagepart/EphemeralIndicationMessageAccessory;)V

    goto/16 :goto_7

    .line 130
    :cond_2c
    instance-of v3, v2, Lcom/discord/chat/presentation/message/messagepart/SurveyIndicationMessageAccessory;

    if-eqz v3, :cond_2d

    check-cast v1, Lcom/discord/chat/presentation/message/viewholder/SurveyIndicationViewHolder;

    .line 131
    check-cast v2, Lcom/discord/chat/presentation/message/messagepart/SurveyIndicationMessageAccessory;

    .line 132
    invoke-virtual {v1, v2}, Lcom/discord/chat/presentation/message/viewholder/SurveyIndicationViewHolder;->bind(Lcom/discord/chat/presentation/message/messagepart/SurveyIndicationMessageAccessory;)V

    goto :goto_7

    .line 133
    :cond_2d
    instance-of v3, v2, Lcom/discord/chat/presentation/message/messagepart/InteractionStatusMessageAccessory;

    if-eqz v3, :cond_2e

    check-cast v1, Lcom/discord/chat/presentation/message/viewholder/InteractionStatusViewHolder;

    .line 134
    check-cast v2, Lcom/discord/chat/presentation/message/messagepart/InteractionStatusMessageAccessory;

    .line 135
    invoke-virtual {v1, v2}, Lcom/discord/chat/presentation/message/viewholder/InteractionStatusViewHolder;->bind(Lcom/discord/chat/presentation/message/messagepart/InteractionStatusMessageAccessory;)V

    goto :goto_7

    .line 136
    :cond_2e
    instance-of v3, v2, Lcom/discord/chat/presentation/message/messagepart/RoleSubscriptionPurchaseAccessory;

    if-eqz v3, :cond_2f

    check-cast v1, Lcom/discord/chat/presentation/message/viewholder/RoleSubscriptionPurchaseViewHolder;

    .line 137
    check-cast v2, Lcom/discord/chat/presentation/message/messagepart/RoleSubscriptionPurchaseAccessory;

    .line 138
    sget-object v3, Lcom/discord/chat/presentation/message/MessageAccessoriesView;->Companion:Lcom/discord/chat/presentation/message/MessageAccessoriesView$Companion;

    invoke-virtual {v2}, Lcom/discord/chat/presentation/message/messagepart/RoleSubscriptionPurchaseAccessory;->getConstrainedWidth()I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/discord/chat/presentation/message/MessageAccessoriesView$Companion;->getWidth(I)I

    move-result v3

    .line 139
    invoke-virtual {v1, v2, v3}, Lcom/discord/chat/presentation/message/viewholder/RoleSubscriptionPurchaseViewHolder;->bind(Lcom/discord/chat/presentation/message/messagepart/RoleSubscriptionPurchaseAccessory;I)V

    goto :goto_7

    .line 140
    :cond_2f
    instance-of v3, v2, Lcom/discord/chat/presentation/message/messagepart/InviteToSpeakAccessory;

    if-eqz v3, :cond_30

    check-cast v1, Lcom/discord/chat/presentation/message/viewholder/InviteToSpeakViewHolder;

    .line 141
    check-cast v2, Lcom/discord/chat/presentation/message/messagepart/InviteToSpeakAccessory;

    .line 142
    invoke-virtual {v1, v2}, Lcom/discord/chat/presentation/message/viewholder/InviteToSpeakViewHolder;->bind(Lcom/discord/chat/presentation/message/messagepart/InviteToSpeakAccessory;)V

    goto :goto_7

    .line 143
    :cond_30
    instance-of v3, v2, Lcom/discord/chat/presentation/message/messagepart/AudioAttachmentMessageAccessory;

    if-eqz v3, :cond_32

    check-cast v1, Lcom/discord/chat/presentation/message/viewholder/VoiceMessageViewHolder;

    .line 144
    check-cast v2, Lcom/discord/chat/presentation/message/messagepart/AudioAttachmentMessageAccessory;

    .line 145
    iget-object v3, v0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;

    if-nez v3, :cond_31

    invoke-static {v5}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    const/4 v4, 0x0

    goto :goto_6

    :cond_31
    move-object v4, v3

    .line 146
    :goto_6
    invoke-virtual {v2}, Lcom/discord/chat/presentation/message/messagepart/AudioAttachmentMessageAccessory;->getAttachmentsOpacity()Ljava/lang/Float;

    move-result-object v3

    .line 147
    invoke-virtual {v1, v2, v4, v3}, Lcom/discord/chat/presentation/message/viewholder/VoiceMessageViewHolder;->bind(Lcom/discord/chat/presentation/message/messagepart/AudioAttachmentMessageAccessory;Lcom/discord/chat/presentation/events/ChatEventHandler;Ljava/lang/Float;)V

    goto :goto_7

    .line 148
    :cond_32
    instance-of v3, v2, Lcom/discord/chat/presentation/message/messagepart/PostPreviewEmbedMessageAccessory;

    if-eqz v3, :cond_34

    check-cast v1, Lcom/discord/chat/presentation/message/viewholder/PostPreviewEmbedViewHolder;

    .line 149
    check-cast v2, Lcom/discord/chat/presentation/message/messagepart/PostPreviewEmbedMessageAccessory;

    .line 150
    new-instance v3, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$41;

    iget-object v4, v0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;

    if-nez v4, :cond_33

    invoke-static {v5}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    const/4 v4, 0x0

    :cond_33
    invoke-direct {v3, v4}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onBindViewHolder$41;-><init>(Ljava/lang/Object;)V

    .line 151
    invoke-virtual {v1, v2, v3}, Lcom/discord/chat/presentation/message/viewholder/PostPreviewEmbedViewHolder;->bind(Lcom/discord/chat/presentation/message/messagepart/PostPreviewEmbedMessageAccessory;Lkotlin/jvm/functions/Function3;)V

    :goto_7
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 152
    invoke-static {v1}, Lcom/discord/misc/utilities/kotlin/ForceExhaustiveKt;->forceExhaustive(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 153
    :cond_34
    new-instance v1, Llf/q;

    invoke-direct {v1}, Llf/q;-><init>()V

    throw v1
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;
    .locals 10

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    const-string v1, "eventHandler"

    const-string v2, "parent.context"

    const/4 v3, 0x0

    packed-switch p2, :pswitch_data_0

    .line 2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown view type: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 3
    :pswitch_0
    new-instance p2, Lcom/discord/chat/presentation/message/viewholder/PostPreviewEmbedViewHolder;

    .line 4
    new-instance v0, Lcom/discord/chat/presentation/message/view/PostPreviewEmbedView;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v8}, Lcom/discord/chat/presentation/message/view/PostPreviewEmbedView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    invoke-direct {p2, v0}, Lcom/discord/chat/presentation/message/viewholder/PostPreviewEmbedViewHolder;-><init>(Lcom/discord/chat/presentation/message/view/PostPreviewEmbedView;)V

    goto/16 :goto_10

    .line 6
    :pswitch_1
    new-instance p2, Lcom/discord/chat/presentation/message/viewholder/EmbeddedActivityInviteViewHolder;

    new-instance v0, Lcom/discord/chat/presentation/message/view/EmbeddedActivityInviteView;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x6

    const/4 v9, 0x0

    move-object v4, v0

    invoke-direct/range {v4 .. v9}, Lcom/discord/chat/presentation/message/view/EmbeddedActivityInviteView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object p1, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;

    if-nez p1, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    move-object v3, p1

    :goto_0
    invoke-direct {p2, v0, v3}, Lcom/discord/chat/presentation/message/viewholder/EmbeddedActivityInviteViewHolder;-><init>(Lcom/discord/chat/presentation/message/view/EmbeddedActivityInviteView;Lcom/discord/chat/presentation/events/ChatEventHandler;)V

    goto/16 :goto_10

    .line 7
    :pswitch_2
    new-instance p2, Lcom/discord/chat/presentation/message/viewholder/ActivityLauncherViewHolder;

    new-instance v0, Lcom/discord/chat/presentation/message/view/ActivityLauncherView;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x6

    const/4 v9, 0x0

    move-object v4, v0

    invoke-direct/range {v4 .. v9}, Lcom/discord/chat/presentation/message/view/ActivityLauncherView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object p1, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;

    if-nez p1, :cond_1

    invoke-static {v1}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    move-object v3, p1

    :goto_1
    invoke-direct {p2, v0, v3}, Lcom/discord/chat/presentation/message/viewholder/ActivityLauncherViewHolder;-><init>(Lcom/discord/chat/presentation/message/view/ActivityLauncherView;Lcom/discord/chat/presentation/events/ChatEventHandler;)V

    goto/16 :goto_10

    .line 8
    :pswitch_3
    new-instance p2, Lcom/discord/chat/presentation/message/viewholder/VoiceMessageViewHolder;

    .line 9
    new-instance v0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v8}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 10
    invoke-direct {p2, v0}, Lcom/discord/chat/presentation/message/viewholder/VoiceMessageViewHolder;-><init>(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;)V

    goto/16 :goto_10

    .line 11
    :pswitch_4
    new-instance p2, Lcom/discord/chat/presentation/message/viewholder/InviteToSpeakViewHolder;

    .line 12
    new-instance v4, Lcom/discord/chat/presentation/invitetospeak/InviteToSpeakView;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v4, p1, v3, v0, v3}, Lcom/discord/chat/presentation/invitetospeak/InviteToSpeakView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 13
    new-instance p1, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onCreateViewHolder$3;

    iget-object v0, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;

    if-nez v0, :cond_2

    invoke-static {v1}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    move-object v3, v0

    :goto_2
    invoke-direct {p1, v3}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onCreateViewHolder$3;-><init>(Ljava/lang/Object;)V

    .line 14
    invoke-direct {p2, v4, p1}, Lcom/discord/chat/presentation/message/viewholder/InviteToSpeakViewHolder;-><init>(Lcom/discord/chat/presentation/invitetospeak/InviteToSpeakView;Lkotlin/jvm/functions/Function1;)V

    goto/16 :goto_10

    .line 15
    :pswitch_5
    new-instance p2, Lcom/discord/chat/presentation/message/viewholder/StickerGifViewHolder;

    new-instance v0, Lcom/discord/sticker/StickerView;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v8}, Lcom/discord/sticker/StickerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p2, v0}, Lcom/discord/chat/presentation/message/viewholder/StickerGifViewHolder;-><init>(Lcom/discord/sticker/StickerView;)V

    goto/16 :goto_10

    .line 16
    :pswitch_6
    new-instance p2, Lcom/discord/chat/presentation/message/viewholder/MediaMosaicAttachmentViewHolder;

    new-instance v4, Lcom/discord/chat/presentation/message/view/MediaMosaicView;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v4, p1, v3, v0, v3}, Lcom/discord/chat/presentation/message/view/MediaMosaicView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object p1, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;

    if-nez p1, :cond_3

    invoke-static {v1}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    goto :goto_3

    :cond_3
    move-object v3, p1

    :goto_3
    invoke-direct {p2, v4, v3}, Lcom/discord/chat/presentation/message/viewholder/MediaMosaicAttachmentViewHolder;-><init>(Lcom/discord/chat/presentation/message/view/MediaMosaicView;Lcom/discord/chat/presentation/events/ChatEventHandler;)V

    goto/16 :goto_10

    .line 17
    :pswitch_7
    new-instance p2, Lcom/discord/chat/presentation/message/viewholder/GuildInviteDisabledViewHolder;

    new-instance v0, Lcom/discord/chat/presentation/message/view/GuildInviteDisabledView;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x6

    const/4 v9, 0x0

    move-object v4, v0

    invoke-direct/range {v4 .. v9}, Lcom/discord/chat/presentation/message/view/GuildInviteDisabledView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object p1, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;

    if-nez p1, :cond_4

    invoke-static {v1}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    goto :goto_4

    :cond_4
    move-object v3, p1

    :goto_4
    invoke-direct {p2, v0, v3}, Lcom/discord/chat/presentation/message/viewholder/GuildInviteDisabledViewHolder;-><init>(Lcom/discord/chat/presentation/message/view/GuildInviteDisabledView;Lcom/discord/chat/presentation/events/ChatEventHandler;)V

    goto/16 :goto_10

    .line 18
    :pswitch_8
    new-instance p2, Lcom/discord/chat/presentation/message/viewholder/SurveyIndicationViewHolder;

    .line 19
    new-instance v0, Lcom/discord/chat/presentation/message/view/SurveyIndicationView;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x6

    const/4 v9, 0x0

    move-object v4, v0

    invoke-direct/range {v4 .. v9}, Lcom/discord/chat/presentation/message/view/SurveyIndicationView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 20
    iget-object p1, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;

    if-nez p1, :cond_5

    invoke-static {v1}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    goto :goto_5

    :cond_5
    move-object v3, p1

    .line 21
    :goto_5
    invoke-direct {p2, v0, v3}, Lcom/discord/chat/presentation/message/viewholder/SurveyIndicationViewHolder;-><init>(Lcom/discord/chat/presentation/message/view/SurveyIndicationView;Lcom/discord/chat/presentation/events/ChatEventHandler;)V

    goto/16 :goto_10

    .line 22
    :pswitch_9
    new-instance p2, Lcom/discord/chat/presentation/message/viewholder/RoleSubscriptionPurchaseViewHolder;

    .line 23
    new-instance v0, Lcom/discord/chat/presentation/message/view/RoleSubscriptionPurchaseView;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v8}, Lcom/discord/chat/presentation/message/view/RoleSubscriptionPurchaseView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 24
    invoke-direct {p2, v0}, Lcom/discord/chat/presentation/message/viewholder/RoleSubscriptionPurchaseViewHolder;-><init>(Lcom/discord/chat/presentation/message/view/RoleSubscriptionPurchaseView;)V

    goto/16 :goto_10

    .line 25
    :pswitch_a
    new-instance p2, Lcom/discord/chat/presentation/message/viewholder/FlaggedMessageActionBarViewHolder;

    .line 26
    new-instance v0, Lcom/discord/chat/presentation/message/view/FlaggedMessageActionBarView;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v8}, Lcom/discord/chat/presentation/message/view/FlaggedMessageActionBarView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 27
    invoke-direct {p2, v0}, Lcom/discord/chat/presentation/message/viewholder/FlaggedMessageActionBarViewHolder;-><init>(Lcom/discord/chat/presentation/message/view/FlaggedMessageActionBarView;)V

    goto/16 :goto_10

    .line 28
    :pswitch_b
    new-instance p2, Lcom/discord/chat/presentation/message/viewholder/FlaggedMessageEmbedViewHolder;

    .line 29
    new-instance v4, Lcom/discord/chat/presentation/message/view/FlaggedMessageEmbedView;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v4, p1, v3, v0, v3}, Lcom/discord/chat/presentation/message/view/FlaggedMessageEmbedView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 30
    iget-object p1, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;

    if-nez p1, :cond_6

    invoke-static {v1}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    goto :goto_6

    :cond_6
    move-object v3, p1

    .line 31
    :goto_6
    invoke-direct {p2, v4, v3}, Lcom/discord/chat/presentation/message/viewholder/FlaggedMessageEmbedViewHolder;-><init>(Lcom/discord/chat/presentation/message/view/FlaggedMessageEmbedView;Lcom/discord/chat/presentation/events/ChatEventHandler;)V

    goto/16 :goto_10

    .line 32
    :pswitch_c
    new-instance p2, Lcom/discord/chat/presentation/message/viewholder/ForumPostActionBarViewHolder;

    .line 33
    new-instance v0, Lcom/discord/chat/presentation/message/view/ForumPostActionBarView;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v8}, Lcom/discord/chat/presentation/message/view/ForumPostActionBarView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 34
    invoke-direct {p2, v0}, Lcom/discord/chat/presentation/message/viewholder/ForumPostActionBarViewHolder;-><init>(Lcom/discord/chat/presentation/message/view/ForumPostActionBarView;)V

    goto/16 :goto_10

    .line 35
    :pswitch_d
    new-instance p2, Lcom/discord/chat/presentation/message/viewholder/InteractionStatusViewHolder;

    .line 36
    new-instance v1, Lcom/discord/chat/presentation/message/view/InteractionStatusView;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, p1, v3, v0, v3}, Lcom/discord/chat/presentation/message/view/InteractionStatusView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 37
    invoke-direct {p2, v1}, Lcom/discord/chat/presentation/message/viewholder/InteractionStatusViewHolder;-><init>(Lcom/discord/chat/presentation/message/view/InteractionStatusView;)V

    goto/16 :goto_10

    .line 38
    :pswitch_e
    new-instance p2, Lcom/discord/chat/presentation/message/viewholder/EphemeralIndicationViewHolder;

    .line 39
    new-instance v0, Lcom/discord/chat/presentation/message/view/EphemeralIndicationView;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x6

    const/4 v9, 0x0

    move-object v4, v0

    invoke-direct/range {v4 .. v9}, Lcom/discord/chat/presentation/message/view/EphemeralIndicationView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 40
    iget-object p1, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;

    if-nez p1, :cond_7

    invoke-static {v1}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    goto :goto_7

    :cond_7
    move-object v3, p1

    .line 41
    :goto_7
    invoke-direct {p2, v0, v3}, Lcom/discord/chat/presentation/message/viewholder/EphemeralIndicationViewHolder;-><init>(Lcom/discord/chat/presentation/message/view/EphemeralIndicationView;Lcom/discord/chat/presentation/events/ChatEventHandler;)V

    goto/16 :goto_10

    .line 42
    :pswitch_f
    new-instance p2, Lcom/discord/chat/presentation/message/viewholder/ActivityInviteEmbedViewHolder;

    new-instance v0, Lcom/discord/activity_invites/ActivityInviteEmbedView;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v8}, Lcom/discord/activity_invites/ActivityInviteEmbedView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p2, v0}, Lcom/discord/chat/presentation/message/viewholder/ActivityInviteEmbedViewHolder;-><init>(Lcom/discord/activity_invites/ActivityInviteEmbedView;)V

    goto/16 :goto_10

    .line 43
    :pswitch_10
    new-instance p2, Lcom/discord/chat/presentation/message/viewholder/GiftViewHolder;

    new-instance v1, Lcom/discord/chat/presentation/message/view/GiftView;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, p1, v3, v0, v3}, Lcom/discord/chat/presentation/message/view/GiftView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p2, v1}, Lcom/discord/chat/presentation/message/viewholder/GiftViewHolder;-><init>(Lcom/discord/chat/presentation/message/view/GiftView;)V

    goto/16 :goto_10

    .line 44
    :pswitch_11
    new-instance p2, Lcom/discord/chat/presentation/message/viewholder/GuildEventInviteViewHolder;

    .line 45
    new-instance v0, Lcom/discord/chat/presentation/message/view/GuildEventInviteView;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x6

    const/4 v9, 0x0

    move-object v4, v0

    invoke-direct/range {v4 .. v9}, Lcom/discord/chat/presentation/message/view/GuildEventInviteView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 46
    iget-object p1, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;

    if-nez p1, :cond_8

    invoke-static {v1}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    goto :goto_8

    :cond_8
    move-object v3, p1

    .line 47
    :goto_8
    new-instance p1, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onCreateViewHolder$1;

    invoke-direct {p1, p0}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onCreateViewHolder$1;-><init>(Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;)V

    .line 48
    invoke-direct {p2, v0, v3, p1}, Lcom/discord/chat/presentation/message/viewholder/GuildEventInviteViewHolder;-><init>(Lcom/discord/chat/presentation/message/view/GuildEventInviteView;Lcom/discord/chat/presentation/events/ChatEventHandler;Lkotlin/jvm/functions/Function1;)V

    goto/16 :goto_10

    .line 49
    :pswitch_12
    new-instance p2, Lcom/discord/chat/presentation/message/viewholder/WelcomeStickerViewHolder;

    .line 50
    new-instance v4, Lcom/discord/chat/presentation/stickers/WelcomeStickerView;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v4, p1, v3, v0, v3}, Lcom/discord/chat/presentation/stickers/WelcomeStickerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 51
    new-instance p1, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onCreateViewHolder$2;

    iget-object v0, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;

    if-nez v0, :cond_9

    invoke-static {v1}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    goto :goto_9

    :cond_9
    move-object v3, v0

    :goto_9
    invoke-direct {p1, v3}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$onCreateViewHolder$2;-><init>(Ljava/lang/Object;)V

    .line 52
    invoke-direct {p2, v4, p1}, Lcom/discord/chat/presentation/message/viewholder/WelcomeStickerViewHolder;-><init>(Lcom/discord/chat/presentation/stickers/WelcomeStickerView;Lkotlin/jvm/functions/Function2;)V

    goto/16 :goto_10

    .line 53
    :pswitch_13
    new-instance p2, Lcom/discord/chat/presentation/message/viewholder/TimestampViewHolder;

    .line 54
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const/4 v1, 0x0

    .line 55
    invoke-static {v0, p1, v1}, Lcom/discord/chat/databinding/TimestampViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/discord/chat/databinding/TimestampViewBinding;

    move-result-object p1

    .line 56
    invoke-virtual {p1}, Lcom/discord/chat/databinding/TimestampViewBinding;->getRoot()Landroid/widget/TextView;

    move-result-object p1

    const-string v0, "inflate(\n               \u2026                   ).root"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    invoke-direct {p2, p1}, Lcom/discord/chat/presentation/message/viewholder/TimestampViewHolder;-><init>(Landroid/widget/TextView;)V

    goto/16 :goto_10

    .line 58
    :pswitch_14
    new-instance p2, Lcom/discord/chat/presentation/message/viewholder/MessageComponentsViewHolder;

    new-instance v0, Lcom/discord/chat/presentation/message/view/botuikit/MessageComponentsView;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x6

    const/4 v9, 0x0

    move-object v4, v0

    invoke-direct/range {v4 .. v9}, Lcom/discord/chat/presentation/message/view/botuikit/MessageComponentsView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object p1, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;

    if-nez p1, :cond_a

    invoke-static {v1}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    goto :goto_a

    :cond_a
    move-object v3, p1

    :goto_a
    invoke-direct {p2, v0, v3}, Lcom/discord/chat/presentation/message/viewholder/MessageComponentsViewHolder;-><init>(Lcom/discord/chat/presentation/message/view/botuikit/MessageComponentsView;Lcom/discord/chat/presentation/events/ChatEventHandler;)V

    goto/16 :goto_10

    .line 59
    :pswitch_15
    new-instance p2, Lcom/discord/chat/presentation/message/viewholder/FileAttachmentViewHolder;

    new-instance v4, Lcom/discord/chat/presentation/message/view/FileAttachmentView;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v4, p1, v3, v0, v3}, Lcom/discord/chat/presentation/message/view/FileAttachmentView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object p1, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;

    if-nez p1, :cond_b

    invoke-static {v1}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    goto :goto_b

    :cond_b
    move-object v3, p1

    :goto_b
    invoke-direct {p2, v4, v3}, Lcom/discord/chat/presentation/message/viewholder/FileAttachmentViewHolder;-><init>(Lcom/discord/chat/presentation/message/view/FileAttachmentView;Lcom/discord/chat/presentation/events/ChatEventHandler;)V

    goto/16 :goto_10

    .line 60
    :pswitch_16
    new-instance p2, Lcom/discord/chat/presentation/message/viewholder/VideoAttachmentViewHolder;

    new-instance v4, Lcom/discord/chat/presentation/message/view/VideoAttachmentView;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v4, p1, v3, v0, v3}, Lcom/discord/chat/presentation/message/view/VideoAttachmentView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object p1, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;

    if-nez p1, :cond_c

    invoke-static {v1}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    goto :goto_c

    :cond_c
    move-object v3, p1

    :goto_c
    invoke-direct {p2, v4, v3}, Lcom/discord/chat/presentation/message/viewholder/VideoAttachmentViewHolder;-><init>(Lcom/discord/chat/presentation/message/view/VideoAttachmentView;Lcom/discord/chat/presentation/events/ChatEventHandler;)V

    goto/16 :goto_10

    .line 61
    :pswitch_17
    new-instance p2, Lcom/discord/chat/presentation/message/viewholder/ThreadEmbedViewHolder;

    new-instance v0, Lcom/discord/chat/presentation/message/view/ThreadEmbedView;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v8}, Lcom/discord/chat/presentation/message/view/ThreadEmbedView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p2, v0}, Lcom/discord/chat/presentation/message/viewholder/ThreadEmbedViewHolder;-><init>(Lcom/discord/chat/presentation/message/view/ThreadEmbedView;)V

    goto/16 :goto_10

    .line 62
    :pswitch_18
    new-instance p2, Lcom/discord/chat/presentation/message/viewholder/StickerLottieViewHolder;

    new-instance v0, Lcom/discord/sticker/StickerView;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v8}, Lcom/discord/sticker/StickerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p2, v0}, Lcom/discord/chat/presentation/message/viewholder/StickerLottieViewHolder;-><init>(Lcom/discord/sticker/StickerView;)V

    goto/16 :goto_10

    .line 63
    :pswitch_19
    new-instance p2, Lcom/discord/chat/presentation/message/viewholder/StickerApngViewHolder;

    new-instance v0, Lcom/discord/sticker/StickerView;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v8}, Lcom/discord/sticker/StickerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p2, v0}, Lcom/discord/chat/presentation/message/viewholder/StickerApngViewHolder;-><init>(Lcom/discord/sticker/StickerView;)V

    goto/16 :goto_10

    .line 64
    :pswitch_1a
    new-instance p2, Lcom/discord/chat/presentation/message/viewholder/StickerPngViewHolder;

    new-instance v0, Lcom/discord/sticker/StickerView;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v8}, Lcom/discord/sticker/StickerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p2, v0}, Lcom/discord/chat/presentation/message/viewholder/StickerPngViewHolder;-><init>(Lcom/discord/sticker/StickerView;)V

    goto/16 :goto_10

    .line 65
    :pswitch_1b
    new-instance p2, Lcom/discord/chat/presentation/message/viewholder/GuildInviteViewHolder;

    new-instance v0, Lcom/discord/chat/presentation/message/view/GuildInviteView;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x6

    const/4 v9, 0x0

    move-object v4, v0

    invoke-direct/range {v4 .. v9}, Lcom/discord/chat/presentation/message/view/GuildInviteView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object p1, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;

    if-nez p1, :cond_d

    invoke-static {v1}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    goto :goto_d

    :cond_d
    move-object v3, p1

    :goto_d
    invoke-direct {p2, v0, v3}, Lcom/discord/chat/presentation/message/viewholder/GuildInviteViewHolder;-><init>(Lcom/discord/chat/presentation/message/view/GuildInviteView;Lcom/discord/chat/presentation/events/ChatEventHandler;)V

    goto/16 :goto_10

    .line 66
    :pswitch_1c
    new-instance p2, Lcom/discord/chat/presentation/message/viewholder/ReactionsViewHolder;

    new-instance v1, Lcom/discord/reactions/ReactionsView;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, p1, v3, v0, v3}, Lcom/discord/reactions/ReactionsView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p2, v1}, Lcom/discord/chat/presentation/message/viewholder/ReactionsViewHolder;-><init>(Lcom/discord/reactions/ReactionsView;)V

    goto :goto_10

    .line 67
    :pswitch_1d
    new-instance p2, Lcom/discord/chat/presentation/message/viewholder/UploadProgressViewHolder;

    new-instance v1, Lcom/discord/chat/presentation/uploadprogress/UploadProgressView;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, p1, v3, v0, v3}, Lcom/discord/chat/presentation/uploadprogress/UploadProgressView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p2, v1}, Lcom/discord/chat/presentation/message/viewholder/UploadProgressViewHolder;-><init>(Lcom/discord/chat/presentation/uploadprogress/UploadProgressView;)V

    goto :goto_10

    .line 68
    :pswitch_1e
    new-instance p2, Lcom/discord/chat/presentation/message/viewholder/ImageAttachmentViewHolder;

    new-instance v4, Lcom/discord/chat/presentation/message/view/ImageAttachmentView;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v4, p1, v3, v0, v3}, Lcom/discord/chat/presentation/message/view/ImageAttachmentView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object p1, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;

    if-nez p1, :cond_e

    invoke-static {v1}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    goto :goto_e

    :cond_e
    move-object v3, p1

    :goto_e
    invoke-direct {p2, v4, v3}, Lcom/discord/chat/presentation/message/viewholder/ImageAttachmentViewHolder;-><init>(Lcom/discord/chat/presentation/message/view/ImageAttachmentView;Lcom/discord/chat/presentation/events/ChatEventHandler;)V

    goto :goto_10

    .line 69
    :pswitch_1f
    new-instance p2, Lcom/discord/chat/presentation/message/viewholder/EmbedViewHolder;

    new-instance v4, Lcom/discord/chat/presentation/message/view/EmbedView;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v4, p1, v3, v0, v3}, Lcom/discord/chat/presentation/message/view/EmbedView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object p1, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;

    if-nez p1, :cond_f

    invoke-static {v1}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    goto :goto_f

    :cond_f
    move-object v3, p1

    :goto_f
    invoke-direct {p2, v4, v3}, Lcom/discord/chat/presentation/message/viewholder/EmbedViewHolder;-><init>(Lcom/discord/chat/presentation/message/view/EmbedView;Lcom/discord/chat/presentation/events/ChatEventHandler;)V

    goto :goto_10

    .line 70
    :pswitch_20
    new-instance p2, Lcom/discord/chat/presentation/message/viewholder/MessageContentViewHolder;

    new-instance v0, Lcom/discord/chat/presentation/message/view/MessageContentView;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v8}, Lcom/discord/chat/presentation/message/view/MessageContentView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p2, v0}, Lcom/discord/chat/presentation/message/viewholder/MessageContentViewHolder;-><init>(Lcom/discord/chat/presentation/message/view/MessageContentView;)V

    :goto_10
    return-object p2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public bridge synthetic onViewAttachedToWindow(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;

    invoke-virtual {p0, p1}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->onViewAttachedToWindow(Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;)V

    return-void
.end method

.method public onViewAttachedToWindow(Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;)V
    .locals 1

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->onViewAttachedToWindow(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V

    .line 3
    instance-of v0, p1, Lcom/discord/chat/presentation/message/viewholder/MessageContentViewHolder;

    if-eqz v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->messageContentViewLifecycleListener:Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$MessageContentViewLifecycleListener;

    if-nez v0, :cond_0

    const-string v0, "messageContentViewLifecycleListener"

    invoke-static {v0}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    check-cast p1, Lcom/discord/chat/presentation/message/viewholder/MessageContentViewHolder;

    invoke-virtual {p1}, Lcom/discord/chat/presentation/message/viewholder/MessageContentViewHolder;->getMessageContentView()Lcom/discord/chat/presentation/message/view/MessageContentView;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$MessageContentViewLifecycleListener;->onAttachedToWindow(Lcom/discord/chat/presentation/message/view/MessageContentView;)V

    :cond_1
    return-void
.end method

.method public bridge synthetic onViewDetachedFromWindow(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;

    invoke-virtual {p0, p1}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->onViewDetachedFromWindow(Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;)V

    return-void
.end method

.method public onViewDetachedFromWindow(Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;)V
    .locals 1

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->onViewDetachedFromWindow(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V

    .line 3
    instance-of p1, p1, Lcom/discord/chat/presentation/message/viewholder/MessageContentViewHolder;

    if-eqz p1, :cond_1

    .line 4
    iget-object p1, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->messageContentViewLifecycleListener:Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$MessageContentViewLifecycleListener;

    if-nez p1, :cond_0

    const-string p1, "messageContentViewLifecycleListener"

    invoke-static {p1}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_0
    invoke-interface {p1}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$MessageContentViewLifecycleListener;->onDetachedFromWindow()V

    :cond_1
    return-void
.end method

.method public final setComponentProvider(Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->botComponentProvider:Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;

    return-void
.end method

.method public final setEventHandler(Lcom/discord/chat/presentation/events/ChatEventHandler;)V
    .locals 1

    .line 1
    const-string v0, "eventHandler"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
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

.method public final setItems-bo5iIEc(Ljava/lang/String;JLcom/discord/primitives/GuildId;Ljava/util/List;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NotifyDataSetChanged"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J",
            "Lcom/discord/primitives/GuildId;",
            "Ljava/util/List<",
            "+",
            "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "messageId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "items"

    .line 7
    .line 8
    invoke-static {p5, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->messageId:Ljava/lang/String;

    .line 12
    .line 13
    invoke-static {p2, p3}, Lcom/discord/primitives/ChannelId;->box-impl(J)Lcom/discord/primitives/ChannelId;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->channelId:Lcom/discord/primitives/ChannelId;

    .line 18
    .line 19
    iput-object p4, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->guildId:Lcom/discord/primitives/GuildId;

    .line 20
    .line 21
    sget-object p1, Lcom/discord/chat/presentation/root/ChatView;->Companion:Lcom/discord/chat/presentation/root/ChatView$Companion;

    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/discord/chat/presentation/root/ChatView$Companion;->getAreChatAnimationsEnabled()Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    iget-object p1, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->items:Ljava/util/List;

    .line 30
    .line 31
    new-instance p2, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-direct {p2, p5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 34
    .line 35
    .line 36
    iput-object p2, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->items:Ljava/util/List;

    .line 37
    .line 38
    new-instance p3, Lcom/discord/recycler_view/utils/ItemDiffer;

    .line 39
    .line 40
    invoke-direct {p3, p1, p2}, Lcom/discord/recycler_view/utils/ItemDiffer;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 41
    .line 42
    .line 43
    const/4 p1, 0x1

    .line 44
    invoke-static {p3, p1}, Landroidx/recyclerview/widget/c;->b(Landroidx/recyclerview/widget/c$b;Z)Landroidx/recyclerview/widget/c$e;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    const-string p2, "calculateDiff(differ, true)"

    .line 49
    .line 50
    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1, p0}, Landroidx/recyclerview/widget/c$e;->c(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    iput-object p5, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->items:Ljava/util/List;

    .line 58
    .line 59
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 60
    .line 61
    .line 62
    :goto_0
    return-void
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
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
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
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
.end method

.method public final setMessageContentViewLifecycleListener(Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$MessageContentViewLifecycleListener;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->messageContentViewLifecycleListener:Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$MessageContentViewLifecycleListener;

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
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
