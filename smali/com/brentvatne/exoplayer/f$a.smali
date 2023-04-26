.class Lcom/brentvatne/exoplayer/f$a;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/brentvatne/exoplayer/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/brentvatne/exoplayer/f;


# direct methods
.method constructor <init>(Lcom/brentvatne/exoplayer/f;)V
    .locals 0

    iput-object p1, p0, Lcom/brentvatne/exoplayer/f$a;->a:Lcom/brentvatne/exoplayer/f;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 14

    .line 1
    iget p1, p1, Landroid/os/Message;->what:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p1, v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    iget-object p1, p0, Lcom/brentvatne/exoplayer/f$a;->a:Lcom/brentvatne/exoplayer/f;

    .line 8
    .line 9
    invoke-static {p1}, Lcom/brentvatne/exoplayer/f;->a(Lcom/brentvatne/exoplayer/f;)Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    iget-object p1, p0, Lcom/brentvatne/exoplayer/f$a;->a:Lcom/brentvatne/exoplayer/f;

    .line 16
    .line 17
    invoke-static {p1}, Lcom/brentvatne/exoplayer/f;->a(Lcom/brentvatne/exoplayer/f;)Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->P()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    const/4 v1, 0x3

    .line 26
    if-ne p1, v1, :cond_1

    .line 27
    .line 28
    iget-object p1, p0, Lcom/brentvatne/exoplayer/f$a;->a:Lcom/brentvatne/exoplayer/f;

    .line 29
    .line 30
    invoke-static {p1}, Lcom/brentvatne/exoplayer/f;->a(Lcom/brentvatne/exoplayer/f;)Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->E()Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    iget-object p1, p0, Lcom/brentvatne/exoplayer/f$a;->a:Lcom/brentvatne/exoplayer/f;

    .line 41
    .line 42
    invoke-static {p1}, Lcom/brentvatne/exoplayer/f;->a(Lcom/brentvatne/exoplayer/f;)Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->Y()J

    .line 47
    .line 48
    .line 49
    move-result-wide v1

    .line 50
    iget-object p1, p0, Lcom/brentvatne/exoplayer/f$a;->a:Lcom/brentvatne/exoplayer/f;

    .line 51
    .line 52
    invoke-static {p1}, Lcom/brentvatne/exoplayer/f;->a(Lcom/brentvatne/exoplayer/f;)Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/e;->Z()I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    int-to-long v3, p1

    .line 61
    iget-object p1, p0, Lcom/brentvatne/exoplayer/f$a;->a:Lcom/brentvatne/exoplayer/f;

    .line 62
    .line 63
    invoke-static {p1}, Lcom/brentvatne/exoplayer/f;->a(Lcom/brentvatne/exoplayer/f;)Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->getDuration()J

    .line 68
    .line 69
    .line 70
    move-result-wide v5

    .line 71
    mul-long/2addr v3, v5

    .line 72
    const-wide/16 v5, 0x64

    .line 73
    .line 74
    div-long/2addr v3, v5

    .line 75
    iget-object p1, p0, Lcom/brentvatne/exoplayer/f$a;->a:Lcom/brentvatne/exoplayer/f;

    .line 76
    .line 77
    invoke-static {p1}, Lcom/brentvatne/exoplayer/f;->d(Lcom/brentvatne/exoplayer/f;)Lcom/brentvatne/exoplayer/h;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    long-to-double v6, v1

    .line 82
    long-to-double v8, v3

    .line 83
    iget-object p1, p0, Lcom/brentvatne/exoplayer/f$a;->a:Lcom/brentvatne/exoplayer/f;

    .line 84
    .line 85
    invoke-static {p1}, Lcom/brentvatne/exoplayer/f;->a(Lcom/brentvatne/exoplayer/f;)Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->getDuration()J

    .line 90
    .line 91
    .line 92
    move-result-wide v3

    .line 93
    long-to-double v10, v3

    .line 94
    iget-object p1, p0, Lcom/brentvatne/exoplayer/f$a;->a:Lcom/brentvatne/exoplayer/f;

    .line 95
    .line 96
    invoke-virtual {p1, v1, v2}, Lcom/brentvatne/exoplayer/f;->j0(J)D

    .line 97
    .line 98
    .line 99
    move-result-wide v12

    .line 100
    invoke-virtual/range {v5 .. v13}, Lcom/brentvatne/exoplayer/h;->o(DDDD)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0, v0}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    iget-object v0, p0, Lcom/brentvatne/exoplayer/f$a;->a:Lcom/brentvatne/exoplayer/f;

    .line 108
    .line 109
    invoke-static {v0}, Lcom/brentvatne/exoplayer/f;->v(Lcom/brentvatne/exoplayer/f;)F

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    int-to-long v0, v0

    .line 118
    invoke-virtual {p0, p1, v0, v1}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 119
    .line 120
    .line 121
    :cond_1
    :goto_0
    return-void
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
