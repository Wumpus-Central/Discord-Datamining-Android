.class Lbc/s0$b;
.super Lbc/a0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbc/s0;->b()Lbc/i0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lbc/a0<",
        "TV;>;"
    }
.end annotation


# instance fields
.field final synthetic l:Lbc/i0;

.field final synthetic m:Lbc/s0;


# direct methods
.method constructor <init>(Lbc/s0;Lbc/i0;)V
    .locals 0

    iput-object p1, p0, Lbc/s0$b;->m:Lbc/s0;

    iput-object p2, p0, Lbc/s0$b;->l:Lbc/i0;

    invoke-direct {p0}, Lbc/a0;-><init>()V

    return-void
.end method


# virtual methods
.method E()Lbc/d0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lbc/d0<",
            "TV;>;"
        }
    .end annotation

    iget-object v0, p0, Lbc/s0$b;->m:Lbc/s0;

    return-object v0
.end method

.method public get(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TV;"
        }
    .end annotation

    iget-object v0, p0, Lbc/s0$b;->l:Lbc/i0;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map$Entry;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
