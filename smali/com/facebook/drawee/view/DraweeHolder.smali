.class public Lcom/facebook/drawee/view/DraweeHolder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/drawee/drawable/q;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<DH::",
        "Lcom/facebook/drawee/interfaces/DraweeHierarchy;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/facebook/drawee/drawable/q;"
    }
.end annotation


# instance fields
.field private a:Z

.field private b:Z

.field private c:Z

.field private d:Lcom/facebook/drawee/interfaces/DraweeHierarchy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TDH;"
        }
    .end annotation
.end field

.field private e:Lcom/facebook/drawee/interfaces/DraweeController;

.field private final f:Lo4/c;


# direct methods
.method public constructor <init>(Lcom/facebook/drawee/interfaces/DraweeHierarchy;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TDH;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/facebook/drawee/view/DraweeHolder;->a:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lcom/facebook/drawee/view/DraweeHolder;->b:Z

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, Lcom/facebook/drawee/view/DraweeHolder;->c:Z

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    iput-object v0, p0, Lcom/facebook/drawee/view/DraweeHolder;->e:Lcom/facebook/drawee/interfaces/DraweeController;

    .line 14
    .line 15
    invoke-static {}, Lo4/c;->a()Lo4/c;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Lcom/facebook/drawee/view/DraweeHolder;->f:Lo4/c;

    .line 20
    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Lcom/facebook/drawee/view/DraweeHolder;->p(Lcom/facebook/drawee/interfaces/DraweeHierarchy;)V

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
.end method

.method private b()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/facebook/drawee/view/DraweeHolder;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/facebook/drawee/view/DraweeHolder;->f:Lo4/c;

    .line 7
    .line 8
    sget-object v1, Lo4/c$a;->q:Lo4/c$a;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lo4/c;->b(Lo4/c$a;)V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    iput-boolean v0, p0, Lcom/facebook/drawee/view/DraweeHolder;->a:Z

    .line 15
    .line 16
    iget-object v0, p0, Lcom/facebook/drawee/view/DraweeHolder;->e:Lcom/facebook/drawee/interfaces/DraweeController;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-interface {v0}, Lcom/facebook/drawee/interfaces/DraweeController;->c()Lcom/facebook/drawee/interfaces/DraweeHierarchy;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    iget-object v0, p0, Lcom/facebook/drawee/view/DraweeHolder;->e:Lcom/facebook/drawee/interfaces/DraweeController;

    .line 27
    .line 28
    invoke-interface {v0}, Lcom/facebook/drawee/interfaces/DraweeController;->e()V

    .line 29
    .line 30
    .line 31
    :cond_1
    return-void
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
.end method

.method private c()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/drawee/view/DraweeHolder;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/facebook/drawee/view/DraweeHolder;->c:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, Lcom/facebook/drawee/view/DraweeHolder;->b()V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-direct {p0}, Lcom/facebook/drawee/view/DraweeHolder;->e()V

    .line 14
    .line 15
    .line 16
    :goto_0
    return-void
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
.end method

.method public static d(Lcom/facebook/drawee/interfaces/DraweeHierarchy;Landroid/content/Context;)Lcom/facebook/drawee/view/DraweeHolder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<DH::",
            "Lcom/facebook/drawee/interfaces/DraweeHierarchy;",
            ">(TDH;",
            "Landroid/content/Context;",
            ")",
            "Lcom/facebook/drawee/view/DraweeHolder<",
            "TDH;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/facebook/drawee/view/DraweeHolder;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/facebook/drawee/view/DraweeHolder;-><init>(Lcom/facebook/drawee/interfaces/DraweeHierarchy;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lcom/facebook/drawee/view/DraweeHolder;->n(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    return-object v0
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
.end method

.method private e()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/facebook/drawee/view/DraweeHolder;->a:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/facebook/drawee/view/DraweeHolder;->f:Lo4/c;

    .line 7
    .line 8
    sget-object v1, Lo4/c$a;->r:Lo4/c$a;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lo4/c;->b(Lo4/c$a;)V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput-boolean v0, p0, Lcom/facebook/drawee/view/DraweeHolder;->a:Z

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/facebook/drawee/view/DraweeHolder;->j()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, Lcom/facebook/drawee/view/DraweeHolder;->e:Lcom/facebook/drawee/interfaces/DraweeController;

    .line 23
    .line 24
    invoke-interface {v0}, Lcom/facebook/drawee/interfaces/DraweeController;->a()V

    .line 25
    .line 26
    .line 27
    :cond_1
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
.end method

.method private q(Lcom/facebook/drawee/drawable/q;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/facebook/drawee/view/DraweeHolder;->h()Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Lcom/facebook/drawee/drawable/p;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Lcom/facebook/drawee/drawable/p;

    .line 10
    .line 11
    invoke-interface {v0, p1}, Lcom/facebook/drawee/drawable/p;->f(Lcom/facebook/drawee/drawable/q;)V

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
.end method


# virtual methods
.method public a(Z)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/facebook/drawee/view/DraweeHolder;->c:Z

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/facebook/drawee/view/DraweeHolder;->f:Lo4/c;

    .line 7
    .line 8
    if-eqz p1, :cond_1

    .line 9
    .line 10
    sget-object v1, Lo4/c$a;->A:Lo4/c$a;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_1
    sget-object v1, Lo4/c$a;->B:Lo4/c$a;

    .line 14
    .line 15
    :goto_0
    invoke-virtual {v0, v1}, Lo4/c;->b(Lo4/c$a;)V

    .line 16
    .line 17
    .line 18
    iput-boolean p1, p0, Lcom/facebook/drawee/view/DraweeHolder;->c:Z

    .line 19
    .line 20
    invoke-direct {p0}, Lcom/facebook/drawee/view/DraweeHolder;->c()V

    .line 21
    .line 22
    .line 23
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
.end method

.method public f()Lcom/facebook/drawee/interfaces/DraweeController;
    .locals 1

    iget-object v0, p0, Lcom/facebook/drawee/view/DraweeHolder;->e:Lcom/facebook/drawee/interfaces/DraweeController;

    return-object v0
.end method

.method public g()Lcom/facebook/drawee/interfaces/DraweeHierarchy;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TDH;"
        }
    .end annotation

    iget-object v0, p0, Lcom/facebook/drawee/view/DraweeHolder;->d:Lcom/facebook/drawee/interfaces/DraweeHierarchy;

    invoke-static {v0}, Lv3/j;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/interfaces/DraweeHierarchy;

    return-object v0
.end method

.method public h()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lcom/facebook/drawee/view/DraweeHolder;->d:Lcom/facebook/drawee/interfaces/DraweeHierarchy;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Lcom/facebook/drawee/interfaces/DraweeHierarchy;->e()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public i()Z
    .locals 1

    iget-object v0, p0, Lcom/facebook/drawee/view/DraweeHolder;->d:Lcom/facebook/drawee/interfaces/DraweeHierarchy;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public j()Z
    .locals 2

    iget-object v0, p0, Lcom/facebook/drawee/view/DraweeHolder;->e:Lcom/facebook/drawee/interfaces/DraweeController;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/facebook/drawee/interfaces/DraweeController;->c()Lcom/facebook/drawee/interfaces/DraweeHierarchy;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/drawee/view/DraweeHolder;->d:Lcom/facebook/drawee/interfaces/DraweeHierarchy;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public k()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/drawee/view/DraweeHolder;->f:Lo4/c;

    .line 2
    .line 3
    sget-object v1, Lo4/c$a;->y:Lo4/c$a;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lo4/c;->b(Lo4/c$a;)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Lcom/facebook/drawee/view/DraweeHolder;->b:Z

    .line 10
    .line 11
    invoke-direct {p0}, Lcom/facebook/drawee/view/DraweeHolder;->c()V

    .line 12
    .line 13
    .line 14
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
.end method

.method public l()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/drawee/view/DraweeHolder;->f:Lo4/c;

    .line 2
    .line 3
    sget-object v1, Lo4/c$a;->z:Lo4/c$a;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lo4/c;->b(Lo4/c$a;)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lcom/facebook/drawee/view/DraweeHolder;->b:Z

    .line 10
    .line 11
    invoke-direct {p0}, Lcom/facebook/drawee/view/DraweeHolder;->c()V

    .line 12
    .line 13
    .line 14
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
.end method

.method public m(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/facebook/drawee/view/DraweeHolder;->j()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/facebook/drawee/view/DraweeHolder;->e:Lcom/facebook/drawee/interfaces/DraweeController;

    .line 10
    .line 11
    invoke-interface {v0, p1}, Lcom/facebook/drawee/interfaces/DraweeController;->b(Landroid/view/MotionEvent;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1
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
.end method

.method public n(Landroid/content/Context;)V
    .locals 0

    return-void
.end method

.method public o(Lcom/facebook/drawee/interfaces/DraweeController;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/facebook/drawee/view/DraweeHolder;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/facebook/drawee/view/DraweeHolder;->e()V

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/drawee/view/DraweeHolder;->j()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    iget-object v1, p0, Lcom/facebook/drawee/view/DraweeHolder;->f:Lo4/c;

    .line 15
    .line 16
    sget-object v2, Lo4/c$a;->n:Lo4/c$a;

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Lo4/c;->b(Lo4/c$a;)V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lcom/facebook/drawee/view/DraweeHolder;->e:Lcom/facebook/drawee/interfaces/DraweeController;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-interface {v1, v2}, Lcom/facebook/drawee/interfaces/DraweeController;->f(Lcom/facebook/drawee/interfaces/DraweeHierarchy;)V

    .line 25
    .line 26
    .line 27
    :cond_1
    iput-object p1, p0, Lcom/facebook/drawee/view/DraweeHolder;->e:Lcom/facebook/drawee/interfaces/DraweeController;

    .line 28
    .line 29
    if-eqz p1, :cond_2

    .line 30
    .line 31
    iget-object p1, p0, Lcom/facebook/drawee/view/DraweeHolder;->f:Lo4/c;

    .line 32
    .line 33
    sget-object v1, Lo4/c$a;->m:Lo4/c$a;

    .line 34
    .line 35
    invoke-virtual {p1, v1}, Lo4/c;->b(Lo4/c$a;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lcom/facebook/drawee/view/DraweeHolder;->e:Lcom/facebook/drawee/interfaces/DraweeController;

    .line 39
    .line 40
    iget-object v1, p0, Lcom/facebook/drawee/view/DraweeHolder;->d:Lcom/facebook/drawee/interfaces/DraweeHierarchy;

    .line 41
    .line 42
    invoke-interface {p1, v1}, Lcom/facebook/drawee/interfaces/DraweeController;->f(Lcom/facebook/drawee/interfaces/DraweeHierarchy;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    iget-object p1, p0, Lcom/facebook/drawee/view/DraweeHolder;->f:Lo4/c;

    .line 47
    .line 48
    sget-object v1, Lo4/c$a;->o:Lo4/c$a;

    .line 49
    .line 50
    invoke-virtual {p1, v1}, Lo4/c;->b(Lo4/c$a;)V

    .line 51
    .line 52
    .line 53
    :goto_0
    if-eqz v0, :cond_3

    .line 54
    .line 55
    invoke-direct {p0}, Lcom/facebook/drawee/view/DraweeHolder;->b()V

    .line 56
    .line 57
    .line 58
    :cond_3
    return-void
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
.end method

.method public onDraw()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/facebook/drawee/view/DraweeHolder;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x3

    .line 7
    new-array v0, v0, [Ljava/lang/Object;

    .line 8
    .line 9
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const/4 v2, 0x0

    .line 18
    aput-object v1, v0, v2

    .line 19
    .line 20
    iget-object v1, p0, Lcom/facebook/drawee/view/DraweeHolder;->e:Lcom/facebook/drawee/interfaces/DraweeController;

    .line 21
    .line 22
    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const/4 v2, 0x1

    .line 31
    aput-object v1, v0, v2

    .line 32
    .line 33
    const/4 v1, 0x2

    .line 34
    invoke-virtual {p0}, Lcom/facebook/drawee/view/DraweeHolder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    aput-object v3, v0, v1

    .line 39
    .line 40
    const-class v1, Lo4/c;

    .line 41
    .line 42
    const-string v3, "%x: Draw requested for a non-attached controller %x. %s"

    .line 43
    .line 44
    invoke-static {v1, v3, v0}, Lw3/a;->F(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iput-boolean v2, p0, Lcom/facebook/drawee/view/DraweeHolder;->b:Z

    .line 48
    .line 49
    iput-boolean v2, p0, Lcom/facebook/drawee/view/DraweeHolder;->c:Z

    .line 50
    .line 51
    invoke-direct {p0}, Lcom/facebook/drawee/view/DraweeHolder;->c()V

    .line 52
    .line 53
    .line 54
    return-void
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
.end method

.method public p(Lcom/facebook/drawee/interfaces/DraweeHierarchy;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TDH;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/facebook/drawee/view/DraweeHolder;->f:Lo4/c;

    .line 2
    .line 3
    sget-object v1, Lo4/c$a;->k:Lo4/c$a;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lo4/c;->b(Lo4/c$a;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/facebook/drawee/view/DraweeHolder;->j()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-direct {p0, v1}, Lcom/facebook/drawee/view/DraweeHolder;->q(Lcom/facebook/drawee/drawable/q;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p1}, Lv3/j;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lcom/facebook/drawee/interfaces/DraweeHierarchy;

    .line 21
    .line 22
    iput-object v1, p0, Lcom/facebook/drawee/view/DraweeHolder;->d:Lcom/facebook/drawee/interfaces/DraweeHierarchy;

    .line 23
    .line 24
    invoke-interface {v1}, Lcom/facebook/drawee/interfaces/DraweeHierarchy;->e()Landroid/graphics/drawable/Drawable;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/4 v1, 0x0

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    :goto_0
    const/4 v1, 0x1

    .line 40
    :goto_1
    invoke-virtual {p0, v1}, Lcom/facebook/drawee/view/DraweeHolder;->a(Z)V

    .line 41
    .line 42
    .line 43
    invoke-direct {p0, p0}, Lcom/facebook/drawee/view/DraweeHolder;->q(Lcom/facebook/drawee/drawable/q;)V

    .line 44
    .line 45
    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    iget-object v0, p0, Lcom/facebook/drawee/view/DraweeHolder;->e:Lcom/facebook/drawee/interfaces/DraweeController;

    .line 49
    .line 50
    invoke-interface {v0, p1}, Lcom/facebook/drawee/interfaces/DraweeController;->f(Lcom/facebook/drawee/interfaces/DraweeHierarchy;)V

    .line 51
    .line 52
    .line 53
    :cond_2
    return-void
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
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {p0}, Lv3/i;->c(Ljava/lang/Object;)Lv3/i$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "controllerAttached"

    .line 6
    .line 7
    iget-boolean v2, p0, Lcom/facebook/drawee/view/DraweeHolder;->a:Z

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, Lv3/i$b;->c(Ljava/lang/String;Z)Lv3/i$b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "holderAttached"

    .line 14
    .line 15
    iget-boolean v2, p0, Lcom/facebook/drawee/view/DraweeHolder;->b:Z

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Lv3/i$b;->c(Ljava/lang/String;Z)Lv3/i$b;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "drawableVisible"

    .line 22
    .line 23
    iget-boolean v2, p0, Lcom/facebook/drawee/view/DraweeHolder;->c:Z

    .line 24
    .line 25
    invoke-virtual {v0, v1, v2}, Lv3/i$b;->c(Ljava/lang/String;Z)Lv3/i$b;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v1, p0, Lcom/facebook/drawee/view/DraweeHolder;->f:Lo4/c;

    .line 30
    .line 31
    invoke-virtual {v1}, Lo4/c;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const-string v2, "events"

    .line 36
    .line 37
    invoke-virtual {v0, v2, v1}, Lv3/i$b;->b(Ljava/lang/String;Ljava/lang/Object;)Lv3/i$b;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0}, Lv3/i$b;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    return-object v0
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
.end method
