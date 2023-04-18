.class Lnet/time4j/z0$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfj/z;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/time4j/z0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lfj/q<",
        "TT;>;>",
        "Ljava/lang/Object;",
        "Lfj/z<",
        "TT;",
        "Lnet/time4j/x0;",
        ">;"
    }
.end annotation


# instance fields
.field final k:Lnet/time4j/z0$f;


# direct methods
.method private constructor <init>(Lnet/time4j/z0$f;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lnet/time4j/z0$e;->k:Lnet/time4j/z0$f;

    return-void
.end method

.method synthetic constructor <init>(Lnet/time4j/z0$f;Lnet/time4j/z0$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lnet/time4j/z0$e;-><init>(Lnet/time4j/z0$f;)V

    return-void
.end method

.method private b(Lfj/q;)Lfj/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lfj/p<",
            "*>;"
        }
    .end annotation

    sget-object v0, Lnet/time4j/g0;->y:Lfj/p;

    invoke-virtual {p1, v0}, Lfj/q;->o(Lfj/p;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Lfj/p;
    .locals 0

    check-cast p1, Lfj/q;

    invoke-virtual {p0, p1}, Lnet/time4j/z0$e;->d(Lfj/q;)Lfj/p;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c(Ljava/lang/Object;)Lfj/p;
    .locals 0

    check-cast p1, Lfj/q;

    invoke-virtual {p0, p1}, Lnet/time4j/z0$e;->e(Lfj/q;)Lfj/p;

    move-result-object p1

    return-object p1
.end method

.method public d(Lfj/q;)Lfj/p;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lfj/p<",
            "*>;"
        }
    .end annotation

    invoke-direct {p0, p1}, Lnet/time4j/z0$e;->b(Lfj/q;)Lfj/p;

    move-result-object p1

    return-object p1
.end method

.method public e(Lfj/q;)Lfj/p;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lfj/p<",
            "*>;"
        }
    .end annotation

    invoke-direct {p0, p1}, Lnet/time4j/z0$e;->b(Lfj/q;)Lfj/p;

    move-result-object p1

    return-object p1
.end method

.method public f(Lfj/q;)Lnet/time4j/x0;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lnet/time4j/x0;"
        }
    .end annotation

    .line 1
    sget-object v0, Lnet/time4j/f0;->x:Lfj/p;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lnet/time4j/f0;

    .line 8
    .line 9
    invoke-virtual {p1}, Lnet/time4j/f0;->E0()Lnet/time4j/x0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Lnet/time4j/z0$e;->k:Lnet/time4j/z0$f;

    .line 14
    .line 15
    invoke-static {v1}, Lnet/time4j/z0$f;->y(Lnet/time4j/z0$f;)Lnet/time4j/z0;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0, v1}, Lnet/time4j/x0;->c(Lnet/time4j/z0;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-virtual {p1}, Lfj/m;->b()J

    .line 24
    .line 25
    .line 26
    move-result-wide v1

    .line 27
    const-wide/16 v3, 0x7

    .line 28
    .line 29
    add-long/2addr v1, v3

    .line 30
    int-to-long v3, v0

    .line 31
    sub-long/2addr v1, v3

    .line 32
    invoke-static {}, Lnet/time4j/f0;->v0()Lfj/h0;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1}, Lfj/h0;->o()Lfj/k;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-interface {p1}, Lfj/k;->c()J

    .line 41
    .line 42
    .line 43
    move-result-wide v3

    .line 44
    cmp-long p1, v1, v3

    .line 45
    .line 46
    if-lez p1, :cond_0

    .line 47
    .line 48
    sget-object p1, Lnet/time4j/x0;->o:Lnet/time4j/x0;

    .line 49
    .line 50
    return-object p1

    .line 51
    :cond_0
    iget-object p1, p0, Lnet/time4j/z0$e;->k:Lnet/time4j/z0$f;

    .line 52
    .line 53
    invoke-virtual {p1}, Lnet/time4j/z0$f;->B()Lnet/time4j/x0;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    return-object p1
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

.method public g(Lfj/q;)Lnet/time4j/x0;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lnet/time4j/x0;"
        }
    .end annotation

    .line 1
    sget-object v0, Lnet/time4j/f0;->x:Lfj/p;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lnet/time4j/f0;

    .line 8
    .line 9
    invoke-virtual {p1}, Lnet/time4j/f0;->E0()Lnet/time4j/x0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Lnet/time4j/z0$e;->k:Lnet/time4j/z0$f;

    .line 14
    .line 15
    invoke-static {v1}, Lnet/time4j/z0$f;->y(Lnet/time4j/z0$f;)Lnet/time4j/z0;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0, v1}, Lnet/time4j/x0;->c(Lnet/time4j/z0;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-virtual {p1}, Lfj/m;->b()J

    .line 24
    .line 25
    .line 26
    move-result-wide v1

    .line 27
    const-wide/16 v3, 0x1

    .line 28
    .line 29
    add-long/2addr v1, v3

    .line 30
    int-to-long v3, v0

    .line 31
    sub-long/2addr v1, v3

    .line 32
    invoke-static {}, Lnet/time4j/f0;->v0()Lfj/h0;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1}, Lfj/h0;->o()Lfj/k;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-interface {p1}, Lfj/k;->d()J

    .line 41
    .line 42
    .line 43
    move-result-wide v3

    .line 44
    cmp-long p1, v1, v3

    .line 45
    .line 46
    if-gez p1, :cond_0

    .line 47
    .line 48
    sget-object p1, Lnet/time4j/x0;->k:Lnet/time4j/x0;

    .line 49
    .line 50
    return-object p1

    .line 51
    :cond_0
    iget-object p1, p0, Lnet/time4j/z0$e;->k:Lnet/time4j/z0$f;

    .line 52
    .line 53
    invoke-virtual {p1}, Lnet/time4j/z0$f;->C()Lnet/time4j/x0;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    return-object p1
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

