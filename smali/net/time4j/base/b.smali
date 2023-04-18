.class public final Lnet/time4j/base/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(III)V
    .locals 3

    .line 1
    const v0, -0x3b9ac9ff

    .line 2
    .line 3
    .line 4
    if-lt p0, v0, :cond_3

    .line 5
    .line 6
    const v0, 0x3b9ac9ff

    .line 7
    .line 8
    .line 9
    if-gt p0, v0, :cond_3

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    if-lt p1, v0, :cond_2

    .line 13
    .line 14
    const/16 v1, 0xc

    .line 15
    .line 16
    if-gt p1, v1, :cond_2

    .line 17
    .line 18
    if-lt p2, v0, :cond_1

    .line 19
    .line 20
    const/16 v0, 0x1f

    .line 21
    .line 22
    if-gt p2, v0, :cond_1

    .line 23
    .line 24
    invoke-static {p0, p1}, Lnet/time4j/base/b;->d(II)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-gt p2, v0, :cond_0

    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 32
    .line 33
    new-instance v1, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    const-string v2, "DAY_OF_MONTH exceeds month length in given year: "

    .line 39
    .line 40
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-static {p0, p1, p2}, Lnet/time4j/base/b;->m(III)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw v0

    .line 58
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 59
    .line 60
    new-instance p1, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    const-string v0, "DAY_OF_MONTH out of range: "

    .line 66
    .line 67
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw p0

    .line 81
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 82
    .line 83
    new-instance p2, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 86
    .line 87
    .line 88
    const-string v0, "MONTH out of range: "

    .line 89
    .line 90
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    throw p0

    .line 104
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 105
    .line 106
    new-instance p2, Ljava/lang/StringBuilder;

    .line 107
    .line 108
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 109
    .line 110
    .line 111
    const-string v0, "YEAR out of range: "

    .line 112
    .line 113
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    throw p1
    .line 127
    .line 128
    .line 129
.end method

.method private static b(I)I
    .locals 3

    packed-switch p0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Month out of range: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    const/16 p0, 0x19

    return p0

    :pswitch_1
    const/16 p0, 0x17

    return p0

    :pswitch_2
    const/16 p0, 0x14

    return p0

    :pswitch_3
    const/16 p0, 0x12

    return p0

    :pswitch_4
    const/16 p0, 0xf

    return p0

    :pswitch_5
    const/16 p0, 0xc

    return p0

    :pswitch_6
    const/16 p0, 0xa

    return p0

    :pswitch_7
    const/4 p0, 0x7

    return p0

    :pswitch_8
    const/4 p0, 0x5

    return p0

    :pswitch_9
    const/4 p0, 0x2

    return p0

    :pswitch_a
    const/16 p0, 0x1f

    return p0

    :pswitch_b
    const/16 p0, 0x1c

    return p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static c(III)I
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-lt p2, v0, :cond_4

    .line 3
    .line 4
    const/16 v0, 0x1f

    .line 5
    .line 6
    if-gt p2, v0, :cond_4

    .line 7
    .line 8
    invoke-static {p0, p1}, Lnet/time4j/base/b;->d(II)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-gt p2, v0, :cond_3

    .line 13
    .line 14
    invoke-static {p1}, Lnet/time4j/base/b;->b(I)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    rem-int/lit8 v1, p0, 0x64

    .line 19
    .line 20
    const/16 v2, 0x64

    .line 21
    .line 22
    invoke-static {p0, v2}, Lnet/time4j/base/c;->a(II)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-gez v1, :cond_0

    .line 27
    .line 28
    add-int/lit8 v1, v1, 0x64

    .line 29
    .line 30
    :cond_0
    const/4 v2, 0x2

    .line 31
    if-gt p1, v2, :cond_1

    .line 32
    .line 33
    add-int/lit8 v1, v1, -0x1

    .line 34
    .line 35
    if-gez v1, :cond_1

    .line 36
    .line 37
    add-int/lit8 p0, p0, -0x1

    .line 38
    .line 39
    const/16 v1, 0x63

    .line 40
    .line 41
    :cond_1
    const/4 p1, 0x4

    .line 42
    invoke-static {p0, p1}, Lnet/time4j/base/c;->a(II)I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    add-int/2addr p2, v0

    .line 47
    add-int/2addr p2, v1

    .line 48
    div-int/2addr v1, p1

    .line 49
    add-int/2addr p2, v1

    .line 50
    add-int/2addr p2, v3

    .line 51
    mul-int/2addr p0, v2

    .line 52
    sub-int/2addr p2, p0

    .line 53
    rem-int/lit8 p2, p2, 0x7

    .line 54
    .line 55
    if-gtz p2, :cond_2

    .line 56
    .line 57
    add-int/lit8 p2, p2, 0x7

    .line 58
    .line 59
    :cond_2
    return p2

    .line 60
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 61
    .line 62
    new-instance v1, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 65
    .line 66
    .line 67
    const-string v2, "Day exceeds month length: "

    .line 68
    .line 69
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-static {p0, p1, p2}, Lnet/time4j/base/b;->m(III)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw v0

    .line 87
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 88
    .line 89
    new-instance p1, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 92
    .line 93
    .line 94
    const-string v0, "Day out of range: "

    .line 95
    .line 96
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    throw p0
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

