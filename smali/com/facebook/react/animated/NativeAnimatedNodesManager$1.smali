.class Lcom/facebook/react/animated/NativeAnimatedNodesManager$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/animated/NativeAnimatedNodesManager;->onEventDispatch(Lcom/facebook/react/uimanager/events/Event;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/animated/NativeAnimatedNodesManager;

.field final synthetic val$event:Lcom/facebook/react/uimanager/events/Event;


# direct methods
.method constructor <init>(Lcom/facebook/react/animated/NativeAnimatedNodesManager;Lcom/facebook/react/uimanager/events/Event;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/animated/NativeAnimatedNodesManager$1;->this$0:Lcom/facebook/react/animated/NativeAnimatedNodesManager;

    iput-object p2, p0, Lcom/facebook/react/animated/NativeAnimatedNodesManager$1;->val$event:Lcom/facebook/react/uimanager/events/Event;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedNodesManager$1;->this$0:Lcom/facebook/react/animated/NativeAnimatedNodesManager;

    iget-object v1, p0, Lcom/facebook/react/animated/NativeAnimatedNodesManager$1;->val$event:Lcom/facebook/react/uimanager/events/Event;

    invoke-static {v0, v1}, Lcom/facebook/react/animated/NativeAnimatedNodesManager;->access$000(Lcom/facebook/react/animated/NativeAnimatedNodesManager;Lcom/facebook/react/uimanager/events/Event;)V

    return-void
.end method
