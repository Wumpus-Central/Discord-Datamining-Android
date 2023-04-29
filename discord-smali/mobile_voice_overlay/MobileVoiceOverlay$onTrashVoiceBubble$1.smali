.class final Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$onTrashVoiceBubble$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;->onTrashVoiceBubble()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/discord/mobile_voice_overlay/views/OverlayVoiceBubble;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "voiceBubble",
        "Lcom/discord/mobile_voice_overlay/views/OverlayVoiceBubble;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;


# direct methods
.method constructor <init>(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$onTrashVoiceBubble$1;->this$0:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/discord/mobile_voice_overlay/views/OverlayVoiceBubble;

    invoke-virtual {p0, p1}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$onTrashVoiceBubble$1;->invoke(Lcom/discord/mobile_voice_overlay/views/OverlayVoiceBubble;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/discord/mobile_voice_overlay/views/OverlayVoiceBubble;)V
    .locals 7

    const-string v0, "voiceBubble"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->moveToAnchorPoint()Landroid/graphics/Point;

    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/discord/mobile_voice_overlay/R$animator;->fade_out:I

    invoke-static {v0, v1}, Landroid/animation/AnimatorInflater;->loadAnimator(Landroid/content/Context;I)Landroid/animation/Animator;

    move-result-object v0

    iget-object v1, p0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$onTrashVoiceBubble$1;->this$0:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;

    .line 4
    invoke-virtual {v0, p1}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V

    const-string v2, "invoke$lambda$2"

    .line 5
    invoke-static {v0, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    new-instance v2, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$onTrashVoiceBubble$1$invoke$lambda$2$$inlined$doOnEnd$1;

    invoke-direct {v2, v1}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$onTrashVoiceBubble$1$invoke$lambda$2$$inlined$doOnEnd$1;-><init>(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;)V

    .line 7
    invoke-virtual {v0, v2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 8
    invoke-virtual {v0}, Landroid/animation/Animator;->start()V

    .line 9
    invoke-virtual {p1}, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->getX()F

    move-result v0

    float-to-int v2, v0

    .line 10
    invoke-virtual {p1}, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->getY()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    add-int v3, v0, v1

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, p1

    .line 11
    invoke-static/range {v1 .. v6}, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->animateToCoordinate$default(Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;IILandroid/graphics/Rect;ILjava/lang/Object;)V

    return-void
.end method
