.class Lcom/facebook/react/animated/FrameBasedAnimationDriver;
.super Lcom/facebook/react/animated/AnimationDriver;
.source "SourceFile"


# static fields
.field private static final FRAME_TIME_MILLIS:D = 16.666666666666668


# instance fields
.field private mCurrentLoop:I

.field private mFrames:[D

.field private mFromValue:D

.field private mIterations:I

.field private mStartFrameTimeNanos:J

.field private mToValue:D


# direct methods
.method constructor <init>(Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/animated/AnimationDriver;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lcom/facebook/react/animated/FrameBasedAnimationDriver;->resetConfig(Lcom/facebook/react/bridge/ReadableMap;)V

    .line 5
    .line 6
    .line 7
    return-void
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
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
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
.end method


# virtual methods
.method public resetConfig(Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 7

    .line 1
    const-string v0, "frames"

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    iget-object v2, p0, Lcom/facebook/react/animated/FrameBasedAnimationDriver;->mFrames:[D

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    array-length v2, v2

    .line 16
    if-eq v2, v1, :cond_1

    .line 17
    .line 18
    :cond_0
    new-array v2, v1, [D

    .line 19
    .line 20
    iput-object v2, p0, Lcom/facebook/react/animated/FrameBasedAnimationDriver;->mFrames:[D

    .line 21
    .line 22
    :cond_1
    const/4 v2, 0x0

    .line 23
    move v3, v2

    .line 24
    :goto_0
    if-ge v3, v1, :cond_2

    .line 25
    .line 26
    iget-object v4, p0, Lcom/facebook/react/animated/FrameBasedAnimationDriver;->mFrames:[D

    .line 27
    .line 28
    invoke-interface {v0, v3}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    .line 29
    .line 30
    .line 31
    move-result-wide v5

    .line 32
    aput-wide v5, v4, v3

    .line 33
    .line 34
    add-int/lit8 v3, v3, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    const-string v0, "toValue"

    .line 38
    .line 39
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    const-wide/16 v3, 0x0

    .line 44
    .line 45
    if-eqz v1, :cond_4

    .line 46
    .line 47
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getType(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    sget-object v5, Lcom/facebook/react/bridge/ReadableType;->Number:Lcom/facebook/react/bridge/ReadableType;

    .line 52
    .line 53
    if-ne v1, v5, :cond_3

    .line 54
    .line 55
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 56
    .line 57
    .line 58
    move-result-wide v3

    .line 59
    :cond_3
    iput-wide v3, p0, Lcom/facebook/react/animated/FrameBasedAnimationDriver;->mToValue:D

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_4
    iput-wide v3, p0, Lcom/facebook/react/animated/FrameBasedAnimationDriver;->mToValue:D

    .line 63
    .line 64
    :goto_1
    const-string v0, "iterations"

    .line 65
    .line 66
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    const/4 v3, 0x1

    .line 71
    if-eqz v1, :cond_6

    .line 72
    .line 73
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getType(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    sget-object v4, Lcom/facebook/react/bridge/ReadableType;->Number:Lcom/facebook/react/bridge/ReadableType;

    .line 78
    .line 79
    if-ne v1, v4, :cond_5

    .line 80
    .line 81
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    goto :goto_2

    .line 86
    :cond_5
    move p1, v3

    .line 87
    :goto_2
    iput p1, p0, Lcom/facebook/react/animated/FrameBasedAnimationDriver;->mIterations:I

    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_6
    iput v3, p0, Lcom/facebook/react/animated/FrameBasedAnimationDriver;->mIterations:I

    .line 91
    .line 92
    :goto_3
    iput v3, p0, Lcom/facebook/react/animated/FrameBasedAnimationDriver;->mCurrentLoop:I

    .line 93
    .line 94
    iget p1, p0, Lcom/facebook/react/animated/FrameBasedAnimationDriver;->mIterations:I

    .line 95
    .line 96
    if-nez p1, :cond_7

    .line 97
    .line 98
    move v2, v3

    .line 99
    :cond_7
    iput-boolean v2, p0, Lcom/facebook/react/animated/AnimationDriver;->mHasFinished:Z

    .line 100
    .line 101
    const-wide/16 v0, -0x1

    .line 102
    .line 103
    iput-wide v0, p0, Lcom/facebook/react/animated/FrameBasedAnimationDriver;->mStartFrameTimeNanos:J

    .line 104
    .line 105
    return-void
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
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
.end method

.method public runAnimationStep(J)V
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/facebook/react/animated/FrameBasedAnimationDriver;->mStartFrameTimeNanos:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-gez v0, :cond_0

    .line 9
    .line 10
    iput-wide p1, p0, Lcom/facebook/react/animated/FrameBasedAnimationDriver;->mStartFrameTimeNanos:J

    .line 11
    .line 12
    iget v0, p0, Lcom/facebook/react/animated/FrameBasedAnimationDriver;->mCurrentLoop:I

    .line 13
    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lcom/facebook/react/animated/AnimationDriver;->mAnimatedValue:Lcom/facebook/react/animated/ValueAnimatedNode;

    .line 17
    .line 18
    iget-wide v2, v0, Lcom/facebook/react/animated/ValueAnimatedNode;->mValue:D

    .line 19
    .line 20
    iput-wide v2, p0, Lcom/facebook/react/animated/FrameBasedAnimationDriver;->mFromValue:D

    .line 21
    .line 22
    :cond_0
    iget-wide v2, p0, Lcom/facebook/react/animated/FrameBasedAnimationDriver;->mStartFrameTimeNanos:J

    .line 23
    .line 24
    sub-long/2addr p1, v2

    .line 25
    const-wide/32 v2, 0xf4240

    .line 26
    .line 27
    .line 28
    div-long/2addr p1, v2

    .line 29
    long-to-double p1, p1

    .line 30
    const-wide v2, 0x4030aaaaaaaaaaabL    # 16.666666666666668

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    div-double/2addr p1, v2

    .line 36
    invoke-static {p1, p2}, Ljava/lang/Math;->round(D)J

    .line 37
    .line 38
    .line 39
    move-result-wide p1

    .line 40
    long-to-int p1, p1

    .line 41
    if-ltz p1, :cond_5

    .line 42
    .line 43
    iget-boolean p2, p0, Lcom/facebook/react/animated/AnimationDriver;->mHasFinished:Z

    .line 44
    .line 45
    if-eqz p2, :cond_1

    .line 46
    .line 47
    return-void

    .line 48
    :cond_1
    iget-object p2, p0, Lcom/facebook/react/animated/FrameBasedAnimationDriver;->mFrames:[D

    .line 49
    .line 50
    array-length v0, p2

    .line 51
    sub-int/2addr v0, v1

    .line 52
    if-lt p1, v0, :cond_4

    .line 53
    .line 54
    iget-wide p1, p0, Lcom/facebook/react/animated/FrameBasedAnimationDriver;->mToValue:D

    .line 55
    .line 56
    iget v0, p0, Lcom/facebook/react/animated/FrameBasedAnimationDriver;->mIterations:I

    .line 57
    .line 58
    const/4 v2, -0x1

    .line 59
    if-eq v0, v2, :cond_3

    .line 60
    .line 61
    iget v2, p0, Lcom/facebook/react/animated/FrameBasedAnimationDriver;->mCurrentLoop:I

    .line 62
    .line 63
    if-ge v2, v0, :cond_2

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    iput-boolean v1, p0, Lcom/facebook/react/animated/AnimationDriver;->mHasFinished:Z

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_3
    :goto_0
    const-wide/16 v2, -0x1

    .line 70
    .line 71
    iput-wide v2, p0, Lcom/facebook/react/animated/FrameBasedAnimationDriver;->mStartFrameTimeNanos:J

    .line 72
    .line 73
    iget v0, p0, Lcom/facebook/react/animated/FrameBasedAnimationDriver;->mCurrentLoop:I

    .line 74
    .line 75
    add-int/2addr v0, v1

    .line 76
    iput v0, p0, Lcom/facebook/react/animated/FrameBasedAnimationDriver;->mCurrentLoop:I

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_4
    iget-wide v0, p0, Lcom/facebook/react/animated/FrameBasedAnimationDriver;->mFromValue:D

    .line 80
    .line 81
    aget-wide p1, p2, p1

    .line 82
    .line 83
    iget-wide v2, p0, Lcom/facebook/react/animated/FrameBasedAnimationDriver;->mToValue:D

    .line 84
    .line 85
    sub-double/2addr v2, v0

    .line 86
    mul-double/2addr p1, v2

    .line 87
    add-double/2addr p1, v0

    .line 88
    :goto_1
    iget-object v0, p0, Lcom/facebook/react/animated/AnimationDriver;->mAnimatedValue:Lcom/facebook/react/animated/ValueAnimatedNode;

    .line 89
    .line 90
    iput-wide p1, v0, Lcom/facebook/react/animated/ValueAnimatedNode;->mValue:D

    .line 91
    .line 92
    return-void

    .line 93
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 94
    .line 95
    const-string p2, "Calculated frame index should never be lower than 0"

    .line 96
    .line 97
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    throw p1
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
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
.end method
