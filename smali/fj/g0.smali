.class public final Lfj/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfj/v;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lfj/q<",
        "TT;>;>",
        "Ljava/lang/Object;",
        "Lfj/v<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final k:I

.field private final l:Lfj/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfj/p<",
            "*>;"
        }
    .end annotation
.end field

.field private final m:Ljava/lang/Object;


# direct methods
.method private constructor <init>(ILfj/p;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lfj/p<",
            "*>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lfj/g0;-><init>(ILfj/p;Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(ILfj/p;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lfj/p<",
            "*>;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p2, :cond_0

    .line 3
    iput p1, p0, Lfj/g0;->k:I

    .line 4
    iput-object p2, p0, Lfj/g0;->l:Lfj/p;

    .line 5
    iput-object p3, p0, Lfj/g0;->m:Ljava/lang/Object;

    return-void

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Missing chronological element."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static a(Lfj/k0;Lfj/p;Z)Lfj/k0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<U:",
            "Ljava/lang/Object;",
            "T:",
            "Lfj/k0<",
            "TU;TT;>;>(",
            "Lfj/k0<",
            "TU;TT;>;",
            "Lfj/p<",
            "*>;Z)TT;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lfj/k0;->H()Lfj/h0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lfj/h0;->L(Lfj/p;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const-wide/16 v0, 0x1

    .line 10
    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, v0, v1, p1}, Lfj/k0;->K(JLjava/lang/Object;)Lfj/k0;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_0
    invoke-virtual {p0, v0, v1, p1}, Lfj/k0;->J(JLjava/lang/Object;)Lfj/k0;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
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
.end method

.method public static c(Lfj/p;)Lfj/v;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lfj/q<",
            "TT;>;>(",
            "Lfj/p<",
            "*>;)",
            "Lfj/v<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lfj/g0;

    const/4 v1, 0x4

    invoke-direct {v0, v1, p0}, Lfj/g0;-><init>(ILfj/p;)V

    return-object v0
.end method

.method public static d(Lfj/p;)Lfj/v;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lfj/q<",
            "TT;>;>(",
            "Lfj/p<",
            "*>;)",
            "Lfj/v<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lfj/g0;

    const/4 v1, 0x3

    invoke-direct {v0, v1, p0}, Lfj/g0;-><init>(ILfj/p;)V

    return-object v0
.end method

.method private e(Lfj/q;Lfj/p;)Lfj/q;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Lfj/q<",
            "TT;>;",
            "Lfj/p<",
            "TV;>;)TT;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lfj/q;->w()Lfj/q;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :goto_0
    invoke-virtual {p1}, Lfj/q;->v()Lfj/x;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p2}, Lfj/x;->w(Lfj/p;)Lfj/z;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-interface {p2, p1}, Lfj/z;->a(Ljava/lang/Object;)Lfj/p;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    if-eqz p2, :cond_0

    .line 18
    .line 19
    invoke-direct {p0, p1, p2}, Lfj/g0;->q(Lfj/q;Lfj/p;)Lfj/q;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    return-object p1
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
.end method

.method public static f(Lfj/p;)Lfj/v;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lfj/q<",
            "TT;>;>(",
            "Lfj/p<",
            "*>;)",
            "Lfj/v<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lfj/g0;

    const/4 v1, 0x6

    invoke-direct {v0, v1, p0}, Lfj/g0;-><init>(ILfj/p;)V

    return-object v0
.end method

.method private g(Lfj/q;Lfj/p;)Lfj/q;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Lfj/q<",
            "TT;>;",
            "Lfj/p<",
            "TV;>;)TT;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lfj/q;->w()Lfj/q;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :goto_0
    invoke-virtual {p1}, Lfj/q;->v()Lfj/x;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p2}, Lfj/x;->w(Lfj/p;)Lfj/z;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-interface {p2, p1}, Lfj/z;->c(Ljava/lang/Object;)Lfj/p;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    if-eqz p2, :cond_0

    .line 18
    .line 19
    invoke-direct {p0, p1, p2}, Lfj/g0;->r(Lfj/q;Lfj/p;)Lfj/q;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    return-object p1
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
.end method

