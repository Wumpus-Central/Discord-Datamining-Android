.class Lcom/facebook/react/devsupport/DevSupportManagerBase$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/devsupport/DevSupportManagerBase;->updateJSError(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/devsupport/DevSupportManagerBase;

.field final synthetic val$details:Lcom/facebook/react/bridge/ReadableArray;

.field final synthetic val$errorCookie:I

.field final synthetic val$message:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/facebook/react/devsupport/DevSupportManagerBase;ILjava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase$5;->this$0:Lcom/facebook/react/devsupport/DevSupportManagerBase;

    iput p2, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase$5;->val$errorCookie:I

    iput-object p3, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase$5;->val$message:Ljava/lang/String;

    iput-object p4, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase$5;->val$details:Lcom/facebook/react/bridge/ReadableArray;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase$5;->this$0:Lcom/facebook/react/devsupport/DevSupportManagerBase;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->access$400(Lcom/facebook/react/devsupport/DevSupportManagerBase;)Lcom/facebook/react/common/SurfaceDelegate;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Lcom/facebook/react/common/SurfaceDelegate;->isShowing()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase$5;->val$errorCookie:I

    .line 14
    .line 15
    iget-object v1, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase$5;->this$0:Lcom/facebook/react/devsupport/DevSupportManagerBase;

    .line 16
    .line 17
    invoke-static {v1}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->access$500(Lcom/facebook/react/devsupport/DevSupportManagerBase;)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eq v0, v1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase$5;->this$0:Lcom/facebook/react/devsupport/DevSupportManagerBase;

    .line 25
    .line 26
    iget-object v1, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase$5;->val$message:Ljava/lang/String;

    .line 27
    .line 28
    iget-object v2, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase$5;->val$details:Lcom/facebook/react/bridge/ReadableArray;

    .line 29
    .line 30
    invoke-static {v2}, Lcom/facebook/react/devsupport/StackTraceHelper;->convertJsStackTrace(Lcom/facebook/react/bridge/ReadableArray;)[Lcom/facebook/react/devsupport/interfaces/StackFrame;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    iget v3, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase$5;->val$errorCookie:I

    .line 35
    .line 36
    sget-object v4, Lcom/facebook/react/devsupport/interfaces/ErrorType;->JS:Lcom/facebook/react/devsupport/interfaces/ErrorType;

    .line 37
    .line 38
    invoke-static {v0, v1, v2, v3, v4}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->access$600(Lcom/facebook/react/devsupport/DevSupportManagerBase;Ljava/lang/String;[Lcom/facebook/react/devsupport/interfaces/StackFrame;ILcom/facebook/react/devsupport/interfaces/ErrorType;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase$5;->this$0:Lcom/facebook/react/devsupport/DevSupportManagerBase;

    .line 42
    .line 43
    invoke-static {v0}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->access$400(Lcom/facebook/react/devsupport/DevSupportManagerBase;)Lcom/facebook/react/common/SurfaceDelegate;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-interface {v0}, Lcom/facebook/react/common/SurfaceDelegate;->show()V

    .line 48
    .line 49
    .line 50
    :cond_1
    :goto_0
    return-void
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
