.class public final Li0/c1$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/x2$a;
.implements Lw/k1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li0/c1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Li0/h1;",
        ">",
        "Ljava/lang/Object;",
        "Lw/x2$a<",
        "Li0/c1<",
        "TT;>;",
        "Lj0/a<",
        "TT;>;",
        "Li0/c1$c<",
        "TT;>;>;",
        "Lw/k1$a<",
        "Li0/c1$c<",
        "TT;>;>;"
    }
.end annotation


# instance fields
.field private final a:Lw/x1;


# direct methods
.method constructor <init>(Li0/h1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Li0/c1$c;->f(Li0/h1;)Lw/x1;

    move-result-object p1

    invoke-direct {p0, p1}, Li0/c1$c;-><init>(Lw/x1;)V

    return-void
.end method

.method private constructor <init>(Lw/x1;)V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Li0/c1$c;->a:Lw/x1;

    .line 4
    sget-object v0, Lj0/a;->x:Lw/r0$a;

    invoke-virtual {p1, v0}, Lw/c2;->e(Lw/r0$a;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 5
    sget-object v0, Lz/i;->t:Lw/r0$a;

    const/4 v1, 0x0

    .line 6
    invoke-virtual {p1, v0, v1}, Lw/c2;->a(Lw/r0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Class;

    .line 7
    const-class v0, Li0/c1;

    if-eqz p1, :cond_1

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 8
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid target class configuration for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 9
    :cond_1
    :goto_0
    invoke-virtual {p0, v0}, Li0/c1$c;->j(Ljava/lang/Class;)Li0/c1$c;

    return-void

    .line 10
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "VideoOutput is required"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static f(Li0/h1;)Lw/x1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Li0/h1;",
            ">(TT;)",
            "Lw/x1;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lw/x1;->J()Lw/x1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lj0/a;->x:Lw/r0$a;

    .line 6
    .line 7
    invoke-virtual {v0, v1, p0}, Lw/x1;->g(Lw/r0$a;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-object v0
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

.method static g(Lw/r0;)Li0/c1$c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw/r0;",
            ")",
            "Li0/c1$c<",
            "+",
            "Li0/h1;",
            ">;"
        }
    .end annotation

    new-instance v0, Li0/c1$c;

    invoke-static {p0}, Lw/x1;->K(Lw/r0;)Lw/x1;

    move-result-object p0

    invoke-direct {v0, p0}, Li0/c1$c;-><init>(Lw/x1;)V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic a(Landroid/util/Size;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Li0/c1$c;->l(Landroid/util/Size;)Li0/c1$c;

    move-result-object p1

    return-object p1
.end method

.method public b()Lw/w1;
    .locals 1

    iget-object v0, p0, Li0/c1$c;->a:Lw/x1;

    return-object v0
.end method

.method public bridge synthetic c()Lw/x2;
    .locals 1

    invoke-virtual {p0}, Li0/c1$c;->h()Lj0/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic d(I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Li0/c1$c;->m(I)Li0/c1$c;

    move-result-object p1

    return-object p1
.end method

.method public e()Li0/c1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Li0/c1<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Li0/c1;

    invoke-virtual {p0}, Li0/c1$c;->h()Lj0/a;

    move-result-object v1

    invoke-direct {v0, v1}, Li0/c1;-><init>(Lj0/a;)V

    return-object v0
.end method

.method public h()Lj0/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lj0/a<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lj0/a;

    iget-object v1, p0, Li0/c1$c;->a:Lw/x1;

    invoke-static {v1}, Lw/c2;->H(Lw/r0;)Lw/c2;

    move-result-object v1

    invoke-direct {v0, v1}, Lj0/a;-><init>(Lw/c2;)V

    return-object v0
.end method

.method public i(I)Li0/c1$c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Li0/c1$c<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p0}, Li0/c1$c;->b()Lw/w1;

    move-result-object v0

    sget-object v1, Lw/x2;->p:Lw/r0$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lw/w1;->g(Lw/r0$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public j(Ljava/lang/Class;)Li0/c1$c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "Li0/c1<",
            "TT;>;>;)",
            "Li0/c1$c<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Li0/c1$c;->b()Lw/w1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lz/i;->t:Lw/r0$a;

    .line 6
    .line 7
    invoke-interface {v0, v1, p1}, Lw/w1;->g(Lw/r0$a;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Li0/c1$c;->b()Lw/w1;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sget-object v1, Lz/i;->s:Lw/r0$a;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-interface {v0, v1, v2}, Lw/r0;->a(Lw/r0$a;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    new-instance v0, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string p1, "-"

    .line 36
    .line 37
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p0, p1}, Li0/c1$c;->k(Ljava/lang/String;)Li0/c1$c;

    .line 52
    .line 53
    .line 54
    :cond_0
    return-object p0
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

.method public k(Ljava/lang/String;)Li0/c1$c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Li0/c1$c<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p0}, Li0/c1$c;->b()Lw/w1;

    move-result-object v0

    sget-object v1, Lz/i;->s:Lw/r0$a;

    invoke-interface {v0, v1, p1}, Lw/w1;->g(Lw/r0$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public l(Landroid/util/Size;)Li0/c1$c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Size;",
            ")",
            "Li0/c1$c<",
            "TT;>;"
        }
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "setTargetResolution is not supported."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public m(I)Li0/c1$c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Li0/c1$c<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p0}, Li0/c1$c;->b()Lw/w1;

    move-result-object v0

    sget-object v1, Lw/k1;->g:Lw/r0$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lw/w1;->g(Lw/r0$a;Ljava/lang/Object;)V

    return-object p0
.end method
