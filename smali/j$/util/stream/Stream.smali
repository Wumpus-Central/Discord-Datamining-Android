.class public interface abstract Lj$/util/stream/Stream;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj$/util/stream/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lj$/util/stream/h;"
    }
.end annotation


# virtual methods
.method public abstract D(Lj$/util/function/Predicate;)Z
.end method

.method public abstract E(Lj$/util/function/Function;)Lj$/util/stream/k0;
.end method

.method public abstract I(Lj$/util/function/Predicate;)Z
.end method

.method public abstract J(Lj$/util/function/ToLongFunction;)Lj$/util/stream/k0;
.end method

.method public abstract L(Lj$/util/function/ToDoubleFunction;)Lj$/util/stream/D;
.end method

.method public abstract a(Lj$/util/function/Function;)Lj$/util/stream/IntStream;
.end method

.method public abstract c(Ljava/lang/Object;Lj$/util/function/c;)Ljava/lang/Object;
.end method

.method public abstract count()J
.end method

.method public abstract d(Lj$/util/stream/j;)Ljava/lang/Object;
.end method

.method public abstract distinct()Lj$/util/stream/Stream;
.end method

.method public abstract e(Lj$/util/function/g0;Lj$/util/function/BiConsumer;Lj$/util/function/BiConsumer;)Ljava/lang/Object;
.end method

.method public abstract f(Lj$/util/function/Function;)Lj$/util/stream/D;
.end method

.method public abstract filter(Lj$/util/function/Predicate;)Lj$/util/stream/Stream;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj$/util/function/Predicate<",
            "-TT;>;)",
            "Lj$/util/stream/Stream<",
            "TT;>;"
        }
    .end annotation
.end method

.method public abstract findAny()Lj$/util/h;
.end method

.method public abstract findFirst()Lj$/util/h;
.end method

.method public abstract forEach(Lj$/util/function/Consumer;)V
.end method

.method public abstract h(Ljava/lang/Object;Lj$/util/function/BiFunction;Lj$/util/function/c;)Ljava/lang/Object;
.end method

.method public abstract j(Lj$/util/function/Consumer;)Lj$/util/stream/Stream;
.end method

.method public abstract limit(J)Lj$/util/stream/Stream;
.end method

.method public abstract max(Ljava/util/Comparator;)Lj$/util/h;
.end method

.method public abstract min(Ljava/util/Comparator;)Lj$/util/h;
.end method

.method public abstract p(Lj$/util/function/Predicate;)Z
.end method

.method public abstract s(Lj$/util/function/Consumer;)V
.end method

.method public abstract skip(J)Lj$/util/stream/Stream;
.end method

.method public abstract sorted()Lj$/util/stream/Stream;
.end method

.method public abstract sorted(Ljava/util/Comparator;)Lj$/util/stream/Stream;
.end method

.method public abstract toArray()[Ljava/lang/Object;
.end method

.method public abstract toArray(Lj$/util/function/IntFunction;)[Ljava/lang/Object;
.end method

.method public abstract u(Lj$/util/function/ToIntFunction;)Lj$/util/stream/IntStream;
.end method

.method public abstract v(Lj$/util/function/Function;)Lj$/util/stream/Stream;
.end method

.method public abstract w(Lj$/util/function/Function;)Lj$/util/stream/Stream;
.end method

.method public abstract x(Lj$/util/function/d;)Lj$/util/h;
.end method
