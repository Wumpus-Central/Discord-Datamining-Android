.class public Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/imagepipeline/core/ImagePipelineConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private A:I

.field private final B:Lcom/facebook/imagepipeline/core/a$b;

.field private C:Z

.field private D:Ls5/a;

.field private E:Lp5/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp5/s<",
            "Lcom/facebook/cache/common/CacheKey;",
            "Lv5/c;",
            ">;"
        }
    .end annotation
.end field

.field private F:Lp5/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp5/s<",
            "Lcom/facebook/cache/common/CacheKey;",
            "Lz3/g;",
            ">;"
        }
    .end annotation
.end field

.field private G:Lu3/f;

.field private H:Lp5/a;

.field private a:Landroid/graphics/Bitmap$Config;

.field private b:Lcom/facebook/common/internal/Supplier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/common/internal/Supplier<",
            "Lcom/facebook/imagepipeline/cache/MemoryCacheParams;",
            ">;"
        }
    .end annotation
.end field

.field private c:Lp5/i$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp5/i$b<",
            "Lcom/facebook/cache/common/CacheKey;",
            ">;"
        }
    .end annotation
.end field

.field private d:Lp5/s$a;

.field private e:Lp5/f;

.field private final f:Landroid/content/Context;

.field private g:Z

.field private h:Lcom/facebook/common/internal/Supplier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/common/internal/Supplier<",
            "Lcom/facebook/imagepipeline/cache/MemoryCacheParams;",
            ">;"
        }
    .end annotation
.end field

.field private i:Lr5/e;

.field private j:Lp5/o;

.field private k:Lt5/c;

.field private l:Lb6/d;

.field private m:Ljava/lang/Integer;

.field private n:Lcom/facebook/common/internal/Supplier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/common/internal/Supplier<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private o:Lcom/facebook/cache/disk/DiskCacheConfig;

.field private p:Lz3/c;

.field private q:Ljava/lang/Integer;

.field private r:Lcom/facebook/imagepipeline/producers/NetworkFetcher;

.field private s:Lcom/facebook/imagepipeline/bitmaps/PlatformBitmapFactory;

.field private t:Ly5/y;

.field private u:Lt5/e;

.field private v:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/facebook/imagepipeline/listener/RequestListener;",
            ">;"
        }
    .end annotation
.end field

.field private w:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lx5/d;",
            ">;"
        }
    .end annotation
.end field

.field private x:Z

.field private y:Lcom/facebook/cache/disk/DiskCacheConfig;

.field private z:Lr5/f;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->g:Z

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->m:Ljava/lang/Integer;

    .line 5
    iput-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->q:Ljava/lang/Integer;

    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->x:Z

    const/4 v1, -0x1

    .line 7
    iput v1, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->A:I

    .line 8
    new-instance v1, Lcom/facebook/imagepipeline/core/a$b;

    invoke-direct {v1, p0}, Lcom/facebook/imagepipeline/core/a$b;-><init>(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)V

    iput-object v1, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->B:Lcom/facebook/imagepipeline/core/a$b;

    .line 9
    iput-boolean v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->C:Z

    .line 10
    new-instance v0, Ls5/b;

    invoke-direct {v0}, Ls5/b;-><init>()V

    iput-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->D:Ls5/a;

    .line 11
    invoke-static {p1}, Lw3/j;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    iput-object p1, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->f:Landroid/content/Context;

    return-void
.end method

