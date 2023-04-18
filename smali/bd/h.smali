.class public Lbd/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbd/h$a;
    }
.end annotation


# direct methods
.method public static synthetic a(Ljava/lang/String;Lbd/h$a;Lic/e;)Lbd/f;
    .locals 0

    invoke-static {p0, p1, p2}, Lbd/h;->d(Ljava/lang/String;Lbd/h$a;Lic/e;)Lbd/f;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)Lic/d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lic/d<",
            "*>;"
        }
    .end annotation

    invoke-static {p0, p1}, Lbd/f;->a(Ljava/lang/String;Ljava/lang/String;)Lbd/f;

    move-result-object p0

    const-class p1, Lbd/f;

    invoke-static {p0, p1}, Lic/d;->i(Ljava/lang/Object;Ljava/lang/Class;)Lic/d;

    move-result-object p0

    return-object p0
.end method

.method public static c(Ljava/lang/String;Lbd/h$a;)Lic/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lbd/h$a<",
            "Landroid/content/Context;",
            ">;)",
            "Lic/d<",
            "*>;"
        }
    .end annotation

    .line 1
    const-class v0, Lbd/f;

    .line 2
    .line 3
    invoke-static {v0}, Lic/d;->j(Ljava/lang/Class;)Lic/d$b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-class v1, Landroid/content/Context;

    .line 8
    .line 9
    invoke-static {v1}, Lic/q;->i(Ljava/lang/Class;)Lic/q;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, Lic/d$b;->b(Lic/q;)Lic/d$b;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v1, Lbd/g;

    .line 18
    .line 19
    invoke-direct {v1, p0, p1}, Lbd/g;-><init>(Ljava/lang/String;Lbd/h$a;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lic/d$b;->e(Lic/h;)Lic/d$b;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Lic/d$b;->d()Lic/d;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
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

.method private static synthetic d(Ljava/lang/String;Lbd/h$a;Lic/e;)Lbd/f;
    .locals 1

    const-class v0, Landroid/content/Context;

    invoke-interface {p2, v0}, Lic/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/content/Context;

    invoke-interface {p1, p2}, Lbd/h$a;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lbd/f;->a(Ljava/lang/String;Ljava/lang/String;)Lbd/f;

    move-result-object p0

    return-object p0
.end method
