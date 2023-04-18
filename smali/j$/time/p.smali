.class public final Lj$/time/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj$/time/temporal/k;
.implements Lj$/time/chrono/f;
.implements Ljava/io/Serializable;


# instance fields
.field private final a:Lj$/time/LocalDateTime;

.field private final b:Lj$/time/ZoneOffset;

.field private final c:Lj$/time/m;


# direct methods
.method private constructor <init>(Lj$/time/LocalDateTime;Lj$/time/ZoneOffset;Lj$/time/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj$/time/p;->a:Lj$/time/LocalDateTime;

    iput-object p2, p0, Lj$/time/p;->b:Lj$/time/ZoneOffset;

    iput-object p3, p0, Lj$/time/p;->c:Lj$/time/m;

    return-void
.end method

.method public static g(Lj$/time/Instant;Lj$/time/m;)Lj$/time/p;
    .locals 5

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lj$/time/Instant;->h()J

    move-result-wide v0

    invoke-virtual {p0}, Lj$/time/Instant;->i()I

    move-result p0

    .line 0
    move-object v2, p1

    check-cast v2, Lj$/time/ZoneOffset;

    .line 0
    invoke-static {v2}, Lj$/time/zone/c;->c(Lj$/time/ZoneOffset;)Lj$/time/zone/c;

    move-result-object v2

    int-to-long v3, p0

    .line 0
    invoke-static {v0, v1, v3, v4}, Lj$/time/Instant;->k(JJ)Lj$/time/Instant;

    move-result-object v3

    invoke-virtual {v2, v3}, Lj$/time/zone/c;->a(Lj$/time/Instant;)Lj$/time/ZoneOffset;

    move-result-object v2

    invoke-static {v0, v1, p0, v2}, Lj$/time/LocalDateTime;->i(JILj$/time/ZoneOffset;)Lj$/time/LocalDateTime;

    move-result-object p0

    new-instance v0, Lj$/time/p;

    invoke-direct {v0, p0, v2, p1}, Lj$/time/p;-><init>(Lj$/time/LocalDateTime;Lj$/time/ZoneOffset;Lj$/time/m;)V

    return-object v0

    .line 0
    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "instant"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final a(Lj$/time/temporal/l;)Lj$/time/temporal/q;
    .locals 1

    instance-of v0, p1, Lj$/time/temporal/a;

    if-eqz v0, :cond_2

    sget-object v0, Lj$/time/temporal/a;->INSTANT_SECONDS:Lj$/time/temporal/a;

    if-eq p1, v0, :cond_1

    sget-object v0, Lj$/time/temporal/a;->OFFSET_SECONDS:Lj$/time/temporal/a;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lj$/time/p;->a:Lj$/time/LocalDateTime;

    invoke-virtual {v0, p1}, Lj$/time/LocalDateTime;->a(Lj$/time/temporal/l;)Lj$/time/temporal/q;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Lj$/time/temporal/l;->d()Lj$/time/temporal/q;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-interface {p1, p0}, Lj$/time/temporal/l;->b(Lj$/time/temporal/k;)Lj$/time/temporal/q;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lj$/time/temporal/l;)Z
    .locals 1

    instance-of v0, p1, Lj$/time/temporal/a;

    if-nez v0, :cond_1

    if-eqz p1, :cond_0

    invoke-interface {p1, p0}, Lj$/time/temporal/l;->a(Lj$/time/temporal/k;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public final c(Lj$/time/temporal/l;)J
    .locals 2

    instance-of v0, p1, Lj$/time/temporal/a;

    if-eqz v0, :cond_2

    sget-object v0, Lj$/time/o;->a:[I

    move-object v1, p1

    check-cast v1, Lj$/time/temporal/a;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lj$/time/p;->a:Lj$/time/LocalDateTime;

    invoke-virtual {v0, p1}, Lj$/time/LocalDateTime;->c(Lj$/time/temporal/l;)J

    move-result-wide v0

    return-wide v0

    :cond_0
    iget-object p1, p0, Lj$/time/p;->b:Lj$/time/ZoneOffset;

    invoke-virtual {p1}, Lj$/time/ZoneOffset;->g()I

    move-result p1

    int-to-long v0, p1

    return-wide v0

    :cond_1
    invoke-virtual {p0}, Lj$/time/p;->h()J

    move-result-wide v0

    return-wide v0

    :cond_2
    invoke-interface {p1, p0}, Lj$/time/temporal/l;->f(Lj$/time/temporal/k;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 4

    .line 0
    check-cast p1, Lj$/time/chrono/f;

    .line 0
    invoke-virtual {p0}, Lj$/time/p;->h()J

    move-result-wide v0

    .line 0
    check-cast p1, Lj$/time/p;

    invoke-virtual {p1}, Lj$/time/p;->h()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Long;->compare(JJ)I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lj$/time/p;->k()Lj$/time/i;

    move-result-object v0

    invoke-virtual {v0}, Lj$/time/i;->h()I

    move-result v0

    invoke-virtual {p1}, Lj$/time/p;->k()Lj$/time/i;

    move-result-object v1

    invoke-virtual {v1}, Lj$/time/i;->h()I

    move-result v1

    sub-int/2addr v0, v1

    if-nez v0, :cond_0

    iget-object v0, p0, Lj$/time/p;->a:Lj$/time/LocalDateTime;

    iget-object v1, p1, Lj$/time/p;->a:Lj$/time/LocalDateTime;

    invoke-virtual {v0, v1}, Lj$/time/LocalDateTime;->f(Lj$/time/chrono/c;)I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lj$/time/p;->c:Lj$/time/m;

    invoke-virtual {v0}, Lj$/time/m;->f()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p1, Lj$/time/p;->c:Lj$/time/m;

    invoke-virtual {v1}, Lj$/time/m;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    .line 0
    invoke-virtual {p0}, Lj$/time/p;->i()Lj$/time/g;

    move-result-object v0

    .line 0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    sget-object v0, Lj$/time/chrono/h;->a:Lj$/time/chrono/h;

    .line 0
    invoke-virtual {p1}, Lj$/time/p;->i()Lj$/time/g;

    move-result-object p1

    .line 0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    :cond_0
    return v0
.end method

.method public final d(Lj$/time/temporal/n;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lj$/time/temporal/j;->e()Lj$/time/temporal/m;

    move-result-object v0

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, Lj$/time/p;->i()Lj$/time/g;

    move-result-object p1

    return-object p1

    .line 0
    :cond_0
    invoke-static {}, Lj$/time/temporal/j;->i()Lj$/time/temporal/m;

    move-result-object v0

    if-eq p1, v0, :cond_6

    invoke-static {}, Lj$/time/temporal/j;->j()Lj$/time/temporal/m;

    move-result-object v0

    if-ne p1, v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {}, Lj$/time/temporal/j;->g()Lj$/time/temporal/m;

    move-result-object v0

    if-ne p1, v0, :cond_2

    iget-object p1, p0, Lj$/time/p;->b:Lj$/time/ZoneOffset;

    goto :goto_1

    :cond_2
    invoke-static {}, Lj$/time/temporal/j;->f()Lj$/time/temporal/m;

    move-result-object v0

    if-ne p1, v0, :cond_3

    invoke-virtual {p0}, Lj$/time/p;->k()Lj$/time/i;

    move-result-object p1

    goto :goto_1

    :cond_3
    invoke-static {}, Lj$/time/temporal/j;->d()Lj$/time/temporal/m;

    move-result-object v0

    if-ne p1, v0, :cond_4

    .line 0
    invoke-virtual {p0}, Lj$/time/p;->i()Lj$/time/g;

    move-result-object p1

    .line 0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    sget-object p1, Lj$/time/chrono/h;->a:Lj$/time/chrono/h;

    goto :goto_1

    .line 0
    :cond_4
    invoke-static {}, Lj$/time/temporal/j;->h()Lj$/time/temporal/m;

    move-result-object v0

    if-ne p1, v0, :cond_5

    sget-object p1, Lj$/time/temporal/b;->NANOS:Lj$/time/temporal/b;

    goto :goto_1

    :cond_5
    invoke-interface {p1, p0}, Lj$/time/temporal/n;->a(Lj$/time/temporal/k;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_6
    :goto_0
    iget-object p1, p0, Lj$/time/p;->c:Lj$/time/m;

    :goto_1
    return-object p1
.end method

.method public final e(Lj$/time/temporal/a;)I
    .locals 2

    instance-of v0, p1, Lj$/time/temporal/a;

    if-eqz v0, :cond_2

    sget-object v0, Lj$/time/o;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lj$/time/p;->a:Lj$/time/LocalDateTime;

    invoke-virtual {v0, p1}, Lj$/time/LocalDateTime;->e(Lj$/time/temporal/a;)I

    move-result p1

    return p1

    :cond_0
    iget-object p1, p0, Lj$/time/p;->b:Lj$/time/ZoneOffset;

    invoke-virtual {p1}, Lj$/time/ZoneOffset;->g()I

    move-result p1

    return p1

    :cond_1
    new-instance p1, Lj$/time/temporal/p;

    const-string v0, "Invalid field \'InstantSeconds\' for get() method, use getLong() instead"

    invoke-direct {p1, v0}, Lj$/time/temporal/p;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p0, p1}, Lj$/time/chrono/d;->a(Lj$/time/chrono/f;Lj$/time/temporal/a;)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lj$/time/p;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, Lj$/time/p;

    iget-object v1, p1, Lj$/time/p;->a:Lj$/time/LocalDateTime;

    iget-object v3, p0, Lj$/time/p;->a:Lj$/time/LocalDateTime;

    invoke-virtual {v3, v1}, Lj$/time/LocalDateTime;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lj$/time/p;->b:Lj$/time/ZoneOffset;

    iget-object v3, p1, Lj$/time/p;->b:Lj$/time/ZoneOffset;

    invoke-virtual {v1, v3}, Lj$/time/ZoneOffset;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lj$/time/p;->c:Lj$/time/m;

    iget-object p1, p1, Lj$/time/p;->c:Lj$/time/m;

    invoke-virtual {v1, p1}, Lj$/time/m;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    return v0

    :cond_2
    return v2
.end method

.method public final f()Lj$/time/ZoneOffset;
    .locals 1

    iget-object v0, p0, Lj$/time/p;->b:Lj$/time/ZoneOffset;

    return-object v0
.end method

.method public final h()J
    .locals 4

    .line 0
    invoke-virtual {p0}, Lj$/time/p;->i()Lj$/time/g;

    move-result-object v0

    .line 0
    invoke-virtual {v0}, Lj$/time/g;->q()J

    move-result-wide v0

    const-wide/32 v2, 0x15180

    mul-long/2addr v0, v2

    invoke-virtual {p0}, Lj$/time/p;->k()Lj$/time/i;

    move-result-object v2

    invoke-virtual {v2}, Lj$/time/i;->l()I

    move-result v2

    int-to-long v2, v2

    add-long/2addr v0, v2

    invoke-virtual {p0}, Lj$/time/p;->f()Lj$/time/ZoneOffset;

    move-result-object v2

    invoke-virtual {v2}, Lj$/time/ZoneOffset;->g()I

    move-result v2

    int-to-long v2, v2

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lj$/time/p;->a:Lj$/time/LocalDateTime;

    invoke-virtual {v0}, Lj$/time/LocalDateTime;->hashCode()I

    move-result v0

    iget-object v1, p0, Lj$/time/p;->b:Lj$/time/ZoneOffset;

    invoke-virtual {v1}, Lj$/time/ZoneOffset;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    iget-object v1, p0, Lj$/time/p;->c:Lj$/time/m;

    invoke-virtual {v1}, Lj$/time/m;->hashCode()I

    move-result v1

    const/4 v2, 0x3

    invoke-static {v1, v2}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public final i()Lj$/time/g;
    .locals 1

    iget-object v0, p0, Lj$/time/p;->a:Lj$/time/LocalDateTime;

    invoke-virtual {v0}, Lj$/time/LocalDateTime;->k()Lj$/time/g;

    move-result-object v0

    return-object v0
.end method

.method public final j()Lj$/time/LocalDateTime;
    .locals 1

    iget-object v0, p0, Lj$/time/p;->a:Lj$/time/LocalDateTime;

    return-object v0
.end method

.method public final k()Lj$/time/i;
    .locals 1

    iget-object v0, p0, Lj$/time/p;->a:Lj$/time/LocalDateTime;

    invoke-virtual {v0}, Lj$/time/LocalDateTime;->m()Lj$/time/i;

    move-result-object v0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lj$/time/p;->a:Lj$/time/LocalDateTime;

    invoke-virtual {v1}, Lj$/time/LocalDateTime;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lj$/time/p;->b:Lj$/time/ZoneOffset;

    invoke-virtual {v1}, Lj$/time/ZoneOffset;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lj$/time/p;->c:Lj$/time/m;

    if-eq v1, v2, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x5b

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lj$/time/m;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x5d

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method
