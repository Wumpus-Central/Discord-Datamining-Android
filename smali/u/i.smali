.class public Lu/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lw/g2;


# direct methods
.method public constructor <init>(Lw/g2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu/i;->a:Lw/g2;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method


# virtual methods
.method public a(Landroidx/camera/core/v1;I)Landroid/graphics/PointF;
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p2, v0, :cond_0

    .line 3
    .line 4
    iget-object p2, p0, Lu/i;->a:Lw/g2;

    .line 5
    .line 6
    const-class v0, Lt/b;

    .line 7
    .line 8
    invoke-virtual {p2, v0}, Lw/g2;->a(Ljava/lang/Class;)Z

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    if-eqz p2, :cond_0

    .line 13
    .line 14
    new-instance p2, Landroid/graphics/PointF;

    .line 15
    .line 16
    invoke-virtual {p1}, Landroidx/camera/core/v1;->c()F

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/high16 v1, 0x3f800000    # 1.0f

    .line 21
    .line 22
    sub-float/2addr v1, v0

    .line 23
    invoke-virtual {p1}, Landroidx/camera/core/v1;->d()F

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    invoke-direct {p2, v1, p1}, Landroid/graphics/PointF;-><init>(FF)V

    .line 28
    .line 29
    .line 30
    return-object p2

    .line 31
    :cond_0
    new-instance p2, Landroid/graphics/PointF;

    .line 32
    .line 33
    invoke-virtual {p1}, Landroidx/camera/core/v1;->c()F

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-virtual {p1}, Landroidx/camera/core/v1;->d()F

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    invoke-direct {p2, v0, p1}, Landroid/graphics/PointF;-><init>(FF)V

    .line 42
    .line 43
    .line 44
    return-object p2
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
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
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method
