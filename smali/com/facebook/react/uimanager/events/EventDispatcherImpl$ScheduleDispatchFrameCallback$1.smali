.class Lcom/facebook/react/uimanager/events/EventDispatcherImpl$ScheduleDispatchFrameCallback$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/uimanager/events/EventDispatcherImpl$ScheduleDispatchFrameCallback;->maybePostFromNonUI()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/facebook/react/uimanager/events/EventDispatcherImpl$ScheduleDispatchFrameCallback;


# direct methods
.method constructor <init>(Lcom/facebook/react/uimanager/events/EventDispatcherImpl$ScheduleDispatchFrameCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl$ScheduleDispatchFrameCallback$1;->this$1:Lcom/facebook/react/uimanager/events/EventDispatcherImpl$ScheduleDispatchFrameCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/uimanager/events/EventDispatcherImpl$ScheduleDispatchFrameCallback$1;->this$1:Lcom/facebook/react/uimanager/events/EventDispatcherImpl$ScheduleDispatchFrameCallback;

    invoke-virtual {v0}, Lcom/facebook/react/uimanager/events/EventDispatcherImpl$ScheduleDispatchFrameCallback;->maybePost()V

    return-void
.end method
