.class public final Lyg/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lci/n;

.field private final b:Lvg/p;

.field private final c:Leh/p;

.field private final d:Leh/h;

.field private final e:Lwg/j;

.field private final f:Lzh/r;

.field private final g:Lwg/g;

.field private final h:Lwg/f;

.field private final i:Lvh/a;

.field private final j:Lbh/b;

.field private final k:Lyg/i;

.field private final l:Leh/x;

.field private final m:Lmg/d1;

.field private final n:Lug/c;

.field private final o:Lmg/h0;

.field private final p:Ljg/j;

.field private final q:Lvg/d;

.field private final r:Ldh/l;

.field private final s:Lvg/q;

.field private final t:Lyg/c;

.field private final u:Lei/l;

.field private final v:Lvg/x;

.field private final w:Lvg/u;

.field private final x:Luh/f;


# direct methods
.method public constructor <init>(Lci/n;Lvg/p;Leh/p;Leh/h;Lwg/j;Lzh/r;Lwg/g;Lwg/f;Lvh/a;Lbh/b;Lyg/i;Leh/x;Lmg/d1;Lug/c;Lmg/h0;Ljg/j;Lvg/d;Ldh/l;Lvg/q;Lyg/c;Lei/l;Lvg/x;Lvg/u;Luh/f;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move-object/from16 v14, p14

    move-object/from16 v15, p15

    move-object/from16 v0, p16

    const-string v0, "storageManager"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "finder"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlinClassFinder"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deserializedDescriptorResolver"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signaturePropagator"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "javaResolverCache"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "javaPropertyInitializerEvaluator"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "samConversionResolver"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sourceElementFactory"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "moduleClassResolver"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "packagePartProvider"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "supertypeLoopChecker"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lookupTracker"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "module"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reflectionTypes"

    move-object/from16 v15, p16

    invoke-static {v15, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "annotationTypeQualifierResolver"

    move-object/from16 v15, p17

    invoke-static {v15, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signatureEnhancement"

    move-object/from16 v15, p18

    invoke-static {v15, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "javaClassesTracker"

    move-object/from16 v15, p19

    invoke-static {v15, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "settings"

    move-object/from16 v15, p20

    invoke-static {v15, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlinTypeChecker"

    move-object/from16 v15, p21

    invoke-static {v15, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "javaTypeEnhancementState"

    move-object/from16 v15, p22

    invoke-static {v15, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "javaModuleResolver"

    move-object/from16 v15, p23

    invoke-static {v15, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "syntheticPartsProvider"

    move-object/from16 v15, p24

    invoke-static {v15, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v0, p0

    move-object/from16 v15, p16

    .line 2
    iput-object v1, v0, Lyg/b;->a:Lci/n;

    .line 3
    iput-object v2, v0, Lyg/b;->b:Lvg/p;

    .line 4
    iput-object v3, v0, Lyg/b;->c:Leh/p;

    .line 5
    iput-object v4, v0, Lyg/b;->d:Leh/h;

    .line 6
    iput-object v5, v0, Lyg/b;->e:Lwg/j;

    .line 7
    iput-object v6, v0, Lyg/b;->f:Lzh/r;

    .line 8
    iput-object v7, v0, Lyg/b;->g:Lwg/g;

    .line 9
    iput-object v8, v0, Lyg/b;->h:Lwg/f;

    .line 10
    iput-object v9, v0, Lyg/b;->i:Lvh/a;

    .line 11
    iput-object v10, v0, Lyg/b;->j:Lbh/b;

    .line 12
    iput-object v11, v0, Lyg/b;->k:Lyg/i;

    .line 13
    iput-object v12, v0, Lyg/b;->l:Leh/x;

    .line 14
    iput-object v13, v0, Lyg/b;->m:Lmg/d1;

    .line 15
    iput-object v14, v0, Lyg/b;->n:Lug/c;

    move-object/from16 v1, p15

    .line 16
    iput-object v1, v0, Lyg/b;->o:Lmg/h0;

    .line 17
    iput-object v15, v0, Lyg/b;->p:Ljg/j;

    move-object/from16 v1, p17

    move-object/from16 v2, p18

    .line 18
    iput-object v1, v0, Lyg/b;->q:Lvg/d;

    .line 19
    iput-object v2, v0, Lyg/b;->r:Ldh/l;

    move-object/from16 v1, p19

    move-object/from16 v2, p20

    .line 20
    iput-object v1, v0, Lyg/b;->s:Lvg/q;

    .line 21
    iput-object v2, v0, Lyg/b;->t:Lyg/c;

    move-object/from16 v1, p21

    move-object/from16 v2, p22

    .line 22
    iput-object v1, v0, Lyg/b;->u:Lei/l;

    .line 23
    iput-object v2, v0, Lyg/b;->v:Lvg/x;

    move-object/from16 v1, p23

    move-object/from16 v2, p24

    .line 24
    iput-object v1, v0, Lyg/b;->w:Lvg/u;

    .line 25
    iput-object v2, v0, Lyg/b;->x:Luh/f;

    return-void
.end method

.method public synthetic constructor <init>(Lci/n;Lvg/p;Leh/p;Leh/h;Lwg/j;Lzh/r;Lwg/g;Lwg/f;Lvh/a;Lbh/b;Lyg/i;Leh/x;Lmg/d1;Lug/c;Lmg/h0;Ljg/j;Lvg/d;Ldh/l;Lvg/q;Lyg/c;Lei/l;Lvg/x;Lvg/u;Luh/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 26

    const/high16 v0, 0x800000

    and-int v0, p25, v0

    if-eqz v0, :cond_0

    .line 26
    sget-object v0, Luh/f;->a:Luh/f$a;

    invoke-virtual {v0}, Luh/f$a;->a()Luh/a;

    move-result-object v0

    move-object/from16 v25, v0

    goto :goto_0

    :cond_0
    move-object/from16 v25, p24

    :goto_0
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    move-object/from16 v19, p18

    move-object/from16 v20, p19

    move-object/from16 v21, p20

    move-object/from16 v22, p21

    move-object/from16 v23, p22

    move-object/from16 v24, p23

    .line 27
    invoke-direct/range {v1 .. v25}, Lyg/b;-><init>(Lci/n;Lvg/p;Leh/p;Leh/h;Lwg/j;Lzh/r;Lwg/g;Lwg/f;Lvh/a;Lbh/b;Lyg/i;Leh/x;Lmg/d1;Lug/c;Lmg/h0;Ljg/j;Lvg/d;Ldh/l;Lvg/q;Lyg/c;Lei/l;Lvg/x;Lvg/u;Luh/f;)V

    return-void
.end method


# virtual methods
.method public final a()Lvg/d;
    .locals 1

    iget-object v0, p0, Lyg/b;->q:Lvg/d;

    return-object v0
.end method

.method public final b()Leh/h;
    .locals 1

    iget-object v0, p0, Lyg/b;->d:Leh/h;

    return-object v0
.end method

.method public final c()Lzh/r;
    .locals 1

    iget-object v0, p0, Lyg/b;->f:Lzh/r;

    return-object v0
.end method

.method public final d()Lvg/p;
    .locals 1

    iget-object v0, p0, Lyg/b;->b:Lvg/p;

    return-object v0
.end method

.method public final e()Lvg/q;
    .locals 1

    iget-object v0, p0, Lyg/b;->s:Lvg/q;

    return-object v0
.end method

.method public final f()Lvg/u;
    .locals 1

    iget-object v0, p0, Lyg/b;->w:Lvg/u;

    return-object v0
.end method

.method public final g()Lwg/f;
    .locals 1

    iget-object v0, p0, Lyg/b;->h:Lwg/f;

    return-object v0
.end method

.method public final h()Lwg/g;
    .locals 1

    iget-object v0, p0, Lyg/b;->g:Lwg/g;

    return-object v0
.end method

.method public final i()Lvg/x;
    .locals 1

    iget-object v0, p0, Lyg/b;->v:Lvg/x;

    return-object v0
.end method

.method public final j()Leh/p;
    .locals 1

    iget-object v0, p0, Lyg/b;->c:Leh/p;

    return-object v0
.end method

.method public final k()Lei/l;
    .locals 1

    iget-object v0, p0, Lyg/b;->u:Lei/l;

    return-object v0
.end method

.method public final l()Lug/c;
    .locals 1

    iget-object v0, p0, Lyg/b;->n:Lug/c;

    return-object v0
.end method

.method public final m()Lmg/h0;
    .locals 1

    iget-object v0, p0, Lyg/b;->o:Lmg/h0;

    return-object v0
.end method

.method public final n()Lyg/i;
    .locals 1

    iget-object v0, p0, Lyg/b;->k:Lyg/i;

    return-object v0
.end method

.method public final o()Leh/x;
    .locals 1

    iget-object v0, p0, Lyg/b;->l:Leh/x;

    return-object v0
.end method

.method public final p()Ljg/j;
    .locals 1

    iget-object v0, p0, Lyg/b;->p:Ljg/j;

    return-object v0
.end method

.method public final q()Lyg/c;
    .locals 1

    iget-object v0, p0, Lyg/b;->t:Lyg/c;

    return-object v0
.end method

.method public final r()Ldh/l;
    .locals 1

    iget-object v0, p0, Lyg/b;->r:Ldh/l;

    return-object v0
.end method

.method public final s()Lwg/j;
    .locals 1

    iget-object v0, p0, Lyg/b;->e:Lwg/j;

    return-object v0
.end method

.method public final t()Lbh/b;
    .locals 1

    iget-object v0, p0, Lyg/b;->j:Lbh/b;

    return-object v0
.end method

.method public final u()Lci/n;
    .locals 1

    iget-object v0, p0, Lyg/b;->a:Lci/n;

    return-object v0
.end method

.method public final v()Lmg/d1;
    .locals 1

    iget-object v0, p0, Lyg/b;->m:Lmg/d1;

    return-object v0
.end method

.method public final w()Luh/f;
    .locals 1

    iget-object v0, p0, Lyg/b;->x:Luh/f;

    return-object v0
.end method

.method public final x(Lwg/g;)Lyg/b;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v8, p1

    .line 4
    .line 5
    const-string v1, "javaResolverCache"

    .line 6
    .line 7
    move-object/from16 v2, p1

    .line 8
    .line 9
    invoke-static {v2, v1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    new-instance v28, Lyg/b;

    .line 13
    .line 14
    move-object/from16 v1, v28

    .line 15
    .line 16
    iget-object v2, v0, Lyg/b;->a:Lci/n;

    .line 17
    .line 18
    iget-object v3, v0, Lyg/b;->b:Lvg/p;

    .line 19
    .line 20
    iget-object v4, v0, Lyg/b;->c:Leh/p;

    .line 21
    .line 22
    iget-object v5, v0, Lyg/b;->d:Leh/h;

    .line 23
    .line 24
    iget-object v6, v0, Lyg/b;->e:Lwg/j;

    .line 25
    .line 26
    iget-object v7, v0, Lyg/b;->f:Lzh/r;

    .line 27
    .line 28
    iget-object v9, v0, Lyg/b;->h:Lwg/f;

    .line 29
    .line 30
    iget-object v10, v0, Lyg/b;->i:Lvh/a;

    .line 31
    .line 32
    iget-object v11, v0, Lyg/b;->j:Lbh/b;

    .line 33
    .line 34
    iget-object v12, v0, Lyg/b;->k:Lyg/i;

    .line 35
    .line 36
    iget-object v13, v0, Lyg/b;->l:Leh/x;

    .line 37
    .line 38
    iget-object v14, v0, Lyg/b;->m:Lmg/d1;

    .line 39
    .line 40
    iget-object v15, v0, Lyg/b;->n:Lug/c;

    .line 41
    .line 42
    move-object/from16 p1, v1

    .line 43
    .line 44
    iget-object v1, v0, Lyg/b;->o:Lmg/h0;

    .line 45
    .line 46
    move-object/from16 v16, v1

    .line 47
    .line 48
    iget-object v1, v0, Lyg/b;->p:Ljg/j;

    .line 49
    .line 50
    move-object/from16 v17, v1

    .line 51
    .line 52
    iget-object v1, v0, Lyg/b;->q:Lvg/d;

    .line 53
    .line 54
    move-object/from16 v18, v1

    .line 55
    .line 56
    iget-object v1, v0, Lyg/b;->r:Ldh/l;

    .line 57
    .line 58
    move-object/from16 v19, v1

    .line 59
    .line 60
    iget-object v1, v0, Lyg/b;->s:Lvg/q;

    .line 61
    .line 62
    move-object/from16 v20, v1

    .line 63
    .line 64
    iget-object v1, v0, Lyg/b;->t:Lyg/c;

    .line 65
    .line 66
    move-object/from16 v21, v1

    .line 67
    .line 68
    iget-object v1, v0, Lyg/b;->u:Lei/l;

    .line 69
    .line 70
    move-object/from16 v22, v1

    .line 71
    .line 72
    iget-object v1, v0, Lyg/b;->v:Lvg/x;

    .line 73
    .line 74
    move-object/from16 v23, v1

    .line 75
    .line 76
    iget-object v1, v0, Lyg/b;->w:Lvg/u;

    .line 77
    .line 78
    move-object/from16 v24, v1

    .line 79
    .line 80
    const/16 v25, 0x0

    .line 81
    .line 82
    const/high16 v26, 0x800000

    .line 83
    .line 84
    const/16 v27, 0x0

    .line 85
    .line 86
    move-object/from16 v1, p1

    .line 87
    .line 88
    invoke-direct/range {v1 .. v27}, Lyg/b;-><init>(Lci/n;Lvg/p;Leh/p;Leh/h;Lwg/j;Lzh/r;Lwg/g;Lwg/f;Lvh/a;Lbh/b;Lyg/i;Leh/x;Lmg/d1;Lug/c;Lmg/h0;Ljg/j;Lvg/d;Ldh/l;Lvg/q;Lyg/c;Lei/l;Lvg/x;Lvg/u;Luh/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 89
    .line 90
    .line 91
    return-object v28
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
