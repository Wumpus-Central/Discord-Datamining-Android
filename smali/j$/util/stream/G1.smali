.class final Lj$/util/stream/G1;
.super Lj$/util/stream/t0;
.source "SourceFile"


# instance fields
.field final synthetic h:Lj$/util/function/w;

.field final synthetic i:I


# direct methods
.method constructor <init>(Lj$/util/stream/T2;Lj$/util/function/w;I)V
    .locals 0

    iput-object p2, p0, Lj$/util/stream/G1;->h:Lj$/util/function/w;

    iput p3, p0, Lj$/util/stream/G1;->i:I

    invoke-direct {p0, p1}, Lj$/util/stream/t0;-><init>(Lj$/util/stream/T2;)V

    return-void
.end method


# virtual methods
.method public final I0()Lj$/util/stream/N1;
    .locals 3

    .line 0
    new-instance v0, Lj$/util/stream/H1;

    iget v1, p0, Lj$/util/stream/G1;->i:I

    iget-object v2, p0, Lj$/util/stream/G1;->h:Lj$/util/function/w;

    invoke-direct {v0, v1, v2}, Lj$/util/stream/H1;-><init>(ILj$/util/function/w;)V

    return-object v0
.end method
