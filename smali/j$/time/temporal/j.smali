.class public abstract synthetic Lj$/time/temporal/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final a:Lj$/time/temporal/m;

.field static final b:Lj$/time/temporal/m;

.field static final c:Lj$/time/temporal/m;

.field static final d:Lj$/time/temporal/m;

.field static final e:Lj$/time/temporal/m;

.field static final f:Lj$/time/temporal/m;

.field static final g:Lj$/time/temporal/m;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 0
    new-instance v0, Lj$/time/temporal/m;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lj$/time/temporal/m;-><init>(I)V

    sput-object v0, Lj$/time/temporal/j;->a:Lj$/time/temporal/m;

    new-instance v0, Lj$/time/temporal/m;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lj$/time/temporal/m;-><init>(I)V

    sput-object v0, Lj$/time/temporal/j;->b:Lj$/time/temporal/m;

    new-instance v0, Lj$/time/temporal/m;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lj$/time/temporal/m;-><init>(I)V

    sput-object v0, Lj$/time/temporal/j;->c:Lj$/time/temporal/m;

    new-instance v0, Lj$/time/temporal/m;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lj$/time/temporal/m;-><init>(I)V

    sput-object v0, Lj$/time/temporal/j;->d:Lj$/time/temporal/m;

    new-instance v0, Lj$/time/temporal/m;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lj$/time/temporal/m;-><init>(I)V

    sput-object v0, Lj$/time/temporal/j;->e:Lj$/time/temporal/m;

    new-instance v0, Lj$/time/temporal/m;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lj$/time/temporal/m;-><init>(I)V

    sput-object v0, Lj$/time/temporal/j;->f:Lj$/time/temporal/m;

    new-instance v0, Lj$/time/temporal/m;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lj$/time/temporal/m;-><init>(I)V

    sput-object v0, Lj$/time/temporal/j;->g:Lj$/time/temporal/m;

    return-void
.end method

.method public static a(Lj$/time/temporal/k;Lj$/time/temporal/a;)I
    .locals 5

    invoke-interface {p0, p1}, Lj$/time/temporal/k;->a(Lj$/time/temporal/l;)Lj$/time/temporal/q;

    move-result-object v0

    invoke-virtual {v0}, Lj$/time/temporal/q;->g()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0, p1}, Lj$/time/temporal/k;->c(Lj$/time/temporal/l;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lj$/time/temporal/q;->h(J)Z

    move-result p0

    if-eqz p0, :cond_0

    long-to-int p0, v1

    return p0

    :cond_0
    new-instance p0, Lj$/time/b;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Invalid value for "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " (valid values "

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "): "

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lj$/time/b;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Lj$/time/temporal/p;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Invalid field "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " for get() method, use getLong() instead"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lj$/time/temporal/p;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static b(Lj$/time/temporal/k;Lj$/time/temporal/n;)Ljava/lang/Object;
    .locals 1

    sget-object v0, Lj$/time/temporal/j;->a:Lj$/time/temporal/m;

    if-eq p1, v0, :cond_1

    sget-object v0, Lj$/time/temporal/j;->b:Lj$/time/temporal/m;

    if-eq p1, v0, :cond_1

    sget-object v0, Lj$/time/temporal/j;->c:Lj$/time/temporal/m;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1, p0}, Lj$/time/temporal/n;->a(Lj$/time/temporal/k;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static c(Lj$/time/temporal/k;Lj$/time/temporal/l;)Lj$/time/temporal/q;
    .locals 2

    instance-of v0, p1, Lj$/time/temporal/a;

    if-eqz v0, :cond_1

    invoke-interface {p0, p1}, Lj$/time/temporal/k;->b(Lj$/time/temporal/l;)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-interface {p1}, Lj$/time/temporal/l;->d()Lj$/time/temporal/q;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Lj$/time/temporal/p;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unsupported field: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lj$/time/temporal/p;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    if-eqz p1, :cond_2

    invoke-interface {p1, p0}, Lj$/time/temporal/l;->b(Lj$/time/temporal/k;)Lj$/time/temporal/q;

    move-result-object p0

    return-object p0

    .line 0
    :cond_2
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "field"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static d()Lj$/time/temporal/m;
    .locals 1

    sget-object v0, Lj$/time/temporal/j;->b:Lj$/time/temporal/m;

    return-object v0
.end method

.method public static e()Lj$/time/temporal/m;
    .locals 1

    sget-object v0, Lj$/time/temporal/j;->f:Lj$/time/temporal/m;

    return-object v0
.end method

.method public static f()Lj$/time/temporal/m;
    .locals 1

    sget-object v0, Lj$/time/temporal/j;->g:Lj$/time/temporal/m;

    return-object v0
.end method

.method public static g()Lj$/time/temporal/m;
    .locals 1

    sget-object v0, Lj$/time/temporal/j;->d:Lj$/time/temporal/m;

    return-object v0
.end method

.method public static h()Lj$/time/temporal/m;
    .locals 1

    sget-object v0, Lj$/time/temporal/j;->c:Lj$/time/temporal/m;

    return-object v0
.end method

.method public static i()Lj$/time/temporal/m;
    .locals 1

    sget-object v0, Lj$/time/temporal/j;->e:Lj$/time/temporal/m;

    return-object v0
.end method

.method public static j()Lj$/time/temporal/m;
    .locals 1

    sget-object v0, Lj$/time/temporal/j;->a:Lj$/time/temporal/m;

    return-object v0
.end method
