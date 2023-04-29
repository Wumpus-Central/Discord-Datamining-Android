.class final Lcom/discord/media/engine/MediaEngineModule$createOwnStreamConnectionWithOptions$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/media/engine/MediaEngineModule;->createOwnStreamConnectionWithOptions(ILjava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Callback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function2<",
        "Ljava/lang/String;",
        "Ljava/util/Map<",
        "Ljava/lang/String;",
        "+",
        "Ljava/lang/Object;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005H\n\u00a2\u0006\u0002\u0008\u0007"
    }
    d2 = {
        "<anonymous>",
        "",
        "errorMessage",
        "",
        "connectionInfo",
        "",
        "",
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
.field final synthetic $callback:Lcom/facebook/react/bridge/Callback;

.field final synthetic $connectionId:I

.field final synthetic this$0:Lcom/discord/media/engine/MediaEngineModule;


# direct methods
.method constructor <init>(Lcom/facebook/react/bridge/Callback;Lcom/discord/media/engine/MediaEngineModule;I)V
    .locals 0

    iput-object p1, p0, Lcom/discord/media/engine/MediaEngineModule$createOwnStreamConnectionWithOptions$1;->$callback:Lcom/facebook/react/bridge/Callback;

    iput-object p2, p0, Lcom/discord/media/engine/MediaEngineModule$createOwnStreamConnectionWithOptions$1;->this$0:Lcom/discord/media/engine/MediaEngineModule;

    iput p3, p0, Lcom/discord/media/engine/MediaEngineModule$createOwnStreamConnectionWithOptions$1;->$connectionId:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/util/Map;

    invoke-virtual {p0, p1, p2}, Lcom/discord/media/engine/MediaEngineModule$createOwnStreamConnectionWithOptions$1;->invoke(Ljava/lang/String;Ljava/util/Map;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/String;Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "errorMessage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connectionInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/discord/media/engine/MediaEngineModule$createOwnStreamConnectionWithOptions$1;->$callback:Lcom/facebook/react/bridge/Callback;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x1

    invoke-static {p2}, Lcom/discord/react/utilities/NativeMapExtensionsKt;->toNativeMap(Ljava/util/Map;)Lcom/facebook/react/bridge/WritableNativeMap;

    move-result-object p2

    aput-object p2, v1, p1

    invoke-interface {v0, v1}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    .line 3
    iget-object p1, p0, Lcom/discord/media/engine/MediaEngineModule$createOwnStreamConnectionWithOptions$1;->this$0:Lcom/discord/media/engine/MediaEngineModule;

    invoke-static {p1}, Lcom/discord/media/engine/MediaEngineModule;->access$getStreamPermissions$p(Lcom/discord/media/engine/MediaEngineModule;)Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Lcom/discord/media/engine/MediaEngineModule$createOwnStreamConnectionWithOptions$1;->this$0:Lcom/discord/media/engine/MediaEngineModule;

    iget v0, p0, Lcom/discord/media/engine/MediaEngineModule$createOwnStreamConnectionWithOptions$1;->$connectionId:I

    .line 4
    invoke-virtual {p2}, Lcom/discord/media/engine/MediaEngineModule;->getMediaEngine()Lcom/discord/media/engine/MediaEngine;

    move-result-object v1

    invoke-virtual {v1, v0, p1}, Lcom/discord/media/engine/MediaEngine;->connectionInstanceStartBroadcast$media_engine_release(ILandroid/content/Intent;)V

    const/4 p1, 0x0

    .line 5
    invoke-static {p2, p1}, Lcom/discord/media/engine/MediaEngineModule;->access$setStreamPermissions$p(Lcom/discord/media/engine/MediaEngineModule;Landroid/content/Intent;)V

    :cond_0
    return-void
.end method
