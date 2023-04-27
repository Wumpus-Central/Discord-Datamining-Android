.class public final Lcom/google/android/exoplayer2/MediaItem$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/exoplayer2/MediaItem;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private A:F

.field private B:F

.field private a:Ljava/lang/String;

.field private b:Landroid/net/Uri;

.field private c:Ljava/lang/String;

.field private d:J

.field private e:J

.field private f:Z

.field private g:Z

.field private h:Z

.field private i:Landroid/net/Uri;

.field private j:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private k:Ljava/util/UUID;

.field private l:Z

.field private m:Z

.field private n:Z

.field private o:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private p:[B

.field private q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lh8/c;",
            ">;"
        }
    .end annotation
.end field

.field private r:Ljava/lang/String;

.field private s:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/android/exoplayer2/MediaItem$h;",
            ">;"
        }
    .end annotation
.end field

.field private t:Landroid/net/Uri;

.field private u:Ljava/lang/Object;

.field private v:Ljava/lang/Object;

.field private w:Lcom/google/android/exoplayer2/i0;

.field private x:J

.field private y:J

.field private z:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/high16 v0, -0x8000000000000000L

    .line 3
    iput-wide v0, p0, Lcom/google/android/exoplayer2/MediaItem$c;->e:J

    .line 4
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/exoplayer2/MediaItem$c;->o:Ljava/util/List;

    .line 5
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/exoplayer2/MediaItem$c;->j:Ljava/util/Map;

    .line 6
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/exoplayer2/MediaItem$c;->q:Ljava/util/List;

    .line 7
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/exoplayer2/MediaItem$c;->s:Ljava/util/List;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    iput-wide v0, p0, Lcom/google/android/exoplayer2/MediaItem$c;->x:J

    .line 9
    iput-wide v0, p0, Lcom/google/android/exoplayer2/MediaItem$c;->y:J

    .line 10
    iput-wide v0, p0, Lcom/google/android/exoplayer2/MediaItem$c;->z:J

    const v0, -0x800001

    .line 11
    iput v0, p0, Lcom/google/android/exoplayer2/MediaItem$c;->A:F

    .line 12
    iput v0, p0, Lcom/google/android/exoplayer2/MediaItem$c;->B:F

    return-void
.end method

