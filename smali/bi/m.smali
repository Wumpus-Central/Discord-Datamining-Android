.class public final Lbi/m;
.super Lpg/b;
.source "SourceFile"


# instance fields
.field private final u:Lzh/m;

.field private final v:Lgh/s;

.field private final w:Lbi/a;


# direct methods
.method public constructor <init>(Lzh/m;Lgh/s;I)V
    .locals 11

    .line 1
    const-string v0, "c"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "proto"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lzh/m;->h()Lci/n;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {p1}, Lzh/m;->e()Lmg/m;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    sget-object v0, Lng/g;->f:Lng/g$a;

    .line 20
    .line 21
    invoke-virtual {v0}, Lng/g$a;->b()Lng/g;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-virtual {p1}, Lzh/m;->g()Lih/c;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p2}, Lgh/s;->O()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-static {v0, v1}, Lzh/x;->b(Lih/c;I)Llh/f;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    sget-object v0, Lzh/a0;->a:Lzh/a0;

    .line 38
    .line 39
    invoke-virtual {p2}, Lgh/s;->U()Lgh/s$c;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const-string v6, "proto.variance"

    .line 44
    .line 45
    invoke-static {v1, v6}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v1}, Lzh/a0;->d(Lgh/s$c;)Ldi/w1;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    invoke-virtual {p2}, Lgh/s;->P()Z

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    sget-object v9, Lmg/a1;->a:Lmg/a1;

    .line 57
    .line 58
    sget-object v10, Lmg/d1$a;->a:Lmg/d1$a;

    .line 59
    .line 60
    move-object v1, p0

    .line 61
    move v8, p3

    .line 62
    invoke-direct/range {v1 .. v10}, Lpg/b;-><init>(Lci/n;Lmg/m;Lng/g;Llh/f;Ldi/w1;ZILmg/a1;Lmg/d1;)V

    .line 63
    .line 64
    .line 65
    iput-object p1, p0, Lbi/m;->u:Lzh/m;

    .line 66
    .line 67
    iput-object p2, p0, Lbi/m;->v:Lgh/s;

    .line 68
    .line 69
    new-instance p2, Lbi/a;

    .line 70
    .line 71
    invoke-virtual {p1}, Lzh/m;->h()Lci/n;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    new-instance p3, Lbi/m$a;

    .line 76
    .line 77
    invoke-direct {p3, p0}, Lbi/m$a;-><init>(Lbi/m;)V

    .line 78
    .line 79
    .line 80
    invoke-direct {p2, p1, p3}, Lbi/a;-><init>(Lci/n;Lkotlin/jvm/functions/Function0;)V

    .line 81
    .line 82
    .line 83
    iput-object p2, p0, Lbi/m;->w:Lbi/a;

    .line 84
    .line 85
    return-void
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

.method public static final synthetic M0(Lbi/m;)Lzh/m;
    .locals 0

    iget-object p0, p0, Lbi/m;->u:Lzh/m;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic K0(Ldi/g0;)V
    .locals 0

    invoke-virtual {p0, p1}, Lbi/m;->P0(Ldi/g0;)Ljava/lang/Void;

    return-void
.end method

.method protected L0()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ldi/g0;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lbi/m;->v:Lgh/s;

    .line 2
    .line 3
    iget-object v1, p0, Lbi/m;->u:Lzh/m;

    .line 4
    .line 5
    invoke-virtual {v1}, Lzh/m;->j()Lih/g;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0, v1}, Lih/f;->s(Lgh/s;Lih/g;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-static {p0}, Lth/c;->j(Lmg/m;)Ljg/h;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Ljg/h;->y()Ldi/o0;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0}, Lkotlin/collections/h;->d(Ljava/lang/Object;)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    return-object v0

    .line 32
    :cond_0
    iget-object v1, p0, Lbi/m;->u:Lzh/m;

    .line 33
    .line 34
    invoke-virtual {v1}, Lzh/m;->i()Lzh/d0;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    new-instance v2, Ljava/util/ArrayList;

    .line 39
    .line 40
    const/16 v3, 0xa

    .line 41
    .line 42
    invoke-static {v0, v3}, Lkotlin/collections/h;->t(Ljava/lang/Iterable;I)I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 47
    .line 48
    .line 49
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_1

    .line 58
    .line 59
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    check-cast v3, Lgh/q;

    .line 64
    .line 65
    invoke-virtual {v1, v3}, Lzh/d0;->q(Lgh/q;)Ldi/g0;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_1
    return-object v2
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

.method public N0()Lbi/a;
    .locals 1

    iget-object v0, p0, Lbi/m;->w:Lbi/a;

    return-object v0
.end method

.method public final O0()Lgh/s;
    .locals 1

    iget-object v0, p0, Lbi/m;->v:Lgh/s;

    return-object v0
.end method

.method protected P0(Ldi/g0;)Ljava/lang/Void;
    .locals 2

    .line 1
    const-string v0, "type"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    const-string v1, "There should be no cycles for deserialized type parameters, but found for: "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1
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
.end method

.method public bridge synthetic getAnnotations()Lng/g;
    .locals 1

    invoke-virtual {p0}, Lbi/m;->N0()Lbi/a;

    move-result-object v0

    return-object v0
.end method
