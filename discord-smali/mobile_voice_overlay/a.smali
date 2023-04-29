.class public final synthetic Lcom/discord/mobile_voice_overlay/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic k:Lcom/discord/mobile_voice_overlay/views/OverlayVoiceBubble;

.field public final synthetic l:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;


# direct methods
.method public synthetic constructor <init>(Lcom/discord/mobile_voice_overlay/views/OverlayVoiceBubble;Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/mobile_voice_overlay/a;->k:Lcom/discord/mobile_voice_overlay/views/OverlayVoiceBubble;

    iput-object p2, p0, Lcom/discord/mobile_voice_overlay/a;->l:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/a;->k:Lcom/discord/mobile_voice_overlay/views/OverlayVoiceBubble;

    iget-object v1, p0, Lcom/discord/mobile_voice_overlay/a;->l:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;

    invoke-static {v0, v1, p1}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$voiceBubbleProvider$1;->a(Lcom/discord/mobile_voice_overlay/views/OverlayVoiceBubble;Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;Landroid/view/View;)V

    return-void
.end method
