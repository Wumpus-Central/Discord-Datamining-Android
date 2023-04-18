.class public Lnet/time4j/calendar/service/g;
.super Lnet/time4j/calendar/service/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lfj/q<",
        "TT;>;>",
        "Lnet/time4j/calendar/service/e<",
        "Lnet/time4j/x0;",
        "TT;>;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x12d253f0081cd28L


# instance fields
.field private final transient r:Lnet/time4j/z0;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Lnet/time4j/z0;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lnet/time4j/z0;",
            ")V"
        }
    .end annotation

    .line 1
    const-class v0, Lnet/time4j/x0;

    .line 2
    .line 3
    const/16 v1, 0x45

    .line 4
    .line 5
    const-string v2, "DAY_OF_WEEK"

    .line 6
    .line 7
    invoke-direct {p0, v2, p1, v0, v1}, Lnet/time4j/calendar/service/e;-><init>(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;C)V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, Lnet/time4j/calendar/service/g;->r:Lnet/time4j/z0;

    .line 11
    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
.end method


# virtual methods
.method public bridge synthetic C()Ljava/lang/Enum;
    .locals 1

    invoke-virtual {p0}, Lnet/time4j/calendar/service/g;->Q()Lnet/time4j/x0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic D()Ljava/lang/Enum;
    .locals 1

    invoke-virtual {p0}, Lnet/time4j/calendar/service/g;->U()Lnet/time4j/x0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic N(Ljava/lang/Enum;)I
    .locals 0

    check-cast p1, Lnet/time4j/x0;

    invoke-virtual {p0, p1}, Lnet/time4j/calendar/service/g;->V(Lnet/time4j/x0;)I

    move-result p1

    return p1
.end method

.method public Q()Lnet/time4j/x0;
    .locals 2

    iget-object v0, p0, Lnet/time4j/calendar/service/g;->r:Lnet/time4j/z0;

    invoke-virtual {v0}, Lnet/time4j/z0;->f()Lnet/time4j/x0;

    move-result-object v0

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lnet/time4j/x0;->e(I)Lnet/time4j/x0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic S()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lnet/time4j/calendar/service/g;->U()Lnet/time4j/x0;

    move-result-object v0

    return-object v0
.end method

.method public U()Lnet/time4j/x0;
    .locals 1

    iget-object v0, p0, Lnet/time4j/calendar/service/g;->r:Lnet/time4j/z0;

    invoke-virtual {v0}, Lnet/time4j/z0;->f()Lnet/time4j/x0;

    move-result-object v0

    return-object v0
.end method

.method public V(Lnet/time4j/x0;)I
    .locals 1

    iget-object v0, p0, Lnet/time4j/calendar/service/g;->r:Lnet/time4j/z0;

    invoke-virtual {p1, v0}, Lnet/time4j/x0;->c(Lnet/time4j/z0;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lfj/o;

    check-cast p2, Lfj/o;

    invoke-virtual {p0, p1, p2}, Lnet/time4j/calendar/service/g;->d(Lfj/o;Lfj/o;)I

    move-result p1

    return p1
.end method

.method public d(Lfj/o;Lfj/o;)I
    .locals 1

    .line 1
    invoke-interface {p1, p0}, Lfj/o;->k(Lfj/p;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lnet/time4j/x0;

    .line 6
    .line 7
    iget-object v0, p0, Lnet/time4j/calendar/service/g;->r:Lnet/time4j/z0;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Lnet/time4j/x0;->c(Lnet/time4j/z0;)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-interface {p2, p0}, Lfj/o;->k(Lfj/p;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    check-cast p2, Lnet/time4j/x0;

    .line 18
    .line 19
    iget-object v0, p0, Lnet/time4j/calendar/service/g;->r:Lnet/time4j/z0;

    .line 20
    .line 21
    invoke-virtual {p2, v0}, Lnet/time4j/x0;->c(Lnet/time4j/z0;)I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    if-ge p1, p2, :cond_0

    .line 26
    .line 27
    const/4 p1, -0x1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    if-ne p1, p2, :cond_1

    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 p1, 0x1

    .line 34
    :goto_0
    return p1
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
.end method

.method public bridge synthetic f()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lnet/time4j/calendar/service/g;->Q()Lnet/time4j/x0;

    move-result-object v0

    return-object v0
.end method
