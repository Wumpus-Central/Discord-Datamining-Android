.class Lcom/swmansion/reanimated/ReanimatedModule$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/swmansion/reanimated/ReanimatedModule$UIThreadOperation;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/swmansion/reanimated/ReanimatedModule;->dropNode(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/swmansion/reanimated/ReanimatedModule;

.field final synthetic val$tag:I


# direct methods
.method constructor <init>(Lcom/swmansion/reanimated/ReanimatedModule;I)V
    .locals 0

    iput-object p1, p0, Lcom/swmansion/reanimated/ReanimatedModule$3;->this$0:Lcom/swmansion/reanimated/ReanimatedModule;

    iput p2, p0, Lcom/swmansion/reanimated/ReanimatedModule$3;->val$tag:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public execute(Lcom/swmansion/reanimated/NodesManager;)V
    .locals 1

    iget v0, p0, Lcom/swmansion/reanimated/ReanimatedModule$3;->val$tag:I

    invoke-virtual {p1, v0}, Lcom/swmansion/reanimated/NodesManager;->dropNode(I)V

    return-void
.end method
