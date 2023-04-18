.class public interface abstract Lcom/facebook/imagepipeline/listener/RequestListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/imagepipeline/producers/o0;


# virtual methods
.method public abstract onRequestCancellation(Ljava/lang/String;)V
.end method

.method public abstract onRequestFailure(Lcom/facebook/imagepipeline/request/ImageRequest;Ljava/lang/String;Ljava/lang/Throwable;Z)V
.end method

.method public abstract onRequestStart(Lcom/facebook/imagepipeline/request/ImageRequest;Ljava/lang/Object;Ljava/lang/String;Z)V
.end method

.method public abstract onRequestSuccess(Lcom/facebook/imagepipeline/request/ImageRequest;Ljava/lang/String;Z)V
.end method
