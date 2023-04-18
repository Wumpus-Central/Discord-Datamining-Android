.class public final Landroidx/camera/lifecycle/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/s;


# static fields
.field private static final h:Landroidx/camera/lifecycle/e;


# instance fields
.field private final a:Ljava/lang/Object;

.field private b:Landroidx/camera/core/a0$b;

.field private c:Lfc/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfc/b<",
            "Landroidx/camera/core/z;",
            ">;"
        }
    .end annotation
.end field

.field private d:Lfc/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfc/b<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Landroidx/camera/lifecycle/LifecycleCameraRepository;

.field private f:Landroidx/camera/core/z;

.field private g:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/camera/lifecycle/e;

    invoke-direct {v0}, Landroidx/camera/lifecycle/e;-><init>()V

    sput-object v0, Landroidx/camera/lifecycle/e;->h:Landroidx/camera/lifecycle/e;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
    iput-object v0, p0, Landroidx/camera/lifecycle/e;->a:Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Landroidx/camera/lifecycle/e;->b:Landroidx/camera/core/a0$b;

    .line 13
    .line 14
    invoke-static {v0}, Ly/f;->h(Ljava/lang/Object;)Lfc/b;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, Landroidx/camera/lifecycle/e;->d:Lfc/b;

    .line 19
    .line 20
    new-instance v0, Landroidx/camera/lifecycle/LifecycleCameraRepository;

    .line 21
    .line 22
    invoke-direct {v0}, Landroidx/camera/lifecycle/LifecycleCameraRepository;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Landroidx/camera/lifecycle/e;->e:Landroidx/camera/lifecycle/LifecycleCameraRepository;

    .line 26
    .line 27
    return-void
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

.method public static synthetic b(Landroidx/camera/core/z;Ljava/lang/Void;)Lfc/b;
    .locals 0

    invoke-static {p0, p1}, Landroidx/camera/lifecycle/e;->j(Landroidx/camera/core/z;Ljava/lang/Void;)Lfc/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/camera/lifecycle/e;Landroidx/camera/core/z;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/camera/lifecycle/e;->k(Landroidx/camera/core/z;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroid/content/Context;Landroidx/camera/core/z;)Landroidx/camera/lifecycle/e;
    .locals 0

    invoke-static {p0, p1}, Landroidx/camera/lifecycle/e;->i(Landroid/content/Context;Landroidx/camera/core/z;)Landroidx/camera/lifecycle/e;

    move-result-object p0

    return-object p0
.end method

.method public static g(Landroid/content/Context;)Lfc/b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Lfc/b<",
            "Landroidx/camera/lifecycle/e;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Landroidx/core/util/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    sget-object v0, Landroidx/camera/lifecycle/e;->h:Landroidx/camera/lifecycle/e;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Landroidx/camera/lifecycle/e;->h(Landroid/content/Context;)Lfc/b;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Landroidx/camera/lifecycle/b;

    .line 11
    .line 12
    invoke-direct {v1, p0}, Landroidx/camera/lifecycle/b;-><init>(Landroid/content/Context;)V

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lx/a;->a()Ljava/util/concurrent/Executor;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {v0, v1, p0}, Ly/f;->o(Lfc/b;Landroidx/arch/core/util/Function;Ljava/util/concurrent/Executor;)Lfc/b;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
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

.method private h(Landroid/content/Context;)Lfc/b;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Lfc/b<",
            "Landroidx/camera/core/z;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/camera/lifecycle/e;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Landroidx/camera/lifecycle/e;->c:Lfc/b;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    monitor-exit v0

    .line 9
    return-object v1

    .line 10
    :cond_0
    new-instance v1, Landroidx/camera/core/z;

    .line 11
    .line 12
    iget-object v2, p0, Landroidx/camera/lifecycle/e;->b:Landroidx/camera/core/a0$b;

    .line 13
    .line 14
    invoke-direct {v1, p1, v2}, Landroidx/camera/core/z;-><init>(Landroid/content/Context;Landroidx/camera/core/a0$b;)V

    .line 15
    .line 16
    .line 17
    new-instance p1, Landroidx/camera/lifecycle/c;

    .line 18
    .line 19
    invoke-direct {p1, p0, v1}, Landroidx/camera/lifecycle/c;-><init>(Landroidx/camera/lifecycle/e;Landroidx/camera/core/z;)V

    .line 20
    .line 21
    .line 22
    invoke-static {p1}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)Lfc/b;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, Landroidx/camera/lifecycle/e;->c:Lfc/b;

    .line 27
    .line 28
    monitor-exit v0

    .line 29
    return-object p1

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    throw p1
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method