.method public static h(Lfj/p;)Lfj/v;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lfj/q<",
            "TT;>;>(",
            "Lfj/p<",
            "*>;)",
            "Lfj/v<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lfj/g0;

    const/4 v1, 0x7

    invoke-direct {v0, v1, p0}, Lfj/g0;-><init>(ILfj/p;)V

    return-object v0
.end method

.method private i(Lfj/q;Lfj/p;)Lfj/q;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Lfj/q<",
            "TT;>;",
            "Lfj/p<",
            "TV;>;)TT;"
        }
    .end annotation

    invoke-virtual {p1, p2}, Lfj/q;->c(Lfj/p;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lfj/q;->E(Lfj/p;Ljava/lang/Object;)Lfj/q;

    move-result-object p1

    return-object p1
.end method

.method public static j(Lfj/p;)Lfj/v;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lfj/q<",
            "TT;>;>(",
            "Lfj/p<",
            "*>;)",
            "Lfj/v<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lfj/g0;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p0}, Lfj/g0;-><init>(ILfj/p;)V

    return-object v0
.end method

.method private k(Lfj/q;Lfj/p;)Lfj/q;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Lfj/q<",
            "TT;>;",
            "Lfj/p<",
            "TV;>;)TT;"
        }
    .end annotation

    invoke-virtual {p1, p2}, Lfj/q;->t(Lfj/p;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lfj/q;->E(Lfj/p;Ljava/lang/Object;)Lfj/q;

    move-result-object p1

    return-object p1
.end method

.method public static l(Lfj/p;)Lfj/v;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lfj/q<",
            "TT;>;>(",
            "Lfj/p<",
            "*>;)",
            "Lfj/v<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lfj/g0;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0}, Lfj/g0;-><init>(ILfj/p;)V

    return-object v0
.end method

.method private m(Lfj/q;Z)Lfj/q;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;Z)TT;"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lfj/k0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-class v0, Lfj/k0;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lfj/k0;

    .line 12
    .line 13
    iget-object v1, p0, Lfj/g0;->l:Lfj/p;

    .line 14
    .line 15
    invoke-static {v0, v1, p2}, Lfj/g0;->a(Lfj/k0;Lfj/p;Z)Lfj/k0;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-virtual {p1}, Lfj/q;->v()Lfj/x;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1}, Lfj/x;->q()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1, p2}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, Lfj/q;

    .line 32
    .line 33
    return-object p1

    .line 34
    :cond_0
    new-instance p2, Lfj/r;

    .line 35
    .line 36
    new-instance v0, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    .line 41
    const-string v1, "Base units not supported by: "

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Lfj/q;->v()Lfj/x;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p1}, Lfj/x;->q()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-direct {p2, p1}, Lfj/r;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p2
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

.method public static n(Ljava/lang/Object;Lfj/p;)Lfj/v;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lfj/q<",
            "TT;>;V:",
            "Ljava/lang/Object;",
            ">(TV;",
            "Lfj/p<",
            "TV;>;)",
            "Lfj/v<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lfj/g0;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p1, p0}, Lfj/g0;-><init>(ILfj/p;Ljava/lang/Object;)V

    return-object v0
.end method

.method public static o(Ljava/lang/Object;Lfj/p;)Lfj/v;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lfj/q<",
            "TT;>;V:",
            "Ljava/lang/Object;",
            ">(TV;",
            "Lfj/p<",
            "TV;>;)",
            "Lfj/v<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lfj/g0;

    const/4 v1, 0x5

    invoke-direct {v0, v1, p1, p0}, Lfj/g0;-><init>(ILfj/p;Ljava/lang/Object;)V

    return-object v0
.end method

.method private p(Lfj/q;Lfj/p;Ljava/lang/Object;Z)Lfj/q;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Lfj/q<",
            "TT;>;",
            "Lfj/p<",
            "TV;>;",
            "Ljava/lang/Object;",
            "Z)TT;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lfj/q;->w()Lfj/q;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lfj/q;->v()Lfj/x;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p2}, Lfj/x;->w(Lfj/p;)Lfj/z;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {p2}, Lfj/p;->getType()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-virtual {p2, p3}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-interface {v0, p1, p2, p4}, Lfj/z;->o(Ljava/lang/Object;Ljava/lang/Object;Z)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Lfj/q;

    .line 26
    .line 27
    return-object p1
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
.end method

