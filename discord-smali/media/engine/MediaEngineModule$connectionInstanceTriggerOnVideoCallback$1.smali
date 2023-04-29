.class final Lcom/discord/media/engine/MediaEngineModule$connectionInstanceTriggerOnVideoCallback$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function4;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/media/engine/MediaEngineModule;->connectionInstanceTriggerOnVideoCallback(I)V
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
        "Ljava/lang/Long;",
        "Ljava/lang/String;",
        "Ljava/lang/String;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0008\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\t"
    }
    d2 = {
        "<anonymous>",
        "",
        "userId",
        "",
        "ssrc",
        "",
        "Lcom/discord/media/engine/types/SSRC64;",
        "streamId",
        "videoStreamParametersJSON",
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

    iput-object p1, p0, Lcom/discord/media/engine/MediaEngineModule$connectionInstanceTriggerOnVideoCallback$1;->this$0:Lcom/discord/media/engine/MediaEngineModule;

    iput p2, p0, Lcom/discord/media/engine/MediaEngineModule$connectionInstanceTriggerOnVideoCallback$1;->$connectionId:I

    const/4 p1, 0x4

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    move-object v1, p1

    check-cast v1, Ljava/lang/String;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    move-object v4, p3

    check-cast v4, Ljava/lang/String;

    move-object v5, p4

    check-cast v5, Ljava/lang/String;

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/discord/media/engine/MediaEngineModule$connectionInstanceTriggerOnVideoCallback$1;->invoke(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V
    .locals 10

    const-string v0, "userId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "streamId"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "videoStreamParametersJSON"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/discord/media/engine/MediaEngineModule$connectionInstanceTriggerOnVideoCallback$1;->this$0:Lcom/discord/media/engine/MediaEngineModule;

    invoke-static {v0}, Lcom/discord/media/engine/MediaEngineModule;->access$getReactEvents$p(Lcom/discord/media/engine/MediaEngineModule;)Lcom/discord/reactevents/ReactEvents;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/discord/media/engine/MediaEngineModule$connectionInstanceTriggerOnVideoCallback$1;->this$0:Lcom/discord/media/engine/MediaEngineModule;

    invoke-virtual {v1}, Lcom/discord/media/engine/MediaEngineModule;->getReactContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v1

    .line 4
    new-instance v9, Lcom/discord/media/engine/video/events/OnVideoCallbackEvent;

    .line 5
    iget v3, p0, Lcom/discord/media/engine/MediaEngineModule$connectionInstanceTriggerOnVideoCallback$1;->$connectionId:I

    move-object v2, v9

    move-object v4, p1

    move-wide v5, p2

    move-object v7, p4

    move-object v8, p5

    .line 6
    invoke-direct/range {v2 .. v8}, Lcom/discord/media/engine/video/events/OnVideoCallbackEvent;-><init>(ILjava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    .line 7
    invoke-virtual {v0, v1, v9}, Lcom/discord/reactevents/ReactEvents;->emitModuleEvent(Landroid/content/Context;Lcom/discord/reactevents/ReactEvent;)V

    return-void
.end method
