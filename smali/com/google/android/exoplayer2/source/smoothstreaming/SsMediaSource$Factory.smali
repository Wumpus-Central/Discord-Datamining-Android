.class public final Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh8/c0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Factory"
.end annotation


# instance fields
.field private final a:Lcom/google/android/exoplayer2/source/smoothstreaming/b$a;

.field private final b:Lcom/google/android/exoplayer2/upstream/DataSource$Factory;

.field private c:Lh8/h;

.field private d:Z

.field private e:Lj7/y;

.field private f:Lcom/google/android/exoplayer2/upstream/g;

.field private g:J

.field private h:Lcom/google/android/exoplayer2/upstream/i$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/exoplayer2/upstream/i$a<",
            "+",
            "Lp8/a;",
            ">;"
        }
    .end annotation
.end field

.field private i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lg8/c;",
            ">;"
        }
    .end annotation
.end field

.field private j:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/android/exoplayer2/source/smoothstreaming/b$a;Lcom/google/android/exoplayer2/upstream/DataSource$Factory;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/exoplayer2/source/smoothstreaming/b$a;

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;->a:Lcom/google/android/exoplayer2/source/smoothstreaming/b$a;

    .line 4
    iput-object p2, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;->b:Lcom/google/android/exoplayer2/upstream/DataSource$Factory;

    .line 5
    new-instance p1, Lj7/k;

    invoke-direct {p1}, Lj7/k;-><init>()V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;->e:Lj7/y;

    .line 6
    new-instance p1, Lcom/google/android/exoplayer2/upstream/d;

    invoke-direct {p1}, Lcom/google/android/exoplayer2/upstream/d;-><init>()V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;->f:Lcom/google/android/exoplayer2/upstream/g;

    const-wide/16 p1, 0x7530

    .line 7
    iput-wide p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;->g:J

    .line 8
    new-instance p1, Lh8/i;

    invoke-direct {p1}, Lh8/i;-><init>()V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;->c:Lh8/h;

    .line 9
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;->i:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/exoplayer2/upstream/DataSource$Factory;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/exoplayer2/source/smoothstreaming/a$a;

    invoke-direct {v0, p1}, Lcom/google/android/exoplayer2/source/smoothstreaming/a$a;-><init>(Lcom/google/android/exoplayer2/upstream/DataSource$Factory;)V

    invoke-direct {p0, v0, p1}, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;-><init>(Lcom/google/android/exoplayer2/source/smoothstreaming/b$a;Lcom/google/android/exoplayer2/upstream/DataSource$Factory;)V

    return-void
.end method

.method public static synthetic a(Lj7/x;Lcom/google/android/exoplayer2/MediaItem;)Lj7/x;
    .locals 0

    invoke-static {p0, p1}, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;->d(Lj7/x;Lcom/google/android/exoplayer2/MediaItem;)Lj7/x;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic d(Lj7/x;Lcom/google/android/exoplayer2/MediaItem;)Lj7/x;
    .locals 0

    return-object p0
.end method


# virtual methods
.method public b(Landroid/net/Uri;)Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Lcom/google/android/exoplayer2/MediaItem$c;

    invoke-direct {v0}, Lcom/google/android/exoplayer2/MediaItem$c;-><init>()V

    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/MediaItem$c;->i(Landroid/net/Uri;)Lcom/google/android/exoplayer2/MediaItem$c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/exoplayer2/MediaItem$c;->a()Lcom/google/android/exoplayer2/MediaItem;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;->c(Lcom/google/android/exoplayer2/MediaItem;)Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;

    move-result-object p1

    return-object p1
.end method

