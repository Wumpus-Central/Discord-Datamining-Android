.class Lcom/facebook/react/HeadlessJsTaskService$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/ReactInstanceEventListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/HeadlessJsTaskService;->startTask(Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/HeadlessJsTaskService;

.field final synthetic val$reactInstanceManager:Lcom/facebook/react/ReactInstanceManager;

.field final synthetic val$taskConfig:Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;


# direct methods
.method constructor <init>(Lcom/facebook/react/HeadlessJsTaskService;Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;Lcom/facebook/react/ReactInstanceManager;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/HeadlessJsTaskService$1;->this$0:Lcom/facebook/react/HeadlessJsTaskService;

    iput-object p2, p0, Lcom/facebook/react/HeadlessJsTaskService$1;->val$taskConfig:Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;

    iput-object p3, p0, Lcom/facebook/react/HeadlessJsTaskService$1;->val$reactInstanceManager:Lcom/facebook/react/ReactInstanceManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onReactContextInitialized(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/HeadlessJsTaskService$1;->this$0:Lcom/facebook/react/HeadlessJsTaskService;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/facebook/react/HeadlessJsTaskService$1;->val$taskConfig:Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;

    .line 4
    .line 5
    invoke-static {v0, p1, v1}, Lcom/facebook/react/HeadlessJsTaskService;->access$000(Lcom/facebook/react/HeadlessJsTaskService;Lcom/facebook/react/bridge/ReactContext;Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lcom/facebook/react/HeadlessJsTaskService$1;->val$reactInstanceManager:Lcom/facebook/react/ReactInstanceManager;

    .line 9
    .line 10
    invoke-virtual {p1, p0}, Lcom/facebook/react/ReactInstanceManager;->removeReactInstanceEventListener(Lcom/facebook/react/ReactInstanceEventListener;)V

    .line 11
    .line 12
    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
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
    .line 45
    .line 46
.end method
