.class final Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$trashWrapProvider$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider<",
        "Lcom/discord/mobile_voice_overlay/views/OverlayTrashWrap;",
        ">;",
        "Lcom/discord/mobile_voice_overlay/views/OverlayTrashWrap;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "Lcom/discord/mobile_voice_overlay/views/OverlayTrashWrap;",
        "it",
        "Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;",
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

    iput-object p1, p0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$trashWrapProvider$1;->this$0:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;)Lcom/discord/mobile_voice_overlay/views/OverlayTrashWrap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider<",
            "Lcom/discord/mobile_voice_overlay/views/OverlayTrashWrap;",
            ">;)",
            "Lcom/discord/mobile_voice_overlay/views/OverlayTrashWrap;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance p1, Lcom/discord/mobile_voice_overlay/views/OverlayTrashWrap;

    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$trashWrapProvider$1;->this$0:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;

    invoke-static {v0}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;->access$getContext$p(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;)Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/discord/mobile_voice_overlay/views/OverlayTrashWrap;-><init>(Landroid/content/Context;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;

    invoke-virtual {p0, p1}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$trashWrapProvider$1;->invoke(Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;)Lcom/discord/mobile_voice_overlay/views/OverlayTrashWrap;

    move-result-object p1

    return-object p1
.end method
