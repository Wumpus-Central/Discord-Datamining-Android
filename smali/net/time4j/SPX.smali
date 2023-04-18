.class final Lnet/time4j/SPX;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Externalizable;


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private transient k:Ljava/lang/Object;

.field private transient l:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lnet/time4j/SPX;->k:Ljava/lang/Object;

    .line 4
    iput p2, p0, Lnet/time4j/SPX;->l:I

    return-void
.end method

.method private a(Ljava/io/DataInput;B)Lnet/time4j/f0;
    .locals 4

    .line 1
    and-int/lit8 p2, p2, 0xf

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/io/DataInput;->readByte()B

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    shr-int/lit8 v1, v0, 0x5

    .line 8
    .line 9
    const/4 v2, 0x3

    .line 10
    and-int/2addr v1, v2

    .line 11
    and-int/lit8 v0, v0, 0x1f

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    if-eq v1, v3, :cond_2

    .line 15
    .line 16
    const/4 v3, 0x2

    .line 17
    if-eq v1, v3, :cond_1

    .line 18
    .line 19
    if-ne v1, v2, :cond_0

    .line 20
    .line 21
    invoke-interface {p1}, Ljava/io/DataInput;->readInt()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance p1, Ljava/io/StreamCorruptedException;

    .line 27
    .line 28
    const-string p2, "Unknown year range."

    .line 29
    .line 30
    invoke-direct {p1, p2}, Ljava/io/StreamCorruptedException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw p1

    .line 34
    :cond_1
    invoke-interface {p1}, Ljava/io/DataInput;->readShort()S

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    goto :goto_0

    .line 39
    :cond_2
    invoke-interface {p1}, Ljava/io/DataInput;->readByte()B

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    add-int/lit16 p1, p1, 0x73a

    .line 44
    .line 45
    add-int/lit16 p1, p1, 0x80

    .line 46
    .line 47
    :goto_0
    invoke-static {p2}, Lnet/time4j/b0;->e(I)Lnet/time4j/b0;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    invoke-static {p1, p2, v0}, Lnet/time4j/f0;->P0(ILnet/time4j/b0;I)Lnet/time4j/f0;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    return-object p1
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
.end method

