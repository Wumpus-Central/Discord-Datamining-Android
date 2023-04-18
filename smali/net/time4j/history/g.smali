.class public final Lnet/time4j/history/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final d:Lnet/time4j/history/g;

.field private static final e:Lnet/time4j/history/h;

.field private static final f:Lnet/time4j/history/h;

.field private static final g:Lnet/time4j/f0;


# instance fields
.field private final a:Lnet/time4j/history/j;

.field private final b:Lnet/time4j/f0;

.field private final c:Lnet/time4j/f0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lnet/time4j/history/g;

    .line 2
    .line 3
    invoke-direct {v0}, Lnet/time4j/history/g;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lnet/time4j/history/g;->d:Lnet/time4j/history/g;

    .line 7
    .line 8
    sget-object v0, Lnet/time4j/history/j;->l:Lnet/time4j/history/j;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-static {v0, v1, v1, v1}, Lnet/time4j/history/h;->i(Lnet/time4j/history/j;III)Lnet/time4j/history/h;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lnet/time4j/history/g;->e:Lnet/time4j/history/h;

    .line 16
    .line 17
    sget-object v0, Lnet/time4j/history/j;->k:Lnet/time4j/history/j;

    .line 18
    .line 19
    const/16 v2, 0x26

    .line 20
    .line 21
    invoke-static {v0, v2, v1, v1}, Lnet/time4j/history/h;->i(Lnet/time4j/history/j;III)Lnet/time4j/history/h;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lnet/time4j/history/g;->f:Lnet/time4j/history/h;

    .line 26
    .line 27
    const/16 v0, 0x7d0

    .line 28
    .line 29
    invoke-static {v0, v1}, Lnet/time4j/f0;->K0(II)Lnet/time4j/f0;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, Lnet/time4j/history/g;->g:Lnet/time4j/f0;

    .line 34
    .line 35
    return-void
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
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lnet/time4j/history/g;->a:Lnet/time4j/history/j;

    .line 3
    invoke-static {}, Lnet/time4j/f0;->v0()Lfj/h0;

    move-result-object v0

    invoke-virtual {v0}, Lfj/h0;->O()Lfj/k0;

    move-result-object v0

    check-cast v0, Lnet/time4j/f0;

    iput-object v0, p0, Lnet/time4j/history/g;->b:Lnet/time4j/f0;

    .line 4
    invoke-static {}, Lnet/time4j/f0;->v0()Lfj/h0;

    move-result-object v0

    invoke-virtual {v0}, Lfj/h0;->N()Lfj/k0;

    move-result-object v0

    check-cast v0, Lnet/time4j/f0;

    iput-object v0, p0, Lnet/time4j/history/g;->c:Lnet/time4j/f0;

    return-void
.end method

