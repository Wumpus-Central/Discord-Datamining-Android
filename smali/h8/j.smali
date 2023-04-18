.class public final Lh8/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh8/c0;


# instance fields
.field private final a:Lcom/google/android/exoplayer2/upstream/DataSource$Factory;

.field private final b:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lh8/c0;",
            ">;"
        }
    .end annotation
.end field

.field private final c:[I

.field private d:J

.field private e:J

.field private f:J

.field private g:F

.field private h:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Ll7/o;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/exoplayer2/upstream/c;

    invoke-direct {v0, p1}, Lcom/google/android/exoplayer2/upstream/c;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, v0, p2}, Lh8/j;-><init>(Lcom/google/android/exoplayer2/upstream/DataSource$Factory;Ll7/o;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/exoplayer2/upstream/DataSource$Factory;Ll7/o;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lh8/j;->a:Lcom/google/android/exoplayer2/upstream/DataSource$Factory;

    .line 4
    invoke-static {p1, p2}, Lh8/j;->a(Lcom/google/android/exoplayer2/upstream/DataSource$Factory;Ll7/o;)Landroid/util/SparseArray;

    move-result-object p1

    iput-object p1, p0, Lh8/j;->b:Landroid/util/SparseArray;

    .line 5
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result p1

    new-array p1, p1, [I

    iput-object p1, p0, Lh8/j;->c:[I

    const/4 p1, 0x0

    .line 6
    :goto_0
    iget-object p2, p0, Lh8/j;->b:Landroid/util/SparseArray;

    invoke-virtual {p2}, Landroid/util/SparseArray;->size()I

    move-result p2

    if-ge p1, p2, :cond_0

    .line 7
    iget-object p2, p0, Lh8/j;->c:[I

    iget-object v0, p0, Lh8/j;->b:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v0

    aput v0, p2, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    iput-wide p1, p0, Lh8/j;->d:J

    .line 9
    iput-wide p1, p0, Lh8/j;->e:J

    .line 10
    iput-wide p1, p0, Lh8/j;->f:J

    const p1, -0x800001

    .line 11
    iput p1, p0, Lh8/j;->g:F

    .line 12
    iput p1, p0, Lh8/j;->h:F

    return-void
.end method

.method private static a(Lcom/google/android/exoplayer2/upstream/DataSource$Factory;Ll7/o;)Landroid/util/SparseArray;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/exoplayer2/upstream/DataSource$Factory;",
            "Ll7/o;",
            ")",
            "Landroid/util/SparseArray<",
            "Lh8/c0;",
            ">;"
        }
    .end annotation

    .line 1
    const-class v0, Lcom/google/android/exoplayer2/upstream/DataSource$Factory;

    .line 2
    .line 3
    const-class v1, Lh8/c0;

    .line 4
    .line 5
    new-instance v2, Landroid/util/SparseArray;

    .line 6
    .line 7
    invoke-direct {v2}, Landroid/util/SparseArray;-><init>()V

    .line 8
    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    const/4 v4, 0x0

    .line 12
    :try_start_0
    const-class v5, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$Factory;

    .line 13
    .line 14
    invoke-virtual {v5, v1}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v5

    .line 18
    new-array v6, v3, [Ljava/lang/Class;

    .line 19
    .line 20
    aput-object v0, v6, v4

    .line 21
    .line 22
    invoke-virtual {v5, v6}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    new-array v6, v3, [Ljava/lang/Object;

    .line 27
    .line 28
    aput-object p0, v6, v4

    .line 29
    .line 30
    invoke-virtual {v5, v6}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    check-cast v5, Lh8/c0;

    .line 35
    .line 36
    invoke-virtual {v2, v4, v5}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    .line 38
    .line 39
    :catch_0
    :try_start_1
    const-class v5, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;

    .line 40
    .line 41
    invoke-virtual {v5, v1}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    new-array v6, v3, [Ljava/lang/Class;

    .line 46
    .line 47
    aput-object v0, v6, v4

    .line 48
    .line 49
    invoke-virtual {v5, v6}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    new-array v6, v3, [Ljava/lang/Object;

    .line 54
    .line 55
    aput-object p0, v6, v4

    .line 56
    .line 57
    invoke-virtual {v5, v6}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    check-cast v5, Lh8/c0;

    .line 62
    .line 63
    invoke-virtual {v2, v3, v5}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 64
    .line 65
    .line 66
    :catch_1
    :try_start_2
    const-class v5, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;

    .line 67
    .line 68
    invoke-virtual {v5, v1}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    new-array v5, v3, [Ljava/lang/Class;

    .line 73
    .line 74
    aput-object v0, v5, v4

    .line 75
    .line 76
    invoke-virtual {v1, v5}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    new-array v1, v3, [Ljava/lang/Object;

    .line 81
    .line 82
    aput-object p0, v1, v4

    .line 83
    .line 84
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    check-cast v0, Lh8/c0;

    .line 89
    .line 90
    const/4 v1, 0x2

    .line 91
    invoke-virtual {v2, v1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 92
    .line 93
    .line 94
    :catch_2
    new-instance v0, Lh8/k0$b;

    .line 95
    .line 96
    invoke-direct {v0, p0, p1}, Lh8/k0$b;-><init>(Lcom/google/android/exoplayer2/upstream/DataSource$Factory;Ll7/o;)V

    .line 97
    .line 98
    .line 99
    const/4 p0, 0x3

    .line 100
    invoke-virtual {v2, p0, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    return-object v2
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
.end method
