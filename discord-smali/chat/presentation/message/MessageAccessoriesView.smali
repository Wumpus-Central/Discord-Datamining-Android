.class public final Lcom/discord/chat/presentation/message/MessageAccessoriesView;
.super Landroidx/recyclerview/widget/RecyclerView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/chat/presentation/message/MessageAccessoriesView$Companion;,
        Lcom/discord/chat/presentation/message/MessageAccessoriesView$ContentViewTracker;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008b\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006*\u0001\'\u0018\u0000 32\u00020\u0001:\u000234B\u001d\u0008\u0007\u0012\u0006\u0010.\u001a\u00020-\u0012\n\u0008\u0002\u00100\u001a\u0004\u0018\u00010/\u00a2\u0006\u0004\u00081\u00102J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002JM\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0006\u0010\u0010\u001a\u00020\u000f2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0012\u0010\u0019\u001a\u00020\u00182\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0017J\u001a\u0010\u001d\u001a\u00020\u00042\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00040\u001aR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008%\u0010&R\u0014\u0010(\u001a\u00020\'8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008(\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008+\u0010,\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u00065"
    }
    d2 = {
        "Lcom/discord/chat/presentation/message/MessageAccessoriesView;",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "",
        "leftMargin",
        "",
        "updateLeftMargin",
        "Lcom/discord/primitives/MessageId;",
        "messageId",
        "Lcom/discord/primitives/ChannelId;",
        "channelId",
        "Lcom/discord/primitives/GuildId;",
        "guildId",
        "",
        "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;",
        "items",
        "Lcom/discord/chat/presentation/events/ChatEventHandler;",
        "eventHandler",
        "Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;",
        "messageComponentProvider",
        "setAccessories-RC8ZMxU",
        "(Ljava/lang/String;JLcom/discord/primitives/GuildId;Ljava/util/List;Lcom/discord/chat/presentation/events/ChatEventHandler;Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;)V",
        "setAccessories",
        "Landroid/view/MotionEvent;",
        "e",
        "",
        "onTouchEvent",
        "Lkotlin/Function1;",
        "Lcom/discord/chat/presentation/message/view/MessageContentView;",
        "onViewChanged",
        "setOnCurrentContentViewChanged",
        "Lcom/discord/chat/presentation/message/decorations/ThreadSpineItemDecoration;",
        "threadSpineDecoration",
        "Lcom/discord/chat/presentation/message/decorations/ThreadSpineItemDecoration;",
        "Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;",
        "accessoriesAdapter",
        "Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;",
        "Lcom/discord/chat/presentation/message/MessageAccessoriesView$ContentViewTracker;",
        "contentViewTracker",
        "Lcom/discord/chat/presentation/message/MessageAccessoriesView$ContentViewTracker;",
        "com/discord/chat/presentation/message/MessageAccessoriesView$defaultItemAnimator$1",
        "defaultItemAnimator",
        "Lcom/discord/chat/presentation/message/MessageAccessoriesView$defaultItemAnimator$1;",
        "Lcom/discord/chat/presentation/message/decorations/MessageAccessoriesHorizontalSpacingDecoration;",
        "messageAccessoriesDecoration",
        "Lcom/discord/chat/presentation/message/decorations/MessageAccessoriesHorizontalSpacingDecoration;",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "Companion",
        "ContentViewTracker",
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
.field public static final Companion:Lcom/discord/chat/presentation/message/MessageAccessoriesView$Companion;

.field private static embedContentMarginPx:I

.field private static leftMarginPx:I

.field private static rightMarginPx:I


# instance fields
.field private final accessoriesAdapter:Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;

.field private final contentViewTracker:Lcom/discord/chat/presentation/message/MessageAccessoriesView$ContentViewTracker;

.field private final defaultItemAnimator:Lcom/discord/chat/presentation/message/MessageAccessoriesView$defaultItemAnimator$1;

.field private messageAccessoriesDecoration:Lcom/discord/chat/presentation/message/decorations/MessageAccessoriesHorizontalSpacingDecoration;

.field private threadSpineDecoration:Lcom/discord/chat/presentation/message/decorations/ThreadSpineItemDecoration;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/discord/chat/presentation/message/MessageAccessoriesView$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/chat/presentation/message/MessageAccessoriesView$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/chat/presentation/message/MessageAccessoriesView;->Companion:Lcom/discord/chat/presentation/message/MessageAccessoriesView$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p0, p1, v0, v1, v0}, Lcom/discord/chat/presentation/message/MessageAccessoriesView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 10

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 3
    new-instance p2, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;

    .line 4
    new-instance v0, Lcom/discord/chat/presentation/message/MessageAccessoriesView$accessoriesAdapter$1;

    invoke-direct {v0, p0}, Lcom/discord/chat/presentation/message/MessageAccessoriesView$accessoriesAdapter$1;-><init>(Ljava/lang/Object;)V

    .line 5
    invoke-direct {p2, v0}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;-><init>(Lkotlin/jvm/functions/Function0;)V

    iput-object p2, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesView;->accessoriesAdapter:Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;

    .line 6
    new-instance v0, Lcom/discord/chat/presentation/message/MessageAccessoriesView$ContentViewTracker;

    invoke-direct {v0}, Lcom/discord/chat/presentation/message/MessageAccessoriesView$ContentViewTracker;-><init>()V

    iput-object v0, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesView;->contentViewTracker:Lcom/discord/chat/presentation/message/MessageAccessoriesView$ContentViewTracker;

    .line 7
    new-instance v1, Lcom/discord/chat/presentation/message/MessageAccessoriesView$defaultItemAnimator$1;

    invoke-direct {v1}, Lcom/discord/chat/presentation/message/MessageAccessoriesView$defaultItemAnimator$1;-><init>()V

    const/4 v2, 0x0

    .line 8
    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/m;->setSupportsChangeAnimations(Z)V

    iput-object v1, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesView;->defaultItemAnimator:Lcom/discord/chat/presentation/message/MessageAccessoriesView$defaultItemAnimator$1;

    const/4 v1, 0x0

    .line 9
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;)V

    .line 10
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setNestedScrollingEnabled(Z)V

    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v3, Lcom/discord/chat/R$dimen;->message_start_guideline:I

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    sput v1, Lcom/discord/chat/presentation/message/MessageAccessoriesView;->leftMarginPx:I

    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v3, Lcom/discord/chat/R$dimen;->message_horizontal_spacing:I

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    sput v1, Lcom/discord/chat/presentation/message/MessageAccessoriesView;->rightMarginPx:I

    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v3, Lcom/discord/chat/R$dimen;->message_embed_margin:I

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    sput v1, Lcom/discord/chat/presentation/message/MessageAccessoriesView;->embedContentMarginPx:I

    .line 14
    new-instance v1, Lcom/discord/chat/presentation/message/decorations/ThreadSpineItemDecoration;

    sget v3, Lcom/discord/chat/presentation/message/MessageAccessoriesView;->leftMarginPx:I

    invoke-direct {v1, p1, v3}, Lcom/discord/chat/presentation/message/decorations/ThreadSpineItemDecoration;-><init>(Landroid/content/Context;I)V

    iput-object v1, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesView;->threadSpineDecoration:Lcom/discord/chat/presentation/message/decorations/ThreadSpineItemDecoration;

    .line 15
    new-instance v1, Lcom/discord/chat/presentation/message/decorations/MessageAccessoriesHorizontalSpacingDecoration;

    sget v3, Lcom/discord/chat/presentation/message/MessageAccessoriesView;->leftMarginPx:I

    sget v4, Lcom/discord/chat/presentation/message/MessageAccessoriesView;->rightMarginPx:I

    invoke-direct {v1, v3, v4}, Lcom/discord/chat/presentation/message/decorations/MessageAccessoriesHorizontalSpacingDecoration;-><init>(II)V

    .line 16
    iput-object v1, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesView;->messageAccessoriesDecoration:Lcom/discord/chat/presentation/message/decorations/MessageAccessoriesHorizontalSpacingDecoration;

    .line 17
    iget-object v1, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesView;->threadSpineDecoration:Lcom/discord/chat/presentation/message/decorations/ThreadSpineItemDecoration;

    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 18
    iget-object v1, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesView;->messageAccessoriesDecoration:Lcom/discord/chat/presentation/message/decorations/MessageAccessoriesHorizontalSpacingDecoration;

    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 19
    new-instance v1, Lcom/discord/recycler_view/decorations/VerticalSpacingItemDecoration;

    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    .line 21
    sget v4, Lcom/discord/chat/R$dimen;->message_accessories_vertical_spacing:I

    .line 22
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0xe

    const/4 v9, 0x0

    move-object v3, v1

    .line 23
    invoke-direct/range {v3 .. v9}, Lcom/discord/recycler_view/decorations/VerticalSpacingItemDecoration;-><init>(IIIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 24
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 25
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    const/4 v3, 0x1

    invoke-direct {v1, p1, v3, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 26
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 27
    invoke-virtual {p2, v0}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->setMessageContentViewLifecycleListener(Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$MessageContentViewLifecycleListener;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 1
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/discord/chat/presentation/message/MessageAccessoriesView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public static final synthetic access$getEmbedContentMarginPx$cp()I
    .locals 1

    sget v0, Lcom/discord/chat/presentation/message/MessageAccessoriesView;->embedContentMarginPx:I

    return v0
.end method

.method public static final synthetic access$getLeftMarginPx$cp()I
    .locals 1

    sget v0, Lcom/discord/chat/presentation/message/MessageAccessoriesView;->leftMarginPx:I

    return v0
.end method

.method public static final synthetic access$getRightMarginPx$cp()I
    .locals 1

    sget v0, Lcom/discord/chat/presentation/message/MessageAccessoriesView;->rightMarginPx:I

    return v0
.end method


# virtual methods
.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    const/4 p1, 0x0

    return p1
.end method

.method public final setAccessories-RC8ZMxU(Ljava/lang/String;JLcom/discord/primitives/GuildId;Ljava/util/List;Lcom/discord/chat/presentation/events/ChatEventHandler;Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J",
            "Lcom/discord/primitives/GuildId;",
            "Ljava/util/List<",
            "+",
            "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;",
            ">;",
            "Lcom/discord/chat/presentation/events/ChatEventHandler;",
            "Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "messageId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "items"

    .line 7
    .line 8
    invoke-static {p5, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "eventHandler"

    .line 12
    .line 13
    invoke-static {p6, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sget-object v0, Lcom/discord/chat/presentation/root/ChatView;->Companion:Lcom/discord/chat/presentation/root/ChatView$Companion;

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/discord/chat/presentation/root/ChatView$Companion;->getAreChatAnimationsEnabled()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    iget-object v0, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesView;->defaultItemAnimator:Lcom/discord/chat/presentation/message/MessageAccessoriesView$defaultItemAnimator$1;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v0, 0x0

    .line 28
    :goto_0
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesView;->threadSpineDecoration:Lcom/discord/chat/presentation/message/decorations/ThreadSpineItemDecoration;

    .line 32
    .line 33
    instance-of v1, p5, Ljava/util/Collection;

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    invoke-interface {p5}, Ljava/util/Collection;->isEmpty()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    invoke-interface {p5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_3

    .line 54
    .line 55
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    check-cast v3, Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;

    .line 60
    .line 61
    instance-of v3, v3, Lcom/discord/chat/presentation/message/messagepart/ThreadEmbedMessageAccessory;

    .line 62
    .line 63
    if-eqz v3, :cond_2

    .line 64
    .line 65
    const/4 v2, 0x1

    .line 66
    :cond_3
    :goto_1
    invoke-virtual {v0, v2}, Lcom/discord/chat/presentation/message/decorations/ThreadSpineItemDecoration;->setShowThreadSpine(Z)V

    .line 67
    .line 68
    .line 69
    iget-object v0, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesView;->accessoriesAdapter:Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;

    .line 70
    .line 71
    invoke-virtual {v0, p6}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->setEventHandler(Lcom/discord/chat/presentation/events/ChatEventHandler;)V

    .line 72
    .line 73
    .line 74
    iget-object p6, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesView;->accessoriesAdapter:Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;

    .line 75
    .line 76
    invoke-virtual {p6, p7}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->setComponentProvider(Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;)V

    .line 77
    .line 78
    .line 79
    iget-object v0, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesView;->accessoriesAdapter:Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;

    .line 80
    .line 81
    move-object v1, p1

    .line 82
    move-wide v2, p2

    .line 83
    move-object v4, p4

    .line 84
    move-object v5, p5

    .line 85
    invoke-virtual/range {v0 .. v5}, Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;->setItems-bo5iIEc(Ljava/lang/String;JLcom/discord/primitives/GuildId;Ljava/util/List;)V

    .line 86
    .line 87
    .line 88
    return-void
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
.end method

.method public final setOnCurrentContentViewChanged(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/discord/chat/presentation/message/view/MessageContentView;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "onViewChanged"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesView;->contentViewTracker:Lcom/discord/chat/presentation/message/MessageAccessoriesView$ContentViewTracker;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/discord/chat/presentation/message/MessageAccessoriesView$ContentViewTracker;->setOnViewChanged(Lkotlin/jvm/functions/Function1;)V

    .line 9
    .line 10
    .line 11
    return-void
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

.method public final updateLeftMargin(I)V
    .locals 2

    .line 1
    sget v0, Lcom/discord/chat/presentation/message/MessageAccessoriesView;->leftMarginPx:I

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    sput p1, Lcom/discord/chat/presentation/message/MessageAccessoriesView;->leftMarginPx:I

    .line 7
    .line 8
    iget-object p1, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesView;->messageAccessoriesDecoration:Lcom/discord/chat/presentation/message/decorations/MessageAccessoriesHorizontalSpacingDecoration;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->removeItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 11
    .line 12
    .line 13
    new-instance p1, Lcom/discord/chat/presentation/message/decorations/MessageAccessoriesHorizontalSpacingDecoration;

    .line 14
    .line 15
    sget v0, Lcom/discord/chat/presentation/message/MessageAccessoriesView;->leftMarginPx:I

    .line 16
    .line 17
    sget v1, Lcom/discord/chat/presentation/message/MessageAccessoriesView;->rightMarginPx:I

    .line 18
    .line 19
    invoke-direct {p1, v0, v1}, Lcom/discord/chat/presentation/message/decorations/MessageAccessoriesHorizontalSpacingDecoration;-><init>(II)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lcom/discord/chat/presentation/message/MessageAccessoriesView;->messageAccessoriesDecoration:Lcom/discord/chat/presentation/message/decorations/MessageAccessoriesHorizontalSpacingDecoration;

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 25
    .line 26
    .line 27
    return-void
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
