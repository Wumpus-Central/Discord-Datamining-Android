.class public final Lcom/discord/chat/presentation/message/system/CallSystemMessageView;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/discord/chat/presentation/message/system/CallSystemMessageView;",
        "Landroidx/constraintlayout/widget/ConstraintLayout;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "binding",
        "Lcom/discord/chat/databinding/CallSystemMessageViewBinding;",
        "grayIconColor",
        "",
        "greenIconColor",
        "redIconColor",
        "setMessage",
        "",
        "message",
        "Lcom/discord/chat/bridge/Message;",
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
.field private final binding:Lcom/discord/chat/databinding/CallSystemMessageViewBinding;

.field private final grayIconColor:I

.field private final greenIconColor:I

.field private final redIconColor:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p0, p1, v0, v1, v0}, Lcom/discord/chat/presentation/message/system/CallSystemMessageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 3
    sget p2, Lcom/discord/chat/R$color;->green_360:I

    invoke-static {p0, p2}, Lcom/discord/theme/utils/ColorUtilsKt;->getColorCompat(Landroid/view/View;I)I

    move-result p2

    iput p2, p0, Lcom/discord/chat/presentation/message/system/CallSystemMessageView;->greenIconColor:I

    .line 4
    sget p2, Lcom/discord/chat/R$color;->red_400:I

    invoke-static {p0, p2}, Lcom/discord/theme/utils/ColorUtilsKt;->getColorCompat(Landroid/view/View;I)I

    move-result p2

    iput p2, p0, Lcom/discord/chat/presentation/message/system/CallSystemMessageView;->redIconColor:I

    .line 5
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object p2

    invoke-virtual {p2}, Lcom/discord/theme/DiscordTheme;->getInteractiveNormal()I

    move-result p2

    iput p2, p0, Lcom/discord/chat/presentation/message/system/CallSystemMessageView;->grayIconColor:I

    .line 6
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1, p0}, Lcom/discord/chat/databinding/CallSystemMessageViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/discord/chat/databinding/CallSystemMessageViewBinding;

    move-result-object p1

    const-string p2, "inflate(LayoutInflater.from(context), this)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/discord/chat/presentation/message/system/CallSystemMessageView;->binding:Lcom/discord/chat/databinding/CallSystemMessageViewBinding;

    .line 7
    invoke-static {p0}, Lcom/discord/chat/presentation/message/AddSystemMessageCardStyleKt;->addSystemMessageCardStyle(Landroid/view/View;)V

    .line 8
    iget-object p2, p1, Lcom/discord/chat/databinding/CallSystemMessageViewBinding;->message:Landroid/widget/TextView;

    const-string v0, "_init_$lambda$0"

    .line 9
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v0, 0x41800000    # 16.0f

    invoke-static {p2, v0}, Lcom/discord/SetTextSizeSpKt;->setTextSizeSp(Landroid/widget/TextView;F)V

    .line 10
    sget-object v0, Lcom/discord/fonts/DiscordFont;->PrimarySemibold:Lcom/discord/fonts/DiscordFont;

    invoke-static {p2, v0}, Lcom/discord/fonts/DiscordFontUtilsKt;->setDiscordFont(Landroid/widget/TextView;Lcom/discord/fonts/DiscordFont;)V

    .line 11
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v0

    invoke-virtual {v0}, Lcom/discord/theme/DiscordTheme;->getHeaderPrimary()I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 12
    iget-object p1, p1, Lcom/discord/chat/databinding/CallSystemMessageViewBinding;->info:Landroid/widget/TextView;

    const-string p2, "_init_$lambda$1"

    .line 13
    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 p2, 0x41400000    # 12.0f

    invoke-static {p1, p2}, Lcom/discord/SetTextSizeSpKt;->setTextSizeSp(Landroid/widget/TextView;F)V

    .line 14
    sget-object p2, Lcom/discord/fonts/DiscordFont;->PrimaryNormal:Lcom/discord/fonts/DiscordFont;

    invoke-static {p1, p2}, Lcom/discord/fonts/DiscordFontUtilsKt;->setDiscordFont(Landroid/widget/TextView;Lcom/discord/fonts/DiscordFont;)V

    .line 15
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object p2

    invoke-virtual {p2}, Lcom/discord/theme/DiscordTheme;->getTextMuted()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 1
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/discord/chat/presentation/message/system/CallSystemMessageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public static final synthetic access$getBinding$p(Lcom/discord/chat/presentation/message/system/CallSystemMessageView;)Lcom/discord/chat/databinding/CallSystemMessageViewBinding;
    .locals 0

    iget-object p0, p0, Lcom/discord/chat/presentation/message/system/CallSystemMessageView;->binding:Lcom/discord/chat/databinding/CallSystemMessageViewBinding;

    return-object p0
