.class public final Landroidx/camera/core/g0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/g0$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/camera/core/v1;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/camera/core/v1;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/camera/core/v1;",
            ">;"
        }
    .end annotation
.end field

.field private final d:J


# direct methods
.method constructor <init>(Landroidx/camera/core/g0$a;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Landroidx/camera/core/g0$a;->a:Ljava/util/List;

    .line 5
    .line 6
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Landroidx/camera/core/g0;->a:Ljava/util/List;

    .line 11
    .line 12
    iget-object v0, p1, Landroidx/camera/core/g0$a;->b:Ljava/util/List;

    .line 13
    .line 14
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, Landroidx/camera/core/g0;->b:Ljava/util/List;

    .line 19
    .line 20
    iget-object v0, p1, Landroidx/camera/core/g0$a;->c:Ljava/util/List;

    .line 21
    .line 22
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, Landroidx/camera/core/g0;->c:Ljava/util/List;

    .line 27
    .line 28
    iget-wide v0, p1, Landroidx/camera/core/g0$a;->d:J

    .line 29
    .line 30
    iput-wide v0, p0, Landroidx/camera/core/g0;->d:J

    .line 31
    .line 32
    return-void
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-wide v0, p0, Landroidx/camera/core/g0;->d:J

    return-wide v0
.end method

.method public b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/camera/core/v1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/core/g0;->b:Ljava/util/List;

    return-object v0
.end method

.method public c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/camera/core/v1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/core/g0;->a:Ljava/util/List;

    return-object v0
.end method

.method public d()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/camera/core/v1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/core/g0;->c:Ljava/util/List;

    return-object v0
.end method

.method public e()Z
    .locals 4

    iget-wide v0, p0, Landroidx/camera/core/g0;->d:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
