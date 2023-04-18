.class public final Ldd/b;
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


# virtual methods
.method public a(Lcd/c;Ljava/util/Map;)Lcom/google/zxing/Result;
    .locals 10
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
    new-instance v0, Lfd/a;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcd/c;->a()Lgd/b;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-direct {v0, p1}, Lfd/a;-><init>(Lgd/b;)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    const/4 v1, 0x0

    .line 12
    :try_start_0
    invoke-virtual {v0, p1}, Lfd/a;->a(Z)Ldd/a;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v2}, Lgd/g;->b()[Lcd/o;

    .line 17
    .line 18
    .line 19
    move-result-object v3
    :try_end_0
    .catch Lcd/j; {:try_start_0 .. :try_end_0} :catch_3
    .catch Lcd/f; {:try_start_0 .. :try_end_0} :catch_2

    .line 20
    :try_start_1
    new-instance v4, Led/a;

    .line 21
    .line 22
    invoke-direct {v4}, Led/a;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v4, v2}, Led/a;->c(Ldd/a;)Lgd/e;

    .line 26
    .line 27
    .line 28
    move-result-object v2
    :try_end_1
    .catch Lcd/j; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lcd/f; {:try_start_1 .. :try_end_1} :catch_0

    .line 29
    move-object v4, v3

    .line 30
    move-object v3, v1

    .line 31
    move-object v1, v2

    .line 32
    move-object v2, v3

    .line 33
    goto :goto_2

    .line 34
    :catch_0
    move-exception v2

    .line 35
    goto :goto_0

    .line 36
    :catch_1
    move-exception v2

    .line 37
    goto :goto_1

    .line 38
    :catch_2
    move-exception v2

    .line 39
    move-object v3, v1

    .line 40
    :goto_0
    move-object v4, v3

    .line 41
    move-object v3, v2

    .line 42
    move-object v2, v1

    .line 43
    goto :goto_2

    .line 44
    :catch_3
    move-exception v2

    .line 45
    move-object v3, v1

    .line 46
    :goto_1
    move-object v4, v3

    .line 47
    move-object v3, v1

    .line 48
    :goto_2
    if-nez v1, :cond_2

    .line 49
    .line 50
    const/4 v1, 0x1

    .line 51
    :try_start_2
    invoke-virtual {v0, v1}, Lfd/a;->a(Z)Ldd/a;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0}, Lgd/g;->b()[Lcd/o;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    new-instance v1, Led/a;

    .line 60
    .line 61
    invoke-direct {v1}, Led/a;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1, v0}, Led/a;->c(Ldd/a;)Lgd/e;

    .line 65
    .line 66
    .line 67
    move-result-object v1
    :try_end_2
    .catch Lcd/j; {:try_start_2 .. :try_end_2} :catch_5
    .catch Lcd/f; {:try_start_2 .. :try_end_2} :catch_4

    .line 68
    goto :goto_4

    .line 69
    :catch_4
    move-exception p1

    .line 70
    goto :goto_3

    .line 71
    :catch_5
    move-exception p1

    .line 72
    :goto_3
    if-nez v2, :cond_1

    .line 73
    .line 74
    if-eqz v3, :cond_0

    .line 75
    .line 76
    throw v3

    .line 77
    :cond_0
    throw p1

    .line 78
    :cond_1
    throw v2

    .line 79
    :cond_2
    :goto_4
    move-object v6, v4

    .line 80
    if-eqz p2, :cond_3

    .line 81
    .line 82
    sget-object v0, Lcd/e;->u:Lcd/e;

    .line 83
    .line 84
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    check-cast p2, Lcd/p;

    .line 89
    .line 90
    if-eqz p2, :cond_3

    .line 91
    .line 92
    array-length v0, v6

    .line 93
    :goto_5
    if-ge p1, v0, :cond_3

    .line 94
    .line 95
    aget-object v2, v6, p1

    .line 96
    .line 97
    invoke-interface {p2, v2}, Lcd/p;->a(Lcd/o;)V

    .line 98
    .line 99
    .line 100
    add-int/lit8 p1, p1, 0x1

    .line 101
    .line 102
    goto :goto_5

    .line 103
    :cond_3
    new-instance p1, Lcom/google/zxing/Result;

    .line 104
    .line 105
    invoke-virtual {v1}, Lgd/e;->h()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    invoke-virtual {v1}, Lgd/e;->e()[B

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    invoke-virtual {v1}, Lgd/e;->c()I

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    sget-object v7, Lcd/a;->k:Lcd/a;

    .line 118
    .line 119
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 120
    .line 121
    .line 122
    move-result-wide v8

    .line 123
    move-object v2, p1

    .line 124
    invoke-direct/range {v2 .. v9}, Lcom/google/zxing/Result;-><init>(Ljava/lang/String;[BI[Lcd/o;Lcd/a;J)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1}, Lgd/e;->a()Ljava/util/List;

    .line 128
    .line 129
    .line 130
    move-result-object p2

    .line 131
    if-eqz p2, :cond_4

    .line 132
    .line 133
    sget-object v0, Lcd/n;->m:Lcd/n;

    .line 134
    .line 135
    invoke-virtual {p1, v0, p2}, Lcom/google/zxing/Result;->h(Lcd/n;Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    :cond_4
    invoke-virtual {v1}, Lgd/e;->b()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p2

    .line 142
    if-eqz p2, :cond_5

    .line 143
    .line 144
    sget-object v0, Lcd/n;->n:Lcd/n;

    .line 145
    .line 146
    invoke-virtual {p1, v0, p2}, Lcom/google/zxing/Result;->h(Lcd/n;Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    :cond_5
    return-object p1
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
