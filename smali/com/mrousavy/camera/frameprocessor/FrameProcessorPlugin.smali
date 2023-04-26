.class public abstract Lcom/mrousavy/camera/frameprocessor/FrameProcessorPlugin;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation build Ld6/a;
.end annotation


# instance fields
.field private final mName:Ljava/lang/String;


# direct methods
.method protected constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/mrousavy/camera/frameprocessor/FrameProcessorPlugin;->mName:Ljava/lang/String;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
.end method

.method public static register(Lcom/mrousavy/camera/frameprocessor/FrameProcessorPlugin;)V
    .locals 1

    sget-object v0, Lcom/mrousavy/camera/frameprocessor/FrameProcessorRuntimeManager;->c:Lcom/mrousavy/camera/frameprocessor/FrameProcessorRuntimeManager$a;

    invoke-virtual {v0}, Lcom/mrousavy/camera/frameprocessor/FrameProcessorRuntimeManager$a;->b()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public abstract callback(Landroidx/camera/core/ImageProxy;[Ljava/lang/Object;)Ljava/lang/Object;
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation build Ld6/a;
    .end annotation
.end method

.method public getName()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation build Ld6/a;
    .end annotation

    iget-object v0, p0, Lcom/mrousavy/camera/frameprocessor/FrameProcessorPlugin;->mName:Ljava/lang/String;

    return-object v0
.end method
