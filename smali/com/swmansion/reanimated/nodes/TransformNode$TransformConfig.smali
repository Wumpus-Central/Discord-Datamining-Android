.class abstract Lcom/swmansion/reanimated/nodes/TransformNode$TransformConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/swmansion/reanimated/nodes/TransformNode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "TransformConfig"
.end annotation


# instance fields
.field public propertyName:Ljava/lang/String;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/swmansion/reanimated/nodes/TransformNode$1;)V
    .locals 0

    invoke-direct {p0}, Lcom/swmansion/reanimated/nodes/TransformNode$TransformConfig;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract getValue(Lcom/swmansion/reanimated/NodesManager;)Ljava/lang/Object;
.end method
