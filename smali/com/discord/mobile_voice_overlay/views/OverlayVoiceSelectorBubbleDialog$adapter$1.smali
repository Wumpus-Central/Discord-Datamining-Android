.class final Lcom/discord/mobile_voice_overlay/views/OverlayVoiceSelectorBubbleDialog$adapter$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/mobile_voice_overlay/views/OverlayVoiceSelectorBubbleDialog;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/discord/primitives/ChannelId;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "channelId",
        "Lcom/discord/primitives/ChannelId;",
        "invoke-R7gqayM",
        "(J)V"
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
.field final synthetic this$0:Lcom/discord/mobile_voice_overlay/views/OverlayVoiceSelectorBubbleDialog;


# direct methods
.method constructor <init>(Lcom/discord/mobile_voice_overlay/views/OverlayVoiceSelectorBubbleDialog;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/mobile_voice_overlay/views/OverlayVoiceSelectorBubbleDialog$adapter$1;->this$0:Lcom/discord/mobile_voice_overlay/views/OverlayVoiceSelectorBubbleDialog;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lcom/discord/primitives/ChannelId;

    invoke-virtual {p1}, Lcom/discord/primitives/ChannelId;->unbox-impl()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/discord/mobile_voice_overlay/views/OverlayVoiceSelectorBubbleDialog$adapter$1;->invoke-R7gqayM(J)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke-R7gqayM(J)V
    .locals 1

    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/views/OverlayVoiceSelectorBubbleDialog$adapter$1;->this$0:Lcom/discord/mobile_voice_overlay/views/OverlayVoiceSelectorBubbleDialog;

    invoke-virtual {v0}, Lcom/discord/mobile_voice_overlay/views/OverlayVoiceSelectorBubbleDialog;->getOnChannelSelected()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    invoke-static {p1, p2}, Lcom/discord/primitives/ChannelId;->box-impl(J)Lcom/discord/primitives/ChannelId;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