.method public h(Lfj/q;)Lnet/time4j/x0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lnet/time4j/x0;"
        }
    .end annotation

    sget-object v0, Lnet/time4j/f0;->x:Lfj/p;

    invoke-virtual {p1, v0}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lnet/time4j/f0;

    invoke-virtual {p1}, Lnet/time4j/f0;->E0()Lnet/time4j/x0;

    move-result-object p1

    return-object p1
.end method

.method public i(Lfj/q;Lnet/time4j/x0;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lnet/time4j/x0;",
            ")Z"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p2, :cond_0

    return v0

    :cond_0
    :try_start_0
    invoke-virtual {p0, p1, p2, v0}, Lnet/time4j/z0$e;->n(Lfj/q;Lnet/time4j/x0;Z)Lfj/q;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    return p1

    :catch_0
    return v0
.end method

.method public bridge synthetic j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfj/q;

    invoke-virtual {p0, p1}, Lnet/time4j/z0$e;->f(Lfj/q;)Lnet/time4j/x0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic m(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lfj/q;

    check-cast p2, Lnet/time4j/x0;

    invoke-virtual {p0, p1, p2}, Lnet/time4j/z0$e;->i(Lfj/q;Lnet/time4j/x0;)Z

    move-result p1

    return p1
.end method

.method public n(Lfj/q;Lnet/time4j/x0;Z)Lfj/q;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lnet/time4j/x0;",
            "Z)TT;"
        }
    .end annotation

    .line 1
    if-eqz p2, :cond_1

    .line 2
    .line 3
    sget-object p3, Lnet/time4j/f0;->x:Lfj/p;

    .line 4
    .line 5
    invoke-virtual {p1, p3}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lnet/time4j/f0;

    .line 10
    .line 11
    invoke-virtual {v0}, Lnet/time4j/f0;->G0()J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    invoke-static {v1, v2}, Lnet/time4j/z0;->c(J)Lnet/time4j/x0;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    if-ne p2, v3, :cond_0

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    iget-object v4, p0, Lnet/time4j/z0$e;->k:Lnet/time4j/z0$f;

    .line 23
    .line 24
    invoke-static {v4}, Lnet/time4j/z0$f;->y(Lnet/time4j/z0$f;)Lnet/time4j/z0;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-virtual {v3, v4}, Lnet/time4j/x0;->c(Lnet/time4j/z0;)I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    iget-object v4, p0, Lnet/time4j/z0$e;->k:Lnet/time4j/z0$f;

    .line 33
    .line 34
    invoke-static {v4}, Lnet/time4j/z0$f;->y(Lnet/time4j/z0$f;)Lnet/time4j/z0;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-virtual {p2, v4}, Lnet/time4j/x0;->c(Lnet/time4j/z0;)I

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    int-to-long v4, p2

    .line 43
    add-long/2addr v1, v4

    .line 44
    int-to-long v3, v3

    .line 45
    sub-long/2addr v1, v3

    .line 46
    invoke-virtual {v0, v1, v2}, Lnet/time4j/f0;->W0(J)Lnet/time4j/f0;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    invoke-virtual {p1, p3, p2}, Lfj/q;->E(Lfj/p;Ljava/lang/Object;)Lfj/q;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    return-object p1

    .line 55
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 56
    .line 57
    const-string p2, "Missing weekday."

    .line 58
    .line 59
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw p1
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
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
.end method

.method public bridge synthetic o(Ljava/lang/Object;Ljava/lang/Object;Z)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfj/q;

    check-cast p2, Lnet/time4j/x0;

    invoke-virtual {p0, p1, p2, p3}, Lnet/time4j/z0$e;->n(Lfj/q;Lnet/time4j/x0;Z)Lfj/q;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic p(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfj/q;

    invoke-virtual {p0, p1}, Lnet/time4j/z0$e;->g(Lfj/q;)Lnet/time4j/x0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfj/q;

    invoke-virtual {p0, p1}, Lnet/time4j/z0$e;->h(Lfj/q;)Lnet/time4j/x0;

    move-result-object p1

    return-object p1
.end method
