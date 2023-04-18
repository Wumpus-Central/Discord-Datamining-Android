.class Lcom/facebook/react/bridge/CatalystInstanceImpl$1$1$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/bridge/CatalystInstanceImpl$1$1$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$3:Lcom/facebook/react/bridge/CatalystInstanceImpl$1$1$1;


# direct methods
.method constructor <init>(Lcom/facebook/react/bridge/CatalystInstanceImpl$1$1$1;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/bridge/CatalystInstanceImpl$1$1$1$1;->this$3:Lcom/facebook/react/bridge/CatalystInstanceImpl$1$1$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/bridge/CatalystInstanceImpl$1$1$1$1;->this$3:Lcom/facebook/react/bridge/CatalystInstanceImpl$1$1$1;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/facebook/react/bridge/CatalystInstanceImpl$1$1$1;->this$2:Lcom/facebook/react/bridge/CatalystInstanceImpl$1$1;

    .line 4
    .line 5
    iget-object v0, v0, Lcom/facebook/react/bridge/CatalystInstanceImpl$1$1;->this$1:Lcom/facebook/react/bridge/CatalystInstanceImpl$1;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/facebook/react/bridge/CatalystInstanceImpl$1;->this$0:Lcom/facebook/react/bridge/CatalystInstanceImpl;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/facebook/react/bridge/CatalystInstanceImpl;->access$900(Lcom/facebook/react/bridge/CatalystInstanceImpl;)Lcom/facebook/react/bridge/JavaScriptContextHolder;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Lcom/facebook/react/bridge/JavaScriptContextHolder;->clear()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/facebook/react/bridge/CatalystInstanceImpl$1$1$1$1;->this$3:Lcom/facebook/react/bridge/CatalystInstanceImpl$1$1$1;

    .line 17
    .line 18
    iget-object v0, v0, Lcom/facebook/react/bridge/CatalystInstanceImpl$1$1$1;->this$2:Lcom/facebook/react/bridge/CatalystInstanceImpl$1$1;

    .line 19
    .line 20
    iget-object v0, v0, Lcom/facebook/react/bridge/CatalystInstanceImpl$1$1;->this$1:Lcom/facebook/react/bridge/CatalystInstanceImpl$1;

    .line 21
    .line 22
    iget-object v0, v0, Lcom/facebook/react/bridge/CatalystInstanceImpl$1;->this$0:Lcom/facebook/react/bridge/CatalystInstanceImpl;

    .line 23
    .line 24
    invoke-static {v0}, Lcom/facebook/react/bridge/CatalystInstanceImpl;->access$1000(Lcom/facebook/react/bridge/CatalystInstanceImpl;)Lcom/facebook/jni/HybridData;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Lcom/facebook/jni/HybridData;->resetNative()V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lcom/facebook/react/bridge/CatalystInstanceImpl$1$1$1$1;->this$3:Lcom/facebook/react/bridge/CatalystInstanceImpl$1$1$1;

    .line 32
    .line 33
    iget-object v0, v0, Lcom/facebook/react/bridge/CatalystInstanceImpl$1$1$1;->this$2:Lcom/facebook/react/bridge/CatalystInstanceImpl$1$1;

    .line 34
    .line 35
    iget-object v0, v0, Lcom/facebook/react/bridge/CatalystInstanceImpl$1$1;->this$1:Lcom/facebook/react/bridge/CatalystInstanceImpl$1;

    .line 36
    .line 37
    iget-object v0, v0, Lcom/facebook/react/bridge/CatalystInstanceImpl$1;->this$0:Lcom/facebook/react/bridge/CatalystInstanceImpl;

    .line 38
    .line 39
    invoke-virtual {v0}, Lcom/facebook/react/bridge/CatalystInstanceImpl;->getReactQueueConfiguration()Lcom/facebook/react/bridge/queue/ReactQueueConfiguration;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-interface {v0}, Lcom/facebook/react/bridge/queue/ReactQueueConfiguration;->destroy()V

    .line 44
    .line 45
    .line 46
    const-string v0, "ReactNative"

    .line 47
    .line 48
    const-string v1, "CatalystInstanceImpl.destroy() end"

    .line 49
    .line 50
    invoke-static {v0, v1}, Lw3/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->DESTROY_CATALYST_INSTANCE_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    .line 54
    .line 55
    invoke-static {v0}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;)V

    .line 56
    .line 57
    .line 58
    return-void
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
.end method
