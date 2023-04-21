.class public final Lcom/discord/chat/databinding/GuildInviteViewBinding;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final barrierButton:Landroidx/constraintlayout/widget/Barrier;

.field public final barrierHeader:Landroidx/constraintlayout/widget/Barrier;

.field public final itemBottomContainer:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final itemInviteHeader:Landroid/widget/TextView;

.field public final itemInviteHubLayout:Landroid/widget/FrameLayout;

.field public final itemInviteHubLink:Landroid/widget/TextView;

.field public final itemInviteImage:Lcom/discord/chat/presentation/message/view/GuildView;

.field public final itemInviteJoinedButton:Lcom/discord/core/DCDButton;

.field public final itemInviteMemberContainer:Landroid/widget/LinearLayout;

.field public final itemInviteOnlineDot:Landroid/widget/ImageView;

.field public final itemInviteOnlineText:Landroid/widget/TextView;

.field public final itemInviteSplash:Lcom/facebook/drawee/view/SimpleDraweeView;

.field public final itemInviteSubtitle:Landroid/widget/TextView;

.field public final itemInviteSubtitleIcon:Lcom/facebook/drawee/view/SimpleDraweeView;

.field public final itemInviteTitle:Landroid/widget/TextView;

.field public final itemInviteTotalMemberDot:Landroid/widget/ImageView;

.field public final itemInviteTotalMemberText:Landroid/widget/TextView;

.field private final rootView:Landroid/view/View;


