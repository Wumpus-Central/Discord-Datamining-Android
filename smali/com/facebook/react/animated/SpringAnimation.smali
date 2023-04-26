.class Lcom/facebook/react/animated/SpringAnimation;
.super Lcom/facebook/react/animated/AnimationDriver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/animated/SpringAnimation$PhysicsState;
    }
.end annotation


# static fields
.field private static final MAX_DELTA_TIME_SEC:D = 0.064

.field private static final SOLVER_TIMESTEP_SEC:D = 0.001


# instance fields
.field private mCurrentLoop:I

.field private final mCurrentState:Lcom/facebook/react/animated/SpringAnimation$PhysicsState;

.field private mDisplacementFromRestThreshold:D

.field private mEndValue:D

.field private mInitialVelocity:D

.field private mIterations:I

.field private mLastTime:J

.field private mOriginalValue:D

.field private mOvershootClampingEnabled:Z

.field private mRestSpeedThreshold:D

.field private mSpringDamping:D

.field private mSpringMass:D

.field private mSpringStarted:Z

.field private mSpringStiffness:D

.field private mStartValue:D

.field private mTimeAccumulator:D


# direct methods
.method constructor <init>(Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/animated/AnimationDriver;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/facebook/react/animated/SpringAnimation$PhysicsState;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Lcom/facebook/react/animated/SpringAnimation$PhysicsState;-><init>(Lcom/facebook/react/animated/SpringAnimation$1;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/facebook/react/animated/SpringAnimation;->mCurrentState:Lcom/facebook/react/animated/SpringAnimation$PhysicsState;

    .line 11
    .line 12
    const-string v1, "initialVelocity"

    .line 13
    .line 14
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 15
    .line 16
    .line 17
    move-result-wide v1

    .line 18
    iput-wide v1, v0, Lcom/facebook/react/animated/SpringAnimation$PhysicsState;->velocity:D

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Lcom/facebook/react/animated/SpringAnimation;->resetConfig(Lcom/facebook/react/bridge/ReadableMap;)V

    .line 21
    .line 22
    .line 23
    return-void
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

.method private advance(D)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-direct/range {p0 .. p0}, Lcom/facebook/react/animated/SpringAnimation;->isAtRest()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const-wide v1, 0x3fb0624dd2f1a9fcL    # 0.064

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    cmpl-double v3, p1, v1

    .line 16
    .line 17
    if-lez v3, :cond_1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    move-wide/from16 v1, p1

    .line 21
    .line 22
    :goto_0
    iget-wide v3, v0, Lcom/facebook/react/animated/SpringAnimation;->mTimeAccumulator:D

    .line 23
    .line 24
    add-double/2addr v3, v1

    .line 25
    iput-wide v3, v0, Lcom/facebook/react/animated/SpringAnimation;->mTimeAccumulator:D

    .line 26
    .line 27
    iget-wide v1, v0, Lcom/facebook/react/animated/SpringAnimation;->mSpringDamping:D

    .line 28
    .line 29
    iget-wide v3, v0, Lcom/facebook/react/animated/SpringAnimation;->mSpringMass:D

    .line 30
    .line 31
    iget-wide v5, v0, Lcom/facebook/react/animated/SpringAnimation;->mSpringStiffness:D

    .line 32
    .line 33
    iget-wide v7, v0, Lcom/facebook/react/animated/SpringAnimation;->mInitialVelocity:D

    .line 34
    .line 35
    neg-double v7, v7

    .line 36
    mul-double v9, v5, v3

    .line 37
    .line 38
    invoke-static {v9, v10}, Ljava/lang/Math;->sqrt(D)D

    .line 39
    .line 40
    .line 41
    move-result-wide v9

    .line 42
    const-wide/high16 v11, 0x4000000000000000L    # 2.0

    .line 43
    .line 44
    mul-double/2addr v9, v11

    .line 45
    div-double/2addr v1, v9

    .line 46
    div-double/2addr v5, v3

    .line 47
    invoke-static {v5, v6}, Ljava/lang/Math;->sqrt(D)D

    .line 48
    .line 49
    .line 50
    move-result-wide v3

    .line 51
    mul-double v5, v1, v1

    .line 52
    .line 53
    const-wide/high16 v9, 0x3ff0000000000000L    # 1.0

    .line 54
    .line 55
    sub-double v5, v9, v5

    .line 56
    .line 57
    invoke-static {v5, v6}, Ljava/lang/Math;->sqrt(D)D

    .line 58
    .line 59
    .line 60
    move-result-wide v5

    .line 61
    mul-double/2addr v5, v3

    .line 62
    iget-wide v11, v0, Lcom/facebook/react/animated/SpringAnimation;->mEndValue:D

    .line 63
    .line 64
    iget-wide v13, v0, Lcom/facebook/react/animated/SpringAnimation;->mStartValue:D

    .line 65
    .line 66
    sub-double/2addr v11, v13

    .line 67
    iget-wide v13, v0, Lcom/facebook/react/animated/SpringAnimation;->mTimeAccumulator:D

    .line 68
    .line 69
    cmpg-double v15, v1, v9

    .line 70
    .line 71
    if-gez v15, :cond_2

    .line 72
    .line 73
    neg-double v9, v1

    .line 74
    mul-double/2addr v9, v3

    .line 75
    mul-double/2addr v9, v13

    .line 76
    invoke-static {v9, v10}, Ljava/lang/Math;->exp(D)D

    .line 77
    .line 78
    .line 79
    move-result-wide v9

    .line 80
    move-wide/from16 p1, v9

    .line 81
    .line 82
    iget-wide v9, v0, Lcom/facebook/react/animated/SpringAnimation;->mEndValue:D

    .line 83
    .line 84
    mul-double/2addr v1, v3

    .line 85
    mul-double v3, v1, v11

    .line 86
    .line 87
    add-double/2addr v7, v3

    .line 88
    div-double v3, v7, v5

    .line 89
    .line 90
    mul-double/2addr v13, v5

    .line 91
    invoke-static {v13, v14}, Ljava/lang/Math;->sin(D)D

    .line 92
    .line 93
    .line 94
    move-result-wide v15

    .line 95
    mul-double/2addr v3, v15

    .line 96
    invoke-static {v13, v14}, Ljava/lang/Math;->cos(D)D

    .line 97
    .line 98
    .line 99
    move-result-wide v15

    .line 100
    mul-double/2addr v15, v11

    .line 101
    add-double/2addr v3, v15

    .line 102
    move-wide/from16 v15, p1

    .line 103
    .line 104
    mul-double/2addr v3, v15

    .line 105
    sub-double/2addr v9, v3

    .line 106
    mul-double/2addr v1, v15

    .line 107
    invoke-static {v13, v14}, Ljava/lang/Math;->sin(D)D

    .line 108
    .line 109
    .line 110
    move-result-wide v3

    .line 111
    mul-double/2addr v3, v7

    .line 112
    div-double/2addr v3, v5

    .line 113
    invoke-static {v13, v14}, Ljava/lang/Math;->cos(D)D

    .line 114
    .line 115
    .line 116
    move-result-wide v17

    .line 117
    mul-double v17, v17, v11

    .line 118
    .line 119
    add-double v3, v3, v17

    .line 120
    .line 121
    mul-double/2addr v1, v3

    .line 122
    invoke-static {v13, v14}, Ljava/lang/Math;->cos(D)D

    .line 123
    .line 124
    .line 125
    move-result-wide v3

    .line 126
    mul-double/2addr v3, v7

    .line 127
    mul-double/2addr v5, v11

    .line 128
    invoke-static {v13, v14}, Ljava/lang/Math;->sin(D)D

    .line 129
    .line 130
    .line 131
    move-result-wide v7

    .line 132
    mul-double/2addr v5, v7

    .line 133
    sub-double/2addr v3, v5

    .line 134
    mul-double/2addr v3, v15

    .line 135
    sub-double/2addr v1, v3

    .line 136
    goto :goto_1

    .line 137
    :cond_2
    neg-double v1, v3

    .line 138
    mul-double/2addr v1, v13

    .line 139
    invoke-static {v1, v2}, Ljava/lang/Math;->exp(D)D

    .line 140
    .line 141
    .line 142
    move-result-wide v1

    .line 143
    iget-wide v5, v0, Lcom/facebook/react/animated/SpringAnimation;->mEndValue:D

    .line 144
    .line 145
    mul-double v15, v3, v11

    .line 146
    .line 147
    add-double/2addr v15, v7

    .line 148
    mul-double/2addr v15, v13

    .line 149
    add-double/2addr v15, v11

    .line 150
    mul-double/2addr v15, v1

    .line 151
    sub-double/2addr v5, v15

    .line 152
    mul-double v15, v13, v3

    .line 153
    .line 154
    sub-double/2addr v15, v9

    .line 155
    mul-double/2addr v7, v15

    .line 156
    mul-double/2addr v13, v11

    .line 157
    mul-double/2addr v3, v3

    .line 158
    mul-double/2addr v13, v3

    .line 159
    add-double/2addr v7, v13

    .line 160
    mul-double/2addr v1, v7

    .line 161
    move-wide v9, v5

    .line 162
    :goto_1
    iget-object v3, v0, Lcom/facebook/react/animated/SpringAnimation;->mCurrentState:Lcom/facebook/react/animated/SpringAnimation$PhysicsState;

    .line 163
    .line 164
    iput-wide v9, v3, Lcom/facebook/react/animated/SpringAnimation$PhysicsState;->position:D

    .line 165
    .line 166
    iput-wide v1, v3, Lcom/facebook/react/animated/SpringAnimation$PhysicsState;->velocity:D

    .line 167
    .line 168
    invoke-direct/range {p0 .. p0}, Lcom/facebook/react/animated/SpringAnimation;->isAtRest()Z

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    if-nez v1, :cond_3

    .line 173
    .line 174
    iget-boolean v1, v0, Lcom/facebook/react/animated/SpringAnimation;->mOvershootClampingEnabled:Z

    .line 175
    .line 176
    if-eqz v1, :cond_5

    .line 177
    .line 178
    invoke-direct/range {p0 .. p0}, Lcom/facebook/react/animated/SpringAnimation;->isOvershooting()Z

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    if-eqz v1, :cond_5

    .line 183
    .line 184
    :cond_3
    iget-wide v1, v0, Lcom/facebook/react/animated/SpringAnimation;->mSpringStiffness:D

    .line 185
    .line 186
    const-wide/16 v3, 0x0

    .line 187
    .line 188
    cmpl-double v1, v1, v3

    .line 189
    .line 190
    if-lez v1, :cond_4

    .line 191
    .line 192
    iget-wide v1, v0, Lcom/facebook/react/animated/SpringAnimation;->mEndValue:D

    .line 193
    .line 194
    iput-wide v1, v0, Lcom/facebook/react/animated/SpringAnimation;->mStartValue:D

    .line 195
    .line 196
    iget-object v5, v0, Lcom/facebook/react/animated/SpringAnimation;->mCurrentState:Lcom/facebook/react/animated/SpringAnimation$PhysicsState;

    .line 197
    .line 198
    iput-wide v1, v5, Lcom/facebook/react/animated/SpringAnimation$PhysicsState;->position:D

    .line 199
    .line 200
    goto :goto_2

    .line 201
    :cond_4
    iget-object v1, v0, Lcom/facebook/react/animated/SpringAnimation;->mCurrentState:Lcom/facebook/react/animated/SpringAnimation$PhysicsState;

    .line 202
    .line 203
    iget-wide v1, v1, Lcom/facebook/react/animated/SpringAnimation$PhysicsState;->position:D

    .line 204
    .line 205
    iput-wide v1, v0, Lcom/facebook/react/animated/SpringAnimation;->mEndValue:D

    .line 206
    .line 207
    iput-wide v1, v0, Lcom/facebook/react/animated/SpringAnimation;->mStartValue:D

    .line 208
    .line 209
    :goto_2
    iget-object v1, v0, Lcom/facebook/react/animated/SpringAnimation;->mCurrentState:Lcom/facebook/react/animated/SpringAnimation$PhysicsState;

    .line 210
    .line 211
    iput-wide v3, v1, Lcom/facebook/react/animated/SpringAnimation$PhysicsState;->velocity:D

    .line 212
    .line 213
    :cond_5
    return-void
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

.method private getDisplacementDistanceForState(Lcom/facebook/react/animated/SpringAnimation$PhysicsState;)D
    .locals 4

    iget-wide v0, p0, Lcom/facebook/react/animated/SpringAnimation;->mEndValue:D

    iget-wide v2, p1, Lcom/facebook/react/animated/SpringAnimation$PhysicsState;->position:D

    sub-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    return-wide v0
.end method

.method private isAtRest()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/facebook/react/animated/SpringAnimation;->mCurrentState:Lcom/facebook/react/animated/SpringAnimation$PhysicsState;

    .line 2
    .line 3
    iget-wide v0, v0, Lcom/facebook/react/animated/SpringAnimation$PhysicsState;->velocity:D

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    iget-wide v2, p0, Lcom/facebook/react/animated/SpringAnimation;->mRestSpeedThreshold:D

    .line 10
    .line 11
    cmpg-double v0, v0, v2

    .line 12
    .line 13
    if-gtz v0, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, Lcom/facebook/react/animated/SpringAnimation;->mCurrentState:Lcom/facebook/react/animated/SpringAnimation$PhysicsState;

    .line 16
    .line 17
    invoke-direct {p0, v0}, Lcom/facebook/react/animated/SpringAnimation;->getDisplacementDistanceForState(Lcom/facebook/react/animated/SpringAnimation$PhysicsState;)D

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    iget-wide v2, p0, Lcom/facebook/react/animated/SpringAnimation;->mDisplacementFromRestThreshold:D

    .line 22
    .line 23
    cmpg-double v0, v0, v2

    .line 24
    .line 25
    if-lez v0, :cond_0

    .line 26
    .line 27
    iget-wide v0, p0, Lcom/facebook/react/animated/SpringAnimation;->mSpringStiffness:D

    .line 28
    .line 29
    const-wide/16 v2, 0x0

    .line 30
    .line 31
    cmpl-double v0, v0, v2

    .line 32
    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    :cond_0
    const/4 v0, 0x1

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 v0, 0x0

    .line 38
    :goto_0
    return v0
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
.end method

.method private isOvershooting()Z
    .locals 6

    iget-wide v0, p0, Lcom/facebook/react/animated/SpringAnimation;->mSpringStiffness:D

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_2

    iget-wide v0, p0, Lcom/facebook/react/animated/SpringAnimation;->mStartValue:D

    iget-wide v2, p0, Lcom/facebook/react/animated/SpringAnimation;->mEndValue:D

    cmpg-double v4, v0, v2

    if-gez v4, :cond_0

    iget-object v4, p0, Lcom/facebook/react/animated/SpringAnimation;->mCurrentState:Lcom/facebook/react/animated/SpringAnimation$PhysicsState;

    iget-wide v4, v4, Lcom/facebook/react/animated/SpringAnimation$PhysicsState;->position:D

    cmpl-double v4, v4, v2

    if-gtz v4, :cond_1

    :cond_0
    cmpl-double v0, v0, v2

    if-lez v0, :cond_2

    iget-object v0, p0, Lcom/facebook/react/animated/SpringAnimation;->mCurrentState:Lcom/facebook/react/animated/SpringAnimation$PhysicsState;

    iget-wide v0, v0, Lcom/facebook/react/animated/SpringAnimation$PhysicsState;->position:D

    cmpg-double v0, v0, v2

    if-gez v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public resetConfig(Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 3

    .line 1
    const-string v0, "stiffness"

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iput-wide v0, p0, Lcom/facebook/react/animated/SpringAnimation;->mSpringStiffness:D

    .line 8
    .line 9
    const-string v0, "damping"

    .line 10
    .line 11
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    iput-wide v0, p0, Lcom/facebook/react/animated/SpringAnimation;->mSpringDamping:D

    .line 16
    .line 17
    const-string v0, "mass"

    .line 18
    .line 19
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    iput-wide v0, p0, Lcom/facebook/react/animated/SpringAnimation;->mSpringMass:D

    .line 24
    .line 25
    iget-object v0, p0, Lcom/facebook/react/animated/SpringAnimation;->mCurrentState:Lcom/facebook/react/animated/SpringAnimation$PhysicsState;

    .line 26
    .line 27
    iget-wide v0, v0, Lcom/facebook/react/animated/SpringAnimation$PhysicsState;->velocity:D

    .line 28
    .line 29
    iput-wide v0, p0, Lcom/facebook/react/animated/SpringAnimation;->mInitialVelocity:D

    .line 30
    .line 31
    const-string v0, "toValue"

    .line 32
    .line 33
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    iput-wide v0, p0, Lcom/facebook/react/animated/SpringAnimation;->mEndValue:D

    .line 38
    .line 39
    const-string v0, "restSpeedThreshold"

    .line 40
    .line 41
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 42
    .line 43
    .line 44
    move-result-wide v0

    .line 45
    iput-wide v0, p0, Lcom/facebook/react/animated/SpringAnimation;->mRestSpeedThreshold:D

    .line 46
    .line 47
    const-string v0, "restDisplacementThreshold"

    .line 48
    .line 49
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 50
    .line 51
    .line 52
    move-result-wide v0

    .line 53
    iput-wide v0, p0, Lcom/facebook/react/animated/SpringAnimation;->mDisplacementFromRestThreshold:D

    .line 54
    .line 55
    const-string v0, "overshootClamping"

    .line 56
    .line 57
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    iput-boolean v0, p0, Lcom/facebook/react/animated/SpringAnimation;->mOvershootClampingEnabled:Z

    .line 62
    .line 63
    const-string v0, "iterations"

    .line 64
    .line 65
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    const/4 v2, 0x1

    .line 70
    if-eqz v1, :cond_0

    .line 71
    .line 72
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    goto :goto_0

    .line 77
    :cond_0
    move p1, v2

    .line 78
    :goto_0
    iput p1, p0, Lcom/facebook/react/animated/SpringAnimation;->mIterations:I

    .line 79
    .line 80
    const/4 v0, 0x0

    .line 81
    if-nez p1, :cond_1

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_1
    move v2, v0

    .line 85
    :goto_1
    iput-boolean v2, p0, Lcom/facebook/react/animated/AnimationDriver;->mHasFinished:Z

    .line 86
    .line 87
    iput v0, p0, Lcom/facebook/react/animated/SpringAnimation;->mCurrentLoop:I

    .line 88
    .line 89
    const-wide/16 v1, 0x0

    .line 90
    .line 91
    iput-wide v1, p0, Lcom/facebook/react/animated/SpringAnimation;->mTimeAccumulator:D

    .line 92
    .line 93
    iput-boolean v0, p0, Lcom/facebook/react/animated/SpringAnimation;->mSpringStarted:Z

    .line 94
    .line 95
    return-void
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
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
.end method

.method public runAnimationStep(J)V
    .locals 6

    .line 1
    const-wide/32 v0, 0xf4240

    .line 2
    .line 3
    .line 4
    div-long/2addr p1, v0

    .line 5
    iget-boolean v0, p0, Lcom/facebook/react/animated/SpringAnimation;->mSpringStarted:Z

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    iget v0, p0, Lcom/facebook/react/animated/SpringAnimation;->mCurrentLoop:I

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/facebook/react/animated/AnimationDriver;->mAnimatedValue:Lcom/facebook/react/animated/ValueAnimatedNode;

    .line 15
    .line 16
    iget-wide v2, v0, Lcom/facebook/react/animated/ValueAnimatedNode;->mValue:D

    .line 17
    .line 18
    iput-wide v2, p0, Lcom/facebook/react/animated/SpringAnimation;->mOriginalValue:D

    .line 19
    .line 20
    iput v1, p0, Lcom/facebook/react/animated/SpringAnimation;->mCurrentLoop:I

    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/animated/SpringAnimation;->mCurrentState:Lcom/facebook/react/animated/SpringAnimation$PhysicsState;

    .line 23
    .line 24
    iget-object v2, p0, Lcom/facebook/react/animated/AnimationDriver;->mAnimatedValue:Lcom/facebook/react/animated/ValueAnimatedNode;

    .line 25
    .line 26
    iget-wide v2, v2, Lcom/facebook/react/animated/ValueAnimatedNode;->mValue:D

    .line 27
    .line 28
    iput-wide v2, v0, Lcom/facebook/react/animated/SpringAnimation$PhysicsState;->position:D

    .line 29
    .line 30
    iput-wide v2, p0, Lcom/facebook/react/animated/SpringAnimation;->mStartValue:D

    .line 31
    .line 32
    iput-wide p1, p0, Lcom/facebook/react/animated/SpringAnimation;->mLastTime:J

    .line 33
    .line 34
    const-wide/16 v2, 0x0

    .line 35
    .line 36
    iput-wide v2, p0, Lcom/facebook/react/animated/SpringAnimation;->mTimeAccumulator:D

    .line 37
    .line 38
    iput-boolean v1, p0, Lcom/facebook/react/animated/SpringAnimation;->mSpringStarted:Z

    .line 39
    .line 40
    :cond_1
    iget-wide v2, p0, Lcom/facebook/react/animated/SpringAnimation;->mLastTime:J

    .line 41
    .line 42
    sub-long v2, p1, v2

    .line 43
    .line 44
    long-to-double v2, v2

    .line 45
    const-wide v4, 0x408f400000000000L    # 1000.0

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    div-double/2addr v2, v4

    .line 51
    invoke-direct {p0, v2, v3}, Lcom/facebook/react/animated/SpringAnimation;->advance(D)V

    .line 52
    .line 53
    .line 54
    iput-wide p1, p0, Lcom/facebook/react/animated/SpringAnimation;->mLastTime:J

    .line 55
    .line 56
    iget-object p1, p0, Lcom/facebook/react/animated/AnimationDriver;->mAnimatedValue:Lcom/facebook/react/animated/ValueAnimatedNode;

    .line 57
    .line 58
    iget-object p2, p0, Lcom/facebook/react/animated/SpringAnimation;->mCurrentState:Lcom/facebook/react/animated/SpringAnimation$PhysicsState;

    .line 59
    .line 60
    iget-wide v2, p2, Lcom/facebook/react/animated/SpringAnimation$PhysicsState;->position:D

    .line 61
    .line 62
    iput-wide v2, p1, Lcom/facebook/react/animated/ValueAnimatedNode;->mValue:D

    .line 63
    .line 64
    invoke-direct {p0}, Lcom/facebook/react/animated/SpringAnimation;->isAtRest()Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-eqz p1, :cond_4

    .line 69
    .line 70
    iget p1, p0, Lcom/facebook/react/animated/SpringAnimation;->mIterations:I

    .line 71
    .line 72
    const/4 p2, -0x1

    .line 73
    if-eq p1, p2, :cond_3

    .line 74
    .line 75
    iget p2, p0, Lcom/facebook/react/animated/SpringAnimation;->mCurrentLoop:I

    .line 76
    .line 77
    if-ge p2, p1, :cond_2

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_2
    iput-boolean v1, p0, Lcom/facebook/react/animated/AnimationDriver;->mHasFinished:Z

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_3
    :goto_0
    const/4 p1, 0x0

    .line 84
    iput-boolean p1, p0, Lcom/facebook/react/animated/SpringAnimation;->mSpringStarted:Z

    .line 85
    .line 86
    iget-object p1, p0, Lcom/facebook/react/animated/AnimationDriver;->mAnimatedValue:Lcom/facebook/react/animated/ValueAnimatedNode;

    .line 87
    .line 88
    iget-wide v2, p0, Lcom/facebook/react/animated/SpringAnimation;->mOriginalValue:D

    .line 89
    .line 90
    iput-wide v2, p1, Lcom/facebook/react/animated/ValueAnimatedNode;->mValue:D

    .line 91
    .line 92
    iget p1, p0, Lcom/facebook/react/animated/SpringAnimation;->mCurrentLoop:I

    .line 93
    .line 94
    add-int/2addr p1, v1

    .line 95
    iput p1, p0, Lcom/facebook/react/animated/SpringAnimation;->mCurrentLoop:I

    .line 96
    .line 97
    :cond_4
    :goto_1
    return-void
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
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
.end method
