.class public Lcom/facebook/react/animated/DecayAnimation;
.super Lcom/facebook/react/animated/AnimationDriver;
.source "SourceFile"


# instance fields
.field private mCurrentLoop:I

.field private mDeceleration:D

.field private mFromValue:D

.field private mIterations:I

.field private mLastValue:D

.field private mStartFrameTimeMillis:J

.field private final mVelocity:D


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/animated/AnimationDriver;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "velocity"

    .line 5
    .line 6
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    iput-wide v0, p0, Lcom/facebook/react/animated/DecayAnimation;->mVelocity:D

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lcom/facebook/react/animated/DecayAnimation;->resetConfig(Lcom/facebook/react/bridge/ReadableMap;)V

    .line 13
    .line 14
    .line 15
    return-void
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
    .locals 3

    .line 1
    const-string v0, "deceleration"

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iput-wide v0, p0, Lcom/facebook/react/animated/DecayAnimation;->mDeceleration:D

    .line 8
    .line 9
    const-string v0, "iterations"

    .line 10
    .line 11
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move p1, v2

    .line 24
    :goto_0
    iput p1, p0, Lcom/facebook/react/animated/DecayAnimation;->mIterations:I

    .line 25
    .line 26
    iput v2, p0, Lcom/facebook/react/animated/DecayAnimation;->mCurrentLoop:I

    .line 27
    .line 28
    if-nez p1, :cond_1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    const/4 v2, 0x0

    .line 32
    :goto_1
    iput-boolean v2, p0, Lcom/facebook/react/animated/AnimationDriver;->mHasFinished:Z

    .line 33
    .line 34
    const-wide/16 v0, -0x1

    .line 35
    .line 36
    iput-wide v0, p0, Lcom/facebook/react/animated/DecayAnimation;->mStartFrameTimeMillis:J

    .line 37
    .line 38
    const-wide/16 v0, 0x0

    .line 39
    .line 40
    iput-wide v0, p0, Lcom/facebook/react/animated/DecayAnimation;->mFromValue:D

    .line 41
    .line 42
    iput-wide v0, p0, Lcom/facebook/react/animated/DecayAnimation;->mLastValue:D

    .line 43
    .line 44
    return-void
    .line 45
    .line 46
.end method