.method public static d(II)I
    .locals 2

    .line 1
    packed-switch p1, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 5
    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v1, "Invalid month: "

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p0

    .line 27
    :pswitch_0
    const/16 p0, 0x1e

    .line 28
    .line 29
    return p0

    .line 30
    :pswitch_1
    invoke-static {p0}, Lnet/time4j/base/b;->e(I)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-eqz p0, :cond_0

    .line 35
    .line 36
    const/16 p0, 0x1d

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/16 p0, 0x1c

    .line 40
    .line 41
    :goto_0
    return p0

    .line 42
    :pswitch_2
    const/16 p0, 0x1f

    .line 43
    .line 44
    return p0

    .line 45
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_2
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_0
        :pswitch_2
        :pswitch_0
        :pswitch_2
    .end packed-switch
    .line 46
    .line 47
    .line 48
    .line 49
.end method

.method public static e(I)Z
    .locals 3

    const/16 v0, 0x76c

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-le p0, v0, :cond_1

    const/16 v0, 0x834

    if-ge p0, v0, :cond_1

    and-int/lit8 p0, p0, 0x3

    if-nez p0, :cond_0

    move v1, v2

    :cond_0
    return v1

    :cond_1
    and-int/lit8 v0, p0, 0x3

    if-nez v0, :cond_2

    rem-int/lit8 v0, p0, 0x64

    if-nez v0, :cond_3

    :cond_2
    rem-int/lit16 p0, p0, 0x190

    if-nez p0, :cond_4

    :cond_3
    move v1, v2

    :cond_4
    return v1
.end method

.method public static f(III)Z
    .locals 2

    const v0, -0x3b9ac9ff

    if-lt p0, v0, :cond_0

    const v0, 0x3b9ac9ff

    if-gt p0, v0, :cond_0

    const/4 v0, 0x1

    if-lt p1, v0, :cond_0

    const/16 v1, 0xc

    if-gt p1, v1, :cond_0

    if-lt p2, v0, :cond_0

    invoke-static {p0, p1}, Lnet/time4j/base/b;->d(II)I

    move-result p0

    if-gt p2, p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static g(J)I
    .locals 2

    const-wide/16 v0, 0xff

    and-long/2addr p0, v0

    long-to-int p0, p0

    return p0
.end method

.method public static h(J)I
    .locals 2

    const/16 v0, 0x10

    shr-long/2addr p0, v0

    const-wide/16 v0, 0xff

    and-long/2addr p0, v0

    long-to-int p0, p0

    return p0
.end method

.method public static i(J)I
    .locals 1

    const/16 v0, 0x20

    shr-long/2addr p0, v0

    long-to-int p0, p0

    return p0
.end method