.method private b(Ljava/io/ObjectInput;B)Ljava/lang/Object;
    .locals 5

    .line 1
    and-int/lit8 v0, p2, 0x1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ne v0, v2, :cond_0

    .line 6
    .line 7
    move v0, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, v1

    .line 10
    :goto_0
    const/4 v3, 0x2

    .line 11
    and-int/2addr p2, v3

    .line 12
    if-ne p2, v3, :cond_1

    .line 13
    .line 14
    move p2, v2

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    move p2, v1

    .line 17
    :goto_1
    if-eqz p2, :cond_2

    .line 18
    .line 19
    invoke-interface {p1}, Ljava/io/ObjectInput;->readObject()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, Ljava/util/Map;

    .line 24
    .line 25
    new-instance p2, Lnet/time4j/k$b;

    .line 26
    .line 27
    invoke-static {p1}, Lnet/time4j/k;->s(Ljava/util/Map;)Lnet/time4j/k;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-direct {p2, v0, p1}, Lnet/time4j/k$b;-><init>(ZLnet/time4j/k;)V

    .line 32
    .line 33
    .line 34
    return-object p2

    .line 35
    :cond_2
    invoke-interface {p1}, Ljava/io/DataInput;->readUTF()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-interface {p1}, Ljava/io/DataInput;->readUTF()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    const-string v3, "-"

    .line 44
    .line 45
    invoke-virtual {p2, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    const/4 v4, -0x1

    .line 50
    if-ne v3, v4, :cond_3

    .line 51
    .line 52
    new-instance v1, Ljava/util/Locale;

    .line 53
    .line 54
    invoke-direct {v1, p2}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_3
    new-instance v4, Ljava/util/Locale;

    .line 59
    .line 60
    invoke-virtual {p2, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    add-int/2addr v3, v2

    .line 65
    invoke-virtual {p2, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    invoke-direct {v4, v1, p2}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    move-object v1, v4

    .line 73
    :goto_2
    new-instance p2, Lnet/time4j/k$b;

    .line 74
    .line 75
    invoke-direct {p2, v0, v1, p1}, Lnet/time4j/k$b;-><init>(ZLjava/util/Locale;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    return-object p2
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
.end method

.method private c(Ljava/io/ObjectInput;B)Ljava/lang/Object;
    .locals 6

    .line 1
    and-int/lit8 p2, p2, 0xf

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    if-ne p2, v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move v1, v0

    .line 9
    :goto_0
    invoke-interface {p1}, Ljava/io/DataInput;->readInt()I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    if-nez p2, :cond_1

    .line 14
    .line 15
    invoke-static {}, Lnet/time4j/n;->j()Lnet/time4j/n;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1

    .line 20
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v2, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 23
    .line 24
    .line 25
    :goto_1
    if-ge v0, p2, :cond_3

    .line 26
    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    invoke-interface {p1}, Ljava/io/DataInput;->readLong()J

    .line 30
    .line 31
    .line 32
    move-result-wide v3

    .line 33
    goto :goto_2

    .line 34
    :cond_2
    invoke-interface {p1}, Ljava/io/DataInput;->readInt()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    int-to-long v3, v3

    .line 39
    :goto_2
    invoke-interface {p1}, Ljava/io/ObjectInput;->readObject()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    check-cast v5, Lnet/time4j/w;

    .line 44
    .line 45
    invoke-static {v3, v4, v5}, Lfj/l0$a;->c(JLjava/lang/Object;)Lfj/l0$a;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    add-int/lit8 v0, v0, 0x1

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    invoke-interface {p1}, Ljava/io/DataInput;->readBoolean()Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    new-instance p2, Lnet/time4j/n;

    .line 60
    .line 61
    invoke-direct {p2, v2, p1}, Lnet/time4j/n;-><init>(Ljava/util/List;Z)V

    .line 62
    .line 63
    .line 64
    return-object p2
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
.end method

.method private d(Ljava/io/ObjectInput;B)Ljava/lang/Object;
    .locals 4

    .line 1
    and-int/lit8 v0, p2, 0x1

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    sget-object v0, Lmj/f;->l:Lmj/f;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    sget-object v0, Lmj/f;->k:Lmj/f;

    .line 10
    .line 11
    :goto_0
    invoke-interface {p1}, Ljava/io/DataInput;->readLong()J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    const/4 v3, 0x2

    .line 16
    and-int/2addr p2, v3

    .line 17
    if-ne p2, v3, :cond_1

    .line 18
    .line 19
    invoke-interface {p1}, Ljava/io/DataInput;->readInt()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    const/4 p1, 0x0

    .line 25
    :goto_1
    sget-object p2, Lmj/f;->l:Lmj/f;

    .line 26
    .line 27
    if-ne v0, p2, :cond_2

    .line 28
    .line 29
    invoke-static {v1, v2, p1}, Lnet/time4j/y;->k(JI)Lnet/time4j/y;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1

    .line 34
    :cond_2
    invoke-static {v1, v2, p1}, Lnet/time4j/y;->j(JI)Lnet/time4j/y;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1
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

.method private e(Ljava/io/DataInput;B)Ljava/lang/Object;
    .locals 3

    and-int/lit8 v0, p2, 0x1

    and-int/lit8 p2, p2, 0x2

    const/4 v1, 0x1

    ushr-int/2addr p2, v1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    if-eqz p2, :cond_1

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    invoke-static {p1, v0, v1}, Lnet/time4j/a0;->r0(Ljava/io/DataInput;ZZ)Lnet/time4j/a0;

    move-result-object p1

    return-object p1
.end method

.method private f(Ljava/io/DataInput;)Lnet/time4j/g0;
    .locals 5

    .line 1
    invoke-interface {p1}, Ljava/io/DataInput;->readByte()B

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-gez v0, :cond_0

    .line 6
    .line 7
    not-int p1, v0

    .line 8
    invoke-static {p1}, Lnet/time4j/g0;->J0(I)Lnet/time4j/g0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1

    .line 13
    :cond_0
    invoke-interface {p1}, Ljava/io/DataInput;->readByte()B

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x0

    .line 18
    if-gez v1, :cond_1

    .line 19
    .line 20
    not-int v1, v1

    .line 21
    move p1, v2

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    invoke-interface {p1}, Ljava/io/DataInput;->readByte()B

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-gez v3, :cond_2

    .line 28
    .line 29
    not-int p1, v3

    .line 30
    move v4, v2

    .line 31
    move v2, p1

    .line 32
    move p1, v4

    .line 33
    goto :goto_0

    .line 34
    :cond_2
    invoke-interface {p1}, Ljava/io/DataInput;->readInt()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    move p1, v2

    .line 39
    move v2, v3

    .line 40
    :goto_0
    invoke-static {v0, v1, v2, p1}, Lnet/time4j/g0;->M0(IIII)Lnet/time4j/g0;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    return-object p1
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

.method private g(Ljava/io/DataInput;B)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lnet/time4j/SPX;->a(Ljava/io/DataInput;B)Lnet/time4j/f0;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-direct {p0, p1}, Lnet/time4j/SPX;->f(Ljava/io/DataInput;)Lnet/time4j/g0;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p2, p1}, Lnet/time4j/h0;->e0(Lnet/time4j/f0;Lnet/time4j/g0;)Lnet/time4j/h0;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
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

.method private h(Ljava/io/DataInput;B)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-interface {p1}, Ljava/io/DataInput;->readByte()B

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    shr-int/lit8 v1, v0, 0x4

    .line 6
    .line 7
    invoke-static {v1}, Lnet/time4j/x0;->h(I)Lnet/time4j/x0;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    and-int/lit8 v0, v0, 0xf

    .line 12
    .line 13
    sget-object v2, Lnet/time4j/x0;->p:Lnet/time4j/x0;

    .line 14
    .line 15
    sget-object v3, Lnet/time4j/x0;->q:Lnet/time4j/x0;

    .line 16
    .line 17
    and-int/lit8 p2, p2, 0xf

    .line 18
    .line 19
    const/4 v4, 0x1

    .line 20
    if-ne p2, v4, :cond_0

    .line 21
    .line 22
    invoke-interface {p1}, Ljava/io/DataInput;->readByte()B

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    shr-int/lit8 p2, p1, 0x4

    .line 27
    .line 28
    invoke-static {p2}, Lnet/time4j/x0;->h(I)Lnet/time4j/x0;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    and-int/lit8 p1, p1, 0xf

    .line 33
    .line 34
    invoke-static {p1}, Lnet/time4j/x0;->h(I)Lnet/time4j/x0;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    :cond_0
    invoke-static {v1, v0, v2, v3}, Lnet/time4j/z0;->l(Lnet/time4j/x0;ILnet/time4j/x0;Lnet/time4j/x0;)Lnet/time4j/z0;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    return-object p1
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
.end method

.method private i(Ljava/io/DataOutput;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/time4j/SPX;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lnet/time4j/f0;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-static {v0, v1, p1}, Lnet/time4j/SPX;->j(Lnet/time4j/f0;ILjava/io/DataOutput;)V

    .line 7
    .line 8
    .line 9
    return-void
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
.end method

.method private static j(Lnet/time4j/f0;ILjava/io/DataOutput;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lnet/time4j/f0;->i()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x2

    .line 7
    const/16 v3, 0x73a

    .line 8
    .line 9
    if-lt v0, v3, :cond_0

    .line 10
    .line 11
    const/16 v4, 0x834

    .line 12
    .line 13
    if-gt v0, v4, :cond_0

    .line 14
    .line 15
    move v4, v1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    const/16 v5, 0x2710

    .line 22
    .line 23
    if-ge v4, v5, :cond_1

    .line 24
    .line 25
    move v4, v2

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 v4, 0x3

    .line 28
    :goto_0
    shl-int/lit8 p1, p1, 0x4

    .line 29
    .line 30
    invoke-virtual {p0}, Lnet/time4j/f0;->j()I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    or-int/2addr p1, v5

    .line 35
    invoke-interface {p2, p1}, Ljava/io/DataOutput;->writeByte(I)V

    .line 36
    .line 37
    .line 38
    shl-int/lit8 p1, v4, 0x5

    .line 39
    .line 40
    invoke-virtual {p0}, Lnet/time4j/f0;->p()I

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    or-int/2addr p0, p1

    .line 45
    invoke-interface {p2, p0}, Ljava/io/DataOutput;->writeByte(I)V

    .line 46
    .line 47
    .line 48
    if-ne v4, v1, :cond_2

    .line 49
    .line 50
    sub-int/2addr v0, v3

    .line 51
    add-int/lit8 v0, v0, -0x80

    .line 52
    .line 53
    invoke-interface {p2, v0}, Ljava/io/DataOutput;->writeByte(I)V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    if-ne v4, v2, :cond_3

    .line 58
    .line 59
    invoke-interface {p2, v0}, Ljava/io/DataOutput;->writeShort(I)V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    invoke-interface {p2, v0}, Ljava/io/DataOutput;->writeInt(I)V

    .line 64
    .line 65
    .line 66
    :goto_1
    return-void
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

.method private k(Ljava/io/ObjectOutput;)V
    .locals 4

    .line 1
    const-class v0, Lnet/time4j/k$b;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/time4j/SPX;->k:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lnet/time4j/k$b;

    .line 10
    .line 11
    invoke-virtual {v0}, Lnet/time4j/k$b;->F()Ljava/util/Locale;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0}, Lnet/time4j/k$b;->N()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    const/16 v2, 0x71

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/16 v2, 0x70

    .line 25
    .line 26
    :goto_0
    if-nez v1, :cond_1

    .line 27
    .line 28
    or-int/lit8 v2, v2, 0x2

    .line 29
    .line 30
    :cond_1
    invoke-interface {p1, v2}, Ljava/io/DataOutput;->writeByte(I)V

    .line 31
    .line 32
    .line 33
    if-nez v1, :cond_2

    .line 34
    .line 35
    invoke-virtual {v0}, Lnet/time4j/k$b;->C()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-interface {p1, v0}, Ljava/io/ObjectOutput;->writeObject(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-nez v3, :cond_3

    .line 56
    .line 57
    new-instance v3, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v2, "-"

    .line 66
    .line 67
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    :cond_3
    invoke-interface {p1, v2}, Ljava/io/DataOutput;->writeUTF(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0}, Lnet/time4j/k$b;->y()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeUTF(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    :goto_1
    return-void
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

.method private l(Ljava/io/ObjectOutput;)V
    .locals 9

    .line 1
    const-class v0, Lnet/time4j/n;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/time4j/SPX;->k:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lnet/time4j/n;

    .line 10
    .line 11
    invoke-virtual {v0}, Lnet/time4j/n;->a()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x6

    .line 20
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const/4 v3, 0x0

    .line 25
    move v4, v3

    .line 26
    :goto_0
    if-ge v4, v2, :cond_1

    .line 27
    .line 28
    invoke-virtual {v0}, Lnet/time4j/n;->a()Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    check-cast v5, Lfj/l0$a;

    .line 37
    .line 38
    invoke-virtual {v5}, Lfj/l0$a;->a()J

    .line 39
    .line 40
    .line 41
    move-result-wide v5

    .line 42
    const-wide/16 v7, 0x3e8

    .line 43
    .line 44
    cmp-long v5, v5, v7

    .line 45
    .line 46
    if-ltz v5, :cond_0

    .line 47
    .line 48
    const/4 v2, 0x1

    .line 49
    goto :goto_1

    .line 50
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    move v2, v3

    .line 54
    :goto_1
    if-eqz v2, :cond_2

    .line 55
    .line 56
    const/16 v4, 0x61

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_2
    const/16 v4, 0x60

    .line 60
    .line 61
    :goto_2
    invoke-interface {p1, v4}, Ljava/io/DataOutput;->writeByte(I)V

    .line 62
    .line 63
    .line 64
    invoke-interface {p1, v1}, Ljava/io/DataOutput;->writeInt(I)V

    .line 65
    .line 66
    .line 67
    :goto_3
    if-ge v3, v1, :cond_4

    .line 68
    .line 69
    invoke-virtual {v0}, Lnet/time4j/n;->a()Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    check-cast v4, Lfj/l0$a;

    .line 78
    .line 79
    if-eqz v2, :cond_3

    .line 80
    .line 81
    invoke-virtual {v4}, Lfj/l0$a;->a()J

    .line 82
    .line 83
    .line 84
    move-result-wide v5

    .line 85
    invoke-interface {p1, v5, v6}, Ljava/io/DataOutput;->writeLong(J)V

    .line 86
    .line 87
    .line 88
    goto :goto_4

    .line 89
    :cond_3
    invoke-virtual {v4}, Lfj/l0$a;->a()J

    .line 90
    .line 91
    .line 92
    move-result-wide v5

    .line 93
    long-to-int v5, v5

    .line 94
    invoke-interface {p1, v5}, Ljava/io/DataOutput;->writeInt(I)V

    .line 95
    .line 96
    .line 97
    :goto_4
    invoke-virtual {v4}, Lfj/l0$a;->b()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    invoke-interface {p1, v4}, Ljava/io/ObjectOutput;->writeObject(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    add-int/lit8 v3, v3, 0x1

    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_4
    if-lez v1, :cond_5

    .line 108
    .line 109
    invoke-virtual {v0}, Lnet/time4j/n;->i()Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeBoolean(Z)V

    .line 114
    .line 115
    .line 116
    :cond_5
    return-void
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

.method private m(Ljava/io/ObjectOutput;)V
    .locals 3

    .line 1
    const-class v0, Lnet/time4j/y;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/time4j/SPX;->k:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lnet/time4j/y;

    .line 10
    .line 11
    invoke-virtual {v0}, Lnet/time4j/y;->f()Lmj/f;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    sget-object v2, Lmj/f;->l:Lmj/f;

    .line 16
    .line 17
    if-ne v1, v2, :cond_0

    .line 18
    .line 19
    const/16 v1, 0x51

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/16 v1, 0x50

    .line 23
    .line 24
    :goto_0
    invoke-virtual {v0}, Lnet/time4j/y;->e()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-nez v2, :cond_1

    .line 29
    .line 30
    invoke-interface {p1, v1}, Ljava/io/DataOutput;->writeByte(I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Lnet/time4j/y;->h()J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    invoke-interface {p1, v0, v1}, Ljava/io/DataOutput;->writeLong(J)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    or-int/lit8 v1, v1, 0x2

    .line 42
    .line 43
    invoke-interface {p1, v1}, Ljava/io/DataOutput;->writeByte(I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Lnet/time4j/y;->h()J

    .line 47
    .line 48
    .line 49
    move-result-wide v1

    .line 50
    invoke-interface {p1, v1, v2}, Ljava/io/DataOutput;->writeLong(J)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Lnet/time4j/y;->e()I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeInt(I)V

    .line 58
    .line 59
    .line 60
    :goto_1
    return-void
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

.method private n(Ljava/io/DataOutput;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/time4j/SPX;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lnet/time4j/a0;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lnet/time4j/a0;->z0(Ljava/io/DataOutput;)V

    .line 6
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
.end method

.method private o(Ljava/io/DataOutput;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/time4j/SPX;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lnet/time4j/g0;

    .line 4
    .line 5
    const/16 v1, 0x20

    .line 6
    .line 7
    invoke-interface {p1, v1}, Ljava/io/DataOutput;->writeByte(I)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0, p1}, Lnet/time4j/SPX;->p(Lnet/time4j/g0;Ljava/io/DataOutput;)V

    .line 11
    .line 12
    .line 13
    return-void
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
.end method

.method private static p(Lnet/time4j/g0;Ljava/io/DataOutput;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lnet/time4j/g0;->a()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {p0}, Lnet/time4j/g0;->s()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Lnet/time4j/g0;->e()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Lnet/time4j/g0;->q()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    not-int p0, p0

    .line 24
    invoke-interface {p1, p0}, Ljava/io/DataOutput;->writeByte(I)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual {p0}, Lnet/time4j/g0;->q()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeByte(I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lnet/time4j/g0;->e()I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    not-int p0, p0

    .line 40
    invoke-interface {p1, p0}, Ljava/io/DataOutput;->writeByte(I)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    invoke-virtual {p0}, Lnet/time4j/g0;->q()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeByte(I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lnet/time4j/g0;->e()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeByte(I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Lnet/time4j/g0;->s()I

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    not-int p0, p0

    .line 63
    invoke-interface {p1, p0}, Ljava/io/DataOutput;->writeByte(I)V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    invoke-virtual {p0}, Lnet/time4j/g0;->q()I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeByte(I)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, Lnet/time4j/g0;->e()I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeByte(I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, Lnet/time4j/g0;->s()I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeByte(I)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0}, Lnet/time4j/g0;->a()I

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    invoke-interface {p1, p0}, Ljava/io/DataOutput;->writeInt(I)V

    .line 93
    .line 94
    .line 95
    :goto_0
    return-void
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
.end method

.method private q(Ljava/io/DataOutput;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lnet/time4j/SPX;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lnet/time4j/h0;

    .line 4
    .line 5
    invoke-virtual {v0}, Lnet/time4j/h0;->Y()Lnet/time4j/f0;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/16 v2, 0x8

    .line 10
    .line 11
    invoke-static {v1, v2, p1}, Lnet/time4j/SPX;->j(Lnet/time4j/f0;ILjava/io/DataOutput;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lnet/time4j/h0;->a0()Lnet/time4j/g0;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {v0, p1}, Lnet/time4j/SPX;->p(Lnet/time4j/g0;Ljava/io/DataOutput;)V

    .line 19
    .line 20
    .line 21
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method private r(Ljava/io/DataOutput;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lnet/time4j/SPX;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lnet/time4j/z0;

    .line 4
    .line 5
    invoke-virtual {v0}, Lnet/time4j/z0;->h()Lnet/time4j/x0;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget-object v2, Lnet/time4j/x0;->p:Lnet/time4j/x0;

    .line 10
    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Lnet/time4j/z0;->e()Lnet/time4j/x0;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    sget-object v2, Lnet/time4j/x0;->q:Lnet/time4j/x0;

    .line 18
    .line 19
    if-ne v1, v2, :cond_0

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v1, 0x0

    .line 24
    :goto_0
    if-nez v1, :cond_1

    .line 25
    .line 26
    const/16 v2, 0x31

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    const/16 v2, 0x30

    .line 30
    .line 31
    :goto_1
    invoke-interface {p1, v2}, Ljava/io/DataOutput;->writeByte(I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Lnet/time4j/z0;->f()Lnet/time4j/x0;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v2}, Lnet/time4j/x0;->b()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    shl-int/lit8 v2, v2, 0x4

    .line 43
    .line 44
    invoke-virtual {v0}, Lnet/time4j/z0;->g()I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    or-int/2addr v2, v3

    .line 49
    invoke-interface {p1, v2}, Ljava/io/DataOutput;->writeByte(I)V

    .line 50
    .line 51
    .line 52
    if-nez v1, :cond_2

    .line 53
    .line 54
    invoke-virtual {v0}, Lnet/time4j/z0;->h()Lnet/time4j/x0;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {v1}, Lnet/time4j/x0;->b()I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    shl-int/lit8 v1, v1, 0x4

    .line 63
    .line 64
    invoke-virtual {v0}, Lnet/time4j/z0;->e()Lnet/time4j/x0;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {v0}, Lnet/time4j/x0;->b()I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    or-int/2addr v0, v1

    .line 73
    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeByte(I)V

    .line 74
    .line 75
    .line 76
    :cond_2
    return-void
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

.method private readResolve()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lnet/time4j/SPX;->k:Ljava/lang/Object;

    return-object v0
.end method


# virtual methods
.method public readExternal(Ljava/io/ObjectInput;)V
    .locals 2

    .line 1
    invoke-interface {p1}, Ljava/io/DataInput;->readByte()B

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    and-int/lit16 v1, v0, 0xff

    .line 6
    .line 7
    shr-int/lit8 v1, v1, 0x4

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance p1, Ljava/io/StreamCorruptedException;

    .line 13
    .line 14
    const-string v0, "Unknown serialized type."

    .line 15
    .line 16
    invoke-direct {p1, v0}, Ljava/io/StreamCorruptedException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p1

    .line 20
    :pswitch_0
    invoke-direct {p0, p1, v0}, Lnet/time4j/SPX;->g(Ljava/io/DataInput;B)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, Lnet/time4j/SPX;->k:Ljava/lang/Object;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :pswitch_1
    invoke-direct {p0, p1, v0}, Lnet/time4j/SPX;->b(Ljava/io/ObjectInput;B)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iput-object p1, p0, Lnet/time4j/SPX;->k:Ljava/lang/Object;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :pswitch_2
    invoke-direct {p0, p1, v0}, Lnet/time4j/SPX;->c(Ljava/io/ObjectInput;B)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, p0, Lnet/time4j/SPX;->k:Ljava/lang/Object;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :pswitch_3
    invoke-direct {p0, p1, v0}, Lnet/time4j/SPX;->d(Ljava/io/ObjectInput;B)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iput-object p1, p0, Lnet/time4j/SPX;->k:Ljava/lang/Object;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :pswitch_4
    invoke-direct {p0, p1, v0}, Lnet/time4j/SPX;->e(Ljava/io/DataInput;B)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iput-object p1, p0, Lnet/time4j/SPX;->k:Ljava/lang/Object;

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :pswitch_5
    invoke-direct {p0, p1, v0}, Lnet/time4j/SPX;->h(Ljava/io/DataInput;B)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iput-object p1, p0, Lnet/time4j/SPX;->k:Ljava/lang/Object;

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :pswitch_6
    invoke-direct {p0, p1}, Lnet/time4j/SPX;->f(Ljava/io/DataInput;)Lnet/time4j/g0;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    iput-object p1, p0, Lnet/time4j/SPX;->k:Ljava/lang/Object;

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :pswitch_7
    invoke-direct {p0, p1, v0}, Lnet/time4j/SPX;->a(Ljava/io/DataInput;B)Lnet/time4j/f0;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    iput-object p1, p0, Lnet/time4j/SPX;->k:Ljava/lang/Object;

    .line 74
    .line 75
    :goto_0
    return-void

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public writeExternal(Ljava/io/ObjectOutput;)V
    .locals 1

    .line 1
    iget v0, p0, Lnet/time4j/SPX;->l:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/io/InvalidClassException;

    .line 7
    .line 8
    const-string v0, "Unknown serialized type."

    .line 9
    .line 10
    invoke-direct {p1, v0}, Ljava/io/InvalidClassException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p1

    .line 14
    :pswitch_0
    invoke-direct {p0, p1}, Lnet/time4j/SPX;->q(Ljava/io/DataOutput;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :pswitch_1
    invoke-direct {p0, p1}, Lnet/time4j/SPX;->k(Ljava/io/ObjectOutput;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :pswitch_2
    invoke-direct {p0, p1}, Lnet/time4j/SPX;->l(Ljava/io/ObjectOutput;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :pswitch_3
    invoke-direct {p0, p1}, Lnet/time4j/SPX;->m(Ljava/io/ObjectOutput;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :pswitch_4
    invoke-direct {p0, p1}, Lnet/time4j/SPX;->n(Ljava/io/DataOutput;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :pswitch_5
    invoke-direct {p0, p1}, Lnet/time4j/SPX;->r(Ljava/io/DataOutput;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :pswitch_6
    invoke-direct {p0, p1}, Lnet/time4j/SPX;->o(Ljava/io/DataOutput;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :pswitch_7
    invoke-direct {p0, p1}, Lnet/time4j/SPX;->i(Ljava/io/DataOutput;)V

    .line 43
    .line 44
    .line 45
    :goto_0
    return-void

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
