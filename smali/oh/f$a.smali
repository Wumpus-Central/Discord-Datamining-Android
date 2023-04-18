.class public final Loh/f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Loh/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(Loh/f;)Z
    .locals 0

    invoke-interface {p0}, Loh/f;->o()Loh/a;

    move-result-object p0

    invoke-virtual {p0}, Loh/a;->b()Z

    move-result p0

    return p0
.end method

.method public static b(Loh/f;)Z
    .locals 0

    invoke-interface {p0}, Loh/f;->o()Loh/a;

    move-result-object p0

    invoke-virtual {p0}, Loh/a;->c()Z

    move-result p0

    return p0
.end method
