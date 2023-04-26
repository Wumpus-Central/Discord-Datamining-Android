.class Lcom/facebook/react/HeadlessJsTaskService$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/HeadlessJsTaskService;->invokeStartTask(Lcom/facebook/react/bridge/ReactContext;Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/HeadlessJsTaskService;

.field final synthetic val$headlessJsTaskContext:Lcom/facebook/react/jstasks/HeadlessJsTaskContext;

.field final synthetic val$taskConfig:Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;


# direct methods
.method constructor <init>(Lcom/facebook/react/HeadlessJsTaskService;Lcom/facebook/react/jstasks/HeadlessJsTaskContext;Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/HeadlessJsTaskService$2;->this$0:Lcom/facebook/react/HeadlessJsTaskService;

    iput-object p2, p0, Lcom/facebook/react/HeadlessJsTaskService$2;->val$headlessJsTaskContext:Lcom/facebook/react/jstasks/HeadlessJsTaskContext;

    iput-object p3, p0, Lcom/facebook/react/HeadlessJsTaskService$2;->val$taskConfig:Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/HeadlessJsTaskService$2;->val$headlessJsTaskContext:Lcom/facebook/react/jstasks/HeadlessJsTaskContext;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/facebook/react/HeadlessJsTaskService$2;->val$taskConfig:Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/facebook/react/jstasks/HeadlessJsTaskContext;->startTask(Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object v1, p0, Lcom/facebook/react/HeadlessJsTaskService$2;->this$0:Lcom/facebook/react/HeadlessJsTaskService;

    .line 10
    .line 11
    invoke-static {v1}, Lcom/facebook/react/HeadlessJsTaskService;->access$100(Lcom/facebook/react/HeadlessJsTaskService;)Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    return-void
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
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
.end method
