.class public abstract Landroidx/camera/core/w2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/w2$b;,
        Landroidx/camera/core/w2$d;,
        Landroidx/camera/core/w2$c;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Landroidx/camera/core/w2$d;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljava/lang/Object;

.field private c:Landroidx/camera/core/w2$c;

.field private d:Lw/x2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/x2<",
            "*>;"
        }
    .end annotation
.end field

.field private e:Lw/x2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/x2<",
            "*>;"
        }
    .end annotation
.end field

.field private f:Lw/x2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/x2<",
            "*>;"
        }
    .end annotation
.end field

.field private g:Landroid/util/Size;

.field private h:Lw/x2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/x2<",
            "*>;"
        }
    .end annotation
.end field

.field private i:Landroid/graphics/Rect;

.field private j:Lw/g0;

.field private k:Lw/k2;


# direct methods
.method protected constructor <init>(Lw/x2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw/x2<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashSet;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/camera/core/w2;->a:Ljava/util/Set;

    .line 10
    .line 11
    new-instance v0, Ljava/lang/Object;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Landroidx/camera/core/w2;->b:Ljava/lang/Object;

    .line 17
    .line 18
    sget-object v0, Landroidx/camera/core/w2$c;->l:Landroidx/camera/core/w2$c;

    .line 19
    .line 20
    iput-object v0, p0, Landroidx/camera/core/w2;->c:Landroidx/camera/core/w2$c;

    .line 21
    .line 22
    invoke-static {}, Lw/k2;->a()Lw/k2;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, Landroidx/camera/core/w2;->k:Lw/k2;

    .line 27
    .line 28
    iput-object p1, p0, Landroidx/camera/core/w2;->e:Lw/x2;

    .line 29
    .line 30
    iput-object p1, p0, Landroidx/camera/core/w2;->f:Lw/x2;

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

.method private E(Landroidx/camera/core/w2$d;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/w2;->a:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method private a(Landroidx/camera/core/w2$d;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/w2;->a:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
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

    invoke-interface {p2}, Lw/x2$a;->c()Lw/x2;

    move-result-object p1

    return-object p1
.end method

.method public B()V
    .locals 0

    invoke-virtual {p0}, Landroidx/camera/core/w2;->x()V

    return-void
.end method

.method public C()V
    .locals 0

    return-void
.end method

.method protected abstract D(Landroid/util/Size;)Landroid/util/Size;
.end method

.method public F(Landroid/graphics/Matrix;)V
    .locals 0

    return-void
.end method

.method protected G(I)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/camera/core/w2;->f()Lw/x2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lw/k1;

    .line 6
    .line 7
    const/4 v1, -0x1

    .line 8
    invoke-interface {v0, v1}, Lw/k1;->D(I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eq v0, v1, :cond_1

    .line 13
    .line 14
    if-eq v0, p1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    return p1

    .line 19
    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/camera/core/w2;->e:Lw/x2;

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Landroidx/camera/core/w2;->m(Lw/r0;)Lw/x2$a;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0, p1}, Ld0/b;->a(Lw/x2$a;I)V

    .line 26
    .line 27
    .line 28
    invoke-interface {v0}, Lw/x2$a;->c()Lw/x2;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, Landroidx/camera/core/w2;->e:Lw/x2;

    .line 33
    .line 34
    invoke-virtual {p0}, Landroidx/camera/core/w2;->c()Lw/g0;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    if-nez p1, :cond_2

    .line 39
    .line 40
    iget-object p1, p0, Landroidx/camera/core/w2;->e:Lw/x2;

    .line 41
    .line 42
    iput-object p1, p0, Landroidx/camera/core/w2;->f:Lw/x2;

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    invoke-interface {p1}, Lw/g0;->l()Lw/e0;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iget-object v0, p0, Landroidx/camera/core/w2;->d:Lw/x2;

    .line 50
    .line 51
    iget-object v1, p0, Landroidx/camera/core/w2;->h:Lw/x2;

    .line 52
    .line 53
    invoke-virtual {p0, p1, v0, v1}, Landroidx/camera/core/w2;->p(Lw/e0;Lw/x2;Lw/x2;)Lw/x2;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    iput-object p1, p0, Landroidx/camera/core/w2;->f:Lw/x2;

    .line 58
    .line 59
    :goto_1
    const/4 p1, 0x1

    .line 60
    return p1
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
.end method

.method public H(Landroid/graphics/Rect;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/core/w2;->i:Landroid/graphics/Rect;

    return-void
.end method

.method protected I(Lw/k2;)V
    .locals 2

    .line 1
    iput-object p1, p0, Landroidx/camera/core/w2;->k:Lw/k2;

    .line 2
    .line 3
    invoke-virtual {p1}, Lw/k2;->i()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lw/w0;

    .line 22
    .line 23
    invoke-virtual {v0}, Lw/w0;->e()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    if-nez v1, :cond_0

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v0, v1}, Lw/w0;->o(Ljava/lang/Class;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    return-void
    .line 38
    .line 39
    .line 40
.end method

.method public J(Landroid/util/Size;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/camera/core/w2;->D(Landroid/util/Size;)Landroid/util/Size;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/core/w2;->g:Landroid/util/Size;

    return-void
.end method

.method public b()Landroid/util/Size;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/w2;->g:Landroid/util/Size;

    return-object v0
.end method

.method public c()Lw/g0;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/core/w2;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/w2;->j:Lw/g0;

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return-object v1

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    throw v1
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

.method protected d()Lw/b0;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/core/w2;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/w2;->j:Lw/g0;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    sget-object v1, Lw/b0;->a:Lw/b0;

    .line 9
    .line 10
    monitor-exit v0

    .line 11
    return-object v1

    .line 12
    :cond_0
    invoke-interface {v1}, Lw/g0;->h()Lw/b0;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    monitor-exit v0

    .line 17
    return-object v1

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

.method protected e()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/camera/core/w2;->c()Lw/g0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v2, "No camera attached to use case: "

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {v0, v1}, Landroidx/core/util/g;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Lw/g0;

    .line 27
    .line 28
    invoke-interface {v0}, Lw/g0;->l()Lw/e0;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-interface {v0}, Lw/e0;->b()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    return-object v0
    .line 37
    .line 38
    .line 39
    .line 40
.end method

.method public f()Lw/x2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lw/x2<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/core/w2;->f:Lw/x2;

    return-object v0
.end method

.method public abstract g(ZLw/y2;)Lw/x2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lw/y2;",
            ")",
            "Lw/x2<",
            "*>;"
        }
    .end annotation
.end method

.method public h()I
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/w2;->f:Lw/x2;

    invoke-interface {v0}, Lw/i1;->l()I

    move-result v0

    return v0
.end method

.method public i()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Landroidx/camera/core/w2;->f:Lw/x2;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "<UnknownUseCase-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ">"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lz/i;->r(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected j(Lw/g0;)I
    .locals 1

    .line 1
    invoke-interface {p1}, Lw/g0;->l()Lw/e0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0}, Landroidx/camera/core/w2;->l()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-interface {p1, v0}, Landroidx/camera/core/r;->e(I)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
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

.method public k()Lw/k2;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/w2;->k:Lw/k2;

    return-object v0
.end method

.method protected l()I
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/core/w2;->f:Lw/x2;

    check-cast v0, Lw/k1;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lw/k1;->D(I)I

    move-result v0

    return v0
.end method

.method public abstract m(Lw/r0;)Lw/x2$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw/r0;",
            ")",
            "Lw/x2$a<",
            "***>;"
        }
    .end annotation
.end method

.method public n()Landroid/graphics/Rect;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/w2;->i:Landroid/graphics/Rect;

    return-object v0
.end method

.method protected o(Ljava/lang/String;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/camera/core/w2;->c()Lw/g0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    :cond_0
    invoke-virtual {p0}, Landroidx/camera/core/w2;->e()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {p1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
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

.method public p(Lw/e0;Lw/x2;Lw/x2;)Lw/x2;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw/e0;",
            "Lw/x2<",
            "*>;",
            "Lw/x2<",
            "*>;)",
            "Lw/x2<",
            "*>;"
        }
    .end annotation

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    invoke-static {p3}, Lw/x1;->K(Lw/r0;)Lw/x1;

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    sget-object v0, Lz/i;->s:Lw/r0$a;

    .line 8
    .line 9
    invoke-virtual {p3, v0}, Lw/x1;->L(Lw/r0$a;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-static {}, Lw/x1;->J()Lw/x1;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    :goto_0
    iget-object v0, p0, Landroidx/camera/core/w2;->e:Lw/x2;

    .line 18
    .line 19
    invoke-interface {v0}, Lw/i2;->c()Ljava/util/Set;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Lw/r0$a;

    .line 38
    .line 39
    iget-object v2, p0, Landroidx/camera/core/w2;->e:Lw/x2;

    .line 40
    .line 41
    invoke-interface {v2, v1}, Lw/i2;->d(Lw/r0$a;)Lw/r0$c;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    iget-object v3, p0, Landroidx/camera/core/w2;->e:Lw/x2;

    .line 46
    .line 47
    invoke-interface {v3, v1}, Lw/i2;->b(Lw/r0$a;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-virtual {p3, v1, v2, v3}, Lw/x1;->E(Lw/r0$a;Lw/r0$c;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    if-eqz p2, :cond_3

    .line 56
    .line 57
    invoke-interface {p2}, Lw/i2;->c()Ljava/util/Set;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_3

    .line 70
    .line 71
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    check-cast v1, Lw/r0$a;

    .line 76
    .line 77
    invoke-virtual {v1}, Lw/r0$a;->c()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    sget-object v3, Lz/i;->s:Lw/r0$a;

    .line 82
    .line 83
    invoke-virtual {v3}, Lw/r0$a;->c()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-eqz v2, :cond_2

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_2
    invoke-interface {p2, v1}, Lw/i2;->d(Lw/r0$a;)Lw/r0$c;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-interface {p2, v1}, Lw/i2;->b(Lw/r0$a;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    invoke-virtual {p3, v1, v2, v3}, Lw/x1;->E(Lw/r0$a;Lw/r0$c;Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_3
    sget-object p2, Lw/k1;->h:Lw/r0$a;

    .line 107
    .line 108
    invoke-virtual {p3, p2}, Lw/c2;->e(Lw/r0$a;)Z

    .line 109
    .line 110
    .line 111
    move-result p2

    .line 112
    if-eqz p2, :cond_4

    .line 113
    .line 114
    sget-object p2, Lw/k1;->f:Lw/r0$a;

    .line 115
    .line 116
    invoke-virtual {p3, p2}, Lw/c2;->e(Lw/r0$a;)Z

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    if-eqz v0, :cond_4

    .line 121
    .line 122
    invoke-virtual {p3, p2}, Lw/x1;->L(Lw/r0$a;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    :cond_4
    invoke-virtual {p0, p3}, Landroidx/camera/core/w2;->m(Lw/r0;)Lw/x2$a;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    invoke-virtual {p0, p1, p2}, Landroidx/camera/core/w2;->A(Lw/e0;Lw/x2$a;)Lw/x2;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    return-object p1
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

.method protected final q()V
    .locals 1

    .line 1
    sget-object v0, Landroidx/camera/core/w2$c;->k:Landroidx/camera/core/w2$c;

    .line 2
    .line 3
    iput-object v0, p0, Landroidx/camera/core/w2;->c:Landroidx/camera/core/w2$c;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/camera/core/w2;->t()V

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

.method protected final r()V
    .locals 1

    .line 1
    sget-object v0, Landroidx/camera/core/w2$c;->l:Landroidx/camera/core/w2$c;

    .line 2
    .line 3
    iput-object v0, p0, Landroidx/camera/core/w2;->c:Landroidx/camera/core/w2$c;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/camera/core/w2;->t()V

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

.method protected final s()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/core/w2;->a:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Landroidx/camera/core/w2$d;

    .line 18
    .line 19
    invoke-interface {v1, p0}, Landroidx/camera/core/w2$d;->e(Landroidx/camera/core/w2;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-void
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

.method public final t()V
    .locals 2

    .line 1
    sget-object v0, Landroidx/camera/core/w2$a;->a:[I

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/camera/core/w2;->c:Landroidx/camera/core/w2$c;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    aget v0, v0, v1

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    if-eq v0, v1, :cond_1

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    if-eq v0, v1, :cond_0

    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_0
    iget-object v0, p0, Landroidx/camera/core/w2;->a:Ljava/util/Set;

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

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
    if-eqz v1, :cond_2

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Landroidx/camera/core/w2$d;

    .line 35
    .line 36
    invoke-interface {v1, p0}, Landroidx/camera/core/w2$d;->c(Landroidx/camera/core/w2;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    iget-object v0, p0, Landroidx/camera/core/w2;->a:Ljava/util/Set;

    .line 41
    .line 42
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_2

    .line 51
    .line 52
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    check-cast v1, Landroidx/camera/core/w2$d;

    .line 57
    .line 58
    invoke-interface {v1, p0}, Landroidx/camera/core/w2$d;->m(Landroidx/camera/core/w2;)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    :goto_2
    return-void
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
.end method

.method protected final u()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/core/w2;->a:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Landroidx/camera/core/w2$d;

    .line 18
    .line 19
    invoke-interface {v1, p0}, Landroidx/camera/core/w2$d;->f(Landroidx/camera/core/w2;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-void
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

.method public v(Lw/g0;Lw/x2;Lw/x2;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw/g0;",
            "Lw/x2<",
            "*>;",
            "Lw/x2<",
            "*>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/camera/core/w2;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iput-object p1, p0, Landroidx/camera/core/w2;->j:Lw/g0;

    .line 5
    .line 6
    invoke-direct {p0, p1}, Landroidx/camera/core/w2;->a(Landroidx/camera/core/w2$d;)V

    .line 7
    .line 8
    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    iput-object p2, p0, Landroidx/camera/core/w2;->d:Lw/x2;

    .line 11
    .line 12
    iput-object p3, p0, Landroidx/camera/core/w2;->h:Lw/x2;

    .line 13
    .line 14
    invoke-interface {p1}, Lw/g0;->l()Lw/e0;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    iget-object p3, p0, Landroidx/camera/core/w2;->d:Lw/x2;

    .line 19
    .line 20
    iget-object v0, p0, Landroidx/camera/core/w2;->h:Lw/x2;

    .line 21
    .line 22
    invoke-virtual {p0, p2, p3, v0}, Landroidx/camera/core/w2;->p(Lw/e0;Lw/x2;Lw/x2;)Lw/x2;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    iput-object p2, p0, Landroidx/camera/core/w2;->f:Lw/x2;

    .line 27
    .line 28
    const/4 p3, 0x0

    .line 29
    invoke-interface {p2, p3}, Lz/m;->C(Landroidx/camera/core/w2$b;)Landroidx/camera/core/w2$b;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    if-eqz p2, :cond_0

    .line 34
    .line 35
    invoke-interface {p1}, Lw/g0;->l()Lw/e0;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-interface {p2, p1}, Landroidx/camera/core/w2$b;->b(Landroidx/camera/core/r;)V

    .line 40
    .line 41
    .line 42
    :cond_0
    invoke-virtual {p0}, Landroidx/camera/core/w2;->w()V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :catchall_0
    move-exception p1

    .line 47
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 48
    throw p1
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

.method public w()V
    .locals 0

    return-void
.end method

.method protected x()V
    .locals 0

    return-void
.end method

.method public y(Lw/g0;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/camera/core/w2;->z()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/camera/core/w2;->f:Lw/x2;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-interface {v0, v1}, Lz/m;->C(Landroidx/camera/core/w2$b;)Landroidx/camera/core/w2$b;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Landroidx/camera/core/w2$b;->a()V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Landroidx/camera/core/w2;->b:Ljava/lang/Object;

    .line 17
    .line 18
    monitor-enter v0

    .line 19
    :try_start_0
    iget-object v2, p0, Landroidx/camera/core/w2;->j:Lw/g0;

    .line 20
    .line 21
    if-ne p1, v2, :cond_1

    .line 22
    .line 23
    const/4 p1, 0x1

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 p1, 0x0

    .line 26
    :goto_0
    invoke-static {p1}, Landroidx/core/util/g;->a(Z)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Landroidx/camera/core/w2;->j:Lw/g0;

    .line 30
    .line 31
    invoke-direct {p0, p1}, Landroidx/camera/core/w2;->E(Landroidx/camera/core/w2$d;)V

    .line 32
    .line 33
    .line 34
    iput-object v1, p0, Landroidx/camera/core/w2;->j:Lw/g0;

    .line 35
    .line 36
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    iput-object v1, p0, Landroidx/camera/core/w2;->g:Landroid/util/Size;

    .line 38
    .line 39
    iput-object v1, p0, Landroidx/camera/core/w2;->i:Landroid/graphics/Rect;

    .line 40
    .line 41
    iget-object p1, p0, Landroidx/camera/core/w2;->e:Lw/x2;

    .line 42
    .line 43
    iput-object p1, p0, Landroidx/camera/core/w2;->f:Lw/x2;

    .line 44
    .line 45
    iput-object v1, p0, Landroidx/camera/core/w2;->d:Lw/x2;

    .line 46
    .line 47
    iput-object v1, p0, Landroidx/camera/core/w2;->h:Lw/x2;

    .line 48
    .line 49
    return-void

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

.method public z()V
    .locals 0

    return-void
.end method
