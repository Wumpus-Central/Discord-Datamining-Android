.class public Lcom/facebook/imageutils/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(I)I
    .locals 0

    invoke-static {p0}, Lcom/facebook/imageutils/e;->a(I)I

    move-result p0

    return p0
.end method

.method public static b(Ljava/io/InputStream;)I
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-static {p0}, Lcom/facebook/imageutils/c;->d(Ljava/io/InputStream;)I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    invoke-static {p0, v1}, Lcom/facebook/imageutils/e;->d(Ljava/io/InputStream;I)I

    .line 10
    .line 11
    .line 12
    move-result p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    return p0

    .line 14
    :catch_0
    return v0
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
.end method

.method private static c(I)Z
    .locals 0

    packed-switch p0, :pswitch_data_0

    :pswitch_0
    const/4 p0, 0x0

    return p0

    :pswitch_1
    const/4 p0, 0x1

    return p0

    nop

    :pswitch_data_0
    .packed-switch 0xc0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method private static d(Ljava/io/InputStream;)I
    .locals 4

    .line 1
    const/16 v0, 0xe1

    .line 2
    .line 3
    invoke-static {p0, v0}, Lcom/facebook/imageutils/c;->e(Ljava/io/InputStream;I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-static {p0, v0, v1}, Lcom/facebook/imageutils/d;->a(Ljava/io/InputStream;IZ)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    sub-int/2addr v2, v0

    .line 16
    const/4 v3, 0x6

    .line 17
    if-le v2, v3, :cond_0

    .line 18
    .line 19
    const/4 v3, 0x4

    .line 20
    invoke-static {p0, v3, v1}, Lcom/facebook/imageutils/d;->a(Ljava/io/InputStream;IZ)I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    add-int/lit8 v2, v2, -0x4

    .line 25
    .line 26
    invoke-static {p0, v0, v1}, Lcom/facebook/imageutils/d;->a(Ljava/io/InputStream;IZ)I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    add-int/lit8 v2, v2, -0x2

    .line 31
    .line 32
    const v0, 0x45786966

    .line 33
    .line 34
    .line 35
    if-ne v3, v0, :cond_0

    .line 36
    .line 37
    if-nez p0, :cond_0

    .line 38
    .line 39
    return v2

    .line 40
    :cond_0
    return v1
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
.end method

.method public static e(Ljava/io/InputStream;I)Z
    .locals 4

    .line 1
    invoke-static {p0}, Lv3/j;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    :cond_0
    :goto_0
    const/4 v0, 0x1

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-static {p0, v0, v1}, Lcom/facebook/imageutils/d;->a(Ljava/io/InputStream;IZ)I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    const/16 v3, 0xff

    .line 11
    .line 12
    if-ne v2, v3, :cond_6

    .line 13
    .line 14
    move v2, v3

    .line 15
    :goto_1
    if-ne v2, v3, :cond_1

    .line 16
    .line 17
    invoke-static {p0, v0, v1}, Lcom/facebook/imageutils/d;->a(Ljava/io/InputStream;IZ)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    const/16 v3, 0xc0

    .line 23
    .line 24
    if-ne p1, v3, :cond_2

    .line 25
    .line 26
    invoke-static {v2}, Lcom/facebook/imageutils/c;->c(I)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_2

    .line 31
    .line 32
    return v0

    .line 33
    :cond_2
    if-ne v2, p1, :cond_3

    .line 34
    .line 35
    return v0

    .line 36
    :cond_3
    const/16 v3, 0xd8

    .line 37
    .line 38
    if-eq v2, v3, :cond_0

    .line 39
    .line 40
    if-ne v2, v0, :cond_4

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_4
    const/16 v0, 0xd9

    .line 44
    .line 45
    if-eq v2, v0, :cond_6

    .line 46
    .line 47
    const/16 v0, 0xda

    .line 48
    .line 49
    if-ne v2, v0, :cond_5

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_5
    const/4 v0, 0x2

    .line 53
    invoke-static {p0, v0, v1}, Lcom/facebook/imageutils/d;->a(Ljava/io/InputStream;IZ)I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    sub-int/2addr v1, v0

    .line 58
    int-to-long v0, v1

    .line 59
    invoke-virtual {p0, v0, v1}, Ljava/io/InputStream;->skip(J)J

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_6
    :goto_2
    return v1
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
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
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
.end method
