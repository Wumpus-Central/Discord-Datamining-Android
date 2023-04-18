.class public abstract synthetic Lj$/time/chrono/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lj$/time/chrono/f;Lj$/time/temporal/a;)I
    .locals 2

    instance-of v0, p1, Lj$/time/temporal/a;

    if-eqz v0, :cond_2

    sget-object v0, Lj$/time/chrono/e;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    check-cast p0, Lj$/time/p;

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Lj$/time/p;->j()Lj$/time/LocalDateTime;

    move-result-object p0

    invoke-virtual {p0, p1}, Lj$/time/LocalDateTime;->e(Lj$/time/temporal/a;)I

    move-result p0

    return p0

    :cond_0
    invoke-virtual {p0}, Lj$/time/p;->f()Lj$/time/ZoneOffset;

    move-result-object p0

    invoke-virtual {p0}, Lj$/time/ZoneOffset;->g()I

    move-result p0

    return p0

    :cond_1
    new-instance p0, Lj$/time/temporal/p;

    const-string p1, "Invalid field \'InstantSeconds\' for get() method, use getLong() instead"

    invoke-direct {p0, p1}, Lj$/time/temporal/p;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p0, p1}, Lj$/time/temporal/j;->a(Lj$/time/temporal/k;Lj$/time/temporal/a;)I

    move-result p0

    return p0
.end method
