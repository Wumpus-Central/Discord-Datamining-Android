.class Lcom/facebook/react/devsupport/DevSupportManagerBase$15;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/devsupport/DevSupportManagerBase;->showDevOptionsDialog()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/devsupport/DevSupportManagerBase;


# direct methods
.method constructor <init>(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase$15;->this$0:Lcom/facebook/react/devsupport/DevSupportManagerBase;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    iget-object p1, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase$15;->this$0:Lcom/facebook/react/devsupport/DevSupportManagerBase;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->access$1002(Lcom/facebook/react/devsupport/DevSupportManagerBase;Landroid/app/AlertDialog;)Landroid/app/AlertDialog;

    return-void
.end method
