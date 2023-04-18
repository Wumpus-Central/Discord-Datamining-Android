.class public final synthetic Lcom/mrousavy/camera/frameprocessor/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lcom/mrousavy/camera/frameprocessor/FrameProcessorRuntimeManager;


# direct methods
.method public synthetic constructor <init>(Lcom/mrousavy/camera/frameprocessor/FrameProcessorRuntimeManager;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/mrousavy/camera/frameprocessor/b;->k:Lcom/mrousavy/camera/frameprocessor/FrameProcessorRuntimeManager;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/mrousavy/camera/frameprocessor/b;->k:Lcom/mrousavy/camera/frameprocessor/FrameProcessorRuntimeManager;

    invoke-static {v0}, Lcom/mrousavy/camera/frameprocessor/FrameProcessorRuntimeManager;->a(Lcom/mrousavy/camera/frameprocessor/FrameProcessorRuntimeManager;)V

    return-void
.end method
