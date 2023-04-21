.class public final Lcom/discord/chat/presentation/message/MessageView;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"

# interfaces
.implements Lcom/discord/recycler_view/decorations/VerticalSpacingItemDecoration$SpacingProviderView;
.implements Lcom/discord/chat/presentation/spine/SpineParentMessage;
.implements Lcom/discord/chat/presentation/list/SwipeReplyInitiator;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/chat/presentation/message/MessageView$ChainPart;,
        Lcom/discord/chat/presentation/message/MessageView$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00aa\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001TB\u001d\u0008\u0007\u0012\u0006\u0010O\u001a\u00020N\u0012\n\u0008\u0002\u0010Q\u001a\u0004\u0018\u00010P\u00a2\u0006\u0004\u0008R\u0010SJ\u0010\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u001c\u0010\u000e\u001a\u00020\u0007*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0002J]\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u001120\u0010\u0019\u001a,\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0013j\u0004\u0018\u0001`\u0018H\u0002\u00f8\u0001\u0000J \u0010\u001f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J\u0016\u0010!\u001a\u00020\u00072\u000c\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002J\u0018\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J \u0010%\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J\u0010\u0010(\u001a\u00020\u00052\u0006\u0010\'\u001a\u00020&H\u0016J\u0010\u0010*\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0005H\u0016Jf\u00102\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\n\u0008\u0002\u0010,\u001a\u0004\u0018\u00010+2\u000e\u0008\u0002\u0010.\u001a\u0008\u0012\u0004\u0012\u00020\u001d0-2\u0008\u0008\u0002\u0010/\u001a\u00020\u00052\u0008\u0008\u0002\u00100\u001a\u00020\u00052\u0008\u0008\u0002\u00101\u001a\u00020\u0005J\u000e\u00105\u001a\u00020\u00072\u0006\u00104\u001a\u000203J\u000f\u00106\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\u00086\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00089\u0010:R\u001c\u0010.\u001a\u0008\u0012\u0004\u0012\u00020\u001d0-8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008.\u0010;R\u0016\u0010/\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008/\u0010<R(\u0010=\u001a\u0008\u0012\u0004\u0012\u00020\u00070-8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008=\u0010;\u001a\u0004\u0008>\u0010?\"\u0004\u0008@\u0010AR\"\u0010B\u001a\u00020\u00058\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008B\u0010<\u001a\u0004\u0008C\u0010D\"\u0004\u0008E\u0010FR&\u0010I\u001a\u0012\u0012\u0004\u0012\u00020\u001b0Gj\u0008\u0012\u0004\u0012\u00020\u001b`H8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008I\u0010JR\u0014\u0010M\u001a\u00020\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008K\u0010L\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006U"
    }
    d2 = {
        "Lcom/discord/chat/presentation/message/MessageView;",
        "Landroidx/constraintlayout/widget/ConstraintLayout;",
        "Lcom/discord/recycler_view/decorations/VerticalSpacingItemDecoration$SpacingProviderView;",
        "Lcom/discord/chat/presentation/spine/SpineParentMessage;",
        "Lcom/discord/chat/presentation/list/SwipeReplyInitiator;",
        "",
        "showDivider",
        "",
        "configureDivider",
        "Landroid/view/View;",
        "Lcom/discord/chat/bridge/Message;",
        "message",
        "Lcom/discord/chat/presentation/events/ChatEventHandler;",
        "eventHandler",
        "configureAuthorClickListeners",
        "Lcom/discord/chat/presentation/root/MessageContext;",
        "messageContext",
        "Lcom/discord/chat/bridge/messageframe/MessageFrame;",
        "messageFrame",
        "Lkotlin/Function4;",
        "Lcom/discord/primitives/MessageId;",
        "Lcom/discord/primitives/ChannelId;",
        "",
        "Lcom/discord/chat/bridge/MediaType;",
        "Lcom/discord/chat/presentation/events/MessageLongPress;",
        "onLongClick",
        "",
        "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;",
        "generateMessageAccessories",
        "Lcom/discord/chat/presentation/message/MessageView$ChainPart;",
        "chainPart",
        "configureAuthor",
        "items",
        "configureAccessoriesMargin",
        "isCommunicationDisabled",
        "configureCommunicationDisabled",
        "isSuppressNotifications",
        "configureSuppressNotifications",
        "Landroid/view/MotionEvent;",
        "ev",
        "onInterceptTouchEvent",
        "pressed",
        "setPressed",
        "Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;",
        "componentProvider",
        "Lkotlin/Function0;",
        "onChainPart",
        "allowChildGestures",
        "isHighlight",
        "renderContentOnly",
        "setMessage",
        "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;",
        "recycledViewPool",
        "setAccessoriesRecycledViewPool",
        "spacingPxOverride",
        "()Ljava/lang/Integer;",
        "Lcom/discord/chat/databinding/MessageViewBinding;",
        "binding",
        "Lcom/discord/chat/databinding/MessageViewBinding;",
        "Lkotlin/jvm/functions/Function0;",
        "Z",
        "onInitiateReply",
        "getOnInitiateReply",
        "()Lkotlin/jvm/functions/Function0;",
        "setOnInitiateReply",
        "(Lkotlin/jvm/functions/Function0;)V",
        "enableSwipeToReply",
        "getEnableSwipeToReply",
        "()Z",
        "setEnableSwipeToReply",
        "(Z)V",
        "Ljava/util/ArrayList;",
        "Lkotlin/collections/ArrayList;",
        "accessories",
        "Ljava/util/ArrayList;",
        "getSpineOriginView",
        "()Landroid/view/View;",
        "spineOriginView",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "ChainPart",
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
.field private accessories:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;",
            ">;"
        }
    .end annotation
.end field

.field private allowChildGestures:Z

.field private final binding:Lcom/discord/chat/databinding/MessageViewBinding;

.field private enableSwipeToReply:Z

.field private onChainPart:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Lcom/discord/chat/presentation/message/MessageView$ChainPart;",
            ">;"
        }
    .end annotation
.end field

