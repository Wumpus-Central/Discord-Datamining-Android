.class Lfj/h0$d;
.super Lfj/e;
.source "SourceFile"

# interfaces
.implements Lfj/z;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfj/h0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lfj/k0<",
        "*TT;>;>",
        "Lfj/e<",
        "TT;>;",
        "Lfj/z<",
        "TT;TT;>;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x424c2af39bbdca9aL


# instance fields
.field private final max:Lfj/k0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private final min:Lfj/k0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private final type:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Ljava/lang/Class;Lfj/k0;Lfj/k0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "TT;>;TT;TT;)V"
        }
    .end annotation

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "-AXIS"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lfj/e;-><init>(Ljava/lang/String;)V

    .line 3
    iput-object p1, p0, Lfj/h0$d;->type:Ljava/lang/Class;

    .line 4
    iput-object p2, p0, Lfj/h0$d;->min:Lfj/k0;

    .line 5
    iput-object p3, p0, Lfj/h0$d;->max:Lfj/k0;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/Class;Lfj/k0;Lfj/k0;Lfj/h0$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lfj/h0$d;-><init>(Ljava/lang/Class;Lfj/k0;Lfj/k0;)V

    return-void
.end method


# virtual methods
.method public A()Lfj/k0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lfj/h0$d;->max:Lfj/k0;

    return-object v0
.end method

.method public B()Lfj/k0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lfj/h0$d;->min:Lfj/k0;

    return-object v0
.end method

.method public C(Lfj/k0;)Lfj/k0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)TT;"
        }
    .end annotation

    invoke-virtual {p0}, Lfj/h0$d;->A()Lfj/k0;

    move-result-object p1

    return-object p1
.end method

.method public D(Lfj/k0;)Lfj/k0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)TT;"
        }
    .end annotation

    invoke-virtual {p0}, Lfj/h0$d;->B()Lfj/k0;

    move-result-object p1

    return-object p1
.end method

.method public E(Lfj/k0;)Lfj/k0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)TT;"
        }
    .end annotation

    return-object p1
.end method

.method public F(Lfj/k0;Lfj/k0;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)Z"
        }
    .end annotation

    if-eqz p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public G()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public J(Lfj/k0;Lfj/k0;Z)Lfj/k0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;Z)TT;"
        }
    .end annotation

    if-eqz p2, :cond_0

    return-object p2

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Missing value."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic S()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lfj/h0$d;->B()Lfj/k0;

    move-result-object v0

    return-object v0
.end method

.method public T()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Lfj/p;
    .locals 0

    check-cast p1, Lfj/k0;

    invoke-virtual {p0, p1}, Lfj/h0$d;->x(Lfj/k0;)Lfj/p;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c(Ljava/lang/Object;)Lfj/p;
    .locals 0

    check-cast p1, Lfj/k0;

    invoke-virtual {p0, p1}, Lfj/h0$d;->y(Lfj/k0;)Lfj/p;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic f()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lfj/h0$d;->A()Lfj/k0;

    move-result-object v0

    return-object v0
.end method

.method protected g(Lfj/x;)Lfj/z;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<X:",
            "Lfj/q<",
            "TX;>;>(",
            "Lfj/x<",
            "TX;>;)",
            "Lfj/z<",
            "TX;TT;>;"
        }
    .end annotation

    invoke-virtual {p1}, Lfj/x;->q()Ljava/lang/Class;

    move-result-object p1

    iget-object v0, p0, Lfj/h0$d;->type:Ljava/lang/Class;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-object p0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lfj/h0$d;->type:Ljava/lang/Class;

    return-object v0
.end method

.method public bridge synthetic j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfj/k0;

    invoke-virtual {p0, p1}, Lfj/h0$d;->C(Lfj/k0;)Lfj/k0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic m(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lfj/k0;

    check-cast p2, Lfj/k0;

    invoke-virtual {p0, p1, p2}, Lfj/h0$d;->F(Lfj/k0;Lfj/k0;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic o(Ljava/lang/Object;Ljava/lang/Object;Z)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfj/k0;

    check-cast p2, Lfj/k0;

    invoke-virtual {p0, p1, p2, p3}, Lfj/h0$d;->J(Lfj/k0;Lfj/k0;Z)Lfj/k0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic p(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfj/k0;

    invoke-virtual {p0, p1}, Lfj/h0$d;->D(Lfj/k0;)Lfj/k0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfj/k0;

    invoke-virtual {p0, p1}, Lfj/h0$d;->E(Lfj/k0;)Lfj/k0;

    move-result-object p1

    return-object p1
.end method

.method protected t(Lfj/x;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/x<",
            "*>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method

.method protected w()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public x(Lfj/k0;)Lfj/p;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lfj/p<",
            "*>;"
        }
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public y(Lfj/k0;)Lfj/p;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lfj/p<",
            "*>;"
        }
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method
