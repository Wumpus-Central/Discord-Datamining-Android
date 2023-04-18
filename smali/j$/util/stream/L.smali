.class final Lj$/util/stream/L;
.super Lj$/util/stream/P;
.source "SourceFile"

# interfaces
.implements Lj$/util/stream/b2;


# instance fields
.field final b:Lj$/util/function/i;


# direct methods
.method constructor <init>(Lj$/util/function/i;Z)V
    .locals 0

    invoke-direct {p0, p2}, Lj$/util/stream/P;-><init>(Z)V

    iput-object p1, p0, Lj$/util/stream/L;->b:Lj$/util/function/i;

    return-void
.end method


# virtual methods
.method public final accept(D)V
    .locals 1

    iget-object v0, p0, Lj$/util/stream/L;->b:Lj$/util/function/i;

    invoke-interface {v0, p1, p2}, Lj$/util/function/i;->accept(D)V

    return-void
.end method

.method public final bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lj$/util/stream/t0;->Q(Lj$/util/stream/b2;Ljava/lang/Object;)V

    return-void
.end method

.method public final synthetic k(Ljava/lang/Double;)V
    .locals 0

    invoke-static {p0, p1}, Lj$/util/stream/t0;->P(Lj$/util/stream/b2;Ljava/lang/Double;)V

    return-void
.end method
