.class public interface abstract Lj$/util/Spliterator$OfInt;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj$/util/D;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj$/util/Spliterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "OfInt"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lj$/util/D;"
    }
.end annotation


# virtual methods
.method public abstract forEachRemaining(Lj$/util/function/Consumer;)V
.end method

.method public abstract forEachRemaining(Lj$/util/function/IntConsumer;)V
.end method

.method public abstract tryAdvance(Lj$/util/function/Consumer;)Z
.end method

.method public abstract tryAdvance(Lj$/util/function/IntConsumer;)Z
.end method

.method public abstract trySplit()Lj$/util/Spliterator$OfInt;
.end method
