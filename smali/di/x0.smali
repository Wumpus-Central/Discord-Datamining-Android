.class public final Ldi/x0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldi/x0$a;
    }
.end annotation


# static fields
.field public static final c:Ldi/x0$a;

.field private static final d:Ldi/x0;


# instance fields
.field private final a:Ldi/z0;

.field private final b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ldi/x0$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ldi/x0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ldi/x0;->c:Ldi/x0$a;

    .line 8
    .line 9
    new-instance v0, Ldi/x0;

    .line 10
    .line 11
    sget-object v1, Ldi/z0$a;->a:Ldi/z0$a;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-direct {v0, v1, v2}, Ldi/x0;-><init>(Ldi/z0;Z)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Ldi/x0;->d:Ldi/x0;

    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public constructor <init>(Ldi/z0;Z)V
    .locals 1

    .line 1
    const-string v0, "reportStrategy"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Ldi/x0;->a:Ldi/z0;

    .line 10
    .line 11
    iput-boolean p2, p0, Ldi/x0;->b:Z

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

.method private final a(Lng/g;Lng/g;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lng/c;

    .line 21
    .line 22
    invoke-interface {v1}, Lng/c;->d()Llh/c;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    :cond_1
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    if-eqz p2, :cond_2

    .line 39
    .line 40
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    check-cast p2, Lng/c;

    .line 45
    .line 46
    invoke-interface {p2}, Lng/c;->d()Llh/c;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_1

    .line 55
    .line 56
    iget-object v1, p0, Ldi/x0;->a:Ldi/z0;

    .line 57
    .line 58
    invoke-interface {v1, p2}, Ldi/z0;->b(Lng/c;)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
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
.end method

.method private final b(Ldi/g0;Ldi/g0;)V
    .locals 8

    .line 1
    invoke-static {p2}, Ldi/p1;->f(Ldi/g0;)Ldi/p1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "create(substitutedType)"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2}, Ldi/g0;->L0()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    const/4 v1, 0x0

    .line 19
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_2

    .line 24
    .line 25
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    add-int/lit8 v3, v1, 0x1

    .line 30
    .line 31
    if-gez v1, :cond_0

    .line 32
    .line 33
    invoke-static {}, Lkotlin/collections/h;->s()V

    .line 34
    .line 35
    .line 36
    :cond_0
    check-cast v2, Ldi/k1;

    .line 37
    .line 38
    invoke-interface {v2}, Ldi/k1;->b()Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-nez v4, :cond_1

    .line 43
    .line 44
    invoke-interface {v2}, Ldi/k1;->getType()Ldi/g0;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    const-string v5, "substitutedArgument.type"

    .line 49
    .line 50
    invoke-static {v4, v5}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-static {v4}, Lii/a;->d(Ldi/g0;)Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-nez v4, :cond_1

    .line 58
    .line 59
    invoke-virtual {p1}, Ldi/g0;->L0()Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    check-cast v4, Ldi/k1;

    .line 68
    .line 69
    invoke-virtual {p1}, Ldi/g0;->N0()Ldi/g1;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    invoke-interface {v6}, Ldi/g1;->getParameters()Ljava/util/List;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    check-cast v1, Lmg/f1;

    .line 82
    .line 83
    iget-boolean v6, p0, Ldi/x0;->b:Z

    .line 84
    .line 85
    if-eqz v6, :cond_1

    .line 86
    .line 87
    iget-object v6, p0, Ldi/x0;->a:Ldi/z0;

    .line 88
    .line 89
    invoke-interface {v4}, Ldi/k1;->getType()Ldi/g0;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    const-string v7, "unsubstitutedArgument.type"

    .line 94
    .line 95
    invoke-static {v4, v7}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-interface {v2}, Ldi/k1;->getType()Ldi/g0;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-static {v2, v5}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    const-string v5, "typeParameter"

    .line 106
    .line 107
    invoke-static {v1, v5}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-interface {v6, v0, v4, v2, v1}, Ldi/z0;->d(Ldi/p1;Ldi/g0;Ldi/g0;Lmg/f1;)V

    .line 111
    .line 112
    .line 113
    :cond_1
    move v1, v3

    .line 114
    goto :goto_0

    .line 115
    :cond_2
    return-void
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

