.class public final Lj$/time/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj$/time/temporal/k;
.implements Lj$/time/chrono/b;
.implements Ljava/io/Serializable;


# static fields
.field public static final d:Lj$/time/g;

.field public static final e:Lj$/time/g;


# instance fields
.field private final a:I

.field private final b:S

.field private final c:S


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const v0, -0x3b9ac9ff

    const/4 v1, 0x1

    invoke-static {v0, v1, v1}, Lj$/time/g;->n(III)Lj$/time/g;

    move-result-object v0

    sput-object v0, Lj$/time/g;->d:Lj$/time/g;

    const/16 v0, 0xc

    const/16 v1, 0x1f

    const v2, 0x3b9ac9ff

    invoke-static {v2, v0, v1}, Lj$/time/g;->n(III)Lj$/time/g;

    move-result-object v0

    sput-object v0, Lj$/time/g;->e:Lj$/time/g;

    return-void
.end method

.method private constructor <init>(III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lj$/time/g;->a:I

    int-to-short p1, p2

    iput-short p1, p0, Lj$/time/g;->b:S

    int-to-short p1, p3

    iput-short p1, p0, Lj$/time/g;->c:S

    return-void
.end method

.method public static h(Lj$/time/temporal/k;)Lj$/time/g;
    .locals 3

    if-eqz p0, :cond_1

    invoke-static {}, Lj$/time/temporal/j;->e()Lj$/time/temporal/m;

    move-result-object v0

    invoke-interface {p0, v0}, Lj$/time/temporal/k;->d(Lj$/time/temporal/n;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj$/time/g;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lj$/time/b;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unable to obtain LocalDate from TemporalAccessor: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " of type "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lj$/time/b;-><init>(Ljava/lang/String;)V

    throw v0

    .line 0
    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "temporal"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private i(Lj$/time/temporal/l;)I
    .locals 4

    sget-object v0, Lj$/time/f;->a:[I

    move-object v1, p1

    check-cast v1, Lj$/time/temporal/a;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    iget v1, p0, Lj$/time/g;->a:I

    iget-short v2, p0, Lj$/time/g;->c:S

    const/4 v3, 0x1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lj$/time/temporal/p;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unsupported field: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lj$/time/temporal/p;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    if-lt v1, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    return v3

    :pswitch_1
    return v1

    :pswitch_2
    new-instance p1, Lj$/time/temporal/p;

    const-string v0, "Invalid field \'ProlepticMonth\' for get() method, use getLong() instead"

    invoke-direct {p1, v0}, Lj$/time/temporal/p;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_3
    iget-short p1, p0, Lj$/time/g;->b:S

    return p1

    :pswitch_4
    invoke-virtual {p0}, Lj$/time/g;->k()I

    move-result p1

    sub-int/2addr p1, v3

    div-int/lit8 p1, p1, 0x7

    :goto_1
    add-int/2addr p1, v3

    return p1

    :pswitch_5
    new-instance p1, Lj$/time/temporal/p;

    const-string v0, "Invalid field \'EpochDay\' for get() method, use getLong() instead"

    invoke-direct {p1, v0}, Lj$/time/temporal/p;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_6
    invoke-virtual {p0}, Lj$/time/g;->k()I

    move-result p1

    sub-int/2addr p1, v3

    rem-int/lit8 p1, p1, 0x7

    goto :goto_1

    :pswitch_7
    sub-int/2addr v2, v3

    rem-int/lit8 v2, v2, 0x7

    goto :goto_3

    :pswitch_8
    invoke-virtual {p0}, Lj$/time/g;->j()Lj$/time/c;

    move-result-object p1

    .line 0
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    add-int/2addr p1, v3

    return p1

    :pswitch_9
    if-lt v1, v3, :cond_1

    goto :goto_2

    :cond_1
    rsub-int/lit8 v1, v1, 0x1

    :goto_2
    return v1

    :pswitch_a
    sub-int/2addr v2, v3

    .line 0
    div-int/lit8 v2, v2, 0x7

    :goto_3
    add-int/2addr v2, v3

    return v2

    :pswitch_b
    invoke-virtual {p0}, Lj$/time/g;->k()I

    move-result p1

    return p1

    :pswitch_c
    return v2

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static n(III)Lj$/time/g;
    .locals 5

    sget-object v0, Lj$/time/temporal/a;->YEAR:Lj$/time/temporal/a;

    int-to-long v1, p0

    invoke-virtual {v0, v1, v2}, Lj$/time/temporal/a;->h(J)V

    sget-object v0, Lj$/time/temporal/a;->MONTH_OF_YEAR:Lj$/time/temporal/a;

    int-to-long v3, p1

    invoke-virtual {v0, v3, v4}, Lj$/time/temporal/a;->h(J)V

    sget-object v0, Lj$/time/temporal/a;->DAY_OF_MONTH:Lj$/time/temporal/a;

    int-to-long v3, p2

    invoke-virtual {v0, v3, v4}, Lj$/time/temporal/a;->h(J)V

    const/16 v0, 0x1c

    if-le p2, v0, :cond_4

    const/4 v3, 0x2

    const/16 v4, 0x1d

    if-eq p1, v3, :cond_1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    const/4 v0, 0x6

    if-eq p1, v0, :cond_0

    const/16 v0, 0x9

    if-eq p1, v0, :cond_0

    const/16 v0, 0xb

    if-eq p1, v0, :cond_0

    const/16 v0, 0x1f

    goto :goto_0

    :cond_0
    const/16 v0, 0x1e

    goto :goto_0

    .line 0
    :cond_1
    sget-object v3, Lj$/time/chrono/h;->a:Lj$/time/chrono/h;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v2}, Lj$/time/chrono/h;->a(J)Z

    move-result v1

    if-eqz v1, :cond_2

    move v0, v4

    :cond_2
    :goto_0
    if-le p2, v0, :cond_4

    if-ne p2, v4, :cond_3

    new-instance p1, Lj$/time/b;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Invalid date \'February 29\' as \'"

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, "\' is not a leap year"

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lj$/time/b;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p0, Lj$/time/b;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Invalid date \'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lj$/time/k;->g(I)Lj$/time/k;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "\'"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lj$/time/b;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    new-instance v0, Lj$/time/g;

    invoke-direct {v0, p0, p1, p2}, Lj$/time/g;-><init>(III)V

    return-object v0
.end method

.method public static o(J)Lj$/time/g;
    .locals 23

    const-wide/32 v0, 0xafaa8

    add-long v0, p0, v0

    const-wide/16 v2, 0x3c

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    const-wide/16 v5, 0x1

    const-wide/32 v7, 0x23ab1

    const-wide/16 v9, 0x190

    if-gez v4, :cond_0

    add-long v11, v0, v5

    div-long/2addr v11, v7

    sub-long/2addr v11, v5

    mul-long v13, v11, v9

    neg-long v11, v11

    mul-long/2addr v11, v7

    add-long/2addr v0, v11

    goto :goto_0

    :cond_0
    move-wide v13, v2

    :goto_0
    mul-long v11, v0, v9

    const-wide/16 v15, 0x24f

    add-long/2addr v11, v15

    div-long/2addr v11, v7

    const-wide/16 v7, 0x16d

    mul-long v15, v11, v7

    const-wide/16 v17, 0x4

    div-long v19, v11, v17

    add-long v19, v19, v15

    const-wide/16 v15, 0x64

    div-long v21, v11, v15

    sub-long v19, v19, v21

    div-long v21, v11, v9

    add-long v21, v21, v19

    sub-long v19, v0, v21

    cmp-long v2, v19, v2

    if-gez v2, :cond_1

    sub-long/2addr v11, v5

    mul-long/2addr v7, v11

    div-long v2, v11, v17

    add-long/2addr v2, v7

    div-long v4, v11, v15

    sub-long/2addr v2, v4

    div-long v4, v11, v9

    add-long/2addr v4, v2

    sub-long v19, v0, v4

    :cond_1
    move-wide/from16 v0, v19

    add-long/2addr v11, v13

    long-to-int v0, v0

    mul-int/lit8 v1, v0, 0x5

    add-int/lit8 v1, v1, 0x2

    div-int/lit16 v1, v1, 0x99

    add-int/lit8 v2, v1, 0x2

    rem-int/lit8 v2, v2, 0xc

    add-int/lit8 v2, v2, 0x1

    mul-int/lit16 v3, v1, 0x132

    add-int/lit8 v3, v3, 0x5

    div-int/lit8 v3, v3, 0xa

    sub-int/2addr v0, v3

    add-int/lit8 v0, v0, 0x1

    div-int/lit8 v1, v1, 0xa

    int-to-long v3, v1

    add-long/2addr v11, v3

    sget-object v1, Lj$/time/temporal/a;->YEAR:Lj$/time/temporal/a;

    invoke-virtual {v1, v11, v12}, Lj$/time/temporal/a;->g(J)I

    move-result v1

    new-instance v3, Lj$/time/g;

    invoke-direct {v3, v1, v2, v0}, Lj$/time/g;-><init>(III)V

    return-object v3
.end method


# virtual methods
.method public final a(Lj$/time/temporal/l;)Lj$/time/temporal/q;
    .locals 7

    instance-of v0, p1, Lj$/time/temporal/a;

    if-eqz v0, :cond_b

    move-object v0, p1

    check-cast v0, Lj$/time/temporal/a;

    invoke-virtual {v0}, Lj$/time/temporal/a;->c()Z

    move-result v1

    if-eqz v1, :cond_a

    sget-object v1, Lj$/time/f;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    iget-short v1, p0, Lj$/time/g;->b:S

    const/4 v2, 0x1

    const/4 v3, 0x4

    const/4 v4, 0x2

    const-wide/16 v5, 0x1

    if-eq v0, v2, :cond_6

    if-eq v0, v4, :cond_4

    const/4 v2, 0x3

    if-eq v0, v2, :cond_2

    if-eq v0, v3, :cond_0

    invoke-interface {p1}, Lj$/time/temporal/l;->d()Lj$/time/temporal/q;

    move-result-object p1

    return-object p1

    :cond_0
    iget p1, p0, Lj$/time/g;->a:I

    if-gtz p1, :cond_1

    const-wide/32 v0, 0x3b9aca00

    goto :goto_0

    :cond_1
    const-wide/32 v0, 0x3b9ac9ff

    :goto_0
    invoke-static {v5, v6, v0, v1}, Lj$/time/temporal/q;->i(JJ)Lj$/time/temporal/q;

    move-result-object p1

    return-object p1

    .line 0
    :cond_2
    invoke-static {v1}, Lj$/time/k;->g(I)Lj$/time/k;

    move-result-object p1

    .line 0
    sget-object v0, Lj$/time/k;->FEBRUARY:Lj$/time/k;

    if-ne p1, v0, :cond_3

    invoke-virtual {p0}, Lj$/time/g;->m()Z

    move-result p1

    if-nez p1, :cond_3

    const-wide/16 v0, 0x4

    goto :goto_1

    :cond_3
    const-wide/16 v0, 0x5

    :goto_1
    invoke-static {v5, v6, v0, v1}, Lj$/time/temporal/q;->i(JJ)Lj$/time/temporal/q;

    move-result-object p1

    return-object p1

    .line 0
    :cond_4
    invoke-virtual {p0}, Lj$/time/g;->m()Z

    move-result p1

    if-eqz p1, :cond_5

    const/16 p1, 0x16e

    goto :goto_2

    :cond_5
    const/16 p1, 0x16d

    goto :goto_2

    :cond_6
    if-eq v1, v4, :cond_8

    if-eq v1, v3, :cond_7

    const/4 p1, 0x6

    if-eq v1, p1, :cond_7

    const/16 p1, 0x9

    if-eq v1, p1, :cond_7

    const/16 p1, 0xb

    if-eq v1, p1, :cond_7

    const/16 p1, 0x1f

    goto :goto_2

    :cond_7
    const/16 p1, 0x1e

    goto :goto_2

    .line 0
    :cond_8
    invoke-virtual {p0}, Lj$/time/g;->m()Z

    move-result p1

    if-eqz p1, :cond_9

    const/16 p1, 0x1d

    goto :goto_2

    :cond_9
    const/16 p1, 0x1c

    :goto_2
    int-to-long v0, p1

    .line 0
    invoke-static {v5, v6, v0, v1}, Lj$/time/temporal/q;->i(JJ)Lj$/time/temporal/q;

    move-result-object p1

    return-object p1

    :cond_a
    new-instance v0, Lj$/time/temporal/p;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unsupported field: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lj$/time/temporal/p;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    invoke-interface {p1, p0}, Lj$/time/temporal/l;->b(Lj$/time/temporal/k;)Lj$/time/temporal/q;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lj$/time/temporal/l;)Z
    .locals 1

    .line 0
    instance-of v0, p1, Lj$/time/temporal/a;

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lj$/time/temporal/l;->c()Z

    move-result p1

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    invoke-interface {p1, p0}, Lj$/time/temporal/l;->a(Lj$/time/temporal/k;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final c(Lj$/time/temporal/l;)J
    .locals 4

    instance-of v0, p1, Lj$/time/temporal/a;

    if-eqz v0, :cond_2

    sget-object v0, Lj$/time/temporal/a;->EPOCH_DAY:Lj$/time/temporal/a;

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, Lj$/time/g;->q()J

    move-result-wide v0

    return-wide v0

    :cond_0
    sget-object v0, Lj$/time/temporal/a;->PROLEPTIC_MONTH:Lj$/time/temporal/a;

    if-ne p1, v0, :cond_1

    .line 0
    iget p1, p0, Lj$/time/g;->a:I

    int-to-long v0, p1

    const-wide/16 v2, 0xc

    mul-long/2addr v0, v2

    iget-short p1, p0, Lj$/time/g;->b:S

    int-to-long v2, p1

    add-long/2addr v0, v2

    const-wide/16 v2, 0x1

    sub-long/2addr v0, v2

    return-wide v0

    .line 0
    :cond_1
    invoke-direct {p0, p1}, Lj$/time/g;->i(Lj$/time/temporal/l;)I

    move-result p1

    int-to-long v0, p1

    return-wide v0

    :cond_2
    invoke-interface {p1, p0}, Lj$/time/temporal/l;->f(Lj$/time/temporal/k;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lj$/time/chrono/b;

    invoke-virtual {p0, p1}, Lj$/time/g;->f(Lj$/time/chrono/b;)I

    move-result p1

    return p1
.end method

.method public final d(Lj$/time/temporal/n;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lj$/time/temporal/j;->e()Lj$/time/temporal/m;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 0
    :cond_0
    invoke-static {}, Lj$/time/temporal/j;->j()Lj$/time/temporal/m;

    move-result-object v0

    if-eq p1, v0, :cond_5

    invoke-static {}, Lj$/time/temporal/j;->i()Lj$/time/temporal/m;

    move-result-object v0

    if-eq p1, v0, :cond_5

    invoke-static {}, Lj$/time/temporal/j;->g()Lj$/time/temporal/m;

    move-result-object v0

    if-ne p1, v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {}, Lj$/time/temporal/j;->f()Lj$/time/temporal/m;

    move-result-object v0

    if-ne p1, v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {}, Lj$/time/temporal/j;->d()Lj$/time/temporal/m;

    move-result-object v0

    if-ne p1, v0, :cond_3

    .line 0
    sget-object p1, Lj$/time/chrono/h;->a:Lj$/time/chrono/h;

    goto :goto_1

    .line 0
    :cond_3
    invoke-static {}, Lj$/time/temporal/j;->h()Lj$/time/temporal/m;

    move-result-object v0

    if-ne p1, v0, :cond_4

    sget-object p1, Lj$/time/temporal/b;->DAYS:Lj$/time/temporal/b;

    goto :goto_1

    :cond_4
    invoke-interface {p1, p0}, Lj$/time/temporal/n;->a(Lj$/time/temporal/k;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_5
    :goto_0
    const/4 p1, 0x0

    :goto_1
    return-object p1
.end method

.method public final e(Lj$/time/temporal/a;)I
    .locals 1

    instance-of v0, p1, Lj$/time/temporal/a;

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lj$/time/g;->i(Lj$/time/temporal/l;)I

    move-result p1

    return p1

    :cond_0
    invoke-static {p0, p1}, Lj$/time/temporal/j;->a(Lj$/time/temporal/k;Lj$/time/temporal/a;)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lj$/time/g;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, Lj$/time/g;

    invoke-virtual {p0, p1}, Lj$/time/g;->g(Lj$/time/g;)I

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    return v0

    :cond_2
    return v2
.end method

.method public final f(Lj$/time/chrono/b;)I
    .locals 4

    instance-of v0, p1, Lj$/time/g;

    if-eqz v0, :cond_0

    check-cast p1, Lj$/time/g;

    invoke-virtual {p0, p1}, Lj$/time/g;->g(Lj$/time/g;)I

    move-result p1

    return p1

    .line 0
    :cond_0
    invoke-virtual {p0}, Lj$/time/g;->q()J

    move-result-wide v0

    check-cast p1, Lj$/time/g;

    invoke-virtual {p1}, Lj$/time/g;->q()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Long;->compare(JJ)I

    move-result p1

    if-nez p1, :cond_1

    .line 0
    sget-object p1, Lj$/time/chrono/h;->a:Lj$/time/chrono/h;

    .line 0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    :cond_1
    return p1
.end method

.method final g(Lj$/time/g;)I
    .locals 2

    iget v0, p1, Lj$/time/g;->a:I

    iget v1, p0, Lj$/time/g;->a:I

    sub-int/2addr v1, v0

    if-nez v1, :cond_0

    iget-short v0, p0, Lj$/time/g;->b:S

    iget-short v1, p1, Lj$/time/g;->b:S

    sub-int v1, v0, v1

    if-nez v1, :cond_0

    iget-short v0, p0, Lj$/time/g;->c:S

    iget-short p1, p1, Lj$/time/g;->c:S

    sub-int v1, v0, p1

    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 3

    iget v0, p0, Lj$/time/g;->a:I

    and-int/lit16 v1, v0, -0x800

    shl-int/lit8 v0, v0, 0xb

    iget-short v2, p0, Lj$/time/g;->b:S

    shl-int/lit8 v2, v2, 0x6

    add-int/2addr v0, v2

    iget-short v2, p0, Lj$/time/g;->c:S

    add-int/2addr v0, v2

    xor-int/2addr v0, v1

    return v0
.end method

.method public final j()Lj$/time/c;
    .locals 4

    invoke-virtual {p0}, Lj$/time/g;->q()J

    move-result-wide v0

    const-wide/16 v2, 0x3

    add-long/2addr v0, v2

    const-wide/16 v2, 0x7

    invoke-static {v0, v1, v2, v3}, Lj$/time/a;->c(JJ)J

    move-result-wide v0

    long-to-int v0, v0

    add-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lj$/time/c;->f(I)Lj$/time/c;

    move-result-object v0

    return-object v0
.end method

.method public final k()I
    .locals 2

    .line 0
    iget-short v0, p0, Lj$/time/g;->b:S

    invoke-static {v0}, Lj$/time/k;->g(I)Lj$/time/k;

    move-result-object v0

    .line 0
    invoke-virtual {p0}, Lj$/time/g;->m()Z

    move-result v1

    invoke-virtual {v0, v1}, Lj$/time/k;->f(Z)I

    move-result v0

    iget-short v1, p0, Lj$/time/g;->c:S

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method public final l()I
    .locals 1

    iget v0, p0, Lj$/time/g;->a:I

    return v0
.end method

.method public final m()Z
    .locals 3

    sget-object v0, Lj$/time/chrono/h;->a:Lj$/time/chrono/h;

    iget v1, p0, Lj$/time/g;->a:I

    int-to-long v1, v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v2}, Lj$/time/chrono/h;->a(J)Z

    move-result v0

    return v0
.end method

.method public final p(J)Lj$/time/g;
    .locals 4

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    sget-object v0, Lj$/time/temporal/a;->YEAR:Lj$/time/temporal/a;

    iget v1, p0, Lj$/time/g;->a:I

    int-to-long v1, v1

    add-long/2addr v1, p1

    invoke-virtual {v0, v1, v2}, Lj$/time/temporal/a;->g(J)I

    move-result p1

    const/4 p2, 0x2

    .line 0
    iget-short v0, p0, Lj$/time/g;->b:S

    iget-short v1, p0, Lj$/time/g;->c:S

    if-eq v0, p2, :cond_2

    const/4 p2, 0x4

    if-eq v0, p2, :cond_1

    const/4 p2, 0x6

    if-eq v0, p2, :cond_1

    const/16 p2, 0x9

    if-eq v0, p2, :cond_1

    const/16 p2, 0xb

    if-eq v0, p2, :cond_1

    goto :goto_1

    :cond_1
    const/16 p2, 0x1e

    goto :goto_0

    :cond_2
    sget-object p2, Lj$/time/chrono/h;->a:Lj$/time/chrono/h;

    int-to-long v2, p1

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v3}, Lj$/time/chrono/h;->a(J)Z

    move-result p2

    if-eqz p2, :cond_3

    const/16 p2, 0x1d

    goto :goto_0

    :cond_3
    const/16 p2, 0x1c

    :goto_0
    invoke-static {v1, p2}, Ljava/lang/Math;->min(II)I

    move-result v1

    :goto_1
    new-instance p2, Lj$/time/g;

    invoke-direct {p2, p1, v0, v1}, Lj$/time/g;-><init>(III)V

    return-object p2
.end method

.method public final q()J
    .locals 12

    iget v0, p0, Lj$/time/g;->a:I

    int-to-long v0, v0

    iget-short v2, p0, Lj$/time/g;->b:S

    int-to-long v2, v2

    const-wide/16 v4, 0x16d

    mul-long/2addr v4, v0

    const-wide/16 v6, 0x0

    add-long/2addr v4, v6

    cmp-long v6, v0, v6

    if-ltz v6, :cond_0

    const-wide/16 v6, 0x3

    add-long/2addr v6, v0

    const-wide/16 v8, 0x4

    div-long/2addr v6, v8

    const-wide/16 v8, 0x63

    add-long/2addr v8, v0

    const-wide/16 v10, 0x64

    div-long/2addr v8, v10

    sub-long/2addr v6, v8

    const-wide/16 v8, 0x18f

    add-long/2addr v0, v8

    const-wide/16 v8, 0x190

    div-long/2addr v0, v8

    add-long/2addr v0, v6

    add-long/2addr v0, v4

    goto :goto_0

    :cond_0
    const-wide/16 v6, -0x4

    div-long v6, v0, v6

    const-wide/16 v8, -0x64

    div-long v8, v0, v8

    sub-long/2addr v6, v8

    const-wide/16 v8, -0x190

    div-long/2addr v0, v8

    add-long/2addr v0, v6

    sub-long v0, v4, v0

    :goto_0
    const-wide/16 v4, 0x16f

    mul-long/2addr v4, v2

    const-wide/16 v6, 0x16a

    sub-long/2addr v4, v6

    const-wide/16 v6, 0xc

    div-long/2addr v4, v6

    add-long/2addr v4, v0

    iget-short v0, p0, Lj$/time/g;->c:S

    add-int/lit8 v0, v0, -0x1

    int-to-long v0, v0

    add-long/2addr v4, v0

    const-wide/16 v0, 0x2

    cmp-long v0, v2, v0

    if-lez v0, :cond_1

    const-wide/16 v0, 0x1

    sub-long/2addr v4, v0

    invoke-virtual {p0}, Lj$/time/g;->m()Z

    move-result v2

    if-nez v2, :cond_1

    sub-long/2addr v4, v0

    :cond_1
    const-wide/32 v0, 0xafaa8

    sub-long/2addr v4, v0

    return-wide v4
.end method

.method public final r()Lj$/time/g;
    .locals 8

    invoke-virtual {p0}, Lj$/time/g;->k()I

    move-result v0

    const/16 v1, 0xb4

    if-ne v0, v1, :cond_0

    return-object p0

    .line 0
    :cond_0
    sget-object v0, Lj$/time/temporal/a;->YEAR:Lj$/time/temporal/a;

    iget v2, p0, Lj$/time/g;->a:I

    int-to-long v3, v2

    invoke-virtual {v0, v3, v4}, Lj$/time/temporal/a;->h(J)V

    sget-object v0, Lj$/time/temporal/a;->DAY_OF_YEAR:Lj$/time/temporal/a;

    int-to-long v5, v1

    invoke-virtual {v0, v5, v6}, Lj$/time/temporal/a;->h(J)V

    sget-object v0, Lj$/time/chrono/h;->a:Lj$/time/chrono/h;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3, v4}, Lj$/time/chrono/h;->a(J)Z

    move-result v0

    const/4 v3, 0x6

    invoke-static {v3}, Lj$/time/k;->g(I)Lj$/time/k;

    move-result-object v3

    invoke-virtual {v3, v0}, Lj$/time/k;->f(Z)I

    move-result v4

    .line 0
    sget-object v5, Lj$/time/j;->a:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v5, v5, v6

    const/4 v6, 0x1

    if-eq v5, v6, :cond_2

    const/4 v7, 0x2

    if-eq v5, v7, :cond_1

    const/4 v7, 0x3

    if-eq v5, v7, :cond_1

    const/4 v7, 0x4

    if-eq v5, v7, :cond_1

    const/4 v7, 0x5

    if-eq v5, v7, :cond_1

    const/16 v5, 0x1f

    goto :goto_0

    :cond_1
    const/16 v5, 0x1e

    goto :goto_0

    :cond_2
    if-eqz v0, :cond_3

    const/16 v5, 0x1d

    goto :goto_0

    :cond_3
    const/16 v5, 0x1c

    :goto_0
    add-int/2addr v4, v5

    sub-int/2addr v4, v6

    if-le v1, v4, :cond_4

    .line 0
    invoke-virtual {v3}, Lj$/time/k;->h()Lj$/time/k;

    move-result-object v3

    :cond_4
    invoke-virtual {v3, v0}, Lj$/time/k;->f(Z)I

    move-result v0

    sub-int/2addr v1, v0

    add-int/2addr v1, v6

    new-instance v0, Lj$/time/g;

    .line 0
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    add-int/2addr v3, v6

    .line 0
    invoke-direct {v0, v2, v3, v1}, Lj$/time/g;-><init>(III)V

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    iget v0, p0, Lj$/time/g;->a:I

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0xa

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const/16 v4, 0x3e8

    if-ge v1, v4, :cond_1

    if-gez v0, :cond_0

    add-int/lit16 v0, v0, -0x2710

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    add-int/lit16 v0, v0, 0x2710

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    const/16 v1, 0x270f

    if-le v0, v1, :cond_2

    const/16 v1, 0x2b

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_2
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :goto_1
    const-string v0, "-0"

    const-string v1, "-"

    iget-short v4, p0, Lj$/time/g;->b:S

    if-ge v4, v3, :cond_3

    move-object v5, v0

    goto :goto_2

    :cond_3
    move-object v5, v1

    :goto_2
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-short v4, p0, Lj$/time/g;->c:S

    if-ge v4, v3, :cond_4

    goto :goto_3

    :cond_4
    move-object v0, v1

    :goto_3
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
