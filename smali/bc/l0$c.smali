.class abstract Lbc/l0$c;
.super Lbc/l0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbc/l0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lbc/l0<",
        "TK;TV;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lbc/l0;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic entrySet()Ljava/util/Set;
    .locals 1

    invoke-super {p0}, Lbc/l0;->l()Lbc/w0;

    move-result-object v0

    return-object v0
.end method

.method h()Lbc/w0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lbc/w0<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    new-instance v0, Lbc/l0$c$a;

    invoke-direct {v0, p0}, Lbc/l0$c$a;-><init>(Lbc/l0$c;)V

    return-object v0
.end method

.method i()Lbc/w0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lbc/w0<",
            "TK;>;"
        }
    .end annotation

    new-instance v0, Lbc/p0;

    invoke-direct {v0, p0}, Lbc/p0;-><init>(Lbc/l0;)V

    return-object v0
.end method

.method j()Lbc/d0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lbc/d0<",
            "TV;>;"
        }
    .end annotation

    new-instance v0, Lbc/s0;

    invoke-direct {v0, p0}, Lbc/s0;-><init>(Lbc/l0;)V

    return-object v0
.end method

.method public bridge synthetic keySet()Ljava/util/Set;
    .locals 1

    invoke-super {p0}, Lbc/l0;->p()Lbc/w0;

    move-result-object v0

    return-object v0
.end method

.method abstract u()Lbc/g2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lbc/g2<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation
.end method

.method public bridge synthetic values()Ljava/util/Collection;
    .locals 1

    invoke-super {p0}, Lbc/l0;->t()Lbc/d0;

    move-result-object v0

    return-object v0
.end method
