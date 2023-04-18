.class Lcom/facebook/react/devsupport/DevServerHelper$3;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/devsupport/DevServerHelper;->openInspectorConnection()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/devsupport/DevServerHelper;


# direct methods
.method constructor <init>(Lcom/facebook/react/devsupport/DevServerHelper;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/devsupport/DevServerHelper$3;->this$0:Lcom/facebook/react/devsupport/DevServerHelper;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/facebook/react/devsupport/DevServerHelper$3;->doInBackground([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method protected varargs doInBackground([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 4

    .line 2
    iget-object p1, p0, Lcom/facebook/react/devsupport/DevServerHelper$3;->this$0:Lcom/facebook/react/devsupport/DevServerHelper;

    new-instance v0, Lcom/facebook/react/devsupport/InspectorPackagerConnection;

    .line 3
    invoke-static {p1}, Lcom/facebook/react/devsupport/DevServerHelper;->access$300(Lcom/facebook/react/devsupport/DevServerHelper;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/react/devsupport/DevServerHelper$3;->this$0:Lcom/facebook/react/devsupport/DevServerHelper;

    invoke-static {v2}, Lcom/facebook/react/devsupport/DevServerHelper;->access$400(Lcom/facebook/react/devsupport/DevServerHelper;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/facebook/react/devsupport/DevServerHelper$3;->this$0:Lcom/facebook/react/devsupport/DevServerHelper;

    invoke-static {v3}, Lcom/facebook/react/devsupport/DevServerHelper;->access$500(Lcom/facebook/react/devsupport/DevServerHelper;)Lcom/facebook/react/devsupport/InspectorPackagerConnection$BundleStatusProvider;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/react/devsupport/InspectorPackagerConnection;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/devsupport/InspectorPackagerConnection$BundleStatusProvider;)V

    .line 4
    invoke-static {p1, v0}, Lcom/facebook/react/devsupport/DevServerHelper;->access$202(Lcom/facebook/react/devsupport/DevServerHelper;Lcom/facebook/react/devsupport/InspectorPackagerConnection;)Lcom/facebook/react/devsupport/InspectorPackagerConnection;

    .line 5
    iget-object p1, p0, Lcom/facebook/react/devsupport/DevServerHelper$3;->this$0:Lcom/facebook/react/devsupport/DevServerHelper;

    invoke-static {p1}, Lcom/facebook/react/devsupport/DevServerHelper;->access$200(Lcom/facebook/react/devsupport/DevServerHelper;)Lcom/facebook/react/devsupport/InspectorPackagerConnection;

    move-result-object p1

    invoke-virtual {p1}, Lcom/facebook/react/devsupport/InspectorPackagerConnection;->connect()V

    const/4 p1, 0x0

    return-object p1
.end method
