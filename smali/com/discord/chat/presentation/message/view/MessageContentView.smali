.class public final Lcom/discord/chat/presentation/message/view/MessageContentView;
.super Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;
.source "SourceFile"

# interfaces
.implements Lcom/discord/recycler_view/decorations/VerticalSpacingItemDecoration$SpacingProviderView;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/chat/presentation/message/view/MessageContentView$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000 F2\u00020\u00012\u00020\u0002:\u0001FB\'\u0008\u0007\u0012\u0006\u0010@\u001a\u00020?\u0012\n\u0008\u0002\u0010B\u001a\u0004\u0018\u00010A\u0012\u0008\u0008\u0002\u0010C\u001a\u00020\u0007\u00a2\u0006\u0004\u0008D\u0010EJI\u0010\u0010\u001a\u00020\u000c2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000c0\u000bH\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0018\u0010\u0014\u001a\u00020\u000c2\u0006\u0010\n\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u008d\u0003\u00103\u001a\u00020\u000c2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00172\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000c0\u001b2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000c0\u000b2\"\u0010 \u001a\u001e\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u000c0\u001f2*\u0010\"\u001a&\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u000c0!2\u0018\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000c0\u001b2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u000c0\u000b2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u000c0\u000b2\u000c\u0010(\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\'2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000c0\u000b2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u000c0\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000c0\u000b2\u0014\u0008\u0002\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020,0\u000b2\u0006\u0010.\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u00072\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u00100\u001a\u00020/\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u00081\u00102J\u0012\u00106\u001a\u00020\u000c2\u0008\u00105\u001a\u0004\u0018\u000104H\u0016J\u0011\u00107\u001a\u0004\u0018\u00010\u0007H\u0016\u00a2\u0006\u0004\u00087\u00108R\u0018\u0010.\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008.\u00109R\u001b\u0010>\u001a\u00020\u00018BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008:\u0010;\u001a\u0004\u0008<\u0010=\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006G"
    }
    d2 = {
        "Lcom/discord/chat/presentation/message/view/MessageContentView;",
        "Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;",
        "Lcom/discord/recycler_view/decorations/VerticalSpacingItemDecoration$SpacingProviderView;",
        "Lcom/discord/primitives/MessageId;",
        "messageId",
        "Lcom/discord/chat/bridge/truncation/Truncation;",
        "truncation",
        "",
        "constrainedWidth",
        "Lcom/facebook/drawee/span/DraweeSpanStringBuilder;",
        "spannableStringBuilder",
        "Lkotlin/Function1;",
        "",
        "onTapSeeMore",
        "truncate-pPZZVto",
        "(Ljava/lang/String;Lcom/discord/chat/bridge/truncation/Truncation;ILcom/facebook/drawee/span/DraweeSpanStringBuilder;Lkotlin/jvm/functions/Function1;)V",
        "truncate",
        "Landroid/text/SpannableStringBuilder;",
        "",
        "editedLabel",
        "appendEditedLabel",
        "Lcom/discord/chat/bridge/structurabletext/StructurableText;",
        "messageContent",
        "",
        "shouldAnimateEmoji",
        "shouldShowRoleDot",
        "shouldShowRoleOnName",
        "Lkotlin/Function2;",
        "Lcom/discord/chat/bridge/contentnode/LinkContentNode;",
        "onTapLink",
        "onLongTapLink",
        "Lkotlin/Function3;",
        "onTapChannel",
        "Lkotlin/Function4;",
        "onLongPressChannel",
        "onTapMention",
        "Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;",
        "onTapCommand",
        "onLongPressCommand",
        "Lkotlin/Function0;",
        "onTapSpoiler",
        "onTapTimestamp",
        "Lcom/discord/chat/bridge/contentnode/EmojiContentNode;",
        "onTapEmoji",
        "Lcom/discord/chat/presentation/textutils/LinkStyle;",
        "linkStyleProvider",
        "bottomSpacingPx",
        "Lcom/discord/theme/DiscordTheme;",
        "theme",
        "setMessageContent-2i9KL1s",
        "(Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;ZZZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILjava/lang/String;Lcom/discord/chat/bridge/truncation/Truncation;Lcom/discord/theme/DiscordTheme;)V",
        "setMessageContent",
        "Landroid/view/View$OnClickListener;",
        "l",
        "setOnClickListener",
        "spacingPxOverride",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "shadowView$delegate",
        "Lkotlin/Lazy;",
        "getShadowView",
        "()Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;",
        "shadowView",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "defStyleAttr",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "Companion",
        "chat_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final Companion:Lcom/discord/chat/presentation/message/view/MessageContentView$Companion;

.field private static final LINE_SPACING_ADD:F = 0.0f

.field private static final LINE_SPACING_MULT:F = 1.05f


# instance fields
.field private bottomSpacingPx:Ljava/lang/Integer;

.field private final shadowView$delegate:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/discord/chat/presentation/message/view/MessageContentView$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/chat/presentation/message/view/MessageContentView$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/chat/presentation/message/view/MessageContentView;->Companion:Lcom/discord/chat/presentation/message/view/MessageContentView$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/discord/chat/presentation/message/view/MessageContentView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/discord/chat/presentation/message/view/MessageContentView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    new-instance p1, Lcom/discord/chat/presentation/message/view/MessageContentView$shadowView$2;

    invoke-direct {p1, p0}, Lcom/discord/chat/presentation/message/view/MessageContentView$shadowView$2;-><init>(Lcom/discord/chat/presentation/message/view/MessageContentView;)V

    invoke-static {p1}, Llf/m;->a(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/discord/chat/presentation/message/view/MessageContentView;->shadowView$delegate:Lkotlin/Lazy;

    const/4 p1, 0x0

    const p2, 0x3f866666    # 1.05f

    .line 4
    invoke-virtual {p0, p1, p2}, Landroid/widget/TextView;->setLineSpacing(FF)V

    const/4 p1, 0x4

    .line 5
    invoke-virtual {p0, p1}, Landroid/view/View;->setImportantForAccessibility(I)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 1
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/discord/chat/presentation/message/view/MessageContentView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private final appendEditedLabel(Landroid/text/SpannableStringBuilder;Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const-class v2, Lcom/discord/span/utilities/spannable/QuoteSpan;

    .line 10
    .line 11
    invoke-virtual {p1, v0, v1, v2}, Landroid/text/SpannableStringBuilder;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "spannableStringBuilder.g\u2026an::class.java,\n        )"

    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Lkotlin/collections/b;->E([Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Lcom/discord/span/utilities/spannable/QuoteSpan;

    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    new-instance v2, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 33
    .line 34
    .line 35
    const-string v3, " ("

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string p2, ")"

    .line 44
    .line 45
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    invoke-virtual {p1, p2}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 53
    .line 54
    .line 55
    new-instance p2, Landroid/text/style/RelativeSizeSpan;

    .line 56
    .line 57
    const/high16 v2, 0x3f400000    # 0.75f

    .line 58
    .line 59
    invoke-direct {p2, v2}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    const/16 v3, 0x21

    .line 67
    .line 68
    invoke-virtual {p1, p2, v1, v2, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 69
    .line 70
    .line 71
    new-instance p2, Landroid/text/style/ForegroundColorSpan;

    .line 72
    .line 73
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual {v2}, Lcom/discord/theme/DiscordTheme;->getTextMuted()I

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    invoke-direct {p2, v2}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    invoke-virtual {p1, p2, v1, v2, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 89
    .line 90
    .line 91
    if-eqz v0, :cond_0

    .line 92
    .line 93
    invoke-virtual {p1, v0}, Landroid/text/SpannableStringBuilder;->getSpanStart(Ljava/lang/Object;)I

    .line 94
    .line 95
    .line 96
    move-result p2

    .line 97
    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    invoke-virtual {p1, v0}, Landroid/text/SpannableStringBuilder;->getSpanFlags(Ljava/lang/Object;)I

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    invoke-virtual {p1, v0, p2, v1, v2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 106
    .line 107
    .line 108
    :cond_0
    return-void
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

.method private final getShadowView()Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/MessageContentView;->shadowView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;

    return-object v0
.end method

.method public static synthetic setMessageContent-2i9KL1s$default(Lcom/discord/chat/presentation/message/view/MessageContentView;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;ZZZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILjava/lang/String;Lcom/discord/chat/bridge/truncation/Truncation;Lcom/discord/theme/DiscordTheme;ILjava/lang/Object;)V
    .locals 24

    const/high16 v0, 0x10000

    and-int v0, p23, v0

    if-eqz v0, :cond_0

    .line 1
    sget-object v0, Lcom/discord/chat/presentation/message/view/MessageContentView$setMessageContent$1;->INSTANCE:Lcom/discord/chat/presentation/message/view/MessageContentView$setMessageContent$1;

    move-object/from16 v18, v0

    goto :goto_0

    :cond_0
    move-object/from16 v18, p17

    :goto_0
    const/high16 v0, 0x80000

    and-int v0, p23, v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    move-object/from16 v21, v1

    goto :goto_1

    :cond_1
    move-object/from16 v21, p20

    :goto_1
    const/high16 v0, 0x100000

    and-int v0, p23, v0

    if-eqz v0, :cond_2

    move-object/from16 v22, v1

    goto :goto_2

    :cond_2
    move-object/from16 v22, p21

    :goto_2
    const/high16 v0, 0x200000

    and-int v0, p23, v0

    if-eqz v0, :cond_3

    .line 2
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v0

    move-object/from16 v23, v0

    goto :goto_3

    :cond_3
    move-object/from16 v23, p22

    :goto_3
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move/from16 v19, p18

    move/from16 v20, p19

    .line 3
    invoke-virtual/range {v1 .. v23}, Lcom/discord/chat/presentation/message/view/MessageContentView;->setMessageContent-2i9KL1s(Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;ZZZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILjava/lang/String;Lcom/discord/chat/bridge/truncation/Truncation;Lcom/discord/theme/DiscordTheme;)V

    return-void
.end method

.method private final truncate-pPZZVto(Ljava/lang/String;Lcom/discord/chat/bridge/truncation/Truncation;ILcom/facebook/drawee/span/DraweeSpanStringBuilder;Lkotlin/jvm/functions/Function1;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/discord/chat/bridge/truncation/Truncation;",
            "I",
            "Lcom/facebook/drawee/span/DraweeSpanStringBuilder;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/discord/primitives/MessageId;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Lcom/discord/chat/bridge/truncation/Truncation;->getForceShow()Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p2}, Lcom/discord/chat/bridge/truncation/Truncation;->getNumberOfLines()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-virtual {p2}, Lcom/discord/chat/bridge/truncation/Truncation;->getSeeMoreLabel()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {p2}, Lcom/discord/chat/bridge/truncation/Truncation;->getSeeMoreLabelColor()Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    sget-object v3, Lcom/discord/chat/presentation/message/MessageAccessoriesView;->Companion:Lcom/discord/chat/presentation/message/MessageAccessoriesView$Companion;

    .line 24
    .line 25
    invoke-virtual {v3, p3}, Lcom/discord/chat/presentation/message/MessageAccessoriesView$Companion;->getWidth(I)I

    .line 26
    .line 27
    .line 28
    move-result p3

    .line 29
    invoke-direct {p0}, Lcom/discord/chat/presentation/message/view/MessageContentView;->getShadowView()Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-virtual {p0}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 38
    .line 39
    .line 40
    invoke-direct {p0}, Lcom/discord/chat/presentation/message/view/MessageContentView;->getShadowView()Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-virtual {p0}, Landroid/widget/TextView;->getTextSize()F

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    const/4 v5, 0x0

    .line 49
    invoke-virtual {v3, v5, v4}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 50
    .line 51
    .line 52
    invoke-direct {p0}, Lcom/discord/chat/presentation/message/view/MessageContentView;->getShadowView()Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    const/4 v4, 0x0

    .line 57
    const v6, 0x3f866666    # 1.05f

    .line 58
    .line 59
    .line 60
    invoke-virtual {v3, v4, v6}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 61
    .line 62
    .line 63
    invoke-direct {p0}, Lcom/discord/chat/presentation/message/view/MessageContentView;->getShadowView()Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-virtual {v3, p4}, Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;->setDraweeSpanStringBuilder(Lcom/facebook/drawee/span/DraweeSpanStringBuilder;)V

    .line 68
    .line 69
    .line 70
    invoke-direct {p0}, Lcom/discord/chat/presentation/message/view/MessageContentView;->getShadowView()Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    const/high16 v4, 0x40000000    # 2.0f

    .line 75
    .line 76
    invoke-static {p3, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 77
    .line 78
    .line 79
    move-result p3

    .line 80
    invoke-static {v5, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    invoke-virtual {v3, p3, v4}, Landroid/view/View;->measure(II)V

    .line 85
    .line 86
    .line 87
    invoke-direct {p0}, Lcom/discord/chat/presentation/message/view/MessageContentView;->getShadowView()Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;

    .line 88
    .line 89
    .line 90
    move-result-object p3

    .line 91
    invoke-direct {p0}, Lcom/discord/chat/presentation/message/view/MessageContentView;->getShadowView()Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    invoke-direct {p0}, Lcom/discord/chat/presentation/message/view/MessageContentView;->getShadowView()Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    invoke-virtual {p3, v5, v5, v3, v4}, Landroid/view/View;->layout(IIII)V

    .line 108
    .line 109
    .line 110
    invoke-direct {p0}, Lcom/discord/chat/presentation/message/view/MessageContentView;->getShadowView()Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;

    .line 111
    .line 112
    .line 113
    move-result-object p3

    .line 114
    invoke-virtual {p3}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    .line 115
    .line 116
    .line 117
    move-result-object p3

    .line 118
    invoke-direct {p0}, Lcom/discord/chat/presentation/message/view/MessageContentView;->getShadowView()Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    invoke-virtual {v3}, Landroid/widget/TextView;->getLineCount()I

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    if-gt v3, v1, :cond_0

    .line 127
    .line 128
    if-eqz v0, :cond_3

    .line 129
    .line 130
    :cond_0
    if-eqz v0, :cond_1

    .line 131
    .line 132
    add-int/lit8 v3, v3, -0x1

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_1
    add-int/lit8 v3, v1, -0x1

    .line 136
    .line 137
    :goto_0
    invoke-virtual {p3, v3}, Landroid/text/Layout;->getLineVisibleEnd(I)I

    .line 138
    .line 139
    .line 140
    move-result p3

    .line 141
    new-instance v0, Ljava/lang/StringBuilder;

    .line 142
    .line 143
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 144
    .line 145
    .line 146
    const-string v1, "\n"

    .line 147
    .line 148
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-virtual {p4}, Landroid/text/SpannableStringBuilder;->length()I

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    invoke-virtual {p4, p3, v1, v0}, Landroid/text/SpannableStringBuilder;->replace(IILjava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 163
    .line 164
    .line 165
    new-instance v0, Lcom/discord/span/utilities/spannable/ClickableSpan;

    .line 166
    .line 167
    sget-object v3, Lcom/discord/react_gesture_handler/nested_touch/NestedClickableSpan$TouchPriority;->HIGH:Lcom/discord/react_gesture_handler/nested_touch/NestedClickableSpan$TouchPriority;

    .line 168
    .line 169
    if-eqz p2, :cond_2

    .line 170
    .line 171
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 172
    .line 173
    .line 174
    move-result p2

    .line 175
    goto :goto_1

    .line 176
    :cond_2
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    .line 177
    .line 178
    .line 179
    move-result-object p2

    .line 180
    invoke-virtual {p2}, Lcom/discord/theme/DiscordTheme;->getTextLink()I

    .line 181
    .line 182
    .line 183
    move-result p2

    .line 184
    :goto_1
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 185
    .line 186
    .line 187
    move-result-object v4

    .line 188
    const/4 v5, 0x0

    .line 189
    new-instance v6, Lcom/discord/chat/presentation/message/view/MessageContentView$truncate$1;

    .line 190
    .line 191
    invoke-direct {v6, p5, p1}, Lcom/discord/chat/presentation/message/view/MessageContentView$truncate$1;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    const/4 v7, 0x4

    .line 195
    const/4 v8, 0x0

    .line 196
    move-object v2, v0

    .line 197
    invoke-direct/range {v2 .. v8}, Lcom/discord/span/utilities/spannable/ClickableSpan;-><init>(Lcom/discord/react_gesture_handler/nested_touch/NestedClickableSpan$TouchPriority;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {p4}, Landroid/text/SpannableStringBuilder;->length()I

    .line 201
    .line 202
    .line 203
    move-result p1

    .line 204
    const/16 p2, 0x21

    .line 205
    .line 206
    invoke-virtual {p4, v0, p3, p1, p2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 207
    .line 208
    .line 209
    new-instance p1, Lcom/discord/span/utilities/spannable/BoldSpan;

    .line 210
    .line 211
    invoke-direct {p1}, Lcom/discord/span/utilities/spannable/BoldSpan;-><init>()V

    .line 212
    .line 213
    .line 214
    invoke-virtual {p4}, Landroid/text/SpannableStringBuilder;->length()I

    .line 215
    .line 216
    .line 217
    move-result p5

    .line 218
    invoke-virtual {p4, p1, p3, p5, p2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 219
    .line 220
    .line 221
    :cond_3
    return-void
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
.method public final setMessageContent-2i9KL1s(Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;ZZZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILjava/lang/String;Lcom/discord/chat/bridge/truncation/Truncation;Lcom/discord/theme/DiscordTheme;)V
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/chat/bridge/structurabletext/StructurableText;",
            "Ljava/lang/String;",
            "ZZZ",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lcom/discord/primitives/MessageId;",
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
            "Lkotlin/jvm/functions/Function0<",
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
            "Lcom/discord/primitives/MessageId;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/discord/chat/bridge/contentnode/LinkContentNode;",
            "Lcom/discord/chat/presentation/textutils/LinkStyle;",
            ">;II",
            "Ljava/lang/String;",
            "Lcom/discord/chat/bridge/truncation/Truncation;",
            "Lcom/discord/theme/DiscordTheme;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v7, p2

    move-object/from16 v2, p6

    move-object/from16 v15, p20

    move-object/from16 v1, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v17, p13

    move-object/from16 v14, p14

    move-object v0, v15

    move-object/from16 v15, p15

    move-object/from16 v16, p17

    move-object/from16 v19, p22

    const-string v0, "messageContent"

    move-object/from16 v23, v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageId"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onTapLink"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onLongTapLink"

    move-object/from16 v1, p7

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onTapChannel"

    move-object/from16 v1, p8

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onLongPressChannel"

    move-object/from16 v1, p9

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onTapMention"

    move-object/from16 v1, p10

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onTapCommand"

    move-object/from16 v1, p11

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onLongPressCommand"

    move-object/from16 v1, p12

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onTapSpoiler"

    move-object/from16 v1, p13

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onTapTimestamp"

    move-object/from16 v1, p14

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onTapEmoji"

    move-object/from16 v1, p15

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onTapSeeMore"

    move-object/from16 v1, p16

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkStyleProvider"

    move-object/from16 v1, p17

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "theme"

    move-object/from16 v1, p22

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    move-object v1, v2

    move-object v2, v0

    .line 2
    invoke-virtual/range {p0 .. p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object v7

    move-object/from16 p1, v2

    const-string v2, "paint.fontMetrics"

    invoke-static {v7, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v7}, Lcom/discord/chat/presentation/textutils/TextUtilsKt;->getBaselineHeight(Landroid/graphics/Paint$FontMetrics;)F

    move-result v20

    const-string v2, "context"

    .line 3
    invoke-static {v0, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    new-instance v0, Lcom/discord/chat/presentation/message/view/MessageContentView$setMessageContent$spannableStringBuilder$1;

    move-object/from16 v2, p2

    move-object v7, v0

    invoke-direct {v0, v1, v2}, Lcom/discord/chat/presentation/message/view/MessageContentView$setMessageContent$spannableStringBuilder$1;-><init>(Lkotlin/jvm/functions/Function2;Ljava/lang/String;)V

    const/16 v18, 0x0

    const/high16 v21, 0x10000

    const/16 v22, 0x0

    move-object/from16 v2, p1

    move-object/from16 v1, v23

    invoke-static/range {v1 .. v22}, Lcom/discord/chat/presentation/textutils/TextUtilsKt;->toSpannable$default(Lcom/discord/chat/bridge/structurabletext/StructurableText;Landroid/content/Context;Ljava/lang/String;ZZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLcom/discord/theme/DiscordTheme;FILjava/lang/Object;)Lcom/facebook/drawee/span/DraweeSpanStringBuilder;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz p20, :cond_1

    .line 5
    invoke-static/range {p20 .. p20}, Lpi/l;->w(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    move v2, v1

    :goto_1
    if-nez v2, :cond_2

    move-object/from16 v2, p0

    move-object/from16 v3, p20

    .line 6
    invoke-direct {v2, v0, v3}, Lcom/discord/chat/presentation/message/view/MessageContentView;->appendEditedLabel(Landroid/text/SpannableStringBuilder;Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    move-object/from16 v2, p0

    :goto_2
    if-eqz p21, :cond_3

    move-object/from16 p3, p0

    move-object/from16 p4, p2

    move-object/from16 p5, p21

    move/from16 p6, p19

    move-object/from16 p7, v0

    move-object/from16 p8, p16

    .line 7
    invoke-direct/range {p3 .. p8}, Lcom/discord/chat/presentation/message/view/MessageContentView;->truncate-pPZZVto(Ljava/lang/String;Lcom/discord/chat/bridge/truncation/Truncation;ILcom/facebook/drawee/span/DraweeSpanStringBuilder;Lkotlin/jvm/functions/Function1;)V

    .line 8
    :cond_3
    new-instance v3, Lcom/discord/span/utilities/BackgroundSpanDrawer;

    invoke-direct {v3, v2}, Lcom/discord/span/utilities/BackgroundSpanDrawer;-><init>(Landroid/widget/TextView;)V

    invoke-static {v0, v3}, Lcom/discord/span/utilities/SpannableExtensionsKt;->coverWithSpan(Landroid/text/Spannable;Ljava/lang/Object;)V

    .line 9
    invoke-virtual {v2, v0}, Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;->setDraweeSpanStringBuilder(Lcom/facebook/drawee/span/DraweeSpanStringBuilder;)V

    .line 10
    invoke-static/range {p18 .. p18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, v2, Lcom/discord/chat/presentation/message/view/MessageContentView;->bottomSpacingPx:Ljava/lang/Integer;

    .line 11
    invoke-static {v2, v1}, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchUtilsKt;->enableNestedSpanClickListener(Landroid/widget/TextView;Z)V

    return-void
.end method

.method public setOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "MessageContentView uses custom touch handling. click listeners are not supported"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public spacingPxOverride()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/MessageContentView;->bottomSpacingPx:Ljava/lang/Integer;

    return-object v0
.end method
