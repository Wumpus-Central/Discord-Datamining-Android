.class public final synthetic Lw/w2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Landroidx/camera/core/w2;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# direct methods
.method public static a(Lw/x2;Landroidx/camera/core/t;)Landroidx/camera/core/t;
    .locals 1

    sget-object v0, Lw/x2;->q:Lw/r0$a;

    invoke-interface {p0, v0, p1}, Lw/i2;->a(Lw/r0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/camera/core/t;

    return-object p0
.end method

.method public static b(Lw/x2;Lw/n0$b;)Lw/n0$b;
    .locals 1

    sget-object v0, Lw/x2;->o:Lw/r0$a;

    invoke-interface {p0, v0, p1}, Lw/i2;->a(Lw/r0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lw/n0$b;

    return-object p0
.end method

.method public static c(Lw/x2;Lw/n0;)Lw/n0;
    .locals 1

    sget-object v0, Lw/x2;->m:Lw/r0$a;

    invoke-interface {p0, v0, p1}, Lw/i2;->a(Lw/r0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lw/n0;

    return-object p0
.end method

.method public static d(Lw/x2;Lw/k2;)Lw/k2;
    .locals 1

    sget-object v0, Lw/x2;->l:Lw/r0$a;

    invoke-interface {p0, v0, p1}, Lw/i2;->a(Lw/r0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lw/k2;

    return-object p0
.end method

.method public static e(Lw/x2;Lw/k2$d;)Lw/k2$d;
    .locals 1

    sget-object v0, Lw/x2;->n:Lw/r0$a;

    invoke-interface {p0, v0, p1}, Lw/i2;->a(Lw/r0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lw/k2$d;

    return-object p0
.end method

.method public static f(Lw/x2;I)I
    .locals 1

    sget-object v0, Lw/x2;->p:Lw/r0$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Lw/i2;->a(Lw/r0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0
.end method
