.class public Lcom/facebook/react/uimanager/FabricViewStateManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/uimanager/FabricViewStateManager$StateUpdateCallback;,
        Lcom/facebook/react/uimanager/FabricViewStateManager$HasFabricViewStateManager;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "FabricViewStateManager"


# instance fields
.field private mStateWrapper:Lcom/facebook/react/uimanager/StateWrapper;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/facebook/react/uimanager/FabricViewStateManager;->mStateWrapper:Lcom/facebook/react/uimanager/StateWrapper;

    .line 6
    .line 7
    return-void
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
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
.end method

.method private setState(Lcom/facebook/react/uimanager/StateWrapper;Lcom/facebook/react/uimanager/FabricViewStateManager$StateUpdateCallback;I)V
    .locals 1

    if-nez p1, :cond_0

    const-string p1, "FabricViewStateManager"

    const-string p2, "setState called without a StateWrapper"

    .line 1
    invoke-static {p1, p2}, Lw3/a;->j(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/FabricViewStateManager;->mStateWrapper:Lcom/facebook/react/uimanager/StateWrapper;

    if-eq p1, v0, :cond_1

    return-void

    :cond_1
    const/16 v0, 0x3c

    if-le p3, v0, :cond_2

    return-void

    .line 3
    :cond_2
    invoke-interface {p2}, Lcom/facebook/react/uimanager/FabricViewStateManager$StateUpdateCallback;->getStateUpdate()Lcom/facebook/react/bridge/WritableMap;

    move-result-object p2

    if-nez p2, :cond_3

    return-void

    .line 4
    :cond_3
    invoke-interface {p1, p2}, Lcom/facebook/react/uimanager/StateWrapper;->updateState(Lcom/facebook/react/bridge/WritableMap;)V

    return-void
.end method


# virtual methods
.method public getStateData()Lcom/facebook/react/bridge/ReadableMap;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/uimanager/FabricViewStateManager;->mStateWrapper:Lcom/facebook/react/uimanager/StateWrapper;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/facebook/react/uimanager/StateWrapper;->getStateData()Lcom/facebook/react/bridge/ReadableNativeMap;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public hasStateWrapper()Z
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/uimanager/FabricViewStateManager;->mStateWrapper:Lcom/facebook/react/uimanager/StateWrapper;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setState(Lcom/facebook/react/uimanager/FabricViewStateManager$StateUpdateCallback;)V
    .locals 2

    .line 5
    iget-object v0, p0, Lcom/facebook/react/uimanager/FabricViewStateManager;->mStateWrapper:Lcom/facebook/react/uimanager/StateWrapper;

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, v1}, Lcom/facebook/react/uimanager/FabricViewStateManager;->setState(Lcom/facebook/react/uimanager/StateWrapper;Lcom/facebook/react/uimanager/FabricViewStateManager$StateUpdateCallback;I)V

    return-void
.end method

.method public setStateWrapper(Lcom/facebook/react/uimanager/StateWrapper;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/uimanager/FabricViewStateManager;->mStateWrapper:Lcom/facebook/react/uimanager/StateWrapper;

    return-void
.end method
