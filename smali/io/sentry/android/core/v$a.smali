.class Lio/sentry/android/core/v$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/android/core/internal/util/k$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/sentry/android/core/v;->q(Lio/sentry/m0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final a:J

.field final b:J

.field c:F

.field final synthetic d:Lio/sentry/android/core/v;


# direct methods
.method constructor <init>(Lio/sentry/android/core/v;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lio/sentry/android/core/v$a;->d:Lio/sentry/android/core/v;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object p1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 7
    .line 8
    const-wide/16 v0, 0x1

    .line 9
    .line 10
    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    iput-wide v0, p0, Lio/sentry/android/core/v$a;->a:J

    .line 15
    .line 16
    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 17
    .line 18
    const-wide/16 v0, 0x2bc

    .line 19
    .line 20
    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    iput-wide v0, p0, Lio/sentry/android/core/v$a;->b:J

    .line 25
    .line 26
    const/4 p1, 0x0

    .line 27
    iput p1, p0, Lio/sentry/android/core/v$a;->c:F

    .line 28
    .line 29
    return-void
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
.end method


# virtual methods
.method public a(Landroid/view/FrameMetrics;F)V
    .locals 6

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-object v2, p0, Lio/sentry/android/core/v$a;->d:Lio/sentry/android/core/v;

    .line 6
    .line 7
    invoke-static {v2}, Lio/sentry/android/core/v;->g(Lio/sentry/android/core/v;)J

    .line 8
    .line 9
    .line 10
    move-result-wide v2

    .line 11
    sub-long/2addr v0, v2

    .line 12
    const-wide/16 v2, 0x0

    .line 13
    .line 14
    cmp-long v2, v0, v2

    .line 15
    .line 16
    if-gez v2, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    const/16 v2, 0x8

    .line 20
    .line 21
    invoke-static {p1, v2}, Landroidx/core/app/k;->a(Landroid/view/FrameMetrics;I)J

    .line 22
    .line 23
    .line 24
    move-result-wide v2

    .line 25
    long-to-float p1, v2

    .line 26
    iget-wide v4, p0, Lio/sentry/android/core/v$a;->a:J

    .line 27
    .line 28
    long-to-float v4, v4

    .line 29
    const/high16 v5, 0x3f800000    # 1.0f

    .line 30
    .line 31
    sub-float v5, p2, v5

    .line 32
    .line 33
    div-float/2addr v4, v5

    .line 34
    cmpl-float p1, p1, v4

    .line 35
    .line 36
    if-lez p1, :cond_1

    .line 37
    .line 38
    const/4 p1, 0x1

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const/4 p1, 0x0

    .line 41
    :goto_0
    const/high16 v4, 0x42c80000    # 100.0f

    .line 42
    .line 43
    mul-float/2addr p2, v4

    .line 44
    float-to-int p2, p2

    .line 45
    int-to-float p2, p2

    .line 46
    div-float/2addr p2, v4

    .line 47
    iget-wide v4, p0, Lio/sentry/android/core/v$a;->b:J

    .line 48
    .line 49
    cmp-long v4, v2, v4

    .line 50
    .line 51
    if-lez v4, :cond_2

    .line 52
    .line 53
    iget-object p1, p0, Lio/sentry/android/core/v$a;->d:Lio/sentry/android/core/v;

    .line 54
    .line 55
    invoke-static {p1}, Lio/sentry/android/core/v;->h(Lio/sentry/android/core/v;)Ljava/util/ArrayDeque;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    new-instance v4, Lio/sentry/profilemeasurements/b;

    .line 60
    .line 61
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-direct {v4, v5, v2}, Lio/sentry/profilemeasurements/b;-><init>(Ljava/lang/Long;Ljava/lang/Number;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, v4}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_2
    if-eqz p1, :cond_3

    .line 77
    .line 78
    iget-object p1, p0, Lio/sentry/android/core/v$a;->d:Lio/sentry/android/core/v;

    .line 79
    .line 80
    invoke-static {p1}, Lio/sentry/android/core/v;->i(Lio/sentry/android/core/v;)Ljava/util/ArrayDeque;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    new-instance v4, Lio/sentry/profilemeasurements/b;

    .line 85
    .line 86
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-direct {v4, v5, v2}, Lio/sentry/profilemeasurements/b;-><init>(Ljava/lang/Long;Ljava/lang/Number;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1, v4}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    :cond_3
    :goto_1
    iget p1, p0, Lio/sentry/android/core/v$a;->c:F

    .line 101
    .line 102
    cmpl-float p1, p2, p1

    .line 103
    .line 104
    if-eqz p1, :cond_4

    .line 105
    .line 106
    iput p2, p0, Lio/sentry/android/core/v$a;->c:F

    .line 107
    .line 108
    iget-object p1, p0, Lio/sentry/android/core/v$a;->d:Lio/sentry/android/core/v;

    .line 109
    .line 110
    invoke-static {p1}, Lio/sentry/android/core/v;->j(Lio/sentry/android/core/v;)Ljava/util/ArrayDeque;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    new-instance v2, Lio/sentry/profilemeasurements/b;

    .line 115
    .line 116
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 121
    .line 122
    .line 123
    move-result-object p2

    .line 124
    invoke-direct {v2, v0, p2}, Lio/sentry/profilemeasurements/b;-><init>(Ljava/lang/Long;Ljava/lang/Number;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1, v2}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    :cond_4
    return-void
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
.end method
