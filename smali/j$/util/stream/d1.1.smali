.class final Lj$/util/stream/d1;
.super Lj$/util/stream/e1;
.source "SourceFile"

# interfaces
.implements Lj$/util/B;


# direct methods
.method constructor <init>(Lj$/util/stream/A0;)V
    .locals 0

    invoke-direct {p0, p1}, Lj$/util/stream/e1;-><init>(Lj$/util/stream/B0;)V

    return-void
.end method


# virtual methods
.method public final synthetic forEachRemaining(Lj$/util/function/Consumer;)V
    .locals 0

    invoke-static {p0, p1}, Lj$/util/n;->e(Lj$/util/B;Lj$/util/function/Consumer;)V

    return-void
.end method

.method public final synthetic tryAdvance(Lj$/util/function/Consumer;)Z
    .locals 0

    invoke-static {p0, p1}, Lj$/util/n;->j(Lj$/util/B;Lj$/util/function/Consumer;)Z

    move-result p1

    return p1
.end method
