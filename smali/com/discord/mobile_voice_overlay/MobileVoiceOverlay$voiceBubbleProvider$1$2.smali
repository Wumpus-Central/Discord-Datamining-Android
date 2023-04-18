.class final Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$voiceBubbleProvider$1$2;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$voiceBubbleProvider$1;->invoke(Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;)Lcom/discord/mobile_voice_overlay/views/OverlayVoiceBubble;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroid/view/MotionEvent;",
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
        "event",
        "Landroid/view/MotionEvent;",
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
.field final synthetic $voiceBubble:Lcom/discord/mobile_voice_overlay/views/OverlayVoiceBubble;

.field final synthetic this$0:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;


# direct methods
.method constructor <init>(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;Lcom/discord/mobile_voice_overlay/views/OverlayVoiceBubble;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$voiceBubbleProvider$1$2;->this$0:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;

    iput-object p2, p0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$voiceBubbleProvider$1$2;->$voiceBubble:Lcom/discord/mobile_voice_overlay/views/OverlayVoiceBubble;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroid/view/MotionEvent;

    invoke-virtual {p0, p1}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$voiceBubbleProvider$1$2;->invoke(Landroid/view/MotionEvent;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroid/view/MotionEvent;)V
    .locals 4

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$voiceBubbleProvider$1$2;->this$0:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;

    invoke-static {v0}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;->access$getTrashWrapProvider$p(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;)Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;

    move-result-object v0

    new-instance v1, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$voiceBubbleProvider$1$2$1;

    iget-object v2, p0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$voiceBubbleProvider$1$2;->$voiceBubble:Lcom/discord/mobile_voice_overlay/views/OverlayVoiceBubble;

    iget-object v3, p0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$voiceBubbleProvider$1$2;->this$0:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;

    invoke-direct {v1, v2, p1, v3}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$voiceBubbleProvider$1$2$1;-><init>(Lcom/discord/mobile_voice_overlay/views/OverlayVoiceBubble;Landroid/view/MotionEvent;Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;)V

    invoke-virtual {v0, v1}, Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;->withView(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
