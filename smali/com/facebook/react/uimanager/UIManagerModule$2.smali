.class Lcom/facebook/react/uimanager/UIManagerModule$2;
.super Lcom/facebook/react/bridge/GuardedRunnable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/uimanager/UIManagerModule;->setViewLocalData(ILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/uimanager/UIManagerModule;

.field final synthetic val$data:Ljava/lang/Object;

.field final synthetic val$tag:I


# direct methods
.method constructor <init>(Lcom/facebook/react/uimanager/UIManagerModule;Lcom/facebook/react/bridge/ReactContext;ILjava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/uimanager/UIManagerModule$2;->this$0:Lcom/facebook/react/uimanager/UIManagerModule;

    iput p3, p0, Lcom/facebook/react/uimanager/UIManagerModule$2;->val$tag:I

    iput-object p4, p0, Lcom/facebook/react/uimanager/UIManagerModule$2;->val$data:Ljava/lang/Object;

    invoke-direct {p0, p2}, Lcom/facebook/react/bridge/GuardedRunnable;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-void
.end method


# virtual methods
.method public runGuarded()V
    .locals 3

    iget-object v0, p0, Lcom/facebook/react/uimanager/UIManagerModule$2;->this$0:Lcom/facebook/react/uimanager/UIManagerModule;

    invoke-static {v0}, Lcom/facebook/react/uimanager/UIManagerModule;->access$100(Lcom/facebook/react/uimanager/UIManagerModule;)Lcom/facebook/react/uimanager/UIImplementation;

    move-result-object v0

    iget v1, p0, Lcom/facebook/react/uimanager/UIManagerModule$2;->val$tag:I

    iget-object v2, p0, Lcom/facebook/react/uimanager/UIManagerModule$2;->val$data:Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/react/uimanager/UIImplementation;->setViewLocalData(ILjava/lang/Object;)V

    return-void
.end method
