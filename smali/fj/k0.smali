.class public abstract Lfj/k0;
.super Lfj/q;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<U:",
        "Ljava/lang/Object;",
        "T:",
        "Lfj/k0<",
        "TU;TT;>;>",
        "Lfj/q<",
        "TT;>;",
        "Ljava/lang/Comparable<",
        "TT;>;",
        "Ljava/io/Serializable;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lfj/q;-><init>()V

    return-void
.end method

.method private I(Ljava/lang/Object;)Lfj/m0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TU;)",
            "Lfj/m0<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lfj/k0;->H()Lfj/h0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lfj/h0;->P(Ljava/lang/Object;)Lfj/m0;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public abstract G(Lfj/k0;)I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)I"
        }
    .end annotation
.end method

.method protected abstract H()Lfj/h0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfj/h0<",
            "TU;TT;>;"
        }
    .end annotation
.end method

.method public J(JLjava/lang/Object;)Lfj/k0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JTU;)TT;"
        }
    .end annotation

    invoke-static {p1, p2}, Lnet/time4j/base/c;->k(J)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2, p3}, Lfj/k0;->K(JLjava/lang/Object;)Lfj/k0;

    move-result-object p1

    return-object p1
.end method

.method public K(JLjava/lang/Object;)Lfj/k0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JTU;)TT;"
        }
    .end annotation

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lfj/q;->w()Lfj/q;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lfj/k0;

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    :try_start_0
    invoke-direct {p0, p3}, Lfj/k0;->I(Ljava/lang/Object;)Lfj/m0;

    .line 15
    .line 16
    .line 17
    move-result-object p3

    .line 18
    invoke-virtual {p0}, Lfj/q;->w()Lfj/q;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-interface {p3, v0, p1, p2}, Lfj/m0;->b(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Lfj/k0;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    return-object p1

    .line 29
    :catch_0
    move-exception p1

    .line 30
    new-instance p2, Ljava/lang/ArithmeticException;

    .line 31
    .line 32
    const-string p3, "Result beyond boundaries of time axis."

    .line 33
    .line 34
    invoke-direct {p2, p3}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 38
    .line 39
    .line 40
    throw p2
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
.end method

.method public N(Lfj/k0;Ljava/lang/Object;)J
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TU;)J"
        }
    .end annotation

    invoke-direct {p0, p2}, Lfj/k0;->I(Ljava/lang/Object;)Lfj/m0;

    move-result-object p2

    invoke-virtual {p0}, Lfj/q;->w()Lfj/q;

    move-result-object v0

    invoke-interface {p2, v0, p1}, Lfj/m0;->a(Ljava/lang/Object;Ljava/lang/Object;)J

    move-result-wide p1

    return-wide p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lfj/k0;

    invoke-virtual {p0, p1}, Lfj/k0;->G(Lfj/k0;)I

    move-result p1

    return p1
.end method

.method protected bridge synthetic v()Lfj/x;
    .locals 1

    invoke-virtual {p0}, Lfj/k0;->H()Lfj/h0;

    move-result-object v0

    return-object v0
.end method
