.class public Lj2/m;
.super Lj2/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lj2/a<",
        "Ln2/n;",
        "Landroid/graphics/Path;",
        ">;"
    }
.end annotation


# instance fields
.field private final i:Ln2/n;

.field private final j:Landroid/graphics/Path;

.field private k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Li2/s;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lt2/a<",
            "Ln2/n;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lj2/a;-><init>(Ljava/util/List;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ln2/n;

    .line 5
    .line 6
    invoke-direct {p1}, Ln2/n;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lj2/m;->i:Ln2/n;

    .line 10
    .line 11
    new-instance p1, Landroid/graphics/Path;

    .line 12
    .line 13
    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lj2/m;->j:Landroid/graphics/Path;

    .line 17
    .line 18
    return-void
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
.end method


# virtual methods
.method public bridge synthetic i(Lt2/a;F)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lj2/m;->p(Lt2/a;F)Landroid/graphics/Path;

    move-result-object p1

    return-object p1
.end method

.method public p(Lt2/a;F)Landroid/graphics/Path;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt2/a<",
            "Ln2/n;",
            ">;F)",
            "Landroid/graphics/Path;"
        }
    .end annotation

    .line 1
    iget-object v0, p1, Lt2/a;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ln2/n;

    .line 4
    .line 5
    iget-object p1, p1, Lt2/a;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p1, Ln2/n;

    .line 8
    .line 9
    iget-object v1, p0, Lj2/m;->i:Ln2/n;

    .line 10
    .line 11
    invoke-virtual {v1, v0, p1, p2}, Ln2/n;->c(Ln2/n;Ln2/n;F)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lj2/m;->i:Ln2/n;

    .line 15
    .line 16
    iget-object p2, p0, Lj2/m;->k:Ljava/util/List;

    .line 17
    .line 18
    if-eqz p2, :cond_0

    .line 19
    .line 20
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    add-int/lit8 p2, p2, -0x1

    .line 25
    .line 26
    :goto_0
    if-ltz p2, :cond_0

    .line 27
    .line 28
    iget-object v0, p0, Lj2/m;->k:Ljava/util/List;

    .line 29
    .line 30
    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Li2/s;

    .line 35
    .line 36
    invoke-interface {v0, p1}, Li2/s;->c(Ln2/n;)Ln2/n;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    add-int/lit8 p2, p2, -0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    iget-object p2, p0, Lj2/m;->j:Landroid/graphics/Path;

    .line 44
    .line 45
    invoke-static {p1, p2}, Ls2/i;->h(Ln2/n;Landroid/graphics/Path;)V

    .line 46
    .line 47
    .line 48
    iget-object p1, p0, Lj2/m;->j:Landroid/graphics/Path;

    .line 49
    .line 50
    return-object p1
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
.end method

.method public q(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Li2/s;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lj2/m;->k:Ljava/util/List;

    return-void
.end method
