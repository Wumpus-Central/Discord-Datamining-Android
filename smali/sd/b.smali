.class public final Lsd/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcd/l;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static b(Lcd/c;Ljava/util/Map;Z)[Lcom/google/zxing/Result;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcd/c;",
            "Ljava/util/Map<",
            "Lcd/e;",
            "*>;Z)[",
            "Lcom/google/zxing/Result;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1, p2}, Lvd/a;->c(Lcd/c;Ljava/util/Map;Z)Lvd/b;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Lvd/b;->b()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    if-eqz p2, :cond_1

    .line 23
    .line 24
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    check-cast p2, [Lcd/o;

    .line 29
    .line 30
    invoke-virtual {p0}, Lvd/b;->a()Lgd/b;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const/4 v2, 0x4

    .line 35
    aget-object v2, p2, v2

    .line 36
    .line 37
    const/4 v3, 0x5

    .line 38
    aget-object v3, p2, v3

    .line 39
    .line 40
    const/4 v4, 0x6

    .line 41
    aget-object v4, p2, v4

    .line 42
    .line 43
    const/4 v5, 0x7

    .line 44
    aget-object v5, p2, v5

    .line 45
    .line 46
    invoke-static {p2}, Lsd/b;->e([Lcd/o;)I

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    invoke-static {p2}, Lsd/b;->c([Lcd/o;)I

    .line 51
    .line 52
    .line 53
    move-result v7

    .line 54
    invoke-static/range {v1 .. v7}, Ltd/j;->i(Lgd/b;Lcd/o;Lcd/o;Lcd/o;Lcd/o;II)Lgd/e;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    new-instance v2, Lcom/google/zxing/Result;

    .line 59
    .line 60
    invoke-virtual {v1}, Lgd/e;->h()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-virtual {v1}, Lgd/e;->e()[B

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    sget-object v5, Lcd/a;->u:Lcd/a;

    .line 69
    .line 70
    invoke-direct {v2, v3, v4, p2, v5}, Lcom/google/zxing/Result;-><init>(Ljava/lang/String;[B[Lcd/o;Lcd/a;)V

    .line 71
    .line 72
    .line 73
    sget-object p2, Lcd/n;->n:Lcd/n;

    .line 74
    .line 75
    invoke-virtual {v1}, Lgd/e;->b()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-virtual {v2, p2, v3}, Lcom/google/zxing/Result;->h(Lcd/n;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1}, Lgd/e;->d()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    check-cast p2, Lsd/c;

    .line 87
    .line 88
    if-eqz p2, :cond_0

    .line 89
    .line 90
    sget-object v1, Lcd/n;->s:Lcd/n;

    .line 91
    .line 92
    invoke-virtual {v2, v1, p2}, Lcom/google/zxing/Result;->h(Lcd/n;Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    :cond_0
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    new-array p0, p0, [Lcom/google/zxing/Result;

    .line 104
    .line 105
    invoke-interface {v0, p0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    check-cast p0, [Lcom/google/zxing/Result;

    .line 110
    .line 111
    return-object p0
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

.method private static c([Lcd/o;)I
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    aget-object v0, p0, v0

    .line 3
    .line 4
    const/4 v1, 0x4

    .line 5
    aget-object v1, p0, v1

    .line 6
    .line 7
    invoke-static {v0, v1}, Lsd/b;->d(Lcd/o;Lcd/o;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x6

    .line 12
    aget-object v1, p0, v1

    .line 13
    .line 14
    const/4 v2, 0x2

    .line 15
    aget-object v2, p0, v2

    .line 16
    .line 17
    invoke-static {v1, v2}, Lsd/b;->d(Lcd/o;Lcd/o;)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    mul-int/lit8 v1, v1, 0x11

    .line 22
    .line 23
    div-int/lit8 v1, v1, 0x12

    .line 24
    .line 25
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const/4 v1, 0x1

    .line 30
    aget-object v1, p0, v1

    .line 31
    .line 32
    const/4 v2, 0x5

    .line 33
    aget-object v2, p0, v2

    .line 34
    .line 35
    invoke-static {v1, v2}, Lsd/b;->d(Lcd/o;Lcd/o;)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    const/4 v2, 0x7

    .line 40
    aget-object v2, p0, v2

    .line 41
    .line 42
    const/4 v3, 0x3

    .line 43
    aget-object p0, p0, v3

    .line 44
    .line 45
    invoke-static {v2, p0}, Lsd/b;->d(Lcd/o;Lcd/o;)I

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    mul-int/lit8 p0, p0, 0x11

    .line 50
    .line 51
    div-int/lit8 p0, p0, 0x12

    .line 52
    .line 53
    invoke-static {v1, p0}, Ljava/lang/Math;->max(II)I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    invoke-static {v0, p0}, Ljava/lang/Math;->max(II)I

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    return p0
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

.method private static d(Lcd/o;Lcd/o;)I
    .locals 0

    if-eqz p0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcd/o;->c()F

    move-result p0

    invoke-virtual {p1}, Lcd/o;->c()F

    move-result p1

    sub-float/2addr p0, p1

    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    move-result p0

    float-to-int p0, p0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method private static e([Lcd/o;)I
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    aget-object v0, p0, v0

    .line 3
    .line 4
    const/4 v1, 0x4

    .line 5
    aget-object v1, p0, v1

    .line 6
    .line 7
    invoke-static {v0, v1}, Lsd/b;->f(Lcd/o;Lcd/o;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x6

    .line 12
    aget-object v1, p0, v1

    .line 13
    .line 14
    const/4 v2, 0x2

    .line 15
    aget-object v2, p0, v2

    .line 16
    .line 17
    invoke-static {v1, v2}, Lsd/b;->f(Lcd/o;Lcd/o;)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    mul-int/lit8 v1, v1, 0x11

    .line 22
    .line 23
    div-int/lit8 v1, v1, 0x12

    .line 24
    .line 25
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const/4 v1, 0x1

    .line 30
    aget-object v1, p0, v1

    .line 31
    .line 32
    const/4 v2, 0x5

    .line 33
    aget-object v2, p0, v2

    .line 34
    .line 35
    invoke-static {v1, v2}, Lsd/b;->f(Lcd/o;Lcd/o;)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    const/4 v2, 0x7

    .line 40
    aget-object v2, p0, v2

    .line 41
    .line 42
    const/4 v3, 0x3

    .line 43
    aget-object p0, p0, v3

    .line 44
    .line 45
    invoke-static {v2, p0}, Lsd/b;->f(Lcd/o;Lcd/o;)I

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    mul-int/lit8 p0, p0, 0x11

    .line 50
    .line 51
    div-int/lit8 p0, p0, 0x12

    .line 52
    .line 53
    invoke-static {v1, p0}, Ljava/lang/Math;->min(II)I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    invoke-static {v0, p0}, Ljava/lang/Math;->min(II)I

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    return p0
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

.method private static f(Lcd/o;Lcd/o;)I
    .locals 0

    if-eqz p0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcd/o;->c()F

    move-result p0

    invoke-virtual {p1}, Lcd/o;->c()F

    move-result p1

    sub-float/2addr p0, p1

    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    move-result p0

    float-to-int p0, p0

    return p0

    :cond_1
    :goto_0
    const p0, 0x7fffffff

    return p0
.end method


# virtual methods
.method public a(Lcd/c;Ljava/util/Map;)Lcom/google/zxing/Result;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcd/c;",
            "Ljava/util/Map<",
            "Lcd/e;",
            "*>;)",
            "Lcom/google/zxing/Result;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p1, p2, v0}, Lsd/b;->b(Lcd/c;Ljava/util/Map;Z)[Lcom/google/zxing/Result;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    array-length p2, p1

    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    aget-object p1, p1, v0

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    invoke-static {}, Lcd/j;->a()Lcd/j;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    throw p1
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

.method public reset()V
    .locals 0

    return-void
.end method
