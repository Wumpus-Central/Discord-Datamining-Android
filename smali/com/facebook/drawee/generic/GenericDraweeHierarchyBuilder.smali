.class public Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final t:Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;

.field public static final u:Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;


# instance fields
.field private a:Landroid/content/res/Resources;

.field private b:I

.field private c:F

.field private d:Landroid/graphics/drawable/Drawable;

.field private e:Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;

.field private f:Landroid/graphics/drawable/Drawable;

.field private g:Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;

.field private h:Landroid/graphics/drawable/Drawable;

.field private i:Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;

.field private j:Landroid/graphics/drawable/Drawable;

.field private k:Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;

.field private l:Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;

.field private m:Landroid/graphics/Matrix;

.field private n:Landroid/graphics/PointF;

.field private o:Landroid/graphics/ColorFilter;

.field private p:Landroid/graphics/drawable/Drawable;

.field private q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/graphics/drawable/Drawable;",
            ">;"
        }
    .end annotation
.end field

.field private r:Landroid/graphics/drawable/Drawable;

.field private s:Lcom/facebook/drawee/generic/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;->h:Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;

    .line 2
    .line 3
    sput-object v0, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->t:Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;

    .line 4
    .line 5
    sget-object v0, Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;->i:Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;

    .line 6
    .line 7
    sput-object v0, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->u:Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;

    .line 8
    .line 9
    return-void
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
.end method

