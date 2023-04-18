.class public abstract Lbc/b0;
.super Lbc/c0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lbc/c0<",
        "TK;TV;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lbc/c0;-><init>()V

    return-void
.end method

.method public static w(Ljava/lang/Object;Ljava/lang/Object;)Lbc/b0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(TK;TV;)",
            "Lbc/b0<",
            "TK;TV;>;"
        }
    .end annotation

    new-instance v0, Lbc/c2;

    invoke-direct {v0, p0, p1}, Lbc/c2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method bridge synthetic j()Lbc/d0;
    .locals 1

    invoke-virtual {p0}, Lbc/b0;->u()Lbc/w0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic t()Lbc/d0;
    .locals 1

    invoke-virtual {p0}, Lbc/b0;->x()Lbc/w0;

    move-result-object v0

    return-object v0
.end method

.method final u()Lbc/w0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lbc/w0<",
            "TV;>;"
        }
    .end annotation

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "should never be called"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public abstract v()Lbc/b0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lbc/b0<",
            "TV;TK;>;"
        }
    .end annotation
.end method

.method public bridge synthetic values()Ljava/util/Collection;
    .locals 1

    invoke-virtual {p0}, Lbc/b0;->x()Lbc/w0;

    move-result-object v0

    return-object v0
.end method

.method public x()Lbc/w0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lbc/w0<",
            "TV;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lbc/b0;->v()Lbc/b0;

    move-result-object v0

    invoke-virtual {v0}, Lbc/l0;->p()Lbc/w0;

    move-result-object v0

    return-object v0
.end method
