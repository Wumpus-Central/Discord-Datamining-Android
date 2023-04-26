.class Lcom/swmansion/reanimated/ReanimatedModule$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/uimanager/UIBlock;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/swmansion/reanimated/ReanimatedModule;->willDispatchViewUpdates(Lcom/facebook/react/uimanager/UIManagerModule;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/swmansion/reanimated/ReanimatedModule;

.field final synthetic val$operations:Ljava/util/ArrayList;


# direct methods
.method constructor <init>(Lcom/swmansion/reanimated/ReanimatedModule;Ljava/util/ArrayList;)V
    .locals 0

    iput-object p1, p0, Lcom/swmansion/reanimated/ReanimatedModule$1;->this$0:Lcom/swmansion/reanimated/ReanimatedModule;

    iput-object p2, p0, Lcom/swmansion/reanimated/ReanimatedModule$1;->val$operations:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public execute(Lcom/facebook/react/uimanager/NativeViewHierarchyManager;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/swmansion/reanimated/ReanimatedModule$1;->this$0:Lcom/swmansion/reanimated/ReanimatedModule;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/swmansion/reanimated/ReanimatedModule;->getNodesManager()Lcom/swmansion/reanimated/NodesManager;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Lcom/swmansion/reanimated/ReanimatedModule$1;->val$operations:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lcom/swmansion/reanimated/ReanimatedModule$UIThreadOperation;

    .line 24
    .line 25
    invoke-interface {v1, p1}, Lcom/swmansion/reanimated/ReanimatedModule$UIThreadOperation;->execute(Lcom/swmansion/reanimated/NodesManager;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return-void
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
.end method
