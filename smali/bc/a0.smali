.class abstract Lbc/a0;
.super Lbc/i0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lbc/i0<",
        "TE;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lbc/i0;-><init>()V

    return-void
.end method


# virtual methods
.method abstract E()Lbc/d0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lbc/d0<",
            "TE;>;"
        }
    .end annotation
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    invoke-virtual {p0}, Lbc/a0;->E()Lbc/d0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lbc/d0;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public isEmpty()Z
    .locals 1

    invoke-virtual {p0}, Lbc/a0;->E()Lbc/d0;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    return v0
.end method

.method l()Z
    .locals 1

    invoke-virtual {p0}, Lbc/a0;->E()Lbc/d0;

    move-result-object v0

    invoke-virtual {v0}, Lbc/d0;->l()Z

    move-result v0

    return v0
.end method

.method public size()I
    .locals 1

    invoke-virtual {p0}, Lbc/a0;->E()Lbc/d0;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    return v0
.end method
