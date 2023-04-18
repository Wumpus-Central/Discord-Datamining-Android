.class Landroidx/transition/g$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "e"
.end annotation


# instance fields
.field private final a:Landroid/graphics/Matrix;

.field private final b:Landroid/view/View;

.field private final c:[F

.field private d:F

.field private e:F


# direct methods
.method constructor <init>(Landroid/view/View;[F)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/Matrix;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/transition/g$e;->a:Landroid/graphics/Matrix;

    .line 10
    .line 11
    iput-object p1, p0, Landroidx/transition/g$e;->b:Landroid/view/View;

    .line 12
    .line 13
    invoke-virtual {p2}, [F->clone()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, [F

    .line 18
    .line 19
    iput-object p1, p0, Landroidx/transition/g$e;->c:[F

    .line 20
    .line 21
    const/4 p2, 0x2

    .line 22
    aget p2, p1, p2

    .line 23
    .line 24
    iput p2, p0, Landroidx/transition/g$e;->d:F

    .line 25
    .line 26
    const/4 p2, 0x5

    .line 27
    aget p1, p1, p2

    .line 28
    .line 29
    iput p1, p0, Landroidx/transition/g$e;->e:F

    .line 30
    .line 31
    invoke-direct {p0}, Landroidx/transition/g$e;->b()V

    .line 32
    .line 33
    .line 34
    return-void
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
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

.method private b()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/transition/g$e;->c:[F

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    iget v2, p0, Landroidx/transition/g$e;->d:F

    .line 5
    .line 6
    aput v2, v0, v1

    .line 7
    .line 8
    const/4 v1, 0x5

    .line 9
    iget v2, p0, Landroidx/transition/g$e;->e:F

    .line 10
    .line 11
    aput v2, v0, v1

    .line 12
    .line 13
    iget-object v1, p0, Landroidx/transition/g$e;->a:Landroid/graphics/Matrix;

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->setValues([F)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Landroidx/transition/g$e;->b:Landroid/view/View;

    .line 19
    .line 20
    iget-object v1, p0, Landroidx/transition/g$e;->a:Landroid/graphics/Matrix;

    .line 21
    .line 22
    invoke-static {v0, v1}, Landroidx/transition/p0;->f(Landroid/view/View;Landroid/graphics/Matrix;)V

    .line 23
    .line 24
    .line 25
    return-void
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
.method a()Landroid/graphics/Matrix;
    .locals 1

    iget-object v0, p0, Landroidx/transition/g$e;->a:Landroid/graphics/Matrix;

    return-object v0
.end method

.method c(Landroid/graphics/PointF;)V
    .locals 1

    .line 1
    iget v0, p1, Landroid/graphics/PointF;->x:F

    .line 2
    .line 3
    iput v0, p0, Landroidx/transition/g$e;->d:F

    .line 4
    .line 5
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 6
    .line 7
    iput p1, p0, Landroidx/transition/g$e;->e:F

    .line 8
    .line 9
    invoke-direct {p0}, Landroidx/transition/g$e;->b()V

    .line 10
    .line 11
    .line 12
    return-void
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

.method d([F)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/transition/g$e;->c:[F

    .line 2
    .line 3
    array-length v1, p1

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-static {p1, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Landroidx/transition/g$e;->b()V

    .line 9
    .line 10
    .line 11
    return-void
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
