.class public Lcom/facebook/imagepipeline/core/ImagePipelineConfig;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq5/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;,
        Lcom/facebook/imagepipeline/core/ImagePipelineConfig$b;
    }
.end annotation


# static fields
.field private static I:Lcom/facebook/imagepipeline/core/ImagePipelineConfig$b;


# instance fields
.field private final A:Lcom/facebook/cache/disk/DiskCacheConfig;

.field private final B:Lcom/facebook/imagepipeline/core/a;

.field private final C:Z

.field private final D:Lr5/a;

.field private final E:Lo5/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo5/s<",
            "Lcom/facebook/cache/common/CacheKey;",
            "Lu5/c;",
            ">;"
        }
    .end annotation
.end field

.field private final F:Lo5/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo5/s<",
            "Lcom/facebook/cache/common/CacheKey;",
            "Ly3/g;",
            ">;"
        }
    .end annotation
.end field

.field private final G:Lt3/f;

.field private final H:Lo5/a;

.field private final a:Landroid/graphics/Bitmap$Config;

.field private final b:Lcom/facebook/common/internal/Supplier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/common/internal/Supplier<",
            "Lcom/facebook/imagepipeline/cache/MemoryCacheParams;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lo5/s$a;

.field private final d:Lo5/i$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo5/i$b<",
            "Lcom/facebook/cache/common/CacheKey;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lo5/f;

.field private final f:Landroid/content/Context;

.field private final g:Z

.field private final h:Lq5/f;

.field private final i:Lcom/facebook/common/internal/Supplier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/common/internal/Supplier<",
            "Lcom/facebook/imagepipeline/cache/MemoryCacheParams;",
            ">;"
        }
    .end annotation
.end field

.field private final j:Lq5/e;

.field private final k:Lo5/o;

.field private final l:Ls5/c;

.field private final m:La6/d;

.field private final n:Ljava/lang/Integer;

.field private final o:Lcom/facebook/common/internal/Supplier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/common/internal/Supplier<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final p:Lcom/facebook/cache/disk/DiskCacheConfig;

.field private final q:Ly3/c;

.field private final r:I

.field private final s:Lcom/facebook/imagepipeline/producers/NetworkFetcher;

.field private final t:I

.field private final u:Lcom/facebook/imagepipeline/bitmaps/PlatformBitmapFactory;

.field private final v:Lx5/y;

.field private final w:Ls5/e;

.field private final x:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/facebook/imagepipeline/listener/RequestListener;",
            ">;"
        }
    .end annotation
.end field

.field private final y:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lw5/d;",
            ">;"
        }
    .end annotation
.end field

.field private final z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$b;-><init>(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;)V

    sput-object v0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->I:Lcom/facebook/imagepipeline/core/ImagePipelineConfig$b;

    return-void
.end method

