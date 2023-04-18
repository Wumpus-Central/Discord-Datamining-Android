.class public final Ldh/r;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldh/r$a;
    }
.end annotation


# static fields
.field private static final a:Lng/g;

.field private static final b:Ldh/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ldh/c;

    .line 2
    .line 3
    sget-object v1, Lvg/b0;->u:Llh/c;

    .line 4
    .line 5
    const-string v2, "ENHANCED_NULLABILITY_ANNOTATION"

    .line 6
    .line 7
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, Ldh/c;-><init>(Llh/c;)V

    .line 11
    .line 12
    .line 13
    sput-object v0, Ldh/r;->a:Lng/g;

    .line 14
    .line 15
    new-instance v0, Ldh/c;

    .line 16
    .line 17
    sget-object v1, Lvg/b0;->v:Llh/c;

    .line 18
    .line 19
    const-string v2, "ENHANCED_MUTABILITY_ANNOTATION"

    .line 20
    .line 21
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, v1}, Ldh/c;-><init>(Llh/c;)V

    .line 25
    .line 26
    .line 27
    sput-object v0, Ldh/r;->b:Ldh/c;

    .line 28
    .line 29
    return-void
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
.end method

.method public static final synthetic a(Ljava/util/List;)Lng/g;
    .locals 0

    invoke-static {p0}, Ldh/r;->e(Ljava/util/List;)Lng/g;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lmg/h;Ldh/e;Ldh/o;)Lmg/h;
    .locals 0

    invoke-static {p0, p1, p2}, Ldh/r;->f(Lmg/h;Ldh/e;Ldh/o;)Lmg/h;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c()Ldh/c;
    .locals 1

    sget-object v0, Ldh/r;->b:Ldh/c;

    return-object v0
.end method

.method public static final synthetic d(Ldh/e;Ldh/o;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0, p1}, Ldh/r;->h(Ldh/e;Ldh/o;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Ljava/util/List;)Lng/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lng/g;",
            ">;)",
            "Lng/g;"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    .line 10
    new-instance v0, Lng/k;

    .line 11
    .line 12
    invoke-static {p0}, Lkotlin/collections/h;->D0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-direct {v0, p0}, Lng/k;-><init>(Ljava/util/List;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-static {p0}, Lkotlin/collections/h;->r0(Ljava/util/List;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    move-object v0, p0

    .line 25
    check-cast v0, Lng/g;

    .line 26
    .line 27
    :goto_0
    return-object v0

    .line 28
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 29
    .line 30
    const-string v0, "At least one Annotations object expected"

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw p0
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

.method private static final f(Lmg/h;Ldh/e;Ldh/o;)Lmg/h;
    .locals 4

    .line 1
    sget-object v0, Llg/d;->a:Llg/d;

    .line 2
    .line 3
    invoke-static {p2}, Ldh/p;->a(Ldh/o;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    instance-of v1, p0, Lmg/e;

    .line 12
    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    invoke-virtual {p1}, Ldh/e;->c()Ldh/f;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    sget-object v3, Ldh/f;->k:Ldh/f;

    .line 21
    .line 22
    if-ne v1, v3, :cond_2

    .line 23
    .line 24
    sget-object v1, Ldh/o;->k:Ldh/o;

    .line 25
    .line 26
    if-ne p2, v1, :cond_2

    .line 27
    .line 28
    move-object v1, p0

    .line 29
    check-cast v1, Lmg/e;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Llg/d;->c(Lmg/e;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_2

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Llg/d;->a(Lmg/e;)Lmg/e;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    goto :goto_0

    .line 42
    :cond_2
    invoke-virtual {p1}, Ldh/e;->c()Ldh/f;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    sget-object v1, Ldh/f;->l:Ldh/f;

    .line 47
    .line 48
    if-ne p1, v1, :cond_3

    .line 49
    .line 50
    sget-object p1, Ldh/o;->l:Ldh/o;

    .line 51
    .line 52
    if-ne p2, p1, :cond_3

    .line 53
    .line 54
    check-cast p0, Lmg/e;

    .line 55
    .line 56
    invoke-virtual {v0, p0}, Llg/d;->d(Lmg/e;)Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-eqz p1, :cond_3

    .line 61
    .line 62
    invoke-virtual {v0, p0}, Llg/d;->b(Lmg/e;)Lmg/e;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    :cond_3
    :goto_0
    return-object v2
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

.method public static final g()Lng/g;
    .locals 1

    sget-object v0, Ldh/r;->a:Lng/g;

    return-object v0
.end method

.method private static final h(Ldh/e;Ldh/o;)Ljava/lang/Boolean;
    .locals 1

    .line 1
    invoke-static {p1}, Ldh/p;->a(Ldh/o;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x0

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_0
    invoke-virtual {p0}, Ldh/e;->d()Ldh/h;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-nez p0, :cond_1

    .line 14
    .line 15
    const/4 p0, -0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_1
    sget-object p1, Ldh/r$a;->a:[I

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    aget p0, p1, p0

    .line 24
    .line 25
    :goto_0
    const/4 p1, 0x1

    .line 26
    if-eq p0, p1, :cond_3

    .line 27
    .line 28
    const/4 p1, 0x2

    .line 29
    if-eq p0, p1, :cond_2

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_2
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_3
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 36
    .line 37
    :goto_1
    return-object v0
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

.method public static final i(Ldi/g0;)Z
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lei/q;->a:Lei/q;

    .line 7
    .line 8
    invoke-static {v0, p0}, Ldh/s;->c(Ldi/q1;Lhi/i;)Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
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
.end method
