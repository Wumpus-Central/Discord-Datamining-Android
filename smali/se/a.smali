.class public final Lse/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u001a\u0016\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000\u00a8\u0006\u0004"
    }
    d2 = {
        "",
        "width",
        "height",
        "a",
        "react-native-vision-camera_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(II)I
    .locals 4

    .line 1
    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-double v0, v0

    .line 6
    invoke-static {p0, p1}, Ljava/lang/Math;->min(II)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    int-to-double p0, p0

    .line 11
    div-double/2addr v0, p0

    .line 12
    const-wide p0, 0x3ff5555555555555L    # 1.3333333333333333

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    sub-double p0, v0, p0

    .line 18
    .line 19
    invoke-static {p0, p1}, Ljava/lang/Math;->abs(D)D

    .line 20
    .line 21
    .line 22
    move-result-wide p0

    .line 23
    const-wide v2, 0x3ffc71c71c71c71cL    # 1.7777777777777777

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    sub-double/2addr v0, v2

    .line 29
    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    .line 30
    .line 31
    .line 32
    move-result-wide v0

    .line 33
    cmpg-double p0, p0, v0

    .line 34
    .line 35
    if-gtz p0, :cond_0

    .line 36
    .line 37
    const/4 p0, 0x0

    .line 38
    return p0

    .line 39
    :cond_0
    const/4 p0, 0x1

    .line 40
    return p0
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
