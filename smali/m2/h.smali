.class public Lm2/h;
.super Lm2/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lm2/n<",
        "Ln2/n;",
        "Landroid/graphics/Path;",
        ">;"
    }
.end annotation


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

    invoke-direct {p0, p1}, Lm2/n;-><init>(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Lj2/a;
    .locals 1

    invoke-virtual {p0}, Lm2/h;->c()Lj2/m;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/util/List;
    .locals 1

    invoke-super {p0}, Lm2/n;->b()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public c()Lj2/m;
    .locals 2

    new-instance v0, Lj2/m;

    iget-object v1, p0, Lm2/n;->a:Ljava/util/List;

    invoke-direct {v0, v1}, Lj2/m;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public bridge synthetic h()Z
    .locals 1

    invoke-super {p0}, Lm2/n;->h()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic toString()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Lm2/n;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
