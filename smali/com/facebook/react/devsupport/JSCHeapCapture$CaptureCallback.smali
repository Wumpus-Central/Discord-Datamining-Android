.class public interface abstract Lcom/facebook/react/devsupport/JSCHeapCapture$CaptureCallback;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/devsupport/JSCHeapCapture;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "CaptureCallback"
.end annotation


# virtual methods
.method public abstract onFailure(Lcom/facebook/react/devsupport/JSCHeapCapture$CaptureException;)V
.end method

.method public abstract onSuccess(Ljava/io/File;)V
.end method
