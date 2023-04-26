.class Lcom/facebook/react/uimanager/UIManagerModule$3;
.super Lcom/facebook/react/bridge/GuardedRunnable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/uimanager/UIManagerModule;->updateRootLayoutSpecs(IIIII)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/uimanager/UIManagerModule;

.field final synthetic val$heightMeasureSpec:I

.field final synthetic val$rootViewTag:I

.field final synthetic val$widthMeasureSpec:I


# direct methods
.method constructor <init>(Lcom/facebook/react/uimanager/UIManagerModule;Lcom/facebook/react/bridge/ReactContext;III)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/uimanager/UIManagerModule$3;->this$0:Lcom/facebook/react/uimanager/UIManagerModule;

    iput p3, p0, Lcom/facebook/react/uimanager/UIManagerModule$3;->val$rootViewTag:I

    iput p4, p0, Lcom/facebook/react/uimanager/UIManagerModule$3;->val$widthMeasureSpec:I

    iput p5, p0, Lcom/facebook/react/uimanager/UIManagerModule$3;->val$heightMeasureSpec:I

    invoke-direct {p0, p2}, Lcom/facebook/react/bridge/GuardedRunnable;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-void
.end method


# virtual methods
.method public runGuarded()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/UIManagerModule$3;->this$0:Lcom/facebook/react/uimanager/UIManagerModule;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/facebook/react/uimanager/UIManagerModule;->access$100(Lcom/facebook/react/uimanager/UIManagerModule;)Lcom/facebook/react/uimanager/UIImplementation;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v1, p0, Lcom/facebook/react/uimanager/UIManagerModule$3;->val$rootViewTag:I

    .line 8
    .line 9
    iget v2, p0, Lcom/facebook/react/uimanager/UIManagerModule$3;->val$widthMeasureSpec:I

    .line 10
    .line 11
    iget v3, p0, Lcom/facebook/react/uimanager/UIManagerModule$3;->val$heightMeasureSpec:I

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2, v3}, Lcom/facebook/react/uimanager/UIImplementation;->updateRootView(III)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/facebook/react/uimanager/UIManagerModule$3;->this$0:Lcom/facebook/react/uimanager/UIManagerModule;

    .line 17
    .line 18
    invoke-static {v0}, Lcom/facebook/react/uimanager/UIManagerModule;->access$100(Lcom/facebook/react/uimanager/UIManagerModule;)Lcom/facebook/react/uimanager/UIImplementation;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const/4 v1, -0x1

    .line 23
    invoke-virtual {v0, v1}, Lcom/facebook/react/uimanager/UIImplementation;->dispatchViewUpdates(I)V

    .line 24
    .line 25
    .line 26
    return-void
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
.end method
