.class final Lj$/time/format/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj$/time/format/g;


# instance fields
.field private final a:Lj$/time/temporal/l;

.field private final b:Lj$/time/format/w;

.field private final c:Lj$/time/format/b;

.field private volatile d:Lj$/time/format/j;


# direct methods
.method constructor <init>(Lj$/time/temporal/a;Lj$/time/format/w;Lj$/time/format/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj$/time/format/n;->a:Lj$/time/temporal/l;

    iput-object p2, p0, Lj$/time/format/n;->b:Lj$/time/format/w;

    iput-object p3, p0, Lj$/time/format/n;->c:Lj$/time/format/b;

    return-void
.end method


# virtual methods
.method public final a(Lj$/time/format/r;Ljava/lang/StringBuilder;)Z
    .locals 7

    iget-object v0, p0, Lj$/time/format/n;->a:Lj$/time/temporal/l;

    invoke-virtual {p1, v0}, Lj$/time/format/r;->e(Lj$/time/temporal/l;)Ljava/lang/Long;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p1}, Lj$/time/format/r;->d()Lj$/time/temporal/k;

    move-result-object v1

    invoke-static {}, Lj$/time/temporal/j;->d()Lj$/time/temporal/m;

    move-result-object v2

    invoke-interface {v1, v2}, Lj$/time/temporal/k;->d(Lj$/time/temporal/n;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lj$/time/chrono/g;

    if-eqz v1, :cond_4

    sget-object v2, Lj$/time/chrono/h;->a:Lj$/time/chrono/h;

    if-ne v1, v2, :cond_1

    goto :goto_1

    :cond_1
    iget-object v3, p0, Lj$/time/format/n;->c:Lj$/time/format/b;

    iget-object v4, p0, Lj$/time/format/n;->a:Lj$/time/temporal/l;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    iget-object v0, p0, Lj$/time/format/n;->b:Lj$/time/format/w;

    invoke-virtual {p1}, Lj$/time/format/r;->c()Ljava/util/Locale;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eq v1, v2, :cond_3

    .line 0
    instance-of v1, v4, Lj$/time/temporal/a;

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    goto :goto_2

    .line 0
    :cond_3
    :goto_0
    iget-object v1, v3, Lj$/time/format/b;->a:Lj$/time/format/s;

    invoke-virtual {v1, v5, v6, v0}, Lj$/time/format/s;->a(JLj$/time/format/w;)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    .line 0
    :cond_4
    :goto_1
    iget-object v1, p0, Lj$/time/format/n;->c:Lj$/time/format/b;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    iget-object v0, p0, Lj$/time/format/n;->b:Lj$/time/format/w;

    invoke-virtual {p1}, Lj$/time/format/r;->c()Ljava/util/Locale;

    .line 0
    iget-object v1, v1, Lj$/time/format/b;->a:Lj$/time/format/s;

    .line 0
    invoke-virtual {v1, v2, v3, v0}, Lj$/time/format/s;->a(JLj$/time/format/w;)Ljava/lang/String;

    move-result-object v0

    :goto_2
    const/4 v1, 0x1

    if-nez v0, :cond_6

    .line 0
    iget-object v0, p0, Lj$/time/format/n;->d:Lj$/time/format/j;

    if-nez v0, :cond_5

    new-instance v0, Lj$/time/format/j;

    iget-object v2, p0, Lj$/time/format/n;->a:Lj$/time/temporal/l;

    const/16 v3, 0x13

    sget-object v4, Lj$/time/format/v;->NORMAL:Lj$/time/format/v;

    invoke-direct {v0, v2, v1, v3, v4}, Lj$/time/format/j;-><init>(Lj$/time/temporal/l;IILj$/time/format/v;)V

    iput-object v0, p0, Lj$/time/format/n;->d:Lj$/time/format/j;

    :cond_5
    iget-object v0, p0, Lj$/time/format/n;->d:Lj$/time/format/j;

    .line 0
    invoke-virtual {v0, p1, p2}, Lj$/time/format/j;->a(Lj$/time/format/r;Ljava/lang/StringBuilder;)Z

    move-result p1

    return p1

    :cond_6
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    sget-object v0, Lj$/time/format/w;->FULL:Lj$/time/format/w;

    const-string v1, ")"

    iget-object v2, p0, Lj$/time/format/n;->a:Lj$/time/temporal/l;

    const-string v3, "Text("

    iget-object v4, p0, Lj$/time/format/n;->b:Lj$/time/format/w;

    if-ne v4, v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ","

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
