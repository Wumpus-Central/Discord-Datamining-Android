.class final Lj$/util/stream/K1;
.super Lj$/util/stream/t0;
.source "SourceFile"


# instance fields
.field final synthetic h:Lj$/util/function/K;

.field final synthetic i:J


# direct methods
.method constructor <init>(Lj$/util/stream/T2;Lj$/util/function/K;J)V
    .locals 0

    iput-object p2, p0, Lj$/util/stream/K1;->h:Lj$/util/function/K;

    iput-wide p3, p0, Lj$/util/stream/K1;->i:J

    invoke-direct {p0, p1}, Lj$/util/stream/t0;-><init>(Lj$/util/stream/T2;)V

    return-void
.end method


# virtual methods
.method public final I0()Lj$/util/stream/N1;
    .locals 4

    .line 0
    new-instance v0, Lj$/util/stream/L1;

    iget-wide v1, p0, Lj$/util/stream/K1;->i:J

    iget-object v3, p0, Lj$/util/stream/K1;->h:Lj$/util/function/K;

    invoke-direct {v0, v1, v2, v3}, Lj$/util/stream/L1;-><init>(JLj$/util/function/K;)V

    return-object v0
.end method
