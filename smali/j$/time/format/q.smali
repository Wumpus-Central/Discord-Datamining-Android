.class final Lj$/time/format/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj$/time/temporal/k;


# instance fields
.field final synthetic a:Lj$/time/chrono/b;

.field final synthetic b:Lj$/time/temporal/k;

.field final synthetic c:Lj$/time/chrono/g;

.field final synthetic d:Lj$/time/m;


# direct methods
.method constructor <init>(Lj$/time/g;Lj$/time/temporal/k;Lj$/time/chrono/g;Lj$/time/m;)V
    .locals 0

    iput-object p1, p0, Lj$/time/format/q;->a:Lj$/time/chrono/b;

    iput-object p2, p0, Lj$/time/format/q;->b:Lj$/time/temporal/k;

    iput-object p3, p0, Lj$/time/format/q;->c:Lj$/time/chrono/g;

    iput-object p4, p0, Lj$/time/format/q;->d:Lj$/time/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lj$/time/temporal/l;)Lj$/time/temporal/q;
    .locals 2

    iget-object v0, p0, Lj$/time/format/q;->a:Lj$/time/chrono/b;

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lj$/time/temporal/l;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    check-cast v0, Lj$/time/g;

    invoke-virtual {v0, p1}, Lj$/time/g;->a(Lj$/time/temporal/l;)Lj$/time/temporal/q;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lj$/time/format/q;->b:Lj$/time/temporal/k;

    invoke-interface {v0, p1}, Lj$/time/temporal/k;->a(Lj$/time/temporal/l;)Lj$/time/temporal/q;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lj$/time/temporal/l;)Z
    .locals 2

    iget-object v0, p0, Lj$/time/format/q;->a:Lj$/time/chrono/b;

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lj$/time/temporal/l;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    check-cast v0, Lj$/time/g;

    invoke-virtual {v0, p1}, Lj$/time/g;->b(Lj$/time/temporal/l;)Z

    move-result p1

    return p1

    :cond_0
    iget-object v0, p0, Lj$/time/format/q;->b:Lj$/time/temporal/k;

    invoke-interface {v0, p1}, Lj$/time/temporal/k;->b(Lj$/time/temporal/l;)Z

    move-result p1

    return p1
.end method

.method public final c(Lj$/time/temporal/l;)J
    .locals 2

    iget-object v0, p0, Lj$/time/format/q;->a:Lj$/time/chrono/b;

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lj$/time/temporal/l;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    check-cast v0, Lj$/time/g;

    invoke-virtual {v0, p1}, Lj$/time/g;->c(Lj$/time/temporal/l;)J

    move-result-wide v0

    return-wide v0

    :cond_0
    iget-object v0, p0, Lj$/time/format/q;->b:Lj$/time/temporal/k;

    invoke-interface {v0, p1}, Lj$/time/temporal/k;->c(Lj$/time/temporal/l;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final d(Lj$/time/temporal/n;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lj$/time/temporal/j;->d()Lj$/time/temporal/m;

    move-result-object v0

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lj$/time/format/q;->c:Lj$/time/chrono/g;

    return-object p1

    :cond_0
    invoke-static {}, Lj$/time/temporal/j;->j()Lj$/time/temporal/m;

    move-result-object v0

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lj$/time/format/q;->d:Lj$/time/m;

    return-object p1

    :cond_1
    invoke-static {}, Lj$/time/temporal/j;->h()Lj$/time/temporal/m;

    move-result-object v0

    if-ne p1, v0, :cond_2

    iget-object v0, p0, Lj$/time/format/q;->b:Lj$/time/temporal/k;

    invoke-interface {v0, p1}, Lj$/time/temporal/k;->d(Lj$/time/temporal/n;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-interface {p1, p0}, Lj$/time/temporal/n;->a(Lj$/time/temporal/k;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic e(Lj$/time/temporal/a;)I
    .locals 0

    invoke-static {p0, p1}, Lj$/time/temporal/j;->a(Lj$/time/temporal/k;Lj$/time/temporal/a;)I

    move-result p1

    return p1
.end method
