.class public final Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$Companion;,
        Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$Listener;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u000e\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0010\u0012\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\t\u0018\u0000 Z2\u00020\u0001:\u0002Z[B%\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u0010\u0010-\u001a\u00020.2\u0006\u0010)\u001a\u00020*H\u0002J#\u0010/\u001a\u00020.2\n\u0008\u0002\u00100\u001a\u0004\u0018\u00010\u001e2\u0008\u0008\u0002\u00101\u001a\u00020(H\u0002\u00a2\u0006\u0002\u00102J\u0010\u00103\u001a\u00020.2\u0006\u0010)\u001a\u00020*H\u0002J\u0010\u00104\u001a\u00020.2\u0006\u0010)\u001a\u00020*H\u0002J\u001a\u00105\u001a\u00020.2\u0006\u0010)\u001a\u00020*2\u0008\u0008\u0002\u00106\u001a\u00020(H\u0002J\u0008\u00107\u001a\u00020.H\u0002J\u000f\u00108\u001a\u0004\u0018\u00010\u001eH\u0002\u00a2\u0006\u0002\u00109J\u0008\u0010:\u001a\u00020.H\u0002J\u0012\u0010;\u001a\u00020.2\u0008\u0010<\u001a\u0004\u0018\u00010=H\u0002J\u0008\u0010>\u001a\u00020.H\u0002J\u0010\u0010?\u001a\u00020.2\u0006\u0010)\u001a\u00020*H\u0002J\u0010\u0010@\u001a\u00020.2\u0006\u0010A\u001a\u00020(H\u0002J\u000e\u0010B\u001a\u00020.2\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010C\u001a\u00020.2\u0006\u0010D\u001a\u00020EJ%\u0010F\u001a\u00020.2\u0006\u0010G\u001a\u00020H2\u0008\u0010I\u001a\u0004\u0018\u00010=\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008J\u0010KJ\u001c\u0010L\u001a\u00020.2\u0008\u0008\u0002\u0010)\u001a\u00020*2\u0008\u0008\u0002\u0010M\u001a\u00020(H\u0002J-\u0010N\u001a\u00020.2\u0008\u0010O\u001a\u0004\u0018\u00010\u00072\u000c\u0010P\u001a\u0008\u0012\u0004\u0012\u00020.0Q2\u0008\u0010R\u001a\u0004\u0018\u00010S\u00a2\u0006\u0002\u0010TJ\u000e\u0010\'\u001a\u00020.2\u0006\u0010\'\u001a\u00020(J\u0010\u0010U\u001a\u00020.2\u0006\u0010V\u001a\u00020(H\u0002J\u000c\u0010W\u001a\u00020=*\u00020\u0007H\u0002J\u000c\u0010X\u001a\u00020=*\u00020\u0007H\u0002J\u000c\u0010Y\u001a\u00020\u0007*\u00020\u001eH\u0002R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000b\u0010\u000cR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R#\u0010\u0015\u001a\n \u0017*\u0004\u0018\u00010\u00160\u00168BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u000e\u001a\u0004\u0008\u0018\u0010\u0019R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008!\u0010\"\"\u0004\u0008#\u0010$R\u0010\u0010%\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020(X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020(X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020(X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\\"
    }
    d2 = {
        "Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;",
        "Landroid/widget/FrameLayout;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "animatorManager",
        "Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;",
        "getAnimatorManager",
        "()Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;",
        "animatorManager$delegate",
        "Lkotlin/Lazy;",
        "attachStateChangeListener",
        "Lcom/discord/chat/presentation/message/view/media/ViewAttachedListener;",
        "binding",
        "Lcom/discord/chat/databinding/AudioPlayerViewBinding;",
        "getBinding",
        "()Lcom/discord/chat/databinding/AudioPlayerViewBinding;",
        "bounceAnimator",
        "Landroid/view/animation/Animation;",
        "kotlin.jvm.PlatformType",
        "getBounceAnimator",
        "()Landroid/view/animation/Animation;",
        "bounceAnimator$delegate",
        "durationJob",
        "Lkotlinx/coroutines/Job;",
        "durationMs",
        "",
        "listener",
        "Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$Listener;",
        "getListener",
        "()Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$Listener;",
        "setListener",
        "(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$Listener;)V",
        "playerJob",
        "resetJob",
        "shouldAnimate",
        "",
        "state",
        "Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;",
        "uploadFinished",
        "wasPlayingBeforeBeingPaused",
        "configureAudioWave",
        "",
        "configureDuration",
        "overrideDuration",
        "isPlaying",
        "(Ljava/lang/Long;Z)V",
        "configureLoading",
        "configurePlayButton",
        "configurePlayerState",
        "hasSourceChanged",
        "configureProgress",
        "getCurrentPosition",
        "()Ljava/lang/Long;",
        "maybeLogPlaybackEnded",
        "maybeLogPlaybackFailed",
        "errorMessage",
        "",
        "maybeLogPlaybackStarted",
        "prepareAudio",
        "reset",
        "logDuration",
        "setDurationMs",
        "setSampleData",
        "sampleData",
        "",
        "setSourceUrl",
        "messageId",
        "Lcom/discord/primitives/MessageId;",
        "sourceUrl",
        "setSourceUrl-ntcYbpo",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "setState",
        "forceRefresh",
        "setUploadProgress",
        "progress",
        "onCancelUpload",
        "Lkotlin/Function0;",
        "attachmentsOpacity",
        "",
        "(Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;Ljava/lang/Float;)V",
        "toggleDurationEmitter",
        "shouldEmit",
        "timeRemainingAccessibilityText",
        "timeRemainingText",
        "toSeconds",
        "Companion",
        "Listener",
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


# static fields
.field public static final Companion:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$Companion;

.field public static final RESET_DELAY_MS:J = 0x1f4L


# instance fields
.field private final animatorManager$delegate:Lkotlin/Lazy;

.field private final attachStateChangeListener:Lcom/discord/chat/presentation/message/view/media/ViewAttachedListener;

.field private final binding:Lcom/discord/chat/databinding/AudioPlayerViewBinding;

.field private final bounceAnimator$delegate:Lkotlin/Lazy;

.field private durationJob:Lkotlinx/coroutines/Job;

.field private durationMs:J

.field private listener:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$Listener;

.field private playerJob:Lkotlinx/coroutines/Job;

.field private resetJob:Lkotlinx/coroutines/Job;

.field private shouldAnimate:Z

.field private state:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;

.field private uploadFinished:Z

.field private wasPlayingBeforeBeingPaused:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->Companion:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$Companion;

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

    invoke-direct/range {v1 .. v6}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v1 .. v6}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 6

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    invoke-static {p2, p0}, Lcom/discord/chat/databinding/AudioPlayerViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/discord/chat/databinding/AudioPlayerViewBinding;

    move-result-object p2

    const-string p3, "inflate(LayoutInflater.from(context), this)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->binding:Lcom/discord/chat/databinding/AudioPlayerViewBinding;

    .line 4
    new-instance p3, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x7

    const/4 v5, 0x0

    move-object v0, p3

    invoke-direct/range {v0 .. v5}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;-><init>(Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p3, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->state:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;

    const/4 p3, 0x1

    .line 5
    iput-boolean p3, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->shouldAnimate:Z

    .line 6
    new-instance p3, Lcom/discord/chat/presentation/message/view/media/ViewAttachedListener;

    .line 7
    new-instance v2, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$attachStateChangeListener$1;

    invoke-direct {v2, p0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$attachStateChangeListener$1;-><init>(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;)V

    const/4 v3, 0x0

    const/4 v4, 0x4

    move-object v0, p3

    move-object v1, p0

    .line 8
    invoke-direct/range {v0 .. v5}, Lcom/discord/chat/presentation/message/view/media/ViewAttachedListener;-><init>(Landroid/view/View;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p3, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->attachStateChangeListener:Lcom/discord/chat/presentation/message/view/media/ViewAttachedListener;

    .line 9
    new-instance v0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$bounceAnimator$2;

    invoke-direct {v0, p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$bounceAnimator$2;-><init>(Landroid/content/Context;)V

    invoke-static {v0}, Llf/m;->a(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->bounceAnimator$delegate:Lkotlin/Lazy;

    .line 10
    new-instance v0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$animatorManager$2;

    invoke-direct {v0, p1, p0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$animatorManager$2;-><init>(Landroid/content/Context;Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;)V

    invoke-static {v0}, Llf/m;->a(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->animatorManager$delegate:Lkotlin/Lazy;

    .line 11
    invoke-virtual {p0, p3}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 12
    iget-object p1, p2, Lcom/discord/chat/databinding/AudioPlayerViewBinding;->playerContainer:Landroid/widget/LinearLayout;

    const-string p3, "_init_$lambda$0"

    .line 13
    invoke-static {p1, p3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 p3, 0x8

    invoke-static {p3}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    move-result p3

    .line 14
    invoke-virtual {p1, p3, p3, p3, p3}, Landroid/view/View;->setPadding(IIII)V

    .line 15
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object p3

    invoke-virtual {p3}, Lcom/discord/theme/DiscordTheme;->getBackgroundSecondary()I

    move-result p3

    invoke-virtual {p1, p3}, Landroid/view/View;->setBackgroundColor(I)V

    const/16 p3, 0x18

    .line 16
    invoke-static {p3}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    move-result p3

    invoke-static {p1, p3}, Lcom/discord/misc/utilities/view/ViewClippingUtilsKt;->clipToRoundedRectangle(Landroid/view/View;I)V

    const/4 p3, 0x0

    .line 17
    invoke-virtual {p1, p3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 p3, 0x10

    .line 18
    invoke-virtual {p1, p3}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 19
    iget-object p1, p2, Lcom/discord/chat/databinding/AudioPlayerViewBinding;->button:Lcom/facebook/drawee/view/SimpleDraweeView;

    const-string p3, "binding.button"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/discord/misc/utilities/view/ViewClippingUtilsKt;->clipToCircle(Landroid/view/View;)V

    .line 20
    iget-object p1, p2, Lcom/discord/chat/databinding/AudioPlayerViewBinding;->text:Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;

    const-string p3, "_init_$lambda$1"

    .line 21
    invoke-static {p1, p3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 p3, 0x41600000    # 14.0f

    invoke-static {p1, p3}, Lcom/discord/SetTextSizeSpKt;->setTextSizeSp(Landroid/widget/TextView;F)V

    .line 22
    sget-object p3, Lcom/discord/fonts/DiscordFont;->PrimaryMedium:Lcom/discord/fonts/DiscordFont;

    invoke-static {p1, p3}, Lcom/discord/fonts/DiscordFontUtilsKt;->setDiscordFont(Landroid/widget/TextView;Lcom/discord/fonts/DiscordFont;)V

    .line 23
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object p3

    invoke-virtual {p3}, Lcom/discord/theme/DiscordTheme;->getInteractiveNormal()I

    move-result p3

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 24
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object p1

    instance-of p1, p1, Lcom/discord/theme/LightTheme;

    if-eqz p1, :cond_0

    .line 25
    sget p1, Lcom/discord/chat/R$drawable;->drawable_audio_play_button_gradient_light:I

    goto :goto_0

    .line 26
    :cond_0
    sget p1, Lcom/discord/chat/R$drawable;->drawable_audio_play_button_gradient_dark:I

    .line 27
    :goto_0
    iget-object p3, p2, Lcom/discord/chat/databinding/AudioPlayerViewBinding;->buttonContainer:Landroid/view/View;

    invoke-virtual {p3, p1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 28
    iget-object p2, p2, Lcom/discord/chat/databinding/AudioPlayerViewBinding;->wipe:Landroid/view/View;

    invoke-virtual {p2, p1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 29
    new-instance p1, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$3;

    invoke-direct {p1, p0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$3;-><init>(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;)V

    .line 30
    invoke-static {p0, p1}, Landroidx/core/view/w0;->q0(Landroid/view/View;Landroidx/core/view/a;)V

    .line 31
    new-instance p1, Lcom/discord/chat/presentation/message/view/voicemessages/e;

    invoke-direct {p1, p0}, Lcom/discord/chat/presentation/message/view/voicemessages/e;-><init>(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;)V

    invoke-virtual {p0, p1}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

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
    invoke-direct {p0, p1, p2, p3}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private static final _init_$lambda$2(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 1
    const-string p1, "this$0"

    .line 2
    .line 3
    invoke-static {p0, p1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->state:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;

    .line 7
    .line 8
    iget-boolean p2, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->wasPlayingBeforeBeingPaused:Z

    .line 9
    .line 10
    invoke-virtual {p1, p2}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->isPlaying$chat_release(Z)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-direct {p0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->getAnimatorManager()Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    const/4 p2, 0x0

    .line 21
    invoke-virtual {p0, p1, p2}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;->startAnimator(ZZ)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
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

.method public static synthetic a(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;ZLandroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->configurePlayButton$lambda$5(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;ZLandroid/view/View;)V

    return-void
.end method

.method public static final synthetic access$configureAudioWave(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->configureAudioWave(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;)V

    return-void
.end method

.method public static final synthetic access$configureDuration(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;Ljava/lang/Long;Z)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->configureDuration(Ljava/lang/Long;Z)V

    return-void
.end method

.method public static final synthetic access$configurePlayButton(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->configurePlayButton(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;)V

    return-void
.end method

.method public static final synthetic access$configureProgress(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;)V
    .locals 0

    invoke-direct {p0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->configureProgress()V

    return-void
.end method

.method public static final synthetic access$getDurationMs$p(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;)J
    .locals 2

    iget-wide v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->durationMs:J

    return-wide v0
.end method

.method public static final synthetic access$getPlayerJob$p(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;)Lkotlinx/coroutines/Job;
    .locals 0

    iget-object p0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->playerJob:Lkotlinx/coroutines/Job;

    return-object p0
.end method

.method public static final synthetic access$getResetJob$p(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;)Lkotlinx/coroutines/Job;
    .locals 0

    iget-object p0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->resetJob:Lkotlinx/coroutines/Job;

    return-object p0
.end method

.method public static final synthetic access$getState$p(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;)Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;
    .locals 0

    iget-object p0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->state:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;

    return-object p0
.end method

.method public static final synthetic access$getWasPlayingBeforeBeingPaused$p(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->wasPlayingBeforeBeingPaused:Z

    return p0
.end method

.method public static final synthetic access$maybeLogPlaybackEnded(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;)V
    .locals 0

    invoke-direct {p0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->maybeLogPlaybackEnded()V

    return-void
.end method

.method public static final synthetic access$maybeLogPlaybackFailed(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->maybeLogPlaybackFailed(Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$maybeLogPlaybackStarted(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;)V
    .locals 0

    invoke-direct {p0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->maybeLogPlaybackStarted()V

    return-void
.end method

.method public static final synthetic access$setPlayerJob$p(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;Lkotlinx/coroutines/Job;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->playerJob:Lkotlinx/coroutines/Job;

    return-void
.end method

.method public static final synthetic access$setUploadFinished$p(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->uploadFinished:Z

    return-void
.end method

.method public static final synthetic access$setWasPlayingBeforeBeingPaused$p(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->wasPlayingBeforeBeingPaused:Z

    return-void
.end method

.method public static final synthetic access$timeRemainingAccessibilityText(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;I)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->timeRemainingAccessibilityText(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$toggleDurationEmitter(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->toggleDurationEmitter(Z)V

    return-void
.end method

.method public static synthetic b(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;Landroid/view/View;IIIIIIII)V
    .locals 0

    invoke-static/range {p0 .. p9}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->_init_$lambda$2(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;Landroid/view/View;IIIIIIII)V

    return-void
.end method

.method private final configureAudioWave(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->binding:Lcom/discord/chat/databinding/AudioPlayerViewBinding;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/discord/chat/databinding/AudioPlayerViewBinding;->wave:Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView;

    .line 4
    .line 5
    new-instance v1, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$configureAudioWave$1;

    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$configureAudioWave$1;-><init>(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView;->setOnAudioProgressChange(Lkotlin/jvm/functions/Function1;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->binding:Lcom/discord/chat/databinding/AudioPlayerViewBinding;

    .line 14
    .line 15
    iget-object v0, v0, Lcom/discord/chat/databinding/AudioPlayerViewBinding;->wave:Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView;

    .line 16
    .line 17
    iget-boolean v1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->wasPlayingBeforeBeingPaused:Z

    .line 18
    .line 19
    invoke-virtual {p1, v1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->isPlaying$chat_release(Z)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    sget v1, Lcom/discord/chat/R$color;->brand_430:I

    .line 30
    .line 31
    invoke-virtual {p1, v1}, Landroid/content/Context;->getColor(I)I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-virtual {p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->getCurrentProgress$chat_release()Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$CurrentProgress;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p1}, Lcom/discord/theme/DiscordTheme;->getInteractiveMuted()I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {p1}, Lcom/discord/theme/DiscordTheme;->getInteractiveNormal()I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    :goto_0
    invoke-virtual {v0, p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView;->setDefaultPaintColor(I)V

    .line 60
    .line 61
    .line 62
    return-void
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

.method private final configureDuration(Ljava/lang/Long;Z)V
    .locals 5

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    goto :goto_2

    .line 8
    :cond_0
    iget-object p1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->state:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;

    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->getPlayer$chat_release()Lcom/discord/media_player/MediaPlayer;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const/4 v0, 0x0

    .line 15
    if-eqz p1, :cond_3

    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/discord/media_player/MediaPlayer;->durationMs()J

    .line 18
    .line 19
    .line 20
    move-result-wide v1

    .line 21
    const-wide/16 v3, 0x0

    .line 22
    .line 23
    cmp-long v1, v1, v3

    .line 24
    .line 25
    if-lez v1, :cond_1

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const/4 v1, 0x0

    .line 30
    :goto_0
    if-eqz v1, :cond_2

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_2
    move-object p1, v0

    .line 34
    :goto_1
    if-eqz p1, :cond_3

    .line 35
    .line 36
    invoke-virtual {p1}, Lcom/discord/media_player/MediaPlayer;->durationMs()J

    .line 37
    .line 38
    .line 39
    move-result-wide v0

    .line 40
    invoke-virtual {p1}, Lcom/discord/media_player/MediaPlayer;->currentPositionMs()J

    .line 41
    .line 42
    .line 43
    move-result-wide v2

    .line 44
    sub-long/2addr v0, v2

    .line 45
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    :cond_3
    if-eqz v0, :cond_5

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 52
    .line 53
    .line 54
    move-result-wide v0

    .line 55
    :goto_2
    invoke-direct {p0, v0, v1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->toSeconds(J)I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    iget-wide v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->durationMs:J

    .line 60
    .line 61
    invoke-direct {p0, v0, v1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->toSeconds(J)I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    iget-object v1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->binding:Lcom/discord/chat/databinding/AudioPlayerViewBinding;

    .line 66
    .line 67
    iget-object v1, v1, Lcom/discord/chat/databinding/AudioPlayerViewBinding;->playerContainer:Landroid/widget/LinearLayout;

    .line 68
    .line 69
    const-string v2, "context"

    .line 70
    .line 71
    if-eqz p2, :cond_4

    .line 72
    .line 73
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    invoke-static {p2, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    sget-object v2, Lcom/discord/react_strings/I18nMessage;->VOICE_MESSAGES_PLAYING_A11Y_STATUS:Lcom/discord/react_strings/I18nMessage;

    .line 81
    .line 82
    new-instance v3, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$configureDuration$1;

    .line 83
    .line 84
    invoke-direct {v3, p0, v0, p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$configureDuration$1;-><init>(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;II)V

    .line 85
    .line 86
    .line 87
    invoke-static {p2, v2, v3}, Lcom/discord/react_strings/I18nUtilsKt;->i18nFormat(Landroid/content/Context;Lcom/discord/react_strings/I18nMessage;Lkotlin/jvm/functions/Function1;)Ljava/lang/CharSequence;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    goto :goto_3

    .line 92
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    invoke-static {p2, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    sget-object v2, Lcom/discord/react_strings/I18nMessage;->VOICE_MESSAGES_A11Y_STATUS:Lcom/discord/react_strings/I18nMessage;

    .line 100
    .line 101
    new-instance v3, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$configureDuration$2;

    .line 102
    .line 103
    invoke-direct {v3, p0, v0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$configureDuration$2;-><init>(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;I)V

    .line 104
    .line 105
    .line 106
    invoke-static {p2, v2, v3}, Lcom/discord/react_strings/I18nUtilsKt;->i18nFormat(Landroid/content/Context;Lcom/discord/react_strings/I18nMessage;Lkotlin/jvm/functions/Function1;)Ljava/lang/CharSequence;

    .line 107
    .line 108
    .line 109
    move-result-object p2

    .line 110
    :goto_3
    invoke-virtual {v1, p2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 111
    .line 112
    .line 113
    iget-object p2, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->binding:Lcom/discord/chat/databinding/AudioPlayerViewBinding;

    .line 114
    .line 115
    iget-object p2, p2, Lcom/discord/chat/databinding/AudioPlayerViewBinding;->text:Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;

    .line 116
    .line 117
    invoke-direct {p0, p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->timeRemainingText(I)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    new-instance v0, Ljava/lang/StringBuilder;

    .line 122
    .line 123
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 124
    .line 125
    .line 126
    const-string v1, "  "

    .line 127
    .line 128
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 142
    .line 143
    .line 144
    :cond_5
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
.end method

.method static synthetic configureDuration$default(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;Ljava/lang/Long;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const/4 p2, 0x1

    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->configureDuration(Ljava/lang/Long;Z)V

    return-void
.end method

.method private final configureLoading(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->binding:Lcom/discord/chat/databinding/AudioPlayerViewBinding;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/discord/chat/databinding/AudioPlayerViewBinding;->progress:Landroid/widget/ProgressBar;

    .line 4
    .line 5
    const-string v1, "binding.progress"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->getMediaState$chat_release()Lcom/discord/media_player/MediaPlayer$Event;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    sget-object v2, Lcom/discord/media_player/MediaPlayer$Event$BufferStart;->INSTANCE:Lcom/discord/media_player/MediaPlayer$Event$BufferStart;

    .line 15
    .line 16
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v2, 0x0

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->getPlayer$chat_release()Lcom/discord/media_player/MediaPlayer;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const/4 v1, 0x1

    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/discord/media_player/MediaPlayer;->shouldPlay()Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-ne p1, v1, :cond_0

    .line 35
    .line 36
    move p1, v1

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move p1, v2

    .line 39
    :goto_0
    if-eqz p1, :cond_1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    move v1, v2

    .line 43
    :goto_1
    if-eqz v1, :cond_2

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_2
    const/16 v2, 0x8

    .line 47
    .line 48
    :goto_2
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 49
    .line 50
    .line 51
    return-void
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

.method private final configurePlayButton(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->wasPlayingBeforeBeingPaused:Z

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->isPlaying$chat_release(Z)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->binding:Lcom/discord/chat/databinding/AudioPlayerViewBinding;

    .line 8
    .line 9
    iget-object v1, v1, Lcom/discord/chat/databinding/AudioPlayerViewBinding;->button:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 10
    .line 11
    const-string v2, "binding.button"

    .line 12
    .line 13
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    sget-object v2, Lcom/discord/react_asset_fetcher/ReactAsset;->Pause:Lcom/discord/react_asset_fetcher/ReactAsset;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    sget-object v2, Lcom/discord/react_asset_fetcher/ReactAsset;->Play:Lcom/discord/react_asset_fetcher/ReactAsset;

    .line 22
    .line 23
    :goto_0
    invoke-static {v1, v2}, Lcom/discord/react_asset_fetcher/ReactAssetUtilsKt;->setReactAsset(Lcom/facebook/drawee/view/SimpleDraweeView;Lcom/discord/react_asset_fetcher/ReactAsset;)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->binding:Lcom/discord/chat/databinding/AudioPlayerViewBinding;

    .line 27
    .line 28
    iget-object v1, v1, Lcom/discord/chat/databinding/AudioPlayerViewBinding;->button:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    move v3, v2

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    const/4 v3, 0x2

    .line 36
    :goto_1
    invoke-virtual {v1, v3, v2, v2, v2}, Landroid/view/View;->setPadding(IIII)V

    .line 37
    .line 38
    .line 39
    invoke-direct {p0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->getAnimatorManager()Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    iget-boolean v3, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->shouldAnimate:Z

    .line 44
    .line 45
    invoke-virtual {v1, v0, v3}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;->startAnimator(ZZ)V

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->binding:Lcom/discord/chat/databinding/AudioPlayerViewBinding;

    .line 49
    .line 50
    iget-object v1, v1, Lcom/discord/chat/databinding/AudioPlayerViewBinding;->playerContainer:Landroid/widget/LinearLayout;

    .line 51
    .line 52
    const-string v3, "binding.playerContainer"

    .line 53
    .line 54
    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->getSourceUrl()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    const/4 v4, 0x0

    .line 62
    if-eqz v3, :cond_2

    .line 63
    .line 64
    new-instance v3, Lcom/discord/chat/presentation/message/view/voicemessages/f;

    .line 65
    .line 66
    invoke-direct {v3, p0, p1, v0}, Lcom/discord/chat/presentation/message/view/voicemessages/f;-><init>(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;Z)V

    .line 67
    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_2
    move-object v3, v4

    .line 71
    :goto_2
    const/4 p1, 0x1

    .line 72
    invoke-static {v1, v2, v3, p1, v4}, Lcom/discord/react_gesture_handler/nested_touch/NestedScrollOnTouchUtilsKt;->setOnClickListenerNested$default(Landroid/view/View;ZLandroid/view/View$OnClickListener;ILjava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    return-void
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

.method private static final configurePlayButton$lambda$5(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;ZLandroid/view/View;)V
    .locals 1

    .line 1
    const-string p3, "this$0"

    .line 2
    .line 3
    invoke-static {p0, p3}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p3, "$state"

    .line 7
    .line 8
    invoke-static {p1, p3}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p3, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->binding:Lcom/discord/chat/databinding/AudioPlayerViewBinding;

    .line 12
    .line 13
    iget-object p3, p3, Lcom/discord/chat/databinding/AudioPlayerViewBinding;->buttonContainer:Landroid/view/View;

    .line 14
    .line 15
    invoke-direct {p0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->getBounceAnimator()Landroid/view/animation/Animation;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p3, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->getPlayer$chat_release()Lcom/discord/media_player/MediaPlayer;

    .line 23
    .line 24
    .line 25
    move-result-object p3

    .line 26
    if-nez p3, :cond_0

    .line 27
    .line 28
    invoke-direct {p0, p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->prepareAudio(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    if-nez p2, :cond_1

    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->play$chat_release()V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    invoke-virtual {p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->pause$chat_release()V

    .line 39
    .line 40
    .line 41
    :goto_0
    return-void
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

.method private final configurePlayerState(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;Z)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->getMediaState$chat_release()Lcom/discord/media_player/MediaPlayer$Event;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/discord/media_player/MediaPlayer$Event$PlaybackEnded;->INSTANCE:Lcom/discord/media_player/MediaPlayer$Event$PlaybackEnded;

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x1

    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    sget-object p2, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->INSTANCE:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;

    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->getAudioSource()Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-virtual {p2, v3}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->hasCurrentPlayer(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;)Z

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    if-eqz p2, :cond_1

    .line 26
    .line 27
    :cond_0
    if-eqz v0, :cond_2

    .line 28
    .line 29
    :cond_1
    move p2, v2

    .line 30
    goto :goto_0

    .line 31
    :cond_2
    move p2, v1

    .line 32
    :goto_0
    if-eqz p2, :cond_3

    .line 33
    .line 34
    xor-int/lit8 p1, v0, 0x1

    .line 35
    .line 36
    invoke-direct {p0, p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->reset(Z)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->hasWindowFocus()Z

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    xor-int/2addr p2, v2

    .line 45
    invoke-virtual {p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->getMediaState$chat_release()Lcom/discord/media_player/MediaPlayer$Event;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    sget-object v3, Lcom/discord/media_player/MediaPlayer$Event$StartedPlaying;->INSTANCE:Lcom/discord/media_player/MediaPlayer$Event$StartedPlaying;

    .line 50
    .line 51
    invoke-static {v0, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_4

    .line 56
    .line 57
    if-nez p2, :cond_4

    .line 58
    .line 59
    invoke-virtual {p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->getAttached()Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-eqz p1, :cond_4

    .line 64
    .line 65
    move v1, v2

    .line 66
    :cond_4
    invoke-virtual {p0, v1}, Landroid/view/View;->setKeepScreenOn(Z)V

    .line 67
    .line 68
    .line 69
    return-void
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

.method static synthetic configurePlayerState$default(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->configurePlayerState(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;Z)V

    return-void
.end method

.method private final configureProgress()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->binding:Lcom/discord/chat/databinding/AudioPlayerViewBinding;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/discord/chat/databinding/AudioPlayerViewBinding;->wave:Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->state:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;

    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->getPlayer$chat_release()Lcom/discord/media_player/MediaPlayer;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v1}, Lcom/discord/media_player/MediaPlayer;->currentPositionPercentage()F

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object v1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->state:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;

    .line 19
    .line 20
    invoke-virtual {v1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->getCurrentProgress$chat_release()Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$CurrentProgress;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    invoke-virtual {v1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$CurrentProgress;->getCurrentProgressPercentage()F

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 v1, 0x0

    .line 32
    :goto_0
    const/4 v2, 0x1

    .line 33
    invoke-virtual {v0, v1, v2}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView;->setAudioProgress(FZ)V

    .line 34
    .line 35
    .line 36
    return-void
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

.method private final getAnimatorManager()Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->animatorManager$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;

    return-object v0
.end method

.method private final getBounceAnimator()Landroid/view/animation/Animation;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->bounceAnimator$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/animation/Animation;

    return-object v0
.end method

.method private final getCurrentPosition()Ljava/lang/Long;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->state:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->getPlayer$chat_release()Lcom/discord/media_player/MediaPlayer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/discord/media_player/MediaPlayer;->currentPositionMs()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->state:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;

    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->getCurrentProgress$chat_release()Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$CurrentProgress;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$CurrentProgress;->getCurrentProgress()J

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 v0, 0x0

    .line 36
    :goto_0
    return-object v0
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

.method private final maybeLogPlaybackEnded()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->getCurrentPosition()Ljava/lang/Long;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    iget-object v2, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->listener:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$Listener;

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    sget-object v3, Lqi/a;->l:Lqi/a$a;

    .line 16
    .line 17
    sget-object v3, Lqi/d;->n:Lqi/d;

    .line 18
    .line 19
    invoke-static {v0, v1, v3}, Lqi/c;->t(JLqi/d;)J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    sget-object v3, Lqi/d;->o:Lqi/d;

    .line 24
    .line 25
    invoke-static {v0, v1, v3}, Lqi/a;->F(JLqi/d;)D

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    double-to-float v0, v0

    .line 30
    invoke-interface {v2, v0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$Listener;->voiceMessagePlaybackEnded(F)V

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void
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

.method private final maybeLogPlaybackFailed(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->listener:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$Listener;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$Listener;->voiceMessagePlaybackFailed(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private final maybeLogPlaybackStarted()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->getCurrentPosition()Ljava/lang/Long;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    iget-object v2, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->listener:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$Listener;

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    sget-object v3, Lqi/a;->l:Lqi/a$a;

    .line 16
    .line 17
    sget-object v3, Lqi/d;->n:Lqi/d;

    .line 18
    .line 19
    invoke-static {v0, v1, v3}, Lqi/c;->t(JLqi/d;)J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    sget-object v3, Lqi/d;->o:Lqi/d;

    .line 24
    .line 25
    invoke-static {v0, v1, v3}, Lqi/a;->F(JLqi/d;)D

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    double-to-float v0, v0

    .line 30
    invoke-interface {v2, v0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$Listener;->voiceMessagePlaybackStarted(F)V

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void
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

.method private final prepareAudio(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->getAudioSource()Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;

    .line 2
    .line 3
    .line 4
    move-result-object v2

    .line 5
    if-nez v2, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    sget-object v0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->INSTANCE:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const-string p1, "context"

    .line 15
    .line 16
    invoke-static {v1, p1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget-wide v3, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->durationMs:J

    .line 20
    .line 21
    new-instance v5, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$prepareAudio$1;

    .line 22
    .line 23
    invoke-direct {v5, p0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$prepareAudio$1;-><init>(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual/range {v0 .. v5}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->setupPlayer(Landroid/content/Context;Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;JLkotlin/jvm/functions/Function1;)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->binding:Lcom/discord/chat/databinding/AudioPlayerViewBinding;

    .line 30
    .line 31
    iget-object p1, p1, Lcom/discord/chat/databinding/AudioPlayerViewBinding;->wave:Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView;

    .line 32
    .line 33
    const/4 v0, 0x1

    .line 34
    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 35
    .line 36
    .line 37
    return-void
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

.method private final reset(Z)V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->toggleDurationEmitter(Z)V

    .line 3
    .line 4
    .line 5
    iget-object v1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->state:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;

    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->getPlayer$chat_release()Lcom/discord/media_player/MediaPlayer;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v1}, Lcom/discord/media_player/MediaPlayer;->shouldPlay()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x1

    .line 18
    if-ne v1, v2, :cond_0

    .line 19
    .line 20
    move v0, v2

    .line 21
    :cond_0
    iput-boolean v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->wasPlayingBeforeBeingPaused:Z

    .line 22
    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    iget-object p1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->state:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;

    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->storeDuration$chat_release()V

    .line 28
    .line 29
    .line 30
    :cond_1
    iget-object p1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->state:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;

    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->releasePlayer$chat_release()V

    .line 33
    .line 34
    .line 35
    invoke-static {p0}, Lcom/discord/misc/utilities/coroutines/CoroutineViewUtilsKt;->getAttachedScope(Landroid/view/View;)Lcom/discord/misc/utilities/coroutines/AttachedViewCoroutineScope;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const/4 v1, 0x0

    .line 40
    const/4 v2, 0x0

    .line 41
    new-instance v3, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$reset$1;

    .line 42
    .line 43
    const/4 p1, 0x0

    .line 44
    invoke-direct {v3, p0, p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$reset$1;-><init>(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;Lkotlin/coroutines/Continuation;)V

    .line 45
    .line 46
    .line 47
    const/4 v4, 0x3

    .line 48
    const/4 v5, 0x0

    .line 49
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/j;->d(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/l0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iput-object v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->resetJob:Lkotlinx/coroutines/Job;

    .line 54
    .line 55
    invoke-static {p0}, Lcom/discord/misc/utilities/coroutines/CoroutineViewUtilsKt;->getAttachedScope(Landroid/view/View;)Lcom/discord/misc/utilities/coroutines/AttachedViewCoroutineScope;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    const/4 v3, 0x0

    .line 60
    new-instance v4, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$reset$2;

    .line 61
    .line 62
    invoke-direct {v4, p0, p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$reset$2;-><init>(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;Lkotlin/coroutines/Continuation;)V

    .line 63
    .line 64
    .line 65
    const/4 v5, 0x3

    .line 66
    const/4 v6, 0x0

    .line 67
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/j;->d(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/l0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 68
    .line 69
    .line 70
    return-void
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

.method private final declared-synchronized setState(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;Z)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    :try_start_0
    iget-object p2, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->state:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;

    .line 5
    .line 6
    invoke-static {p2, p1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    monitor-exit p0

    .line 13
    return-void

    .line 14
    :cond_0
    :try_start_1
    invoke-virtual {p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->getSourceUrl()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->state:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;

    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->getSourceUrl()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    xor-int/lit8 p2, p2, 0x1

    .line 29
    .line 30
    if-eqz p2, :cond_1

    .line 31
    .line 32
    sget-object v0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->INSTANCE:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;

    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->getAudioSource()Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v0, v1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->hasCurrentPlayer(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    invoke-direct {p0, p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->prepareAudio(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;)V

    .line 45
    .line 46
    .line 47
    :cond_1
    iput-object p1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->state:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;

    .line 48
    .line 49
    invoke-direct {p0, p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->configurePlayButton(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;)V

    .line 50
    .line 51
    .line 52
    invoke-direct {p0, p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->configureLoading(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;)V

    .line 53
    .line 54
    .line 55
    invoke-direct {p0, p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->configureAudioWave(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->shouldEmitDuration$chat_release()Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    invoke-direct {p0, v0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->toggleDurationEmitter(Z)V

    .line 63
    .line 64
    .line 65
    invoke-direct {p0, p1, p2}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->configurePlayerState(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 66
    .line 67
    .line 68
    monitor-exit p0

    .line 69
    return-void

    .line 70
    :catchall_0
    move-exception p1

    .line 71
    monitor-exit p0

    .line 72
    throw p1
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

.method static synthetic setState$default(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->state:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const/4 p2, 0x0

    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->setState(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;Z)V

    return-void
.end method

.method private final timeRemainingAccessibilityText(I)Ljava/lang/String;
    .locals 1

    .line 1
    const/16 v0, 0x3c

    .line 2
    .line 3
    if-lt p1, v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->timeRemainingText(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    :goto_0
    return-object p1
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

.method private final timeRemainingText(I)Ljava/lang/String;
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v1, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    div-int/lit8 v2, p1, 0x3c

    .line 5
    .line 6
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    const/4 v3, 0x0

    .line 11
    aput-object v2, v1, v3

    .line 12
    .line 13
    rem-int/lit8 p1, p1, 0x3c

    .line 14
    .line 15
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const/4 v2, 0x1

    .line 20
    aput-object p1, v1, v2

    .line 21
    .line 22
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const-string v0, "%01d:%02d"

    .line 27
    .line 28
    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const-string v0, "format(this, *args)"

    .line 33
    .line 34
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-object p1
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

.method private final toSeconds(J)I
    .locals 1

    .line 1
    sget-object v0, Lqi/a;->l:Lqi/a$a;

    .line 2
    .line 3
    sget-object v0, Lqi/d;->n:Lqi/d;

    .line 4
    .line 5
    invoke-static {p1, p2, v0}, Lqi/c;->t(JLqi/d;)J

    .line 6
    .line 7
    .line 8
    move-result-wide p1

    .line 9
    sget-object v0, Lqi/d;->o:Lqi/d;

    .line 10
    .line 11
    invoke-static {p1, p2, v0}, Lqi/a;->F(JLqi/d;)D

    .line 12
    .line 13
    .line 14
    move-result-wide p1

    .line 15
    invoke-static {p1, p2}, Ljava/lang/Math;->ceil(D)D

    .line 16
    .line 17
    .line 18
    move-result-wide p1

    .line 19
    double-to-int p1, p1

    .line 20
    return p1
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

.method private final toggleDurationEmitter(Z)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->durationJob:Lkotlinx/coroutines/Job;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/Job$a;->a(Lkotlinx/coroutines/Job;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 11
    .line 12
    :cond_0
    iput-object v1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->durationJob:Lkotlinx/coroutines/Job;

    .line 13
    .line 14
    if-nez p1, :cond_1

    .line 15
    .line 16
    return-void

    .line 17
    :cond_1
    invoke-static {p0}, Lcom/discord/misc/utilities/coroutines/CoroutineViewUtilsKt;->getAttachedScope(Landroid/view/View;)Lcom/discord/misc/utilities/coroutines/AttachedViewCoroutineScope;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    const/4 v3, 0x0

    .line 22
    const/4 v4, 0x0

    .line 23
    new-instance v5, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$toggleDurationEmitter$2;

    .line 24
    .line 25
    invoke-direct {v5, p0, v1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$toggleDurationEmitter$2;-><init>(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;Lkotlin/coroutines/Continuation;)V

    .line 26
    .line 27
    .line 28
    const/4 v6, 0x3

    .line 29
    const/4 v7, 0x0

    .line 30
    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/j;->d(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/l0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iput-object p1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->durationJob:Lkotlinx/coroutines/Job;

    .line 35
    .line 36
    return-void
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


# virtual methods
.method public final getBinding()Lcom/discord/chat/databinding/AudioPlayerViewBinding;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->binding:Lcom/discord/chat/databinding/AudioPlayerViewBinding;

    return-object v0
.end method

.method public final getListener()Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$Listener;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->listener:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$Listener;

    return-object v0
.end method

.method public final setDurationMs(J)V
    .locals 7

    .line 1
    iput-wide p1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->durationMs:J

    .line 2
    .line 3
    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->state:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->getCurrentProgress$chat_release()Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$CurrentProgress;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$CurrentProgress;->getCurrentProgress()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const-wide/16 v0, 0x0

    .line 17
    .line 18
    :goto_0
    iget-object v2, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->binding:Lcom/discord/chat/databinding/AudioPlayerViewBinding;

    .line 19
    .line 20
    iget-object v2, v2, Lcom/discord/chat/databinding/AudioPlayerViewBinding;->wave:Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView;

    .line 21
    .line 22
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v2, v3}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView;->setDuration(Ljava/lang/Long;)V

    .line 27
    .line 28
    .line 29
    const-string v3, "setDurationMs$lambda$3"

    .line 30
    .line 31
    invoke-static {v2, v3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    long-to-float v3, v0

    .line 35
    long-to-float v4, p1

    .line 36
    div-float/2addr v3, v4

    .line 37
    const/4 v4, 0x2

    .line 38
    const/4 v5, 0x0

    .line 39
    const/4 v6, 0x0

    .line 40
    invoke-static {v2, v3, v6, v4, v5}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView;->setAudioProgress$default(Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView;FZILjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iget-object v3, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->state:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;

    .line 44
    .line 45
    invoke-virtual {v3}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->getCurrentProgress$chat_release()Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$CurrentProgress;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    if-eqz v3, :cond_1

    .line 50
    .line 51
    const/4 v3, 0x1

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    move v3, v6

    .line 54
    :goto_1
    invoke-virtual {v2, v3}, Landroid/view/View;->setEnabled(Z)V

    .line 55
    .line 56
    .line 57
    sub-long/2addr p1, v0

    .line 58
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-direct {p0, p1, v6}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->configureDuration(Ljava/lang/Long;Z)V

    .line 63
    .line 64
    .line 65
    return-void
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

.method public final setListener(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$Listener;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->listener:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$Listener;

    return-void
.end method

.method public final setSampleData([B)V
    .locals 1

    .line 1
    const-string v0, "sampleData"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->binding:Lcom/discord/chat/databinding/AudioPlayerViewBinding;

    .line 7
    .line 8
    iget-object v0, v0, Lcom/discord/chat/databinding/AudioPlayerViewBinding;->wave:Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView;->setOriginalSampleData([B)V

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

.method public final setSourceUrl-ntcYbpo(Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    .line 1
    const-string v0, "messageId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->binding:Lcom/discord/chat/databinding/AudioPlayerViewBinding;

    .line 7
    .line 8
    iget-object v0, v0, Lcom/discord/chat/databinding/AudioPlayerViewBinding;->wave:Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->state:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;->getSourceUrl()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    if-nez p2, :cond_1

    .line 28
    .line 29
    invoke-direct {p0, v1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->reset(Z)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    new-instance v0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;

    .line 34
    .line 35
    const/4 v5, 0x0

    .line 36
    const/4 v6, 0x4

    .line 37
    const/4 v7, 0x0

    .line 38
    move-object v2, v0

    .line 39
    move-object v3, p1

    .line 40
    move-object v4, p2

    .line 41
    invoke-direct/range {v2 .. v7}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;-><init>(Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 42
    .line 43
    .line 44
    const/4 p1, 0x1

    .line 45
    invoke-direct {p0, v0, p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->setState(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;Z)V

    .line 46
    .line 47
    .line 48
    :goto_0
    return-void
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

.method public final setUploadProgress(Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;Ljava/lang/Float;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/lang/Float;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "onCancelUpload"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v1, v0

    .line 12
    :goto_0
    iget-object v2, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->binding:Lcom/discord/chat/databinding/AudioPlayerViewBinding;

    .line 13
    .line 14
    invoke-virtual {v2}, Lcom/discord/chat/databinding/AudioPlayerViewBinding;->getRoot()Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    if-eqz p3, :cond_1

    .line 19
    .line 20
    invoke-virtual {p3}, Ljava/lang/Float;->floatValue()F

    .line 21
    .line 22
    .line 23
    move-result p3

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    const/high16 p3, 0x3f800000    # 1.0f

    .line 26
    .line 27
    :goto_1
    invoke-virtual {v2, p3}, Landroid/view/View;->setAlpha(F)V

    .line 28
    .line 29
    .line 30
    iget-object p3, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->binding:Lcom/discord/chat/databinding/AudioPlayerViewBinding;

    .line 31
    .line 32
    iget-object v2, p3, Lcom/discord/chat/databinding/AudioPlayerViewBinding;->uploadOverlay:Lcom/discord/chat/presentation/message/view/AttachmentUploadOverlayView;

    .line 33
    .line 34
    const/16 p3, 0x20

    .line 35
    .line 36
    invoke-static {p3}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    new-instance v4, Landroid/graphics/drawable/ShapeDrawable;

    .line 45
    .line 46
    invoke-direct {v4}, Landroid/graphics/drawable/ShapeDrawable;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v4}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    const-string v7, "context"

    .line 58
    .line 59
    invoke-static {v6, v7}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const v7, 0x106000d

    .line 63
    .line 64
    .line 65
    invoke-static {v6, v7}, Lcom/discord/theme/utils/ColorUtilsKt;->getColorCompat(Landroid/content/Context;I)I

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setColor(I)V

    .line 70
    .line 71
    .line 72
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 73
    .line 74
    const/16 v5, 0x10

    .line 75
    .line 76
    invoke-static {v5}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    .line 85
    .line 86
    .line 87
    move-result-object v6

    .line 88
    invoke-virtual {v6}, Lcom/discord/theme/DiscordTheme;->getInteractiveNormal()I

    .line 89
    .line 90
    .line 91
    move-result v6

    .line 92
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    const/16 v7, 0x1d

    .line 97
    .line 98
    invoke-static {v7}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    .line 99
    .line 100
    .line 101
    move-result v7

    .line 102
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 103
    .line 104
    .line 105
    move-result-object v7

    .line 106
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    .line 107
    .line 108
    .line 109
    move-result-object v8

    .line 110
    invoke-virtual {v8}, Lcom/discord/theme/DiscordTheme;->getBackgroundModifierAccent()I

    .line 111
    .line 112
    .line 113
    move-result v8

    .line 114
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 115
    .line 116
    .line 117
    move-result-object v8

    .line 118
    invoke-virtual/range {v2 .. v8}, Lcom/discord/chat/presentation/message/view/AttachmentUploadOverlayView;->configureProgressView(Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 119
    .line 120
    .line 121
    iget-object v2, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->binding:Lcom/discord/chat/databinding/AudioPlayerViewBinding;

    .line 122
    .line 123
    iget-object v2, v2, Lcom/discord/chat/databinding/AudioPlayerViewBinding;->uploadOverlay:Lcom/discord/chat/presentation/message/view/AttachmentUploadOverlayView;

    .line 124
    .line 125
    invoke-static {p3}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    .line 126
    .line 127
    .line 128
    move-result p3

    .line 129
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 130
    .line 131
    .line 132
    move-result-object p3

    .line 133
    const/16 v3, 0x13

    .line 134
    .line 135
    invoke-static {v3}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    .line 136
    .line 137
    .line 138
    move-result v3

    .line 139
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    invoke-virtual {v2, p3, v3}, Lcom/discord/chat/presentation/message/view/AttachmentUploadOverlayView;->configureCompleteView(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 144
    .line 145
    .line 146
    if-eqz v1, :cond_2

    .line 147
    .line 148
    iget-boolean p3, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->uploadFinished:Z

    .line 149
    .line 150
    if-nez p3, :cond_2

    .line 151
    .line 152
    iget-object p3, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->binding:Lcom/discord/chat/databinding/AudioPlayerViewBinding;

    .line 153
    .line 154
    iget-object p3, p3, Lcom/discord/chat/databinding/AudioPlayerViewBinding;->uploadOverlayBackground:Landroid/widget/LinearLayout;

    .line 155
    .line 156
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-virtual {v1}, Lcom/discord/theme/DiscordTheme;->getBackgroundSecondary()I

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    invoke-virtual {p3, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 165
    .line 166
    .line 167
    iget-object p3, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->binding:Lcom/discord/chat/databinding/AudioPlayerViewBinding;

    .line 168
    .line 169
    iget-object p3, p3, Lcom/discord/chat/databinding/AudioPlayerViewBinding;->uploadOverlayBackground:Landroid/widget/LinearLayout;

    .line 170
    .line 171
    const-string v1, "binding.uploadOverlayBackground"

    .line 172
    .line 173
    invoke-static {p3, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {p3, v0}, Landroid/view/View;->setVisibility(I)V

    .line 177
    .line 178
    .line 179
    :cond_2
    new-instance p3, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$setUploadProgress$hideOverlayBackground$1;

    .line 180
    .line 181
    invoke-direct {p3, p0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView$setUploadProgress$hideOverlayBackground$1;-><init>(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;)V

    .line 182
    .line 183
    .line 184
    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->binding:Lcom/discord/chat/databinding/AudioPlayerViewBinding;

    .line 185
    .line 186
    iget-object v0, v0, Lcom/discord/chat/databinding/AudioPlayerViewBinding;->uploadOverlay:Lcom/discord/chat/presentation/message/view/AttachmentUploadOverlayView;

    .line 187
    .line 188
    const-string v1, "binding.uploadOverlay"

    .line 189
    .line 190
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    const/4 v1, 0x2

    .line 194
    const/4 v2, 0x0

    .line 195
    invoke-static {v0, p1, v2, v1, v2}, Lcom/discord/chat/presentation/message/view/AttachmentUploadOverlayView;->setProgress$default(Lcom/discord/chat/presentation/message/view/AttachmentUploadOverlayView;Ljava/lang/Integer;Lcom/discord/chat/presentation/message/view/UploadContext;ILjava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    iget-object p1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->binding:Lcom/discord/chat/databinding/AudioPlayerViewBinding;

    .line 199
    .line 200
    iget-object p1, p1, Lcom/discord/chat/databinding/AudioPlayerViewBinding;->uploadOverlay:Lcom/discord/chat/presentation/message/view/AttachmentUploadOverlayView;

    .line 201
    .line 202
    invoke-virtual {p1, p2}, Lcom/discord/chat/presentation/message/view/AttachmentUploadOverlayView;->setUploadCancel(Lkotlin/jvm/functions/Function0;)V

    .line 203
    .line 204
    .line 205
    iget-object p1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->binding:Lcom/discord/chat/databinding/AudioPlayerViewBinding;

    .line 206
    .line 207
    iget-object p1, p1, Lcom/discord/chat/databinding/AudioPlayerViewBinding;->uploadOverlay:Lcom/discord/chat/presentation/message/view/AttachmentUploadOverlayView;

    .line 208
    .line 209
    invoke-virtual {p1, p3}, Lcom/discord/chat/presentation/message/view/AttachmentUploadOverlayView;->setOnProgressAnimationComplete(Lkotlin/jvm/functions/Function0;)V

    .line 210
    .line 211
    .line 212
    return-void
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

.method public final shouldAnimate(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->shouldAnimate:Z

    .line 2
    .line 3
    iget-object v0, p0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;->binding:Lcom/discord/chat/databinding/AudioPlayerViewBinding;

    .line 4
    .line 5
    iget-object v0, v0, Lcom/discord/chat/databinding/AudioPlayerViewBinding;->wave:Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView;->setShouldAnimate(Z)V

    .line 8
    .line 9
    .line 10
    return-void
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
