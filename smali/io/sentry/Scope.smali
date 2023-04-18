.class public final Lio/sentry/Scope;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/sentry/Scope$a;,
        Lio/sentry/Scope$c;,
        Lio/sentry/Scope$b;
    }
.end annotation


# instance fields
.field private a:Lio/sentry/n3;

.field private b:Lio/sentry/m0;

.field private c:Ljava/lang/String;

.field private d:Lio/sentry/protocol/z;

.field private e:Lio/sentry/protocol/k;

.field private f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private g:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Lio/sentry/d;",
            ">;"
        }
    .end annotation
.end field

.field private h:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private i:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/sentry/t;",
            ">;"
        }
    .end annotation
.end field

.field private final k:Lio/sentry/o3;

.field private volatile l:Lio/sentry/y3;

.field private final m:Ljava/lang/Object;

.field private final n:Ljava/lang/Object;

.field private o:Lio/sentry/protocol/c;

.field private p:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/sentry/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lio/sentry/Scope;)V
    .locals 6

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lio/sentry/Scope;->f:Ljava/util/List;

    .line 14
    new-instance v0, Lj$/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/Scope;->h:Ljava/util/Map;

    .line 15
    new-instance v0, Lj$/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/Scope;->i:Ljava/util/Map;

    .line 16
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lio/sentry/Scope;->j:Ljava/util/List;

    .line 17
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lio/sentry/Scope;->m:Ljava/lang/Object;

    .line 18
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lio/sentry/Scope;->n:Ljava/lang/Object;

    .line 19
    new-instance v0, Lio/sentry/protocol/c;

    invoke-direct {v0}, Lio/sentry/protocol/c;-><init>()V

    iput-object v0, p0, Lio/sentry/Scope;->o:Lio/sentry/protocol/c;

    .line 20
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lio/sentry/Scope;->p:Ljava/util/List;

    .line 21
    iget-object v0, p1, Lio/sentry/Scope;->b:Lio/sentry/m0;

    iput-object v0, p0, Lio/sentry/Scope;->b:Lio/sentry/m0;

    .line 22
    iget-object v0, p1, Lio/sentry/Scope;->c:Ljava/lang/String;

    iput-object v0, p0, Lio/sentry/Scope;->c:Ljava/lang/String;

    .line 23
    iget-object v0, p1, Lio/sentry/Scope;->l:Lio/sentry/y3;

    iput-object v0, p0, Lio/sentry/Scope;->l:Lio/sentry/y3;

    .line 24
    iget-object v0, p1, Lio/sentry/Scope;->k:Lio/sentry/o3;

    iput-object v0, p0, Lio/sentry/Scope;->k:Lio/sentry/o3;

    .line 25
    iget-object v0, p1, Lio/sentry/Scope;->a:Lio/sentry/n3;

    iput-object v0, p0, Lio/sentry/Scope;->a:Lio/sentry/n3;

    .line 26
    iget-object v0, p1, Lio/sentry/Scope;->d:Lio/sentry/protocol/z;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 27
    new-instance v2, Lio/sentry/protocol/z;

    invoke-direct {v2, v0}, Lio/sentry/protocol/z;-><init>(Lio/sentry/protocol/z;)V

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    iput-object v2, p0, Lio/sentry/Scope;->d:Lio/sentry/protocol/z;

    .line 28
    iget-object v0, p1, Lio/sentry/Scope;->e:Lio/sentry/protocol/k;

    if-eqz v0, :cond_1

    .line 29
    new-instance v1, Lio/sentry/protocol/k;

    invoke-direct {v1, v0}, Lio/sentry/protocol/k;-><init>(Lio/sentry/protocol/k;)V

    :cond_1
    iput-object v1, p0, Lio/sentry/Scope;->e:Lio/sentry/protocol/k;

    .line 30
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p1, Lio/sentry/Scope;->f:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lio/sentry/Scope;->f:Ljava/util/List;

    .line 31
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    iget-object v1, p1, Lio/sentry/Scope;->j:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lio/sentry/Scope;->j:Ljava/util/List;

    .line 32
    iget-object v0, p1, Lio/sentry/Scope;->g:Ljava/util/Queue;

    const/4 v1, 0x0

    new-array v2, v1, [Lio/sentry/d;

    invoke-interface {v0, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/sentry/d;

    .line 33
    iget-object v2, p1, Lio/sentry/Scope;->k:Lio/sentry/o3;

    invoke-virtual {v2}, Lio/sentry/o3;->getMaxBreadcrumbs()I

    move-result v2

    invoke-direct {p0, v2}, Lio/sentry/Scope;->e(I)Ljava/util/Queue;

    move-result-object v2

    .line 34
    array-length v3, v0

    :goto_1
    if-ge v1, v3, :cond_2

    aget-object v4, v0, v1

    .line 35
    new-instance v5, Lio/sentry/d;

    invoke-direct {v5, v4}, Lio/sentry/d;-><init>(Lio/sentry/d;)V

    .line 36
    invoke-interface {v2, v5}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 37
    :cond_2
    iput-object v2, p0, Lio/sentry/Scope;->g:Ljava/util/Queue;

    .line 38
    iget-object v0, p1, Lio/sentry/Scope;->h:Ljava/util/Map;

    .line 39
    new-instance v1, Lj$/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 40
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    if-eqz v2, :cond_3

    .line 41
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 42
    :cond_4
    iput-object v1, p0, Lio/sentry/Scope;->h:Ljava/util/Map;

    .line 43
    iget-object v0, p1, Lio/sentry/Scope;->i:Ljava/util/Map;

    .line 44
    new-instance v1, Lj$/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 45
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_5
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    if-eqz v2, :cond_5

    .line 46
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    .line 47
    :cond_6
    iput-object v1, p0, Lio/sentry/Scope;->i:Ljava/util/Map;

    .line 48
    new-instance v0, Lio/sentry/protocol/c;

    iget-object v1, p1, Lio/sentry/Scope;->o:Lio/sentry/protocol/c;

    invoke-direct {v0, v1}, Lio/sentry/protocol/c;-><init>(Lio/sentry/protocol/c;)V

    iput-object v0, p0, Lio/sentry/Scope;->o:Lio/sentry/protocol/c;

    .line 49
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    iget-object p1, p1, Lio/sentry/Scope;->p:Ljava/util/List;

    invoke-direct {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lio/sentry/Scope;->p:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lio/sentry/o3;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lio/sentry/Scope;->f:Ljava/util/List;

    .line 3
    new-instance v0, Lj$/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/Scope;->h:Ljava/util/Map;

    .line 4
    new-instance v0, Lj$/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/Scope;->i:Ljava/util/Map;

    .line 5
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lio/sentry/Scope;->j:Ljava/util/List;

    .line 6
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lio/sentry/Scope;->m:Ljava/lang/Object;

    .line 7
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lio/sentry/Scope;->n:Ljava/lang/Object;

    .line 8
    new-instance v0, Lio/sentry/protocol/c;

    invoke-direct {v0}, Lio/sentry/protocol/c;-><init>()V

    iput-object v0, p0, Lio/sentry/Scope;->o:Lio/sentry/protocol/c;

    .line 9
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lio/sentry/Scope;->p:Ljava/util/List;

    const-string v0, "SentryOptions is required."

    .line 10
    invoke-static {p1, v0}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/sentry/o3;

    iput-object p1, p0, Lio/sentry/Scope;->k:Lio/sentry/o3;

    .line 11
    invoke-virtual {p1}, Lio/sentry/o3;->getMaxBreadcrumbs()I

    move-result p1

    invoke-direct {p0, p1}, Lio/sentry/Scope;->e(I)Ljava/util/Queue;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/Scope;->g:Ljava/util/Queue;

    return-void
.end method

.method private e(I)Ljava/util/Queue;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/Queue<",
            "Lio/sentry/d;",
            ">;"
        }
    .end annotation

    new-instance v0, Lio/sentry/e;

    invoke-direct {v0, p1}, Lio/sentry/e;-><init>(I)V

    invoke-static {v0}, Lio/sentry/i4;->f(Ljava/util/Queue;)Lio/sentry/i4;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method A(Lio/sentry/Scope$a;)Lio/sentry/y3;
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/Scope;->m:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lio/sentry/Scope;->l:Lio/sentry/y3;

    .line 5
    .line 6
    invoke-interface {p1, v1}, Lio/sentry/Scope$a;->a(Lio/sentry/y3;)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lio/sentry/Scope;->l:Lio/sentry/y3;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object p1, p0, Lio/sentry/Scope;->l:Lio/sentry/y3;

    .line 14
    .line 15
    invoke-virtual {p1}, Lio/sentry/y3;->b()Lio/sentry/y3;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    :goto_0
    monitor-exit v0

    .line 22
    return-object p1

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw p1
    .line 26
    .line 27
.end method

.method public B(Lio/sentry/Scope$b;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/Scope;->n:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lio/sentry/Scope;->b:Lio/sentry/m0;

    .line 5
    .line 6
    invoke-interface {p1, v1}, Lio/sentry/Scope$b;->a(Lio/sentry/m0;)V

    .line 7
    .line 8
    .line 9
    monitor-exit v0

    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception p1

    .line 12
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    throw p1
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
.end method

.method public a(Lio/sentry/d;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lio/sentry/Scope;->b(Lio/sentry/d;Lio/sentry/v;)V

    return-void
.end method

.method public b(Lio/sentry/d;Lio/sentry/v;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    if-nez p2, :cond_1

    .line 5
    .line 6
    new-instance p2, Lio/sentry/v;

    .line 7
    .line 8
    invoke-direct {p2}, Lio/sentry/v;-><init>()V

    .line 9
    .line 10
    .line 11
    :cond_1
    iget-object p2, p0, Lio/sentry/Scope;->k:Lio/sentry/o3;

    .line 12
    .line 13
    invoke-virtual {p2}, Lio/sentry/o3;->getBeforeBreadcrumb()Lio/sentry/o3$a;

    .line 14
    .line 15
    .line 16
    iget-object p2, p0, Lio/sentry/Scope;->g:Ljava/util/Queue;

    .line 17
    .line 18
    invoke-interface {p2, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    iget-object p2, p0, Lio/sentry/Scope;->k:Lio/sentry/o3;

    .line 22
    .line 23
    invoke-virtual {p2}, Lio/sentry/o3;->isEnableScopeSync()Z

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    if-eqz p2, :cond_2

    .line 28
    .line 29
    iget-object p2, p0, Lio/sentry/Scope;->k:Lio/sentry/o3;

    .line 30
    .line 31
    invoke-virtual {p2}, Lio/sentry/o3;->getScopeObservers()Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, Lio/sentry/h0;

    .line 50
    .line 51
    invoke-interface {v0, p1}, Lio/sentry/h0;->e(Lio/sentry/d;)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    return-void
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
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lio/sentry/Scope;->g:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Collection;->clear()V

    return-void
.end method

.method public d()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/Scope;->n:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :try_start_0
    iput-object v1, p0, Lio/sentry/Scope;->b:Lio/sentry/m0;

    .line 6
    .line 7
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    iput-object v1, p0, Lio/sentry/Scope;->c:Ljava/lang/String;

    .line 9
    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception v1

    .line 12
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 13
    throw v1
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
.end method

.method f()Lio/sentry/y3;
    .locals 3

    .line 1
    iget-object v0, p0, Lio/sentry/Scope;->m:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lio/sentry/Scope;->l:Lio/sentry/y3;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lio/sentry/Scope;->l:Lio/sentry/y3;

    .line 10
    .line 11
    invoke-virtual {v1}, Lio/sentry/y3;->c()V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Lio/sentry/Scope;->l:Lio/sentry/y3;

    .line 15
    .line 16
    invoke-virtual {v1}, Lio/sentry/y3;->b()Lio/sentry/y3;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iput-object v2, p0, Lio/sentry/Scope;->l:Lio/sentry/y3;

    .line 21
    .line 22
    move-object v2, v1

    .line 23
    :cond_0
    monitor-exit v0

    .line 24
    return-object v2

    .line 25
    :catchall_0
    move-exception v1

    .line 26
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    throw v1
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
.end method

.method g()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/sentry/b;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    iget-object v1, p0, Lio/sentry/Scope;->p:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method h()Ljava/util/Queue;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Queue<",
            "Lio/sentry/d;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/Scope;->g:Ljava/util/Queue;

    return-object v0
.end method

.method public i()Lio/sentry/protocol/c;
    .locals 1

    iget-object v0, p0, Lio/sentry/Scope;->o:Lio/sentry/protocol/c;

    return-object v0
.end method

.method j()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/sentry/t;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/Scope;->j:Ljava/util/List;

    return-object v0
.end method

.method k()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/Scope;->i:Ljava/util/Map;

    return-object v0
.end method

.method l()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/Scope;->f:Ljava/util/List;

    return-object v0
.end method

.method public m()Lio/sentry/n3;
    .locals 1

    iget-object v0, p0, Lio/sentry/Scope;->a:Lio/sentry/n3;

    return-object v0
.end method

.method public n()Lio/sentry/protocol/k;
    .locals 1

    iget-object v0, p0, Lio/sentry/Scope;->e:Lio/sentry/protocol/k;

    return-object v0
.end method

.method public o()Lio/sentry/ISpan;
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/Scope;->b:Lio/sentry/m0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lio/sentry/m0;->g()Lio/sentry/b4;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    return-object v1

    .line 12
    :cond_0
    return-object v0
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
.end method

.method public p()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/sentry/Scope;->h:Ljava/util/Map;

    invoke-static {v0}, Lio/sentry/util/a;->b(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public q()Lio/sentry/m0;
    .locals 1

    iget-object v0, p0, Lio/sentry/Scope;->b:Lio/sentry/m0;

    return-object v0
.end method

.method public r()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/Scope;->b:Lio/sentry/m0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lio/sentry/m0;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, p0, Lio/sentry/Scope;->c:Ljava/lang/String;

    .line 11
    .line 12
    :goto_0
    return-object v0
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
.end method

.method public s()Lio/sentry/protocol/z;
    .locals 1

    iget-object v0, p0, Lio/sentry/Scope;->d:Lio/sentry/protocol/z;

    return-object v0
.end method

.method public t(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/Scope;->o:Lio/sentry/protocol/c;

    invoke-virtual {v0, p1, p2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public u(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/Scope;->i:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lio/sentry/Scope;->k:Lio/sentry/o3;

    .line 7
    .line 8
    invoke-virtual {v0}, Lio/sentry/o3;->isEnableScopeSync()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lio/sentry/Scope;->k:Lio/sentry/o3;

    .line 15
    .line 16
    invoke-virtual {v0}, Lio/sentry/o3;->getScopeObservers()Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Lio/sentry/h0;

    .line 35
    .line 36
    invoke-interface {v1, p1, p2}, Lio/sentry/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    return-void
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
.end method

.method public v(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lio/sentry/Scope;->f:Ljava/util/List;

    return-void
.end method

.method public w(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/Scope;->h:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lio/sentry/Scope;->k:Lio/sentry/o3;

    .line 7
    .line 8
    invoke-virtual {v0}, Lio/sentry/o3;->isEnableScopeSync()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lio/sentry/Scope;->k:Lio/sentry/o3;

    .line 15
    .line 16
    invoke-virtual {v0}, Lio/sentry/o3;->getScopeObservers()Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Lio/sentry/h0;

    .line 35
    .line 36
    invoke-interface {v1, p1, p2}, Lio/sentry/h0;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    return-void
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
.end method

.method public x(Lio/sentry/m0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/Scope;->n:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iput-object p1, p0, Lio/sentry/Scope;->b:Lio/sentry/m0;

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return-void

    .line 8
    :catchall_0
    move-exception p1

    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    throw p1
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
.end method

.method public y(Lio/sentry/protocol/z;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lio/sentry/Scope;->d:Lio/sentry/protocol/z;

    .line 2
    .line 3
    iget-object v0, p0, Lio/sentry/Scope;->k:Lio/sentry/o3;

    .line 4
    .line 5
    invoke-virtual {v0}, Lio/sentry/o3;->isEnableScopeSync()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lio/sentry/Scope;->k:Lio/sentry/o3;

    .line 12
    .line 13
    invoke-virtual {v0}, Lio/sentry/o3;->getScopeObservers()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Lio/sentry/h0;

    .line 32
    .line 33
    invoke-interface {v1, p1}, Lio/sentry/h0;->c(Lio/sentry/protocol/z;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    return-void
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

.method z()Lio/sentry/Scope$c;
    .locals 8

    .line 1
    iget-object v0, p0, Lio/sentry/Scope;->m:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lio/sentry/Scope;->l:Lio/sentry/y3;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    iget-object v1, p0, Lio/sentry/Scope;->l:Lio/sentry/y3;

    .line 9
    .line 10
    invoke-virtual {v1}, Lio/sentry/y3;->c()V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v1, p0, Lio/sentry/Scope;->l:Lio/sentry/y3;

    .line 14
    .line 15
    iget-object v2, p0, Lio/sentry/Scope;->k:Lio/sentry/o3;

    .line 16
    .line 17
    invoke-virtual {v2}, Lio/sentry/o3;->getRelease()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    const/4 v3, 0x0

    .line 22
    if-eqz v2, :cond_2

    .line 23
    .line 24
    new-instance v2, Lio/sentry/y3;

    .line 25
    .line 26
    iget-object v4, p0, Lio/sentry/Scope;->k:Lio/sentry/o3;

    .line 27
    .line 28
    invoke-virtual {v4}, Lio/sentry/o3;->getDistinctId()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    iget-object v5, p0, Lio/sentry/Scope;->d:Lio/sentry/protocol/z;

    .line 33
    .line 34
    iget-object v6, p0, Lio/sentry/Scope;->k:Lio/sentry/o3;

    .line 35
    .line 36
    invoke-virtual {v6}, Lio/sentry/o3;->getEnvironment()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    iget-object v7, p0, Lio/sentry/Scope;->k:Lio/sentry/o3;

    .line 41
    .line 42
    invoke-virtual {v7}, Lio/sentry/o3;->getRelease()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    invoke-direct {v2, v4, v5, v6, v7}, Lio/sentry/y3;-><init>(Ljava/lang/String;Lio/sentry/protocol/z;Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    iput-object v2, p0, Lio/sentry/Scope;->l:Lio/sentry/y3;

    .line 50
    .line 51
    if-eqz v1, :cond_1

    .line 52
    .line 53
    invoke-virtual {v1}, Lio/sentry/y3;->b()Lio/sentry/y3;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    :cond_1
    new-instance v1, Lio/sentry/Scope$c;

    .line 58
    .line 59
    iget-object v2, p0, Lio/sentry/Scope;->l:Lio/sentry/y3;

    .line 60
    .line 61
    invoke-virtual {v2}, Lio/sentry/y3;->b()Lio/sentry/y3;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-direct {v1, v2, v3}, Lio/sentry/Scope$c;-><init>(Lio/sentry/y3;Lio/sentry/y3;)V

    .line 66
    .line 67
    .line 68
    move-object v3, v1

    .line 69
    goto :goto_0

    .line 70
    :cond_2
    iget-object v1, p0, Lio/sentry/Scope;->k:Lio/sentry/o3;

    .line 71
    .line 72
    invoke-virtual {v1}, Lio/sentry/o3;->getLogger()Lio/sentry/g0;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    sget-object v2, Lio/sentry/n3;->WARNING:Lio/sentry/n3;

    .line 77
    .line 78
    const-string v4, "Release is not set on SentryOptions. Session could not be started"

    .line 79
    .line 80
    const/4 v5, 0x0

    .line 81
    new-array v5, v5, [Ljava/lang/Object;

    .line 82
    .line 83
    invoke-interface {v1, v2, v4, v5}, Lio/sentry/g0;->c(Lio/sentry/n3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    :goto_0
    monitor-exit v0

    .line 87
    return-object v3

    .line 88
    :catchall_0
    move-exception v1

    .line 89
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    throw v1
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
.end method
