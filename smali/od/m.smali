.class final Lod/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:[I

.field private final b:Ljava/lang/StringBuilder;


# direct methods
.method constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x4

    .line 5
    new-array v0, v0, [I

    .line 6
    .line 7
    iput-object v0, p0, Lod/m;->a:[I

    .line 8
    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lod/m;->b:Ljava/lang/StringBuilder;

    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method private a(Lgd/a;[ILjava/lang/StringBuilder;)I
    .locals 11

    .line 1
    iget-object v0, p0, Lod/m;->a:[I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aput v1, v0, v1

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    aput v1, v0, v2

    .line 8
    .line 9
    const/4 v3, 0x2

    .line 10
    aput v1, v0, v3

    .line 11
    .line 12
    const/4 v4, 0x3

    .line 13
    aput v1, v0, v4

    .line 14
    .line 15
    invoke-virtual {p1}, Lgd/a;->j()I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    aget p2, p2, v2

    .line 20
    .line 21
    move v5, v1

    .line 22
    move v6, v5

    .line 23
    :goto_0
    if-ge v5, v3, :cond_3

    .line 24
    .line 25
    if-ge p2, v4, :cond_3

    .line 26
    .line 27
    sget-object v7, Lod/p;->h:[[I

    .line 28
    .line 29
    invoke-static {p1, v0, p2, v7}, Lod/p;->i(Lgd/a;[II[[I)I

    .line 30
    .line 31
    .line 32
    move-result v7

    .line 33
    rem-int/lit8 v8, v7, 0xa

    .line 34
    .line 35
    add-int/lit8 v8, v8, 0x30

    .line 36
    .line 37
    int-to-char v8, v8

    .line 38
    invoke-virtual {p3, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    array-length v8, v0

    .line 42
    move v9, v1

    .line 43
    :goto_1
    if-ge v9, v8, :cond_0

    .line 44
    .line 45
    aget v10, v0, v9

    .line 46
    .line 47
    add-int/2addr p2, v10

    .line 48
    add-int/lit8 v9, v9, 0x1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_0
    const/16 v8, 0xa

    .line 52
    .line 53
    if-lt v7, v8, :cond_1

    .line 54
    .line 55
    rsub-int/lit8 v7, v5, 0x1

    .line 56
    .line 57
    shl-int v7, v2, v7

    .line 58
    .line 59
    or-int/2addr v6, v7

    .line 60
    :cond_1
    if-eq v5, v2, :cond_2

    .line 61
    .line 62
    invoke-virtual {p1, p2}, Lgd/a;->g(I)I

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    invoke-virtual {p1, p2}, Lgd/a;->h(I)I

    .line 67
    .line 68
    .line 69
    move-result p2

    .line 70
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_3
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->length()I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-ne p1, v3, :cond_5

    .line 78
    .line 79
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    rem-int/lit8 p1, p1, 0x4

    .line 88
    .line 89
    if-ne p1, v6, :cond_4

    .line 90
    .line 91
    return p2

    .line 92
    :cond_4
    invoke-static {}, Lcd/j;->a()Lcd/j;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    throw p1

    .line 97
    :cond_5
    invoke-static {}, Lcd/j;->a()Lcd/j;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    throw p1
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

.method private static c(Ljava/lang/String;)Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Lcd/n;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    return-object p0

    .line 10
    :cond_0
    new-instance v0, Ljava/util/EnumMap;

    .line 11
    .line 12
    const-class v1, Lcd/n;

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 15
    .line 16
    .line 17
    sget-object v1, Lcd/n;->o:Lcd/n;

    .line 18
    .line 19
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    return-object v0
    .line 27
.end method


# virtual methods
.method b(ILgd/a;[I)Lcom/google/zxing/Result;
    .locals 8

    .line 1
    iget-object v0, p0, Lod/m;->b:Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p2, p3, v0}, Lod/m;->a(Lgd/a;[ILjava/lang/StringBuilder;)I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Lod/m;->c(Ljava/lang/String;)Ljava/util/Map;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    new-instance v3, Lcom/google/zxing/Result;

    .line 20
    .line 21
    const/4 v4, 0x2

    .line 22
    new-array v4, v4, [Lcd/o;

    .line 23
    .line 24
    new-instance v5, Lcd/o;

    .line 25
    .line 26
    aget v6, p3, v1

    .line 27
    .line 28
    const/4 v7, 0x1

    .line 29
    aget p3, p3, v7

    .line 30
    .line 31
    add-int/2addr v6, p3

    .line 32
    int-to-float p3, v6

    .line 33
    const/high16 v6, 0x40000000    # 2.0f

    .line 34
    .line 35
    div-float/2addr p3, v6

    .line 36
    int-to-float p1, p1

    .line 37
    invoke-direct {v5, p3, p1}, Lcd/o;-><init>(FF)V

    .line 38
    .line 39
    .line 40
    aput-object v5, v4, v1

    .line 41
    .line 42
    new-instance p3, Lcd/o;

    .line 43
    .line 44
    int-to-float p2, p2

    .line 45
    invoke-direct {p3, p2, p1}, Lcd/o;-><init>(FF)V

    .line 46
    .line 47
    .line 48
    aput-object p3, v4, v7

    .line 49
    .line 50
    sget-object p1, Lcd/a;->A:Lcd/a;

    .line 51
    .line 52
    const/4 p2, 0x0

    .line 53
    invoke-direct {v3, v0, p2, v4, p1}, Lcom/google/zxing/Result;-><init>(Ljava/lang/String;[B[Lcd/o;Lcd/a;)V

    .line 54
    .line 55
    .line 56
    if-eqz v2, :cond_0

    .line 57
    .line 58
    invoke-virtual {v3, v2}, Lcom/google/zxing/Result;->g(Ljava/util/Map;)V

    .line 59
    .line 60
    .line 61
    :cond_0
    return-object v3
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
