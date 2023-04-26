.class Lcom/swmansion/reanimated/Scheduler$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/swmansion/reanimated/Scheduler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/swmansion/reanimated/Scheduler;


# direct methods
.method constructor <init>(Lcom/swmansion/reanimated/Scheduler;)V
    .locals 0

    iput-object p1, p0, Lcom/swmansion/reanimated/Scheduler$1;->this$0:Lcom/swmansion/reanimated/Scheduler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/reanimated/Scheduler$1;->this$0:Lcom/swmansion/reanimated/Scheduler;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/swmansion/reanimated/Scheduler;->access$000(Lcom/swmansion/reanimated/Scheduler;)Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/swmansion/reanimated/Scheduler$1;->this$0:Lcom/swmansion/reanimated/Scheduler;

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/swmansion/reanimated/Scheduler;->triggerUI()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
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
.end method
