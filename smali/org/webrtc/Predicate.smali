.class public interface abstract Lorg/webrtc/Predicate;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# virtual methods
.method public abstract and(Lorg/webrtc/Predicate;)Lorg/webrtc/Predicate;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/webrtc/Predicate<",
            "-TT;>;)",
            "Lorg/webrtc/Predicate<",
            "TT;>;"
        }
    .end annotation
.end method

.method public abstract negate()Lorg/webrtc/Predicate;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lorg/webrtc/Predicate<",
            "TT;>;"
        }
    .end annotation
.end method

.method public abstract or(Lorg/webrtc/Predicate;)Lorg/webrtc/Predicate;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/webrtc/Predicate<",
            "-TT;>;)",
            "Lorg/webrtc/Predicate<",
            "TT;>;"
        }
    .end annotation
.end method

.method public abstract test(Ljava/lang/Object;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation
.end method
