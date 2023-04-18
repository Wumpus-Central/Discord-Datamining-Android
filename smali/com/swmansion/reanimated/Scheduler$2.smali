.class Lcom/swmansion/reanimated/Scheduler$2;
.super Lcom/facebook/react/bridge/GuardedRunnable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/swmansion/reanimated/Scheduler;->scheduleOnUI()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/swmansion/reanimated/Scheduler;


# direct methods
.method constructor <init>(Lcom/swmansion/reanimated/Scheduler;Lcom/facebook/react/bridge/JSExceptionHandler;)V
    .locals 0

    iput-object p1, p0, Lcom/swmansion/reanimated/Scheduler$2;->this$0:Lcom/swmansion/reanimated/Scheduler;

    invoke-direct {p0, p2}, Lcom/facebook/react/bridge/GuardedRunnable;-><init>(Lcom/facebook/react/bridge/JSExceptionHandler;)V

    return-void
.end method


# virtual methods
.method public runGuarded()V
    .locals 1

    iget-object v0, p0, Lcom/swmansion/reanimated/Scheduler$2;->this$0:Lcom/swmansion/reanimated/Scheduler;

    invoke-static {v0}, Lcom/swmansion/reanimated/Scheduler;->access$100(Lcom/swmansion/reanimated/Scheduler;)Ljava/lang/Runnable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return-void
.end method