# direct methods
.method private constructor <init>(Landroid/view/View;Landroidx/constraintlayout/widget/Barrier;Landroidx/constraintlayout/widget/Barrier;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;Landroid/widget/FrameLayout;Landroid/widget/TextView;Lcom/discord/chat/presentation/message/view/GuildView;Lcom/discord/core/DCDButton;Landroid/widget/LinearLayout;Landroid/widget/ImageView;Landroid/widget/TextView;Lcom/facebook/drawee/view/SimpleDraweeView;Landroid/widget/TextView;Lcom/facebook/drawee/view/SimpleDraweeView;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/TextView;)V
    .locals 2

    move-object v0, p0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    .line 2
    iput-object v1, v0, Lcom/discord/chat/databinding/GuildInviteViewBinding;->rootView:Landroid/view/View;

    move-object v1, p2

    .line 3
    iput-object v1, v0, Lcom/discord/chat/databinding/GuildInviteViewBinding;->barrierButton:Landroidx/constraintlayout/widget/Barrier;

    move-object v1, p3

    .line 4
    iput-object v1, v0, Lcom/discord/chat/databinding/GuildInviteViewBinding;->barrierHeader:Landroidx/constraintlayout/widget/Barrier;

    move-object v1, p4

    .line 5
    iput-object v1, v0, Lcom/discord/chat/databinding/GuildInviteViewBinding;->itemBottomContainer:Landroidx/constraintlayout/widget/ConstraintLayout;

    move-object v1, p5

    .line 6
    iput-object v1, v0, Lcom/discord/chat/databinding/GuildInviteViewBinding;->itemInviteHeader:Landroid/widget/TextView;

    move-object v1, p6

    .line 7
    iput-object v1, v0, Lcom/discord/chat/databinding/GuildInviteViewBinding;->itemInviteHubLayout:Landroid/widget/FrameLayout;

    move-object v1, p7

    .line 8
    iput-object v1, v0, Lcom/discord/chat/databinding/GuildInviteViewBinding;->itemInviteHubLink:Landroid/widget/TextView;

    move-object v1, p8

    .line 9
    iput-object v1, v0, Lcom/discord/chat/databinding/GuildInviteViewBinding;->itemInviteImage:Lcom/discord/chat/presentation/message/view/GuildView;

    move-object v1, p9

    .line 10
    iput-object v1, v0, Lcom/discord/chat/databinding/GuildInviteViewBinding;->itemInviteJoinedButton:Lcom/discord/core/DCDButton;

    move-object v1, p10

    .line 11
    iput-object v1, v0, Lcom/discord/chat/databinding/GuildInviteViewBinding;->itemInviteMemberContainer:Landroid/widget/LinearLayout;

    move-object v1, p11

    .line 12
    iput-object v1, v0, Lcom/discord/chat/databinding/GuildInviteViewBinding;->itemInviteOnlineDot:Landroid/widget/ImageView;

    move-object v1, p12

    .line 13
    iput-object v1, v0, Lcom/discord/chat/databinding/GuildInviteViewBinding;->itemInviteOnlineText:Landroid/widget/TextView;

    move-object v1, p13

    .line 14
    iput-object v1, v0, Lcom/discord/chat/databinding/GuildInviteViewBinding;->itemInviteSplash:Lcom/facebook/drawee/view/SimpleDraweeView;

    move-object/from16 v1, p14

    .line 15
    iput-object v1, v0, Lcom/discord/chat/databinding/GuildInviteViewBinding;->itemInviteSubtitle:Landroid/widget/TextView;

    move-object/from16 v1, p15

    .line 16
    iput-object v1, v0, Lcom/discord/chat/databinding/GuildInviteViewBinding;->itemInviteSubtitleIcon:Lcom/facebook/drawee/view/SimpleDraweeView;

    move-object/from16 v1, p16

    .line 17
    iput-object v1, v0, Lcom/discord/chat/databinding/GuildInviteViewBinding;->itemInviteTitle:Landroid/widget/TextView;

    move-object/from16 v1, p17

    .line 18
    iput-object v1, v0, Lcom/discord/chat/databinding/GuildInviteViewBinding;->itemInviteTotalMemberDot:Landroid/widget/ImageView;

    move-object/from16 v1, p18

    .line 19
    iput-object v1, v0, Lcom/discord/chat/databinding/GuildInviteViewBinding;->itemInviteTotalMemberText:Landroid/widget/TextView;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lcom/discord/chat/databinding/GuildInviteViewBinding;
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    sget v0, Lcom/discord/chat/R$id;->barrier_button:I

    .line 4
    .line 5
    invoke-static {v1, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    check-cast v2, Landroidx/constraintlayout/widget/Barrier;

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    sget v0, Lcom/discord/chat/R$id;->barrier_header:I

    .line 14
    .line 15
    invoke-static {v1, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, Landroidx/constraintlayout/widget/Barrier;

    .line 20
    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    sget v0, Lcom/discord/chat/R$id;->item_bottom_container:I

    .line 24
    .line 25
    invoke-static {v1, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    check-cast v4, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 30
    .line 31
    if-eqz v4, :cond_0

    .line 32
    .line 33
    sget v0, Lcom/discord/chat/R$id;->item_invite_header:I

    .line 34
    .line 35
    invoke-static {v1, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    check-cast v5, Landroid/widget/TextView;

    .line 40
    .line 41
    if-eqz v5, :cond_0

    .line 42
    .line 43
    sget v0, Lcom/discord/chat/R$id;->item_invite_hub_layout:I

    .line 44
    .line 45
    invoke-static {v1, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    check-cast v6, Landroid/widget/FrameLayout;

    .line 50
    .line 51
    if-eqz v6, :cond_0

    .line 52
    .line 53
    sget v0, Lcom/discord/chat/R$id;->item_invite_hub_link:I

    .line 54
    .line 55
    invoke-static {v1, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    check-cast v7, Landroid/widget/TextView;

    .line 60
    .line 61
    if-eqz v7, :cond_0

    .line 62
    .line 63
    sget v0, Lcom/discord/chat/R$id;->item_invite_image:I

    .line 64
    .line 65
    invoke-static {v1, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 66
    .line 67
    .line 68
    move-result-object v8

    .line 69
    check-cast v8, Lcom/discord/chat/presentation/message/view/GuildView;

    .line 70
    .line 71
    if-eqz v8, :cond_0

    .line 72
    .line 73
    sget v0, Lcom/discord/chat/R$id;->item_invite_joined_button:I

    .line 74
    .line 75
    invoke-static {v1, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 76
    .line 77
    .line 78
    move-result-object v9

    .line 79
    check-cast v9, Lcom/discord/core/DCDButton;

    .line 80
    .line 81
    if-eqz v9, :cond_0

    .line 82
    .line 83
    sget v0, Lcom/discord/chat/R$id;->item_invite_member_container:I

    .line 84
    .line 85
    invoke-static {v1, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 86
    .line 87
    .line 88
    move-result-object v10

    .line 89
    check-cast v10, Landroid/widget/LinearLayout;

    .line 90
    .line 91
    if-eqz v10, :cond_0

    .line 92
    .line 93
    sget v0, Lcom/discord/chat/R$id;->item_invite_online_dot:I

    .line 94
    .line 95
    invoke-static {v1, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 96
    .line 97
    .line 98
    move-result-object v11

    .line 99
    check-cast v11, Landroid/widget/ImageView;

    .line 100
    .line 101
    if-eqz v11, :cond_0

    .line 102
    .line 103
    sget v0, Lcom/discord/chat/R$id;->item_invite_online_text:I

    .line 104
    .line 105
    invoke-static {v1, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 106
    .line 107
    .line 108
    move-result-object v12

    .line 109
    check-cast v12, Landroid/widget/TextView;

    .line 110
    .line 111
    if-eqz v12, :cond_0

    .line 112
    .line 113
    sget v0, Lcom/discord/chat/R$id;->item_invite_splash:I

    .line 114
    .line 115
    invoke-static {v1, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 116
    .line 117
    .line 118
    move-result-object v13

    .line 119
    check-cast v13, Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 120
    .line 121
    if-eqz v13, :cond_0

    .line 122
    .line 123
    sget v0, Lcom/discord/chat/R$id;->item_invite_subtitle:I

    .line 124
    .line 125
    invoke-static {v1, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 126
    .line 127
    .line 128
    move-result-object v14

    .line 129
    check-cast v14, Landroid/widget/TextView;

    .line 130
    .line 131
    if-eqz v14, :cond_0

    .line 132
    .line 133
    sget v0, Lcom/discord/chat/R$id;->item_invite_subtitle_icon:I

    .line 134
    .line 135
    invoke-static {v1, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 136
    .line 137
    .line 138
    move-result-object v15

    .line 139
    check-cast v15, Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 140
    .line 141
    if-eqz v15, :cond_0

    .line 142
    .line 143
    sget v0, Lcom/discord/chat/R$id;->item_invite_title:I

    .line 144
    .line 145
    invoke-static {v1, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 146
    .line 147
    .line 148
    move-result-object v16

    .line 149
    check-cast v16, Landroid/widget/TextView;

    .line 150
    .line 151
    if-eqz v16, :cond_0

    .line 152
    .line 153
    sget v0, Lcom/discord/chat/R$id;->item_invite_total_member_dot:I

    .line 154
    .line 155
    invoke-static {v1, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 156
    .line 157
    .line 158
    move-result-object v17

    .line 159
    check-cast v17, Landroid/widget/ImageView;

    .line 160
    .line 161
    if-eqz v17, :cond_0

    .line 162
    .line 163
    sget v0, Lcom/discord/chat/R$id;->item_invite_total_member_text:I

    .line 164
    .line 165
    invoke-static {v1, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 166
    .line 167
    .line 168
    move-result-object v18

    .line 169
    check-cast v18, Landroid/widget/TextView;

    .line 170
    .line 171
    if-eqz v18, :cond_0

    .line 172
    .line 173
    new-instance v19, Lcom/discord/chat/databinding/GuildInviteViewBinding;

    .line 174
    .line 175
    move-object/from16 v0, v19

    .line 176
    .line 177
    move-object/from16 v1, p0

    .line 178
    .line 179
    invoke-direct/range {v0 .. v18}, Lcom/discord/chat/databinding/GuildInviteViewBinding;-><init>(Landroid/view/View;Landroidx/constraintlayout/widget/Barrier;Landroidx/constraintlayout/widget/Barrier;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;Landroid/widget/FrameLayout;Landroid/widget/TextView;Lcom/discord/chat/presentation/message/view/GuildView;Lcom/discord/core/DCDButton;Landroid/widget/LinearLayout;Landroid/widget/ImageView;Landroid/widget/TextView;Lcom/facebook/drawee/view/SimpleDraweeView;Landroid/widget/TextView;Lcom/facebook/drawee/view/SimpleDraweeView;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/TextView;)V

    .line 180
    .line 181
    .line 182
    return-object v19

    .line 183
    :cond_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    new-instance v1, Ljava/lang/NullPointerException;

    .line 192
    .line 193
    const-string v2, "Missing required view with ID: "

    .line 194
    .line 195
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    invoke-direct {v1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    throw v1
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

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/discord/chat/databinding/GuildInviteViewBinding;
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    sget v0, Lcom/discord/chat/R$layout;->guild_invite_view:I

    .line 4
    .line 5
    invoke-virtual {p0, v0, p1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Lcom/discord/chat/databinding/GuildInviteViewBinding;->bind(Landroid/view/View;)Lcom/discord/chat/databinding/GuildInviteViewBinding;

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


# virtual methods
.method public getRoot()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/databinding/GuildInviteViewBinding;->rootView:Landroid/view/View;

    return-object v0
.end method
