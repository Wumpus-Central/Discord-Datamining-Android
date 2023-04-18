.class Lcom/facebook/react/jstasks/HeadlessJsTaskContext$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/jstasks/HeadlessJsTaskContext;->retryTask(I)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/jstasks/HeadlessJsTaskContext;

.field final synthetic val$taskConfig:Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;

.field final synthetic val$taskId:I


# direct methods
.method constructor <init>(Lcom/facebook/react/jstasks/HeadlessJsTaskContext;Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;I)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/jstasks/HeadlessJsTaskContext$1;->this$0:Lcom/facebook/react/jstasks/HeadlessJsTaskContext;

    iput-object p2, p0, Lcom/facebook/react/jstasks/HeadlessJsTaskContext$1;->val$taskConfig:Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;

    iput p3, p0, Lcom/facebook/react/jstasks/HeadlessJsTaskContext$1;->val$taskId:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/facebook/react/jstasks/HeadlessJsTaskContext$1;->this$0:Lcom/facebook/react/jstasks/HeadlessJsTaskContext;

    iget-object v1, p0, Lcom/facebook/react/jstasks/HeadlessJsTaskContext$1;->val$taskConfig:Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;

    iget v2, p0, Lcom/facebook/react/jstasks/HeadlessJsTaskContext$1;->val$taskId:I

    invoke-static {v0, v1, v2}, Lcom/facebook/react/jstasks/HeadlessJsTaskContext;->access$000(Lcom/facebook/react/jstasks/HeadlessJsTaskContext;Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;I)V

    return-void
.end method
