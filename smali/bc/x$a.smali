.class Lbc/x$a;
.super Lbc/x;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbc/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lbc/x;-><init>(Lbc/x$a;)V

    return-void
.end method


# virtual methods
.method public d(II)Lbc/x;
    .locals 0

    invoke-static {p1, p2}, Lec/d;->d(II)I

    move-result p1

    invoke-virtual {p0, p1}, Lbc/x$a;->k(I)Lbc/x;

    move-result-object p1

    return-object p1
.end method

.method public e(JJ)Lbc/x;
    .locals 0

    invoke-static {p1, p2, p3, p4}, Lec/f;->a(JJ)I

    move-result p1

    invoke-virtual {p0, p1}, Lbc/x$a;->k(I)Lbc/x;

    move-result-object p1

    return-object p1
.end method

.method public f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lbc/x;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;TT;",
            "Ljava/util/Comparator<",
            "TT;>;)",
            "Lbc/x;"
        }
    .end annotation

    invoke-interface {p3, p1, p2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    invoke-virtual {p0, p1}, Lbc/x$a;->k(I)Lbc/x;

    move-result-object p1

    return-object p1
.end method

.method public g(ZZ)Lbc/x;
    .locals 0

    invoke-static {p1, p2}, Lec/a;->a(ZZ)I

    move-result p1

    invoke-virtual {p0, p1}, Lbc/x$a;->k(I)Lbc/x;

    move-result-object p1

    return-object p1
.end method

.method public h(ZZ)Lbc/x;
    .locals 0

    invoke-static {p2, p1}, Lec/a;->a(ZZ)I

    move-result p1

    invoke-virtual {p0, p1}, Lbc/x$a;->k(I)Lbc/x;

    move-result-object p1

    return-object p1
.end method

.method public i()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method k(I)Lbc/x;
    .locals 0

    if-gez p1, :cond_0

    invoke-static {}, Lbc/x;->a()Lbc/x;

    move-result-object p1

    goto :goto_0

    :cond_0
    if-lez p1, :cond_1

    invoke-static {}, Lbc/x;->b()Lbc/x;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-static {}, Lbc/x;->c()Lbc/x;

    move-result-object p1

    :goto_0
    return-object p1
.end method
