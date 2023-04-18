.class public final Lw/n0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw/n0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lw/w0;",
            ">;"
        }
    .end annotation
.end field

.field private b:Lw/w1;

.field private c:I

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lw/k;",
            ">;"
        }
    .end annotation
.end field

.field private e:Z

.field private f:Lw/z1;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lw/n0$a;->a:Ljava/util/Set;

    .line 3
    invoke-static {}, Lw/x1;->J()Lw/x1;

    move-result-object v0

    iput-object v0, p0, Lw/n0$a;->b:Lw/w1;

    const/4 v0, -0x1

    .line 4
    iput v0, p0, Lw/n0$a;->c:I

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lw/n0$a;->d:Ljava/util/List;

    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lw/n0$a;->e:Z

    .line 7
    invoke-static {}, Lw/z1;->f()Lw/z1;

    move-result-object v0

    iput-object v0, p0, Lw/n0$a;->f:Lw/z1;

    return-void
.end method

.method private constructor <init>(Lw/n0;)V
    .locals 2

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lw/n0$a;->a:Ljava/util/Set;

    .line 10
    invoke-static {}, Lw/x1;->J()Lw/x1;

    move-result-object v1

    iput-object v1, p0, Lw/n0$a;->b:Lw/w1;

    const/4 v1, -0x1

    .line 11
    iput v1, p0, Lw/n0$a;->c:I

    .line 12
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lw/n0$a;->d:Ljava/util/List;

    const/4 v1, 0x0

    .line 13
    iput-boolean v1, p0, Lw/n0$a;->e:Z

    .line 14
    invoke-static {}, Lw/z1;->f()Lw/z1;

    move-result-object v1

    iput-object v1, p0, Lw/n0$a;->f:Lw/z1;

    .line 15
    iget-object v1, p1, Lw/n0;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 16
    iget-object v0, p1, Lw/n0;->b:Lw/r0;

    invoke-static {v0}, Lw/x1;->K(Lw/r0;)Lw/x1;

    move-result-object v0

    iput-object v0, p0, Lw/n0$a;->b:Lw/w1;

    .line 17
    iget v0, p1, Lw/n0;->c:I

    iput v0, p0, Lw/n0$a;->c:I

    .line 18
    iget-object v0, p0, Lw/n0$a;->d:Ljava/util/List;

    invoke-virtual {p1}, Lw/n0;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 19
    invoke-virtual {p1}, Lw/n0;->g()Z

    move-result v0

    iput-boolean v0, p0, Lw/n0$a;->e:Z

    .line 20
    invoke-virtual {p1}, Lw/n0;->e()Lw/s2;

    move-result-object p1

    invoke-static {p1}, Lw/z1;->g(Lw/s2;)Lw/z1;

    move-result-object p1

    iput-object p1, p0, Lw/n0$a;->f:Lw/z1;

    return-void
.end method

.method public static j(Lw/x2;)Lw/n0$a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw/x2<",
            "*>;)",
            "Lw/n0$a;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p0, v0}, Lw/x2;->u(Lw/n0$b;)Lw/n0$b;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v1, Lw/n0$a;

    .line 9
    .line 10
    invoke-direct {v1}, Lw/n0$a;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, p0, v1}, Lw/n0$b;->a(Lw/x2;Lw/n0$a;)V

    .line 14
    .line 15
    .line 16
    return-object v1

    .line 17
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 18
    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v2, "Implementation is missing option unpacker for "

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-interface {p0, v2}, Lz/i;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw v0
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
.end method

.method public static k(Lw/n0;)Lw/n0$a;
    .locals 1

    new-instance v0, Lw/n0$a;

    invoke-direct {v0, p0}, Lw/n0$a;-><init>(Lw/n0;)V

    return-object v0
.end method


