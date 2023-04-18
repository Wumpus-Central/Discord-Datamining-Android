.class Lcom/swmansion/reanimated/nodes/OperatorNode$9;
.super Lcom/swmansion/reanimated/nodes/OperatorNode$SingleOperator;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/swmansion/reanimated/nodes/OperatorNode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/swmansion/reanimated/nodes/OperatorNode$SingleOperator;-><init>(Lcom/swmansion/reanimated/nodes/OperatorNode$1;)V

    return-void
.end method


# virtual methods
.method public eval(Ljava/lang/Double;)D
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    move-result-wide v0

    return-wide v0
.end method
