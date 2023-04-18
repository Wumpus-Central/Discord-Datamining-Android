.class public final Lcom/discord/misc/utilities/size/SizeUtilsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0010\u0007\n\u0002\u0008\t\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00018G\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0005\"\u0015\u0010\u0006\u001a\u00020\u0002*\u00020\u00018F\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0008\"\u0015\u0010\t\u001a\u00020\u0001*\u00020\u00018F\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u0005\u00a8\u0006\u000b"
    }
    d2 = {
        "dpToPx",
        "",
        "",
        "getDpToPx",
        "(F)I",
        "(I)I",
        "pxToDp",
        "getPxToDp",
        "(I)F",
        "spToPx",
        "getSpToPx",
        "misc_utilities_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final getDpToPx(F)I
    .locals 1

    .line 2
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr p0, v0

    invoke-static {p0}, Lzf/a;->a(F)I

    move-result p0

    return p0
.end method

.method public static final getDpToPx(I)I
    .locals 0

    int-to-float p0, p0

    .line 1
    invoke-static {p0}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(F)I

    move-result p0

    return p0
.end method

.method public static final getPxToDp(I)F
    .locals 1

    int-to-float p0, p0

    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr p0, v0

    return p0
.end method

.method public static final getSpToPx(I)I
    .locals 1

    int-to-float p0, p0

    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->scaledDensity:F

    mul-float/2addr p0, v0

    invoke-static {p0}, Lzf/a;->a(F)I

    move-result p0

    return p0
.end method