.field private onInitiateReply:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p0, p1, v0, v1, v0}, Lcom/discord/chat/presentation/message/MessageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 3
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    invoke-static {p2, p0}, Lcom/discord/chat/databinding/MessageViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/discord/chat/databinding/MessageViewBinding;

    move-result-object p2

    const-string v0, "inflate(LayoutInflater.from(context), this)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/discord/chat/presentation/message/MessageView;->binding:Lcom/discord/chat/databinding/MessageViewBinding;

    const/4 v0, 0x2

    .line 4
    invoke-static {v0}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    move-result v1

    invoke-static {v0}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {p0, v3, v1, v3, v2}, Landroid/view/View;->setPadding(IIII)V

    const/4 v1, 0x3

    const/4 v2, 0x0

    .line 5
    invoke-static {p0, v3, v3, v1, v2}, Lcom/discord/ripple/RippleUtilsKt;->addRipple$default(Landroid/view/View;ZIILjava/lang/Object;)V

    .line 6
    iget-object v1, p2, Lcom/discord/chat/databinding/MessageViewBinding;->timestamp:Landroid/widget/TextView;

    const-string v2, "binding.timestamp"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lcom/discord/fonts/DiscordFont;->PrimaryMedium:Lcom/discord/fonts/DiscordFont;

    invoke-static {v1, v3}, Lcom/discord/fonts/DiscordFontUtilsKt;->setDiscordFont(Landroid/widget/TextView;Lcom/discord/fonts/DiscordFont;)V

    .line 7
    iget-object v1, p2, Lcom/discord/chat/databinding/MessageViewBinding;->timestamp:Landroid/widget/TextView;

    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v3

    invoke-virtual {v3}, Lcom/discord/theme/DiscordTheme;->getTextMuted()I

    move-result v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 8
    iget-object v1, p2, Lcom/discord/chat/databinding/MessageViewBinding;->timestamp:Landroid/widget/TextView;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v2, 0x41400000    # 12.0f

    const/high16 v3, 0x41700000    # 15.0f

    invoke-static {v1, v2, v3}, Lcom/discord/SetTextSizeSpKt;->setTextSizeSp(Landroid/widget/TextView;FF)V

    .line 9
    iget-object v1, p2, Lcom/discord/chat/databinding/MessageViewBinding;->authorName:Landroid/widget/TextView;

    const-string v2, "binding.authorName"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lcom/discord/fonts/DiscordFont;->PrimarySemibold:Lcom/discord/fonts/DiscordFont;

    invoke-static {v1, v3}, Lcom/discord/fonts/DiscordFontUtilsKt;->setDiscordFont(Landroid/widget/TextView;Lcom/discord/fonts/DiscordFont;)V

    .line 10
    iget-object v1, p2, Lcom/discord/chat/databinding/MessageViewBinding;->authorName:Landroid/widget/TextView;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v2, 0x41800000    # 16.0f

    const/high16 v3, 0x41a00000    # 20.0f

    invoke-static {v1, v2, v3}, Lcom/discord/SetTextSizeSpKt;->setTextSizeSp(Landroid/widget/TextView;FF)V

    .line 11
    iget-object v1, p2, Lcom/discord/chat/databinding/MessageViewBinding;->authorAvatar:Lcom/facebook/drawee/view/SimpleDraweeView;

    const-string v2, "binding.authorAvatar"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lcom/discord/misc/utilities/view/ViewClippingUtilsKt;->clipToCircle(Landroid/view/View;)V

    .line 12
    iget-object p2, p2, Lcom/discord/chat/databinding/MessageViewBinding;->messageHeaderDivider:Landroid/view/View;

    .line 13
    sget v1, Lcom/discord/chat/R$color;->message_divider_light:I

    .line 14
    sget v2, Lcom/discord/chat/R$color;->message_divider_dark:I

    .line 15
    invoke-static {p1, v1, v2}, Lcom/discord/theme/utils/ColorUtilsKt;->getThemeColor(Landroid/content/Context;II)I

    move-result p1

    .line 16
    invoke-virtual {p2, p1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 17
    sget-object p1, Lcom/discord/chat/presentation/message/MessageView$onChainPart$1;->INSTANCE:Lcom/discord/chat/presentation/message/MessageView$onChainPart$1;

    iput-object p1, p0, Lcom/discord/chat/presentation/message/MessageView;->onChainPart:Lkotlin/jvm/functions/Function0;

    const/4 p1, 0x1

    .line 18
    iput-boolean p1, p0, Lcom/discord/chat/presentation/message/MessageView;->allowChildGestures:Z

    .line 19
    sget-object p1, Lcom/discord/chat/presentation/message/MessageView$onInitiateReply$1;->INSTANCE:Lcom/discord/chat/presentation/message/MessageView$onInitiateReply$1;

    iput-object p1, p0, Lcom/discord/chat/presentation/message/MessageView;->onInitiateReply:Lkotlin/jvm/functions/Function0;

    .line 20
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Lcom/discord/chat/presentation/message/MessageView;->accessories:Ljava/util/ArrayList;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 1
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/discord/chat/presentation/message/MessageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public static synthetic b(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/events/ChatEventHandler;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/discord/chat/presentation/message/MessageView;->configureAuthor$lambda$28$lambda$26(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/events/ChatEventHandler;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function2;Lcom/discord/chat/bridge/Message;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/discord/chat/presentation/message/MessageView;->setMessage$lambda$1$lambda$0(Lkotlin/jvm/functions/Function2;Lcom/discord/chat/bridge/Message;Landroid/view/View;)V

    return-void
.end method

.method private final configureAccessoriesMargin(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lkotlin/collections/h;->W(Ljava/util/List;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v0, v0, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;

    .line 6
    .line 7
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x1

    .line 13
    if-le p1, v2, :cond_0

    .line 14
    .line 15
    move p1, v2

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move p1, v1

    .line 18
    :goto_0
    if-nez p1, :cond_2

    .line 19
    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move p1, v1

    .line 24
    goto :goto_2

    .line 25
    :cond_2
    :goto_1
    move p1, v2

    .line 26
    :goto_2
    iget-object v3, p0, Lcom/discord/chat/presentation/message/MessageView;->onChainPart:Lkotlin/jvm/functions/Function0;

    .line 27
    .line 28
    invoke-interface {v3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, Lcom/discord/chat/presentation/message/MessageView$ChainPart;

    .line 33
    .line 34
    sget-object v4, Lcom/discord/chat/presentation/message/MessageView$ChainPart;->MIDDLE:Lcom/discord/chat/presentation/message/MessageView$ChainPart;

    .line 35
    .line 36
    if-eq v3, v4, :cond_4

    .line 37
    .line 38
    sget-object v4, Lcom/discord/chat/presentation/message/MessageView$ChainPart;->START:Lcom/discord/chat/presentation/message/MessageView$ChainPart;

    .line 39
    .line 40
    if-ne v3, v4, :cond_3

    .line 41
    .line 42
    goto :goto_3

    .line 43
    :cond_3
    move v2, v1

    .line 44
    :cond_4
    :goto_3
    if-eqz v0, :cond_5

    .line 45
    .line 46
    move v0, v1

    .line 47
    goto :goto_4

    .line 48
    :cond_5
    const/16 v0, 0x8

    .line 49
    .line 50
    invoke-static {v0}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    :goto_4
    if-eqz p1, :cond_6

    .line 55
    .line 56
    if-eqz v2, :cond_6

    .line 57
    .line 58
    const/4 p1, 0x4

    .line 59
    invoke-static {p1}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    :cond_6
    iget-object p1, p0, Lcom/discord/chat/presentation/message/MessageView;->binding:Lcom/discord/chat/databinding/MessageViewBinding;

    .line 64
    .line 65
    iget-object p1, p1, Lcom/discord/chat/databinding/MessageViewBinding;->accessoriesView:Lcom/discord/chat/presentation/message/MessageAccessoriesView;

    .line 66
    .line 67
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    const-string v2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"

    .line 72
    .line 73
    invoke-static {p1, v2}, Lkotlin/jvm/internal/q;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 77
    .line 78
    iget v2, p1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 79
    .line 80
    iget v3, p1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 81
    .line 82
    if-ne v2, v0, :cond_7

    .line 83
    .line 84
    if-eq v3, v1, :cond_8

    .line 85
    .line 86
    :cond_7
    iget v2, p1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 87
    .line 88
    iget v3, p1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 89
    .line 90
    invoke-virtual {p1, v2, v0, v3, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 91
    .line 92
    .line 93
    iget-object v0, p0, Lcom/discord/chat/presentation/message/MessageView;->binding:Lcom/discord/chat/databinding/MessageViewBinding;

    .line 94
    .line 95
    iget-object v0, v0, Lcom/discord/chat/databinding/MessageViewBinding;->accessoriesView:Lcom/discord/chat/presentation/message/MessageAccessoriesView;

    .line 96
    .line 97
    invoke-virtual {v0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 98
    .line 99
    .line 100
    :cond_8
    return-void
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

.method private final configureAuthor(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/events/ChatEventHandler;Lcom/discord/chat/presentation/message/MessageView$ChainPart;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v8, p2

    .line 6
    .line 7
    move-object/from16 v2, p3

    .line 8
    .line 9
    sget-object v3, Lcom/discord/chat/presentation/message/MessageView$ChainPart;->START:Lcom/discord/chat/presentation/message/MessageView$ChainPart;

    .line 10
    .line 11
    const-string v4, "binding.authorAvatar"

    .line 12
    .line 13
    const-string v5, "binding.authorName"

    .line 14
    .line 15
    const-string v6, "binding.timestamp"

    .line 16
    .line 17
    const-string v9, "binding.messageTagView"

    .line 18
    .line 19
    const-string v10, "binding.connectionsRoleTag"

    .line 20
    .line 21
    const-string v7, "binding.roleIcon"

    .line 22
    .line 23
    const-string v11, "binding.authorAvatarDecoration"

    .line 24
    .line 25
    const-string v12, "binding.roleDot"

    .line 26
    .line 27
    const/16 v13, 0x8

    .line 28
    .line 29
    if-eq v2, v3, :cond_1

    .line 30
    .line 31
    sget-object v3, Lcom/discord/chat/presentation/message/MessageView$ChainPart;->ONLY:Lcom/discord/chat/presentation/message/MessageView$ChainPart;

    .line 32
    .line 33
    if-ne v2, v3, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    iget-object v1, v0, Lcom/discord/chat/presentation/message/MessageView;->binding:Lcom/discord/chat/databinding/MessageViewBinding;

    .line 37
    .line 38
    iget-object v1, v1, Lcom/discord/chat/databinding/MessageViewBinding;->timestamp:Landroid/widget/TextView;

    .line 39
    .line 40
    invoke-static {v1, v6}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v13}, Landroid/view/View;->setVisibility(I)V

    .line 44
    .line 45
    .line 46
    iget-object v1, v0, Lcom/discord/chat/presentation/message/MessageView;->binding:Lcom/discord/chat/databinding/MessageViewBinding;

    .line 47
    .line 48
    iget-object v1, v1, Lcom/discord/chat/databinding/MessageViewBinding;->authorName:Landroid/widget/TextView;

    .line 49
    .line 50
    invoke-static {v1, v5}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, v13}, Landroid/view/View;->setVisibility(I)V

    .line 54
    .line 55
    .line 56
    iget-object v1, v0, Lcom/discord/chat/presentation/message/MessageView;->binding:Lcom/discord/chat/databinding/MessageViewBinding;

    .line 57
    .line 58
    iget-object v1, v1, Lcom/discord/chat/databinding/MessageViewBinding;->authorAvatar:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 59
    .line 60
    invoke-static {v1, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1, v13}, Landroid/view/View;->setVisibility(I)V

    .line 64
    .line 65
    .line 66
    iget-object v1, v0, Lcom/discord/chat/presentation/message/MessageView;->binding:Lcom/discord/chat/databinding/MessageViewBinding;

    .line 67
    .line 68
    iget-object v1, v1, Lcom/discord/chat/databinding/MessageViewBinding;->authorAvatarDecoration:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 69
    .line 70
    invoke-static {v1, v11}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, v13}, Landroid/view/View;->setVisibility(I)V

    .line 74
    .line 75
    .line 76
    iget-object v1, v0, Lcom/discord/chat/presentation/message/MessageView;->binding:Lcom/discord/chat/databinding/MessageViewBinding;

    .line 77
    .line 78
    iget-object v1, v1, Lcom/discord/chat/databinding/MessageViewBinding;->roleDot:Lcom/discord/chat/presentation/message/RoleDotView;

    .line 79
    .line 80
    invoke-static {v1, v12}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, v13}, Landroid/view/View;->setVisibility(I)V

    .line 84
    .line 85
    .line 86
    iget-object v1, v0, Lcom/discord/chat/presentation/message/MessageView;->binding:Lcom/discord/chat/databinding/MessageViewBinding;

    .line 87
    .line 88
    iget-object v1, v1, Lcom/discord/chat/databinding/MessageViewBinding;->roleIcon:Lcom/discord/chat/presentation/message/RoleIconView;

    .line 89
    .line 90
    invoke-static {v1, v7}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1, v13}, Landroid/view/View;->setVisibility(I)V

    .line 94
    .line 95
    .line 96
    iget-object v1, v0, Lcom/discord/chat/presentation/message/MessageView;->binding:Lcom/discord/chat/databinding/MessageViewBinding;

    .line 97
    .line 98
    iget-object v1, v1, Lcom/discord/chat/databinding/MessageViewBinding;->connectionsRoleTag:Lcom/discord/chat/presentation/message/ConnectionsRoleTagView;

    .line 99
    .line 100
    invoke-static {v1, v10}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1, v13}, Landroid/view/View;->setVisibility(I)V

    .line 104
    .line 105
    .line 106
    iget-object v1, v0, Lcom/discord/chat/presentation/message/MessageView;->binding:Lcom/discord/chat/databinding/MessageViewBinding;

    .line 107
    .line 108
    iget-object v1, v1, Lcom/discord/chat/databinding/MessageViewBinding;->messageTagView:Lcom/discord/chat/presentation/message/MessageTagView;

    .line 109
    .line 110
    invoke-static {v1, v9}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1, v13}, Landroid/view/View;->setVisibility(I)V

    .line 114
    .line 115
    .line 116
    goto/16 :goto_6

    .line 117
    .line 118
    :cond_1
    :goto_0
    iget-object v2, v0, Lcom/discord/chat/presentation/message/MessageView;->binding:Lcom/discord/chat/databinding/MessageViewBinding;

    .line 119
    .line 120
    iget-object v2, v2, Lcom/discord/chat/databinding/MessageViewBinding;->authorName:Landroid/widget/TextView;

    .line 121
    .line 122
    const/4 v14, 0x0

    .line 123
    const/4 v3, 0x1

    .line 124
    const/4 v15, 0x0

    .line 125
    invoke-static {v1, v14, v3, v15}, Lcom/discord/chat/bridge/MessageKt;->usernameColor$default(Lcom/discord/chat/bridge/Message;IILjava/lang/Object;)I

    .line 126
    .line 127
    .line 128
    move-result v13

    .line 129
    invoke-virtual {v2, v13}, Landroid/widget/TextView;->setTextColor(I)V

    .line 130
    .line 131
    .line 132
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getUsername()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v13

    .line 136
    invoke-virtual {v2, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 137
    .line 138
    .line 139
    const-string v13, "configureAuthor$lambda$25"

    .line 140
    .line 141
    invoke-static {v2, v13}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    invoke-direct {v0, v2, v1, v8}, Lcom/discord/chat/presentation/message/MessageView;->configureAuthorClickListeners(Landroid/view/View;Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/events/ChatEventHandler;)V

    .line 145
    .line 146
    .line 147
    iget-object v2, v0, Lcom/discord/chat/presentation/message/MessageView;->binding:Lcom/discord/chat/databinding/MessageViewBinding;

    .line 148
    .line 149
    iget-object v2, v2, Lcom/discord/chat/databinding/MessageViewBinding;->roleDot:Lcom/discord/chat/presentation/message/RoleDotView;

    .line 150
    .line 151
    invoke-static {v2, v12}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    invoke-direct {v0, v2, v1, v8}, Lcom/discord/chat/presentation/message/MessageView;->configureAuthorClickListeners(Landroid/view/View;Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/events/ChatEventHandler;)V

    .line 155
    .line 156
    .line 157
    iget-object v2, v0, Lcom/discord/chat/presentation/message/MessageView;->binding:Lcom/discord/chat/databinding/MessageViewBinding;

    .line 158
    .line 159
    iget-object v2, v2, Lcom/discord/chat/databinding/MessageViewBinding;->timestamp:Landroid/widget/TextView;

    .line 160
    .line 161
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getTimestamp()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v13

    .line 165
    invoke-virtual {v2, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 166
    .line 167
    .line 168
    iget-object v2, v0, Lcom/discord/chat/presentation/message/MessageView;->binding:Lcom/discord/chat/databinding/MessageViewBinding;

    .line 169
    .line 170
    iget-object v2, v2, Lcom/discord/chat/databinding/MessageViewBinding;->authorAvatar:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 171
    .line 172
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 173
    .line 174
    .line 175
    move-result-object v13

    .line 176
    const-string v3, "context"

    .line 177
    .line 178
    invoke-static {v13, v3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    invoke-static {v1, v13}, Lcom/discord/chat/bridge/MessageKt;->avatarUrl(Lcom/discord/chat/bridge/Message;Landroid/content/Context;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    invoke-virtual {v2, v3}, Lcom/facebook/drawee/view/SimpleDraweeView;->setImageURI(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    const-string v3, "configureAuthor$lambda$28"

    .line 189
    .line 190
    invoke-static {v2, v3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    new-instance v3, Lcom/discord/chat/presentation/message/m;

    .line 194
    .line 195
    invoke-direct {v3, v1, v8}, Lcom/discord/chat/presentation/message/m;-><init>(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/events/ChatEventHandler;)V

    .line 196
    .line 197
    .line 198
    const/4 v13, 0x1

    .line 199
    invoke-static {v2, v14, v3, v13, v15}, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchUtilsKt;->setOnClickListenerNested$default(Landroid/view/View;ZLandroid/view/View$OnClickListener;ILjava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    new-instance v3, Lcom/discord/chat/presentation/message/n;

    .line 203
    .line 204
    invoke-direct {v3, v1, v8}, Lcom/discord/chat/presentation/message/n;-><init>(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/events/ChatEventHandler;)V

    .line 205
    .line 206
    .line 207
    invoke-static {v2, v14, v3, v13, v15}, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchUtilsKt;->setOnLongClickListenerNested$default(Landroid/view/View;ZLandroid/view/View$OnLongClickListener;ILjava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getAvatarDecorationURL()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v2

    .line 214
    if-eqz v2, :cond_2

    .line 215
    .line 216
    iget-object v2, v0, Lcom/discord/chat/presentation/message/MessageView;->binding:Lcom/discord/chat/databinding/MessageViewBinding;

    .line 217
    .line 218
    iget-object v2, v2, Lcom/discord/chat/databinding/MessageViewBinding;->authorAvatarDecoration:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 219
    .line 220
    invoke-static {v2, v11}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v2, v14}, Landroid/view/View;->setVisibility(I)V

    .line 224
    .line 225
    .line 226
    iget-object v2, v0, Lcom/discord/chat/presentation/message/MessageView;->binding:Lcom/discord/chat/databinding/MessageViewBinding;

    .line 227
    .line 228
    iget-object v2, v2, Lcom/discord/chat/databinding/MessageViewBinding;->authorAvatarDecoration:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 229
    .line 230
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getAvatarDecorationURL()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v3

    .line 234
    invoke-virtual {v2, v3}, Lcom/facebook/drawee/view/SimpleDraweeView;->setImageURI(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    goto :goto_1

    .line 238
    :cond_2
    iget-object v2, v0, Lcom/discord/chat/presentation/message/MessageView;->binding:Lcom/discord/chat/databinding/MessageViewBinding;

    .line 239
    .line 240
    iget-object v2, v2, Lcom/discord/chat/databinding/MessageViewBinding;->authorAvatarDecoration:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 241
    .line 242
    invoke-static {v2, v11}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    const/16 v3, 0x8

    .line 246
    .line 247
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 248
    .line 249
    .line 250
    :goto_1
    iget-object v2, v0, Lcom/discord/chat/presentation/message/MessageView;->binding:Lcom/discord/chat/databinding/MessageViewBinding;

    .line 251
    .line 252
    iget-object v2, v2, Lcom/discord/chat/databinding/MessageViewBinding;->timestamp:Landroid/widget/TextView;

    .line 253
    .line 254
    invoke-static {v2, v6}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v2, v14}, Landroid/view/View;->setVisibility(I)V

    .line 258
    .line 259
    .line 260
    iget-object v2, v0, Lcom/discord/chat/presentation/message/MessageView;->binding:Lcom/discord/chat/databinding/MessageViewBinding;

    .line 261
    .line 262
    iget-object v2, v2, Lcom/discord/chat/databinding/MessageViewBinding;->authorName:Landroid/widget/TextView;

    .line 263
    .line 264
    invoke-static {v2, v5}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v2, v14}, Landroid/view/View;->setVisibility(I)V

    .line 268
    .line 269
    .line 270
    iget-object v2, v0, Lcom/discord/chat/presentation/message/MessageView;->binding:Lcom/discord/chat/databinding/MessageViewBinding;

    .line 271
    .line 272
    iget-object v2, v2, Lcom/discord/chat/databinding/MessageViewBinding;->authorAvatar:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 273
    .line 274
    invoke-static {v2, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v2, v14}, Landroid/view/View;->setVisibility(I)V

    .line 278
    .line 279
    .line 280
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getShouldShowRoleDot()Z

    .line 281
    .line 282
    .line 283
    move-result v2

    .line 284
    if-eqz v2, :cond_3

    .line 285
    .line 286
    iget-object v2, v0, Lcom/discord/chat/presentation/message/MessageView;->binding:Lcom/discord/chat/databinding/MessageViewBinding;

    .line 287
    .line 288
    iget-object v2, v2, Lcom/discord/chat/databinding/MessageViewBinding;->roleDot:Lcom/discord/chat/presentation/message/RoleDotView;

    .line 289
    .line 290
    invoke-static {v2, v12}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v2, v14}, Landroid/view/View;->setVisibility(I)V

    .line 294
    .line 295
    .line 296
    iget-object v2, v0, Lcom/discord/chat/presentation/message/MessageView;->binding:Lcom/discord/chat/databinding/MessageViewBinding;

    .line 297
    .line 298
    iget-object v2, v2, Lcom/discord/chat/databinding/MessageViewBinding;->roleDot:Lcom/discord/chat/presentation/message/RoleDotView;

    .line 299
    .line 300
    invoke-static {v2, v12}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    const/4 v3, 0x1

    .line 304
    invoke-static {v1, v14, v3, v15}, Lcom/discord/chat/bridge/MessageKt;->roleDotColor$default(Lcom/discord/chat/bridge/Message;IILjava/lang/Object;)I

    .line 305
    .line 306
    .line 307
    move-result v3

    .line 308
    const/4 v4, 0x2

    .line 309
    invoke-static {v2, v3, v14, v4, v15}, Lcom/discord/chat/presentation/message/RoleDotView;->configure$default(Lcom/discord/chat/presentation/message/RoleDotView;IIILjava/lang/Object;)V

    .line 310
    .line 311
    .line 312
    goto :goto_2

    .line 313
    :cond_3
    iget-object v2, v0, Lcom/discord/chat/presentation/message/MessageView;->binding:Lcom/discord/chat/databinding/MessageViewBinding;

    .line 314
    .line 315
    iget-object v2, v2, Lcom/discord/chat/databinding/MessageViewBinding;->roleDot:Lcom/discord/chat/presentation/message/RoleDotView;

    .line 316
    .line 317
    invoke-static {v2, v12}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    const/16 v3, 0x8

    .line 321
    .line 322
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 323
    .line 324
    .line 325
    :goto_2
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getRoleIcon()Lcom/discord/chat/bridge/roleicons/RoleIcon;

    .line 326
    .line 327
    .line 328
    move-result-object v2

    .line 329
    if-eqz v2, :cond_4

    .line 330
    .line 331
    iget-object v2, v0, Lcom/discord/chat/presentation/message/MessageView;->binding:Lcom/discord/chat/databinding/MessageViewBinding;

    .line 332
    .line 333
    iget-object v2, v2, Lcom/discord/chat/databinding/MessageViewBinding;->roleIcon:Lcom/discord/chat/presentation/message/RoleIconView;

    .line 334
    .line 335
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getRoleIcon()Lcom/discord/chat/bridge/roleicons/RoleIcon;

    .line 336
    .line 337
    .line 338
    move-result-object v3

    .line 339
    invoke-virtual {v2, v3, v8}, Lcom/discord/chat/presentation/message/RoleIconView;->configureRoleIcon(Lcom/discord/chat/bridge/roleicons/RoleIcon;Lcom/discord/chat/presentation/events/ChatEventHandler;)V

    .line 340
    .line 341
    .line 342
    iget-object v2, v0, Lcom/discord/chat/presentation/message/MessageView;->binding:Lcom/discord/chat/databinding/MessageViewBinding;

    .line 343
    .line 344
    iget-object v2, v2, Lcom/discord/chat/databinding/MessageViewBinding;->roleIcon:Lcom/discord/chat/presentation/message/RoleIconView;

    .line 345
    .line 346
    invoke-static {v2, v7}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v2, v14}, Landroid/view/View;->setVisibility(I)V

    .line 350
    .line 351
    .line 352
    goto :goto_3

    .line 353
    :cond_4
    iget-object v2, v0, Lcom/discord/chat/presentation/message/MessageView;->binding:Lcom/discord/chat/databinding/MessageViewBinding;

    .line 354
    .line 355
    iget-object v2, v2, Lcom/discord/chat/databinding/MessageViewBinding;->roleIcon:Lcom/discord/chat/presentation/message/RoleIconView;

    .line 356
    .line 357
    invoke-static {v2, v7}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 358
    .line 359
    .line 360
    const/16 v3, 0x8

    .line 361
    .line 362
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 363
    .line 364
    .line 365
    :goto_3
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getConnectionsRoleTag()Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;

    .line 366
    .line 367
    .line 368
    move-result-object v2

    .line 369
    if-eqz v2, :cond_5

    .line 370
    .line 371
    iget-object v2, v0, Lcom/discord/chat/presentation/message/MessageView;->binding:Lcom/discord/chat/databinding/MessageViewBinding;

    .line 372
    .line 373
    iget-object v2, v2, Lcom/discord/chat/databinding/MessageViewBinding;->connectionsRoleTag:Lcom/discord/chat/presentation/message/ConnectionsRoleTagView;

    .line 374
    .line 375
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getAuthorId-wUX8bhU()Lcom/discord/primitives/UserId;

    .line 376
    .line 377
    .line 378
    move-result-object v3

    .line 379
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getGuildId-qOKuAAo()Lcom/discord/primitives/GuildId;

    .line 380
    .line 381
    .line 382
    move-result-object v4

    .line 383
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getChannelId-o4g7jtM()J

    .line 384
    .line 385
    .line 386
    move-result-wide v5

    .line 387
    invoke-static {v5, v6}, Lcom/discord/primitives/ChannelId;->box-impl(J)Lcom/discord/primitives/ChannelId;

    .line 388
    .line 389
    .line 390
    move-result-object v5

    .line 391
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getConnectionsRoleTag()Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;

    .line 392
    .line 393
    .line 394
    move-result-object v6

    .line 395
    move-object/from16 v7, p2

    .line 396
    .line 397
    invoke-virtual/range {v2 .. v7}, Lcom/discord/chat/presentation/message/ConnectionsRoleTagView;->configureConnectionsRoleTag-uESh2Cg(Lcom/discord/primitives/UserId;Lcom/discord/primitives/GuildId;Lcom/discord/primitives/ChannelId;Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;Lcom/discord/chat/presentation/events/ChatEventHandler;)V

    .line 398
    .line 399
    .line 400
    iget-object v2, v0, Lcom/discord/chat/presentation/message/MessageView;->binding:Lcom/discord/chat/databinding/MessageViewBinding;

    .line 401
    .line 402
    iget-object v2, v2, Lcom/discord/chat/databinding/MessageViewBinding;->connectionsRoleTag:Lcom/discord/chat/presentation/message/ConnectionsRoleTagView;

    .line 403
    .line 404
    invoke-static {v2, v10}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 405
    .line 406
    .line 407
    invoke-virtual {v2, v14}, Landroid/view/View;->setVisibility(I)V

    .line 408
    .line 409
    .line 410
    const/16 v3, 0x8

    .line 411
    .line 412
    goto :goto_4

    .line 413
    :cond_5
    iget-object v2, v0, Lcom/discord/chat/presentation/message/MessageView;->binding:Lcom/discord/chat/databinding/MessageViewBinding;

    .line 414
    .line 415
    iget-object v2, v2, Lcom/discord/chat/databinding/MessageViewBinding;->connectionsRoleTag:Lcom/discord/chat/presentation/message/ConnectionsRoleTagView;

    .line 416
    .line 417
    invoke-static {v2, v10}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 418
    .line 419
    .line 420
    const/16 v3, 0x8

    .line 421
    .line 422
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 423
    .line 424
    .line 425
    :goto_4
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getTagText()Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object v2

    .line 429
    if-nez v2, :cond_7

    .line 430
    .line 431
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getOpTagText()Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object v2

    .line 435
    if-eqz v2, :cond_6

    .line 436
    .line 437
    goto :goto_5

    .line 438
    :cond_6
    iget-object v1, v0, Lcom/discord/chat/presentation/message/MessageView;->binding:Lcom/discord/chat/databinding/MessageViewBinding;

    .line 439
    .line 440
    iget-object v1, v1, Lcom/discord/chat/databinding/MessageViewBinding;->messageTagView:Lcom/discord/chat/presentation/message/MessageTagView;

    .line 441
    .line 442
    invoke-static {v1, v9}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 443
    .line 444
    .line 445
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 446
    .line 447
    .line 448
    goto :goto_6

    .line 449
    :cond_7
    :goto_5
    iget-object v2, v0, Lcom/discord/chat/presentation/message/MessageView;->binding:Lcom/discord/chat/databinding/MessageViewBinding;

    .line 450
    .line 451
    iget-object v2, v2, Lcom/discord/chat/databinding/MessageViewBinding;->messageTagView:Lcom/discord/chat/presentation/message/MessageTagView;

    .line 452
    .line 453
    invoke-static {v2, v9}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 454
    .line 455
    .line 456
    invoke-virtual {v2, v14}, Landroid/view/View;->setVisibility(I)V

    .line 457
    .line 458
    .line 459
    iget-object v2, v0, Lcom/discord/chat/presentation/message/MessageView;->binding:Lcom/discord/chat/databinding/MessageViewBinding;

    .line 460
    .line 461
    iget-object v2, v2, Lcom/discord/chat/databinding/MessageViewBinding;->messageTagView:Lcom/discord/chat/presentation/message/MessageTagView;

    .line 462
    .line 463
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getTagText()Ljava/lang/String;

    .line 464
    .line 465
    .line 466
    move-result-object v3

    .line 467
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getTagVerified()Ljava/lang/Boolean;

    .line 468
    .line 469
    .line 470
    move-result-object v4

    .line 471
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getTagBackgroundColor()Ljava/lang/Integer;

    .line 472
    .line 473
    .line 474
    move-result-object v5

    .line 475
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getOpTagText()Ljava/lang/String;

    .line 476
    .line 477
    .line 478
    move-result-object v6

    .line 479
    move-object v1, v2

    .line 480
    move-object v2, v3

    .line 481
    move-object v3, v4

    .line 482
    move-object v4, v5

    .line 483
    move-object v5, v6

    .line 484
    move-object/from16 v6, p2

    .line 485
    .line 486
    invoke-virtual/range {v1 .. v6}, Lcom/discord/chat/presentation/message/MessageTagView;->configureTagView(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/chat/presentation/events/ChatEventHandler;)V

    .line 487
    .line 488
    .line 489
    :goto_6
    return-void
.end method

.method private static final configureAuthor$lambda$28$lambda$26(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/events/ChatEventHandler;Landroid/view/View;)V
    .locals 2

    .line 1
    const-string p2, "$message"

    .line 2
    .line 3
    invoke-static {p0, p2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p2, "$eventHandler"

    .line 7
    .line 8
    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/discord/chat/bridge/Message;->getAuthorId-wUX8bhU()Lcom/discord/primitives/UserId;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/discord/chat/bridge/Message;->getId-3Eiw7ao()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-virtual {p0}, Lcom/discord/chat/bridge/Message;->getAuthorId-wUX8bhU()Lcom/discord/primitives/UserId;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Lcom/discord/primitives/UserId;->unbox-impl()J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    invoke-interface {p1, p2, v0, v1}, Lcom/discord/chat/presentation/events/ChatEventHandler;->onTapAvatar-x5gers8(Ljava/lang/String;J)V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
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
.end method

.method private static final configureAuthor$lambda$28$lambda$27(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/events/ChatEventHandler;Landroid/view/View;)Z
    .locals 2

    .line 1
    const-string p2, "$message"

    .line 2
    .line 3
    invoke-static {p0, p2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p2, "$eventHandler"

    .line 7
    .line 8
    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/discord/chat/bridge/Message;->getAuthorId-wUX8bhU()Lcom/discord/primitives/UserId;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/discord/chat/bridge/Message;->getId-3Eiw7ao()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-virtual {p0}, Lcom/discord/chat/bridge/Message;->getAuthorId-wUX8bhU()Lcom/discord/primitives/UserId;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Lcom/discord/primitives/UserId;->unbox-impl()J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    invoke-interface {p1, p2, v0, v1}, Lcom/discord/chat/presentation/events/ChatEventHandler;->onLongPressAvatar-x5gers8(Ljava/lang/String;J)V

    .line 30
    .line 31
    .line 32
    :cond_0
    const/4 p0, 0x1

    .line 33
    return p0
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
.end method

.method private final configureAuthorClickListeners(Landroid/view/View;Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/events/ChatEventHandler;)V
    .locals 4

    .line 1
    new-instance v0, Lcom/discord/chat/presentation/message/o;

    .line 2
    .line 3
    invoke-direct {v0, p2, p3}, Lcom/discord/chat/presentation/message/o;-><init>(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/events/ChatEventHandler;)V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    invoke-static {p1, v1, v0, v2, v3}, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchUtilsKt;->setOnClickListenerNested$default(Landroid/view/View;ZLandroid/view/View$OnClickListener;ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    new-instance v0, Lcom/discord/chat/presentation/message/p;

    .line 13
    .line 14
    invoke-direct {v0, p2, p3}, Lcom/discord/chat/presentation/message/p;-><init>(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/events/ChatEventHandler;)V

    .line 15
    .line 16
    .line 17
    invoke-static {p1, v1, v0, v2, v3}, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchUtilsKt;->setOnLongClickListenerNested$default(Landroid/view/View;ZLandroid/view/View$OnLongClickListener;ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void
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
.end method

.method private static final configureAuthorClickListeners$lambda$4(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/events/ChatEventHandler;Landroid/view/View;)V
    .locals 2

    .line 1
    const-string p2, "$message"

    .line 2
    .line 3
    invoke-static {p0, p2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p2, "$eventHandler"

    .line 7
    .line 8
    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/discord/chat/bridge/Message;->getAuthorId-wUX8bhU()Lcom/discord/primitives/UserId;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/discord/chat/bridge/Message;->getId-3Eiw7ao()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-virtual {p0}, Lcom/discord/chat/bridge/Message;->getAuthorId-wUX8bhU()Lcom/discord/primitives/UserId;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Lcom/discord/primitives/UserId;->unbox-impl()J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    invoke-interface {p1, p2, v0, v1}, Lcom/discord/chat/presentation/events/ChatEventHandler;->onTapUsername-x5gers8(Ljava/lang/String;J)V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
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
.end method

.method private static final configureAuthorClickListeners$lambda$5(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/events/ChatEventHandler;Landroid/view/View;)Z
    .locals 2

    .line 1
    const-string p2, "$message"

    .line 2
    .line 3
    invoke-static {p0, p2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p2, "$eventHandler"

    .line 7
    .line 8
    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/discord/chat/bridge/Message;->getAuthorId-wUX8bhU()Lcom/discord/primitives/UserId;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/discord/chat/bridge/Message;->getId-3Eiw7ao()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-virtual {p0}, Lcom/discord/chat/bridge/Message;->getAuthorId-wUX8bhU()Lcom/discord/primitives/UserId;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Lcom/discord/primitives/UserId;->unbox-impl()J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    invoke-interface {p1, p2, v0, v1}, Lcom/discord/chat/presentation/events/ChatEventHandler;->onLongPressUsername-x5gers8(Ljava/lang/String;J)V

    .line 30
    .line 31
    .line 32
    :cond_0
    const/4 p0, 0x1

    .line 33
    return p0
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
.end method

.method private final configureCommunicationDisabled(ZLcom/discord/chat/presentation/message/MessageView$ChainPart;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    sget-object p1, Lcom/discord/chat/presentation/message/MessageView$ChainPart;->START:Lcom/discord/chat/presentation/message/MessageView$ChainPart;

    .line 5
    .line 6
    if-eq p2, p1, :cond_0

    .line 7
    .line 8
    sget-object p1, Lcom/discord/chat/presentation/message/MessageView$ChainPart;->ONLY:Lcom/discord/chat/presentation/message/MessageView$ChainPart;

    .line 9
    .line 10
    if-ne p2, p1, :cond_1

    .line 11
    .line 12
    :cond_0
    const/4 p1, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_1
    move p1, v0

    .line 15
    :goto_0
    iget-object p2, p0, Lcom/discord/chat/presentation/message/MessageView;->binding:Lcom/discord/chat/databinding/MessageViewBinding;

    .line 16
    .line 17
    iget-object p2, p2, Lcom/discord/chat/databinding/MessageViewBinding;->guildCommunicationDisabledIcon:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 18
    .line 19
    const-string v1, "binding.guildCommunicationDisabledIcon"

    .line 20
    .line 21
    invoke-static {p2, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    if-eqz p1, :cond_2

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_2
    const/16 v0, 0x8

    .line 28
    .line 29
    :goto_1
    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 30
    .line 31
    .line 32
    iget-object p2, p0, Lcom/discord/chat/presentation/message/MessageView;->binding:Lcom/discord/chat/databinding/MessageViewBinding;

    .line 33
    .line 34
    iget-object p2, p2, Lcom/discord/chat/databinding/MessageViewBinding;->guildCommunicationDisabledIcon:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 35
    .line 36
    invoke-static {p2, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    sget-object v0, Lcom/discord/react_asset_fetcher/ReactAsset;->ClockTimeout:Lcom/discord/react_asset_fetcher/ReactAsset;

    .line 40
    .line 41
    invoke-static {p2, v0}, Lcom/discord/react_asset_fetcher/ReactAssetUtilsKt;->setReactAsset(Lcom/facebook/drawee/view/SimpleDraweeView;Lcom/discord/react_asset_fetcher/ReactAsset;)V

    .line 42
    .line 43
    .line 44
    iget-object p2, p0, Lcom/discord/chat/presentation/message/MessageView;->binding:Lcom/discord/chat/databinding/MessageViewBinding;

    .line 45
    .line 46
    iget-object p2, p2, Lcom/discord/chat/databinding/MessageViewBinding;->authorAvatar:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 47
    .line 48
    const/high16 v0, 0x3f000000    # 0.5f

    .line 49
    .line 50
    const/high16 v1, 0x3f800000    # 1.0f

    .line 51
    .line 52
    if-eqz p1, :cond_3

    .line 53
    .line 54
    move v2, v0

    .line 55
    goto :goto_2

    .line 56
    :cond_3
    move v2, v1

    .line 57
    :goto_2
    invoke-virtual {p2, v2}, Landroid/view/View;->setAlpha(F)V

    .line 58
    .line 59
    .line 60
    iget-object p2, p0, Lcom/discord/chat/presentation/message/MessageView;->binding:Lcom/discord/chat/databinding/MessageViewBinding;

    .line 61
    .line 62
    iget-object p2, p2, Lcom/discord/chat/databinding/MessageViewBinding;->roleIcon:Lcom/discord/chat/presentation/message/RoleIconView;

    .line 63
    .line 64
    if-eqz p1, :cond_4

    .line 65
    .line 66
    move v2, v0

    .line 67
    goto :goto_3

    .line 68
    :cond_4
    move v2, v1

    .line 69
    :goto_3
    invoke-virtual {p2, v2}, Landroid/view/View;->setAlpha(F)V

    .line 70
    .line 71
    .line 72
    iget-object p2, p0, Lcom/discord/chat/presentation/message/MessageView;->binding:Lcom/discord/chat/databinding/MessageViewBinding;

    .line 73
    .line 74
    iget-object p2, p2, Lcom/discord/chat/databinding/MessageViewBinding;->authorAvatarDecoration:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 75
    .line 76
    if-eqz p1, :cond_5

    .line 77
    .line 78
    move v2, v0

    .line 79
    goto :goto_4

    .line 80
    :cond_5
    move v2, v1

    .line 81
    :goto_4
    invoke-virtual {p2, v2}, Landroid/view/View;->setAlpha(F)V

    .line 82
    .line 83
    .line 84
    iget-object p2, p0, Lcom/discord/chat/presentation/message/MessageView;->binding:Lcom/discord/chat/databinding/MessageViewBinding;

    .line 85
    .line 86
    iget-object p2, p2, Lcom/discord/chat/databinding/MessageViewBinding;->suppressNotificationsIcon:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 87
    .line 88
    if-eqz p1, :cond_6

    .line 89
    .line 90
    goto :goto_5

    .line 91
    :cond_6
    move v0, v1

    .line 92
    :goto_5
    invoke-virtual {p2, v0}, Landroid/view/View;->setAlpha(F)V

    .line 93
    .line 94
    .line 95
    return-void
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

.method private final configureDivider(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/discord/chat/presentation/message/MessageView;->binding:Lcom/discord/chat/databinding/MessageViewBinding;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/discord/chat/databinding/MessageViewBinding;->messageHeaderDivider:Landroid/view/View;

    .line 4
    .line 5
    const-string v1, "binding.messageHeaderDivider"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/16 p1, 0x8

    .line 15
    .line 16
    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

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
.end method

.method private final configureSuppressNotifications(ZLcom/discord/chat/presentation/events/ChatEventHandler;Lcom/discord/chat/presentation/message/MessageView$ChainPart;)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    sget-object p1, Lcom/discord/chat/presentation/message/MessageView$ChainPart;->START:Lcom/discord/chat/presentation/message/MessageView$ChainPart;

    .line 6
    .line 7
    if-eq p3, p1, :cond_0

    .line 8
    .line 9
    sget-object p1, Lcom/discord/chat/presentation/message/MessageView$ChainPart;->ONLY:Lcom/discord/chat/presentation/message/MessageView$ChainPart;

    .line 10
    .line 11
    if-ne p3, p1, :cond_1

    .line 12
    .line 13
    :cond_0
    move p1, v0

    .line 14
    goto :goto_0

    .line 15
    :cond_1
    move p1, v1

    .line 16
    :goto_0
    iget-object p3, p0, Lcom/discord/chat/presentation/message/MessageView;->binding:Lcom/discord/chat/databinding/MessageViewBinding;

    .line 17
    .line 18
    iget-object p3, p3, Lcom/discord/chat/databinding/MessageViewBinding;->suppressNotificationsIcon:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 19
    .line 20
    const-string v2, "binding.suppressNotificationsIcon"

    .line 21
    .line 22
    invoke-static {p3, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    if-eqz p1, :cond_2

    .line 26
    .line 27
    move v3, v1

    .line 28
    goto :goto_1

    .line 29
    :cond_2
    const/16 v3, 0x8

    .line 30
    .line 31
    :goto_1
    invoke-virtual {p3, v3}, Landroid/view/View;->setVisibility(I)V

    .line 32
    .line 33
    .line 34
    if-eqz p1, :cond_3

    .line 35
    .line 36
    iget-object p1, p0, Lcom/discord/chat/presentation/message/MessageView;->binding:Lcom/discord/chat/databinding/MessageViewBinding;

    .line 37
    .line 38
    iget-object p1, p1, Lcom/discord/chat/databinding/MessageViewBinding;->suppressNotificationsIcon:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 39
    .line 40
    invoke-static {p1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    sget-object p3, Lcom/discord/react_asset_fetcher/ReactAsset;->BellSnooze:Lcom/discord/react_asset_fetcher/ReactAsset;

    .line 44
    .line 45
    invoke-static {p1, p3}, Lcom/discord/react_asset_fetcher/ReactAssetUtilsKt;->setReactAsset(Lcom/facebook/drawee/view/SimpleDraweeView;Lcom/discord/react_asset_fetcher/ReactAsset;)V

    .line 46
    .line 47
    .line 48
    iget-object p1, p0, Lcom/discord/chat/presentation/message/MessageView;->binding:Lcom/discord/chat/databinding/MessageViewBinding;

    .line 49
    .line 50
    iget-object p1, p1, Lcom/discord/chat/databinding/MessageViewBinding;->suppressNotificationsIcon:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 51
    .line 52
    invoke-static {p1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    .line 56
    .line 57
    .line 58
    move-result-object p3

    .line 59
    invoke-virtual {p3}, Lcom/discord/theme/DiscordTheme;->getInteractiveNormal()I

    .line 60
    .line 61
    .line 62
    move-result p3

    .line 63
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object p3

    .line 67
    invoke-static {p1, p3}, Lcom/discord/theme/utils/ColorUtilsKt;->setTintColor(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/Integer;)V

    .line 68
    .line 69
    .line 70
    :cond_3
    iget-object p1, p0, Lcom/discord/chat/presentation/message/MessageView;->binding:Lcom/discord/chat/databinding/MessageViewBinding;

    .line 71
    .line 72
    iget-object p1, p1, Lcom/discord/chat/databinding/MessageViewBinding;->suppressNotificationsIcon:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 73
    .line 74
    invoke-static {p1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    new-instance p3, Lcom/discord/chat/presentation/message/l;

    .line 78
    .line 79
    invoke-direct {p3, p2}, Lcom/discord/chat/presentation/message/l;-><init>(Lcom/discord/chat/presentation/events/ChatEventHandler;)V

    .line 80
    .line 81
    .line 82
    const/4 p2, 0x0

    .line 83
    invoke-static {p1, v1, p3, v0, p2}, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchUtilsKt;->setOnClickListenerNested$default(Landroid/view/View;ZLandroid/view/View$OnClickListener;ILjava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    return-void
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
.end method

.method private static final configureSuppressNotifications$lambda$29(Lcom/discord/chat/presentation/events/ChatEventHandler;Landroid/view/View;)V
    .locals 0

    .line 1
    const-string p1, "$eventHandler"

    .line 2
    .line 3
    invoke-static {p0, p1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Lcom/discord/chat/presentation/events/ChatEventHandler;->onTapSuppressNotificationsIcon()V

    .line 7
    .line 8
    .line 9
    return-void
    .line 10
    .line 11
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

.method public static synthetic d(Lcom/discord/chat/presentation/events/ChatEventHandler;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/discord/chat/presentation/message/MessageView;->configureSuppressNotifications$lambda$29(Lcom/discord/chat/presentation/events/ChatEventHandler;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function4;Lcom/discord/chat/bridge/Message;ILcom/discord/chat/bridge/MediaType;Landroid/view/View;)Z
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/discord/chat/presentation/message/MessageView;->generateMessageAccessories$getLongClickListener$lambda$7$lambda$6(Lkotlin/jvm/functions/Function4;Lcom/discord/chat/bridge/Message;ILcom/discord/chat/bridge/MediaType;Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function4;Lcom/discord/chat/bridge/Message;Landroid/view/View;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/discord/chat/presentation/message/MessageView;->setMessage$lambda$3$lambda$2(Lkotlin/jvm/functions/Function4;Lcom/discord/chat/bridge/Message;Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method public static synthetic g(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/events/ChatEventHandler;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/discord/chat/presentation/message/MessageView;->configureAuthorClickListeners$lambda$4(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/events/ChatEventHandler;Landroid/view/View;)V

    return-void
.end method

.method private final generateMessageAccessories(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/root/MessageContext;Lcom/discord/chat/bridge/messageframe/MessageFrame;Lkotlin/jvm/functions/Function4;)Ljava/util/List;
    .locals 28
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/chat/bridge/Message;",
            "Lcom/discord/chat/presentation/root/MessageContext;",
            "Lcom/discord/chat/bridge/messageframe/MessageFrame;",
            "Lkotlin/jvm/functions/Function4<",
            "-",
            "Lcom/discord/primitives/MessageId;",
            "-",
            "Lcom/discord/primitives/ChannelId;",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Lcom/discord/chat/bridge/MediaType;",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    move-object/from16 v8, p3

    .line 6
    .line 7
    move-object/from16 v9, p4

    .line 8
    .line 9
    iget-object v1, v0, Lcom/discord/chat/presentation/message/MessageView;->accessories:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 12
    .line 13
    .line 14
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getConstrainedWidth()Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 34
    .line 35
    :goto_0
    move v6, v1

    .line 36
    invoke-virtual/range {p2 .. p2}, Lcom/discord/chat/presentation/root/MessageContext;->getUseAttachmentGridLayout()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    sget v2, Lcom/discord/chat/R$dimen;->message_media_radius:I

    .line 51
    .line 52
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    goto :goto_1

    .line 57
    :cond_1
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    sget v2, Lcom/discord/chat/R$dimen;->message_media_non_mosaic_radius:I

    .line 66
    .line 67
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    :goto_1
    move/from16 v27, v1

    .line 72
    .line 73
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getContent()Lcom/discord/chat/bridge/structurabletext/StructurableText;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    const/4 v4, 0x1

    .line 78
    if-eqz v1, :cond_2

    .line 79
    .line 80
    invoke-virtual {v1}, Lcom/discord/chat/bridge/structurabletext/StructurableText;->getHasContent()Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-ne v1, v4, :cond_2

    .line 85
    .line 86
    move v1, v4

    .line 87
    goto :goto_2

    .line 88
    :cond_2
    const/4 v1, 0x0

    .line 89
    :goto_2
    if-eqz v1, :cond_5

    .line 90
    .line 91
    iget-object v1, v0, Lcom/discord/chat/presentation/message/MessageView;->accessories:Ljava/util/ArrayList;

    .line 92
    .line 93
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getId-3Eiw7ao()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v11

    .line 97
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getContent()Lcom/discord/chat/bridge/structurabletext/StructurableText;

    .line 98
    .line 99
    .line 100
    move-result-object v12

    .line 101
    invoke-static/range {p1 .. p1}, Lcom/discord/chat/bridge/MessageKt;->shouldAnimateEmoji(Lcom/discord/chat/bridge/Message;)Z

    .line 102
    .line 103
    .line 104
    move-result v13

    .line 105
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getShouldShowRoleDot()Z

    .line 106
    .line 107
    .line 108
    move-result v14

    .line 109
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getShouldShowRoleOnName()Z

    .line 110
    .line 111
    .line 112
    move-result v15

    .line 113
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    sget v3, Lcom/discord/chat/R$dimen;->message_accessories_vertical_spacing:I

    .line 118
    .line 119
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 120
    .line 121
    .line 122
    move-result v16

    .line 123
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    invoke-virtual {v2}, Lcom/discord/theme/DiscordTheme;->getTextLink()I

    .line 128
    .line 129
    .line 130
    move-result v17

    .line 131
    sget-object v19, Lcom/discord/fonts/DiscordFont;->PrimaryMedium:Lcom/discord/fonts/DiscordFont;

    .line 132
    .line 133
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    const-string v3, "context"

    .line 138
    .line 139
    invoke-static {v2, v3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    invoke-static {v2}, Lcom/discord/chat/presentation/message/MessageUtilsKt;->getChatTextSizeSp(Landroid/content/Context;)I

    .line 143
    .line 144
    .line 145
    move-result v20

    .line 146
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getState()Lcom/discord/chat/bridge/MessageState;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    if-nez v2, :cond_3

    .line 151
    .line 152
    const/4 v2, -0x1

    .line 153
    goto :goto_3

    .line 154
    :cond_3
    sget-object v3, Lcom/discord/chat/presentation/message/MessageView$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 155
    .line 156
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 157
    .line 158
    .line 159
    move-result v2

    .line 160
    aget v2, v3, v2

    .line 161
    .line 162
    :goto_3
    if-eq v2, v4, :cond_4

    .line 163
    .line 164
    const/4 v3, 0x2

    .line 165
    if-eq v2, v3, :cond_4

    .line 166
    .line 167
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    invoke-virtual {v2}, Lcom/discord/theme/DiscordTheme;->getTextNormal()I

    .line 172
    .line 173
    .line 174
    move-result v2

    .line 175
    goto :goto_4

    .line 176
    :cond_4
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    invoke-virtual {v2}, Lcom/discord/theme/DiscordTheme;->getTextMuted()I

    .line 181
    .line 182
    .line 183
    move-result v2

    .line 184
    :goto_4
    move/from16 v18, v2

    .line 185
    .line 186
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getEdited()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v23

    .line 190
    invoke-virtual/range {p2 .. p2}, Lcom/discord/chat/presentation/root/MessageContext;->getTruncation()Lcom/discord/chat/bridge/truncation/Truncation;

    .line 191
    .line 192
    .line 193
    move-result-object v24

    .line 194
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    .line 195
    .line 196
    .line 197
    move-result-object v25

    .line 198
    new-instance v2, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;

    .line 199
    .line 200
    move-object v10, v2

    .line 201
    const/16 v21, 0x0

    .line 202
    .line 203
    const/16 v26, 0x0

    .line 204
    .line 205
    move/from16 v22, v6

    .line 206
    .line 207
    invoke-direct/range {v10 .. v26}, Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;-><init>(Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;ZZZIIILcom/discord/fonts/DiscordFont;IZILjava/lang/String;Lcom/discord/chat/bridge/truncation/Truncation;Lcom/discord/theme/DiscordTheme;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    :cond_5
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getAttachments()Ljava/util/List;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    const/4 v15, 0x0

    .line 218
    if-eqz v1, :cond_e

    .line 219
    .line 220
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getAttachments()Ljava/util/List;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    invoke-static {v1}, Lkotlin/collections/h;->J0(Ljava/lang/Iterable;)Ljava/lang/Iterable;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    new-instance v2, Ljava/util/ArrayList;

    .line 229
    .line 230
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 231
    .line 232
    .line 233
    new-instance v3, Ljava/util/ArrayList;

    .line 234
    .line 235
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 236
    .line 237
    .line 238
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 243
    .line 244
    .line 245
    move-result v10

    .line 246
    if-eqz v10, :cond_9

    .line 247
    .line 248
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v10

    .line 252
    move-object v11, v10

    .line 253
    check-cast v11, Lmf/m;

    .line 254
    .line 255
    invoke-virtual/range {p2 .. p2}, Lcom/discord/chat/presentation/root/MessageContext;->getUseAttachmentGridLayout()Z

    .line 256
    .line 257
    .line 258
    move-result v12

    .line 259
    if-eqz v12, :cond_7

    .line 260
    .line 261
    invoke-virtual {v11}, Lmf/m;->d()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v12

    .line 265
    check-cast v12, Lcom/discord/chat/bridge/attachment/Attachment;

    .line 266
    .line 267
    invoke-virtual {v12}, Lcom/discord/chat/bridge/attachment/Attachment;->type()Lcom/discord/chat/bridge/attachment/AttachmentType;

    .line 268
    .line 269
    .line 270
    move-result-object v12

    .line 271
    sget-object v13, Lcom/discord/chat/bridge/attachment/AttachmentType;->Image:Lcom/discord/chat/bridge/attachment/AttachmentType;

    .line 272
    .line 273
    if-eq v12, v13, :cond_6

    .line 274
    .line 275
    invoke-virtual {v11}, Lmf/m;->d()Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v11

    .line 279
    check-cast v11, Lcom/discord/chat/bridge/attachment/Attachment;

    .line 280
    .line 281
    invoke-virtual {v11}, Lcom/discord/chat/bridge/attachment/Attachment;->type()Lcom/discord/chat/bridge/attachment/AttachmentType;

    .line 282
    .line 283
    .line 284
    move-result-object v11

    .line 285
    sget-object v12, Lcom/discord/chat/bridge/attachment/AttachmentType;->Video:Lcom/discord/chat/bridge/attachment/AttachmentType;

    .line 286
    .line 287
    if-ne v11, v12, :cond_7

    .line 288
    .line 289
    :cond_6
    move v11, v4

    .line 290
    goto :goto_6

    .line 291
    :cond_7
    const/4 v11, 0x0

    .line 292
    :goto_6
    if-eqz v11, :cond_8

    .line 293
    .line 294
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 295
    .line 296
    .line 297
    goto :goto_5

    .line 298
    :cond_8
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 299
    .line 300
    .line 301
    goto :goto_5

    .line 302
    :cond_9
    new-instance v1, Lkotlin/Pair;

    .line 303
    .line 304
    invoke-direct {v1, v2, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v1}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v2

    .line 311
    check-cast v2, Ljava/util/List;

    .line 312
    .line 313
    invoke-virtual {v1}, Lkotlin/Pair;->b()Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    move-object v10, v1

    .line 318
    check-cast v10, Ljava/util/List;

    .line 319
    .line 320
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 321
    .line 322
    .line 323
    move-result v1

    .line 324
    if-le v1, v4, :cond_d

    .line 325
    .line 326
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->isCurrentUserMessageAuthor()Ljava/lang/Boolean;

    .line 327
    .line 328
    .line 329
    move-result-object v1

    .line 330
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 331
    .line 332
    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    move-result v1

    .line 336
    if-eqz v1, :cond_a

    .line 337
    .line 338
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getNonce-N_6c4I0()Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v1

    .line 342
    if-nez v1, :cond_b

    .line 343
    .line 344
    :cond_a
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getId-3Eiw7ao()Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v1

    .line 348
    :cond_b
    move-object v11, v1

    .line 349
    iget-object v12, v0, Lcom/discord/chat/presentation/message/MessageView;->accessories:Ljava/util/ArrayList;

    .line 350
    .line 351
    new-instance v13, Ljava/util/ArrayList;

    .line 352
    .line 353
    const/16 v1, 0xa

    .line 354
    .line 355
    invoke-static {v2, v1}, Lkotlin/collections/h;->t(Ljava/lang/Iterable;I)I

    .line 356
    .line 357
    .line 358
    move-result v1

    .line 359
    invoke-direct {v13, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 360
    .line 361
    .line 362
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 363
    .line 364
    .line 365
    move-result-object v14

    .line 366
    :goto_7
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 367
    .line 368
    .line 369
    move-result v1

    .line 370
    if-eqz v1, :cond_c

    .line 371
    .line 372
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v1

    .line 376
    check-cast v1, Lmf/m;

    .line 377
    .line 378
    invoke-virtual {v1}, Lmf/m;->d()Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v2

    .line 382
    check-cast v2, Lcom/discord/chat/bridge/attachment/Attachment;

    .line 383
    .line 384
    invoke-virtual {v1}, Lmf/m;->c()I

    .line 385
    .line 386
    .line 387
    move-result v3

    .line 388
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 389
    .line 390
    .line 391
    move-result-object v16

    .line 392
    invoke-virtual/range {v16 .. v16}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 393
    .line 394
    .line 395
    move-result-object v4

    .line 396
    sget v5, Lcom/discord/chat/R$dimen;->message_media_grid_inner_radius:I

    .line 397
    .line 398
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 399
    .line 400
    .line 401
    move-result v5

    .line 402
    invoke-virtual {v1}, Lmf/m;->c()I

    .line 403
    .line 404
    .line 405
    move-result v1

    .line 406
    sget-object v4, Lcom/discord/chat/bridge/MediaType;->Attachment:Lcom/discord/chat/bridge/MediaType;

    .line 407
    .line 408
    invoke-static {v9, v7, v1, v4}, Lcom/discord/chat/presentation/message/MessageView;->generateMessageAccessories$getLongClickListener(Lkotlin/jvm/functions/Function4;Lcom/discord/chat/bridge/Message;ILcom/discord/chat/bridge/MediaType;)Landroid/view/View$OnLongClickListener;

    .line 409
    .line 410
    .line 411
    move-result-object v18

    .line 412
    move-object v1, v2

    .line 413
    move-object/from16 v2, p1

    .line 414
    .line 415
    move v4, v6

    .line 416
    move v8, v6

    .line 417
    move-object/from16 v6, v18

    .line 418
    .line 419
    invoke-static/range {v1 .. v6}, Lcom/discord/chat/presentation/message/CreateAttachmentAccessoryKt;->createAttachmentAccessory(Lcom/discord/chat/bridge/attachment/Attachment;Lcom/discord/chat/bridge/Message;IIILandroid/view/View$OnLongClickListener;)Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;

    .line 420
    .line 421
    .line 422
    move-result-object v1

    .line 423
    invoke-interface {v13, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 424
    .line 425
    .line 426
    move v6, v8

    .line 427
    const/4 v4, 0x1

    .line 428
    move-object/from16 v8, p3

    .line 429
    .line 430
    goto :goto_7

    .line 431
    :cond_c
    move v8, v6

    .line 432
    new-instance v1, Lcom/discord/chat/presentation/message/messagepart/MediaMosaicAttachmentMessageAccessory;

    .line 433
    .line 434
    invoke-direct {v1, v11, v13, v8, v15}, Lcom/discord/chat/presentation/message/messagepart/MediaMosaicAttachmentMessageAccessory;-><init>(Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 435
    .line 436
    .line 437
    invoke-virtual {v12, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 438
    .line 439
    .line 440
    goto :goto_8

    .line 441
    :cond_d
    move v8, v6

    .line 442
    invoke-static {v2, v10}, Lkotlin/collections/h;->o0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    .line 443
    .line 444
    .line 445
    move-result-object v10

    .line 446
    :goto_8
    iget-object v11, v0, Lcom/discord/chat/presentation/message/MessageView;->accessories:Ljava/util/ArrayList;

    .line 447
    .line 448
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 449
    .line 450
    .line 451
    move-result-object v10

    .line 452
    :goto_9
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 453
    .line 454
    .line 455
    move-result v1

    .line 456
    if-eqz v1, :cond_f

    .line 457
    .line 458
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object v1

    .line 462
    check-cast v1, Lmf/m;

    .line 463
    .line 464
    invoke-virtual {v1}, Lmf/m;->d()Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v2

    .line 468
    check-cast v2, Lcom/discord/chat/bridge/attachment/Attachment;

    .line 469
    .line 470
    invoke-virtual {v1}, Lmf/m;->c()I

    .line 471
    .line 472
    .line 473
    move-result v3

    .line 474
    invoke-virtual {v1}, Lmf/m;->c()I

    .line 475
    .line 476
    .line 477
    move-result v1

    .line 478
    sget-object v4, Lcom/discord/chat/bridge/MediaType;->Attachment:Lcom/discord/chat/bridge/MediaType;

    .line 479
    .line 480
    invoke-static {v9, v7, v1, v4}, Lcom/discord/chat/presentation/message/MessageView;->generateMessageAccessories$getLongClickListener(Lkotlin/jvm/functions/Function4;Lcom/discord/chat/bridge/Message;ILcom/discord/chat/bridge/MediaType;)Landroid/view/View$OnLongClickListener;

    .line 481
    .line 482
    .line 483
    move-result-object v6

    .line 484
    move-object v1, v2

    .line 485
    move-object/from16 v2, p1

    .line 486
    .line 487
    move v4, v8

    .line 488
    move/from16 v5, v27

    .line 489
    .line 490
    invoke-static/range {v1 .. v6}, Lcom/discord/chat/presentation/message/CreateAttachmentAccessoryKt;->createAttachmentAccessory(Lcom/discord/chat/bridge/attachment/Attachment;Lcom/discord/chat/bridge/Message;IIILandroid/view/View$OnLongClickListener;)Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;

    .line 491
    .line 492
    .line 493
    move-result-object v1

    .line 494
    invoke-interface {v11, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 495
    .line 496
    .line 497
    goto :goto_9

    .line 498
    :cond_e
    move v8, v6

    .line 499
    :cond_f
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getPostPreviewEmbeds()Ljava/util/List;

    .line 500
    .line 501
    .line 502
    move-result-object v1

    .line 503
    if-eqz v1, :cond_12

    .line 504
    .line 505
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 506
    .line 507
    .line 508
    move-result-object v1

    .line 509
    const/4 v5, 0x0

    .line 510
    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 511
    .line 512
    .line 513
    move-result v2

    .line 514
    if-eqz v2, :cond_11

    .line 515
    .line 516
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 517
    .line 518
    .line 519
    move-result-object v2

    .line 520
    add-int/lit8 v3, v5, 0x1

    .line 521
    .line 522
    if-gez v5, :cond_10

    .line 523
    .line 524
    invoke-static {}, Lkotlin/collections/h;->s()V

    .line 525
    .line 526
    .line 527
    :cond_10
    check-cast v2, Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;

    .line 528
    .line 529
    iget-object v4, v0, Lcom/discord/chat/presentation/message/MessageView;->accessories:Ljava/util/ArrayList;

    .line 530
    .line 531
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getId-3Eiw7ao()Ljava/lang/String;

    .line 532
    .line 533
    .line 534
    move-result-object v6

    .line 535
    new-instance v10, Lcom/discord/chat/presentation/message/messagepart/PostPreviewEmbedMessageAccessory;

    .line 536
    .line 537
    invoke-direct {v10, v6, v2, v5, v15}, Lcom/discord/chat/presentation/message/messagepart/PostPreviewEmbedMessageAccessory;-><init>(Ljava/lang/String;Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 538
    .line 539
    .line 540
    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 541
    .line 542
    .line 543
    move v5, v3

    .line 544
    goto :goto_a

    .line 545
    :cond_11
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 546
    .line 547
    :cond_12
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getEmbeds()Ljava/util/List;

    .line 548
    .line 549
    .line 550
    move-result-object v1

    .line 551
    if-eqz v1, :cond_15

    .line 552
    .line 553
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 554
    .line 555
    .line 556
    move-result-object v1

    .line 557
    const/4 v12, 0x0

    .line 558
    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 559
    .line 560
    .line 561
    move-result v2

    .line 562
    if-eqz v2, :cond_14

    .line 563
    .line 564
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 565
    .line 566
    .line 567
    move-result-object v2

    .line 568
    add-int/lit8 v3, v12, 0x1

    .line 569
    .line 570
    if-gez v12, :cond_13

    .line 571
    .line 572
    invoke-static {}, Lkotlin/collections/h;->s()V

    .line 573
    .line 574
    .line 575
    :cond_13
    check-cast v2, Lcom/discord/chat/bridge/embed/Embed;

    .line 576
    .line 577
    iget-object v4, v0, Lcom/discord/chat/presentation/message/MessageView;->accessories:Ljava/util/ArrayList;

    .line 578
    .line 579
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getId-3Eiw7ao()Ljava/lang/String;

    .line 580
    .line 581
    .line 582
    move-result-object v11

    .line 583
    invoke-static/range {p1 .. p1}, Lcom/discord/chat/bridge/MessageKt;->shouldAutoPlayGifs(Lcom/discord/chat/bridge/Message;)Z

    .line 584
    .line 585
    .line 586
    move-result v16

    .line 587
    invoke-static/range {p1 .. p1}, Lcom/discord/chat/bridge/MessageKt;->shouldAnimateEmoji(Lcom/discord/chat/bridge/Message;)Z

    .line 588
    .line 589
    .line 590
    move-result v17

    .line 591
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getShouldShowRoleDot()Z

    .line 592
    .line 593
    .line 594
    move-result v18

    .line 595
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getShouldShowRoleOnName()Z

    .line 596
    .line 597
    .line 598
    move-result v19

    .line 599
    sget-object v5, Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;->Companion:Lcom/discord/chat/bridge/spoiler/SpoilerAttributes$Companion;

    .line 600
    .line 601
    invoke-virtual {v5, v2, v7, v12}, Lcom/discord/chat/bridge/spoiler/SpoilerAttributes$Companion;->forEmbed(Lcom/discord/chat/bridge/embed/Embed;Lcom/discord/chat/bridge/Message;I)Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;

    .line 602
    .line 603
    .line 604
    move-result-object v20

    .line 605
    sget-object v5, Lcom/discord/chat/bridge/MediaType;->Embed:Lcom/discord/chat/bridge/MediaType;

    .line 606
    .line 607
    invoke-static {v9, v7, v12, v5}, Lcom/discord/chat/presentation/message/MessageView;->generateMessageAccessories$getLongClickListener(Lkotlin/jvm/functions/Function4;Lcom/discord/chat/bridge/Message;ILcom/discord/chat/bridge/MediaType;)Landroid/view/View$OnLongClickListener;

    .line 608
    .line 609
    .line 610
    move-result-object v21

    .line 611
    new-instance v5, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;

    .line 612
    .line 613
    const/16 v22, 0x0

    .line 614
    .line 615
    move-object v10, v5

    .line 616
    move v13, v8

    .line 617
    move/from16 v14, v27

    .line 618
    .line 619
    move-object v6, v15

    .line 620
    move-object v15, v2

    .line 621
    invoke-direct/range {v10 .. v22}, Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;-><init>(Ljava/lang/String;IIILcom/discord/chat/bridge/embed/Embed;ZZZZLcom/discord/chat/bridge/spoiler/SpoilerAttributes;Landroid/view/View$OnLongClickListener;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 622
    .line 623
    .line 624
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 625
    .line 626
    .line 627
    move v12, v3

    .line 628
    move-object v15, v6

    .line 629
    goto :goto_b

    .line 630
    :cond_14
    move-object v6, v15

    .line 631
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 632
    .line 633
    goto :goto_c

    .line 634
    :cond_15
    move-object v6, v15

    .line 635
    :goto_c
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getGiftCodes()Ljava/util/List;

    .line 636
    .line 637
    .line 638
    move-result-object v1

    .line 639
    if-eqz v1, :cond_18

    .line 640
    .line 641
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 642
    .line 643
    .line 644
    move-result-object v1

    .line 645
    const/4 v5, 0x0

    .line 646
    :goto_d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 647
    .line 648
    .line 649
    move-result v2

    .line 650
    if-eqz v2, :cond_17

    .line 651
    .line 652
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 653
    .line 654
    .line 655
    move-result-object v2

    .line 656
    add-int/lit8 v3, v5, 0x1

    .line 657
    .line 658
    if-gez v5, :cond_16

    .line 659
    .line 660
    invoke-static {}, Lkotlin/collections/h;->s()V

    .line 661
    .line 662
    .line 663
    :cond_16
    check-cast v2, Lcom/discord/chat/bridge/gift/GiftEmbed;

    .line 664
    .line 665
    iget-object v4, v0, Lcom/discord/chat/presentation/message/MessageView;->accessories:Ljava/util/ArrayList;

    .line 666
    .line 667
    new-instance v9, Lcom/discord/chat/presentation/message/messagepart/GiftMessageAccessory;

    .line 668
    .line 669
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getId-3Eiw7ao()Ljava/lang/String;

    .line 670
    .line 671
    .line 672
    move-result-object v10

    .line 673
    invoke-direct {v9, v10, v5, v2, v6}, Lcom/discord/chat/presentation/message/messagepart/GiftMessageAccessory;-><init>(Ljava/lang/String;ILcom/discord/chat/bridge/gift/GiftEmbed;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 674
    .line 675
    .line 676
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 677
    .line 678
    .line 679
    move v5, v3

    .line 680
    goto :goto_d

    .line 681
    :cond_17
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 682
    .line 683
    :cond_18
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getReferralTrialOffer()Lcom/discord/chat/bridge/gift/GiftEmbed;

    .line 684
    .line 685
    .line 686
    move-result-object v1

    .line 687
    if-eqz v1, :cond_19

    .line 688
    .line 689
    iget-object v2, v0, Lcom/discord/chat/presentation/message/MessageView;->accessories:Ljava/util/ArrayList;

    .line 690
    .line 691
    new-instance v3, Lcom/discord/chat/presentation/message/messagepart/GiftMessageAccessory;

    .line 692
    .line 693
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getId-3Eiw7ao()Ljava/lang/String;

    .line 694
    .line 695
    .line 696
    move-result-object v4

    .line 697
    const/4 v5, 0x0

    .line 698
    invoke-direct {v3, v4, v5, v1, v6}, Lcom/discord/chat/presentation/message/messagepart/GiftMessageAccessory;-><init>(Ljava/lang/String;ILcom/discord/chat/bridge/gift/GiftEmbed;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 699
    .line 700
    .line 701
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 702
    .line 703
    .line 704
    goto :goto_e

    .line 705
    :cond_19
    const/4 v5, 0x0

    .line 706
    :goto_e
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getProgress()Ljava/util/List;

    .line 707
    .line 708
    .line 709
    move-result-object v1

    .line 710
    if-eqz v1, :cond_1c

    .line 711
    .line 712
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 713
    .line 714
    .line 715
    move-result-object v1

    .line 716
    move v2, v5

    .line 717
    :goto_f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 718
    .line 719
    .line 720
    move-result v3

    .line 721
    if-eqz v3, :cond_1b

    .line 722
    .line 723
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 724
    .line 725
    .line 726
    move-result-object v3

    .line 727
    add-int/lit8 v4, v2, 0x1

    .line 728
    .line 729
    if-gez v2, :cond_1a

    .line 730
    .line 731
    invoke-static {}, Lkotlin/collections/h;->s()V

    .line 732
    .line 733
    .line 734
    :cond_1a
    check-cast v3, Lcom/discord/chat/bridge/UploadProgress;

    .line 735
    .line 736
    iget-object v9, v0, Lcom/discord/chat/presentation/message/MessageView;->accessories:Ljava/util/ArrayList;

    .line 737
    .line 738
    new-instance v10, Lcom/discord/chat/presentation/message/messagepart/UploadProgressMessageAccessory;

    .line 739
    .line 740
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getId-3Eiw7ao()Ljava/lang/String;

    .line 741
    .line 742
    .line 743
    move-result-object v11

    .line 744
    invoke-direct {v10, v11, v2, v3, v6}, Lcom/discord/chat/presentation/message/messagepart/UploadProgressMessageAccessory;-><init>(Ljava/lang/String;ILcom/discord/chat/bridge/UploadProgress;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 745
    .line 746
    .line 747
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 748
    .line 749
    .line 750
    move v2, v4

    .line 751
    goto :goto_f

    .line 752
    :cond_1b
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 753
    .line 754
    :cond_1c
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getCodedLinks()Ljava/util/List;

    .line 755
    .line 756
    .line 757
    move-result-object v1

    .line 758
    if-eqz v1, :cond_25

    .line 759
    .line 760
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 761
    .line 762
    .line 763
    move-result-object v1

    .line 764
    move v11, v5

    .line 765
    :goto_10
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 766
    .line 767
    .line 768
    move-result v2

    .line 769
    if-eqz v2, :cond_24

    .line 770
    .line 771
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 772
    .line 773
    .line 774
    move-result-object v2

    .line 775
    add-int/lit8 v3, v11, 0x1

    .line 776
    .line 777
    if-gez v11, :cond_1d

    .line 778
    .line 779
    invoke-static {}, Lkotlin/collections/h;->s()V

    .line 780
    .line 781
    .line 782
    :cond_1d
    check-cast v2, Lcom/discord/chat/bridge/codedlinks/CodedLinkEmbed;

    .line 783
    .line 784
    if-eqz v2, :cond_23

    .line 785
    .line 786
    iget-object v4, v0, Lcom/discord/chat/presentation/message/MessageView;->accessories:Ljava/util/ArrayList;

    .line 787
    .line 788
    instance-of v9, v2, Lcom/discord/chat/bridge/codedlinks/GuildEventInviteEmbedImpl;

    .line 789
    .line 790
    if-eqz v9, :cond_1e

    .line 791
    .line 792
    new-instance v17, Lcom/discord/chat/presentation/message/messagepart/GuildEventInviteMessageAccessory;

    .line 793
    .line 794
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getId-3Eiw7ao()Ljava/lang/String;

    .line 795
    .line 796
    .line 797
    move-result-object v10

    .line 798
    move-object v12, v2

    .line 799
    check-cast v12, Lcom/discord/chat/bridge/codedlinks/GuildEventInviteEmbedImpl;

    .line 800
    .line 801
    invoke-static/range {p1 .. p1}, Lcom/discord/chat/bridge/MessageKt;->shouldAnimateEmoji(Lcom/discord/chat/bridge/Message;)Z

    .line 802
    .line 803
    .line 804
    move-result v13

    .line 805
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getShouldShowRoleDot()Z

    .line 806
    .line 807
    .line 808
    move-result v14

    .line 809
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getShouldShowRoleDot()Z

    .line 810
    .line 811
    .line 812
    move-result v15

    .line 813
    const/16 v16, 0x0

    .line 814
    .line 815
    move-object/from16 v9, v17

    .line 816
    .line 817
    invoke-direct/range {v9 .. v16}, Lcom/discord/chat/presentation/message/messagepart/GuildEventInviteMessageAccessory;-><init>(Ljava/lang/String;ILcom/discord/chat/bridge/codedlinks/GuildEventInviteEmbedImpl;ZZZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 818
    .line 819
    .line 820
    goto :goto_11

    .line 821
    :cond_1e
    instance-of v9, v2, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;

    .line 822
    .line 823
    if-eqz v9, :cond_1f

    .line 824
    .line 825
    new-instance v9, Lcom/discord/chat/presentation/message/messagepart/GuildInviteDisabledMessageAccessory;

    .line 826
    .line 827
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getId-3Eiw7ao()Ljava/lang/String;

    .line 828
    .line 829
    .line 830
    move-result-object v10

    .line 831
    check-cast v2, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;

    .line 832
    .line 833
    invoke-direct {v9, v10, v11, v2, v6}, Lcom/discord/chat/presentation/message/messagepart/GuildInviteDisabledMessageAccessory;-><init>(Ljava/lang/String;ILcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 834
    .line 835
    .line 836
    goto :goto_11

    .line 837
    :cond_1f
    instance-of v9, v2, Lcom/discord/chat/bridge/codedlinks/GuildInviteEmbedImpl;

    .line 838
    .line 839
    if-eqz v9, :cond_20

    .line 840
    .line 841
    new-instance v9, Lcom/discord/chat/presentation/message/messagepart/GuildInviteMessageAccessory;

    .line 842
    .line 843
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getId-3Eiw7ao()Ljava/lang/String;

    .line 844
    .line 845
    .line 846
    move-result-object v10

    .line 847
    check-cast v2, Lcom/discord/chat/bridge/codedlinks/GuildInviteEmbedImpl;

    .line 848
    .line 849
    invoke-direct {v9, v10, v11, v2, v6}, Lcom/discord/chat/presentation/message/messagepart/GuildInviteMessageAccessory;-><init>(Ljava/lang/String;ILcom/discord/chat/bridge/codedlinks/GuildInviteEmbedImpl;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 850
    .line 851
    .line 852
    goto :goto_11

    .line 853
    :cond_20
    instance-of v9, v2, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;

    .line 854
    .line 855
    if-eqz v9, :cond_21

    .line 856
    .line 857
    new-instance v17, Lcom/discord/chat/presentation/message/messagepart/ActivityLauncherMessageAccessory;

    .line 858
    .line 859
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getId-3Eiw7ao()Ljava/lang/String;

    .line 860
    .line 861
    .line 862
    move-result-object v10

    .line 863
    move-object v12, v2

    .line 864
    check-cast v12, Lcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;

    .line 865
    .line 866
    const/4 v14, 0x0

    .line 867
    move-object/from16 v9, v17

    .line 868
    .line 869
    move v13, v8

    .line 870
    invoke-direct/range {v9 .. v14}, Lcom/discord/chat/presentation/message/messagepart/ActivityLauncherMessageAccessory;-><init>(Ljava/lang/String;ILcom/discord/chat/bridge/codedlinks/ActivityLauncherEmbedImpl;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 871
    .line 872
    .line 873
    goto :goto_11

    .line 874
    :cond_21
    instance-of v9, v2, Lcom/discord/chat/bridge/codedlinks/EmbeddedActivityInviteEmbedImpl;

    .line 875
    .line 876
    if-eqz v9, :cond_22

    .line 877
    .line 878
    new-instance v17, Lcom/discord/chat/presentation/message/messagepart/EmbeddedActivityInviteMessageAccessory;

    .line 879
    .line 880
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getId-3Eiw7ao()Ljava/lang/String;

    .line 881
    .line 882
    .line 883
    move-result-object v10

    .line 884
    move-object v12, v2

    .line 885
    check-cast v12, Lcom/discord/chat/bridge/codedlinks/EmbeddedActivityInviteEmbedImpl;

    .line 886
    .line 887
    const/4 v14, 0x0

    .line 888
    move-object/from16 v9, v17

    .line 889
    .line 890
    move v13, v8

    .line 891
    invoke-direct/range {v9 .. v14}, Lcom/discord/chat/presentation/message/messagepart/EmbeddedActivityInviteMessageAccessory;-><init>(Ljava/lang/String;ILcom/discord/chat/bridge/codedlinks/EmbeddedActivityInviteEmbedImpl;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 892
    .line 893
    .line 894
    :goto_11
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 895
    .line 896
    .line 897
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 898
    .line 899
    goto :goto_12

    .line 900
    :cond_22
    new-instance v1, Llf/q;

    .line 901
    .line 902
    invoke-direct {v1}, Llf/q;-><init>()V

    .line 903
    .line 904
    .line 905
    throw v1

    .line 906
    :cond_23
    :goto_12
    move v11, v3

    .line 907
    goto/16 :goto_10

    .line 908
    .line 909
    :cond_24
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 910
    .line 911
    :cond_25
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getStickers()Ljava/util/List;

    .line 912
    .line 913
    .line 914
    move-result-object v1

    .line 915
    if-eqz v1, :cond_27

    .line 916
    .line 917
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 918
    .line 919
    .line 920
    move-result-object v1

    .line 921
    :goto_13
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 922
    .line 923
    .line 924
    move-result v2

    .line 925
    if-eqz v2, :cond_26

    .line 926
    .line 927
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 928
    .line 929
    .line 930
    move-result-object v2

    .line 931
    check-cast v2, Lcom/discord/chat/bridge/sticker/Sticker;

    .line 932
    .line 933
    iget-object v3, v0, Lcom/discord/chat/presentation/message/MessageView;->accessories:Ljava/util/ArrayList;

    .line 934
    .line 935
    new-instance v4, Lcom/discord/chat/presentation/message/messagepart/StickerMessageAccessory;

    .line 936
    .line 937
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getId-3Eiw7ao()Ljava/lang/String;

    .line 938
    .line 939
    .line 940
    move-result-object v8

    .line 941
    invoke-direct {v4, v8, v2, v6}, Lcom/discord/chat/presentation/message/messagepart/StickerMessageAccessory;-><init>(Ljava/lang/String;Lcom/discord/chat/bridge/sticker/Sticker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 942
    .line 943
    .line 944
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 945
    .line 946
    .line 947
    goto :goto_13

    .line 948
    :cond_26
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 949
    .line 950
    :cond_27
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getComponents()Ljava/util/List;

    .line 951
    .line 952
    .line 953
    move-result-object v1

    .line 954
    if-eqz v1, :cond_28

    .line 955
    .line 956
    iget-object v1, v0, Lcom/discord/chat/presentation/message/MessageView;->accessories:Ljava/util/ArrayList;

    .line 957
    .line 958
    new-instance v2, Lcom/discord/chat/presentation/message/messagepart/MessageComponentsAccessory;

    .line 959
    .line 960
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getId-3Eiw7ao()Ljava/lang/String;

    .line 961
    .line 962
    .line 963
    move-result-object v9

    .line 964
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getFlags()J

    .line 965
    .line 966
    .line 967
    move-result-wide v10

    .line 968
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getComponents()Ljava/util/List;

    .line 969
    .line 970
    .line 971
    move-result-object v12

    .line 972
    const/4 v13, 0x0

    .line 973
    move-object v8, v2

    .line 974
    invoke-direct/range {v8 .. v13}, Lcom/discord/chat/presentation/message/messagepart/MessageComponentsAccessory;-><init>(Ljava/lang/String;JLjava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 975
    .line 976
    .line 977
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 978
    .line 979
    .line 980
    :cond_28
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getReactions()Ljava/util/List;

    .line 981
    .line 982
    .line 983
    move-result-object v1

    .line 984
    if-eqz v1, :cond_29

    .line 985
    .line 986
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 987
    .line 988
    .line 989
    move-result v1

    .line 990
    const/4 v2, 0x1

    .line 991
    xor-int/2addr v1, v2

    .line 992
    if-ne v1, v2, :cond_29

    .line 993
    .line 994
    move v5, v2

    .line 995
    :cond_29
    if-eqz v5, :cond_2b

    .line 996
    .line 997
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->isFirstForumPostMessage()Z

    .line 998
    .line 999
    .line 1000
    move-result v1

    .line 1001
    if-eqz v1, :cond_2a

    .line 1002
    .line 1003
    goto :goto_14

    .line 1004
    :cond_2a
    move-object/from16 v1, p3

    .line 1005
    .line 1006
    goto :goto_15

    .line 1007
    :cond_2b
    :goto_14
    move-object/from16 v1, p3

    .line 1008
    .line 1009
    instance-of v2, v1, Lcom/discord/chat/bridge/messageframe/MessageFrameMediaViewer;

    .line 1010
    .line 1011
    if-eqz v2, :cond_2d

    .line 1012
    .line 1013
    :goto_15
    iget-object v2, v0, Lcom/discord/chat/presentation/message/MessageView;->accessories:Ljava/util/ArrayList;

    .line 1014
    .line 1015
    new-instance v3, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;

    .line 1016
    .line 1017
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getId-3Eiw7ao()Ljava/lang/String;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v9

    .line 1021
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getReactions()Ljava/util/List;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v4

    .line 1025
    if-nez v4, :cond_2c

    .line 1026
    .line 1027
    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    .line 1028
    .line 1029
    .line 1030
    move-result-object v4

    .line 1031
    :cond_2c
    move-object v10, v4

    .line 1032
    invoke-virtual/range {p2 .. p2}, Lcom/discord/chat/presentation/root/MessageContext;->getCanAddNewReactions()Z

    .line 1033
    .line 1034
    .line 1035
    move-result v11

    .line 1036
    invoke-virtual/range {p2 .. p2}, Lcom/discord/chat/presentation/root/MessageContext;->getUseAddBurstReaction()Z

    .line 1037
    .line 1038
    .line 1039
    move-result v12

    .line 1040
    invoke-virtual/range {p2 .. p2}, Lcom/discord/chat/presentation/root/MessageContext;->getAddReactionLabel()Ljava/lang/String;

    .line 1041
    .line 1042
    .line 1043
    move-result-object v13

    .line 1044
    invoke-virtual/range {p2 .. p2}, Lcom/discord/chat/presentation/root/MessageContext;->getAddNewReactionAccessibilityLabel()Ljava/lang/String;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v14

    .line 1048
    invoke-virtual/range {p2 .. p2}, Lcom/discord/chat/presentation/root/MessageContext;->getAddNewBurstReactionAccessibilityLabel()Ljava/lang/String;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v15

    .line 1052
    invoke-virtual/range {p2 .. p2}, Lcom/discord/chat/presentation/root/MessageContext;->getReactionsTheme()Lcom/discord/chat/bridge/reaction/ReactionsTheme;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v16

    .line 1056
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v17

    .line 1060
    invoke-virtual/range {p2 .. p2}, Lcom/discord/chat/presentation/root/MessageContext;->getUseSortedReactions()Z

    .line 1061
    .line 1062
    .line 1063
    move-result v18

    .line 1064
    const/16 v19, 0x0

    .line 1065
    .line 1066
    move-object v8, v3

    .line 1067
    invoke-direct/range {v8 .. v19}, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;-><init>(Ljava/lang/String;Ljava/util/List;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/reaction/ReactionsTheme;Lcom/discord/theme/DiscordTheme;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1068
    .line 1069
    .line 1070
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1071
    .line 1072
    .line 1073
    :cond_2d
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getActivityInviteEmbed()Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v2

    .line 1077
    if-eqz v2, :cond_2e

    .line 1078
    .line 1079
    iget-object v3, v0, Lcom/discord/chat/presentation/message/MessageView;->accessories:Ljava/util/ArrayList;

    .line 1080
    .line 1081
    new-instance v4, Lcom/discord/chat/presentation/message/messagepart/ActivityInviteEmbedMessageAccessory;

    .line 1082
    .line 1083
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getId-3Eiw7ao()Ljava/lang/String;

    .line 1084
    .line 1085
    .line 1086
    move-result-object v5

    .line 1087
    invoke-direct {v4, v5, v2, v6}, Lcom/discord/chat/presentation/message/messagepart/ActivityInviteEmbedMessageAccessory;-><init>(Ljava/lang/String;Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1088
    .line 1089
    .line 1090
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1091
    .line 1092
    .line 1093
    :cond_2e
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getThreadEmbed()Lcom/discord/chat/bridge/threads/ThreadEmbed;

    .line 1094
    .line 1095
    .line 1096
    move-result-object v2

    .line 1097
    if-eqz v2, :cond_2f

    .line 1098
    .line 1099
    iget-object v3, v0, Lcom/discord/chat/presentation/message/MessageView;->accessories:Ljava/util/ArrayList;

    .line 1100
    .line 1101
    new-instance v4, Lcom/discord/chat/presentation/message/messagepart/ThreadEmbedMessageAccessory;

    .line 1102
    .line 1103
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getId-3Eiw7ao()Ljava/lang/String;

    .line 1104
    .line 1105
    .line 1106
    move-result-object v5

    .line 1107
    invoke-direct {v4, v5, v2, v6}, Lcom/discord/chat/presentation/message/messagepart/ThreadEmbedMessageAccessory;-><init>(Ljava/lang/String;Lcom/discord/chat/bridge/threads/ThreadEmbed;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1108
    .line 1109
    .line 1110
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1111
    .line 1112
    .line 1113
    :cond_2f
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getInteractionStatus()Lcom/discord/chat/bridge/interaction/InteractionStatus;

    .line 1114
    .line 1115
    .line 1116
    move-result-object v2

    .line 1117
    if-eqz v2, :cond_30

    .line 1118
    .line 1119
    iget-object v3, v0, Lcom/discord/chat/presentation/message/MessageView;->accessories:Ljava/util/ArrayList;

    .line 1120
    .line 1121
    new-instance v4, Lcom/discord/chat/presentation/message/messagepart/InteractionStatusMessageAccessory;

    .line 1122
    .line 1123
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getId-3Eiw7ao()Ljava/lang/String;

    .line 1124
    .line 1125
    .line 1126
    move-result-object v5

    .line 1127
    invoke-direct {v4, v5, v2, v6}, Lcom/discord/chat/presentation/message/messagepart/InteractionStatusMessageAccessory;-><init>(Ljava/lang/String;Lcom/discord/chat/bridge/interaction/InteractionStatus;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1128
    .line 1129
    .line 1130
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1131
    .line 1132
    .line 1133
    :cond_30
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getEphemeralIndication()Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;

    .line 1134
    .line 1135
    .line 1136
    move-result-object v2

    .line 1137
    if-eqz v2, :cond_31

    .line 1138
    .line 1139
    iget-object v3, v0, Lcom/discord/chat/presentation/message/MessageView;->accessories:Ljava/util/ArrayList;

    .line 1140
    .line 1141
    new-instance v4, Lcom/discord/chat/presentation/message/messagepart/EphemeralIndicationMessageAccessory;

    .line 1142
    .line 1143
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getId-3Eiw7ao()Ljava/lang/String;

    .line 1144
    .line 1145
    .line 1146
    move-result-object v5

    .line 1147
    invoke-direct {v4, v5, v2, v6}, Lcom/discord/chat/presentation/message/messagepart/EphemeralIndicationMessageAccessory;-><init>(Ljava/lang/String;Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1148
    .line 1149
    .line 1150
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1151
    .line 1152
    .line 1153
    :cond_31
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getSurveyIndication()Lcom/discord/chat/bridge/feedback/SurveyIndication;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v2

    .line 1157
    if-eqz v2, :cond_32

    .line 1158
    .line 1159
    iget-object v3, v0, Lcom/discord/chat/presentation/message/MessageView;->accessories:Ljava/util/ArrayList;

    .line 1160
    .line 1161
    new-instance v4, Lcom/discord/chat/presentation/message/messagepart/SurveyIndicationMessageAccessory;

    .line 1162
    .line 1163
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getId-3Eiw7ao()Ljava/lang/String;

    .line 1164
    .line 1165
    .line 1166
    move-result-object v5

    .line 1167
    invoke-direct {v4, v5, v2, v6}, Lcom/discord/chat/presentation/message/messagepart/SurveyIndicationMessageAccessory;-><init>(Ljava/lang/String;Lcom/discord/chat/bridge/feedback/SurveyIndication;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1168
    .line 1169
    .line 1170
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1171
    .line 1172
    .line 1173
    :cond_32
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->isFirstForumPostMessage()Z

    .line 1174
    .line 1175
    .line 1176
    move-result v2

    .line 1177
    if-eqz v2, :cond_33

    .line 1178
    .line 1179
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getPostActions()Lcom/discord/chat/bridge/forums/ForumPostActions;

    .line 1180
    .line 1181
    .line 1182
    move-result-object v2

    .line 1183
    if-eqz v2, :cond_33

    .line 1184
    .line 1185
    instance-of v1, v1, Lcom/discord/chat/bridge/messageframe/MessageFrameMediaViewer;

    .line 1186
    .line 1187
    if-nez v1, :cond_33

    .line 1188
    .line 1189
    iget-object v1, v0, Lcom/discord/chat/presentation/message/MessageView;->accessories:Ljava/util/ArrayList;

    .line 1190
    .line 1191
    new-instance v11, Lcom/discord/chat/presentation/message/messagepart/ForumPostActionBar;

    .line 1192
    .line 1193
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getId-3Eiw7ao()Ljava/lang/String;

    .line 1194
    .line 1195
    .line 1196
    move-result-object v3

    .line 1197
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getPostActions()Lcom/discord/chat/bridge/forums/ForumPostActions;

    .line 1198
    .line 1199
    .line 1200
    move-result-object v4

    .line 1201
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getReactions()Ljava/util/List;

    .line 1202
    .line 1203
    .line 1204
    move-result-object v5

    .line 1205
    invoke-virtual/range {p2 .. p2}, Lcom/discord/chat/presentation/root/MessageContext;->getCanAddNewReactions()Z

    .line 1206
    .line 1207
    .line 1208
    move-result v6

    .line 1209
    invoke-virtual/range {p2 .. p2}, Lcom/discord/chat/presentation/root/MessageContext;->getAddNewReactionAccessibilityLabel()Ljava/lang/String;

    .line 1210
    .line 1211
    .line 1212
    move-result-object v7

    .line 1213
    invoke-virtual/range {p2 .. p2}, Lcom/discord/chat/presentation/root/MessageContext;->getReactionsTheme()Lcom/discord/chat/bridge/reaction/ReactionsTheme;

    .line 1214
    .line 1215
    .line 1216
    move-result-object v8

    .line 1217
    invoke-virtual/range {p2 .. p2}, Lcom/discord/chat/presentation/root/MessageContext;->getUseSortedReactions()Z

    .line 1218
    .line 1219
    .line 1220
    move-result v9

    .line 1221
    const/4 v10, 0x0

    .line 1222
    move-object v2, v11

    .line 1223
    invoke-direct/range {v2 .. v10}, Lcom/discord/chat/presentation/message/messagepart/ForumPostActionBar;-><init>(Ljava/lang/String;Lcom/discord/chat/bridge/forums/ForumPostActions;Ljava/util/List;ZLjava/lang/String;Lcom/discord/chat/bridge/reaction/ReactionsTheme;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1224
    .line 1225
    .line 1226
    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1227
    .line 1228
    .line 1229
    :cond_33
    iget-object v1, v0, Lcom/discord/chat/presentation/message/MessageView;->accessories:Ljava/util/ArrayList;

    .line 1230
    .line 1231
    return-object v1
.end method

.method private static final generateMessageAccessories$getLongClickListener(Lkotlin/jvm/functions/Function4;Lcom/discord/chat/bridge/Message;ILcom/discord/chat/bridge/MediaType;)Landroid/view/View$OnLongClickListener;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function4<",
            "-",
            "Lcom/discord/primitives/MessageId;",
            "-",
            "Lcom/discord/primitives/ChannelId;",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Lcom/discord/chat/bridge/MediaType;",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/discord/chat/bridge/Message;",
            "I",
            "Lcom/discord/chat/bridge/MediaType;",
            ")",
            "Landroid/view/View$OnLongClickListener;"
        }
    .end annotation

    if-eqz p0, :cond_0

    new-instance v0, Lcom/discord/chat/presentation/message/q;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/discord/chat/presentation/message/q;-><init>(Lkotlin/jvm/functions/Function4;Lcom/discord/chat/bridge/Message;ILcom/discord/chat/bridge/MediaType;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method private static final generateMessageAccessories$getLongClickListener$lambda$7$lambda$6(Lkotlin/jvm/functions/Function4;Lcom/discord/chat/bridge/Message;ILcom/discord/chat/bridge/MediaType;Landroid/view/View;)Z
    .locals 2

    .line 1
    const-string p4, "$message"

    .line 2
    .line 3
    invoke-static {p1, p4}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p4, "$mediaType"

    .line 7
    .line 8
    invoke-static {p3, p4}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/discord/chat/bridge/Message;->getId-3Eiw7ao()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p4

    .line 15
    invoke-static {p4}, Lcom/discord/primitives/MessageId;->box-impl(Ljava/lang/String;)Lcom/discord/primitives/MessageId;

    .line 16
    .line 17
    .line 18
    move-result-object p4

    .line 19
    invoke-virtual {p1}, Lcom/discord/chat/bridge/Message;->getChannelId-o4g7jtM()J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    invoke-static {v0, v1}, Lcom/discord/primitives/ChannelId;->box-impl(J)Lcom/discord/primitives/ChannelId;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-interface {p0, p4, p1, p2, p3}, Lkotlin/jvm/functions/Function4;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    const/4 p0, 0x1

    .line 35
    return p0
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
.end method

.method public static synthetic h(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/events/ChatEventHandler;Landroid/view/View;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/discord/chat/presentation/message/MessageView;->configureAuthorClickListeners$lambda$5(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/events/ChatEventHandler;Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method public static synthetic i(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/events/ChatEventHandler;Landroid/view/View;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/discord/chat/presentation/message/MessageView;->configureAuthor$lambda$28$lambda$27(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/events/ChatEventHandler;Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method public static synthetic setMessage$default(Lcom/discord/chat/presentation/message/MessageView;Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/root/MessageContext;Lcom/discord/chat/bridge/messageframe/MessageFrame;Lcom/discord/chat/presentation/events/ChatEventHandler;Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;Lkotlin/jvm/functions/Function0;ZZZILjava/lang/Object;)V
    .locals 13

    .line 1
    move/from16 v0, p10

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x4

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    move-object v6, v2

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move-object/from16 v6, p3

    .line 11
    .line 12
    :goto_0
    and-int/lit8 v1, v0, 0x8

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    sget-object v1, Lcom/discord/chat/presentation/events/ChatEventHandler$Empty;->INSTANCE:Lcom/discord/chat/presentation/events/ChatEventHandler$Empty;

    .line 17
    .line 18
    move-object v7, v1

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    move-object/from16 v7, p4

    .line 21
    .line 22
    :goto_1
    and-int/lit8 v1, v0, 0x10

    .line 23
    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    move-object v8, v2

    .line 27
    goto :goto_2

    .line 28
    :cond_2
    move-object/from16 v8, p5

    .line 29
    .line 30
    :goto_2
    and-int/lit8 v1, v0, 0x20

    .line 31
    .line 32
    if-eqz v1, :cond_3

    .line 33
    .line 34
    sget-object v1, Lcom/discord/chat/presentation/message/MessageView$setMessage$1;->INSTANCE:Lcom/discord/chat/presentation/message/MessageView$setMessage$1;

    .line 35
    .line 36
    move-object v9, v1

    .line 37
    goto :goto_3

    .line 38
    :cond_3
    move-object/from16 v9, p6

    .line 39
    .line 40
    :goto_3
    and-int/lit8 v1, v0, 0x40

    .line 41
    .line 42
    if-eqz v1, :cond_4

    .line 43
    .line 44
    const/4 v1, 0x1

    .line 45
    move v10, v1

    .line 46
    goto :goto_4

    .line 47
    :cond_4
    move/from16 v10, p7

    .line 48
    .line 49
    :goto_4
    and-int/lit16 v1, v0, 0x80

    .line 50
    .line 51
    const/4 v2, 0x0

    .line 52
    if-eqz v1, :cond_5

    .line 53
    .line 54
    move v11, v2

    .line 55
    goto :goto_5

    .line 56
    :cond_5
    move/from16 v11, p8

    .line 57
    .line 58
    :goto_5
    and-int/lit16 v0, v0, 0x100

    .line 59
    .line 60
    if-eqz v0, :cond_6

    .line 61
    .line 62
    move v12, v2

    .line 63
    goto :goto_6

    .line 64
    :cond_6
    move/from16 v12, p9

    .line 65
    .line 66
    :goto_6
    move-object v3, p0

    .line 67
    move-object v4, p1

    .line 68
    move-object v5, p2

    .line 69
    invoke-virtual/range {v3 .. v12}, Lcom/discord/chat/presentation/message/MessageView;->setMessage(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/root/MessageContext;Lcom/discord/chat/bridge/messageframe/MessageFrame;Lcom/discord/chat/presentation/events/ChatEventHandler;Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;Lkotlin/jvm/functions/Function0;ZZZ)V

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method private static final setMessage$lambda$1$lambda$0(Lkotlin/jvm/functions/Function2;Lcom/discord/chat/bridge/Message;Landroid/view/View;)V
    .locals 2

    .line 1
    const-string p2, "$onMessageTapped"

    .line 2
    .line 3
    invoke-static {p0, p2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p2, "$message"

    .line 7
    .line 8
    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/discord/chat/bridge/Message;->getId-3Eiw7ao()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-static {p2}, Lcom/discord/primitives/MessageId;->box-impl(Ljava/lang/String;)Lcom/discord/primitives/MessageId;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-virtual {p1}, Lcom/discord/chat/bridge/Message;->getChannelId-o4g7jtM()J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    invoke-static {v0, v1}, Lcom/discord/primitives/ChannelId;->box-impl(J)Lcom/discord/primitives/ChannelId;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-interface {p0, p2, p1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    return-void
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
.end method

.method private static final setMessage$lambda$3$lambda$2(Lkotlin/jvm/functions/Function4;Lcom/discord/chat/bridge/Message;Landroid/view/View;)Z
    .locals 2

    .line 1
    const-string p2, "$it"

    .line 2
    .line 3
    invoke-static {p0, p2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p2, "$message"

    .line 7
    .line 8
    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/discord/chat/bridge/Message;->getId-3Eiw7ao()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-static {p2}, Lcom/discord/primitives/MessageId;->box-impl(Ljava/lang/String;)Lcom/discord/primitives/MessageId;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-virtual {p1}, Lcom/discord/chat/bridge/Message;->getChannelId-o4g7jtM()J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    invoke-static {v0, v1}, Lcom/discord/primitives/ChannelId;->box-impl(J)Lcom/discord/primitives/ChannelId;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const/4 v0, 0x0

    .line 28
    invoke-interface {p0, p2, p1, v0, v0}, Lkotlin/jvm/functions/Function4;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x1

    .line 32
    return p0
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
.end method


# virtual methods
.method public getEnableSwipeToReply()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/message/MessageView;->enableSwipeToReply:Z

    return v0
.end method

.method public getOnInitiateReply()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/presentation/message/MessageView;->onInitiateReply:Lkotlin/jvm/functions/Function0;

    return-object v0
.end method

.method public getSpineOriginView()Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lcom/discord/chat/presentation/message/MessageView;->binding:Lcom/discord/chat/databinding/MessageViewBinding;

    iget-object v0, v0, Lcom/discord/chat/databinding/MessageViewBinding;->authorAvatar:Lcom/facebook/drawee/view/SimpleDraweeView;

    const-string v1, "binding.authorAvatar"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    const-string v0, "ev"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean p1, p0, Lcom/discord/chat/presentation/message/MessageView;->allowChildGestures:Z

    .line 7
    .line 8
    xor-int/lit8 p1, p1, 0x1

    .line 9
    .line 10
    return p1
    .line 11
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

.method public final setAccessoriesRecycledViewPool(Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;)V
    .locals 1

    .line 1
    const-string v0, "recycledViewPool"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/discord/chat/presentation/message/MessageView;->binding:Lcom/discord/chat/databinding/MessageViewBinding;

    .line 7
    .line 8
    iget-object v0, v0, Lcom/discord/chat/databinding/MessageViewBinding;->accessoriesView:Lcom/discord/chat/presentation/message/MessageAccessoriesView;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setRecycledViewPool(Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;)V

    .line 11
    .line 12
    .line 13
    return-void
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

.method public setEnableSwipeToReply(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/discord/chat/presentation/message/MessageView;->enableSwipeToReply:Z

    return-void
.end method

.method public final setMessage(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/root/MessageContext;Lcom/discord/chat/bridge/messageframe/MessageFrame;Lcom/discord/chat/presentation/events/ChatEventHandler;Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;Lkotlin/jvm/functions/Function0;ZZZ)V
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/chat/bridge/Message;",
            "Lcom/discord/chat/presentation/root/MessageContext;",
            "Lcom/discord/chat/bridge/messageframe/MessageFrame;",
            "Lcom/discord/chat/presentation/events/ChatEventHandler;",
            "Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Lcom/discord/chat/presentation/message/MessageView$ChainPart;",
            ">;ZZZ)V"
        }
    .end annotation

    move-object v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v11, p4

    move-object/from16 v4, p6

    const-string v5, "message"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "messageContext"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "eventHandler"

    invoke-static {v11, v5}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "onChainPart"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object v4, v0, Lcom/discord/chat/presentation/message/MessageView;->onChainPart:Lkotlin/jvm/functions/Function0;

    .line 2
    new-instance v5, Lcom/discord/chat/presentation/message/MessageView$setMessage$2;

    invoke-direct {v5, v11, v1}, Lcom/discord/chat/presentation/message/MessageView$setMessage$2;-><init>(Lcom/discord/chat/presentation/events/ChatEventHandler;Lcom/discord/chat/bridge/Message;)V

    invoke-virtual {p0, v5}, Lcom/discord/chat/presentation/message/MessageView;->setOnInitiateReply(Lkotlin/jvm/functions/Function0;)V

    .line 3
    invoke-virtual/range {p2 .. p2}, Lcom/discord/chat/presentation/root/MessageContext;->getEnableSwipeToReply()Z

    move-result v5

    invoke-virtual {p0, v5}, Lcom/discord/chat/presentation/message/MessageView;->setEnableSwipeToReply(Z)V

    move/from16 v5, p7

    .line 4
    iput-boolean v5, v0, Lcom/discord/chat/presentation/message/MessageView;->allowChildGestures:Z

    .line 5
    invoke-interface/range {p6 .. p6}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v4

    move-object v12, v4

    check-cast v12, Lcom/discord/chat/presentation/message/MessageView$ChainPart;

    if-eqz p9, :cond_0

    .line 6
    iget-object v4, v0, Lcom/discord/chat/presentation/message/MessageView;->binding:Lcom/discord/chat/databinding/MessageViewBinding;

    iget-object v4, v4, Lcom/discord/chat/databinding/MessageViewBinding;->accessoriesView:Lcom/discord/chat/presentation/message/MessageAccessoriesView;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/discord/chat/R$dimen;->message_horizontal_spacing:I

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v5

    invoke-virtual {v4, v5}, Lcom/discord/chat/presentation/message/MessageAccessoriesView;->updateLeftMargin(I)V

    goto :goto_0

    .line 7
    :cond_0
    iget-object v4, v0, Lcom/discord/chat/presentation/message/MessageView;->binding:Lcom/discord/chat/databinding/MessageViewBinding;

    iget-object v4, v4, Lcom/discord/chat/databinding/MessageViewBinding;->accessoriesView:Lcom/discord/chat/presentation/message/MessageAccessoriesView;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lcom/discord/chat/R$dimen;->message_start_guideline:I

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v5

    invoke-virtual {v4, v5}, Lcom/discord/chat/presentation/message/MessageAccessoriesView;->updateLeftMargin(I)V

    :goto_0
    const/16 v4, 0x8

    const-string v5, "binding.messageFrameHeader"

    const/4 v6, 0x0

    if-eqz v3, :cond_1

    .line 8
    instance-of v7, v3, Lcom/discord/chat/bridge/messageframe/UnknownMessageFrame;

    if-nez v7, :cond_1

    .line 9
    iget-object v7, v0, Lcom/discord/chat/presentation/message/MessageView;->binding:Lcom/discord/chat/databinding/MessageViewBinding;

    iget-object v7, v7, Lcom/discord/chat/databinding/MessageViewBinding;->messageFrameHeader:Lcom/discord/chat/presentation/message/MessageFrameHeaderView;

    invoke-static {v7, v5}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-virtual {v7, v6}, Landroid/view/View;->setVisibility(I)V

    .line 11
    iget-object v5, v0, Lcom/discord/chat/presentation/message/MessageView;->binding:Lcom/discord/chat/databinding/MessageViewBinding;

    iget-object v5, v5, Lcom/discord/chat/databinding/MessageViewBinding;->messageFrameHeader:Lcom/discord/chat/presentation/message/MessageFrameHeaderView;

    invoke-virtual {v5, v3}, Lcom/discord/chat/presentation/message/MessageFrameHeaderView;->configure(Lcom/discord/chat/bridge/messageframe/MessageFrame;)V

    goto :goto_1

    .line 12
    :cond_1
    iget-object v7, v0, Lcom/discord/chat/presentation/message/MessageView;->binding:Lcom/discord/chat/databinding/MessageViewBinding;

    iget-object v7, v7, Lcom/discord/chat/databinding/MessageViewBinding;->messageFrameHeader:Lcom/discord/chat/presentation/message/MessageFrameHeaderView;

    invoke-static {v7, v5}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-virtual {v7, v4}, Landroid/view/View;->setVisibility(I)V

    .line 14
    :goto_1
    invoke-direct {p0, v1, v11, v12}, Lcom/discord/chat/presentation/message/MessageView;->configureAuthor(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/events/ChatEventHandler;Lcom/discord/chat/presentation/message/MessageView$ChainPart;)V

    .line 15
    invoke-virtual/range {p2 .. p2}, Lcom/discord/chat/presentation/root/MessageContext;->getShowDivider()Z

    move-result v5

    invoke-direct {p0, v5}, Lcom/discord/chat/presentation/message/MessageView;->configureDivider(Z)V

    .line 16
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getThreadStarterMessageHeader()Ljava/lang/String;

    move-result-object v5

    .line 17
    iget-object v7, v0, Lcom/discord/chat/presentation/message/MessageView;->binding:Lcom/discord/chat/databinding/MessageViewBinding;

    iget-object v7, v7, Lcom/discord/chat/databinding/MessageViewBinding;->threadStarterHeader:Lcom/discord/chat/presentation/message/ThreadStarterMessageHeaderView;

    .line 18
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getReferencedMessage()Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;

    move-result-object v8

    const/4 v13, 0x1

    if-eqz v8, :cond_2

    move v8, v13

    goto :goto_2

    :cond_2
    move v8, v6

    .line 19
    :goto_2
    invoke-virtual {v7, v5, v8}, Lcom/discord/chat/presentation/message/ThreadStarterMessageHeaderView;->configure(Ljava/lang/String;Z)V

    .line 20
    iget-object v5, v0, Lcom/discord/chat/presentation/message/MessageView;->binding:Lcom/discord/chat/databinding/MessageViewBinding;

    iget-object v5, v5, Lcom/discord/chat/databinding/MessageViewBinding;->highlightHeader:Lcom/discord/chat/presentation/message/MessageHighlightHeader;

    const-string v7, "binding.highlightHeader"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p8, :cond_3

    move v4, v6

    .line 21
    :cond_3
    invoke-virtual {v5, v4}, Landroid/view/View;->setVisibility(I)V

    .line 22
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getReferencedMessage()Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;

    move-result-object v4

    if-eqz v4, :cond_4

    .line 23
    iget-object v4, v0, Lcom/discord/chat/presentation/message/MessageView;->binding:Lcom/discord/chat/databinding/MessageViewBinding;

    iget-object v5, v4, Lcom/discord/chat/databinding/MessageViewBinding;->replyPreview:Lcom/discord/chat/presentation/message/MessageViewReplyPreview;

    const-string v4, "binding.replyPreview"

    invoke-static {v5, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getReferencedMessage()Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;

    move-result-object v6

    const/4 v7, 0x0

    new-instance v8, Lcom/discord/chat/presentation/message/MessageView$setMessage$3;

    invoke-direct {v8, v11, v1}, Lcom/discord/chat/presentation/message/MessageView$setMessage$3;-><init>(Lcom/discord/chat/presentation/events/ChatEventHandler;Lcom/discord/chat/bridge/Message;)V

    const/4 v9, 0x2

    const/4 v10, 0x0

    invoke-static/range {v5 .. v10}, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->configureReply$default(Lcom/discord/chat/presentation/message/MessageViewReplyPreview;Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    goto :goto_3

    .line 24
    :cond_4
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getExecutedCommand()Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;

    move-result-object v4

    if-eqz v4, :cond_5

    .line 25
    iget-object v4, v0, Lcom/discord/chat/presentation/message/MessageView;->binding:Lcom/discord/chat/databinding/MessageViewBinding;

    iget-object v4, v4, Lcom/discord/chat/databinding/MessageViewBinding;->replyPreview:Lcom/discord/chat/presentation/message/MessageViewReplyPreview;

    .line 26
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getId-3Eiw7ao()Ljava/lang/String;

    move-result-object v5

    .line 27
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getExecutedCommand()Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;

    move-result-object v6

    .line 28
    invoke-static/range {p1 .. p1}, Lcom/discord/chat/bridge/MessageKt;->shouldAnimateEmoji(Lcom/discord/chat/bridge/Message;)Z

    move-result v7

    .line 29
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getShouldShowRoleDot()Z

    move-result v8

    .line 30
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getShouldShowRoleOnName()Z

    move-result v9

    move-object/from16 v10, p4

    .line 31
    invoke-virtual/range {v4 .. v10}, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->configureExecutedCommand-LdU2QRA(Ljava/lang/String;Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;ZZZLcom/discord/chat/presentation/events/ChatEventHandler;)V

    goto :goto_3

    .line 32
    :cond_5
    iget-object v4, v0, Lcom/discord/chat/presentation/message/MessageView;->binding:Lcom/discord/chat/databinding/MessageViewBinding;

    iget-object v4, v4, Lcom/discord/chat/databinding/MessageViewBinding;->replyPreview:Lcom/discord/chat/presentation/message/MessageViewReplyPreview;

    invoke-virtual {v4}, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->clear()V

    .line 33
    :goto_3
    invoke-interface/range {p4 .. p4}, Lcom/discord/chat/presentation/events/ChatEventHandler;->getOnMessageTapped()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    const/4 v5, 0x0

    if-eqz v4, :cond_6

    .line 34
    new-instance v6, Lcom/discord/chat/presentation/message/j;

    invoke-direct {v6, v4, v1}, Lcom/discord/chat/presentation/message/j;-><init>(Lkotlin/jvm/functions/Function2;Lcom/discord/chat/bridge/Message;)V

    move-object v10, v6

    goto :goto_4

    :cond_6
    move-object v10, v5

    .line 35
    :goto_4
    invoke-interface/range {p4 .. p4}, Lcom/discord/chat/presentation/events/ChatEventHandler;->getOnMessageLongPressed()Lkotlin/jvm/functions/Function4;

    move-result-object v4

    if-eqz v4, :cond_7

    .line 36
    new-instance v5, Lcom/discord/chat/presentation/message/k;

    invoke-direct {v5, v4, v1}, Lcom/discord/chat/presentation/message/k;-><init>(Lkotlin/jvm/functions/Function4;Lcom/discord/chat/bridge/Message;)V

    :cond_7
    move-object v14, v5

    .line 37
    invoke-static {p0, v13, v10}, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchUtilsKt;->setOnClickListenerNested(Landroid/view/View;ZLandroid/view/View$OnClickListener;)V

    .line 38
    invoke-static {p0, v13, v14}, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchUtilsKt;->setOnLongClickListenerNested(Landroid/view/View;ZLandroid/view/View$OnLongClickListener;)V

    .line 39
    invoke-interface/range {p4 .. p4}, Lcom/discord/chat/presentation/events/ChatEventHandler;->getOnMessageLongPressed()Lkotlin/jvm/functions/Function4;

    move-result-object v4

    .line 40
    invoke-direct {p0, v1, v2, v3, v4}, Lcom/discord/chat/presentation/message/MessageView;->generateMessageAccessories(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/root/MessageContext;Lcom/discord/chat/bridge/messageframe/MessageFrame;Lkotlin/jvm/functions/Function4;)Ljava/util/List;

    move-result-object v13

    .line 41
    iget-object v2, v0, Lcom/discord/chat/presentation/message/MessageView;->binding:Lcom/discord/chat/databinding/MessageViewBinding;

    iget-object v2, v2, Lcom/discord/chat/databinding/MessageViewBinding;->accessoriesView:Lcom/discord/chat/presentation/message/MessageAccessoriesView;

    .line 42
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getId-3Eiw7ao()Ljava/lang/String;

    move-result-object v3

    .line 43
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getChannelId-o4g7jtM()J

    move-result-wide v4

    .line 44
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getGuildId-qOKuAAo()Lcom/discord/primitives/GuildId;

    move-result-object v6

    move-object v7, v13

    move-object/from16 v8, p4

    move-object/from16 v9, p5

    .line 45
    invoke-virtual/range {v2 .. v9}, Lcom/discord/chat/presentation/message/MessageAccessoriesView;->setAccessories-RC8ZMxU(Ljava/lang/String;JLcom/discord/primitives/GuildId;Ljava/util/List;Lcom/discord/chat/presentation/events/ChatEventHandler;Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;)V

    .line 46
    invoke-direct {p0, v13}, Lcom/discord/chat/presentation/message/MessageView;->configureAccessoriesMargin(Ljava/util/List;)V

    .line 47
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getCommunicationDisabled()Ljava/lang/Boolean;

    move-result-object v2

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    .line 48
    invoke-direct {p0, v2, v12}, Lcom/discord/chat/presentation/message/MessageView;->configureCommunicationDisabled(ZLcom/discord/chat/presentation/message/MessageView$ChainPart;)V

    .line 49
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getFlags()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    sget-object v3, Lcom/discord/primitives/MessageFlag;->SUPPRESS_NOTIFICATIONS:Lcom/discord/primitives/MessageFlag;

    invoke-static {v2, v3}, Lcom/discord/primitives/MessageFlagKt;->hasMessageFlag(Ljava/lang/Long;Lcom/discord/primitives/MessageFlag;)Z

    move-result v2

    .line 50
    invoke-direct {p0, v2, v11, v12}, Lcom/discord/chat/presentation/message/MessageView;->configureSuppressNotifications(ZLcom/discord/chat/presentation/events/ChatEventHandler;Lcom/discord/chat/presentation/message/MessageView$ChainPart;)V

    .line 51
    iget-object v2, v0, Lcom/discord/chat/presentation/message/MessageView;->binding:Lcom/discord/chat/databinding/MessageViewBinding;

    iget-object v2, v2, Lcom/discord/chat/databinding/MessageViewBinding;->accessoriesView:Lcom/discord/chat/presentation/message/MessageAccessoriesView;

    new-instance v3, Lcom/discord/chat/presentation/message/MessageView$setMessage$4;

    invoke-direct {v3, p0, v1, v10, v14}, Lcom/discord/chat/presentation/message/MessageView$setMessage$4;-><init>(Lcom/discord/chat/presentation/message/MessageView;Lcom/discord/chat/bridge/Message;Landroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;)V

    invoke-virtual {v2, v3}, Lcom/discord/chat/presentation/message/MessageAccessoriesView;->setOnCurrentContentViewChanged(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public setOnInitiateReply(Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/discord/chat/presentation/message/MessageView;->onInitiateReply:Lkotlin/jvm/functions/Function0;

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
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

.method public setPressed(Z)V
    .locals 0

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->isClickable()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->isFocusable()Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setPressed(Z)V

    return-void
.end method

.method public spacingPxOverride()Ljava/lang/Integer;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/discord/chat/presentation/message/MessageView;->onChainPart:Lkotlin/jvm/functions/Function0;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/discord/chat/presentation/message/MessageView$ChainPart;

    .line 8
    .line 9
    sget-object v1, Lcom/discord/chat/presentation/message/MessageView$WhenMappings;->$EnumSwitchMapping$1:[I

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    aget v0, v1, v0

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    if-eq v0, v1, :cond_2

    .line 19
    .line 20
    const/4 v1, 0x2

    .line 21
    if-eq v0, v1, :cond_2

    .line 22
    .line 23
    const/4 v1, 0x3

    .line 24
    if-eq v0, v1, :cond_1

    .line 25
    .line 26
    const/4 v1, 0x4

    .line 27
    if-ne v0, v1, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    new-instance v0, Llf/q;

    .line 31
    .line 32
    invoke-direct {v0}, Llf/q;-><init>()V

    .line 33
    .line 34
    .line 35
    throw v0

    .line 36
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    const/16 v0, 0x10

    .line 39
    .line 40
    invoke-static {v0}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    :goto_1
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    return-object v0
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
.end method