.method private constructor <init>(Lcom/google/android/exoplayer2/MediaItem;)V
    .locals 3

    .line 13
    invoke-direct {p0}, Lcom/google/android/exoplayer2/MediaItem$c;-><init>()V

    .line 14
    iget-object v0, p1, Lcom/google/android/exoplayer2/MediaItem;->e:Lcom/google/android/exoplayer2/MediaItem$d;

    iget-wide v1, v0, Lcom/google/android/exoplayer2/MediaItem$d;->b:J

    iput-wide v1, p0, Lcom/google/android/exoplayer2/MediaItem$c;->e:J

    .line 15
    iget-boolean v1, v0, Lcom/google/android/exoplayer2/MediaItem$d;->c:Z

    iput-boolean v1, p0, Lcom/google/android/exoplayer2/MediaItem$c;->f:Z

    .line 16
    iget-boolean v1, v0, Lcom/google/android/exoplayer2/MediaItem$d;->d:Z

    iput-boolean v1, p0, Lcom/google/android/exoplayer2/MediaItem$c;->g:Z

    .line 17
    iget-wide v1, v0, Lcom/google/android/exoplayer2/MediaItem$d;->a:J

    iput-wide v1, p0, Lcom/google/android/exoplayer2/MediaItem$c;->d:J

    .line 18
    iget-boolean v0, v0, Lcom/google/android/exoplayer2/MediaItem$d;->e:Z

    iput-boolean v0, p0, Lcom/google/android/exoplayer2/MediaItem$c;->h:Z

    .line 19
    iget-object v0, p1, Lcom/google/android/exoplayer2/MediaItem;->a:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/exoplayer2/MediaItem$c;->a:Ljava/lang/String;

    .line 20
    iget-object v0, p1, Lcom/google/android/exoplayer2/MediaItem;->d:Lcom/google/android/exoplayer2/i0;

    iput-object v0, p0, Lcom/google/android/exoplayer2/MediaItem$c;->w:Lcom/google/android/exoplayer2/i0;

    .line 21
    iget-object v0, p1, Lcom/google/android/exoplayer2/MediaItem;->c:Lcom/google/android/exoplayer2/MediaItem$f;

    iget-wide v1, v0, Lcom/google/android/exoplayer2/MediaItem$f;->a:J

    iput-wide v1, p0, Lcom/google/android/exoplayer2/MediaItem$c;->x:J

    .line 22
    iget-wide v1, v0, Lcom/google/android/exoplayer2/MediaItem$f;->b:J

    iput-wide v1, p0, Lcom/google/android/exoplayer2/MediaItem$c;->y:J

    .line 23
    iget-wide v1, v0, Lcom/google/android/exoplayer2/MediaItem$f;->c:J

    iput-wide v1, p0, Lcom/google/android/exoplayer2/MediaItem$c;->z:J

    .line 24
    iget v1, v0, Lcom/google/android/exoplayer2/MediaItem$f;->d:F

    iput v1, p0, Lcom/google/android/exoplayer2/MediaItem$c;->A:F

    .line 25
    iget v0, v0, Lcom/google/android/exoplayer2/MediaItem$f;->e:F

    iput v0, p0, Lcom/google/android/exoplayer2/MediaItem$c;->B:F

    .line 26
    iget-object p1, p1, Lcom/google/android/exoplayer2/MediaItem;->b:Lcom/google/android/exoplayer2/MediaItem$g;

    if-eqz p1, :cond_1

    .line 27
    iget-object v0, p1, Lcom/google/android/exoplayer2/MediaItem$g;->f:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/exoplayer2/MediaItem$c;->r:Ljava/lang/String;

    .line 28
    iget-object v0, p1, Lcom/google/android/exoplayer2/MediaItem$g;->b:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/exoplayer2/MediaItem$c;->c:Ljava/lang/String;

    .line 29
    iget-object v0, p1, Lcom/google/android/exoplayer2/MediaItem$g;->a:Landroid/net/Uri;

    iput-object v0, p0, Lcom/google/android/exoplayer2/MediaItem$c;->b:Landroid/net/Uri;

    .line 30
    iget-object v0, p1, Lcom/google/android/exoplayer2/MediaItem$g;->e:Ljava/util/List;

    iput-object v0, p0, Lcom/google/android/exoplayer2/MediaItem$c;->q:Ljava/util/List;

    .line 31
    iget-object v0, p1, Lcom/google/android/exoplayer2/MediaItem$g;->g:Ljava/util/List;

    iput-object v0, p0, Lcom/google/android/exoplayer2/MediaItem$c;->s:Ljava/util/List;

    .line 32
    iget-object v0, p1, Lcom/google/android/exoplayer2/MediaItem$g;->h:Ljava/lang/Object;

    iput-object v0, p0, Lcom/google/android/exoplayer2/MediaItem$c;->v:Ljava/lang/Object;

    .line 33
    iget-object v0, p1, Lcom/google/android/exoplayer2/MediaItem$g;->c:Lcom/google/android/exoplayer2/MediaItem$e;

    if-eqz v0, :cond_0

    .line 34
    iget-object v1, v0, Lcom/google/android/exoplayer2/MediaItem$e;->b:Landroid/net/Uri;

    iput-object v1, p0, Lcom/google/android/exoplayer2/MediaItem$c;->i:Landroid/net/Uri;

    .line 35
    iget-object v1, v0, Lcom/google/android/exoplayer2/MediaItem$e;->c:Ljava/util/Map;

    iput-object v1, p0, Lcom/google/android/exoplayer2/MediaItem$c;->j:Ljava/util/Map;

    .line 36
    iget-boolean v1, v0, Lcom/google/android/exoplayer2/MediaItem$e;->d:Z

    iput-boolean v1, p0, Lcom/google/android/exoplayer2/MediaItem$c;->l:Z

    .line 37
    iget-boolean v1, v0, Lcom/google/android/exoplayer2/MediaItem$e;->f:Z

    iput-boolean v1, p0, Lcom/google/android/exoplayer2/MediaItem$c;->n:Z

    .line 38
    iget-boolean v1, v0, Lcom/google/android/exoplayer2/MediaItem$e;->e:Z

    iput-boolean v1, p0, Lcom/google/android/exoplayer2/MediaItem$c;->m:Z

    .line 39
    iget-object v1, v0, Lcom/google/android/exoplayer2/MediaItem$e;->g:Ljava/util/List;

    iput-object v1, p0, Lcom/google/android/exoplayer2/MediaItem$c;->o:Ljava/util/List;

    .line 40
    iget-object v1, v0, Lcom/google/android/exoplayer2/MediaItem$e;->a:Ljava/util/UUID;

    iput-object v1, p0, Lcom/google/android/exoplayer2/MediaItem$c;->k:Ljava/util/UUID;

    .line 41
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/MediaItem$e;->a()[B

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/exoplayer2/MediaItem$c;->p:[B

    .line 42
    :cond_0
    iget-object p1, p1, Lcom/google/android/exoplayer2/MediaItem$g;->d:Lcom/google/android/exoplayer2/MediaItem$b;

    if-eqz p1, :cond_1

    .line 43
    iget-object v0, p1, Lcom/google/android/exoplayer2/MediaItem$b;->a:Landroid/net/Uri;

    iput-object v0, p0, Lcom/google/android/exoplayer2/MediaItem$c;->t:Landroid/net/Uri;

    .line 44
    iget-object p1, p1, Lcom/google/android/exoplayer2/MediaItem$b;->b:Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/exoplayer2/MediaItem$c;->u:Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/exoplayer2/MediaItem;Lcom/google/android/exoplayer2/MediaItem$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/MediaItem$c;-><init>(Lcom/google/android/exoplayer2/MediaItem;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/exoplayer2/MediaItem;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/google/android/exoplayer2/MediaItem$c;->i:Landroid/net/Uri;

    .line 4
    .line 5
    if-eqz v1, :cond_1

    .line 6
    .line 7
    iget-object v1, v0, Lcom/google/android/exoplayer2/MediaItem$c;->k:Ljava/util/UUID;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    goto :goto_1

    .line 14
    :cond_1
    :goto_0
    const/4 v1, 0x1

    .line 15
    :goto_1
    invoke-static {v1}, Lg9/a;->f(Z)V

    .line 16
    .line 17
    .line 18
    iget-object v1, v0, Lcom/google/android/exoplayer2/MediaItem$c;->b:Landroid/net/Uri;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    if-eqz v1, :cond_5

    .line 22
    .line 23
    new-instance v12, Lcom/google/android/exoplayer2/MediaItem$g;

    .line 24
    .line 25
    iget-object v4, v0, Lcom/google/android/exoplayer2/MediaItem$c;->c:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v14, v0, Lcom/google/android/exoplayer2/MediaItem$c;->k:Ljava/util/UUID;

    .line 28
    .line 29
    if-eqz v14, :cond_2

    .line 30
    .line 31
    new-instance v3, Lcom/google/android/exoplayer2/MediaItem$e;

    .line 32
    .line 33
    iget-object v15, v0, Lcom/google/android/exoplayer2/MediaItem$c;->i:Landroid/net/Uri;

    .line 34
    .line 35
    iget-object v5, v0, Lcom/google/android/exoplayer2/MediaItem$c;->j:Ljava/util/Map;

    .line 36
    .line 37
    iget-boolean v6, v0, Lcom/google/android/exoplayer2/MediaItem$c;->l:Z

    .line 38
    .line 39
    iget-boolean v7, v0, Lcom/google/android/exoplayer2/MediaItem$c;->n:Z

    .line 40
    .line 41
    iget-boolean v8, v0, Lcom/google/android/exoplayer2/MediaItem$c;->m:Z

    .line 42
    .line 43
    iget-object v9, v0, Lcom/google/android/exoplayer2/MediaItem$c;->o:Ljava/util/List;

    .line 44
    .line 45
    iget-object v10, v0, Lcom/google/android/exoplayer2/MediaItem$c;->p:[B

    .line 46
    .line 47
    const/16 v22, 0x0

    .line 48
    .line 49
    move-object v13, v3

    .line 50
    move-object/from16 v16, v5

    .line 51
    .line 52
    move/from16 v17, v6

    .line 53
    .line 54
    move/from16 v18, v7

    .line 55
    .line 56
    move/from16 v19, v8

    .line 57
    .line 58
    move-object/from16 v20, v9

    .line 59
    .line 60
    move-object/from16 v21, v10

    .line 61
    .line 62
    invoke-direct/range {v13 .. v22}, Lcom/google/android/exoplayer2/MediaItem$e;-><init>(Ljava/util/UUID;Landroid/net/Uri;Ljava/util/Map;ZZZLjava/util/List;[BLcom/google/android/exoplayer2/MediaItem$a;)V

    .line 63
    .line 64
    .line 65
    move-object v5, v3

    .line 66
    goto :goto_2

    .line 67
    :cond_2
    move-object v5, v2

    .line 68
    :goto_2
    iget-object v3, v0, Lcom/google/android/exoplayer2/MediaItem$c;->t:Landroid/net/Uri;

    .line 69
    .line 70
    if-eqz v3, :cond_3

    .line 71
    .line 72
    new-instance v6, Lcom/google/android/exoplayer2/MediaItem$b;

    .line 73
    .line 74
    iget-object v7, v0, Lcom/google/android/exoplayer2/MediaItem$c;->u:Ljava/lang/Object;

    .line 75
    .line 76
    invoke-direct {v6, v3, v7, v2}, Lcom/google/android/exoplayer2/MediaItem$b;-><init>(Landroid/net/Uri;Ljava/lang/Object;Lcom/google/android/exoplayer2/MediaItem$a;)V

    .line 77
    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_3
    move-object v6, v2

    .line 81
    :goto_3
    iget-object v7, v0, Lcom/google/android/exoplayer2/MediaItem$c;->q:Ljava/util/List;

    .line 82
    .line 83
    iget-object v8, v0, Lcom/google/android/exoplayer2/MediaItem$c;->r:Ljava/lang/String;

    .line 84
    .line 85
    iget-object v9, v0, Lcom/google/android/exoplayer2/MediaItem$c;->s:Ljava/util/List;

    .line 86
    .line 87
    iget-object v10, v0, Lcom/google/android/exoplayer2/MediaItem$c;->v:Ljava/lang/Object;

    .line 88
    .line 89
    const/4 v11, 0x0

    .line 90
    move-object v2, v12

    .line 91
    move-object v3, v1

    .line 92
    invoke-direct/range {v2 .. v11}, Lcom/google/android/exoplayer2/MediaItem$g;-><init>(Landroid/net/Uri;Ljava/lang/String;Lcom/google/android/exoplayer2/MediaItem$e;Lcom/google/android/exoplayer2/MediaItem$b;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/Object;Lcom/google/android/exoplayer2/MediaItem$a;)V

    .line 93
    .line 94
    .line 95
    iget-object v2, v0, Lcom/google/android/exoplayer2/MediaItem$c;->a:Ljava/lang/String;

    .line 96
    .line 97
    if-eqz v2, :cond_4

    .line 98
    .line 99
    goto :goto_4

    .line 100
    :cond_4
    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    :goto_4
    iput-object v2, v0, Lcom/google/android/exoplayer2/MediaItem$c;->a:Ljava/lang/String;

    .line 105
    .line 106
    move-object v6, v12

    .line 107
    goto :goto_5

    .line 108
    :cond_5
    move-object v6, v2

    .line 109
    :goto_5
    new-instance v1, Lcom/google/android/exoplayer2/MediaItem;

    .line 110
    .line 111
    iget-object v2, v0, Lcom/google/android/exoplayer2/MediaItem$c;->a:Ljava/lang/String;

    .line 112
    .line 113
    invoke-static {v2}, Lg9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    move-object v4, v2

    .line 118
    check-cast v4, Ljava/lang/String;

    .line 119
    .line 120
    new-instance v5, Lcom/google/android/exoplayer2/MediaItem$d;

    .line 121
    .line 122
    iget-wide v8, v0, Lcom/google/android/exoplayer2/MediaItem$c;->d:J

    .line 123
    .line 124
    iget-wide v10, v0, Lcom/google/android/exoplayer2/MediaItem$c;->e:J

    .line 125
    .line 126
    iget-boolean v12, v0, Lcom/google/android/exoplayer2/MediaItem$c;->f:Z

    .line 127
    .line 128
    iget-boolean v13, v0, Lcom/google/android/exoplayer2/MediaItem$c;->g:Z

    .line 129
    .line 130
    iget-boolean v14, v0, Lcom/google/android/exoplayer2/MediaItem$c;->h:Z

    .line 131
    .line 132
    const/4 v15, 0x0

    .line 133
    move-object v7, v5

    .line 134
    invoke-direct/range {v7 .. v15}, Lcom/google/android/exoplayer2/MediaItem$d;-><init>(JJZZZLcom/google/android/exoplayer2/MediaItem$a;)V

    .line 135
    .line 136
    .line 137
    new-instance v7, Lcom/google/android/exoplayer2/MediaItem$f;

    .line 138
    .line 139
    iget-wide v2, v0, Lcom/google/android/exoplayer2/MediaItem$c;->x:J

    .line 140
    .line 141
    iget-wide v8, v0, Lcom/google/android/exoplayer2/MediaItem$c;->y:J

    .line 142
    .line 143
    iget-wide v10, v0, Lcom/google/android/exoplayer2/MediaItem$c;->z:J

    .line 144
    .line 145
    iget v12, v0, Lcom/google/android/exoplayer2/MediaItem$c;->A:F

    .line 146
    .line 147
    iget v13, v0, Lcom/google/android/exoplayer2/MediaItem$c;->B:F

    .line 148
    .line 149
    move-object/from16 v16, v7

    .line 150
    .line 151
    move-wide/from16 v17, v2

    .line 152
    .line 153
    move-wide/from16 v19, v8

    .line 154
    .line 155
    move-wide/from16 v21, v10

    .line 156
    .line 157
    move/from16 v23, v12

    .line 158
    .line 159
    move/from16 v24, v13

    .line 160
    .line 161
    invoke-direct/range {v16 .. v24}, Lcom/google/android/exoplayer2/MediaItem$f;-><init>(JJJFF)V

    .line 162
    .line 163
    .line 164
    iget-object v2, v0, Lcom/google/android/exoplayer2/MediaItem$c;->w:Lcom/google/android/exoplayer2/i0;

    .line 165
    .line 166
    if-eqz v2, :cond_6

    .line 167
    .line 168
    goto :goto_6

    .line 169
    :cond_6
    new-instance v2, Lcom/google/android/exoplayer2/i0$b;

    .line 170
    .line 171
    invoke-direct {v2}, Lcom/google/android/exoplayer2/i0$b;-><init>()V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v2}, Lcom/google/android/exoplayer2/i0$b;->a()Lcom/google/android/exoplayer2/i0;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    :goto_6
    move-object v8, v2

    .line 179
    const/4 v9, 0x0

    .line 180
    move-object v3, v1

    .line 181
    invoke-direct/range {v3 .. v9}, Lcom/google/android/exoplayer2/MediaItem;-><init>(Ljava/lang/String;Lcom/google/android/exoplayer2/MediaItem$d;Lcom/google/android/exoplayer2/MediaItem$g;Lcom/google/android/exoplayer2/MediaItem$f;Lcom/google/android/exoplayer2/i0;Lcom/google/android/exoplayer2/MediaItem$a;)V

    .line 182
    .line 183
    .line 184
    return-object v1
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
.end method

.method public b(Ljava/lang/String;)Lcom/google/android/exoplayer2/MediaItem$c;
    .locals 0

    iput-object p1, p0, Lcom/google/android/exoplayer2/MediaItem$c;->r:Ljava/lang/String;

    return-object p0
.end method

.method public c(J)Lcom/google/android/exoplayer2/MediaItem$c;
    .locals 0

    iput-wide p1, p0, Lcom/google/android/exoplayer2/MediaItem$c;->x:J

    return-object p0
.end method

.method public d(Ljava/lang/String;)Lcom/google/android/exoplayer2/MediaItem$c;
    .locals 0

    iput-object p1, p0, Lcom/google/android/exoplayer2/MediaItem$c;->a:Ljava/lang/String;

    return-object p0
.end method

.method public e(Ljava/lang/String;)Lcom/google/android/exoplayer2/MediaItem$c;
    .locals 0

    iput-object p1, p0, Lcom/google/android/exoplayer2/MediaItem$c;->c:Ljava/lang/String;

    return-object p0
.end method

.method public f(Ljava/util/List;)Lcom/google/android/exoplayer2/MediaItem$c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lh8/c;",
            ">;)",
            "Lcom/google/android/exoplayer2/MediaItem$c;"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    :goto_0
    iput-object p1, p0, Lcom/google/android/exoplayer2/MediaItem$c;->q:Ljava/util/List;

    .line 24
    .line 25
    return-object p0
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

.method public g(Ljava/util/List;)Lcom/google/android/exoplayer2/MediaItem$c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/android/exoplayer2/MediaItem$h;",
            ">;)",
            "Lcom/google/android/exoplayer2/MediaItem$c;"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    :goto_0
    iput-object p1, p0, Lcom/google/android/exoplayer2/MediaItem$c;->s:Ljava/util/List;

    .line 24
    .line 25
    return-object p0
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

.method public h(Ljava/lang/Object;)Lcom/google/android/exoplayer2/MediaItem$c;
    .locals 0

    iput-object p1, p0, Lcom/google/android/exoplayer2/MediaItem$c;->v:Ljava/lang/Object;

    return-object p0
.end method

.method public i(Landroid/net/Uri;)Lcom/google/android/exoplayer2/MediaItem$c;
    .locals 0

    iput-object p1, p0, Lcom/google/android/exoplayer2/MediaItem$c;->b:Landroid/net/Uri;

    return-object p0
.end method

.method public j(Ljava/lang/String;)Lcom/google/android/exoplayer2/MediaItem$c;
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    :goto_0
    invoke-virtual {p0, p1}, Lcom/google/android/exoplayer2/MediaItem$c;->i(Landroid/net/Uri;)Lcom/google/android/exoplayer2/MediaItem$c;

    move-result-object p1

    return-object p1
.end method
