.class Lcom/facebook/react/devsupport/LogBoxModule$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/devsupport/LogBoxModule;->hide()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/devsupport/LogBoxModule;


# direct methods
.method constructor <init>(Lcom/facebook/react/devsupport/LogBoxModule;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/devsupport/LogBoxModule$3;->this$0:Lcom/facebook/react/devsupport/LogBoxModule;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/devsupport/LogBoxModule$3;->this$0:Lcom/facebook/react/devsupport/LogBoxModule;

    invoke-static {v0}, Lcom/facebook/react/devsupport/LogBoxModule;->access$000(Lcom/facebook/react/devsupport/LogBoxModule;)Lcom/facebook/react/common/SurfaceDelegate;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/react/common/SurfaceDelegate;->hide()V

    return-void
.end method
