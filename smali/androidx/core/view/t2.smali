.class public final Landroidx/core/view/t2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/core/view/t2$d;,
        Landroidx/core/view/t2$c;,
        Landroidx/core/view/t2$e;,
        Landroidx/core/view/t2$b;,
        Landroidx/core/view/t2$a;
    }
.end annotation


# instance fields
.field private a:Landroidx/core/view/t2$e;


# direct methods
.method public constructor <init>(ILandroid/view/animation/Interpolator;J)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 3
    new-instance v0, Landroidx/core/view/t2$d;

    invoke-direct {v0, p1, p2, p3, p4}, Landroidx/core/view/t2$d;-><init>(ILandroid/view/animation/Interpolator;J)V

    iput-object v0, p0, Landroidx/core/view/t2;->a:Landroidx/core/view/t2$e;

    goto :goto_0

    .line 4
    :cond_0
    new-instance v0, Landroidx/core/view/t2$c;

    invoke-direct {v0, p1, p2, p3, p4}, Landroidx/core/view/t2$c;-><init>(ILandroid/view/animation/Interpolator;J)V

    iput-object v0, p0, Landroidx/core/view/t2;->a:Landroidx/core/view/t2$e;

    :goto_0
    return-void
.end method

.method private constructor <init>(Landroid/view/WindowInsetsAnimation;)V
    .locals 4

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    .line 5
    invoke-direct {p0, v3, v0, v1, v2}, Landroidx/core/view/t2;-><init>(ILandroid/view/animation/Interpolator;J)V

    .line 6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 7
    new-instance v0, Landroidx/core/view/t2$d;

    invoke-direct {v0, p1}, Landroidx/core/view/t2$d;-><init>(Landroid/view/WindowInsetsAnimation;)V

    iput-object v0, p0, Landroidx/core/view/t2;->a:Landroidx/core/view/t2$e;

    :cond_0
    return-void
.end method

.method static c(Landroid/view/View;Landroidx/core/view/t2$b;)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1e

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p0, p1}, Landroidx/core/view/t2$d;->g(Landroid/view/View;Landroidx/core/view/t2$b;)V

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-static {p0, p1}, Landroidx/core/view/t2$c;->n(Landroid/view/View;Landroidx/core/view/t2$b;)V

    .line 12
    .line 13
    .line 14
    :goto_0
    return-void
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

.method static e(Landroid/view/WindowInsetsAnimation;)Landroidx/core/view/t2;
    .locals 1

    new-instance v0, Landroidx/core/view/t2;

    invoke-direct {v0, p0}, Landroidx/core/view/t2;-><init>(Landroid/view/WindowInsetsAnimation;)V

    return-object v0
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-object v0, p0, Landroidx/core/view/t2;->a:Landroidx/core/view/t2$e;

    invoke-virtual {v0}, Landroidx/core/view/t2$e;->a()J

    move-result-wide v0

    return-wide v0
.end method

.method public b()F
    .locals 1

    iget-object v0, p0, Landroidx/core/view/t2;->a:Landroidx/core/view/t2$e;

    invoke-virtual {v0}, Landroidx/core/view/t2$e;->b()F

    move-result v0

    return v0
.end method

.method public d(F)V
    .locals 1

    iget-object v0, p0, Landroidx/core/view/t2;->a:Landroidx/core/view/t2$e;

    invoke-virtual {v0, p1}, Landroidx/core/view/t2$e;->c(F)V

    return-void
.end method
