.class public abstract Lnh/i$d;
.super Lnh/i;
.source "SourceFile"

# interfaces
.implements Lnh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnh/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnh/i$d$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Lnh/i$d<",
        "TMessageType;>;>",
        "Lnh/i;",
        "Lnh/r;"
    }
.end annotation


# instance fields
.field private final l:Lnh/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnh/h<",
            "Lnh/i$e;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method protected constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lnh/i;-><init>()V

    .line 2
    invoke-static {}, Lnh/h;->t()Lnh/h;

    move-result-object v0

    iput-object v0, p0, Lnh/i$d;->l:Lnh/h;

    return-void
.end method

.method protected constructor <init>(Lnh/i$c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnh/i$c<",
            "TMessageType;*>;)V"
        }
    .end annotation

    .line 3
    invoke-direct {p0}, Lnh/i;-><init>()V

    .line 4
    invoke-static {p1}, Lnh/i$c;->r(Lnh/i$c;)Lnh/h;

    move-result-object p1

    iput-object p1, p0, Lnh/i$d;->l:Lnh/h;

    return-void
.end method

.method private A(Lnh/i$f;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnh/i$f<",
            "TMessageType;*>;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lnh/i$f;->b()Lnh/q;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p0}, Lnh/r;->a()Lnh/q;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-ne p1, v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 13
    .line 14
    const-string v0, "This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings."

    .line 15
    .line 16
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p1
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method static synthetic s(Lnh/i$d;)Lnh/h;
    .locals 0

    iget-object p0, p0, Lnh/i$d;->l:Lnh/h;

    return-object p0
.end method


# virtual methods
.method protected n()V
    .locals 1

    iget-object v0, p0, Lnh/i$d;->l:Lnh/h;

    invoke-virtual {v0}, Lnh/h;->q()V

    return-void
.end method

.method protected q(Lnh/e;Lnh/f;Lnh/g;I)Z
    .locals 6

    iget-object v0, p0, Lnh/i$d;->l:Lnh/h;

    invoke-interface {p0}, Lnh/r;->a()Lnh/q;

    move-result-object v1

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-static/range {v0 .. v5}, Lnh/i;->i(Lnh/h;Lnh/q;Lnh/e;Lnh/f;Lnh/g;I)Z

    move-result p1

    return p1
.end method

.method protected t()Z
    .locals 1

    iget-object v0, p0, Lnh/i$d;->l:Lnh/h;

    invoke-virtual {v0}, Lnh/h;->n()Z

    move-result v0

    return v0
.end method

.method protected u()I
    .locals 1

    iget-object v0, p0, Lnh/i$d;->l:Lnh/h;

    invoke-virtual {v0}, Lnh/h;->k()I

    move-result v0

    return v0
.end method

.method public final v(Lnh/i$f;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Type:",
            "Ljava/lang/Object;",
            ">(",
            "Lnh/i$f<",
            "TMessageType;TType;>;)TType;"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lnh/i$d;->A(Lnh/i$f;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lnh/i$d;->l:Lnh/h;

    .line 5
    .line 6
    iget-object v1, p1, Lnh/i$f;->d:Lnh/i$e;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lnh/h;->h(Lnh/h$b;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    iget-object p1, p1, Lnh/i$f;->b:Ljava/lang/Object;

    .line 15
    .line 16
    return-object p1

    .line 17
    :cond_0
    invoke-virtual {p1, v0}, Lnh/i$f;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public final w(Lnh/i$f;I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Type:",
            "Ljava/lang/Object;",
            ">(",
            "Lnh/i$f<",
            "TMessageType;",
            "Ljava/util/List<",
            "TType;>;>;I)TType;"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lnh/i$d;->A(Lnh/i$f;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lnh/i$d;->l:Lnh/h;

    .line 5
    .line 6
    iget-object v1, p1, Lnh/i$f;->d:Lnh/i$e;

    .line 7
    .line 8
    invoke-virtual {v0, v1, p2}, Lnh/h;->i(Lnh/h$b;I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    invoke-virtual {p1, p2}, Lnh/i$f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
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

.method public final x(Lnh/i$f;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Type:",
            "Ljava/lang/Object;",
            ">(",
            "Lnh/i$f<",
            "TMessageType;",
            "Ljava/util/List<",
            "TType;>;>;)I"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lnh/i$d;->A(Lnh/i$f;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lnh/i$d;->l:Lnh/h;

    .line 5
    .line 6
    iget-object p1, p1, Lnh/i$f;->d:Lnh/i$e;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lnh/h;->j(Lnh/h$b;)I

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

.method public final y(Lnh/i$f;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Type:",
            "Ljava/lang/Object;",
            ">(",
            "Lnh/i$f<",
            "TMessageType;TType;>;)Z"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lnh/i$d;->A(Lnh/i$f;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lnh/i$d;->l:Lnh/h;

    .line 5
    .line 6
    iget-object p1, p1, Lnh/i$f;->d:Lnh/i$e;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lnh/h;->m(Lnh/h$b;)Z

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

.method protected z()Lnh/i$d$a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnh/i$d<",
            "TMessageType;>.a;"
        }
    .end annotation

    new-instance v0, Lnh/i$d$a;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Lnh/i$d$a;-><init>(Lnh/i$d;ZLnh/i$a;)V

    return-object v0
.end method
