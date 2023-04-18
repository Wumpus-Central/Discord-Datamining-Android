.class Lej/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static a(D)I
    .locals 2

    invoke-static {p0, p1}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide p0

    const/16 v0, 0x20

    ushr-long v0, p0, v0

    xor-long/2addr p0, v0

    long-to-int p0, p0

    return p0
.end method

.method static b(D)D
    .locals 3

    .line 1
    :goto_0
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    invoke-static {v0, v1, p0, p1}, Ljava/lang/Double;->compare(DD)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const-wide v1, 0x4076800000000000L    # 360.0

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    if-lez v0, :cond_0

    .line 13
    .line 14
    add-double/2addr p0, v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    :goto_1
    invoke-static {p0, p1, v1, v2}, Ljava/lang/Double;->compare(DD)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-ltz v0, :cond_1

    .line 21
    .line 22
    sub-double/2addr p0, v1

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    return-wide p0
    .line 25
    .line 26
    .line 27
.end method
