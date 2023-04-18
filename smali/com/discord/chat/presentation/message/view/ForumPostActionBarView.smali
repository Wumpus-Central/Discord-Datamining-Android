.class public final Lcom/discord/chat/presentation/message/view/ForumPostActionBarView;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\'\u0008\u0007\u0012\u0006\u0010(\u001a\u00020\'\u0012\n\u0008\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\u0008\u0008\u0002\u0010+\u001a\u00020\u0013\u00a2\u0006\u0004\u0008,\u0010-Jb\u0010\u0011\u001a\u00020\u000c2\u0006\u0010\u0003\u001a\u00020\u00022\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000c0\u000b2\u0014\u0008\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000c0\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u00cf\u0001\u0010#\u001a\u00020\u000c2\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u00022\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000c0\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000c0\u000b2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008!\u0010\"R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008%\u0010&\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006."
    }
    d2 = {
        "Lcom/discord/chat/presentation/message/view/ForumPostActionBarView;",
        "Landroidx/constraintlayout/widget/ConstraintLayout;",
        "",
        "messageId",
        "",
        "Lcom/discord/reactions/ReactionView$Reaction;",
        "reactionsToDisplay",
        "Lcom/discord/reactions/ReactionView$ReactionsTheme;",
        "reactionsTheme",
        "Landroid/view/View$OnClickListener;",
        "onAddReactionClick",
        "Lkotlin/Function1;",
        "",
        "onReactionClick",
        "onReactionLongPress",
        "",
        "useSortedReactions",
        "setReactions",
        "Lcom/discord/primitives/MessageId;",
        "",
        "numDisplayedReactions",
        "isFollowing",
        "followIcon",
        "followLabel",
        "shareIcon",
        "shareLabel",
        "reactions",
        "defaultReaction",
        "canAddNewReactions",
        "addNewReactionAccessibilityLabel",
        "onTapFollowForumPost",
        "onTapShareForumPost",
        "onTapReactionOverflow",
        "configure-m9bs0RY",
        "(Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/discord/reactions/ReactionView$Reaction;ZLjava/lang/String;Lcom/discord/reactions/ReactionView$ReactionsTheme;Landroid/view/View$OnClickListener;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Z)V",
        "configure",
        "Lcom/discord/chat/databinding/ForumPostActionBarViewBinding;",
        "binding",
        "Lcom/discord/chat/databinding/ForumPostActionBarViewBinding;",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "defStyleAttr",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
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
.field private final binding:Lcom/discord/chat/databinding/ForumPostActionBarViewBinding;


# direct methods
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

    invoke-direct/range {v1 .. v6}, Lcom/discord/chat/presentation/message/view/ForumPostActionBarView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v1 .. v6}, Lcom/discord/chat/presentation/message/view/ForumPostActionBarView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1, p0}, Lcom/discord/chat/databinding/ForumPostActionBarViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/discord/chat/databinding/ForumPostActionBarViewBinding;

    move-result-object p1

    const-string p2, "inflate(LayoutInflater.from(context), this)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/discord/chat/presentation/message/view/ForumPostActionBarView;->binding:Lcom/discord/chat/databinding/ForumPostActionBarViewBinding;

    .line 4
    iget-object p2, p1, Lcom/discord/chat/databinding/ForumPostActionBarViewBinding;->footerDivider:Landroid/view/View;

    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object p3

    invoke-virtual {p3}, Lcom/discord/theme/DiscordTheme;->getBackgroundSecondary()I

    move-result p3

    invoke-virtual {p2, p3}, Landroid/view/View;->setBackgroundColor(I)V

    .line 5
    iget-object p2, p1, Lcom/discord/chat/databinding/ForumPostActionBarViewBinding;->headerDivider:Landroid/view/View;

    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object p3

    invoke-virtual {p3}, Lcom/discord/theme/DiscordTheme;->getBackgroundModifierAccent()I

    move-result p3

    invoke-virtual {p2, p3}, Landroid/view/View;->setBackgroundColor(I)V

    .line 6
    iget-object p2, p1, Lcom/discord/chat/databinding/ForumPostActionBarViewBinding;->followButton:Lcom/discord/core/DCDButton;

    const/16 p3, 0x8

    .line 7
    invoke-static {p3}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    move-result v0

    invoke-virtual {p2, v0}, Lcom/discord/core/DCDButton;->setCornerRadius(I)V

    const/high16 v0, 0x41600000    # 14.0f

    .line 8
    invoke-virtual {p2, v0}, Lcom/discord/core/DCDButton;->setTextSizeSp(F)V

    .line 9
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v1

    invoke-virtual {v1}, Lcom/discord/theme/DiscordTheme;->getBackgroundSecondary()I

    move-result v1

    invoke-virtual {p2, v1}, Lcom/discord/core/DCDButton;->setBackgroundColor(I)V

    .line 10
    iget-object p2, p1, Lcom/discord/chat/databinding/ForumPostActionBarViewBinding;->shareButton:Lcom/discord/core/DCDButton;

    .line 11
    invoke-static {p3}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    move-result p3

    invoke-virtual {p2, p3}, Lcom/discord/core/DCDButton;->setCornerRadius(I)V

    .line 12
    invoke-virtual {p2, v0}, Lcom/discord/core/DCDButton;->setTextSizeSp(F)V

    .line 13
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object p3

    invoke-virtual {p3}, Lcom/discord/theme/DiscordTheme;->getBackgroundSecondary()I

    move-result p3

    invoke-virtual {p2, p3}, Lcom/discord/core/DCDButton;->setBackgroundColor(I)V

    .line 14
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object p3

    invoke-virtual {p3}, Lcom/discord/theme/DiscordTheme;->getInteractiveNormal()I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/discord/core/DCDButton;->setTextColor(Ljava/lang/Integer;)V

    const/4 p3, 0x0

    .line 15
    invoke-virtual {p2, p3}, Lcom/discord/core/DCDButton;->setIconPadding(I)V

    .line 16
    iget-object p1, p1, Lcom/discord/chat/databinding/ForumPostActionBarViewBinding;->otherReactionsCount:Lcom/discord/core/DCDButton;

    .line 17
    sget-object p2, Lcom/discord/fonts/DiscordFont;->PrimarySemibold:Lcom/discord/fonts/DiscordFont;

    invoke-virtual {p1, p2}, Lcom/discord/core/DCDButton;->setDiscordFont(Lcom/discord/fonts/DiscordFont;)V

    .line 18
    invoke-virtual {p1, v0}, Lcom/discord/core/DCDButton;->setTextSizeSp(F)V

    .line 19
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object p2

    invoke-virtual {p2}, Lcom/discord/theme/DiscordTheme;->getBackgroundSecondary()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/discord/core/DCDButton;->setBackgroundColor(I)V

    .line 20
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object p2

    invoke-virtual {p2}, Lcom/discord/theme/DiscordTheme;->getInteractiveNormal()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/discord/core/DCDButton;->setTextColor(Ljava/lang/Integer;)V

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
    invoke-direct {p0, p1, p2, p3}, Lcom/discord/chat/presentation/message/view/ForumPostActionBarView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private final setReactions(Ljava/lang/String;Ljava/util/List;Lcom/discord/reactions/ReactionView$ReactionsTheme;Landroid/view/View$OnClickListener;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Z)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lcom/discord/reactions/ReactionView$Reaction;",
            ">;",
            "Lcom/discord/reactions/ReactionView$ReactionsTheme;",
            "Landroid/view/View$OnClickListener;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/discord/reactions/ReactionView$Reaction;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/discord/reactions/ReactionView$Reaction;",
            "Lkotlin/Unit;",
            ">;Z)V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/discord/chat/presentation/message/view/ForumPostActionBarView;->binding:Lcom/discord/chat/databinding/ForumPostActionBarViewBinding;

    .line 4
    .line 5
    iget-object v1, v1, Lcom/discord/chat/databinding/ForumPostActionBarViewBinding;->reactionsView:Lcom/discord/reactions/ReactionsView;

    .line 6
    .line 7
    const-string v2, "binding.reactionsView"

    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 14
    .line 15
    .line 16
    iget-object v1, v0, Lcom/discord/chat/presentation/message/view/ForumPostActionBarView;->binding:Lcom/discord/chat/databinding/ForumPostActionBarViewBinding;

    .line 17
    .line 18
    iget-object v3, v1, Lcom/discord/chat/databinding/ForumPostActionBarViewBinding;->reactionsView:Lcom/discord/reactions/ReactionsView;

    .line 19
    .line 20
    invoke-static {v3, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 v6, 0x0

    .line 24
    const-string v7, ""

    .line 25
    .line 26
    const-string v8, ""

    .line 27
    .line 28
    const/4 v13, 0x0

    .line 29
    sget-object v1, Lcom/discord/chat/presentation/root/ChatView;->Companion:Lcom/discord/chat/presentation/root/ChatView$Companion;

    .line 30
    .line 31
    invoke-virtual {v1}, Lcom/discord/chat/presentation/root/ChatView$Companion;->getAreChatAnimationsEnabled()Z

    .line 32
    .line 33
    .line 34
    move-result v14

    .line 35
    const/16 v16, 0x200

    .line 36
    .line 37
    const/16 v17, 0x0

    .line 38
    .line 39
    move-object/from16 v4, p1

    .line 40
    .line 41
    move-object/from16 v5, p2

    .line 42
    .line 43
    move-object/from16 v9, p3

    .line 44
    .line 45
    move-object/from16 v10, p4

    .line 46
    .line 47
    move-object/from16 v11, p5

    .line 48
    .line 49
    move-object/from16 v12, p6

    .line 50
    .line 51
    move/from16 v15, p7

    .line 52
    .line 53
    invoke-static/range {v3 .. v17}, Lcom/discord/reactions/ReactionsView;->setReactions$default(Lcom/discord/reactions/ReactionsView;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Lcom/discord/reactions/ReactionView$ReactionsTheme;Landroid/view/View$OnClickListener;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/discord/theme/DiscordTheme;ZZILjava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    return-void
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
.end method

.method static synthetic setReactions$default(Lcom/discord/chat/presentation/message/view/ForumPostActionBarView;Ljava/lang/String;Ljava/util/List;Lcom/discord/reactions/ReactionView$ReactionsTheme;Landroid/view/View$OnClickListener;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZILjava/lang/Object;)V
    .locals 9

    .line 1
    and-int/lit8 v0, p8, 0x20

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/discord/chat/presentation/message/view/ForumPostActionBarView$setReactions$1;->INSTANCE:Lcom/discord/chat/presentation/message/view/ForumPostActionBarView$setReactions$1;

    .line 6
    .line 7
    move-object v7, v0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object v7, p6

    .line 10
    :goto_0
    move-object v1, p0

    .line 11
    move-object v2, p1

    .line 12
    move-object v3, p2

    .line 13
    move-object v4, p3

    .line 14
    move-object v5, p4

    .line 15
    move-object v6, p5

    .line 16
    move/from16 v8, p7

    .line 17
    .line 18
    invoke-direct/range {v1 .. v8}, Lcom/discord/chat/presentation/message/view/ForumPostActionBarView;->setReactions(Ljava/lang/String;Ljava/util/List;Lcom/discord/reactions/ReactionView$ReactionsTheme;Landroid/view/View$OnClickListener;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Z)V

    .line 19
    .line 20
    .line 21
    return-void
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
.end method


# virtual methods
.method public final configure-m9bs0RY(Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/discord/reactions/ReactionView$Reaction;ZLjava/lang/String;Lcom/discord/reactions/ReactionView$ReactionsTheme;Landroid/view/View$OnClickListener;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Z)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "IZ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lcom/discord/reactions/ReactionView$Reaction;",
            ">;",
            "Lcom/discord/reactions/ReactionView$Reaction;",
            "Z",
            "Ljava/lang/String;",
            "Lcom/discord/reactions/ReactionView$ReactionsTheme;",
            "Landroid/view/View$OnClickListener;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/discord/reactions/ReactionView$Reaction;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/discord/reactions/ReactionView$Reaction;",
            "Lkotlin/Unit;",
            ">;",
            "Landroid/view/View$OnClickListener;",
            "Landroid/view/View$OnClickListener;",
            "Landroid/view/View$OnClickListener;",
            "Z)V"
        }
    .end annotation

    move-object/from16 v10, p0

    move-object/from16 v11, p4

    move-object/from16 v12, p5

    move-object/from16 v13, p6

    move-object/from16 v14, p7

    move-object/from16 v8, p8

    move-object/from16 v15, p11

    move-object/from16 v9, p13

    move-object/from16 v7, p16

    move-object/from16 v6, p17

    move-object/from16 v5, p18

    const-string v0, "messageId"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "followIcon"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "followLabel"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "shareIcon"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "shareLabel"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "addNewReactionAccessibilityLabel"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onAddReactionClick"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onReactionClick"

    move-object/from16 v4, p14

    invoke-static {v4, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onReactionLongPress"

    move-object/from16 v3, p15

    invoke-static {v3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onTapFollowForumPost"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onTapShareForumPost"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onTapReactionOverflow"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x1

    if-eqz v8, :cond_1

    .line 1
    invoke-interface/range {p8 .. p8}, Ljava/util/Collection;->isEmpty()Z

    move-result v16

    if-eqz v16, :cond_0

    goto :goto_0

    :cond_0
    const/16 v16, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    move/from16 v16, v2

    :goto_1
    const-string v0, "binding.reactionsView"

    const/16 v9, 0x8

    if-eqz v16, :cond_3

    .line 2
    iget-object v3, v10, Lcom/discord/chat/presentation/message/view/ForumPostActionBarView;->binding:Lcom/discord/chat/databinding/ForumPostActionBarViewBinding;

    iget-object v3, v3, Lcom/discord/chat/databinding/ForumPostActionBarViewBinding;->otherReactionsCount:Lcom/discord/core/DCDButton;

    const-string v5, "binding.otherReactionsCount"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-virtual {v3, v9}, Landroid/view/View;->setVisibility(I)V

    if-eqz p9, :cond_2

    if-eqz p10, :cond_2

    .line 4
    invoke-static/range {p9 .. p9}, Lkotlin/collections/h;->d(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    .line 5
    invoke-static/range {p1 .. p1}, Lcom/discord/primitives/MessageId;->toString-impl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v8, 0x0

    const/16 v16, 0x20

    const/16 v18, 0x0

    const/4 v5, 0x0

    move-object/from16 v0, p0

    move-object v2, v3

    move-object/from16 v3, p12

    move-object/from16 v4, p13

    move-object/from16 v5, p14

    move-object v6, v8

    move-object v8, v7

    move/from16 v7, p19

    move/from16 v8, v16

    move v14, v9

    const/4 v15, 0x2

    move-object/from16 v9, v18

    .line 6
    invoke-static/range {v0 .. v9}, Lcom/discord/chat/presentation/message/view/ForumPostActionBarView;->setReactions$default(Lcom/discord/chat/presentation/message/view/ForumPostActionBarView;Ljava/lang/String;Ljava/util/List;Lcom/discord/reactions/ReactionView$ReactionsTheme;Landroid/view/View$OnClickListener;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZILjava/lang/Object;)V

    goto :goto_2

    :cond_2
    move v14, v9

    const/4 v15, 0x2

    .line 7
    iget-object v1, v10, Lcom/discord/chat/presentation/message/view/ForumPostActionBarView;->binding:Lcom/discord/chat/databinding/ForumPostActionBarViewBinding;

    iget-object v1, v1, Lcom/discord/chat/databinding/ForumPostActionBarViewBinding;->reactionsView:Lcom/discord/reactions/ReactionsView;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-virtual {v1, v14}, Landroid/view/View;->setVisibility(I)V

    :goto_2
    const/4 v0, 0x0

    const/4 v9, 0x0

    goto/16 :goto_6

    :cond_3
    move v14, v9

    const/4 v15, 0x2

    move v9, v2

    add-int/lit8 v7, p2, -0x1

    .line 9
    invoke-static {v8, v7}, Lkotlin/collections/h;->x0(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v2

    .line 10
    iget-object v4, v10, Lcom/discord/chat/presentation/message/view/ForumPostActionBarView;->binding:Lcom/discord/chat/databinding/ForumPostActionBarViewBinding;

    iget-object v4, v4, Lcom/discord/chat/databinding/ForumPostActionBarViewBinding;->reactionsView:Lcom/discord/reactions/ReactionsView;

    invoke-static {v4, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x0

    .line 11
    invoke-virtual {v4, v6}, Landroid/view/View;->setVisibility(I)V

    .line 12
    invoke-static/range {p1 .. p1}, Lcom/discord/primitives/MessageId;->toString-impl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v0, p0

    move-object/from16 v3, p12

    move-object/from16 v4, p13

    move-object v14, v5

    move-object/from16 v5, p14

    move v9, v6

    move-object/from16 v6, p15

    move/from16 v17, v7

    move/from16 v7, p19

    .line 13
    invoke-direct/range {v0 .. v7}, Lcom/discord/chat/presentation/message/view/ForumPostActionBarView;->setReactions(Ljava/lang/String;Ljava/util/List;Lcom/discord/reactions/ReactionView$ReactionsTheme;Landroid/view/View$OnClickListener;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Z)V

    .line 14
    invoke-interface/range {p8 .. p8}, Ljava/util/List;->size()I

    move-result v0

    sub-int v0, v0, v17

    invoke-static {v0, v9}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 15
    iget-object v1, v10, Lcom/discord/chat/presentation/message/view/ForumPostActionBarView;->binding:Lcom/discord/chat/databinding/ForumPostActionBarViewBinding;

    iget-object v1, v1, Lcom/discord/chat/databinding/ForumPostActionBarViewBinding;->otherReactionsCount:Lcom/discord/core/DCDButton;

    const-string v2, "configure_m9bs0RY$lambda$3"

    .line 16
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v0, :cond_4

    const/4 v2, 0x1

    goto :goto_3

    :cond_4
    move v2, v9

    :goto_3
    if-eqz v2, :cond_5

    move v2, v9

    goto :goto_4

    :cond_5
    const/16 v2, 0x8

    .line 17
    :goto_4
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 18
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v2

    if-nez v2, :cond_6

    const/4 v2, 0x1

    goto :goto_5

    :cond_6
    move v2, v9

    :goto_5
    if-eqz v2, :cond_7

    .line 19
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "context"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lcom/discord/react_strings/I18nMessage;->FORUM_REACTIONS_OVERFLOW:Lcom/discord/react_strings/I18nMessage;

    new-instance v4, Lcom/discord/chat/presentation/message/view/ForumPostActionBarView$configure$1$1;

    invoke-direct {v4, v0}, Lcom/discord/chat/presentation/message/view/ForumPostActionBarView$configure$1$1;-><init>(I)V

    invoke-static {v2, v3, v4}, Lcom/discord/react_strings/I18nUtilsKt;->i18nFormat(Landroid/content/Context;Lcom/discord/react_strings/I18nMessage;Lkotlin/jvm/functions/Function1;)Ljava/lang/CharSequence;

    move-result-object v0

    .line 20
    invoke-virtual {v1, v0}, Lcom/discord/core/DCDButton;->setText(Ljava/lang/CharSequence;)V

    const/4 v0, 0x0

    const/4 v2, 0x1

    .line 21
    invoke-static {v1, v2, v9, v15, v0}, Lcom/discord/ripple/RippleUtilsKt;->addRipple$default(Landroid/view/View;ZIILjava/lang/Object;)V

    .line 22
    invoke-virtual {v1, v14}, Lcom/discord/core/DCDButton;->setOnClickButtonListener(Landroid/view/View$OnClickListener;)V

    goto :goto_6

    :cond_7
    const/4 v0, 0x0

    .line 23
    :goto_6
    iget-object v1, v10, Lcom/discord/chat/presentation/message/view/ForumPostActionBarView;->binding:Lcom/discord/chat/databinding/ForumPostActionBarViewBinding;

    iget-object v1, v1, Lcom/discord/chat/databinding/ForumPostActionBarViewBinding;->followButton:Lcom/discord/core/DCDButton;

    const/16 v2, 0x10

    .line 24
    invoke-static {v2}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    move-result v3

    invoke-virtual {v1, v11, v3}, Lcom/discord/core/DCDButton;->setIcon(Ljava/lang/String;I)V

    .line 25
    invoke-virtual {v1, v12}, Lcom/discord/core/DCDButton;->setText(Ljava/lang/CharSequence;)V

    if-eqz p3, :cond_8

    .line 26
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v3

    invoke-virtual {v3}, Lcom/discord/theme/DiscordTheme;->getTextBrand()I

    move-result v3

    goto :goto_7

    .line 27
    :cond_8
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v3

    invoke-virtual {v3}, Lcom/discord/theme/DiscordTheme;->getInteractiveNormal()I

    move-result v3

    .line 28
    :goto_7
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/discord/core/DCDButton;->setTextColor(Ljava/lang/Integer;)V

    move-object/from16 v3, p16

    .line 29
    invoke-virtual {v1, v3}, Lcom/discord/core/DCDButton;->setOnClickButtonListener(Landroid/view/View$OnClickListener;)V

    .line 30
    iget-object v1, v10, Lcom/discord/chat/presentation/message/view/ForumPostActionBarView;->binding:Lcom/discord/chat/databinding/ForumPostActionBarViewBinding;

    iget-object v1, v1, Lcom/discord/chat/databinding/ForumPostActionBarViewBinding;->shareButton:Lcom/discord/core/DCDButton;

    .line 31
    invoke-static {v2}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    move-result v2

    invoke-virtual {v1, v13, v2}, Lcom/discord/core/DCDButton;->setIcon(Ljava/lang/String;I)V

    move-object/from16 v2, p17

    .line 32
    invoke-virtual {v1, v2}, Lcom/discord/core/DCDButton;->setOnClickButtonListener(Landroid/view/View$OnClickListener;)V

    move-object v2, v0

    move-object/from16 v0, p7

    .line 33
    invoke-virtual {v1, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 34
    iget-object v0, v10, Lcom/discord/chat/presentation/message/view/ForumPostActionBarView;->binding:Lcom/discord/chat/databinding/ForumPostActionBarViewBinding;

    iget-object v0, v0, Lcom/discord/chat/databinding/ForumPostActionBarViewBinding;->addReaction:Lcom/discord/reactions/AddReactionView;

    const-string v1, "configure_m9bs0RY$lambda$6"

    .line 35
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p10, :cond_9

    move v1, v9

    goto :goto_8

    :cond_9
    const/16 v1, 0x8

    .line 36
    :goto_8
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 37
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v1

    if-nez v1, :cond_a

    const/4 v1, 0x1

    goto :goto_9

    :cond_a
    move v1, v9

    :goto_9
    if-eqz v1, :cond_b

    const/4 v1, 0x1

    .line 38
    invoke-static {v0, v1, v9, v15, v2}, Lcom/discord/ripple/RippleUtilsKt;->addRipple$default(Landroid/view/View;ZIILjava/lang/Object;)V

    move-object/from16 v3, p11

    .line 39
    invoke-virtual {v0, v3}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    move-object/from16 v3, p13

    .line 40
    invoke-static {v0, v9, v3, v1, v2}, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchUtilsKt;->setOnClickListenerNested$default(Landroid/view/View;ZLandroid/view/View$OnClickListener;ILjava/lang/Object;)V

    :cond_b
    return-void
.end method
