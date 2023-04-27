.class Lcom/horcrux/svg/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/horcrux/svg/h$a;
    }
.end annotation


# static fields
.field static final p:Lcom/horcrux/svg/h;


# instance fields
.field final a:D

.field final b:Ljava/lang/String;

.field final c:Lcom/horcrux/svg/j0;

.field final d:Lcom/facebook/react/bridge/ReadableMap;

.field e:Lcom/horcrux/svg/l0;

.field f:I

.field final g:Ljava/lang/String;

.field final h:Ljava/lang/String;

.field final i:Lcom/horcrux/svg/k0;

.field final j:Lcom/horcrux/svg/m0;

.field private final k:Lcom/horcrux/svg/n0;

.field final l:D

.field final m:D

.field final n:D

.field final o:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/horcrux/svg/h;

    invoke-direct {v0}, Lcom/horcrux/svg/h;-><init>()V

    sput-object v0, Lcom/horcrux/svg/h;->p:Lcom/horcrux/svg/h;

    return-void
.end method

.method private constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/horcrux/svg/h;->d:Lcom/facebook/react/bridge/ReadableMap;

    const-string v0, ""

    .line 3
    iput-object v0, p0, Lcom/horcrux/svg/h;->b:Ljava/lang/String;

    .line 4
    sget-object v1, Lcom/horcrux/svg/j0;->k:Lcom/horcrux/svg/j0;

    iput-object v1, p0, Lcom/horcrux/svg/h;->c:Lcom/horcrux/svg/j0;

    .line 5
    sget-object v1, Lcom/horcrux/svg/l0;->l:Lcom/horcrux/svg/l0;

    iput-object v1, p0, Lcom/horcrux/svg/h;->e:Lcom/horcrux/svg/l0;

    const/16 v1, 0x190

    .line 6
    iput v1, p0, Lcom/horcrux/svg/h;->f:I

    .line 7
    iput-object v0, p0, Lcom/horcrux/svg/h;->g:Ljava/lang/String;

    .line 8
    iput-object v0, p0, Lcom/horcrux/svg/h;->h:Ljava/lang/String;

    .line 9
    sget-object v0, Lcom/horcrux/svg/k0;->k:Lcom/horcrux/svg/k0;

    iput-object v0, p0, Lcom/horcrux/svg/h;->i:Lcom/horcrux/svg/k0;

    .line 10
    sget-object v0, Lcom/horcrux/svg/m0;->k:Lcom/horcrux/svg/m0;

    iput-object v0, p0, Lcom/horcrux/svg/h;->j:Lcom/horcrux/svg/m0;

    .line 11
    sget-object v0, Lcom/horcrux/svg/n0;->l:Lcom/horcrux/svg/n0;

    iput-object v0, p0, Lcom/horcrux/svg/h;->k:Lcom/horcrux/svg/n0;

    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lcom/horcrux/svg/h;->o:Z

    const-wide/16 v0, 0x0

    .line 13
    iput-wide v0, p0, Lcom/horcrux/svg/h;->l:D

    const-wide/high16 v2, 0x4028000000000000L    # 12.0

    .line 14
    iput-wide v2, p0, Lcom/horcrux/svg/h;->a:D

    .line 15
    iput-wide v0, p0, Lcom/horcrux/svg/h;->m:D

    .line 16
    iput-wide v0, p0, Lcom/horcrux/svg/h;->n:D

    return-void
.end method

