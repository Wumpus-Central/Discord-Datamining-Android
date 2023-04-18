.class final enum Lnet/time4j/history/c$c;
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
    const-wide/32 v0, -0xd148

    .line 2
    .line 3
    .line 4
    cmp-long v0, p1, v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance p1, Lnet/time4j/history/h;

    .line 9
    .line 10
    sget-object p2, Lnet/time4j/history/j;->l:Lnet/time4j/history/j;

    .line 11
    .line 12
    const/4 v0, 0x2

    .line 13
    const/16 v1, 0x1e

    .line 14
    .line 15
    const/16 v2, 0x6b0

    .line 16
    .line 17
    invoke-direct {p1, p2, v2, v0, v1}, Lnet/time4j/history/h;-><init>(Lnet/time4j/history/j;III)V

    .line 18
    .line 19
    .line 20
    return-object p1

    .line 21
    :cond_0
    sget-object v0, Lnet/time4j/history/c;->l:Lnet/time4j/history/c;

    .line 22
    .line 23
    const-wide/16 v1, 0x1

    .line 24
    .line 25
    add-long/2addr p1, v1

    .line 26
    invoke-interface {v0, p1, p2}, Lnet/time4j/history/b;->a(J)Lnet/time4j/history/h;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    return-object p1
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
    .locals 4

    .line 1
    invoke-static {p1}, Lnet/time4j/history/c;->f(Lnet/time4j/history/h;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Lnet/time4j/history/h;->b()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/16 v2, 0x1e

    .line 10
    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, Lnet/time4j/history/h;->e()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x2

    .line 18
    if-ne v1, v2, :cond_0

    .line 19
    .line 20
    const/16 v1, 0x6b0

    .line 21
    .line 22
    if-ne v0, v1, :cond_0

    .line 23
    .line 24
    const-wide/32 v0, -0xd148

    .line 25
    .line 26
    .line 27
    return-wide v0

    .line 28
    :cond_0
    invoke-virtual {p1}, Lnet/time4j/history/h;->e()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-virtual {p1}, Lnet/time4j/history/h;->b()I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    invoke-static {v0, v1, p1}, Lnet/time4j/history/m;->h(III)J

    .line 37
    .line 38
    .line 39
    move-result-wide v0

    .line 40
    const-wide/16 v2, 0x1

    .line 41
    .line 42
    sub-long/2addr v0, v2

    .line 43
    return-wide v0
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

.method public c(Lnet/time4j/history/h;)Z
    .locals 3

    .line 1
    invoke-static {p1}, Lnet/time4j/history/c;->f(Lnet/time4j/history/h;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Lnet/time4j/history/h;->b()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/16 v2, 0x1e

    .line 10
    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, Lnet/time4j/history/h;->e()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x2

    .line 18
    if-ne v1, v2, :cond_0

    .line 19
    .line 20
    const/16 v1, 0x6b0

    .line 21
    .line 22
    if-ne v0, v1, :cond_0

    .line 23
    .line 24
    const/4 p1, 0x1

    .line 25
    return p1

    .line 26
    :cond_0
    invoke-virtual {p1}, Lnet/time4j/history/h;->e()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-virtual {p1}, Lnet/time4j/history/h;->b()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    invoke-static {v0, v1, p1}, Lnet/time4j/history/m;->d(III)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    return p1
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

.method public e(Lnet/time4j/history/h;)I
    .locals 3

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
    const/4 v2, 0x2

    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    const/16 v1, 0x6b0

    .line 13
    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    .line 16
    const/16 p1, 0x1e

    .line 17
    .line 18
    return p1

    .line 19
    :cond_0
    invoke-virtual {p1}, Lnet/time4j/history/h;->e()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    invoke-static {v0, p1}, Lnet/time4j/history/m;->b(II)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    return p1
.end method