.end method


# virtual methods
.method public final setMessage(Lcom/discord/chat/bridge/Message;)V
    .locals 11

    .line 1
    const-string v0, "message"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/discord/chat/presentation/message/system/CallSystemMessageView;->binding:Lcom/discord/chat/databinding/CallSystemMessageViewBinding;

    .line 7
    .line 8
    iget-object v0, v0, Lcom/discord/chat/databinding/CallSystemMessageViewBinding;->icon:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 9
    .line 10
    const-string v1, "binding.icon"

    .line 11
    .line 12
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/discord/chat/bridge/Message;->getMissed()Ljava/lang/Boolean;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-static {v2, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    sget-object v2, Lcom/discord/react_asset_fetcher/ReactAsset;->CallDisconnect:Lcom/discord/react_asset_fetcher/ReactAsset;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    sget-object v2, Lcom/discord/react_asset_fetcher/ReactAsset;->CallConnect:Lcom/discord/react_asset_fetcher/ReactAsset;

    .line 31
    .line 32
    :goto_0
    invoke-static {v0, v2}, Lcom/discord/react_asset_fetcher/ReactAssetUtilsKt;->setReactAsset(Lcom/facebook/drawee/view/SimpleDraweeView;Lcom/discord/react_asset_fetcher/ReactAsset;)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lcom/discord/chat/presentation/message/system/CallSystemMessageView;->binding:Lcom/discord/chat/databinding/CallSystemMessageViewBinding;

    .line 36
    .line 37
    iget-object v0, v0, Lcom/discord/chat/databinding/CallSystemMessageViewBinding;->icon:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 38
    .line 39
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Lcom/discord/chat/bridge/Message;->isCallActive()Ljava/lang/Boolean;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_1

    .line 51
    .line 52
    iget v1, p0, Lcom/discord/chat/presentation/message/system/CallSystemMessageView;->greenIconColor:I

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    invoke-virtual {p1}, Lcom/discord/chat/bridge/Message;->getMissed()Ljava/lang/Boolean;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_2

    .line 64
    .line 65
    iget v1, p0, Lcom/discord/chat/presentation/message/system/CallSystemMessageView;->redIconColor:I

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_2
    iget v1, p0, Lcom/discord/chat/presentation/message/system/CallSystemMessageView;->grayIconColor:I

    .line 69
    .line 70
    :goto_1
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-static {v0, v1}, Lcom/discord/theme/utils/ColorUtilsKt;->setTintColor(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/Integer;)V

    .line 75
    .line 76
    .line 77
    iget-object v0, p0, Lcom/discord/chat/presentation/message/system/CallSystemMessageView;->binding:Lcom/discord/chat/databinding/CallSystemMessageViewBinding;

    .line 78
    .line 79
    iget-object v0, v0, Lcom/discord/chat/databinding/CallSystemMessageViewBinding;->message:Landroid/widget/TextView;

    .line 80
    .line 81
    invoke-virtual {p1}, Lcom/discord/chat/bridge/Message;->getTitle()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 86
    .line 87
    .line 88
    invoke-static {p0}, Lcom/discord/misc/utilities/coroutines/CoroutineViewUtilsKt;->getAttachedScope(Landroid/view/View;)Lcom/discord/misc/utilities/coroutines/AttachedViewCoroutineScope;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    const-class v1, Lcom/discord/chat/presentation/message/system/CallSystemMessageView;

    .line 93
    .line 94
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    new-instance v2, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 101
    .line 102
    .line 103
    const-string v4, "Binding "

    .line 104
    .line 105
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    const/4 v2, 0x2

    .line 116
    const/4 v4, 0x0

    .line 117
    invoke-static {v0, v1, v4, v2, v4}, Lcom/discord/misc/utilities/coroutines/AttachedViewCoroutineScope;->cancelAllWork$default(Lcom/discord/misc/utilities/coroutines/AttachedViewCoroutineScope;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1}, Lcom/discord/chat/bridge/Message;->isCallActive()Ljava/lang/Boolean;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-static {v0, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    if-eqz v0, :cond_3

    .line 129
    .line 130
    invoke-virtual {p1}, Lcom/discord/chat/bridge/Message;->getRawMilliseconds()Ljava/lang/Long;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-static {v0}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 138
    .line 139
    .line 140
    move-result-wide v3

    .line 141
    invoke-static {p0}, Lcom/discord/misc/utilities/coroutines/CoroutineViewUtilsKt;->getAttachedScope(Landroid/view/View;)Lcom/discord/misc/utilities/coroutines/AttachedViewCoroutineScope;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    const/4 v7, 0x0

    .line 146
    const/4 v8, 0x0

    .line 147
    new-instance v9, Lcom/discord/chat/presentation/message/system/CallSystemMessageView$setMessage$1;

    .line 148
    .line 149
    const/4 v6, 0x0

    .line 150
    move-object v1, v9

    .line 151
    move-object v2, p0

    .line 152
    move-object v5, p1

    .line 153
    invoke-direct/range {v1 .. v6}, Lcom/discord/chat/presentation/message/system/CallSystemMessageView$setMessage$1;-><init>(Lcom/discord/chat/presentation/message/system/CallSystemMessageView;JLcom/discord/chat/bridge/Message;Lkotlin/coroutines/Continuation;)V

    .line 154
    .line 155
    .line 156
    const/4 v1, 0x3

    .line 157
    const/4 v10, 0x0

    .line 158
    move-object v5, v0

    .line 159
    move-object v6, v7

    .line 160
    move-object v7, v8

    .line 161
    move-object v8, v9

    .line 162
    move v9, v1

    .line 163
    invoke-static/range {v5 .. v10}, Lkotlinx/coroutines/j;->d(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/l0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 164
    .line 165
    .line 166
    goto :goto_2

    .line 167
    :cond_3
    iget-object v0, p0, Lcom/discord/chat/presentation/message/system/CallSystemMessageView;->binding:Lcom/discord/chat/databinding/CallSystemMessageViewBinding;

    .line 168
    .line 169
    iget-object v0, v0, Lcom/discord/chat/databinding/CallSystemMessageViewBinding;->info:Landroid/widget/TextView;

    .line 170
    .line 171
    invoke-virtual {p1}, Lcom/discord/chat/bridge/Message;->getDescription()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 176
    .line 177
    .line 178
    :goto_2
    iget-object v0, p0, Lcom/discord/chat/presentation/message/system/CallSystemMessageView;->binding:Lcom/discord/chat/databinding/CallSystemMessageViewBinding;

    .line 179
    .line 180
    iget-object v0, v0, Lcom/discord/chat/databinding/CallSystemMessageViewBinding;->participants:Lcom/discord/overlapping_circles/OverlappingCirclesView;

    .line 181
    .line 182
    invoke-virtual {p1}, Lcom/discord/chat/bridge/Message;->getAvatarURLs()Ljava/util/List;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    if-nez p1, :cond_4

    .line 187
    .line 188
    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    :cond_4
    new-instance v1, Ljava/util/ArrayList;

    .line 193
    .line 194
    const/16 v2, 0xa

    .line 195
    .line 196
    invoke-static {p1, v2}, Lkotlin/collections/h;->t(Ljava/lang/Iterable;I)I

    .line 197
    .line 198
    .line 199
    move-result v2

    .line 200
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 201
    .line 202
    .line 203
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 208
    .line 209
    .line 210
    move-result v2

    .line 211
    if-eqz v2, :cond_5

    .line 212
    .line 213
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    check-cast v2, Ljava/lang/String;

    .line 218
    .line 219
    new-instance v3, Lcom/discord/overlapping_circles/OverlappingItem;

    .line 220
    .line 221
    invoke-direct {v3, v2}, Lcom/discord/overlapping_circles/OverlappingItem;-><init>(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    goto :goto_3

    .line 228
    :cond_5
    invoke-virtual {v0, v1}, Lcom/discord/overlapping_circles/OverlappingCirclesView;->setItems(Ljava/util/List;)V

    .line 229
    .line 230
    .line 231
    return-void
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
