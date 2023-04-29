.class final Lcom/discord/media/engine/MediaEngineModule$addSpeedTestConnectionCallbacks$2;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function4;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/media/engine/MediaEngineModule;->addSpeedTestConnectionCallbacks(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function4<",
        "Ljava/lang/String;",
        "Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\n\u00a2\u0006\u0002\u0008\u0008"
    }
    d2 = {
        "<anonymous>",
        "",
        "server",
        "",
        "port",
        "",
        "seq",
        "timeout",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $connectionId:I

.field final synthetic this$0:Lcom/discord/media/engine/MediaEngineModule;


# direct methods
.method constructor <init>(Lcom/discord/media/engine/MediaEngineModule;I)V
    .locals 0

    iput-object p1, p0, Lcom/discord/media/engine/MediaEngineModule$addSpeedTestConnectionCallbacks$2;->this$0:Lcom/discord/media/engine/MediaEngineModule;

    iput p2, p0, Lcom/discord/media/engine/MediaEngineModule$addSpeedTestConnectionCallbacks$2;->$connectionId:I

    const/4 p1, 0x4

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/discord/media/engine/MediaEngineModule$addSpeedTestConnectionCallbacks$2;->invoke(Ljava/lang/String;III)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/String;III)V
    .locals 9

    const-string v0, "server"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/discord/media/engine/MediaEngineModule$addSpeedTestConnectionCallbacks$2;->this$0:Lcom/discord/media/engine/MediaEngineModule;

    invoke-static {v0}, Lcom/discord/media/engine/MediaEngineModule;->access$getReactEvents$p(Lcom/discord/media/engine/MediaEngineModule;)Lcom/discord/reactevents/ReactEvents;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/discord/media/engine/MediaEngineModule$addSpeedTestConnectionCallbacks$2;->this$0:Lcom/discord/media/engine/MediaEngineModule;

    invoke-virtual {v1}, Lcom/discord/media/engine/MediaEngineModule;->getReactContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v1

    .line 4
    new-instance v8, Lcom/discord/media/engine/video/events/SpeedTestPingTimeoutCallbackEvent;

    iget v3, p0, Lcom/discord/media/engine/MediaEngineModule$addSpeedTestConnectionCallbacks$2;->$connectionId:I

    move-object v2, v8

    move-object v4, p1

    move v5, p2

    move v6, p3

    move v7, p4

    invoke-direct/range {v2 .. v7}, Lcom/discord/media/engine/video/events/SpeedTestPingTimeoutCallbackEvent;-><init>(ILjava/lang/String;III)V

    .line 5
    invoke-virtual {v0, v1, v8}, Lcom/discord/reactevents/ReactEvents;->emitModuleEvent(Landroid/content/Context;Lcom/discord/reactevents/ReactEvent;)V

    return-void
.end method
