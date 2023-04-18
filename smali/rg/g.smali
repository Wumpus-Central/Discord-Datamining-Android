.class public final Lrg/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Leh/p;


# instance fields
.field private final a:Ljava/lang/ClassLoader;

.field private final b:Lai/d;


# direct methods
.method public constructor <init>(Ljava/lang/ClassLoader;)V
    .locals 1

    .line 1
    const-string v0, "classLoader"

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
    iput-object p1, p0, Lrg/g;->a:Ljava/lang/ClassLoader;

    .line 10
    .line 11
    new-instance p1, Lai/d;

    .line 12
    .line 13
    invoke-direct {p1}, Lai/d;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lrg/g;->b:Lai/d;

    .line 17
    .line 18
    return-void
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

.method private final d(Ljava/lang/String;)Leh/p$a;
    .locals 3

    iget-object v0, p0, Lrg/g;->a:Ljava/lang/ClassLoader;

    invoke-static {v0, p1}, Lrg/e;->a(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    sget-object v1, Lrg/f;->c:Lrg/f$a;

    invoke-virtual {v1, p1}, Lrg/f$a;->a(Ljava/lang/Class;)Lrg/f;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v1, Leh/p$a$b;

    const/4 v2, 0x2

    invoke-direct {v1, p1, v0, v2, v0}, Leh/p$a$b;-><init>(Leh/r;[BILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v0, v1

    :cond_0
    return-object v0
.end method


# virtual methods
.method public a(Lch/g;)Leh/p$a;
    .locals 1

    .line 1
    const-string v0, "javaClass"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Lch/g;->d()Llh/c;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    invoke-virtual {p1}, Llh/c;->b()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-direct {p0, p1}, Lrg/g;->d(Ljava/lang/String;)Leh/p$a;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 25
    return-object p1
    .line 26
    .line 27
.end method

.method public b(Llh/b;)Leh/p$a;
    .locals 1

    .line 1
    const-string v0, "classId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lrg/h;->a(Llh/b;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-direct {p0, p1}, Lrg/g;->d(Ljava/lang/String;)Leh/p$a;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
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

.method public c(Llh/c;)Ljava/io/InputStream;
    .locals 2

    .line 1
    const-string v0, "packageFqName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Ljg/k;->t:Llh/f;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Llh/c;->i(Llh/f;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    return-object p1

    .line 16
    :cond_0
    iget-object v0, p0, Lrg/g;->b:Lai/d;

    .line 17
    .line 18
    sget-object v1, Lai/a;->n:Lai/a;

    .line 19
    .line 20
    invoke-virtual {v1, p1}, Lai/a;->n(Llh/c;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {v0, p1}, Lai/d;->a(Ljava/lang/String;)Ljava/io/InputStream;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1
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
