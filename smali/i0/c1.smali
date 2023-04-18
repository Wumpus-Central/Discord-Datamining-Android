.class public final Li0/c1;
.super Landroidx/camera/core/w2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li0/c1$c;,
        Li0/c1$d;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Li0/h1;",
        ">",
        "Landroidx/camera/core/w2;"
    }
.end annotation


# static fields
.field private static final s:Li0/c1$d;


# instance fields
.field final l:Ljava/lang/Object;

.field m:Lw/w0;

.field n:Li0/z0;

.field o:Lw/k2$b;

.field p:Landroidx/concurrent/futures/c$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/concurrent/futures/c$a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private q:Landroidx/camera/core/v2;

.field private final r:Lw/a2$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/a2$a<",
            "Li0/z0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Li0/c1$d;

    invoke-direct {v0}, Li0/c1$d;-><init>()V

    sput-object v0, Li0/c1;->s:Li0/c1$d;

    return-void
.end method

.method constructor <init>(Lj0/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj0/a<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Landroidx/camera/core/w2;-><init>(Lw/x2;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Li0/c1;->l:Ljava/lang/Object;

    .line 10
    .line 11
    sget-object p1, Li0/z0;->b:Li0/z0;

    .line 12
    .line 13
    iput-object p1, p0, Li0/c1;->n:Li0/z0;

    .line 14
    .line 15
    new-instance p1, Lw/k2$b;

    .line 16
    .line 17
    invoke-direct {p1}, Lw/k2$b;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Li0/c1;->o:Lw/k2$b;

    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    iput-object p1, p0, Li0/c1;->p:Landroidx/concurrent/futures/c$a;

    .line 24
    .line 25
    new-instance p1, Li0/c1$b;

    .line 26
    .line 27
    invoke-direct {p1, p0}, Li0/c1$b;-><init>(Li0/c1;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Li0/c1;->r:Lw/a2$a;

    .line 31
    .line 32
    return-void
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method

.method public static synthetic K(Li0/c1;Ljava/lang/String;Lj0/a;Landroid/util/Size;Lw/k2;Lw/k2$e;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Li0/c1;->U(Ljava/lang/String;Lj0/a;Landroid/util/Size;Lw/k2;Lw/k2$e;)V

    return-void
.end method

.method static synthetic L(Li0/c1;Lw/k2;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/camera/core/w2;->I(Lw/k2;)V

    return-void
.end method

.method static synthetic M(Li0/c1;)V
    .locals 0

    invoke-virtual {p0}, Landroidx/camera/core/w2;->u()V

    return-void
.end method

.method static synthetic N(Li0/c1;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, Landroidx/camera/core/w2;->e()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private O()V
    .locals 2

    .line 1
    invoke-static {}, Landroidx/camera/core/impl/utils/r;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Li0/c1;->m:Lw/w0;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Lw/w0;->c()V

    .line 10
    .line 11
    .line 12
    iput-object v1, p0, Li0/c1;->m:Lw/w0;

    .line 13
    .line 14
    :cond_0
    iput-object v1, p0, Li0/c1;->q:Landroidx/camera/core/v2;

    .line 15
    .line 16
    sget-object v0, Li0/z0;->b:Li0/z0;

    .line 17
    .line 18
    iput-object v0, p0, Li0/c1;->n:Li0/z0;

    .line 19
    .line 20
    return-void
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

.method private P(Ljava/lang/String;Lj0/a;Landroid/util/Size;)Lw/k2$b;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lj0/a<",
            "TT;>;",
            "Landroid/util/Size;",
            ")",
            "Lw/k2$b;"
        }
    .end annotation

    .line 1
    invoke-static {}, Landroidx/camera/core/impl/utils/r;->a()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/camera/core/v2;

    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/camera/core/w2;->c()Lw/g0;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v0, p3, v1, v2}, Landroidx/camera/core/v2;-><init>(Landroid/util/Size;Lw/g0;Z)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Li0/c1;->q:Landroidx/camera/core/v2;

    .line 15
    .line 16
    invoke-virtual {p2}, Lj0/a;->F()Li0/h1;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object v1, p0, Li0/c1;->q:Landroidx/camera/core/v2;

    .line 21
    .line 22
    invoke-interface {v0, v1}, Li0/h1;->a(Landroidx/camera/core/v2;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {p0, p3}, Li0/c1;->W(Landroid/util/Size;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Li0/c1;->q:Landroidx/camera/core/v2;

    .line 29
    .line 30
    invoke-virtual {v0}, Landroidx/camera/core/v2;->k()Lw/w0;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, Li0/c1;->m:Lw/w0;

    .line 35
    .line 36
    const-class v1, Landroid/media/MediaCodec;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Lw/w0;->o(Ljava/lang/Class;)V

    .line 39
    .line 40
    .line 41
    invoke-static {p2}, Lw/k2$b;->o(Lw/x2;)Lw/k2$b;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {p0}, Li0/c1;->T()Li0/h1;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-interface {v1}, Li0/h1;->d()Lw/a2;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    sget-object v2, Li0/z0;->b:Li0/z0;

    .line 54
    .line 55
    invoke-static {v1, v2}, Li0/c1;->Q(Lw/a2;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    check-cast v1, Li0/z0;

    .line 60
    .line 61
    invoke-virtual {v1}, Li0/z0;->b()Li0/z0$a;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    sget-object v2, Li0/z0$a;->k:Li0/z0$a;

    .line 66
    .line 67
    if-ne v1, v2, :cond_0

    .line 68
    .line 69
    iget-object v1, p0, Li0/c1;->m:Lw/w0;

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Lw/k2$b;->k(Lw/w0;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, Li0/c1;->T()Li0/h1;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    sget-object v2, Li0/h1$a;->k:Li0/h1$a;

    .line 79
    .line 80
    invoke-interface {v1, v2}, Li0/h1;->b(Li0/h1$a;)V

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_0
    iget-object v1, p0, Li0/c1;->m:Lw/w0;

    .line 85
    .line 86
    invoke-virtual {v0, v1}, Lw/k2$b;->h(Lw/w0;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, Li0/c1;->T()Li0/h1;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    sget-object v2, Li0/h1$a;->l:Li0/h1$a;

    .line 94
    .line 95
    invoke-interface {v1, v2}, Li0/h1;->b(Li0/h1$a;)V

    .line 96
    .line 97
    .line 98
    :goto_0
    new-instance v1, Li0/b1;

    .line 99
    .line 100
    invoke-direct {v1, p0, p1, p2, p3}, Li0/b1;-><init>(Li0/c1;Ljava/lang/String;Lj0/a;Landroid/util/Size;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, v1}, Lw/k2$b;->f(Lw/k2$c;)V

    .line 104
    .line 105
    .line 106
    new-instance p1, Li0/c1$a;

    .line 107
    .line 108
    invoke-direct {p1, p0}, Li0/c1$a;-><init>(Li0/c1;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0, p1}, Lw/k2$b;->i(Lw/k;)V

    .line 112
    .line 113
    .line 114
    return-object v0
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
.end method

.method private static Q(Lw/a2;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lw/a2<",
            "TT;>;TT;)TT;"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Lw/a2;->d()Lfc/b;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Ljava/util/concurrent/Future;->isDone()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    :try_start_0
    invoke-interface {p0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    return-object p0

    .line 17
    :catch_0
    move-exception p0

    .line 18
    goto :goto_0

    .line 19
    :catch_1
    move-exception p0

    .line 20
    :goto_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    throw p1
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

.method private R(Landroid/util/Size;)Landroid/graphics/Rect;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/camera/core/w2;->n()Landroid/graphics/Rect;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/camera/core/w2;->n()Landroid/graphics/Rect;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    :cond_0
    if-eqz p1, :cond_1

    .line 13
    .line 14
    new-instance v0, Landroid/graphics/Rect;

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-direct {v0, v2, v2, v1, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 26
    .line 27
    .line 28
    return-object v0

    .line 29
    :cond_1
    const/4 p1, 0x0

    .line 30
    return-object p1
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

.method private S()Li0/q;
    .locals 2

    invoke-virtual {p0}, Li0/c1;->T()Li0/h1;

    move-result-object v0

    invoke-interface {v0}, Li0/h1;->c()Lw/a2;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Li0/c1;->Q(Lw/a2;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li0/q;

    return-object v0
.end method

.method private synthetic U(Ljava/lang/String;Lj0/a;Landroid/util/Size;Lw/k2;Lw/k2$e;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Li0/c1;->V(Ljava/lang/String;Lj0/a;Landroid/util/Size;)V

    return-void
.end method

.method private W(Landroid/util/Size;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/camera/core/w2;->c()Lw/g0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Li0/c1;->q:Landroidx/camera/core/v2;

    .line 6
    .line 7
    invoke-direct {p0, p1}, Li0/c1;->R(Landroid/util/Size;)Landroid/graphics/Rect;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Landroidx/camera/core/w2;->j(Lw/g0;)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-virtual {p0}, Landroidx/camera/core/w2;->l()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-static {p1, v0, v2}, Landroidx/camera/core/v2$g;->d(Landroid/graphics/Rect;II)Landroidx/camera/core/v2$g;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {v1, p1}, Landroidx/camera/core/v2;->x(Landroidx/camera/core/v2$g;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method

.method private Y(Lw/e0;Lw/x2$a;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw/e0;",
            "Lw/x2$a<",
            "***>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Li0/c1;->S()Li0/q;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    move v3, v1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v3, v2

    .line 12
    :goto_0
    const-string v4, "Unable to update target resolution by null MediaSpec."

    .line 13
    .line 14
    invoke-static {v3, v4}, Landroidx/core/util/g;->b(ZLjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-static {p1}, Li0/w;->i(Landroidx/camera/core/r;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    const-string v4, "VideoCapture"

    .line 26
    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    const-string p1, "Can\'t find any supported quality on the device."

    .line 30
    .line 31
    invoke-static {v4, p1}, Landroidx/camera/core/r1;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    invoke-virtual {v0}, Li0/q;->d()Li0/j1;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0}, Li0/j1;->e()Li0/w;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v0, p1}, Li0/w;->g(Landroidx/camera/core/r;)Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    new-instance v5, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 50
    .line 51
    .line 52
    const-string v6, "Found selectedQualities "

    .line 53
    .line 54
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v6, " by "

    .line 61
    .line 62
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-static {v4, v0}, Landroidx/camera/core/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-nez v0, :cond_3

    .line 80
    .line 81
    new-instance v0, Ljava/util/ArrayList;

    .line 82
    .line 83
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 84
    .line 85
    .line 86
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    if-eqz v5, :cond_2

    .line 95
    .line 96
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    check-cast v5, Li0/v;

    .line 101
    .line 102
    invoke-static {p1, v5}, Li0/w;->h(Landroidx/camera/core/r;Li0/v;)Landroid/util/Size;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 113
    .line 114
    .line 115
    const-string v3, "Set supported resolutions = "

    .line 116
    .line 117
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    invoke-static {v4, p1}, Landroidx/camera/core/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    invoke-interface {p2}, Landroidx/camera/core/f0;->b()Lw/w1;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    sget-object p2, Lw/k1;->k:Lw/r0$a;

    .line 135
    .line 136
    new-array v1, v1, [Landroid/util/Pair;

    .line 137
    .line 138
    invoke-virtual {p0}, Landroidx/camera/core/w2;->h()I

    .line 139
    .line 140
    .line 141
    move-result v3

    .line 142
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    new-array v4, v2, [Landroid/util/Size;

    .line 147
    .line 148
    invoke-interface {v0, v4}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    check-cast v0, [Landroid/util/Size;

    .line 153
    .line 154
    invoke-static {v3, v0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    aput-object v0, v1, v2

    .line 159
    .line 160
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    invoke-interface {p1, p2, v0}, Lw/w1;->g(Lw/r0$a;Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    return-void

    .line 168
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 169
    .line 170
    const-string p2, "Unable to find supported quality by QualitySelector"

    .line 171
    .line 172
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    throw p1
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
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
.end method

.method public static Z(Li0/h1;)Li0/c1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Li0/h1;",
            ">(TT;)",
            "Li0/c1<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Li0/c1$c;

    invoke-static {p0}, Landroidx/core/util/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Li0/h1;

    invoke-direct {v0, p0}, Li0/c1$c;-><init>(Li0/h1;)V

    invoke-virtual {v0}, Li0/c1$c;->e()Li0/c1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method protected A(Lw/e0;Lw/x2$a;)Lw/x2;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw/e0;",
            "Lw/x2$a<",
            "***>;)",
            "Lw/x2<",
            "*>;"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Li0/c1;->Y(Lw/e0;Lw/x2$a;)V

    .line 2
    .line 3
    .line 4
    invoke-interface {p2}, Lw/x2$a;->c()Lw/x2;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    return-object p1
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

.method public B()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/camera/core/w2;->B()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Li0/c1;->T()Li0/h1;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sget-object v1, Li0/h1$a;->l:Li0/h1$a;

    .line 9
    .line 10
    invoke-interface {v0, v1}, Li0/h1;->b(Li0/h1$a;)V

    .line 11
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

.method public C()V
    .locals 4

    .line 1
    iget-object v0, p0, Li0/c1;->l:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Li0/c1;->p:Landroidx/concurrent/futures/c$a;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    new-instance v2, Ljava/lang/RuntimeException;

    .line 9
    .line 10
    const-string v3, "VideoCapture is detached from the camera."

    .line 11
    .line 12
    invoke-direct {v2, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, v2}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    .line 16
    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    iput-object v1, p0, Li0/c1;->p:Landroidx/concurrent/futures/c$a;

    .line 20
    .line 21
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    invoke-virtual {p0}, Li0/c1;->T()Li0/h1;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sget-object v1, Li0/h1$a;->m:Li0/h1$a;

    .line 27
    .line 28
    invoke-interface {v0, v1}, Li0/h1;->b(Li0/h1$a;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :catchall_0
    move-exception v1

    .line 33
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    throw v1
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method

.method protected D(Landroid/util/Size;)Landroid/util/Size;
    .locals 10

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "suggestedResolution = "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "VideoCapture"

    .line 19
    .line 20
    invoke-static {v1, v0}, Landroidx/camera/core/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Landroidx/camera/core/w2;->e()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p0}, Landroidx/camera/core/w2;->f()Lw/x2;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Lj0/a;

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    invoke-virtual {v2, v3}, Lj0/a;->i(Ljava/util/List;)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    if-eqz v4, :cond_1

    .line 39
    .line 40
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    :cond_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    if-eqz v5, :cond_1

    .line 49
    .line 50
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    check-cast v5, Landroid/util/Pair;

    .line 55
    .line 56
    iget-object v6, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v6, Ljava/lang/Integer;

    .line 59
    .line 60
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    invoke-virtual {p0}, Landroidx/camera/core/w2;->h()I

    .line 65
    .line 66
    .line 67
    move-result v7

    .line 68
    if-ne v6, v7, :cond_0

    .line 69
    .line 70
    iget-object v5, v5, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 71
    .line 72
    if-eqz v5, :cond_0

    .line 73
    .line 74
    move-object v3, v5

    .line 75
    check-cast v3, [Landroid/util/Size;

    .line 76
    .line 77
    :cond_1
    if-eqz v3, :cond_4

    .line 78
    .line 79
    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    mul-int/2addr v4, v5

    .line 88
    array-length v5, v3

    .line 89
    const/4 v6, 0x0

    .line 90
    :goto_0
    if-ge v6, v5, :cond_4

    .line 91
    .line 92
    aget-object v7, v3, v6

    .line 93
    .line 94
    invoke-static {v7, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v8

    .line 98
    if-eqz v8, :cond_2

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_2
    invoke-virtual {v7}, Landroid/util/Size;->getWidth()I

    .line 102
    .line 103
    .line 104
    move-result v8

    .line 105
    invoke-virtual {v7}, Landroid/util/Size;->getHeight()I

    .line 106
    .line 107
    .line 108
    move-result v9

    .line 109
    mul-int/2addr v8, v9

    .line 110
    if-ge v8, v4, :cond_3

    .line 111
    .line 112
    new-instance p1, Ljava/lang/StringBuilder;

    .line 113
    .line 114
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 115
    .line 116
    .line 117
    const-string v3, "Find a higher priority resolution: "

    .line 118
    .line 119
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-static {v1, p1}, Landroidx/camera/core/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    move-object p1, v7

    .line 133
    goto :goto_1

    .line 134
    :cond_3
    add-int/lit8 v6, v6, 0x1

    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_4
    :goto_1
    invoke-direct {p0, v0, v2, p1}, Li0/c1;->P(Ljava/lang/String;Lj0/a;Landroid/util/Size;)Lw/k2$b;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    iput-object v0, p0, Li0/c1;->o:Lw/k2$b;

    .line 142
    .line 143
    invoke-virtual {v0}, Lw/k2$b;->m()Lw/k2;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-virtual {p0, v0}, Landroidx/camera/core/w2;->I(Lw/k2;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p0}, Landroidx/camera/core/w2;->q()V

    .line 151
    .line 152
    .line 153
    return-object p1
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

.method public H(Landroid/graphics/Rect;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/camera/core/w2;->H(Landroid/graphics/Rect;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/camera/core/w2;->b()Landroid/util/Size;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-direct {p0, p1}, Li0/c1;->W(Landroid/util/Size;)V

    .line 9
    .line 10
    .line 11
    return-void
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

.method public T()Li0/h1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    invoke-virtual {p0}, Landroidx/camera/core/w2;->f()Lw/x2;

    move-result-object v0

    check-cast v0, Lj0/a;

    invoke-virtual {v0}, Lj0/a;->F()Li0/h1;

    move-result-object v0

    return-object v0
.end method

.method V(Ljava/lang/String;Lj0/a;Landroid/util/Size;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lj0/a<",
            "TT;>;",
            "Landroid/util/Size;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Li0/c1;->O()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Landroidx/camera/core/w2;->o(Ljava/lang/String;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-direct {p0, p1, p2, p3}, Li0/c1;->P(Ljava/lang/String;Lj0/a;Landroid/util/Size;)Lw/k2$b;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Li0/c1;->o:Lw/k2$b;

    .line 15
    .line 16
    invoke-virtual {p1}, Lw/k2$b;->m()Lw/k2;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p0, p1}, Landroidx/camera/core/w2;->I(Lw/k2;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Landroidx/camera/core/w2;->s()V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
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
.end method

.method public X(I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/camera/core/w2;->G(I)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/camera/core/w2;->b()Landroid/util/Size;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-direct {p0, p1}, Li0/c1;->W(Landroid/util/Size;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
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

.method public g(ZLw/y2;)Lw/x2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lw/y2;",
            ")",
            "Lw/x2<",
            "*>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lw/y2$b;->n:Lw/y2$b;

    .line 2
    .line 3
    invoke-interface {p2, v0}, Lw/y2;->a(Lw/y2$b;)Lw/r0;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    sget-object p1, Li0/c1;->s:Li0/c1$d;

    .line 10
    .line 11
    invoke-virtual {p1}, Li0/c1$d;->a()Lj0/a;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p2, p1}, Lw/q0;->b(Lw/r0;Lw/r0;)Lw/r0;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    :cond_0
    if-nez p2, :cond_1

    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    invoke-virtual {p0, p2}, Li0/c1;->m(Lw/r0;)Lw/x2$a;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-interface {p1}, Lw/x2$a;->c()Lw/x2;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    :goto_0
    return-object p1
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

.method public m(Lw/r0;)Lw/x2$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw/r0;",
            ")",
            "Lw/x2$a<",
            "***>;"
        }
    .end annotation

    invoke-static {p1}, Li0/c1$c;->g(Lw/r0;)Li0/c1$c;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "VideoCapture:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroidx/camera/core/w2;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public w()V
    .locals 3

    invoke-virtual {p0}, Li0/c1;->T()Li0/h1;

    move-result-object v0

    invoke-interface {v0}, Li0/h1;->d()Lw/a2;

    move-result-object v0

    invoke-static {}, Lx/a;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v1

    iget-object v2, p0, Li0/c1;->r:Lw/a2$a;

    invoke-interface {v0, v1, v2}, Lw/a2;->c(Ljava/util/concurrent/Executor;Lw/a2$a;)V

    return-void
.end method

.method public z()V
    .locals 2

    .line 1
    invoke-direct {p0}, Li0/c1;->O()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Li0/c1;->T()Li0/h1;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-interface {v0}, Li0/h1;->d()Lw/a2;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, Li0/c1;->r:Lw/a2$a;

    .line 13
    .line 14
    invoke-interface {v0, v1}, Lw/a2;->e(Lw/a2$a;)V

    .line 15
    .line 16
    .line 17
    return-void
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
