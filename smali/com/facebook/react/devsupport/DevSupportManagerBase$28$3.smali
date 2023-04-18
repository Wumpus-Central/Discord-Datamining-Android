.class Lcom/facebook/react/devsupport/DevSupportManagerBase$28$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/devsupport/DevSupportManagerBase$28;->onCaptureHeapCommand(Lcom/facebook/react/packagerconnection/Responder;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/facebook/react/devsupport/DevSupportManagerBase$28;

.field final synthetic val$responder:Lcom/facebook/react/packagerconnection/Responder;


# direct methods
.method constructor <init>(Lcom/facebook/react/devsupport/DevSupportManagerBase$28;Lcom/facebook/react/packagerconnection/Responder;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase$28$3;->this$1:Lcom/facebook/react/devsupport/DevSupportManagerBase$28;

    iput-object p2, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase$28$3;->val$responder:Lcom/facebook/react/packagerconnection/Responder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase$28$3;->this$1:Lcom/facebook/react/devsupport/DevSupportManagerBase$28;

    iget-object v0, v0, Lcom/facebook/react/devsupport/DevSupportManagerBase$28;->this$0:Lcom/facebook/react/devsupport/DevSupportManagerBase;

    iget-object v1, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase$28$3;->val$responder:Lcom/facebook/react/packagerconnection/Responder;

    invoke-static {v0, v1}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->access$1700(Lcom/facebook/react/devsupport/DevSupportManagerBase;Lcom/facebook/react/packagerconnection/Responder;)V

    return-void
.end method
