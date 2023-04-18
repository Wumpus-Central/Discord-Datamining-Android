.class Lnet/time4j/calendar/b$f;
.super Lnet/time4j/calendar/service/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/time4j/calendar/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lfj/q<",
        "TT;>;>",
        "Lnet/time4j/calendar/service/e<",
        "Lnet/time4j/x0;",
        "TT;>;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x4de72395bd4206fcL


# instance fields
.field private final model:Lnet/time4j/z0;


# direct methods
.method constructor <init>(Ljava/lang/Class;Lnet/time4j/z0;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lnet/time4j/z0;",
            ")V"
        }
    .end annotation

    .line 1
    const-class v0, Lnet/time4j/x0;

    .line 2
    .line 3
    const/16 v1, 0x65

    .line 4
    .line 5
    const-string v2, "LOCAL_DAY_OF_WEEK"

    .line 6
    .line 7
    invoke-direct {p0, v2, p1, v0, v1}, Lnet/time4j/calendar/service/e;-><init>(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;C)V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, Lnet/time4j/calendar/b$f;->model:Lnet/time4j/z0;

    .line 11
    .line 12
    return-void
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

.method static synthetic Q(Lnet/time4j/calendar/b$f;)Lnet/time4j/z0;
    .locals 0

    iget-object p0, p0, Lnet/time4j/calendar/b$f;->model:Lnet/time4j/z0;

    return-object p0
.end method

.method static X(Ljava/lang/Class;Lnet/time4j/z0;)Lnet/time4j/calendar/b$f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lfj/q<",
            "TT;>;>(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lnet/time4j/z0;",
            ")",
            "Lnet/time4j/calendar/b$f<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lnet/time4j/calendar/b$f;

    invoke-direct {v0, p0, p1}, Lnet/time4j/calendar/b$f;-><init>(Ljava/lang/Class;Lnet/time4j/z0;)V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic C()Ljava/lang/Enum;
    .locals 1

    invoke-virtual {p0}, Lnet/time4j/calendar/b$f;->U()Lnet/time4j/x0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic D()Ljava/lang/Enum;
    .locals 1

    invoke-virtual {p0}, Lnet/time4j/calendar/b$f;->V()Lnet/time4j/x0;

    move-result-object v0

    return-object v0
.end method

.method protected L()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic N(Ljava/lang/Enum;)I
    .locals 0

    check-cast p1, Lnet/time4j/x0;

    invoke-virtual {p0, p1}, Lnet/time4j/calendar/b$f;->W(Lnet/time4j/x0;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic S()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lnet/time4j/calendar/b$f;->V()Lnet/time4j/x0;

    move-result-object v0

    return-object v0
.end method

.method public U()Lnet/time4j/x0;
    .locals 2

    iget-object v0, p0, Lnet/time4j/calendar/b$f;->model:Lnet/time4j/z0;

    invoke-virtual {v0}, Lnet/time4j/z0;->f()Lnet/time4j/x0;

    move-result-object v0

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lnet/time4j/x0;->e(I)Lnet/time4j/x0;

    move-result-object v0

    return-object v0
.end method

.method public V()Lnet/time4j/x0;
    .locals 1

    iget-object v0, p0, Lnet/time4j/calendar/b$f;->model:Lnet/time4j/z0;

    invoke-virtual {v0}, Lnet/time4j/z0;->f()Lnet/time4j/x0;

    move-result-object v0

    return-object v0
.end method

.method public W(Lnet/time4j/x0;)I
    .locals 1

    iget-object v0, p0, Lnet/time4j/calendar/b$f;->model:Lnet/time4j/z0;

    invoke-virtual {p1, v0}, Lnet/time4j/x0;->c(Lnet/time4j/z0;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lfj/o;

    check-cast p2, Lfj/o;

    invoke-virtual {p0, p1, p2}, Lnet/time4j/calendar/b$f;->d(Lfj/o;Lfj/o;)I

    move-result p1

    return p1
.end method

.method public d(Lfj/o;Lfj/o;)I
    .locals 1

    .line 1
    invoke-interface {p1, p0}, Lfj/o;->k(Lfj/p;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lnet/time4j/x0;

    .line 6
    .line 7
    iget-object v0, p0, Lnet/time4j/calendar/b$f;->model:Lnet/time4j/z0;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Lnet/time4j/x0;->c(Lnet/time4j/z0;)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-interface {p2, p0}, Lfj/o;->k(Lfj/p;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    check-cast p2, Lnet/time4j/x0;

    .line 18
    .line 19
    iget-object v0, p0, Lnet/time4j/calendar/b$f;->model:Lnet/time4j/z0;

    .line 20
    .line 21
    invoke-virtual {p2, v0}, Lnet/time4j/x0;->c(Lnet/time4j/z0;)I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    if-ge p1, p2, :cond_0

    .line 26
    .line 27
    const/4 p1, -0x1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    if-ne p1, p2, :cond_1

    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 p1, 0x1

    .line 34
    :goto_0
    return p1
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

.method public bridge synthetic f()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lnet/time4j/calendar/b$f;->U()Lnet/time4j/x0;

    move-result-object v0

    return-object v0
.end method

.method protected g(Lfj/x;)Lfj/z;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D:",
            "Lfj/q<",
            "TD;>;>(",
            "Lfj/x<",
            "TD;>;)",
            "Lfj/z<",
            "TD;",
            "Lnet/time4j/x0;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lnet/time4j/calendar/service/d;->x()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Lfj/x;->q()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    const/4 v0, 0x0

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    new-instance p1, Lnet/time4j/calendar/b$e;

    .line 17
    .line 18
    invoke-direct {p1, p0, v0}, Lnet/time4j/calendar/b$e;-><init>(Lnet/time4j/calendar/b$f;Lnet/time4j/calendar/b$a;)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    return-object v0
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method protected r(Lfj/e;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/e<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    invoke-super {p0, p1}, Lnet/time4j/calendar/service/d;->r(Lfj/e;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-class v0, Lnet/time4j/calendar/b$f;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Lnet/time4j/calendar/b$f;

    .line 14
    .line 15
    iget-object v0, p0, Lnet/time4j/calendar/b$f;->model:Lnet/time4j/z0;

    .line 16
    .line 17
    iget-object p1, p1, Lnet/time4j/calendar/b$f;->model:Lnet/time4j/z0;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Lnet/time4j/z0;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    return p1

    .line 24
    :cond_0
    const/4 p1, 0x0

    .line 25
    return p1
    .line 26
    .line 27
.end method

.method protected readResolve()Ljava/lang/Object;
    .locals 0

    return-object p0
.end method
