.class Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl;->onCatalystInstanceDestroyed()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl;


# direct methods
.method constructor <init>(Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl$1;->this$0:Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl$1;->this$0:Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl;

    invoke-static {v0}, Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl;->access$100(Lcom/facebook/react/uimanager/events/LockFreeEventDispatcherImpl;)V

    return-void
.end method
