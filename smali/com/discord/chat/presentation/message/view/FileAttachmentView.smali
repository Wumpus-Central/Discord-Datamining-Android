.class public final Lcom/discord/chat/presentation/message/view/FileAttachmentView;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u001d\u0008\u0007\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\n\u0008\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u00a2\u0006\u0004\u0008!\u0010\"J{\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0018\u0010\u0008\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u001c\u00a8\u0006#"
    }
    d2 = {
        "Lcom/discord/chat/presentation/message/view/FileAttachmentView;",
        "Landroidx/constraintlayout/widget/ConstraintLayout;",
        "",
        "attachmentName",
        "attachmentDescription",
        "url",
        "Lkotlin/Function2;",
        "",
        "onClick",
        "",
        "isSpoiler",
        "Lcom/discord/chat/bridge/spoiler/SpoilerConfig;",
        "spoilerConfig",
        "",
        "progress",
        "Lkotlin/Function0;",
        "onCancelUpload",
        "Lcom/discord/chat/presentation/message/view/UploadContext;",
        "uploadContext",
        "",
        "attachmentsOpacity",
        "setContent",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZLcom/discord/chat/bridge/spoiler/SpoilerConfig;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;Lcom/discord/chat/presentation/message/view/UploadContext;Ljava/lang/Float;)V",
        "Lcom/discord/chat/databinding/FileAttachmentViewBinding;",
        "binding",
        "Lcom/discord/chat/databinding/FileAttachmentViewBinding;",
        "uploadFinished",
        "Z",
        "Lcom/discord/chat/presentation/message/view/UploadContext;",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
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
.field private final binding:Lcom/discord/chat/databinding/FileAttachmentViewBinding;

.field private uploadContext:Lcom/discord/chat/presentation/message/view/UploadContext;

