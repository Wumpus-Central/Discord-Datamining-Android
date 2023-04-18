.class Lcom/swmansion/reanimated/ReanimatedModule$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/swmansion/reanimated/ReanimatedModule$UIThreadOperation;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/swmansion/reanimated/ReanimatedModule;->detachEvent(ILjava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/swmansion/reanimated/ReanimatedModule;

.field final synthetic val$eventName:Ljava/lang/String;

.field final synthetic val$eventNodeID:I

.field final synthetic val$viewTag:I


# direct methods
.method constructor <init>(Lcom/swmansion/reanimated/ReanimatedModule;ILjava/lang/String;I)V
    .locals 0

    iput-object p1, p0, Lcom/swmansion/reanimated/ReanimatedModule$9;->this$0:Lcom/swmansion/reanimated/ReanimatedModule;

    iput p2, p0, Lcom/swmansion/reanimated/ReanimatedModule$9;->val$viewTag:I

    iput-object p3, p0, Lcom/swmansion/reanimated/ReanimatedModule$9;->val$eventName:Ljava/lang/String;

    iput p4, p0, Lcom/swmansion/reanimated/ReanimatedModule$9;->val$eventNodeID:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public execute(Lcom/swmansion/reanimated/NodesManager;)V
    .locals 3

    iget v0, p0, Lcom/swmansion/reanimated/ReanimatedModule$9;->val$viewTag:I

    iget-object v1, p0, Lcom/swmansion/reanimated/ReanimatedModule$9;->val$eventName:Ljava/lang/String;

    iget v2, p0, Lcom/swmansion/reanimated/ReanimatedModule$9;->val$eventNodeID:I

    invoke-virtual {p1, v0, v1, v2}, Lcom/swmansion/reanimated/NodesManager;->detachEvent(ILjava/lang/String;I)V

    return-void
.end method
