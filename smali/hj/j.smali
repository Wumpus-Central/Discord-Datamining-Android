.class final Lhj/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhj/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lhj/h<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field private final k:Lhj/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhj/h<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private final l:Lfj/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfj/p<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final m:I

.field private final n:I

.field private final o:Z

.field private final p:C

.field private final q:Lgj/g;


# direct methods
.method constructor <init>(Lfj/p;IIZ)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/p<",
            "Ljava/lang/Integer;",
            ">;IIZ)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lhj/j;->l:Lfj/p;

    .line 3
    iput p2, p0, Lhj/j;->m:I

    .line 4
    iput p3, p0, Lhj/j;->n:I

    if-nez p4, :cond_0

    if-ne p2, p3, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 5
    :goto_0
    iput-boolean v0, p0, Lhj/j;->o:Z

    if-eqz p4, :cond_1

    .line 6
    new-instance p4, Lhj/m;

    sget-object v0, Lgj/a;->o:Lfj/c;

    invoke-direct {p4, v0}, Lhj/m;-><init>(Lfj/c;)V

    goto :goto_1

    :cond_1
    const/4 p4, 0x0

    :goto_1
    iput-object p4, p0, Lhj/j;->k:Lhj/h;

    if-eqz p1, :cond_6

    if-ltz p2, :cond_5

    if-gt p2, p3, :cond_4

    const/16 p1, 0x9

    if-gt p2, p1, :cond_3

    if-gt p3, p1, :cond_2

    const/16 p1, 0x30

    .line 7
    iput-char p1, p0, Lhj/j;->p:C

    .line 8
    sget-object p1, Lgj/g;->l:Lgj/g;

    iput-object p1, p0, Lhj/j;->q:Lgj/g;

    return-void

    .line 9
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Max digits out of range: "

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 10
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Min digits out of range: "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 11
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Max smaller than min: "

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " < "

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 12
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Negative min digits: "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 13
    :cond_6
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Missing element."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private constructor <init>(Lhj/h;Lfj/p;IIZCLgj/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhj/h<",
            "Ljava/lang/Void;",
            ">;",
            "Lfj/p<",
            "Ljava/lang/Integer;",
            ">;IIZC",
            "Lgj/g;",
            ")V"
        }
    .end annotation

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lhj/j;->k:Lhj/h;

    .line 16
    iput-object p2, p0, Lhj/j;->l:Lfj/p;

    .line 17
    iput p3, p0, Lhj/j;->m:I

    .line 18
    iput p4, p0, Lhj/j;->n:I

    .line 19
    iput-boolean p5, p0, Lhj/j;->o:Z

    .line 20
    iput-char p6, p0, Lhj/j;->p:C

    .line 21
    iput-object p7, p0, Lhj/j;->q:Lgj/g;

    return-void
.end method

.method private a(Ljava/math/BigDecimal;II)I
    .locals 2

    .line 1
    int-to-long v0, p2

    .line 2
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 3
    .line 4
    .line 5
    move-result-object p2

    .line 6
    int-to-long v0, p3

    .line 7
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 8
    .line 9
    .line 10
    move-result-object p3

    .line 11
    invoke-virtual {p3, p2}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 12
    .line 13
    .line 14
    move-result-object p3

    .line 15
    sget-object v0, Ljava/math/BigDecimal;->ONE:Ljava/math/BigDecimal;

    .line 16
    .line 17
    invoke-virtual {p3, v0}, Ljava/math/BigDecimal;->add(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 18
    .line 19
    .line 20
    move-result-object p3

    .line 21
    invoke-virtual {p1, p3}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const/4 p3, 0x0

    .line 26
    sget-object v0, Ljava/math/RoundingMode;->FLOOR:Ljava/math/RoundingMode;

    .line 27
    .line 28
    invoke-virtual {p1, p3, v0}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1, p2}, Ljava/math/BigDecimal;->add(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1}, Ljava/math/BigDecimal;->intValueExact()I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    return p1
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
.end method

.method private b()Z
    .locals 1

    iget-object v0, p0, Lhj/j;->k:Lhj/h;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static d(Ljava/lang/Number;)Ljava/math/BigDecimal;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public c()Lfj/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfj/p<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lhj/j;->l:Lfj/p;

    return-object v0
