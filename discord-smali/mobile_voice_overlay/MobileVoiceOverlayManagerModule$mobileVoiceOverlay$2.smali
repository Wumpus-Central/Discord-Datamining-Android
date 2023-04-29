.class final Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayManagerModule$mobileVoiceOverlay$2;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayManagerModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;",
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
.field final synthetic this$0:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayManagerModule;


# direct methods
.method constructor <init>(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayManagerModule;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayManagerModule$mobileVoiceOverlay$2;->this$0:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayManagerModule;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;
    .locals 3

    .line 2
    new-instance v0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;

    .line 3
    iget-object v1, p0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayManagerModule$mobileVoiceOverlay$2;->this$0:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayManagerModule;

    invoke-static {v1}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayManagerModule;->access$getReactApplicationContext(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayManagerModule;)Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v1

    const-string v2, "reactApplicationContext"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {v0, v1}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayManagerModule$mobileVoiceOverlay$2;->invoke()Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;

    move-result-object v0

    return-object v0
.end method
