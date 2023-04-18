.class public Lj5/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lj5/c;

.field private final b:I

.field private c:Lcom/facebook/common/references/CloseableReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/common/references/CloseableReference<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/facebook/common/references/CloseableReference<",
            "Landroid/graphics/Bitmap;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lj5/c;)V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    invoke-static {p1}, Lv3/j;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj5/c;

    iput-object p1, p0, Lj5/e;->a:Lj5/c;

    const/4 p1, 0x0

    .line 9
    iput p1, p0, Lj5/e;->b:I

    return-void
.end method

.method constructor <init>(Lj5/f;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-virtual {p1}, Lj5/f;->e()Lj5/c;

    move-result-object v0

    invoke-static {v0}, Lv3/j;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj5/c;

    iput-object v0, p0, Lj5/e;->a:Lj5/c;

    .line 3
    invoke-virtual {p1}, Lj5/f;->d()I

    move-result v0

    iput v0, p0, Lj5/e;->b:I

    .line 4
    invoke-virtual {p1}, Lj5/f;->f()Lcom/facebook/common/references/CloseableReference;

    move-result-object v0

    iput-object v0, p0, Lj5/e;->c:Lcom/facebook/common/references/CloseableReference;

    .line 5
    invoke-virtual {p1}, Lj5/f;->c()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lj5/e;->d:Ljava/util/List;

    .line 6
    invoke-virtual {p1}, Lj5/f;->b()Lb6/a;

    return-void
.end method

.method public static b(Lj5/c;)Lj5/e;
    .locals 1

    new-instance v0, Lj5/e;

    invoke-direct {v0, p0}, Lj5/e;-><init>(Lj5/c;)V

    return-object v0
.end method

.method public static e(Lj5/c;)Lj5/f;
    .locals 1

    new-instance v0, Lj5/f;

    invoke-direct {v0, p0}, Lj5/f;-><init>(Lj5/c;)V

    return-object v0
.end method


# virtual methods
.method public declared-synchronized a()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lj5/e;->c:Lcom/facebook/common/references/CloseableReference;

    .line 3
    .line 4
    invoke-static {v0}, Lcom/facebook/common/references/CloseableReference;->x(Lcom/facebook/common/references/CloseableReference;)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, Lj5/e;->c:Lcom/facebook/common/references/CloseableReference;

    .line 9
    .line 10
    iget-object v1, p0, Lj5/e;->d:Ljava/util/List;

    .line 11
    .line 12
    invoke-static {v1}, Lcom/facebook/common/references/CloseableReference;->y(Ljava/lang/Iterable;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lj5/e;->d:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    monitor-exit p0

    .line 18
    return-void

    .line 19
    :catchall_0
    move-exception v0

    .line 20
    monitor-exit p0

    .line 21
    throw v0
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

.method public c()Lb6/a;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public d()Lj5/c;
    .locals 1

    iget-object v0, p0, Lj5/e;->a:Lj5/c;

    return-object v0
.end method