.method private q(Lfj/q;Lfj/p;)Lfj/q;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Lfj/p<",
            "TV;>;)TT;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lfj/q;->v()Lfj/x;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p2}, Lfj/x;->w(Lfj/p;)Lfj/z;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0, p1}, Lfj/z;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {p2}, Lfj/p;->n()Z

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    invoke-interface {v0, p1, v1, p2}, Lfj/z;->o(Ljava/lang/Object;Ljava/lang/Object;Z)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Lfj/q;

    .line 22
    .line 23
    return-object p1
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
.end method

.method private r(Lfj/q;Lfj/p;)Lfj/q;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Lfj/p<",
            "TV;>;)TT;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lfj/q;->v()Lfj/x;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p2}, Lfj/x;->w(Lfj/p;)Lfj/z;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0, p1}, Lfj/z;->p(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {p2}, Lfj/p;->n()Z

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    invoke-interface {v0, p1, v1, p2}, Lfj/z;->o(Ljava/lang/Object;Ljava/lang/Object;Z)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Lfj/q;

    .line 22
    .line 23
    return-object p1
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
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfj/q;

    invoke-virtual {p0, p1}, Lfj/g0;->b(Lfj/q;)Lfj/q;

    move-result-object p1

    return-object p1
.end method

.method public b(Lfj/q;)Lfj/q;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)TT;"
        }
    .end annotation

    .line 1
    iget v0, p0, Lfj/g0;->k:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v1, "Unknown mode: "

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget v1, p0, Lfj/g0;->k:I

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p1

    .line 33
    :pswitch_0
    invoke-direct {p0, p1, v1}, Lfj/g0;->m(Lfj/q;Z)Lfj/q;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1

    .line 38
    :pswitch_1
    invoke-direct {p0, p1, v2}, Lfj/g0;->m(Lfj/q;Z)Lfj/q;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    return-object p1

    .line 43
    :pswitch_2
    iget-object v0, p0, Lfj/g0;->l:Lfj/p;

    .line 44
    .line 45
    iget-object v2, p0, Lfj/g0;->m:Ljava/lang/Object;

    .line 46
    .line 47
    invoke-direct {p0, p1, v0, v2, v1}, Lfj/g0;->p(Lfj/q;Lfj/p;Ljava/lang/Object;Z)Lfj/q;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    return-object p1

    .line 52
    :pswitch_3
    iget-object v0, p0, Lfj/g0;->l:Lfj/p;

    .line 53
    .line 54
    invoke-direct {p0, p1, v0}, Lfj/g0;->e(Lfj/q;Lfj/p;)Lfj/q;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    return-object p1

    .line 59
    :pswitch_4
    iget-object v0, p0, Lfj/g0;->l:Lfj/p;

    .line 60
    .line 61
    invoke-direct {p0, p1, v0}, Lfj/g0;->g(Lfj/q;Lfj/p;)Lfj/q;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    return-object p1

    .line 66
    :pswitch_5
    iget-object v0, p0, Lfj/g0;->l:Lfj/p;

    .line 67
    .line 68
    invoke-direct {p0, p1, v0}, Lfj/g0;->i(Lfj/q;Lfj/p;)Lfj/q;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    return-object p1

    .line 73
    :pswitch_6
    iget-object v0, p0, Lfj/g0;->l:Lfj/p;

    .line 74
    .line 75
    invoke-direct {p0, p1, v0}, Lfj/g0;->k(Lfj/q;Lfj/p;)Lfj/q;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    return-object p1

    .line 80
    :pswitch_7
    iget-object v0, p0, Lfj/g0;->l:Lfj/p;

    .line 81
    .line 82
    iget-object v1, p0, Lfj/g0;->m:Ljava/lang/Object;

    .line 83
    .line 84
    invoke-direct {p0, p1, v0, v1, v2}, Lfj/g0;->p(Lfj/q;Lfj/p;Ljava/lang/Object;Z)Lfj/q;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    return-object p1

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 90
.end method
