.class public final Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayManagerModule$showOverlay$$inlined$postOrRunOnMainThread$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayManagerModule;->showOverlay(Lcom/facebook/react/bridge/ReadableMap;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "<anonymous>",
        "",
        "run",
        "com/discord/misc/utilities/threading/ThreadUtilsKt$postOrRunOnMainThread$1"
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
.field final synthetic $overlayAssets$inlined:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayAssets;

.field final synthetic this$0:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayManagerModule;


# direct methods
.method public constructor <init>(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayManagerModule;Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayAssets;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayManagerModule$showOverlay$$inlined$postOrRunOnMainThread$1;->this$0:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayManagerModule;

    iput-object p2, p0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayManagerModule$showOverlay$$inlined$postOrRunOnMainThread$1;->$overlayAssets$inlined:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayAssets;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayManagerModule$showOverlay$$inlined$postOrRunOnMainThread$1;->this$0:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayManagerModule;

    invoke-static {v0}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayManagerModule;->access$getMobileVoiceOverlay(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayManagerModule;)Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;

    move-result-object v0

    iget-object v1, p0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayManagerModule$showOverlay$$inlined$postOrRunOnMainThread$1;->$overlayAssets$inlined:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayAssets;

    invoke-virtual {v0, v1}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;->showOverlay$mobile_voice_overlay_release(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayAssets;)V

    return-void
.end method
