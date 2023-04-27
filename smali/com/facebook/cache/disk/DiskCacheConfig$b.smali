.class public Lcom/facebook/cache/disk/DiskCacheConfig$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/cache/disk/DiskCacheConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private a:I

.field private b:Ljava/lang/String;

.field private c:Lcom/facebook/common/internal/Supplier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/common/internal/Supplier<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation
.end field

.field private d:J

.field private e:J

.field private f:J

.field private g:Lr3/g;

.field private h:Lq3/a;

.field private i:Lq3/c;

.field private j:Lt3/b;

.field private k:Z

.field private final l:Landroid/content/Context;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 3
    iput v0, p0, Lcom/facebook/cache/disk/DiskCacheConfig$b;->a:I

    const-string v0, "image_cache"

    .line 4
    iput-object v0, p0, Lcom/facebook/cache/disk/DiskCacheConfig$b;->b:Ljava/lang/String;

    const-wide/32 v0, 0x2800000

    .line 5
    iput-wide v0, p0, Lcom/facebook/cache/disk/DiskCacheConfig$b;->d:J

    const-wide/32 v0, 0xa00000

    .line 6
    iput-wide v0, p0, Lcom/facebook/cache/disk/DiskCacheConfig$b;->e:J

    const-wide/32 v0, 0x200000

    .line 7
    iput-wide v0, p0, Lcom/facebook/cache/disk/DiskCacheConfig$b;->f:J

    .line 8
    new-instance v0, Lr3/b;

    invoke-direct {v0}, Lr3/b;-><init>()V

    iput-object v0, p0, Lcom/facebook/cache/disk/DiskCacheConfig$b;->g:Lr3/g;

    .line 9
    iput-object p1, p0, Lcom/facebook/cache/disk/DiskCacheConfig$b;->l:Landroid/content/Context;

    return-void
.end method

.method synthetic constructor <init>(Landroid/content/Context;Lcom/facebook/cache/disk/DiskCacheConfig$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/cache/disk/DiskCacheConfig$b;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/cache/disk/DiskCacheConfig$b;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/facebook/cache/disk/DiskCacheConfig$b;->l:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic b(Lcom/facebook/cache/disk/DiskCacheConfig$b;)Lcom/facebook/common/internal/Supplier;
    .locals 0

    iget-object p0, p0, Lcom/facebook/cache/disk/DiskCacheConfig$b;->c:Lcom/facebook/common/internal/Supplier;

    return-object p0
.end method

.method static synthetic c(Lcom/facebook/cache/disk/DiskCacheConfig$b;)Lq3/c;
    .locals 0

    iget-object p0, p0, Lcom/facebook/cache/disk/DiskCacheConfig$b;->i:Lq3/c;

    return-object p0
.end method

.method static synthetic d(Lcom/facebook/cache/disk/DiskCacheConfig$b;Lcom/facebook/common/internal/Supplier;)Lcom/facebook/common/internal/Supplier;
    .locals 0

    iput-object p1, p0, Lcom/facebook/cache/disk/DiskCacheConfig$b;->c:Lcom/facebook/common/internal/Supplier;

    return-object p1
.end method

.method static synthetic e(Lcom/facebook/cache/disk/DiskCacheConfig$b;)Lt3/b;
    .locals 0

    iget-object p0, p0, Lcom/facebook/cache/disk/DiskCacheConfig$b;->j:Lt3/b;

    return-object p0
.end method

.method static synthetic f(Lcom/facebook/cache/disk/DiskCacheConfig$b;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/facebook/cache/disk/DiskCacheConfig$b;->k:Z

    return p0
.end method

.method static synthetic g(Lcom/facebook/cache/disk/DiskCacheConfig$b;)I
    .locals 0

    iget p0, p0, Lcom/facebook/cache/disk/DiskCacheConfig$b;->a:I

    return p0
.end method

.method static synthetic h(Lcom/facebook/cache/disk/DiskCacheConfig$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/facebook/cache/disk/DiskCacheConfig$b;->b:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic i(Lcom/facebook/cache/disk/DiskCacheConfig$b;)J
    .locals 2

    iget-wide v0, p0, Lcom/facebook/cache/disk/DiskCacheConfig$b;->d:J

    return-wide v0
.end method

.method static synthetic j(Lcom/facebook/cache/disk/DiskCacheConfig$b;)J
    .locals 2

    iget-wide v0, p0, Lcom/facebook/cache/disk/DiskCacheConfig$b;->e:J

    return-wide v0
.end method

.method static synthetic k(Lcom/facebook/cache/disk/DiskCacheConfig$b;)J
    .locals 2

    iget-wide v0, p0, Lcom/facebook/cache/disk/DiskCacheConfig$b;->f:J

    return-wide v0
.end method

.method static synthetic l(Lcom/facebook/cache/disk/DiskCacheConfig$b;)Lr3/g;
    .locals 0

    iget-object p0, p0, Lcom/facebook/cache/disk/DiskCacheConfig$b;->g:Lr3/g;

    return-object p0
.end method

.method static synthetic m(Lcom/facebook/cache/disk/DiskCacheConfig$b;)Lq3/a;
    .locals 0

    iget-object p0, p0, Lcom/facebook/cache/disk/DiskCacheConfig$b;->h:Lq3/a;

    return-object p0
.end method


# virtual methods
.method public n()Lcom/facebook/cache/disk/DiskCacheConfig;
    .locals 1

    new-instance v0, Lcom/facebook/cache/disk/DiskCacheConfig;

    invoke-direct {v0, p0}, Lcom/facebook/cache/disk/DiskCacheConfig;-><init>(Lcom/facebook/cache/disk/DiskCacheConfig$b;)V

    return-object v0
.end method

.method public o(Ljava/lang/String;)Lcom/facebook/cache/disk/DiskCacheConfig$b;
    .locals 0

    iput-object p1, p0, Lcom/facebook/cache/disk/DiskCacheConfig$b;->b:Ljava/lang/String;

    return-object p0
.end method

.method public p(Ljava/io/File;)Lcom/facebook/cache/disk/DiskCacheConfig$b;
    .locals 0

    invoke-static {p1}, Lw3/m;->a(Ljava/lang/Object;)Lcom/facebook/common/internal/Supplier;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/cache/disk/DiskCacheConfig$b;->c:Lcom/facebook/common/internal/Supplier;

    return-object p0
.end method

.method public q(J)Lcom/facebook/cache/disk/DiskCacheConfig$b;
    .locals 0

    iput-wide p1, p0, Lcom/facebook/cache/disk/DiskCacheConfig$b;->d:J

    return-object p0
.end method
