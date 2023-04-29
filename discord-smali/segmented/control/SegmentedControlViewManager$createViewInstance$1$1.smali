.class final Lcom/discord/segmented/control/SegmentedControlViewManager$createViewInstance$1$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/segmented/control/SegmentedControlViewManager;->createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/discord/segmented/control/SegmentedControlView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function2<",
        "Ljava/lang/Integer;",
        "Ljava/lang/String;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n\u00a2\u0006\u0002\u0008\u0006"
    }
    d2 = {
        "<anonymous>",
        "",
        "index",
        "",
        "label",
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
.field final synthetic $this_apply:Lcom/discord/segmented/control/SegmentedControlView;

.field final synthetic this$0:Lcom/discord/segmented/control/SegmentedControlViewManager;


# direct methods
.method constructor <init>(Lcom/discord/segmented/control/SegmentedControlViewManager;Lcom/discord/segmented/control/SegmentedControlView;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/segmented/control/SegmentedControlViewManager$createViewInstance$1$1;->this$0:Lcom/discord/segmented/control/SegmentedControlViewManager;

    iput-object p2, p0, Lcom/discord/segmented/control/SegmentedControlViewManager$createViewInstance$1$1;->$this_apply:Lcom/discord/segmented/control/SegmentedControlView;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lcom/discord/segmented/control/SegmentedControlViewManager$createViewInstance$1$1;->invoke(ILjava/lang/String;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(ILjava/lang/String;)V
    .locals 3

    const-string v0, "label"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/discord/segmented/control/SegmentedControlViewManager$createViewInstance$1$1;->this$0:Lcom/discord/segmented/control/SegmentedControlViewManager;

    invoke-static {v0}, Lcom/discord/segmented/control/SegmentedControlViewManager;->access$getReactEvents$p(Lcom/discord/segmented/control/SegmentedControlViewManager;)Lcom/discord/reactevents/ReactEvents;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/discord/segmented/control/SegmentedControlViewManager$createViewInstance$1$1;->$this_apply:Lcom/discord/segmented/control/SegmentedControlView;

    .line 4
    new-instance v2, Lcom/discord/segmented/control/events/ValueChangeEvent;

    invoke-direct {v2, p2, p1}, Lcom/discord/segmented/control/events/ValueChangeEvent;-><init>(Ljava/lang/String;I)V

    .line 5
    invoke-virtual {v0, v1, v2}, Lcom/discord/reactevents/ReactEvents;->emitEvent(Landroid/view/View;Lcom/discord/reactevents/ReactEvent;)V

    return-void
.end method
