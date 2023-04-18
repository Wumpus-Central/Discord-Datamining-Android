.class public final Lec/b;
.super Lec/c;
.source "SourceFile"


# direct methods
.method public static a(F)I
    .locals 0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Float;->hashCode()I

    move-result p0

    return p0
.end method
