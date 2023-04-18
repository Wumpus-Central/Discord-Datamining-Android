.class Lcom/facebook/react/animated/TransformAnimatedNode$StaticTransformConfig;
.super Lcom/facebook/react/animated/TransformAnimatedNode$TransformConfig;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/animated/TransformAnimatedNode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "StaticTransformConfig"
.end annotation


# instance fields
.field public mValue:D

.field final synthetic this$0:Lcom/facebook/react/animated/TransformAnimatedNode;


# direct methods
.method private constructor <init>(Lcom/facebook/react/animated/TransformAnimatedNode;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/facebook/react/animated/TransformAnimatedNode$StaticTransformConfig;->this$0:Lcom/facebook/react/animated/TransformAnimatedNode;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/react/animated/TransformAnimatedNode$TransformConfig;-><init>(Lcom/facebook/react/animated/TransformAnimatedNode;Lcom/facebook/react/animated/TransformAnimatedNode$1;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/react/animated/TransformAnimatedNode;Lcom/facebook/react/animated/TransformAnimatedNode$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/facebook/react/animated/TransformAnimatedNode$StaticTransformConfig;-><init>(Lcom/facebook/react/animated/TransformAnimatedNode;)V

    return-void
.end method
