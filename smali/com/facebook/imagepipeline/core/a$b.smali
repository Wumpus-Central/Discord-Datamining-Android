.class public Lcom/facebook/imagepipeline/core/a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/imagepipeline/core/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private A:I

.field private B:Z

.field private C:Z

.field private final a:Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;

.field private b:Z

.field private c:Z

.field private d:Le4/b;

.field private e:Z

.field private f:Z

.field private g:I

.field private h:I

.field public i:Z

.field private j:I

.field private k:Z

.field private l:Z

.field private m:Lcom/facebook/imagepipeline/core/a$d;

.field public n:Lcom/facebook/common/internal/Supplier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/common/internal/Supplier<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public o:Z

.field public p:Z

.field public q:I

.field public r:Lcom/facebook/common/internal/Supplier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/common/internal/Supplier<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public s:Z

.field public t:J

.field private u:Z

.field public v:Z

.field public w:Z

.field public x:Z

.field private y:Z

.field private z:Z


# direct methods
.method public constructor <init>(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/facebook/imagepipeline/core/a$b;->b:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lcom/facebook/imagepipeline/core/a$b;->c:Z

    .line 8
    .line 9
    iput-boolean v0, p0, Lcom/facebook/imagepipeline/core/a$b;->e:Z

    .line 10
    .line 11
    iput-boolean v0, p0, Lcom/facebook/imagepipeline/core/a$b;->f:Z

    .line 12
    .line 13
    iput v0, p0, Lcom/facebook/imagepipeline/core/a$b;->g:I

    .line 14
    .line 15
    iput v0, p0, Lcom/facebook/imagepipeline/core/a$b;->h:I

    .line 16
    .line 17
    iput-boolean v0, p0, Lcom/facebook/imagepipeline/core/a$b;->i:Z

    .line 18
    .line 19
    const/16 v1, 0x800

    .line 20
    .line 21
    iput v1, p0, Lcom/facebook/imagepipeline/core/a$b;->j:I

    .line 22
    .line 23
    iput-boolean v0, p0, Lcom/facebook/imagepipeline/core/a$b;->k:Z

    .line 24
    .line 25
    iput-boolean v0, p0, Lcom/facebook/imagepipeline/core/a$b;->l:Z

    .line 26
    .line 27
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 28
    .line 29
    invoke-static {v1}, Lv3/m;->a(Ljava/lang/Object;)Lcom/facebook/common/internal/Supplier;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    iput-object v1, p0, Lcom/facebook/imagepipeline/core/a$b;->r:Lcom/facebook/common/internal/Supplier;

    .line 34
    .line 35
    const-wide/16 v1, 0x0

    .line 36
    .line 37
    iput-wide v1, p0, Lcom/facebook/imagepipeline/core/a$b;->t:J

    .line 38
    .line 39
    const/4 v1, 0x1

    .line 40
    iput-boolean v1, p0, Lcom/facebook/imagepipeline/core/a$b;->w:Z

    .line 41
    .line 42
    iput-boolean v1, p0, Lcom/facebook/imagepipeline/core/a$b;->x:Z

    .line 43
    .line 44
    iput-boolean v0, p0, Lcom/facebook/imagepipeline/core/a$b;->y:Z

    .line 45
    .line 46
    iput-boolean v0, p0, Lcom/facebook/imagepipeline/core/a$b;->z:Z

    .line 47
    .line 48
    const/16 v1, 0x14

    .line 49
    .line 50
    iput v1, p0, Lcom/facebook/imagepipeline/core/a$b;->A:I

    .line 51
    .line 52
    iput-boolean v0, p0, Lcom/facebook/imagepipeline/core/a$b;->B:Z

    .line 53
    .line 54
    iput-boolean v0, p0, Lcom/facebook/imagepipeline/core/a$b;->C:Z

    .line 55
    .line 56
    iput-object p1, p0, Lcom/facebook/imagepipeline/core/a$b;->a:Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;

    .line 57
    .line 58
    return-void
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
.end method

.method static synthetic a(Lcom/facebook/imagepipeline/core/a$b;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/facebook/imagepipeline/core/a$b;->b:Z

    return p0
.end method

.method static synthetic b(Lcom/facebook/imagepipeline/core/a$b;)Le4/b$a;
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, 0x0

    return-object p0
.end method

.method static synthetic c(Lcom/facebook/imagepipeline/core/a$b;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/facebook/imagepipeline/core/a$b;->l:Z

    return p0
.end method

.method static synthetic d(Lcom/facebook/imagepipeline/core/a$b;)Lcom/facebook/imagepipeline/core/a$d;
    .locals 0

    iget-object p0, p0, Lcom/facebook/imagepipeline/core/a$b;->m:Lcom/facebook/imagepipeline/core/a$d;

    return-object p0
.end method

.method static synthetic e(Lcom/facebook/imagepipeline/core/a$b;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/facebook/imagepipeline/core/a$b;->u:Z

    return p0
.end method

.method static synthetic f(Lcom/facebook/imagepipeline/core/a$b;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/facebook/imagepipeline/core/a$b;->y:Z

    return p0
.end method

.method static synthetic g(Lcom/facebook/imagepipeline/core/a$b;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/facebook/imagepipeline/core/a$b;->z:Z

    return p0
.end method

.method static synthetic h(Lcom/facebook/imagepipeline/core/a$b;)I
    .locals 0

    iget p0, p0, Lcom/facebook/imagepipeline/core/a$b;->A:I

    return p0
.end method

.method static synthetic i(Lcom/facebook/imagepipeline/core/a$b;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/facebook/imagepipeline/core/a$b;->B:Z

    return p0
.end method

.method static synthetic j(Lcom/facebook/imagepipeline/core/a$b;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/facebook/imagepipeline/core/a$b;->C:Z

    return p0
.end method

.method static synthetic k(Lcom/facebook/imagepipeline/core/a$b;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/facebook/imagepipeline/core/a$b;->c:Z

    return p0
.end method

.method static synthetic l(Lcom/facebook/imagepipeline/core/a$b;)Le4/b;
    .locals 0

    iget-object p0, p0, Lcom/facebook/imagepipeline/core/a$b;->d:Le4/b;

    return-object p0
.end method

.method static synthetic m(Lcom/facebook/imagepipeline/core/a$b;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/facebook/imagepipeline/core/a$b;->e:Z

    return p0
.end method

.method static synthetic n(Lcom/facebook/imagepipeline/core/a$b;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/facebook/imagepipeline/core/a$b;->f:Z

    return p0
.end method

.method static synthetic o(Lcom/facebook/imagepipeline/core/a$b;)I
    .locals 0

    iget p0, p0, Lcom/facebook/imagepipeline/core/a$b;->g:I

    return p0
.end method

.method static synthetic p(Lcom/facebook/imagepipeline/core/a$b;)I
    .locals 0

    iget p0, p0, Lcom/facebook/imagepipeline/core/a$b;->h:I

    return p0
.end method

.method static synthetic q(Lcom/facebook/imagepipeline/core/a$b;)I
    .locals 0

    iget p0, p0, Lcom/facebook/imagepipeline/core/a$b;->j:I

    return p0
.end method

.method static synthetic r(Lcom/facebook/imagepipeline/core/a$b;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/facebook/imagepipeline/core/a$b;->k:Z

    return p0
.end method


# virtual methods
.method public s()Lcom/facebook/imagepipeline/core/a;
    .locals 2

    new-instance v0, Lcom/facebook/imagepipeline/core/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/imagepipeline/core/a;-><init>(Lcom/facebook/imagepipeline/core/a$b;Lcom/facebook/imagepipeline/core/a$a;)V

    return-object v0
.end method

.method public t(Z)Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/facebook/imagepipeline/core/a$b;->p:Z

    .line 2
    .line 3
    iget-object p1, p0, Lcom/facebook/imagepipeline/core/a$b;->a:Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;

    .line 4
    .line 5
    return-object p1
    .line 6
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
.end method
