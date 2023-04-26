.class public final Lcom/facebook/imagepipeline/producers/a1;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(I)I
    .locals 1

    int-to-float p0, p0

    const v0, 0x3faaaaab

    mul-float/2addr p0, v0

    float-to-int p0, p0

    return p0
.end method

.method public static b(IILcom/facebook/imagepipeline/common/ResizeOptions;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-nez p2, :cond_1

    .line 4
    .line 5
    invoke-static {p0}, Lcom/facebook/imagepipeline/producers/a1;->a(I)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    int-to-float p0, p0

    .line 10
    const/high16 p2, 0x45000000    # 2048.0f

    .line 11
    .line 12
    cmpl-float p0, p0, p2

    .line 13
    .line 14
    if-ltz p0, :cond_0

    .line 15
    .line 16
    invoke-static {p1}, Lcom/facebook/imagepipeline/producers/a1;->a(I)I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    const/16 p1, 0x800

    .line 21
    .line 22
    if-lt p0, p1, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v0, v1

    .line 26
    :goto_0
    return v0

    .line 27
    :cond_1
    invoke-static {p0}, Lcom/facebook/imagepipeline/producers/a1;->a(I)I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    iget v2, p2, Lcom/facebook/imagepipeline/common/ResizeOptions;->a:I

    .line 32
    .line 33
    if-lt p0, v2, :cond_2

    .line 34
    .line 35
    invoke-static {p1}, Lcom/facebook/imagepipeline/producers/a1;->a(I)I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    iget p1, p2, Lcom/facebook/imagepipeline/common/ResizeOptions;->b:I

    .line 40
    .line 41
    if-lt p0, p1, :cond_2

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    move v0, v1

    .line 45
    :goto_1
    return v0
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
.end method

.method public static c(Lu5/e;Lcom/facebook/imagepipeline/common/ResizeOptions;)Z
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_0
    invoke-virtual {p0}, Lu5/e;->H()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/16 v1, 0x5a

    .line 10
    .line 11
    if-eq v0, v1, :cond_1

    .line 12
    .line 13
    const/16 v1, 0x10e

    .line 14
    .line 15
    if-eq v0, v1, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0}, Lu5/e;->getWidth()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-virtual {p0}, Lu5/e;->getHeight()I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    invoke-static {v0, p0, p1}, Lcom/facebook/imagepipeline/producers/a1;->b(IILcom/facebook/imagepipeline/common/ResizeOptions;)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    return p0

    .line 30
    :cond_1
    invoke-virtual {p0}, Lu5/e;->getHeight()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-virtual {p0}, Lu5/e;->getWidth()I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    invoke-static {v0, p0, p1}, Lcom/facebook/imagepipeline/producers/a1;->b(IILcom/facebook/imagepipeline/common/ResizeOptions;)Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    return p0
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
.end method
