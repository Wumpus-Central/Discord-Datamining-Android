.class public final Lvg/t$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvg/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lvg/t$a;-><init>()V

    return-void
.end method

.method private final b(Lmg/y;)Z
    .locals 5

    .line 1
    invoke-interface {p1}, Lmg/a;->i()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x1

    .line 11
    if-eq v0, v2, :cond_0

    .line 12
    .line 13
    return v1

    .line 14
    :cond_0
    invoke-interface {p1}, Lmg/y;->b()Lmg/m;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    instance-of v3, v0, Lmg/e;

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    if-eqz v3, :cond_1

    .line 22
    .line 23
    check-cast v0, Lmg/e;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    move-object v0, v4

    .line 27
    :goto_0
    if-nez v0, :cond_2

    .line 28
    .line 29
    return v1

    .line 30
    :cond_2
    invoke-interface {p1}, Lmg/a;->i()Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    const-string v3, "f.valueParameters"

    .line 35
    .line 36
    invoke-static {p1, v3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-static {p1}, Lkotlin/collections/h;->r0(Ljava/util/List;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    check-cast p1, Lmg/j1;

    .line 44
    .line 45
    invoke-interface {p1}, Lmg/i1;->getType()Ldi/g0;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {p1}, Ldi/g0;->N0()Ldi/g1;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-interface {p1}, Ldi/g1;->q()Lmg/h;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    instance-of v3, p1, Lmg/e;

    .line 58
    .line 59
    if-eqz v3, :cond_3

    .line 60
    .line 61
    move-object v4, p1

    .line 62
    check-cast v4, Lmg/e;

    .line 63
    .line 64
    :cond_3
    if-nez v4, :cond_4

    .line 65
    .line 66
    return v1

    .line 67
    :cond_4
    invoke-static {v0}, Ljg/h;->q0(Lmg/e;)Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-eqz p1, :cond_5

    .line 72
    .line 73
    invoke-static {v0}, Lth/c;->l(Lmg/m;)Llh/c;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-static {v4}, Lth/c;->l(Lmg/m;)Llh/c;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-eqz p1, :cond_5

    .line 86
    .line 87
    move v1, v2

    .line 88
    :cond_5
    return v1
    .line 89
    .line 90
.end method

.method private final c(Lmg/y;Lmg/j1;)Leh/m;
    .locals 2

    .line 1
    invoke-static {p1}, Leh/w;->e(Lmg/a;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "valueParameterDescriptor.type"

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    invoke-direct {p0, p1}, Lvg/t$a;->b(Lmg/y;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-interface {p2}, Lmg/i1;->getType()Ldi/g0;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-static {p1, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, Leh/w;->g(Ldi/g0;)Leh/m;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    :goto_0
    invoke-interface {p2}, Lmg/i1;->getType()Ldi/g0;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-static {p1, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-static {p1}, Lii/a;->u(Ldi/g0;)Ldi/g0;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-static {p1}, Leh/w;->g(Ldi/g0;)Leh/m;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    :goto_1
    return-object p1
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
.end method


# virtual methods
.method public final a(Lmg/a;Lmg/a;)Z
    .locals 6

    .line 1
    const-string v0, "superDescriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "subDescriptor"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    instance-of v0, p2, Lxg/e;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    instance-of v0, p1, Lmg/y;

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object v0, p2

    .line 22
    check-cast v0, Lxg/e;

    .line 23
    .line 24
    invoke-virtual {v0}, Lpg/p;->i()Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 29
    .line 30
    .line 31
    check-cast p1, Lmg/y;

    .line 32
    .line 33
    invoke-interface {p1}, Lmg/a;->i()Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Lpg/g0;->m1()Lmg/z0;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-interface {v0}, Lmg/a;->i()Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    const-string v2, "subDescriptor.original.valueParameters"

    .line 49
    .line 50
    invoke-static {v0, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-interface {p1}, Lmg/y;->a()Lmg/y;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-interface {v2}, Lmg/a;->i()Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    const-string v3, "superDescriptor.original.valueParameters"

    .line 62
    .line 63
    invoke-static {v2, v3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-static {v0, v2}, Lkotlin/collections/h;->K0(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-eqz v2, :cond_2

    .line 79
    .line 80
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    check-cast v2, Lkotlin/Pair;

    .line 85
    .line 86
    invoke-virtual {v2}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    check-cast v3, Lmg/j1;

    .line 91
    .line 92
    invoke-virtual {v2}, Lkotlin/Pair;->b()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    check-cast v2, Lmg/j1;

    .line 97
    .line 98
    move-object v4, p2

    .line 99
    check-cast v4, Lmg/y;

    .line 100
    .line 101
    const-string v5, "subParameter"

    .line 102
    .line 103
    invoke-static {v3, v5}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    invoke-direct {p0, v4, v3}, Lvg/t$a;->c(Lmg/y;Lmg/j1;)Leh/m;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    instance-of v3, v3, Leh/m$d;

    .line 111
    .line 112
    const-string v4, "superParameter"

    .line 113
    .line 114
    invoke-static {v2, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-direct {p0, p1, v2}, Lvg/t$a;->c(Lmg/y;Lmg/j1;)Leh/m;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    instance-of v2, v2, Leh/m$d;

    .line 122
    .line 123
    if-eq v3, v2, :cond_1

    .line 124
    .line 125
    const/4 p1, 0x1

    .line 126
    return p1

    .line 127
    :cond_2
    :goto_0
    return v1
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
