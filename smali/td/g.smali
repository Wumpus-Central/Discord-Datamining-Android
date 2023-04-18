.class Ltd/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ltd/c;

.field private final b:[Ltd/d;


# direct methods
.method constructor <init>(Ltd/c;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ltd/c;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Ltd/c;-><init>(Ltd/c;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ltd/g;->a:Ltd/c;

    .line 10
    .line 11
    invoke-virtual {p1}, Ltd/c;->e()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-virtual {p1}, Ltd/c;->g()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    sub-int/2addr v0, p1

    .line 20
    add-int/lit8 v0, v0, 0x1

    .line 21
    .line 22
    new-array p1, v0, [Ltd/d;

    .line 23
    .line 24
    iput-object p1, p0, Ltd/g;->b:[Ltd/d;

    .line 25
    .line 26
    return-void
    .line 27
.end method


# virtual methods
.method final a()Ltd/c;
    .locals 1

    iget-object v0, p0, Ltd/g;->a:Ltd/c;

    return-object v0
.end method

.method final b(I)Ltd/d;
    .locals 1

    iget-object v0, p0, Ltd/g;->b:[Ltd/d;

    invoke-virtual {p0, p1}, Ltd/g;->e(I)I

    move-result p1

    aget-object p1, v0, p1

    return-object p1
.end method

.method final c(I)Ltd/d;
    .locals 4

    .line 1
    invoke-virtual {p0, p1}, Ltd/g;->b(I)Ltd/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    const/4 v0, 0x1

    .line 9
    :goto_0
    const/4 v1, 0x5

    .line 10
    if-ge v0, v1, :cond_3

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Ltd/g;->e(I)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    sub-int/2addr v1, v0

    .line 17
    if-ltz v1, :cond_1

    .line 18
    .line 19
    iget-object v2, p0, Ltd/g;->b:[Ltd/d;

    .line 20
    .line 21
    aget-object v1, v2, v1

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    return-object v1

    .line 26
    :cond_1
    invoke-virtual {p0, p1}, Ltd/g;->e(I)I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    add-int/2addr v1, v0

    .line 31
    iget-object v2, p0, Ltd/g;->b:[Ltd/d;

    .line 32
    .line 33
    array-length v3, v2

    .line 34
    if-ge v1, v3, :cond_2

    .line 35
    .line 36
    aget-object v1, v2, v1

    .line 37
    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    return-object v1

    .line 41
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_3
    const/4 p1, 0x0

    .line 45
    return-object p1
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

.method final d()[Ltd/d;
    .locals 1

    iget-object v0, p0, Ltd/g;->b:[Ltd/d;

    return-object v0
.end method

.method final e(I)I
    .locals 1

    iget-object v0, p0, Ltd/g;->a:Ltd/c;

    invoke-virtual {v0}, Ltd/c;->g()I

    move-result v0

    sub-int/2addr p1, v0

    return p1
.end method

.method final f(ILtd/d;)V
    .locals 1

    iget-object v0, p0, Ltd/g;->b:[Ltd/d;

    invoke-virtual {p0, p1}, Ltd/g;->e(I)I

    move-result p1

    aput-object p2, v0, p1

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    .line 1
    new-instance v0, Ljava/util/Formatter;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/Formatter;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v1, p0, Ltd/g;->b:[Ltd/d;

    .line 7
    .line 8
    array-length v2, v1

    .line 9
    const/4 v3, 0x0

    .line 10
    move v4, v3

    .line 11
    move v5, v4

    .line 12
    :goto_0
    if-ge v4, v2, :cond_1

    .line 13
    .line 14
    aget-object v6, v1, v4

    .line 15
    .line 16
    const/4 v7, 0x1

    .line 17
    if-nez v6, :cond_0

    .line 18
    .line 19
    const-string v6, "%3d:    |   %n"

    .line 20
    .line 21
    new-array v7, v7, [Ljava/lang/Object;

    .line 22
    .line 23
    add-int/lit8 v8, v5, 0x1

    .line 24
    .line 25
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    aput-object v5, v7, v3

    .line 30
    .line 31
    invoke-virtual {v0, v6, v7}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    .line 32
    .line 33
    .line 34
    move v5, v8

    .line 35
    goto :goto_1

    .line 36
    :cond_0
    const-string v8, "%3d: %3d|%3d%n"

    .line 37
    .line 38
    const/4 v9, 0x3

    .line 39
    new-array v9, v9, [Ljava/lang/Object;

    .line 40
    .line 41
    add-int/lit8 v10, v5, 0x1

    .line 42
    .line 43
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    aput-object v5, v9, v3

    .line 48
    .line 49
    invoke-virtual {v6}, Ltd/d;->c()I

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    aput-object v5, v9, v7

    .line 58
    .line 59
    invoke-virtual {v6}, Ltd/d;->e()I

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    const/4 v6, 0x2

    .line 68
    aput-object v5, v9, v6

    .line 69
    .line 70
    invoke-virtual {v0, v8, v9}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    .line 71
    .line 72
    .line 73
    move v5, v10

    .line 74
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_1
    invoke-virtual {v0}, Ljava/util/Formatter;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    invoke-virtual {v0}, Ljava/util/Formatter;->close()V

    .line 82
    .line 83
    .line 84
    return-object v1

    .line 85
    :catchall_0
    move-exception v1

    .line 86
    :try_start_1
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 87
    :catchall_1
    move-exception v2

    .line 88
    :try_start_2
    invoke-virtual {v0}, Ljava/util/Formatter;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 89
    .line 90
    .line 91
    goto :goto_2

    .line 92
    :catchall_2
    move-exception v0

    .line 93
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 94
    .line 95
    .line 96
    :goto_2
    throw v2
    .line 97
.end method
