.class abstract Lcom/swmansion/reanimated/nodes/OperatorNode$ReduceOperator;
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
    name = "ReduceOperator"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/swmansion/reanimated/nodes/OperatorNode$1;)V
    .locals 0

    invoke-direct {p0}, Lcom/swmansion/reanimated/nodes/OperatorNode$ReduceOperator;-><init>()V

    return-void
.end method


# virtual methods
.method public evaluate([Lcom/swmansion/reanimated/nodes/Node;)D
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    aget-object v0, p1, v0

    .line 3
    .line 4
    invoke-virtual {v0}, Lcom/swmansion/reanimated/nodes/Node;->doubleValue()Ljava/lang/Double;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    const/4 v2, 0x1

    .line 13
    :goto_0
    array-length v3, p1

    .line 14
    if-ge v2, v3, :cond_0

    .line 15
    .line 16
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    aget-object v1, p1, v2

    .line 21
    .line 22
    invoke-virtual {v1}, Lcom/swmansion/reanimated/nodes/Node;->doubleValue()Ljava/lang/Double;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {p0, v0, v1}, Lcom/swmansion/reanimated/nodes/OperatorNode$ReduceOperator;->reduce(Ljava/lang/Double;Ljava/lang/Double;)D

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    add-int/lit8 v2, v2, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    return-wide v0
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
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method public abstract reduce(Ljava/lang/Double;Ljava/lang/Double;)D
.end method
