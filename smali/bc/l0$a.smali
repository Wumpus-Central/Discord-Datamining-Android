.class Lbc/l0$a;
.super Lbc/g2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbc/l0;->o()Lbc/g2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lbc/g2<",
        "TK;>;"
    }
.end annotation


# instance fields
.field final synthetic k:Lbc/g2;


# direct methods
.method constructor <init>(Lbc/l0;Lbc/g2;)V
    .locals 0

    iput-object p2, p0, Lbc/l0$a;->k:Lbc/g2;

    invoke-direct {p0}, Lbc/g2;-><init>()V

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    iget-object v0, p0, Lbc/l0$a;->k:Lbc/g2;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TK;"
        }
    .end annotation

    iget-object v0, p0, Lbc/l0$a;->k:Lbc/g2;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
