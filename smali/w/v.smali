.class public final synthetic Lw/v;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lw/w;Lw/l2;)Lw/l2;
    .locals 1

    sget-object v0, Lw/w;->d:Lw/r0$a;

    invoke-interface {p0, v0, p1}, Lw/i2;->a(Lw/r0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lw/l2;

    return-object p0
.end method

.method public static b(Lw/w;)I
    .locals 2

    sget-object v0, Lw/w;->c:Lw/r0$a;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Lw/i2;->a(Lw/r0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0
.end method

.method public static c(Lw/w;)Lw/y2;
    .locals 2

    sget-object v0, Lw/w;->a:Lw/r0$a;

    sget-object v1, Lw/y2;->a:Lw/y2;

    invoke-interface {p0, v0, v1}, Lw/i2;->a(Lw/r0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lw/y2;

    return-object p0
.end method
