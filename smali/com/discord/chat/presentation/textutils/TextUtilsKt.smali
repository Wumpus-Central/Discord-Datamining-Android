.class public final Lcom/discord/chat/presentation/textutils/TextUtilsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/chat/presentation/textutils/TextUtilsKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u000b\n\u0002\u0010\u0006\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u00ea\u0002\u0010\'\u001a\u00020&*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\t2\u0014\u0008\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0014\u0008\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2$\u0008\u0002\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u000f0\u00122,\u0008\u0002\u0010\u0015\u001a&\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u000f0\u00142\u001a\u0008\u0002\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f0\u00162\u0014\u0008\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000f0\r2\u0014\u0008\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000f0\r2\u0014\u0008\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f0\r2\u0014\u0008\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000f0\r2\u0014\u0008\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u001e0\r2\u000e\u0008\u0002\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u000f0 2\u0008\u0008\u0002\u0010\"\u001a\u00020\t2\u0008\u0008\u0002\u0010$\u001a\u00020#2\u0008\u0008\u0002\u0010%\u001a\u00020\u0002\u001a\"\u0010-\u001a\u00020\u000f*\u0008\u0012\u0004\u0012\u00020)0(2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020&H\u0002\u001a$\u0010\'\u001a\u00020&*\u0008\u0012\u0004\u0012\u00020)0(2\u0006\u0010+\u001a\u00020*2\u0008\u0008\u0002\u0010.\u001a\u00020&H\u0002\u001a]\u00106\u001a\u00020\u000f*\u00020&2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010+\u001a\u00020*2\u0006\u0010/\u001a\u00020\u00072\u0008\u0008\u0001\u00101\u001a\u0002002\u0008\u0008\u0001\u00102\u001a\u0002002\n\u0008\u0002\u00103\u001a\u0004\u0018\u0001002\u0008\u0008\u0002\u00104\u001a\u00020\u00022\u0008\u0008\u0002\u00105\u001a\u00020\u0002\u00a2\u0006\u0004\u00086\u00107\u001a*\u0010:\u001a\u00020\u000f*\u00020&2\u000c\u00108\u001a\u0008\u0012\u0004\u0012\u00020)0(2\u0006\u0010+\u001a\u00020*2\u0006\u00109\u001a\u00020\tH\u0002\u001a\u0012\u0010=\u001a\u00020<2\u0008\u0010;\u001a\u0004\u0018\u00010\u0007H\u0002\u001a\u001a\u0010>\u001a\u0002002\u0008\u0010;\u001a\u0004\u0018\u00010\u00072\u0006\u0010%\u001a\u00020\u0002H\u0002\u001a\u0010\u0010?\u001a\u00020\u00022\u0006\u0010;\u001a\u00020\u0007H\u0002\u001a\u0018\u0010B\u001a\u00020A2\u0006\u0010+\u001a\u00020*2\u0006\u0010@\u001a\u000200H\u0002\"\u0014\u0010C\u001a\u00020\u00078\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008C\u0010D\"\u0014\u0010E\u001a\u00020\u00078\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008E\u0010D\u00a8\u0006F"
    }
    d2 = {
        "Landroid/graphics/Paint$FontMetrics;",
        "fontMetrics",
        "",
        "getBaselineHeight",
        "Lcom/discord/chat/bridge/structurabletext/StructurableText;",
        "Landroid/content/Context;",
        "context",
        "",
        "containerId",
        "",
        "animateEmoji",
        "shouldShowRoleDot",
        "shouldShowRoleOnName",
        "Lkotlin/Function1;",
        "Lcom/discord/chat/bridge/contentnode/LinkContentNode;",
        "",
        "onLinkClicked",
        "onLongTapLink",
        "Lkotlin/Function3;",
        "onTapChannel",
        "Lkotlin/Function4;",
        "onLongPressChannel",
        "Lkotlin/Function2;",
        "onTapMention",
        "Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;",
        "onTapCommand",
        "onLongPressCommand",
        "onTapTimestamp",
        "Lcom/discord/chat/bridge/contentnode/EmojiContentNode;",
        "onTapEmoji",
        "Lcom/discord/chat/presentation/textutils/LinkStyle;",
        "linkStyle",
        "Lkotlin/Function0;",
        "onTapSpoiler",
        "singleLine",
        "Lcom/discord/theme/DiscordTheme;",
        "theme",
        "baselineHeight",
        "Lcom/facebook/drawee/span/DraweeSpanStringBuilder;",
        "toSpannable",
        "",
        "Lcom/discord/chat/bridge/contentnode/ContentNode;",
        "Lcom/discord/chat/presentation/textutils/RenderContext;",
        "rc",
        "existingBuilder",
        "appendToExistingBuilder",
        "builder",
        "imageUrl",
        "",
        "width",
        "height",
        "foregroundColor",
        "cornerRadius",
        "iconPadding",
        "appendImage",
        "(Lcom/facebook/drawee/span/DraweeSpanStringBuilder;Landroid/content/Context;Lcom/discord/chat/presentation/textutils/RenderContext;Ljava/lang/String;IILjava/lang/Integer;FF)V",
        "content",
        "isOrderedList",
        "appendBulletPoint",
        "iconType",
        "",
        "getIconSizeMultiplier",
        "getIconSize",
        "getIconPaddingMultiplier",
        "backgroundColor",
        "Lcom/discord/span/utilities/spannable/BackgroundSpan;",
        "makeMentionBackgroundSpan",
        "CHANNEL_PREFIX",
        "Ljava/lang/String;",
        "COMMAND_PREFIX",
        "chat_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field private static final CHANNEL_PREFIX:Ljava/lang/String; = "#"

.field private static final COMMAND_PREFIX:Ljava/lang/String; = "/"


# direct methods
.method private static final appendBulletPoint(Lcom/facebook/drawee/span/DraweeSpanStringBuilder;Ljava/util/List;Lcom/discord/chat/presentation/textutils/RenderContext;Z)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/drawee/span/DraweeSpanStringBuilder;",
            "Ljava/util/List<",
            "+",
            "Lcom/discord/chat/bridge/contentnode/ContentNode;",
            ">;",
            "Lcom/discord/chat/presentation/textutils/RenderContext;",
            "Z)V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    invoke-virtual/range {p2 .. p2}, Lcom/discord/chat/presentation/textutils/RenderContext;->getListNestedLevel()I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    new-instance v4, Landroid/text/style/LeadingMarginSpan$Standard;

    .line 12
    .line 13
    mul-int/lit8 v5, v3, 0x10

    .line 14
    .line 15
    invoke-static {v5}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    invoke-direct {v4, v5}, Landroid/text/style/LeadingMarginSpan$Standard;-><init>(I)V

    .line 20
    .line 21
    .line 22
    const/4 v5, 0x2

    .line 23
    invoke-static {v5}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    new-instance v7, Lcom/discord/span/utilities/spannable/VerticalPaddingSpan;

    .line 28
    .line 29
    invoke-direct {v7, v6}, Lcom/discord/span/utilities/spannable/VerticalPaddingSpan;-><init>(I)V

    .line 30
    .line 31
    .line 32
    const/16 v8, 0x21

    .line 33
    .line 34
    const/4 v9, 0x0

    .line 35
    const/4 v10, 0x1

    .line 36
    if-eqz p3, :cond_2

    .line 37
    .line 38
    new-array v3, v5, [Ljava/lang/Object;

    .line 39
    .line 40
    aput-object v7, v3, v9

    .line 41
    .line 42
    aput-object v4, v3, v10

    .line 43
    .line 44
    invoke-virtual/range {p0 .. p0}, Landroid/text/SpannableStringBuilder;->length()I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    invoke-virtual/range {p2 .. p2}, Lcom/discord/chat/presentation/textutils/RenderContext;->getListOrderedStart()Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    if-eqz v7, :cond_0

    .line 53
    .line 54
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 55
    .line 56
    .line 57
    move-result v10

    .line 58
    :cond_0
    new-instance v7, Lcom/discord/chat/bridge/contentnode/TextContentNode;

    .line 59
    .line 60
    new-instance v11, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v10, ". "

    .line 69
    .line 70
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v10

    .line 77
    invoke-direct {v7, v10}, Lcom/discord/chat/bridge/contentnode/TextContentNode;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-static {v7}, Lkotlin/collections/h;->d(Ljava/lang/Object;)Ljava/util/List;

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    invoke-static {v7, v2, v0}, Lcom/discord/chat/presentation/textutils/TextUtilsKt;->appendToExistingBuilder(Ljava/util/List;Lcom/discord/chat/presentation/textutils/RenderContext;Lcom/facebook/drawee/span/DraweeSpanStringBuilder;)V

    .line 85
    .line 86
    .line 87
    invoke-static {v1, v2, v0}, Lcom/discord/chat/presentation/textutils/TextUtilsKt;->appendToExistingBuilder(Ljava/util/List;Lcom/discord/chat/presentation/textutils/RenderContext;Lcom/facebook/drawee/span/DraweeSpanStringBuilder;)V

    .line 88
    .line 89
    .line 90
    new-instance v1, Landroid/text/style/AbsoluteSizeSpan;

    .line 91
    .line 92
    invoke-direct {v1, v6}, Landroid/text/style/AbsoluteSizeSpan;-><init>(I)V

    .line 93
    .line 94
    .line 95
    invoke-static {v0, v1}, Lcom/discord/span/utilities/SpannableStringBuilderExtensionsKt;->ensureNewline(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    :goto_0
    if-ge v9, v5, :cond_8

    .line 99
    .line 100
    aget-object v1, v3, v9

    .line 101
    .line 102
    if-eqz v1, :cond_1

    .line 103
    .line 104
    invoke-virtual/range {p0 .. p0}, Landroid/text/SpannableStringBuilder;->length()I

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    invoke-virtual {v0, v1, v4, v2, v8}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 109
    .line 110
    .line 111
    :cond_1
    add-int/lit8 v9, v9, 0x1

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_2
    invoke-virtual/range {p2 .. p2}, Lcom/discord/chat/presentation/textutils/RenderContext;->getSingleLine()Z

    .line 115
    .line 116
    .line 117
    move-result v11

    .line 118
    if-eqz v11, :cond_5

    .line 119
    .line 120
    new-array v3, v5, [Ljava/lang/Object;

    .line 121
    .line 122
    aput-object v4, v3, v9

    .line 123
    .line 124
    aput-object v7, v3, v10

    .line 125
    .line 126
    invoke-virtual/range {p0 .. p0}, Landroid/text/SpannableStringBuilder;->length()I

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    new-instance v7, Lcom/discord/chat/bridge/contentnode/TextContentNode;

    .line 131
    .line 132
    invoke-virtual/range {p2 .. p2}, Lcom/discord/chat/presentation/textutils/RenderContext;->getListNestedLevel()I

    .line 133
    .line 134
    .line 135
    move-result v10

    .line 136
    if-nez v10, :cond_3

    .line 137
    .line 138
    const-string v10, "\u2022 "

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_3
    const-string v10, "\u25e6 "

    .line 142
    .line 143
    :goto_1
    invoke-direct {v7, v10}, Lcom/discord/chat/bridge/contentnode/TextContentNode;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    invoke-static {v7}, Lkotlin/collections/h;->d(Ljava/lang/Object;)Ljava/util/List;

    .line 147
    .line 148
    .line 149
    move-result-object v7

    .line 150
    invoke-static {v7, v2, v0}, Lcom/discord/chat/presentation/textutils/TextUtilsKt;->appendToExistingBuilder(Ljava/util/List;Lcom/discord/chat/presentation/textutils/RenderContext;Lcom/facebook/drawee/span/DraweeSpanStringBuilder;)V

    .line 151
    .line 152
    .line 153
    invoke-static {v1, v2, v0}, Lcom/discord/chat/presentation/textutils/TextUtilsKt;->appendToExistingBuilder(Ljava/util/List;Lcom/discord/chat/presentation/textutils/RenderContext;Lcom/facebook/drawee/span/DraweeSpanStringBuilder;)V

    .line 154
    .line 155
    .line 156
    new-instance v1, Landroid/text/style/AbsoluteSizeSpan;

    .line 157
    .line 158
    invoke-direct {v1, v6}, Landroid/text/style/AbsoluteSizeSpan;-><init>(I)V

    .line 159
    .line 160
    .line 161
    invoke-static {v0, v1}, Lcom/discord/span/utilities/SpannableStringBuilderExtensionsKt;->ensureNewline(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    :goto_2
    if-ge v9, v5, :cond_8

    .line 165
    .line 166
    aget-object v1, v3, v9

    .line 167
    .line 168
    if-eqz v1, :cond_4

    .line 169
    .line 170
    invoke-virtual/range {p0 .. p0}, Landroid/text/SpannableStringBuilder;->length()I

    .line 171
    .line 172
    .line 173
    move-result v2

    .line 174
    invoke-virtual {v0, v1, v4, v2, v8}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 175
    .line 176
    .line 177
    :cond_4
    add-int/lit8 v9, v9, 0x1

    .line 178
    .line 179
    goto :goto_2

    .line 180
    :cond_5
    const/16 v11, 0x10

    .line 181
    .line 182
    invoke-static {v11}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    .line 183
    .line 184
    .line 185
    move-result v14

    .line 186
    invoke-static {v5}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    .line 187
    .line 188
    .line 189
    move-result v16

    .line 190
    invoke-virtual/range {p2 .. p2}, Lcom/discord/chat/presentation/textutils/RenderContext;->getContext()Landroid/content/Context;

    .line 191
    .line 192
    .line 193
    move-result-object v11

    .line 194
    sget v12, Lcom/discord/chat/R$color;->primary_360:I

    .line 195
    .line 196
    sget v13, Lcom/discord/chat/R$color;->primary_400:I

    .line 197
    .line 198
    invoke-virtual/range {p2 .. p2}, Lcom/discord/chat/presentation/textutils/RenderContext;->getTheme()Lcom/discord/theme/DiscordTheme;

    .line 199
    .line 200
    .line 201
    move-result-object v15

    .line 202
    invoke-static {v11, v12, v13, v15}, Lcom/discord/theme/utils/ColorUtilsKt;->getThemeColor(Landroid/content/Context;IILcom/discord/theme/DiscordTheme;)I

    .line 203
    .line 204
    .line 205
    move-result v13

    .line 206
    if-lez v3, :cond_6

    .line 207
    .line 208
    sget-object v3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 209
    .line 210
    goto :goto_3

    .line 211
    :cond_6
    sget-object v3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 212
    .line 213
    :goto_3
    move-object/from16 v18, v3

    .line 214
    .line 215
    new-instance v3, Lcom/discord/span/utilities/spannable/BulletSpan;

    .line 216
    .line 217
    const/4 v15, 0x0

    .line 218
    const/16 v17, 0x0

    .line 219
    .line 220
    const/16 v19, 0x14

    .line 221
    .line 222
    const/16 v20, 0x0

    .line 223
    .line 224
    move-object v12, v3

    .line 225
    invoke-direct/range {v12 .. v20}, Lcom/discord/span/utilities/spannable/BulletSpan;-><init>(IIZIFLandroid/graphics/Paint$Style;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 226
    .line 227
    .line 228
    const/4 v11, 0x3

    .line 229
    new-array v12, v11, [Ljava/lang/Object;

    .line 230
    .line 231
    aput-object v4, v12, v9

    .line 232
    .line 233
    aput-object v3, v12, v10

    .line 234
    .line 235
    aput-object v7, v12, v5

    .line 236
    .line 237
    invoke-virtual/range {p0 .. p0}, Landroid/text/SpannableStringBuilder;->length()I

    .line 238
    .line 239
    .line 240
    move-result v3

    .line 241
    invoke-static {v1, v2, v0}, Lcom/discord/chat/presentation/textutils/TextUtilsKt;->appendToExistingBuilder(Ljava/util/List;Lcom/discord/chat/presentation/textutils/RenderContext;Lcom/facebook/drawee/span/DraweeSpanStringBuilder;)V

    .line 242
    .line 243
    .line 244
    new-instance v1, Landroid/text/style/AbsoluteSizeSpan;

    .line 245
    .line 246
    invoke-direct {v1, v6}, Landroid/text/style/AbsoluteSizeSpan;-><init>(I)V

    .line 247
    .line 248
    .line 249
    invoke-static {v0, v1}, Lcom/discord/span/utilities/SpannableStringBuilderExtensionsKt;->ensureNewline(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;)V

    .line 250
    .line 251
    .line 252
    :goto_4
    if-ge v9, v11, :cond_8

    .line 253
    .line 254
    aget-object v1, v12, v9

    .line 255
    .line 256
    if-eqz v1, :cond_7

    .line 257
    .line 258
    invoke-virtual/range {p0 .. p0}, Landroid/text/SpannableStringBuilder;->length()I

    .line 259
    .line 260
    .line 261
    move-result v2

    .line 262
    invoke-virtual {v0, v1, v3, v2, v8}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 263
    .line 264
    .line 265
    :cond_7
    add-int/lit8 v9, v9, 0x1

    .line 266
    .line 267
    goto :goto_4

    .line 268
    :cond_8
    return-void
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

.method public static final appendImage(Lcom/facebook/drawee/span/DraweeSpanStringBuilder;Landroid/content/Context;Lcom/discord/chat/presentation/textutils/RenderContext;Ljava/lang/String;IILjava/lang/Integer;FF)V
    .locals 9

    .line 1
    move-object v0, p0

    .line 2
    move-object v1, p1

    .line 3
    move-object v2, p3

    .line 4
    const-string v3, "<this>"

    .line 5
    .line 6
    invoke-static {p0, v3}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    const-string v3, "context"

    .line 10
    .line 11
    invoke-static {p1, v3}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v3, "rc"

    .line 15
    .line 16
    move-object v4, p2

    .line 17
    invoke-static {p2, v3}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-string v3, "imageUrl"

    .line 21
    .line 22
    invoke-static {p3, v3}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/text/SpannableStringBuilder;->length()I

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    const/16 v3, 0x200b

    .line 30
    .line 31
    invoke-virtual {p0, v3}, Landroid/text/SpannableStringBuilder;->append(C)Landroid/text/SpannableStringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-static {p1, p3}, Lcom/discord/react_asset_fetcher/ReactAssetUtilsKt;->getReactImageUrl(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-static {v2}, Lcom/facebook/imagepipeline/request/ImageRequestBuilder;->s(Landroid/net/Uri;)Lcom/facebook/imagepipeline/request/ImageRequestBuilder;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-static {}, Lk4/c;->g()Lcom/facebook/drawee/backends/pipeline/PipelineDraweeControllerBuilder;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-virtual {v2}, Lcom/facebook/imagepipeline/request/ImageRequestBuilder;->a()Lcom/facebook/imagepipeline/request/ImageRequest;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual {v3, v2}, Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;->D(Ljava/lang/Object;)Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    check-cast v2, Lcom/facebook/drawee/backends/pipeline/PipelineDraweeControllerBuilder;

    .line 59
    .line 60
    invoke-virtual {v2}, Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;->c()Lcom/facebook/drawee/controller/a;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    const-string v2, "newDraweeControllerBuild\u2026build())\n        .build()"

    .line 65
    .line 66
    invoke-static {v3, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-static {v2}, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->u(Landroid/content/res/Resources;)Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    sget-object v6, Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;->e:Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;

    .line 78
    .line 79
    invoke-virtual {v2, v6}, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->w(Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;)Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-static/range {p7 .. p7}, Lcom/facebook/drawee/generic/a;->a(F)Lcom/facebook/drawee/generic/a;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    move/from16 v7, p8

    .line 88
    .line 89
    invoke-virtual {v6, v7}, Lcom/facebook/drawee/generic/a;->r(F)Lcom/facebook/drawee/generic/a;

    .line 90
    .line 91
    .line 92
    sget-object v7, Lcom/facebook/drawee/generic/a$a;->l:Lcom/facebook/drawee/generic/a$a;

    .line 93
    .line 94
    invoke-virtual {v6, v7}, Lcom/facebook/drawee/generic/a;->u(Lcom/facebook/drawee/generic/a$a;)Lcom/facebook/drawee/generic/a;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2, v6}, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->K(Lcom/facebook/drawee/generic/a;)Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {p2}, Lcom/discord/chat/presentation/textutils/RenderContext;->spoilerIsHidden()Z

    .line 101
    .line 102
    .line 103
    move-result v6

    .line 104
    if-eqz v6, :cond_0

    .line 105
    .line 106
    new-instance v6, Landroid/graphics/PorterDuffColorFilter;

    .line 107
    .line 108
    invoke-virtual {p2}, Lcom/discord/chat/presentation/textutils/RenderContext;->getTheme()Lcom/discord/theme/DiscordTheme;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    invoke-virtual {v4}, Lcom/discord/theme/DiscordTheme;->getSpoilerHiddenBackground()I

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    sget-object v7, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 117
    .line 118
    invoke-direct {v6, v4, v7}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v2, v6}, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->v(Landroid/graphics/ColorFilter;)Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;

    .line 122
    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_0
    if-eqz p6, :cond_1

    .line 126
    .line 127
    new-instance v4, Landroid/graphics/PorterDuffColorFilter;

    .line 128
    .line 129
    invoke-virtual {p6}, Ljava/lang/Integer;->intValue()I

    .line 130
    .line 131
    .line 132
    move-result v6

    .line 133
    sget-object v7, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 134
    .line 135
    invoke-direct {v4, v6, v7}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2, v4}, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->v(Landroid/graphics/ColorFilter;)Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;

    .line 139
    .line 140
    .line 141
    :cond_1
    :goto_0
    const-string v4, "newInstance(context.reso\u2026)\n            }\n        }"

    .line 142
    .line 143
    invoke-static {v2, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v2}, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->a()Lcom/facebook/drawee/generic/GenericDraweeHierarchy;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    const/4 v7, 0x0

    .line 151
    const/4 v8, 0x2

    .line 152
    move-object v0, p0

    .line 153
    move-object v1, p1

    .line 154
    move v4, v5

    .line 155
    move v5, p4

    .line 156
    move v6, p5

    .line 157
    invoke-virtual/range {v0 .. v8}, Lcom/facebook/drawee/span/DraweeSpanStringBuilder;->j(Landroid/content/Context;Lcom/facebook/drawee/interfaces/DraweeHierarchy;Lcom/facebook/drawee/interfaces/DraweeController;IIIZI)V

    .line 158
    .line 159
    .line 160
    return-void
.end method

.method public static synthetic appendImage$default(Lcom/facebook/drawee/span/DraweeSpanStringBuilder;Landroid/content/Context;Lcom/discord/chat/presentation/textutils/RenderContext;Ljava/lang/String;IILjava/lang/Integer;FFILjava/lang/Object;)V
    .locals 11

    move/from16 v0, p9

    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    move-object v8, v1

    goto :goto_0

    :cond_0
    move-object/from16 v8, p6

    :goto_0
    and-int/lit8 v1, v0, 0x40

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move v9, v2

    goto :goto_1

    :cond_1
    move/from16 v9, p7

    :goto_1
    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_2

    move v10, v2

    goto :goto_2

    :cond_2
    move/from16 v10, p8

    :goto_2
    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move v6, p4

    move/from16 v7, p5

    invoke-static/range {v2 .. v10}, Lcom/discord/chat/presentation/textutils/TextUtilsKt;->appendImage(Lcom/facebook/drawee/span/DraweeSpanStringBuilder;Landroid/content/Context;Lcom/discord/chat/presentation/textutils/RenderContext;Ljava/lang/String;IILjava/lang/Integer;FF)V

    return-void
.end method

.method private static final appendToExistingBuilder(Ljava/util/List;Lcom/discord/chat/presentation/textutils/RenderContext;Lcom/facebook/drawee/span/DraweeSpanStringBuilder;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/discord/chat/bridge/contentnode/ContentNode;",
            ">;",
            "Lcom/discord/chat/presentation/textutils/RenderContext;",
            "Lcom/facebook/drawee/span/DraweeSpanStringBuilder;",
            ")V"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lcom/discord/chat/presentation/textutils/TextUtilsKt;->toSpannable(Ljava/util/List;Lcom/discord/chat/presentation/textutils/RenderContext;Lcom/facebook/drawee/span/DraweeSpanStringBuilder;)Lcom/facebook/drawee/span/DraweeSpanStringBuilder;

    return-void
.end method

.method public static final getBaselineHeight(Landroid/graphics/Paint$FontMetrics;)F
    .locals 1

    .line 1
    const-string v0, "fontMetrics"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget v0, p0, Landroid/graphics/Paint$FontMetrics;->descent:F

    .line 7
    .line 8
    iget p0, p0, Landroid/graphics/Paint$FontMetrics;->ascent:F

    .line 9
    .line 10
    sub-float/2addr v0, p0

    .line 11
    return v0
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

.method private static final getIconPaddingMultiplier(Ljava/lang/String;)F
    .locals 1

    .line 1
    const-string v0, "post"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const-string v0, "forum"

    .line 12
    .line 13
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    :goto_0
    if-eqz p0, :cond_1

    .line 18
    .line 19
    const p0, 0x3e4ccccd    # 0.2f

    .line 20
    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    const/4 p0, 0x0

    .line 24
    :goto_1
    return p0
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

.method private static final getIconSize(Ljava/lang/String;F)I
    .locals 2

    .line 1
    const/16 v0, 0x14

    .line 2
    .line 3
    invoke-static {v0}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    cmpl-float v1, p1, v1

    .line 9
    .line 10
    if-ltz v1, :cond_0

    .line 11
    .line 12
    float-to-double v0, p1

    .line 13
    invoke-static {p0}, Lcom/discord/chat/presentation/textutils/TextUtilsKt;->getIconSizeMultiplier(Ljava/lang/String;)D

    .line 14
    .line 15
    .line 16
    move-result-wide p0

    .line 17
    mul-double/2addr v0, p0

    .line 18
    double-to-int v0, v0

    .line 19
    :cond_0
    return v0
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
.end method

.method private static final getIconSizeMultiplier(Ljava/lang/String;)D
    .locals 2

    if-eqz p0, :cond_3

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "forum"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :sswitch_1
    const-string v0, "post"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const-wide v0, 0x3fe4cccccccccccdL    # 0.65

    goto :goto_1

    :sswitch_2
    const-string v0, "_guild"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    const-wide v0, 0x3feb333333333333L    # 0.85

    goto :goto_1

    :sswitch_3
    const-string v0, "_caret"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto :goto_0

    :cond_2
    const-wide v0, 0x3fe199999999999aL    # 0.55

    goto :goto_1

    :cond_3
    :goto_0
    const-wide/high16 v0, 0x3fe8000000000000L    # 0.75

    :goto_1
    return-wide v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x5842b57c -> :sswitch_3
        -0x5801610c -> :sswitch_2
        0x3498a0 -> :sswitch_1
        0x5d18d21 -> :sswitch_0
    .end sparse-switch
.end method

.method private static final makeMentionBackgroundSpan(Lcom/discord/chat/presentation/textutils/RenderContext;I)Lcom/discord/span/utilities/spannable/BackgroundSpan;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/discord/chat/presentation/textutils/RenderContext;->spoilerExists()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/discord/chat/presentation/textutils/RenderContext;->getTheme()Lcom/discord/theme/DiscordTheme;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Lcom/discord/theme/DiscordTheme;->getSpoilerHiddenBackground()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    :cond_0
    invoke-virtual {p0}, Lcom/discord/chat/presentation/textutils/RenderContext;->spoilerExists()Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_1

    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/4 p0, 0x3

    .line 24
    :goto_0
    new-instance v0, Lcom/discord/span/utilities/spannable/BackgroundSpan;

    .line 25
    .line 26
    new-instance v1, Lcom/discord/span/utilities/common/BackgroundStyle;

    .line 27
    .line 28
    invoke-direct {v1, p1, p0}, Lcom/discord/span/utilities/common/BackgroundStyle;-><init>(II)V

    .line 29
    .line 30
    .line 31
    invoke-direct {v0, v1}, Lcom/discord/span/utilities/spannable/BackgroundSpan;-><init>(Lcom/discord/span/utilities/common/BackgroundStyle;)V

    .line 32
    .line 33
    .line 34
    return-object v0
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

.method public static final toSpannable(Lcom/discord/chat/bridge/structurabletext/StructurableText;Landroid/content/Context;Ljava/lang/String;ZZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLcom/discord/theme/DiscordTheme;F)Lcom/facebook/drawee/span/DraweeSpanStringBuilder;
    .locals 28
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/chat/bridge/structurabletext/StructurableText;",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "ZZZ",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/discord/chat/bridge/contentnode/LinkContentNode;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/discord/chat/bridge/contentnode/LinkContentNode;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Ljava/lang/String;",
            "-",
            "Ljava/lang/String;",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function4<",
            "-",
            "Ljava/lang/String;",
            "-",
            "Ljava/lang/String;",
            "-",
            "Ljava/lang/String;",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/String;",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/discord/chat/bridge/contentnode/EmojiContentNode;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/discord/chat/bridge/contentnode/LinkContentNode;",
            "Lcom/discord/chat/presentation/textutils/LinkStyle;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;Z",
            "Lcom/discord/theme/DiscordTheme;",
            "F)",
            "Lcom/facebook/drawee/span/DraweeSpanStringBuilder;"
        }
    .end annotation

    move-object/from16 v0, p0

    const-string v1, "<this>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "context"

    move-object/from16 v3, p1

    invoke-static {v3, v1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "containerId"

    move-object/from16 v4, p2

    invoke-static {v4, v1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onLinkClicked"

    move-object/from16 v5, p6

    invoke-static {v5, v1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onLongTapLink"

    move-object/from16 v6, p7

    invoke-static {v6, v1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onTapChannel"

    move-object/from16 v8, p8

    invoke-static {v8, v1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onLongPressChannel"

    move-object/from16 v9, p9

    invoke-static {v9, v1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onTapMention"

    move-object/from16 v10, p10

    invoke-static {v10, v1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onTapCommand"

    move-object/from16 v11, p11

    invoke-static {v11, v1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onLongPressCommand"

    move-object/from16 v12, p12

    invoke-static {v12, v1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onTapTimestamp"

    move-object/from16 v14, p13

    invoke-static {v14, v1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onTapEmoji"

    move-object/from16 v15, p14

    invoke-static {v15, v1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "linkStyle"

    move-object/from16 v7, p15

    invoke-static {v7, v1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onTapSpoiler"

    move-object/from16 v13, p16

    invoke-static {v13, v1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "theme"

    move-object/from16 v2, p18

    invoke-static {v2, v1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    instance-of v1, v0, Lcom/discord/chat/bridge/structurabletext/AnnotatedStructurableText;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/discord/chat/bridge/structurabletext/AnnotatedStructurableText;

    invoke-virtual {v0}, Lcom/discord/chat/bridge/structurabletext/AnnotatedStructurableText;->getContent()Ljava/util/List;

    move-result-object v0

    .line 2
    new-instance v1, Lcom/discord/chat/presentation/textutils/RenderContext;

    move-object v2, v1

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/high16 v26, 0x1e0000

    const/16 v27, 0x0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p15

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p16

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move/from16 v16, p3

    move/from16 v17, p4

    move/from16 v18, p5

    move/from16 v19, p17

    move-object/from16 v24, p18

    move/from16 v25, p19

    invoke-direct/range {v2 .. v27}, Lcom/discord/chat/presentation/textutils/RenderContext;-><init>(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZZZLcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;ILjava/lang/Integer;Lcom/discord/chat/presentation/textutils/RenderContext$Insets;Lcom/discord/theme/DiscordTheme;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v2, 0x2

    const/4 v3, 0x0

    .line 3
    invoke-static {v0, v1, v3, v2, v3}, Lcom/discord/chat/presentation/textutils/TextUtilsKt;->toSpannable$default(Ljava/util/List;Lcom/discord/chat/presentation/textutils/RenderContext;Lcom/facebook/drawee/span/DraweeSpanStringBuilder;ILjava/lang/Object;)Lcom/facebook/drawee/span/DraweeSpanStringBuilder;

    move-result-object v0

    goto :goto_0

    .line 4
    :cond_0
    instance-of v1, v0, Lcom/discord/chat/bridge/structurabletext/PrimitiveStructurableText;

    if-eqz v1, :cond_1

    new-instance v1, Lcom/facebook/drawee/span/DraweeSpanStringBuilder;

    check-cast v0, Lcom/discord/chat/bridge/structurabletext/PrimitiveStructurableText;

    invoke-virtual {v0}, Lcom/discord/chat/bridge/structurabletext/PrimitiveStructurableText;->getContent()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/facebook/drawee/span/DraweeSpanStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    move-object v0, v1

    :goto_0
    return-object v0

    :cond_1
    new-instance v0, Llf/q;

    invoke-direct {v0}, Llf/q;-><init>()V

    throw v0
.end method

.method private static final toSpannable(Ljava/util/List;Lcom/discord/chat/presentation/textutils/RenderContext;Lcom/facebook/drawee/span/DraweeSpanStringBuilder;)Lcom/facebook/drawee/span/DraweeSpanStringBuilder;
    .locals 70
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/discord/chat/bridge/contentnode/ContentNode;",
            ">;",
            "Lcom/discord/chat/presentation/textutils/RenderContext;",
            "Lcom/facebook/drawee/span/DraweeSpanStringBuilder;",
            ")",
            "Lcom/facebook/drawee/span/DraweeSpanStringBuilder;"
        }
    .end annotation

    move-object/from16 v15, p1

    move-object/from16 v14, p2

    .line 5
    invoke-interface/range {p0 .. p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v26

    const/16 v27, 0x0

    move/from16 v0, v27

    :goto_0
    invoke-interface/range {v26 .. v26}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_50

    invoke-interface/range {v26 .. v26}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    add-int/lit8 v28, v0, 0x1

    if-gez v0, :cond_0

    invoke-static {}, Lkotlin/collections/h;->s()V

    :cond_0
    move-object v13, v1

    check-cast v13, Lcom/discord/chat/bridge/contentnode/ContentNode;

    .line 6
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/presentation/textutils/RenderContext;->getContext()Landroid/content/Context;

    move-result-object v2

    .line 7
    new-instance v1, Landroid/text/style/BackgroundColorSpan;

    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/presentation/textutils/RenderContext;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v3

    invoke-virtual {v3}, Lcom/discord/theme/DiscordTheme;->getBackgroundSecondary()I

    move-result v3

    invoke-direct {v1, v3}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    .line 8
    new-instance v3, Landroid/text/style/RelativeSizeSpan;

    const v4, 0x3f59999a    # 0.85f

    invoke-direct {v3, v4}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    .line 9
    new-instance v4, Lcom/discord/chat/presentation/textutils/DiscordFontSpan;

    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/presentation/textutils/RenderContext;->getContext()Landroid/content/Context;

    move-result-object v5

    sget-object v6, Lcom/discord/fonts/DiscordFont;->SourceCodePro:Lcom/discord/fonts/DiscordFont;

    invoke-direct {v4, v5, v6}, Lcom/discord/chat/presentation/textutils/DiscordFontSpan;-><init>(Landroid/content/Context;Lcom/discord/fonts/DiscordFont;)V

    .line 10
    sget v5, Lcom/discord/chat/R$color;->chat_mentions_background_light:I

    .line 11
    sget v6, Lcom/discord/chat/R$color;->chat_mentions_background_dark:I

    .line 12
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/presentation/textutils/RenderContext;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v7

    .line 13
    invoke-static {v2, v5, v6, v7}, Lcom/discord/theme/utils/ColorUtilsKt;->getThemeColor(Landroid/content/Context;IILcom/discord/theme/DiscordTheme;)I

    move-result v5

    .line 14
    sget v6, Lcom/discord/chat/R$color;->chat_mentions_foreground_light:I

    .line 15
    sget v7, Lcom/discord/chat/R$color;->chat_mentions_foreground_dark:I

    .line 16
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/presentation/textutils/RenderContext;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v8

    .line 17
    invoke-static {v2, v6, v7, v8}, Lcom/discord/theme/utils/ColorUtilsKt;->getThemeColor(Landroid/content/Context;IILcom/discord/theme/DiscordTheme;)I

    move-result v6

    .line 18
    sget v7, Lcom/discord/chat/R$color;->green_330:I

    .line 19
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/presentation/textutils/RenderContext;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v8

    .line 20
    invoke-static {v2, v7, v7, v8}, Lcom/discord/theme/utils/ColorUtilsKt;->getThemeColor(Landroid/content/Context;IILcom/discord/theme/DiscordTheme;)I

    move-result v8

    const/16 v9, 0x19

    .line 21
    invoke-static {v8, v9}, Landroidx/core/graphics/a;->k(II)I

    move-result v8

    .line 22
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/presentation/textutils/RenderContext;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v10

    .line 23
    invoke-static {v2, v7, v7, v10}, Lcom/discord/theme/utils/ColorUtilsKt;->getThemeColor(Landroid/content/Context;IILcom/discord/theme/DiscordTheme;)I

    move-result v7

    .line 24
    instance-of v10, v13, Lcom/discord/chat/bridge/contentnode/BlockQuoteContentNode;

    const/16 v11, 0x8

    const/4 v12, 0x3

    move/from16 p0, v8

    const/4 v8, 0x1

    if-eqz v10, :cond_3

    .line 25
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/presentation/textutils/RenderContext;->getSingleLine()Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "> "

    .line 26
    invoke-virtual {v14, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 27
    check-cast v13, Lcom/discord/chat/bridge/contentnode/BlockQuoteContentNode;

    invoke-virtual {v13}, Lcom/discord/chat/bridge/contentnode/BlockQuoteContentNode;->getContent()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, v15, v14}, Lcom/discord/chat/presentation/textutils/TextUtilsKt;->appendToExistingBuilder(Ljava/util/List;Lcom/discord/chat/presentation/textutils/RenderContext;Lcom/facebook/drawee/span/DraweeSpanStringBuilder;)V

    :cond_1
    :goto_1
    move-object v11, v14

    move-object v12, v15

    goto/16 :goto_2a

    .line 28
    :cond_2
    invoke-static {v12}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    move-result v0

    .line 29
    invoke-static {v11}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    move-result v1

    .line 30
    new-instance v2, Lcom/discord/span/utilities/spannable/QuoteSpan;

    .line 31
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/presentation/textutils/RenderContext;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v3

    invoke-virtual {v3}, Lcom/discord/theme/DiscordTheme;->getInteractiveMuted()I

    move-result v3

    .line 32
    invoke-direct {v2, v3, v0, v1}, Lcom/discord/span/utilities/spannable/QuoteSpan;-><init>(III)V

    new-array v0, v8, [Ljava/lang/Object;

    aput-object v2, v0, v27

    .line 33
    invoke-virtual/range {p2 .. p2}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v1

    .line 34
    check-cast v13, Lcom/discord/chat/bridge/contentnode/BlockQuoteContentNode;

    invoke-virtual {v13}, Lcom/discord/chat/bridge/contentnode/BlockQuoteContentNode;->getContent()Ljava/util/List;

    move-result-object v3

    .line 35
    new-instance v4, Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$12$1$1;

    invoke-direct {v4, v2}, Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$12$1$1;-><init>(Lcom/discord/span/utilities/spannable/QuoteSpan;)V

    invoke-virtual {v15, v4}, Lcom/discord/chat/presentation/textutils/RenderContext;->updateInsets(Lkotlin/jvm/functions/Function1;)Lcom/discord/chat/presentation/textutils/RenderContext;

    move-result-object v2

    .line 36
    invoke-static {v3, v2, v14}, Lcom/discord/chat/presentation/textutils/TextUtilsKt;->appendToExistingBuilder(Ljava/util/List;Lcom/discord/chat/presentation/textutils/RenderContext;Lcom/facebook/drawee/span/DraweeSpanStringBuilder;)V

    aget-object v0, v0, v27

    if-eqz v0, :cond_1

    .line 37
    invoke-virtual/range {p2 .. p2}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v2

    const v3, 0xc80021

    invoke-virtual {v14, v0, v1, v2, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    goto :goto_1

    .line 38
    :cond_3
    instance-of v10, v13, Lcom/discord/chat/bridge/contentnode/CodeBlockContentNode;

    const/16 v11, 0x21

    move/from16 v17, v7

    const/4 v7, 0x2

    if-eqz v10, :cond_6

    .line 39
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/presentation/textutils/RenderContext;->getSingleLine()Z

    move-result v0

    if-eqz v0, :cond_5

    new-array v0, v12, [Ljava/lang/Object;

    aput-object v1, v0, v27

    aput-object v3, v0, v8

    aput-object v4, v0, v7

    .line 40
    invoke-virtual/range {p2 .. p2}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v1

    .line 41
    check-cast v13, Lcom/discord/chat/bridge/contentnode/CodeBlockContentNode;

    invoke-virtual {v13}, Lcom/discord/chat/bridge/contentnode/CodeBlockContentNode;->getContent()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0xa

    const/16 v4, 0x20

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, Lpi/l;->C(Ljava/lang/String;CCZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v14, v2}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move/from16 v2, v27

    :goto_2
    if-ge v2, v12, :cond_1

    .line 42
    aget-object v3, v0, v2

    if-eqz v3, :cond_4

    .line 43
    invoke-virtual/range {p2 .. p2}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v4

    invoke-virtual {v14, v3, v1, v4, v11}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 44
    :cond_5
    sget-object v0, Lcom/discord/chat/presentation/textutils/CodeStyle;->INSTANCE:Lcom/discord/chat/presentation/textutils/CodeStyle;

    check-cast v13, Lcom/discord/chat/bridge/contentnode/CodeBlockContentNode;

    invoke-virtual {v0, v14, v13, v15}, Lcom/discord/chat/presentation/textutils/CodeStyle;->renderCodeBlock(Lcom/facebook/drawee/span/DraweeSpanStringBuilder;Lcom/discord/chat/bridge/contentnode/CodeBlockContentNode;Lcom/discord/chat/presentation/textutils/RenderContext;)V

    goto/16 :goto_1

    .line 45
    :cond_6
    instance-of v10, v13, Lcom/discord/chat/bridge/contentnode/EmojiContentNode;

    if-eqz v10, :cond_7

    check-cast v13, Lcom/discord/chat/bridge/contentnode/EmojiContentNode;

    invoke-static {v14, v13, v15}, Lcom/discord/chat/presentation/textutils/EmojiRendererKt;->renderEmoji(Lcom/facebook/drawee/span/DraweeSpanStringBuilder;Lcom/discord/chat/bridge/contentnode/EmojiContentNode;Lcom/discord/chat/presentation/textutils/RenderContext;)V

    goto/16 :goto_1

    .line 46
    :cond_7
    instance-of v10, v13, Lcom/discord/chat/bridge/contentnode/EmphasisContentNode;

    if-eqz v10, :cond_8

    new-array v0, v8, [Ljava/lang/Object;

    .line 47
    new-instance v1, Landroid/text/style/StyleSpan;

    invoke-direct {v1, v7}, Landroid/text/style/StyleSpan;-><init>(I)V

    aput-object v1, v0, v27

    .line 48
    invoke-virtual/range {p2 .. p2}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v1

    .line 49
    check-cast v13, Lcom/discord/chat/bridge/contentnode/EmphasisContentNode;

    invoke-virtual {v13}, Lcom/discord/chat/bridge/contentnode/EmphasisContentNode;->getContent()Ljava/util/List;

    move-result-object v2

    invoke-static {v2, v15, v14}, Lcom/discord/chat/presentation/textutils/TextUtilsKt;->appendToExistingBuilder(Ljava/util/List;Lcom/discord/chat/presentation/textutils/RenderContext;Lcom/facebook/drawee/span/DraweeSpanStringBuilder;)V

    aget-object v0, v0, v27

    if-eqz v0, :cond_1

    .line 50
    invoke-virtual/range {p2 .. p2}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v2

    invoke-virtual {v14, v0, v1, v2, v11}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    goto/16 :goto_1

    .line 51
    :cond_8
    instance-of v10, v13, Lcom/discord/chat/bridge/contentnode/InlineCodeContentNode;

    if-eqz v10, :cond_a

    new-array v0, v12, [Ljava/lang/Object;

    aput-object v1, v0, v27

    aput-object v3, v0, v8

    aput-object v4, v0, v7

    .line 52
    invoke-virtual/range {p2 .. p2}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v1

    .line 53
    check-cast v13, Lcom/discord/chat/bridge/contentnode/InlineCodeContentNode;

    invoke-virtual {v13}, Lcom/discord/chat/bridge/contentnode/InlineCodeContentNode;->getContent()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v14, v2}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move/from16 v2, v27

    :goto_3
    if-ge v2, v12, :cond_1

    .line 54
    aget-object v3, v0, v2

    if-eqz v3, :cond_9

    .line 55
    invoke-virtual/range {p2 .. p2}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v4

    invoke-virtual {v14, v3, v1, v4, v11}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    :cond_9
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    .line 56
    :cond_a
    instance-of v1, v13, Lcom/discord/chat/bridge/contentnode/LineBreakContentNode;

    if-eqz v1, :cond_b

    const-string v0, "\n"

    invoke-virtual {v14, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    goto/16 :goto_1

    .line 57
    :cond_b
    instance-of v1, v13, Lcom/discord/chat/bridge/contentnode/LinkContentNode;

    const/4 v10, 0x0

    if-eqz v1, :cond_e

    .line 58
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/presentation/textutils/RenderContext;->getLinkStyle()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    invoke-interface {v0, v13}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/discord/chat/presentation/textutils/LinkStyle;

    .line 59
    new-instance v1, Lcom/discord/span/utilities/spannable/ClickableSpan;

    const/16 v17, 0x0

    .line 60
    move-object v3, v13

    check-cast v3, Lcom/discord/chat/bridge/contentnode/LinkContentNode;

    invoke-virtual {v3}, Lcom/discord/chat/bridge/contentnode/LinkContentNode;->getContext()Lcom/discord/chat/bridge/contentnode/LinkContext;

    move-result-object v4

    if-eqz v4, :cond_c

    invoke-virtual {v4}, Lcom/discord/chat/bridge/contentnode/LinkContext;->getUsernameOnClick()Lcom/discord/chat/bridge/contentnode/UserNameOnClick;

    move-result-object v4

    if-eqz v4, :cond_c

    invoke-virtual {v4}, Lcom/discord/chat/bridge/contentnode/UserNameOnClick;->getLinkColor()Ljava/lang/Integer;

    move-result-object v4

    if-eqz v4, :cond_c

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    goto :goto_4

    :cond_c
    invoke-virtual {v0}, Lcom/discord/chat/presentation/textutils/LinkStyle;->getLinkColor()I

    move-result v4

    :goto_4
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v18

    .line 61
    new-instance v4, Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$12$click$1;

    invoke-direct {v4, v13, v15}, Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$12$click$1;-><init>(Lcom/discord/chat/bridge/contentnode/ContentNode;Lcom/discord/chat/presentation/textutils/RenderContext;)V

    new-instance v5, Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$12$click$2;

    invoke-direct {v5, v15, v13}, Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$12$click$2;-><init>(Lcom/discord/chat/presentation/textutils/RenderContext;Lcom/discord/chat/bridge/contentnode/ContentNode;)V

    const/16 v21, 0x1

    const/16 v22, 0x0

    move-object/from16 v16, v1

    move-object/from16 v19, v4

    move-object/from16 v20, v5

    invoke-direct/range {v16 .. v22}, Lcom/discord/span/utilities/spannable/ClickableSpan;-><init>(Lcom/discord/react_gesture_handler/nested_touch/NestedClickableSpan$TouchPriority;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 62
    new-instance v4, Lcom/discord/chat/presentation/textutils/DiscordFontSpan;

    invoke-virtual {v0}, Lcom/discord/chat/presentation/textutils/LinkStyle;->getFont()Lcom/discord/fonts/DiscordFont;

    move-result-object v0

    invoke-direct {v4, v2, v0}, Lcom/discord/chat/presentation/textutils/DiscordFontSpan;-><init>(Landroid/content/Context;Lcom/discord/fonts/DiscordFont;)V

    new-array v0, v7, [Ljava/lang/Object;

    aput-object v1, v0, v27

    aput-object v4, v0, v8

    .line 63
    invoke-virtual/range {p2 .. p2}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v1

    .line 64
    invoke-virtual {v3}, Lcom/discord/chat/bridge/contentnode/LinkContentNode;->getContent()Ljava/util/List;

    move-result-object v2

    invoke-static {v2, v15, v10, v7, v10}, Lcom/discord/chat/presentation/textutils/TextUtilsKt;->toSpannable$default(Ljava/util/List;Lcom/discord/chat/presentation/textutils/RenderContext;Lcom/facebook/drawee/span/DraweeSpanStringBuilder;ILjava/lang/Object;)Lcom/facebook/drawee/span/DraweeSpanStringBuilder;

    move-result-object v2

    invoke-virtual {v14, v2}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move/from16 v2, v27

    :goto_5
    if-ge v2, v7, :cond_1

    .line 65
    aget-object v3, v0, v2

    if-eqz v3, :cond_d

    .line 66
    invoke-virtual/range {p2 .. p2}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v4

    invoke-virtual {v14, v3, v1, v4, v11}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    :cond_d
    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    .line 67
    :cond_e
    instance-of v1, v13, Lcom/discord/chat/bridge/contentnode/MentionContentNode;

    if-eqz v1, :cond_29

    .line 68
    move-object v4, v13

    check-cast v4, Lcom/discord/chat/bridge/contentnode/MentionContentNode;

    .line 69
    instance-of v0, v4, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;

    const-string v3, "#"

    const/4 v1, -0x1

    if-eqz v0, :cond_19

    .line 70
    move-object v0, v13

    check-cast v0, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;

    invoke-virtual {v0}, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->getUserId-wUX8bhU()Lcom/discord/primitives/UserId;

    move-result-object v4

    if-eqz v4, :cond_f

    .line 71
    new-instance v4, Lcom/discord/span/utilities/spannable/ClickableSpan;

    const/16 v19, 0x0

    .line 72
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v20

    const/16 v21, 0x0

    .line 73
    new-instance v1, Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$12$click$3;

    invoke-direct {v1, v15, v13}, Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$12$click$3;-><init>(Lcom/discord/chat/presentation/textutils/RenderContext;Lcom/discord/chat/bridge/contentnode/ContentNode;)V

    const/16 v23, 0x5

    const/16 v24, 0x0

    move-object/from16 v18, v4

    move-object/from16 v22, v1

    .line 74
    invoke-direct/range {v18 .. v24}, Lcom/discord/span/utilities/spannable/ClickableSpan;-><init>(Lcom/discord/react_gesture_handler/nested_touch/NestedClickableSpan$TouchPriority;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_6

    :cond_f
    move-object v4, v10

    .line 75
    :goto_6
    invoke-virtual {v0}, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->getRoleColor()I

    move-result v1

    .line 76
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/presentation/textutils/RenderContext;->getShouldShowRoleDot()Z

    move-result v13

    if-eqz v13, :cond_10

    if-lez v1, :cond_10

    move v13, v8

    goto :goto_7

    :cond_10
    move/from16 v13, v27

    .line 77
    :goto_7
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/presentation/textutils/RenderContext;->getShouldShowRoleOnName()Z

    move-result v16

    if-eqz v16, :cond_11

    if-lez v1, :cond_11

    move/from16 v16, v8

    goto :goto_8

    :cond_11
    move/from16 v16, v27

    .line 78
    :goto_8
    invoke-virtual {v0}, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->getContent()Ljava/util/List;

    move-result-object v11

    invoke-static {v11, v15, v10, v7, v10}, Lcom/discord/chat/presentation/textutils/TextUtilsKt;->toSpannable$default(Ljava/util/List;Lcom/discord/chat/presentation/textutils/RenderContext;Lcom/facebook/drawee/span/DraweeSpanStringBuilder;ILjava/lang/Object;)Lcom/facebook/drawee/span/DraweeSpanStringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v11

    const-string v10, "@Clyde"

    invoke-static {v11, v10}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_12

    move/from16 v5, p0

    goto :goto_9

    :cond_12
    if-eqz v16, :cond_13

    .line 79
    invoke-static {v1, v9}, Landroidx/core/graphics/a;->k(II)I

    move-result v5

    .line 80
    :cond_13
    :goto_9
    invoke-static {v15, v5}, Lcom/discord/chat/presentation/textutils/TextUtilsKt;->makeMentionBackgroundSpan(Lcom/discord/chat/presentation/textutils/RenderContext;I)Lcom/discord/span/utilities/spannable/BackgroundSpan;

    move-result-object v9

    if-eqz v10, :cond_14

    move/from16 v6, v17

    goto :goto_a

    :cond_14
    if-eqz v16, :cond_15

    const/16 v6, 0xff

    .line 81
    invoke-static {v1, v6}, Landroidx/core/graphics/a;->k(II)I

    move-result v6

    .line 82
    :cond_15
    :goto_a
    new-instance v1, Landroid/text/style/ForegroundColorSpan;

    invoke-direct {v1, v6}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    new-array v10, v8, [Ljava/lang/Object;

    .line 83
    new-instance v6, Landroid/text/style/StyleSpan;

    invoke-direct {v6, v8}, Landroid/text/style/StyleSpan;-><init>(I)V

    aput-object v6, v10, v27

    .line 84
    invoke-virtual/range {p2 .. p2}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v11

    new-array v6, v12, [Ljava/lang/Object;

    aput-object v4, v6, v27

    aput-object v9, v6, v8

    aput-object v1, v6, v7

    .line 85
    invoke-virtual/range {p2 .. p2}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v9

    if-eqz v13, :cond_16

    .line 86
    new-instance v13, Lcom/discord/chat/presentation/message/RoleDotSpan;

    const/4 v4, 0x0

    const/16 v16, 0x4

    const/16 v17, 0x0

    move-object v1, v13

    move-object v12, v3

    move v3, v5

    move/from16 v5, v16

    move-object/from16 v16, v6

    move-object/from16 v6, v17

    invoke-direct/range {v1 .. v6}, Lcom/discord/chat/presentation/message/RoleDotSpan;-><init>(Landroid/content/Context;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 87
    invoke-virtual {v0}, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->getRoleColor()I

    move-result v1

    invoke-virtual {v13, v1}, Lcom/discord/chat/presentation/message/RoleDotSpan;->setColor(I)V

    .line 88
    invoke-virtual {v14, v12}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 89
    invoke-virtual/range {p2 .. p2}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v1

    sub-int/2addr v1, v8

    .line 90
    invoke-virtual/range {p2 .. p2}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v2

    const/16 v3, 0x21

    .line 91
    invoke-virtual {v14, v13, v1, v2, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    goto :goto_b

    :cond_16
    move-object/from16 v16, v6

    const/16 v3, 0x21

    .line 92
    :goto_b
    invoke-virtual {v0}, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->getContent()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v15, v1, v7, v1}, Lcom/discord/chat/presentation/textutils/TextUtilsKt;->toSpannable$default(Ljava/util/List;Lcom/discord/chat/presentation/textutils/RenderContext;Lcom/facebook/drawee/span/DraweeSpanStringBuilder;ILjava/lang/Object;)Lcom/facebook/drawee/span/DraweeSpanStringBuilder;

    move-result-object v0

    invoke-virtual {v14, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move/from16 v0, v27

    :goto_c
    const/4 v1, 0x3

    if-ge v0, v1, :cond_18

    .line 93
    aget-object v1, v16, v0

    if-eqz v1, :cond_17

    .line 94
    invoke-virtual/range {p2 .. p2}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v2

    invoke-virtual {v14, v1, v9, v2, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    :cond_17
    add-int/lit8 v0, v0, 0x1

    goto :goto_c

    :cond_18
    aget-object v0, v10, v27

    if-eqz v0, :cond_27

    .line 95
    invoke-virtual/range {p2 .. p2}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v1

    invoke-virtual {v14, v0, v11, v1, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    goto/16 :goto_15

    :cond_19
    move-object v12, v3

    .line 96
    instance-of v0, v4, Lcom/discord/chat/bridge/contentnode/ChannelMentionContentNode;

    if-eqz v0, :cond_1e

    .line 97
    new-instance v0, Lcom/discord/span/utilities/spannable/ClickableSpan;

    const/16 v30, 0x0

    .line 98
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v31

    .line 99
    new-instance v1, Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$12$click$4;

    invoke-direct {v1, v15, v13}, Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$12$click$4;-><init>(Lcom/discord/chat/presentation/textutils/RenderContext;Lcom/discord/chat/bridge/contentnode/ContentNode;)V

    new-instance v3, Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$12$click$5;

    invoke-direct {v3, v15, v13}, Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$12$click$5;-><init>(Lcom/discord/chat/presentation/textutils/RenderContext;Lcom/discord/chat/bridge/contentnode/ContentNode;)V

    const/16 v34, 0x1

    const/16 v35, 0x0

    move-object/from16 v29, v0

    move-object/from16 v32, v1

    move-object/from16 v33, v3

    invoke-direct/range {v29 .. v35}, Lcom/discord/span/utilities/spannable/ClickableSpan;-><init>(Lcom/discord/react_gesture_handler/nested_touch/NestedClickableSpan$TouchPriority;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 100
    invoke-static {v15, v5}, Lcom/discord/chat/presentation/textutils/TextUtilsKt;->makeMentionBackgroundSpan(Lcom/discord/chat/presentation/textutils/RenderContext;I)Lcom/discord/span/utilities/spannable/BackgroundSpan;

    move-result-object v1

    .line 101
    new-instance v3, Landroid/text/style/ForegroundColorSpan;

    invoke-direct {v3, v6}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    new-array v11, v8, [Ljava/lang/Object;

    .line 102
    new-instance v5, Landroid/text/style/StyleSpan;

    invoke-direct {v5, v8}, Landroid/text/style/StyleSpan;-><init>(I)V

    aput-object v5, v11, v27

    .line 103
    invoke-virtual/range {p2 .. p2}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v12

    const/4 v5, 0x3

    new-array v10, v5, [Ljava/lang/Object;

    aput-object v0, v10, v27

    aput-object v1, v10, v8

    aput-object v3, v10, v7

    .line 104
    invoke-virtual/range {p2 .. p2}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v9

    .line 105
    check-cast v13, Lcom/discord/chat/bridge/contentnode/ChannelMentionContentNode;

    invoke-virtual {v13}, Lcom/discord/chat/bridge/contentnode/ChannelMentionContentNode;->getInContent()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1a

    .line 106
    invoke-static {v0, v15, v14}, Lcom/discord/chat/presentation/textutils/TextUtilsKt;->appendToExistingBuilder(Ljava/util/List;Lcom/discord/chat/presentation/textutils/RenderContext;Lcom/facebook/drawee/span/DraweeSpanStringBuilder;)V

    const-string v0, "_caret"

    .line 107
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/presentation/textutils/RenderContext;->getBaselineHeight()F

    move-result v1

    invoke-static {v0, v1}, Lcom/discord/chat/presentation/textutils/TextUtilsKt;->getIconSize(Ljava/lang/String;F)I

    move-result v5

    .line 108
    sget-object v0, Lcom/discord/react_asset_fetcher/ReactAsset;->Caret:Lcom/discord/react_asset_fetcher/ReactAsset;

    invoke-virtual {v0, v2}, Lcom/discord/react_asset_fetcher/ReactAsset;->getUri(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    .line 109
    invoke-virtual {v3}, Landroid/text/style/ForegroundColorSpan;->getForegroundColor()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/4 v8, 0x0

    const/4 v13, 0x0

    const/16 v16, 0xc0

    const/16 v17, 0x0

    move-object/from16 v0, p2

    move-object v1, v2

    move-object/from16 v2, p1

    move-object v3, v6

    move-object v6, v4

    move v4, v5

    move-object/from16 v20, v6

    move-object v6, v7

    move v7, v8

    move v8, v13

    move v13, v9

    move/from16 v9, v16

    move-object/from16 v16, v10

    move-object/from16 v10, v17

    .line 110
    invoke-static/range {v0 .. v10}, Lcom/discord/chat/presentation/textutils/TextUtilsKt;->appendImage$default(Lcom/facebook/drawee/span/DraweeSpanStringBuilder;Landroid/content/Context;Lcom/discord/chat/presentation/textutils/RenderContext;Ljava/lang/String;IILjava/lang/Integer;FFILjava/lang/Object;)V

    .line 111
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    goto :goto_d

    :cond_1a
    move-object/from16 v20, v4

    move v13, v9

    move-object/from16 v16, v10

    .line 112
    :goto_d
    invoke-virtual/range {v20 .. v20}, Lcom/discord/chat/bridge/contentnode/MentionContentNode;->getContent()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1b

    invoke-static {v0, v15, v14}, Lcom/discord/chat/presentation/textutils/TextUtilsKt;->appendToExistingBuilder(Ljava/util/List;Lcom/discord/chat/presentation/textutils/RenderContext;Lcom/facebook/drawee/span/DraweeSpanStringBuilder;)V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    :cond_1b
    move/from16 v0, v27

    :goto_e
    const/4 v1, 0x3

    if-ge v0, v1, :cond_1d

    .line 113
    aget-object v1, v16, v0

    if-eqz v1, :cond_1c

    .line 114
    invoke-virtual/range {p2 .. p2}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v2

    const/16 v3, 0x21

    invoke-virtual {v14, v1, v13, v2, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    goto :goto_f

    :cond_1c
    const/16 v3, 0x21

    :goto_f
    add-int/lit8 v0, v0, 0x1

    goto :goto_e

    :cond_1d
    const/16 v3, 0x21

    aget-object v0, v11, v27

    if-eqz v0, :cond_27

    .line 115
    invoke-virtual/range {p2 .. p2}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v1

    invoke-virtual {v14, v0, v12, v1, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    goto/16 :goto_15

    :cond_1e
    move-object v0, v4

    .line 116
    instance-of v3, v0, Lcom/discord/chat/bridge/contentnode/StaticChannelMentionContentNode;

    if-eqz v3, :cond_24

    .line 117
    new-instance v0, Lcom/discord/span/utilities/spannable/ClickableSpan;

    const/16 v30, 0x0

    .line 118
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v31

    const/16 v32, 0x0

    .line 119
    new-instance v1, Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$12$click$6;

    invoke-direct {v1, v15, v13}, Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$12$click$6;-><init>(Lcom/discord/chat/presentation/textutils/RenderContext;Lcom/discord/chat/bridge/contentnode/ContentNode;)V

    const/16 v34, 0x5

    const/16 v35, 0x0

    move-object/from16 v29, v0

    move-object/from16 v33, v1

    invoke-direct/range {v29 .. v35}, Lcom/discord/span/utilities/spannable/ClickableSpan;-><init>(Lcom/discord/react_gesture_handler/nested_touch/NestedClickableSpan$TouchPriority;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 120
    invoke-static {v15, v5}, Lcom/discord/chat/presentation/textutils/TextUtilsKt;->makeMentionBackgroundSpan(Lcom/discord/chat/presentation/textutils/RenderContext;I)Lcom/discord/span/utilities/spannable/BackgroundSpan;

    move-result-object v1

    .line 121
    new-instance v3, Landroid/text/style/ForegroundColorSpan;

    invoke-direct {v3, v6}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 122
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/presentation/textutils/RenderContext;->getBaselineHeight()F

    move-result v4

    const/4 v10, 0x0

    invoke-static {v10, v4}, Lcom/discord/chat/presentation/textutils/TextUtilsKt;->getIconSize(Ljava/lang/String;F)I

    move-result v5

    new-array v11, v8, [Ljava/lang/Object;

    .line 123
    new-instance v4, Landroid/text/style/StyleSpan;

    invoke-direct {v4, v8}, Landroid/text/style/StyleSpan;-><init>(I)V

    aput-object v4, v11, v27

    .line 124
    invoke-virtual/range {p2 .. p2}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v9

    const/4 v4, 0x3

    new-array v6, v4, [Ljava/lang/Object;

    aput-object v0, v6, v27

    aput-object v1, v6, v8

    aput-object v3, v6, v7

    .line 125
    invoke-virtual/range {p2 .. p2}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v4

    .line 126
    check-cast v13, Lcom/discord/chat/bridge/contentnode/StaticChannelMentionContentNode;

    invoke-virtual {v13}, Lcom/discord/chat/bridge/contentnode/StaticChannelMentionContentNode;->getChannelId()Lcom/discord/chat/bridge/contentnode/StaticChannelMentionType;

    move-result-object v0

    sget-object v1, Lcom/discord/chat/presentation/textutils/TextUtilsKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    if-eq v0, v8, :cond_21

    if-eq v0, v7, :cond_20

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1f

    .line 127
    invoke-virtual {v14, v12}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    move/from16 v36, v4

    move-object/from16 v21, v6

    move v12, v7

    move/from16 v37, v9

    move-object/from16 v16, v11

    move-object v11, v10

    goto/16 :goto_10

    .line 128
    :cond_1f
    sget-object v0, Lcom/discord/react_asset_fetcher/ReactAsset;->PersonShield:Lcom/discord/react_asset_fetcher/ReactAsset;

    invoke-virtual {v0, v2}, Lcom/discord/react_asset_fetcher/ReactAsset;->getUri(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v8

    .line 129
    invoke-virtual {v3}, Landroid/text/style/ForegroundColorSpan;->getForegroundColor()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v19, 0xc0

    const/16 v20, 0x0

    move-object/from16 v0, p2

    move-object v1, v2

    move-object/from16 v2, p1

    move-object v3, v8

    move v8, v4

    move v4, v5

    move-object/from16 v21, v6

    move-object v6, v12

    move v12, v7

    move/from16 v7, v16

    move/from16 v36, v8

    move/from16 v8, v17

    move/from16 v37, v9

    move/from16 v9, v19

    move-object/from16 v16, v11

    move-object v11, v10

    move-object/from16 v10, v20

    .line 130
    invoke-static/range {v0 .. v10}, Lcom/discord/chat/presentation/textutils/TextUtilsKt;->appendImage$default(Lcom/facebook/drawee/span/DraweeSpanStringBuilder;Landroid/content/Context;Lcom/discord/chat/presentation/textutils/RenderContext;Ljava/lang/String;IILjava/lang/Integer;FFILjava/lang/Object;)V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    goto :goto_10

    :cond_20
    move/from16 v36, v4

    move-object/from16 v21, v6

    move v12, v7

    move/from16 v37, v9

    move-object/from16 v16, v11

    move-object v11, v10

    .line 131
    sget-object v0, Lcom/discord/react_asset_fetcher/ReactAsset;->ChannelBrowse:Lcom/discord/react_asset_fetcher/ReactAsset;

    invoke-virtual {v0, v2}, Lcom/discord/react_asset_fetcher/ReactAsset;->getUri(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 132
    invoke-virtual {v3}, Landroid/text/style/ForegroundColorSpan;->getForegroundColor()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0xc0

    const/4 v10, 0x0

    move-object/from16 v0, p2

    move-object v1, v2

    move-object/from16 v2, p1

    move-object v3, v4

    move v4, v5

    .line 133
    invoke-static/range {v0 .. v10}, Lcom/discord/chat/presentation/textutils/TextUtilsKt;->appendImage$default(Lcom/facebook/drawee/span/DraweeSpanStringBuilder;Landroid/content/Context;Lcom/discord/chat/presentation/textutils/RenderContext;Ljava/lang/String;IILjava/lang/Integer;FFILjava/lang/Object;)V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    goto :goto_10

    :cond_21
    move/from16 v36, v4

    move-object/from16 v21, v6

    move v12, v7

    move/from16 v37, v9

    move-object/from16 v16, v11

    move-object v11, v10

    .line 134
    sget-object v0, Lcom/discord/react_asset_fetcher/ReactAsset;->Home:Lcom/discord/react_asset_fetcher/ReactAsset;

    invoke-virtual {v0, v2}, Lcom/discord/react_asset_fetcher/ReactAsset;->getUri(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 135
    invoke-virtual {v3}, Landroid/text/style/ForegroundColorSpan;->getForegroundColor()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0xc0

    const/4 v10, 0x0

    move-object/from16 v0, p2

    move-object v1, v2

    move-object/from16 v2, p1

    move-object v3, v4

    move v4, v5

    .line 136
    invoke-static/range {v0 .. v10}, Lcom/discord/chat/presentation/textutils/TextUtilsKt;->appendImage$default(Lcom/facebook/drawee/span/DraweeSpanStringBuilder;Landroid/content/Context;Lcom/discord/chat/presentation/textutils/RenderContext;Ljava/lang/String;IILjava/lang/Integer;FFILjava/lang/Object;)V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 137
    :goto_10
    invoke-virtual {v13}, Lcom/discord/chat/bridge/contentnode/StaticChannelMentionContentNode;->getContent()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, v15, v11, v12, v11}, Lcom/discord/chat/presentation/textutils/TextUtilsKt;->toSpannable$default(Ljava/util/List;Lcom/discord/chat/presentation/textutils/RenderContext;Lcom/facebook/drawee/span/DraweeSpanStringBuilder;ILjava/lang/Object;)Lcom/facebook/drawee/span/DraweeSpanStringBuilder;

    move-result-object v0

    invoke-virtual {v14, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move/from16 v0, v27

    :goto_11
    const/4 v1, 0x3

    if-ge v0, v1, :cond_23

    .line 138
    aget-object v1, v21, v0

    if-eqz v1, :cond_22

    .line 139
    invoke-virtual/range {p2 .. p2}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v2

    move/from16 v3, v36

    const/16 v4, 0x21

    invoke-virtual {v14, v1, v3, v2, v4}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    goto :goto_12

    :cond_22
    move/from16 v3, v36

    const/16 v4, 0x21

    :goto_12
    add-int/lit8 v0, v0, 0x1

    move/from16 v36, v3

    goto :goto_11

    :cond_23
    const/16 v4, 0x21

    aget-object v0, v16, v27

    if-eqz v0, :cond_27

    .line 140
    invoke-virtual/range {p2 .. p2}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v1

    move/from16 v2, v37

    invoke-virtual {v14, v0, v2, v1, v4}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    goto/16 :goto_15

    :cond_24
    move v12, v7

    const/4 v11, 0x0

    .line 141
    instance-of v0, v0, Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;

    if-eqz v0, :cond_28

    .line 142
    invoke-static {v15, v5}, Lcom/discord/chat/presentation/textutils/TextUtilsKt;->makeMentionBackgroundSpan(Lcom/discord/chat/presentation/textutils/RenderContext;I)Lcom/discord/span/utilities/spannable/BackgroundSpan;

    move-result-object v0

    .line 143
    new-instance v2, Landroid/text/style/ForegroundColorSpan;

    invoke-direct {v2, v6}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 144
    new-instance v3, Lcom/discord/span/utilities/spannable/ClickableSpan;

    const/16 v20, 0x0

    .line 145
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v21

    .line 146
    new-instance v1, Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$12$click$7;

    invoke-direct {v1, v15, v13}, Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$12$click$7;-><init>(Lcom/discord/chat/presentation/textutils/RenderContext;Lcom/discord/chat/bridge/contentnode/ContentNode;)V

    new-instance v4, Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$12$click$8;

    invoke-direct {v4, v15, v13}, Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$12$click$8;-><init>(Lcom/discord/chat/presentation/textutils/RenderContext;Lcom/discord/chat/bridge/contentnode/ContentNode;)V

    const/16 v24, 0x1

    const/16 v25, 0x0

    move-object/from16 v19, v3

    move-object/from16 v22, v1

    move-object/from16 v23, v4

    invoke-direct/range {v19 .. v25}, Lcom/discord/span/utilities/spannable/ClickableSpan;-><init>(Lcom/discord/react_gesture_handler/nested_touch/NestedClickableSpan$TouchPriority;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-array v1, v8, [Ljava/lang/Object;

    .line 147
    new-instance v4, Landroid/text/style/StyleSpan;

    invoke-direct {v4, v8}, Landroid/text/style/StyleSpan;-><init>(I)V

    aput-object v4, v1, v27

    .line 148
    invoke-virtual/range {p2 .. p2}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v4

    const/4 v5, 0x3

    new-array v6, v5, [Ljava/lang/Object;

    aput-object v3, v6, v27

    aput-object v0, v6, v8

    aput-object v2, v6, v12

    .line 149
    invoke-virtual/range {p2 .. p2}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v0

    const-string v2, "/"

    .line 150
    invoke-virtual {v14, v2}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 151
    check-cast v13, Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;

    invoke-virtual {v13}, Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;->getContent()Ljava/util/List;

    move-result-object v2

    invoke-static {v2, v15, v11, v12, v11}, Lcom/discord/chat/presentation/textutils/TextUtilsKt;->toSpannable$default(Ljava/util/List;Lcom/discord/chat/presentation/textutils/RenderContext;Lcom/facebook/drawee/span/DraweeSpanStringBuilder;ILjava/lang/Object;)Lcom/facebook/drawee/span/DraweeSpanStringBuilder;

    move-result-object v2

    invoke-virtual {v14, v2}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move/from16 v2, v27

    :goto_13
    const/4 v3, 0x3

    if-ge v2, v3, :cond_26

    .line 152
    aget-object v3, v6, v2

    if-eqz v3, :cond_25

    .line 153
    invoke-virtual/range {p2 .. p2}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v5

    const/16 v10, 0x21

    invoke-virtual {v14, v3, v0, v5, v10}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    goto :goto_14

    :cond_25
    const/16 v10, 0x21

    :goto_14
    add-int/lit8 v2, v2, 0x1

    goto :goto_13

    :cond_26
    const/16 v10, 0x21

    aget-object v0, v1, v27

    if-eqz v0, :cond_27

    .line 154
    invoke-virtual/range {p2 .. p2}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v1

    invoke-virtual {v14, v0, v4, v1, v10}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 155
    :cond_27
    :goto_15
    invoke-static/range {p2 .. p2}, Lcom/discord/misc/utilities/kotlin/ForceExhaustiveKt;->forceExhaustive(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_1

    .line 156
    :cond_28
    new-instance v0, Llf/q;

    invoke-direct {v0}, Llf/q;-><init>()V

    throw v0

    :cond_29
    move v12, v7

    move/from16 v69, v11

    move-object v11, v10

    move/from16 v10, v69

    .line 157
    instance-of v1, v13, Lcom/discord/chat/bridge/contentnode/ParagraphContentNode;

    if-eqz v1, :cond_2a

    check-cast v13, Lcom/discord/chat/bridge/contentnode/ParagraphContentNode;

    invoke-virtual {v13}, Lcom/discord/chat/bridge/contentnode/ParagraphContentNode;->getContent()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, v15, v14}, Lcom/discord/chat/presentation/textutils/TextUtilsKt;->appendToExistingBuilder(Ljava/util/List;Lcom/discord/chat/presentation/textutils/RenderContext;Lcom/facebook/drawee/span/DraweeSpanStringBuilder;)V

    goto/16 :goto_1

    .line 158
    :cond_2a
    instance-of v1, v13, Lcom/discord/chat/bridge/contentnode/SpoilerContentNode;

    if-eqz v1, :cond_2f

    .line 159
    sget-object v1, Lcom/discord/chat/bridge/spoiler/SpoilerIdentifier;->Companion:Lcom/discord/chat/bridge/spoiler/SpoilerIdentifier$Companion;

    check-cast v13, Lcom/discord/chat/bridge/contentnode/SpoilerContentNode;

    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/presentation/textutils/RenderContext;->getContainerId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v13, v2, v0}, Lcom/discord/chat/bridge/spoiler/SpoilerIdentifier$Companion;->forNode-2sfwrmE(Lcom/discord/chat/bridge/contentnode/SpoilerContentNode;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    .line 160
    sget-object v1, Lcom/discord/chat/bridge/spoiler/SpoilerManager;->INSTANCE:Lcom/discord/chat/bridge/spoiler/SpoilerManager;

    invoke-virtual {v1, v0}, Lcom/discord/chat/bridge/spoiler/SpoilerManager;->isRevealed-V2PEE7g(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2b

    .line 161
    sget-object v2, Lcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;->Revealed:Lcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;

    goto :goto_16

    :cond_2b
    sget-object v2, Lcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;->Hidden:Lcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;

    :goto_16
    move-object/from16 v18, v2

    if-nez v1, :cond_2c

    .line 162
    new-instance v2, Lcom/discord/span/utilities/spannable/ClickableSpan;

    sget-object v20, Lcom/discord/react_gesture_handler/nested_touch/NestedClickableSpan$TouchPriority;->HIGH:Lcom/discord/react_gesture_handler/nested_touch/NestedClickableSpan$TouchPriority;

    const/16 v21, 0x0

    const/16 v22, 0x0

    .line 163
    new-instance v3, Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$12$click$9;

    invoke-direct {v3, v0, v15}, Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$12$click$9;-><init>(Ljava/lang/String;Lcom/discord/chat/presentation/textutils/RenderContext;)V

    const/16 v24, 0x6

    const/16 v25, 0x0

    move-object/from16 v19, v2

    move-object/from16 v23, v3

    .line 164
    invoke-direct/range {v19 .. v25}, Lcom/discord/span/utilities/spannable/ClickableSpan;-><init>(Lcom/discord/react_gesture_handler/nested_touch/NestedClickableSpan$TouchPriority;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_17

    :cond_2c
    move-object v2, v11

    .line 165
    :goto_17
    new-instance v0, Lcom/discord/span/utilities/spannable/SpoilerSpan;

    .line 166
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/presentation/textutils/RenderContext;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v3

    invoke-virtual {v3}, Lcom/discord/theme/DiscordTheme;->getSpoilerHiddenBackground()I

    move-result v3

    .line 167
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/presentation/textutils/RenderContext;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v4

    invoke-virtual {v4}, Lcom/discord/theme/DiscordTheme;->getSpoilerRevealedBackground()I

    move-result v4

    .line 168
    invoke-direct {v0, v1, v3, v4}, Lcom/discord/span/utilities/spannable/SpoilerSpan;-><init>(ZII)V

    new-array v11, v12, [Ljava/lang/Object;

    aput-object v2, v11, v27

    aput-object v0, v11, v8

    .line 169
    invoke-virtual/range {p2 .. p2}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v0

    .line 170
    invoke-virtual {v13}, Lcom/discord/chat/bridge/contentnode/SpoilerContentNode;->getContent()Ljava/util/List;

    move-result-object v13

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v16, 0x0

    move/from16 v17, v10

    move-object/from16 v10, v16

    move-object/from16 v29, v11

    move-object/from16 v11, v16

    move-object/from16 v12, v16

    move-object/from16 v40, v13

    move-object/from16 v13, v16

    const/16 v16, 0x0

    move/from16 v14, v16

    move/from16 v15, v16

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const v24, 0x7dffff

    const/16 v25, 0x0

    move/from16 v41, v0

    move-object/from16 v0, p1

    .line 171
    invoke-static/range {v0 .. v25}, Lcom/discord/chat/presentation/textutils/RenderContext;->copy$default(Lcom/discord/chat/presentation/textutils/RenderContext;Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZZZLcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;ILjava/lang/Integer;Lcom/discord/chat/presentation/textutils/RenderContext$Insets;Lcom/discord/theme/DiscordTheme;FILjava/lang/Object;)Lcom/discord/chat/presentation/textutils/RenderContext;

    move-result-object v0

    move-object/from16 v15, p2

    move-object/from16 v1, v40

    .line 172
    invoke-static {v1, v0, v15}, Lcom/discord/chat/presentation/textutils/TextUtilsKt;->appendToExistingBuilder(Ljava/util/List;Lcom/discord/chat/presentation/textutils/RenderContext;Lcom/facebook/drawee/span/DraweeSpanStringBuilder;)V

    move/from16 v0, v27

    const/4 v1, 0x2

    :goto_18
    if-ge v0, v1, :cond_2e

    .line 173
    aget-object v2, v29, v0

    if-eqz v2, :cond_2d

    .line 174
    invoke-virtual/range {p2 .. p2}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v3

    move/from16 v4, v41

    const/16 v5, 0x21

    invoke-virtual {v15, v2, v4, v3, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    goto :goto_19

    :cond_2d
    move/from16 v4, v41

    const/16 v5, 0x21

    :goto_19
    add-int/lit8 v0, v0, 0x1

    move/from16 v41, v4

    goto :goto_18

    :cond_2e
    move-object/from16 v12, p1

    goto :goto_1b

    :cond_2f
    move v5, v10

    move v1, v12

    move-object v15, v14

    .line 175
    instance-of v0, v13, Lcom/discord/chat/bridge/contentnode/StrikethroughContentNode;

    if-eqz v0, :cond_31

    new-array v0, v8, [Ljava/lang/Object;

    .line 176
    new-instance v1, Landroid/text/style/StrikethroughSpan;

    invoke-direct {v1}, Landroid/text/style/StrikethroughSpan;-><init>()V

    aput-object v1, v0, v27

    .line 177
    invoke-virtual/range {p2 .. p2}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v1

    .line 178
    check-cast v13, Lcom/discord/chat/bridge/contentnode/StrikethroughContentNode;

    invoke-virtual {v13}, Lcom/discord/chat/bridge/contentnode/StrikethroughContentNode;->getContent()Ljava/util/List;

    move-result-object v2

    move-object/from16 v14, p1

    invoke-static {v2, v14, v15}, Lcom/discord/chat/presentation/textutils/TextUtilsKt;->appendToExistingBuilder(Ljava/util/List;Lcom/discord/chat/presentation/textutils/RenderContext;Lcom/facebook/drawee/span/DraweeSpanStringBuilder;)V

    aget-object v0, v0, v27

    if-eqz v0, :cond_30

    .line 179
    invoke-virtual/range {p2 .. p2}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v2

    invoke-virtual {v15, v0, v1, v2, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    :cond_30
    :goto_1a
    move-object v12, v14

    :goto_1b
    move-object v11, v15

    goto/16 :goto_2a

    :cond_31
    move-object/from16 v14, p1

    .line 180
    instance-of v0, v13, Lcom/discord/chat/bridge/contentnode/HeadingContentNode;

    if-eqz v0, :cond_38

    .line 181
    new-instance v0, Lcom/discord/chat/presentation/textutils/DiscordFontSpan;

    sget-object v3, Lcom/discord/fonts/DiscordFont;->PrimaryExtraBold:Lcom/discord/fonts/DiscordFont;

    invoke-direct {v0, v2, v3}, Lcom/discord/chat/presentation/textutils/DiscordFontSpan;-><init>(Landroid/content/Context;Lcom/discord/fonts/DiscordFont;)V

    .line 182
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/presentation/textutils/RenderContext;->getSingleLine()Z

    move-result v2

    if-eqz v2, :cond_32

    .line 183
    invoke-static {v1}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    move-result v1

    new-array v2, v8, [Ljava/lang/Object;

    aput-object v0, v2, v27

    .line 184
    invoke-virtual/range {p2 .. p2}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v0

    .line 185
    new-instance v3, Landroid/text/style/AbsoluteSizeSpan;

    invoke-direct {v3, v1}, Landroid/text/style/AbsoluteSizeSpan;-><init>(I)V

    invoke-static {v15, v3}, Lcom/discord/span/utilities/SpannableStringBuilderExtensionsKt;->ensureNewline(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;)V

    .line 186
    check-cast v13, Lcom/discord/chat/bridge/contentnode/HeadingContentNode;

    invoke-virtual {v13}, Lcom/discord/chat/bridge/contentnode/HeadingContentNode;->getContent()Ljava/util/List;

    move-result-object v3

    invoke-static {v3, v14, v15}, Lcom/discord/chat/presentation/textutils/TextUtilsKt;->appendToExistingBuilder(Ljava/util/List;Lcom/discord/chat/presentation/textutils/RenderContext;Lcom/facebook/drawee/span/DraweeSpanStringBuilder;)V

    .line 187
    new-instance v3, Landroid/text/style/AbsoluteSizeSpan;

    invoke-direct {v3, v1}, Landroid/text/style/AbsoluteSizeSpan;-><init>(I)V

    invoke-static {v15, v3}, Lcom/discord/span/utilities/SpannableStringBuilderExtensionsKt;->ensureNewline(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;)V

    aget-object v1, v2, v27

    if-eqz v1, :cond_30

    .line 188
    invoke-virtual/range {p2 .. p2}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v2

    invoke-virtual {v15, v1, v0, v2, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    goto :goto_1a

    .line 189
    :cond_32
    check-cast v13, Lcom/discord/chat/bridge/contentnode/HeadingContentNode;

    invoke-virtual {v13}, Lcom/discord/chat/bridge/contentnode/HeadingContentNode;->getLevel()I

    move-result v2

    if-eq v2, v8, :cond_34

    if-eq v2, v1, :cond_33

    const/16 v2, 0x10

    .line 190
    invoke-static {v2}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getSpToPx(I)I

    move-result v2

    goto :goto_1c

    :cond_33
    const/16 v2, 0x14

    .line 191
    invoke-static {v2}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getSpToPx(I)I

    move-result v2

    goto :goto_1c

    :cond_34
    const/16 v2, 0x18

    .line 192
    invoke-static {v2}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getSpToPx(I)I

    move-result v2

    .line 193
    :goto_1c
    new-instance v3, Landroid/text/style/AbsoluteSizeSpan;

    invoke-direct {v3, v2}, Landroid/text/style/AbsoluteSizeSpan;-><init>(I)V

    const/16 v2, 0x8

    .line 194
    invoke-static {v2}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    move-result v4

    .line 195
    invoke-virtual {v13}, Lcom/discord/chat/bridge/contentnode/HeadingContentNode;->getLevel()I

    move-result v2

    if-eq v2, v8, :cond_36

    if-eq v2, v1, :cond_36

    const/4 v6, 0x3

    if-eq v2, v6, :cond_35

    const/4 v2, 0x4

    .line 196
    invoke-static {v2}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    move-result v2

    goto :goto_1f

    :cond_35
    :goto_1d
    const/16 v2, 0x8

    goto :goto_1e

    :cond_36
    const/4 v6, 0x3

    goto :goto_1d

    .line 197
    :goto_1e
    invoke-static {v2}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    move-result v2

    .line 198
    :goto_1f
    new-instance v7, Lcom/discord/span/utilities/spannable/VerticalPaddingSpan;

    invoke-direct {v7, v4, v2}, Lcom/discord/span/utilities/spannable/VerticalPaddingSpan;-><init>(II)V

    new-array v9, v6, [Ljava/lang/Object;

    aput-object v7, v9, v27

    aput-object v0, v9, v8

    aput-object v3, v9, v1

    .line 199
    invoke-virtual/range {p2 .. p2}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v0

    .line 200
    new-instance v1, Landroid/text/style/AbsoluteSizeSpan;

    invoke-direct {v1, v4}, Landroid/text/style/AbsoluteSizeSpan;-><init>(I)V

    invoke-static {v15, v1}, Lcom/discord/span/utilities/SpannableStringBuilderExtensionsKt;->ensureNewline(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;)V

    .line 201
    invoke-virtual {v13}, Lcom/discord/chat/bridge/contentnode/HeadingContentNode;->getContent()Ljava/util/List;

    move-result-object v1

    invoke-static {v1, v14, v15}, Lcom/discord/chat/presentation/textutils/TextUtilsKt;->appendToExistingBuilder(Ljava/util/List;Lcom/discord/chat/presentation/textutils/RenderContext;Lcom/facebook/drawee/span/DraweeSpanStringBuilder;)V

    .line 202
    new-instance v1, Landroid/text/style/AbsoluteSizeSpan;

    invoke-direct {v1, v2}, Landroid/text/style/AbsoluteSizeSpan;-><init>(I)V

    invoke-static {v15, v1}, Lcom/discord/span/utilities/SpannableStringBuilderExtensionsKt;->ensureNewline(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;)V

    move/from16 v1, v27

    const/4 v2, 0x3

    :goto_20
    if-ge v1, v2, :cond_30

    .line 203
    aget-object v3, v9, v1

    if-eqz v3, :cond_37

    .line 204
    invoke-virtual/range {p2 .. p2}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v4

    invoke-virtual {v15, v3, v0, v4, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    :cond_37
    add-int/lit8 v1, v1, 0x1

    goto :goto_20

    .line 205
    :cond_38
    instance-of v0, v13, Lcom/discord/chat/bridge/contentnode/BulletListContentNode;

    if-eqz v0, :cond_45

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v0, 0x0

    move v12, v8

    move-object v8, v0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v12, v0

    move-object/from16 v43, v13

    move-object v13, v0

    const/4 v0, 0x0

    move v14, v0

    move v15, v0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const v24, 0x7fffff

    const/16 v25, 0x0

    move-object/from16 v0, p1

    .line 206
    invoke-static/range {v0 .. v25}, Lcom/discord/chat/presentation/textutils/RenderContext;->copy$default(Lcom/discord/chat/presentation/textutils/RenderContext;Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZZZLcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;ILjava/lang/Integer;Lcom/discord/chat/presentation/textutils/RenderContext$Insets;Lcom/discord/theme/DiscordTheme;FILjava/lang/Object;)Lcom/discord/chat/presentation/textutils/RenderContext;

    move-result-object v0

    move-object/from16 v3, v43

    .line 207
    move-object v13, v3

    check-cast v13, Lcom/discord/chat/bridge/contentnode/BulletListContentNode;

    invoke-virtual {v13}, Lcom/discord/chat/bridge/contentnode/BulletListContentNode;->getOrdered()Z

    move-result v1

    .line 208
    invoke-virtual {v13}, Lcom/discord/chat/bridge/contentnode/BulletListContentNode;->getItems()Ljava/util/List;

    move-result-object v2

    .line 209
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_21
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_44

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    .line 210
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 211
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v5

    .line 212
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move-object/from16 v43, v0

    move/from16 v0, v27

    :goto_22
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_43

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    add-int/lit8 v7, v0, 0x1

    if-gez v0, :cond_39

    invoke-static {}, Lkotlin/collections/h;->s()V

    :cond_39
    check-cast v6, Lcom/discord/chat/bridge/contentnode/ContentNode;

    .line 213
    instance-of v8, v6, Lcom/discord/chat/bridge/contentnode/BulletListContentNode;

    const/4 v9, 0x1

    add-int/lit8 v10, v5, -0x1

    if-ne v0, v10, :cond_3a

    move v0, v9

    goto :goto_23

    :cond_3a
    move/from16 v0, v27

    :goto_23
    if-nez v8, :cond_3b

    .line 214
    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3b
    if-nez v8, :cond_3d

    if-eqz v0, :cond_3c

    goto :goto_24

    :cond_3c
    move-object/from16 v11, p2

    move-object/from16 v0, v43

    goto :goto_28

    :cond_3d
    :goto_24
    if-eqz v1, :cond_41

    .line 215
    invoke-virtual/range {v43 .. v43}, Lcom/discord/chat/presentation/textutils/RenderContext;->getListOrderedStart()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_3f

    .line 216
    invoke-virtual/range {v43 .. v43}, Lcom/discord/chat/presentation/textutils/RenderContext;->getListOrderedStart()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_3e

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_25

    :cond_3e
    move/from16 v0, v27

    :goto_25
    add-int/2addr v0, v9

    goto :goto_26

    .line 217
    :cond_3f
    invoke-virtual {v13}, Lcom/discord/chat/bridge/contentnode/BulletListContentNode;->getStart()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_40

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_26

    :cond_40
    move v0, v9

    :goto_26
    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    .line 218
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v63

    const/16 v64, 0x0

    const/16 v65, 0x0

    const/16 v66, 0x0

    const v67, 0x77ffff

    const/16 v68, 0x0

    invoke-static/range {v43 .. v68}, Lcom/discord/chat/presentation/textutils/RenderContext;->copy$default(Lcom/discord/chat/presentation/textutils/RenderContext;Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZZZLcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;ILjava/lang/Integer;Lcom/discord/chat/presentation/textutils/RenderContext$Insets;Lcom/discord/theme/DiscordTheme;FILjava/lang/Object;)Lcom/discord/chat/presentation/textutils/RenderContext;

    move-result-object v0

    move-object/from16 v11, p2

    goto :goto_27

    :cond_41
    move-object/from16 v11, p2

    move-object/from16 v0, v43

    .line 219
    :goto_27
    invoke-static {v11, v4, v0, v1}, Lcom/discord/chat/presentation/textutils/TextUtilsKt;->appendBulletPoint(Lcom/facebook/drawee/span/DraweeSpanStringBuilder;Ljava/util/List;Lcom/discord/chat/presentation/textutils/RenderContext;Z)V

    .line 220
    invoke-interface {v4}, Ljava/util/List;->clear()V

    :goto_28
    if-eqz v8, :cond_42

    .line 221
    invoke-virtual {v0}, Lcom/discord/chat/presentation/textutils/RenderContext;->getListNestedLevel()I

    move-result v8

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    add-int/lit8 v48, v8, 0x1

    .line 222
    invoke-static/range {v27 .. v27}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v49

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const v53, 0x73ffff

    const/16 v54, 0x0

    move-object/from16 v29, v0

    .line 223
    invoke-static/range {v29 .. v54}, Lcom/discord/chat/presentation/textutils/RenderContext;->copy$default(Lcom/discord/chat/presentation/textutils/RenderContext;Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZZZLcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;ILjava/lang/Integer;Lcom/discord/chat/presentation/textutils/RenderContext$Insets;Lcom/discord/theme/DiscordTheme;FILjava/lang/Object;)Lcom/discord/chat/presentation/textutils/RenderContext;

    move-result-object v8

    .line 224
    invoke-static {v6}, Lkotlin/collections/h;->d(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    invoke-static {v6, v8, v11}, Lcom/discord/chat/presentation/textutils/TextUtilsKt;->appendToExistingBuilder(Ljava/util/List;Lcom/discord/chat/presentation/textutils/RenderContext;Lcom/facebook/drawee/span/DraweeSpanStringBuilder;)V

    :cond_42
    move-object/from16 v43, v0

    move v0, v7

    goto/16 :goto_22

    :cond_43
    move-object/from16 v11, p2

    move-object/from16 v0, v43

    goto/16 :goto_21

    :cond_44
    move-object/from16 v11, p2

    move-object/from16 v12, p1

    goto/16 :goto_2a

    :cond_45
    move v9, v8

    move-object v3, v13

    move-object v11, v15

    .line 225
    instance-of v0, v3, Lcom/discord/chat/bridge/contentnode/StrongContentNode;

    if-eqz v0, :cond_46

    new-array v0, v9, [Ljava/lang/Object;

    .line 226
    new-instance v1, Landroid/text/style/StyleSpan;

    invoke-direct {v1, v9}, Landroid/text/style/StyleSpan;-><init>(I)V

    aput-object v1, v0, v27

    .line 227
    invoke-virtual/range {p2 .. p2}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v1

    .line 228
    move-object v13, v3

    check-cast v13, Lcom/discord/chat/bridge/contentnode/StrongContentNode;

    invoke-virtual {v13}, Lcom/discord/chat/bridge/contentnode/StrongContentNode;->getContent()Ljava/util/List;

    move-result-object v2

    move-object/from16 v12, p1

    invoke-static {v2, v12, v11}, Lcom/discord/chat/presentation/textutils/TextUtilsKt;->appendToExistingBuilder(Ljava/util/List;Lcom/discord/chat/presentation/textutils/RenderContext;Lcom/facebook/drawee/span/DraweeSpanStringBuilder;)V

    aget-object v0, v0, v27

    if-eqz v0, :cond_4f

    .line 229
    invoke-virtual/range {p2 .. p2}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v2

    invoke-virtual {v11, v0, v1, v2, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    goto/16 :goto_2a

    :cond_46
    move-object/from16 v12, p1

    .line 230
    instance-of v0, v3, Lcom/discord/chat/bridge/contentnode/TextContentNode;

    if-eqz v0, :cond_47

    move-object v13, v3

    check-cast v13, Lcom/discord/chat/bridge/contentnode/TextContentNode;

    invoke-virtual {v13}, Lcom/discord/chat/bridge/contentnode/TextContentNode;->getContent()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4f

    invoke-virtual {v11, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    goto/16 :goto_2a

    .line 231
    :cond_47
    instance-of v0, v3, Lcom/discord/chat/bridge/contentnode/TimestampContentNode;

    if-eqz v0, :cond_49

    .line 232
    new-instance v0, Lcom/discord/span/utilities/spannable/ClickableSpan;

    const/4 v14, 0x0

    .line 233
    sget v4, Lcom/discord/chat/R$color;->primary_600:I

    .line 234
    sget v6, Lcom/discord/chat/R$color;->primary_200:I

    .line 235
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/presentation/textutils/RenderContext;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v7

    .line 236
    invoke-static {v2, v4, v6, v7}, Lcom/discord/theme/utils/ColorUtilsKt;->getThemeColor(Landroid/content/Context;IILcom/discord/theme/DiscordTheme;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    const/16 v16, 0x0

    .line 237
    new-instance v4, Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$12$click$10;

    invoke-direct {v4, v12, v3}, Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$12$click$10;-><init>(Lcom/discord/chat/presentation/textutils/RenderContext;Lcom/discord/chat/bridge/contentnode/ContentNode;)V

    const/16 v18, 0x5

    const/16 v19, 0x0

    move-object v13, v0

    move-object/from16 v17, v4

    invoke-direct/range {v13 .. v19}, Lcom/discord/span/utilities/spannable/ClickableSpan;-><init>(Lcom/discord/react_gesture_handler/nested_touch/NestedClickableSpan$TouchPriority;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 238
    new-instance v4, Landroid/text/style/BackgroundColorSpan;

    .line 239
    sget v6, Lcom/discord/chat/R$color;->background_modifier_accent_light:I

    .line 240
    sget v7, Lcom/discord/chat/R$color;->background_modifier_accent_dark:I

    .line 241
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/presentation/textutils/RenderContext;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v8

    .line 242
    invoke-static {v2, v6, v7, v8}, Lcom/discord/theme/utils/ColorUtilsKt;->getThemeColor(Landroid/content/Context;IILcom/discord/theme/DiscordTheme;)I

    move-result v2

    .line 243
    invoke-direct {v4, v2}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    new-array v2, v1, [Ljava/lang/Object;

    aput-object v0, v2, v27

    aput-object v4, v2, v9

    .line 244
    invoke-virtual/range {p2 .. p2}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v0

    .line 245
    move-object v13, v3

    check-cast v13, Lcom/discord/chat/bridge/contentnode/TimestampContentNode;

    invoke-virtual {v13}, Lcom/discord/chat/bridge/contentnode/TimestampContentNode;->getFormatted()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v11, v3}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move/from16 v3, v27

    :goto_29
    if-ge v3, v1, :cond_4f

    .line 246
    aget-object v4, v2, v3

    if-eqz v4, :cond_48

    .line 247
    invoke-virtual/range {p2 .. p2}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v6

    invoke-virtual {v11, v4, v0, v6, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    :cond_48
    add-int/lit8 v3, v3, 0x1

    goto :goto_29

    .line 248
    :cond_49
    instance-of v0, v3, Lcom/discord/chat/bridge/contentnode/UnderlineContentNode;

    if-eqz v0, :cond_4a

    new-array v0, v9, [Ljava/lang/Object;

    .line 249
    new-instance v1, Landroid/text/style/UnderlineSpan;

    invoke-direct {v1}, Landroid/text/style/UnderlineSpan;-><init>()V

    aput-object v1, v0, v27

    .line 250
    invoke-virtual/range {p2 .. p2}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v1

    .line 251
    move-object v13, v3

    check-cast v13, Lcom/discord/chat/bridge/contentnode/UnderlineContentNode;

    invoke-virtual {v13}, Lcom/discord/chat/bridge/contentnode/UnderlineContentNode;->getContent()Ljava/util/List;

    move-result-object v2

    invoke-static {v2, v12, v11}, Lcom/discord/chat/presentation/textutils/TextUtilsKt;->appendToExistingBuilder(Ljava/util/List;Lcom/discord/chat/presentation/textutils/RenderContext;Lcom/facebook/drawee/span/DraweeSpanStringBuilder;)V

    aget-object v0, v0, v27

    if-eqz v0, :cond_4f

    .line 252
    invoke-virtual/range {p2 .. p2}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v2

    invoke-virtual {v11, v0, v1, v2, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    goto/16 :goto_2a

    .line 253
    :cond_4a
    instance-of v0, v3, Lcom/discord/chat/bridge/contentnode/ChannelNameContentNode;

    if-eqz v0, :cond_4c

    .line 254
    move-object v13, v3

    check-cast v13, Lcom/discord/chat/bridge/contentnode/ChannelNameContentNode;

    invoke-virtual {v13}, Lcom/discord/chat/bridge/contentnode/ChannelNameContentNode;->getIcon()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4b

    .line 255
    invoke-virtual {v13}, Lcom/discord/chat/bridge/contentnode/ChannelNameContentNode;->getIconType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/presentation/textutils/RenderContext;->getBaselineHeight()F

    move-result v1

    invoke-static {v0, v1}, Lcom/discord/chat/presentation/textutils/TextUtilsKt;->getIconSize(Ljava/lang/String;F)I

    move-result v5

    int-to-float v0, v5

    .line 256
    invoke-virtual {v13}, Lcom/discord/chat/bridge/contentnode/ChannelNameContentNode;->getIconType()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/discord/chat/presentation/textutils/TextUtilsKt;->getIconPaddingMultiplier(Ljava/lang/String;)F

    move-result v1

    mul-float v8, v0, v1

    .line 257
    invoke-virtual {v13}, Lcom/discord/chat/bridge/contentnode/ChannelNameContentNode;->getIcon()Ljava/lang/String;

    move-result-object v3

    .line 258
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/4 v7, 0x0

    const/16 v9, 0x40

    const/4 v10, 0x0

    move-object/from16 v0, p2

    move-object v1, v2

    move-object/from16 v2, p1

    move v4, v5

    .line 259
    invoke-static/range {v0 .. v10}, Lcom/discord/chat/presentation/textutils/TextUtilsKt;->appendImage$default(Lcom/facebook/drawee/span/DraweeSpanStringBuilder;Landroid/content/Context;Lcom/discord/chat/presentation/textutils/RenderContext;Ljava/lang/String;IILjava/lang/Integer;FFILjava/lang/Object;)V

    .line 260
    :cond_4b
    invoke-virtual {v13}, Lcom/discord/chat/bridge/contentnode/ChannelNameContentNode;->getContent()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, v12, v11}, Lcom/discord/chat/presentation/textutils/TextUtilsKt;->appendToExistingBuilder(Ljava/util/List;Lcom/discord/chat/presentation/textutils/RenderContext;Lcom/facebook/drawee/span/DraweeSpanStringBuilder;)V

    goto :goto_2a

    .line 261
    :cond_4c
    instance-of v0, v3, Lcom/discord/chat/bridge/contentnode/GuildNameContentNode;

    if-eqz v0, :cond_4e

    const-string v0, "_guild"

    .line 262
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/presentation/textutils/RenderContext;->getBaselineHeight()F

    move-result v1

    invoke-static {v0, v1}, Lcom/discord/chat/presentation/textutils/TextUtilsKt;->getIconSize(Ljava/lang/String;F)I

    move-result v5

    .line 263
    move-object v13, v3

    check-cast v13, Lcom/discord/chat/bridge/contentnode/GuildNameContentNode;

    invoke-virtual {v13}, Lcom/discord/chat/bridge/contentnode/GuildNameContentNode;->getIcon()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4d

    .line 264
    invoke-virtual {v13}, Lcom/discord/chat/bridge/contentnode/GuildNameContentNode;->getIcon()Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x0

    int-to-float v0, v5

    const v1, 0x3e4ccccd    # 0.2f

    mul-float v7, v0, v1

    const v1, 0x3dcccccd    # 0.1f

    mul-float v8, v0, v1

    const/16 v9, 0x20

    const/4 v10, 0x0

    move-object/from16 v0, p2

    move-object v1, v2

    move-object/from16 v2, p1

    move v4, v5

    .line 265
    invoke-static/range {v0 .. v10}, Lcom/discord/chat/presentation/textutils/TextUtilsKt;->appendImage$default(Lcom/facebook/drawee/span/DraweeSpanStringBuilder;Landroid/content/Context;Lcom/discord/chat/presentation/textutils/RenderContext;Ljava/lang/String;IILjava/lang/Integer;FFILjava/lang/Object;)V

    .line 266
    :cond_4d
    invoke-virtual {v13}, Lcom/discord/chat/bridge/contentnode/GuildNameContentNode;->getContent()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    goto :goto_2a

    .line 267
    :cond_4e
    instance-of v0, v3, Lcom/discord/chat/bridge/contentnode/ErrorContentNode;

    if-eqz v0, :cond_4f

    .line 268
    sget-object v0, Lcom/discord/crash_reporting/CrashReporting;->INSTANCE:Lcom/discord/crash_reporting/CrashReporting;

    move-object v13, v3

    check-cast v13, Lcom/discord/chat/bridge/contentnode/ErrorContentNode;

    invoke-virtual {v13}, Lcom/discord/chat/bridge/contentnode/ErrorContentNode;->getThrowable()Ljava/lang/Throwable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/discord/crash_reporting/CrashReporting;->captureException(Ljava/lang/Throwable;)V

    const-string v0, "\ufffd\ufffd\ufffd"

    .line 269
    invoke-virtual {v11, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    :cond_4f
    :goto_2a
    move-object v14, v11

    move-object v15, v12

    move/from16 v0, v28

    goto/16 :goto_0

    :cond_50
    move-object v11, v14

    return-object v11
.end method

.method public static synthetic toSpannable$default(Lcom/discord/chat/bridge/structurabletext/StructurableText;Landroid/content/Context;Ljava/lang/String;ZZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLcom/discord/theme/DiscordTheme;FILjava/lang/Object;)Lcom/facebook/drawee/span/DraweeSpanStringBuilder;
    .locals 22

    move/from16 v0, p20

    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_0

    .line 1
    sget-object v1, Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$1;->INSTANCE:Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$1;

    move-object v8, v1

    goto :goto_0

    :cond_0
    move-object/from16 v8, p6

    :goto_0
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_1

    .line 2
    sget-object v1, Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$2;->INSTANCE:Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$2;

    move-object v9, v1

    goto :goto_1

    :cond_1
    move-object/from16 v9, p7

    :goto_1
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_2

    .line 3
    sget-object v1, Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$3;->INSTANCE:Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$3;

    move-object v10, v1

    goto :goto_2

    :cond_2
    move-object/from16 v10, p8

    :goto_2
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_3

    .line 4
    sget-object v1, Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$4;->INSTANCE:Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$4;

    move-object v11, v1

    goto :goto_3

    :cond_3
    move-object/from16 v11, p9

    :goto_3
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_4

    .line 5
    sget-object v1, Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$5;->INSTANCE:Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$5;

    move-object v12, v1

    goto :goto_4

    :cond_4
    move-object/from16 v12, p10

    :goto_4
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_5

    .line 6
    sget-object v1, Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$6;->INSTANCE:Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$6;

    move-object v13, v1

    goto :goto_5

    :cond_5
    move-object/from16 v13, p11

    :goto_5
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_6

    .line 7
    sget-object v1, Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$7;->INSTANCE:Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$7;

    move-object v14, v1

    goto :goto_6

    :cond_6
    move-object/from16 v14, p12

    :goto_6
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_7

    .line 8
    sget-object v1, Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$8;->INSTANCE:Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$8;

    move-object v15, v1

    goto :goto_7

    :cond_7
    move-object/from16 v15, p13

    :goto_7
    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_8

    .line 9
    sget-object v1, Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$9;->INSTANCE:Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$9;

    move-object/from16 v16, v1

    goto :goto_8

    :cond_8
    move-object/from16 v16, p14

    :goto_8
    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_9

    .line 10
    sget-object v1, Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$10;->INSTANCE:Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$10;

    move-object/from16 v17, v1

    goto :goto_9

    :cond_9
    move-object/from16 v17, p15

    :goto_9
    const v1, 0x8000

    and-int/2addr v1, v0

    if-eqz v1, :cond_a

    .line 11
    sget-object v1, Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$11;->INSTANCE:Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$11;

    move-object/from16 v18, v1

    goto :goto_a

    :cond_a
    move-object/from16 v18, p16

    :goto_a
    const/high16 v1, 0x10000

    and-int/2addr v1, v0

    if-eqz v1, :cond_b

    const/4 v1, 0x0

    move/from16 v19, v1

    goto :goto_b

    :cond_b
    move/from16 v19, p17

    :goto_b
    const/high16 v1, 0x20000

    and-int/2addr v1, v0

    if-eqz v1, :cond_c

    .line 12
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v1

    move-object/from16 v20, v1

    goto :goto_c

    :cond_c
    move-object/from16 v20, p18

    :goto_c
    const/high16 v1, 0x40000

    and-int/2addr v0, v1

    if-eqz v0, :cond_d

    const/high16 v0, -0x40800000    # -1.0f

    move/from16 v21, v0

    goto :goto_d

    :cond_d
    move/from16 v21, p19

    :goto_d
    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move/from16 v5, p3

    move/from16 v6, p4

    move/from16 v7, p5

    .line 13
    invoke-static/range {v2 .. v21}, Lcom/discord/chat/presentation/textutils/TextUtilsKt;->toSpannable(Lcom/discord/chat/bridge/structurabletext/StructurableText;Landroid/content/Context;Ljava/lang/String;ZZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLcom/discord/theme/DiscordTheme;F)Lcom/facebook/drawee/span/DraweeSpanStringBuilder;

    move-result-object v0

    return-object v0
.end method

.method static synthetic toSpannable$default(Ljava/util/List;Lcom/discord/chat/presentation/textutils/RenderContext;Lcom/facebook/drawee/span/DraweeSpanStringBuilder;ILjava/lang/Object;)Lcom/facebook/drawee/span/DraweeSpanStringBuilder;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 14
    new-instance p2, Lcom/facebook/drawee/span/DraweeSpanStringBuilder;

    invoke-direct {p2}, Lcom/facebook/drawee/span/DraweeSpanStringBuilder;-><init>()V

    .line 15
    :cond_0
    invoke-static {p0, p1, p2}, Lcom/discord/chat/presentation/textutils/TextUtilsKt;->toSpannable(Ljava/util/List;Lcom/discord/chat/presentation/textutils/RenderContext;Lcom/facebook/drawee/span/DraweeSpanStringBuilder;)Lcom/facebook/drawee/span/DraweeSpanStringBuilder;

    move-result-object p0

    return-object p0
.end method
