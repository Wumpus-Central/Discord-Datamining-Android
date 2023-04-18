.class public final Lwg/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lwg/c;

.field private static final b:Llh/f;

.field private static final c:Llh/f;

.field private static final d:Llh/f;

.field private static final e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Llh/c;",
            "Llh/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lwg/c;

    .line 2
    .line 3
    invoke-direct {v0}, Lwg/c;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lwg/c;->a:Lwg/c;

    .line 7
    .line 8
    const-string v0, "message"

    .line 9
    .line 10
    invoke-static {v0}, Llh/f;->h(Ljava/lang/String;)Llh/f;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "identifier(\"message\")"

    .line 15
    .line 16
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lwg/c;->b:Llh/f;

    .line 20
    .line 21
    const-string v0, "allowedTargets"

    .line 22
    .line 23
    invoke-static {v0}, Llh/f;->h(Ljava/lang/String;)Llh/f;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v1, "identifier(\"allowedTargets\")"

    .line 28
    .line 29
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    sput-object v0, Lwg/c;->c:Llh/f;

    .line 33
    .line 34
    const-string v0, "value"

    .line 35
    .line 36
    invoke-static {v0}, Llh/f;->h(Ljava/lang/String;)Llh/f;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const-string v1, "identifier(\"value\")"

    .line 41
    .line 42
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    sput-object v0, Lwg/c;->d:Llh/f;

    .line 46
    .line 47
    const/4 v0, 0x3

    .line 48
    new-array v0, v0, [Lkotlin/Pair;

    .line 49
    .line 50
    sget-object v1, Ljg/k$a;->H:Llh/c;

    .line 51
    .line 52
    sget-object v2, Lvg/b0;->d:Llh/c;

    .line 53
    .line 54
    invoke-static {v1, v2}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    const/4 v2, 0x0

    .line 59
    aput-object v1, v0, v2

    .line 60
    .line 61
    sget-object v1, Ljg/k$a;->L:Llh/c;

    .line 62
    .line 63
    sget-object v2, Lvg/b0;->f:Llh/c;

    .line 64
    .line 65
    invoke-static {v1, v2}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    const/4 v2, 0x1

    .line 70
    aput-object v1, v0, v2

    .line 71
    .line 72
    sget-object v1, Ljg/k$a;->P:Llh/c;

    .line 73
    .line 74
    sget-object v2, Lvg/b0;->i:Llh/c;

    .line 75
    .line 76
    invoke-static {v1, v2}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    const/4 v2, 0x2

    .line 81
    aput-object v1, v0, v2

    .line 82
    .line 83
    invoke-static {v0}, Lmf/s;->k([Lkotlin/Pair;)Ljava/util/Map;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    sput-object v0, Lwg/c;->e:Ljava/util/Map;

    .line 88
    .line 89
    return-void
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic f(Lwg/c;Lch/a;Lyg/g;ZILjava/lang/Object;)Lng/c;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lwg/c;->e(Lch/a;Lyg/g;Z)Lng/c;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Llh/c;Lch/d;Lyg/g;)Lng/c;
    .locals 7

    .line 1
    const-string v0, "kotlinName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "annotationOwner"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "c"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sget-object v0, Ljg/k$a;->y:Llh/c;

    .line 17
    .line 18
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    sget-object v0, Lvg/b0;->h:Llh/c;

    .line 25
    .line 26
    const-string v1, "DEPRECATED_ANNOTATION"

    .line 27
    .line 28
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-interface {p2, v0}, Lch/d;->a(Llh/c;)Lch/a;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-nez v0, :cond_0

    .line 36
    .line 37
    invoke-interface {p2}, Lch/d;->k()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    :cond_0
    new-instance p1, Lwg/e;

    .line 44
    .line 45
    invoke-direct {p1, v0, p3}, Lwg/e;-><init>(Lch/a;Lyg/g;)V

    .line 46
    .line 47
    .line 48
    return-object p1

    .line 49
    :cond_1
    sget-object v0, Lwg/c;->e:Ljava/util/Map;

    .line 50
    .line 51
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    check-cast p1, Llh/c;

    .line 56
    .line 57
    const/4 v0, 0x0

    .line 58
    if-eqz p1, :cond_2

    .line 59
    .line 60
    invoke-interface {p2, p1}, Lch/d;->a(Llh/c;)Lch/a;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    if-eqz v2, :cond_2

    .line 65
    .line 66
    sget-object v1, Lwg/c;->a:Lwg/c;

    .line 67
    .line 68
    const/4 v4, 0x0

    .line 69
    const/4 v5, 0x4

    .line 70
    const/4 v6, 0x0

    .line 71
    move-object v3, p3

    .line 72
    invoke-static/range {v1 .. v6}, Lwg/c;->f(Lwg/c;Lch/a;Lyg/g;ZILjava/lang/Object;)Lng/c;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    move-object v0, p1

    .line 77
    :cond_2
    return-object v0
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

.method public final b()Llh/f;
    .locals 1

    sget-object v0, Lwg/c;->b:Llh/f;

    return-object v0
.end method

.method public final c()Llh/f;
    .locals 1

    sget-object v0, Lwg/c;->d:Llh/f;

    return-object v0
.end method

.method public final d()Llh/f;
    .locals 1

    sget-object v0, Lwg/c;->c:Llh/f;

    return-object v0
.end method

.method public final e(Lch/a;Lyg/g;Z)Lng/c;
    .locals 2

    .line 1
    const-string v0, "annotation"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "c"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Lch/a;->f()Llh/b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sget-object v1, Lvg/b0;->d:Llh/c;

    .line 16
    .line 17
    invoke-static {v1}, Llh/b;->m(Llh/c;)Llh/b;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    new-instance p3, Lwg/i;

    .line 28
    .line 29
    invoke-direct {p3, p1, p2}, Lwg/i;-><init>(Lch/a;Lyg/g;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    sget-object v1, Lvg/b0;->f:Llh/c;

    .line 34
    .line 35
    invoke-static {v1}, Llh/b;->m(Llh/c;)Llh/b;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    new-instance p3, Lwg/h;

    .line 46
    .line 47
    invoke-direct {p3, p1, p2}, Lwg/h;-><init>(Lch/a;Lyg/g;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    sget-object v1, Lvg/b0;->i:Llh/c;

    .line 52
    .line 53
    invoke-static {v1}, Llh/b;->m(Llh/c;)Llh/b;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_2

    .line 62
    .line 63
    new-instance p3, Lwg/b;

    .line 64
    .line 65
    sget-object v0, Ljg/k$a;->P:Llh/c;

    .line 66
    .line 67
    invoke-direct {p3, p2, p1, v0}, Lwg/b;-><init>(Lyg/g;Lch/a;Llh/c;)V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    sget-object v1, Lvg/b0;->h:Llh/c;

    .line 72
    .line 73
    invoke-static {v1}, Llh/b;->m(Llh/c;)Llh/b;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_3

    .line 82
    .line 83
    const/4 p3, 0x0

    .line 84
    goto :goto_0

    .line 85
    :cond_3
    new-instance v0, Lzg/e;

    .line 86
    .line 87
    invoke-direct {v0, p2, p1, p3}, Lzg/e;-><init>(Lyg/g;Lch/a;Z)V

    .line 88
    .line 89
    .line 90
    move-object p3, v0

    .line 91
    :goto_0
    return-object p3
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
