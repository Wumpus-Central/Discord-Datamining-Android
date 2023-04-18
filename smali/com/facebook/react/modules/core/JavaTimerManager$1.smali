.class Lcom/facebook/react/modules/core/JavaTimerManager$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/modules/core/JavaTimerManager;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/facebook/react/modules/core/JavaScriptTimerExecutor;Lcom/facebook/react/modules/core/ReactChoreographer;Lcom/facebook/react/devsupport/interfaces/DevSupportManager;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/facebook/react/modules/core/JavaTimerManager$Timer;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/modules/core/JavaTimerManager;


# direct methods
.method constructor <init>(Lcom/facebook/react/modules/core/JavaTimerManager;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/modules/core/JavaTimerManager$1;->this$0:Lcom/facebook/react/modules/core/JavaTimerManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Lcom/facebook/react/modules/core/JavaTimerManager$Timer;Lcom/facebook/react/modules/core/JavaTimerManager$Timer;)I
    .locals 2

    .line 2
    invoke-static {p1}, Lcom/facebook/react/modules/core/JavaTimerManager$Timer;->access$400(Lcom/facebook/react/modules/core/JavaTimerManager$Timer;)J

    move-result-wide v0

    invoke-static {p2}, Lcom/facebook/react/modules/core/JavaTimerManager$Timer;->access$400(Lcom/facebook/react/modules/core/JavaTimerManager$Timer;)J

    move-result-wide p1

    sub-long/2addr v0, p1

    const-wide/16 p1, 0x0

    cmp-long p1, v0, p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    if-gez p1, :cond_1

    const/4 p1, -0x1

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/modules/core/JavaTimerManager$Timer;

    check-cast p2, Lcom/facebook/react/modules/core/JavaTimerManager$Timer;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/modules/core/JavaTimerManager$1;->compare(Lcom/facebook/react/modules/core/JavaTimerManager$Timer;Lcom/facebook/react/modules/core/JavaTimerManager$Timer;)I

    move-result p1

    return p1
.end method
