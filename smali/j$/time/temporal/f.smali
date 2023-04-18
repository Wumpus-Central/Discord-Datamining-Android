.class final enum Lj$/time/temporal/f;
.super Lj$/time/temporal/g;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 2

    const-string v0, "WEEK_BASED_YEAR"

    const/4 v1, 0x3

    invoke-direct {p0, v0, v1}, Lj$/time/temporal/g;-><init>(Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final a(Lj$/time/temporal/k;)Z
    .locals 1

    sget-object v0, Lj$/time/temporal/a;->EPOCH_DAY:Lj$/time/temporal/a;

    invoke-interface {p1, v0}, Lj$/time/temporal/k;->b(Lj$/time/temporal/l;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lj$/time/temporal/g;->g(Lj$/time/temporal/k;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final d()Lj$/time/temporal/q;
    .locals 1

    sget-object v0, Lj$/time/temporal/a;->YEAR:Lj$/time/temporal/a;

    invoke-virtual {v0}, Lj$/time/temporal/a;->d()Lj$/time/temporal/q;

    move-result-object v0

    return-object v0
.end method

.method public final f(Lj$/time/temporal/k;)J
    .locals 2

    invoke-virtual {p0, p1}, Lj$/time/temporal/f;->a(Lj$/time/temporal/k;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lj$/time/g;->h(Lj$/time/temporal/k;)Lj$/time/g;

    move-result-object p1

    invoke-static {p1}, Lj$/time/temporal/g;->k(Lj$/time/g;)I

    move-result p1

    int-to-long v0, p1

    return-wide v0

    :cond_0
    new-instance p1, Lj$/time/temporal/p;

    const-string v0, "Unsupported field: WeekBasedYear"

    invoke-direct {p1, v0}, Lj$/time/temporal/p;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "WeekBasedYear"

    return-object v0
.end method
