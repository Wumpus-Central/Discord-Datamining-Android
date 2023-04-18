.class Li0/o0$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/video/internal/encoder/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li0/o0;->I(Li0/o0$i;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
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

    iput-object p1, p0, Li0/o0$c;->d:Li0/o0;

    iput-object p2, p0, Li0/o0$c;->b:Landroidx/concurrent/futures/c$a;

    iput-object p3, p0, Li0/o0$c;->c:Li0/o0$i;

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

    iget-object v0, p0, Li0/o0$c;->d:Li0/o0;

    iput-object p1, v0, Li0/o0;->C:Landroidx/camera/video/internal/encoder/b1;

    return-void
.end method

.method public c(Landroidx/camera/video/internal/encoder/d;)V
    .locals 2

    .line 1
    iget-object v0, p0, Li0/o0$c;->d:Li0/o0;

    .line 2
    .line 3
    sget-object v1, Li0/o0$g;->o:Li0/o0$g;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Li0/o0;->r0(Li0/o0$g;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Li0/o0$c;->d:Li0/o0;

    .line 9
    .line 10
    iput-object p1, v0, Li0/o0;->N:Ljava/lang/Throwable;

    .line 11
    .line 12
    invoke-virtual {v0}, Li0/o0;->E0()V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Li0/o0$c;->b:Landroidx/concurrent/futures/c$a;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-virtual {p1, v0}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    return-void
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

.method public d()V
    .locals 2

    iget-object v0, p0, Li0/o0$c;->b:Landroidx/concurrent/futures/c$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z

    return-void
.end method

.method public e(Landroidx/camera/video/internal/encoder/e;)V
    .locals 3

    .line 1
    iget-object v0, p0, Li0/o0$c;->d:Li0/o0;

    .line 2
    .line 3
    iget-object v1, v0, Li0/o0;->D:Li0/o0$g;

    .line 4
    .line 5
    sget-object v2, Li0/o0$g;->m:Li0/o0$g;

    .line 6
    .line 7
    if-eq v1, v2, :cond_7

    .line 8
    .line 9
    iget-object v1, v0, Li0/o0;->w:Landroid/media/MediaMuxer;

    .line 10
    .line 11
    if-nez v1, :cond_4

    .line 12
    .line 13
    iget-boolean v1, v0, Li0/o0;->p:Z

    .line 14
    .line 15
    const-string v2, "Recorder"

    .line 16
    .line 17
    if-nez v1, :cond_3

    .line 18
    .line 19
    iget-object v0, v0, Li0/o0;->M:Landroidx/camera/video/internal/encoder/e;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-interface {v0}, Landroidx/camera/video/internal/encoder/e;->close()V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Li0/o0$c;->d:Li0/o0;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    iput-object v1, v0, Li0/o0;->M:Landroidx/camera/video/internal/encoder/e;

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v0, 0x0

    .line 34
    :goto_0
    iget-object v1, p0, Li0/o0$c;->d:Li0/o0;

    .line 35
    .line 36
    iput-object p1, v1, Li0/o0;->M:Landroidx/camera/video/internal/encoder/e;

    .line 37
    .line 38
    iget-object p1, v1, Li0/o0;->L:Landroidx/camera/video/internal/encoder/e;

    .line 39
    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    const-string p1, "Received audio data. Starting muxer..."

    .line 43
    .line 44
    invoke-static {v2, p1}, Landroidx/camera/core/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    iget-object p1, p0, Li0/o0$c;->d:Li0/o0;

    .line 48
    .line 49
    iget-object v0, p0, Li0/o0$c;->c:Li0/o0$i;

    .line 50
    .line 51
    invoke-virtual {p1, v0}, Li0/o0;->t0(Li0/o0$i;)V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    if-eqz v0, :cond_2

    .line 56
    .line 57
    const-string p1, "Replaced cached audio data with newer data."

    .line 58
    .line 59
    invoke-static {v2, p1}, Landroidx/camera/core/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    const-string p1, "Cached audio data while we wait for video keyframe before starting muxer."

    .line 64
    .line 65
    invoke-static {v2, p1}, Landroidx/camera/core/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_3
    const-string v0, "Drop audio data since recording is stopping."

    .line 70
    .line 71
    invoke-static {v2, v0}, Landroidx/camera/core/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-interface {p1}, Landroidx/camera/video/internal/encoder/e;->close()V

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_4
    :try_start_0
    iget-object v1, p0, Li0/o0$c;->c:Li0/o0$i;

    .line 79
    .line 80
    invoke-virtual {v0, p1, v1}, Li0/o0;->G0(Landroidx/camera/video/internal/encoder/e;Li0/o0$i;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    .line 82
    .line 83
    if-eqz p1, :cond_5

    .line 84
    .line 85
    invoke-interface {p1}, Landroidx/camera/video/internal/encoder/e;->close()V

    .line 86
    .line 87
    .line 88
    :cond_5
    :goto_1
    return-void

    .line 89
    :catchall_0
    move-exception v0

    .line 90
    if-eqz p1, :cond_6

    .line 91
    .line 92
    :try_start_1
    invoke-interface {p1}, Landroidx/camera/video/internal/encoder/e;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 93
    .line 94
    .line 95
    goto :goto_2

    .line 96
    :catchall_1
    move-exception p1

    .line 97
    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 98
    .line 99
    .line 100
    :cond_6
    :goto_2
    throw v0

    .line 101
    :cond_7
    new-instance p1, Ljava/lang/AssertionError;

    .line 102
    .line 103
    const-string v0, "Audio is not enabled but audio encoded data is produced."

    .line 104
    .line 105
    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    throw p1
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

.method public synthetic f()V
    .locals 0

    invoke-static {p0}, Landroidx/camera/video/internal/encoder/k;->a(Landroidx/camera/video/internal/encoder/l;)V

    return-void
.end method