.method private constructor <init>(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)V
    .locals 4

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {}, Lz5/b;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "ImagePipelineConfig()"

    .line 4
    invoke-static {v0}, Lz5/b;->a(Ljava/lang/String;)V

    .line 5
    :cond_0
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->a(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Lcom/facebook/imagepipeline/core/a$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/imagepipeline/core/a$b;->s()Lcom/facebook/imagepipeline/core/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->B:Lcom/facebook/imagepipeline/core/a;

    .line 6
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->l(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Lcom/facebook/common/internal/Supplier;

    move-result-object v1

    if-nez v1, :cond_1

    new-instance v1, Lo5/j;

    .line 7
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->w(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Landroid/content/Context;

    move-result-object v2

    const-string v3, "activity"

    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    .line 8
    invoke-static {v2}, Lv3/j;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/app/ActivityManager;

    invoke-direct {v1, v2}, Lo5/j;-><init>(Landroid/app/ActivityManager;)V

    goto :goto_0

    .line 9
    :cond_1
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->l(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Lcom/facebook/common/internal/Supplier;

    move-result-object v1

    :goto_0
    iput-object v1, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->b:Lcom/facebook/common/internal/Supplier;

    .line 10
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->E(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Lo5/s$a;

    move-result-object v1

    if-nez v1, :cond_2

    new-instance v1, Lo5/c;

    invoke-direct {v1}, Lo5/c;-><init>()V

    goto :goto_1

    .line 11
    :cond_2
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->E(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Lo5/s$a;

    move-result-object v1

    :goto_1
    iput-object v1, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->c:Lo5/s$a;

    .line 12
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->F(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Lo5/i$b;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->d:Lo5/i$b;

    .line 13
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->G(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Landroid/graphics/Bitmap$Config;

    move-result-object v1

    if-nez v1, :cond_3

    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    goto :goto_2

    :cond_3
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->G(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Landroid/graphics/Bitmap$Config;

    move-result-object v1

    :goto_2
    iput-object v1, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->a:Landroid/graphics/Bitmap$Config;

    .line 14
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->H(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Lo5/f;

    move-result-object v1

    if-nez v1, :cond_4

    .line 15
    invoke-static {}, Lo5/k;->f()Lo5/k;

    move-result-object v1

    goto :goto_3

    .line 16
    :cond_4
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->H(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Lo5/f;

    move-result-object v1

    :goto_3
    iput-object v1, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->e:Lo5/f;

    .line 17
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->w(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lv3/j;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    iput-object v1, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->f:Landroid/content/Context;

    .line 18
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->I(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Lq5/f;

    move-result-object v1

    if-nez v1, :cond_5

    new-instance v1, Lq5/b;

    new-instance v2, Lq5/d;

    invoke-direct {v2}, Lq5/d;-><init>()V

    invoke-direct {v1, v2}, Lq5/b;-><init>(Lq5/c;)V

    goto :goto_4

    .line 19
    :cond_5
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->I(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Lq5/f;

    move-result-object v1

    :goto_4
    iput-object v1, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->h:Lq5/f;

    .line 20
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->J(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->g:Z

    .line 21
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->b(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Lcom/facebook/common/internal/Supplier;

    move-result-object v1

    if-nez v1, :cond_6

    new-instance v1, Lo5/l;

    invoke-direct {v1}, Lo5/l;-><init>()V

    goto :goto_5

    .line 22
    :cond_6
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->b(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Lcom/facebook/common/internal/Supplier;

    move-result-object v1

    :goto_5
    iput-object v1, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->i:Lcom/facebook/common/internal/Supplier;

    .line 23
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->c(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Lo5/o;

    move-result-object v1

    if-nez v1, :cond_7

    .line 24
    invoke-static {}, Lo5/v;->o()Lo5/v;

    move-result-object v1

    goto :goto_6

    .line 25
    :cond_7
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->c(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Lo5/o;

    move-result-object v1

    :goto_6
    iput-object v1, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->k:Lo5/o;

    .line 26
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->d(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Ls5/c;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->l:Ls5/c;

    .line 27
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->H(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)La6/d;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->m:La6/d;

    .line 28
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->e(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->n:Ljava/lang/Integer;

    .line 29
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->f(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Lcom/facebook/common/internal/Supplier;

    move-result-object v1

    if-nez v1, :cond_8

    new-instance v1, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;

    invoke-direct {v1, p0}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;-><init>(Lcom/facebook/imagepipeline/core/ImagePipelineConfig;)V

    goto :goto_7

    .line 30
    :cond_8
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->f(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Lcom/facebook/common/internal/Supplier;

    move-result-object v1

    :goto_7
    iput-object v1, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->o:Lcom/facebook/common/internal/Supplier;

    .line 31
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->g(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Lcom/facebook/cache/disk/DiskCacheConfig;

    move-result-object v1

    if-nez v1, :cond_9

    .line 32
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->w(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->G(Landroid/content/Context;)Lcom/facebook/cache/disk/DiskCacheConfig;

    move-result-object v1

    goto :goto_8

    .line 33
    :cond_9
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->g(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Lcom/facebook/cache/disk/DiskCacheConfig;

    move-result-object v1

    :goto_8
    iput-object v1, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->p:Lcom/facebook/cache/disk/DiskCacheConfig;

    .line 34
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->h(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Ly3/c;

    move-result-object v2

    if-nez v2, :cond_a

    .line 35
    invoke-static {}, Ly3/d;->b()Ly3/d;

    move-result-object v2

    goto :goto_9

    .line 36
    :cond_a
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->h(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Ly3/c;

    move-result-object v2

    :goto_9
    iput-object v2, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->q:Ly3/c;

    .line 37
    invoke-static {p1, v0}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->I(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;Lcom/facebook/imagepipeline/core/a;)I

    move-result v2

    iput v2, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->r:I

    .line 38
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->i(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)I

    move-result v2

    if-gez v2, :cond_b

    const/16 v2, 0x7530

    goto :goto_a

    .line 39
    :cond_b
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->i(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)I

    move-result v2

    :goto_a
    iput v2, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->t:I

    .line 40
    invoke-static {}, Lz5/b;->d()Z

    move-result v3

    if-eqz v3, :cond_c

    const-string v3, "ImagePipelineConfig->mNetworkFetcher"

    .line 41
    invoke-static {v3}, Lz5/b;->a(Ljava/lang/String;)V

    .line 42
    :cond_c
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->j(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Lcom/facebook/imagepipeline/producers/NetworkFetcher;

    move-result-object v3

    if-nez v3, :cond_d

    new-instance v3, Lcom/facebook/imagepipeline/producers/v;

    invoke-direct {v3, v2}, Lcom/facebook/imagepipeline/producers/v;-><init>(I)V

    goto :goto_b

    .line 43
    :cond_d
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->j(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Lcom/facebook/imagepipeline/producers/NetworkFetcher;

    move-result-object v3

    :goto_b
    iput-object v3, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->s:Lcom/facebook/imagepipeline/producers/NetworkFetcher;

    .line 44
    invoke-static {}, Lz5/b;->d()Z

    move-result v2

    if-eqz v2, :cond_e

    .line 45
    invoke-static {}, Lz5/b;->b()V

    .line 46
    :cond_e
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->k(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Lcom/facebook/imagepipeline/bitmaps/PlatformBitmapFactory;

    move-result-object v2

    iput-object v2, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->u:Lcom/facebook/imagepipeline/bitmaps/PlatformBitmapFactory;

    .line 47
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->m(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Lx5/y;

    move-result-object v2

    if-nez v2, :cond_f

    new-instance v2, Lx5/y;

    .line 48
    invoke-static {}, Lx5/x;->n()Lx5/x$b;

    move-result-object v3

    invoke-virtual {v3}, Lx5/x$b;->m()Lx5/x;

    move-result-object v3

    invoke-direct {v2, v3}, Lx5/y;-><init>(Lx5/x;)V

    goto :goto_c

    .line 49
    :cond_f
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->m(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Lx5/y;

    move-result-object v2

    :goto_c
    iput-object v2, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->v:Lx5/y;

    .line 50
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->n(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Ls5/e;

    move-result-object v3

    if-nez v3, :cond_10

    new-instance v3, Ls5/g;

    invoke-direct {v3}, Ls5/g;-><init>()V

    goto :goto_d

    .line 51
    :cond_10
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->n(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Ls5/e;

    move-result-object v3

    :goto_d
    iput-object v3, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->w:Ls5/e;

    .line 52
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->o(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Ljava/util/Set;

    move-result-object v3

    if-nez v3, :cond_11

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    goto :goto_e

    .line 53
    :cond_11
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->o(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Ljava/util/Set;

    move-result-object v3

    :goto_e
    iput-object v3, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->x:Ljava/util/Set;

    .line 54
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->p(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Ljava/util/Set;

    move-result-object v3

    if-nez v3, :cond_12

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    goto :goto_f

    .line 55
    :cond_12
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->p(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Ljava/util/Set;

    move-result-object v3

    :goto_f
    iput-object v3, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->y:Ljava/util/Set;

    .line 56
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->q(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Z

    move-result v3

    iput-boolean v3, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->z:Z

    .line 57
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->r(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Lcom/facebook/cache/disk/DiskCacheConfig;

    move-result-object v3

    if-nez v3, :cond_13

    goto :goto_10

    .line 58
    :cond_13
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->r(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Lcom/facebook/cache/disk/DiskCacheConfig;

    move-result-object v1

    :goto_10
    iput-object v1, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->A:Lcom/facebook/cache/disk/DiskCacheConfig;

    .line 59
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->s(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Ls5/d;

    .line 60
    invoke-virtual {v2}, Lx5/y;->e()I

    move-result v1

    .line 61
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->t(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Lq5/e;

    move-result-object v2

    if-nez v2, :cond_14

    new-instance v2, Lcom/facebook/imagepipeline/core/DefaultExecutorSupplier;

    invoke-direct {v2, v1}, Lcom/facebook/imagepipeline/core/DefaultExecutorSupplier;-><init>(I)V

    goto :goto_11

    .line 62
    :cond_14
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->t(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Lq5/e;

    move-result-object v2

    :goto_11
    iput-object v2, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->j:Lq5/e;

    .line 63
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->u(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->C:Z

    .line 64
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->v(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Lr3/a;

    .line 65
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->x(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Lr5/a;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->D:Lr5/a;

    .line 66
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->y(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Lo5/s;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->E:Lo5/s;

    .line 67
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->z(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Lo5/a;

    move-result-object v1

    if-nez v1, :cond_15

    new-instance v1, Lo5/g;

    invoke-direct {v1}, Lo5/g;-><init>()V

    goto :goto_12

    .line 68
    :cond_15
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->z(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Lo5/a;

    move-result-object v1

    :goto_12
    iput-object v1, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->H:Lo5/a;

    .line 69
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->A(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Lo5/s;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->F:Lo5/s;

    .line 70
    invoke-static {p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->B(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Lt3/f;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->G:Lt3/f;

    .line 71
    invoke-virtual {v0}, Lcom/facebook/imagepipeline/core/a;->m()Le4/b;

    move-result-object p1

    if-eqz p1, :cond_16

    .line 72
    new-instance v1, Ln5/c;

    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->t()Lx5/y;

    move-result-object v2

    invoke-direct {v1, v2}, Ln5/c;-><init>(Lx5/y;)V

    .line 73
    invoke-static {p1, v0, v1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->K(Le4/b;Lcom/facebook/imagepipeline/core/a;Le4/a;)V

    goto :goto_13

    .line 74
    :cond_16
    invoke-virtual {v0}, Lcom/facebook/imagepipeline/core/a;->y()Z

    move-result p1

    if-eqz p1, :cond_17

    sget-boolean p1, Le4/c;->a:Z

    if-eqz p1, :cond_17

    .line 75
    invoke-static {}, Le4/c;->i()Le4/b;

    move-result-object p1

    if-eqz p1, :cond_17

    .line 76
    new-instance v1, Ln5/c;

    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->t()Lx5/y;

    move-result-object v2

    invoke-direct {v1, v2}, Ln5/c;-><init>(Lx5/y;)V

    .line 77
    invoke-static {p1, v0, v1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->K(Le4/b;Lcom/facebook/imagepipeline/core/a;Le4/a;)V

    .line 78
    :cond_17
    :goto_13
    invoke-static {}, Lz5/b;->d()Z

    move-result p1

    if-eqz p1, :cond_18

    .line 79
    invoke-static {}, Lz5/b;->b()V

    :cond_18
    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;-><init>(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)V

    return-void
.end method

.method public static F()Lcom/facebook/imagepipeline/core/ImagePipelineConfig$b;
    .locals 1

    sget-object v0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->I:Lcom/facebook/imagepipeline/core/ImagePipelineConfig$b;

    return-object v0
.end method

.method private static G(Landroid/content/Context;)Lcom/facebook/cache/disk/DiskCacheConfig;
    .locals 1

    .line 1
    :try_start_0
    invoke-static {}, Lz5/b;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string v0, "DiskCacheConfig.getDefaultMainDiskCacheConfig"

    .line 8
    .line 9
    invoke-static {v0}, Lz5/b;->a(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-static {p0}, Lcom/facebook/cache/disk/DiskCacheConfig;->m(Landroid/content/Context;)Lcom/facebook/cache/disk/DiskCacheConfig$b;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Lcom/facebook/cache/disk/DiskCacheConfig$b;->n()Lcom/facebook/cache/disk/DiskCacheConfig;

    .line 17
    .line 18
    .line 19
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    invoke-static {}, Lz5/b;->d()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-static {}, Lz5/b;->b()V

    .line 27
    .line 28
    .line 29
    :cond_1
    return-object p0

    .line 30
    :catchall_0
    move-exception p0

    .line 31
    invoke-static {}, Lz5/b;->d()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    invoke-static {}, Lz5/b;->b()V

    .line 38
    .line 39
    .line 40
    :cond_2
    throw p0
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
.end method

.method private static H(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)La6/d;
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->C(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)La6/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-static {p0}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->e(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v0, "You can\'t define a custom ImageTranscoderFactory and provide an ImageTranscoderType"

    .line 17
    .line 18
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p0

    .line 22
    :cond_1
    :goto_0
    invoke-static {p0}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->C(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)La6/d;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    invoke-static {p0}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->C(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)La6/d;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :cond_2
    const/4 p0, 0x0

    .line 34
    return-object p0
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
.end method

.method private static I(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;Lcom/facebook/imagepipeline/core/a;)I
    .locals 4

    .line 1
    invoke-static {p0}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->D(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->D(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/core/a;->g()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    const-wide/16 v2, 0x2

    .line 21
    .line 22
    cmp-long p0, v0, v2

    .line 23
    .line 24
    if-nez p0, :cond_1

    .line 25
    .line 26
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 27
    .line 28
    const/16 v0, 0x1b

    .line 29
    .line 30
    if-lt p0, v0, :cond_1

    .line 31
    .line 32
    const/4 p0, 0x2

    .line 33
    return p0

    .line 34
    :cond_1
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/core/a;->g()J

    .line 35
    .line 36
    .line 37
    move-result-wide v0

    .line 38
    const-wide/16 v2, 0x1

    .line 39
    .line 40
    cmp-long p0, v0, v2

    .line 41
    .line 42
    if-nez p0, :cond_2

    .line 43
    .line 44
    const/4 p0, 0x1

    .line 45
    return p0

    .line 46
    :cond_2
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/core/a;->g()J

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    return p0
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
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
.end method

.method public static J(Landroid/content/Context;)Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;
    .locals 2

    new-instance v0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;-><init>(Landroid/content/Context;Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;)V

    return-object v0
.end method

.method private static K(Le4/b;Lcom/facebook/imagepipeline/core/a;Le4/a;)V
    .locals 0

    .line 1
    sput-object p0, Le4/c;->d:Le4/b;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/core/a;->n()Le4/b$a;

    .line 4
    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    invoke-interface {p0, p2}, Le4/b;->a(Le4/a;)V

    .line 9
    .line 10
    .line 11
    :cond_0
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
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
.end method


# virtual methods
.method public A()Lo5/o;
    .locals 1

    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->k:Lo5/o;

    return-object v0
.end method

.method public B()Ly3/c;
    .locals 1

    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->q:Ly3/c;

    return-object v0
.end method

.method public C()Lr3/a;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public D()Lcom/facebook/imagepipeline/core/a;
    .locals 1

    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->B:Lcom/facebook/imagepipeline/core/a;

    return-object v0
.end method

.method public E()Lq5/e;
    .locals 1

    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->j:Lq5/e;

    return-object v0
.end method

.method public a()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lw5/d;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->y:Ljava/util/Set;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public b()Lcom/facebook/common/internal/Supplier;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/common/internal/Supplier<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->o:Lcom/facebook/common/internal/Supplier;

    return-object v0
.end method

.method public c()Lcom/facebook/imagepipeline/producers/NetworkFetcher;
    .locals 1

    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->s:Lcom/facebook/imagepipeline/producers/NetworkFetcher;

    return-object v0
.end method

.method public d()Lo5/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo5/s<",
            "Lcom/facebook/cache/common/CacheKey;",
            "Ly3/g;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->F:Lo5/s;

    return-object v0
.end method

.method public e()Lcom/facebook/cache/disk/DiskCacheConfig;
    .locals 1

    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->p:Lcom/facebook/cache/disk/DiskCacheConfig;

    return-object v0
.end method

.method public f()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/facebook/imagepipeline/listener/RequestListener;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->x:Ljava/util/Set;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public g()Lo5/s$a;
    .locals 1

    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->c:Lo5/s$a;

    return-object v0
.end method

.method public getContext()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->f:Landroid/content/Context;

    return-object v0
.end method

.method public h()Ls5/e;
    .locals 1

    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->w:Ls5/e;

    return-object v0
.end method

.method public i()Lcom/facebook/cache/disk/DiskCacheConfig;
    .locals 1

    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->A:Lcom/facebook/cache/disk/DiskCacheConfig;

    return-object v0
.end method

.method public j()Lo5/i$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo5/i$b<",
            "Lcom/facebook/cache/common/CacheKey;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->d:Lo5/i$b;

    return-object v0
.end method

.method public k()Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->g:Z

    return v0
.end method

.method public l()Lt3/f;
    .locals 1

    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->G:Lt3/f;

    return-object v0
.end method

.method public m()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->n:Ljava/lang/Integer;

    return-object v0
.end method

.method public n()La6/d;
    .locals 1

    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->m:La6/d;

    return-object v0
.end method

.method public o()Ls5/d;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public p()Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->C:Z

    return v0
.end method

.method public q()Lcom/facebook/common/internal/Supplier;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/common/internal/Supplier<",
            "Lcom/facebook/imagepipeline/cache/MemoryCacheParams;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->b:Lcom/facebook/common/internal/Supplier;

    return-object v0
.end method

.method public r()Ls5/c;
    .locals 1

    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->l:Ls5/c;

    return-object v0
.end method

.method public s()Lcom/facebook/common/internal/Supplier;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/common/internal/Supplier<",
            "Lcom/facebook/imagepipeline/cache/MemoryCacheParams;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->i:Lcom/facebook/common/internal/Supplier;

    return-object v0
.end method

.method public t()Lx5/y;
    .locals 1

    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->v:Lx5/y;

    return-object v0
.end method

.method public u()I
    .locals 1

    iget v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->r:I

    return v0
.end method

.method public v()Lq5/f;
    .locals 1

    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->h:Lq5/f;

    return-object v0
.end method

.method public w()Lr5/a;
    .locals 1

    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->D:Lr5/a;

    return-object v0
.end method

.method public x()Lo5/a;
    .locals 1

    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->H:Lo5/a;

    return-object v0
.end method

.method public y()Lo5/f;
    .locals 1

    iget-object v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->e:Lo5/f;

    return-object v0
.end method

.method public z()Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->z:Z

    return v0
.end method
