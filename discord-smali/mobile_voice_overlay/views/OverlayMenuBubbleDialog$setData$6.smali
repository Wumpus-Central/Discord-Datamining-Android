.class final Lcom/discord/mobile_voice_overlay/views/OverlayMenuBubbleDialog$setData$6;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/mobile_voice_overlay/views/OverlayMenuBubbleDialog;->setData(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
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
.field final synthetic this$0:Lcom/discord/mobile_voice_overlay/views/OverlayMenuBubbleDialog;


# direct methods
.method constructor <init>(Lcom/discord/mobile_voice_overlay/views/OverlayMenuBubbleDialog;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/mobile_voice_overlay/views/OverlayMenuBubbleDialog$setData$6;->this$0:Lcom/discord/mobile_voice_overlay/views/OverlayMenuBubbleDialog;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/discord/mobile_voice_overlay/views/OverlayMenuBubbleDialog$setData$6;->invoke()V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 6

    .line 2
    sget-object v0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;->Companion:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$Companion;

    .line 3
    iget-object v1, p0, Lcom/discord/mobile_voice_overlay/views/OverlayMenuBubbleDialog$setData$6;->this$0:Lcom/discord/mobile_voice_overlay/views/OverlayMenuBubbleDialog;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "context"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "ToggleSelfMute"

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    .line 4
    invoke-static/range {v0 .. v5}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$Companion;->startHeadlessTask$default(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$Companion;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;ILjava/lang/Object;)V

    return-void
.end method
