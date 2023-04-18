.class Lcom/swmansion/reanimated/nodes/OperatorNode$26;
.super Lcom/swmansion/reanimated/nodes/OperatorNode$CompOperator;
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

    invoke-direct {p0, v0}, Lcom/swmansion/reanimated/nodes/OperatorNode$CompOperator;-><init>(Lcom/swmansion/reanimated/nodes/OperatorNode$1;)V

    return-void
.end method


# virtual methods
.method public eval(Ljava/lang/Double;Ljava/lang/Double;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p1

    cmpg-double p1, v1, p1

    if-gez p1, :cond_1

    const/4 v0, 0x1

    :cond_1
    :goto_0
    return v0
.end method