.method public static j(III)J
    .locals 6

    .line 1
    invoke-static {p0, p1, p2}, Lnet/time4j/base/b;->a(III)V

    .line 2
    .line 3
    .line 4
    int-to-long v0, p0

    .line 5
    const/4 p0, 0x3

    .line 6
    if-ge p1, p0, :cond_0

    .line 7
    .line 8
    const-wide/16 v2, 0x1

    .line 9
    .line 10
    sub-long/2addr v0, v2

    .line 11
    add-int/lit8 p1, p1, 0xc

    .line 12
    .line 13
    :cond_0
    const-wide/16 v2, 0x16d

    .line 14
    .line 15
    mul-long/2addr v2, v0

    .line 16
    const/4 p0, 0x4

    .line 17
    invoke-static {v0, v1, p0}, Lnet/time4j/base/c;->b(JI)J

    .line 18
    .line 19
    .line 20
    move-result-wide v4

    .line 21
    add-long/2addr v2, v4

    .line 22
    const/16 p0, 0x64

    .line 23
    .line 24
    invoke-static {v0, v1, p0}, Lnet/time4j/base/c;->b(JI)J

    .line 25
    .line 26
    .line 27
    move-result-wide v4

    .line 28
    sub-long/2addr v2, v4

    .line 29
    const/16 p0, 0x190

    .line 30
    .line 31
    invoke-static {v0, v1, p0}, Lnet/time4j/base/c;->b(JI)J

    .line 32
    .line 33
    .line 34
    move-result-wide v0

    .line 35
    add-long/2addr v2, v0

    .line 36
    add-int/lit8 p1, p1, 0x1

    .line 37
    .line 38
    mul-int/lit16 p1, p1, 0x99

    .line 39
    .line 40
    div-int/lit8 p1, p1, 0x5

    .line 41
    .line 42
    int-to-long p0, p1

    .line 43
    add-long/2addr v2, p0

    .line 44
    const-wide/16 p0, 0x7b

    .line 45
    .line 46
    sub-long/2addr v2, p0

    .line 47
    int-to-long p0, p2

    .line 48
    add-long/2addr v2, p0

    .line 49
    const-wide/32 p0, 0xa5be1

    .line 50
    .line 51
    .line 52
    sub-long/2addr v2, p0

    .line 53
    return-wide v2
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

.method public static k(Lnet/time4j/base/a;)J
    .locals 2

    .line 1
    invoke-interface {p0}, Lnet/time4j/base/a;->i()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-interface {p0}, Lnet/time4j/base/a;->j()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-interface {p0}, Lnet/time4j/base/a;->p()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    invoke-static {v0, v1, p0}, Lnet/time4j/base/b;->j(III)J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    return-wide v0
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