.method private static synthetic i(Landroid/content/Context;Landroidx/camera/core/z;)Landroidx/camera/lifecycle/e;
    .locals 1

    .line 1
    sget-object v0, Landroidx/camera/lifecycle/e;->h:Landroidx/camera/lifecycle/e;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Landroidx/camera/lifecycle/e;->l(Landroidx/camera/core/z;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Landroidx/camera/core/impl/utils/j;->a(Landroid/content/Context;)Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-direct {v0, p0}, Landroidx/camera/lifecycle/e;->m(Landroid/content/Context;)V

    .line 11
    .line 12
    .line 13
    return-object v0
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

.method private static synthetic j(Landroidx/camera/core/z;Ljava/lang/Void;)Lfc/b;
    .locals 0

    invoke-virtual {p0}, Landroidx/camera/core/z;->h()Lfc/b;

    move-result-object p0

    return-object p0
.end method

.method private synthetic k(Landroidx/camera/core/z;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/camera/lifecycle/e;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Landroidx/camera/lifecycle/e;->d:Lfc/b;

    .line 5
    .line 6
    invoke-static {v1}, Ly/d;->b(Lfc/b;)Ly/d;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    new-instance v2, Landroidx/camera/lifecycle/d;

    .line 11
    .line 12
    invoke-direct {v2, p1}, Landroidx/camera/lifecycle/d;-><init>(Landroidx/camera/core/z;)V

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lx/a;->a()Ljava/util/concurrent/Executor;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {v1, v2, v3}, Ly/d;->f(Ly/a;Ljava/util/concurrent/Executor;)Ly/d;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    new-instance v2, Landroidx/camera/lifecycle/e$a;

    .line 24
    .line 25
    invoke-direct {v2, p0, p2, p1}, Landroidx/camera/lifecycle/e$a;-><init>(Landroidx/camera/lifecycle/e;Landroidx/concurrent/futures/c$a;Landroidx/camera/core/z;)V

    .line 26
    .line 27
    .line 28
    invoke-static {}, Lx/a;->a()Ljava/util/concurrent/Executor;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-static {v1, v2, p1}, Ly/f;->b(Lfc/b;Ly/c;Ljava/util/concurrent/Executor;)V

    .line 33
    .line 34
    .line 35
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    const-string p1, "ProcessCameraProvider-initializeCameraX"

    .line 37
    .line 38
    return-object p1

    .line 39
    :catchall_0
    move-exception p1

    .line 40
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 41
    throw p1
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

.method private l(Landroidx/camera/core/z;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/lifecycle/e;->f:Landroidx/camera/core/z;

    return-void
.end method

.method private m(Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/lifecycle/e;->g:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/camera/core/r;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Landroidx/camera/lifecycle/e;->f:Landroidx/camera/core/z;

    .line 7
    .line 8
    invoke-virtual {v1}, Landroidx/camera/core/z;->e()Lw/h0;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Lw/h0;->a()Ljava/util/LinkedHashSet;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Lw/g0;

    .line 31
    .line 32
    invoke-interface {v2}, Lw/g0;->a()Landroidx/camera/core/r;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    return-object v0
.end method

.method varargs e(Landroidx/lifecycle/LifecycleOwner;Landroidx/camera/core/t;Landroidx/camera/core/c3;[Landroidx/camera/core/w2;)Landroidx/camera/core/k;
    .locals 11

    .line 1
    invoke-static {}, Landroidx/camera/core/impl/utils/r;->a()V

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, Landroidx/camera/core/t$a;->c(Landroidx/camera/core/t;)Landroidx/camera/core/t$a;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    array-length v1, p4

    .line 9
    const/4 v2, 0x0

    .line 10
    move v3, v2

    .line 11
    :goto_0
    const/4 v4, 0x0

    .line 12
    if-ge v3, v1, :cond_1

    .line 13
    .line 14
    aget-object v5, p4, v3

    .line 15
    .line 16
    invoke-virtual {v5}, Landroidx/camera/core/w2;->f()Lw/x2;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    invoke-interface {v5, v4}, Lw/x2;->B(Landroidx/camera/core/t;)Landroidx/camera/core/t;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    if-eqz v4, :cond_0

    .line 25
    .line 26
    invoke-virtual {v4}, Landroidx/camera/core/t;->c()Ljava/util/LinkedHashSet;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    invoke-virtual {v4}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    if-eqz v5, :cond_0

    .line 39
    .line 40
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    check-cast v5, Landroidx/camera/core/q;

    .line 45
    .line 46
    invoke-virtual {v0, v5}, Landroidx/camera/core/t$a;->a(Landroidx/camera/core/q;)Landroidx/camera/core/t$a;

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    invoke-virtual {v0}, Landroidx/camera/core/t$a;->b()Landroidx/camera/core/t;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iget-object v1, p0, Landroidx/camera/lifecycle/e;->f:Landroidx/camera/core/z;

    .line 58
    .line 59
    invoke-virtual {v1}, Landroidx/camera/core/z;->e()Lw/h0;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v1}, Lw/h0;->a()Ljava/util/LinkedHashSet;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {v0, v1}, Landroidx/camera/core/t;->a(Ljava/util/LinkedHashSet;)Ljava/util/LinkedHashSet;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-nez v1, :cond_c

    .line 76
    .line 77
    invoke-static {v0}, Lz/e;->v(Ljava/util/LinkedHashSet;)Lz/e$b;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    iget-object v3, p0, Landroidx/camera/lifecycle/e;->e:Landroidx/camera/lifecycle/LifecycleCameraRepository;

    .line 82
    .line 83
    invoke-virtual {v3, p1, v1}, Landroidx/camera/lifecycle/LifecycleCameraRepository;->c(Landroidx/lifecycle/LifecycleOwner;Lz/e$b;)Landroidx/camera/lifecycle/LifecycleCamera;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    iget-object v3, p0, Landroidx/camera/lifecycle/e;->e:Landroidx/camera/lifecycle/LifecycleCameraRepository;

    .line 88
    .line 89
    invoke-virtual {v3}, Landroidx/camera/lifecycle/LifecycleCameraRepository;->e()Ljava/util/Collection;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    array-length v5, p4

    .line 94
    move v6, v2

    .line 95
    :goto_2
    if-ge v6, v5, :cond_5

    .line 96
    .line 97
    aget-object v7, p4, v6

    .line 98
    .line 99
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 100
    .line 101
    .line 102
    move-result-object v8

    .line 103
    :cond_2
    :goto_3
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v9

    .line 107
    if-eqz v9, :cond_4

    .line 108
    .line 109
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v9

    .line 113
    check-cast v9, Landroidx/camera/lifecycle/LifecycleCamera;

    .line 114
    .line 115
    invoke-virtual {v9, v7}, Landroidx/camera/lifecycle/LifecycleCamera;->o(Landroidx/camera/core/w2;)Z

    .line 116
    .line 117
    .line 118
    move-result v10

    .line 119
    if-eqz v10, :cond_2

    .line 120
    .line 121
    if-ne v9, v1, :cond_3

    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 125
    .line 126
    const/4 p2, 0x1

    .line 127
    new-array p2, p2, [Ljava/lang/Object;

    .line 128
    .line 129
    aput-object v7, p2, v2

    .line 130
    .line 131
    const-string p3, "Use case %s already bound to a different lifecycle."

    .line 132
    .line 133
    invoke-static {p3, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p2

    .line 137
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    throw p1

    .line 141
    :cond_4
    add-int/lit8 v6, v6, 0x1

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_5
    if-nez v1, :cond_6

    .line 145
    .line 146
    iget-object v1, p0, Landroidx/camera/lifecycle/e;->e:Landroidx/camera/lifecycle/LifecycleCameraRepository;

    .line 147
    .line 148
    new-instance v2, Lz/e;

    .line 149
    .line 150
    iget-object v3, p0, Landroidx/camera/lifecycle/e;->f:Landroidx/camera/core/z;

    .line 151
    .line 152
    invoke-virtual {v3}, Landroidx/camera/core/z;->d()Lw/c0;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    iget-object v5, p0, Landroidx/camera/lifecycle/e;->f:Landroidx/camera/core/z;

    .line 157
    .line 158
    invoke-virtual {v5}, Landroidx/camera/core/z;->g()Lw/y2;

    .line 159
    .line 160
    .line 161
    move-result-object v5

    .line 162
    invoke-direct {v2, v0, v3, v5}, Lz/e;-><init>(Ljava/util/LinkedHashSet;Lw/c0;Lw/y2;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v1, p1, v2}, Landroidx/camera/lifecycle/LifecycleCameraRepository;->b(Landroidx/lifecycle/LifecycleOwner;Lz/e;)Landroidx/camera/lifecycle/LifecycleCamera;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    :cond_6
    invoke-virtual {p2}, Landroidx/camera/core/t;->c()Ljava/util/LinkedHashSet;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    :cond_7
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 178
    .line 179
    .line 180
    move-result p2

    .line 181
    if-eqz p2, :cond_a

    .line 182
    .line 183
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object p2

    .line 187
    check-cast p2, Landroidx/camera/core/q;

    .line 188
    .line 189
    invoke-interface {p2}, Landroidx/camera/core/q;->a()Lw/d1;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    sget-object v2, Landroidx/camera/core/q;->a:Lw/d1;

    .line 194
    .line 195
    if-eq v0, v2, :cond_7

    .line 196
    .line 197
    invoke-interface {p2}, Landroidx/camera/core/q;->a()Lw/d1;

    .line 198
    .line 199
    .line 200
    move-result-object p2

    .line 201
    invoke-static {p2}, Lw/c1;->b(Ljava/lang/Object;)Lw/z;

    .line 202
    .line 203
    .line 204
    move-result-object p2

    .line 205
    invoke-virtual {v1}, Landroidx/camera/lifecycle/LifecycleCamera;->a()Landroidx/camera/core/r;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    iget-object v2, p0, Landroidx/camera/lifecycle/e;->g:Landroid/content/Context;

    .line 210
    .line 211
    invoke-interface {p2, v0, v2}, Lw/z;->a(Landroidx/camera/core/r;Landroid/content/Context;)Lw/w;

    .line 212
    .line 213
    .line 214
    move-result-object p2

    .line 215
    if-nez p2, :cond_8

    .line 216
    .line 217
    goto :goto_4

    .line 218
    :cond_8
    if-nez v4, :cond_9

    .line 219
    .line 220
    move-object v4, p2

    .line 221
    goto :goto_4

    .line 222
    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 223
    .line 224
    const-string p2, "Cannot apply multiple extended camera configs at the same time."

    .line 225
    .line 226
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    throw p1

    .line 230
    :cond_a
    invoke-virtual {v1, v4}, Landroidx/camera/lifecycle/LifecycleCamera;->d(Lw/w;)V

    .line 231
    .line 232
    .line 233
    array-length p1, p4

    .line 234
    if-nez p1, :cond_b

    .line 235
    .line 236
    return-object v1

    .line 237
    :cond_b
    iget-object p1, p0, Landroidx/camera/lifecycle/e;->e:Landroidx/camera/lifecycle/LifecycleCameraRepository;

    .line 238
    .line 239
    invoke-static {p4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 240
    .line 241
    .line 242
    move-result-object p2

    .line 243
    invoke-virtual {p1, v1, p3, p2}, Landroidx/camera/lifecycle/LifecycleCameraRepository;->a(Landroidx/camera/lifecycle/LifecycleCamera;Landroidx/camera/core/c3;Ljava/util/Collection;)V

    .line 244
    .line 245
    .line 246
    return-object v1

    .line 247
    :cond_c
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 248
    .line 249
    const-string p2, "Provided camera selector unable to resolve a camera for the given use case"

    .line 250
    .line 251
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    throw p1
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
.end method

.method public varargs f(Landroidx/lifecycle/LifecycleOwner;Landroidx/camera/core/t;[Landroidx/camera/core/w2;)Landroidx/camera/core/k;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0, p3}, Landroidx/camera/lifecycle/e;->e(Landroidx/lifecycle/LifecycleOwner;Landroidx/camera/core/t;Landroidx/camera/core/c3;[Landroidx/camera/core/w2;)Landroidx/camera/core/k;

    move-result-object p1

    return-object p1
.end method

.method public n()V
    .locals 1

    .line 1
    invoke-static {}, Landroidx/camera/core/impl/utils/r;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/camera/lifecycle/e;->e:Landroidx/camera/lifecycle/LifecycleCameraRepository;

    .line 5
    .line 6
    invoke-virtual {v0}, Landroidx/camera/lifecycle/LifecycleCameraRepository;->k()V

    .line 7
    .line 8
    .line 9
    return-void
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