.end method

.method public e(Lfj/o;Ljava/lang/Appendable;Lfj/d;Ljava/util/Set;Z)I
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/o;",
            "Ljava/lang/Appendable;",
            "Lfj/d;",
            "Ljava/util/Set<",
            "Lhj/g;",
            ">;Z)I"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v7, p2

    .line 6
    .line 7
    move-object/from16 v8, p4

    .line 8
    .line 9
    iget-object v1, v0, Lhj/j;->l:Lfj/p;

    .line 10
    .line 11
    invoke-interface {v2, v1}, Lfj/o;->k(Lfj/p;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Ljava/lang/Number;

    .line 16
    .line 17
    invoke-static {v1}, Lhj/j;->d(Ljava/lang/Number;)Ljava/math/BigDecimal;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget-object v3, v0, Lhj/j;->l:Lfj/p;

    .line 22
    .line 23
    invoke-interface {v2, v3}, Lfj/o;->t(Lfj/p;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    check-cast v3, Ljava/lang/Number;

    .line 28
    .line 29
    invoke-static {v3}, Lhj/j;->d(Ljava/lang/Number;)Ljava/math/BigDecimal;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    iget-object v4, v0, Lhj/j;->l:Lfj/p;

    .line 34
    .line 35
    invoke-interface {v2, v4}, Lfj/o;->c(Lfj/p;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    check-cast v4, Ljava/lang/Number;

    .line 40
    .line 41
    invoke-static {v4}, Lhj/j;->d(Ljava/lang/Number;)Ljava/math/BigDecimal;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-virtual {v1, v4}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    if-lez v5, :cond_0

    .line 50
    .line 51
    move-object v1, v4

    .line 52
    :cond_0
    invoke-virtual {v1, v3}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v4, v3}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    sget-object v4, Ljava/math/BigDecimal;->ONE:Ljava/math/BigDecimal;

    .line 61
    .line 62
    invoke-virtual {v3, v4}, Ljava/math/BigDecimal;->add(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    const/16 v4, 0x9

    .line 67
    .line 68
    sget-object v5, Ljava/math/RoundingMode;->FLOOR:Ljava/math/RoundingMode;

    .line 69
    .line 70
    invoke-virtual {v1, v3, v4, v5}, Ljava/math/BigDecimal;->divide(Ljava/math/BigDecimal;ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    sget-object v3, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 75
    .line 76
    invoke-virtual {v1, v3}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    if-nez v3, :cond_1

    .line 81
    .line 82
    sget-object v1, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_1
    invoke-virtual {v1}, Ljava/math/BigDecimal;->stripTrailingZeros()Ljava/math/BigDecimal;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    :goto_0
    move-object v9, v1

    .line 90
    const/16 v10, 0x30

    .line 91
    .line 92
    if-eqz p5, :cond_2

    .line 93
    .line 94
    iget-char v1, v0, Lhj/j;->p:C

    .line 95
    .line 96
    move-object/from16 v4, p3

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_2
    sget-object v1, Lgj/a;->m:Lfj/c;

    .line 100
    .line 101
    invoke-static {v10}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    move-object/from16 v4, p3

    .line 106
    .line 107
    invoke-interface {v4, v1, v3}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    check-cast v1, Ljava/lang/Character;

    .line 112
    .line 113
    invoke-virtual {v1}, Ljava/lang/Character;->charValue()C

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    :goto_1
    move v11, v1

    .line 118
    instance-of v1, v7, Ljava/lang/CharSequence;

    .line 119
    .line 120
    const/4 v12, -0x1

    .line 121
    if-eqz v1, :cond_3

    .line 122
    .line 123
    move-object v1, v7

    .line 124
    check-cast v1, Ljava/lang/CharSequence;

    .line 125
    .line 126
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    move v13, v1

    .line 131
    goto :goto_2

    .line 132
    :cond_3
    move v13, v12

    .line 133
    :goto_2
    invoke-virtual {v9}, Ljava/math/BigDecimal;->scale()I

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    const/4 v14, 0x0

    .line 138
    const/4 v15, 0x1

    .line 139
    if-nez v1, :cond_6

    .line 140
    .line 141
    iget v1, v0, Lhj/j;->m:I

    .line 142
    .line 143
    if-lez v1, :cond_8

    .line 144
    .line 145
    invoke-direct/range {p0 .. p0}, Lhj/j;->b()Z

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    if-eqz v1, :cond_4

    .line 150
    .line 151
    iget-object v1, v0, Lhj/j;->k:Lhj/h;

    .line 152
    .line 153
    move-object/from16 v2, p1

    .line 154
    .line 155
    move-object/from16 v3, p2

    .line 156
    .line 157
    move-object/from16 v4, p3

    .line 158
    .line 159
    move-object/from16 v5, p4

    .line 160
    .line 161
    move/from16 v6, p5

    .line 162
    .line 163
    invoke-interface/range {v1 .. v6}, Lhj/h;->e(Lfj/o;Ljava/lang/Appendable;Lfj/d;Ljava/util/Set;Z)I

    .line 164
    .line 165
    .line 166
    move v1, v15

    .line 167
    goto :goto_3

    .line 168
    :cond_4
    move v1, v14

    .line 169
    :goto_3
    iget v2, v0, Lhj/j;->m:I

    .line 170
    .line 171
    if-ge v14, v2, :cond_5

    .line 172
    .line 173
    invoke-interface {v7, v11}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 174
    .line 175
    .line 176
    add-int/lit8 v14, v14, 0x1

    .line 177
    .line 178
    goto :goto_3

    .line 179
    :cond_5
    add-int v14, v1, v2

    .line 180
    .line 181
    goto :goto_5

    .line 182
    :cond_6
    invoke-direct/range {p0 .. p0}, Lhj/j;->b()Z

    .line 183
    .line 184
    .line 185
    move-result v1

    .line 186
    if-eqz v1, :cond_7

    .line 187
    .line 188
    iget-object v1, v0, Lhj/j;->k:Lhj/h;

    .line 189
    .line 190
    move-object/from16 v2, p1

    .line 191
    .line 192
    move-object/from16 v3, p2

    .line 193
    .line 194
    move-object/from16 v4, p3

    .line 195
    .line 196
    move-object/from16 v5, p4

    .line 197
    .line 198
    move/from16 v6, p5

    .line 199
    .line 200
    invoke-interface/range {v1 .. v6}, Lhj/h;->e(Lfj/o;Ljava/lang/Appendable;Lfj/d;Ljava/util/Set;Z)I

    .line 201
    .line 202
    .line 203
    move v14, v15

    .line 204
    :cond_7
    invoke-virtual {v9}, Ljava/math/BigDecimal;->scale()I

    .line 205
    .line 206
    .line 207
    move-result v1

    .line 208
    iget v2, v0, Lhj/j;->m:I

    .line 209
    .line 210
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 211
    .line 212
    .line 213
    move-result v1

    .line 214
    iget v2, v0, Lhj/j;->n:I

    .line 215
    .line 216
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 217
    .line 218
    .line 219
    move-result v1

    .line 220
    sget-object v2, Ljava/math/RoundingMode;->FLOOR:Ljava/math/RoundingMode;

    .line 221
    .line 222
    invoke-virtual {v9, v1, v2}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    invoke-virtual {v1}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    sub-int/2addr v11, v10

    .line 231
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 232
    .line 233
    .line 234
    move-result v2

    .line 235
    const/4 v3, 0x2

    .line 236
    :goto_4
    if-ge v3, v2, :cond_8

    .line 237
    .line 238
    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    .line 239
    .line 240
    .line 241
    move-result v4

    .line 242
    add-int/2addr v4, v11

    .line 243
    int-to-char v4, v4

    .line 244
    invoke-interface {v7, v4}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 245
    .line 246
    .line 247
    add-int/lit8 v14, v14, 0x1

    .line 248
    .line 249
    add-int/lit8 v3, v3, 0x1

    .line 250
    .line 251
    goto :goto_4

    .line 252
    :cond_8
    :goto_5
    if-eq v13, v12, :cond_9

    .line 253
    .line 254
    if-le v14, v15, :cond_9

    .line 255
    .line 256
    if-eqz v8, :cond_9

    .line 257
    .line 258
    new-instance v1, Lhj/g;

    .line 259
    .line 260
    iget-object v2, v0, Lhj/j;->l:Lfj/p;

    .line 261
    .line 262
    add-int/lit8 v3, v13, 0x1

    .line 263
    .line 264
    add-int/2addr v13, v14

    .line 265
    invoke-direct {v1, v2, v3, v13}, Lhj/g;-><init>(Lfj/p;II)V

    .line 266
    .line 267
    .line 268
    invoke-interface {v8, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    :cond_9
    return v14
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
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lhj/j;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_2

    .line 9
    .line 10
    check-cast p1, Lhj/j;

    .line 11
    .line 12
    iget-object v1, p0, Lhj/j;->l:Lfj/p;

    .line 13
    .line 14
    iget-object v3, p1, Lhj/j;->l:Lfj/p;

    .line 15
    .line 16
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    iget v1, p0, Lhj/j;->m:I

    .line 23
    .line 24
    iget v3, p1, Lhj/j;->m:I

    .line 25
    .line 26
    if-ne v1, v3, :cond_1

    .line 27
    .line 28
    iget v1, p0, Lhj/j;->n:I

    .line 29
    .line 30
    iget v3, p1, Lhj/j;->n:I

    .line 31
    .line 32
    if-ne v1, v3, :cond_1

    .line 33
    .line 34
    invoke-direct {p0}, Lhj/j;->b()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    invoke-direct {p1}, Lhj/j;->b()Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-ne v1, p1, :cond_1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    move v0, v2

    .line 46
    :goto_0
    return v0

    .line 47
    :cond_2
    return v2
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
.end method

.method public f(Lfj/p;)Lhj/h;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/p<",
            "Ljava/lang/Integer;",
            ">;)",
            "Lhj/h<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lhj/j;->l:Lfj/p;

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Lhj/j;

    .line 7
    .line 8
    iget v1, p0, Lhj/j;->m:I

    .line 9
    .line 10
    iget v2, p0, Lhj/j;->n:I

    .line 11
    .line 12
    invoke-direct {p0}, Lhj/j;->b()Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    invoke-direct {v0, p1, v1, v2, v3}, Lhj/j;-><init>(Lfj/p;IIZ)V

    .line 17
    .line 18
    .line 19
    return-object v0
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method g(Lfj/q;Lfj/q;)Lfj/q;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/q<",
            "*>;",
            "Lfj/q<",
            "*>;)",
            "Lfj/q<",
            "*>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lhj/k;->k:Lhj/k;

    .line 2
    .line 3
    invoke-virtual {p2, v0}, Lfj/q;->o(Lfj/p;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    invoke-virtual {p2, v0}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Ljava/math/BigDecimal;

    .line 15
    .line 16
    iget-object v2, p0, Lhj/j;->l:Lfj/p;

    .line 17
    .line 18
    invoke-virtual {p1, v2}, Lfj/q;->t(Lfj/p;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Ljava/lang/Integer;

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    iget-object v3, p0, Lhj/j;->l:Lfj/p;

    .line 29
    .line 30
    invoke-virtual {p1, v3}, Lfj/q;->c(Lfj/p;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, Ljava/lang/Integer;

    .line 35
    .line 36
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    invoke-direct {p0, v1, v2, v3}, Lhj/j;->a(Ljava/math/BigDecimal;II)I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    const/4 v2, 0x0

    .line 45
    invoke-virtual {p2, v0, v2}, Lfj/q;->E(Lfj/p;Ljava/lang/Object;)Lfj/q;

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Lhj/j;->l:Lfj/p;

    .line 49
    .line 50
    invoke-virtual {p2, v0, v1}, Lfj/q;->B(Lfj/p;I)Lfj/q;

    .line 51
    .line 52
    .line 53
    iget-object p2, p0, Lhj/j;->l:Lfj/p;

    .line 54
    .line 55
    invoke-virtual {p1, p2, v1}, Lfj/q;->B(Lfj/p;I)Lfj/q;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    return-object p1
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

.method public h()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lhj/j;->l:Lfj/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x7

    .line 8
    .line 9
    iget v1, p0, Lhj/j;->m:I

    .line 10
    .line 11
    iget v2, p0, Lhj/j;->n:I

    .line 12
    .line 13
    mul-int/lit8 v2, v2, 0xa

    .line 14
    .line 15
    add-int/2addr v1, v2

    .line 16
    mul-int/lit8 v1, v1, 0x1f

    .line 17
    .line 18
    add-int/2addr v0, v1

    .line 19
    return v0
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public i(Ljava/lang/CharSequence;Lhj/s;Lfj/d;Lhj/t;Z)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            "Lhj/s;",
            "Lfj/d;",
            "Lhj/t<",
            "*>;Z)V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v7, p2

    .line 4
    .line 5
    move-object/from16 v8, p3

    .line 6
    .line 7
    move-object/from16 v9, p4

    .line 8
    .line 9
    if-eqz p5, :cond_0

    .line 10
    .line 11
    iget-object v1, v0, Lhj/j;->q:Lgj/g;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    sget-object v1, Lgj/a;->f:Lfj/c;

    .line 15
    .line 16
    sget-object v2, Lgj/g;->l:Lgj/g;

    .line 17
    .line 18
    invoke-interface {v8, v1, v2}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Lgj/g;

    .line 23
    .line 24
    :goto_0
    move-object v10, v1

    .line 25
    invoke-virtual {v10}, Lgj/g;->a()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    const/16 v11, 0x9

    .line 30
    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    iget-boolean v1, v0, Lhj/j;->o:Z

    .line 34
    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    move v14, v11

    .line 39
    const/4 v13, 0x0

    .line 40
    goto :goto_2

    .line 41
    :cond_2
    :goto_1
    iget v1, v0, Lhj/j;->m:I

    .line 42
    .line 43
    iget v2, v0, Lhj/j;->n:I

    .line 44
    .line 45
    move v13, v1

    .line 46
    move v14, v2

    .line 47
    :goto_2
    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    .line 48
    .line 49
    .line 50
    move-result v15

    .line 51
    invoke-virtual/range {p2 .. p2}, Lhj/s;->f()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-lt v1, v15, :cond_4

    .line 56
    .line 57
    if-lez v13, :cond_3

    .line 58
    .line 59
    invoke-virtual/range {p2 .. p2}, Lhj/s;->f()I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    new-instance v2, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 66
    .line 67
    .line 68
    const-string v3, "Expected fraction digits not found for: "

    .line 69
    .line 70
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    iget-object v3, v0, Lhj/j;->l:Lfj/p;

    .line 74
    .line 75
    invoke-interface {v3}, Lfj/p;->name()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-virtual {v7, v1, v2}, Lhj/s;->k(ILjava/lang/String;)V

    .line 87
    .line 88
    .line 89
    :cond_3
    return-void

    .line 90
    :cond_4
    invoke-direct/range {p0 .. p0}, Lhj/j;->b()Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-eqz v1, :cond_6

    .line 95
    .line 96
    iget-object v1, v0, Lhj/j;->k:Lhj/h;

    .line 97
    .line 98
    const/4 v5, 0x0

    .line 99
    move-object/from16 v2, p1

    .line 100
    .line 101
    move-object/from16 v3, p2

    .line 102
    .line 103
    move-object/from16 v4, p3

    .line 104
    .line 105
    move/from16 v6, p5

    .line 106
    .line 107
    invoke-interface/range {v1 .. v6}, Lhj/h;->i(Ljava/lang/CharSequence;Lhj/s;Lfj/d;Lhj/t;Z)V

    .line 108
    .line 109
    .line 110
    invoke-virtual/range {p2 .. p2}, Lhj/s;->i()Z

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    if-eqz v1, :cond_6

    .line 115
    .line 116
    if-nez v13, :cond_5

    .line 117
    .line 118
    invoke-virtual/range {p2 .. p2}, Lhj/s;->a()V

    .line 119
    .line 120
    .line 121
    :cond_5
    return-void

    .line 122
    :cond_6
    invoke-virtual/range {p2 .. p2}, Lhj/s;->f()I

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    add-int v2, v1, v13

    .line 127
    .line 128
    add-int/2addr v14, v1

    .line 129
    invoke-static {v14, v15}, Ljava/lang/Math;->min(II)I

    .line 130
    .line 131
    .line 132
    move-result v3

    .line 133
    const-string v4, " digits."

    .line 134
    .line 135
    const-string v5, "Expected at least "

    .line 136
    .line 137
    if-le v2, v15, :cond_7

    .line 138
    .line 139
    invoke-virtual {v10}, Lgj/g;->c()Z

    .line 140
    .line 141
    .line 142
    move-result v6

    .line 143
    if-eqz v6, :cond_7

    .line 144
    .line 145
    invoke-virtual/range {p2 .. p2}, Lhj/s;->f()I

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    new-instance v2, Ljava/lang/StringBuilder;

    .line 150
    .line 151
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    invoke-virtual {v7, v1, v2}, Lhj/s;->k(ILjava/lang/String;)V

    .line 168
    .line 169
    .line 170
    return-void

    .line 171
    :cond_7
    if-eqz p5, :cond_8

    .line 172
    .line 173
    iget-char v6, v0, Lhj/j;->p:C

    .line 174
    .line 175
    goto :goto_3

    .line 176
    :cond_8
    sget-object v6, Lgj/a;->m:Lfj/c;

    .line 177
    .line 178
    const/16 v14, 0x30

    .line 179
    .line 180
    invoke-static {v14}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 181
    .line 182
    .line 183
    move-result-object v14

    .line 184
    invoke-interface {v8, v6, v14}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v6

    .line 188
    check-cast v6, Ljava/lang/Character;

    .line 189
    .line 190
    invoke-virtual {v6}, Ljava/lang/Character;->charValue()C

    .line 191
    .line 192
    .line 193
    move-result v6

    .line 194
    :goto_3
    const-wide/16 v14, 0x0

    .line 195
    .line 196
    :goto_4
    if-ge v1, v3, :cond_a

    .line 197
    .line 198
    move-object/from16 v8, p1

    .line 199
    .line 200
    invoke-interface {v8, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 201
    .line 202
    .line 203
    move-result v16

    .line 204
    sub-int v12, v16, v6

    .line 205
    .line 206
    if-ltz v12, :cond_9

    .line 207
    .line 208
    if-gt v12, v11, :cond_9

    .line 209
    .line 210
    const-wide/16 v17, 0xa

    .line 211
    .line 212
    mul-long v14, v14, v17

    .line 213
    .line 214
    int-to-long v11, v12

    .line 215
    add-long/2addr v14, v11

    .line 216
    add-int/lit8 v1, v1, 0x1

    .line 217
    .line 218
    const/16 v11, 0x9

    .line 219
    .line 220
    goto :goto_4

    .line 221
    :cond_9
    if-ge v1, v2, :cond_a

    .line 222
    .line 223
    invoke-virtual {v10}, Lgj/g;->c()Z

    .line 224
    .line 225
    .line 226
    move-result v2

    .line 227
    if-eqz v2, :cond_a

    .line 228
    .line 229
    invoke-virtual/range {p2 .. p2}, Lhj/s;->f()I

    .line 230
    .line 231
    .line 232
    move-result v1

    .line 233
    new-instance v2, Ljava/lang/StringBuilder;

    .line 234
    .line 235
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v2

    .line 251
    invoke-virtual {v7, v1, v2}, Lhj/s;->k(ILjava/lang/String;)V

    .line 252
    .line 253
    .line 254
    return-void

    .line 255
    :cond_a
    new-instance v2, Ljava/math/BigDecimal;

    .line 256
    .line 257
    invoke-direct {v2, v14, v15}, Ljava/math/BigDecimal;-><init>(J)V

    .line 258
    .line 259
    .line 260
    invoke-virtual/range {p2 .. p2}, Lhj/s;->f()I

    .line 261
    .line 262
    .line 263
    move-result v3

    .line 264
    sub-int v3, v1, v3

    .line 265
    .line 266
    invoke-virtual {v2, v3}, Ljava/math/BigDecimal;->movePointLeft(I)Ljava/math/BigDecimal;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    iget-object v3, v0, Lhj/j;->l:Lfj/p;

    .line 271
    .line 272
    invoke-interface {v3}, Lfj/p;->name()Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v3

    .line 276
    const-string v4, "NANO_OF_SECOND"

    .line 277
    .line 278
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    move-result v3

    .line 282
    if-eqz v3, :cond_b

    .line 283
    .line 284
    const v3, 0x3b9ac9ff

    .line 285
    .line 286
    .line 287
    const/4 v4, 0x0

    .line 288
    invoke-direct {v0, v2, v4, v3}, Lhj/j;->a(Ljava/math/BigDecimal;II)I

    .line 289
    .line 290
    .line 291
    move-result v2

    .line 292
    iget-object v3, v0, Lhj/j;->l:Lfj/p;

    .line 293
    .line 294
    invoke-virtual {v9, v3, v2}, Lhj/t;->H(Lfj/p;I)V

    .line 295
    .line 296
    .line 297
    goto :goto_5

    .line 298
    :cond_b
    sget-object v3, Lhj/k;->k:Lhj/k;

    .line 299
    .line 300
    invoke-virtual {v9, v3, v2}, Lhj/t;->I(Lfj/p;Ljava/lang/Object;)V

    .line 301
    .line 302
    .line 303
    iget-object v2, v0, Lhj/j;->l:Lfj/p;

    .line 304
    .line 305
    invoke-interface {v2}, Lfj/p;->S()Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v3

    .line 309
    invoke-virtual {v9, v2, v3}, Lhj/t;->I(Lfj/p;Ljava/lang/Object;)V

    .line 310
    .line 311
    .line 312
    :goto_5
    invoke-virtual {v7, v1}, Lhj/s;->l(I)V

    .line 313
    .line 314
    .line 315
    return-void
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
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
.end method

.method public j(Lhj/c;Lfj/d;I)Lhj/h;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhj/c<",
            "*>;",
            "Lfj/d;",
            "I)",
            "Lhj/h<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p1, Lhj/j;

    .line 2
    .line 3
    iget-object v1, p0, Lhj/j;->k:Lhj/h;

    .line 4
    .line 5
    iget-object v2, p0, Lhj/j;->l:Lfj/p;

    .line 6
    .line 7
    iget v3, p0, Lhj/j;->m:I

    .line 8
    .line 9
    iget v4, p0, Lhj/j;->n:I

    .line 10
    .line 11
    iget-boolean v5, p0, Lhj/j;->o:Z

    .line 12
    .line 13
    sget-object p3, Lgj/a;->m:Lfj/c;

    .line 14
    .line 15
    const/16 v0, 0x30

    .line 16
    .line 17
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {p2, p3, v0}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p3

    .line 25
    check-cast p3, Ljava/lang/Character;

    .line 26
    .line 27
    invoke-virtual {p3}, Ljava/lang/Character;->charValue()C

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    sget-object p3, Lgj/a;->f:Lfj/c;

    .line 32
    .line 33
    sget-object v0, Lgj/g;->l:Lgj/g;

    .line 34
    .line 35
    invoke-interface {p2, p3, v0}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    move-object v7, p2

    .line 40
    check-cast v7, Lgj/g;

    .line 41
    .line 42
    move-object v0, p1

    .line 43
    invoke-direct/range {v0 .. v7}, Lhj/j;-><init>(Lhj/h;Lfj/p;IIZCLgj/g;)V

    .line 44
    .line 45
    .line 46
    return-object p1
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
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x40

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const-class v1, Lhj/j;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v1, "[element="

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lhj/j;->l:Lfj/p;

    .line 23
    .line 24
    invoke-interface {v1}, Lfj/p;->name()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v1, ", min-digits="

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget v1, p0, Lhj/j;->m:I

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v1, ", max-digits="

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    iget v1, p0, Lhj/j;->n:I

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const/16 v1, 0x5d

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    return-object v0
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
