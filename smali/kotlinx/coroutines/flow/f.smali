.class final synthetic Lkotlinx/coroutines/flow/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u001a1\u0010\u0005\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u00012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a9\u0010\t\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u00012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0008\u001a\u00020\u0007H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\t\u0010\n\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u000b"
    }
    d2 = {
        "T",
        "Lkotlinx/coroutines/flow/FlowCollector;",
        "Lsi/t;",
        "channel",
        "",
        "b",
        "(Lkotlinx/coroutines/flow/FlowCollector;Lsi/t;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "",
        "consume",
        "c",
        "(Lkotlinx/coroutines/flow/FlowCollector;Lsi/t;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "kotlinx-coroutines-core"
    }
    k = 0x5
    mv = {
        0x1,
        0x6,
        0x0
    }
    xs = "kotlinx/coroutines/flow/FlowKt"
.end annotation


# direct methods
.method public static final synthetic a(Lkotlinx/coroutines/flow/FlowCollector;Lsi/t;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lkotlinx/coroutines/flow/f;->c(Lkotlinx/coroutines/flow/FlowCollector;Lsi/t;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lkotlinx/coroutines/flow/FlowCollector;Lsi/t;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlinx/coroutines/flow/FlowCollector<",
            "-TT;>;",
            "Lsi/t<",
            "+TT;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-static {p0, p1, v0, p2}, Lkotlinx/coroutines/flow/f;->c(Lkotlinx/coroutines/flow/FlowCollector;Lsi/t;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lrf/b;->d()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method private static final c(Lkotlinx/coroutines/flow/FlowCollector;Lsi/t;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlinx/coroutines/flow/FlowCollector<",
            "-TT;>;",
            "Lsi/t<",
            "+TT;>;Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p3, Lkotlinx/coroutines/flow/f$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lkotlinx/coroutines/flow/f$a;

    .line 7
    .line 8
    iget v1, v0, Lkotlinx/coroutines/flow/f$a;->o:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lkotlinx/coroutines/flow/f$a;->o:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lkotlinx/coroutines/flow/f$a;

    .line 21
    .line 22
    invoke-direct {v0, p3}, Lkotlinx/coroutines/flow/f$a;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lkotlinx/coroutines/flow/f$a;->n:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lrf/b;->d()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lkotlinx/coroutines/flow/f$a;->o:I

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eqz v2, :cond_4

    .line 36
    .line 37
    if-eq v2, v4, :cond_3

    .line 38
    .line 39
    if-ne v2, v3, :cond_2

    .line 40
    .line 41
    iget-boolean p0, v0, Lkotlinx/coroutines/flow/f$a;->m:Z

    .line 42
    .line 43
    iget-object p1, v0, Lkotlinx/coroutines/flow/f$a;->l:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, Lsi/t;

    .line 46
    .line 47
    iget-object p2, v0, Lkotlinx/coroutines/flow/f$a;->k:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p2, Lkotlinx/coroutines/flow/FlowCollector;

    .line 50
    .line 51
    :try_start_0
    invoke-static {p3}, Llf/t;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    .line 54
    :cond_1
    move-object v5, p2

    .line 55
    move p2, p0

    .line 56
    move-object p0, v5

    .line 57
    goto :goto_1

    .line 58
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 59
    .line 60
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 61
    .line 62
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw p0

    .line 66
    :cond_3
    iget-boolean p0, v0, Lkotlinx/coroutines/flow/f$a;->m:Z

    .line 67
    .line 68
    iget-object p1, v0, Lkotlinx/coroutines/flow/f$a;->l:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p1, Lsi/t;

    .line 71
    .line 72
    iget-object p2, v0, Lkotlinx/coroutines/flow/f$a;->k:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p2, Lkotlinx/coroutines/flow/FlowCollector;

    .line 75
    .line 76
    :try_start_1
    invoke-static {p3}, Llf/t;->b(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    check-cast p3, Lsi/i;

    .line 80
    .line 81
    invoke-virtual {p3}, Lsi/i;->j()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 85
    goto :goto_2

    .line 86
    :catchall_0
    move-exception p2

    .line 87
    goto :goto_3

    .line 88
    :cond_4
    invoke-static {p3}, Llf/t;->b(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    invoke-static {p0}, Lkotlinx/coroutines/flow/d;->d(Lkotlinx/coroutines/flow/FlowCollector;)V

    .line 92
    .line 93
    .line 94
    :goto_1
    :try_start_2
    iput-object p0, v0, Lkotlinx/coroutines/flow/f$a;->k:Ljava/lang/Object;

    .line 95
    .line 96
    iput-object p1, v0, Lkotlinx/coroutines/flow/f$a;->l:Ljava/lang/Object;

    .line 97
    .line 98
    iput-boolean p2, v0, Lkotlinx/coroutines/flow/f$a;->m:Z

    .line 99
    .line 100
    iput v4, v0, Lkotlinx/coroutines/flow/f$a;->o:I

    .line 101
    .line 102
    invoke-interface {p1, v0}, Lsi/t;->d(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 106
    if-ne p3, v1, :cond_5

    .line 107
    .line 108
    return-object v1

    .line 109
    :cond_5
    move v5, p2

    .line 110
    move-object p2, p0

    .line 111
    move p0, v5

    .line 112
    :goto_2
    :try_start_3
    invoke-static {p3}, Lsi/i;->h(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    if-eqz v2, :cond_8

    .line 117
    .line 118
    invoke-static {p3}, Lsi/i;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 119
    .line 120
    .line 121
    move-result-object p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 122
    if-nez p2, :cond_7

    .line 123
    .line 124
    if-eqz p0, :cond_6

    .line 125
    .line 126
    const/4 p0, 0x0

    .line 127
    invoke-static {p1, p0}, Lsi/j;->a(Lsi/t;Ljava/lang/Throwable;)V

    .line 128
    .line 129
    .line 130
    :cond_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 131
    .line 132
    return-object p0

    .line 133
    :cond_7
    :try_start_4
    throw p2

    .line 134
    :cond_8
    invoke-static {p3}, Lsi/i;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p3

    .line 138
    iput-object p2, v0, Lkotlinx/coroutines/flow/f$a;->k:Ljava/lang/Object;

    .line 139
    .line 140
    iput-object p1, v0, Lkotlinx/coroutines/flow/f$a;->l:Ljava/lang/Object;

    .line 141
    .line 142
    iput-boolean p0, v0, Lkotlinx/coroutines/flow/f$a;->m:Z

    .line 143
    .line 144
    iput v3, v0, Lkotlinx/coroutines/flow/f$a;->o:I

    .line 145
    .line 146
    invoke-interface {p2, p3, v0}, Lkotlinx/coroutines/flow/FlowCollector;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 150
    if-ne p3, v1, :cond_1

    .line 151
    .line 152
    return-object v1

    .line 153
    :catchall_1
    move-exception p0

    .line 154
    move v5, p2

    .line 155
    move-object p2, p0

    .line 156
    move p0, v5

    .line 157
    :goto_3
    :try_start_5
    throw p2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 158
    :catchall_2
    move-exception p3

    .line 159
    if-eqz p0, :cond_9

    .line 160
    .line 161
    invoke-static {p1, p2}, Lsi/j;->a(Lsi/t;Ljava/lang/Throwable;)V

    .line 162
    .line 163
    .line 164
    :cond_9
    throw p3
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