.method public runAnimationStep(J)V
    .locals 12

    .line 1
    const-wide/32 v0, 0xf4240

    .line 2
    .line 3
    .line 4
    div-long/2addr p1, v0

    .line 5
    iget-wide v0, p0, Lcom/facebook/react/animated/DecayAnimation;->mStartFrameTimeMillis:J

    .line 6
    .line 7
    const-wide/16 v2, -0x1

    .line 8
    .line 9
    cmp-long v0, v0, v2

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    const-wide/16 v0, 0x10

    .line 14
    .line 15
    sub-long v0, p1, v0

    .line 16
    .line 17
    iput-wide v0, p0, Lcom/facebook/react/animated/DecayAnimation;->mStartFrameTimeMillis:J

    .line 18
    .line 19
    iget-wide v0, p0, Lcom/facebook/react/animated/DecayAnimation;->mFromValue:D

    .line 20
    .line 21
    iget-wide v4, p0, Lcom/facebook/react/animated/DecayAnimation;->mLastValue:D

    .line 22
    .line 23
    cmpl-double v4, v0, v4

    .line 24
    .line 25
    if-nez v4, :cond_0

    .line 26
    .line 27
    iget-object v0, p0, Lcom/facebook/react/animated/AnimationDriver;->mAnimatedValue:Lcom/facebook/react/animated/ValueAnimatedNode;

    .line 28
    .line 29
    iget-wide v0, v0, Lcom/facebook/react/animated/ValueAnimatedNode;->mValue:D

    .line 30
    .line 31
    iput-wide v0, p0, Lcom/facebook/react/animated/DecayAnimation;->mFromValue:D

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    iget-object v4, p0, Lcom/facebook/react/animated/AnimationDriver;->mAnimatedValue:Lcom/facebook/react/animated/ValueAnimatedNode;

    .line 35
    .line 36
    iput-wide v0, v4, Lcom/facebook/react/animated/ValueAnimatedNode;->mValue:D

    .line 37
    .line 38
    :goto_0
    iget-object v0, p0, Lcom/facebook/react/animated/AnimationDriver;->mAnimatedValue:Lcom/facebook/react/animated/ValueAnimatedNode;

    .line 39
    .line 40
    iget-wide v0, v0, Lcom/facebook/react/animated/ValueAnimatedNode;->mValue:D

    .line 41
    .line 42
    iput-wide v0, p0, Lcom/facebook/react/animated/DecayAnimation;->mLastValue:D

    .line 43
    .line 44
    :cond_1
    iget-wide v0, p0, Lcom/facebook/react/animated/DecayAnimation;->mFromValue:D

    .line 45
    .line 46
    iget-wide v4, p0, Lcom/facebook/react/animated/DecayAnimation;->mVelocity:D

    .line 47
    .line 48
    iget-wide v6, p0, Lcom/facebook/react/animated/DecayAnimation;->mDeceleration:D

    .line 49
    .line 50
    const-wide/high16 v8, 0x3ff0000000000000L    # 1.0

    .line 51
    .line 52
    sub-double v10, v8, v6

    .line 53
    .line 54
    div-double/2addr v4, v10

    .line 55
    sub-double v6, v8, v6

    .line 56
    .line 57
    neg-double v6, v6

    .line 58
    iget-wide v10, p0, Lcom/facebook/react/animated/DecayAnimation;->mStartFrameTimeMillis:J

    .line 59
    .line 60
    sub-long/2addr p1, v10

    .line 61
    long-to-double p1, p1

    .line 62
    mul-double/2addr v6, p1

    .line 63
    invoke-static {v6, v7}, Ljava/lang/Math;->exp(D)D

    .line 64
    .line 65
    .line 66
    move-result-wide p1

    .line 67
    sub-double/2addr v8, p1

    .line 68
    mul-double/2addr v4, v8

    .line 69
    add-double/2addr v0, v4

    .line 70
    iget-wide p1, p0, Lcom/facebook/react/animated/DecayAnimation;->mLastValue:D

    .line 71
    .line 72
    sub-double/2addr p1, v0

    .line 73
    invoke-static {p1, p2}, Ljava/lang/Math;->abs(D)D

    .line 74
    .line 75
    .line 76
    move-result-wide p1

    .line 77
    const-wide v4, 0x3fb999999999999aL    # 0.1

    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    cmpg-double p1, p1, v4

    .line 83
    .line 84
    if-gez p1, :cond_4

    .line 85
    .line 86
    iget p1, p0, Lcom/facebook/react/animated/DecayAnimation;->mIterations:I

    .line 87
    .line 88
    const/4 p2, -0x1

    .line 89
    const/4 v4, 0x1

    .line 90
    if-eq p1, p2, :cond_3

    .line 91
    .line 92
    iget p2, p0, Lcom/facebook/react/animated/DecayAnimation;->mCurrentLoop:I

    .line 93
    .line 94
    if-ge p2, p1, :cond_2

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_2
    iput-boolean v4, p0, Lcom/facebook/react/animated/AnimationDriver;->mHasFinished:Z

    .line 98
    .line 99
    return-void

    .line 100
    :cond_3
    :goto_1
    iput-wide v2, p0, Lcom/facebook/react/animated/DecayAnimation;->mStartFrameTimeMillis:J

    .line 101
    .line 102
    iget p1, p0, Lcom/facebook/react/animated/DecayAnimation;->mCurrentLoop:I

    .line 103
    .line 104
    add-int/2addr p1, v4

    .line 105
    iput p1, p0, Lcom/facebook/react/animated/DecayAnimation;->mCurrentLoop:I

    .line 106
    .line 107
    :cond_4
    iput-wide v0, p0, Lcom/facebook/react/animated/DecayAnimation;->mLastValue:D

    .line 108
    .line 109
    iget-object p1, p0, Lcom/facebook/react/animated/AnimationDriver;->mAnimatedValue:Lcom/facebook/react/animated/ValueAnimatedNode;

    .line 110
    .line 111
    iput-wide v0, p1, Lcom/facebook/react/animated/ValueAnimatedNode;->mValue:D

    .line 112
    .line 113
    return-void
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
