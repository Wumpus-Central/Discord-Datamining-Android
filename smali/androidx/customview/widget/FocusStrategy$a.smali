.class Landroidx/customview/widget/FocusStrategy$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/customview/widget/FocusStrategy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final k:Landroid/graphics/Rect;

.field private final l:Landroid/graphics/Rect;

.field private final m:Z

.field private final n:Landroidx/customview/widget/FocusStrategy$BoundsAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/customview/widget/FocusStrategy$BoundsAdapter<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(ZLandroidx/customview/widget/FocusStrategy$BoundsAdapter;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Landroidx/customview/widget/FocusStrategy$BoundsAdapter<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/Rect;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/customview/widget/FocusStrategy$a;->k:Landroid/graphics/Rect;

    .line 10
    .line 11
    new-instance v0, Landroid/graphics/Rect;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Landroidx/customview/widget/FocusStrategy$a;->l:Landroid/graphics/Rect;

    .line 17
    .line 18
    iput-boolean p1, p0, Landroidx/customview/widget/FocusStrategy$a;->m:Z

    .line 19
    .line 20
    iput-object p2, p0, Landroidx/customview/widget/FocusStrategy$a;->n:Landroidx/customview/widget/FocusStrategy$BoundsAdapter;

    .line 21
    .line 22
    return-void
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
.method public compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)I"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/customview/widget/FocusStrategy$a;->k:Landroid/graphics/Rect;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/customview/widget/FocusStrategy$a;->l:Landroid/graphics/Rect;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/customview/widget/FocusStrategy$a;->n:Landroidx/customview/widget/FocusStrategy$BoundsAdapter;

    .line 6
    .line 7
    invoke-interface {v2, p1, v0}, Landroidx/customview/widget/FocusStrategy$BoundsAdapter;->a(Ljava/lang/Object;Landroid/graphics/Rect;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Landroidx/customview/widget/FocusStrategy$a;->n:Landroidx/customview/widget/FocusStrategy$BoundsAdapter;

    .line 11
    .line 12
    invoke-interface {p1, p2, v1}, Landroidx/customview/widget/FocusStrategy$BoundsAdapter;->a(Ljava/lang/Object;Landroid/graphics/Rect;)V

    .line 13
    .line 14
    .line 15
    iget p1, v0, Landroid/graphics/Rect;->top:I

    .line 16
    .line 17
    iget p2, v1, Landroid/graphics/Rect;->top:I

    .line 18
    .line 19
    const/4 v2, -0x1

    .line 20
    if-ge p1, p2, :cond_0

    .line 21
    .line 22
    return v2

    .line 23
    :cond_0
    const/4 v3, 0x1

    .line 24
    if-le p1, p2, :cond_1

    .line 25
    .line 26
    return v3

    .line 27
    :cond_1
    iget p1, v0, Landroid/graphics/Rect;->left:I

    .line 28
    .line 29
    iget p2, v1, Landroid/graphics/Rect;->left:I

    .line 30
    .line 31
    if-ge p1, p2, :cond_3

    .line 32
    .line 33
    iget-boolean p1, p0, Landroidx/customview/widget/FocusStrategy$a;->m:Z

    .line 34
    .line 35
    if-eqz p1, :cond_2

    .line 36
    .line 37
    move v2, v3

    .line 38
    :cond_2
    return v2

    .line 39
    :cond_3
    if-le p1, p2, :cond_5

    .line 40
    .line 41
    iget-boolean p1, p0, Landroidx/customview/widget/FocusStrategy$a;->m:Z

    .line 42
    .line 43
    if-eqz p1, :cond_4

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_4
    move v2, v3

    .line 47
    :goto_0
    return v2

    .line 48
    :cond_5
    iget p1, v0, Landroid/graphics/Rect;->bottom:I

    .line 49
    .line 50
    iget p2, v1, Landroid/graphics/Rect;->bottom:I

    .line 51
    .line 52
    if-ge p1, p2, :cond_6

    .line 53
    .line 54
    return v2

    .line 55
    :cond_6
    if-le p1, p2, :cond_7

    .line 56
    .line 57
    return v3

    .line 58
    :cond_7
    iget p1, v0, Landroid/graphics/Rect;->right:I

    .line 59
    .line 60
    iget p2, v1, Landroid/graphics/Rect;->right:I

    .line 61
    .line 62
    if-ge p1, p2, :cond_9

    .line 63
    .line 64
    iget-boolean p1, p0, Landroidx/customview/widget/FocusStrategy$a;->m:Z

    .line 65
    .line 66
    if-eqz p1, :cond_8

    .line 67
    .line 68
    move v2, v3

    .line 69
    :cond_8
    return v2

    .line 70
    :cond_9
    if-le p1, p2, :cond_b

    .line 71
    .line 72
    iget-boolean p1, p0, Landroidx/customview/widget/FocusStrategy$a;->m:Z

    .line 73
    .line 74
    if-eqz p1, :cond_a

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_a
    move v2, v3

    .line 78
    :goto_1
    return v2

    .line 79
    :cond_b
    const/4 p1, 0x0

    .line 80
    return p1
    .line 81
    .line 82
    .line 83
.end method
