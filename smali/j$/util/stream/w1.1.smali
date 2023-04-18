.class final Lj$/util/stream/w1;
.super Lj$/util/stream/t0;
.source "SourceFile"


# instance fields
.field final synthetic h:Lj$/util/function/g;

.field final synthetic i:D


# direct methods
.method constructor <init>(Lj$/util/stream/T2;Lj$/util/function/f;D)V
    .locals 0

    iput-object p2, p0, Lj$/util/stream/w1;->h:Lj$/util/function/g;

    iput-wide p3, p0, Lj$/util/stream/w1;->i:D

    invoke-direct {p0, p1}, Lj$/util/stream/t0;-><init>(Lj$/util/stream/T2;)V

    return-void
.end method


# virtual methods
.method public final I0()Lj$/util/stream/N1;
    .locals 4

    .line 0
    new-instance v0, Lj$/util/stream/x1;

    iget-wide v1, p0, Lj$/util/stream/w1;->i:D

    iget-object v3, p0, Lj$/util/stream/w1;->h:Lj$/util/function/g;

    invoke-direct {v0, v1, v2, v3}, Lj$/util/stream/x1;-><init>(DLj$/util/function/g;)V

    return-object v0
.end method
