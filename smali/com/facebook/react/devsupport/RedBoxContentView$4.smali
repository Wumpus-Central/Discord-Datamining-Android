.class Lcom/facebook/react/devsupport/RedBoxContentView$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/devsupport/RedBoxContentView;->init()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/devsupport/RedBoxContentView;


# direct methods
.method constructor <init>(Lcom/facebook/react/devsupport/RedBoxContentView;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/devsupport/RedBoxContentView$4;->this$0:Lcom/facebook/react/devsupport/RedBoxContentView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, Lcom/facebook/react/devsupport/RedBoxContentView$4;->this$0:Lcom/facebook/react/devsupport/RedBoxContentView;

    invoke-static {p1}, Lcom/facebook/react/devsupport/RedBoxContentView;->access$600(Lcom/facebook/react/devsupport/RedBoxContentView;)Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

    move-result-object p1

    invoke-static {p1}, Lc6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

    invoke-interface {p1}, Lcom/facebook/react/devsupport/interfaces/DevSupportManager;->hideRedboxDialog()V

    return-void
.end method
