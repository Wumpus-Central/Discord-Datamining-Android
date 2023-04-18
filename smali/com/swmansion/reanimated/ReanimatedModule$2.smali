.class Lcom/swmansion/reanimated/ReanimatedModule$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/swmansion/reanimated/ReanimatedModule$UIThreadOperation;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/swmansion/reanimated/ReanimatedModule;->createNode(ILcom/facebook/react/bridge/ReadableMap;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/swmansion/reanimated/ReanimatedModule;

.field final synthetic val$config:Lcom/facebook/react/bridge/ReadableMap;

.field final synthetic val$tag:I


# direct methods
.method constructor <init>(Lcom/swmansion/reanimated/ReanimatedModule;ILcom/facebook/react/bridge/ReadableMap;)V
    .locals 0

    iput-object p1, p0, Lcom/swmansion/reanimated/ReanimatedModule$2;->this$0:Lcom/swmansion/reanimated/ReanimatedModule;

    iput p2, p0, Lcom/swmansion/reanimated/ReanimatedModule$2;->val$tag:I

    iput-object p3, p0, Lcom/swmansion/reanimated/ReanimatedModule$2;->val$config:Lcom/facebook/react/bridge/ReadableMap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public execute(Lcom/swmansion/reanimated/NodesManager;)V
    .locals 2

    iget v0, p0, Lcom/swmansion/reanimated/ReanimatedModule$2;->val$tag:I

    iget-object v1, p0, Lcom/swmansion/reanimated/ReanimatedModule$2;->val$config:Lcom/facebook/react/bridge/ReadableMap;

    invoke-virtual {p1, v0, v1}, Lcom/swmansion/reanimated/NodesManager;->createNode(ILcom/facebook/react/bridge/ReadableMap;)V

    return-void
.end method
