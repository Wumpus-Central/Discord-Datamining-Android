.class Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$2;
.super Lcom/facebook/react/uimanager/events/Event;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/uimanager/ReactAccessibilityDelegate;->performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/uimanager/ReactAccessibilityDelegate;

.field final synthetic val$event:Lcom/facebook/react/bridge/WritableMap;


# direct methods
.method constructor <init>(Lcom/facebook/react/uimanager/ReactAccessibilityDelegate;IILcom/facebook/react/bridge/WritableMap;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$2;->this$0:Lcom/facebook/react/uimanager/ReactAccessibilityDelegate;

    iput-object p4, p0, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$2;->val$event:Lcom/facebook/react/bridge/WritableMap;

    invoke-direct {p0, p2, p3}, Lcom/facebook/react/uimanager/events/Event;-><init>(II)V

    return-void
.end method


# virtual methods
.method protected getEventData()Lcom/facebook/react/bridge/WritableMap;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$2;->val$event:Lcom/facebook/react/bridge/WritableMap;

    return-object v0
.end method

.method public getEventName()Ljava/lang/String;
    .locals 1

    const-string v0, "topAccessibilityAction"

    return-object v0
.end method
