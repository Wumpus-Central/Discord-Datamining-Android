.class final Landroidx/camera/core/r0;
.super Landroidx/camera/core/p0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/r0$b;
    }
.end annotation


# instance fields
.field final u:Ljava/util/concurrent/Executor;

.field private final v:Ljava/lang/Object;

.field w:Landroidx/camera/core/ImageProxy;

.field private x:Landroidx/camera/core/r0$b;


# direct methods
.method constructor <init>(Ljava/util/concurrent/Executor;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/camera/core/p0;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/camera/core/r0;->v:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p1, p0, Landroidx/camera/core/r0;->u:Ljava/util/concurrent/Executor;

    .line 12
    .line 13
    return-void
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


# virtual methods
.method A()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/core/r0;->v:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :try_start_0
    iput-object v1, p0, Landroidx/camera/core/r0;->x:Landroidx/camera/core/r0$b;

    .line 6
    .line 7
    iget-object v2, p0, Landroidx/camera/core/r0;->w:Landroidx/camera/core/ImageProxy;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    iput-object v1, p0, Landroidx/camera/core/r0;->w:Landroidx/camera/core/ImageProxy;

    .line 12
    .line 13
    invoke-virtual {p0, v2}, Landroidx/camera/core/r0;->p(Landroidx/camera/core/ImageProxy;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    monitor-exit v0

    .line 17
    return-void

    .line 18
    :catchall_0
    move-exception v1

    .line 19
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    throw v1
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

.method d(Lw/m1;)Landroidx/camera/core/ImageProxy;
    .locals 0

    invoke-interface {p1}, Lw/m1;->d()Landroidx/camera/core/ImageProxy;

    move-result-object p1

    return-object p1
.end method

.method g()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/core/r0;->v:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/r0;->w:Landroidx/camera/core/ImageProxy;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-interface {v1}, Landroidx/camera/core/ImageProxy;->close()V

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    iput-object v1, p0, Landroidx/camera/core/r0;->w:Landroidx/camera/core/ImageProxy;

    .line 13
    .line 14
    :cond_0
    monitor-exit v0

    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception v1

    .line 17
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    throw v1
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

.method p(Landroidx/camera/core/ImageProxy;)V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/camera/core/r0;->v:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Landroidx/camera/core/p0;->s:Z

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->close()V

    .line 9
    .line 10
    .line 11
    monitor-exit v0

    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v1, p0, Landroidx/camera/core/r0;->x:Landroidx/camera/core/r0$b;

    .line 14
    .line 15
    if-eqz v1, :cond_3

    .line 16
    .line 17
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->e0()Landroidx/camera/core/k1;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-interface {v1}, Landroidx/camera/core/k1;->a()J

    .line 22
    .line 23
    .line 24
    move-result-wide v1

    .line 25
    iget-object v3, p0, Landroidx/camera/core/r0;->x:Landroidx/camera/core/r0$b;

    .line 26
    .line 27
    invoke-virtual {v3}, Landroidx/camera/core/i0;->e0()Landroidx/camera/core/k1;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-interface {v3}, Landroidx/camera/core/k1;->a()J

    .line 32
    .line 33
    .line 34
    move-result-wide v3

    .line 35
    cmp-long v1, v1, v3

    .line 36
    .line 37
    if-gtz v1, :cond_1

    .line 38
    .line 39
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->close()V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    iget-object v1, p0, Landroidx/camera/core/r0;->w:Landroidx/camera/core/ImageProxy;

    .line 44
    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    invoke-interface {v1}, Landroidx/camera/core/ImageProxy;->close()V

    .line 48
    .line 49
    .line 50
    :cond_2
    iput-object p1, p0, Landroidx/camera/core/r0;->w:Landroidx/camera/core/ImageProxy;

    .line 51
    .line 52
    :goto_0
    monitor-exit v0

    .line 53
    return-void

    .line 54
    :cond_3
    new-instance v1, Landroidx/camera/core/r0$b;

    .line 55
    .line 56
    invoke-direct {v1, p1, p0}, Landroidx/camera/core/r0$b;-><init>(Landroidx/camera/core/ImageProxy;Landroidx/camera/core/r0;)V

    .line 57
    .line 58
    .line 59
    iput-object v1, p0, Landroidx/camera/core/r0;->x:Landroidx/camera/core/r0$b;

    .line 60
    .line 61
    invoke-virtual {p0, v1}, Landroidx/camera/core/p0;->e(Landroidx/camera/core/ImageProxy;)Lfc/b;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    new-instance v2, Landroidx/camera/core/r0$a;

    .line 66
    .line 67
    invoke-direct {v2, p0, v1}, Landroidx/camera/core/r0$a;-><init>(Landroidx/camera/core/r0;Landroidx/camera/core/r0$b;)V

    .line 68
    .line 69
    .line 70
    invoke-static {}, Lx/a;->a()Ljava/util/concurrent/Executor;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-static {p1, v2, v1}, Ly/f;->b(Lfc/b;Ly/c;Ljava/util/concurrent/Executor;)V

    .line 75
    .line 76
    .line 77
    monitor-exit v0

    .line 78
    return-void

    .line 79
    :catchall_0
    move-exception p1

    .line 80
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    throw p1
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
