.class final Lj$/util/stream/N;
.super Lj$/util/stream/P;
.source "SourceFile"

# interfaces
.implements Lj$/util/stream/d2;


# instance fields
.field final b:Lj$/util/function/M;


# direct methods
.method constructor <init>(Lj$/util/function/M;Z)V
    .locals 0

    invoke-direct {p0, p2}, Lj$/util/stream/P;-><init>(Z)V

    iput-object p1, p0, Lj$/util/stream/N;->b:Lj$/util/function/M;

    return-void
.end method


# virtual methods
.method public final accept(J)V
    .locals 1

    iget-object v0, p0, Lj$/util/stream/N;->b:Lj$/util/function/M;

    invoke-interface {v0, p1, p2}, Lj$/util/function/M;->accept(J)V

    return-void
.end method

.method public final bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lj$/util/stream/t0;->U(Lj$/util/stream/d2;Ljava/lang/Object;)V

    return-void
.end method

.method public final synthetic j(Ljava/lang/Long;)V
    .locals 0

    invoke-static {p0, p1}, Lj$/util/stream/t0;->T(Lj$/util/stream/d2;Ljava/lang/Long;)V

    return-void
.end method
