.class public final Lch/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lch/x;)Z
    .locals 2

    instance-of v0, p0, Lch/c0;

    if-eqz v0, :cond_0

    check-cast p0, Lch/c0;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    const/4 v0, 0x0

    if-eqz p0, :cond_1

    invoke-interface {p0}, Lch/c0;->B()Lch/x;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Lch/c0;->I()Z

    move-result p0

    if-nez p0, :cond_1

    const/4 p0, 0x1

    move v0, p0

    :cond_1
    return v0
.end method
