.class public Lcom/facebook/drawee/drawable/ScalingUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/drawee/drawable/ScalingUtils$m;,
        Lcom/facebook/drawee/drawable/ScalingUtils$k;,
        Lcom/facebook/drawee/drawable/ScalingUtils$i;,
        Lcom/facebook/drawee/drawable/ScalingUtils$l;,
        Lcom/facebook/drawee/drawable/ScalingUtils$c;,
        Lcom/facebook/drawee/drawable/ScalingUtils$d;,
        Lcom/facebook/drawee/drawable/ScalingUtils$b;,
        Lcom/facebook/drawee/drawable/ScalingUtils$g;,
        Lcom/facebook/drawee/drawable/ScalingUtils$f;,
        Lcom/facebook/drawee/drawable/ScalingUtils$e;,
        Lcom/facebook/drawee/drawable/ScalingUtils$h;,
        Lcom/facebook/drawee/drawable/ScalingUtils$j;,
        Lcom/facebook/drawee/drawable/ScalingUtils$a;,
        Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;
    }
.end annotation


# direct methods
.method public static a(Landroid/graphics/drawable/Drawable;)Lcom/facebook/drawee/drawable/n;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    instance-of v1, p0, Lcom/facebook/drawee/drawable/n;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    check-cast p0, Lcom/facebook/drawee/drawable/n;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_1
    instance-of v1, p0, Lcom/facebook/drawee/drawable/c;

    .line 13
    .line 14
    if-eqz v1, :cond_2

    .line 15
    .line 16
    check-cast p0, Lcom/facebook/drawee/drawable/c;

    .line 17
    .line 18
    invoke-interface {p0}, Lcom/facebook/drawee/drawable/c;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-static {p0}, Lcom/facebook/drawee/drawable/ScalingUtils;->a(Landroid/graphics/drawable/Drawable;)Lcom/facebook/drawee/drawable/n;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :cond_2
    instance-of v1, p0, Lcom/facebook/drawee/drawable/a;

    .line 28
    .line 29
    if-eqz v1, :cond_4

    .line 30
    .line 31
    check-cast p0, Lcom/facebook/drawee/drawable/a;

    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/facebook/drawee/drawable/a;->d()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    const/4 v2, 0x0

    .line 38
    :goto_0
    if-ge v2, v1, :cond_4

    .line 39
    .line 40
    invoke-virtual {p0, v2}, Lcom/facebook/drawee/drawable/a;->b(I)Landroid/graphics/drawable/Drawable;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-static {v3}, Lcom/facebook/drawee/drawable/ScalingUtils;->a(Landroid/graphics/drawable/Drawable;)Lcom/facebook/drawee/drawable/n;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    if-eqz v3, :cond_3

    .line 49
    .line 50
    return-object v3

    .line 51
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_4
    return-object v0
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
.end method
