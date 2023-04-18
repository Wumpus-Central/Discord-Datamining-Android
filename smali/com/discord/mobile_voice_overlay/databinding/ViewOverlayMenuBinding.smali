.class public final Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final disconnectBtn:Lcom/facebook/drawee/view/SimpleDraweeView;

.field public final menuBottom:Landroidx/cardview/widget/CardView;

.field public final menuTop:Landroidx/cardview/widget/CardView;

.field public final menuTopStatusContainer:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final muteToggle:Lcom/facebook/drawee/view/SimpleDraweeView;

.field public final overlayChannelName:Landroid/widget/TextView;

.field public final overlayGuildName:Landroid/widget/TextView;

.field public final overlayInviteLink:Landroid/widget/TextView;

.field public final overlayNetworkIcon:Lcom/facebook/drawee/view/SimpleDraweeView;

.field public final overlayOpenApp:Landroid/widget/TextView;

.field public final overlaySwitchChannels:Landroid/widget/TextView;

.field private final rootView:Landroid/view/View;

.field public final srcToggle:Lcom/facebook/drawee/view/SimpleDraweeView;


# direct methods
.method private constructor <init>(Landroid/view/View;Lcom/facebook/drawee/view/SimpleDraweeView;Landroidx/cardview/widget/CardView;Landroidx/cardview/widget/CardView;Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/facebook/drawee/view/SimpleDraweeView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/facebook/drawee/view/SimpleDraweeView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/facebook/drawee/view/SimpleDraweeView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->rootView:Landroid/view/View;

    .line 3
    iput-object p2, p0, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->disconnectBtn:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 4
    iput-object p3, p0, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->menuBottom:Landroidx/cardview/widget/CardView;

    .line 5
    iput-object p4, p0, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->menuTop:Landroidx/cardview/widget/CardView;

    .line 6
    iput-object p5, p0, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->menuTopStatusContainer:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 7
    iput-object p6, p0, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->muteToggle:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 8
    iput-object p7, p0, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->overlayChannelName:Landroid/widget/TextView;

    .line 9
    iput-object p8, p0, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->overlayGuildName:Landroid/widget/TextView;

    .line 10
    iput-object p9, p0, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->overlayInviteLink:Landroid/widget/TextView;

    .line 11
    iput-object p10, p0, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->overlayNetworkIcon:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 12
    iput-object p11, p0, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->overlayOpenApp:Landroid/widget/TextView;

    .line 13
    iput-object p12, p0, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->overlaySwitchChannels:Landroid/widget/TextView;

    .line 14
    iput-object p13, p0, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->srcToggle:Lcom/facebook/drawee/view/SimpleDraweeView;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;
    .locals 15

    .line 1
    sget v0, Lcom/discord/mobile_voice_overlay/R$id;->disconnect_btn:I

    .line 2
    .line 3
    invoke-static {p0, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    check-cast v2, Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    sget v0, Lcom/discord/mobile_voice_overlay/R$id;->menu_bottom:I

    .line 12
    .line 13
    invoke-static {p0, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, Landroidx/cardview/widget/CardView;

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    sget v0, Lcom/discord/mobile_voice_overlay/R$id;->menu_top:I

    .line 22
    .line 23
    invoke-static {p0, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    check-cast v4, Landroidx/cardview/widget/CardView;

    .line 28
    .line 29
    if-eqz v4, :cond_0

    .line 30
    .line 31
    sget v0, Lcom/discord/mobile_voice_overlay/R$id;->menu_top_status_container:I

    .line 32
    .line 33
    invoke-static {p0, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    check-cast v5, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 38
    .line 39
    if-eqz v5, :cond_0

    .line 40
    .line 41
    sget v0, Lcom/discord/mobile_voice_overlay/R$id;->mute_toggle:I

    .line 42
    .line 43
    invoke-static {p0, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    check-cast v6, Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 48
    .line 49
    if-eqz v6, :cond_0

    .line 50
    .line 51
    sget v0, Lcom/discord/mobile_voice_overlay/R$id;->overlay_channel_name:I

    .line 52
    .line 53
    invoke-static {p0, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    check-cast v7, Landroid/widget/TextView;

    .line 58
    .line 59
    if-eqz v7, :cond_0

    .line 60
    .line 61
    sget v0, Lcom/discord/mobile_voice_overlay/R$id;->overlay_guild_name:I

    .line 62
    .line 63
    invoke-static {p0, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 64
    .line 65
    .line 66
    move-result-object v8

    .line 67
    check-cast v8, Landroid/widget/TextView;

    .line 68
    .line 69
    if-eqz v8, :cond_0

    .line 70
    .line 71
    sget v0, Lcom/discord/mobile_voice_overlay/R$id;->overlay_invite_link:I

    .line 72
    .line 73
    invoke-static {p0, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 74
    .line 75
    .line 76
    move-result-object v9

    .line 77
    check-cast v9, Landroid/widget/TextView;

    .line 78
    .line 79
    if-eqz v9, :cond_0

    .line 80
    .line 81
    sget v0, Lcom/discord/mobile_voice_overlay/R$id;->overlay_network_icon:I

    .line 82
    .line 83
    invoke-static {p0, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 84
    .line 85
    .line 86
    move-result-object v10

    .line 87
    check-cast v10, Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 88
    .line 89
    if-eqz v10, :cond_0

    .line 90
    .line 91
    sget v0, Lcom/discord/mobile_voice_overlay/R$id;->overlay_open_app:I

    .line 92
    .line 93
    invoke-static {p0, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 94
    .line 95
    .line 96
    move-result-object v11

    .line 97
    check-cast v11, Landroid/widget/TextView;

    .line 98
    .line 99
    if-eqz v11, :cond_0

    .line 100
    .line 101
    sget v0, Lcom/discord/mobile_voice_overlay/R$id;->overlay_switch_channels:I

    .line 102
    .line 103
    invoke-static {p0, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 104
    .line 105
    .line 106
    move-result-object v12

    .line 107
    check-cast v12, Landroid/widget/TextView;

    .line 108
    .line 109
    if-eqz v12, :cond_0

    .line 110
    .line 111
    sget v0, Lcom/discord/mobile_voice_overlay/R$id;->src_toggle:I

    .line 112
    .line 113
    invoke-static {p0, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 114
    .line 115
    .line 116
    move-result-object v13

    .line 117
    check-cast v13, Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 118
    .line 119
    if-eqz v13, :cond_0

    .line 120
    .line 121
    new-instance v14, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;

    .line 122
    .line 123
    move-object v0, v14

    .line 124
    move-object v1, p0

    .line 125
    invoke-direct/range {v0 .. v13}, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;-><init>(Landroid/view/View;Lcom/facebook/drawee/view/SimpleDraweeView;Landroidx/cardview/widget/CardView;Landroidx/cardview/widget/CardView;Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/facebook/drawee/view/SimpleDraweeView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/facebook/drawee/view/SimpleDraweeView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/facebook/drawee/view/SimpleDraweeView;)V

    .line 126
    .line 127
    .line 128
    return-object v14

    .line 129
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    new-instance v1, Ljava/lang/NullPointerException;

    .line 138
    .line 139
    const-string v2, "Missing required view with ID: "

    .line 140
    .line 141
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-direct {v1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    throw v1
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
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    sget v0, Lcom/discord/mobile_voice_overlay/R$layout;->view_overlay_menu:I

    .line 4
    .line 5
    invoke-virtual {p0, v0, p1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->bind(Landroid/view/View;)Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    .line 14
    .line 15
    const-string p1, "parent"

    .line 16
    .line 17
    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p0
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
.end method


# virtual methods
.method public getRoot()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;->rootView:Landroid/view/View;

    return-object v0
.end method
