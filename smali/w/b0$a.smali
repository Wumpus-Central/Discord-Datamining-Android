.class Lw/b0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/b0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw/b0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;II)Lfc/b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lw/n0;",
            ">;II)",
            "Lfc/b<",
            "Ljava/util/List<",
            "Ljava/lang/Void;",
            ">;>;"
        }
    .end annotation

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Ly/f;->h(Ljava/lang/Object;)Lfc/b;

    move-result-object p1

    return-object p1
.end method

.method public b(Lw/r0;)V
    .locals 0

    return-void
.end method

.method public c(F)Lfc/b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)",
            "Lfc/b<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    const/4 p1, 0x0

    invoke-static {p1}, Ly/f;->h(Ljava/lang/Object;)Lfc/b;

    move-result-object p1

    return-object p1
.end method

.method public d()Landroid/graphics/Rect;
    .locals 1

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    return-object v0
.end method

.method public e(I)V
    .locals 0

    return-void
.end method

.method public f(Z)Lfc/b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lfc/b<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    const/4 p1, 0x0

    invoke-static {p1}, Ly/f;->h(Ljava/lang/Object;)Lfc/b;

    move-result-object p1

    return-object p1
.end method

.method public g()Lw/r0;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public h()V
    .locals 0

    return-void
.end method

.method public i(Landroidx/camera/core/g0;)Lfc/b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/g0;",
            ")",
            "Lfc/b<",
            "Landroidx/camera/core/h0;",
            ">;"
        }
    .end annotation

    invoke-static {}, Landroidx/camera/core/h0;->b()Landroidx/camera/core/h0;

    move-result-object p1

    invoke-static {p1}, Ly/f;->h(Ljava/lang/Object;)Lfc/b;

    move-result-object p1

    return-object p1
.end method
