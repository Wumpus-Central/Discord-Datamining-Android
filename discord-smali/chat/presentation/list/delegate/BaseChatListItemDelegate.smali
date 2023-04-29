.class public abstract Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate;
.super Lcom/hannesdorfmann/adapterdelegates4/AdapterDelegate;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate$Metadata;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/discord/chat/presentation/list/item/ChatListItem;",
        "V:",
        "Landroid/view/View;",
        ">",
        "Lcom/hannesdorfmann/adapterdelegates4/AdapterDelegate<",
        "Ljava/util/List<",
        "+",
        "Lcom/discord/chat/presentation/list/item/ChatListItem;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008&\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u0001*\u0008\u0008\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00010\u00060\u0005:\u0001+B/\u0012\u0010\u0010!\u001a\u000c\u0012\u0004\u0012\u00020\u001f0\u001ej\u0002` \u0012\u0014\u0008\u0002\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00130#\u00a2\u0006\u0004\u0008)\u0010*J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0008H&J\u0017\u0010\u000e\u001a\u00028\u00012\u0006\u0010\r\u001a\u00020\u000cH&\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ-\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00028\u00002\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0011H&\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001e\u0010\u0017\u001a\u00020\n2\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0004J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\u000cH\u0004J4\u0010\u001d\u001a\u00020\u00132\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u001a\u001a\u00020\u00182\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u0006H\u0004R\u001e\u0010!\u001a\u000c\u0012\u0004\u0012\u00020\u001f0\u001ej\u0002` 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R \u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00130#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%R\u0014\u0010(\u001a\u00020\u001f8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\u0008&\u0010\'\u00a8\u0006,"
    }
    d2 = {
        "Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate;",
        "Lcom/discord/chat/presentation/list/item/ChatListItem;",
        "T",
        "Landroid/view/View;",
        "V",
        "Lcom/hannesdorfmann/adapterdelegates4/AdapterDelegate;",
        "",
        "item",
        "",
        "position",
        "",
        "isForItem",
        "Landroid/view/ViewGroup;",
        "parent",
        "createView",
        "(Landroid/view/ViewGroup;)Landroid/view/View;",
        "view",
        "Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate$Metadata;",
        "metadata",
        "",
        "bindView",
        "(Landroid/view/View;Lcom/discord/chat/presentation/list/item/ChatListItem;Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate$Metadata;)V",
        "items",
        "isForViewType",
        "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;",
        "onCreateViewHolder",
        "holder",
        "",
        "payloads",
        "onBindViewHolder",
        "Lkotlin/Function0;",
        "Lcom/discord/chat/presentation/events/ChatEventHandler;",
        "Lcom/discord/chat/presentation/list/delegate/EventHandlerProvider;",
        "eventHandlerProvider",
        "Lkotlin/jvm/functions/Function0;",
        "Lkotlin/Function1;",
        "initBlock",
        "Lkotlin/jvm/functions/Function1;",
        "getEventHandler",
        "()Lcom/discord/chat/presentation/events/ChatEventHandler;",
        "eventHandler",
        "<init>",
        "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V",
        "Metadata",
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
.field private final eventHandlerProvider:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lcom/discord/chat/presentation/events/ChatEventHandler;",
            ">;"
        }
    .end annotation
.end field

.field private final initBlock:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "TV;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Lcom/discord/chat/presentation/events/ChatEventHandler;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-TV;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "eventHandlerProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initBlock"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Lcom/hannesdorfmann/adapterdelegates4/AdapterDelegate;-><init>()V

    .line 4
    iput-object p1, p0, Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate;->eventHandlerProvider:Lkotlin/jvm/functions/Function0;

    .line 5
    iput-object p2, p0, Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate;->initBlock:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 1
    sget-object p2, Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate$1;->INSTANCE:Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate$1;

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public abstract bindView(Landroid/view/View;Lcom/discord/chat/presentation/list/item/ChatListItem;Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate$Metadata;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;TT;",
            "Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate$Metadata<",
            "TV;>;)V"
        }
    .end annotation
.end method

.method public abstract createView(Landroid/view/ViewGroup;)Landroid/view/View;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            ")TV;"
        }
    .end annotation
.end method

.method protected final getEventHandler()Lcom/discord/chat/presentation/events/ChatEventHandler;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate;->eventHandlerProvider:Lkotlin/jvm/functions/Function0;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/discord/chat/presentation/events/ChatEventHandler;

    return-object v0
.end method

.method public abstract isForItem(Lcom/discord/chat/presentation/list/item/ChatListItem;I)Z
.end method

.method public bridge synthetic isForViewType(Ljava/lang/Object;I)Z
    .locals 0

    .line 1
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1, p2}, Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate;->isForViewType(Ljava/util/List;I)Z

    move-result p1

    return p1
.end method

.method protected final isForViewType(Ljava/util/List;I)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/discord/chat/presentation/list/item/ChatListItem;",
            ">;I)Z"
        }
    .end annotation

    const-string v0, "items"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/discord/chat/presentation/list/item/ChatListItem;

    invoke-virtual {p0, p1, p2}, Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate;->isForItem(Lcom/discord/chat/presentation/list/item/ChatListItem;I)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic onBindViewHolder(Ljava/lang/Object;ILandroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/util/List;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate;->onBindViewHolder(Ljava/util/List;ILandroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/util/List;)V

    return-void
.end method

.method protected final onBindViewHolder(Ljava/util/List;ILandroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/discord/chat/presentation/list/item/ChatListItem;",
            ">;I",
            "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "items"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "holder"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "payloads"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    check-cast p3, Lcom/discord/chat/presentation/list/delegate/ChatListItemViewHolder;

    .line 3
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    const-string v0, "null cannot be cast to non-null type T of com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lcom/discord/chat/presentation/list/item/ChatListItem;

    .line 4
    new-instance v0, Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate$Metadata;

    invoke-direct {v0, p3, p1, p4}, Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate$Metadata;-><init>(Lcom/discord/chat/presentation/list/delegate/ChatListItemViewHolder;Ljava/util/List;Ljava/util/List;)V

    .line 5
    invoke-virtual {p3}, Lcom/discord/chat/presentation/list/delegate/ChatListItemViewHolder;->getView()Landroid/view/View;

    move-result-object p1

    .line 6
    invoke-virtual {p0, p1, p2, v0}, Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate;->bindView(Landroid/view/View;Lcom/discord/chat/presentation/list/item/ChatListItem;Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate$Metadata;)V

    return-void
.end method

.method protected final onCreateViewHolder(Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 1

    .line 1
    const-string v0, "parent"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate;->createView(Landroid/view/ViewGroup;)Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object v0, p0, Lcom/discord/chat/presentation/list/delegate/BaseChatListItemDelegate;->initBlock:Lkotlin/jvm/functions/Function1;

    .line 11
    .line 12
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    new-instance v0, Lcom/discord/chat/presentation/list/delegate/ChatListItemViewHolder;

    .line 16
    .line 17
    invoke-direct {v0, p1}, Lcom/discord/chat/presentation/list/delegate/ChatListItemViewHolder;-><init>(Landroid/view/View;)V

    .line 18
    .line 19
    .line 20
    return-object v0
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
