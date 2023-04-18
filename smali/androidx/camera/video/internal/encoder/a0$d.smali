.class Landroidx/camera/video/internal/encoder/a0$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/video/internal/encoder/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/video/internal/encoder/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field private final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lw/a2$a<",
            "-",
            "Lk0/j$a;",
            ">;",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field private b:Lk0/j$a;

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lfc/b<",
            "Landroidx/camera/video/internal/encoder/x0;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic d:Landroidx/camera/video/internal/encoder/a0;


# direct methods
.method constructor <init>(Landroidx/camera/video/internal/encoder/a0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/camera/video/internal/encoder/a0$d;->d:Landroidx/camera/video/internal/encoder/a0;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Landroidx/camera/video/internal/encoder/a0$d;->a:Ljava/util/Map;

    .line 12
    .line 13
    sget-object p1, Lk0/j$a;->l:Lk0/j$a;

    .line 14
    .line 15
    iput-object p1, p0, Landroidx/camera/video/internal/encoder/a0$d;->b:Lk0/j$a;

    .line 16
    .line 17
    new-instance p1, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Landroidx/camera/video/internal/encoder/a0$d;->c:Ljava/util/List;

    .line 23
    .line 24
    return-void
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

.method public static synthetic f(Landroidx/camera/video/internal/encoder/a0$d;Lw/a2$a;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/video/internal/encoder/a0$d;->x(Lw/a2$a;)V

    return-void
.end method

.method public static synthetic g(Landroidx/camera/video/internal/encoder/a0$d;Lw/a2$a;Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/camera/video/internal/encoder/a0$d;->u(Lw/a2$a;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public static synthetic h(Landroidx/camera/video/internal/encoder/a0$d;Lfc/b;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/video/internal/encoder/a0$d;->q(Lfc/b;)V

    return-void
.end method

.method public static synthetic i(Ljava/util/Map$Entry;Lk0/j$a;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/camera/video/internal/encoder/a0$d;->y(Ljava/util/Map$Entry;Lk0/j$a;)V

    return-void
.end method

.method public static synthetic j(Landroidx/camera/video/internal/encoder/a0$d;Landroidx/concurrent/futures/c$a;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/video/internal/encoder/a0$d;->r(Landroidx/concurrent/futures/c$a;)V

    return-void
.end method

.method public static synthetic k(Landroidx/camera/video/internal/encoder/a0$d;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/video/internal/encoder/a0$d;->s(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lw/a2$a;Lk0/j$a;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/camera/video/internal/encoder/a0$d;->t(Lw/a2$a;Lk0/j$a;)V

    return-void
.end method

.method public static synthetic m(Lfc/b;)V
    .locals 0

    invoke-static {p0}, Landroidx/camera/video/internal/encoder/a0$d;->p(Lfc/b;)V

    return-void
.end method

.method public static synthetic n(Landroidx/camera/video/internal/encoder/a0$d;Landroidx/concurrent/futures/c$a;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/video/internal/encoder/a0$d;->v(Landroidx/concurrent/futures/c$a;)V

    return-void
.end method

.method public static synthetic o(Landroidx/camera/video/internal/encoder/a0$d;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/video/internal/encoder/a0$d;->w(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic p(Lfc/b;)V
    .locals 1

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    return-void
.end method

.method private synthetic q(Lfc/b;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/video/internal/encoder/a0$d;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method private synthetic r(Landroidx/concurrent/futures/c$a;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/video/internal/encoder/a0$d;->b:Lk0/j$a;

    .line 2
    .line 3
    sget-object v1, Lk0/j$a;->k:Lk0/j$a;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/camera/video/internal/encoder/a0$d;->d:Landroidx/camera/video/internal/encoder/a0;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/camera/video/internal/encoder/a0;->n()Lfc/b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0, p1}, Ly/f;->k(Lfc/b;Landroidx/concurrent/futures/c$a;)V

    .line 14
    .line 15
    .line 16
    new-instance v1, Landroidx/camera/video/internal/encoder/j0;

    .line 17
    .line 18
    invoke-direct {v1, v0}, Landroidx/camera/video/internal/encoder/j0;-><init>(Lfc/b;)V

    .line 19
    .line 20
    .line 21
    invoke-static {}, Lx/a;->a()Ljava/util/concurrent/Executor;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {p1, v1, v2}, Landroidx/concurrent/futures/c$a;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Landroidx/camera/video/internal/encoder/a0$d;->c:Ljava/util/List;

    .line 29
    .line 30
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    new-instance p1, Landroidx/camera/video/internal/encoder/k0;

    .line 34
    .line 35
    invoke-direct {p1, p0, v0}, Landroidx/camera/video/internal/encoder/k0;-><init>(Landroidx/camera/video/internal/encoder/a0$d;Lfc/b;)V

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Landroidx/camera/video/internal/encoder/a0$d;->d:Landroidx/camera/video/internal/encoder/a0;

    .line 39
    .line 40
    iget-object v1, v1, Landroidx/camera/video/internal/encoder/a0;->g:Ljava/util/concurrent/Executor;

    .line 41
    .line 42
    invoke-interface {v0, p1, v1}, Lfc/b;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    sget-object v1, Lk0/j$a;->l:Lk0/j$a;

    .line 47
    .line 48
    if-ne v0, v1, :cond_1

    .line 49
    .line 50
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    const-string v1, "BufferProvider is not active."

    .line 53
    .line 54
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, v0}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 62
    .line 63
    new-instance v1, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 66
    .line 67
    .line 68
    const-string v2, "Unknown state: "

    .line 69
    .line 70
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    iget-object v2, p0, Landroidx/camera/video/internal/encoder/a0$d;->b:Lk0/j$a;

    .line 74
    .line 75
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, v0}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    .line 86
    .line 87
    .line 88
    :goto_0
    return-void
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

.method private synthetic s(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Landroidx/camera/video/internal/encoder/a0$d;->d:Landroidx/camera/video/internal/encoder/a0;

    iget-object v0, v0, Landroidx/camera/video/internal/encoder/a0;->g:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/camera/video/internal/encoder/g0;

    invoke-direct {v1, p0, p1}, Landroidx/camera/video/internal/encoder/g0;-><init>(Landroidx/camera/video/internal/encoder/a0$d;Landroidx/concurrent/futures/c$a;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    const-string p1, "acquireBuffer"

    return-object p1
.end method

.method private static synthetic t(Lw/a2$a;Lk0/j$a;)V
    .locals 0

    invoke-interface {p0, p1}, Lw/a2$a;->a(Ljava/lang/Object;)V

    return-void
.end method

.method private synthetic u(Lw/a2$a;Ljava/util/concurrent/Executor;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/video/internal/encoder/a0$d;->a:Ljava/util/Map;

    .line 2
    .line 3
    invoke-static {p1}, Landroidx/core/util/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lw/a2$a;

    .line 8
    .line 9
    invoke-static {p2}, Landroidx/core/util/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, Ljava/util/concurrent/Executor;

    .line 14
    .line 15
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Landroidx/camera/video/internal/encoder/a0$d;->b:Lk0/j$a;

    .line 19
    .line 20
    new-instance v1, Landroidx/camera/video/internal/encoder/h0;

    .line 21
    .line 22
    invoke-direct {v1, p1, v0}, Landroidx/camera/video/internal/encoder/h0;-><init>(Lw/a2$a;Lk0/j$a;)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p2, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 26
    .line 27
    .line 28
    return-void
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
.end method

.method private synthetic v(Landroidx/concurrent/futures/c$a;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/video/internal/encoder/a0$d;->b:Lk0/j$a;

    invoke-virtual {p1, v0}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z

    return-void
.end method

.method private synthetic w(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Landroidx/camera/video/internal/encoder/a0$d;->d:Landroidx/camera/video/internal/encoder/a0;

    iget-object v0, v0, Landroidx/camera/video/internal/encoder/a0;->g:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/camera/video/internal/encoder/i0;

    invoke-direct {v1, p0, p1}, Landroidx/camera/video/internal/encoder/i0;-><init>(Landroidx/camera/video/internal/encoder/a0$d;Landroidx/concurrent/futures/c$a;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    const-string p1, "fetchData"

    return-object p1
.end method

.method private synthetic x(Lw/a2$a;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/video/internal/encoder/a0$d;->a:Ljava/util/Map;

    invoke-static {p1}, Landroidx/core/util/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static synthetic y(Ljava/util/Map$Entry;Lk0/j$a;)V
    .locals 0

    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lw/a2$a;

    invoke-interface {p0, p1}, Lw/a2$a;->a(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public b()Lfc/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfc/b<",
            "Landroidx/camera/video/internal/encoder/x0;",
            ">;"
        }
    .end annotation

    new-instance v0, Landroidx/camera/video/internal/encoder/c0;

    invoke-direct {v0, p0}, Landroidx/camera/video/internal/encoder/c0;-><init>(Landroidx/camera/video/internal/encoder/a0$d;)V

    invoke-static {v0}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)Lfc/b;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/util/concurrent/Executor;Lw/a2$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lw/a2$a<",
            "-",
            "Lk0/j$a;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/video/internal/encoder/a0$d;->d:Landroidx/camera/video/internal/encoder/a0;

    iget-object v0, v0, Landroidx/camera/video/internal/encoder/a0;->g:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/camera/video/internal/encoder/f0;

    invoke-direct {v1, p0, p2, p1}, Landroidx/camera/video/internal/encoder/f0;-><init>(Landroidx/camera/video/internal/encoder/a0$d;Lw/a2$a;Ljava/util/concurrent/Executor;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public d()Lfc/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfc/b<",
            "Lk0/j$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Landroidx/camera/video/internal/encoder/e0;

    invoke-direct {v0, p0}, Landroidx/camera/video/internal/encoder/e0;-><init>(Landroidx/camera/video/internal/encoder/a0$d;)V

    invoke-static {v0}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)Lfc/b;

    move-result-object v0

    return-object v0
.end method

.method public e(Lw/a2$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw/a2$a<",
            "-",
            "Lk0/j$a;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/video/internal/encoder/a0$d;->d:Landroidx/camera/video/internal/encoder/a0;

    iget-object v0, v0, Landroidx/camera/video/internal/encoder/a0;->g:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/camera/video/internal/encoder/d0;

    invoke-direct {v1, p0, p1}, Landroidx/camera/video/internal/encoder/d0;-><init>(Landroidx/camera/video/internal/encoder/a0$d;Lw/a2$a;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method z(Z)V
    .locals 4

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Lk0/j$a;->k:Lk0/j$a;

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    sget-object p1, Lk0/j$a;->l:Lk0/j$a;

    .line 7
    .line 8
    :goto_0
    iget-object v0, p0, Landroidx/camera/video/internal/encoder/a0$d;->b:Lk0/j$a;

    .line 9
    .line 10
    if-ne v0, p1, :cond_1

    .line 11
    .line 12
    return-void

    .line 13
    :cond_1
    iput-object p1, p0, Landroidx/camera/video/internal/encoder/a0$d;->b:Lk0/j$a;

    .line 14
    .line 15
    sget-object v0, Lk0/j$a;->l:Lk0/j$a;

    .line 16
    .line 17
    if-ne p1, v0, :cond_3

    .line 18
    .line 19
    iget-object v0, p0, Landroidx/camera/video/internal/encoder/a0$d;->c:Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Lfc/b;

    .line 36
    .line 37
    const/4 v2, 0x1

    .line 38
    invoke-interface {v1, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    iget-object v0, p0, Landroidx/camera/video/internal/encoder/a0$d;->c:Ljava/util/List;

    .line 43
    .line 44
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 45
    .line 46
    .line 47
    :cond_3
    iget-object v0, p0, Landroidx/camera/video/internal/encoder/a0$d;->a:Ljava/util/Map;

    .line 48
    .line 49
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_4

    .line 62
    .line 63
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    check-cast v1, Ljava/util/Map$Entry;

    .line 68
    .line 69
    :try_start_0
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    check-cast v2, Ljava/util/concurrent/Executor;

    .line 74
    .line 75
    new-instance v3, Landroidx/camera/video/internal/encoder/b0;

    .line 76
    .line 77
    invoke-direct {v3, v1, p1}, Landroidx/camera/video/internal/encoder/b0;-><init>(Ljava/util/Map$Entry;Lk0/j$a;)V

    .line 78
    .line 79
    .line 80
    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 81
    .line 82
    .line 83
    goto :goto_2

    .line 84
    :catch_0
    move-exception v1

    .line 85
    iget-object v2, p0, Landroidx/camera/video/internal/encoder/a0$d;->d:Landroidx/camera/video/internal/encoder/a0;

    .line 86
    .line 87
    iget-object v2, v2, Landroidx/camera/video/internal/encoder/a0;->a:Ljava/lang/String;

    .line 88
    .line 89
    const-string v3, "Unable to post to the supplied executor."

    .line 90
    .line 91
    invoke-static {v2, v3, v1}, Landroidx/camera/core/r1;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_4
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
.end method
