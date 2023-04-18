.class Lbc/l0$c$a;
.super Lbc/n0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbc/l0$c;->h()Lbc/w0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lbc/n0<",
        "TK;TV;>;"
    }
.end annotation


# instance fields
.field final synthetic m:Lbc/l0$c;


# direct methods
.method constructor <init>(Lbc/l0$c;)V
    .locals 0

    iput-object p1, p0, Lbc/l0$c$a;->m:Lbc/l0$c;

    invoke-direct {p0}, Lbc/n0;-><init>()V

    return-void
.end method


# virtual methods
.method C()Lbc/l0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lbc/l0<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Lbc/l0$c$a;->m:Lbc/l0$c;

    return-object v0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Lbc/l0$c$a;->n()Lbc/g2;

    move-result-object v0

    return-object v0
.end method

.method public n()Lbc/g2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lbc/g2<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    iget-object v0, p0, Lbc/l0$c$a;->m:Lbc/l0$c;

    invoke-virtual {v0}, Lbc/l0$c;->u()Lbc/g2;

    move-result-object v0

    return-object v0
.end method
