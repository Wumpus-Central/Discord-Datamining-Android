.class public final Lcom/discord/chat/databinding/EmbedViewBinding;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final authorAvatar:Lcom/facebook/drawee/view/SimpleDraweeView;

.field public final authorContainer:Landroid/widget/LinearLayout;

.field public final authorName:Landroid/widget/TextView;

.field public final border:Landroid/view/View;

.field public final description:Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;

.field public final error:Landroid/widget/TextView;

.field public final errorIcon:Lcom/facebook/drawee/view/SimpleDraweeView;

.field public final fieldsBottomWrap:Landroid/widget/LinearLayout;

.field public final fieldsContainer:Landroid/widget/LinearLayout;

.field public final fieldsTopWrap:Landroid/widget/LinearLayout;

.field public final footerAvatar:Lcom/facebook/drawee/view/SimpleDraweeView;

.field public final footerContainer:Landroid/widget/LinearLayout;

.field public final footerText:Landroid/widget/TextView;

.field public final inlineMediaContainer:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final inlineMediaView:Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView;

.field public final inlineMediaView2:Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView;

.field public final inlineMediaView3:Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView;

.field public final inlineMediaView4:Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView;

.field public final mediaView:Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView;

.field public final provider:Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;

.field private final rootView:Landroid/view/View;

.field public final spacer:Landroid/widget/Space;

.field public final spoiler:Lcom/discord/chat/presentation/message/view/SpoilerView;

.field public final thumbnail:Lcom/facebook/drawee/view/SimpleDraweeView;

.field public final title:Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;


