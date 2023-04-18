.class Lnet/time4j/calendar/b$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfj/z;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/time4j/calendar/b;
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
.field private final k:Lnet/time4j/calendar/b$f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/time4j/calendar/b$f<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lnet/time4j/calendar/b$f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/time4j/calendar/b$f<",
            "*>;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lnet/time4j/calendar/b$e;->k:Lnet/time4j/calendar/b$f;

    return-void
.end method

.method synthetic constructor <init>(Lnet/time4j/calendar/b$f;Lnet/time4j/calendar/b$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lnet/time4j/calendar/b$e;-><init>(Lnet/time4j/calendar/b$f;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Lfj/p;
    .locals 0

    check-cast p1, Lfj/q;

    invoke-virtual {p0, p1}, Lnet/time4j/calendar/b$e;->b(Lfj/q;)Lfj/p;

    move-result-object p1

    return-object p1
.end method

.method public b(Lfj/q;)Lfj/p;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
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

    invoke-virtual {p0, p1}, Lnet/time4j/calendar/b$e;->d(Lfj/q;)Lfj/p;

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

    const/4 p1, 0x0

    return-object p1
.end method

.method public e(Lfj/q;)Lnet/time4j/x0;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lnet/time4j/x0;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lfj/x;->A(Ljava/lang/Class;)Lfj/x;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    instance-of v1, p1, Lfj/l;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const-class v1, Lfj/l;

    .line 14
    .line 15
    invoke-virtual {v1, p1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lfj/l;

    .line 20
    .line 21
    invoke-interface {v1}, Lfj/o0;->h()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0, v1}, Lfj/x;->p(Ljava/lang/String;)Lfj/k;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-interface {v0}, Lfj/k;->c()J

    .line 30
    .line 31
    .line 32
    move-result-wide v0

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-virtual {v0}, Lfj/x;->o()Lfj/k;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-interface {v0}, Lfj/k;->c()J

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    :goto_0
    sget-object v2, Lfj/a0;->k:Lfj/a0;

    .line 43
    .line 44
    invoke-virtual {p1, v2}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, Ljava/lang/Long;

    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 51
    .line 52
    .line 53
    move-result-wide v2

    .line 54
    invoke-static {v2, v3}, Lnet/time4j/calendar/b;->a(J)Lnet/time4j/x0;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iget-object v4, p0, Lnet/time4j/calendar/b$e;->k:Lnet/time4j/calendar/b$f;

    .line 59
    .line 60
    invoke-static {v4}, Lnet/time4j/calendar/b$f;->Q(Lnet/time4j/calendar/b$f;)Lnet/time4j/z0;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-virtual {p1, v4}, Lnet/time4j/x0;->c(Lnet/time4j/z0;)I

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    const-wide/16 v4, 0x7

    .line 69
    .line 70
    add-long/2addr v2, v4

    .line 71
    int-to-long v4, p1

    .line 72
    sub-long/2addr v2, v4

    .line 73
    cmp-long p1, v2, v0

    .line 74
    .line 75
    if-lez p1, :cond_1

    .line 76
    .line 77
    invoke-static {v0, v1}, Lnet/time4j/calendar/b;->a(J)Lnet/time4j/x0;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    return-object p1

    .line 82
    :cond_1
    iget-object p1, p0, Lnet/time4j/calendar/b$e;->k:Lnet/time4j/calendar/b$f;

    .line 83
    .line 84
    invoke-virtual {p1}, Lnet/time4j/calendar/b$f;->U()Lnet/time4j/x0;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    return-object p1
    .line 89
    .line 90
.end method

.method public f(Lfj/q;)Lnet/time4j/x0;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lnet/time4j/x0;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lfj/x;->A(Ljava/lang/Class;)Lfj/x;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    instance-of v1, p1, Lfj/l;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const-class v1, Lfj/l;

    .line 14
    .line 15
    invoke-virtual {v1, p1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lfj/l;

    .line 20
    .line 21
    invoke-interface {v1}, Lfj/o0;->h()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0, v1}, Lfj/x;->p(Ljava/lang/String;)Lfj/k;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-interface {v0}, Lfj/k;->d()J

    .line 30
    .line 31
    .line 32
    move-result-wide v0

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-virtual {v0}, Lfj/x;->o()Lfj/k;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-interface {v0}, Lfj/k;->d()J

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    :goto_0
    sget-object v2, Lfj/a0;->k:Lfj/a0;

    .line 43
    .line 44
    invoke-virtual {p1, v2}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, Ljava/lang/Long;

    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 51
    .line 52
    .line 53
    move-result-wide v2

    .line 54
    invoke-static {v2, v3}, Lnet/time4j/calendar/b;->a(J)Lnet/time4j/x0;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iget-object v4, p0, Lnet/time4j/calendar/b$e;->k:Lnet/time4j/calendar/b$f;

    .line 59
    .line 60
    invoke-static {v4}, Lnet/time4j/calendar/b$f;->Q(Lnet/time4j/calendar/b$f;)Lnet/time4j/z0;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-virtual {p1, v4}, Lnet/time4j/x0;->c(Lnet/time4j/z0;)I

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    const-wide/16 v4, 0x1

    .line 69
    .line 70
    add-long/2addr v2, v4

    .line 71
    int-to-long v4, p1

    .line 72
    sub-long/2addr v2, v4

    .line 73
    cmp-long p1, v2, v0

    .line 74
    .line 75
    if-gez p1, :cond_1

    .line 76
    .line 77
    invoke-static {v0, v1}, Lnet/time4j/calendar/b;->a(J)Lnet/time4j/x0;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    return-object p1

    .line 82
    :cond_1
    iget-object p1, p0, Lnet/time4j/calendar/b$e;->k:Lnet/time4j/calendar/b$f;

    .line 83
    .line 84
    invoke-virtual {p1}, Lnet/time4j/calendar/b$f;->V()Lnet/time4j/x0;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    return-object p1
    .line 89
    .line 90
.end method

.method public g(Lfj/q;)Lnet/time4j/x0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lnet/time4j/x0;"
        }
    .end annotation

    sget-object v0, Lfj/a0;->k:Lfj/a0;

    invoke-virtual {p1, v0}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lnet/time4j/calendar/b;->a(J)Lnet/time4j/x0;

    move-result-object p1

    return-object p1
.end method

.method public h(Lfj/q;Lnet/time4j/x0;)Z
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
    invoke-virtual {p0, p1, p2, v0}, Lnet/time4j/calendar/b$e;->i(Lfj/q;Lnet/time4j/x0;Z)Lfj/q;
    :try_end_0
    .catch Ljava/lang/ArithmeticException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    return p1

    :catch_0
    return v0
.end method

.method public i(Lfj/q;Lnet/time4j/x0;Z)Lfj/q;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lnet/time4j/x0;",
            "Z)TT;"
        }
    .end annotation

    .line 1
    sget-object p3, Lfj/a0;->k:Lfj/a0;

    .line 2
    .line 3
    invoke-virtual {p1, p3}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Long;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    invoke-static {v0, v1}, Lnet/time4j/calendar/b;->a(J)Lnet/time4j/x0;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    if-ne p2, v2, :cond_0

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_0
    iget-object v3, p0, Lnet/time4j/calendar/b$e;->k:Lnet/time4j/calendar/b$f;

    .line 21
    .line 22
    invoke-static {v3}, Lnet/time4j/calendar/b$f;->Q(Lnet/time4j/calendar/b$f;)Lnet/time4j/z0;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v2, v3}, Lnet/time4j/x0;->c(Lnet/time4j/z0;)I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    iget-object v3, p0, Lnet/time4j/calendar/b$e;->k:Lnet/time4j/calendar/b$f;

    .line 31
    .line 32
    invoke-static {v3}, Lnet/time4j/calendar/b$f;->Q(Lnet/time4j/calendar/b$f;)Lnet/time4j/z0;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-virtual {p2, v3}, Lnet/time4j/x0;->c(Lnet/time4j/z0;)I

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    int-to-long v3, p2

    .line 41
    add-long/2addr v0, v3

    .line 42
    int-to-long v2, v2

    .line 43
    sub-long/2addr v0, v2

    .line 44
    invoke-virtual {p1, p3, v0, v1}, Lfj/q;->D(Lfj/p;J)Lfj/q;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    return-object p1
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

    invoke-virtual {p0, p1}, Lnet/time4j/calendar/b$e;->e(Lfj/q;)Lnet/time4j/x0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic m(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lfj/q;

    check-cast p2, Lnet/time4j/x0;

    invoke-virtual {p0, p1, p2}, Lnet/time4j/calendar/b$e;->h(Lfj/q;Lnet/time4j/x0;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic o(Ljava/lang/Object;Ljava/lang/Object;Z)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfj/q;

    check-cast p2, Lnet/time4j/x0;

    invoke-virtual {p0, p1, p2, p3}, Lnet/time4j/calendar/b$e;->i(Lfj/q;Lnet/time4j/x0;Z)Lfj/q;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic p(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfj/q;

    invoke-virtual {p0, p1}, Lnet/time4j/calendar/b$e;->f(Lfj/q;)Lnet/time4j/x0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfj/q;

    invoke-virtual {p0, p1}, Lnet/time4j/calendar/b$e;->g(Lfj/q;)Lnet/time4j/x0;

    move-result-object p1

    return-object p1
.end method