# virtual methods
.method public a(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lw/k;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lw/k;

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lw/n0$a;->c(Lw/k;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
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

.method public b(Lw/s2;)V
    .locals 1

    iget-object v0, p0, Lw/n0$a;->f:Lw/z1;

    invoke-virtual {v0, p1}, Lw/z1;->e(Lw/s2;)V

    return-void
.end method

.method public c(Lw/k;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lw/n0$a;->d:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v0, p0, Lw/n0$a;->d:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    return-void
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

.method public d(Lw/r0$a;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lw/r0$a<",
            "TT;>;TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lw/n0$a;->b:Lw/w1;

    invoke-interface {v0, p1, p2}, Lw/w1;->g(Lw/r0$a;Ljava/lang/Object;)V

    return-void
.end method

.method public e(Lw/r0;)V
    .locals 5

    .line 1
    invoke-interface {p1}, Lw/r0;->c()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_2

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lw/r0$a;

    .line 20
    .line 21
    iget-object v2, p0, Lw/n0$a;->b:Lw/w1;

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    invoke-interface {v2, v1, v3}, Lw/r0;->a(Lw/r0$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-interface {p1, v1}, Lw/r0;->b(Lw/r0$a;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    instance-of v4, v2, Lw/v1;

    .line 33
    .line 34
    if-eqz v4, :cond_0

    .line 35
    .line 36
    check-cast v2, Lw/v1;

    .line 37
    .line 38
    check-cast v3, Lw/v1;

    .line 39
    .line 40
    invoke-virtual {v3}, Lw/v1;->c()Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v2, v1}, Lw/v1;->a(Ljava/util/List;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    instance-of v2, v3, Lw/v1;

    .line 49
    .line 50
    if-eqz v2, :cond_1

    .line 51
    .line 52
    check-cast v3, Lw/v1;

    .line 53
    .line 54
    invoke-virtual {v3}, Lw/v1;->b()Lw/v1;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    :cond_1
    iget-object v2, p0, Lw/n0$a;->b:Lw/w1;

    .line 59
    .line 60
    invoke-interface {p1, v1}, Lw/r0;->d(Lw/r0$a;)Lw/r0$c;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-interface {v2, v1, v4, v3}, Lw/w1;->E(Lw/r0$a;Lw/r0$c;Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    return-void
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

.method public f(Lw/w0;)V
    .locals 1

    iget-object v0, p0, Lw/n0$a;->a:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public g(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lw/n0$a;->f:Lw/z1;

    invoke-virtual {v0, p1, p2}, Lw/z1;->h(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public h()Lw/n0;
    .locals 8

    .line 1
    new-instance v7, Lw/n0;

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object v0, p0, Lw/n0$a;->a:Ljava/util/Set;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lw/n0$a;->b:Lw/w1;

    .line 11
    .line 12
    invoke-static {v0}, Lw/c2;->H(Lw/r0;)Lw/c2;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    iget v3, p0, Lw/n0$a;->c:I

    .line 17
    .line 18
    iget-object v4, p0, Lw/n0$a;->d:Ljava/util/List;

    .line 19
    .line 20
    iget-boolean v5, p0, Lw/n0$a;->e:Z

    .line 21
    .line 22
    iget-object v0, p0, Lw/n0$a;->f:Lw/z1;

    .line 23
    .line 24
    invoke-static {v0}, Lw/s2;->b(Lw/s2;)Lw/s2;

    .line 25
    .line 26
    .line 27
    move-result-object v6

    .line 28
    move-object v0, v7

    .line 29
    invoke-direct/range {v0 .. v6}, Lw/n0;-><init>(Ljava/util/List;Lw/r0;ILjava/util/List;ZLw/s2;)V

    .line 30
    .line 31
    .line 32
    return-object v7
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method

.method public i()V
    .locals 1

    iget-object v0, p0, Lw/n0$a;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    return-void
.end method

.method public l()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lw/w0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lw/n0$a;->a:Ljava/util/Set;

    return-object v0
.end method

.method public m()I
    .locals 1

    iget v0, p0, Lw/n0$a;->c:I

    return v0
.end method

.method public n(Lw/r0;)V
    .locals 0

    invoke-static {p1}, Lw/x1;->K(Lw/r0;)Lw/x1;

    move-result-object p1

    iput-object p1, p0, Lw/n0$a;->b:Lw/w1;

    return-void
.end method

.method public o(I)V
    .locals 0

    iput p1, p0, Lw/n0$a;->c:I

    return-void
.end method

.method public p(Z)V
    .locals 0

    iput-boolean p1, p0, Lw/n0$a;->e:Z

    return-void
.end method