.method private final c(Ldi/v;Ldi/c1;)Ldi/v;
    .locals 0

    invoke-direct {p0, p1, p2}, Ldi/x0;->h(Ldi/g0;Ldi/c1;)Ldi/c1;

    move-result-object p2

    invoke-virtual {p1, p2}, Ldi/v;->a1(Ldi/c1;)Ldi/v;

    move-result-object p1

    return-object p1
.end method

.method private final d(Ldi/o0;Ldi/c1;)Ldi/o0;
    .locals 2

    invoke-static {p1}, Ldi/i0;->a(Ldi/g0;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1, p2}, Ldi/x0;->h(Ldi/g0;Ldi/c1;)Ldi/c1;

    move-result-object p2

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p1, v1, p2, v0, v1}, Ldi/o1;->f(Ldi/o0;Ljava/util/List;Ldi/c1;ILjava/lang/Object;)Ldi/o0;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method private final e(Ldi/o0;Ldi/g0;)Ldi/o0;
    .locals 0

    invoke-virtual {p2}, Ldi/g0;->O0()Z

    move-result p2

    invoke-static {p1, p2}, Ldi/s1;->r(Ldi/o0;Z)Ldi/o0;

    move-result-object p1

    const-string p2, "makeNullableIfNeeded(thi\u2026romType.isMarkedNullable)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final f(Ldi/o0;Ldi/g0;)Ldi/o0;
    .locals 0

    invoke-direct {p0, p1, p2}, Ldi/x0;->e(Ldi/o0;Ldi/g0;)Ldi/o0;

    move-result-object p1

    invoke-virtual {p2}, Ldi/g0;->M0()Ldi/c1;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Ldi/x0;->d(Ldi/o0;Ldi/c1;)Ldi/o0;

    move-result-object p1

    return-object p1
.end method

.method private final g(Ldi/y0;Ldi/c1;Z)Ldi/o0;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ldi/y0;->b()Lmg/e1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lmg/h;->k()Ldi/g1;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "descriptor.typeConstructor"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Ldi/y0;->a()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    sget-object v1, Lwh/h$b;->b:Lwh/h$b;

    .line 19
    .line 20
    invoke-static {p2, v0, p1, p3, v1}, Ldi/h0;->k(Ldi/c1;Ldi/g1;Ljava/util/List;ZLwh/h;)Ldi/o0;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
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

.method private final h(Ldi/g0;Ldi/c1;)Ldi/c1;
    .locals 1

    .line 1
    invoke-static {p1}, Ldi/i0;->a(Ldi/g0;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Ldi/g0;->M0()Ldi/c1;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    :cond_0
    invoke-virtual {p1}, Ldi/g0;->M0()Ldi/c1;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p2, p1}, Ldi/c1;->l(Ldi/c1;)Ldi/c1;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
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
.end method