.field private uploadFinished:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p0, p1, v0, v1, v0}, Lcom/discord/chat/presentation/message/view/FileAttachmentView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 3
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1, p0}, Lcom/discord/chat/databinding/FileAttachmentViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/discord/chat/databinding/FileAttachmentViewBinding;

    move-result-object p1

    const-string p2, "inflate(LayoutInflater.from(context), this)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/discord/chat/presentation/message/view/FileAttachmentView;->binding:Lcom/discord/chat/databinding/FileAttachmentViewBinding;

    .line 4
    iget-object p2, p1, Lcom/discord/chat/databinding/FileAttachmentViewBinding;->fileAttachmentDownload:Lcom/facebook/drawee/view/SimpleDraweeView;

    const-string v0, "binding.fileAttachmentDownload"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/discord/react_asset_fetcher/ReactAsset;->Download:Lcom/discord/react_asset_fetcher/ReactAsset;

    invoke-static {p2, v1}, Lcom/discord/react_asset_fetcher/ReactAssetUtilsKt;->setReactAsset(Lcom/facebook/drawee/view/SimpleDraweeView;Lcom/discord/react_asset_fetcher/ReactAsset;)V

    .line 5
    iget-object p2, p1, Lcom/discord/chat/databinding/FileAttachmentViewBinding;->fileAttachmentDownload:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v0

    invoke-virtual {v0}, Lcom/discord/theme/DiscordTheme;->getTextMuted()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p2, v0}, Lcom/discord/theme/utils/ColorUtilsKt;->setTintColor(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/Integer;)V

    .line 6
    iget-object p2, p1, Lcom/discord/chat/databinding/FileAttachmentViewBinding;->fileAttachmentIcon:Lcom/facebook/drawee/view/SimpleDraweeView;

    const-string v0, "binding.fileAttachmentIcon"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/discord/react_asset_fetcher/ReactAsset;->File:Lcom/discord/react_asset_fetcher/ReactAsset;

    invoke-static {p2, v1}, Lcom/discord/react_asset_fetcher/ReactAssetUtilsKt;->setReactAsset(Lcom/facebook/drawee/view/SimpleDraweeView;Lcom/discord/react_asset_fetcher/ReactAsset;)V

    .line 7
    iget-object p2, p1, Lcom/discord/chat/databinding/FileAttachmentViewBinding;->fileAttachmentIcon:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v0

    invoke-virtual {v0}, Lcom/discord/theme/DiscordTheme;->getTextMuted()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p2, v0}, Lcom/discord/theme/utils/ColorUtilsKt;->setTintColor(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/Integer;)V

    .line 8
    iget-object p2, p1, Lcom/discord/chat/databinding/FileAttachmentViewBinding;->fileAttachmentName:Landroid/widget/TextView;

    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v0

    invoke-virtual {v0}, Lcom/discord/theme/DiscordTheme;->getTextLink()I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 9
    iget-object p2, p1, Lcom/discord/chat/databinding/FileAttachmentViewBinding;->fileAttachmentName:Landroid/widget/TextView;

    const-string v0, "binding.fileAttachmentName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/discord/fonts/DiscordFont;->PrimaryMedium:Lcom/discord/fonts/DiscordFont;

    invoke-static {p2, v0}, Lcom/discord/fonts/DiscordFontUtilsKt;->setDiscordFont(Landroid/widget/TextView;Lcom/discord/fonts/DiscordFont;)V

    .line 10
    iget-object p2, p1, Lcom/discord/chat/databinding/FileAttachmentViewBinding;->fileAttachmentDescription:Landroid/widget/TextView;

    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v1

    invoke-virtual {v1}, Lcom/discord/theme/DiscordTheme;->getTextNormal()I

    move-result v1

    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 11
    iget-object p2, p1, Lcom/discord/chat/databinding/FileAttachmentViewBinding;->fileAttachmentDescription:Landroid/widget/TextView;

    const-string v1, "binding.fileAttachmentDescription"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v2, 0x41400000    # 12.0f

    invoke-static {p2, v2}, Lcom/discord/SetTextSizeSpKt;->setTextSizeSp(Landroid/widget/TextView;F)V

    .line 12
    iget-object p2, p1, Lcom/discord/chat/databinding/FileAttachmentViewBinding;->fileAttachmentDescription:Landroid/widget/TextView;

    invoke-static {p2, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lcom/discord/fonts/DiscordFontUtilsKt;->setDiscordFont(Landroid/widget/TextView;Lcom/discord/fonts/DiscordFont;)V

    .line 13
    iget-object p2, p1, Lcom/discord/chat/databinding/FileAttachmentViewBinding;->fileAttachmentDownloadProgressBar:Landroid/widget/ProgressBar;

    .line 14
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v0

    invoke-virtual {v0}, Lcom/discord/theme/DiscordTheme;->getTextMuted()I

    move-result v0

    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    .line 15
    invoke-virtual {p2, v0}, Landroid/widget/ProgressBar;->setIndeterminateTintList(Landroid/content/res/ColorStateList;)V

    .line 16
    invoke-virtual {p1}, Lcom/discord/chat/databinding/FileAttachmentViewBinding;->getRoot()Landroid/view/View;

    move-result-object p2

    const-string v0, "binding.root"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v1, 0x8

    invoke-static {v1}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    move-result v2

    .line 17
    invoke-virtual {p2, v2, v2, v2, v2}, Landroid/view/View;->setPadding(IIII)V

    .line 18
    invoke-virtual {p1}, Lcom/discord/chat/databinding/FileAttachmentViewBinding;->getRoot()Landroid/view/View;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object p2

    invoke-virtual {p2}, Lcom/discord/theme/DiscordTheme;->getBackgroundSecondary()I

    move-result p2

    .line 20
    invoke-static {v1}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    move-result v0

    .line 21
    sget v1, Lcom/discord/chat/R$color;->primary_dark_700_alpha_60:I

    invoke-static {p0, v1}, Lcom/discord/theme/utils/ColorUtilsKt;->getColorCompat(Landroid/view/View;I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/high16 v2, 0x3e800000    # 0.25f

    .line 22
    invoke-static {v2}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(F)I

    move-result v2

    .line 23
    invoke-static {p1, p2, v0, v1, v2}, Lcom/discord/misc/utilities/view/ViewBackgroundUtilsKt;->setBackgroundRectangle(Landroid/view/View;IILjava/lang/Integer;I)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 1
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/discord/chat/presentation/message/view/FileAttachmentView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public static final synthetic access$getBinding$p(Lcom/discord/chat/presentation/message/view/FileAttachmentView;)Lcom/discord/chat/databinding/FileAttachmentViewBinding;
    .locals 0

    iget-object p0, p0, Lcom/discord/chat/presentation/message/view/FileAttachmentView;->binding:Lcom/discord/chat/databinding/FileAttachmentViewBinding;

    return-object p0
.end method

.method public static final synthetic access$setUploadFinished$p(Lcom/discord/chat/presentation/message/view/FileAttachmentView;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/discord/chat/presentation/message/view/FileAttachmentView;->uploadFinished:Z

    return-void
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function2;Ljava/lang/String;Ljava/lang/String;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/discord/chat/presentation/message/view/FileAttachmentView;->setContent$lambda$0(Lkotlin/jvm/functions/Function2;Ljava/lang/String;Ljava/lang/String;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic c(Lcom/discord/chat/presentation/message/view/FileAttachmentView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/discord/chat/presentation/message/view/FileAttachmentView;->setContent$lambda$1(Lcom/discord/chat/presentation/message/view/FileAttachmentView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View;)V

    return-void
.end method

.method private static final setContent$lambda$0(Lkotlin/jvm/functions/Function2;Ljava/lang/String;Ljava/lang/String;Landroid/view/View;)V
    .locals 0

    .line 1
    const-string p3, "$onClick"

    .line 2
    .line 3
    invoke-static {p0, p3}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p3, "$url"

    .line 7
    .line 8
    invoke-static {p1, p3}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p3, "$attachmentName"

    .line 12
    .line 13
    invoke-static {p2, p3}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    return-void
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
.end method

.method private static final setContent$lambda$1(Lcom/discord/chat/presentation/message/view/FileAttachmentView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View;)V
    .locals 9

    .line 1
    const-string p4, "this$0"

    .line 2
    .line 3
    invoke-static {p0, p4}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p4, "$url"

    .line 7
    .line 8
    invoke-static {p1, p4}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p4, "$attachmentName"

    .line 12
    .line 13
    invoke-static {p2, p4}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string p4, "$attachmentDescription"

    .line 17
    .line 18
    invoke-static {p3, p4}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-static {p0}, Lcom/discord/misc/utilities/coroutines/CoroutineViewUtilsKt;->getAttachedScope(Landroid/view/View;)Lcom/discord/misc/utilities/coroutines/AttachedViewCoroutineScope;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {}, Lkotlinx/coroutines/y0;->b()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    const/4 v2, 0x0

    .line 30
    new-instance p4, Lcom/discord/chat/presentation/message/view/FileAttachmentView$setContent$2$1;

    .line 31
    .line 32
    const/4 v8, 0x0

    .line 33
    move-object v3, p4

    .line 34
    move-object v4, p0

    .line 35
    move-object v5, p1

    .line 36
    move-object v6, p2

    .line 37
    move-object v7, p3

    .line 38
    invoke-direct/range {v3 .. v8}, Lcom/discord/chat/presentation/message/view/FileAttachmentView$setContent$2$1;-><init>(Lcom/discord/chat/presentation/message/view/FileAttachmentView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 39
    .line 40
    .line 41
    const/4 v4, 0x2

    .line 42
    const/4 v5, 0x0

    .line 43
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/j;->d(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/l0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 44
    .line 45
    .line 46
    return-void
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
.end method


# virtual methods
.method public final setContent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZLcom/discord/chat/bridge/spoiler/SpoilerConfig;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;Lcom/discord/chat/presentation/message/view/UploadContext;Ljava/lang/Float;)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/String;",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;Z",
            "Lcom/discord/chat/bridge/spoiler/SpoilerConfig;",
            "Ljava/lang/Integer;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/discord/chat/presentation/message/view/UploadContext;",
            "Ljava/lang/Float;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p7

    move-object/from16 v6, p8

    move-object/from16 v7, p9

    const-string v8, "attachmentName"

    invoke-static {v1, v8}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "attachmentDescription"

    invoke-static {v2, v8}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "url"

    invoke-static {v3, v8}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "onClick"

    invoke-static {v4, v8}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "onCancelUpload"

    invoke-static {v6, v8}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "uploadContext"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eqz v5, :cond_0

    move v10, v8

    goto :goto_0

    :cond_0
    move v10, v9

    .line 1
    :goto_0
    invoke-static/range {p0 .. p0}, Lcom/discord/misc/utilities/coroutines/CoroutineViewUtilsKt;->getAttachedScope(Landroid/view/View;)Lcom/discord/misc/utilities/coroutines/AttachedViewCoroutineScope;

    move-result-object v11

    const-class v12, Lcom/discord/chat/presentation/message/view/FileAttachmentView;

    invoke-virtual {v12}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v12

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "Binding "

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    const/4 v13, 0x2

    const/4 v14, 0x0

    invoke-static {v11, v12, v14, v13, v14}, Lcom/discord/misc/utilities/coroutines/AttachedViewCoroutineScope;->cancelAllWork$default(Lcom/discord/misc/utilities/coroutines/AttachedViewCoroutineScope;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 2
    iget-object v11, v0, Lcom/discord/chat/presentation/message/view/FileAttachmentView;->binding:Lcom/discord/chat/databinding/FileAttachmentViewBinding;

    iget-object v11, v11, Lcom/discord/chat/databinding/FileAttachmentViewBinding;->fileAttachmentDownload:Lcom/facebook/drawee/view/SimpleDraweeView;

    const-string v12, "binding.fileAttachmentDownload"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    xor-int/lit8 v13, v10, 0x1

    if-eqz v13, :cond_1

    move v13, v9

    goto :goto_1

    :cond_1
    const/16 v13, 0x8

    .line 3
    :goto_1
    invoke-virtual {v11, v13}, Landroid/view/View;->setVisibility(I)V

    .line 4
    iget-object v11, v0, Lcom/discord/chat/presentation/message/view/FileAttachmentView;->binding:Lcom/discord/chat/databinding/FileAttachmentViewBinding;

    iget-object v11, v11, Lcom/discord/chat/databinding/FileAttachmentViewBinding;->fileAttachmentDownloadProgressBar:Landroid/widget/ProgressBar;

    const-string v13, "binding.fileAttachmentDownloadProgressBar"

    invoke-static {v11, v13}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v13, 0x4

    .line 5
    invoke-virtual {v11, v13}, Landroid/view/View;->setVisibility(I)V

    .line 6
    iget-object v11, v0, Lcom/discord/chat/presentation/message/view/FileAttachmentView;->binding:Lcom/discord/chat/databinding/FileAttachmentViewBinding;

    iget-object v11, v11, Lcom/discord/chat/databinding/FileAttachmentViewBinding;->fileAttachmentName:Landroid/widget/TextView;

    const-string v15, "binding.fileAttachmentName"

    invoke-static {v11, v15}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v11, v1}, Lcom/discord/misc/utilities/view/ViewUtilsKt;->setOptionalText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 7
    iget-object v11, v0, Lcom/discord/chat/presentation/message/view/FileAttachmentView;->binding:Lcom/discord/chat/databinding/FileAttachmentViewBinding;

    iget-object v11, v11, Lcom/discord/chat/databinding/FileAttachmentViewBinding;->fileAttachmentDescription:Landroid/widget/TextView;

    const-string v15, "binding.fileAttachmentDescription"

    invoke-static {v11, v15}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v11, v2}, Lcom/discord/misc/utilities/view/ViewUtilsKt;->setOptionalText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    if-nez v10, :cond_2

    .line 8
    new-instance v11, Lcom/discord/chat/presentation/message/view/t;

    invoke-direct {v11, v4, v3, v1}, Lcom/discord/chat/presentation/message/view/t;-><init>(Lkotlin/jvm/functions/Function2;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0, v9, v11, v8, v14}, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchUtilsKt;->setOnClickListenerNested$default(Landroid/view/View;ZLandroid/view/View$OnClickListener;ILjava/lang/Object;)V

    .line 9
    :cond_2
    iget-object v4, v0, Lcom/discord/chat/presentation/message/view/FileAttachmentView;->binding:Lcom/discord/chat/databinding/FileAttachmentViewBinding;

    iget-object v4, v4, Lcom/discord/chat/databinding/FileAttachmentViewBinding;->fileAttachmentDownload:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v4, v12}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v11, Lcom/discord/chat/presentation/message/view/u;

    invoke-direct {v11, v0, v3, v1, v2}, Lcom/discord/chat/presentation/message/view/u;-><init>(Lcom/discord/chat/presentation/message/view/FileAttachmentView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v4, v9, v11, v8, v14}, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchUtilsKt;->setOnClickListenerNested$default(Landroid/view/View;ZLandroid/view/View$OnClickListener;ILjava/lang/Object;)V

    .line 10
    iget-object v1, v0, Lcom/discord/chat/presentation/message/view/FileAttachmentView;->binding:Lcom/discord/chat/databinding/FileAttachmentViewBinding;

    iget-object v1, v1, Lcom/discord/chat/databinding/FileAttachmentViewBinding;->spoiler:Lcom/discord/chat/presentation/message/view/SpoilerView;

    move-object/from16 v2, p6

    invoke-virtual {v1, v2}, Lcom/discord/chat/presentation/message/view/SpoilerView;->configure(Lcom/discord/chat/bridge/spoiler/SpoilerConfig;)V

    if-eqz p5, :cond_4

    .line 11
    iget-object v1, v0, Lcom/discord/chat/presentation/message/view/FileAttachmentView;->binding:Lcom/discord/chat/databinding/FileAttachmentViewBinding;

    iget-object v1, v1, Lcom/discord/chat/databinding/FileAttachmentViewBinding;->spoiler:Lcom/discord/chat/presentation/message/view/SpoilerView;

    const-string v2, "binding.spoiler"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v1

    if-nez v1, :cond_3

    goto :goto_2

    :cond_3
    move v8, v9

    :goto_2
    if-eqz v8, :cond_4

    .line 13
    iget-object v1, v0, Lcom/discord/chat/presentation/message/view/FileAttachmentView;->binding:Lcom/discord/chat/databinding/FileAttachmentViewBinding;

    iget-object v1, v1, Lcom/discord/chat/databinding/FileAttachmentViewBinding;->fileAttachmentDownload:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v1, v13}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 14
    iget-object v1, v0, Lcom/discord/chat/presentation/message/view/FileAttachmentView;->binding:Lcom/discord/chat/databinding/FileAttachmentViewBinding;

    iget-object v1, v1, Lcom/discord/chat/databinding/FileAttachmentViewBinding;->fileAttachmentName:Landroid/widget/TextView;

    invoke-virtual {v1, v13}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 15
    iget-object v1, v0, Lcom/discord/chat/presentation/message/view/FileAttachmentView;->binding:Lcom/discord/chat/databinding/FileAttachmentViewBinding;

    iget-object v1, v1, Lcom/discord/chat/databinding/FileAttachmentViewBinding;->fileAttachmentDescription:Landroid/widget/TextView;

    invoke-virtual {v1, v13}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 16
    :cond_4
    iget-object v1, v0, Lcom/discord/chat/presentation/message/view/FileAttachmentView;->binding:Lcom/discord/chat/databinding/FileAttachmentViewBinding;

    invoke-virtual {v1}, Lcom/discord/chat/databinding/FileAttachmentViewBinding;->getRoot()Landroid/view/View;

    move-result-object v1

    if-eqz p10, :cond_5

    invoke-virtual/range {p10 .. p10}, Ljava/lang/Float;->floatValue()F

    move-result v2

    goto :goto_3

    :cond_5
    const/high16 v2, 0x3f800000    # 1.0f

    :goto_3
    invoke-virtual {v1, v2}, Landroid/view/View;->setAlpha(F)V

    .line 17
    iget-object v1, v0, Lcom/discord/chat/presentation/message/view/FileAttachmentView;->binding:Lcom/discord/chat/databinding/FileAttachmentViewBinding;

    iget-object v11, v1, Lcom/discord/chat/databinding/FileAttachmentViewBinding;->uploadOverlay:Lcom/discord/chat/presentation/message/view/AttachmentUploadOverlayView;

    .line 18
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v1

    invoke-virtual {v1}, Lcom/discord/theme/DiscordTheme;->getInteractiveNormal()I

    move-result v1

    .line 19
    new-instance v13, Landroid/graphics/drawable/ShapeDrawable;

    invoke-direct {v13}, Landroid/graphics/drawable/ShapeDrawable;-><init>()V

    .line 20
    invoke-virtual {v13}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    const-string v4, "context"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const v4, 0x106000d

    invoke-static {v3, v4}, Lcom/discord/theme/utils/ColorUtilsKt;->getColorCompat(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 21
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v2

    invoke-virtual {v2}, Lcom/discord/theme/DiscordTheme;->getBackgroundModifierAccent()I

    move-result v2

    const-string v3, "uploadOverlay"

    .line 22
    invoke-static {v11, v3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v12, 0x0

    const/4 v14, 0x0

    .line 23
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    const/16 v16, 0x0

    .line 24
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v17

    const/16 v18, 0x15

    const/16 v19, 0x0

    .line 25
    invoke-static/range {v11 .. v19}, Lcom/discord/chat/presentation/message/view/AttachmentUploadOverlayView;->configureProgressView$default(Lcom/discord/chat/presentation/message/view/AttachmentUploadOverlayView;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Object;)V

    .line 26
    iget-object v1, v0, Lcom/discord/chat/presentation/message/view/FileAttachmentView;->uploadContext:Lcom/discord/chat/presentation/message/view/UploadContext;

    invoke-static {v1, v7}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    .line 27
    iput-object v7, v0, Lcom/discord/chat/presentation/message/view/FileAttachmentView;->uploadContext:Lcom/discord/chat/presentation/message/view/UploadContext;

    .line 28
    iput-boolean v9, v0, Lcom/discord/chat/presentation/message/view/FileAttachmentView;->uploadFinished:Z

    :cond_6
    if-eqz v10, :cond_7

    .line 29
    iget-boolean v1, v0, Lcom/discord/chat/presentation/message/view/FileAttachmentView;->uploadFinished:Z

    if-nez v1, :cond_7

    .line 30
    iget-object v1, v0, Lcom/discord/chat/presentation/message/view/FileAttachmentView;->binding:Lcom/discord/chat/databinding/FileAttachmentViewBinding;

    iget-object v1, v1, Lcom/discord/chat/databinding/FileAttachmentViewBinding;->uploadOverlayBackground:Landroid/widget/LinearLayout;

    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v2

    invoke-virtual {v2}, Lcom/discord/theme/DiscordTheme;->getBackgroundSecondary()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 31
    iget-object v1, v0, Lcom/discord/chat/presentation/message/view/FileAttachmentView;->binding:Lcom/discord/chat/databinding/FileAttachmentViewBinding;

    iget-object v1, v1, Lcom/discord/chat/databinding/FileAttachmentViewBinding;->uploadOverlayBackground:Landroid/widget/LinearLayout;

    const-string v2, "binding.uploadOverlayBackground"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    invoke-virtual {v1, v9}, Landroid/view/View;->setVisibility(I)V

    .line 33
    :cond_7
    new-instance v1, Lcom/discord/chat/presentation/message/view/FileAttachmentView$setContent$hideOverlayBackground$1;

    invoke-direct {v1, v0}, Lcom/discord/chat/presentation/message/view/FileAttachmentView$setContent$hideOverlayBackground$1;-><init>(Lcom/discord/chat/presentation/message/view/FileAttachmentView;)V

    .line 34
    iget-object v2, v0, Lcom/discord/chat/presentation/message/view/FileAttachmentView;->binding:Lcom/discord/chat/databinding/FileAttachmentViewBinding;

    iget-object v2, v2, Lcom/discord/chat/databinding/FileAttachmentViewBinding;->uploadOverlay:Lcom/discord/chat/presentation/message/view/AttachmentUploadOverlayView;

    invoke-virtual {v2, v5, v7}, Lcom/discord/chat/presentation/message/view/AttachmentUploadOverlayView;->setProgress(Ljava/lang/Integer;Lcom/discord/chat/presentation/message/view/UploadContext;)V

    .line 35
    iget-object v2, v0, Lcom/discord/chat/presentation/message/view/FileAttachmentView;->binding:Lcom/discord/chat/databinding/FileAttachmentViewBinding;

    iget-object v2, v2, Lcom/discord/chat/databinding/FileAttachmentViewBinding;->uploadOverlay:Lcom/discord/chat/presentation/message/view/AttachmentUploadOverlayView;

    invoke-virtual {v2, v6}, Lcom/discord/chat/presentation/message/view/AttachmentUploadOverlayView;->setUploadCancel(Lkotlin/jvm/functions/Function0;)V

    .line 36
    iget-object v2, v0, Lcom/discord/chat/presentation/message/view/FileAttachmentView;->binding:Lcom/discord/chat/databinding/FileAttachmentViewBinding;

    iget-object v2, v2, Lcom/discord/chat/databinding/FileAttachmentViewBinding;->uploadOverlay:Lcom/discord/chat/presentation/message/view/AttachmentUploadOverlayView;

    invoke-virtual {v2, v1}, Lcom/discord/chat/presentation/message/view/AttachmentUploadOverlayView;->setOnProgressAnimationComplete(Lkotlin/jvm/functions/Function0;)V

    return-void
.end method
