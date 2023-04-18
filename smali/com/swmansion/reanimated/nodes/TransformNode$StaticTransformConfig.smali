.class Lcom/swmansion/reanimated/nodes/TransformNode$StaticTransformConfig;
.super Lcom/swmansion/reanimated/nodes/TransformNode$TransformConfig;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/swmansion/reanimated/nodes/TransformNode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "StaticTransformConfig"
.end annotation


# instance fields
.field public value:Ljava/lang/Object;


# direct methods
.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lcom/swmansion/reanimated/nodes/TransformNode$TransformConfig;-><init>(Lcom/swmansion/reanimated/nodes/TransformNode$1;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/swmansion/reanimated/nodes/TransformNode$1;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/swmansion/reanimated/nodes/TransformNode$StaticTransformConfig;-><init>()V

    return-void
.end method


# virtual methods
.method public getValue(Lcom/swmansion/reanimated/NodesManager;)Ljava/lang/Object;
    .locals 0

    iget-object p1, p0, Lcom/swmansion/reanimated/nodes/TransformNode$StaticTransformConfig;->value:Ljava/lang/Object;

    return-object p1
.end method
