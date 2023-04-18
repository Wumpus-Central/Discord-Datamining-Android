.class public Landroidx/core/app/FrameMetricsAggregator;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/core/app/FrameMetricsAggregator$a;,
        Landroidx/core/app/FrameMetricsAggregator$b;
    }
.end annotation


# instance fields
.field private final a:Landroidx/core/app/FrameMetricsAggregator$b;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-direct {p0, v0}, Landroidx/core/app/FrameMetricsAggregator;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    .line 4
    new-instance v0, Landroidx/core/app/FrameMetricsAggregator$a;

    invoke-direct {v0, p1}, Landroidx/core/app/FrameMetricsAggregator$a;-><init>(I)V

    iput-object v0, p0, Landroidx/core/app/FrameMetricsAggregator;->a:Landroidx/core/app/FrameMetricsAggregator$b;

    goto :goto_0

    .line 5
    :cond_0
    new-instance p1, Landroidx/core/app/FrameMetricsAggregator$b;

    invoke-direct {p1}, Landroidx/core/app/FrameMetricsAggregator$b;-><init>()V

    iput-object p1, p0, Landroidx/core/app/FrameMetricsAggregator;->a:Landroidx/core/app/FrameMetricsAggregator$b;

    :goto_0
    return-void
.end method


# virtual methods
.method public a(Landroid/app/Activity;)V
    .locals 1

    iget-object v0, p0, Landroidx/core/app/FrameMetricsAggregator;->a:Landroidx/core/app/FrameMetricsAggregator$b;

    invoke-virtual {v0, p1}, Landroidx/core/app/FrameMetricsAggregator$b;->a(Landroid/app/Activity;)V

    return-void
.end method

.method public b()[Landroid/util/SparseIntArray;
    .locals 1

    iget-object v0, p0, Landroidx/core/app/FrameMetricsAggregator;->a:Landroidx/core/app/FrameMetricsAggregator$b;

    invoke-virtual {v0}, Landroidx/core/app/FrameMetricsAggregator$b;->b()[Landroid/util/SparseIntArray;

    move-result-object v0

    return-object v0
.end method

.method public c(Landroid/app/Activity;)[Landroid/util/SparseIntArray;
    .locals 1

    iget-object v0, p0, Landroidx/core/app/FrameMetricsAggregator;->a:Landroidx/core/app/FrameMetricsAggregator$b;

    invoke-virtual {v0, p1}, Landroidx/core/app/FrameMetricsAggregator$b;->c(Landroid/app/Activity;)[Landroid/util/SparseIntArray;

    move-result-object p1

    return-object p1
.end method

.method public d()[Landroid/util/SparseIntArray;
    .locals 1

    iget-object v0, p0, Landroidx/core/app/FrameMetricsAggregator;->a:Landroidx/core/app/FrameMetricsAggregator$b;

    invoke-virtual {v0}, Landroidx/core/app/FrameMetricsAggregator$b;->d()[Landroid/util/SparseIntArray;

    move-result-object v0

    return-object v0
.end method

.method public e()[Landroid/util/SparseIntArray;
    .locals 1

    iget-object v0, p0, Landroidx/core/app/FrameMetricsAggregator;->a:Landroidx/core/app/FrameMetricsAggregator$b;

    invoke-virtual {v0}, Landroidx/core/app/FrameMetricsAggregator$b;->e()[Landroid/util/SparseIntArray;

    move-result-object v0

    return-object v0
.end method
