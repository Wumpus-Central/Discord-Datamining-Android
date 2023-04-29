.class public final Lcom/discord/chat/databinding/GiftViewBinding;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final acceptButton:Lcom/discord/core/DCDButton;

.field public final acceptButtonGradient:Landroid/view/View;

.field public final barrier:Landroidx/constraintlayout/widget/Barrier;

.field public final body:Landroid/widget/TextView;

.field public final content:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final gradients:Landroidx/constraintlayout/widget/Group;

.field public final header:Landroid/widget/TextView;

.field public final headerGradient:Landroid/view/View;

.field private final rootView:Landroid/widget/FrameLayout;

.field public final splash:Lcom/facebook/drawee/view/SimpleDraweeView;

.field public final subtitle:Landroid/widget/TextView;

.field public final subtitleGradient:Landroid/view/View;

.field public final thumbnail:Lcom/facebook/drawee/view/SimpleDraweeView;

.field public final thumbnailGradient:Landroid/view/View;

.field public final title:Landroid/widget/TextView;

.field public final titleGradient:Landroid/view/View;


# direct methods
.method private constructor <init>(Landroid/widget/FrameLayout;Lcom/discord/core/DCDButton;Landroid/view/View;Landroidx/constraintlayout/widget/Barrier;Landroid/widget/TextView;Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/widget/Group;Landroid/widget/TextView;Landroid/view/View;Lcom/facebook/drawee/view/SimpleDraweeView;Landroid/widget/TextView;Landroid/view/View;Lcom/facebook/drawee/view/SimpleDraweeView;Landroid/view/View;Landroid/widget/TextView;Landroid/view/View;)V
    .locals 2

    .line 1
    move-object v0, p0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    .line 4
    .line 5
    move-object v1, p1

    .line 6
    iput-object v1, v0, Lcom/discord/chat/databinding/GiftViewBinding;->rootView:Landroid/widget/FrameLayout;

    .line 7
    .line 8
    move-object v1, p2

    .line 9
    iput-object v1, v0, Lcom/discord/chat/databinding/GiftViewBinding;->acceptButton:Lcom/discord/core/DCDButton;

    .line 10
    .line 11
    move-object v1, p3

    .line 12
    iput-object v1, v0, Lcom/discord/chat/databinding/GiftViewBinding;->acceptButtonGradient:Landroid/view/View;

    .line 13
    .line 14
    move-object v1, p4

    .line 15
    iput-object v1, v0, Lcom/discord/chat/databinding/GiftViewBinding;->barrier:Landroidx/constraintlayout/widget/Barrier;

    .line 16
    .line 17
    move-object v1, p5

    .line 18
    iput-object v1, v0, Lcom/discord/chat/databinding/GiftViewBinding;->body:Landroid/widget/TextView;

    .line 19
    .line 20
    move-object v1, p6

    .line 21
    iput-object v1, v0, Lcom/discord/chat/databinding/GiftViewBinding;->content:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 22
    .line 23
    move-object v1, p7

    .line 24
    iput-object v1, v0, Lcom/discord/chat/databinding/GiftViewBinding;->gradients:Landroidx/constraintlayout/widget/Group;

    .line 25
    .line 26
    move-object v1, p8

    .line 27
    iput-object v1, v0, Lcom/discord/chat/databinding/GiftViewBinding;->header:Landroid/widget/TextView;

    .line 28
    .line 29
    move-object v1, p9

    .line 30
    iput-object v1, v0, Lcom/discord/chat/databinding/GiftViewBinding;->headerGradient:Landroid/view/View;

    .line 31
    .line 32
    move-object v1, p10

    .line 33
    iput-object v1, v0, Lcom/discord/chat/databinding/GiftViewBinding;->splash:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 34
    .line 35
    move-object v1, p11

    .line 36
    iput-object v1, v0, Lcom/discord/chat/databinding/GiftViewBinding;->subtitle:Landroid/widget/TextView;

    .line 37
    .line 38
    move-object v1, p12

    .line 39
    iput-object v1, v0, Lcom/discord/chat/databinding/GiftViewBinding;->subtitleGradient:Landroid/view/View;

    .line 40
    .line 41
    move-object v1, p13

    .line 42
    iput-object v1, v0, Lcom/discord/chat/databinding/GiftViewBinding;->thumbnail:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 43
    .line 44
    move-object/from16 v1, p14

    .line 45
    .line 46
    iput-object v1, v0, Lcom/discord/chat/databinding/GiftViewBinding;->thumbnailGradient:Landroid/view/View;

    .line 47
    .line 48
    move-object/from16 v1, p15

    .line 49
    .line 50
    iput-object v1, v0, Lcom/discord/chat/databinding/GiftViewBinding;->title:Landroid/widget/TextView;

    .line 51
    .line 52
    move-object/from16 v1, p16

    .line 53
    .line 54
    iput-object v1, v0, Lcom/discord/chat/databinding/GiftViewBinding;->titleGradient:Landroid/view/View;

    .line 55
    .line 56
    return-void
