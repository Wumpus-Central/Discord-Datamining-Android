.class public Lm2/c;
.super Lm2/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lm2/n<",
        "Ln2/d;",
        "Ln2/d;",
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
            "Ln2/d;",
            ">;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lm2/n;-><init>(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public a()Lj2/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lj2/a<",
            "Ln2/d;",
            "Ln2/d;",
            ">;"
        }
    .end annotation

    new-instance v0, Lj2/e;

    iget-object v1, p0, Lm2/n;->a:Ljava/util/List;

    invoke-direct {v0, v1}, Lj2/e;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public bridge synthetic b()Ljava/util/List;
    .locals 1

    invoke-super {p0}, Lm2/n;->b()Ljava/util/List;

    move-result-object v0

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
