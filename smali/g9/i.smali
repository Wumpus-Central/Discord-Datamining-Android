.class Lg9/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/opengl/GLSurfaceView$Renderer;
.implements Lg9/l;


# static fields
.field private static final u:[F

.field private static final v:[F

.field private static final w:[F

.field private static final x:[Ljava/lang/String;

.field private static final y:Ljava/nio/FloatBuffer;


# instance fields
.field private final k:Landroid/opengl/GLSurfaceView;

.field private final l:[I

.field private final m:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lg9/k;",
            ">;"
        }
    .end annotation
.end field

.field private n:[Ljava/nio/FloatBuffer;

.field private o:I

.field private p:[I

.field private q:I

.field private r:[I

.field private s:[I

.field private t:Lg9/k;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/16 v0, 0x9

    .line 2
    .line 3
    new-array v1, v0, [F

    .line 4
    .line 5
    fill-array-data v1, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v1, Lg9/i;->u:[F

    .line 9
    .line 10
    new-array v1, v0, [F

    .line 11
    .line 12
    fill-array-data v1, :array_1

    .line 13
    .line 14
    .line 15
    sput-object v1, Lg9/i;->v:[F

    .line 16
    .line 17
    new-array v0, v0, [F

    .line 18
    .line 19
    fill-array-data v0, :array_2

    .line 20
    .line 21
    .line 22
    sput-object v0, Lg9/i;->w:[F

    .line 23
    .line 24
    const-string v0, "u_tex"

    .line 25
    .line 26
    const-string v1, "v_tex"

    .line 27
    .line 28
    const-string v2, "y_tex"

    .line 29
    .line 30
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    sput-object v0, Lg9/i;->x:[Ljava/lang/String;

    .line 35
    .line 36
    const/16 v0, 0x8

    .line 37
    .line 38
    new-array v0, v0, [F

    .line 39
    .line 40
    fill-array-data v0, :array_3

    .line 41
    .line 42
    .line 43
    invoke-static {v0}, Lf9/l;->f([F)Ljava/nio/FloatBuffer;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sput-object v0, Lg9/i;->y:Ljava/nio/FloatBuffer;

    .line 48
    .line 49
    return-void

    .line 50
    nop

    .line 51
    :array_0
    .array-data 4
        0x3f94fdf4    # 1.164f
        0x3f94fdf4    # 1.164f
        0x3f94fdf4    # 1.164f
        0x0
        -0x41374bc7    # -0.392f
        0x40011687    # 2.017f
        0x3fcc49ba    # 1.596f
        -0x40afdf3b    # -0.813f
        0x0
    .end array-data

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
    :array_1
    .array-data 4
        0x3f94fdf4    # 1.164f
        0x3f94fdf4    # 1.164f
        0x3f94fdf4    # 1.164f
        0x0
        -0x41a5e354    # -0.213f
        0x40072b02    # 2.112f
        0x3fe58106    # 1.793f
        -0x40f78d50    # -0.533f
        0x0
    .end array-data

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
    :array_2
    .array-data 4
        0x3f958106    # 1.168f
        0x3f958106    # 1.168f
        0x3f958106    # 1.168f
        0x0
        -0x41bf7cee    # -0.188f
        0x400978d5    # 2.148f
        0x3fd76c8b    # 1.683f
        -0x40d91687    # -0.652f
        0x0
    .end array-data

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
    :array_3
    .array-data 4
        -0x40800000    # -1.0f
        0x3f800000    # 1.0f
        -0x40800000    # -1.0f
        -0x40800000    # -1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        -0x40800000    # -1.0f
    .end array-data
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
.end method

.method public constructor <init>(Landroid/opengl/GLSurfaceView;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x3

    .line 5
    new-array v1, v0, [I

    .line 6
    .line 7
    iput-object v1, p0, Lg9/i;->l:[I

    .line 8
    .line 9
    iput-object p1, p0, Lg9/i;->k:Landroid/opengl/GLSurfaceView;

    .line 10
    .line 11
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lg9/i;->m:Ljava/util/concurrent/atomic/AtomicReference;

    .line 17
    .line 18
    new-array p1, v0, [Ljava/nio/FloatBuffer;

    .line 19
    .line 20
    iput-object p1, p0, Lg9/i;->n:[Ljava/nio/FloatBuffer;

    .line 21
    .line 22
    new-array p1, v0, [I

    .line 23
    .line 24
    iput-object p1, p0, Lg9/i;->p:[I

    .line 25
    .line 26
    new-array p1, v0, [I

    .line 27
    .line 28
    iput-object p1, p0, Lg9/i;->r:[I

    .line 29
    .line 30
    new-array p1, v0, [I

    .line 31
    .line 32
    iput-object p1, p0, Lg9/i;->s:[I

    .line 33
    .line 34
    const/4 p1, 0x0

    .line 35
    :goto_0
    if-ge p1, v0, :cond_0

    .line 36
    .line 37
    iget-object v1, p0, Lg9/i;->r:[I

    .line 38
    .line 39
    iget-object v2, p0, Lg9/i;->s:[I

    .line 40
    .line 41
    const/4 v3, -0x1

    .line 42
    aput v3, v2, p1

    .line 43
    .line 44
    aput v3, v1, p1

    .line 45
    .line 46
    add-int/lit8 p1, p1, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
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
.end method

.method private a()V
    .locals 5

    .line 1
    iget-object v0, p0, Lg9/i;->l:[I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-static {v1, v0, v2}, Landroid/opengl/GLES20;->glGenTextures(I[II)V

    .line 6
    .line 7
    .line 8
    :goto_0
    if-ge v2, v1, :cond_0

    .line 9
    .line 10
    iget v0, p0, Lg9/i;->o:I

    .line 11
    .line 12
    sget-object v3, Lg9/i;->x:[Ljava/lang/String;

    .line 13
    .line 14
    aget-object v3, v3, v2

    .line 15
    .line 16
    invoke-static {v0, v3}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    invoke-static {v0, v2}, Landroid/opengl/GLES20;->glUniform1i(II)V

    .line 21
    .line 22
    .line 23
    const v0, 0x84c0

    .line 24
    .line 25
    .line 26
    add-int/2addr v0, v2

    .line 27
    invoke-static {v0}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lg9/i;->l:[I

    .line 31
    .line 32
    aget v0, v0, v2

    .line 33
    .line 34
    const/16 v3, 0xde1

    .line 35
    .line 36
    invoke-static {v3, v0}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 37
    .line 38
    .line 39
    const/16 v0, 0x2801

    .line 40
    .line 41
    const v4, 0x46180400    # 9729.0f

    .line 42
    .line 43
    .line 44
    invoke-static {v3, v0, v4}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    .line 45
    .line 46
    .line 47
    const/16 v0, 0x2800

    .line 48
    .line 49
    invoke-static {v3, v0, v4}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    .line 50
    .line 51
    .line 52
    const/16 v0, 0x2802

    .line 53
    .line 54
    const v4, 0x47012f00    # 33071.0f

    .line 55
    .line 56
    .line 57
    invoke-static {v3, v0, v4}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    .line 58
    .line 59
    .line 60
    const/16 v0, 0x2803

    .line 61
    .line 62
    invoke-static {v3, v0, v4}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    .line 63
    .line 64
    .line 65
    add-int/lit8 v2, v2, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    invoke-static {}, Lf9/l;->b()V

    .line 69
    .line 70
    .line 71
    return-void
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
.end method


# virtual methods
.method public onDrawFrame(Ljavax/microedition/khronos/opengles/GL10;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lg9/i;->m:Ljava/util/concurrent/atomic/AtomicReference;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Lg9/k;

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    iget-object v2, v0, Lg9/i;->t:Lg9/k;

    .line 15
    .line 16
    if-nez v2, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    if-eqz v1, :cond_2

    .line 20
    .line 21
    iget-object v2, v0, Lg9/i;->t:Lg9/k;

    .line 22
    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    invoke-virtual {v2}, Lg9/k;->p()V

    .line 26
    .line 27
    .line 28
    :cond_1
    iput-object v1, v0, Lg9/i;->t:Lg9/k;

    .line 29
    .line 30
    :cond_2
    iget-object v1, v0, Lg9/i;->t:Lg9/k;

    .line 31
    .line 32
    invoke-static {v1}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Lg9/k;

    .line 37
    .line 38
    sget-object v2, Lg9/i;->v:[F

    .line 39
    .line 40
    iget v3, v1, Lg9/k;->r:I

    .line 41
    .line 42
    const/4 v4, 0x3

    .line 43
    const/4 v5, 0x1

    .line 44
    if-eq v3, v5, :cond_4

    .line 45
    .line 46
    if-eq v3, v4, :cond_3

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_3
    sget-object v2, Lg9/i;->w:[F

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_4
    sget-object v2, Lg9/i;->u:[F

    .line 53
    .line 54
    :goto_0
    iget v3, v0, Lg9/i;->q:I

    .line 55
    .line 56
    const/4 v6, 0x0

    .line 57
    invoke-static {v3, v5, v6, v2, v6}, Landroid/opengl/GLES20;->glUniformMatrix3fv(IIZ[FI)V

    .line 58
    .line 59
    .line 60
    iget-object v2, v1, Lg9/k;->q:[I

    .line 61
    .line 62
    invoke-static {v2}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    check-cast v2, [I

    .line 67
    .line 68
    iget-object v3, v1, Lg9/k;->p:[Ljava/nio/ByteBuffer;

    .line 69
    .line 70
    invoke-static {v3}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    check-cast v3, [Ljava/nio/ByteBuffer;

    .line 75
    .line 76
    move v7, v6

    .line 77
    :goto_1
    const/4 v8, 0x2

    .line 78
    if-ge v7, v4, :cond_6

    .line 79
    .line 80
    if-nez v7, :cond_5

    .line 81
    .line 82
    iget v8, v1, Lg9/k;->o:I

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_5
    iget v9, v1, Lg9/k;->o:I

    .line 86
    .line 87
    add-int/2addr v9, v5

    .line 88
    div-int/lit8 v8, v9, 0x2

    .line 89
    .line 90
    :goto_2
    move v13, v8

    .line 91
    const v8, 0x84c0

    .line 92
    .line 93
    .line 94
    add-int/2addr v8, v7

    .line 95
    invoke-static {v8}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    .line 96
    .line 97
    .line 98
    iget-object v8, v0, Lg9/i;->l:[I

    .line 99
    .line 100
    aget v8, v8, v7

    .line 101
    .line 102
    const/16 v9, 0xde1

    .line 103
    .line 104
    invoke-static {v9, v8}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 105
    .line 106
    .line 107
    const/16 v8, 0xcf5

    .line 108
    .line 109
    invoke-static {v8, v5}, Landroid/opengl/GLES20;->glPixelStorei(II)V

    .line 110
    .line 111
    .line 112
    const/4 v10, 0x0

    .line 113
    const/16 v11, 0x1909

    .line 114
    .line 115
    aget v12, v2, v7

    .line 116
    .line 117
    const/4 v14, 0x0

    .line 118
    const/16 v15, 0x1909

    .line 119
    .line 120
    const/16 v16, 0x1401

    .line 121
    .line 122
    aget-object v17, v3, v7

    .line 123
    .line 124
    invoke-static/range {v9 .. v17}, Landroid/opengl/GLES20;->glTexImage2D(IIIIIIIILjava/nio/Buffer;)V

    .line 125
    .line 126
    .line 127
    add-int/lit8 v7, v7, 0x1

    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_6
    new-array v3, v4, [I

    .line 131
    .line 132
    iget v1, v1, Lg9/k;->n:I

    .line 133
    .line 134
    aput v1, v3, v6

    .line 135
    .line 136
    add-int/2addr v1, v5

    .line 137
    div-int/2addr v1, v8

    .line 138
    aput v1, v3, v8

    .line 139
    .line 140
    aput v1, v3, v5

    .line 141
    .line 142
    move v1, v6

    .line 143
    :goto_3
    const/4 v7, 0x4

    .line 144
    const/4 v9, 0x5

    .line 145
    if-ge v1, v4, :cond_a

    .line 146
    .line 147
    iget-object v10, v0, Lg9/i;->r:[I

    .line 148
    .line 149
    aget v10, v10, v1

    .line 150
    .line 151
    aget v11, v3, v1

    .line 152
    .line 153
    if-ne v10, v11, :cond_7

    .line 154
    .line 155
    iget-object v10, v0, Lg9/i;->s:[I

    .line 156
    .line 157
    aget v10, v10, v1

    .line 158
    .line 159
    aget v11, v2, v1

    .line 160
    .line 161
    if-eq v10, v11, :cond_9

    .line 162
    .line 163
    :cond_7
    aget v10, v2, v1

    .line 164
    .line 165
    if-eqz v10, :cond_8

    .line 166
    .line 167
    move v10, v5

    .line 168
    goto :goto_4

    .line 169
    :cond_8
    move v10, v6

    .line 170
    :goto_4
    invoke-static {v10}, Lf9/a;->f(Z)V

    .line 171
    .line 172
    .line 173
    aget v10, v3, v1

    .line 174
    .line 175
    int-to-float v10, v10

    .line 176
    aget v11, v2, v1

    .line 177
    .line 178
    int-to-float v11, v11

    .line 179
    div-float/2addr v10, v11

    .line 180
    iget-object v11, v0, Lg9/i;->n:[Ljava/nio/FloatBuffer;

    .line 181
    .line 182
    const/16 v12, 0x8

    .line 183
    .line 184
    new-array v12, v12, [F

    .line 185
    .line 186
    const/4 v13, 0x0

    .line 187
    aput v13, v12, v6

    .line 188
    .line 189
    aput v13, v12, v5

    .line 190
    .line 191
    aput v13, v12, v8

    .line 192
    .line 193
    const/high16 v14, 0x3f800000    # 1.0f

    .line 194
    .line 195
    aput v14, v12, v4

    .line 196
    .line 197
    aput v10, v12, v7

    .line 198
    .line 199
    aput v13, v12, v9

    .line 200
    .line 201
    const/4 v7, 0x6

    .line 202
    aput v10, v12, v7

    .line 203
    .line 204
    const/4 v7, 0x7

    .line 205
    aput v14, v12, v7

    .line 206
    .line 207
    invoke-static {v12}, Lf9/l;->f([F)Ljava/nio/FloatBuffer;

    .line 208
    .line 209
    .line 210
    move-result-object v7

    .line 211
    aput-object v7, v11, v1

    .line 212
    .line 213
    iget-object v7, v0, Lg9/i;->p:[I

    .line 214
    .line 215
    aget v9, v7, v1

    .line 216
    .line 217
    const/4 v10, 0x2

    .line 218
    const/16 v11, 0x1406

    .line 219
    .line 220
    const/4 v12, 0x0

    .line 221
    const/4 v13, 0x0

    .line 222
    iget-object v7, v0, Lg9/i;->n:[Ljava/nio/FloatBuffer;

    .line 223
    .line 224
    aget-object v14, v7, v1

    .line 225
    .line 226
    invoke-static/range {v9 .. v14}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 227
    .line 228
    .line 229
    iget-object v7, v0, Lg9/i;->r:[I

    .line 230
    .line 231
    aget v9, v3, v1

    .line 232
    .line 233
    aput v9, v7, v1

    .line 234
    .line 235
    iget-object v7, v0, Lg9/i;->s:[I

    .line 236
    .line 237
    aget v9, v2, v1

    .line 238
    .line 239
    aput v9, v7, v1

    .line 240
    .line 241
    :cond_9
    add-int/lit8 v1, v1, 0x1

    .line 242
    .line 243
    goto :goto_3

    .line 244
    :cond_a
    const/16 v1, 0x4000

    .line 245
    .line 246
    invoke-static {v1}, Landroid/opengl/GLES20;->glClear(I)V

    .line 247
    .line 248
    .line 249
    invoke-static {v9, v6, v7}, Landroid/opengl/GLES20;->glDrawArrays(III)V

    .line 250
    .line 251
    .line 252
    invoke-static {}, Lf9/l;->b()V

    .line 253
    .line 254
    .line 255
    return-void
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
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
.end method

.method public onSurfaceChanged(Ljavax/microedition/khronos/opengles/GL10;II)V
    .locals 0

    const/4 p1, 0x0

    invoke-static {p1, p1, p2, p3}, Landroid/opengl/GLES20;->glViewport(IIII)V

    return-void
.end method

.method public onSurfaceCreated(Ljavax/microedition/khronos/opengles/GL10;Ljavax/microedition/khronos/egl/EGLConfig;)V
    .locals 6

    .line 1
    const-string p1, "varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n"

    .line 2
    .line 3
    const-string p2, "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n"

    .line 4
    .line 5
    invoke-static {p1, p2}, Lf9/l;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iput p1, p0, Lg9/i;->o:I

    .line 10
    .line 11
    invoke-static {p1}, Landroid/opengl/GLES20;->glUseProgram(I)V

    .line 12
    .line 13
    .line 14
    iget p1, p0, Lg9/i;->o:I

    .line 15
    .line 16
    const-string p2, "in_pos"

    .line 17
    .line 18
    invoke-static {p1, p2}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 23
    .line 24
    .line 25
    const/4 v1, 0x2

    .line 26
    const/16 v2, 0x1406

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    const/4 v4, 0x0

    .line 30
    sget-object v5, Lg9/i;->y:Ljava/nio/FloatBuffer;

    .line 31
    .line 32
    invoke-static/range {v0 .. v5}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lg9/i;->p:[I

    .line 36
    .line 37
    iget p2, p0, Lg9/i;->o:I

    .line 38
    .line 39
    const-string v0, "in_tc_y"

    .line 40
    .line 41
    invoke-static {p2, v0}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    const/4 v0, 0x0

    .line 46
    aput p2, p1, v0

    .line 47
    .line 48
    iget-object p1, p0, Lg9/i;->p:[I

    .line 49
    .line 50
    aget p1, p1, v0

    .line 51
    .line 52
    invoke-static {p1}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 53
    .line 54
    .line 55
    iget-object p1, p0, Lg9/i;->p:[I

    .line 56
    .line 57
    iget p2, p0, Lg9/i;->o:I

    .line 58
    .line 59
    const-string v0, "in_tc_u"

    .line 60
    .line 61
    invoke-static {p2, v0}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    const/4 v0, 0x1

    .line 66
    aput p2, p1, v0

    .line 67
    .line 68
    iget-object p1, p0, Lg9/i;->p:[I

    .line 69
    .line 70
    aget p1, p1, v0

    .line 71
    .line 72
    invoke-static {p1}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 73
    .line 74
    .line 75
    iget-object p1, p0, Lg9/i;->p:[I

    .line 76
    .line 77
    iget p2, p0, Lg9/i;->o:I

    .line 78
    .line 79
    const-string v0, "in_tc_v"

    .line 80
    .line 81
    invoke-static {p2, v0}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    .line 82
    .line 83
    .line 84
    move-result p2

    .line 85
    const/4 v0, 0x2

    .line 86
    aput p2, p1, v0

    .line 87
    .line 88
    iget-object p1, p0, Lg9/i;->p:[I

    .line 89
    .line 90
    aget p1, p1, v0

    .line 91
    .line 92
    invoke-static {p1}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 93
    .line 94
    .line 95
    invoke-static {}, Lf9/l;->b()V

    .line 96
    .line 97
    .line 98
    iget p1, p0, Lg9/i;->o:I

    .line 99
    .line 100
    const-string p2, "mColorConversion"

    .line 101
    .line 102
    invoke-static {p1, p2}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    iput p1, p0, Lg9/i;->q:I

    .line 107
    .line 108
    invoke-static {}, Lf9/l;->b()V

    .line 109
    .line 110
    .line 111
    invoke-direct {p0}, Lg9/i;->a()V

    .line 112
    .line 113
    .line 114
    invoke-static {}, Lf9/l;->b()V

    .line 115
    .line 116
    .line 117
    return-void
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