.method public c(Lcom/google/android/exoplayer2/MediaItem;)Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v1, Lcom/google/android/exoplayer2/MediaItem;->b:Lcom/google/android/exoplayer2/MediaItem$g;

    .line 6
    .line 7
    invoke-static {v2}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    iget-object v2, v0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;->h:Lcom/google/android/exoplayer2/upstream/i$a;

    .line 11
    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    new-instance v2, Lp8/b;

    .line 15
    .line 16
    invoke-direct {v2}, Lp8/b;-><init>()V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v3, v1, Lcom/google/android/exoplayer2/MediaItem;->b:Lcom/google/android/exoplayer2/MediaItem$g;

    .line 20
    .line 21
    iget-object v3, v3, Lcom/google/android/exoplayer2/MediaItem$g;->e:Ljava/util/List;

    .line 22
    .line 23
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-nez v3, :cond_1

    .line 28
    .line 29
    iget-object v3, v1, Lcom/google/android/exoplayer2/MediaItem;->b:Lcom/google/android/exoplayer2/MediaItem$g;

    .line 30
    .line 31
    iget-object v3, v3, Lcom/google/android/exoplayer2/MediaItem$g;->e:Ljava/util/List;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    iget-object v3, v0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;->i:Ljava/util/List;

    .line 35
    .line 36
    :goto_0
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-nez v4, :cond_2

    .line 41
    .line 42
    new-instance v4, Lg8/b;

    .line 43
    .line 44
    invoke-direct {v4, v2, v3}, Lg8/b;-><init>(Lcom/google/android/exoplayer2/upstream/i$a;Ljava/util/List;)V

    .line 45
    .line 46
    .line 47
    move-object v9, v4

    .line 48
    goto :goto_1

    .line 49
    :cond_2
    move-object v9, v2

    .line 50
    :goto_1
    iget-object v2, v1, Lcom/google/android/exoplayer2/MediaItem;->b:Lcom/google/android/exoplayer2/MediaItem$g;

    .line 51
    .line 52
    iget-object v4, v2, Lcom/google/android/exoplayer2/MediaItem$g;->h:Ljava/lang/Object;

    .line 53
    .line 54
    const/4 v5, 0x1

    .line 55
    const/4 v6, 0x0

    .line 56
    if-nez v4, :cond_3

    .line 57
    .line 58
    iget-object v4, v0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;->j:Ljava/lang/Object;

    .line 59
    .line 60
    if-eqz v4, :cond_3

    .line 61
    .line 62
    move v4, v5

    .line 63
    goto :goto_2

    .line 64
    :cond_3
    move v4, v6

    .line 65
    :goto_2
    iget-object v2, v2, Lcom/google/android/exoplayer2/MediaItem$g;->e:Ljava/util/List;

    .line 66
    .line 67
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-eqz v2, :cond_4

    .line 72
    .line 73
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-nez v2, :cond_4

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_4
    move v5, v6

    .line 81
    :goto_3
    if-eqz v4, :cond_5

    .line 82
    .line 83
    if-eqz v5, :cond_5

    .line 84
    .line 85
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/exoplayer2/MediaItem;->a()Lcom/google/android/exoplayer2/MediaItem$c;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    iget-object v2, v0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;->j:Ljava/lang/Object;

    .line 90
    .line 91
    invoke-virtual {v1, v2}, Lcom/google/android/exoplayer2/MediaItem$c;->h(Ljava/lang/Object;)Lcom/google/android/exoplayer2/MediaItem$c;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-virtual {v1, v3}, Lcom/google/android/exoplayer2/MediaItem$c;->f(Ljava/util/List;)Lcom/google/android/exoplayer2/MediaItem$c;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-virtual {v1}, Lcom/google/android/exoplayer2/MediaItem$c;->a()Lcom/google/android/exoplayer2/MediaItem;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    goto :goto_4

    .line 104
    :cond_5
    if-eqz v4, :cond_6

    .line 105
    .line 106
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/exoplayer2/MediaItem;->a()Lcom/google/android/exoplayer2/MediaItem$c;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    iget-object v2, v0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;->j:Ljava/lang/Object;

    .line 111
    .line 112
    invoke-virtual {v1, v2}, Lcom/google/android/exoplayer2/MediaItem$c;->h(Ljava/lang/Object;)Lcom/google/android/exoplayer2/MediaItem$c;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-virtual {v1}, Lcom/google/android/exoplayer2/MediaItem$c;->a()Lcom/google/android/exoplayer2/MediaItem;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    goto :goto_4

    .line 121
    :cond_6
    if-eqz v5, :cond_7

    .line 122
    .line 123
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/exoplayer2/MediaItem;->a()Lcom/google/android/exoplayer2/MediaItem$c;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-virtual {v1, v3}, Lcom/google/android/exoplayer2/MediaItem$c;->f(Ljava/util/List;)Lcom/google/android/exoplayer2/MediaItem$c;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    invoke-virtual {v1}, Lcom/google/android/exoplayer2/MediaItem$c;->a()Lcom/google/android/exoplayer2/MediaItem;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    :cond_7
    :goto_4
    move-object v6, v1

    .line 136
    new-instance v1, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;

    .line 137
    .line 138
    const/4 v7, 0x0

    .line 139
    iget-object v8, v0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;->b:Lcom/google/android/exoplayer2/upstream/DataSource$Factory;

    .line 140
    .line 141
    iget-object v10, v0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;->a:Lcom/google/android/exoplayer2/source/smoothstreaming/b$a;

    .line 142
    .line 143
    iget-object v11, v0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;->c:Lh8/h;

    .line 144
    .line 145
    iget-object v2, v0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;->e:Lj7/y;

    .line 146
    .line 147
    invoke-interface {v2, v6}, Lj7/y;->a(Lcom/google/android/exoplayer2/MediaItem;)Lj7/x;

    .line 148
    .line 149
    .line 150
    move-result-object v12

    .line 151
    iget-object v13, v0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;->f:Lcom/google/android/exoplayer2/upstream/g;

    .line 152
    .line 153
    iget-wide v14, v0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;->g:J

    .line 154
    .line 155
    const/16 v16, 0x0

    .line 156
    .line 157
    move-object v5, v1

    .line 158
    invoke-direct/range {v5 .. v16}, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;-><init>(Lcom/google/android/exoplayer2/MediaItem;Lp8/a;Lcom/google/android/exoplayer2/upstream/DataSource$Factory;Lcom/google/android/exoplayer2/upstream/i$a;Lcom/google/android/exoplayer2/source/smoothstreaming/b$a;Lh8/h;Lj7/x;Lcom/google/android/exoplayer2/upstream/g;JLcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$a;)V

    .line 159
    .line 160
    .line 161
    return-object v1
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

.method public e(Lj7/x;)Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-virtual {p0, p1}, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;->f(Lj7/y;)Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;

    .line 5
    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance v0, Lo8/b;

    .line 9
    .line 10
    invoke-direct {v0, p1}, Lo8/b;-><init>(Lj7/x;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;->f(Lj7/y;)Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;

    .line 14
    .line 15
    .line 16
    :goto_0
    return-object p0
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
.end method

.method public f(Lj7/y;)Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;->e:Lj7/y;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    iput-boolean p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;->d:Z

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    new-instance p1, Lj7/k;

    .line 10
    .line 11
    invoke-direct {p1}, Lj7/k;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;->e:Lj7/y;

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    iput-boolean p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;->d:Z

    .line 18
    .line 19
    :goto_0
    return-object p0
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
.end method

.method public g(Lcom/google/android/exoplayer2/upstream/g;)Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;
    .locals 0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/google/android/exoplayer2/upstream/d;

    invoke-direct {p1}, Lcom/google/android/exoplayer2/upstream/d;-><init>()V

    :goto_0
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;->f:Lcom/google/android/exoplayer2/upstream/g;

    return-object p0
.end method