.end method

.method public static bind(Landroid/view/View;)Lcom/discord/chat/databinding/GiftViewBinding;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget v1, Lcom/discord/chat/R$id;->acceptButton:I

    .line 4
    .line 5
    invoke-static {v0, v1}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    move-object v5, v2

    .line 10
    check-cast v5, Lcom/discord/core/DCDButton;

    .line 11
    .line 12
    if-eqz v5, :cond_0

    .line 13
    .line 14
    sget v1, Lcom/discord/chat/R$id;->acceptButtonGradient:I

    .line 15
    .line 16
    invoke-static {v0, v1}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v6

    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sget v1, Lcom/discord/chat/R$id;->barrier:I

    .line 23
    .line 24
    invoke-static {v0, v1}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    move-object v7, v2

    .line 29
    check-cast v7, Landroidx/constraintlayout/widget/Barrier;

    .line 30
    .line 31
    if-eqz v7, :cond_0

    .line 32
    .line 33
    sget v1, Lcom/discord/chat/R$id;->body:I

    .line 34
    .line 35
    invoke-static {v0, v1}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    move-object v8, v2

    .line 40
    check-cast v8, Landroid/widget/TextView;

    .line 41
    .line 42
    if-eqz v8, :cond_0

    .line 43
    .line 44
    sget v1, Lcom/discord/chat/R$id;->content:I

    .line 45
    .line 46
    invoke-static {v0, v1}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    move-object v9, v2

    .line 51
    check-cast v9, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 52
    .line 53
    if-eqz v9, :cond_0

    .line 54
    .line 55
    sget v1, Lcom/discord/chat/R$id;->gradients:I

    .line 56
    .line 57
    invoke-static {v0, v1}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    move-object v10, v2

    .line 62
    check-cast v10, Landroidx/constraintlayout/widget/Group;

    .line 63
    .line 64
    if-eqz v10, :cond_0

    .line 65
    .line 66
    sget v1, Lcom/discord/chat/R$id;->header:I

    .line 67
    .line 68
    invoke-static {v0, v1}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    move-object v11, v2

    .line 73
    check-cast v11, Landroid/widget/TextView;

    .line 74
    .line 75
    if-eqz v11, :cond_0

    .line 76
    .line 77
    sget v1, Lcom/discord/chat/R$id;->headerGradient:I

    .line 78
    .line 79
    invoke-static {v0, v1}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 80
    .line 81
    .line 82
    move-result-object v12

    .line 83
    if-eqz v12, :cond_0

    .line 84
    .line 85
    sget v1, Lcom/discord/chat/R$id;->splash:I

    .line 86
    .line 87
    invoke-static {v0, v1}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    move-object v13, v2

    .line 92
    check-cast v13, Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 93
    .line 94
    if-eqz v13, :cond_0

    .line 95
    .line 96
    sget v1, Lcom/discord/chat/R$id;->subtitle:I

    .line 97
    .line 98
    invoke-static {v0, v1}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    move-object v14, v2

    .line 103
    check-cast v14, Landroid/widget/TextView;

    .line 104
    .line 105
    if-eqz v14, :cond_0

    .line 106
    .line 107
    sget v1, Lcom/discord/chat/R$id;->subtitleGradient:I

    .line 108
    .line 109
    invoke-static {v0, v1}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 110
    .line 111
    .line 112
    move-result-object v15

    .line 113
    if-eqz v15, :cond_0

    .line 114
    .line 115
    sget v1, Lcom/discord/chat/R$id;->thumbnail:I

    .line 116
    .line 117
    invoke-static {v0, v1}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    move-object/from16 v16, v2

    .line 122
    .line 123
    check-cast v16, Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 124
    .line 125
    if-eqz v16, :cond_0

    .line 126
    .line 127
    sget v1, Lcom/discord/chat/R$id;->thumbnailGradient:I

    .line 128
    .line 129
    invoke-static {v0, v1}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 130
    .line 131
    .line 132
    move-result-object v17

    .line 133
    if-eqz v17, :cond_0

    .line 134
    .line 135
    sget v1, Lcom/discord/chat/R$id;->title:I

    .line 136
    .line 137
    invoke-static {v0, v1}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    move-object/from16 v18, v2

    .line 142
    .line 143
    check-cast v18, Landroid/widget/TextView;

    .line 144
    .line 145
    if-eqz v18, :cond_0

    .line 146
    .line 147
    sget v1, Lcom/discord/chat/R$id;->titleGradient:I

    .line 148
    .line 149
    invoke-static {v0, v1}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 150
    .line 151
    .line 152
    move-result-object v19

    .line 153
    if-eqz v19, :cond_0

    .line 154
    .line 155
    new-instance v1, Lcom/discord/chat/databinding/GiftViewBinding;

    .line 156
    .line 157
    move-object v3, v1

    .line 158
    move-object v4, v0

    .line 159
    check-cast v4, Landroid/widget/FrameLayout;

    .line 160
    .line 161
    invoke-direct/range {v3 .. v19}, Lcom/discord/chat/databinding/GiftViewBinding;-><init>(Landroid/widget/FrameLayout;Lcom/discord/core/DCDButton;Landroid/view/View;Landroidx/constraintlayout/widget/Barrier;Landroid/widget/TextView;Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/widget/Group;Landroid/widget/TextView;Landroid/view/View;Lcom/facebook/drawee/view/SimpleDraweeView;Landroid/widget/TextView;Landroid/view/View;Lcom/facebook/drawee/view/SimpleDraweeView;Landroid/view/View;Landroid/widget/TextView;Landroid/view/View;)V

    .line 162
    .line 163
    .line 164
    return-object v1

    .line 165
    :cond_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    new-instance v1, Ljava/lang/NullPointerException;

    .line 174
    .line 175
    const-string v2, "Missing required view with ID: "

    .line 176
    .line 177
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-direct {v1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    throw v1
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

.method public static inflate(Landroid/view/LayoutInflater;)Lcom/discord/chat/databinding/GiftViewBinding;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    invoke-static {p0, v0, v1}, Lcom/discord/chat/databinding/GiftViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/discord/chat/databinding/GiftViewBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/discord/chat/databinding/GiftViewBinding;
    .locals 2

    .line 2
    sget v0, Lcom/discord/chat/R$layout;->gift_view:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    .line 3
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 4
    :cond_0
    invoke-static {p0}, Lcom/discord/chat/databinding/GiftViewBinding;->bind(Landroid/view/View;)Lcom/discord/chat/databinding/GiftViewBinding;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/discord/chat/databinding/GiftViewBinding;->getRoot()Landroid/widget/FrameLayout;

    move-result-object v0

    return-object v0
.end method

.method public getRoot()Landroid/widget/FrameLayout;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/discord/chat/databinding/GiftViewBinding;->rootView:Landroid/widget/FrameLayout;

    return-object v0
.end method
