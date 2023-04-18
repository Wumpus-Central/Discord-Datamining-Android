.class Lnet/time4j/calendar/KoreanCalendar$c;
.super Lnet/time4j/calendar/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/time4j/calendar/KoreanCalendar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lnet/time4j/calendar/a<",
        "Lnet/time4j/calendar/KoreanCalendar;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 1

    const-class v0, Lnet/time4j/calendar/KoreanCalendar;

    invoke-direct {p0, v0}, Lnet/time4j/calendar/a;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic c(Lfj/q;Lfj/d;ZZ)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Lnet/time4j/calendar/KoreanCalendar$c;->e(Lfj/q;Lfj/d;ZZ)Lnet/time4j/calendar/KoreanCalendar;

    move-result-object p1

    return-object p1
.end method

.method public e(Lfj/q;Lfj/d;ZZ)Lnet/time4j/calendar/KoreanCalendar;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/q<",
            "*>;",
            "Lfj/d;",
            "ZZ)",
            "Lnet/time4j/calendar/KoreanCalendar;"
        }
    .end annotation

    .line 1
    sget-object p2, Lnet/time4j/calendar/b;->a:Lfj/p;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lfj/q;->m(Lfj/p;)I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    const/4 p3, 0x0

    .line 8
    const/high16 p4, -0x80000000

    .line 9
    .line 10
    if-ne p2, p4, :cond_2

    .line 11
    .line 12
    sget-object p2, Lnet/time4j/calendar/KoreanCalendar;->u:Lgj/t;

    .line 13
    .line 14
    invoke-virtual {p1, p2}, Lfj/q;->o(Lfj/p;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    sget-object v0, Lnet/time4j/calendar/KoreanCalendar;->s:Lfj/p;

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Lfj/q;->o(Lfj/p;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    invoke-virtual {p1, p2}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    check-cast p2, Lnet/time4j/calendar/c;

    .line 33
    .line 34
    invoke-virtual {p1, v0}, Lfj/q;->m(Lfj/p;)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    invoke-virtual {p2, v0}, Lnet/time4j/calendar/c;->o(I)Lnet/time4j/calendar/j;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    sget-object p2, Lnet/time4j/calendar/k;->m:Lnet/time4j/calendar/k;

    .line 44
    .line 45
    invoke-virtual {p2}, Lnet/time4j/calendar/k;->c()Lfj/p;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    invoke-virtual {p1, p2}, Lfj/q;->m(Lfj/p;)I

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    if-eq p2, p4, :cond_1

    .line 54
    .line 55
    invoke-static {p2}, Lnet/time4j/calendar/j;->a(I)Lnet/time4j/calendar/j;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    goto :goto_0

    .line 60
    :cond_1
    move-object p2, p3

    .line 61
    goto :goto_0

    .line 62
    :cond_2
    invoke-static {p2}, Lnet/time4j/calendar/j;->b(I)Lnet/time4j/calendar/j;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    :goto_0
    if-nez p2, :cond_3

    .line 67
    .line 68
    sget-object p2, Lfj/n0;->k:Lfj/n0;

    .line 69
    .line 70
    const-string p4, "Cannot determine East Asian year."

    .line 71
    .line 72
    invoke-virtual {p1, p2, p4}, Lfj/q;->E(Lfj/p;Ljava/lang/Object;)Lfj/q;

    .line 73
    .line 74
    .line 75
    return-object p3

    .line 76
    :cond_3
    sget-object v0, Lnet/time4j/calendar/KoreanCalendar;->w:Lgj/t;

    .line 77
    .line 78
    invoke-virtual {p1, v0}, Lfj/q;->o(Lfj/p;)Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-eqz v1, :cond_4

    .line 83
    .line 84
    invoke-virtual {p1, v0}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    check-cast v0, Lnet/time4j/calendar/h;

    .line 89
    .line 90
    sget-object v1, Lnet/time4j/calendar/KoreanCalendar;->y:Lnet/time4j/calendar/q;

    .line 91
    .line 92
    invoke-virtual {p1, v1}, Lfj/q;->m(Lfj/p;)I

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    if-eq p1, p4, :cond_5

    .line 97
    .line 98
    invoke-static {p2, v0, p1}, Lnet/time4j/calendar/KoreanCalendar;->q0(Lnet/time4j/calendar/j;Lnet/time4j/calendar/h;I)Lnet/time4j/calendar/KoreanCalendar;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    return-object p1

    .line 103
    :cond_4
    sget-object v0, Lnet/time4j/calendar/KoreanCalendar;->z:Lnet/time4j/calendar/q;

    .line 104
    .line 105
    invoke-virtual {p1, v0}, Lfj/q;->m(Lfj/p;)I

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-eq p1, p4, :cond_5

    .line 110
    .line 111
    const/4 p4, 0x1

    .line 112
    if-lt p1, p4, :cond_5

    .line 113
    .line 114
    invoke-static {p4}, Lnet/time4j/calendar/h;->e(I)Lnet/time4j/calendar/h;

    .line 115
    .line 116
    .line 117
    move-result-object p3

    .line 118
    invoke-static {p2, p3, p4}, Lnet/time4j/calendar/KoreanCalendar;->q0(Lnet/time4j/calendar/j;Lnet/time4j/calendar/h;I)Lnet/time4j/calendar/KoreanCalendar;

    .line 119
    .line 120
    .line 121
    move-result-object p2

    .line 122
    sub-int/2addr p1, p4

    .line 123
    int-to-long p3, p1

    .line 124
    sget-object p1, Lnet/time4j/calendar/KoreanCalendar$e;->p:Lnet/time4j/calendar/KoreanCalendar$e;

    .line 125
    .line 126
    invoke-virtual {p2, p3, p4, p1}, Lfj/k0;->K(JLjava/lang/Object;)Lfj/k0;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    check-cast p1, Lnet/time4j/calendar/KoreanCalendar;

    .line 131
    .line 132
    return-object p1

    .line 133
    :cond_5
    return-object p3
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
.end method
