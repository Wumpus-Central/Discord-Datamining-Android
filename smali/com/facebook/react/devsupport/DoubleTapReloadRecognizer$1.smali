.class Lcom/facebook/react/devsupport/DoubleTapReloadRecognizer$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/devsupport/DoubleTapReloadRecognizer;->didDoubleTapR(ILandroid/view/View;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/devsupport/DoubleTapReloadRecognizer;


# direct methods
.method constructor <init>(Lcom/facebook/react/devsupport/DoubleTapReloadRecognizer;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/devsupport/DoubleTapReloadRecognizer$1;->this$0:Lcom/facebook/react/devsupport/DoubleTapReloadRecognizer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/facebook/react/devsupport/DoubleTapReloadRecognizer$1;->this$0:Lcom/facebook/react/devsupport/DoubleTapReloadRecognizer;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/react/devsupport/DoubleTapReloadRecognizer;->access$002(Lcom/facebook/react/devsupport/DoubleTapReloadRecognizer;Z)Z

    return-void
.end method
