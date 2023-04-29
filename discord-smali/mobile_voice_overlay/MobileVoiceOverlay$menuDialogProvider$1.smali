.class final Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$menuDialogProvider$1;
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
        "Lcom/discord/mobile_voice_overlay/views/OverlayMenuBubbleDialog;",
        ">;",
        "Lcom/discord/mobile_voice_overlay/views/OverlayMenuBubbleDialog;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "Lcom/discord/mobile_voice_overlay/views/OverlayMenuBubbleDialog;",
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

    iput-object p1, p0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$menuDialogProvider$1;->this$0:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;)Lcom/discord/mobile_voice_overlay/views/OverlayMenuBubbleDialog;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider<",
            "Lcom/discord/mobile_voice_overlay/views/OverlayMenuBubbleDialog;",
            ">;)",
            "Lcom/discord/mobile_voice_overlay/views/OverlayMenuBubbleDialog;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Lcom/discord/mobile_voice_overlay/views/OverlayMenuBubbleDialog;

    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$menuDialogProvider$1;->this$0:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;

    invoke-static {v0}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;->access$getContext$p(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;)Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/discord/mobile_voice_overlay/views/OverlayMenuBubbleDialog;-><init>(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$menuDialogProvider$1;->this$0:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;

    .line 3
    invoke-virtual {p1}, Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;->getInsetMargins()Landroid/graphics/Rect;

    move-result-object v1

    .line 4
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/discord/mobile_voice_overlay/R$dimen;->vertical_safe_margin:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v2

    .line 5
    iput v2, v1, Landroid/graphics/Rect;->top:I

    .line 6
    new-instance v1, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$menuDialogProvider$1$1$1;

    invoke-direct {v1, v0}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$menuDialogProvider$1$1$1;-><init>(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;)V

    invoke-virtual {p1, v1}, Lcom/discord/mobile_voice_overlay/views/OverlayDialog;->setOnDialogClosed(Lkotlin/jvm/functions/Function1;)V

    .line 7
    new-instance v1, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$menuDialogProvider$1$1$2;

    invoke-direct {v1, v0}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$menuDialogProvider$1$1$2;-><init>(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;)V

    invoke-virtual {p1, v1}, Lcom/discord/mobile_voice_overlay/views/OverlayMenuBubbleDialog;->setOnShowSelectorDialog(Lkotlin/jvm/functions/Function0;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;

    invoke-virtual {p0, p1}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$menuDialogProvider$1;->invoke(Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;)Lcom/discord/mobile_voice_overlay/views/OverlayMenuBubbleDialog;

    move-result-object p1

    return-object p1
.end method
