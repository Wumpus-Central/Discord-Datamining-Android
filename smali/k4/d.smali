.class public Lk4/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/common/internal/Supplier;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/common/internal/Supplier<",
        "Lcom/facebook/drawee/backends/pipeline/PipelineDraweeControllerBuilder;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/facebook/imagepipeline/core/ImagePipeline;

.field private final c:Lk4/e;

.field private final d:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/facebook/drawee/controller/ControllerListener;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lf5/b;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Lm4/f;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/facebook/imagepipeline/core/b;Ljava/util/Set;Ljava/util/Set;Lk4/b;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/facebook/imagepipeline/core/b;",
            "Ljava/util/Set<",
            "Lcom/facebook/drawee/controller/ControllerListener;",
            ">;",
            "Ljava/util/Set<",
            "Lf5/b;",
            ">;",
            "Lk4/b;",
            ")V"
        }
    .end annotation

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lk4/d;->a:Landroid/content/Context;

    .line 5
    invoke-virtual {p2}, Lcom/facebook/imagepipeline/core/b;->j()Lcom/facebook/imagepipeline/core/ImagePipeline;

    move-result-object p5

    iput-object p5, p0, Lk4/d;->b:Lcom/facebook/imagepipeline/core/ImagePipeline;

    .line 6
    new-instance v0, Lk4/e;

    invoke-direct {v0}, Lk4/e;-><init>()V

    iput-object v0, p0, Lk4/d;->c:Lk4/e;

    .line 7
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 8
    invoke-static {}, Lo4/a;->b()Lo4/a;

    move-result-object v2

    .line 9
    invoke-virtual {p2, p1}, Lcom/facebook/imagepipeline/core/b;->b(Landroid/content/Context;)Lt5/a;

    move-result-object v3

    .line 10
    invoke-static {}, Lt3/h;->g()Lt3/h;

    move-result-object v4

    .line 11
    invoke-virtual {p5}, Lcom/facebook/imagepipeline/core/ImagePipeline;->j()Lo5/s;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 12
    invoke-virtual/range {v0 .. v7}, Lk4/e;->a(Landroid/content/res/Resources;Lo4/a;Lt5/a;Ljava/util/concurrent/Executor;Lo5/s;Lv3/e;Lcom/facebook/common/internal/Supplier;)V

    .line 13
    iput-object p3, p0, Lk4/d;->d:Ljava/util/Set;

    .line 14
    iput-object p4, p0, Lk4/d;->e:Ljava/util/Set;

    const/4 p1, 0x0

    .line 15
    iput-object p1, p0, Lk4/d;->f:Lm4/f;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/imagepipeline/core/b;Lk4/b;)V
    .locals 6

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v5, p3

    .line 2
    invoke-direct/range {v0 .. v5}, Lk4/d;-><init>(Landroid/content/Context;Lcom/facebook/imagepipeline/core/b;Ljava/util/Set;Ljava/util/Set;Lk4/b;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lk4/b;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/facebook/imagepipeline/core/b;->l()Lcom/facebook/imagepipeline/core/b;

    move-result-object v0

    invoke-direct {p0, p1, v0, p2}, Lk4/d;-><init>(Landroid/content/Context;Lcom/facebook/imagepipeline/core/b;Lk4/b;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/drawee/backends/pipeline/PipelineDraweeControllerBuilder;
    .locals 7

    .line 1
    new-instance v6, Lcom/facebook/drawee/backends/pipeline/PipelineDraweeControllerBuilder;

    .line 2
    .line 3
    iget-object v1, p0, Lk4/d;->a:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v2, p0, Lk4/d;->c:Lk4/e;

    .line 6
    .line 7
    iget-object v3, p0, Lk4/d;->b:Lcom/facebook/imagepipeline/core/ImagePipeline;

    .line 8
    .line 9
    iget-object v4, p0, Lk4/d;->d:Ljava/util/Set;

    .line 10
    .line 11
    iget-object v5, p0, Lk4/d;->e:Ljava/util/Set;

    .line 12
    .line 13
    move-object v0, v6

    .line 14
    invoke-direct/range {v0 .. v5}, Lcom/facebook/drawee/backends/pipeline/PipelineDraweeControllerBuilder;-><init>(Landroid/content/Context;Lk4/e;Lcom/facebook/imagepipeline/core/ImagePipeline;Ljava/util/Set;Ljava/util/Set;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lk4/d;->f:Lm4/f;

    .line 18
    .line 19
    invoke-virtual {v6, v0}, Lcom/facebook/drawee/backends/pipeline/PipelineDraweeControllerBuilder;->M(Lm4/f;)Lcom/facebook/drawee/backends/pipeline/PipelineDraweeControllerBuilder;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    return-object v0
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

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lk4/d;->a()Lcom/facebook/drawee/backends/pipeline/PipelineDraweeControllerBuilder;

    move-result-object v0

    return-object v0
.end method
