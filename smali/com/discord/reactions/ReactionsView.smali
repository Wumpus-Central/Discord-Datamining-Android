.class public final Lcom/discord/reactions/ReactionsView;
.super Landroidx/recyclerview/widget/RecyclerView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/reactions/ReactionsView$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u001b\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u00aa\u0001\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000c2\u0006\u0010\u0014\u001a\u00020\u000c2\u0006\u0010\u0015\u001a\u00020\u000c2\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00192\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u00192\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\u001c2\u0014\u0008\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\u001c2\n\u0008\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0008\u0008\u0002\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u0011R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"
    }
    d2 = {
        "Lcom/discord/reactions/ReactionsView;",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "adapter",
        "Lcom/discord/reactions/ReactionsViewAdapter;",
        "setReactions",
        "",
        "messageId",
        "",
        "reactions",
        "",
        "Lcom/discord/reactions/ReactionView$Reaction;",
        "canAddNewReactions",
        "",
        "canAddNewBurstReactions",
        "addReactionLabel",
        "addNewReactionAccessibilityLabel",
        "addNewBurstReactionAccessibilityLabel",
        "reactionsTheme",
        "Lcom/discord/reactions/ReactionView$ReactionsTheme;",
        "onAddReactionClick",
        "Landroid/view/View$OnClickListener;",
        "onAddBurstReactionClick",
        "onReactionClick",
        "Lkotlin/Function1;",
        "onReactionLongPress",
        "theme",
        "Lcom/discord/theme/DiscordTheme;",
        "areChatAnimationsEnabled",
        "sortReactions",
        "Companion",
        "reactions_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/discord/reactions/ReactionsView$Companion;

.field private static final REACTION_HEIGHT:I

.field private static final sharedViewPool$delegate:Lkotlin/Lazy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/Lazy<",
            "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final adapter:Lcom/discord/reactions/ReactionsViewAdapter;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/discord/reactions/ReactionsView$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/discord/reactions/ReactionsView$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/discord/reactions/ReactionsView;->Companion:Lcom/discord/reactions/ReactionsView$Companion;

    .line 8
    .line 9
    sget-object v0, Lcom/discord/reactions/ReactionsView$Companion$sharedViewPool$2;->INSTANCE:Lcom/discord/reactions/ReactionsView$Companion$sharedViewPool$2;

    .line 10
    .line 11
    invoke-static {v0}, Llf/m;->a(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lcom/discord/reactions/ReactionsView;->sharedViewPool$delegate:Lkotlin/Lazy;

    .line 16
    .line 17
    const/16 v0, 0x1a

    .line 18
    .line 19
    invoke-static {v0}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    sput v0, Lcom/discord/reactions/ReactionsView;->REACTION_HEIGHT:I

    .line 24
    .line 25
    return-void
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
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p0, p1, v0, v1, v0}, Lcom/discord/reactions/ReactionsView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 3
    new-instance p2, Lcom/google/android/flexbox/FlexboxLayoutManager;

    invoke-direct {p2, p1}, Lcom/google/android/flexbox/FlexboxLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 4
    new-instance p1, Lcom/discord/reactions/ReactionsViewAdapter;

    sget p2, Lcom/discord/reactions/ReactionsView;->REACTION_HEIGHT:I

    invoke-direct {p1, p2}, Lcom/discord/reactions/ReactionsViewAdapter;-><init>(I)V

    iput-object p1, p0, Lcom/discord/reactions/ReactionsView;->adapter:Lcom/discord/reactions/ReactionsViewAdapter;

    .line 5
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    const/4 p1, 0x4

    .line 6
    invoke-static {p1}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    move-result v3

    .line 7
    new-instance p1, Lcom/discord/recycler_view/decorations/HorizontalSpacingItemDecoration;

    invoke-direct {p1, v3}, Lcom/discord/recycler_view/decorations/HorizontalSpacingItemDecoration;-><init>(I)V

    .line 8
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 9
    new-instance p1, Lcom/discord/recycler_view/decorations/VerticalSpacingItemDecoration;

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xa

    const/4 v6, 0x0

    move-object v0, p1

    move v1, v3

    invoke-direct/range {v0 .. v6}, Lcom/discord/recycler_view/decorations/VerticalSpacingItemDecoration;-><init>(IIIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 10
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 11
    sget-object p1, Lcom/discord/reactions/ReactionsView;->Companion:Lcom/discord/reactions/ReactionsView$Companion;

    invoke-static {p1}, Lcom/discord/reactions/ReactionsView$Companion;->access$getSharedViewPool(Lcom/discord/reactions/ReactionsView$Companion;)Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setRecycledViewPool(Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;)V

    .line 12
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getItemAnimator()Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;

    move-result-object p1

    const/4 p2, 0x0

    if-eqz p1, :cond_1

    .line 13
    instance-of v0, p1, Landroidx/recyclerview/widget/DefaultItemAnimator;

    if-nez v0, :cond_0

    move-object p1, p2

    :cond_0
    move-object p2, p1

    check-cast p2, Landroidx/recyclerview/widget/DefaultItemAnimator;

    .line 14
    :cond_1
    invoke-static {p2}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/m;->setSupportsChangeAnimations(Z)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 1
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/discord/reactions/ReactionsView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public static final synthetic access$getSharedViewPool$delegate$cp()Lkotlin/Lazy;
    .locals 1

    sget-object v0, Lcom/discord/reactions/ReactionsView;->sharedViewPool$delegate:Lkotlin/Lazy;

    return-object v0
.end method

.method public static synthetic b(Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, Lcom/discord/reactions/ReactionsView;->setReactions$lambda$0(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic c(Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, Lcom/discord/reactions/ReactionsView;->setReactions$lambda$1(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic setReactions$default(Lcom/discord/reactions/ReactionsView;Ljava/lang/String;Ljava/util/List;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/reactions/ReactionView$ReactionsTheme;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/discord/theme/DiscordTheme;ZZILjava/lang/Object;)V
    .locals 18

    move/from16 v0, p16

    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_0

    .line 1
    new-instance v1, Lcom/discord/reactions/e;

    invoke-direct {v1}, Lcom/discord/reactions/e;-><init>()V

    move-object v11, v1

    goto :goto_0

    :cond_0
    move-object/from16 v11, p9

    :goto_0
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_1

    .line 2
    new-instance v1, Lcom/discord/reactions/f;

    invoke-direct {v1}, Lcom/discord/reactions/f;-><init>()V

    move-object v12, v1

    goto :goto_1

    :cond_1
    move-object/from16 v12, p10

    :goto_1
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_2

    .line 3
    sget-object v1, Lcom/discord/reactions/ReactionsView$setReactions$3;->INSTANCE:Lcom/discord/reactions/ReactionsView$setReactions$3;

    move-object v14, v1

    goto :goto_2

    :cond_2
    move-object/from16 v14, p12

    :goto_2
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_3

    const/4 v1, 0x0

    move-object v15, v1

    goto :goto_3

    :cond_3
    move-object/from16 v15, p13

    :goto_3
    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_4

    const/4 v0, 0x0

    move/from16 v16, v0

    goto :goto_4

    :cond_4
    move/from16 v16, p14

    :goto_4
    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move/from16 v5, p3

    move/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move-object/from16 v13, p11

    move/from16 v17, p15

    .line 4
    invoke-virtual/range {v2 .. v17}, Lcom/discord/reactions/ReactionsView;->setReactions(Ljava/lang/String;Ljava/util/List;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/reactions/ReactionView$ReactionsTheme;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/discord/theme/DiscordTheme;ZZ)V

    return-void
.end method

.method private static final setReactions$lambda$0(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method private static final setReactions$lambda$1(Landroid/view/View;)V
    .locals 0

    return-void
.end method


# virtual methods
.method public final setReactions(Ljava/lang/String;Ljava/util/List;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/reactions/ReactionView$ReactionsTheme;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/discord/theme/DiscordTheme;ZZ)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lcom/discord/reactions/ReactionView$Reaction;",
            ">;ZZ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/discord/reactions/ReactionView$ReactionsTheme;",
            "Landroid/view/View$OnClickListener;",
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
            "Lcom/discord/theme/DiscordTheme;",
            "ZZ)V"
        }
    .end annotation

    move-object/from16 v0, p2

    const-string v1, "messageId"

    move-object/from16 v3, p1

    invoke-static {v3, v1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "reactions"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "addReactionLabel"

    move-object/from16 v7, p5

    invoke-static {v7, v1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "addNewReactionAccessibilityLabel"

    move-object/from16 v8, p6

    invoke-static {v8, v1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "addNewBurstReactionAccessibilityLabel"

    move-object/from16 v9, p7

    invoke-static {v9, v1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onAddReactionClick"

    move-object/from16 v11, p9

    invoke-static {v11, v1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onAddBurstReactionClick"

    move-object/from16 v12, p10

    invoke-static {v12, v1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onReactionClick"

    move-object/from16 v13, p11

    invoke-static {v13, v1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onReactionLongPress"

    move-object/from16 v14, p12

    invoke-static {v14, v1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v1, p0

    .line 1
    iget-object v2, v1, Lcom/discord/reactions/ReactionsView;->adapter:Lcom/discord/reactions/ReactionsViewAdapter;

    move/from16 v4, p15

    .line 2
    invoke-static {v0, v4}, Lcom/discord/reactions/ReactionsViewKt;->separateAndSortDuplicateReactions(Ljava/util/List;Z)Ljava/util/List;

    move-result-object v4

    move/from16 v5, p3

    move/from16 v6, p4

    move-object/from16 v10, p8

    move-object/from16 v15, p13

    move/from16 v16, p14

    .line 3
    invoke-virtual/range {v2 .. v16}, Lcom/discord/reactions/ReactionsViewAdapter;->setReactions(Ljava/lang/String;Ljava/util/List;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/reactions/ReactionView$ReactionsTheme;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/discord/theme/DiscordTheme;Z)V

    return-void
.end method