.method public static l(J)J
    .locals 10

    .line 1
    const-wide/32 v0, 0xa5be1

    .line 2
    .line 3
    .line 4
    invoke-static {p0, p1, v0, v1}, Lnet/time4j/base/c;->f(JJ)J

    .line 5
    .line 6
    .line 7
    move-result-wide p0

    .line 8
    const v0, 0x23ab1

    .line 9
    .line 10
    .line 11
    invoke-static {p0, p1, v0}, Lnet/time4j/base/c;->b(JI)J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    invoke-static {p0, p1, v0}, Lnet/time4j/base/c;->d(JI)I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    const p1, 0x23ab0

    .line 20
    .line 21
    .line 22
    const/16 v0, 0x1d

    .line 23
    .line 24
    const-wide/16 v3, 0x1

    .line 25
    .line 26
    const/4 v5, 0x2

    .line 27
    const-wide/16 v6, 0x190

    .line 28
    .line 29
    if-ne p0, p1, :cond_0

    .line 30
    .line 31
    add-long/2addr v1, v3

    .line 32
    mul-long/2addr v1, v6

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const p1, 0x8eac

    .line 35
    .line 36
    .line 37
    div-int v8, p0, p1

    .line 38
    .line 39
    rem-int/2addr p0, p1

    .line 40
    div-int/lit16 p1, p0, 0x5b5

    .line 41
    .line 42
    rem-int/lit16 p0, p0, 0x5b5

    .line 43
    .line 44
    const/16 v9, 0x5b4

    .line 45
    .line 46
    if-ne p0, v9, :cond_1

    .line 47
    .line 48
    mul-long/2addr v1, v6

    .line 49
    mul-int/lit8 v8, v8, 0x64

    .line 50
    .line 51
    int-to-long v3, v8

    .line 52
    add-long/2addr v1, v3

    .line 53
    add-int/lit8 p1, p1, 0x1

    .line 54
    .line 55
    mul-int/lit8 p1, p1, 0x4

    .line 56
    .line 57
    int-to-long p0, p1

    .line 58
    add-long/2addr v1, p0

    .line 59
    goto :goto_0

    .line 60
    :cond_1
    div-int/lit16 v0, p0, 0x16d

    .line 61
    .line 62
    rem-int/lit16 p0, p0, 0x16d

    .line 63
    .line 64
    mul-long/2addr v1, v6

    .line 65
    mul-int/lit8 v8, v8, 0x64

    .line 66
    .line 67
    int-to-long v6, v8

    .line 68
    add-long/2addr v1, v6

    .line 69
    mul-int/lit8 p1, p1, 0x4

    .line 70
    .line 71
    int-to-long v6, p1

    .line 72
    add-long/2addr v1, v6

    .line 73
    int-to-long v6, v0

    .line 74
    add-long/2addr v1, v6

    .line 75
    add-int/lit8 p1, p0, 0x1f

    .line 76
    .line 77
    mul-int/lit8 p1, p1, 0x5

    .line 78
    .line 79
    div-int/lit16 p1, p1, 0x99

    .line 80
    .line 81
    add-int/2addr v5, p1

    .line 82
    add-int/lit8 p1, v5, 0x1

    .line 83
    .line 84
    mul-int/lit16 p1, p1, 0x99

    .line 85
    .line 86
    div-int/lit8 p1, p1, 0x5

    .line 87
    .line 88
    sub-int/2addr p0, p1

    .line 89
    add-int/lit8 v0, p0, 0x7b

    .line 90
    .line 91
    const/16 p0, 0xc

    .line 92
    .line 93
    if-le v5, p0, :cond_2

    .line 94
    .line 95
    add-long/2addr v1, v3

    .line 96
    add-int/lit8 v5, v5, -0xc

    .line 97
    .line 98
    :cond_2
    :goto_0
    const-wide/32 p0, -0x3b9ac9ff

    .line 99
    .line 100
    .line 101
    cmp-long p0, v1, p0

    .line 102
    .line 103
    if-ltz p0, :cond_3

    .line 104
    .line 105
    const-wide/32 p0, 0x3b9ac9ff

    .line 106
    .line 107
    .line 108
    cmp-long p0, v1, p0

    .line 109
    .line 110
    if-gtz p0, :cond_3

    .line 111
    .line 112
    const/16 p0, 0x20

    .line 113
    .line 114
    shl-long p0, v1, p0

    .line 115
    .line 116
    shl-int/lit8 v1, v5, 0x10

    .line 117
    .line 118
    int-to-long v1, v1

    .line 119
    or-long/2addr p0, v1

    .line 120
    int-to-long v0, v0

    .line 121
    or-long/2addr p0, v0

    .line 122
    return-wide p0

    .line 123
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 124
    .line 125
    new-instance p1, Ljava/lang/StringBuilder;

    .line 126
    .line 127
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 128
    .line 129
    .line 130
    const-string v0, "Year out of range: "

    .line 131
    .line 132
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {p1, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    throw p0
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
.end method

.method static m(III)Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    const/16 p0, 0x2d

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const/16 v1, 0x30

    .line 15
    .line 16
    const/16 v2, 0xa

    .line 17
    .line 18
    if-ge p1, v2, :cond_0

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    if-ge p2, v2, :cond_1

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0
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