.method constructor <init>(Lcom/facebook/react/bridge/ReadableMap;Lcom/horcrux/svg/h;D)V
    .locals 11

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iget-wide v7, p2, Lcom/horcrux/svg/h;->a:D

    const-string v0, "fontSize"

    .line 19
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v2, "fontSize"

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    move-object v0, p0

    move-object v1, p1

    move-wide v5, v7

    .line 20
    invoke-direct/range {v0 .. v8}, Lcom/horcrux/svg/h;->c(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;DDD)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/horcrux/svg/h;->a:D

    goto :goto_0

    .line 21
    :cond_0
    iput-wide v7, p0, Lcom/horcrux/svg/h;->a:D

    :goto_0
    const-string v0, "fontWeight"

    .line 22
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 23
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getType(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;

    move-result-object v1

    .line 24
    sget-object v2, Lcom/facebook/react/bridge/ReadableType;->Number:Lcom/facebook/react/bridge/ReadableType;

    if-ne v1, v2, :cond_1

    .line 25
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-direct {p0, p2, v0, v1}, Lcom/horcrux/svg/h;->a(Lcom/horcrux/svg/h;D)V

    goto :goto_1

    .line 26
    :cond_1
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 27
    invoke-static {v0}, Lcom/horcrux/svg/l0;->b(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 28
    invoke-static {v0}, Lcom/horcrux/svg/l0;->a(Ljava/lang/String;)Lcom/horcrux/svg/l0;

    move-result-object v0

    invoke-static {v0, p2}, Lcom/horcrux/svg/h$a;->b(Lcom/horcrux/svg/l0;Lcom/horcrux/svg/h;)I

    move-result v0

    iput v0, p0, Lcom/horcrux/svg/h;->f:I

    .line 29
    invoke-static {v0}, Lcom/horcrux/svg/h$a;->d(I)Lcom/horcrux/svg/l0;

    move-result-object v0

    iput-object v0, p0, Lcom/horcrux/svg/h;->e:Lcom/horcrux/svg/l0;

    goto :goto_1

    :cond_2
    if-eqz v0, :cond_3

    .line 30
    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-direct {p0, p2, v0, v1}, Lcom/horcrux/svg/h;->a(Lcom/horcrux/svg/h;D)V

    goto :goto_1

    .line 31
    :cond_3
    invoke-direct {p0, p2}, Lcom/horcrux/svg/h;->b(Lcom/horcrux/svg/h;)V

    goto :goto_1

    .line 32
    :cond_4
    invoke-direct {p0, p2}, Lcom/horcrux/svg/h;->b(Lcom/horcrux/svg/h;)V

    :goto_1
    const-string v0, "fontData"

    .line 33
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object v0

    goto :goto_2

    :cond_5
    iget-object v0, p2, Lcom/horcrux/svg/h;->d:Lcom/facebook/react/bridge/ReadableMap;

    :goto_2
    iput-object v0, p0, Lcom/horcrux/svg/h;->d:Lcom/facebook/react/bridge/ReadableMap;

    const-string v0, "fontFamily"

    .line 34
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    :cond_6
    iget-object v0, p2, Lcom/horcrux/svg/h;->b:Ljava/lang/String;

    :goto_3
    iput-object v0, p0, Lcom/horcrux/svg/h;->b:Ljava/lang/String;

    const-string v0, "fontStyle"

    .line 35
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/horcrux/svg/j0;->valueOf(Ljava/lang/String;)Lcom/horcrux/svg/j0;

    move-result-object v0

    goto :goto_4

    :cond_7
    iget-object v0, p2, Lcom/horcrux/svg/h;->c:Lcom/horcrux/svg/j0;

    :goto_4
    iput-object v0, p0, Lcom/horcrux/svg/h;->c:Lcom/horcrux/svg/j0;

    const-string v0, "fontFeatureSettings"

    .line 36
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 37
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_5

    .line 38
    :cond_8
    iget-object v0, p2, Lcom/horcrux/svg/h;->g:Ljava/lang/String;

    :goto_5
    iput-object v0, p0, Lcom/horcrux/svg/h;->g:Ljava/lang/String;

    const-string v0, "fontVariationSettings"

    .line 39
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 40
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_6

    .line 41
    :cond_9
    iget-object v0, p2, Lcom/horcrux/svg/h;->h:Ljava/lang/String;

    :goto_6
    iput-object v0, p0, Lcom/horcrux/svg/h;->h:Ljava/lang/String;

    const-string v0, "fontVariantLigatures"

    .line 42
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_a

    .line 43
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/horcrux/svg/k0;->valueOf(Ljava/lang/String;)Lcom/horcrux/svg/k0;

    move-result-object v0

    goto :goto_7

    .line 44
    :cond_a
    iget-object v0, p2, Lcom/horcrux/svg/h;->i:Lcom/horcrux/svg/k0;

    :goto_7
    iput-object v0, p0, Lcom/horcrux/svg/h;->i:Lcom/horcrux/svg/k0;

    const-string v0, "textAnchor"

    .line 45
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_b

    .line 46
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/horcrux/svg/m0;->valueOf(Ljava/lang/String;)Lcom/horcrux/svg/m0;

    move-result-object v0

    goto :goto_8

    .line 47
    :cond_b
    iget-object v0, p2, Lcom/horcrux/svg/h;->j:Lcom/horcrux/svg/m0;

    :goto_8
    iput-object v0, p0, Lcom/horcrux/svg/h;->j:Lcom/horcrux/svg/m0;

    const-string v0, "textDecoration"

    .line 48
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_c

    .line 49
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/horcrux/svg/n0;->a(Ljava/lang/String;)Lcom/horcrux/svg/n0;

    move-result-object v0

    goto :goto_9

    .line 50
    :cond_c
    iget-object v0, p2, Lcom/horcrux/svg/h;->k:Lcom/horcrux/svg/n0;

    :goto_9
    iput-object v0, p0, Lcom/horcrux/svg/h;->k:Lcom/horcrux/svg/n0;

    const-string v0, "kerning"

    .line 51
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_e

    .line 52
    iget-boolean v1, p2, Lcom/horcrux/svg/h;->o:Z

    if-eqz v1, :cond_d

    goto :goto_a

    :cond_d
    const/4 v1, 0x0

    goto :goto_b

    :cond_e
    :goto_a
    const/4 v1, 0x1

    :goto_b
    iput-boolean v1, p0, Lcom/horcrux/svg/h;->o:Z

    if-eqz v0, :cond_f

    const-string v4, "kerning"

    .line 53
    iget-wide v7, p0, Lcom/horcrux/svg/h;->a:D

    const-wide/16 v9, 0x0

    move-object v2, p0

    move-object v3, p1

    move-wide v5, p3

    invoke-direct/range {v2 .. v10}, Lcom/horcrux/svg/h;->c(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;DDD)D

    move-result-wide v0

    goto :goto_c

    :cond_f
    iget-wide v0, p2, Lcom/horcrux/svg/h;->l:D

    :goto_c
    iput-wide v0, p0, Lcom/horcrux/svg/h;->l:D

    const-string v0, "wordSpacing"

    .line 54
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_10

    const-string v3, "wordSpacing"

    .line 55
    iget-wide v6, p0, Lcom/horcrux/svg/h;->a:D

    const-wide/16 v8, 0x0

    move-object v1, p0

    move-object v2, p1

    move-wide v4, p3

    invoke-direct/range {v1 .. v9}, Lcom/horcrux/svg/h;->c(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;DDD)D

    move-result-wide v0

    goto :goto_d

    .line 56
    :cond_10
    iget-wide v0, p2, Lcom/horcrux/svg/h;->m:D

    :goto_d
    iput-wide v0, p0, Lcom/horcrux/svg/h;->m:D

    const-string v0, "letterSpacing"

    .line 57
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_11

    const-string v3, "letterSpacing"

    .line 58
    iget-wide v6, p0, Lcom/horcrux/svg/h;->a:D

    const-wide/16 v8, 0x0

    move-object v1, p0

    move-object v2, p1

    move-wide v4, p3

    invoke-direct/range {v1 .. v9}, Lcom/horcrux/svg/h;->c(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;DDD)D

    move-result-wide p1

    goto :goto_e

    .line 59
    :cond_11
    iget-wide p1, p2, Lcom/horcrux/svg/h;->n:D

    :goto_e
    iput-wide p1, p0, Lcom/horcrux/svg/h;->n:D

    return-void
.end method

.method private a(Lcom/horcrux/svg/h;D)V
    .locals 2

    .line 1
    invoke-static {p2, p3}, Ljava/lang/Math;->round(D)J

    .line 2
    .line 3
    .line 4
    move-result-wide p2

    .line 5
    const-wide/16 v0, 0x1

    .line 6
    .line 7
    cmp-long v0, p2, v0

    .line 8
    .line 9
    if-ltz v0, :cond_0

    .line 10
    .line 11
    const-wide/16 v0, 0x3e8

    .line 12
    .line 13
    cmp-long v0, p2, v0

    .line 14
    .line 15
    if-gtz v0, :cond_0

    .line 16
    .line 17
    long-to-int p1, p2

    .line 18
    iput p1, p0, Lcom/horcrux/svg/h;->f:I

    .line 19
    .line 20
    invoke-static {p1}, Lcom/horcrux/svg/h$a;->d(I)Lcom/horcrux/svg/l0;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, Lcom/horcrux/svg/h;->e:Lcom/horcrux/svg/l0;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-direct {p0, p1}, Lcom/horcrux/svg/h;->b(Lcom/horcrux/svg/h;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    return-void
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
.end method

.method private b(Lcom/horcrux/svg/h;)V
    .locals 1

    .line 1
    iget v0, p1, Lcom/horcrux/svg/h;->f:I

    .line 2
    .line 3
    iput v0, p0, Lcom/horcrux/svg/h;->f:I

    .line 4
    .line 5
    iget-object p1, p1, Lcom/horcrux/svg/h;->e:Lcom/horcrux/svg/l0;

    .line 6
    .line 7
    iput-object p1, p0, Lcom/horcrux/svg/h;->e:Lcom/horcrux/svg/l0;

    .line 8
    .line 9
    return-void
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
.end method

.method private c(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;DDD)D
    .locals 7

    .line 1
    invoke-interface {p1, p2}, Lcom/facebook/react/bridge/ReadableMap;->getType(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/facebook/react/bridge/ReadableType;->Number:Lcom/facebook/react/bridge/ReadableType;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-interface {p1, p2}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 10
    .line 11
    .line 12
    move-result-wide p1

    .line 13
    return-wide p1

    .line 14
    :cond_0
    invoke-interface {p1, p2}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    move-wide v1, p7

    .line 19
    move-wide v3, p3

    .line 20
    move-wide v5, p5

    .line 21
    invoke-static/range {v0 .. v6}, Lcom/horcrux/svg/x;->b(Ljava/lang/String;DDD)D

    .line 22
    .line 23
    .line 24
    move-result-wide p1

    .line 25
    return-wide p1
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
.end method
