.class public final Lmd/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcd/l;


# static fields
.field private static final b:[Lcd/o;


# instance fields
.field private final a:Lnd/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Lcd/o;

    .line 3
    .line 4
    sput-object v0, Lmd/a;->b:[Lcd/o;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
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
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lnd/c;

    .line 5
    .line 6
    invoke-direct {v0}, Lnd/c;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lmd/a;->a:Lnd/c;

    .line 10
    .line 11
    return-void
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
.end method

.method private static b(Lgd/b;)Lgd/b;
    .locals 14

    .line 1
    invoke-virtual {p0}, Lgd/b;->h()[I

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    aget v2, v0, v1

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    aget v3, v0, v3

    .line 12
    .line 13
    const/4 v4, 0x2

    .line 14
    aget v5, v0, v4

    .line 15
    .line 16
    const/4 v6, 0x3

    .line 17
    aget v0, v0, v6

    .line 18
    .line 19
    new-instance v6, Lgd/b;

    .line 20
    .line 21
    const/16 v7, 0x1e

    .line 22
    .line 23
    const/16 v8, 0x21

    .line 24
    .line 25
    invoke-direct {v6, v7, v8}, Lgd/b;-><init>(II)V

    .line 26
    .line 27
    .line 28
    move v9, v1

    .line 29
    :goto_0
    if-ge v9, v8, :cond_2

    .line 30
    .line 31
    mul-int v10, v9, v0

    .line 32
    .line 33
    div-int/lit8 v11, v0, 0x2

    .line 34
    .line 35
    add-int/2addr v10, v11

    .line 36
    div-int/2addr v10, v8

    .line 37
    add-int/2addr v10, v3

    .line 38
    move v11, v1

    .line 39
    :goto_1
    if-ge v11, v7, :cond_1

    .line 40
    .line 41
    mul-int v12, v11, v5

    .line 42
    .line 43
    div-int/lit8 v13, v5, 0x2

    .line 44
    .line 45
    add-int/2addr v12, v13

    .line 46
    and-int/lit8 v13, v9, 0x1

    .line 47
    .line 48
    mul-int/2addr v13, v5

    .line 49
    div-int/2addr v13, v4

    .line 50
    add-int/2addr v12, v13

    .line 51
    div-int/2addr v12, v7

    .line 52
    add-int/2addr v12, v2

    .line 53
    invoke-virtual {p0, v12, v10}, Lgd/b;->e(II)Z

    .line 54
    .line 55
    .line 56
    move-result v12

    .line 57
    if-eqz v12, :cond_0

    .line 58
    .line 59
    invoke-virtual {v6, v11, v9}, Lgd/b;->p(II)V

    .line 60
    .line 61
    .line 62
    :cond_0
    add-int/lit8 v11, v11, 0x1

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_1
    add-int/lit8 v9, v9, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    return-object v6

    .line 69
    :cond_3
    invoke-static {}, Lcd/j;->a()Lcd/j;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    throw p0
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
.method public a(Lcd/c;Ljava/util/Map;)Lcom/google/zxing/Result;
    .locals 4
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
    if-eqz p2, :cond_1

    .line 2
    .line 3
    sget-object v0, Lcd/e;->m:Lcd/e;

    .line 4
    .line 5
    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p1}, Lcd/c;->a()Lgd/b;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p1}, Lmd/a;->b(Lgd/b;)Lgd/b;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iget-object v0, p0, Lmd/a;->a:Lnd/c;

    .line 20
    .line 21
    invoke-virtual {v0, p1, p2}, Lnd/c;->b(Lgd/b;Ljava/util/Map;)Lgd/e;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    new-instance p2, Lcom/google/zxing/Result;

    .line 26
    .line 27
    invoke-virtual {p1}, Lgd/e;->h()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {p1}, Lgd/e;->e()[B

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    sget-object v2, Lmd/a;->b:[Lcd/o;

    .line 36
    .line 37
    sget-object v3, Lcd/a;->t:Lcd/a;

    .line 38
    .line 39
    invoke-direct {p2, v0, v1, v2, v3}, Lcom/google/zxing/Result;-><init>(Ljava/lang/String;[B[Lcd/o;Lcd/a;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Lgd/e;->b()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    if-eqz p1, :cond_0

    .line 47
    .line 48
    sget-object v0, Lcd/n;->n:Lcd/n;

    .line 49
    .line 50
    invoke-virtual {p2, v0, p1}, Lcom/google/zxing/Result;->h(Lcd/n;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    :cond_0
    return-object p2

    .line 54
    :cond_1
    invoke-static {}, Lcd/j;->a()Lcd/j;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    throw p1
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

.method public reset()V
    .locals 0

    return-void
.end method
