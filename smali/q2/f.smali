.class Lq2/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lr2/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const-string v0, "hd"

    .line 2
    .line 3
    const-string v1, "d"

    .line 4
    .line 5
    const-string v2, "nm"

    .line 6
    .line 7
    const-string v3, "p"

    .line 8
    .line 9
    const-string v4, "s"

    .line 10
    .line 11
    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Lr2/c$a;->a([Ljava/lang/String;)Lr2/c$a;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lq2/f;->a:Lr2/c$a;

    .line 20
    .line 21
    return-void
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
.end method

.method static a(Lr2/c;Lg2/i;I)Ln2/b;
    .locals 10

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x3

    .line 4
    if-ne p2, v2, :cond_0

    .line 5
    .line 6
    move p2, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move p2, v1

    .line 9
    :goto_0
    const/4 v3, 0x0

    .line 10
    move v8, p2

    .line 11
    move v9, v1

    .line 12
    move-object v5, v3

    .line 13
    move-object v6, v5

    .line 14
    move-object v7, v6

    .line 15
    :goto_1
    invoke-virtual {p0}, Lr2/c;->s()Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-eqz p2, :cond_7

    .line 20
    .line 21
    sget-object p2, Lq2/f;->a:Lr2/c$a;

    .line 22
    .line 23
    invoke-virtual {p0, p2}, Lr2/c;->g0(Lr2/c$a;)I

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    if-eqz p2, :cond_6

    .line 28
    .line 29
    if-eq p2, v0, :cond_5

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    if-eq p2, v3, :cond_4

    .line 33
    .line 34
    if-eq p2, v2, :cond_3

    .line 35
    .line 36
    const/4 v3, 0x4

    .line 37
    if-eq p2, v3, :cond_1

    .line 38
    .line 39
    invoke-virtual {p0}, Lr2/c;->h0()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Lr2/c;->i0()V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    invoke-virtual {p0}, Lr2/c;->x()I

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    if-ne p2, v2, :cond_2

    .line 51
    .line 52
    move v8, v0

    .line 53
    goto :goto_1

    .line 54
    :cond_2
    move v8, v1

    .line 55
    goto :goto_1

    .line 56
    :cond_3
    invoke-virtual {p0}, Lr2/c;->v()Z

    .line 57
    .line 58
    .line 59
    move-result v9

    .line 60
    goto :goto_1

    .line 61
    :cond_4
    invoke-static {p0, p1}, Lq2/d;->i(Lr2/c;Lg2/i;)Lm2/f;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    goto :goto_1

    .line 66
    :cond_5
    invoke-static {p0, p1}, Lq2/a;->b(Lr2/c;Lg2/i;)Lm2/m;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    goto :goto_1

    .line 71
    :cond_6
    invoke-virtual {p0}, Lr2/c;->F()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    goto :goto_1

    .line 76
    :cond_7
    new-instance p0, Ln2/b;

    .line 77
    .line 78
    move-object v4, p0

    .line 79
    invoke-direct/range {v4 .. v9}, Ln2/b;-><init>(Ljava/lang/String;Lm2/m;Lm2/f;ZZ)V

    .line 80
    .line 81
    .line 82
    return-object p0
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
    .line 201
    .line 202
.end method
