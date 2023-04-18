.class public final Lbc/j0$a;
.super Lbc/v0$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbc/j0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lbc/v0$c<",
        "TK;TV;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lbc/v0$c;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic c(Ljava/lang/Object;Ljava/lang/Iterable;)Lbc/v0$c;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lbc/j0$a;->f(Ljava/lang/Object;Ljava/lang/Iterable;)Lbc/j0$a;

    move-result-object p1

    return-object p1
.end method

.method public e()Lbc/j0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lbc/j0<",
            "TK;TV;>;"
        }
    .end annotation

    invoke-super {p0}, Lbc/v0$c;->a()Lbc/v0;

    move-result-object v0

    check-cast v0, Lbc/j0;

    return-object v0
.end method

.method public f(Ljava/lang/Object;Ljava/lang/Iterable;)Lbc/j0$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Ljava/lang/Iterable<",
            "+TV;>;)",
            "Lbc/j0$a<",
            "TK;TV;>;"
        }
    .end annotation

    invoke-super {p0, p1, p2}, Lbc/v0$c;->c(Ljava/lang/Object;Ljava/lang/Iterable;)Lbc/v0$c;

    return-object p0
.end method

.method public varargs g(Ljava/lang/Object;[Ljava/lang/Object;)Lbc/j0$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;[TV;)",
            "Lbc/j0$a<",
            "TK;TV;>;"
        }
    .end annotation

    invoke-super {p0, p1, p2}, Lbc/v0$c;->d(Ljava/lang/Object;[Ljava/lang/Object;)Lbc/v0$c;

    return-object p0
.end method
