.class Lcom/facebook/react/devsupport/BridgeDevSupportManager$2;
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

    iput-object p1, p0, Lcom/facebook/react/devsupport/BridgeDevSupportManager$2;->this$0:Lcom/facebook/react/devsupport/BridgeDevSupportManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onOptionSelected()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/BridgeDevSupportManager$2;->this$0:Lcom/facebook/react/devsupport/BridgeDevSupportManager;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->getDevSettings()Lcom/facebook/react/devsupport/DevInternalSettings;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/facebook/react/devsupport/BridgeDevSupportManager$2;->this$0:Lcom/facebook/react/devsupport/BridgeDevSupportManager;

    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->getDevSettings()Lcom/facebook/react/devsupport/DevInternalSettings;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Lcom/facebook/react/devsupport/DevInternalSettings;->isRemoteJSDebugEnabled()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    xor-int/lit8 v1, v1, 0x1

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lcom/facebook/react/devsupport/DevInternalSettings;->setRemoteJSDebugEnabled(Z)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lcom/facebook/react/devsupport/BridgeDevSupportManager$2;->this$0:Lcom/facebook/react/devsupport/BridgeDevSupportManager;

    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/facebook/react/devsupport/BridgeDevSupportManager;->handleReloadJS()V

    .line 25
    .line 26
    .line 27
    return-void
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
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
.end method
