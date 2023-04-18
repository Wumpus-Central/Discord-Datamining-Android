.class Li0/c1$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/a2$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li0/c1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lw/a2$a<",
        "Li0/z0;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Li0/c1;


# direct methods
.method constructor <init>(Li0/c1;)V
    .locals 0

    iput-object p1, p0, Li0/c1$b;->a:Li0/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b(Li0/c1$b;Lfc/b;Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Li0/c1$b;->e(Lfc/b;Ljava/util/concurrent/atomic/AtomicReference;)V

    return-void
.end method

.method public static synthetic c(Li0/c1$b;Ljava/util/concurrent/atomic/AtomicReference;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Li0/c1$b;->d(Ljava/util/concurrent/atomic/AtomicReference;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private synthetic d(Ljava/util/concurrent/atomic/AtomicReference;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Li0/c1$b;->a:Li0/c1;

    .line 2
    .line 3
    iget-object v0, v0, Li0/c1;->o:Lw/k2$b;

    .line 4
    .line 5
    const-string v1, "androidx.camera.video.VideoCapture.streamUpdate"

    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v0, v1, v2}, Lw/k2$b;->l(Ljava/lang/String;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Li0/c1$b;->a:Li0/c1;

    .line 19
    .line 20
    iget-object v0, v0, Li0/c1;->l:Ljava/lang/Object;

    .line 21
    .line 22
    monitor-enter v0

    .line 23
    :try_start_0
    iget-object v1, p0, Li0/c1$b;->a:Li0/c1;

    .line 24
    .line 25
    iget-object v1, v1, Li0/c1;->p:Landroidx/concurrent/futures/c$a;

    .line 26
    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    new-instance v2, Ljava/lang/RuntimeException;

    .line 30
    .line 31
    const-string v3, "A newer surface update is completed."

    .line 32
    .line 33
    invoke-direct {v2, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v2}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    .line 37
    .line 38
    .line 39
    :cond_0
    iget-object v1, p0, Li0/c1$b;->a:Li0/c1;

    .line 40
    .line 41
    iput-object p2, v1, Li0/c1;->p:Landroidx/concurrent/futures/c$a;

    .line 42
    .line 43
    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    const-string p1, "androidx.camera.video.VideoCapture.streamUpdate"

    .line 48
    .line 49
    return-object p1

    .line 50
    :catchall_0
    move-exception p1

    .line 51
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 52
    throw p1
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
.end method

.method private synthetic e(Lfc/b;Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 2

    .line 1
    invoke-interface {p1}, Ljava/util/concurrent/Future;->isDone()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-nez p1, :cond_1

    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Landroidx/concurrent/futures/c$a;

    .line 12
    .line 13
    new-instance v0, Ljava/util/concurrent/TimeoutException;

    .line 14
    .line 15
    const-string v1, "The surface isn\'t updated within: 1000"

    .line 16
    .line 17
    invoke-direct {v0, v1}, Ljava/util/concurrent/TimeoutException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Li0/c1$b;->a:Li0/c1;

    .line 24
    .line 25
    iget-object p1, p1, Li0/c1;->l:Ljava/lang/Object;

    .line 26
    .line 27
    monitor-enter p1

    .line 28
    :try_start_0
    iget-object v0, p0, Li0/c1$b;->a:Li0/c1;

    .line 29
    .line 30
    iget-object v0, v0, Li0/c1;->p:Landroidx/concurrent/futures/c$a;

    .line 31
    .line 32
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    if-ne v0, p2, :cond_0

    .line 37
    .line 38
    iget-object p2, p0, Li0/c1$b;->a:Li0/c1;

    .line 39
    .line 40
    const/4 v0, 0x0

    .line 41
    iput-object v0, p2, Li0/c1;->p:Landroidx/concurrent/futures/c$a;

    .line 42
    .line 43
    :cond_0
    monitor-exit p1

    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception p2

    .line 46
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    throw p2

    .line 48
    :cond_1
    :goto_0
    return-void
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
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Li0/z0;

    invoke-virtual {p0, p1}, Li0/c1$b;->f(Li0/z0;)V

    return-void
.end method

.method public f(Li0/z0;)V
    .locals 7

    .line 1
    if-eqz p1, :cond_5

    .line 2
    .line 3
    iget-object v0, p0, Li0/c1$b;->a:Li0/c1;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/camera/core/w2;->c()Lw/g0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object v0, p0, Li0/c1$b;->a:Li0/c1;

    .line 13
    .line 14
    iget-object v0, v0, Li0/c1;->n:Li0/z0;

    .line 15
    .line 16
    invoke-virtual {v0}, Li0/z0;->b()Li0/z0$a;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {p1}, Li0/z0;->b()Li0/z0$a;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-eq v0, v1, :cond_3

    .line 25
    .line 26
    iget-object v0, p0, Li0/c1$b;->a:Li0/c1;

    .line 27
    .line 28
    iget-object v0, v0, Li0/c1;->o:Lw/k2$b;

    .line 29
    .line 30
    invoke-virtual {v0}, Lw/k2$b;->n()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Li0/z0;->b()Li0/z0$a;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    sget-object v1, Li0/z0$a;->k:Li0/z0$a;

    .line 38
    .line 39
    if-ne v0, v1, :cond_1

    .line 40
    .line 41
    const/4 v0, 0x1

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    const/4 v0, 0x0

    .line 44
    :goto_0
    if-eqz v0, :cond_2

    .line 45
    .line 46
    iget-object v1, p0, Li0/c1$b;->a:Li0/c1;

    .line 47
    .line 48
    iget-object v2, v1, Li0/c1;->o:Lw/k2$b;

    .line 49
    .line 50
    iget-object v1, v1, Li0/c1;->m:Lw/w0;

    .line 51
    .line 52
    invoke-virtual {v2, v1}, Lw/k2$b;->k(Lw/w0;)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    iget-object v1, p0, Li0/c1$b;->a:Li0/c1;

    .line 57
    .line 58
    iget-object v2, v1, Li0/c1;->o:Lw/k2$b;

    .line 59
    .line 60
    iget-object v1, v1, Li0/c1;->m:Lw/w0;

    .line 61
    .line 62
    invoke-virtual {v2, v1}, Lw/k2$b;->h(Lw/w0;)V

    .line 63
    .line 64
    .line 65
    :goto_1
    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 66
    .line 67
    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 68
    .line 69
    .line 70
    new-instance v2, Li0/d1;

    .line 71
    .line 72
    invoke-direct {v2, p0, v1}, Li0/d1;-><init>(Li0/c1$b;Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 73
    .line 74
    .line 75
    invoke-static {v2}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)Lfc/b;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-static {}, Lx/a;->e()Ljava/util/concurrent/ScheduledExecutorService;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    new-instance v4, Li0/e1;

    .line 84
    .line 85
    invoke-direct {v4, p0, v2, v1}, Li0/e1;-><init>(Li0/c1$b;Lfc/b;Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 86
    .line 87
    .line 88
    const-wide/16 v5, 0x3e8

    .line 89
    .line 90
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 91
    .line 92
    invoke-interface {v3, v4, v5, v6, v1}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    new-instance v3, Li0/c1$b$a;

    .line 97
    .line 98
    invoke-direct {v3, p0, v0, v1}, Li0/c1$b$a;-><init>(Li0/c1$b;ZLjava/util/concurrent/ScheduledFuture;)V

    .line 99
    .line 100
    .line 101
    invoke-static {}, Lx/a;->a()Ljava/util/concurrent/Executor;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-static {v2, v3, v0}, Ly/f;->b(Lfc/b;Ly/c;Ljava/util/concurrent/Executor;)V

    .line 106
    .line 107
    .line 108
    iget-object v0, p0, Li0/c1$b;->a:Li0/c1;

    .line 109
    .line 110
    iget-object v1, v0, Li0/c1;->o:Lw/k2$b;

    .line 111
    .line 112
    invoke-virtual {v1}, Lw/k2$b;->m()Lw/k2;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-static {v0, v1}, Li0/c1;->L(Li0/c1;Lw/k2;)V

    .line 117
    .line 118
    .line 119
    iget-object v0, p0, Li0/c1$b;->a:Li0/c1;

    .line 120
    .line 121
    invoke-static {v0}, Li0/c1;->M(Li0/c1;)V

    .line 122
    .line 123
    .line 124
    :cond_3
    iget-object v0, p0, Li0/c1$b;->a:Li0/c1;

    .line 125
    .line 126
    iget-object v0, v0, Li0/c1;->n:Li0/z0;

    .line 127
    .line 128
    invoke-virtual {v0}, Li0/z0;->a()Ljava/lang/Integer;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    sget-object v1, Li0/z0;->a:Ljava/lang/Integer;

    .line 133
    .line 134
    invoke-virtual {v0, v1}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    if-nez v1, :cond_4

    .line 139
    .line 140
    invoke-virtual {p1}, Li0/z0;->a()Ljava/lang/Integer;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    invoke-virtual {v0, v1}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    if-nez v0, :cond_4

    .line 149
    .line 150
    iget-object p1, p0, Li0/c1$b;->a:Li0/c1;

    .line 151
    .line 152
    invoke-static {p1}, Li0/c1;->N(Li0/c1;)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    iget-object v1, p0, Li0/c1$b;->a:Li0/c1;

    .line 157
    .line 158
    invoke-virtual {v1}, Landroidx/camera/core/w2;->f()Lw/x2;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    check-cast v1, Lj0/a;

    .line 163
    .line 164
    iget-object v2, p0, Li0/c1$b;->a:Li0/c1;

    .line 165
    .line 166
    invoke-virtual {v2}, Landroidx/camera/core/w2;->b()Landroid/util/Size;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    invoke-virtual {p1, v0, v1, v2}, Li0/c1;->V(Ljava/lang/String;Lj0/a;Landroid/util/Size;)V

    .line 171
    .line 172
    .line 173
    return-void

    .line 174
    :cond_4
    iget-object v0, p0, Li0/c1$b;->a:Li0/c1;

    .line 175
    .line 176
    iput-object p1, v0, Li0/c1;->n:Li0/z0;

    .line 177
    .line 178
    return-void

    .line 179
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 180
    .line 181
    const-string v0, "StreamInfo can\'t be null"

    .line 182
    .line 183
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    throw p1
    .line 187
    .line 188
    .line 189
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    const-string v0, "VideoCapture"

    .line 2
    .line 3
    const-string v1, "Receive onError from StreamState observer"

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Landroidx/camera/core/r1;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    return-void
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
.end method
