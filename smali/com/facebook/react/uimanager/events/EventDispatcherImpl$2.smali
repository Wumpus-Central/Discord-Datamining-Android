.class Lcom/facebook/react/uimanager/events/EventDispatcherImpl$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->onCatalystInstanceDestroyed()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/uimanager/events/EventDispatcherImpl;


# direct methods
.method constructor <init>(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl$2;->this$0:Lcom/facebook/react/uimanager/events/EventDispatcherImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl$2;->this$0:Lcom/facebook/react/uimanager/events/EventDispatcherImpl;

    invoke-static {v0}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl;->access$200(Lcom/facebook/react/uimanager/events/EventDispatcherImpl;)V

    return-void
.end method