# direct methods
.method private constructor <init>(Landroid/view/View;Lcom/facebook/drawee/view/SimpleDraweeView;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/view/View;Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;Landroid/widget/TextView;Lcom/facebook/drawee/view/SimpleDraweeView;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Lcom/facebook/drawee/view/SimpleDraweeView;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView;Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView;Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView;Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView;Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView;Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;Landroid/widget/Space;Lcom/discord/chat/presentation/message/view/SpoilerView;Lcom/facebook/drawee/view/SimpleDraweeView;Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;)V
    .locals 2

    move-object v0, p0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    .line 2
    iput-object v1, v0, Lcom/discord/chat/databinding/EmbedViewBinding;->rootView:Landroid/view/View;

    move-object v1, p2

    .line 3
    iput-object v1, v0, Lcom/discord/chat/databinding/EmbedViewBinding;->authorAvatar:Lcom/facebook/drawee/view/SimpleDraweeView;

    move-object v1, p3

    .line 4
    iput-object v1, v0, Lcom/discord/chat/databinding/EmbedViewBinding;->authorContainer:Landroid/widget/LinearLayout;

    move-object v1, p4

    .line 5
    iput-object v1, v0, Lcom/discord/chat/databinding/EmbedViewBinding;->authorName:Landroid/widget/TextView;

    move-object v1, p5

    .line 6
    iput-object v1, v0, Lcom/discord/chat/databinding/EmbedViewBinding;->border:Landroid/view/View;

    move-object v1, p6

    .line 7
    iput-object v1, v0, Lcom/discord/chat/databinding/EmbedViewBinding;->description:Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;

    move-object v1, p7

    .line 8
    iput-object v1, v0, Lcom/discord/chat/databinding/EmbedViewBinding;->error:Landroid/widget/TextView;

    move-object v1, p8

    .line 9
    iput-object v1, v0, Lcom/discord/chat/databinding/EmbedViewBinding;->errorIcon:Lcom/facebook/drawee/view/SimpleDraweeView;

    move-object v1, p9

    .line 10
    iput-object v1, v0, Lcom/discord/chat/databinding/EmbedViewBinding;->fieldsBottomWrap:Landroid/widget/LinearLayout;

    move-object v1, p10

    .line 11
    iput-object v1, v0, Lcom/discord/chat/databinding/EmbedViewBinding;->fieldsContainer:Landroid/widget/LinearLayout;

    move-object v1, p11

    .line 12
    iput-object v1, v0, Lcom/discord/chat/databinding/EmbedViewBinding;->fieldsTopWrap:Landroid/widget/LinearLayout;

    move-object v1, p12

    .line 13
    iput-object v1, v0, Lcom/discord/chat/databinding/EmbedViewBinding;->footerAvatar:Lcom/facebook/drawee/view/SimpleDraweeView;

    move-object v1, p13

    .line 14
    iput-object v1, v0, Lcom/discord/chat/databinding/EmbedViewBinding;->footerContainer:Landroid/widget/LinearLayout;

    move-object/from16 v1, p14

    .line 15
    iput-object v1, v0, Lcom/discord/chat/databinding/EmbedViewBinding;->footerText:Landroid/widget/TextView;

    move-object/from16 v1, p15

    .line 16
    iput-object v1, v0, Lcom/discord/chat/databinding/EmbedViewBinding;->inlineMediaContainer:Landroidx/constraintlayout/widget/ConstraintLayout;

    move-object/from16 v1, p16

    .line 17
    iput-object v1, v0, Lcom/discord/chat/databinding/EmbedViewBinding;->inlineMediaView:Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView;

    move-object/from16 v1, p17

    .line 18
    iput-object v1, v0, Lcom/discord/chat/databinding/EmbedViewBinding;->inlineMediaView2:Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView;

    move-object/from16 v1, p18

    .line 19
    iput-object v1, v0, Lcom/discord/chat/databinding/EmbedViewBinding;->inlineMediaView3:Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView;

    move-object/from16 v1, p19

    .line 20
    iput-object v1, v0, Lcom/discord/chat/databinding/EmbedViewBinding;->inlineMediaView4:Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView;

    move-object/from16 v1, p20

    .line 21
    iput-object v1, v0, Lcom/discord/chat/databinding/EmbedViewBinding;->mediaView:Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView;

    move-object/from16 v1, p21

    .line 22
    iput-object v1, v0, Lcom/discord/chat/databinding/EmbedViewBinding;->provider:Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;

    move-object/from16 v1, p22

    .line 23
    iput-object v1, v0, Lcom/discord/chat/databinding/EmbedViewBinding;->spacer:Landroid/widget/Space;

    move-object/from16 v1, p23

    .line 24
    iput-object v1, v0, Lcom/discord/chat/databinding/EmbedViewBinding;->spoiler:Lcom/discord/chat/presentation/message/view/SpoilerView;

    move-object/from16 v1, p24

    .line 25
    iput-object v1, v0, Lcom/discord/chat/databinding/EmbedViewBinding;->thumbnail:Lcom/facebook/drawee/view/SimpleDraweeView;

    move-object/from16 v1, p25

    .line 26
    iput-object v1, v0, Lcom/discord/chat/databinding/EmbedViewBinding;->title:Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lcom/discord/chat/databinding/EmbedViewBinding;
    .locals 27

    move-object/from16 v1, p0

    .line 1
    sget v0, Lcom/discord/chat/R$id;->author_avatar:I

    .line 2
    invoke-static {v1, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/facebook/drawee/view/SimpleDraweeView;

    if-eqz v2, :cond_0

    .line 3
    sget v0, Lcom/discord/chat/R$id;->author_container:I

    .line 4
    invoke-static {v1, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/LinearLayout;

    if-eqz v3, :cond_0

    .line 5
    sget v0, Lcom/discord/chat/R$id;->author_name:I

    .line 6
    invoke-static {v1, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    if-eqz v4, :cond_0

    .line 7
    sget v0, Lcom/discord/chat/R$id;->border:I

    .line 8
    invoke-static {v1, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v5

    if-eqz v5, :cond_0

    .line 9
    sget v0, Lcom/discord/chat/R$id;->description:I

    .line 10
    invoke-static {v1, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;

    if-eqz v6, :cond_0

    .line 11
    sget v0, Lcom/discord/chat/R$id;->error:I

    .line 12
    invoke-static {v1, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    if-eqz v7, :cond_0

    .line 13
    sget v0, Lcom/discord/chat/R$id;->error_icon:I

    .line 14
    invoke-static {v1, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Lcom/facebook/drawee/view/SimpleDraweeView;

    if-eqz v8, :cond_0

    .line 15
    sget v0, Lcom/discord/chat/R$id;->fields_bottom_wrap:I

    .line 16
    invoke-static {v1, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Landroid/widget/LinearLayout;

    if-eqz v9, :cond_0

    .line 17
    sget v0, Lcom/discord/chat/R$id;->fields_container:I

    .line 18
    invoke-static {v1, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v10

    check-cast v10, Landroid/widget/LinearLayout;

    if-eqz v10, :cond_0

    .line 19
    sget v0, Lcom/discord/chat/R$id;->fields_top_wrap:I

    .line 20
    invoke-static {v1, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v11

    check-cast v11, Landroid/widget/LinearLayout;

    if-eqz v11, :cond_0

    .line 21
    sget v0, Lcom/discord/chat/R$id;->footer_avatar:I

    .line 22
    invoke-static {v1, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v12

    check-cast v12, Lcom/facebook/drawee/view/SimpleDraweeView;

    if-eqz v12, :cond_0

    .line 23
    sget v0, Lcom/discord/chat/R$id;->footer_container:I

    .line 24
    invoke-static {v1, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v13

    check-cast v13, Landroid/widget/LinearLayout;

    if-eqz v13, :cond_0

    .line 25
    sget v0, Lcom/discord/chat/R$id;->footer_text:I

    .line 26
    invoke-static {v1, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v14

    check-cast v14, Landroid/widget/TextView;

    if-eqz v14, :cond_0

    .line 27
    sget v0, Lcom/discord/chat/R$id;->inline_media_container:I

    .line 28
    invoke-static {v1, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v15

    check-cast v15, Landroidx/constraintlayout/widget/ConstraintLayout;

    if-eqz v15, :cond_0

    .line 29
    sget v0, Lcom/discord/chat/R$id;->inline_media_view:I

    .line 30
    invoke-static {v1, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v16

    check-cast v16, Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView;

    if-eqz v16, :cond_0

    .line 31
    sget v0, Lcom/discord/chat/R$id;->inline_media_view2:I

    .line 32
    invoke-static {v1, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v17

    check-cast v17, Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView;

    if-eqz v17, :cond_0

    .line 33
    sget v0, Lcom/discord/chat/R$id;->inline_media_view3:I

    .line 34
    invoke-static {v1, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v18

    check-cast v18, Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView;

    if-eqz v18, :cond_0

    .line 35
    sget v0, Lcom/discord/chat/R$id;->inline_media_view4:I

    .line 36
    invoke-static {v1, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v19

    check-cast v19, Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView;

    if-eqz v19, :cond_0

    .line 37
    sget v0, Lcom/discord/chat/R$id;->media_view:I

    .line 38
    invoke-static {v1, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v20

    check-cast v20, Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView;

    if-eqz v20, :cond_0

    .line 39
    sget v0, Lcom/discord/chat/R$id;->provider:I

    .line 40
    invoke-static {v1, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v21

    check-cast v21, Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;

    if-eqz v21, :cond_0

    .line 41
    sget v0, Lcom/discord/chat/R$id;->spacer:I

    .line 42
    invoke-static {v1, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v22

    check-cast v22, Landroid/widget/Space;

    if-eqz v22, :cond_0

    .line 43
    sget v0, Lcom/discord/chat/R$id;->spoiler:I

    .line 44
    invoke-static {v1, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v23

    check-cast v23, Lcom/discord/chat/presentation/message/view/SpoilerView;

    if-eqz v23, :cond_0

    .line 45
    sget v0, Lcom/discord/chat/R$id;->thumbnail:I

    .line 46
    invoke-static {v1, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v24

    check-cast v24, Lcom/facebook/drawee/view/SimpleDraweeView;

    if-eqz v24, :cond_0

    .line 47
    sget v0, Lcom/discord/chat/R$id;->title:I

    .line 48
    invoke-static {v1, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v25

    check-cast v25, Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;

    if-eqz v25, :cond_0

    .line 49
    new-instance v26, Lcom/discord/chat/databinding/EmbedViewBinding;

    move-object/from16 v0, v26

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v25}, Lcom/discord/chat/databinding/EmbedViewBinding;-><init>(Landroid/view/View;Lcom/facebook/drawee/view/SimpleDraweeView;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/view/View;Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;Landroid/widget/TextView;Lcom/facebook/drawee/view/SimpleDraweeView;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Lcom/facebook/drawee/view/SimpleDraweeView;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView;Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView;Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView;Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView;Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView;Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;Landroid/widget/Space;Lcom/discord/chat/presentation/message/view/SpoilerView;Lcom/facebook/drawee/view/SimpleDraweeView;Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;)V

    return-object v26

    .line 50
    :cond_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v0

    .line 51
    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "Missing required view with ID: "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/discord/chat/databinding/EmbedViewBinding;
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    sget v0, Lcom/discord/chat/R$layout;->embed_view:I

    .line 4
    .line 5
    invoke-virtual {p0, v0, p1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Lcom/discord/chat/databinding/EmbedViewBinding;->bind(Landroid/view/View;)Lcom/discord/chat/databinding/EmbedViewBinding;

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
.end method


# virtual methods
.method public getRoot()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/databinding/EmbedViewBinding;->rootView:Landroid/view/View;

    return-object v0
.end method
