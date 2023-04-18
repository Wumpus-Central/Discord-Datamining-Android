.class public final synthetic Lw/h1;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lw/i1;)I
    .locals 1

    sget-object v0, Lw/i1;->e:Lw/r0$a;

    invoke-interface {p0, v0}, Lw/i2;->b(Lw/r0$a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0
.end method
