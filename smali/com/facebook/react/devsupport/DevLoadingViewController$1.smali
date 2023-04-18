.class Lcom/facebook/react/devsupport/DevLoadingViewController$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/devsupport/DevLoadingViewController;->showMessage(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/devsupport/DevLoadingViewController;

.field final synthetic val$message:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/facebook/react/devsupport/DevLoadingViewController;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/devsupport/DevLoadingViewController$1;->this$0:Lcom/facebook/react/devsupport/DevLoadingViewController;

    iput-object p2, p0, Lcom/facebook/react/devsupport/DevLoadingViewController$1;->val$message:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/facebook/react/devsupport/DevLoadingViewController$1;->this$0:Lcom/facebook/react/devsupport/DevLoadingViewController;

    iget-object v1, p0, Lcom/facebook/react/devsupport/DevLoadingViewController$1;->val$message:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/facebook/react/devsupport/DevLoadingViewController;->access$000(Lcom/facebook/react/devsupport/DevLoadingViewController;Ljava/lang/String;)V

    return-void
.end method