.method private constructor <init>(Lnet/time4j/history/j;Lnet/time4j/f0;Lnet/time4j/f0;)V
    .locals 2

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    sget-object v0, Lnet/time4j/history/j;->l:Lnet/time4j/history/j;

    invoke-virtual {p1, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v0

    if-lez v0, :cond_1

    .line 7
    invoke-virtual {p3, p2}, Lfj/m;->T(Lfj/g;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 8
    iput-object p1, p0, Lnet/time4j/history/g;->a:Lnet/time4j/history/j;

    .line 9
    iput-object p2, p0, Lnet/time4j/history/g;->b:Lnet/time4j/f0;

    .line 10
    iput-object p3, p0, Lnet/time4j/history/g;->c:Lnet/time4j/f0;

    return-void

    .line 11
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "End before start: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, "/"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 12
    :cond_1
    new-instance p2, Ljava/lang/UnsupportedOperationException;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public static a(Lnet/time4j/f0;Lnet/time4j/f0;)Lnet/time4j/history/g;
    .locals 2

    new-instance v0, Lnet/time4j/history/g;

    sget-object v1, Lnet/time4j/history/j;->o:Lnet/time4j/history/j;

    invoke-direct {v0, v1, p0, p1}, Lnet/time4j/history/g;-><init>(Lnet/time4j/history/j;Lnet/time4j/f0;Lnet/time4j/f0;)V

    return-object v0
.end method

.method public static b(Lnet/time4j/f0;Lnet/time4j/f0;)Lnet/time4j/history/g;
    .locals 2

    new-instance v0, Lnet/time4j/history/g;

    sget-object v1, Lnet/time4j/history/j;->n:Lnet/time4j/history/j;

    invoke-direct {v0, v1, p0, p1}, Lnet/time4j/history/g;-><init>(Lnet/time4j/history/j;Lnet/time4j/f0;Lnet/time4j/f0;)V

    return-object v0
.end method

.method public static c(Lnet/time4j/f0;)Lnet/time4j/history/g;
    .locals 1

    invoke-static {}, Lnet/time4j/f0;->v0()Lfj/h0;

    move-result-object v0

    invoke-virtual {v0}, Lfj/h0;->O()Lfj/k0;

    move-result-object v0

    check-cast v0, Lnet/time4j/f0;

    invoke-static {v0, p0}, Lnet/time4j/history/g;->b(Lnet/time4j/f0;Lnet/time4j/f0;)Lnet/time4j/history/g;

    move-result-object p0

    return-object p0
.end method

.method public static e(Lnet/time4j/f0;Lnet/time4j/f0;)Lnet/time4j/history/g;
    .locals 2

    new-instance v0, Lnet/time4j/history/g;

    sget-object v1, Lnet/time4j/history/j;->m:Lnet/time4j/history/j;

    invoke-direct {v0, v1, p0, p1}, Lnet/time4j/history/g;-><init>(Lnet/time4j/history/j;Lnet/time4j/f0;Lnet/time4j/f0;)V

    return-object v0
.end method

.method public static f(Lnet/time4j/f0;)Lnet/time4j/history/g;
    .locals 1

    invoke-static {}, Lnet/time4j/f0;->v0()Lfj/h0;

    move-result-object v0

    invoke-virtual {v0}, Lfj/h0;->O()Lfj/k0;

    move-result-object v0

    check-cast v0, Lnet/time4j/f0;

    invoke-static {v0, p0}, Lnet/time4j/history/g;->e(Lnet/time4j/f0;Lnet/time4j/f0;)Lnet/time4j/history/g;

    move-result-object p0

    return-object p0
.end method

.method static g(Ljava/io/DataInput;)Lnet/time4j/history/g;
    .locals 7

    .line 1
    invoke-interface {p0}, Ljava/io/DataInput;->readByte()B

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x7f

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-interface {p0}, Ljava/io/DataInput;->readUTF()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Lnet/time4j/history/j;->valueOf(Ljava/lang/String;)Lnet/time4j/history/j;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {p0}, Ljava/io/DataInput;->readLong()J

    .line 18
    .line 19
    .line 20
    move-result-wide v1

    .line 21
    invoke-interface {p0}, Ljava/io/DataInput;->readLong()J

    .line 22
    .line 23
    .line 24
    move-result-wide v3

    .line 25
    new-instance p0, Lnet/time4j/history/g;

    .line 26
    .line 27
    sget-object v5, Lnet/time4j/history/g;->g:Lnet/time4j/f0;

    .line 28
    .line 29
    sget-object v6, Lfj/a0;->m:Lfj/a0;

    .line 30
    .line 31
    invoke-virtual {v5, v6, v1, v2}, Lfj/q;->D(Lfj/p;J)Lfj/q;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Lnet/time4j/f0;

    .line 36
    .line 37
    invoke-virtual {v5, v6, v3, v4}, Lfj/q;->D(Lfj/p;J)Lfj/q;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, Lnet/time4j/f0;

    .line 42
    .line 43
    invoke-direct {p0, v0, v1, v2}, Lnet/time4j/history/g;-><init>(Lnet/time4j/history/j;Lnet/time4j/f0;Lnet/time4j/f0;)V

    .line 44
    .line 45
    .line 46
    return-object p0

    .line 47
    :cond_0
    sget-object p0, Lnet/time4j/history/g;->d:Lnet/time4j/history/g;

    .line 48
    .line 49
    return-object p0
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


# virtual methods
.method d(Lnet/time4j/history/h;Lnet/time4j/f0;)Lnet/time4j/history/j;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/time4j/history/g;->a:Lnet/time4j/history/j;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-object v0, p0, Lnet/time4j/history/g;->b:Lnet/time4j/f0;

    .line 6
    .line 7
    invoke-virtual {p2, v0}, Lfj/m;->T(Lfj/g;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_2

    .line 12
    .line 13
    iget-object v0, p0, Lnet/time4j/history/g;->c:Lnet/time4j/f0;

    .line 14
    .line 15
    invoke-virtual {p2, v0}, Lfj/m;->S(Lfj/g;)Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-eqz p2, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object p2, p0, Lnet/time4j/history/g;->a:Lnet/time4j/history/j;

    .line 23
    .line 24
    sget-object v0, Lnet/time4j/history/j;->m:Lnet/time4j/history/j;

    .line 25
    .line 26
    if-ne p2, v0, :cond_1

    .line 27
    .line 28
    sget-object p2, Lnet/time4j/history/g;->f:Lnet/time4j/history/h;

    .line 29
    .line 30
    invoke-virtual {p1, p2}, Lnet/time4j/history/h;->a(Lnet/time4j/history/h;)I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-gez p1, :cond_1

    .line 35
    .line 36
    sget-object p1, Lnet/time4j/history/j;->k:Lnet/time4j/history/j;

    .line 37
    .line 38
    return-object p1

    .line 39
    :cond_1
    iget-object p1, p0, Lnet/time4j/history/g;->a:Lnet/time4j/history/j;

    .line 40
    .line 41
    return-object p1

    .line 42
    :cond_2
    :goto_0
    sget-object p2, Lnet/time4j/history/g;->e:Lnet/time4j/history/h;

    .line 43
    .line 44
    invoke-virtual {p1, p2}, Lnet/time4j/history/h;->a(Lnet/time4j/history/h;)I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-gez p1, :cond_3

    .line 49
    .line 50
    sget-object p1, Lnet/time4j/history/j;->k:Lnet/time4j/history/j;

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    sget-object p1, Lnet/time4j/history/j;->l:Lnet/time4j/history/j;

    .line 54
    .line 55
    :goto_1
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

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lnet/time4j/history/g;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_4

    .line 9
    .line 10
    check-cast p1, Lnet/time4j/history/g;

    .line 11
    .line 12
    sget-object v1, Lnet/time4j/history/g;->d:Lnet/time4j/history/g;

    .line 13
    .line 14
    if-ne p0, v1, :cond_2

    .line 15
    .line 16
    if-ne p1, v1, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    move v0, v2

    .line 20
    :goto_0
    return v0

    .line 21
    :cond_2
    iget-object v1, p0, Lnet/time4j/history/g;->a:Lnet/time4j/history/j;

    .line 22
    .line 23
    iget-object v3, p1, Lnet/time4j/history/g;->a:Lnet/time4j/history/j;

    .line 24
    .line 25
    if-ne v1, v3, :cond_3

    .line 26
    .line 27
    iget-object v1, p0, Lnet/time4j/history/g;->b:Lnet/time4j/f0;

    .line 28
    .line 29
    iget-object v3, p1, Lnet/time4j/history/g;->b:Lnet/time4j/f0;

    .line 30
    .line 31
    invoke-virtual {v1, v3}, Lnet/time4j/f0;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_3

    .line 36
    .line 37
    iget-object v1, p0, Lnet/time4j/history/g;->c:Lnet/time4j/f0;

    .line 38
    .line 39
    iget-object p1, p1, Lnet/time4j/history/g;->c:Lnet/time4j/f0;

    .line 40
    .line 41
    invoke-virtual {v1, p1}, Lnet/time4j/f0;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-eqz p1, :cond_3

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_3
    move v0, v2

    .line 49
    :goto_1
    return v0

    .line 50
    :cond_4
    return v2
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

.method h(Ljava/io/DataOutput;)V
    .locals 4

    .line 1
    sget-object v0, Lnet/time4j/history/g;->d:Lnet/time4j/history/g;

    .line 2
    .line 3
    if-ne p0, v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeByte(I)V

    .line 7
    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/16 v0, 0x7f

    .line 11
    .line 12
    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeByte(I)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lnet/time4j/history/g;->a:Lnet/time4j/history/j;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeUTF(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lnet/time4j/history/g;->b:Lnet/time4j/f0;

    .line 25
    .line 26
    sget-object v1, Lfj/a0;->m:Lfj/a0;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Ljava/lang/Long;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 35
    .line 36
    .line 37
    move-result-wide v2

    .line 38
    invoke-interface {p1, v2, v3}, Ljava/io/DataOutput;->writeLong(J)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lnet/time4j/history/g;->c:Lnet/time4j/f0;

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, Ljava/lang/Long;

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 50
    .line 51
    .line 52
    move-result-wide v0

    .line 53
    invoke-interface {p1, v0, v1}, Ljava/io/DataOutput;->writeLong(J)V

    .line 54
    .line 55
    .line 56
    :goto_0
    return-void
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

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lnet/time4j/history/g;->a:Lnet/time4j/history/j;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x11

    iget-object v1, p0, Lnet/time4j/history/g;->b:Lnet/time4j/f0;

    invoke-virtual {v1}, Lnet/time4j/f0;->hashCode()I

    move-result v1

    mul-int/lit8 v1, v1, 0x1f

    add-int/2addr v0, v1

    iget-object v1, p0, Lnet/time4j/history/g;->c:Lnet/time4j/f0;

    invoke-virtual {v1}, Lnet/time4j/f0;->hashCode()I

    move-result v1

    mul-int/lit8 v1, v1, 0x25

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x5b

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    sget-object v1, Lnet/time4j/history/g;->d:Lnet/time4j/history/g;

    .line 12
    .line 13
    if-ne p0, v1, :cond_0

    .line 14
    .line 15
    const-string v1, "default"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const-string v1, "era->"

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lnet/time4j/history/g;->a:Lnet/time4j/history/j;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v1, ",start->"

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, Lnet/time4j/history/g;->b:Lnet/time4j/f0;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v1, ",end->"

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    iget-object v1, p0, Lnet/time4j/history/g;->c:Lnet/time4j/f0;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    :goto_0
    const/16 v1, 0x5d

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    return-object v0
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
.end method
