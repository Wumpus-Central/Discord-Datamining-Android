.class public final Lcom/discord/chat/presentation/message/system/AutomodSystemMessageView;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"

# interfaces
.implements Lcom/discord/recycler_view/decorations/VerticalSpacingItemDecoration$SpacingProviderView;
.implements Lcom/discord/chat/presentation/spine/SpineParentMessage;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\u0008\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\u0008J \u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0003J\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u000eH\u0002J\u0010\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u000eH\u0002J\u001e\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\"2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010%\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\'H\u0016J\u000e\u0010(\u001a\u00020\u00162\u0006\u0010)\u001a\u00020*J6\u0010+\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010#\u001a\u00020$2\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u001c2\n\u0008\u0002\u0010,\u001a\u0004\u0018\u00010-2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000eJ\r\u0010.\u001a\u00020/H\u0016\u00a2\u0006\u0002\u00100R\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\u0008\u0012\u0004\u0012\u00020\u000b`\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u00061"
    }
    d2 = {
        "Lcom/discord/chat/presentation/message/system/AutomodSystemMessageView;",
        "Landroidx/constraintlayout/widget/ConstraintLayout;",
        "Lcom/discord/recycler_view/decorations/VerticalSpacingItemDecoration$SpacingProviderView;",
        "Lcom/discord/chat/presentation/spine/SpineParentMessage;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "accessories",
        "Ljava/util/ArrayList;",
        "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;",
        "Lkotlin/collections/ArrayList;",
        "allowChildGestures",
        "",
        "binding",
        "Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;",
        "spineOriginView",
        "Landroid/view/View;",
        "getSpineOriginView",
        "()Landroid/view/View;",
        "configureAuthor",
        "",
        "message",
        "Lcom/discord/chat/bridge/Message;",
        "automodContext",
        "Lcom/discord/chat/bridge/automod/AutoModerationContext;",
        "eventHandler",
        "Lcom/discord/chat/presentation/events/ChatEventHandler;",
        "configureCommunicationDisabled",
        "isCommunicationDisabled",
        "configureDivider",
        "showDivider",
        "generateMessageAccessories",
        "",
        "messageContext",
        "Lcom/discord/chat/presentation/root/MessageContext;",
        "onInterceptTouchEvent",
        "ev",
        "Landroid/view/MotionEvent;",
        "setAccessoriesRecycledViewPool",
        "recycledViewPool",
        "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;",
        "setMessage",
        "componentProvider",
        "Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;",
        "spacingPxOverride",
        "",
        "()Ljava/lang/Integer;",
        "chat_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
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

.field private final binding:Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p0, p1, v0, v1, v0}, Lcom/discord/chat/presentation/message/system/AutomodSystemMessageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 6

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 3
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    invoke-static {p2, p0}, Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;

    move-result-object p2

    const-string v0, "inflate(LayoutInflater.from(context), this)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/discord/chat/presentation/message/system/AutomodSystemMessageView;->binding:Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lcom/discord/chat/presentation/message/system/AutomodSystemMessageView;->allowChildGestures:Z

    const/4 v1, 0x4

    .line 5
    invoke-static {v1}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {p0, v4, v2, v0, v3}, Lcom/discord/ripple/RippleUtilsKt;->addRipple$default(Landroid/view/View;ZIILjava/lang/Object;)V

    .line 6
    iget-object v0, p2, Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;->messageHeaderDivider:Landroid/view/View;

    .line 7
    sget v2, Lcom/discord/chat/R$color;->message_divider_light:I

    .line 8
    sget v3, Lcom/discord/chat/R$color;->message_divider_dark:I

    .line 9
    invoke-static {p1, v2, v3}, Lcom/discord/theme/utils/ColorUtilsKt;->getThemeColor(Landroid/content/Context;II)I

    move-result v2

    .line 10
    invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 11
    iget-object v0, p2, Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;->messageHeaderTitle:Landroid/widget/TextView;

    .line 12
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v2

    invoke-virtual {v2}, Lcom/discord/theme/DiscordTheme;->getTextNormal()I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    const-string v2, "_init_$lambda$0"

    .line 13
    invoke-static {v0, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lcom/discord/fonts/DiscordFont;->PrimarySemibold:Lcom/discord/fonts/DiscordFont;

    invoke-static {v0, v2}, Lcom/discord/fonts/DiscordFontUtilsKt;->setDiscordFont(Landroid/widget/TextView;Lcom/discord/fonts/DiscordFont;)V

    .line 14
    iget-object v0, p2, Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;->messageHeaderSubtitle:Landroid/widget/TextView;

    .line 15
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v3

    invoke-virtual {v3}, Lcom/discord/theme/DiscordTheme;->getTextNormal()I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    const-string v3, "_init_$lambda$1"

    .line 16
    invoke-static {v0, v3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lcom/discord/fonts/DiscordFont;->PrimaryNormal:Lcom/discord/fonts/DiscordFont;

    invoke-static {v0, v3}, Lcom/discord/fonts/DiscordFontUtilsKt;->setDiscordFont(Landroid/widget/TextView;Lcom/discord/fonts/DiscordFont;)V

    .line 17
    iget-object v0, p2, Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;->authorName:Landroid/widget/TextView;

    .line 18
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v3

    invoke-virtual {v3}, Lcom/discord/theme/DiscordTheme;->getTextBrand()I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    const-string v3, "_init_$lambda$2"

    .line 19
    invoke-static {v0, v3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v2}, Lcom/discord/fonts/DiscordFontUtilsKt;->setDiscordFont(Landroid/widget/TextView;Lcom/discord/fonts/DiscordFont;)V

    const/high16 v3, 0x41800000    # 16.0f

    const/high16 v4, 0x41a00000    # 20.0f

    .line 20
    invoke-static {v0, v3, v4}, Lcom/discord/SetTextSizeSpKt;->setTextSizeSp(Landroid/widget/TextView;FF)V

    .line 21
    iget-object v0, p2, Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;->authorAvatar:Lcom/facebook/drawee/view/SimpleDraweeView;

    const-string v5, "binding.authorAvatar"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/discord/misc/utilities/view/ViewClippingUtilsKt;->clipToCircle(Landroid/view/View;)V

    .line 22
    iget-object v0, p2, Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;->automodMessageContextHeader:Landroid/widget/TextView;

    const-string v5, "_init_$lambda$3"

    .line 23
    invoke-static {v0, v5}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v2}, Lcom/discord/fonts/DiscordFontUtilsKt;->setDiscordFont(Landroid/widget/TextView;Lcom/discord/fonts/DiscordFont;)V

    .line 24
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v5

    invoke-virtual {v5}, Lcom/discord/theme/DiscordTheme;->getTextMuted()I

    move-result v5

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 25
    invoke-static {v0, v3, v4}, Lcom/discord/SetTextSizeSpKt;->setTextSizeSp(Landroid/widget/TextView;FF)V

    .line 26
    iget-object v0, p2, Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;->automodMessageChannel:Landroid/widget/TextView;

    .line 27
    sget v3, Lcom/discord/chat/R$color;->brand_500:I

    .line 28
    sget v4, Lcom/discord/chat/R$color;->brand_600:I

    .line 29
    invoke-static {p1, v3, v4}, Lcom/discord/theme/utils/ColorUtilsKt;->getThemeColor(Landroid/content/Context;II)I

    move-result v3

    .line 30
    invoke-virtual {v0, v3}, Landroid/view/View;->setBackgroundColor(I)V

    .line 31
    sget v3, Lcom/discord/chat/R$color;->white_100:I

    .line 32
    sget v4, Lcom/discord/chat/R$color;->white_160:I

    .line 33
    invoke-static {p1, v3, v4}, Lcom/discord/theme/utils/ColorUtilsKt;->getThemeColor(Landroid/content/Context;II)I

    move-result p1

    .line 34
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    const-string p1, "_init_$lambda$4"

    .line 35
    invoke-static {v0, p1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v2}, Lcom/discord/fonts/DiscordFontUtilsKt;->setDiscordFont(Landroid/widget/TextView;Lcom/discord/fonts/DiscordFont;)V

    const/high16 p1, 0x41400000    # 12.0f

    const/high16 v2, 0x41700000    # 15.0f

    .line 36
    invoke-static {v0, p1, v2}, Lcom/discord/SetTextSizeSpKt;->setTextSizeSp(Landroid/widget/TextView;FF)V

    .line 37
    invoke-static {v1}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    move-result v1

    invoke-static {v0, v1}, Lcom/discord/misc/utilities/view/ViewClippingUtilsKt;->clipToRoundedRectangle(Landroid/view/View;I)V

    .line 38
    iget-object p2, p2, Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;->timestamp:Landroid/widget/TextView;

    const-string v0, "_init_$lambda$5"

    .line 39
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/discord/fonts/DiscordFont;->PrimaryMedium:Lcom/discord/fonts/DiscordFont;

    invoke-static {p2, v0}, Lcom/discord/fonts/DiscordFontUtilsKt;->setDiscordFont(Landroid/widget/TextView;Lcom/discord/fonts/DiscordFont;)V

    .line 40
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v0

    invoke-virtual {v0}, Lcom/discord/theme/DiscordTheme;->getTextMuted()I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 41
    invoke-static {p2, p1, v2}, Lcom/discord/SetTextSizeSpKt;->setTextSizeSp(Landroid/widget/TextView;FF)V

    .line 42
    new-instance p1, Ljava/util/ArrayList;

    const/4 p2, 0x2

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Lcom/discord/chat/presentation/message/system/AutomodSystemMessageView;->accessories:Ljava/util/ArrayList;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 1
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/discord/chat/presentation/message/system/AutomodSystemMessageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public static synthetic b(Lcom/discord/chat/presentation/events/ChatEventHandler;Lcom/discord/chat/bridge/automod/AutoModerationContext;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/discord/chat/presentation/message/system/AutomodSystemMessageView;->configureAuthor$lambda$8$lambda$7(Lcom/discord/chat/presentation/events/ChatEventHandler;Lcom/discord/chat/bridge/automod/AutoModerationContext;Landroid/view/View;)V

    return-void
.end method

.method private final configureAuthor(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/bridge/automod/AutoModerationContext;Lcom/discord/chat/presentation/events/ChatEventHandler;)V
    .locals 7
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetTextI18n"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/discord/chat/presentation/message/system/AutomodSystemMessageView;->binding:Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;->authorAvatar:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "context"

    .line 10
    .line 11
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-static {p1, v1}, Lcom/discord/chat/bridge/MessageKt;->avatarUrl(Lcom/discord/chat/bridge/Message;Landroid/content/Context;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v0, v1}, Lcom/facebook/drawee/view/SimpleDraweeView;->setImageURI(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lcom/discord/chat/presentation/message/system/AutomodSystemMessageView;->binding:Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;

    .line 22
    .line 23
    iget-object v0, v0, Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;->authorName:Landroid/widget/TextView;

    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/discord/chat/bridge/Message;->getUsername()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lcom/discord/chat/presentation/message/system/AutomodSystemMessageView;->binding:Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;

    .line 33
    .line 34
    iget-object v1, v0, Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;->messageTagView:Lcom/discord/chat/presentation/message/MessageTagView;

    .line 35
    .line 36
    invoke-virtual {p2}, Lcom/discord/chat/bridge/automod/AutoModerationContext;->getHeaderBadgeText()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 41
    .line 42
    const/4 v4, 0x0

    .line 43
    const/4 v5, 0x0

    .line 44
    move-object v6, p3

    .line 45
    invoke-virtual/range {v1 .. v6}, Lcom/discord/chat/presentation/message/MessageTagView;->configureTagView(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/chat/presentation/events/ChatEventHandler;)V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Lcom/discord/chat/presentation/message/system/AutomodSystemMessageView;->binding:Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;

    .line 49
    .line 50
    iget-object v0, v0, Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;->automodMessageContextHeader:Landroid/widget/TextView;

    .line 51
    .line 52
    invoke-virtual {p2}, Lcom/discord/chat/bridge/automod/AutoModerationContext;->getHeaderText()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, Lcom/discord/chat/presentation/message/system/AutomodSystemMessageView;->binding:Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;

    .line 60
    .line 61
    iget-object v0, v0, Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;->timestamp:Landroid/widget/TextView;

    .line 62
    .line 63
    invoke-virtual {p1}, Lcom/discord/chat/bridge/Message;->getTimestamp()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 68
    .line 69
    .line 70
    iget-object p1, p0, Lcom/discord/chat/presentation/message/system/AutomodSystemMessageView;->binding:Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;

    .line 71
    .line 72
    iget-object p1, p1, Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;->automodMessageChannel:Landroid/widget/TextView;

    .line 73
    .line 74
    invoke-virtual {p2}, Lcom/discord/chat/bridge/automod/AutoModerationContext;->getMessage()Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-virtual {v0}, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->getChannelName()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    if-nez v0, :cond_0

    .line 83
    .line 84
    const-string v0, "channel"

    .line 85
    .line 86
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 89
    .line 90
    .line 91
    const-string v2, "#"

    .line 92
    .line 93
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 104
    .line 105
    .line 106
    const-string v0, "configureAuthor$lambda$8"

    .line 107
    .line 108
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p2}, Lcom/discord/chat/bridge/automod/AutoModerationContext;->getMessage()Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-virtual {v0}, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->getChannelName()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    const/4 v1, 0x1

    .line 120
    const/4 v2, 0x0

    .line 121
    if-eqz v0, :cond_1

    .line 122
    .line 123
    move v0, v1

    .line 124
    goto :goto_0

    .line 125
    :cond_1
    move v0, v2

    .line 126
    :goto_0
    if-eqz v0, :cond_2

    .line 127
    .line 128
    move v0, v2

    .line 129
    goto :goto_1

    .line 130
    :cond_2
    const/16 v0, 0x8

    .line 131
    .line 132
    :goto_1
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 133
    .line 134
    .line 135
    new-instance v0, Lcom/discord/chat/presentation/message/system/a;

    .line 136
    .line 137
    invoke-direct {v0, p3, p2}, Lcom/discord/chat/presentation/message/system/a;-><init>(Lcom/discord/chat/presentation/events/ChatEventHandler;Lcom/discord/chat/bridge/automod/AutoModerationContext;)V

    .line 138
    .line 139
    .line 140
    const/4 p2, 0x0

    .line 141
    invoke-static {p1, v2, v0, v1, p2}, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchUtilsKt;->setOnClickListenerNested$default(Landroid/view/View;ZLandroid/view/View$OnClickListener;ILjava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    return-void
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

.method private static final configureAuthor$lambda$8$lambda$7(Lcom/discord/chat/presentation/events/ChatEventHandler;Lcom/discord/chat/bridge/automod/AutoModerationContext;Landroid/view/View;)V
    .locals 3

    .line 1
    const-string p2, "$eventHandler"

    .line 2
    .line 3
    invoke-static {p0, p2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p2, "$automodContext"

    .line 7
    .line 8
    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/discord/chat/bridge/automod/AutoModerationContext;->getMessage()Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {p2}, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->getChannelId-o4g7jtM()J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    invoke-static {v0, v1}, Lcom/discord/primitives/ChannelId;->toString-impl(J)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-virtual {p1}, Lcom/discord/chat/bridge/automod/AutoModerationContext;->getMessage()Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1}, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->getGuildId-qOKuAAo()Lcom/discord/primitives/GuildId;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    const/4 v0, 0x0

    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/discord/primitives/GuildId;->unbox-impl()J

    .line 35
    .line 36
    .line 37
    move-result-wide v1

    .line 38
    invoke-static {v1, v2}, Lcom/discord/primitives/GuildId;->toString-impl(J)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    move-object p1, v0

    .line 44
    :goto_0
    invoke-interface {p0, p2, p1, v0}, Lcom/discord/chat/presentation/events/ChatEventHandler;->onTapChannel(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-void
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

.method private final configureCommunicationDisabled(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/discord/chat/presentation/message/system/AutomodSystemMessageView;->binding:Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;->guildCommunicationDisabledIcon:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 4
    .line 5
    const-string v1, "configureCommunicationDisabled$lambda$9"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/16 v1, 0x8

    .line 15
    .line 16
    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 17
    .line 18
    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    sget-object v1, Lcom/discord/react_asset_fetcher/ReactAsset;->ClockTimeout:Lcom/discord/react_asset_fetcher/ReactAsset;

    .line 22
    .line 23
    invoke-static {v0, v1}, Lcom/discord/react_asset_fetcher/ReactAssetUtilsKt;->setReactAsset(Lcom/facebook/drawee/view/SimpleDraweeView;Lcom/discord/react_asset_fetcher/ReactAsset;)V

    .line 24
    .line 25
    .line 26
    :cond_1
    iget-object v0, p0, Lcom/discord/chat/presentation/message/system/AutomodSystemMessageView;->binding:Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;

    .line 27
    .line 28
    iget-object v0, v0, Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;->authorAvatar:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 29
    .line 30
    if-eqz p1, :cond_2

    .line 31
    .line 32
    const/high16 p1, 0x3f000000    # 0.5f

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    const/high16 p1, 0x3f800000    # 1.0f

    .line 36
    .line 37
    :goto_1
    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    .line 38
    .line 39
    .line 40
    return-void
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

.method private final configureDivider(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/discord/chat/presentation/message/system/AutomodSystemMessageView;->binding:Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;->messageHeaderDivider:Landroid/view/View;

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

.method private final generateMessageAccessories(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/root/MessageContext;)Ljava/util/List;
    .locals 79
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/chat/bridge/Message;",
            "Lcom/discord/chat/presentation/root/MessageContext;",
            ")",
            "Ljava/util/List<",
            "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/discord/chat/presentation/message/system/AutomodSystemMessageView;->accessories:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 6
    .line 7
    .line 8
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getAutoModerationContext()Lcom/discord/chat/bridge/automod/AutoModerationContext;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    iget-object v1, v0, Lcom/discord/chat/presentation/message/system/AutomodSystemMessageView;->accessories:Ljava/util/ArrayList;

    .line 15
    .line 16
    return-object v1

    .line 17
    :cond_0
    invoke-virtual {v1}, Lcom/discord/chat/bridge/automod/AutoModerationContext;->getMessage()Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    sget-object v3, Lcom/discord/chat/bridge/MessageType;->DEFAULT:Lcom/discord/chat/bridge/MessageType;

    .line 22
    .line 23
    invoke-virtual {v2}, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->getId-3Eiw7ao()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-virtual {v2}, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->getChannelId-o4g7jtM()J

    .line 28
    .line 29
    .line 30
    move-result-wide v6

    .line 31
    invoke-virtual {v2}, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->getGuildId-qOKuAAo()Lcom/discord/primitives/GuildId;

    .line 32
    .line 33
    .line 34
    move-result-object v8

    .line 35
    invoke-virtual {v2}, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->getUserId-wUX8bhU()Lcom/discord/primitives/UserId;

    .line 36
    .line 37
    .line 38
    move-result-object v10

    .line 39
    invoke-virtual {v2}, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->getUsername()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v16

    .line 43
    invoke-virtual {v2}, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->getAvatarURL()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v22

    .line 47
    invoke-virtual {v2}, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->getContent()Lcom/discord/chat/bridge/structurabletext/StructurableText;

    .line 48
    .line 49
    .line 50
    move-result-object v27

    .line 51
    invoke-virtual {v2}, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->getUsernameColor()I

    .line 52
    .line 53
    .line 54
    move-result v17

    .line 55
    invoke-virtual {v2}, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->getRoleColor()Ljava/lang/Integer;

    .line 56
    .line 57
    .line 58
    move-result-object v18

    .line 59
    invoke-virtual {v2}, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->getShouldShowRoleDot()Z

    .line 60
    .line 61
    .line 62
    move-result v19

    .line 63
    invoke-virtual {v2}, Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;->getCommunicationDisabled()Ljava/lang/Boolean;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    const/16 v77, 0x0

    .line 68
    .line 69
    if-eqz v2, :cond_1

    .line 70
    .line 71
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    move/from16 v43, v2

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_1
    move/from16 v43, v77

    .line 79
    .line 80
    :goto_0
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getRoleIcon()Lcom/discord/chat/bridge/roleicons/RoleIcon;

    .line 81
    .line 82
    .line 83
    move-result-object v33

    .line 84
    new-instance v15, Lcom/discord/chat/bridge/Message;

    .line 85
    .line 86
    move-object v2, v15

    .line 87
    const/4 v5, 0x0

    .line 88
    const/4 v9, 0x0

    .line 89
    const-wide/16 v11, 0x0

    .line 90
    .line 91
    const/4 v13, 0x0

    .line 92
    const/4 v14, 0x0

    .line 93
    const/16 v20, 0x0

    .line 94
    .line 95
    move-object/from16 v78, v15

    .line 96
    .line 97
    move-object/from16 v15, v20

    .line 98
    .line 99
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 100
    .line 101
    .line 102
    move-result-object v17

    .line 103
    const/16 v20, 0x0

    .line 104
    .line 105
    const/16 v21, 0x0

    .line 106
    .line 107
    const/16 v23, 0x0

    .line 108
    .line 109
    const/16 v24, 0x0

    .line 110
    .line 111
    const/16 v25, 0x0

    .line 112
    .line 113
    const/16 v26, 0x0

    .line 114
    .line 115
    const/16 v28, 0x0

    .line 116
    .line 117
    const/16 v29, 0x0

    .line 118
    .line 119
    const/16 v30, 0x0

    .line 120
    .line 121
    const/16 v31, 0x0

    .line 122
    .line 123
    const/16 v32, 0x0

    .line 124
    .line 125
    const/16 v34, 0x0

    .line 126
    .line 127
    const/16 v35, 0x0

    .line 128
    .line 129
    const/16 v36, 0x0

    .line 130
    .line 131
    const/16 v37, 0x0

    .line 132
    .line 133
    const/16 v38, 0x0

    .line 134
    .line 135
    const/16 v39, 0x0

    .line 136
    .line 137
    const/16 v40, 0x0

    .line 138
    .line 139
    const/16 v41, 0x0

    .line 140
    .line 141
    const/16 v42, 0x0

    .line 142
    .line 143
    invoke-static/range {v43 .. v43}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 144
    .line 145
    .line 146
    move-result-object v43

    .line 147
    const/16 v44, 0x0

    .line 148
    .line 149
    const/16 v45, 0x0

    .line 150
    .line 151
    const/16 v46, 0x0

    .line 152
    .line 153
    const/16 v47, 0x0

    .line 154
    .line 155
    const/16 v48, 0x0

    .line 156
    .line 157
    const/16 v49, 0x0

    .line 158
    .line 159
    const/16 v50, 0x0

    .line 160
    .line 161
    const/16 v51, 0x0

    .line 162
    .line 163
    const/16 v52, 0x0

    .line 164
    .line 165
    const/16 v53, 0x0

    .line 166
    .line 167
    const/16 v54, 0x0

    .line 168
    .line 169
    const/16 v55, 0x0

    .line 170
    .line 171
    const/16 v56, 0x0

    .line 172
    .line 173
    const/16 v57, 0x0

    .line 174
    .line 175
    const/16 v58, 0x0

    .line 176
    .line 177
    const/16 v59, 0x0

    .line 178
    .line 179
    const/16 v60, 0x0

    .line 180
    .line 181
    const/16 v61, 0x0

    .line 182
    .line 183
    const/16 v62, 0x0

    .line 184
    .line 185
    const/16 v63, 0x0

    .line 186
    .line 187
    const/16 v64, 0x0

    .line 188
    .line 189
    const/16 v65, 0x0

    .line 190
    .line 191
    const/16 v66, 0x0

    .line 192
    .line 193
    const/16 v68, 0x0

    .line 194
    .line 195
    const/16 v69, 0x0

    .line 196
    .line 197
    const/16 v70, 0x0

    .line 198
    .line 199
    const/16 v71, 0x0

    .line 200
    .line 201
    const/16 v72, 0x0

    .line 202
    .line 203
    const v73, 0x6fbd87a4

    .line 204
    .line 205
    .line 206
    const v74, -0x40000041    # -1.9999923f

    .line 207
    .line 208
    .line 209
    const/16 v75, 0xf

    .line 210
    .line 211
    const/16 v76, 0x0

    .line 212
    .line 213
    move-object/from16 v67, v1

    .line 214
    .line 215
    invoke-direct/range {v2 .. v76}, Lcom/discord/chat/bridge/Message;-><init>(Lcom/discord/chat/bridge/MessageType;Ljava/lang/String;Ljava/lang/String;JLcom/discord/primitives/GuildId;Lcom/discord/chat/bridge/MessageState;Lcom/discord/primitives/UserId;JLjava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Float;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/discord/chat/bridge/roleicons/RoleIcon;Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;Lcom/discord/chat/bridge/threads/ThreadEmbed;ZLjava/lang/Boolean;Ljava/lang/Boolean;Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;Lcom/discord/chat/bridge/feedback/SurveyIndication;Lcom/discord/chat/bridge/interaction/InteractionStatus;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;ZLcom/discord/chat/bridge/forums/ForumPostActions;Lcom/discord/chat/bridge/automod/AutoModerationContext;Ljava/util/List;Lcom/discord/chat/bridge/gift/GiftEmbed;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 216
    .line 217
    .line 218
    iget-object v2, v0, Lcom/discord/chat/presentation/message/system/AutomodSystemMessageView;->accessories:Ljava/util/ArrayList;

    .line 219
    .line 220
    new-instance v3, Lcom/discord/chat/presentation/message/messagepart/FlaggedMessageEmbedAccessory;

    .line 221
    .line 222
    invoke-virtual/range {v78 .. v78}, Lcom/discord/chat/bridge/Message;->getId-3Eiw7ao()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v4

    .line 226
    move-object/from16 v6, p2

    .line 227
    .line 228
    move-object/from16 v7, v78

    .line 229
    .line 230
    invoke-direct {v3, v4, v7, v6, v5}, Lcom/discord/chat/presentation/message/messagepart/FlaggedMessageEmbedAccessory;-><init>(Ljava/lang/String;Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/root/MessageContext;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    iget-object v2, v0, Lcom/discord/chat/presentation/message/system/AutomodSystemMessageView;->accessories:Ljava/util/ArrayList;

    .line 237
    .line 238
    new-instance v3, Lcom/discord/chat/presentation/message/messagepart/FlaggedMessageActionBarAccessory;

    .line 239
    .line 240
    invoke-virtual {v7}, Lcom/discord/chat/bridge/Message;->getId-3Eiw7ao()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v4

    .line 244
    move-object/from16 v7, p1

    .line 245
    .line 246
    invoke-direct {v3, v4, v7, v1, v5}, Lcom/discord/chat/presentation/message/messagepart/FlaggedMessageActionBarAccessory;-><init>(Ljava/lang/String;Lcom/discord/chat/bridge/Message;Lcom/discord/chat/bridge/automod/AutoModerationContext;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getReactions()Ljava/util/List;

    .line 253
    .line 254
    .line 255
    move-result-object v1

    .line 256
    if-eqz v1, :cond_2

    .line 257
    .line 258
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 259
    .line 260
    .line 261
    move-result v1

    .line 262
    const/4 v2, 0x1

    .line 263
    xor-int/2addr v1, v2

    .line 264
    if-ne v1, v2, :cond_2

    .line 265
    .line 266
    move/from16 v77, v2

    .line 267
    .line 268
    :cond_2
    if-eqz v77, :cond_3

    .line 269
    .line 270
    iget-object v1, v0, Lcom/discord/chat/presentation/message/system/AutomodSystemMessageView;->accessories:Ljava/util/ArrayList;

    .line 271
    .line 272
    new-instance v2, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;

    .line 273
    .line 274
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getId-3Eiw7ao()Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v9

    .line 278
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getReactions()Ljava/util/List;

    .line 279
    .line 280
    .line 281
    move-result-object v10

    .line 282
    invoke-virtual/range {p2 .. p2}, Lcom/discord/chat/presentation/root/MessageContext;->getCanAddNewReactions()Z

    .line 283
    .line 284
    .line 285
    move-result v11

    .line 286
    invoke-virtual/range {p2 .. p2}, Lcom/discord/chat/presentation/root/MessageContext;->getAddReactionLabel()Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v12

    .line 290
    invoke-virtual/range {p2 .. p2}, Lcom/discord/chat/presentation/root/MessageContext;->getAddNewReactionAccessibilityLabel()Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v13

    .line 294
    invoke-virtual/range {p2 .. p2}, Lcom/discord/chat/presentation/root/MessageContext;->getReactionsTheme()Lcom/discord/chat/bridge/reaction/ReactionsTheme;

    .line 295
    .line 296
    .line 297
    move-result-object v14

    .line 298
    const/4 v15, 0x0

    .line 299
    invoke-virtual/range {p2 .. p2}, Lcom/discord/chat/presentation/root/MessageContext;->getUseSortedReactions()Z

    .line 300
    .line 301
    .line 302
    move-result v16

    .line 303
    const/16 v17, 0x0

    .line 304
    .line 305
    move-object v8, v2

    .line 306
    invoke-direct/range {v8 .. v17}, Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;-><init>(Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/reaction/ReactionsTheme;Lcom/discord/theme/DiscordTheme;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    :cond_3
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getThreadEmbed()Lcom/discord/chat/bridge/threads/ThreadEmbed;

    .line 313
    .line 314
    .line 315
    move-result-object v1

    .line 316
    if-eqz v1, :cond_4

    .line 317
    .line 318
    iget-object v2, v0, Lcom/discord/chat/presentation/message/system/AutomodSystemMessageView;->accessories:Ljava/util/ArrayList;

    .line 319
    .line 320
    new-instance v3, Lcom/discord/chat/presentation/message/messagepart/ThreadEmbedMessageAccessory;

    .line 321
    .line 322
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/bridge/Message;->getId-3Eiw7ao()Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v4

    .line 326
    invoke-direct {v3, v4, v1, v5}, Lcom/discord/chat/presentation/message/messagepart/ThreadEmbedMessageAccessory;-><init>(Ljava/lang/String;Lcom/discord/chat/bridge/threads/ThreadEmbed;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    :cond_4
    iget-object v1, v0, Lcom/discord/chat/presentation/message/system/AutomodSystemMessageView;->accessories:Ljava/util/ArrayList;

    .line 333
    .line 334
    return-object v1
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

.method public static synthetic setMessage$default(Lcom/discord/chat/presentation/message/system/AutomodSystemMessageView;Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/root/MessageContext;Lcom/discord/chat/presentation/events/ChatEventHandler;Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;ZILjava/lang/Object;)V
    .locals 6

    .line 1
    and-int/lit8 p7, p6, 0x4

    .line 2
    .line 3
    if-eqz p7, :cond_0

    .line 4
    .line 5
    sget-object p3, Lcom/discord/chat/presentation/events/ChatEventHandler$Empty;->INSTANCE:Lcom/discord/chat/presentation/events/ChatEventHandler$Empty;

    .line 6
    .line 7
    :cond_0
    move-object v3, p3

    .line 8
    and-int/lit8 p3, p6, 0x8

    .line 9
    .line 10
    if-eqz p3, :cond_1

    .line 11
    .line 12
    const/4 p4, 0x0

    .line 13
    :cond_1
    move-object v4, p4

    .line 14
    and-int/lit8 p3, p6, 0x10

    .line 15
    .line 16
    if-eqz p3, :cond_2

    .line 17
    .line 18
    const/4 p5, 0x1

    .line 19
    :cond_2
    move v5, p5

    .line 20
    move-object v0, p0

    .line 21
    move-object v1, p1

    .line 22
    move-object v2, p2

    .line 23
    invoke-virtual/range {v0 .. v5}, Lcom/discord/chat/presentation/message/system/AutomodSystemMessageView;->setMessage(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/root/MessageContext;Lcom/discord/chat/presentation/events/ChatEventHandler;Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;Z)V

    .line 24
    .line 25
    .line 26
    return-void
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
.end method


# virtual methods
.method public getSpineOriginView()Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lcom/discord/chat/presentation/message/system/AutomodSystemMessageView;->binding:Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;

    iget-object v0, v0, Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;->authorAvatar:Lcom/facebook/drawee/view/SimpleDraweeView;

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
    iget-boolean p1, p0, Lcom/discord/chat/presentation/message/system/AutomodSystemMessageView;->allowChildGestures:Z

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
    iget-object v0, p0, Lcom/discord/chat/presentation/message/system/AutomodSystemMessageView;->binding:Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;

    .line 7
    .line 8
    iget-object v0, v0, Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;->accessoriesView:Lcom/discord/chat/presentation/message/MessageAccessoriesView;

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

.method public final setMessage(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/root/MessageContext;Lcom/discord/chat/presentation/events/ChatEventHandler;Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;Z)V
    .locals 8

    .line 1
    const-string v0, "message"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "messageContext"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "eventHandler"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iput-boolean p5, p0, Lcom/discord/chat/presentation/message/system/AutomodSystemMessageView;->allowChildGestures:Z

    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/discord/chat/bridge/Message;->getAutoModerationContext()Lcom/discord/chat/bridge/automod/AutoModerationContext;

    .line 19
    .line 20
    .line 21
    move-result-object p5

    .line 22
    if-nez p5, :cond_0

    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    invoke-direct {p0, p1, p5, p3}, Lcom/discord/chat/presentation/message/system/AutomodSystemMessageView;->configureAuthor(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/bridge/automod/AutoModerationContext;Lcom/discord/chat/presentation/events/ChatEventHandler;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/discord/chat/bridge/Message;->getCommunicationDisabled()Ljava/lang/Boolean;

    .line 29
    .line 30
    .line 31
    move-result-object p5

    .line 32
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 33
    .line 34
    invoke-static {p5, v0}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p5

    .line 38
    invoke-direct {p0, p5}, Lcom/discord/chat/presentation/message/system/AutomodSystemMessageView;->configureCommunicationDisabled(Z)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2}, Lcom/discord/chat/presentation/root/MessageContext;->getShowDivider()Z

    .line 42
    .line 43
    .line 44
    move-result p5

    .line 45
    invoke-direct {p0, p5}, Lcom/discord/chat/presentation/message/system/AutomodSystemMessageView;->configureDivider(Z)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Lcom/discord/chat/bridge/Message;->getThreadStarterMessageHeader()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p5

    .line 52
    iget-object v0, p0, Lcom/discord/chat/presentation/message/system/AutomodSystemMessageView;->binding:Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;

    .line 53
    .line 54
    iget-object v0, v0, Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;->threadStarterHeader:Lcom/discord/chat/presentation/message/ThreadStarterMessageHeaderView;

    .line 55
    .line 56
    invoke-virtual {p1}, Lcom/discord/chat/bridge/Message;->getReferencedMessage()Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    if-eqz v1, :cond_1

    .line 61
    .line 62
    const/4 v1, 0x1

    .line 63
    goto :goto_0

    .line 64
    :cond_1
    const/4 v1, 0x0

    .line 65
    :goto_0
    invoke-virtual {v0, p5, v1}, Lcom/discord/chat/presentation/message/ThreadStarterMessageHeaderView;->configure(Ljava/lang/String;Z)V

    .line 66
    .line 67
    .line 68
    iget-object p5, p0, Lcom/discord/chat/presentation/message/system/AutomodSystemMessageView;->binding:Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;

    .line 69
    .line 70
    iget-object p5, p5, Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;->replyPreview:Lcom/discord/chat/presentation/message/MessageViewReplyPreview;

    .line 71
    .line 72
    invoke-virtual {p5}, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;->clear()V

    .line 73
    .line 74
    .line 75
    invoke-direct {p0, p1, p2}, Lcom/discord/chat/presentation/message/system/AutomodSystemMessageView;->generateMessageAccessories(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/root/MessageContext;)Ljava/util/List;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    iget-object p2, p0, Lcom/discord/chat/presentation/message/system/AutomodSystemMessageView;->binding:Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;

    .line 80
    .line 81
    iget-object v0, p2, Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;->accessoriesView:Lcom/discord/chat/presentation/message/MessageAccessoriesView;

    .line 82
    .line 83
    invoke-virtual {p1}, Lcom/discord/chat/bridge/Message;->getId-3Eiw7ao()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {p1}, Lcom/discord/chat/bridge/Message;->getChannelId-o4g7jtM()J

    .line 88
    .line 89
    .line 90
    move-result-wide v2

    .line 91
    invoke-virtual {p1}, Lcom/discord/chat/bridge/Message;->getGuildId-qOKuAAo()Lcom/discord/primitives/GuildId;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    move-object v6, p3

    .line 96
    move-object v7, p4

    .line 97
    invoke-virtual/range {v0 .. v7}, Lcom/discord/chat/presentation/message/MessageAccessoriesView;->setAccessories-RC8ZMxU(Ljava/lang/String;JLcom/discord/primitives/GuildId;Ljava/util/List;Lcom/discord/chat/presentation/events/ChatEventHandler;Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;)V

    .line 98
    .line 99
    .line 100
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

.method public spacingPxOverride()Ljava/lang/Integer;
    .locals 1

    const/16 v0, 0x8

    invoke-static {v0}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
