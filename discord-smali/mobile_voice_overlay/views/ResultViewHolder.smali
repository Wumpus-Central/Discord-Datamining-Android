.class final Lcom/discord/mobile_voice_overlay/views/ResultViewHolder;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0002\u0018\u00002\u00020\u0001B.\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u000cR\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u000cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/discord/mobile_voice_overlay/views/ResultViewHolder;",
        "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;",
        "parent",
        "Landroid/view/ViewGroup;",
        "onChannelSelected",
        "Lkotlin/Function1;",
        "Lcom/discord/primitives/ChannelId;",
        "",
        "binding",
        "Lcom/discord/mobile_voice_overlay/databinding/OverlayVoiceChannelSearchResultBinding;",
        "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;Lcom/discord/mobile_voice_overlay/databinding/OverlayVoiceChannelSearchResultBinding;)V",
        "result",
        "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlaySelectorResult;",
        "getResult",
        "()Lcom/discord/mobile_voice_overlay/MobileVoiceOverlaySelectorResult;",
        "setResult",
        "(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlaySelectorResult;)V",
        "bind",
        "mobile_voice_overlay_release"
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
.field private final binding:Lcom/discord/mobile_voice_overlay/databinding/OverlayVoiceChannelSearchResultBinding;

.field private final onChannelSelected:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/discord/primitives/ChannelId;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private result:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlaySelectorResult;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;Lcom/discord/mobile_voice_overlay/databinding/OverlayVoiceChannelSearchResultBinding;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/discord/primitives/ChannelId;",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/discord/mobile_voice_overlay/databinding/OverlayVoiceChannelSearchResultBinding;",
            ")V"
        }
    .end annotation

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "onChannelSelected"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "binding"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p3}, Lcom/discord/mobile_voice_overlay/databinding/OverlayVoiceChannelSearchResultBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 4
    iput-object p2, p0, Lcom/discord/mobile_voice_overlay/views/ResultViewHolder;->onChannelSelected:Lkotlin/jvm/functions/Function1;

    .line 5
    iput-object p3, p0, Lcom/discord/mobile_voice_overlay/views/ResultViewHolder;->binding:Lcom/discord/mobile_voice_overlay/databinding/OverlayVoiceChannelSearchResultBinding;

    .line 6
    iget-object p1, p3, Lcom/discord/mobile_voice_overlay/databinding/OverlayVoiceChannelSearchResultBinding;->container:Landroidx/constraintlayout/widget/ConstraintLayout;

    new-instance p2, Lcom/discord/mobile_voice_overlay/views/i;

    invoke-direct {p2, p0}, Lcom/discord/mobile_voice_overlay/views/i;-><init>(Lcom/discord/mobile_voice_overlay/views/ResultViewHolder;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 7
    iget-object p1, p3, Lcom/discord/mobile_voice_overlay/databinding/OverlayVoiceChannelSearchResultBinding;->channelName:Landroid/widget/TextView;

    const-string p2, "_init_$lambda$2"

    .line 8
    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Lcom/discord/fonts/DiscordFont;->PrimarySemibold:Lcom/discord/fonts/DiscordFont;

    invoke-static {p1, p2}, Lcom/discord/fonts/DiscordFontUtilsKt;->setDiscordFont(Landroid/widget/TextView;Lcom/discord/fonts/DiscordFont;)V

    .line 9
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object p2

    invoke-virtual {p2}, Lcom/discord/theme/DiscordTheme;->getHeaderPrimary()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 10
    iget-object p1, p3, Lcom/discord/mobile_voice_overlay/databinding/OverlayVoiceChannelSearchResultBinding;->categoryName:Landroid/widget/TextView;

    const-string p2, "_init_$lambda$3"

    .line 11
    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Lcom/discord/fonts/DiscordFont;->PrimaryMedium:Lcom/discord/fonts/DiscordFont;

    invoke-static {p1, p2}, Lcom/discord/fonts/DiscordFontUtilsKt;->setDiscordFont(Landroid/widget/TextView;Lcom/discord/fonts/DiscordFont;)V

    .line 12
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v0

    invoke-virtual {v0}, Lcom/discord/theme/DiscordTheme;->getHeaderSecondary()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 13
    iget-object p1, p3, Lcom/discord/mobile_voice_overlay/databinding/OverlayVoiceChannelSearchResultBinding;->guildName:Landroid/widget/TextView;

    const-string p3, "_init_$lambda$4"

    .line 14
    invoke-static {p1, p3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Lcom/discord/fonts/DiscordFontUtilsKt;->setDiscordFont(Landroid/widget/TextView;Lcom/discord/fonts/DiscordFont;)V

    .line 15
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object p2

    invoke-virtual {p2}, Lcom/discord/theme/DiscordTheme;->getHeaderSecondary()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;Lcom/discord/mobile_voice_overlay/databinding/OverlayVoiceChannelSearchResultBinding;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p3

    const/4 p4, 0x0

    invoke-static {p3, p1, p4}, Lcom/discord/mobile_voice_overlay/databinding/OverlayVoiceChannelSearchResultBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/discord/mobile_voice_overlay/databinding/OverlayVoiceChannelSearchResultBinding;

    move-result-object p3

    const-string p4, "inflate(LayoutInflater.f\u2026.context), parent, false)"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/discord/mobile_voice_overlay/views/ResultViewHolder;-><init>(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;Lcom/discord/mobile_voice_overlay/databinding/OverlayVoiceChannelSearchResultBinding;)V

    return-void
.end method

.method private static final _init_$lambda$1(Lcom/discord/mobile_voice_overlay/views/ResultViewHolder;Landroid/view/View;)V
    .locals 2

    .line 1
    const-string p1, "this$0"

    .line 2
    .line 3
    invoke-static {p0, p1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/discord/mobile_voice_overlay/views/ResultViewHolder;->result:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlaySelectorResult;

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iget-object p0, p0, Lcom/discord/mobile_voice_overlay/views/ResultViewHolder;->onChannelSelected:Lkotlin/jvm/functions/Function1;

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlaySelectorResult;->getChannelId-o4g7jtM()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    invoke-static {v0, v1}, Lcom/discord/primitives/ChannelId;->box-impl(J)Lcom/discord/primitives/ChannelId;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
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
.end method

.method public static synthetic a(Lcom/discord/mobile_voice_overlay/views/ResultViewHolder;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/discord/mobile_voice_overlay/views/ResultViewHolder;->_init_$lambda$1(Lcom/discord/mobile_voice_overlay/views/ResultViewHolder;Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final bind(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlaySelectorResult;)V
    .locals 2

    .line 1
    const-string v0, "result"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/discord/mobile_voice_overlay/views/ResultViewHolder;->result:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlaySelectorResult;

    .line 7
    .line 8
    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/views/ResultViewHolder;->binding:Lcom/discord/mobile_voice_overlay/databinding/OverlayVoiceChannelSearchResultBinding;

    .line 9
    .line 10
    iget-object v0, v0, Lcom/discord/mobile_voice_overlay/databinding/OverlayVoiceChannelSearchResultBinding;->channelName:Landroid/widget/TextView;

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlaySelectorResult;->getChannelName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/views/ResultViewHolder;->binding:Lcom/discord/mobile_voice_overlay/databinding/OverlayVoiceChannelSearchResultBinding;

    .line 20
    .line 21
    iget-object v0, v0, Lcom/discord/mobile_voice_overlay/databinding/OverlayVoiceChannelSearchResultBinding;->categoryName:Landroid/widget/TextView;

    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlaySelectorResult;->getCategoryName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/views/ResultViewHolder;->binding:Lcom/discord/mobile_voice_overlay/databinding/OverlayVoiceChannelSearchResultBinding;

    .line 31
    .line 32
    iget-object v0, v0, Lcom/discord/mobile_voice_overlay/databinding/OverlayVoiceChannelSearchResultBinding;->guildName:Landroid/widget/TextView;

    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlaySelectorResult;->getGuildName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 39
    .line 40
    .line 41
    return-void
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
.end method

.method public final getResult()Lcom/discord/mobile_voice_overlay/MobileVoiceOverlaySelectorResult;
    .locals 1

    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/views/ResultViewHolder;->result:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlaySelectorResult;

    return-object v0
.end method

.method public final setResult(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlaySelectorResult;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/mobile_voice_overlay/views/ResultViewHolder;->result:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlaySelectorResult;

    return-void
.end method
