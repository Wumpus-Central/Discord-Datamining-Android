.class final Lkotlinx/coroutines/flow/h$b;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlinx/coroutines/flow/h;->b(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/Flow;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/k;",
        "Lkotlin/jvm/functions/Function3<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlinx/coroutines/flow/FlowCollector<",
        "-TT;>;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000*\u00020\u00012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@"
    }
    d2 = {
        "T",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlinx/coroutines/flow/FlowCollector;",
        "downstream",
        "",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/e;
    c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1"
    f = "Delay.kt"
    l = {
        0xde,
        0x163
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field k:Ljava/lang/Object;

.field l:Ljava/lang/Object;

.field m:I

.field private synthetic n:Ljava/lang/Object;

.field synthetic o:Ljava/lang/Object;

.field final synthetic p:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "TT;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic q:Lkotlinx/coroutines/flow/Flow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/Flow<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-TT;",
            "Ljava/lang/Long;",
            ">;",
            "Lkotlinx/coroutines/flow/Flow<",
            "+TT;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlinx/coroutines/flow/h$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lkotlinx/coroutines/flow/h$b;->p:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lkotlinx/coroutines/flow/h$b;->q:Lkotlinx/coroutines/flow/Flow;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final a(Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Lkotlinx/coroutines/flow/FlowCollector<",
            "-TT;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lkotlinx/coroutines/flow/h$b;

    iget-object v1, p0, Lkotlinx/coroutines/flow/h$b;->p:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lkotlinx/coroutines/flow/h$b;->q:Lkotlinx/coroutines/flow/Flow;

    invoke-direct {v0, v1, v2, p3}, Lkotlinx/coroutines/flow/h$b;-><init>(Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lkotlinx/coroutines/flow/h$b;->n:Ljava/lang/Object;

    iput-object p2, v0, Lkotlinx/coroutines/flow/h$b;->o:Ljava/lang/Object;

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {v0, p1}, Lkotlinx/coroutines/flow/h$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlinx/coroutines/flow/FlowCollector;

    check-cast p3, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2, p3}, Lkotlinx/coroutines/flow/h$b;->a(Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-static {}, Lrf/b;->d()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v2, v1, Lkotlinx/coroutines/flow/h$b;->m:I

    .line 8
    .line 9
    const/4 v3, 0x2

    .line 10
    const/4 v4, 0x1

    .line 11
    const/4 v5, 0x0

    .line 12
    if-eqz v2, :cond_2

    .line 13
    .line 14
    if-eq v2, v4, :cond_1

    .line 15
    .line 16
    if-ne v2, v3, :cond_0

    .line 17
    .line 18
    iget-object v2, v1, Lkotlinx/coroutines/flow/h$b;->l:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, Lkotlin/jvm/internal/Ref$LongRef;

    .line 21
    .line 22
    iget-object v2, v1, Lkotlinx/coroutines/flow/h$b;->k:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 25
    .line 26
    iget-object v6, v1, Lkotlinx/coroutines/flow/h$b;->o:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v6, Lsi/t;

    .line 29
    .line 30
    iget-object v7, v1, Lkotlinx/coroutines/flow/h$b;->n:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v7, Lkotlinx/coroutines/flow/FlowCollector;

    .line 33
    .line 34
    invoke-static/range {p1 .. p1}, Llf/t;->b(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    move-object v8, v7

    .line 38
    move-object v7, v6

    .line 39
    move-object v6, v2

    .line 40
    move-object v2, v1

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw v0

    .line 50
    :cond_1
    iget-object v2, v1, Lkotlinx/coroutines/flow/h$b;->l:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v2, Lkotlin/jvm/internal/Ref$LongRef;

    .line 53
    .line 54
    iget-object v6, v1, Lkotlinx/coroutines/flow/h$b;->k:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v6, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 57
    .line 58
    iget-object v7, v1, Lkotlinx/coroutines/flow/h$b;->o:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v7, Lsi/t;

    .line 61
    .line 62
    iget-object v8, v1, Lkotlinx/coroutines/flow/h$b;->n:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v8, Lkotlinx/coroutines/flow/FlowCollector;

    .line 65
    .line 66
    invoke-static/range {p1 .. p1}, Llf/t;->b(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    move-object v9, v2

    .line 70
    move-object v2, v1

    .line 71
    goto/16 :goto_2

    .line 72
    .line 73
    :cond_2
    invoke-static/range {p1 .. p1}, Llf/t;->b(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    iget-object v2, v1, Lkotlinx/coroutines/flow/h$b;->n:Ljava/lang/Object;

    .line 77
    .line 78
    move-object v6, v2

    .line 79
    check-cast v6, Lkotlinx/coroutines/CoroutineScope;

    .line 80
    .line 81
    iget-object v2, v1, Lkotlinx/coroutines/flow/h$b;->o:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v2, Lkotlinx/coroutines/flow/FlowCollector;

    .line 84
    .line 85
    const/4 v7, 0x0

    .line 86
    const/4 v8, 0x0

    .line 87
    new-instance v9, Lkotlinx/coroutines/flow/h$b$c;

    .line 88
    .line 89
    iget-object v10, v1, Lkotlinx/coroutines/flow/h$b;->q:Lkotlinx/coroutines/flow/Flow;

    .line 90
    .line 91
    invoke-direct {v9, v10, v5}, Lkotlinx/coroutines/flow/h$b$c;-><init>(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)V

    .line 92
    .line 93
    .line 94
    const/4 v10, 0x3

    .line 95
    const/4 v11, 0x0

    .line 96
    invoke-static/range {v6 .. v11}, Lsi/q;->d(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;ILkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lsi/t;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    new-instance v7, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 101
    .line 102
    invoke-direct {v7}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 103
    .line 104
    .line 105
    move-object v8, v2

    .line 106
    move-object v2, v1

    .line 107
    move-object/from16 v16, v7

    .line 108
    .line 109
    move-object v7, v6

    .line 110
    move-object/from16 v6, v16

    .line 111
    .line 112
    :goto_0
    iget-object v9, v6, Lkotlin/jvm/internal/Ref$ObjectRef;->k:Ljava/lang/Object;

    .line 113
    .line 114
    sget-object v10, Lti/m;->c:Lkotlinx/coroutines/internal/d0;

    .line 115
    .line 116
    if-eq v9, v10, :cond_c

    .line 117
    .line 118
    new-instance v9, Lkotlin/jvm/internal/Ref$LongRef;

    .line 119
    .line 120
    invoke-direct {v9}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 121
    .line 122
    .line 123
    iget-object v10, v6, Lkotlin/jvm/internal/Ref$ObjectRef;->k:Ljava/lang/Object;

    .line 124
    .line 125
    if-eqz v10, :cond_7

    .line 126
    .line 127
    iget-object v11, v2, Lkotlinx/coroutines/flow/h$b;->p:Lkotlin/jvm/functions/Function1;

    .line 128
    .line 129
    sget-object v12, Lti/m;->a:Lkotlinx/coroutines/internal/d0;

    .line 130
    .line 131
    if-ne v10, v12, :cond_3

    .line 132
    .line 133
    move-object v10, v5

    .line 134
    :cond_3
    invoke-interface {v11, v10}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v10

    .line 138
    check-cast v10, Ljava/lang/Number;

    .line 139
    .line 140
    invoke-virtual {v10}, Ljava/lang/Number;->longValue()J

    .line 141
    .line 142
    .line 143
    move-result-wide v10

    .line 144
    iput-wide v10, v9, Lkotlin/jvm/internal/Ref$LongRef;->k:J

    .line 145
    .line 146
    const-wide/16 v13, 0x0

    .line 147
    .line 148
    cmp-long v15, v10, v13

    .line 149
    .line 150
    if-ltz v15, :cond_4

    .line 151
    .line 152
    move v15, v4

    .line 153
    goto :goto_1

    .line 154
    :cond_4
    const/4 v15, 0x0

    .line 155
    :goto_1
    if-eqz v15, :cond_8

    .line 156
    .line 157
    cmp-long v10, v10, v13

    .line 158
    .line 159
    if-nez v10, :cond_7

    .line 160
    .line 161
    iget-object v10, v6, Lkotlin/jvm/internal/Ref$ObjectRef;->k:Ljava/lang/Object;

    .line 162
    .line 163
    if-ne v10, v12, :cond_5

    .line 164
    .line 165
    move-object v10, v5

    .line 166
    :cond_5
    iput-object v8, v2, Lkotlinx/coroutines/flow/h$b;->n:Ljava/lang/Object;

    .line 167
    .line 168
    iput-object v7, v2, Lkotlinx/coroutines/flow/h$b;->o:Ljava/lang/Object;

    .line 169
    .line 170
    iput-object v6, v2, Lkotlinx/coroutines/flow/h$b;->k:Ljava/lang/Object;

    .line 171
    .line 172
    iput-object v9, v2, Lkotlinx/coroutines/flow/h$b;->l:Ljava/lang/Object;

    .line 173
    .line 174
    iput v4, v2, Lkotlinx/coroutines/flow/h$b;->m:I

    .line 175
    .line 176
    invoke-interface {v8, v10, v2}, Lkotlinx/coroutines/flow/FlowCollector;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v10

    .line 180
    if-ne v10, v0, :cond_6

    .line 181
    .line 182
    return-object v0

    .line 183
    :cond_6
    :goto_2
    iput-object v5, v6, Lkotlin/jvm/internal/Ref$ObjectRef;->k:Ljava/lang/Object;

    .line 184
    .line 185
    :cond_7
    move-object/from16 v16, v2

    .line 186
    .line 187
    move-object v2, v0

    .line 188
    move-object v0, v9

    .line 189
    move-object v9, v8

    .line 190
    move-object v8, v7

    .line 191
    move-object/from16 v7, v16

    .line 192
    .line 193
    goto :goto_3

    .line 194
    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 195
    .line 196
    const-string v2, "Debounce timeout should not be negative"

    .line 197
    .line 198
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    throw v0

    .line 206
    :goto_3
    iput-object v9, v7, Lkotlinx/coroutines/flow/h$b;->n:Ljava/lang/Object;

    .line 207
    .line 208
    iput-object v8, v7, Lkotlinx/coroutines/flow/h$b;->o:Ljava/lang/Object;

    .line 209
    .line 210
    iput-object v6, v7, Lkotlinx/coroutines/flow/h$b;->k:Ljava/lang/Object;

    .line 211
    .line 212
    iput-object v0, v7, Lkotlinx/coroutines/flow/h$b;->l:Ljava/lang/Object;

    .line 213
    .line 214
    iput v3, v7, Lkotlinx/coroutines/flow/h$b;->m:I

    .line 215
    .line 216
    new-instance v10, Lkotlinx/coroutines/selects/b;

    .line 217
    .line 218
    invoke-direct {v10, v7}, Lkotlinx/coroutines/selects/b;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 219
    .line 220
    .line 221
    :try_start_0
    iget-object v11, v6, Lkotlin/jvm/internal/Ref$ObjectRef;->k:Ljava/lang/Object;

    .line 222
    .line 223
    if-eqz v11, :cond_9

    .line 224
    .line 225
    iget-wide v11, v0, Lkotlin/jvm/internal/Ref$LongRef;->k:J

    .line 226
    .line 227
    new-instance v0, Lkotlinx/coroutines/flow/h$b$a;

    .line 228
    .line 229
    invoke-direct {v0, v9, v6, v5}, Lkotlinx/coroutines/flow/h$b$a;-><init>(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/coroutines/Continuation;)V

    .line 230
    .line 231
    .line 232
    invoke-interface {v10, v11, v12, v0}, Lkotlinx/coroutines/selects/a;->s(JLkotlin/jvm/functions/Function1;)V

    .line 233
    .line 234
    .line 235
    :cond_9
    invoke-interface {v8}, Lsi/t;->c()Lkotlinx/coroutines/selects/c;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    new-instance v11, Lkotlinx/coroutines/flow/h$b$b;

    .line 240
    .line 241
    invoke-direct {v11, v6, v9, v5}, Lkotlinx/coroutines/flow/h$b$b;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)V

    .line 242
    .line 243
    .line 244
    invoke-interface {v10, v0, v11}, Lkotlinx/coroutines/selects/a;->A(Lkotlinx/coroutines/selects/c;Lkotlin/jvm/functions/Function2;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 245
    .line 246
    .line 247
    goto :goto_4

    .line 248
    :catchall_0
    move-exception v0

    .line 249
    invoke-virtual {v10, v0}, Lkotlinx/coroutines/selects/b;->c0(Ljava/lang/Throwable;)V

    .line 250
    .line 251
    .line 252
    :goto_4
    invoke-virtual {v10}, Lkotlinx/coroutines/selects/b;->b0()Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    invoke-static {}, Lrf/b;->d()Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v10

    .line 260
    if-ne v0, v10, :cond_a

    .line 261
    .line 262
    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/g;->c(Lkotlin/coroutines/Continuation;)V

    .line 263
    .line 264
    .line 265
    :cond_a
    if-ne v0, v2, :cond_b

    .line 266
    .line 267
    return-object v2

    .line 268
    :cond_b
    move-object v0, v2

    .line 269
    move-object v2, v7

    .line 270
    move-object v7, v8

    .line 271
    move-object v8, v9

    .line 272
    goto/16 :goto_0

    .line 273
    .line 274
    :cond_c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 275
    .line 276
    return-object v0
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
