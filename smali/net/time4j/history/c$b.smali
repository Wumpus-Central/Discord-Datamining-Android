.class final enum Lnet/time4j/history/c$b;
.super Lnet/time4j/history/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/time4j/history/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4008
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lnet/time4j/history/c;-><init>(Ljava/lang/String;ILnet/time4j/history/c$a;)V

    return-void
.end method


# virtual methods
.method public a(J)Lnet/time4j/history/h;
    .locals 3

    .line 1
    invoke-static {p1, p2}, Lnet/time4j/history/m;->i(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    invoke-static {p1, p2}, Lnet/time4j/history/m;->g(J)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {p1, p2}, Lnet/time4j/history/m;->f(J)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-static {p1, p2}, Lnet/time4j/history/m;->e(J)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    new-instance p2, Lnet/time4j/history/h;

    .line 18
    .line 19
    if-gtz v0, :cond_0

    .line 20
    .line 21
    sget-object v2, Lnet/time4j/history/j;->k:Lnet/time4j/history/j;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    sget-object v2, Lnet/time4j/history/j;->l:Lnet/time4j/history/j;

    .line 25
    .line 26
    :goto_0
    if-gtz v0, :cond_1

    .line 27
    .line 28
    rsub-int/lit8 v0, v0, 0x1

    .line 29
    .line 30
    :cond_1
    invoke-direct {p2, v2, v0, v1, p1}, Lnet/time4j/history/h;-><init>(Lnet/time4j/history/j;III)V

    .line 31
    .line 32
    .line 33
    return-object p2
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
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method public b(Lnet/time4j/history/h;)J
    .locals 2

    invoke-static {p1}, Lnet/time4j/history/c;->f(Lnet/time4j/history/h;)I

    move-result v0

    invoke-virtual {p1}, Lnet/time4j/history/h;->e()I

    move-result v1

    invoke-virtual {p1}, Lnet/time4j/history/h;->b()I

    move-result p1

    invoke-static {v0, v1, p1}, Lnet/time4j/history/m;->h(III)J

    move-result-wide v0

    return-wide v0
.end method

.method public c(Lnet/time4j/history/h;)Z
    .locals 2

    .line 1
    invoke-static {p1}, Lnet/time4j/history/c;->f(Lnet/time4j/history/h;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Lnet/time4j/history/h;->e()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p1}, Lnet/time4j/history/h;->b()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-static {v0, v1, p1}, Lnet/time4j/history/m;->d(III)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
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
.end method

.method public e(Lnet/time4j/history/h;)I
    .locals 1

    invoke-static {p1}, Lnet/time4j/history/c;->f(Lnet/time4j/history/h;)I

    move-result v0

    invoke-virtual {p1}, Lnet/time4j/history/h;->e()I

    move-result p1

    invoke-static {v0, p1}, Lnet/time4j/history/m;->b(II)I

    move-result p1

    return p1
.end method
