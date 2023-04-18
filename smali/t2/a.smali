.class public Lt2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:Lg2/i;

.field public final b:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public c:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public final d:Landroid/view/animation/Interpolator;

.field public final e:Landroid/view/animation/Interpolator;

.field public final f:Landroid/view/animation/Interpolator;

.field public final g:F

.field public h:Ljava/lang/Float;

.field private i:F

.field private j:F

.field private k:I

.field private l:I

.field private m:F

.field private n:F

.field public o:Landroid/graphics/PointF;

.field public p:Landroid/graphics/PointF;


# direct methods
.method public constructor <init>(Lg2/i;Ljava/lang/Object;Ljava/lang/Object;Landroid/view/animation/Interpolator;FLjava/lang/Float;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg2/i;",
            "TT;TT;",
            "Landroid/view/animation/Interpolator;",
            "F",
            "Ljava/lang/Float;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, -0x358c9d09

    .line 2
    iput v0, p0, Lt2/a;->i:F

    .line 3
    iput v0, p0, Lt2/a;->j:F

    const v0, 0x2ec8fb09

    .line 4
    iput v0, p0, Lt2/a;->k:I

    .line 5
    iput v0, p0, Lt2/a;->l:I

    const/4 v0, 0x1

    .line 6
    iput v0, p0, Lt2/a;->m:F

    .line 7
    iput v0, p0, Lt2/a;->n:F

    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, Lt2/a;->o:Landroid/graphics/PointF;

    .line 9
    iput-object v0, p0, Lt2/a;->p:Landroid/graphics/PointF;

    .line 10
    iput-object p1, p0, Lt2/a;->a:Lg2/i;

    .line 11
    iput-object p2, p0, Lt2/a;->b:Ljava/lang/Object;

    .line 12
    iput-object p3, p0, Lt2/a;->c:Ljava/lang/Object;

    .line 13
    iput-object p4, p0, Lt2/a;->d:Landroid/view/animation/Interpolator;

    .line 14
    iput-object v0, p0, Lt2/a;->e:Landroid/view/animation/Interpolator;

    .line 15
    iput-object v0, p0, Lt2/a;->f:Landroid/view/animation/Interpolator;

    .line 16
    iput p5, p0, Lt2/a;->g:F

    .line 17
    iput-object p6, p0, Lt2/a;->h:Ljava/lang/Float;

    return-void
.end method

.method public constructor <init>(Lg2/i;Ljava/lang/Object;Ljava/lang/Object;Landroid/view/animation/Interpolator;Landroid/view/animation/Interpolator;FLjava/lang/Float;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg2/i;",
            "TT;TT;",
            "Landroid/view/animation/Interpolator;",
            "Landroid/view/animation/Interpolator;",
            "F",
            "Ljava/lang/Float;",
            ")V"
        }
    .end annotation

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, -0x358c9d09

    .line 19
    iput v0, p0, Lt2/a;->i:F

    .line 20
    iput v0, p0, Lt2/a;->j:F

    const v0, 0x2ec8fb09

    .line 21
    iput v0, p0, Lt2/a;->k:I

    .line 22
    iput v0, p0, Lt2/a;->l:I

    const/4 v0, 0x1

    .line 23
    iput v0, p0, Lt2/a;->m:F

    .line 24
    iput v0, p0, Lt2/a;->n:F

    const/4 v0, 0x0

    .line 25
    iput-object v0, p0, Lt2/a;->o:Landroid/graphics/PointF;

    .line 26
    iput-object v0, p0, Lt2/a;->p:Landroid/graphics/PointF;

    .line 27
    iput-object p1, p0, Lt2/a;->a:Lg2/i;

    .line 28
    iput-object p2, p0, Lt2/a;->b:Ljava/lang/Object;

    .line 29
    iput-object p3, p0, Lt2/a;->c:Ljava/lang/Object;

    .line 30
    iput-object v0, p0, Lt2/a;->d:Landroid/view/animation/Interpolator;

    .line 31
    iput-object p4, p0, Lt2/a;->e:Landroid/view/animation/Interpolator;

    .line 32
    iput-object p5, p0, Lt2/a;->f:Landroid/view/animation/Interpolator;

    .line 33
    iput p6, p0, Lt2/a;->g:F

    .line 34
    iput-object p7, p0, Lt2/a;->h:Ljava/lang/Float;

    return-void
.end method

.method protected constructor <init>(Lg2/i;Ljava/lang/Object;Ljava/lang/Object;Landroid/view/animation/Interpolator;Landroid/view/animation/Interpolator;Landroid/view/animation/Interpolator;FLjava/lang/Float;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg2/i;",
            "TT;TT;",
            "Landroid/view/animation/Interpolator;",
            "Landroid/view/animation/Interpolator;",
            "Landroid/view/animation/Interpolator;",
            "F",
            "Ljava/lang/Float;",
            ")V"
        }
    .end annotation

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, -0x358c9d09

    .line 36
    iput v0, p0, Lt2/a;->i:F

    .line 37
    iput v0, p0, Lt2/a;->j:F

    const v0, 0x2ec8fb09

    .line 38
    iput v0, p0, Lt2/a;->k:I

    .line 39
    iput v0, p0, Lt2/a;->l:I

    const/4 v0, 0x1

    .line 40
    iput v0, p0, Lt2/a;->m:F

    .line 41
    iput v0, p0, Lt2/a;->n:F

    const/4 v0, 0x0

    .line 42
    iput-object v0, p0, Lt2/a;->o:Landroid/graphics/PointF;

    .line 43
    iput-object v0, p0, Lt2/a;->p:Landroid/graphics/PointF;

    .line 44
    iput-object p1, p0, Lt2/a;->a:Lg2/i;

    .line 45
    iput-object p2, p0, Lt2/a;->b:Ljava/lang/Object;

    .line 46
    iput-object p3, p0, Lt2/a;->c:Ljava/lang/Object;

    .line 47
    iput-object p4, p0, Lt2/a;->d:Landroid/view/animation/Interpolator;

    .line 48
    iput-object p5, p0, Lt2/a;->e:Landroid/view/animation/Interpolator;

    .line 49
    iput-object p6, p0, Lt2/a;->f:Landroid/view/animation/Interpolator;

    .line 50
    iput p7, p0, Lt2/a;->g:F

    .line 51
    iput-object p8, p0, Lt2/a;->h:Ljava/lang/Float;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, -0x358c9d09

    .line 53
    iput v0, p0, Lt2/a;->i:F

    .line 54
    iput v0, p0, Lt2/a;->j:F

    const v0, 0x2ec8fb09

    .line 55
    iput v0, p0, Lt2/a;->k:I

    .line 56
    iput v0, p0, Lt2/a;->l:I

    const/4 v0, 0x1

    .line 57
    iput v0, p0, Lt2/a;->m:F

    .line 58
    iput v0, p0, Lt2/a;->n:F

    const/4 v1, 0x0

    .line 59
    iput-object v1, p0, Lt2/a;->o:Landroid/graphics/PointF;

    .line 60
    iput-object v1, p0, Lt2/a;->p:Landroid/graphics/PointF;

    .line 61
    iput-object v1, p0, Lt2/a;->a:Lg2/i;

    .line 62
    iput-object p1, p0, Lt2/a;->b:Ljava/lang/Object;

    .line 63
    iput-object p1, p0, Lt2/a;->c:Ljava/lang/Object;

    .line 64
    iput-object v1, p0, Lt2/a;->d:Landroid/view/animation/Interpolator;

    .line 65
    iput-object v1, p0, Lt2/a;->e:Landroid/view/animation/Interpolator;

    .line 66
    iput-object v1, p0, Lt2/a;->f:Landroid/view/animation/Interpolator;

    .line 67
    iput v0, p0, Lt2/a;->g:F

    const p1, 0x7f7fffff    # Float.MAX_VALUE

    .line 68
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    iput-object p1, p0, Lt2/a;->h:Ljava/lang/Float;

    return-void
.end method


# virtual methods
.method public a(F)Z
    .locals 1

    invoke-virtual {p0}, Lt2/a;->e()F

    move-result v0

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_0

    invoke-virtual {p0}, Lt2/a;->b()F

    move-result v0

    cmpg-float p1, p1, v0

    if-gez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public b()F
    .locals 3

    .line 1
    iget-object v0, p0, Lt2/a;->a:Lg2/i;

    .line 2
    .line 3
    const/high16 v1, 0x3f800000    # 1.0f

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return v1

    .line 8
    :cond_0
    iget v0, p0, Lt2/a;->n:F

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    cmpl-float v0, v0, v2

    .line 12
    .line 13
    if-nez v0, :cond_2

    .line 14
    .line 15
    iget-object v0, p0, Lt2/a;->h:Ljava/lang/Float;

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    iput v1, p0, Lt2/a;->n:F

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    invoke-virtual {p0}, Lt2/a;->e()F

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget-object v1, p0, Lt2/a;->h:Ljava/lang/Float;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    iget v2, p0, Lt2/a;->g:F

    .line 33
    .line 34
    sub-float/2addr v1, v2

    .line 35
    iget-object v2, p0, Lt2/a;->a:Lg2/i;

    .line 36
    .line 37
    invoke-virtual {v2}, Lg2/i;->e()F

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    div-float/2addr v1, v2

    .line 42
    add-float/2addr v0, v1

    .line 43
    iput v0, p0, Lt2/a;->n:F

    .line 44
    .line 45
    :cond_2
    :goto_0
    iget v0, p0, Lt2/a;->n:F

    .line 46
    .line 47
    return v0
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

.method public c()F
    .locals 2

    .line 1
    iget v0, p0, Lt2/a;->j:F

    .line 2
    .line 3
    const v1, -0x358c9d09

    .line 4
    .line 5
    .line 6
    cmpl-float v0, v0, v1

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lt2/a;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Ljava/lang/Float;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iput v0, p0, Lt2/a;->j:F

    .line 19
    .line 20
    :cond_0
    iget v0, p0, Lt2/a;->j:F

    .line 21
    .line 22
    return v0
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

.method public d()I
    .locals 2

    .line 1
    iget v0, p0, Lt2/a;->l:I

    .line 2
    .line 3
    const v1, 0x2ec8fb09

    .line 4
    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lt2/a;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ljava/lang/Integer;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iput v0, p0, Lt2/a;->l:I

    .line 17
    .line 18
    :cond_0
    iget v0, p0, Lt2/a;->l:I

    .line 19
    .line 20
    return v0
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

.method public e()F
    .locals 3

    .line 1
    iget-object v0, p0, Lt2/a;->a:Lg2/i;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    iget v1, p0, Lt2/a;->m:F

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    cmpl-float v1, v1, v2

    .line 11
    .line 12
    if-nez v1, :cond_1

    .line 13
    .line 14
    iget v1, p0, Lt2/a;->g:F

    .line 15
    .line 16
    invoke-virtual {v0}, Lg2/i;->p()F

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    sub-float/2addr v1, v0

    .line 21
    iget-object v0, p0, Lt2/a;->a:Lg2/i;

    .line 22
    .line 23
    invoke-virtual {v0}, Lg2/i;->e()F

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    div-float/2addr v1, v0

    .line 28
    iput v1, p0, Lt2/a;->m:F

    .line 29
    .line 30
    :cond_1
    iget v0, p0, Lt2/a;->m:F

    .line 31
    .line 32
    return v0
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method

.method public f()F
    .locals 2

    .line 1
    iget v0, p0, Lt2/a;->i:F

    .line 2
    .line 3
    const v1, -0x358c9d09

    .line 4
    .line 5
    .line 6
    cmpl-float v0, v0, v1

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lt2/a;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Ljava/lang/Float;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iput v0, p0, Lt2/a;->i:F

    .line 19
    .line 20
    :cond_0
    iget v0, p0, Lt2/a;->i:F

    .line 21
    .line 22
    return v0
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

.method public g()I
    .locals 2

    .line 1
    iget v0, p0, Lt2/a;->k:I

    .line 2
    .line 3
    const v1, 0x2ec8fb09

    .line 4
    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lt2/a;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ljava/lang/Integer;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iput v0, p0, Lt2/a;->k:I

    .line 17
    .line 18
    :cond_0
    iget v0, p0, Lt2/a;->k:I

    .line 19
    .line 20
    return v0
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

.method public h()Z
    .locals 1

    iget-object v0, p0, Lt2/a;->d:Landroid/view/animation/Interpolator;

    if-nez v0, :cond_0

    iget-object v0, p0, Lt2/a;->e:Landroid/view/animation/Interpolator;

    if-nez v0, :cond_0

    iget-object v0, p0, Lt2/a;->f:Landroid/view/animation/Interpolator;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Keyframe{startValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lt2/a;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", endValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lt2/a;->c:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", startFrame="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lt2/a;->g:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", endFrame="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lt2/a;->h:Ljava/lang/Float;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", interpolator="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lt2/a;->d:Landroid/view/animation/Interpolator;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
