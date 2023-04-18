.class public final Lkg/b;
.super Lpg/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkg/b$b;,
        Lkg/b$a;
    }
.end annotation


# static fields
.field public static final w:Lkg/b$a;

.field private static final x:Llh/b;

.field private static final y:Llh/b;


# instance fields
.field private final p:Lci/n;

.field private final q:Lmg/l0;

.field private final r:Lkg/c;

.field private final s:I

.field private final t:Lkg/b$b;

.field private final u:Lkg/d;

.field private final v:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lmg/f1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lkg/b$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lkg/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lkg/b;->w:Lkg/b$a;

    .line 8
    .line 9
    new-instance v0, Llh/b;

    .line 10
    .line 11
    sget-object v1, Ljg/k;->u:Llh/c;

    .line 12
    .line 13
    const-string v2, "Function"

    .line 14
    .line 15
    invoke-static {v2}, Llh/f;->h(Ljava/lang/String;)Llh/f;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-direct {v0, v1, v2}, Llh/b;-><init>(Llh/c;Llh/f;)V

    .line 20
    .line 21
    .line 22
    sput-object v0, Lkg/b;->x:Llh/b;

    .line 23
    .line 24
    new-instance v0, Llh/b;

    .line 25
    .line 26
    sget-object v1, Ljg/k;->r:Llh/c;

    .line 27
    .line 28
    const-string v2, "KFunction"

    .line 29
    .line 30
    invoke-static {v2}, Llh/f;->h(Ljava/lang/String;)Llh/f;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-direct {v0, v1, v2}, Llh/b;-><init>(Llh/c;Llh/f;)V

    .line 35
    .line 36
    .line 37
    sput-object v0, Lkg/b;->y:Llh/b;

    .line 38
    .line 39
    return-void
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

