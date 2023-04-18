.class Lcom/facebook/react/modules/dialog/DialogModule$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/modules/dialog/DialogModule;->showAlert(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Callback;Lcom/facebook/react/bridge/Callback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/modules/dialog/DialogModule;

.field final synthetic val$actionCallback:Lcom/facebook/react/bridge/Callback;

.field final synthetic val$args:Landroid/os/Bundle;

.field final synthetic val$fragmentManagerHelper:Lcom/facebook/react/modules/dialog/DialogModule$FragmentManagerHelper;


# direct methods
.method constructor <init>(Lcom/facebook/react/modules/dialog/DialogModule;Lcom/facebook/react/modules/dialog/DialogModule$FragmentManagerHelper;Landroid/os/Bundle;Lcom/facebook/react/bridge/Callback;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/modules/dialog/DialogModule$1;->this$0:Lcom/facebook/react/modules/dialog/DialogModule;

    iput-object p2, p0, Lcom/facebook/react/modules/dialog/DialogModule$1;->val$fragmentManagerHelper:Lcom/facebook/react/modules/dialog/DialogModule$FragmentManagerHelper;

    iput-object p3, p0, Lcom/facebook/react/modules/dialog/DialogModule$1;->val$args:Landroid/os/Bundle;

    iput-object p4, p0, Lcom/facebook/react/modules/dialog/DialogModule$1;->val$actionCallback:Lcom/facebook/react/bridge/Callback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/facebook/react/modules/dialog/DialogModule$1;->val$fragmentManagerHelper:Lcom/facebook/react/modules/dialog/DialogModule$FragmentManagerHelper;

    iget-object v1, p0, Lcom/facebook/react/modules/dialog/DialogModule$1;->val$args:Landroid/os/Bundle;

    iget-object v2, p0, Lcom/facebook/react/modules/dialog/DialogModule$1;->val$actionCallback:Lcom/facebook/react/bridge/Callback;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/react/modules/dialog/DialogModule$FragmentManagerHelper;->showNewAlert(Landroid/os/Bundle;Lcom/facebook/react/bridge/Callback;)V

    return-void
.end method
