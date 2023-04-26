.class public Lcom/facebook/hermes/intl/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/hermes/intl/a;


# instance fields
.field private a:Landroid/icu/text/RuleBasedCollator;


# direct methods
.method constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/facebook/hermes/intl/m;->a:Landroid/icu/text/RuleBasedCollator;

    .line 6
    .line 7
    return-void
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
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    iget-object v0, p0, Lcom/facebook/hermes/intl/m;->a:Landroid/icu/text/RuleBasedCollator;

    invoke-static {v0, p1, p2}, Lg5/f0;->a(Landroid/icu/text/RuleBasedCollator;Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public b()Lcom/facebook/hermes/intl/a$c;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/hermes/intl/m;->a:Landroid/icu/text/RuleBasedCollator;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/facebook/hermes/intl/a$c;->o:Lcom/facebook/hermes/intl/a$c;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    invoke-static {v0}, Lg5/d0;->a(Landroid/icu/text/RuleBasedCollator;)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_2

    .line 13
    .line 14
    iget-object v0, p0, Lcom/facebook/hermes/intl/m;->a:Landroid/icu/text/RuleBasedCollator;

    .line 15
    .line 16
    invoke-static {v0}, Lg5/e0;->a(Landroid/icu/text/RuleBasedCollator;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    sget-object v0, Lcom/facebook/hermes/intl/a$c;->m:Lcom/facebook/hermes/intl/a$c;

    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_1
    sget-object v0, Lcom/facebook/hermes/intl/a$c;->k:Lcom/facebook/hermes/intl/a$c;

    .line 26
    .line 27
    return-object v0

    .line 28
    :cond_2
    const/4 v1, 0x1

    .line 29
    if-ne v0, v1, :cond_3

    .line 30
    .line 31
    sget-object v0, Lcom/facebook/hermes/intl/a$c;->l:Lcom/facebook/hermes/intl/a$c;

    .line 32
    .line 33
    return-object v0

    .line 34
    :cond_3
    sget-object v0, Lcom/facebook/hermes/intl/a$c;->n:Lcom/facebook/hermes/intl/a$c;

    .line 35
    .line 36
    return-object v0
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
.end method

.method public c(Lg5/b;)Lcom/facebook/hermes/intl/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg5/b<",
            "*>;)",
            "Lcom/facebook/hermes/intl/a;"
        }
    .end annotation

    .line 1
    check-cast p1, Lg5/x;

    .line 2
    .line 3
    invoke-virtual {p1}, Lg5/x;->m()Landroid/icu/util/ULocale;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, Lg5/g0;->a(Landroid/icu/util/ULocale;)Landroid/icu/text/Collator;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Landroid/icu/text/RuleBasedCollator;

    .line 12
    .line 13
    iput-object p1, p0, Lcom/facebook/hermes/intl/m;->a:Landroid/icu/text/RuleBasedCollator;

    .line 14
    .line 15
    const/16 v0, 0x11

    .line 16
    .line 17
    invoke-static {p1, v0}, Lg5/h0;->a(Landroid/icu/text/RuleBasedCollator;I)V

    .line 18
    .line 19
    .line 20
    return-object p0
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
.end method

.method public d(Z)Lcom/facebook/hermes/intl/a;
    .locals 1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/facebook/hermes/intl/m;->a:Landroid/icu/text/RuleBasedCollator;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lg5/i0;->a(Landroid/icu/text/RuleBasedCollator;Z)V

    :cond_0
    return-object p0
.end method

.method public e(Lcom/facebook/hermes/intl/a$b;)Lcom/facebook/hermes/intl/a;
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/hermes/intl/m$a;->b:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    aget p1, v0, p1

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    if-eq p1, v0, :cond_1

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    if-eq p1, v1, :cond_0

    .line 14
    .line 15
    iget-object p1, p0, Lcom/facebook/hermes/intl/m;->a:Landroid/icu/text/RuleBasedCollator;

    .line 16
    .line 17
    invoke-static {p1}, Lg5/c0;->a(Landroid/icu/text/RuleBasedCollator;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object p1, p0, Lcom/facebook/hermes/intl/m;->a:Landroid/icu/text/RuleBasedCollator;

    .line 22
    .line 23
    invoke-static {p1, v0}, Lg5/b0;->a(Landroid/icu/text/RuleBasedCollator;Z)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    iget-object p1, p0, Lcom/facebook/hermes/intl/m;->a:Landroid/icu/text/RuleBasedCollator;

    .line 28
    .line 29
    invoke-static {p1, v0}, Lg5/y;->a(Landroid/icu/text/RuleBasedCollator;Z)V

    .line 30
    .line 31
    .line 32
    :goto_0
    return-object p0
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
.end method

.method public f(Z)Lcom/facebook/hermes/intl/a;
    .locals 1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/facebook/hermes/intl/m;->a:Landroid/icu/text/RuleBasedCollator;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0}, Lg5/i;->e(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {p1, v0}, Lg5/a0;->a(Landroid/icu/text/RuleBasedCollator;Z)V

    :cond_0
    return-object p0
.end method

.method public g(Lcom/facebook/hermes/intl/a$c;)Lcom/facebook/hermes/intl/a;
    .locals 4

    .line 1
    sget-object v0, Lcom/facebook/hermes/intl/m$a;->a:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    aget p1, v0, p1

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    const/4 v1, 0x1

    .line 11
    if-eq p1, v1, :cond_3

    .line 12
    .line 13
    const/4 v2, 0x2

    .line 14
    if-eq p1, v2, :cond_2

    .line 15
    .line 16
    const/4 v3, 0x3

    .line 17
    if-eq p1, v3, :cond_1

    .line 18
    .line 19
    const/4 v0, 0x4

    .line 20
    if-eq p1, v0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object p1, p0, Lcom/facebook/hermes/intl/m;->a:Landroid/icu/text/RuleBasedCollator;

    .line 24
    .line 25
    invoke-static {p1, v2}, Lg5/j0;->a(Landroid/icu/text/RuleBasedCollator;I)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    iget-object p1, p0, Lcom/facebook/hermes/intl/m;->a:Landroid/icu/text/RuleBasedCollator;

    .line 30
    .line 31
    invoke-static {p1, v0}, Lg5/j0;->a(Landroid/icu/text/RuleBasedCollator;I)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Lcom/facebook/hermes/intl/m;->a:Landroid/icu/text/RuleBasedCollator;

    .line 35
    .line 36
    invoke-static {p1, v1}, Lg5/z;->a(Landroid/icu/text/RuleBasedCollator;Z)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    iget-object p1, p0, Lcom/facebook/hermes/intl/m;->a:Landroid/icu/text/RuleBasedCollator;

    .line 41
    .line 42
    invoke-static {p1, v1}, Lg5/j0;->a(Landroid/icu/text/RuleBasedCollator;I)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_3
    iget-object p1, p0, Lcom/facebook/hermes/intl/m;->a:Landroid/icu/text/RuleBasedCollator;

    .line 47
    .line 48
    invoke-static {p1, v0}, Lg5/j0;->a(Landroid/icu/text/RuleBasedCollator;I)V

    .line 49
    .line 50
    .line 51
    :goto_0
    return-object p0
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
.end method
