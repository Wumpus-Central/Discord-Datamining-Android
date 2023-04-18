.class public interface abstract Lfe/a;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract onCancelled(Ljava/lang/String;Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lge/a;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract onCompleted(Ljava/lang/String;Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lge/a;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract onError(Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Throwable;",
            "Ljava/util/List<",
            "Lge/a;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract onProgress(Ljava/lang/String;F)V
.end method

.method public abstract onStarted(Ljava/lang/String;)V
.end method