.method public constructor <init>(Lci/n;Lmg/l0;Lkg/c;I)V
    .locals 3

    .line 1
    const-string v0, "storageManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "containingDeclaration"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "functionKind"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p3, p4}, Lkg/c;->e(I)Llh/f;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-direct {p0, p1, v0}, Lpg/a;-><init>(Lci/n;Llh/f;)V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lkg/b;->p:Lci/n;

    .line 24
    .line 25
    iput-object p2, p0, Lkg/b;->q:Lmg/l0;

    .line 26
    .line 27
    iput-object p3, p0, Lkg/b;->r:Lkg/c;

    .line 28
    .line 29
    iput p4, p0, Lkg/b;->s:I

    .line 30
    .line 31
    new-instance p2, Lkg/b$b;

    .line 32
    .line 33
    invoke-direct {p2, p0}, Lkg/b$b;-><init>(Lkg/b;)V

    .line 34
    .line 35
    .line 36
    iput-object p2, p0, Lkg/b;->t:Lkg/b$b;

    .line 37
    .line 38
    new-instance p2, Lkg/d;

    .line 39
    .line 40
    invoke-direct {p2, p1, p0}, Lkg/d;-><init>(Lci/n;Lkg/b;)V

    .line 41
    .line 42
    .line 43
    iput-object p2, p0, Lkg/b;->u:Lkg/d;

    .line 44
    .line 45
    new-instance p1, Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 48
    .line 49
    .line 50
    new-instance p2, Lkotlin/ranges/IntRange;

    .line 51
    .line 52
    const/4 p3, 0x1

    .line 53
    invoke-direct {p2, p3, p4}, Lkotlin/ranges/IntRange;-><init>(II)V

    .line 54
    .line 55
    .line 56
    new-instance p3, Ljava/util/ArrayList;

    .line 57
    .line 58
    const/16 p4, 0xa

    .line 59
    .line 60
    invoke-static {p2, p4}, Lkotlin/collections/h;->t(Ljava/lang/Iterable;I)I

    .line 61
    .line 62
    .line 63
    move-result p4

    .line 64
    invoke-direct {p3, p4}, Ljava/util/ArrayList;-><init>(I)V

    .line 65
    .line 66
    .line 67
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result p4

    .line 75
    if-eqz p4, :cond_0

    .line 76
    .line 77
    move-object p4, p2

    .line 78
    check-cast p4, Lmf/p;

    .line 79
    .line 80
    invoke-virtual {p4}, Lmf/p;->nextInt()I

    .line 81
    .line 82
    .line 83
    move-result p4

    .line 84
    sget-object v0, Ldi/w1;->p:Ldi/w1;

    .line 85
    .line 86
    new-instance v1, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 89
    .line 90
    .line 91
    const/16 v2, 0x50

    .line 92
    .line 93
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p4

    .line 103
    invoke-static {p1, p0, v0, p4}, Lkg/b;->K0(Ljava/util/ArrayList;Lkg/b;Ldi/w1;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    sget-object p4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 107
    .line 108
    invoke-interface {p3, p4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_0
    sget-object p2, Ldi/w1;->q:Ldi/w1;

    .line 113
    .line 114
    const-string p3, "R"

    .line 115
    .line 116
    invoke-static {p1, p0, p2, p3}, Lkg/b;->K0(Ljava/util/ArrayList;Lkg/b;Ldi/w1;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-static {p1}, Lkotlin/collections/h;->D0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    iput-object p1, p0, Lkg/b;->v:Ljava/util/List;

    .line 124
    .line 125
    return-void
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
.end method

.method private static final K0(Ljava/util/ArrayList;Lkg/b;Ldi/w1;Ljava/lang/String;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lmg/f1;",
            ">;",
            "Lkg/b;",
            "Ldi/w1;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    sget-object v0, Lng/g;->f:Lng/g$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lng/g$a;->b()Lng/g;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-static {p3}, Llh/f;->h(Ljava/lang/String;)Llh/f;

    .line 9
    .line 10
    .line 11
    move-result-object v5

    .line 12
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v6

    .line 16
    iget-object v7, p1, Lkg/b;->p:Lci/n;

    .line 17
    .line 18
    move-object v1, p1

    .line 19
    move-object v4, p2

    .line 20
    invoke-static/range {v1 .. v7}, Lpg/k0;->R0(Lmg/m;Lng/g;ZLdi/w1;Llh/f;ILci/n;)Lmg/f1;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    return-void
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
.end method

.method public static final synthetic L0(Lkg/b;)Lmg/l0;
    .locals 0

    iget-object p0, p0, Lkg/b;->q:Lmg/l0;

    return-object p0
.end method

.method public static final synthetic M0()Llh/b;
    .locals 1

    sget-object v0, Lkg/b;->x:Llh/b;

    return-object v0
.end method

.method public static final synthetic N0()Llh/b;
    .locals 1

    sget-object v0, Lkg/b;->y:Llh/b;

    return-object v0
.end method

.method public static final synthetic O0(Lkg/b;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lkg/b;->v:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic P0(Lkg/b;)Lci/n;
    .locals 0

    iget-object p0, p0, Lkg/b;->p:Lci/n;

    return-object p0
.end method


# virtual methods
.method public C()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public E0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic I()Ljava/util/Collection;
    .locals 1

    invoke-virtual {p0}, Lkg/b;->V0()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public I0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public J()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public K()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public L()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final Q0()I
    .locals 1

    iget v0, p0, Lkg/b;->s:I

    return v0
.end method

.method public bridge synthetic R()Lmg/d;
    .locals 1

    invoke-virtual {p0}, Lkg/b;->Y0()Ljava/lang/Void;

    move-result-object v0

    check-cast v0, Lmg/d;

    return-object v0
.end method

.method public R0()Ljava/lang/Void;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic S()Lwh/h;
    .locals 1

    invoke-virtual {p0}, Lkg/b;->W0()Lwh/h$b;

    move-result-object v0

    return-object v0
.end method

.method public S0()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lmg/d;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public T0()Lmg/l0;
    .locals 1

    iget-object v0, p0, Lkg/b;->q:Lmg/l0;

    return-object v0
.end method

.method public bridge synthetic U()Lmg/e;
    .locals 1

    invoke-virtual {p0}, Lkg/b;->R0()Ljava/lang/Void;

    move-result-object v0

    check-cast v0, Lmg/e;

    return-object v0
.end method

.method public final U0()Lkg/c;
    .locals 1

    iget-object v0, p0, Lkg/b;->r:Lkg/c;

    return-object v0
.end method

.method public V0()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lmg/e;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public W0()Lwh/h$b;
    .locals 1

    sget-object v0, Lwh/h$b;->b:Lwh/h$b;

    return-object v0
.end method

.method protected X0(Lei/g;)Lkg/d;
    .locals 1

    .line 1
    const-string v0, "kotlinTypeRefiner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lkg/b;->u:Lkg/d;

    .line 7
    .line 8
    return-object p1
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
.end method

.method public Y0()Ljava/lang/Void;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic b()Lmg/m;
    .locals 1

    invoke-virtual {p0}, Lkg/b;->T0()Lmg/l0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c0(Lei/g;)Lwh/h;
    .locals 0

    invoke-virtual {p0, p1}, Lkg/b;->X0(Lei/g;)Lkg/d;

    move-result-object p1

    return-object p1
.end method

.method public g()Lmg/f;
    .locals 1

    sget-object v0, Lmg/f;->m:Lmg/f;

    return-object v0
.end method

.method public getAnnotations()Lng/g;
    .locals 1

    sget-object v0, Lng/g;->f:Lng/g$a;

    invoke-virtual {v0}, Lng/g$a;->b()Lng/g;

    move-result-object v0

    return-object v0
.end method

.method public getVisibility()Lmg/u;
    .locals 2

    sget-object v0, Lmg/t;->e:Lmg/u;

    const-string v1, "PUBLIC"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public isExternal()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isInline()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public j()Lmg/a1;
    .locals 2

    sget-object v0, Lmg/a1;->a:Lmg/a1;

    const-string v1, "NO_SOURCE"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public k()Ldi/g1;
    .locals 1

    iget-object v0, p0, Lkg/b;->t:Lkg/b$b;

    return-object v0
.end method

.method public l()Lmg/e0;
    .locals 1

    sget-object v0, Lmg/e0;->o:Lmg/e0;

    return-object v0
.end method

.method public bridge synthetic m()Ljava/util/Collection;
    .locals 1

    invoke-virtual {p0}, Lkg/b;->S0()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lpg/a;->getName()Llh/f;

    move-result-object v0

    invoke-virtual {v0}, Llh/f;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "name.asString()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public u()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lmg/f1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lkg/b;->v:Ljava/util/List;

    return-object v0
.end method

.method public x()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public z0()Lmg/h1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lmg/h1<",
            "Ldi/o0;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method
