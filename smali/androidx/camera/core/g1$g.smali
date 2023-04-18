.class Landroidx/camera/core/g1$g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/g1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "g"
.end annotation


# instance fields
.field final a:I

.field final b:I

.field private final c:Landroid/util/Rational;

.field private final d:Ljava/util/concurrent/Executor;

.field private final e:Landroidx/camera/core/g1$i;

.field f:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final g:Landroid/graphics/Rect;

.field private final h:Landroid/graphics/Matrix;


# direct methods
.method constructor <init>(IILandroid/util/Rational;Landroid/graphics/Rect;Landroid/graphics/Matrix;Ljava/util/concurrent/Executor;Landroidx/camera/core/g1$i;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroidx/camera/core/g1$g;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    iput p1, p0, Landroidx/camera/core/g1$g;->a:I

    .line 13
    .line 14
    iput p2, p0, Landroidx/camera/core/g1$g;->b:I

    .line 15
    .line 16
    if-eqz p3, :cond_1

    .line 17
    .line 18
    invoke-virtual {p3}, Landroid/util/Rational;->isZero()Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    const/4 p2, 0x1

    .line 23
    xor-int/2addr p1, p2

    .line 24
    const-string v0, "Target ratio cannot be zero"

    .line 25
    .line 26
    invoke-static {p1, v0}, Landroidx/core/util/g;->b(ZLjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p3}, Landroid/util/Rational;->floatValue()F

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    const/4 v0, 0x0

    .line 34
    cmpl-float p1, p1, v0

    .line 35
    .line 36
    if-lez p1, :cond_0

    .line 37
    .line 38
    move v1, p2

    .line 39
    :cond_0
    const-string p1, "Target ratio must be positive"

    .line 40
    .line 41
    invoke-static {v1, p1}, Landroidx/core/util/g;->b(ZLjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    iput-object p3, p0, Landroidx/camera/core/g1$g;->c:Landroid/util/Rational;

    .line 45
    .line 46
    iput-object p4, p0, Landroidx/camera/core/g1$g;->g:Landroid/graphics/Rect;

    .line 47
    .line 48
    iput-object p5, p0, Landroidx/camera/core/g1$g;->h:Landroid/graphics/Matrix;

    .line 49
    .line 50
    iput-object p6, p0, Landroidx/camera/core/g1$g;->d:Ljava/util/concurrent/Executor;

    .line 51
    .line 52
    iput-object p7, p0, Landroidx/camera/core/g1$g;->e:Landroidx/camera/core/g1$i;

    .line 53
    .line 54
    return-void
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
.end method

.method public static synthetic a(Landroidx/camera/core/g1$g;ILjava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroidx/camera/core/g1$g;->e(ILjava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic b(Landroidx/camera/core/g1$g;Landroidx/camera/core/ImageProxy;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/core/g1$g;->d(Landroidx/camera/core/ImageProxy;)V

    return-void
.end method

.method private synthetic d(Landroidx/camera/core/ImageProxy;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/g1$g;->e:Landroidx/camera/core/g1$i;

    invoke-virtual {v0, p1}, Landroidx/camera/core/g1$i;->a(Landroidx/camera/core/ImageProxy;)V

    return-void
.end method

.method private synthetic e(ILjava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/g1$g;->e:Landroidx/camera/core/g1$i;

    new-instance v1, Landroidx/camera/core/j1;

    invoke-direct {v1, p1, p2, p3}, Landroidx/camera/core/j1;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Landroidx/camera/core/g1$i;->b(Landroidx/camera/core/j1;)V

    return-void
.end method


# virtual methods
.method c(Landroidx/camera/core/ImageProxy;)V
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/camera/core/g1$g;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->close()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    new-instance v0, Lc0/a;

    .line 16
    .line 17
    invoke-direct {v0}, Lc0/a;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1}, Lc0/a;->b(Landroidx/camera/core/ImageProxy;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    :try_start_0
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->n()[Landroidx/camera/core/ImageProxy$a;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    aget-object v0, v0, v1

    .line 31
    .line 32
    invoke-interface {v0}, Landroidx/camera/core/ImageProxy$a;->c()Ljava/nio/ByteBuffer;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    new-array v1, v1, [B

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 46
    .line 47
    .line 48
    new-instance v3, Ljava/io/ByteArrayInputStream;

    .line 49
    .line 50
    invoke-direct {v3, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 51
    .line 52
    .line 53
    invoke-static {v3}, Landroidx/camera/core/impl/utils/k;->d(Ljava/io/InputStream;)Landroidx/camera/core/impl/utils/k;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 58
    .line 59
    .line 60
    new-instance v0, Landroid/util/Size;

    .line 61
    .line 62
    invoke-virtual {v1}, Landroidx/camera/core/impl/utils/k;->l()I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    invoke-virtual {v1}, Landroidx/camera/core/impl/utils/k;->g()I

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    invoke-direct {v0, v3, v4}, Landroid/util/Size;-><init>(II)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1}, Landroidx/camera/core/impl/utils/k;->j()I

    .line 74
    .line 75
    .line 76
    move-result v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 77
    goto :goto_0

    .line 78
    :catch_0
    move-exception v0

    .line 79
    const-string v1, "Unable to parse JPEG exif"

    .line 80
    .line 81
    invoke-virtual {p0, v2, v1, v0}, Landroidx/camera/core/g1$g;->f(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 82
    .line 83
    .line 84
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->close()V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_1
    new-instance v0, Landroid/util/Size;

    .line 89
    .line 90
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->getWidth()I

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->getHeight()I

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    invoke-direct {v0, v1, v2}, Landroid/util/Size;-><init>(II)V

    .line 99
    .line 100
    .line 101
    iget v1, p0, Landroidx/camera/core/g1$g;->a:I

    .line 102
    .line 103
    :goto_0
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->e0()Landroidx/camera/core/k1;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    invoke-interface {v2}, Landroidx/camera/core/k1;->b()Lw/s2;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->e0()Landroidx/camera/core/k1;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    invoke-interface {v3}, Landroidx/camera/core/k1;->a()J

    .line 116
    .line 117
    .line 118
    move-result-wide v3

    .line 119
    iget-object v5, p0, Landroidx/camera/core/g1$g;->h:Landroid/graphics/Matrix;

    .line 120
    .line 121
    invoke-static {v2, v3, v4, v1, v5}, Landroidx/camera/core/p1;->d(Lw/s2;JILandroid/graphics/Matrix;)Landroidx/camera/core/k1;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    new-instance v3, Landroidx/camera/core/k2;

    .line 126
    .line 127
    invoke-direct {v3, p1, v0, v2}, Landroidx/camera/core/k2;-><init>(Landroidx/camera/core/ImageProxy;Landroid/util/Size;Landroidx/camera/core/k1;)V

    .line 128
    .line 129
    .line 130
    iget-object v2, p0, Landroidx/camera/core/g1$g;->g:Landroid/graphics/Rect;

    .line 131
    .line 132
    iget-object v4, p0, Landroidx/camera/core/g1$g;->c:Landroid/util/Rational;

    .line 133
    .line 134
    iget v5, p0, Landroidx/camera/core/g1$g;->a:I

    .line 135
    .line 136
    invoke-static {v2, v4, v5, v0, v1}, Landroidx/camera/core/g1;->X(Landroid/graphics/Rect;Landroid/util/Rational;ILandroid/util/Size;I)Landroid/graphics/Rect;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-interface {v3, v0}, Landroidx/camera/core/ImageProxy;->c0(Landroid/graphics/Rect;)V

    .line 141
    .line 142
    .line 143
    :try_start_1
    iget-object v0, p0, Landroidx/camera/core/g1$g;->d:Ljava/util/concurrent/Executor;

    .line 144
    .line 145
    new-instance v1, Landroidx/camera/core/i1;

    .line 146
    .line 147
    invoke-direct {v1, p0, v3}, Landroidx/camera/core/i1;-><init>(Landroidx/camera/core/g1$g;Landroidx/camera/core/ImageProxy;)V

    .line 148
    .line 149
    .line 150
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_1 .. :try_end_1} :catch_1

    .line 151
    .line 152
    .line 153
    goto :goto_1

    .line 154
    :catch_1
    const-string v0, "ImageCapture"

    .line 155
    .line 156
    const-string v1, "Unable to post to the supplied executor."

    .line 157
    .line 158
    invoke-static {v0, v1}, Landroidx/camera/core/r1;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->close()V

    .line 162
    .line 163
    .line 164
    :goto_1
    return-void
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

.method f(ILjava/lang/String;Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/core/g1$g;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    :try_start_0
    iget-object v0, p0, Landroidx/camera/core/g1$g;->d:Ljava/util/concurrent/Executor;

    .line 13
    .line 14
    new-instance v1, Landroidx/camera/core/h1;

    .line 15
    .line 16
    invoke-direct {v1, p0, p1, p2, p3}, Landroidx/camera/core/h1;-><init>(Landroidx/camera/core/g1$g;ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catch_0
    const-string p1, "ImageCapture"

    .line 24
    .line 25
    const-string p2, "Unable to post to the supplied executor."

    .line 26
    .line 27
    invoke-static {p1, p2}, Landroidx/camera/core/r1;->c(Ljava/lang/String;Ljava/lang/String;)V

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
.end method
