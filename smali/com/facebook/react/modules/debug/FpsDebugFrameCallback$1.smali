.class Lcom/facebook/react/modules/debug/FpsDebugFrameCallback$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->start()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;

.field final synthetic val$fpsDebugFrameCallback:Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;


# direct methods
.method constructor <init>(Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback$1;->this$0:Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;

    iput-object p2, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback$1;->val$fpsDebugFrameCallback:Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback$1;->this$0:Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;

    .line 2
    .line 3
    invoke-static {}, Lcom/facebook/react/modules/core/ChoreographerCompat;->getInstance()Lcom/facebook/react/modules/core/ChoreographerCompat;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v0, v1}, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->access$002(Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;Lcom/facebook/react/modules/core/ChoreographerCompat;)Lcom/facebook/react/modules/core/ChoreographerCompat;

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback$1;->this$0:Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;

    .line 11
    .line 12
    invoke-static {v0}, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;->access$000(Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;)Lcom/facebook/react/modules/core/ChoreographerCompat;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v1, p0, Lcom/facebook/react/modules/debug/FpsDebugFrameCallback$1;->val$fpsDebugFrameCallback:Lcom/facebook/react/modules/debug/FpsDebugFrameCallback;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lcom/facebook/react/modules/core/ChoreographerCompat;->postFrameCallback(Lcom/facebook/react/modules/core/ChoreographerCompat$FrameCallback;)V

    .line 19
    .line 20
    .line 21
    return-void
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
    .line 47
    .line 48
    .line 49
    .line 50
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
