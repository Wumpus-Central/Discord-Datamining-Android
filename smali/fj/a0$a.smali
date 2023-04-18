.class Lfj/a0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfj/z;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfj/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<D:",
        "Lfj/q<",
        "TD;>;>",
        "Ljava/lang/Object;",
        "Lfj/z<",
        "TD;",
        "Ljava/lang/Long;",
        ">;"
    }
.end annotation


# instance fields
.field private final k:Lfj/a0;

.field private final l:Lfj/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfj/k<",
            "TD;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lfj/a0;Lfj/k;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/a0;",
            "Lfj/k<",
            "TD;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lfj/a0$a;->k:Lfj/a0;

    .line 5
    .line 6
    iput-object p2, p0, Lfj/a0$a;->l:Lfj/k;

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
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
.method public bridge synthetic a(Ljava/lang/Object;)Lfj/p;
    .locals 0

    check-cast p1, Lfj/q;

    invoke-virtual {p0, p1}, Lfj/a0$a;->b(Lfj/q;)Lfj/p;

    move-result-object p1

    return-object p1
.end method

.method public b(Lfj/q;)Lfj/p;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;)",
            "Lfj/p<",
            "*>;"
        }
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge synthetic c(Ljava/lang/Object;)Lfj/p;
    .locals 0

    check-cast p1, Lfj/q;

    invoke-virtual {p0, p1}, Lfj/a0$a;->d(Lfj/q;)Lfj/p;

    move-result-object p1

    return-object p1
.end method

.method public d(Lfj/q;)Lfj/p;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;)",
            "Lfj/p<",
            "*>;"
        }
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method

.method public e(Lfj/q;)Ljava/lang/Long;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;)",
            "Ljava/lang/Long;"
        }
    .end annotation

    .line 1
    iget-object p1, p0, Lfj/a0$a;->k:Lfj/a0;

    .line 2
    .line 3
    iget-object v0, p0, Lfj/a0$a;->l:Lfj/k;

    .line 4
    .line 5
    invoke-interface {v0}, Lfj/k;->c()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    const-wide/16 v2, 0x2da

    .line 10
    .line 11
    add-long/2addr v0, v2

    .line 12
    sget-object v2, Lfj/a0;->l:Lfj/a0;

    .line 13
    .line 14
    invoke-virtual {p1, v0, v1, v2}, Lfj/a0;->l(JLfj/a0;)J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public f(Lfj/q;)Ljava/lang/Long;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;)",
            "Ljava/lang/Long;"
        }
    .end annotation

    .line 1
    iget-object p1, p0, Lfj/a0$a;->k:Lfj/a0;

    .line 2
    .line 3
    iget-object v0, p0, Lfj/a0$a;->l:Lfj/k;

    .line 4
    .line 5
    invoke-interface {v0}, Lfj/k;->d()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    const-wide/16 v2, 0x2da

    .line 10
    .line 11
    add-long/2addr v0, v2

    .line 12
    sget-object v2, Lfj/a0;->l:Lfj/a0;

    .line 13
    .line 14
    invoke-virtual {p1, v0, v1, v2}, Lfj/a0;->l(JLfj/a0;)J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public g(Lfj/q;)Ljava/lang/Long;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;)",
            "Ljava/lang/Long;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lfj/a0$a;->k:Lfj/a0;

    .line 2
    .line 3
    iget-object v1, p0, Lfj/a0$a;->l:Lfj/k;

    .line 4
    .line 5
    invoke-interface {v1, p1}, Lfj/k;->b(Ljava/lang/Object;)J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    const-wide/16 v3, 0x2da

    .line 10
    .line 11
    add-long/2addr v1, v3

    .line 12
    sget-object p1, Lfj/a0;->l:Lfj/a0;

    .line 13
    .line 14
    invoke-virtual {v0, v1, v2, p1}, Lfj/a0;->l(JLfj/a0;)J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public h(Lfj/q;Ljava/lang/Long;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;",
            "Ljava/lang/Long;",
            ")Z"
        }
    .end annotation

    .line 1
    const/4 p1, 0x0

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    return p1

    .line 5
    :cond_0
    :try_start_0
    sget-object v0, Lfj/a0;->l:Lfj/a0;

    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    iget-object p2, p0, Lfj/a0$a;->k:Lfj/a0;

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2, p2}, Lfj/a0;->l(JLfj/a0;)J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    const-wide/16 v2, 0x2da

    .line 18
    .line 19
    invoke-static {v0, v1, v2, v3}, Lnet/time4j/base/c;->m(JJ)J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    iget-object p2, p0, Lfj/a0$a;->l:Lfj/k;

    .line 24
    .line 25
    invoke-interface {p2}, Lfj/k;->c()J

    .line 26
    .line 27
    .line 28
    move-result-wide v2

    .line 29
    cmp-long p2, v0, v2

    .line 30
    .line 31
    if-gtz p2, :cond_1

    .line 32
    .line 33
    iget-object p2, p0, Lfj/a0$a;->l:Lfj/k;

    .line 34
    .line 35
    invoke-interface {p2}, Lfj/k;->d()J

    .line 36
    .line 37
    .line 38
    move-result-wide v2
    :try_end_0
    .catch Ljava/lang/ArithmeticException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    cmp-long p2, v0, v2

    .line 40
    .line 41
    if-ltz p2, :cond_1

    .line 42
    .line 43
    const/4 p1, 0x1

    .line 44
    :catch_0
    :cond_1
    return p1
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
.end method

.method public i(Lfj/q;Ljava/lang/Long;Z)Lfj/q;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;",
            "Ljava/lang/Long;",
            "Z)TD;"
        }
    .end annotation

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    sget-object p1, Lfj/a0;->l:Lfj/a0;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 6
    .line 7
    .line 8
    move-result-wide p2

    .line 9
    iget-object v0, p0, Lfj/a0$a;->k:Lfj/a0;

    .line 10
    .line 11
    invoke-virtual {p1, p2, p3, v0}, Lfj/a0;->l(JLfj/a0;)J

    .line 12
    .line 13
    .line 14
    move-result-wide p1

    .line 15
    const-wide/16 v0, 0x2da

    .line 16
    .line 17
    invoke-static {p1, p2, v0, v1}, Lnet/time4j/base/c;->m(JJ)J

    .line 18
    .line 19
    .line 20
    move-result-wide p1

    .line 21
    iget-object p3, p0, Lfj/a0$a;->l:Lfj/k;

    .line 22
    .line 23
    invoke-interface {p3, p1, p2}, Lfj/k;->a(J)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lfj/q;

    .line 28
    .line 29
    return-object p1

    .line 30
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 31
    .line 32
    const-string p2, "Missing epoch day value."

    .line 33
    .line 34
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p1
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

.method public bridge synthetic j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfj/q;

    invoke-virtual {p0, p1}, Lfj/a0$a;->e(Lfj/q;)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic m(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lfj/q;

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p0, p1, p2}, Lfj/a0$a;->h(Lfj/q;Ljava/lang/Long;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic o(Ljava/lang/Object;Ljava/lang/Object;Z)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfj/q;

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p0, p1, p2, p3}, Lfj/a0$a;->i(Lfj/q;Ljava/lang/Long;Z)Lfj/q;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic p(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfj/q;

    invoke-virtual {p0, p1}, Lfj/a0$a;->f(Lfj/q;)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfj/q;

    invoke-virtual {p0, p1}, Lfj/a0$a;->g(Lfj/q;)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method
