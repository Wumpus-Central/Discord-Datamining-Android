.class Li0/o0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/video/internal/encoder/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li0/o0;->J(Li0/o0$i;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroidx/concurrent/futures/c$a;

.field final synthetic c:Li0/o0$i;

.field final synthetic d:Li0/o0;


# direct methods
.method constructor <init>(Li0/o0;Landroidx/concurrent/futures/c$a;Li0/o0$i;)V
    .locals 0

    iput-object p1, p0, Li0/o0$b;->d:Li0/o0;

    iput-object p2, p0, Li0/o0$b;->b:Landroidx/concurrent/futures/c$a;

    iput-object p3, p0, Li0/o0$b;->c:Li0/o0$i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b(Landroidx/camera/video/internal/encoder/b1;)V
    .locals 1

    iget-object v0, p0, Li0/o0$b;->d:Li0/o0;

    iput-object p1, v0, Li0/o0;->A:Landroidx/camera/video/internal/encoder/b1;

    return-void
.end method

.method public c(Landroidx/camera/video/internal/encoder/d;)V
    .locals 1

    iget-object v0, p0, Li0/o0$b;->b:Landroidx/concurrent/futures/c$a;

    invoke-virtual {v0, p1}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public d()V
    .locals 2

    iget-object v0, p0, Li0/o0$b;->b:Landroidx/concurrent/futures/c$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z

    return-void
.end method

.method public e(Landroidx/camera/video/internal/encoder/e;)V
    .locals 3

    .line 1
    iget-object v0, p0, Li0/o0$b;->d:Li0/o0;

    .line 2
    .line 3
    iget-object v1, v0, Li0/o0;->w:Landroid/media/MediaMuxer;

    .line 4
    .line 5
    if-nez v1, :cond_7

    .line 6
    .line 7
    iget-boolean v1, v0, Li0/o0;->p:Z

    .line 8
    .line 9
    const-string v2, "Recorder"

    .line 10
    .line 11
    if-nez v1, :cond_6

    .line 12
    .line 13
    iget-object v0, v0, Li0/o0;->L:Landroidx/camera/video/internal/encoder/e;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Landroidx/camera/video/internal/encoder/e;->close()V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Li0/o0$b;->d:Li0/o0;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    iput-object v1, v0, Li0/o0;->L:Landroidx/camera/video/internal/encoder/e;

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v0, 0x0

    .line 28
    :goto_0
    invoke-interface {p1}, Landroidx/camera/video/internal/encoder/e;->P()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_4

    .line 33
    .line 34
    iget-object v1, p0, Li0/o0$b;->d:Li0/o0;

    .line 35
    .line 36
    iput-object p1, v1, Li0/o0;->L:Landroidx/camera/video/internal/encoder/e;

    .line 37
    .line 38
    invoke-virtual {v1}, Li0/o0;->E()Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-eqz p1, :cond_3

    .line 43
    .line 44
    iget-object p1, p0, Li0/o0$b;->d:Li0/o0;

    .line 45
    .line 46
    iget-object p1, p1, Li0/o0;->M:Landroidx/camera/video/internal/encoder/e;

    .line 47
    .line 48
    if-eqz p1, :cond_1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    if-eqz v0, :cond_2

    .line 52
    .line 53
    const-string p1, "Replaced cached video keyframe with newer keyframe."

    .line 54
    .line 55
    invoke-static {v2, p1}, Landroidx/camera/core/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_2
    const-string p1, "Cached video keyframe while we wait for first audio sample before starting muxer."

    .line 60
    .line 61
    invoke-static {v2, p1}, Landroidx/camera/core/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_3
    :goto_1
    const-string p1, "Received video keyframe. Starting muxer..."

    .line 66
    .line 67
    invoke-static {v2, p1}, Landroidx/camera/core/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    iget-object p1, p0, Li0/o0$b;->d:Li0/o0;

    .line 71
    .line 72
    iget-object v0, p0, Li0/o0$b;->c:Li0/o0$i;

    .line 73
    .line 74
    invoke-virtual {p1, v0}, Li0/o0;->t0(Li0/o0$i;)V

    .line 75
    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_4
    if-eqz v0, :cond_5

    .line 79
    .line 80
    const-string v0, "Dropped cached keyframe since we have new video data and have not yet received audio data."

    .line 81
    .line 82
    invoke-static {v2, v0}, Landroidx/camera/core/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    :cond_5
    const-string v0, "Dropped video data since muxer has not yet started and data is not a keyframe."

    .line 86
    .line 87
    invoke-static {v2, v0}, Landroidx/camera/core/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    iget-object v0, p0, Li0/o0$b;->d:Li0/o0;

    .line 91
    .line 92
    iget-object v0, v0, Li0/o0;->z:Landroidx/camera/video/internal/encoder/a0;

    .line 93
    .line 94
    invoke-virtual {v0}, Landroidx/camera/video/internal/encoder/a0;->N()V

    .line 95
    .line 96
    .line 97
    invoke-interface {p1}, Landroidx/camera/video/internal/encoder/e;->close()V

    .line 98
    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_6
    const-string v0, "Drop video data since recording is stopping."

    .line 102
    .line 103
    invoke-static {v2, v0}, Landroidx/camera/core/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    invoke-interface {p1}, Landroidx/camera/video/internal/encoder/e;->close()V

    .line 107
    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_7
    :try_start_0
    iget-object v1, p0, Li0/o0$b;->c:Li0/o0$i;

    .line 111
    .line 112
    invoke-virtual {v0, p1, v1}, Li0/o0;->H0(Landroidx/camera/video/internal/encoder/e;Li0/o0$i;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 113
    .line 114
    .line 115
    if-eqz p1, :cond_8

    .line 116
    .line 117
    invoke-interface {p1}, Landroidx/camera/video/internal/encoder/e;->close()V

    .line 118
    .line 119
    .line 120
    :cond_8
    :goto_2
    return-void

    .line 121
    :catchall_0
    move-exception v0

    .line 122
    if-eqz p1, :cond_9

    .line 123
    .line 124
    :try_start_1
    invoke-interface {p1}, Landroidx/camera/video/internal/encoder/e;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 125
    .line 126
    .line 127
    goto :goto_3

    .line 128
    :catchall_1
    move-exception p1

    .line 129
    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 130
    .line 131
    .line 132
    :cond_9
    :goto_3
    throw v0
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

.method public synthetic f()V
    .locals 0

    invoke-static {p0}, Landroidx/camera/video/internal/encoder/k;->a(Landroidx/camera/video/internal/encoder/l;)V

    return-void
.end method
