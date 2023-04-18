.class public final Lcom/discord/chat/presentation/message/system/SystemMessageView;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"

# interfaces
.implements Lcom/discord/chat/presentation/spine/SpineParentMessage;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/chat/presentation/message/system/SystemMessageView$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\u001e\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u001cH\u0002J\u001c\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u000f0\u001e2\u0006\u0010 \u001a\u00020!H\u0002J\u000e\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%J \u0010&\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u001c2\u0008\u0008\u0002\u0010\'\u001a\u00020(R\u001e\u0010\u0008\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\u0008\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"
    }
    d2 = {
        "Lcom/discord/chat/presentation/message/system/SystemMessageView;",
        "Landroidx/constraintlayout/widget/ConstraintLayout;",
        "Lcom/discord/chat/presentation/spine/SpineParentMessage;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "accessories",
        "Ljava/util/ArrayList;",
        "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;",
        "Lkotlin/collections/ArrayList;",
        "binding",
        "Lcom/discord/chat/databinding/SystemMessageViewBinding;",
        "greenIconColor",
        "",
        "normalIconColor",
        "pinkIconColor",
        "redIconColor",
        "spineOriginView",
        "Landroid/view/View;",
        "getSpineOriginView",
        "()Landroid/view/View;",
        "warnIconColor",
        "generateMessageAccessories",
        "",
        "message",
        "Lcom/discord/chat/bridge/Message;",
        "Lcom/discord/chat/presentation/root/MessageContext;",
        "getIconAndColor",
        "Lkotlin/Pair;",
        "Lcom/discord/react_asset_fetcher/ReactAsset;",
        "messageType",
        "Lcom/discord/chat/bridge/MessageType;",
        "setAccessoriesRecycledViewPool",
        "",
        "recycledViewPool",
        "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;",
        "setMessage",
        "eventHandler",
        "Lcom/discord/chat/presentation/events/ChatEventHandler;",
        "chat_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private accessories:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;",
            ">;"
        }
    .end annotation
.end field

.field private final binding:Lcom/discord/chat/databinding/SystemMessageViewBinding;

.field private final greenIconColor:I

.field private final normalIconColor:I

.field private final pinkIconColor:I

.field private final redIconColor:I

