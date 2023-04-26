.class public Lcom/facebook/cache/disk/DiskCacheConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/cache/disk/DiskCacheConfig$b;
    }
.end annotation


# instance fields
.field private final a:I

.field private final b:Ljava/lang/String;

.field private final c:Lcom/facebook/common/internal/Supplier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/common/internal/Supplier<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation
.end field

.field private final d:J

.field private final e:J

.field private final f:J

.field private final g:Lq3/g;

.field private final h:Lp3/a;

.field private final i:Lp3/c;

.field private final j:Ls3/b;

.field private final k:Landroid/content/Context;

.field private final l:Z


# direct methods
.method protected constructor <init>(Lcom/facebook/cache/disk/DiskCacheConfig$b;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lcom/facebook/cache/disk/DiskCacheConfig$b;->a(Lcom/facebook/cache/disk/DiskCacheConfig$b;)Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lcom/facebook/cache/disk/DiskCacheConfig;->k:Landroid/content/Context;

    .line 9
    .line 10
    invoke-static {p1}, Lcom/facebook/cache/disk/DiskCacheConfig$b;->b(Lcom/facebook/cache/disk/DiskCacheConfig$b;)Lcom/facebook/common/internal/Supplier;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v1, 0x0

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    :goto_0
    const/4 v1, 0x1

    .line 22
    :goto_1
    const-string v2, "Either a non-null context or a base directory path or supplier must be provided."

    .line 23
    .line 24
    invoke-static {v1, v2}, Lv3/j;->j(ZLjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-static {p1}, Lcom/facebook/cache/disk/DiskCacheConfig$b;->b(Lcom/facebook/cache/disk/DiskCacheConfig$b;)Lcom/facebook/common/internal/Supplier;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    if-nez v1, :cond_2

    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    new-instance v0, Lcom/facebook/cache/disk/DiskCacheConfig$a;

    .line 36
    .line 37
    invoke-direct {v0, p0}, Lcom/facebook/cache/disk/DiskCacheConfig$a;-><init>(Lcom/facebook/cache/disk/DiskCacheConfig;)V

    .line 38
    .line 39
    .line 40
    invoke-static {p1, v0}, Lcom/facebook/cache/disk/DiskCacheConfig$b;->d(Lcom/facebook/cache/disk/DiskCacheConfig$b;Lcom/facebook/common/internal/Supplier;)Lcom/facebook/common/internal/Supplier;

    .line 41
    .line 42
    .line 43
    :cond_2
    invoke-static {p1}, Lcom/facebook/cache/disk/DiskCacheConfig$b;->g(Lcom/facebook/cache/disk/DiskCacheConfig$b;)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    iput v0, p0, Lcom/facebook/cache/disk/DiskCacheConfig;->a:I

    .line 48
    .line 49
    invoke-static {p1}, Lcom/facebook/cache/disk/DiskCacheConfig$b;->h(Lcom/facebook/cache/disk/DiskCacheConfig$b;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-static {v0}, Lv3/j;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, Ljava/lang/String;

    .line 58
    .line 59
    iput-object v0, p0, Lcom/facebook/cache/disk/DiskCacheConfig;->b:Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {p1}, Lcom/facebook/cache/disk/DiskCacheConfig$b;->b(Lcom/facebook/cache/disk/DiskCacheConfig$b;)Lcom/facebook/common/internal/Supplier;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-static {v0}, Lv3/j;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    check-cast v0, Lcom/facebook/common/internal/Supplier;

    .line 70
    .line 71
    iput-object v0, p0, Lcom/facebook/cache/disk/DiskCacheConfig;->c:Lcom/facebook/common/internal/Supplier;

    .line 72
    .line 73
    invoke-static {p1}, Lcom/facebook/cache/disk/DiskCacheConfig$b;->i(Lcom/facebook/cache/disk/DiskCacheConfig$b;)J

    .line 74
    .line 75
    .line 76
    move-result-wide v0

    .line 77
    iput-wide v0, p0, Lcom/facebook/cache/disk/DiskCacheConfig;->d:J

    .line 78
    .line 79
    invoke-static {p1}, Lcom/facebook/cache/disk/DiskCacheConfig$b;->j(Lcom/facebook/cache/disk/DiskCacheConfig$b;)J

    .line 80
    .line 81
    .line 82
    move-result-wide v0

    .line 83
    iput-wide v0, p0, Lcom/facebook/cache/disk/DiskCacheConfig;->e:J

    .line 84
    .line 85
    invoke-static {p1}, Lcom/facebook/cache/disk/DiskCacheConfig$b;->k(Lcom/facebook/cache/disk/DiskCacheConfig$b;)J

    .line 86
    .line 87
    .line 88
    move-result-wide v0

    .line 89
    iput-wide v0, p0, Lcom/facebook/cache/disk/DiskCacheConfig;->f:J

    .line 90
    .line 91
    invoke-static {p1}, Lcom/facebook/cache/disk/DiskCacheConfig$b;->l(Lcom/facebook/cache/disk/DiskCacheConfig$b;)Lq3/g;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-static {v0}, Lv3/j;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    check-cast v0, Lq3/g;

    .line 100
    .line 101
    iput-object v0, p0, Lcom/facebook/cache/disk/DiskCacheConfig;->g:Lq3/g;

    .line 102
    .line 103
    invoke-static {p1}, Lcom/facebook/cache/disk/DiskCacheConfig$b;->m(Lcom/facebook/cache/disk/DiskCacheConfig$b;)Lp3/a;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    if-nez v0, :cond_3

    .line 108
    .line 109
    invoke-static {}, Lp3/f;->b()Lp3/f;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    goto :goto_2

    .line 114
    :cond_3
    invoke-static {p1}, Lcom/facebook/cache/disk/DiskCacheConfig$b;->m(Lcom/facebook/cache/disk/DiskCacheConfig$b;)Lp3/a;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    :goto_2
    iput-object v0, p0, Lcom/facebook/cache/disk/DiskCacheConfig;->h:Lp3/a;

    .line 119
    .line 120
    invoke-static {p1}, Lcom/facebook/cache/disk/DiskCacheConfig$b;->c(Lcom/facebook/cache/disk/DiskCacheConfig$b;)Lp3/c;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    if-nez v0, :cond_4

    .line 125
    .line 126
    invoke-static {}, Lp3/g;->i()Lp3/g;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    goto :goto_3

    .line 131
    :cond_4
    invoke-static {p1}, Lcom/facebook/cache/disk/DiskCacheConfig$b;->c(Lcom/facebook/cache/disk/DiskCacheConfig$b;)Lp3/c;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    :goto_3
    iput-object v0, p0, Lcom/facebook/cache/disk/DiskCacheConfig;->i:Lp3/c;

    .line 136
    .line 137
    invoke-static {p1}, Lcom/facebook/cache/disk/DiskCacheConfig$b;->e(Lcom/facebook/cache/disk/DiskCacheConfig$b;)Ls3/b;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    if-nez v0, :cond_5

    .line 142
    .line 143
    invoke-static {}, Ls3/c;->b()Ls3/c;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    goto :goto_4

    .line 148
    :cond_5
    invoke-static {p1}, Lcom/facebook/cache/disk/DiskCacheConfig$b;->e(Lcom/facebook/cache/disk/DiskCacheConfig$b;)Ls3/b;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    :goto_4
    iput-object v0, p0, Lcom/facebook/cache/disk/DiskCacheConfig;->j:Ls3/b;

    .line 153
    .line 154
    invoke-static {p1}, Lcom/facebook/cache/disk/DiskCacheConfig$b;->f(Lcom/facebook/cache/disk/DiskCacheConfig$b;)Z

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    iput-boolean p1, p0, Lcom/facebook/cache/disk/DiskCacheConfig;->l:Z

    .line 159
    .line 160
    return-void
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
.end method

.method static synthetic a(Lcom/facebook/cache/disk/DiskCacheConfig;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/facebook/cache/disk/DiskCacheConfig;->k:Landroid/content/Context;

    return-object p0
.end method

.method public static m(Landroid/content/Context;)Lcom/facebook/cache/disk/DiskCacheConfig$b;
    .locals 2

    new-instance v0, Lcom/facebook/cache/disk/DiskCacheConfig$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/cache/disk/DiskCacheConfig$b;-><init>(Landroid/content/Context;Lcom/facebook/cache/disk/DiskCacheConfig$a;)V

    return-object v0
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/facebook/cache/disk/DiskCacheConfig;->b:Ljava/lang/String;

    return-object v0
.end method

.method public c()Lcom/facebook/common/internal/Supplier;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/common/internal/Supplier<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/facebook/cache/disk/DiskCacheConfig;->c:Lcom/facebook/common/internal/Supplier;

    return-object v0
.end method

.method public d()Lp3/a;
    .locals 1

    iget-object v0, p0, Lcom/facebook/cache/disk/DiskCacheConfig;->h:Lp3/a;

    return-object v0
.end method

.method public e()Lp3/c;
    .locals 1

    iget-object v0, p0, Lcom/facebook/cache/disk/DiskCacheConfig;->i:Lp3/c;

    return-object v0
.end method

.method public f()J
    .locals 2

    iget-wide v0, p0, Lcom/facebook/cache/disk/DiskCacheConfig;->d:J

    return-wide v0
.end method

.method public g()Ls3/b;
    .locals 1

    iget-object v0, p0, Lcom/facebook/cache/disk/DiskCacheConfig;->j:Ls3/b;

    return-object v0
.end method

.method public h()Lq3/g;
    .locals 1

    iget-object v0, p0, Lcom/facebook/cache/disk/DiskCacheConfig;->g:Lq3/g;

    return-object v0
.end method

.method public i()Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/cache/disk/DiskCacheConfig;->l:Z

    return v0
.end method

.method public j()J
    .locals 2

    iget-wide v0, p0, Lcom/facebook/cache/disk/DiskCacheConfig;->e:J

    return-wide v0
.end method

.method public k()J
    .locals 2

    iget-wide v0, p0, Lcom/facebook/cache/disk/DiskCacheConfig;->f:J

    return-wide v0
.end method

.method public l()I
    .locals 1

    iget v0, p0, Lcom/facebook/cache/disk/DiskCacheConfig;->a:I

    return v0
.end method
