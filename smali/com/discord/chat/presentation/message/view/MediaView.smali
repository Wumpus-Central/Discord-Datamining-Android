.class public Lcom/discord/chat/presentation/message/view/MediaView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0016\u0018\u00002\u00020\u0001B%\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u0008\u0010)\u001a\u00020*H\u0014J\u0012\u0010+\u001a\u00020*2\u0008\u0010,\u001a\u0004\u0018\u00010-H\u0014J\u0010\u0010.\u001a\u00020*2\u0006\u0010/\u001a\u00020\u0012H\u0016J\u0008\u00100\u001a\u00020*H\u0002J\u0008\u00101\u001a\u00020*H\u0002J$\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001c032\u0006\u0010 \u001a\u00020!2\u0006\u00104\u001a\u00020\u0012H\u0002J\u0008\u00105\u001a\u00020*H\u0002J\u0008\u00106\u001a\u00020*H\u0002J\u0081\u0001\u00107\u001a\u00020*2\n\u0008\u0002\u0010 \u001a\u0004\u0018\u00010!2\u0008\u0008\u0002\u0010\"\u001a\u00020\u00122\u0008\u0008\u0002\u0010$\u001a\u00020\u00122\u0008\u0008\u0002\u0010#\u001a\u00020\u00122\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0008\u0008\u0002\u0010%\u001a\u00020\u00122\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00122\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00122\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0002\u00108J(\u00109\u001a\u00020*2\u0016\u0010:\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010<\u0012\u0004\u0012\u00020*\u0018\u00010;2\u0008\u0010=\u001a\u0004\u0018\u00010>J\u0010\u0010?\u001a\u00020*2\u0006\u00101\u001a\u00020\u0012H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0008\n\u0000\u0012\u0004\u0008\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0018\u0010&\u001a\u00020\u0012*\u00020!8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\'\u0010(\u00a8\u0006@"
    }
    d2 = {
        "Lcom/discord/chat/presentation/message/view/MediaView;",
        "Landroid/widget/FrameLayout;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "attachStateChangeListener",
        "Lcom/discord/chat/presentation/message/view/media/ViewAttachedListener;",
        "binding",
        "Lcom/discord/chat/databinding/MediaViewBinding;",
        "getBinding$annotations",
        "()V",
        "managerModule",
        "Lcom/discord/media_player/MediaPlayerManagerModule;",
        "mediaCanPlayInline",
        "",
        "mediaHidePlayButton",
        "mediaOrientation",
        "Ljava/lang/Integer;",
        "mediaPlayThirdParty",
        "mediaPlaybackState",
        "Lcom/discord/media_player/MediaPlayer$Event;",
        "mediaPlayer",
        "Lcom/discord/media_player/MediaPlayer;",
        "mediaPlayerView",
        "Lcom/discord/media_player/MediaPlayerView;",
        "mediaPortalEvent",
        "Lcom/discord/portals/PortalViewContextManager$Event;",
        "mediaShouldResume",
        "mediaSource",
        "Lcom/discord/media_player/MediaSource;",
        "mediaViewDetached",
        "mediaViewFocused",
        "mediaViewScrolling",
        "mediaVolumeOn",
        "shouldShowGifIndicator",
        "getShouldShowGifIndicator",
        "(Lcom/discord/media_player/MediaSource;)Z",
        "onAttachedToWindow",
        "",
        "onConfigurationChanged",
        "newConfig",
        "Landroid/content/res/Configuration;",
        "onWindowFocusChanged",
        "hasWindowFocus",
        "pause",
        "play",
        "prepareMediaPlayer",
        "Lkotlin/Pair;",
        "loopMedia",
        "registerForPortal",
        "releasePlayer",
        "setMediaData",
        "(Lcom/discord/media_player/MediaSource;ZZZLcom/discord/media_player/MediaPlayer$Event;ZLjava/lang/Integer;Lcom/discord/portals/PortalViewContextManager$Event;ZZZ)V",
        "setOnMediaClickListeners",
        "onClickListener",
        "Lkotlin/Function1;",
        "",
        "onLongClickListener",
        "Landroid/view/View$OnLongClickListener;",
        "togglePortalControl",
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
.field private final attachStateChangeListener:Lcom/discord/chat/presentation/message/view/media/ViewAttachedListener;

.field private final binding:Lcom/discord/chat/databinding/MediaViewBinding;

.field private final managerModule:Lcom/discord/media_player/MediaPlayerManagerModule;

.field private mediaCanPlayInline:Z

.field private mediaHidePlayButton:Z

.field private mediaOrientation:Ljava/lang/Integer;

.field private mediaPlayThirdParty:Z

.field private mediaPlaybackState:Lcom/discord/media_player/MediaPlayer$Event;

.field private mediaPlayer:Lcom/discord/media_player/MediaPlayer;

.field private mediaPlayerView:Lcom/discord/media_player/MediaPlayerView;

.field private mediaPortalEvent:Lcom/discord/portals/PortalViewContextManager$Event;

.field private mediaShouldResume:Z

.field private mediaSource:Lcom/discord/media_player/MediaSource;

.field private mediaViewDetached:Z

.field private mediaViewFocused:Z

.field private mediaViewScrolling:Z

.field private mediaVolumeOn:Z


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

    invoke-direct/range {v1 .. v6}, Lcom/discord/chat/presentation/message/view/MediaView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v1 .. v6}, Lcom/discord/chat/presentation/message/view/MediaView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    invoke-static {p2, p0}, Lcom/discord/chat/databinding/MediaViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/discord/chat/databinding/MediaViewBinding;

    move-result-object p2

    const-string p3, "inflate(LayoutInflater.from(context), this)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/discord/chat/presentation/message/view/MediaView;->binding:Lcom/discord/chat/databinding/MediaViewBinding;

    const/4 p3, 0x1

    .line 4
    iput-boolean p3, p0, Lcom/discord/chat/presentation/message/view/MediaView;->mediaViewFocused:Z

    .line 5
    iput-boolean p3, p0, Lcom/discord/chat/presentation/message/view/MediaView;->mediaViewDetached:Z

    .line 6
    iput-boolean p3, p0, Lcom/discord/chat/presentation/message/view/MediaView;->mediaCanPlayInline:Z

    .line 7
    instance-of p3, p1, Lcom/facebook/react/uimanager/ThemedReactContext;

    const/4 v0, 0x0

    if-nez p3, :cond_0

    move-object p3, v0

    goto :goto_0

    :cond_0
    move-object p3, p1

    :goto_0
    check-cast p3, Lcom/facebook/react/uimanager/ThemedReactContext;

    if-eqz p3, :cond_1

    .line 8
    const-class v1, Lcom/discord/media_player/MediaPlayerManagerModule;

    .line 9
    invoke-virtual {p3, v1}, Lcom/facebook/react/bridge/ReactContext;->getNativeModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;

    move-result-object p3

    check-cast p3, Lcom/discord/media_player/MediaPlayerManagerModule;

    goto :goto_1

    :cond_1
    move-object p3, v0

    :goto_1
    iput-object p3, p0, Lcom/discord/chat/presentation/message/view/MediaView;->managerModule:Lcom/discord/media_player/MediaPlayerManagerModule;

    .line 10
    new-instance p3, Lcom/discord/chat/presentation/message/view/media/ViewAttachedListener;

    .line 11
    new-instance v1, Lcom/discord/chat/presentation/message/view/MediaView$attachStateChangeListener$1;

    invoke-direct {v1, p0}, Lcom/discord/chat/presentation/message/view/MediaView$attachStateChangeListener$1;-><init>(Lcom/discord/chat/presentation/message/view/MediaView;)V

    .line 12
    new-instance v2, Lcom/discord/chat/presentation/message/view/MediaView$attachStateChangeListener$2;

    invoke-direct {v2, p0}, Lcom/discord/chat/presentation/message/view/MediaView$attachStateChangeListener$2;-><init>(Lcom/discord/chat/presentation/message/view/MediaView;)V

    .line 13
    invoke-direct {p3, p0, v1, v2}, Lcom/discord/chat/presentation/message/view/media/ViewAttachedListener;-><init>(Landroid/view/View;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    iput-object p3, p0, Lcom/discord/chat/presentation/message/view/MediaView;->attachStateChangeListener:Lcom/discord/chat/presentation/message/view/media/ViewAttachedListener;

    .line 14
    invoke-virtual {p0, p3}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 15
    iget-object p3, p2, Lcom/discord/chat/databinding/MediaViewBinding;->inlineMediaPlayButton:Landroid/widget/ImageView;

    const-string v1, "_init_$lambda$0"

    .line 16
    invoke-static {p3, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v1, -0x1000000

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {p3, v1, v2, v3, v0}, Lcom/discord/misc/utilities/view/ViewBackgroundUtilsKt;->setBackgroundOval$default(Landroid/view/View;IIILjava/lang/Object;)V

    const/4 v1, -0x1

    .line 17
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p3, v1}, Lcom/discord/theme/utils/ColorUtilsKt;->setTintColor(Landroid/widget/ImageView;Ljava/lang/Integer;)V

    .line 18
    sget-object v1, Lcom/discord/react_strings/I18nMessage;->PLAY_FULL_VIDEO:Lcom/discord/react_strings/I18nMessage;

    invoke-static {p3, v1, v0, v3, v0}, Lcom/discord/react_strings/I18nUtilsKt;->i18nContentDescription$default(Landroid/widget/ImageView;Lcom/discord/react_strings/I18nMessage;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    .line 19
    iget-object p3, p2, Lcom/discord/chat/databinding/MediaViewBinding;->inlineMediaGifIndicator:Lcom/facebook/drawee/view/SimpleDraweeView;

    const-string v0, "binding.inlineMediaGifIndicator"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/discord/react_asset_fetcher/ReactAsset;->Gif:Lcom/discord/react_asset_fetcher/ReactAsset;

    invoke-static {p3, v0}, Lcom/discord/react_asset_fetcher/ReactAssetUtilsKt;->setReactAsset(Lcom/facebook/drawee/view/SimpleDraweeView;Lcom/discord/react_asset_fetcher/ReactAsset;)V

    .line 20
    iget-object p2, p2, Lcom/discord/chat/databinding/MediaViewBinding;->inlineMediaImagePreview:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 21
    invoke-virtual {p2}, Lcom/facebook/drawee/view/a;->getHierarchy()Lcom/facebook/drawee/interfaces/DraweeHierarchy;

    move-result-object p3

    check-cast p3, Lcom/facebook/drawee/generic/GenericDraweeHierarchy;

    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v1

    invoke-virtual {v1}, Lcom/discord/theme/DiscordTheme;->getBackgroundSecondaryAlt()I

    move-result v1

    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {p3, v0}, Lcom/facebook/drawee/generic/GenericDraweeHierarchy;->z(Landroid/graphics/drawable/Drawable;)V

    .line 22
    invoke-virtual {p2}, Lcom/facebook/drawee/view/a;->getHierarchy()Lcom/facebook/drawee/interfaces/DraweeHierarchy;

    move-result-object p3

    check-cast p3, Lcom/facebook/drawee/generic/GenericDraweeHierarchy;

    .line 23
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 24
    invoke-virtual {v0, v2}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 25
    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    sget v1, Lcom/discord/chat/R$dimen;->message_media_view_stroke:I

    invoke-virtual {p2, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p2

    .line 26
    sget v1, Lcom/discord/chat/R$color;->chat_media_view_stroke:I

    invoke-static {p1, v1}, Lcom/discord/theme/utils/ColorUtilsKt;->getColorCompat(Landroid/content/Context;I)I

    move-result p1

    .line 27
    invoke-virtual {v0, p2, p1}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 28
    invoke-virtual {p3, v0}, Lcom/facebook/drawee/generic/GenericDraweeHierarchy;->y(Landroid/graphics/drawable/Drawable;)V

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
    invoke-direct {p0, p1, p2, p3}, Lcom/discord/chat/presentation/message/view/MediaView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic a(Lcom/discord/chat/presentation/message/view/MediaView;Lcom/discord/media_player/MediaSource;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/discord/chat/presentation/message/view/MediaView;->setMediaData$lambda$3(Lcom/discord/chat/presentation/message/view/MediaView;Lcom/discord/media_player/MediaSource;Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic access$getAttachStateChangeListener$p(Lcom/discord/chat/presentation/message/view/MediaView;)Lcom/discord/chat/presentation/message/view/media/ViewAttachedListener;
    .locals 0

    iget-object p0, p0, Lcom/discord/chat/presentation/message/view/MediaView;->attachStateChangeListener:Lcom/discord/chat/presentation/message/view/media/ViewAttachedListener;

    return-object p0
.end method

.method public static final synthetic access$getBinding$p(Lcom/discord/chat/presentation/message/view/MediaView;)Lcom/discord/chat/databinding/MediaViewBinding;
    .locals 0

    iget-object p0, p0, Lcom/discord/chat/presentation/message/view/MediaView;->binding:Lcom/discord/chat/databinding/MediaViewBinding;

    return-object p0
.end method

.method public static final synthetic access$getManagerModule$p(Lcom/discord/chat/presentation/message/view/MediaView;)Lcom/discord/media_player/MediaPlayerManagerModule;
    .locals 0

    iget-object p0, p0, Lcom/discord/chat/presentation/message/view/MediaView;->managerModule:Lcom/discord/media_player/MediaPlayerManagerModule;

    return-object p0
.end method

.method public static final synthetic access$getMediaSource$p(Lcom/discord/chat/presentation/message/view/MediaView;)Lcom/discord/media_player/MediaSource;
    .locals 0

    iget-object p0, p0, Lcom/discord/chat/presentation/message/view/MediaView;->mediaSource:Lcom/discord/media_player/MediaSource;

    return-object p0
.end method

.method public static final synthetic access$play(Lcom/discord/chat/presentation/message/view/MediaView;)V
    .locals 0

    invoke-direct {p0}, Lcom/discord/chat/presentation/message/view/MediaView;->play()V

    return-void
.end method

.method public static final synthetic access$releasePlayer(Lcom/discord/chat/presentation/message/view/MediaView;)V
    .locals 0

    invoke-direct {p0}, Lcom/discord/chat/presentation/message/view/MediaView;->releasePlayer()V

    return-void
.end method

.method public static final synthetic access$setMediaVolumeOn$p(Lcom/discord/chat/presentation/message/view/MediaView;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/discord/chat/presentation/message/view/MediaView;->mediaVolumeOn:Z

    return-void
.end method

.method public static synthetic b(Lcom/discord/chat/presentation/message/view/MediaView;ZLcom/discord/media_player/MediaSource;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/discord/chat/presentation/message/view/MediaView;->setMediaData$lambda$5(Lcom/discord/chat/presentation/message/view/MediaView;ZLcom/discord/media_player/MediaSource;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic c(Lcom/discord/chat/presentation/message/view/MediaView;Lkotlin/jvm/functions/Function1;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/discord/chat/presentation/message/view/MediaView;->setOnMediaClickListeners$lambda$7(Lcom/discord/chat/presentation/message/view/MediaView;Lkotlin/jvm/functions/Function1;Landroid/view/View;)V

    return-void
.end method

.method private static synthetic getBinding$annotations()V
    .locals 0

    return-void
.end method

.method private final getShouldShowGifIndicator(Lcom/discord/media_player/MediaSource;)Z
    .locals 1

    invoke-virtual {p1}, Lcom/discord/media_player/MediaSource;->isGifv()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/discord/media_player/MediaSource;->getShouldAutoPlay()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private final pause()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/MediaView;->mediaPlayer:Lcom/discord/media_player/MediaPlayer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/discord/media_player/MediaPlayer;->pause()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    invoke-direct {p0, v0}, Lcom/discord/chat/presentation/message/view/MediaView;->togglePortalControl(Z)V

    .line 10
    .line 11
    .line 12
    return-void
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
.end method

.method private final play()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/MediaView;->mediaPlayer:Lcom/discord/media_player/MediaPlayer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/discord/media_player/MediaPlayer;->play()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x1

    .line 9
    invoke-direct {p0, v0}, Lcom/discord/chat/presentation/message/view/MediaView;->togglePortalControl(Z)V

    .line 10
    .line 11
    .line 12
    return-void
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
.end method

.method private final prepareMediaPlayer(Lcom/discord/media_player/MediaSource;Z)Lkotlin/Pair;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/media_player/MediaSource;",
            "Z)",
            "Lkotlin/Pair<",
            "Lcom/discord/media_player/MediaPlayer;",
            "Lcom/discord/media_player/MediaPlayerView;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/discord/chat/presentation/message/view/MediaView;->mediaPlayerView:Lcom/discord/media_player/MediaPlayerView;

    .line 4
    .line 5
    const-string v2, "context"

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    new-instance v1, Lcom/discord/media_player/MediaPlayerView;

    .line 10
    .line 11
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-static {v3, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {v1, v3}, Lcom/discord/media_player/MediaPlayerView;-><init>(Landroid/content/Context;)V

    .line 19
    .line 20
    .line 21
    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    .line 22
    .line 23
    const/4 v4, -0x1

    .line 24
    invoke-direct {v3, v4, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Lcom/discord/media_player/MediaPlayerView;->getView()Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    const/4 v5, 0x0

    .line 32
    invoke-virtual {v0, v4, v5, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    const/4 v3, 0x1

    .line 36
    invoke-virtual {v1, v3}, Lcom/discord/media_player/MediaPlayerView;->setVisible(Z)V

    .line 37
    .line 38
    .line 39
    iget-object v3, v0, Lcom/discord/chat/presentation/message/view/MediaView;->mediaPlayer:Lcom/discord/media_player/MediaPlayer;

    .line 40
    .line 41
    if-nez v3, :cond_1

    .line 42
    .line 43
    sget-object v3, Lcom/discord/media_player/MediaPlayerManager;->INSTANCE:Lcom/discord/media_player/MediaPlayerManager;

    .line 44
    .line 45
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-static {v4, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual/range {p1 .. p1}, Lcom/discord/media_player/MediaSource;->getPortal()Ljava/lang/Double;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-static {v2}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    .line 60
    .line 61
    .line 62
    move-result-wide v5

    .line 63
    invoke-virtual {v3, v4, v5, v6}, Lcom/discord/media_player/MediaPlayerManager;->acquire(Landroid/content/Context;D)Lcom/discord/media_player/MediaPlayer;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    :cond_1
    new-instance v2, Lcom/discord/chat/presentation/message/view/MediaView$prepareMediaPlayer$1$1;

    .line 68
    .line 69
    invoke-direct {v2, v0}, Lcom/discord/chat/presentation/message/view/MediaView$prepareMediaPlayer$1$1;-><init>(Lcom/discord/chat/presentation/message/view/MediaView;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v3, v2}, Lcom/discord/media_player/MediaPlayer;->setEventListener(Lkotlin/jvm/functions/Function1;)V

    .line 73
    .line 74
    .line 75
    new-instance v2, Lcom/discord/chat/presentation/message/view/MediaView$prepareMediaPlayer$1$2;

    .line 76
    .line 77
    invoke-direct {v2, v0}, Lcom/discord/chat/presentation/message/view/MediaView$prepareMediaPlayer$1$2;-><init>(Lcom/discord/chat/presentation/message/view/MediaView;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v3, v2}, Lcom/discord/media_player/MediaPlayer;->setVolumeListener(Lkotlin/jvm/functions/Function1;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual/range {p1 .. p1}, Lcom/discord/media_player/MediaSource;->isGifv()Z

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-eqz v2, :cond_2

    .line 88
    .line 89
    const/4 v2, 0x0

    .line 90
    goto :goto_0

    .line 91
    :cond_2
    const/high16 v2, 0x3f800000    # 1.0f

    .line 92
    .line 93
    :goto_0
    invoke-virtual {v3, v2}, Lcom/discord/media_player/MediaPlayer;->setVolume(F)V

    .line 94
    .line 95
    .line 96
    const/4 v8, 0x1

    .line 97
    const-wide/16 v10, 0x0

    .line 98
    .line 99
    const/4 v13, 0x0

    .line 100
    const/16 v14, 0x28

    .line 101
    .line 102
    const/4 v15, 0x0

    .line 103
    move-object v6, v3

    .line 104
    move-object/from16 v7, p1

    .line 105
    .line 106
    move/from16 v9, p2

    .line 107
    .line 108
    move-object v12, v1

    .line 109
    invoke-static/range {v6 .. v15}, Lcom/discord/media_player/MediaPlayer;->preparePlayer$default(Lcom/discord/media_player/MediaPlayer;Lcom/discord/media_player/MediaSource;ZZJLcom/discord/media_player/MediaPlayerView;Lcom/discord/media_player/MediaPlayerView$ControlView;ILjava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    iput-object v3, v0, Lcom/discord/chat/presentation/message/view/MediaView;->mediaPlayer:Lcom/discord/media_player/MediaPlayer;

    .line 113
    .line 114
    iput-object v1, v0, Lcom/discord/chat/presentation/message/view/MediaView;->mediaPlayerView:Lcom/discord/media_player/MediaPlayerView;

    .line 115
    .line 116
    invoke-static/range {p0 .. p0}, Lcom/discord/misc/utilities/measure/ViewMeasureExtensionsKt;->measureAndLayout(Landroid/view/View;)V

    .line 117
    .line 118
    .line 119
    new-instance v2, Lkotlin/Pair;

    .line 120
    .line 121
    invoke-direct {v2, v3, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    return-object v2
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

.method private final registerForPortal()V
    .locals 15

    .line 1
    iget-object v6, p0, Lcom/discord/chat/presentation/message/view/MediaView;->mediaSource:Lcom/discord/media_player/MediaSource;

    .line 2
    .line 3
    if-nez v6, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {v6}, Lcom/discord/media_player/MediaSource;->getPortal()Ljava/lang/Double;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 13
    .line 14
    .line 15
    move-result-wide v8

    .line 16
    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/MediaView;->mediaPlayer:Lcom/discord/media_player/MediaPlayer;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    iget-object v1, p0, Lcom/discord/chat/presentation/message/view/MediaView;->mediaPlayerView:Lcom/discord/media_player/MediaPlayerView;

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    new-instance v1, Lkotlin/Pair;

    .line 25
    .line 26
    invoke-static {v0}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object v2, p0, Lcom/discord/chat/presentation/message/view/MediaView;->mediaPlayerView:Lcom/discord/media_player/MediaPlayerView;

    .line 30
    .line 31
    invoke-static {v2}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-direct {v1, v0, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    invoke-virtual {v6}, Lcom/discord/media_player/MediaSource;->isValid()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    invoke-virtual {v6}, Lcom/discord/media_player/MediaSource;->isGifv()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    invoke-direct {p0, v6, v0}, Lcom/discord/chat/presentation/message/view/MediaView;->prepareMediaPlayer(Lcom/discord/media_player/MediaSource;Z)Lkotlin/Pair;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    :goto_0
    invoke-virtual {v1}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    move-object v2, v0

    .line 57
    check-cast v2, Lcom/discord/media_player/MediaPlayer;

    .line 58
    .line 59
    invoke-virtual {v1}, Lkotlin/Pair;->b()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, Lcom/discord/media_player/MediaPlayerView;

    .line 64
    .line 65
    sget-object v7, Lcom/discord/portals/PortalViewContextManager;->INSTANCE:Lcom/discord/portals/PortalViewContextManager;

    .line 66
    .line 67
    invoke-virtual {v0}, Lcom/discord/media_player/MediaPlayerView;->getView()Landroid/view/View;

    .line 68
    .line 69
    .line 70
    move-result-object v10

    .line 71
    new-instance v11, Lcom/discord/chat/presentation/message/view/MediaView$registerForPortal$1;

    .line 72
    .line 73
    invoke-direct {v11, p0}, Lcom/discord/chat/presentation/message/view/MediaView$registerForPortal$1;-><init>(Lcom/discord/chat/presentation/message/view/MediaView;)V

    .line 74
    .line 75
    .line 76
    new-instance v12, Lcom/discord/chat/presentation/message/view/MediaView$registerForPortal$2;

    .line 77
    .line 78
    invoke-direct {v12, p0, v8, v9, v2}, Lcom/discord/chat/presentation/message/view/MediaView$registerForPortal$2;-><init>(Lcom/discord/chat/presentation/message/view/MediaView;DLcom/discord/media_player/MediaPlayer;)V

    .line 79
    .line 80
    .line 81
    new-instance v13, Lcom/discord/chat/presentation/message/view/MediaView$registerForPortal$3;

    .line 82
    .line 83
    move-object v0, v13

    .line 84
    move-object v1, p0

    .line 85
    move-wide v3, v8

    .line 86
    move-object v5, v6

    .line 87
    invoke-direct/range {v0 .. v5}, Lcom/discord/chat/presentation/message/view/MediaView$registerForPortal$3;-><init>(Lcom/discord/chat/presentation/message/view/MediaView;Lcom/discord/media_player/MediaPlayer;DLcom/discord/media_player/MediaSource;)V

    .line 88
    .line 89
    .line 90
    new-instance v14, Lcom/discord/chat/presentation/message/view/MediaView$registerForPortal$4;

    .line 91
    .line 92
    invoke-direct {v14, v6, p0}, Lcom/discord/chat/presentation/message/view/MediaView$registerForPortal$4;-><init>(Lcom/discord/media_player/MediaSource;Lcom/discord/chat/presentation/message/view/MediaView;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {v7 .. v14}, Lcom/discord/portals/PortalViewContextManager;->addPortal(DLandroid/view/View;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 96
    .line 97
    .line 98
    :cond_2
    return-void
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
.end method

.method private final releasePlayer()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/MediaView;->managerModule:Lcom/discord/media_player/MediaPlayerManagerModule;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, p0, Lcom/discord/chat/presentation/message/view/MediaView;->mediaSource:Lcom/discord/media_player/MediaSource;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/discord/media_player/MediaSource;->getPortal()Ljava/lang/Double;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    .line 16
    .line 17
    .line 18
    move-result-wide v1

    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-virtual {v0, v1, v2, v3}, Lcom/discord/media_player/MediaPlayerManagerModule;->toggle(DZ)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    return-void

    .line 25
    :cond_1
    :goto_0
    sget-object v0, Lcom/discord/media_player/MediaPlayerManager;->INSTANCE:Lcom/discord/media_player/MediaPlayerManager;

    .line 26
    .line 27
    iget-object v1, p0, Lcom/discord/chat/presentation/message/view/MediaView;->mediaSource:Lcom/discord/media_player/MediaSource;

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    invoke-virtual {v1}, Lcom/discord/media_player/MediaSource;->getPortal()Ljava/lang/Double;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    goto :goto_1

    .line 37
    :cond_2
    move-object v1, v2

    .line 38
    :goto_1
    invoke-virtual {v0, v1}, Lcom/discord/media_player/MediaPlayerManager;->release(Ljava/lang/Double;)Z

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/MediaView;->mediaPlayer:Lcom/discord/media_player/MediaPlayer;

    .line 42
    .line 43
    if-eqz v0, :cond_3

    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/discord/media_player/MediaPlayer;->reset()V

    .line 46
    .line 47
    .line 48
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 49
    .line 50
    iput-object v2, p0, Lcom/discord/chat/presentation/message/view/MediaView;->mediaPlayer:Lcom/discord/media_player/MediaPlayer;

    .line 51
    .line 52
    :cond_3
    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/MediaView;->mediaPlayerView:Lcom/discord/media_player/MediaPlayerView;

    .line 53
    .line 54
    if-eqz v0, :cond_4

    .line 55
    .line 56
    invoke-virtual {v0}, Lcom/discord/media_player/MediaPlayerView;->reset()V

    .line 57
    .line 58
    .line 59
    :cond_4
    return-void
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

.method public static synthetic setMediaData$default(Lcom/discord/chat/presentation/message/view/MediaView;Lcom/discord/media_player/MediaSource;ZZZLcom/discord/media_player/MediaPlayer$Event;ZLjava/lang/Integer;Lcom/discord/portals/PortalViewContextManager$Event;ZZZILjava/lang/Object;)V
    .locals 12

    move-object v0, p0

    move/from16 v1, p12

    if-nez p13, :cond_b

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    .line 1
    iget-object v2, v0, Lcom/discord/chat/presentation/message/view/MediaView;->mediaSource:Lcom/discord/media_player/MediaSource;

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    .line 2
    iget-boolean v3, v0, Lcom/discord/chat/presentation/message/view/MediaView;->mediaViewDetached:Z

    goto :goto_1

    :cond_1
    move v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    .line 3
    iget-boolean v4, v0, Lcom/discord/chat/presentation/message/view/MediaView;->mediaViewScrolling:Z

    goto :goto_2

    :cond_2
    move v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    .line 4
    iget-boolean v5, v0, Lcom/discord/chat/presentation/message/view/MediaView;->mediaViewFocused:Z

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    .line 5
    iget-object v6, v0, Lcom/discord/chat/presentation/message/view/MediaView;->mediaPlaybackState:Lcom/discord/media_player/MediaPlayer$Event;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    .line 6
    iget-boolean v7, v0, Lcom/discord/chat/presentation/message/view/MediaView;->mediaVolumeOn:Z

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    .line 7
    iget-object v8, v0, Lcom/discord/chat/presentation/message/view/MediaView;->mediaOrientation:Ljava/lang/Integer;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    .line 8
    iget-object v9, v0, Lcom/discord/chat/presentation/message/view/MediaView;->mediaPortalEvent:Lcom/discord/portals/PortalViewContextManager$Event;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    .line 9
    iget-boolean v10, v0, Lcom/discord/chat/presentation/message/view/MediaView;->mediaCanPlayInline:Z

    goto :goto_8

    :cond_8
    move/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    .line 10
    iget-boolean v11, v0, Lcom/discord/chat/presentation/message/view/MediaView;->mediaPlayThirdParty:Z

    goto :goto_9

    :cond_9
    move/from16 v11, p10

    :goto_9
    and-int/lit16 v1, v1, 0x400

    if-eqz v1, :cond_a

    .line 11
    iget-boolean v1, v0, Lcom/discord/chat/presentation/message/view/MediaView;->mediaHidePlayButton:Z

    goto :goto_a

    :cond_a
    move/from16 v1, p11

    :goto_a
    move-object p1, v2

    move p2, v3

    move p3, v4

    move/from16 p4, v5

    move-object/from16 p5, v6

    move/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move/from16 p9, v10

    move/from16 p10, v11

    move/from16 p11, v1

    .line 12
    invoke-virtual/range {p0 .. p11}, Lcom/discord/chat/presentation/message/view/MediaView;->setMediaData(Lcom/discord/media_player/MediaSource;ZZZLcom/discord/media_player/MediaPlayer$Event;ZLjava/lang/Integer;Lcom/discord/portals/PortalViewContextManager$Event;ZZZ)V

    return-void

    :cond_b
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Super calls with default arguments not supported in this target, function: setMediaData"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static final setMediaData$lambda$3(Lcom/discord/chat/presentation/message/view/MediaView;Lcom/discord/media_player/MediaSource;Landroid/view/View;)V
    .locals 0

    .line 1
    const-string p2, "this$0"

    .line 2
    .line 3
    invoke-static {p0, p2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, Lcom/discord/chat/presentation/message/view/MediaView;->mediaPlayer:Lcom/discord/media_player/MediaPlayer;

    .line 7
    .line 8
    if-eqz p2, :cond_1

    .line 9
    .line 10
    iget-object p2, p0, Lcom/discord/chat/presentation/message/view/MediaView;->mediaPlayerView:Lcom/discord/media_player/MediaPlayerView;

    .line 11
    .line 12
    if-nez p2, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-direct {p0}, Lcom/discord/chat/presentation/message/view/MediaView;->play()V

    .line 16
    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    :goto_0
    const/4 p2, 0x0

    .line 20
    invoke-direct {p0, p1, p2}, Lcom/discord/chat/presentation/message/view/MediaView;->prepareMediaPlayer(Lcom/discord/media_player/MediaSource;Z)Lkotlin/Pair;

    .line 21
    .line 22
    .line 23
    :goto_1
    return-void
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

.method private static final setMediaData$lambda$5(Lcom/discord/chat/presentation/message/view/MediaView;ZLcom/discord/media_player/MediaSource;Landroid/view/View;)V
    .locals 1

    .line 1
    const-string p3, "this$0"

    .line 2
    .line 3
    invoke-static {p0, p3}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p3, p0, Lcom/discord/chat/presentation/message/view/MediaView;->mediaPlayer:Lcom/discord/media_player/MediaPlayer;

    .line 7
    .line 8
    if-eqz p3, :cond_1

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    .line 15
    .line 16
    :goto_0
    invoke-virtual {p3, v0}, Lcom/discord/media_player/MediaPlayer;->setVolume(F)V

    .line 17
    .line 18
    .line 19
    :cond_1
    if-eqz p2, :cond_2

    .line 20
    .line 21
    invoke-virtual {p2}, Lcom/discord/media_player/MediaSource;->getPortal()Ljava/lang/Double;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    if-eqz p2, :cond_2

    .line 26
    .line 27
    invoke-virtual {p2}, Ljava/lang/Number;->doubleValue()D

    .line 28
    .line 29
    .line 30
    move-result-wide p2

    .line 31
    iget-object p0, p0, Lcom/discord/chat/presentation/message/view/MediaView;->managerModule:Lcom/discord/media_player/MediaPlayerManagerModule;

    .line 32
    .line 33
    if-eqz p0, :cond_2

    .line 34
    .line 35
    invoke-virtual {p0, p2, p3, p1}, Lcom/discord/media_player/MediaPlayerManagerModule;->onMuteToggle(DZ)V

    .line 36
    .line 37
    .line 38
    :cond_2
    return-void
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

.method private static final setOnMediaClickListeners$lambda$7(Lcom/discord/chat/presentation/message/view/MediaView;Lkotlin/jvm/functions/Function1;Landroid/view/View;)V
    .locals 3

    .line 1
    const-string p2, "this$0"

    .line 2
    .line 3
    invoke-static {p0, p2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/discord/chat/presentation/message/view/MediaView;->registerForPortal()V

    .line 7
    .line 8
    .line 9
    iget-object p2, p0, Lcom/discord/chat/presentation/message/view/MediaView;->mediaSource:Lcom/discord/media_player/MediaSource;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    if-eqz p2, :cond_1

    .line 13
    .line 14
    invoke-virtual {p2}, Lcom/discord/media_player/MediaSource;->getPortal()Ljava/lang/Double;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    if-eqz p2, :cond_1

    .line 19
    .line 20
    invoke-virtual {p2}, Ljava/lang/Number;->doubleValue()D

    .line 21
    .line 22
    .line 23
    iget-object p0, p0, Lcom/discord/chat/presentation/message/view/MediaView;->mediaSource:Lcom/discord/media_player/MediaSource;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    if-eqz p0, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/discord/media_player/MediaSource;->isValid()Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    const/4 v2, 0x1

    .line 33
    if-ne p0, v2, :cond_0

    .line 34
    .line 35
    move v1, v2

    .line 36
    :cond_0
    if-eqz v1, :cond_1

    .line 37
    .line 38
    move-object v0, p2

    .line 39
    :cond_1
    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    return-void
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

.method private final togglePortalControl(Z)V
    .locals 3

    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/MediaView;->mediaSource:Lcom/discord/media_player/MediaSource;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/discord/media_player/MediaSource;->getPortal()Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    iget-object v2, p0, Lcom/discord/chat/presentation/message/view/MediaView;->managerModule:Lcom/discord/media_player/MediaPlayerManagerModule;

    if-eqz v2, :cond_0

    invoke-virtual {v2, v0, v1, p1}, Lcom/discord/media_player/MediaPlayerManagerModule;->toggle(DZ)V

    :cond_0
    return-void
.end method


# virtual methods
.method protected onAttachedToWindow()V
    .locals 7

    .line 1
    invoke-super {p0}, Landroid/widget/FrameLayout;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    invoke-static {p0, v0}, Lcom/discord/misc/utilities/coroutines/CoroutineViewUtilsKt;->attachedScope(Landroid/view/View;Z)Lcom/discord/misc/utilities/coroutines/AttachedViewCoroutineScope;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x0

    .line 11
    new-instance v4, Lcom/discord/chat/presentation/message/view/MediaView$onAttachedToWindow$1;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-direct {v4, p0, v0}, Lcom/discord/chat/presentation/message/view/MediaView$onAttachedToWindow$1;-><init>(Lcom/discord/chat/presentation/message/view/MediaView;Lkotlin/coroutines/Continuation;)V

    .line 15
    .line 16
    .line 17
    const/4 v5, 0x3

    .line 18
    const/4 v6, 0x0

    .line 19
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/j;->d(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/l0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 20
    .line 21
    .line 22
    return-void
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
.end method

.method protected onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 14

    .line 1
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x0

    .line 9
    const/4 v6, 0x0

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    iget p1, p1, Landroid/content/res/Configuration;->orientation:I

    .line 13
    .line 14
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    :goto_0
    move-object v7, p1

    .line 21
    const/4 v8, 0x0

    .line 22
    const/4 v9, 0x0

    .line 23
    const/4 v10, 0x0

    .line 24
    const/4 v11, 0x0

    .line 25
    const/16 v12, 0x7bf

    .line 26
    .line 27
    const/4 v13, 0x0

    .line 28
    move-object v0, p0

    .line 29
    invoke-static/range {v0 .. v13}, Lcom/discord/chat/presentation/message/view/MediaView;->setMediaData$default(Lcom/discord/chat/presentation/message/view/MediaView;Lcom/discord/media_player/MediaSource;ZZZLcom/discord/media_player/MediaPlayer$Event;ZLjava/lang/Integer;Lcom/discord/portals/PortalViewContextManager$Event;ZZZILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
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
.end method

.method public onWindowFocusChanged(Z)V
    .locals 14

    .line 1
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onWindowFocusChanged(Z)V

    .line 2
    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v5, 0x0

    .line 8
    const/4 v6, 0x0

    .line 9
    const/4 v7, 0x0

    .line 10
    const/4 v8, 0x0

    .line 11
    const/4 v9, 0x0

    .line 12
    const/4 v10, 0x0

    .line 13
    const/4 v11, 0x0

    .line 14
    const/16 v12, 0x7f7

    .line 15
    .line 16
    const/4 v13, 0x0

    .line 17
    move-object v0, p0

    .line 18
    move v4, p1

    .line 19
    invoke-static/range {v0 .. v13}, Lcom/discord/chat/presentation/message/view/MediaView;->setMediaData$default(Lcom/discord/chat/presentation/message/view/MediaView;Lcom/discord/media_player/MediaSource;ZZZLcom/discord/media_player/MediaPlayer$Event;ZLjava/lang/Integer;Lcom/discord/portals/PortalViewContextManager$Event;ZZZILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-void
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

.method public final setMediaData(Lcom/discord/media_player/MediaSource;ZZZLcom/discord/media_player/MediaPlayer$Event;ZLjava/lang/Integer;Lcom/discord/portals/PortalViewContextManager$Event;ZZZ)V
    .locals 22

    move-object/from16 v14, p0

    move-object/from16 v0, p1

    move/from16 v1, p2

    move/from16 v2, p3

    move/from16 v3, p4

    move-object/from16 v4, p5

    move/from16 v5, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move/from16 v8, p9

    move/from16 v9, p10

    move/from16 v10, p11

    .line 1
    iget-object v11, v14, Lcom/discord/chat/presentation/message/view/MediaView;->mediaSource:Lcom/discord/media_player/MediaSource;

    invoke-static {v11, v0}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_0

    .line 2
    iget-boolean v11, v14, Lcom/discord/chat/presentation/message/view/MediaView;->mediaViewDetached:Z

    if-ne v11, v1, :cond_0

    .line 3
    iget-boolean v11, v14, Lcom/discord/chat/presentation/message/view/MediaView;->mediaViewScrolling:Z

    if-ne v11, v2, :cond_0

    .line 4
    iget-boolean v11, v14, Lcom/discord/chat/presentation/message/view/MediaView;->mediaViewFocused:Z

    if-ne v11, v3, :cond_0

    .line 5
    iget-object v11, v14, Lcom/discord/chat/presentation/message/view/MediaView;->mediaPlaybackState:Lcom/discord/media_player/MediaPlayer$Event;

    invoke-static {v11, v4}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_0

    .line 6
    iget-boolean v11, v14, Lcom/discord/chat/presentation/message/view/MediaView;->mediaVolumeOn:Z

    if-ne v11, v5, :cond_0

    .line 7
    iget-object v11, v14, Lcom/discord/chat/presentation/message/view/MediaView;->mediaOrientation:Ljava/lang/Integer;

    invoke-static {v11, v6}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_0

    .line 8
    iget-object v11, v14, Lcom/discord/chat/presentation/message/view/MediaView;->mediaPortalEvent:Lcom/discord/portals/PortalViewContextManager$Event;

    invoke-static {v11, v7}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_0

    .line 9
    iget-boolean v11, v14, Lcom/discord/chat/presentation/message/view/MediaView;->mediaCanPlayInline:Z

    if-ne v11, v8, :cond_0

    .line 10
    iget-boolean v11, v14, Lcom/discord/chat/presentation/message/view/MediaView;->mediaPlayThirdParty:Z

    if-ne v11, v9, :cond_0

    .line 11
    iget-boolean v11, v14, Lcom/discord/chat/presentation/message/view/MediaView;->mediaHidePlayButton:Z

    if-ne v11, v10, :cond_0

    return-void

    .line 12
    :cond_0
    iget-object v11, v14, Lcom/discord/chat/presentation/message/view/MediaView;->mediaSource:Lcom/discord/media_player/MediaSource;

    invoke-static {v11, v0}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    const/4 v12, 0x1

    xor-int/2addr v11, v12

    .line 13
    iget-object v13, v14, Lcom/discord/chat/presentation/message/view/MediaView;->mediaOrientation:Ljava/lang/Integer;

    invoke-static {v13, v6}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    xor-int/2addr v13, v12

    .line 14
    iput-object v0, v14, Lcom/discord/chat/presentation/message/view/MediaView;->mediaSource:Lcom/discord/media_player/MediaSource;

    .line 15
    iput-boolean v1, v14, Lcom/discord/chat/presentation/message/view/MediaView;->mediaViewDetached:Z

    .line 16
    iput-boolean v2, v14, Lcom/discord/chat/presentation/message/view/MediaView;->mediaViewScrolling:Z

    .line 17
    iput-boolean v3, v14, Lcom/discord/chat/presentation/message/view/MediaView;->mediaViewFocused:Z

    .line 18
    iput-object v4, v14, Lcom/discord/chat/presentation/message/view/MediaView;->mediaPlaybackState:Lcom/discord/media_player/MediaPlayer$Event;

    .line 19
    iput-object v6, v14, Lcom/discord/chat/presentation/message/view/MediaView;->mediaOrientation:Ljava/lang/Integer;

    .line 20
    iput-boolean v5, v14, Lcom/discord/chat/presentation/message/view/MediaView;->mediaVolumeOn:Z

    .line 21
    iput-object v7, v14, Lcom/discord/chat/presentation/message/view/MediaView;->mediaPortalEvent:Lcom/discord/portals/PortalViewContextManager$Event;

    .line 22
    iput-boolean v8, v14, Lcom/discord/chat/presentation/message/view/MediaView;->mediaCanPlayInline:Z

    .line 23
    iput-boolean v9, v14, Lcom/discord/chat/presentation/message/view/MediaView;->mediaPlayThirdParty:Z

    .line 24
    iput-boolean v10, v14, Lcom/discord/chat/presentation/message/view/MediaView;->mediaHidePlayButton:Z

    .line 25
    sget-object v6, Lcom/discord/portals/PortalViewContextManager;->INSTANCE:Lcom/discord/portals/PortalViewContextManager;

    if-eqz v0, :cond_1

    invoke-virtual/range {p1 .. p1}, Lcom/discord/media_player/MediaSource;->getPortal()Ljava/lang/Double;

    move-result-object v15

    goto :goto_0

    :cond_1
    const/4 v15, 0x0

    :goto_0
    invoke-virtual {v6, v15}, Lcom/discord/portals/PortalViewContextManager;->isMediaViewBeingPortaled(Ljava/lang/Double;)Ljava/lang/Boolean;

    move-result-object v6

    if-eqz v13, :cond_2

    .line 26
    sget-object v13, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v6, v13}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_2

    .line 27
    invoke-direct/range {p0 .. p0}, Lcom/discord/chat/presentation/message/view/MediaView;->releasePlayer()V

    .line 28
    :cond_2
    sget-object v13, Lcom/discord/media_player/MediaPlayer$Event$BufferStart;->INSTANCE:Lcom/discord/media_player/MediaPlayer$Event$BufferStart;

    invoke-static {v4, v13}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_4

    if-eqz v0, :cond_3

    invoke-virtual/range {p1 .. p1}, Lcom/discord/media_player/MediaSource;->isGifv()Z

    move-result v13

    if-ne v13, v12, :cond_3

    move v13, v12

    goto :goto_1

    :cond_3
    const/4 v13, 0x0

    :goto_1
    if-nez v13, :cond_4

    move v13, v12

    goto :goto_2

    :cond_4
    const/4 v13, 0x0

    .line 29
    :goto_2
    iget-object v7, v14, Lcom/discord/chat/presentation/message/view/MediaView;->binding:Lcom/discord/chat/databinding/MediaViewBinding;

    iget-object v7, v7, Lcom/discord/chat/databinding/MediaViewBinding;->inlineMediaLoadingIndicator:Landroid/widget/ProgressBar;

    const-string v15, "binding.inlineMediaLoadingIndicator"

    invoke-static {v7, v15}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v13, :cond_5

    const/4 v15, 0x0

    goto :goto_3

    :cond_5
    const/16 v15, 0x8

    .line 30
    :goto_3
    invoke-virtual {v7, v15}, Landroid/view/View;->setVisibility(I)V

    const-string v7, "binding.inlineMediaImagePreview"

    if-eqz v11, :cond_7

    .line 31
    iget-object v15, v14, Lcom/discord/chat/presentation/message/view/MediaView;->binding:Lcom/discord/chat/databinding/MediaViewBinding;

    iget-object v15, v15, Lcom/discord/chat/databinding/MediaViewBinding;->inlineMediaImagePreview:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v15, v7}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v0, :cond_6

    .line 32
    invoke-virtual/range {p1 .. p1}, Lcom/discord/media_player/MediaSource;->getPreviewUrl()Ljava/lang/String;

    move-result-object v16

    move-object/from16 v17, v16

    goto :goto_4

    :cond_6
    const/16 v17, 0x0

    :goto_4
    const/16 v18, 0x0

    .line 33
    new-instance v12, Lcom/discord/chat/presentation/message/view/MediaView$setMediaData$1;

    invoke-direct {v12, v14}, Lcom/discord/chat/presentation/message/view/MediaView$setMediaData$1;-><init>(Lcom/discord/chat/presentation/message/view/MediaView;)V

    const/16 v20, 0x2

    const/16 v21, 0x0

    move-object/from16 v16, v15

    move-object/from16 v19, v12

    invoke-static/range {v16 .. v21}, Lcom/discord/image/fresco/SetOptionalImageUrlKt;->setOptionalImageUrl$default(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    .line 34
    :cond_7
    iget-object v12, v14, Lcom/discord/chat/presentation/message/view/MediaView;->binding:Lcom/discord/chat/databinding/MediaViewBinding;

    iget-object v12, v12, Lcom/discord/chat/databinding/MediaViewBinding;->inlineMediaImagePreview:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v12, v7}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    sget-object v7, Lcom/discord/media_player/MediaPlayer$Event$StartedPlaying;->INSTANCE:Lcom/discord/media_player/MediaPlayer$Event$StartedPlaying;

    invoke-static {v4, v7}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_8

    .line 36
    sget-object v15, Lcom/discord/media_player/MediaPlayer$Event$Paused;->INSTANCE:Lcom/discord/media_player/MediaPlayer$Event$Paused;

    invoke-static {v4, v15}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_8

    const/4 v15, 0x1

    goto :goto_5

    :cond_8
    const/4 v15, 0x0

    :goto_5
    if-eqz v15, :cond_9

    const/4 v15, 0x0

    goto :goto_6

    :cond_9
    const/16 v15, 0x8

    .line 37
    :goto_6
    invoke-virtual {v12, v15}, Landroid/view/View;->setVisibility(I)V

    .line 38
    iget-object v12, v14, Lcom/discord/chat/presentation/message/view/MediaView;->binding:Lcom/discord/chat/databinding/MediaViewBinding;

    iget-object v12, v12, Lcom/discord/chat/databinding/MediaViewBinding;->inlineMediaGifIndicator:Lcom/facebook/drawee/view/SimpleDraweeView;

    const-string v15, "binding.inlineMediaGifIndicator"

    invoke-static {v12, v15}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v0, :cond_a

    invoke-direct/range {p0 .. p1}, Lcom/discord/chat/presentation/message/view/MediaView;->getShouldShowGifIndicator(Lcom/discord/media_player/MediaSource;)Z

    move-result v15

    const/4 v3, 0x1

    if-ne v15, v3, :cond_b

    move v15, v3

    goto :goto_7

    :cond_a
    const/4 v3, 0x1

    :cond_b
    const/4 v15, 0x0

    :goto_7
    if-eqz v15, :cond_c

    const/4 v15, 0x0

    goto :goto_8

    :cond_c
    const/16 v15, 0x8

    .line 39
    :goto_8
    invoke-virtual {v12, v15}, Landroid/view/View;->setVisibility(I)V

    if-eqz v0, :cond_d

    .line 40
    invoke-virtual/range {p1 .. p1}, Lcom/discord/media_player/MediaSource;->isValid()Z

    move-result v12

    if-ne v12, v3, :cond_d

    const/4 v3, 0x1

    goto :goto_9

    :cond_d
    const/4 v3, 0x0

    :goto_9
    if-eqz v3, :cond_e

    if-nez v13, :cond_e

    invoke-static {v4, v7}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_e

    const/4 v3, 0x1

    goto :goto_a

    :cond_e
    const/4 v3, 0x0

    :goto_a
    if-eqz v0, :cond_f

    .line 41
    invoke-virtual/range {p1 .. p1}, Lcom/discord/media_player/MediaSource;->isVideo()Z

    move-result v12

    const/4 v13, 0x1

    if-ne v12, v13, :cond_f

    const/4 v12, 0x1

    goto :goto_b

    :cond_f
    const/4 v12, 0x0

    :goto_b
    if-eqz v12, :cond_11

    if-nez v3, :cond_10

    if-eqz v9, :cond_11

    :cond_10
    if-nez v10, :cond_11

    const/4 v3, 0x1

    goto :goto_c

    :cond_11
    const/4 v3, 0x0

    .line 42
    :goto_c
    iget-object v10, v14, Lcom/discord/chat/presentation/message/view/MediaView;->binding:Lcom/discord/chat/databinding/MediaViewBinding;

    iget-object v10, v10, Lcom/discord/chat/databinding/MediaViewBinding;->inlineMediaPlayButton:Landroid/widget/ImageView;

    const-string v12, "binding.inlineMediaPlayButton"

    invoke-static {v10, v12}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v3, :cond_12

    const/4 v3, 0x0

    goto :goto_d

    :cond_12
    const/16 v3, 0x8

    .line 43
    :goto_d
    invoke-virtual {v10, v3}, Landroid/view/View;->setVisibility(I)V

    .line 44
    iget-object v3, v14, Lcom/discord/chat/presentation/message/view/MediaView;->binding:Lcom/discord/chat/databinding/MediaViewBinding;

    iget-object v3, v3, Lcom/discord/chat/databinding/MediaViewBinding;->inlineMediaPlayButton:Landroid/widget/ImageView;

    invoke-static {v3, v12}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    iget-boolean v10, v14, Lcom/discord/chat/presentation/message/view/MediaView;->mediaCanPlayInline:Z

    if-nez v10, :cond_13

    :goto_e
    const/4 v9, 0x0

    :goto_f
    const/4 v10, 0x0

    const/4 v12, 0x1

    const/4 v13, 0x0

    goto :goto_10

    :cond_13
    if-eqz v9, :cond_14

    goto :goto_e

    :cond_14
    if-nez v0, :cond_15

    goto :goto_e

    .line 46
    :cond_15
    new-instance v9, Lcom/discord/chat/presentation/message/view/c0;

    invoke-direct {v9, v14, v0}, Lcom/discord/chat/presentation/message/view/c0;-><init>(Lcom/discord/chat/presentation/message/view/MediaView;Lcom/discord/media_player/MediaSource;)V

    goto :goto_f

    :goto_10
    invoke-static {v3, v13, v9, v12, v10}, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchUtilsKt;->setOnClickListenerNested$default(Landroid/view/View;ZLandroid/view/View$OnClickListener;ILjava/lang/Object;)V

    .line 47
    iget-object v3, v14, Lcom/discord/chat/presentation/message/view/MediaView;->binding:Lcom/discord/chat/databinding/MediaViewBinding;

    iget-object v3, v3, Lcom/discord/chat/databinding/MediaViewBinding;->inlineMediaVolumeToggle:Lcom/facebook/drawee/view/SimpleDraweeView;

    const-string v9, "binding.inlineMediaVolumeToggle"

    invoke-static {v3, v9}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v0, :cond_16

    invoke-virtual/range {p1 .. p1}, Lcom/discord/media_player/MediaSource;->isVideo()Z

    move-result v10

    if-ne v10, v12, :cond_16

    const/4 v10, 0x1

    goto :goto_11

    :cond_16
    const/4 v10, 0x0

    :goto_11
    if-eqz v10, :cond_17

    .line 48
    invoke-virtual/range {p1 .. p1}, Lcom/discord/media_player/MediaSource;->isValid()Z

    move-result v10

    if-eqz v10, :cond_17

    if-eqz v4, :cond_17

    if-eqz v8, :cond_17

    const/4 v10, 0x1

    goto :goto_12

    :cond_17
    const/4 v10, 0x0

    :goto_12
    if-eqz v10, :cond_18

    const/4 v10, 0x0

    goto :goto_13

    :cond_18
    const/16 v10, 0x8

    .line 49
    :goto_13
    invoke-virtual {v3, v10}, Landroid/view/View;->setVisibility(I)V

    .line 50
    iget-object v3, v14, Lcom/discord/chat/presentation/message/view/MediaView;->binding:Lcom/discord/chat/databinding/MediaViewBinding;

    iget-object v3, v3, Lcom/discord/chat/databinding/MediaViewBinding;->inlineMediaVolumeToggle:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v3, v9}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v5, :cond_19

    .line 51
    sget-object v10, Lcom/discord/react_asset_fetcher/ReactAsset;->Volume:Lcom/discord/react_asset_fetcher/ReactAsset;

    goto :goto_14

    .line 52
    :cond_19
    sget-object v10, Lcom/discord/react_asset_fetcher/ReactAsset;->VolumeMute:Lcom/discord/react_asset_fetcher/ReactAsset;

    .line 53
    :goto_14
    invoke-static {v3, v10}, Lcom/discord/react_asset_fetcher/ReactAssetUtilsKt;->setReactAsset(Lcom/facebook/drawee/view/SimpleDraweeView;Lcom/discord/react_asset_fetcher/ReactAsset;)V

    .line 54
    iget-object v3, v14, Lcom/discord/chat/presentation/message/view/MediaView;->binding:Lcom/discord/chat/databinding/MediaViewBinding;

    iget-object v3, v3, Lcom/discord/chat/databinding/MediaViewBinding;->inlineMediaVolumeToggle:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v3, v9}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v10, -0x1

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v3, v10}, Lcom/discord/theme/utils/ColorUtilsKt;->setTintColor(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/Integer;)V

    .line 55
    iget-object v3, v14, Lcom/discord/chat/presentation/message/view/MediaView;->binding:Lcom/discord/chat/databinding/MediaViewBinding;

    iget-object v3, v3, Lcom/discord/chat/databinding/MediaViewBinding;->inlineMediaVolumeToggle:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v3, v9}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v5, :cond_1a

    .line 56
    sget-object v10, Lcom/discord/react_strings/I18nMessage;->SOUND_MUTE:Lcom/discord/react_strings/I18nMessage;

    goto :goto_15

    .line 57
    :cond_1a
    sget-object v10, Lcom/discord/react_strings/I18nMessage;->SOUND_UNMUTE:Lcom/discord/react_strings/I18nMessage;

    :goto_15
    const/4 v12, 0x2

    const/4 v13, 0x0

    .line 58
    invoke-static {v3, v10, v13, v12, v13}, Lcom/discord/react_strings/I18nUtilsKt;->i18nContentDescription$default(Landroid/widget/ImageView;Lcom/discord/react_strings/I18nMessage;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    .line 59
    iget-object v3, v14, Lcom/discord/chat/presentation/message/view/MediaView;->binding:Lcom/discord/chat/databinding/MediaViewBinding;

    iget-object v3, v3, Lcom/discord/chat/databinding/MediaViewBinding;->inlineMediaVolumeToggle:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v3, v9}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v9, Lcom/discord/chat/presentation/message/view/d0;

    invoke-direct {v9, v14, v5, v0}, Lcom/discord/chat/presentation/message/view/d0;-><init>(Lcom/discord/chat/presentation/message/view/MediaView;ZLcom/discord/media_player/MediaSource;)V

    const/4 v5, 0x1

    const/4 v10, 0x0

    invoke-static {v3, v10, v9, v5, v13}, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchUtilsKt;->setOnClickListenerNested$default(Landroid/view/View;ZLandroid/view/View$OnClickListener;ILjava/lang/Object;)V

    .line 60
    sget-object v3, Lcom/discord/media_player/MediaPlayer$Event$PlaybackEnded;->INSTANCE:Lcom/discord/media_player/MediaPlayer$Event$PlaybackEnded;

    invoke-static {v4, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1b

    .line 61
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v6, v5}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1b

    const/4 v5, 0x1

    goto :goto_16

    :cond_1b
    const/4 v5, 0x0

    :goto_16
    if-nez v3, :cond_1f

    if-nez v1, :cond_1c

    if-nez v8, :cond_1d

    .line 62
    :cond_1c
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v6, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1f

    :cond_1d
    if-eqz v11, :cond_1e

    goto :goto_17

    :cond_1e
    const/4 v3, 0x0

    goto :goto_18

    :cond_1f
    :goto_17
    const/4 v3, 0x1

    :goto_18
    if-eqz v5, :cond_20

    const/4 v5, 0x0

    .line 63
    invoke-direct {v14, v5}, Lcom/discord/chat/presentation/message/view/MediaView;->togglePortalControl(Z)V

    goto :goto_19

    :cond_20
    if-eqz v3, :cond_21

    .line 64
    invoke-direct/range {p0 .. p0}, Lcom/discord/chat/presentation/message/view/MediaView;->releasePlayer()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v12, 0x7ef

    const/4 v13, 0x0

    move-object/from16 v0, p0

    .line 65
    invoke-static/range {v0 .. v13}, Lcom/discord/chat/presentation/message/view/MediaView;->setMediaData$default(Lcom/discord/chat/presentation/message/view/MediaView;Lcom/discord/media_player/MediaSource;ZZZLcom/discord/media_player/MediaPlayer$Event;ZLjava/lang/Integer;Lcom/discord/portals/PortalViewContextManager$Event;ZZZILjava/lang/Object;)V

    return-void

    .line 66
    :cond_21
    :goto_19
    iget-object v3, v14, Lcom/discord/chat/presentation/message/view/MediaView;->mediaPlayerView:Lcom/discord/media_player/MediaPlayerView;

    if-nez v3, :cond_22

    goto :goto_1b

    :cond_22
    if-eqz v0, :cond_23

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v6, v5}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_23

    const/4 v5, 0x1

    goto :goto_1a

    :cond_23
    const/4 v5, 0x0

    :goto_1a
    invoke-virtual {v3, v5}, Lcom/discord/media_player/MediaPlayerView;->setVisible(Z)V

    :goto_1b
    if-eqz v0, :cond_24

    .line 67
    invoke-virtual/range {p1 .. p1}, Lcom/discord/media_player/MediaSource;->getShouldAutoPlay()Z

    move-result v3

    const/4 v5, 0x1

    if-ne v3, v5, :cond_24

    const/4 v3, 0x1

    goto :goto_1c

    :cond_24
    const/4 v3, 0x0

    :goto_1c
    if-eqz v3, :cond_25

    if-nez v1, :cond_25

    if-nez v2, :cond_25

    const/4 v2, 0x1

    goto :goto_1d

    :cond_25
    const/4 v2, 0x0

    :goto_1d
    if-eqz v2, :cond_28

    if-nez v4, :cond_26

    .line 68
    invoke-static/range {p1 .. p1}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    const/4 v1, 0x1

    invoke-direct {v14, v0, v1}, Lcom/discord/chat/presentation/message/view/MediaView;->prepareMediaPlayer(Lcom/discord/media_player/MediaSource;Z)Lkotlin/Pair;

    goto :goto_1e

    .line 69
    :cond_26
    invoke-static {v4, v7}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_27

    return-void

    .line 70
    :cond_27
    invoke-direct/range {p0 .. p0}, Lcom/discord/chat/presentation/message/view/MediaView;->play()V

    :goto_1e
    return-void

    :cond_28
    if-nez v1, :cond_2a

    if-eqz p4, :cond_2a

    .line 71
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v6, v1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_29

    goto :goto_1f

    :cond_29
    const/4 v3, 0x0

    goto :goto_20

    :cond_2a
    :goto_1f
    const/4 v3, 0x1

    .line 72
    :goto_20
    iget-object v1, v14, Lcom/discord/chat/presentation/message/view/MediaView;->mediaPlayerView:Lcom/discord/media_player/MediaPlayerView;

    if-eqz v1, :cond_2b

    invoke-virtual {v1}, Lcom/discord/media_player/MediaPlayerView;->getView()Landroid/view/View;

    move-result-object v1

    move-object v13, v1

    :cond_2b
    if-nez v13, :cond_2c

    goto :goto_23

    .line 73
    :cond_2c
    invoke-static {v4, v7}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2f

    if-nez v3, :cond_2f

    if-eqz v0, :cond_2d

    .line 74
    invoke-virtual/range {p1 .. p1}, Lcom/discord/media_player/MediaSource;->isVideo()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2d

    const/4 v0, 0x1

    goto :goto_21

    :cond_2d
    const/4 v0, 0x0

    :goto_21
    if-nez v0, :cond_2e

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v6, v0}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2f

    :cond_2e
    const/4 v0, 0x1

    goto :goto_22

    :cond_2f
    const/4 v0, 0x0

    .line 75
    :goto_22
    invoke-virtual {v13, v0}, Landroid/view/View;->setKeepScreenOn(Z)V

    :goto_23
    if-nez v3, :cond_30

    .line 76
    iget-boolean v0, v14, Lcom/discord/chat/presentation/message/view/MediaView;->mediaShouldResume:Z

    if-eqz v0, :cond_30

    .line 77
    invoke-direct/range {p0 .. p0}, Lcom/discord/chat/presentation/message/view/MediaView;->play()V

    const/4 v0, 0x0

    .line 78
    iput-boolean v0, v14, Lcom/discord/chat/presentation/message/view/MediaView;->mediaShouldResume:Z

    goto :goto_24

    :cond_30
    if-eqz v3, :cond_31

    .line 79
    invoke-direct/range {p0 .. p0}, Lcom/discord/chat/presentation/message/view/MediaView;->pause()V

    .line 80
    invoke-static {v4, v7}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_33

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v6, v0}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_33

    const/4 v0, 0x1

    .line 81
    iput-boolean v0, v14, Lcom/discord/chat/presentation/message/view/MediaView;->mediaShouldResume:Z

    goto :goto_24

    .line 82
    :cond_31
    invoke-static {v4, v7}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_32

    invoke-direct/range {p0 .. p0}, Lcom/discord/chat/presentation/message/view/MediaView;->play()V

    goto :goto_24

    .line 83
    :cond_32
    sget-object v0, Lcom/discord/media_player/MediaPlayer$Event$Paused;->INSTANCE:Lcom/discord/media_player/MediaPlayer$Event$Paused;

    invoke-static {v4, v0}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_33

    invoke-direct/range {p0 .. p0}, Lcom/discord/chat/presentation/message/view/MediaView;->pause()V

    :cond_33
    :goto_24
    return-void
.end method

.method public final setOnMediaClickListeners(Lkotlin/jvm/functions/Function1;Landroid/view/View$OnLongClickListener;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Double;",
            "Lkotlin/Unit;",
            ">;",
            "Landroid/view/View$OnLongClickListener;",
            ")V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    new-instance v1, Lcom/discord/chat/presentation/message/view/e0;

    .line 5
    .line 6
    invoke-direct {v1, p0, p1}, Lcom/discord/chat/presentation/message/view/e0;-><init>(Lcom/discord/chat/presentation/message/view/MediaView;Lkotlin/jvm/functions/Function1;)V

    .line 7
    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move-object v1, v0

    .line 11
    :goto_0
    const/4 p1, 0x0

    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-static {p0, p1, v1, v2, v0}, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchUtilsKt;->setOnClickListenerNested$default(Landroid/view/View;ZLandroid/view/View$OnClickListener;ILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p0, p1, p2, v2, v0}, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchUtilsKt;->setOnLongClickListenerNested$default(Landroid/view/View;ZLandroid/view/View$OnLongClickListener;ILjava/lang/Object;)V

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
.end method
