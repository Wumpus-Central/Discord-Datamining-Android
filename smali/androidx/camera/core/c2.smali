.class Landroidx/camera/core/c2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/m1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/c2$d;
    }
.end annotation


# instance fields
.field final a:Ljava/lang/Object;

.field private b:Lw/m1$a;

.field private c:Lw/m1$a;

.field private d:Ly/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly/c<",
            "Ljava/util/List<",
            "Landroidx/camera/core/ImageProxy;",
            ">;>;"
        }
    .end annotation
.end field

.field e:Z

.field f:Z

.field final g:Landroidx/camera/core/u1;

.field final h:Lw/m1;

.field i:Lw/m1$a;

.field j:Ljava/util/concurrent/Executor;

.field k:Landroidx/concurrent/futures/c$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/concurrent/futures/c$a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private l:Lfc/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfc/b<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field final m:Ljava/util/concurrent/Executor;

.field final n:Lw/o0;

.field private o:Ljava/lang/String;

.field p:Landroidx/camera/core/l2;

.field private final q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroidx/camera/core/c2$d;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/camera/core/c2;->a:Ljava/lang/Object;

    .line 10
    .line 11
    new-instance v0, Landroidx/camera/core/c2$a;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Landroidx/camera/core/c2$a;-><init>(Landroidx/camera/core/c2;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Landroidx/camera/core/c2;->b:Lw/m1$a;

    .line 17
    .line 18
    new-instance v0, Landroidx/camera/core/c2$b;

    .line 19
    .line 20
    invoke-direct {v0, p0}, Landroidx/camera/core/c2$b;-><init>(Landroidx/camera/core/c2;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Landroidx/camera/core/c2;->c:Lw/m1$a;

    .line 24
    .line 25
    new-instance v0, Landroidx/camera/core/c2$c;

    .line 26
    .line 27
    invoke-direct {v0, p0}, Landroidx/camera/core/c2$c;-><init>(Landroidx/camera/core/c2;)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Landroidx/camera/core/c2;->d:Ly/c;

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    iput-boolean v0, p0, Landroidx/camera/core/c2;->e:Z

    .line 34
    .line 35
    iput-boolean v0, p0, Landroidx/camera/core/c2;->f:Z

    .line 36
    .line 37
    new-instance v0, Ljava/lang/String;

    .line 38
    .line 39
    invoke-direct {v0}, Ljava/lang/String;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, Landroidx/camera/core/c2;->o:Ljava/lang/String;

    .line 43
    .line 44
    new-instance v0, Landroidx/camera/core/l2;

    .line 45
    .line 46
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    iget-object v2, p0, Landroidx/camera/core/c2;->o:Ljava/lang/String;

    .line 51
    .line 52
    invoke-direct {v0, v1, v2}, Landroidx/camera/core/l2;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    iput-object v0, p0, Landroidx/camera/core/c2;->p:Landroidx/camera/core/l2;

    .line 56
    .line 57
    new-instance v0, Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 60
    .line 61
    .line 62
    iput-object v0, p0, Landroidx/camera/core/c2;->q:Ljava/util/List;

    .line 63
    .line 64
    iget-object v0, p1, Landroidx/camera/core/c2$d;->a:Landroidx/camera/core/u1;

    .line 65
    .line 66
    invoke-virtual {v0}, Landroidx/camera/core/u1;->b()I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget-object v1, p1, Landroidx/camera/core/c2$d;->b:Lw/m0;

    .line 71
    .line 72
    invoke-interface {v1}, Lw/m0;->c()Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-lt v0, v1, :cond_1

    .line 81
    .line 82
    iget-object v0, p1, Landroidx/camera/core/c2$d;->a:Landroidx/camera/core/u1;

    .line 83
    .line 84
    iput-object v0, p0, Landroidx/camera/core/c2;->g:Landroidx/camera/core/u1;

    .line 85
    .line 86
    invoke-virtual {v0}, Landroidx/camera/core/u1;->getWidth()I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    invoke-virtual {v0}, Landroidx/camera/core/u1;->getHeight()I

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    iget v3, p1, Landroidx/camera/core/c2$d;->d:I

    .line 95
    .line 96
    const/16 v4, 0x100

    .line 97
    .line 98
    if-ne v3, v4, :cond_0

    .line 99
    .line 100
    mul-int/2addr v1, v2

    .line 101
    int-to-float v1, v1

    .line 102
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 103
    .line 104
    mul-float/2addr v1, v2

    .line 105
    float-to-int v1, v1

    .line 106
    const v2, 0xfa00

    .line 107
    .line 108
    .line 109
    add-int/2addr v1, v2

    .line 110
    const/4 v2, 0x1

    .line 111
    :cond_0
    new-instance v4, Landroidx/camera/core/d;

    .line 112
    .line 113
    invoke-virtual {v0}, Landroidx/camera/core/u1;->b()I

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    invoke-static {v1, v2, v3, v5}, Landroid/media/ImageReader;->newInstance(IIII)Landroid/media/ImageReader;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-direct {v4, v1}, Landroidx/camera/core/d;-><init>(Landroid/media/ImageReader;)V

    .line 122
    .line 123
    .line 124
    iput-object v4, p0, Landroidx/camera/core/c2;->h:Lw/m1;

    .line 125
    .line 126
    iget-object v1, p1, Landroidx/camera/core/c2$d;->e:Ljava/util/concurrent/Executor;

    .line 127
    .line 128
    iput-object v1, p0, Landroidx/camera/core/c2;->m:Ljava/util/concurrent/Executor;

    .line 129
    .line 130
    iget-object v1, p1, Landroidx/camera/core/c2$d;->c:Lw/o0;

    .line 131
    .line 132
    iput-object v1, p0, Landroidx/camera/core/c2;->n:Lw/o0;

    .line 133
    .line 134
    invoke-interface {v4}, Lw/m1;->getSurface()Landroid/view/Surface;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    iget v3, p1, Landroidx/camera/core/c2$d;->d:I

    .line 139
    .line 140
    invoke-interface {v1, v2, v3}, Lw/o0;->b(Landroid/view/Surface;I)V

    .line 141
    .line 142
    .line 143
    new-instance v2, Landroid/util/Size;

    .line 144
    .line 145
    invoke-virtual {v0}, Landroidx/camera/core/u1;->getWidth()I

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    invoke-virtual {v0}, Landroidx/camera/core/u1;->getHeight()I

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    invoke-direct {v2, v3, v0}, Landroid/util/Size;-><init>(II)V

    .line 154
    .line 155
    .line 156
    invoke-interface {v1, v2}, Lw/o0;->c(Landroid/util/Size;)V

    .line 157
    .line 158
    .line 159
    iget-object p1, p1, Landroidx/camera/core/c2$d;->b:Lw/m0;

    .line 160
    .line 161
    invoke-virtual {p0, p1}, Landroidx/camera/core/c2;->m(Lw/m0;)V

    .line 162
    .line 163
    .line 164
    return-void

    .line 165
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 166
    .line 167
    const-string v0, "MetadataImageReader is smaller than CaptureBundle."

    .line 168
    .line 169
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    throw p1
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
.end method

.method public static synthetic c(Landroidx/camera/core/c2;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/core/c2;->l(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private synthetic l(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/camera/core/c2;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iput-object p1, p0, Landroidx/camera/core/c2;->k:Landroidx/concurrent/futures/c$a;

    .line 5
    .line 6
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    const-string p1, "ProcessingImageReader-close"

    .line 8
    .line 9
    return-object p1

    .line 10
    :catchall_0
    move-exception p1

    .line 11
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    throw p1
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
.end method


# virtual methods
.method public a()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/core/c2;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/c2;->h:Lw/m1;

    .line 5
    .line 6
    invoke-interface {v1}, Lw/m1;->a()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    monitor-exit v0

    .line 11
    return v1

    .line 12
    :catchall_0
    move-exception v1

    .line 13
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    throw v1
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
.end method

.method public b()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/core/c2;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/c2;->g:Landroidx/camera/core/u1;

    .line 5
    .line 6
    invoke-virtual {v1}, Landroidx/camera/core/u1;->b()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    monitor-exit v0

    .line 11
    return v1

    .line 12
    :catchall_0
    move-exception v1

    .line 13
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    throw v1
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
.end method

.method public close()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/core/c2;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Landroidx/camera/core/c2;->e:Z

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    monitor-exit v0

    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v1, p0, Landroidx/camera/core/c2;->h:Lw/m1;

    .line 11
    .line 12
    invoke-interface {v1}, Lw/m1;->e()V

    .line 13
    .line 14
    .line 15
    iget-boolean v1, p0, Landroidx/camera/core/c2;->f:Z

    .line 16
    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    iget-object v1, p0, Landroidx/camera/core/c2;->g:Landroidx/camera/core/u1;

    .line 20
    .line 21
    invoke-virtual {v1}, Landroidx/camera/core/u1;->close()V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Landroidx/camera/core/c2;->p:Landroidx/camera/core/l2;

    .line 25
    .line 26
    invoke-virtual {v1}, Landroidx/camera/core/l2;->d()V

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Landroidx/camera/core/c2;->h:Lw/m1;

    .line 30
    .line 31
    invoke-interface {v1}, Lw/m1;->close()V

    .line 32
    .line 33
    .line 34
    iget-object v1, p0, Landroidx/camera/core/c2;->k:Landroidx/concurrent/futures/c$a;

    .line 35
    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    invoke-virtual {v1, v2}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    :cond_1
    const/4 v1, 0x1

    .line 43
    iput-boolean v1, p0, Landroidx/camera/core/c2;->e:Z

    .line 44
    .line 45
    monitor-exit v0

    .line 46
    return-void

    .line 47
    :catchall_0
    move-exception v1

    .line 48
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    throw v1
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
.end method

.method public d()Landroidx/camera/core/ImageProxy;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/core/c2;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/c2;->h:Lw/m1;

    .line 5
    .line 6
    invoke-interface {v1}, Lw/m1;->d()Landroidx/camera/core/ImageProxy;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    monitor-exit v0

    .line 11
    return-object v1

    .line 12
    :catchall_0
    move-exception v1

    .line 13
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    throw v1
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
.end method

.method public e()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/core/c2;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :try_start_0
    iput-object v1, p0, Landroidx/camera/core/c2;->i:Lw/m1$a;

    .line 6
    .line 7
    iput-object v1, p0, Landroidx/camera/core/c2;->j:Ljava/util/concurrent/Executor;

    .line 8
    .line 9
    iget-object v1, p0, Landroidx/camera/core/c2;->g:Landroidx/camera/core/u1;

    .line 10
    .line 11
    invoke-virtual {v1}, Landroidx/camera/core/u1;->e()V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Landroidx/camera/core/c2;->h:Lw/m1;

    .line 15
    .line 16
    invoke-interface {v1}, Lw/m1;->e()V

    .line 17
    .line 18
    .line 19
    iget-boolean v1, p0, Landroidx/camera/core/c2;->f:Z

    .line 20
    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    iget-object v1, p0, Landroidx/camera/core/c2;->p:Landroidx/camera/core/l2;

    .line 24
    .line 25
    invoke-virtual {v1}, Landroidx/camera/core/l2;->d()V

    .line 26
    .line 27
    .line 28
    :cond_0
    monitor-exit v0

    .line 29
    return-void

    .line 30
    :catchall_0
    move-exception v1

    .line 31
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    throw v1
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method

.method public f(Lw/m1$a;Ljava/util/concurrent/Executor;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/core/c2;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-static {p1}, Landroidx/core/util/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Lw/m1$a;

    .line 9
    .line 10
    iput-object p1, p0, Landroidx/camera/core/c2;->i:Lw/m1$a;

    .line 11
    .line 12
    invoke-static {p2}, Landroidx/core/util/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Ljava/util/concurrent/Executor;

    .line 17
    .line 18
    iput-object p1, p0, Landroidx/camera/core/c2;->j:Ljava/util/concurrent/Executor;

    .line 19
    .line 20
    iget-object p1, p0, Landroidx/camera/core/c2;->g:Landroidx/camera/core/u1;

    .line 21
    .line 22
    iget-object v1, p0, Landroidx/camera/core/c2;->b:Lw/m1$a;

    .line 23
    .line 24
    invoke-virtual {p1, v1, p2}, Landroidx/camera/core/u1;->f(Lw/m1$a;Ljava/util/concurrent/Executor;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Landroidx/camera/core/c2;->h:Lw/m1;

    .line 28
    .line 29
    iget-object v1, p0, Landroidx/camera/core/c2;->c:Lw/m1$a;

    .line 30
    .line 31
    invoke-interface {p1, v1, p2}, Lw/m1;->f(Lw/m1$a;Ljava/util/concurrent/Executor;)V

    .line 32
    .line 33
    .line 34
    monitor-exit v0

    .line 35
    return-void

    .line 36
    :catchall_0
    move-exception p1

    .line 37
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    throw p1
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
.end method

.method public g()Landroidx/camera/core/ImageProxy;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/core/c2;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/c2;->h:Lw/m1;

    .line 5
    .line 6
    invoke-interface {v1}, Lw/m1;->g()Landroidx/camera/core/ImageProxy;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    monitor-exit v0

    .line 11
    return-object v1

    .line 12
    :catchall_0
    move-exception v1

    .line 13
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    throw v1
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
.end method

.method public getHeight()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/core/c2;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/c2;->g:Landroidx/camera/core/u1;

    .line 5
    .line 6
    invoke-virtual {v1}, Landroidx/camera/core/u1;->getHeight()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    monitor-exit v0

    .line 11
    return v1

    .line 12
    :catchall_0
    move-exception v1

    .line 13
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    throw v1
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
.end method

.method public getSurface()Landroid/view/Surface;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/core/c2;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/c2;->g:Landroidx/camera/core/u1;

    .line 5
    .line 6
    invoke-virtual {v1}, Landroidx/camera/core/u1;->getSurface()Landroid/view/Surface;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    monitor-exit v0

    .line 11
    return-object v1

    .line 12
    :catchall_0
    move-exception v1

    .line 13
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    throw v1
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
.end method

.method public getWidth()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/core/c2;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/c2;->g:Landroidx/camera/core/u1;

    .line 5
    .line 6
    invoke-virtual {v1}, Landroidx/camera/core/u1;->getWidth()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    monitor-exit v0

    .line 11
    return v1

    .line 12
    :catchall_0
    move-exception v1

    .line 13
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    throw v1
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
.end method

.method h()Lw/k;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/core/c2;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/c2;->g:Landroidx/camera/core/u1;

    .line 5
    .line 6
    invoke-virtual {v1}, Landroidx/camera/core/u1;->m()Lw/k;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    monitor-exit v0

    .line 11
    return-object v1

    .line 12
    :catchall_0
    move-exception v1

    .line 13
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    throw v1
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
.end method

.method i()Lfc/b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfc/b<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/camera/core/c2;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Landroidx/camera/core/c2;->e:Z

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    iget-boolean v1, p0, Landroidx/camera/core/c2;->f:Z

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-static {v1}, Ly/f;->h(Ljava/lang/Object;)Lfc/b;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object v1, p0, Landroidx/camera/core/c2;->l:Lfc/b;

    .line 19
    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    new-instance v1, Landroidx/camera/core/b2;

    .line 23
    .line 24
    invoke-direct {v1, p0}, Landroidx/camera/core/b2;-><init>(Landroidx/camera/core/c2;)V

    .line 25
    .line 26
    .line 27
    invoke-static {v1}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)Lfc/b;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iput-object v1, p0, Landroidx/camera/core/c2;->l:Lfc/b;

    .line 32
    .line 33
    :cond_1
    iget-object v1, p0, Landroidx/camera/core/c2;->l:Lfc/b;

    .line 34
    .line 35
    invoke-static {v1}, Ly/f;->j(Lfc/b;)Lfc/b;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    :goto_0
    monitor-exit v0

    .line 40
    return-object v1

    .line 41
    :catchall_0
    move-exception v1

    .line 42
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    throw v1
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
.end method

.method public j()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/c2;->o:Ljava/lang/String;

    return-object v0
.end method

.method k(Lw/m1;)V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/camera/core/c2;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Landroidx/camera/core/c2;->e:Z

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 9
    return-void

    .line 10
    :cond_0
    :try_start_1
    invoke-interface {p1}, Lw/m1;->g()Landroidx/camera/core/ImageProxy;

    .line 11
    .line 12
    .line 13
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 14
    if-eqz p1, :cond_2

    .line 15
    .line 16
    :try_start_2
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->e0()Landroidx/camera/core/k1;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-interface {v1}, Landroidx/camera/core/k1;->b()Lw/s2;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iget-object v2, p0, Landroidx/camera/core/c2;->o:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Lw/s2;->c(Ljava/lang/String;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Ljava/lang/Integer;

    .line 31
    .line 32
    iget-object v2, p0, Landroidx/camera/core/c2;->q:Ljava/util/List;

    .line 33
    .line 34
    invoke-interface {v2, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-nez v2, :cond_1

    .line 39
    .line 40
    const-string v2, "ProcessingImageReader"

    .line 41
    .line 42
    new-instance v3, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 45
    .line 46
    .line 47
    const-string v4, "ImageProxyBundle does not contain this id: "

    .line 48
    .line 49
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-static {v2, v1}, Landroidx/camera/core/r1;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->close()V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    iget-object v1, p0, Landroidx/camera/core/c2;->p:Landroidx/camera/core/l2;

    .line 67
    .line 68
    invoke-virtual {v1, p1}, Landroidx/camera/core/l2;->c(Landroidx/camera/core/ImageProxy;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :catchall_0
    move-exception p1

    .line 73
    goto :goto_1

    .line 74
    :catch_0
    move-exception p1

    .line 75
    :try_start_3
    const-string v1, "ProcessingImageReader"

    .line 76
    .line 77
    const-string v2, "Failed to acquire latest image."

    .line 78
    .line 79
    invoke-static {v1, v2, p1}, Landroidx/camera/core/r1;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 80
    .line 81
    .line 82
    :cond_2
    :goto_0
    :try_start_4
    monitor-exit v0

    .line 83
    return-void

    .line 84
    :goto_1
    throw p1

    .line 85
    :catchall_1
    move-exception p1

    .line 86
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 87
    throw p1
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
.end method

.method public m(Lw/m0;)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/camera/core/c2;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-interface {p1}, Lw/m0;->c()Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    if-eqz v1, :cond_2

    .line 9
    .line 10
    iget-object v1, p0, Landroidx/camera/core/c2;->g:Landroidx/camera/core/u1;

    .line 11
    .line 12
    invoke-virtual {v1}, Landroidx/camera/core/u1;->b()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-interface {p1}, Lw/m0;->c()Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-lt v1, v2, :cond_1

    .line 25
    .line 26
    iget-object v1, p0, Landroidx/camera/core/c2;->q:Ljava/util/List;

    .line 27
    .line 28
    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 29
    .line 30
    .line 31
    invoke-interface {p1}, Lw/m0;->c()Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_2

    .line 44
    .line 45
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    check-cast v2, Lw/p0;

    .line 50
    .line 51
    if-eqz v2, :cond_0

    .line 52
    .line 53
    iget-object v3, p0, Landroidx/camera/core/c2;->q:Ljava/util/List;

    .line 54
    .line 55
    invoke-interface {v2}, Lw/p0;->getId()I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 68
    .line 69
    const-string v1, "CaptureBundle is larger than InputImageReader."

    .line 70
    .line 71
    invoke-direct {p1, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw p1

    .line 75
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    iput-object p1, p0, Landroidx/camera/core/c2;->o:Ljava/lang/String;

    .line 84
    .line 85
    new-instance v1, Landroidx/camera/core/l2;

    .line 86
    .line 87
    iget-object v2, p0, Landroidx/camera/core/c2;->q:Ljava/util/List;

    .line 88
    .line 89
    invoke-direct {v1, v2, p1}, Landroidx/camera/core/l2;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    iput-object v1, p0, Landroidx/camera/core/c2;->p:Landroidx/camera/core/l2;

    .line 93
    .line 94
    invoke-virtual {p0}, Landroidx/camera/core/c2;->n()V

    .line 95
    .line 96
    .line 97
    monitor-exit v0

    .line 98
    return-void

    .line 99
    :catchall_0
    move-exception p1

    .line 100
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 101
    throw p1
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
.end method

.method n()V
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Landroidx/camera/core/c2;->q:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Ljava/lang/Integer;

    .line 23
    .line 24
    iget-object v3, p0, Landroidx/camera/core/c2;->p:Landroidx/camera/core/l2;

    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    invoke-virtual {v3, v2}, Landroidx/camera/core/l2;->a(I)Lfc/b;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    invoke-static {v0}, Ly/f;->c(Ljava/util/Collection;)Lfc/b;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iget-object v1, p0, Landroidx/camera/core/c2;->d:Ly/c;

    .line 43
    .line 44
    iget-object v2, p0, Landroidx/camera/core/c2;->m:Ljava/util/concurrent/Executor;

    .line 45
    .line 46
    invoke-static {v0, v1, v2}, Ly/f;->b(Lfc/b;Ly/c;Ljava/util/concurrent/Executor;)V

    .line 47
    .line 48
    .line 49
    return-void
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
.end method
