.class final Lj$/util/stream/H0;
.super Lj$/util/stream/J0;
.source "SourceFile"


# static fields
.field public static final synthetic k:I


# direct methods
.method public constructor <init>(ILj$/util/Spliterator;Lj$/util/stream/t0;)V
    .locals 2

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v1, 0x2

    if-eq p1, v1, :cond_0

    .line 0
    new-instance p1, Lj$/util/stream/b;

    const/16 v0, 0x1b

    invoke-direct {p1, v0}, Lj$/util/stream/b;-><init>(I)V

    new-instance v0, Lj$/util/stream/b;

    const/16 v1, 0x1c

    invoke-direct {v0, v1}, Lj$/util/stream/b;-><init>(I)V

    invoke-direct {p0, p3, p2, p1, v0}, Lj$/util/stream/J0;-><init>(Lj$/util/stream/t0;Lj$/util/Spliterator;Lj$/util/function/O;Lj$/util/function/d;)V

    return-void

    .line 0
    :cond_0
    new-instance p1, Lj$/util/stream/I0;

    invoke-direct {p1, v0}, Lj$/util/stream/I0;-><init>(I)V

    new-instance v0, Lj$/util/stream/I0;

    invoke-direct {v0, v1}, Lj$/util/stream/I0;-><init>(I)V

    invoke-direct {p0, p3, p2, p1, v0}, Lj$/util/stream/J0;-><init>(Lj$/util/stream/t0;Lj$/util/Spliterator;Lj$/util/function/O;Lj$/util/function/d;)V

    return-void

    .line 0
    :cond_1
    new-instance p1, Lj$/util/stream/b;

    const/16 v0, 0x1d

    invoke-direct {p1, v0}, Lj$/util/stream/b;-><init>(I)V

    new-instance v0, Lj$/util/stream/I0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lj$/util/stream/I0;-><init>(I)V

    invoke-direct {p0, p3, p2, p1, v0}, Lj$/util/stream/J0;-><init>(Lj$/util/stream/t0;Lj$/util/Spliterator;Lj$/util/function/O;Lj$/util/function/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Lj$/util/Spliterator;Lj$/util/function/IntFunction;Lj$/util/stream/t0;)V
    .locals 2

    new-instance v0, Lj$/util/stream/a;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p2}, Lj$/util/stream/a;-><init>(ILjava/lang/Object;)V

    new-instance p2, Lj$/util/stream/I0;

    const/4 v1, 0x3

    invoke-direct {p2, v1}, Lj$/util/stream/I0;-><init>(I)V

    invoke-direct {p0, p3, p1, v0, p2}, Lj$/util/stream/J0;-><init>(Lj$/util/stream/t0;Lj$/util/Spliterator;Lj$/util/function/O;Lj$/util/function/d;)V

    return-void
.end method
