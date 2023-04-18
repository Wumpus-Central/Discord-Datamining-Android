.class public Lj5/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lj5/c;

.field private b:Lcom/facebook/common/references/CloseableReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/common/references/CloseableReference<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/facebook/common/references/CloseableReference<",
            "Landroid/graphics/Bitmap;",
            ">;>;"
        }
    .end annotation
.end field

.field private d:I


# direct methods
.method constructor <init>(Lj5/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lj5/f;->a:Lj5/c;

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


# virtual methods
.method public a()Lj5/e;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    new-instance v1, Lj5/e;

    .line 3
    .line 4
    invoke-direct {v1, p0}, Lj5/e;-><init>(Lj5/f;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    .line 7
    iget-object v2, p0, Lj5/f;->b:Lcom/facebook/common/references/CloseableReference;

    .line 8
    .line 9
    invoke-static {v2}, Lcom/facebook/common/references/CloseableReference;->x(Lcom/facebook/common/references/CloseableReference;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lj5/f;->b:Lcom/facebook/common/references/CloseableReference;

    .line 13
    .line 14
    iget-object v2, p0, Lj5/f;->c:Ljava/util/List;

    .line 15
    .line 16
    invoke-static {v2}, Lcom/facebook/common/references/CloseableReference;->y(Ljava/lang/Iterable;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lj5/f;->c:Ljava/util/List;

    .line 20
    .line 21
    return-object v1

    .line 22
    :catchall_0
    move-exception v1

    .line 23
    iget-object v2, p0, Lj5/f;->b:Lcom/facebook/common/references/CloseableReference;

    .line 24
    .line 25
    invoke-static {v2}, Lcom/facebook/common/references/CloseableReference;->x(Lcom/facebook/common/references/CloseableReference;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lj5/f;->b:Lcom/facebook/common/references/CloseableReference;

    .line 29
    .line 30
    iget-object v2, p0, Lj5/f;->c:Ljava/util/List;

    .line 31
    .line 32
    invoke-static {v2}, Lcom/facebook/common/references/CloseableReference;->y(Ljava/lang/Iterable;)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Lj5/f;->c:Ljava/util/List;

    .line 36
    .line 37
    throw v1
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

.method public b()Lb6/a;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/facebook/common/references/CloseableReference<",
            "Landroid/graphics/Bitmap;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lj5/f;->c:Ljava/util/List;

    invoke-static {v0}, Lcom/facebook/common/references/CloseableReference;->w(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lj5/f;->d:I

    return v0
.end method

.method public e()Lj5/c;
    .locals 1

    iget-object v0, p0, Lj5/f;->a:Lj5/c;

    return-object v0
.end method

.method public f()Lcom/facebook/common/references/CloseableReference;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/common/references/CloseableReference<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lj5/f;->b:Lcom/facebook/common/references/CloseableReference;

    invoke-static {v0}, Lcom/facebook/common/references/CloseableReference;->v(Lcom/facebook/common/references/CloseableReference;)Lcom/facebook/common/references/CloseableReference;

    move-result-object v0

    return-object v0
.end method

.method public g(Lb6/a;)Lj5/f;
    .locals 0

    return-object p0
.end method

.method public h(Ljava/util/List;)Lj5/f;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/facebook/common/references/CloseableReference<",
            "Landroid/graphics/Bitmap;",
            ">;>;)",
            "Lj5/f;"
        }
    .end annotation

    invoke-static {p1}, Lcom/facebook/common/references/CloseableReference;->w(Ljava/util/Collection;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lj5/f;->c:Ljava/util/List;

    return-object p0
.end method

.method public i(I)Lj5/f;
    .locals 0

    iput p1, p0, Lj5/f;->d:I

    return-object p0
.end method

.method public j(Lcom/facebook/common/references/CloseableReference;)Lj5/f;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/common/references/CloseableReference<",
            "Landroid/graphics/Bitmap;",
            ">;)",
            "Lj5/f;"
        }
    .end annotation

    invoke-static {p1}, Lcom/facebook/common/references/CloseableReference;->v(Lcom/facebook/common/references/CloseableReference;)Lcom/facebook/common/references/CloseableReference;

    move-result-object p1

    iput-object p1, p0, Lj5/f;->b:Lcom/facebook/common/references/CloseableReference;

    return-object p0
.end method
