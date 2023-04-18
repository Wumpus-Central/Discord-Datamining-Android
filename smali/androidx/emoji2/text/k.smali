.class Landroidx/emoji2/text/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/emoji2/text/k$a;,
        Landroidx/emoji2/text/k$c;,
        Landroidx/emoji2/text/k$b;
    }
.end annotation


# direct methods
.method private static a(Landroidx/emoji2/text/k$c;)Landroidx/emoji2/text/k$b;
    .locals 12

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-interface {p0, v0}, Landroidx/emoji2/text/k$c;->a(I)V

    .line 3
    .line 4
    .line 5
    invoke-interface {p0}, Landroidx/emoji2/text/k$c;->readUnsignedShort()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/16 v2, 0x64

    .line 10
    .line 11
    const-string v3, "Cannot read metadata."

    .line 12
    .line 13
    if-gt v1, v2, :cond_5

    .line 14
    .line 15
    const/4 v2, 0x6

    .line 16
    invoke-interface {p0, v2}, Landroidx/emoji2/text/k$c;->a(I)V

    .line 17
    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    move v4, v2

    .line 21
    :goto_0
    const-wide/16 v5, -0x1

    .line 22
    .line 23
    if-ge v4, v1, :cond_1

    .line 24
    .line 25
    invoke-interface {p0}, Landroidx/emoji2/text/k$c;->b()I

    .line 26
    .line 27
    .line 28
    move-result v7

    .line 29
    invoke-interface {p0, v0}, Landroidx/emoji2/text/k$c;->a(I)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p0}, Landroidx/emoji2/text/k$c;->c()J

    .line 33
    .line 34
    .line 35
    move-result-wide v8

    .line 36
    invoke-interface {p0, v0}, Landroidx/emoji2/text/k$c;->a(I)V

    .line 37
    .line 38
    .line 39
    const v10, 0x6d657461

    .line 40
    .line 41
    .line 42
    if-ne v10, v7, :cond_0

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    move-wide v8, v5

    .line 49
    :goto_1
    cmp-long v0, v8, v5

    .line 50
    .line 51
    if-eqz v0, :cond_4

    .line 52
    .line 53
    invoke-interface {p0}, Landroidx/emoji2/text/k$c;->getPosition()J

    .line 54
    .line 55
    .line 56
    move-result-wide v0

    .line 57
    sub-long v0, v8, v0

    .line 58
    .line 59
    long-to-int v0, v0

    .line 60
    invoke-interface {p0, v0}, Landroidx/emoji2/text/k$c;->a(I)V

    .line 61
    .line 62
    .line 63
    const/16 v0, 0xc

    .line 64
    .line 65
    invoke-interface {p0, v0}, Landroidx/emoji2/text/k$c;->a(I)V

    .line 66
    .line 67
    .line 68
    invoke-interface {p0}, Landroidx/emoji2/text/k$c;->c()J

    .line 69
    .line 70
    .line 71
    move-result-wide v0

    .line 72
    :goto_2
    int-to-long v4, v2

    .line 73
    cmp-long v4, v4, v0

    .line 74
    .line 75
    if-gez v4, :cond_4

    .line 76
    .line 77
    invoke-interface {p0}, Landroidx/emoji2/text/k$c;->b()I

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    invoke-interface {p0}, Landroidx/emoji2/text/k$c;->c()J

    .line 82
    .line 83
    .line 84
    move-result-wide v5

    .line 85
    invoke-interface {p0}, Landroidx/emoji2/text/k$c;->c()J

    .line 86
    .line 87
    .line 88
    move-result-wide v10

    .line 89
    const v7, 0x456d6a69

    .line 90
    .line 91
    .line 92
    if-eq v7, v4, :cond_3

    .line 93
    .line 94
    const v7, 0x656d6a69

    .line 95
    .line 96
    .line 97
    if-ne v7, v4, :cond_2

    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_3
    :goto_3
    new-instance p0, Landroidx/emoji2/text/k$b;

    .line 104
    .line 105
    add-long/2addr v5, v8

    .line 106
    invoke-direct {p0, v5, v6, v10, v11}, Landroidx/emoji2/text/k$b;-><init>(JJ)V

    .line 107
    .line 108
    .line 109
    return-object p0

    .line 110
    :cond_4
    new-instance p0, Ljava/io/IOException;

    .line 111
    .line 112
    invoke-direct {p0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw p0

    .line 116
    :cond_5
    new-instance p0, Ljava/io/IOException;

    .line 117
    .line 118
    invoke-direct {p0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    throw p0
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
.end method

.method static b(Ljava/nio/ByteBuffer;)Lk1/b;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    new-instance v0, Landroidx/emoji2/text/k$a;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Landroidx/emoji2/text/k$a;-><init>(Ljava/nio/ByteBuffer;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Landroidx/emoji2/text/k;->a(Landroidx/emoji2/text/k$c;)Landroidx/emoji2/text/k$b;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Landroidx/emoji2/text/k$b;->a()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    long-to-int v0, v0

    .line 19
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 20
    .line 21
    .line 22
    invoke-static {p0}, Lk1/b;->h(Ljava/nio/ByteBuffer;)Lk1/b;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
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
.end method

.method static c(I)J
    .locals 4

    int-to-long v0, p0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    return-wide v0
.end method

.method static d(S)I
    .locals 1

    const v0, 0xffff

    and-int/2addr p0, v0

    return p0
.end method
