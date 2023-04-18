.class final Lj$/util/stream/n;
.super Lj$/util/stream/a2;
.source "SourceFile"


# instance fields
.field b:Z

.field c:Ljava/lang/Object;


# direct methods
.method constructor <init>(Lj$/util/stream/e2;)V
    .locals 0

    invoke-direct {p0, p1}, Lj$/util/stream/a2;-><init>(Lj$/util/stream/e2;)V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lj$/util/stream/a2;->a:Lj$/util/stream/e2;

    if-nez p1, :cond_0

    iget-boolean p1, p0, Lj$/util/stream/n;->b:Z

    if-nez p1, :cond_2

    const/4 p1, 0x1

    iput-boolean p1, p0, Lj$/util/stream/n;->b:Z

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lj$/util/stream/n;->c:Ljava/lang/Object;

    if-eqz v1, :cond_1

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    :cond_1
    :goto_0
    iput-object p1, p0, Lj$/util/stream/n;->c:Ljava/lang/Object;

    invoke-interface {v0, p1}, Lj$/util/function/Consumer;->accept(Ljava/lang/Object;)V

    :cond_2
    return-void
.end method

.method public final c(J)V
    .locals 2

    const/4 p1, 0x0

    iput-boolean p1, p0, Lj$/util/stream/n;->b:Z

    const/4 p1, 0x0

    iput-object p1, p0, Lj$/util/stream/n;->c:Ljava/lang/Object;

    iget-object p1, p0, Lj$/util/stream/a2;->a:Lj$/util/stream/e2;

    const-wide/16 v0, -0x1

    invoke-interface {p1, v0, v1}, Lj$/util/stream/e2;->c(J)V

    return-void
.end method

.method public final end()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lj$/util/stream/n;->b:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lj$/util/stream/n;->c:Ljava/lang/Object;

    iget-object v0, p0, Lj$/util/stream/a2;->a:Lj$/util/stream/e2;

    invoke-interface {v0}, Lj$/util/stream/e2;->end()V

    return-void
.end method
