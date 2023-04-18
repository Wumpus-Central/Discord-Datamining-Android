.class Lcom/facebook/react/devsupport/BridgeDevSupportManager$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/devsupport/interfaces/DevOptionHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/devsupport/BridgeDevSupportManager;-><init>(Landroid/content/Context;Lcom/facebook/react/devsupport/ReactInstanceDevHelper;Ljava/lang/String;ZLcom/facebook/react/devsupport/interfaces/RedBoxHandler;Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;ILjava/util/Map;Lcom/facebook/react/common/SurfaceDelegateFactory;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/devsupport/BridgeDevSupportManager;


# direct methods
.method constructor <init>(Lcom/facebook/react/devsupport/BridgeDevSupportManager;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/devsupport/BridgeDevSupportManager$1;->this$0:Lcom/facebook/react/devsupport/BridgeDevSupportManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onOptionSelected()V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/devsupport/BridgeDevSupportManager$1;->this$0:Lcom/facebook/react/devsupport/BridgeDevSupportManager;

    invoke-static {v0}, Lcom/facebook/react/devsupport/BridgeDevSupportManager;->access$000(Lcom/facebook/react/devsupport/BridgeDevSupportManager;)V

    return-void
.end method
