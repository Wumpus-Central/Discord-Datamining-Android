.class public final Landroidx/camera/core/c3$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/c3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:I

.field private final b:Landroid/util/Rational;

.field private final c:I

.field private d:I


# direct methods
.method public constructor <init>(Landroid/util/Rational;I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput v0, p0, Landroidx/camera/core/c3$a;->a:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput v0, p0, Landroidx/camera/core/c3$a;->d:I

    .line 9
    .line 10
    iput-object p1, p0, Landroidx/camera/core/c3$a;->b:Landroid/util/Rational;

    .line 11
    .line 12
    iput p2, p0, Landroidx/camera/core/c3$a;->c:I

    .line 13
    .line 14
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


# virtual methods
.method public a()Landroidx/camera/core/c3;
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/camera/core/c3$a;->b:Landroid/util/Rational;

    .line 2
    .line 3
    const-string v1, "The crop aspect ratio must be set."

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroidx/core/util/g;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    new-instance v0, Landroidx/camera/core/c3;

    .line 9
    .line 10
    iget v1, p0, Landroidx/camera/core/c3$a;->a:I

    .line 11
    .line 12
    iget-object v2, p0, Landroidx/camera/core/c3$a;->b:Landroid/util/Rational;

    .line 13
    .line 14
    iget v3, p0, Landroidx/camera/core/c3$a;->c:I

    .line 15
    .line 16
    iget v4, p0, Landroidx/camera/core/c3$a;->d:I

    .line 17
    .line 18
    invoke-direct {v0, v1, v2, v3, v4}, Landroidx/camera/core/c3;-><init>(ILandroid/util/Rational;II)V

    .line 19
    .line 20
    .line 21
    return-object v0
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

.method public b(I)Landroidx/camera/core/c3$a;
    .locals 0

    iput p1, p0, Landroidx/camera/core/c3$a;->d:I

    return-object p0
.end method

.method public c(I)Landroidx/camera/core/c3$a;
    .locals 0

    iput p1, p0, Landroidx/camera/core/c3$a;->a:I

    return-object p0
.end method