.method private final j(Ldi/k1;Ldi/y0;I)Ldi/k1;
    .locals 12

    .line 1
    invoke-interface {p1}, Ldi/k1;->getType()Ldi/g0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ldi/g0;->Q0()Ldi/v1;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Ldi/w;->a(Ldi/g0;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    invoke-static {v0}, Ldi/o1;->a(Ldi/g0;)Ldi/o0;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v0}, Ldi/i0;->a(Ldi/g0;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_8

    .line 25
    .line 26
    invoke-static {v0}, Lii/a;->x(Ldi/g0;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_1

    .line 31
    .line 32
    goto/16 :goto_2

    .line 33
    .line 34
    :cond_1
    invoke-virtual {v0}, Ldi/g0;->N0()Ldi/g1;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-interface {v1}, Ldi/g1;->q()Lmg/h;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-interface {v1}, Ldi/g1;->getParameters()Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Ldi/g0;->L0()Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 54
    .line 55
    .line 56
    instance-of v3, v2, Lmg/f1;

    .line 57
    .line 58
    if-eqz v3, :cond_2

    .line 59
    .line 60
    goto/16 :goto_2

    .line 61
    .line 62
    :cond_2
    instance-of v3, v2, Lmg/e1;

    .line 63
    .line 64
    if-eqz v3, :cond_7

    .line 65
    .line 66
    check-cast v2, Lmg/e1;

    .line 67
    .line 68
    invoke-virtual {p2, v2}, Ldi/y0;->d(Lmg/e1;)Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    const/4 v4, 0x0

    .line 73
    if-eqz v3, :cond_3

    .line 74
    .line 75
    iget-object p1, p0, Ldi/x0;->a:Ldi/z0;

    .line 76
    .line 77
    invoke-interface {p1, v2}, Ldi/z0;->a(Lmg/e1;)V

    .line 78
    .line 79
    .line 80
    new-instance p1, Ldi/m1;

    .line 81
    .line 82
    sget-object p2, Ldi/w1;->o:Ldi/w1;

    .line 83
    .line 84
    sget-object p3, Lfi/j;->C:Lfi/j;

    .line 85
    .line 86
    const/4 v0, 0x1

    .line 87
    new-array v0, v0, [Ljava/lang/String;

    .line 88
    .line 89
    invoke-interface {v2}, Lmg/j0;->getName()Llh/f;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-virtual {v1}, Llh/f;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    const-string v2, "typeDescriptor.name.toString()"

    .line 98
    .line 99
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    aput-object v1, v0, v4

    .line 103
    .line 104
    invoke-static {p3, v0}, Lfi/k;->d(Lfi/j;[Ljava/lang/String;)Lfi/h;

    .line 105
    .line 106
    .line 107
    move-result-object p3

    .line 108
    invoke-direct {p1, p2, p3}, Ldi/m1;-><init>(Ldi/w1;Ldi/g0;)V

    .line 109
    .line 110
    .line 111
    return-object p1

    .line 112
    :cond_3
    invoke-virtual {v0}, Ldi/g0;->L0()Ljava/util/List;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    new-instance v5, Ljava/util/ArrayList;

    .line 117
    .line 118
    const/16 v6, 0xa

    .line 119
    .line 120
    invoke-static {v3, v6}, Lkotlin/collections/h;->t(Ljava/lang/Iterable;I)I

    .line 121
    .line 122
    .line 123
    move-result v6

    .line 124
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 125
    .line 126
    .line 127
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result v6

    .line 135
    if-eqz v6, :cond_5

    .line 136
    .line 137
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v6

    .line 141
    add-int/lit8 v7, v4, 0x1

    .line 142
    .line 143
    if-gez v4, :cond_4

    .line 144
    .line 145
    invoke-static {}, Lkotlin/collections/h;->s()V

    .line 146
    .line 147
    .line 148
    :cond_4
    check-cast v6, Ldi/k1;

    .line 149
    .line 150
    invoke-interface {v1}, Ldi/g1;->getParameters()Ljava/util/List;

    .line 151
    .line 152
    .line 153
    move-result-object v8

    .line 154
    invoke-interface {v8, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    check-cast v4, Lmg/f1;

    .line 159
    .line 160
    add-int/lit8 v8, p3, 0x1

    .line 161
    .line 162
    invoke-direct {p0, v6, p2, v4, v8}, Ldi/x0;->l(Ldi/k1;Ldi/y0;Lmg/f1;I)Ldi/k1;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    invoke-interface {v5, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move v4, v7

    .line 170
    goto :goto_0

    .line 171
    :cond_5
    sget-object v1, Ldi/y0;->e:Ldi/y0$a;

    .line 172
    .line 173
    invoke-virtual {v1, p2, v2, v5}, Ldi/y0$a;->a(Ldi/y0;Lmg/e1;Ljava/util/List;)Ldi/y0;

    .line 174
    .line 175
    .line 176
    move-result-object v7

    .line 177
    invoke-virtual {v0}, Ldi/g0;->M0()Ldi/c1;

    .line 178
    .line 179
    .line 180
    move-result-object v8

    .line 181
    invoke-virtual {v0}, Ldi/g0;->O0()Z

    .line 182
    .line 183
    .line 184
    move-result v9

    .line 185
    add-int/lit8 v10, p3, 0x1

    .line 186
    .line 187
    const/4 v11, 0x0

    .line 188
    move-object v6, p0

    .line 189
    invoke-direct/range {v6 .. v11}, Ldi/x0;->k(Ldi/y0;Ldi/c1;ZIZ)Ldi/o0;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    invoke-direct {p0, v0, p2, p3}, Ldi/x0;->m(Ldi/o0;Ldi/y0;I)Ldi/o0;

    .line 194
    .line 195
    .line 196
    move-result-object p2

    .line 197
    invoke-static {v1}, Ldi/w;->a(Ldi/g0;)Z

    .line 198
    .line 199
    .line 200
    move-result p3

    .line 201
    if-eqz p3, :cond_6

    .line 202
    .line 203
    goto :goto_1

    .line 204
    :cond_6
    invoke-static {v1, p2}, Ldi/s0;->j(Ldi/o0;Ldi/o0;)Ldi/o0;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    :goto_1
    new-instance p2, Ldi/m1;

    .line 209
    .line 210
    invoke-interface {p1}, Ldi/k1;->a()Ldi/w1;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    invoke-direct {p2, p1, v1}, Ldi/m1;-><init>(Ldi/w1;Ldi/g0;)V

    .line 215
    .line 216
    .line 217
    move-object p1, p2

    .line 218
    goto :goto_2

    .line 219
    :cond_7
    invoke-direct {p0, v0, p2, p3}, Ldi/x0;->m(Ldi/o0;Ldi/y0;I)Ldi/o0;

    .line 220
    .line 221
    .line 222
    move-result-object p2

    .line 223
    invoke-direct {p0, v0, p2}, Ldi/x0;->b(Ldi/g0;Ldi/g0;)V

    .line 224
    .line 225
    .line 226
    new-instance p3, Ldi/m1;

    .line 227
    .line 228
    invoke-interface {p1}, Ldi/k1;->a()Ldi/w1;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    invoke-direct {p3, p1, p2}, Ldi/m1;-><init>(Ldi/w1;Ldi/g0;)V

    .line 233
    .line 234
    .line 235
    move-object p1, p3

    .line 236
    :cond_8
    :goto_2
    return-object p1
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
.end method

.method private final k(Ldi/y0;Ldi/c1;ZIZ)Ldi/o0;
    .locals 3

    .line 1
    new-instance v0, Ldi/m1;

    .line 2
    .line 3
    sget-object v1, Ldi/w1;->o:Ldi/w1;

    .line 4
    .line 5
    invoke-virtual {p1}, Ldi/y0;->b()Lmg/e1;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-interface {v2}, Lmg/e1;->g0()Ldi/o0;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-direct {v0, v1, v2}, Ldi/m1;-><init>(Ldi/w1;Ldi/g0;)V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-direct {p0, v0, p1, v1, p4}, Ldi/x0;->l(Ldi/k1;Ldi/y0;Lmg/f1;I)Ldi/k1;

    .line 18
    .line 19
    .line 20
    move-result-object p4

    .line 21
    invoke-interface {p4}, Ldi/k1;->getType()Ldi/g0;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-string v1, "expandedProjection.type"

    .line 26
    .line 27
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v0}, Ldi/o1;->a(Ldi/g0;)Ldi/o0;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {v0}, Ldi/i0;->a(Ldi/g0;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_0

    .line 39
    .line 40
    return-object v0

    .line 41
    :cond_0
    invoke-interface {p4}, Ldi/k1;->a()Ldi/w1;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ldi/g0;->getAnnotations()Lng/g;

    .line 45
    .line 46
    .line 47
    move-result-object p4

    .line 48
    invoke-static {p2}, Ldi/k;->a(Ldi/c1;)Lng/g;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-direct {p0, p4, v1}, Ldi/x0;->a(Lng/g;Lng/g;)V

    .line 53
    .line 54
    .line 55
    invoke-direct {p0, v0, p2}, Ldi/x0;->d(Ldi/o0;Ldi/c1;)Ldi/o0;

    .line 56
    .line 57
    .line 58
    move-result-object p4

    .line 59
    invoke-static {p4, p3}, Ldi/s1;->r(Ldi/o0;Z)Ldi/o0;

    .line 60
    .line 61
    .line 62
    move-result-object p4

    .line 63
    const-string v0, "expandedType.combineAttr\u2026fNeeded(it, isNullable) }"

    .line 64
    .line 65
    invoke-static {p4, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    if-eqz p5, :cond_1

    .line 69
    .line 70
    invoke-direct {p0, p1, p2, p3}, Ldi/x0;->g(Ldi/y0;Ldi/c1;Z)Ldi/o0;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-static {p4, p1}, Ldi/s0;->j(Ldi/o0;Ldi/o0;)Ldi/o0;

    .line 75
    .line 76
    .line 77
    move-result-object p4

    .line 78
    :cond_1
    return-object p4
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
.end method

.method private final l(Ldi/k1;Ldi/y0;Lmg/f1;I)Ldi/k1;
    .locals 3

    .line 1
    sget-object v0, Ldi/x0;->c:Ldi/x0$a;

    .line 2
    .line 3
    invoke-virtual {p2}, Ldi/y0;->b()Lmg/e1;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v0, p4, v1}, Ldi/x0$a;->a(Ldi/x0$a;ILmg/e1;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {p1}, Ldi/k1;->b()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const-string v1, "makeStarProjection(typeParameterDescriptor!!)"

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-static {p3}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-static {p3}, Ldi/s1;->s(Lmg/f1;)Ldi/k1;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-static {p1, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :cond_0
    invoke-interface {p1}, Ldi/k1;->getType()Ldi/g0;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const-string v2, "underlyingProjection.type"

    .line 34
    .line 35
    invoke-static {v0, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ldi/g0;->N0()Ldi/g1;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {p2, v2}, Ldi/y0;->c(Ldi/g1;)Ldi/k1;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    if-nez v2, :cond_1

    .line 47
    .line 48
    invoke-direct {p0, p1, p2, p4}, Ldi/x0;->j(Ldi/k1;Ldi/y0;I)Ldi/k1;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    return-object p1

    .line 53
    :cond_1
    invoke-interface {v2}, Ldi/k1;->b()Z

    .line 54
    .line 55
    .line 56
    move-result p4

    .line 57
    if-eqz p4, :cond_2

    .line 58
    .line 59
    invoke-static {p3}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    invoke-static {p3}, Ldi/s1;->s(Lmg/f1;)Ldi/k1;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-static {p1, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    return-object p1

    .line 70
    :cond_2
    invoke-interface {v2}, Ldi/k1;->getType()Ldi/g0;

    .line 71
    .line 72
    .line 73
    move-result-object p4

    .line 74
    invoke-virtual {p4}, Ldi/g0;->Q0()Ldi/v1;

    .line 75
    .line 76
    .line 77
    move-result-object p4

    .line 78
    invoke-interface {v2}, Ldi/k1;->a()Ldi/w1;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    const-string v2, "argument.projectionKind"

    .line 83
    .line 84
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-interface {p1}, Ldi/k1;->a()Ldi/w1;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    const-string v2, "underlyingProjection.projectionKind"

    .line 92
    .line 93
    invoke-static {p1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    if-ne p1, v1, :cond_3

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_3
    sget-object v2, Ldi/w1;->o:Ldi/w1;

    .line 100
    .line 101
    if-ne p1, v2, :cond_4

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_4
    if-ne v1, v2, :cond_5

    .line 105
    .line 106
    move-object v1, p1

    .line 107
    goto :goto_0

    .line 108
    :cond_5
    iget-object p1, p0, Ldi/x0;->a:Ldi/z0;

    .line 109
    .line 110
    invoke-virtual {p2}, Ldi/y0;->b()Lmg/e1;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    invoke-interface {p1, v2, p3, p4}, Ldi/z0;->c(Lmg/e1;Lmg/f1;Ldi/g0;)V

    .line 115
    .line 116
    .line 117
    :goto_0
    if-eqz p3, :cond_6

    .line 118
    .line 119
    invoke-interface {p3}, Lmg/f1;->n()Ldi/w1;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    if-nez p1, :cond_7

    .line 124
    .line 125
    :cond_6
    sget-object p1, Ldi/w1;->o:Ldi/w1;

    .line 126
    .line 127
    :cond_7
    const-string v2, "typeParameterDescriptor?\u2026nce ?: Variance.INVARIANT"

    .line 128
    .line 129
    invoke-static {p1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    if-ne p1, v1, :cond_8

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_8
    sget-object v2, Ldi/w1;->o:Ldi/w1;

    .line 136
    .line 137
    if-ne p1, v2, :cond_9

    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_9
    if-ne v1, v2, :cond_a

    .line 141
    .line 142
    move-object v1, v2

    .line 143
    goto :goto_1

    .line 144
    :cond_a
    iget-object p1, p0, Ldi/x0;->a:Ldi/z0;

    .line 145
    .line 146
    invoke-virtual {p2}, Ldi/y0;->b()Lmg/e1;

    .line 147
    .line 148
    .line 149
    move-result-object p2

    .line 150
    invoke-interface {p1, p2, p3, p4}, Ldi/z0;->c(Lmg/e1;Lmg/f1;Ldi/g0;)V

    .line 151
    .line 152
    .line 153
    :goto_1
    invoke-virtual {v0}, Ldi/g0;->getAnnotations()Lng/g;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    invoke-virtual {p4}, Ldi/g0;->getAnnotations()Lng/g;

    .line 158
    .line 159
    .line 160
    move-result-object p2

    .line 161
    invoke-direct {p0, p1, p2}, Ldi/x0;->a(Lng/g;Lng/g;)V

    .line 162
    .line 163
    .line 164
    instance-of p1, p4, Ldi/v;

    .line 165
    .line 166
    if-eqz p1, :cond_b

    .line 167
    .line 168
    check-cast p4, Ldi/v;

    .line 169
    .line 170
    invoke-virtual {v0}, Ldi/g0;->M0()Ldi/c1;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    invoke-direct {p0, p4, p1}, Ldi/x0;->c(Ldi/v;Ldi/c1;)Ldi/v;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    goto :goto_2

    .line 179
    :cond_b
    invoke-static {p4}, Ldi/o1;->a(Ldi/g0;)Ldi/o0;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    invoke-direct {p0, p1, v0}, Ldi/x0;->f(Ldi/o0;Ldi/g0;)Ldi/o0;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    :goto_2
    new-instance p2, Ldi/m1;

    .line 188
    .line 189
    invoke-direct {p2, v1, p1}, Ldi/m1;-><init>(Ldi/w1;Ldi/g0;)V

    .line 190
    .line 191
    .line 192
    return-object p2
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

.method private final m(Ldi/o0;Ldi/y0;I)Ldi/o0;
    .locals 8

    .line 1
    invoke-virtual {p1}, Ldi/g0;->N0()Ldi/g1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Ldi/g0;->L0()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Ljava/util/ArrayList;

    .line 10
    .line 11
    const/16 v3, 0xa

    .line 12
    .line 13
    invoke-static {v1, v3}, Lkotlin/collections/h;->t(Ljava/lang/Iterable;I)I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const/4 v3, 0x0

    .line 25
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-eqz v4, :cond_2

    .line 30
    .line 31
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    add-int/lit8 v5, v3, 0x1

    .line 36
    .line 37
    if-gez v3, :cond_0

    .line 38
    .line 39
    invoke-static {}, Lkotlin/collections/h;->s()V

    .line 40
    .line 41
    .line 42
    :cond_0
    check-cast v4, Ldi/k1;

    .line 43
    .line 44
    invoke-interface {v0}, Ldi/g1;->getParameters()Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    invoke-interface {v6, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    check-cast v3, Lmg/f1;

    .line 53
    .line 54
    add-int/lit8 v6, p3, 0x1

    .line 55
    .line 56
    invoke-direct {p0, v4, p2, v3, v6}, Ldi/x0;->l(Ldi/k1;Ldi/y0;Lmg/f1;I)Ldi/k1;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-interface {v3}, Ldi/k1;->b()Z

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    if-eqz v6, :cond_1

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_1
    new-instance v6, Ldi/m1;

    .line 68
    .line 69
    invoke-interface {v3}, Ldi/k1;->a()Ldi/w1;

    .line 70
    .line 71
    .line 72
    move-result-object v7

    .line 73
    invoke-interface {v3}, Ldi/k1;->getType()Ldi/g0;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-interface {v4}, Ldi/k1;->getType()Ldi/g0;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    invoke-virtual {v4}, Ldi/g0;->O0()Z

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    invoke-static {v3, v4}, Ldi/s1;->q(Ldi/g0;Z)Ldi/g0;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    invoke-direct {v6, v7, v3}, Ldi/m1;-><init>(Ldi/w1;Ldi/g0;)V

    .line 90
    .line 91
    .line 92
    move-object v3, v6

    .line 93
    :goto_1
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move v3, v5

    .line 97
    goto :goto_0

    .line 98
    :cond_2
    const/4 p2, 0x2

    .line 99
    const/4 p3, 0x0

    .line 100
    invoke-static {p1, v2, p3, p2, p3}, Ldi/o1;->f(Ldi/o0;Ljava/util/List;Ldi/c1;ILjava/lang/Object;)Ldi/o0;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    return-object p1
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


# virtual methods
.method public final i(Ldi/y0;Ldi/c1;)Ldi/o0;
    .locals 7

    .line 1
    const-string v0, "typeAliasExpansion"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "attributes"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v6, 0x1

    .line 14
    move-object v1, p0

    .line 15
    move-object v2, p1

    .line 16
    move-object v3, p2

    .line 17
    invoke-direct/range {v1 .. v6}, Ldi/x0;->k(Ldi/y0;Ldi/c1;ZIZ)Ldi/o0;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1
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
.end method
