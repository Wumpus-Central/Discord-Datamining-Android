.class Lbc/s0$a;
.super Lbc/g2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbc/s0;->n()Lbc/g2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lbc/g2<",
        "TV;>;"
    }
.end annotation


# instance fields
.field final k:Lbc/g2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbc/g2<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation
.end field

.field final synthetic l:Lbc/s0;


# direct methods
.method constructor <init>(Lbc/s0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lbc/s0$a;->l:Lbc/s0;

    .line 2
    .line 3
    invoke-direct {p0}, Lbc/g2;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lbc/s0;->r(Lbc/s0;)Lbc/l0;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Lbc/l0;->l()Lbc/w0;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1}, Lbc/w0;->n()Lbc/g2;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, Lbc/s0$a;->k:Lbc/g2;

    .line 19
    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    iget-object v0, p0, Lbc/s0$a;->k:Lbc/g2;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    iget-object v0, p0, Lbc/s0$a;->k:Lbc/g2;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
