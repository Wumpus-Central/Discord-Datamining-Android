.class public abstract Lnh/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnh/s;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType::",
        "Lnh/q;",
        ">",
        "Ljava/lang/Object;",
        "Lnh/s<",
        "TMessageType;>;"
    }
.end annotation


# static fields
.field private static final a:Lnh/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lnh/g;->c()Lnh/g;

    move-result-object v0

    sput-object v0, Lnh/b;->a:Lnh/g;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private e(Lnh/q;)Lnh/q;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)TMessageType;"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-interface {p1}, Lnh/r;->j()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-direct {p0, p1}, Lnh/b;->f(Lnh/q;)Lnh/w;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Lnh/w;->a()Lnh/k;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0, p1}, Lnh/k;->i(Lnh/q;)Lnh/k;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    throw p1

    .line 23
    :cond_1
    :goto_0
    return-object p1
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method private f(Lnh/q;)Lnh/w;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)",
            "Lnh/w;"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lnh/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lnh/a;

    .line 6
    .line 7
    invoke-virtual {p1}, Lnh/a;->b()Lnh/w;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    :cond_0
    new-instance v0, Lnh/w;

    .line 13
    .line 14
    invoke-direct {v0, p1}, Lnh/w;-><init>(Lnh/q;)V

    .line 15
    .line 16
    .line 17
    return-object v0
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


# virtual methods
.method public bridge synthetic a(Ljava/io/InputStream;Lnh/g;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lnh/b;->h(Ljava/io/InputStream;Lnh/g;)Lnh/q;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Lnh/d;Lnh/g;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lnh/b;->i(Lnh/d;Lnh/g;)Lnh/q;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d(Ljava/io/InputStream;Lnh/g;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lnh/b;->g(Ljava/io/InputStream;Lnh/g;)Lnh/q;

    move-result-object p1

    return-object p1
.end method

.method public g(Ljava/io/InputStream;Lnh/g;)Lnh/q;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/InputStream;",
            "Lnh/g;",
            ")TMessageType;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lnh/b;->j(Ljava/io/InputStream;Lnh/g;)Lnh/q;

    move-result-object p1

    invoke-direct {p0, p1}, Lnh/b;->e(Lnh/q;)Lnh/q;

    move-result-object p1

    return-object p1
.end method

.method public h(Ljava/io/InputStream;Lnh/g;)Lnh/q;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/InputStream;",
            "Lnh/g;",
            ")TMessageType;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lnh/b;->k(Ljava/io/InputStream;Lnh/g;)Lnh/q;

    move-result-object p1

    invoke-direct {p0, p1}, Lnh/b;->e(Lnh/q;)Lnh/q;

    move-result-object p1

    return-object p1
.end method

.method public i(Lnh/d;Lnh/g;)Lnh/q;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnh/d;",
            "Lnh/g;",
            ")TMessageType;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lnh/b;->l(Lnh/d;Lnh/g;)Lnh/q;

    move-result-object p1

    invoke-direct {p0, p1}, Lnh/b;->e(Lnh/q;)Lnh/q;

    move-result-object p1

    return-object p1
.end method

.method public j(Ljava/io/InputStream;Lnh/g;)Lnh/q;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/InputStream;",
            "Lnh/g;",
            ")TMessageType;"
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    return-object p1

    .line 10
    :cond_0
    invoke-static {v0, p1}, Lnh/e;->B(ILjava/io/InputStream;)I

    .line 11
    .line 12
    .line 13
    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    new-instance v1, Lnh/a$a$a;

    .line 15
    .line 16
    invoke-direct {v1, p1, v0}, Lnh/a$a$a;-><init>(Ljava/io/InputStream;I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v1, p2}, Lnh/b;->k(Ljava/io/InputStream;Lnh/g;)Lnh/q;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    :catch_0
    move-exception p1

    .line 25
    new-instance p2, Lnh/k;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-direct {p2, p1}, Lnh/k;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p2
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

.method public k(Ljava/io/InputStream;Lnh/g;)Lnh/q;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/InputStream;",
            "Lnh/g;",
            ")TMessageType;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lnh/e;->g(Ljava/io/InputStream;)Lnh/e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p0, p1, p2}, Lnh/s;->c(Lnh/e;Lnh/g;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    check-cast p2, Lnh/q;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    :try_start_0
    invoke-virtual {p1, v0}, Lnh/e;->a(I)V
    :try_end_0
    .catch Lnh/k; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    return-object p2

    .line 16
    :catch_0
    move-exception p1

    .line 17
    invoke-virtual {p1, p2}, Lnh/k;->i(Lnh/q;)Lnh/k;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    throw p1
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

.method public l(Lnh/d;Lnh/g;)Lnh/q;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnh/d;",
            "Lnh/g;",
            ")TMessageType;"
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-virtual {p1}, Lnh/d;->v()Lnh/e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p0, p1, p2}, Lnh/s;->c(Lnh/e;Lnh/g;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    check-cast p2, Lnh/q;
    :try_end_0
    .catch Lnh/k; {:try_start_0 .. :try_end_0} :catch_1

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    :try_start_1
    invoke-virtual {p1, v0}, Lnh/e;->a(I)V
    :try_end_1
    .catch Lnh/k; {:try_start_1 .. :try_end_1} :catch_0

    .line 13
    .line 14
    .line 15
    return-object p2

    .line 16
    :catch_0
    move-exception p1

    .line 17
    :try_start_2
    invoke-virtual {p1, p2}, Lnh/k;->i(Lnh/q;)Lnh/k;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    throw p1
    :try_end_2
    .catch Lnh/k; {:try_start_2 .. :try_end_2} :catch_1

    .line 22
    :catch_1
    move-exception p1

    .line 23
    throw p1
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
