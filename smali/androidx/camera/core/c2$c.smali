.class Landroidx/camera/core/c2$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/c2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ly/c<",
        "Ljava/util/List<",
        "Landroidx/camera/core/ImageProxy;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroidx/camera/core/c2;


# direct methods
.method constructor <init>(Landroidx/camera/core/c2;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/core/c2$c;->a:Landroidx/camera/core/c2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Landroidx/camera/core/c2$c;->b(Ljava/util/List;)V

    return-void
.end method

.method public b(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/core/ImageProxy;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object p1, p0, Landroidx/camera/core/c2$c;->a:Landroidx/camera/core/c2;

    .line 2
    .line 3
    iget-object p1, p1, Landroidx/camera/core/c2;->a:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter p1

    .line 6
    :try_start_0
    iget-object v0, p0, Landroidx/camera/core/c2$c;->a:Landroidx/camera/core/c2;

    .line 7
    .line 8
    iget-boolean v1, v0, Landroidx/camera/core/c2;->e:Z

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    monitor-exit p1

    .line 13
    return-void

    .line 14
    :cond_0
    const/4 v1, 0x1

    .line 15
    iput-boolean v1, v0, Landroidx/camera/core/c2;->f:Z

    .line 16
    .line 17
    iget-object v1, v0, Landroidx/camera/core/c2;->p:Landroidx/camera/core/l2;

    .line 18
    .line 19
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 20
    iget-object p1, v0, Landroidx/camera/core/c2;->n:Lw/o0;

    .line 21
    .line 22
    invoke-interface {p1, v1}, Lw/o0;->a(Lw/l1;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Landroidx/camera/core/c2$c;->a:Landroidx/camera/core/c2;

    .line 26
    .line 27
    iget-object v0, p1, Landroidx/camera/core/c2;->a:Ljava/lang/Object;

    .line 28
    .line 29
    monitor-enter v0

    .line 30
    :try_start_1
    iget-object p1, p0, Landroidx/camera/core/c2$c;->a:Landroidx/camera/core/c2;

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    iput-boolean v1, p1, Landroidx/camera/core/c2;->f:Z

    .line 34
    .line 35
    iget-boolean v1, p1, Landroidx/camera/core/c2;->e:Z

    .line 36
    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    iget-object p1, p1, Landroidx/camera/core/c2;->g:Landroidx/camera/core/u1;

    .line 40
    .line 41
    invoke-virtual {p1}, Landroidx/camera/core/u1;->close()V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Landroidx/camera/core/c2$c;->a:Landroidx/camera/core/c2;

    .line 45
    .line 46
    iget-object p1, p1, Landroidx/camera/core/c2;->p:Landroidx/camera/core/l2;

    .line 47
    .line 48
    invoke-virtual {p1}, Landroidx/camera/core/l2;->d()V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Landroidx/camera/core/c2$c;->a:Landroidx/camera/core/c2;

    .line 52
    .line 53
    iget-object p1, p1, Landroidx/camera/core/c2;->h:Lw/m1;

    .line 54
    .line 55
    invoke-interface {p1}, Lw/m1;->close()V

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, Landroidx/camera/core/c2$c;->a:Landroidx/camera/core/c2;

    .line 59
    .line 60
    iget-object p1, p1, Landroidx/camera/core/c2;->k:Landroidx/concurrent/futures/c$a;

    .line 61
    .line 62
    if-eqz p1, :cond_1

    .line 63
    .line 64
    const/4 v1, 0x0

    .line 65
    invoke-virtual {p1, v1}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    :cond_1
    monitor-exit v0

    .line 69
    return-void

    .line 70
    :catchall_0
    move-exception p1

    .line 71
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 72
    throw p1

    .line 73
    :catchall_1
    move-exception v0

    .line 74
    :try_start_2
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 75
    throw v0
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

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method