.field private final warnIconColor:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p0, p1, v0, v1, v0}, Lcom/discord/chat/presentation/message/system/SystemMessageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 3
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object p2

    invoke-virtual {p2}, Lcom/discord/theme/DiscordTheme;->getInteractiveNormal()I

    move-result p2

    iput p2, p0, Lcom/discord/chat/presentation/message/system/SystemMessageView;->normalIconColor:I

    .line 4
    sget p2, Lcom/discord/chat/R$color;->green_360:I

    invoke-static {p0, p2}, Lcom/discord/theme/utils/ColorUtilsKt;->getColorCompat(Landroid/view/View;I)I

    move-result p2

    iput p2, p0, Lcom/discord/chat/presentation/message/system/SystemMessageView;->greenIconColor:I

    .line 5
    sget p2, Lcom/discord/chat/R$color;->red_400:I

    invoke-static {p0, p2}, Lcom/discord/theme/utils/ColorUtilsKt;->getColorCompat(Landroid/view/View;I)I

    move-result p2

    iput p2, p0, Lcom/discord/chat/presentation/message/system/SystemMessageView;->redIconColor:I

    .line 6
    sget p2, Lcom/discord/chat/R$color;->yellow_300:I

    invoke-static {p0, p2}, Lcom/discord/theme/utils/ColorUtilsKt;->getColorCompat(Landroid/view/View;I)I

    move-result p2

    iput p2, p0, Lcom/discord/chat/presentation/message/system/SystemMessageView;->warnIconColor:I

    .line 7
    sget p2, Lcom/discord/chat/R$color;->guild_boosting_pink:I

    invoke-static {p0, p2}, Lcom/discord/theme/utils/ColorUtilsKt;->getColorCompat(Landroid/view/View;I)I

    move-result p2

    iput p2, p0, Lcom/discord/chat/presentation/message/system/SystemMessageView;->pinkIconColor:I

    .line 8
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1, p0}, Lcom/discord/chat/databinding/SystemMessageViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/discord/chat/databinding/SystemMessageViewBinding;

    move-result-object p1

    const-string p2, "inflate(LayoutInflater.from(context), this)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/discord/chat/presentation/message/system/SystemMessageView;->binding:Lcom/discord/chat/databinding/SystemMessageViewBinding;

    const/4 p1, 0x3

    const/4 p2, 0x0

    const/4 v0, 0x0

    .line 9
    invoke-static {p0, v0, v0, p1, p2}, Lcom/discord/ripple/RippleUtilsKt;->addRipple$default(Landroid/view/View;ZIILjava/lang/Object;)V

    .line 10
    new-instance p1, Ljava/util/ArrayList;

    const/4 p2, 0x2

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Lcom/discord/chat/presentation/message/system/SystemMessageView;->accessories:Ljava/util/ArrayList;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 1
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/discord/chat/presentation/message/system/SystemMessageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public static synthetic b(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/events/ChatEventHandler;Landroid/view/View;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/discord/chat/presentation/message/system/SystemMessageView;->setMessage$lambda$0(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/events/ChatEventHandler;Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method private final generateMessageAccessories(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/root/MessageContext;)Ljava/util/List;
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/chat/bridge/Message;",
            "Lcom/discord/chat/presentation/root/MessageContext;",
            ")",
            "Ljava/util/List<",
            "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lcom/discord/chat/presentation/message/system/SystemMessageView;->accessories:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 8
    .line 9
    .line 10
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getConstrainedWidth()Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    iget v2, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 30
    .line 31
    :goto_0
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getContent()Lcom/discord/chat/bridge/structurabletext/StructurableText;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    const/16 v21, 0x0

    .line 36
    .line 37
    if-eqz v5, :cond_2

    .line 38
    .line 39
    iget-object v15, v0, Lcom/discord/chat/presentation/message/system/SystemMessageView;->accessories:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getId-3Eiw7ao()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-static/range {p1 .. p1}, Lcom/discord/chat/bridge/MessageKt;->shouldAnimateEmoji(Lcom/discord/chat/bridge/Message;)Z

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getShouldShowRoleDot()Z

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getShouldShowRoleOnName()Z

    .line 54
    .line 55
    .line 56
    move-result v8

    .line 57
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getTimestamp()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    if-eqz v3, :cond_1

    .line 62
    .line 63
    move/from16 v9, v21

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_1
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    sget v9, Lcom/discord/chat/R$dimen;->message_accessories_vertical_spacing:I

    .line 71
    .line 72
    invoke-virtual {v3, v9}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    move v9, v3

    .line 77
    :goto_1
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-virtual {v3}, Lcom/discord/theme/DiscordTheme;->getTextNormal()I

    .line 82
    .line 83
    .line 84
    move-result v10

    .line 85
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    invoke-virtual {v3}, Lcom/discord/theme/DiscordTheme;->getTextNormal()I

    .line 90
    .line 91
    .line 92
    move-result v11

    .line 93
    sget-object v12, Lcom/discord/fonts/DiscordFont;->PrimaryNormal:Lcom/discord/fonts/DiscordFont;

    .line 94
    .line 95
    new-instance v14, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;

    .line 96
    .line 97
    move-object v3, v14

    .line 98
    const/16 v13, 0x10

    .line 99
    .line 100
    const/16 v16, 0x1

    .line 101
    .line 102
    move-object/from16 v22, v14

    .line 103
    .line 104
    move/from16 v14, v16

    .line 105
    .line 106
    const/16 v16, 0x0

    .line 107
    .line 108
    const/16 v17, 0x0

    .line 109
    .line 110
    const/16 v18, 0x0

    .line 111
    .line 112
    const/16 v19, 0x6000

    .line 113
    .line 114
    const/16 v20, 0x0

    .line 115
    .line 116
    move-object v1, v15

    .line 117
    move v15, v2

    .line 118
    invoke-direct/range {v3 .. v20}, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;-><init>(Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;ZZZIIILcom/discord/fonts/DiscordFont;IZILjava/lang/String;Lcom/discord/chat/bridge/truncation/Truncation;Lcom/discord/theme/DiscordTheme;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 119
    .line 120
    .line 121
    move-object/from16 v3, v22

    .line 122
    .line 123
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    :cond_2
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getTimestamp()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v6

    .line 130
    if-eqz v6, :cond_3

    .line 131
    .line 132
    iget-object v1, v0, Lcom/discord/chat/presentation/message/system/SystemMessageView;->accessories:Ljava/util/ArrayList;

    .line 133
    .line 134
    new-instance v3, Lcom/discord/chat/presentation/message/messagepart/TimestampMessageAccessory;

    .line 135
    .line 136
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getId-3Eiw7ao()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    invoke-virtual {v4}, Lcom/discord/theme/DiscordTheme;->getTextMuted()I

    .line 145
    .line 146
    .line 147
    move-result v7

    .line 148
    sget-object v8, Lcom/discord/fonts/DiscordFont;->PrimaryMedium:Lcom/discord/fonts/DiscordFont;

    .line 149
    .line 150
    const/4 v9, 0x0

    .line 151
    move-object v4, v3

    .line 152
    invoke-direct/range {v4 .. v9}, Lcom/discord/chat/presentation/message/messagepart/TimestampMessageAccessory;-><init>(Ljava/lang/String;Ljava/lang/String;ILcom/discord/fonts/DiscordFont;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    :cond_3
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getTotalMonthsSubscribed()Ljava/lang/Integer;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    const/4 v9, 0x1

    .line 163
    if-eqz v1, :cond_4

    .line 164
    .line 165
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    if-gt v1, v9, :cond_4

    .line 170
    .line 171
    iget-object v1, v0, Lcom/discord/chat/presentation/message/system/SystemMessageView;->accessories:Ljava/util/ArrayList;

    .line 172
    .line 173
    new-instance v10, Lcom/discord/chat/presentation/message/messagepart/RoleSubscriptionPurchaseAccessory;

    .line 174
    .line 175
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getId-3Eiw7ao()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v4

    .line 179
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getUsername()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v5

    .line 183
    iget-object v3, v0, Lcom/discord/chat/presentation/message/system/SystemMessageView;->binding:Lcom/discord/chat/databinding/SystemMessageViewBinding;

    .line 184
    .line 185
    invoke-virtual {v3}, Lcom/discord/chat/databinding/SystemMessageViewBinding;->getRoot()Landroid/view/View;

    .line 186
    .line 187
    .line 188
    move-result-object v3

    .line 189
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    const-string v6, "binding.root.context"

    .line 194
    .line 195
    invoke-static {v3, v6}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    move-object/from16 v11, p1

    .line 199
    .line 200
    invoke-static {v11, v3}, Lcom/discord/chat/bridge/MessageKt;->avatarUrl(Lcom/discord/chat/bridge/Message;Landroid/content/Context;)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v6

    .line 204
    const/4 v8, 0x0

    .line 205
    move-object v3, v10

    .line 206
    move v7, v2

    .line 207
    invoke-direct/range {v3 .. v8}, Lcom/discord/chat/presentation/message/messagepart/RoleSubscriptionPurchaseAccessory;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    goto :goto_2

    .line 214
    :cond_4
    move-object/from16 v11, p1

    .line 215
    .line 216
    :goto_2
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getSticker()Lcom/discord/chat/bridge/sticker/Sticker;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    if-eqz v1, :cond_5

    .line 221
    .line 222
    iget-object v2, v0, Lcom/discord/chat/presentation/message/system/SystemMessageView;->accessories:Ljava/util/ArrayList;

    .line 223
    .line 224
    new-instance v3, Lcom/discord/chat/presentation/message/messagepart/WelcomeStickerAccessory;

    .line 225
    .line 226
    invoke-direct {v3, v11, v1}, Lcom/discord/chat/presentation/message/messagepart/WelcomeStickerAccessory;-><init>(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/bridge/sticker/Sticker;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    :cond_5
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getType()Lcom/discord/chat/bridge/MessageType;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    sget-object v2, Lcom/discord/chat/bridge/MessageType;->STAGE_RAISE_HAND:Lcom/discord/chat/bridge/MessageType;

    .line 237
    .line 238
    if-ne v1, v2, :cond_6

    .line 239
    .line 240
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getShowInviteToSpeakButton()Ljava/lang/Boolean;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 245
    .line 246
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    move-result v1

    .line 250
    if-eqz v1, :cond_6

    .line 251
    .line 252
    iget-object v1, v0, Lcom/discord/chat/presentation/message/system/SystemMessageView;->accessories:Ljava/util/ArrayList;

    .line 253
    .line 254
    new-instance v2, Lcom/discord/chat/presentation/message/messagepart/InviteToSpeakAccessory;

    .line 255
    .line 256
    invoke-direct {v2, v11}, Lcom/discord/chat/presentation/message/messagepart/InviteToSpeakAccessory;-><init>(Lcom/discord/chat/bridge/Message;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    :cond_6
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getReactions()Ljava/util/List;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    if-eqz v1, :cond_7

    .line 267
    .line 268
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 269
    .line 270
    .line 271
    move-result v1

    .line 272
    xor-int/2addr v1, v9

    .line 273
    if-ne v1, v9, :cond_7

    .line 274
    .line 275
    move/from16 v21, v9

    .line 276
    .line 277
    :cond_7
    if-eqz v21, :cond_8

    .line 278
    .line 279
    iget-object v1, v0, Lcom/discord/chat/presentation/message/system/SystemMessageView;->accessories:Ljava/util/ArrayList;

    .line 280
    .line 281
    new-instance v2, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;

    .line 282
    .line 283
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getId-3Eiw7ao()Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v13

    .line 287
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getReactions()Ljava/util/List;

    .line 288
    .line 289
    .line 290
    move-result-object v14

    .line 291
    invoke-virtual/range {p2 .. p2}, Lcom/discord/chat/presentation/root/MessageContext;->getCanAddNewReactions()Z

    .line 292
    .line 293
    .line 294
    move-result v15

    .line 295
    invoke-virtual/range {p2 .. p2}, Lcom/discord/chat/presentation/root/MessageContext;->getAddReactionLabel()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v16

    .line 299
    invoke-virtual/range {p2 .. p2}, Lcom/discord/chat/presentation/root/MessageContext;->getAddNewReactionAccessibilityLabel()Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v17

    .line 303
    invoke-virtual/range {p2 .. p2}, Lcom/discord/chat/presentation/root/MessageContext;->getReactionsTheme()Lcom/discord/chat/bridge/reaction/ReactionsTheme;

    .line 304
    .line 305
    .line 306
    move-result-object v18

    .line 307
    const/16 v19, 0x0

    .line 308
    .line 309
    invoke-virtual/range {p2 .. p2}, Lcom/discord/chat/presentation/root/MessageContext;->getUseSortedReactions()Z

    .line 310
    .line 311
    .line 312
    move-result v20

    .line 313
    const/16 v21, 0x0

    .line 314
    .line 315
    move-object v12, v2

    .line 316
    invoke-direct/range {v12 .. v21}, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;-><init>(Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/reaction/ReactionsTheme;Lcom/discord/theme/DiscordTheme;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 320
    .line 321
    .line 322
    :cond_8
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getThreadEmbed()Lcom/discord/chat/bridge/threads/ThreadEmbed;

    .line 323
    .line 324
    .line 325
    move-result-object v1

    .line 326
    const/4 v2, 0x0

    .line 327
    if-eqz v1, :cond_9

    .line 328
    .line 329
    iget-object v3, v0, Lcom/discord/chat/presentation/message/system/SystemMessageView;->accessories:Ljava/util/ArrayList;

    .line 330
    .line 331
    new-instance v4, Lcom/discord/chat/presentation/message/messagepart/ThreadEmbedMessageAccessory;

    .line 332
    .line 333
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getId-3Eiw7ao()Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v5

    .line 337
    invoke-direct {v4, v5, v1, v2}, Lcom/discord/chat/presentation/message/messagepart/ThreadEmbedMessageAccessory;-><init>(Ljava/lang/String;Lcom/discord/chat/bridge/threads/ThreadEmbed;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 341
    .line 342
    .line 343
    :cond_9
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getEphemeralIndication()Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;

    .line 344
    .line 345
    .line 346
    move-result-object v1

    .line 347
    if-eqz v1, :cond_a

    .line 348
    .line 349
    iget-object v3, v0, Lcom/discord/chat/presentation/message/system/SystemMessageView;->accessories:Ljava/util/ArrayList;

    .line 350
    .line 351
    new-instance v4, Lcom/discord/chat/presentation/message/messagepart/EphemeralIndicationMessageAccessory;

    .line 352
    .line 353
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getId-3Eiw7ao()Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v5

    .line 357
    invoke-direct {v4, v5, v1, v2}, Lcom/discord/chat/presentation/message/messagepart/EphemeralIndicationMessageAccessory;-><init>(Ljava/lang/String;Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 361
    .line 362
    .line 363
    :cond_a
    iget-object v1, v0, Lcom/discord/chat/presentation/message/system/SystemMessageView;->accessories:Ljava/util/ArrayList;

    .line 364
    .line 365
    return-object v1
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
.end method

.method private final getIconAndColor(Lcom/discord/chat/bridge/MessageType;)Lkotlin/Pair;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/chat/bridge/MessageType;",
            ")",
            "Lkotlin/Pair<",
            "Lcom/discord/react_asset_fetcher/ReactAsset;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/discord/chat/presentation/message/system/SystemMessageView$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    aget v0, v0, v1

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 13
    .line 14
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    const-string v2, "Unhandled message type: "

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw v0

    .line 35
    :pswitch_0
    sget-object p1, Lcom/discord/react_asset_fetcher/ReactAsset;->RaisedHand:Lcom/discord/react_asset_fetcher/ReactAsset;

    .line 36
    .line 37
    iget v0, p0, Lcom/discord/chat/presentation/message/system/SystemMessageView;->normalIconColor:I

    .line 38
    .line 39
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {p1, v0}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    goto/16 :goto_0

    .line 48
    .line 49
    :pswitch_1
    sget-object p1, Lcom/discord/react_asset_fetcher/ReactAsset;->MoveToSpeaker:Lcom/discord/react_asset_fetcher/ReactAsset;

    .line 50
    .line 51
    iget v0, p0, Lcom/discord/chat/presentation/message/system/SystemMessageView;->normalIconColor:I

    .line 52
    .line 53
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-static {p1, v0}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    goto/16 :goto_0

    .line 62
    .line 63
    :pswitch_2
    sget-object p1, Lcom/discord/react_asset_fetcher/ReactAsset;->StageChannel:Lcom/discord/react_asset_fetcher/ReactAsset;

    .line 64
    .line 65
    iget v0, p0, Lcom/discord/chat/presentation/message/system/SystemMessageView;->normalIconColor:I

    .line 66
    .line 67
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-static {p1, v0}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    goto/16 :goto_0

    .line 76
    .line 77
    :pswitch_3
    sget-object p1, Lcom/discord/react_asset_fetcher/ReactAsset;->StageChannel:Lcom/discord/react_asset_fetcher/ReactAsset;

    .line 78
    .line 79
    iget v0, p0, Lcom/discord/chat/presentation/message/system/SystemMessageView;->greenIconColor:I

    .line 80
    .line 81
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-static {p1, v0}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    goto/16 :goto_0

    .line 90
    .line 91
    :pswitch_4
    sget-object p1, Lcom/discord/react_asset_fetcher/ReactAsset;->Thread:Lcom/discord/react_asset_fetcher/ReactAsset;

    .line 92
    .line 93
    iget v0, p0, Lcom/discord/chat/presentation/message/system/SystemMessageView;->normalIconColor:I

    .line 94
    .line 95
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-static {p1, v0}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    goto/16 :goto_0

    .line 104
    .line 105
    :pswitch_5
    sget-object p1, Lcom/discord/react_asset_fetcher/ReactAsset;->Alert:Lcom/discord/react_asset_fetcher/ReactAsset;

    .line 106
    .line 107
    iget v0, p0, Lcom/discord/chat/presentation/message/system/SystemMessageView;->warnIconColor:I

    .line 108
    .line 109
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-static {p1, v0}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    goto/16 :goto_0

    .line 118
    .line 119
    :pswitch_6
    sget-object p1, Lcom/discord/react_asset_fetcher/ReactAsset;->Check:Lcom/discord/react_asset_fetcher/ReactAsset;

    .line 120
    .line 121
    iget v0, p0, Lcom/discord/chat/presentation/message/system/SystemMessageView;->greenIconColor:I

    .line 122
    .line 123
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-static {p1, v0}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    goto :goto_0

    .line 132
    :pswitch_7
    sget-object p1, Lcom/discord/react_asset_fetcher/ReactAsset;->Close:Lcom/discord/react_asset_fetcher/ReactAsset;

    .line 133
    .line 134
    iget v0, p0, Lcom/discord/chat/presentation/message/system/SystemMessageView;->redIconColor:I

    .line 135
    .line 136
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-static {p1, v0}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    goto :goto_0

    .line 145
    :pswitch_8
    sget-object p1, Lcom/discord/react_asset_fetcher/ReactAsset;->AnnouncementThread:Lcom/discord/react_asset_fetcher/ReactAsset;

    .line 146
    .line 147
    iget v0, p0, Lcom/discord/chat/presentation/message/system/SystemMessageView;->normalIconColor:I

    .line 148
    .line 149
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-static {p1, v0}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    goto :goto_0

    .line 158
    :pswitch_9
    sget-object p1, Lcom/discord/react_asset_fetcher/ReactAsset;->MemberListBadge:Lcom/discord/react_asset_fetcher/ReactAsset;

    .line 159
    .line 160
    iget v0, p0, Lcom/discord/chat/presentation/message/system/SystemMessageView;->pinkIconColor:I

    .line 161
    .line 162
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-static {p1, v0}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    goto :goto_0

    .line 171
    :pswitch_a
    sget-object p1, Lcom/discord/react_asset_fetcher/ReactAsset;->Ticket:Lcom/discord/react_asset_fetcher/ReactAsset;

    .line 172
    .line 173
    iget v0, p0, Lcom/discord/chat/presentation/message/system/SystemMessageView;->normalIconColor:I

    .line 174
    .line 175
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    invoke-static {p1, v0}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    goto :goto_0

    .line 184
    :pswitch_b
    sget-object p1, Lcom/discord/react_asset_fetcher/ReactAsset;->Pin:Lcom/discord/react_asset_fetcher/ReactAsset;

    .line 185
    .line 186
    iget v0, p0, Lcom/discord/chat/presentation/message/system/SystemMessageView;->normalIconColor:I

    .line 187
    .line 188
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-static {p1, v0}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    goto :goto_0

    .line 197
    :pswitch_c
    sget-object p1, Lcom/discord/react_asset_fetcher/ReactAsset;->Pencil:Lcom/discord/react_asset_fetcher/ReactAsset;

    .line 198
    .line 199
    iget v0, p0, Lcom/discord/chat/presentation/message/system/SystemMessageView;->normalIconColor:I

    .line 200
    .line 201
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    invoke-static {p1, v0}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    goto :goto_0

    .line 210
    :pswitch_d
    sget-object p1, Lcom/discord/react_asset_fetcher/ReactAsset;->ArrowBack:Lcom/discord/react_asset_fetcher/ReactAsset;

    .line 211
    .line 212
    iget v0, p0, Lcom/discord/chat/presentation/message/system/SystemMessageView;->redIconColor:I

    .line 213
    .line 214
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    invoke-static {p1, v0}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    goto :goto_0

    .line 223
    :pswitch_e
    sget-object p1, Lcom/discord/react_asset_fetcher/ReactAsset;->ArrowForward:Lcom/discord/react_asset_fetcher/ReactAsset;

    .line 224
    .line 225
    iget v0, p0, Lcom/discord/chat/presentation/message/system/SystemMessageView;->greenIconColor:I

    .line 226
    .line 227
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    invoke-static {p1, v0}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    :goto_0
    return-object p1

    .line 236
    nop

    .line 237
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_d
        :pswitch_d
        :pswitch_c
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public static synthetic setMessage$default(Lcom/discord/chat/presentation/message/system/SystemMessageView;Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/root/MessageContext;Lcom/discord/chat/presentation/events/ChatEventHandler;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x4

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    sget-object p3, Lcom/discord/chat/presentation/events/ChatEventHandler$Empty;->INSTANCE:Lcom/discord/chat/presentation/events/ChatEventHandler$Empty;

    .line 6
    .line 7
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/discord/chat/presentation/message/system/SystemMessageView;->setMessage(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/root/MessageContext;Lcom/discord/chat/presentation/events/ChatEventHandler;)V

    .line 8
    .line 9
    .line 10
    return-void
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
.end method

.method private static final setMessage$lambda$0(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/events/ChatEventHandler;Landroid/view/View;)Z
    .locals 2

    .line 1
    const-string p2, "$message"

    .line 2
    .line 3
    invoke-static {p0, p2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p2, "$eventHandler"

    .line 7
    .line 8
    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, Lcom/discord/chat/bridge/MessageKt;->isEphemeral(Lcom/discord/chat/bridge/Message;)Z

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-interface {p1}, Lcom/discord/chat/presentation/events/ChatEventHandler;->getOnMessageLongPressed()Lkotlin/jvm/functions/Function4;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/discord/chat/bridge/Message;->getId-3Eiw7ao()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-static {p2}, Lcom/discord/primitives/MessageId;->box-impl(Ljava/lang/String;)Lcom/discord/primitives/MessageId;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    invoke-virtual {p0}, Lcom/discord/chat/bridge/Message;->getChannelId-o4g7jtM()J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    invoke-static {v0, v1}, Lcom/discord/primitives/ChannelId;->box-impl(J)Lcom/discord/primitives/ChannelId;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    const/4 v0, 0x0

    .line 42
    invoke-interface {p1, p2, p0, v0, v0}, Lkotlin/jvm/functions/Function4;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    :cond_1
    const/4 p0, 0x1

    .line 46
    :goto_0
    return p0
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
.end method


# virtual methods
.method public getSpineOriginView()Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lcom/discord/chat/presentation/message/system/SystemMessageView;->binding:Lcom/discord/chat/databinding/SystemMessageViewBinding;

    iget-object v0, v0, Lcom/discord/chat/databinding/SystemMessageViewBinding;->icon:Lcom/facebook/drawee/view/SimpleDraweeView;

    const-string v1, "binding.icon"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final setAccessoriesRecycledViewPool(Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;)V
    .locals 1

    .line 1
    const-string v0, "recycledViewPool"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/discord/chat/presentation/message/system/SystemMessageView;->binding:Lcom/discord/chat/databinding/SystemMessageViewBinding;

    .line 7
    .line 8
    iget-object v0, v0, Lcom/discord/chat/databinding/SystemMessageViewBinding;->accessoriesView:Lcom/discord/chat/presentation/message/MessageAccessoriesView;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setRecycledViewPool(Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;)V

    .line 11
    .line 12
    .line 13
    return-void
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

.method public final setMessage(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/root/MessageContext;Lcom/discord/chat/presentation/events/ChatEventHandler;)V
    .locals 12

    .line 1
    const-string v0, "message"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "context"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "eventHandler"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Lcom/discord/chat/presentation/message/system/b;

    .line 17
    .line 18
    invoke-direct {v0, p1, p3}, Lcom/discord/chat/presentation/message/system/b;-><init>(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/events/ChatEventHandler;)V

    .line 19
    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-static {p0, v1, v0}, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchUtilsKt;->setOnLongClickListenerNested(Landroid/view/View;ZLandroid/view/View$OnLongClickListener;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/discord/chat/bridge/Message;->getType()Lcom/discord/chat/bridge/MessageType;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-direct {p0, v2}, Lcom/discord/chat/presentation/message/system/SystemMessageView;->getIconAndColor(Lcom/discord/chat/bridge/MessageType;)Lkotlin/Pair;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v2}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    check-cast v3, Lcom/discord/react_asset_fetcher/ReactAsset;

    .line 38
    .line 39
    invoke-virtual {v2}, Lkotlin/Pair;->b()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    check-cast v2, Ljava/lang/Number;

    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    iget-object v4, p0, Lcom/discord/chat/presentation/message/system/SystemMessageView;->binding:Lcom/discord/chat/databinding/SystemMessageViewBinding;

    .line 50
    .line 51
    iget-object v4, v4, Lcom/discord/chat/databinding/SystemMessageViewBinding;->icon:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 52
    .line 53
    const-string v5, "binding.icon"

    .line 54
    .line 55
    invoke-static {v4, v5}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-static {v4, v3}, Lcom/discord/react_asset_fetcher/ReactAssetUtilsKt;->setReactAsset(Lcom/facebook/drawee/view/SimpleDraweeView;Lcom/discord/react_asset_fetcher/ReactAsset;)V

    .line 59
    .line 60
    .line 61
    iget-object v3, p0, Lcom/discord/chat/presentation/message/system/SystemMessageView;->binding:Lcom/discord/chat/databinding/SystemMessageViewBinding;

    .line 62
    .line 63
    iget-object v3, v3, Lcom/discord/chat/databinding/SystemMessageViewBinding;->icon:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 64
    .line 65
    invoke-static {v3, v5}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-static {v3, v2}, Lcom/discord/theme/utils/ColorUtilsKt;->setTintColor(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/Integer;)V

    .line 73
    .line 74
    .line 75
    invoke-direct {p0, p1, p2}, Lcom/discord/chat/presentation/message/system/SystemMessageView;->generateMessageAccessories(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/root/MessageContext;)Ljava/util/List;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    iget-object v2, p0, Lcom/discord/chat/presentation/message/system/SystemMessageView;->binding:Lcom/discord/chat/databinding/SystemMessageViewBinding;

    .line 80
    .line 81
    iget-object v4, v2, Lcom/discord/chat/databinding/SystemMessageViewBinding;->accessoriesView:Lcom/discord/chat/presentation/message/MessageAccessoriesView;

    .line 82
    .line 83
    invoke-virtual {p1}, Lcom/discord/chat/bridge/Message;->getId-3Eiw7ao()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    invoke-virtual {p1}, Lcom/discord/chat/bridge/Message;->getChannelId-o4g7jtM()J

    .line 88
    .line 89
    .line 90
    move-result-wide v6

    .line 91
    invoke-virtual {p1}, Lcom/discord/chat/bridge/Message;->getGuildId-qOKuAAo()Lcom/discord/primitives/GuildId;

    .line 92
    .line 93
    .line 94
    move-result-object v8

    .line 95
    const/4 v11, 0x0

    .line 96
    move-object v9, p2

    .line 97
    move-object v10, p3

    .line 98
    invoke-virtual/range {v4 .. v11}, Lcom/discord/chat/presentation/message/MessageAccessoriesView;->setAccessories-RC8ZMxU(Ljava/lang/String;JLcom/discord/primitives/GuildId;Ljava/util/List;Lcom/discord/chat/presentation/events/ChatEventHandler;Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;)V

    .line 99
    .line 100
    .line 101
    iget-object p3, p0, Lcom/discord/chat/presentation/message/system/SystemMessageView;->binding:Lcom/discord/chat/databinding/SystemMessageViewBinding;

    .line 102
    .line 103
    iget-object p3, p3, Lcom/discord/chat/databinding/SystemMessageViewBinding;->accessoriesView:Lcom/discord/chat/presentation/message/MessageAccessoriesView;

    .line 104
    .line 105
    const-string v2, "binding.accessoriesView"

    .line 106
    .line 107
    invoke-static {p3, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 111
    .line 112
    .line 113
    move-result p2

    .line 114
    xor-int/2addr p2, v1

    .line 115
    if-eqz p2, :cond_0

    .line 116
    .line 117
    const/4 p2, 0x0

    .line 118
    goto :goto_0

    .line 119
    :cond_0
    const/16 p2, 0x8

    .line 120
    .line 121
    :goto_0
    invoke-virtual {p3, p2}, Landroid/view/View;->setVisibility(I)V

    .line 122
    .line 123
    .line 124
    iget-object p2, p0, Lcom/discord/chat/presentation/message/system/SystemMessageView;->binding:Lcom/discord/chat/databinding/SystemMessageViewBinding;

    .line 125
    .line 126
    iget-object p2, p2, Lcom/discord/chat/databinding/SystemMessageViewBinding;->accessoriesView:Lcom/discord/chat/presentation/message/MessageAccessoriesView;

    .line 127
    .line 128
    new-instance p3, Lcom/discord/chat/presentation/message/system/SystemMessageView$setMessage$1;

    .line 129
    .line 130
    invoke-direct {p3, p0, p1, v0}, Lcom/discord/chat/presentation/message/system/SystemMessageView$setMessage$1;-><init>(Lcom/discord/chat/presentation/message/system/SystemMessageView;Lcom/discord/chat/bridge/Message;Landroid/view/View$OnLongClickListener;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p2, p3}, Lcom/discord/chat/presentation/message/MessageAccessoriesView;->setOnCurrentContentViewChanged(Lkotlin/jvm/functions/Function1;)V

    .line 134
    .line 135
    .line 136
    return-void
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
.end method
