.class Lcom/facebook/react/animated/NativeAnimatedModule$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/uimanager/UIBlock;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/animated/NativeAnimatedModule;->willDispatchViewUpdates(Lcom/facebook/react/bridge/UIManager;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/animated/NativeAnimatedModule;

.field final synthetic val$frameNo:J


# direct methods
.method constructor <init>(Lcom/facebook/react/animated/NativeAnimatedModule;J)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$2;->this$0:Lcom/facebook/react/animated/NativeAnimatedModule;

    iput-wide p2, p0, Lcom/facebook/react/animated/NativeAnimatedModule$2;->val$frameNo:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public execute(Lcom/facebook/react/uimanager/NativeViewHierarchyManager;)V
    .locals 3

    iget-object p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$2;->this$0:Lcom/facebook/react/animated/NativeAnimatedModule;

    invoke-static {p1}, Lcom/facebook/react/animated/NativeAnimatedModule;->access$300(Lcom/facebook/react/animated/NativeAnimatedModule;)Lcom/facebook/react/animated/NativeAnimatedModule$ConcurrentOperationQueue;

    move-result-object p1

    iget-wide v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule$2;->val$frameNo:J

    iget-object v2, p0, Lcom/facebook/react/animated/NativeAnimatedModule$2;->this$0:Lcom/facebook/react/animated/NativeAnimatedModule;

    invoke-virtual {v2}, Lcom/facebook/react/animated/NativeAnimatedModule;->getNodesManager()Lcom/facebook/react/animated/NativeAnimatedNodesManager;

    move-result-object v2

    invoke-virtual {p1, v0, v1, v2}, Lcom/facebook/react/animated/NativeAnimatedModule$ConcurrentOperationQueue;->executeBatch(JLcom/facebook/react/animated/NativeAnimatedNodesManager;)V

    return-void
.end method