.method synthetic constructor <init>(Landroid/content/Context;Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic A(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Lp5/s;
    .locals 0

    iget-object p0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->F:Lp5/s;

    return-object p0
.end method

.method static synthetic B(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Lu3/f;
    .locals 0

    iget-object p0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->G:Lu3/f;

    return-object p0
.end method

.method static synthetic C(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Lb6/d;
    .locals 0

    iget-object p0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->l:Lb6/d;

    return-object p0
.end method

.method static synthetic D(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Ljava/lang/Integer;
    .locals 0

    iget-object p0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->q:Ljava/lang/Integer;

    return-object p0
.end method

.method static synthetic E(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Lp5/s$a;
    .locals 0

    iget-object p0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->d:Lp5/s$a;

    return-object p0
.end method

.method static synthetic F(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Lp5/i$b;
    .locals 0

    iget-object p0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->c:Lp5/i$b;

    return-object p0
.end method

.method static synthetic G(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Landroid/graphics/Bitmap$Config;
    .locals 0

    iget-object p0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->a:Landroid/graphics/Bitmap$Config;

    return-object p0
.end method

.method static synthetic H(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Lp5/f;
    .locals 0

    iget-object p0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->e:Lp5/f;

    return-object p0
.end method

.method static synthetic I(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Lr5/f;
    .locals 0

    iget-object p0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->z:Lr5/f;

    return-object p0
.end method

.method static synthetic J(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->g:Z

    return p0
.end method

.method static synthetic a(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Lcom/facebook/imagepipeline/core/a$b;
    .locals 0

    iget-object p0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->B:Lcom/facebook/imagepipeline/core/a$b;

    return-object p0
.end method

.method static synthetic b(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Lcom/facebook/common/internal/Supplier;
    .locals 0

    iget-object p0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->h:Lcom/facebook/common/internal/Supplier;

    return-object p0
.end method

.method static synthetic c(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Lp5/o;
    .locals 0

    iget-object p0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->j:Lp5/o;

    return-object p0
.end method

.method static synthetic d(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Lt5/c;
    .locals 0

    iget-object p0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->k:Lt5/c;

    return-object p0
.end method

.method static synthetic e(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Ljava/lang/Integer;
    .locals 0

    iget-object p0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->m:Ljava/lang/Integer;

    return-object p0
.end method

.method static synthetic f(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Lcom/facebook/common/internal/Supplier;
    .locals 0

    iget-object p0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->n:Lcom/facebook/common/internal/Supplier;

    return-object p0
.end method

.method static synthetic g(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Lcom/facebook/cache/disk/DiskCacheConfig;
    .locals 0

    iget-object p0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->o:Lcom/facebook/cache/disk/DiskCacheConfig;

    return-object p0
.end method

.method static synthetic h(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Lz3/c;
    .locals 0

    iget-object p0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->p:Lz3/c;

    return-object p0
.end method

.method static synthetic i(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)I
    .locals 0

    iget p0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->A:I

    return p0
.end method

.method static synthetic j(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Lcom/facebook/imagepipeline/producers/NetworkFetcher;
    .locals 0

    iget-object p0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->r:Lcom/facebook/imagepipeline/producers/NetworkFetcher;

    return-object p0
.end method

.method static synthetic k(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Lcom/facebook/imagepipeline/bitmaps/PlatformBitmapFactory;
    .locals 0

    iget-object p0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->s:Lcom/facebook/imagepipeline/bitmaps/PlatformBitmapFactory;

    return-object p0
.end method

.method static synthetic l(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Lcom/facebook/common/internal/Supplier;
    .locals 0

    iget-object p0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->b:Lcom/facebook/common/internal/Supplier;

    return-object p0
.end method

.method static synthetic m(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Ly5/y;
    .locals 0

    iget-object p0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->t:Ly5/y;

    return-object p0
.end method

.method static synthetic n(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Lt5/e;
    .locals 0

    iget-object p0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->u:Lt5/e;

    return-object p0
.end method

.method static synthetic o(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->v:Ljava/util/Set;

    return-object p0
.end method

.method static synthetic p(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->w:Ljava/util/Set;

    return-object p0
.end method

.method static synthetic q(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->x:Z

    return p0
.end method

.method static synthetic r(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Lcom/facebook/cache/disk/DiskCacheConfig;
    .locals 0

    iget-object p0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->y:Lcom/facebook/cache/disk/DiskCacheConfig;

    return-object p0
.end method

.method static synthetic s(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Lt5/d;
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, 0x0

    return-object p0
.end method

.method static synthetic t(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Lr5/e;
    .locals 0

    iget-object p0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->i:Lr5/e;

    return-object p0
.end method

.method static synthetic u(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->C:Z

    return p0
.end method

.method static synthetic v(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Ls3/a;
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, 0x0

    return-object p0
.end method

.method static synthetic w(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->f:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic x(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Ls5/a;
    .locals 0

    iget-object p0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->D:Ls5/a;

    return-object p0
.end method

.method static synthetic y(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Lp5/s;
    .locals 0

    iget-object p0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->E:Lp5/s;

    return-object p0
.end method

.method static synthetic z(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Lp5/a;
    .locals 0

    iget-object p0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->H:Lp5/a;

    return-object p0
.end method


# virtual methods
.method public K()Lcom/facebook/imagepipeline/core/ImagePipelineConfig;
    .locals 2

    new-instance v0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;-><init>(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;)V

    return-object v0
.end method

.method public L()Lcom/facebook/imagepipeline/core/a$b;
    .locals 1

    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->B:Lcom/facebook/imagepipeline/core/a$b;

    return-object v0
.end method

.method public M(Lcom/facebook/common/internal/Supplier;)Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/common/internal/Supplier<",
            "Lcom/facebook/imagepipeline/cache/MemoryCacheParams;",
            ">;)",
            "Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;"
        }
    .end annotation

    invoke-static {p1}, Lw3/j;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/facebook/common/internal/Supplier;

    iput-object p1, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->b:Lcom/facebook/common/internal/Supplier;

    return-object p0
.end method

.method public N(Z)Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;
    .locals 0

    iput-boolean p1, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->g:Z

    return-object p0
.end method

.method public O(Lcom/facebook/cache/disk/DiskCacheConfig;)Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;
    .locals 0

    iput-object p1, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->o:Lcom/facebook/cache/disk/DiskCacheConfig;

    return-object p0
.end method

.method public P(Lcom/facebook/imagepipeline/producers/NetworkFetcher;)Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;
    .locals 0

    iput-object p1, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->r:Lcom/facebook/imagepipeline/producers/NetworkFetcher;

    return-object p0
.end method

.method public Q(Ly5/y;)Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;
    .locals 0

    iput-object p1, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->t:Ly5/y;

    return-object p0
.end method

.method public R(Ljava/util/Set;)Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/facebook/imagepipeline/listener/RequestListener;",
            ">;)",
            "Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;"
        }
    .end annotation

    iput-object p1, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->v:Ljava/util/Set;

    return-object p0
.end method

.method public S(Lcom/facebook/cache/disk/DiskCacheConfig;)Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;
    .locals 0

    iput-object p1, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->y:Lcom/facebook/cache/disk/DiskCacheConfig;

    return-object p0
.end method
