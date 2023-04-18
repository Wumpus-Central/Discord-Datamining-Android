.class public final Lvg/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(Llh/c;Ljava/lang/String;)Llh/c;
    .locals 0

    invoke-static {p0, p1}, Lvg/h;->c(Llh/c;Ljava/lang/String;)Llh/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Llh/d;Ljava/lang/String;)Llh/c;
    .locals 0

    invoke-static {p0, p1}, Lvg/h;->d(Llh/d;Ljava/lang/String;)Llh/c;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Llh/c;Ljava/lang/String;)Llh/c;
    .locals 0

    invoke-static {p1}, Llh/f;->h(Ljava/lang/String;)Llh/f;

    move-result-object p1

    invoke-virtual {p0, p1}, Llh/c;->c(Llh/f;)Llh/c;

    move-result-object p0

    const-string p1, "child(Name.identifier(name))"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final d(Llh/d;Ljava/lang/String;)Llh/c;
    .locals 0

    invoke-static {p1}, Llh/f;->h(Ljava/lang/String;)Llh/f;

    move-result-object p1

    invoke-virtual {p0, p1}, Llh/d;->c(Llh/f;)Llh/d;

    move-result-object p0

    invoke-virtual {p0}, Llh/d;->l()Llh/c;

    move-result-object p0

    const-string p1, "child(Name.identifier(name)).toSafe()"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
