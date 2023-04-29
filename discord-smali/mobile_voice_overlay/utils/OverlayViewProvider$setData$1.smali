.class final Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider$setData$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;->setData(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "TT;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0000\u001a\u00020\u0001\"\u0008\u0008\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "<anonymous>",
        "",
        "T",
        "Lcom/discord/mobile_voice_overlay/views/OverlayView;",
        "view",
        "invoke",
        "(Lcom/discord/mobile_voice_overlay/views/OverlayView;)V"
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


# direct methods
.method constructor <init>(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider$setData$1;->$data:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/discord/mobile_voice_overlay/views/OverlayView;

    invoke-virtual {p0, p1}, Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider$setData$1;->invoke(Lcom/discord/mobile_voice_overlay/views/OverlayView;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/discord/mobile_voice_overlay/views/OverlayView;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider$setData$1;->$data:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;

    invoke-virtual {p1, v0}, Lcom/discord/mobile_voice_overlay/views/OverlayView;->setData(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;)V

    return-void
.end method
