.class final Landroidx/camera/video/internal/encoder/c;
.super Landroidx/camera/video/internal/encoder/c1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/video/internal/encoder/c$b;
    }
.end annotation


# instance fields
.field private final b:Ljava/lang/String;

.field private final c:I

.field private final d:Landroid/util/Size;

.field private final e:I

.field private final f:I

.field private final g:I

.field private final h:I


# direct methods
.method private constructor <init>(Ljava/lang/String;ILandroid/util/Size;IIII)V
    .locals 0

    .line 2
    invoke-direct {p0}, Landroidx/camera/video/internal/encoder/c1;-><init>()V

    .line 3
    iput-object p1, p0, Landroidx/camera/video/internal/encoder/c;->b:Ljava/lang/String;

    .line 4
    iput p2, p0, Landroidx/camera/video/internal/encoder/c;->c:I

    .line 5
    iput-object p3, p0, Landroidx/camera/video/internal/encoder/c;->d:Landroid/util/Size;

    .line 6
    iput p4, p0, Landroidx/camera/video/internal/encoder/c;->e:I

    .line 7
    iput p5, p0, Landroidx/camera/video/internal/encoder/c;->f:I

    .line 8
    iput p6, p0, Landroidx/camera/video/internal/encoder/c;->g:I

    .line 9
    iput p7, p0, Landroidx/camera/video/internal/encoder/c;->h:I

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;ILandroid/util/Size;IIIILandroidx/camera/video/internal/encoder/c$a;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p7}, Landroidx/camera/video/internal/encoder/c;-><init>(Ljava/lang/String;ILandroid/util/Size;IIII)V

    return-void
.end method


# virtual methods
.method public c()I
    .locals 1

    iget v0, p0, Landroidx/camera/video/internal/encoder/c;->h:I

    return v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Landroidx/camera/video/internal/encoder/c;->e:I

    return v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Landroidx/camera/video/internal/encoder/c;->f:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Landroidx/camera/video/internal/encoder/c1;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_2

    .line 9
    .line 10
    check-cast p1, Landroidx/camera/video/internal/encoder/c1;

    .line 11
    .line 12
    iget-object v1, p0, Landroidx/camera/video/internal/encoder/c;->b:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroidx/camera/video/internal/encoder/c1;->g()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    iget v1, p0, Landroidx/camera/video/internal/encoder/c;->c:I

    .line 25
    .line 26
    invoke-virtual {p1}, Landroidx/camera/video/internal/encoder/c1;->h()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-ne v1, v3, :cond_1

    .line 31
    .line 32
    iget-object v1, p0, Landroidx/camera/video/internal/encoder/c;->d:Landroid/util/Size;

    .line 33
    .line 34
    invoke-virtual {p1}, Landroidx/camera/video/internal/encoder/c1;->i()Landroid/util/Size;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {v1, v3}, Landroid/util/Size;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    iget v1, p0, Landroidx/camera/video/internal/encoder/c;->e:I

    .line 45
    .line 46
    invoke-virtual {p1}, Landroidx/camera/video/internal/encoder/c1;->d()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-ne v1, v3, :cond_1

    .line 51
    .line 52
    iget v1, p0, Landroidx/camera/video/internal/encoder/c;->f:I

    .line 53
    .line 54
    invoke-virtual {p1}, Landroidx/camera/video/internal/encoder/c1;->e()I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-ne v1, v3, :cond_1

    .line 59
    .line 60
    iget v1, p0, Landroidx/camera/video/internal/encoder/c;->g:I

    .line 61
    .line 62
    invoke-virtual {p1}, Landroidx/camera/video/internal/encoder/c1;->f()I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-ne v1, v3, :cond_1

    .line 67
    .line 68
    iget v1, p0, Landroidx/camera/video/internal/encoder/c;->h:I

    .line 69
    .line 70
    invoke-virtual {p1}, Landroidx/camera/video/internal/encoder/c1;->c()I

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-ne v1, p1, :cond_1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_1
    move v0, v2

    .line 78
    :goto_0
    return v0

    .line 79
    :cond_2
    return v2
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
.end method

.method public f()I
    .locals 1

    iget v0, p0, Landroidx/camera/video/internal/encoder/c;->g:I

    return v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Landroidx/camera/video/internal/encoder/c;->b:Ljava/lang/String;

    return-object v0
.end method

.method public h()I
    .locals 1

    iget v0, p0, Landroidx/camera/video/internal/encoder/c;->c:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/video/internal/encoder/c;->b:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const v1, 0xf4243

    .line 8
    .line 9
    .line 10
    xor-int/2addr v0, v1

    .line 11
    mul-int/2addr v0, v1

    .line 12
    iget v2, p0, Landroidx/camera/video/internal/encoder/c;->c:I

    .line 13
    .line 14
    xor-int/2addr v0, v2

    .line 15
    mul-int/2addr v0, v1

    .line 16
    iget-object v2, p0, Landroidx/camera/video/internal/encoder/c;->d:Landroid/util/Size;

    .line 17
    .line 18
    invoke-virtual {v2}, Landroid/util/Size;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    xor-int/2addr v0, v2

    .line 23
    mul-int/2addr v0, v1

    .line 24
    iget v2, p0, Landroidx/camera/video/internal/encoder/c;->e:I

    .line 25
    .line 26
    xor-int/2addr v0, v2

    .line 27
    mul-int/2addr v0, v1

    .line 28
    iget v2, p0, Landroidx/camera/video/internal/encoder/c;->f:I

    .line 29
    .line 30
    xor-int/2addr v0, v2

    .line 31
    mul-int/2addr v0, v1

    .line 32
    iget v2, p0, Landroidx/camera/video/internal/encoder/c;->g:I

    .line 33
    .line 34
    xor-int/2addr v0, v2

    .line 35
    mul-int/2addr v0, v1

    .line 36
    iget v1, p0, Landroidx/camera/video/internal/encoder/c;->h:I

    .line 37
    .line 38
    xor-int/2addr v0, v1

    .line 39
    return v0
    .line 40
.end method

.method public i()Landroid/util/Size;
    .locals 1

    iget-object v0, p0, Landroidx/camera/video/internal/encoder/c;->d:Landroid/util/Size;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "VideoEncoderConfig{mimeType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/camera/video/internal/encoder/c;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", profile="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/camera/video/internal/encoder/c;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", resolution="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/camera/video/internal/encoder/c;->d:Landroid/util/Size;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", colorFormat="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/camera/video/internal/encoder/c;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", frameRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/camera/video/internal/encoder/c;->f:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", IFrameInterval="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/camera/video/internal/encoder/c;->g:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", bitrate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/camera/video/internal/encoder/c;->h:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