.method public constructor <init>(Landroid/content/res/Resources;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->a:Landroid/content/res/Resources;

    .line 5
    .line 6
    invoke-direct {p0}, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->t()V

    .line 7
    .line 8
    .line 9
    return-void
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
.end method

.method private L()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->q:Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Landroid/graphics/drawable/Drawable;

    .line 20
    .line 21
    invoke-static {v1}, Lv3/j;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
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
.end method

.method private t()V
    .locals 2

    .line 1
    const/16 v0, 0x12c

    .line 2
    .line 3
    iput v0, p0, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->b:I

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput v0, p0, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->c:F

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->d:Landroid/graphics/drawable/Drawable;

    .line 10
    .line 11
    sget-object v1, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->t:Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;

    .line 12
    .line 13
    iput-object v1, p0, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->e:Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;

    .line 14
    .line 15
    iput-object v0, p0, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->f:Landroid/graphics/drawable/Drawable;

    .line 16
    .line 17
    iput-object v1, p0, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->g:Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;

    .line 18
    .line 19
    iput-object v0, p0, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->h:Landroid/graphics/drawable/Drawable;

    .line 20
    .line 21
    iput-object v1, p0, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->i:Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;

    .line 22
    .line 23
    iput-object v0, p0, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->j:Landroid/graphics/drawable/Drawable;

    .line 24
    .line 25
    iput-object v1, p0, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->k:Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;

    .line 26
    .line 27
    sget-object v1, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->u:Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;

    .line 28
    .line 29
    iput-object v1, p0, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->l:Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;

    .line 30
    .line 31
    iput-object v0, p0, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->m:Landroid/graphics/Matrix;

    .line 32
    .line 33
    iput-object v0, p0, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->n:Landroid/graphics/PointF;

    .line 34
    .line 35
    iput-object v0, p0, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->o:Landroid/graphics/ColorFilter;

    .line 36
    .line 37
    iput-object v0, p0, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->p:Landroid/graphics/drawable/Drawable;

    .line 38
    .line 39
    iput-object v0, p0, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->q:Ljava/util/List;

    .line 40
    .line 41
    iput-object v0, p0, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->r:Landroid/graphics/drawable/Drawable;

    .line 42
    .line 43
    iput-object v0, p0, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->s:Lcom/facebook/drawee/generic/a;

    .line 44
    .line 45
    return-void
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
.end method

.method public static u(Landroid/content/res/Resources;)Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;
    .locals 1

    new-instance v0, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;

    invoke-direct {v0, p0}, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;-><init>(Landroid/content/res/Resources;)V

    return-object v0
.end method


# virtual methods
.method public A(Landroid/graphics/drawable/Drawable;)Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;
    .locals 0

    iput-object p1, p0, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->h:Landroid/graphics/drawable/Drawable;

    return-object p0
.end method

.method public B(Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;)Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;
    .locals 0

    iput-object p1, p0, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->i:Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;

    return-object p0
.end method

.method public C(Landroid/graphics/drawable/Drawable;)Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->q:Ljava/util/List;

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x1

    .line 8
    new-array v0, v0, [Landroid/graphics/drawable/Drawable;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    aput-object p1, v0, v1

    .line 12
    .line 13
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->q:Ljava/util/List;

    .line 18
    .line 19
    :goto_0
    return-object p0
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
.end method

.method public D(Landroid/graphics/drawable/Drawable;)Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;
    .locals 0

    iput-object p1, p0, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->d:Landroid/graphics/drawable/Drawable;

    return-object p0
.end method

.method public E(Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;)Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;
    .locals 0

    iput-object p1, p0, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->e:Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;

    return-object p0
.end method

.method public F(Landroid/graphics/drawable/Drawable;)Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;
    .locals 4

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->r:Landroid/graphics/drawable/Drawable;

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    new-instance v0, Landroid/graphics/drawable/StateListDrawable;

    .line 8
    .line 9
    invoke-direct {v0}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    new-array v1, v1, [I

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    const v3, 0x10100a7

    .line 17
    .line 18
    .line 19
    aput v3, v1, v2

    .line 20
    .line 21
    invoke-virtual {v0, v1, p1}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->r:Landroid/graphics/drawable/Drawable;

    .line 25
    .line 26
    :goto_0
    return-object p0
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
.end method

.method public G(Landroid/graphics/drawable/Drawable;)Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;
    .locals 0

    iput-object p1, p0, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->j:Landroid/graphics/drawable/Drawable;

    return-object p0
.end method

.method public H(Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;)Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;
    .locals 0

    iput-object p1, p0, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->k:Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;

    return-object p0
.end method

.method public I(Landroid/graphics/drawable/Drawable;)Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;
    .locals 0

    iput-object p1, p0, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->f:Landroid/graphics/drawable/Drawable;

    return-object p0
.end method

.method public J(Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;)Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;
    .locals 0

    iput-object p1, p0, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->g:Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;

    return-object p0
.end method

.method public K(Lcom/facebook/drawee/generic/a;)Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;
    .locals 0

    iput-object p1, p0, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->s:Lcom/facebook/drawee/generic/a;

    return-object p0
.end method

.method public a()Lcom/facebook/drawee/generic/GenericDraweeHierarchy;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->L()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/facebook/drawee/generic/GenericDraweeHierarchy;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/facebook/drawee/generic/GenericDraweeHierarchy;-><init>(Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;)V

    .line 7
    .line 8
    .line 9
    return-object v0
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
.end method

.method public b()Landroid/graphics/ColorFilter;
    .locals 1

    iget-object v0, p0, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->o:Landroid/graphics/ColorFilter;

    return-object v0
.end method

.method public c()Landroid/graphics/PointF;
    .locals 1

    iget-object v0, p0, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->n:Landroid/graphics/PointF;

    return-object v0
.end method

.method public d()Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;
    .locals 1

    iget-object v0, p0, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->l:Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;

    return-object v0
.end method

.method public e()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->p:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public f()F
    .locals 1

    iget v0, p0, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->c:F

    return v0
.end method

.method public g()I
    .locals 1

    iget v0, p0, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->b:I

    return v0
.end method

.method public h()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->h:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public i()Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;
    .locals 1

    iget-object v0, p0, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->i:Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;

    return-object v0
.end method

.method public j()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/graphics/drawable/Drawable;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->q:Ljava/util/List;

    return-object v0
.end method

.method public k()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->d:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public l()Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;
    .locals 1

    iget-object v0, p0, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->e:Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;

    return-object v0
.end method

.method public m()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->r:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public n()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->j:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public o()Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;
    .locals 1

    iget-object v0, p0, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->k:Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;

    return-object v0
.end method

.method public p()Landroid/content/res/Resources;
    .locals 1

    iget-object v0, p0, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->a:Landroid/content/res/Resources;

    return-object v0
.end method

.method public q()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->f:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public r()Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;
    .locals 1

    iget-object v0, p0, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->g:Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;

    return-object v0
.end method

.method public s()Lcom/facebook/drawee/generic/a;
    .locals 1

    iget-object v0, p0, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->s:Lcom/facebook/drawee/generic/a;

    return-object v0
.end method

.method public v(Landroid/graphics/ColorFilter;)Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;
    .locals 0

    iput-object p1, p0, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->o:Landroid/graphics/ColorFilter;

    return-object p0
.end method

.method public w(Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;)Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->l:Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->m:Landroid/graphics/Matrix;

    .line 5
    .line 6
    return-object p0
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
.end method

.method public x(Landroid/graphics/drawable/Drawable;)Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;
    .locals 0

    iput-object p1, p0, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->p:Landroid/graphics/drawable/Drawable;

    return-object p0
.end method

.method public y(F)Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;
    .locals 0

    iput p1, p0, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->c:F

    return-object p0
.end method

.method public z(I)Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;
    .locals 0

    iput p1, p0, Lcom/facebook/drawee/generic/GenericDraweeHierarchyBuilder;->b:I

    return-object p0
.end method
