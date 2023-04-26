.class Lcom/facebook/react/views/view/ReactViewManager$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/views/view/ReactViewManager;->setFocusable(Lcom/facebook/react/views/view/ReactViewGroup;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/views/view/ReactViewManager;

.field final synthetic val$view:Lcom/facebook/react/views/view/ReactViewGroup;


# direct methods
.method constructor <init>(Lcom/facebook/react/views/view/ReactViewManager;Lcom/facebook/react/views/view/ReactViewGroup;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/views/view/ReactViewManager$1;->this$0:Lcom/facebook/react/views/view/ReactViewManager;

    iput-object p2, p0, Lcom/facebook/react/views/view/ReactViewManager$1;->val$view:Lcom/facebook/react/views/view/ReactViewGroup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/facebook/react/views/view/ReactViewManager$1;->val$view:Lcom/facebook/react/views/view/ReactViewGroup;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/facebook/react/bridge/ReactContext;

    .line 8
    .line 9
    iget-object v0, p0, Lcom/facebook/react/views/view/ReactViewManager$1;->val$view:Lcom/facebook/react/views/view/ReactViewGroup;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-static {p1, v0}, Lcom/facebook/react/uimanager/UIManagerHelper;->getEventDispatcherForReactTag(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    new-instance v0, Lcom/facebook/react/views/view/ViewGroupClickEvent;

    .line 23
    .line 24
    iget-object v1, p0, Lcom/facebook/react/views/view/ReactViewManager$1;->val$view:Lcom/facebook/react/views/view/ReactViewGroup;

    .line 25
    .line 26
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-static {v1}, Lcom/facebook/react/uimanager/UIManagerHelper;->getSurfaceId(Landroid/content/Context;)I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    iget-object v2, p0, Lcom/facebook/react/views/view/ReactViewManager$1;->val$view:Lcom/facebook/react/views/view/ReactViewGroup;

    .line 35
    .line 36
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    invoke-direct {v0, v1, v2}, Lcom/facebook/react/views/view/ViewGroupClickEvent;-><init>(II)V

    .line 41
    .line 42
    .line 43
    invoke-interface {p1, v0}, Lcom/facebook/react/uimanager/events/EventDispatcher;->dispatchEvent(Lcom/facebook/react/uimanager/events/Event;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method
