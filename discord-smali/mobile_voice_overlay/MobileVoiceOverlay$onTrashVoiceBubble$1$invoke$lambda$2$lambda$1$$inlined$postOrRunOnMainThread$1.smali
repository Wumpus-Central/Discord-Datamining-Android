.class public final Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$onTrashVoiceBubble$1$invoke$lambda$2$lambda$1$$inlined$postOrRunOnMainThread$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$onTrashVoiceBubble$1;->invoke(Lcom/discord/mobile_voice_overlay/views/OverlayVoiceBubble;)V
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
.field final synthetic this$0:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;


# direct methods
.method public constructor <init>(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$onTrashVoiceBubble$1$invoke$lambda$2$lambda$1$$inlined$postOrRunOnMainThread$1;->this$0:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$onTrashVoiceBubble$1$invoke$lambda$2$lambda$1$$inlined$postOrRunOnMainThread$1;->this$0:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;

    const/4 v1, 0x0

    const/4 v2, 0x2

    const-string v3, "onLayoutTrashed"

    invoke-static {v0, v3, v1, v2, v1}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;->invokeJs$default(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method
