.class final Ldh/n;
.super Ldh/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ldh/a<",
        "Lng/c;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lng/a;

.field private final b:Z

.field private final c:Lyg/g;

.field private final d:Lvg/b;

.field private final e:Z


# direct methods
.method public constructor <init>(Lng/a;ZLyg/g;Lvg/b;Z)V
    .locals 1

    const-string v0, "containerContext"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "containerApplicabilityType"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ldh/a;-><init>()V

    .line 3
    iput-object p1, p0, Ldh/n;->a:Lng/a;

    .line 4
    iput-boolean p2, p0, Ldh/n;->b:Z

    .line 5
    iput-object p3, p0, Ldh/n;->c:Lyg/g;

    .line 6
    iput-object p4, p0, Ldh/n;->d:Lvg/b;

    .line 7
    iput-boolean p5, p0, Ldh/n;->e:Z

    return-void
.end method

.method public synthetic constructor <init>(Lng/a;ZLyg/g;Lvg/b;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    const/4 p5, 0x0

    :cond_0
    move v5, p5

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 1
    invoke-direct/range {v0 .. v5}, Ldh/n;-><init>(Lng/a;ZLyg/g;Lvg/b;Z)V

    return-void
.end method


# virtual methods
.method public A(Lhi/i;)Z
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    check-cast p1, Ldi/g0;

    .line 7
    .line 8
    invoke-virtual {p1}, Ldi/g0;->Q0()Ldi/v1;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    instance-of p1, p1, Ldh/g;

    .line 13
    .line 14
    return p1
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

.method public D()Lvg/d;
    .locals 1

    iget-object v0, p0, Ldh/n;->c:Lyg/g;

    invoke-virtual {v0}, Lyg/g;->a()Lyg/b;

    move-result-object v0

    invoke-virtual {v0}, Lyg/b;->a()Lvg/d;

    move-result-object v0

    return-object v0
.end method

.method public E(Lhi/i;)Ldi/g0;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    check-cast p1, Ldi/g0;

    .line 7
    .line 8
    invoke-static {p1}, Ldi/u1;->a(Ldi/g0;)Ldi/g0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
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

.method public F(Lng/c;)Z
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Lxg/g;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    move-object v0, p1

    .line 11
    check-cast v0, Lxg/g;

    .line 12
    .line 13
    invoke-interface {v0}, Lxg/g;->g()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    :cond_0
    instance-of v0, p1, Lzg/e;

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    invoke-virtual {p0}, Ldh/n;->o()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    check-cast p1, Lzg/e;

    .line 30
    .line 31
    invoke-virtual {p1}, Lzg/e;->l()Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-nez p1, :cond_1

    .line 36
    .line 37
    invoke-virtual {p0}, Ldh/n;->l()Lvg/b;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    sget-object v0, Lvg/b;->p:Lvg/b;

    .line 42
    .line 43
    if-ne p1, v0, :cond_2

    .line 44
    .line 45
    :cond_1
    const/4 p1, 0x1

    .line 46
    goto :goto_0

    .line 47
    :cond_2
    const/4 p1, 0x0

    .line 48
    :goto_0
    return p1
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

.method public G()Lhi/r;
    .locals 1

    sget-object v0, Lei/q;->a:Lei/q;

    return-object v0
.end method

.method public bridge synthetic h()Lvg/a;
    .locals 1

    invoke-virtual {p0}, Ldh/n;->D()Lvg/d;

    move-result-object v0

    return-object v0
.end method

.method public i(Lhi/i;)Ljava/lang/Iterable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhi/i;",
            ")",
            "Ljava/lang/Iterable<",
            "Lng/c;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    check-cast p1, Ldi/g0;

    .line 7
    .line 8
    invoke-virtual {p1}, Ldi/g0;->getAnnotations()Lng/g;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
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

.method public k()Ljava/lang/Iterable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Iterable<",
            "Lng/c;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ldh/n;->a:Lng/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lng/a;->getAnnotations()Lng/g;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public l()Lvg/b;
    .locals 1

    iget-object v0, p0, Ldh/n;->d:Lvg/b;

    return-object v0
.end method

.method public m()Lvg/y;
    .locals 1

    iget-object v0, p0, Ldh/n;->c:Lyg/g;

    invoke-virtual {v0}, Lyg/g;->b()Lvg/y;

    move-result-object v0

    return-object v0
.end method

.method public n()Z
    .locals 2

    iget-object v0, p0, Ldh/n;->a:Lng/a;

    instance-of v1, v0, Lmg/j1;

    if-eqz v1, :cond_0

    check-cast v0, Lmg/j1;

    invoke-interface {v0}, Lmg/j1;->j0()Ldi/g0;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public o()Z
    .locals 1

    iget-object v0, p0, Ldh/n;->c:Lyg/g;

    invoke-virtual {v0}, Lyg/g;->a()Lyg/b;

    move-result-object v0

    invoke-virtual {v0}, Lyg/b;->q()Lyg/c;

    move-result-object v0

    invoke-interface {v0}, Lyg/c;->c()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic p(Lhi/i;)Lhi/i;
    .locals 0

    invoke-virtual {p0, p1}, Ldh/n;->E(Lhi/i;)Ldi/g0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic r(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lng/c;

    invoke-virtual {p0, p1}, Ldh/n;->F(Lng/c;)Z

    move-result p1

    return p1
.end method

.method public s(Lhi/i;)Llh/d;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    check-cast p1, Ldi/g0;

    .line 7
    .line 8
    invoke-static {p1}, Ldi/s1;->f(Ldi/g0;)Lmg/e;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    invoke-static {p1}, Lph/e;->m(Lmg/m;)Llh/d;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    :goto_0
    return-object p1
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public u()Z
    .locals 1

    iget-boolean v0, p0, Ldh/n;->e:Z

    return v0
.end method

.method public bridge synthetic v()Lhi/p;
    .locals 1

    invoke-virtual {p0}, Ldh/n;->G()Lhi/r;

    move-result-object v0

    return-object v0
.end method

.method public w(Lhi/i;)Z
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    check-cast p1, Ldi/g0;

    .line 7
    .line 8
    invoke-static {p1}, Ljg/h;->d0(Ldi/g0;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
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

.method public x()Z
    .locals 1

    iget-boolean v0, p0, Ldh/n;->b:Z

    return v0
.end method

.method public y(Lhi/i;Lhi/i;)Z
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "other"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Ldh/n;->c:Lyg/g;

    .line 12
    .line 13
    invoke-virtual {v0}, Lyg/g;->a()Lyg/b;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lyg/b;->k()Lei/l;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast p1, Ldi/g0;

    .line 22
    .line 23
    check-cast p2, Ldi/g0;

    .line 24
    .line 25
    invoke-interface {v0, p1, p2}, Lei/e;->c(Ldi/g0;Ldi/g0;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    return p1
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

.method public z(Lhi/o;)Z
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of p1, p1, Lzg/n;

    .line 7
    .line 8
    return p1
    .line 9
    .line 10
    .line 11
    .line 12
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
