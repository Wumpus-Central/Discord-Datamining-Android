.class public final Lkg/e$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkg/e;
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

    invoke-direct {p0}, Lkg/e$a;-><init>()V

    return-void
.end method

.method private final b(Lkg/e;ILmg/f1;)Lmg/j1;
    .locals 14

    .line 1
    invoke-interface/range {p3 .. p3}, Lmg/j0;->getName()Llh/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Llh/f;->b()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "typeParameter.name.asString()"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v1, "T"

    .line 15
    .line 16
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    const-string v0, "instance"

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const-string v1, "E"

    .line 26
    .line 27
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    const-string v0, "receiver"

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const-string v1, "this as java.lang.String).toLowerCase(Locale.ROOT)"

    .line 43
    .line 44
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    :goto_0
    new-instance v13, Lpg/l0;

    .line 48
    .line 49
    const/4 v3, 0x0

    .line 50
    sget-object v1, Lng/g;->f:Lng/g$a;

    .line 51
    .line 52
    invoke-virtual {v1}, Lng/g$a;->b()Lng/g;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    invoke-static {v0}, Llh/f;->h(Ljava/lang/String;)Llh/f;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    const-string v0, "identifier(name)"

    .line 61
    .line 62
    invoke-static {v6, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-interface/range {p3 .. p3}, Lmg/h;->s()Ldi/o0;

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    const-string v0, "typeParameter.defaultType"

    .line 70
    .line 71
    invoke-static {v7, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    const/4 v8, 0x0

    .line 75
    const/4 v9, 0x0

    .line 76
    const/4 v10, 0x0

    .line 77
    const/4 v11, 0x0

    .line 78
    sget-object v12, Lmg/a1;->a:Lmg/a1;

    .line 79
    .line 80
    const-string v0, "NO_SOURCE"

    .line 81
    .line 82
    invoke-static {v12, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    move-object v1, v13

    .line 86
    move-object v2, p1

    .line 87
    move/from16 v4, p2

    .line 88
    .line 89
    invoke-direct/range {v1 .. v12}, Lpg/l0;-><init>(Lmg/a;Lmg/j1;ILng/g;Llh/f;Ldi/g0;ZZZLdi/g0;Lmg/a1;)V

    .line 90
    .line 91
    .line 92
    return-object v13
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


# virtual methods
.method public final a(Lkg/b;Z)Lkg/e;
    .locals 12

    .line 1
    const-string v0, "functionClass"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lkg/b;->u()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v10, Lkg/e;

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    sget-object v4, Lmg/b$a;->k:Lmg/b$a;

    .line 14
    .line 15
    const/4 v6, 0x0

    .line 16
    move-object v1, v10

    .line 17
    move-object v2, p1

    .line 18
    move v5, p2

    .line 19
    invoke-direct/range {v1 .. v6}, Lkg/e;-><init>(Lmg/m;Lkg/e;Lmg/b$a;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 20
    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-virtual {p1}, Lpg/a;->J0()Lmg/x0;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    new-instance p1, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    const/4 v11, 0x1

    .line 49
    if-eqz v1, :cond_2

    .line 50
    .line 51
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    move-object v6, v1

    .line 56
    check-cast v6, Lmg/f1;

    .line 57
    .line 58
    invoke-interface {v6}, Lmg/f1;->n()Ldi/w1;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    sget-object v7, Ldi/w1;->p:Ldi/w1;

    .line 63
    .line 64
    if-ne v6, v7, :cond_0

    .line 65
    .line 66
    move v6, v11

    .line 67
    goto :goto_1

    .line 68
    :cond_0
    const/4 v6, 0x0

    .line 69
    :goto_1
    if-nez v6, :cond_1

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_1
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    :goto_2
    invoke-static {p1}, Lkotlin/collections/h;->J0(Ljava/lang/Iterable;)Ljava/lang/Iterable;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    new-instance v6, Ljava/util/ArrayList;

    .line 81
    .line 82
    const/16 p2, 0xa

    .line 83
    .line 84
    invoke-static {p1, p2}, Lkotlin/collections/h;->t(Ljava/lang/Iterable;I)I

    .line 85
    .line 86
    .line 87
    move-result p2

    .line 88
    invoke-direct {v6, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 89
    .line 90
    .line 91
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 96
    .line 97
    .line 98
    move-result p2

    .line 99
    if-eqz p2, :cond_3

    .line 100
    .line 101
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    check-cast p2, Lmf/m;

    .line 106
    .line 107
    sget-object v1, Lkg/e;->O:Lkg/e$a;

    .line 108
    .line 109
    invoke-virtual {p2}, Lmf/m;->c()I

    .line 110
    .line 111
    .line 112
    move-result v7

    .line 113
    invoke-virtual {p2}, Lmf/m;->d()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    check-cast p2, Lmg/f1;

    .line 118
    .line 119
    invoke-direct {v1, v10, v7, p2}, Lkg/e$a;->b(Lkg/e;ILmg/f1;)Lmg/j1;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    invoke-interface {v6, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_3
    invoke-static {v0}, Lkotlin/collections/h;->g0(Ljava/util/List;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    check-cast p1, Lmg/f1;

    .line 132
    .line 133
    invoke-interface {p1}, Lmg/h;->s()Ldi/o0;

    .line 134
    .line 135
    .line 136
    move-result-object v7

    .line 137
    sget-object v8, Lmg/e0;->o:Lmg/e0;

    .line 138
    .line 139
    sget-object v9, Lmg/t;->e:Lmg/u;

    .line 140
    .line 141
    move-object v1, v10

    .line 142
    invoke-virtual/range {v1 .. v9}, Lpg/g0;->n1(Lmg/x0;Lmg/x0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ldi/g0;Lmg/e0;Lmg/u;)Lpg/g0;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v10, v11}, Lpg/p;->Z0(Z)V

    .line 146
    .line 147
    .line 148
    return-object v10
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
