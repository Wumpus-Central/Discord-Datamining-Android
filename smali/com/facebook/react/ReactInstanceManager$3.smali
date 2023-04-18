.class Lcom/facebook/react/ReactInstanceManager$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/devsupport/interfaces/PackagerStatusCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/ReactInstanceManager;->recreateReactContextInBackgroundInner()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/ReactInstanceManager;

.field final synthetic val$devSettings:Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;


# direct methods
.method constructor <init>(Lcom/facebook/react/ReactInstanceManager;Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/ReactInstanceManager$3;->this$0:Lcom/facebook/react/ReactInstanceManager;

    iput-object p2, p0, Lcom/facebook/react/ReactInstanceManager$3;->val$devSettings:Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPackagerStatusFetched(Z)V
    .locals 1

    new-instance v0, Lcom/facebook/react/ReactInstanceManager$3$1;

    invoke-direct {v0, p0, p1}, Lcom/facebook/react/ReactInstanceManager$3$1;-><init>(Lcom/facebook/react/ReactInstanceManager$3;Z)V

    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method
