.class final Lcom/discord/mobile_voice_overlay/views/OverlayMenuBubbleDialog$setData$2;
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
.field final synthetic $data:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;

.field final synthetic this$0:Lcom/discord/mobile_voice_overlay/views/OverlayMenuBubbleDialog;


# direct methods
.method constructor <init>(Lcom/discord/mobile_voice_overlay/views/OverlayMenuBubbleDialog;Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/mobile_voice_overlay/views/OverlayMenuBubbleDialog$setData$2;->this$0:Lcom/discord/mobile_voice_overlay/views/OverlayMenuBubbleDialog;

    iput-object p2, p0, Lcom/discord/mobile_voice_overlay/views/OverlayMenuBubbleDialog$setData$2;->$data:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/discord/mobile_voice_overlay/views/OverlayMenuBubbleDialog$setData$2;->invoke()V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 5

    .line 2
    sget-object v0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;->Companion:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$Companion;

    .line 3
    iget-object v1, p0, Lcom/discord/mobile_voice_overlay/views/OverlayMenuBubbleDialog$setData$2;->this$0:Lcom/discord/mobile_voice_overlay/views/OverlayMenuBubbleDialog;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "context"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x1

    new-array v2, v2, [Lkotlin/Pair;

    .line 4
    iget-object v3, p0, Lcom/discord/mobile_voice_overlay/views/OverlayMenuBubbleDialog$setData$2;->$data:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;

    invoke-virtual {v3}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;->getChannelId-o4g7jtM()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    const-string v4, "channelId"

    invoke-static {v4, v3}, Lnf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 5
    invoke-static {v2}, Landroidx/core/os/d;->a([Lkotlin/Pair;)Landroid/os/Bundle;

    move-result-object v2

    const-string v3, "GenerateInvite"

    .line 6
    invoke-virtual {v0, v1, v3, v2}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$Companion;->startHeadlessTask(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 7
    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/views/OverlayMenuBubbleDialog$setData$2;->this$0:Lcom/discord/mobile_voice_overlay/views/OverlayMenuBubbleDialog;

    invoke-virtual {v0}, Lcom/discord/mobile_voice_overlay/views/OverlayView;->getOverlayAssets()Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayAssets;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/discord/mobile_voice_overlay/views/OverlayMenuBubbleDialog$setData$2;->this$0:Lcom/discord/mobile_voice_overlay/views/OverlayMenuBubbleDialog;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayAssets;->getInviteLinkCopied()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :cond_0
    return-void
.end method
