.class abstract Lcom/swmansion/reanimated/nodes/OperatorNode$SingleOperator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/swmansion/reanimated/nodes/OperatorNode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "SingleOperator"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/swmansion/reanimated/nodes/OperatorNode$1;)V
    .locals 0

    invoke-direct {p0}, Lcom/swmansion/reanimated/nodes/OperatorNode$SingleOperator;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract eval(Ljava/lang/Double;)D
.end method

.method public evaluate([Lcom/swmansion/reanimated/nodes/Node;)D
    .locals 2

    const/4 v0, 0x0

    aget-object p1, p1, v0

    invoke-virtual {p1}, Lcom/swmansion/reanimated/nodes/Node;->value()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Double;

    invoke-virtual {p0, p1}, Lcom/swmansion/reanimated/nodes/OperatorNode$SingleOperator;->eval(Ljava/lang/Double;)D

    move-result-wide v0

    return-wide v0
.end method
