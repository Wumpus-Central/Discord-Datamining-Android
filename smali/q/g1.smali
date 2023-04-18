.class public final Lq/g1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/y2;


# instance fields
.field final b:Lq/y1;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lq/y1;->b(Landroid/content/Context;)Lq/y1;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lq/g1;->b:Lq/y1;

    .line 9
    .line 10
    return-void
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


# virtual methods
.method public a(Lw/y2$b;)Lw/r0;
    .locals 9

    .line 1
    invoke-static {}, Lw/x1;->J()Lw/x1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lw/k2$b;

    .line 6
    .line 7
    invoke-direct {v1}, Lw/k2$b;-><init>()V

    .line 8
    .line 9
    .line 10
    sget-object v2, Lq/g1$a;->a:[I

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    aget v3, v2, v3

    .line 17
    .line 18
    const/4 v4, 0x4

    .line 19
    const/4 v5, 0x2

    .line 20
    const/4 v6, 0x3

    .line 21
    const/4 v7, 0x1

    .line 22
    if-eq v3, v7, :cond_1

    .line 23
    .line 24
    if-eq v3, v5, :cond_1

    .line 25
    .line 26
    if-eq v3, v6, :cond_1

    .line 27
    .line 28
    if-eq v3, v4, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {v1, v6}, Lw/k2$b;->r(I)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-virtual {v1, v7}, Lw/k2$b;->r(I)V

    .line 36
    .line 37
    .line 38
    :goto_0
    sget-object v3, Lw/y2$b;->l:Lw/y2$b;

    .line 39
    .line 40
    if-ne p1, v3, :cond_2

    .line 41
    .line 42
    invoke-static {v1}, Lu/k;->a(Lw/k2$b;)V

    .line 43
    .line 44
    .line 45
    :cond_2
    sget-object v8, Lw/x2;->l:Lw/r0$a;

    .line 46
    .line 47
    invoke-virtual {v1}, Lw/k2$b;->m()Lw/k2;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v0, v8, v1}, Lw/x1;->g(Lw/r0$a;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    sget-object v1, Lw/x2;->n:Lw/r0$a;

    .line 55
    .line 56
    sget-object v8, Lq/f1;->a:Lq/f1;

    .line 57
    .line 58
    invoke-virtual {v0, v1, v8}, Lw/x1;->g(Lw/r0$a;Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    new-instance v1, Lw/n0$a;

    .line 62
    .line 63
    invoke-direct {v1}, Lw/n0$a;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 67
    .line 68
    .line 69
    move-result v8

    .line 70
    aget v2, v2, v8

    .line 71
    .line 72
    if-eq v2, v7, :cond_5

    .line 73
    .line 74
    if-eq v2, v5, :cond_4

    .line 75
    .line 76
    if-eq v2, v6, :cond_4

    .line 77
    .line 78
    if-eq v2, v4, :cond_3

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    invoke-virtual {v1, v6}, Lw/n0$a;->o(I)V

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_4
    invoke-virtual {v1, v7}, Lw/n0$a;->o(I)V

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_5
    invoke-virtual {v1, v5}, Lw/n0$a;->o(I)V

    .line 90
    .line 91
    .line 92
    :goto_1
    sget-object v2, Lw/x2;->m:Lw/r0$a;

    .line 93
    .line 94
    invoke-virtual {v1}, Lw/n0$a;->h()Lw/n0;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-virtual {v0, v2, v1}, Lw/x1;->g(Lw/r0$a;Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    sget-object v1, Lw/x2;->o:Lw/r0$a;

    .line 102
    .line 103
    sget-object v2, Lw/y2$b;->k:Lw/y2$b;

    .line 104
    .line 105
    if-ne p1, v2, :cond_6

    .line 106
    .line 107
    sget-object v2, Lq/i2;->c:Lq/i2;

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_6
    sget-object v2, Lq/o0;->a:Lq/o0;

    .line 111
    .line 112
    :goto_2
    invoke-virtual {v0, v1, v2}, Lw/x1;->g(Lw/r0$a;Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    if-ne p1, v3, :cond_7

    .line 116
    .line 117
    sget-object p1, Lw/k1;->j:Lw/r0$a;

    .line 118
    .line 119
    iget-object v1, p0, Lq/g1;->b:Lq/y1;

    .line 120
    .line 121
    invoke-virtual {v1}, Lq/y1;->d()Landroid/util/Size;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    invoke-virtual {v0, p1, v1}, Lw/x1;->g(Lw/r0$a;Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    :cond_7
    iget-object p1, p0, Lq/g1;->b:Lq/y1;

    .line 129
    .line 130
    invoke-virtual {p1}, Lq/y1;->c()Landroid/view/Display;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    invoke-virtual {p1}, Landroid/view/Display;->getRotation()I

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    sget-object v1, Lw/k1;->g:Lw/r0$a;

    .line 139
    .line 140
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    invoke-virtual {v0, v1, p1}, Lw/x1;->g(Lw/r0$a;Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    invoke-static {v0}, Lw/c2;->H(Lw/r0;)Lw/c2;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    return-object p1
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
