.class public final Lcom/discord/media/engine/video/events/OnBroadcastRequestedEvent;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/discord/reactevents/ReactEvent;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/discord/media/engine/video/events/OnBroadcastRequestedEvent;",
        "Lcom/discord/reactevents/ReactEvent;",
        "()V",
        "serialize",
        "Lcom/facebook/react/bridge/WritableNativeMap;",
        "media_engine_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic serialize()Lcom/facebook/react/bridge/WritableMap;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/discord/media/engine/video/events/OnBroadcastRequestedEvent;->serialize()Lcom/facebook/react/bridge/WritableNativeMap;

    move-result-object v0

    return-object v0
.end method

.method public serialize()Lcom/facebook/react/bridge/WritableNativeMap;
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Lkotlin/Pair;

    .line 2
    invoke-static {v0}, Lcom/discord/react/utilities/NativeMapExtensionsKt;->nativeMapOf([Lkotlin/Pair;)Lcom/facebook/react/bridge/WritableNativeMap;

    move-result-object v0

    return-object v0
.end method
