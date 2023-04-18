.class Landroidx/camera/view/l$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/a2$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/view/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/camera/view/l;


# direct methods
.method constructor <init>(Landroidx/camera/view/l;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/view/l$a;->a:Landroidx/camera/view/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b(Landroidx/camera/view/l$a;Landroidx/camera/view/e;Lw/g0;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/camera/view/l$a;->g(Landroidx/camera/view/e;Lw/g0;)V

    return-void
.end method

.method public static synthetic c(Landroidx/camera/view/l$a;Lw/g0;Landroidx/camera/core/v2;Landroidx/camera/core/v2$g;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroidx/camera/view/l$a;->f(Lw/g0;Landroidx/camera/core/v2;Landroidx/camera/core/v2$g;)V

    return-void
.end method

.method public static synthetic d(Landroidx/camera/view/l$a;Landroidx/camera/core/v2;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/view/l$a;->e(Landroidx/camera/core/v2;)V

    return-void
.end method

.method private synthetic e(Landroidx/camera/core/v2;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/view/l$a;->a:Landroidx/camera/view/l;

    iget-object v0, v0, Landroidx/camera/view/l;->t:Landroidx/camera/core/a2$d;

    invoke-interface {v0, p1}, Landroidx/camera/core/a2$d;->a(Landroidx/camera/core/v2;)V

    return-void
.end method

.method private synthetic f(Lw/g0;Landroidx/camera/core/v2;Landroidx/camera/core/v2$g;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Preview transformation info updated. "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "PreviewView"

    .line 19
    .line 20
    invoke-static {v1, v0}, Landroidx/camera/core/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-interface {p1}, Lw/g0;->l()Lw/e0;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-interface {p1}, Lw/e0;->c()Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-nez p1, :cond_0

    .line 36
    .line 37
    const/4 p1, 0x1

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 p1, 0x0

    .line 40
    :goto_0
    iget-object v0, p0, Landroidx/camera/view/l$a;->a:Landroidx/camera/view/l;

    .line 41
    .line 42
    iget-object v0, v0, Landroidx/camera/view/l;->m:Landroidx/camera/view/f;

    .line 43
    .line 44
    invoke-virtual {p2}, Landroidx/camera/core/v2;->l()Landroid/util/Size;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    invoke-virtual {v0, p3, p2, p1}, Landroidx/camera/view/f;->o(Landroidx/camera/core/v2$g;Landroid/util/Size;Z)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Landroidx/camera/view/l$a;->a:Landroidx/camera/view/l;

    .line 52
    .line 53
    invoke-virtual {p1}, Landroidx/camera/view/l;->e()V

    .line 54
    .line 55
    .line 56
    return-void
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

.method private synthetic g(Landroidx/camera/view/e;Lw/g0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/view/l$a;->a:Landroidx/camera/view/l;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/camera/view/l;->o:Ljava/util/concurrent/atomic/AtomicReference;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-static {v0, p1, v1}, Landroidx/camera/view/h;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    sget-object v0, Landroidx/camera/view/l$f;->k:Landroidx/camera/view/l$f;

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Landroidx/camera/view/e;->l(Landroidx/camera/view/l$f;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {p1}, Landroidx/camera/view/e;->f()V

    .line 18
    .line 19
    .line 20
    invoke-interface {p2}, Lw/g0;->g()Lw/a2;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-interface {p2, p1}, Lw/a2;->e(Lw/a2$a;)V

    .line 25
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


# virtual methods
.method public a(Landroidx/camera/core/v2;)V
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UnsafeOptInUsageError"
        }
    .end annotation

    .line 1
    invoke-static {}, Landroidx/camera/core/impl/utils/r;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/camera/view/l$a;->a:Landroidx/camera/view/l;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Landroidx/core/content/a;->h(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v1, Landroidx/camera/view/i;

    .line 18
    .line 19
    invoke-direct {v1, p0, p1}, Landroidx/camera/view/i;-><init>(Landroidx/camera/view/l$a;Landroidx/camera/core/v2;)V

    .line 20
    .line 21
    .line 22
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    const-string v0, "PreviewView"

    .line 27
    .line 28
    const-string v1, "Surface requested by Preview."

    .line 29
    .line 30
    invoke-static {v0, v1}, Landroidx/camera/core/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Landroidx/camera/core/v2;->j()Lw/g0;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iget-object v1, p0, Landroidx/camera/view/l$a;->a:Landroidx/camera/view/l;

    .line 38
    .line 39
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-static {v1}, Landroidx/core/content/a;->h(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    new-instance v2, Landroidx/camera/view/j;

    .line 48
    .line 49
    invoke-direct {v2, p0, v0, p1}, Landroidx/camera/view/j;-><init>(Landroidx/camera/view/l$a;Lw/g0;Landroidx/camera/core/v2;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, v1, v2}, Landroidx/camera/core/v2;->w(Ljava/util/concurrent/Executor;Landroidx/camera/core/v2$h;)V

    .line 53
    .line 54
    .line 55
    iget-object v1, p0, Landroidx/camera/view/l$a;->a:Landroidx/camera/view/l;

    .line 56
    .line 57
    iget-object v2, v1, Landroidx/camera/view/l;->k:Landroidx/camera/view/l$c;

    .line 58
    .line 59
    invoke-static {p1, v2}, Landroidx/camera/view/l;->f(Landroidx/camera/core/v2;Landroidx/camera/view/l$c;)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_1

    .line 64
    .line 65
    new-instance v2, Landroidx/camera/view/a0;

    .line 66
    .line 67
    iget-object v3, p0, Landroidx/camera/view/l$a;->a:Landroidx/camera/view/l;

    .line 68
    .line 69
    iget-object v4, v3, Landroidx/camera/view/l;->m:Landroidx/camera/view/f;

    .line 70
    .line 71
    invoke-direct {v2, v3, v4}, Landroidx/camera/view/a0;-><init>(Landroid/widget/FrameLayout;Landroidx/camera/view/f;)V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_1
    new-instance v2, Landroidx/camera/view/t;

    .line 76
    .line 77
    iget-object v3, p0, Landroidx/camera/view/l$a;->a:Landroidx/camera/view/l;

    .line 78
    .line 79
    iget-object v4, v3, Landroidx/camera/view/l;->m:Landroidx/camera/view/f;

    .line 80
    .line 81
    invoke-direct {v2, v3, v4}, Landroidx/camera/view/t;-><init>(Landroid/widget/FrameLayout;Landroidx/camera/view/f;)V

    .line 82
    .line 83
    .line 84
    :goto_0
    iput-object v2, v1, Landroidx/camera/view/l;->l:Landroidx/camera/view/m;

    .line 85
    .line 86
    new-instance v1, Landroidx/camera/view/e;

    .line 87
    .line 88
    invoke-interface {v0}, Lw/g0;->l()Lw/e0;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    iget-object v3, p0, Landroidx/camera/view/l$a;->a:Landroidx/camera/view/l;

    .line 93
    .line 94
    iget-object v4, v3, Landroidx/camera/view/l;->n:Landroidx/lifecycle/MutableLiveData;

    .line 95
    .line 96
    iget-object v3, v3, Landroidx/camera/view/l;->l:Landroidx/camera/view/m;

    .line 97
    .line 98
    invoke-direct {v1, v2, v4, v3}, Landroidx/camera/view/e;-><init>(Lw/e0;Landroidx/lifecycle/MutableLiveData;Landroidx/camera/view/m;)V

    .line 99
    .line 100
    .line 101
    iget-object v2, p0, Landroidx/camera/view/l$a;->a:Landroidx/camera/view/l;

    .line 102
    .line 103
    iget-object v2, v2, Landroidx/camera/view/l;->o:Ljava/util/concurrent/atomic/AtomicReference;

    .line 104
    .line 105
    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    invoke-interface {v0}, Lw/g0;->g()Lw/a2;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    iget-object v3, p0, Landroidx/camera/view/l$a;->a:Landroidx/camera/view/l;

    .line 113
    .line 114
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    invoke-static {v3}, Landroidx/core/content/a;->h(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    invoke-interface {v2, v3, v1}, Lw/a2;->c(Ljava/util/concurrent/Executor;Lw/a2$a;)V

    .line 123
    .line 124
    .line 125
    iget-object v2, p0, Landroidx/camera/view/l$a;->a:Landroidx/camera/view/l;

    .line 126
    .line 127
    iget-object v2, v2, Landroidx/camera/view/l;->l:Landroidx/camera/view/m;

    .line 128
    .line 129
    new-instance v3, Landroidx/camera/view/k;

    .line 130
    .line 131
    invoke-direct {v3, p0, v1, v0}, Landroidx/camera/view/k;-><init>(Landroidx/camera/view/l$a;Landroidx/camera/view/e;Lw/g0;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2, p1, v3}, Landroidx/camera/view/m;->g(Landroidx/camera/core/v2;Landroidx/camera/view/m$a;)V

    .line 135
    .line 136
    .line 137
    return-void
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
