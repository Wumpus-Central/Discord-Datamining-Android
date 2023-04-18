.class public final Lof/a;
.super Lof/e;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "of/c",
        "of/d",
        "of/e"
    }
    d2 = {}
    k = 0x4
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static bridge varargs synthetic b([Lkotlin/jvm/functions/Function1;)Ljava/util/Comparator;
    .locals 0

    invoke-static {p0}, Lof/c;->b([Lkotlin/jvm/functions/Function1;)Ljava/util/Comparator;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic d(Ljava/lang/Comparable;Ljava/lang/Comparable;)I
    .locals 0

    invoke-static {p0, p1}, Lof/c;->d(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p0

    return p0
.end method

.method public static bridge synthetic f()Ljava/util/Comparator;
    .locals 1

    invoke-static {}, Lof/c;->f()Ljava/util/Comparator;

    move-result-object v0

    return-object v0
.end method
