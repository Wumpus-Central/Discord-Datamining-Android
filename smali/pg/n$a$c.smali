.class Lpg/n$a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpg/n$a;-><init>(Lpg/n;Lci/n;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function0<",
        "Ljava/util/Collection<",
        "Lmg/m;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic k:Lpg/n;

.field final synthetic l:Lpg/n$a;


# direct methods
.method constructor <init>(Lpg/n$a;Lpg/n;)V
    .locals 0

    iput-object p1, p0, Lpg/n$a$c;->l:Lpg/n$a;

    iput-object p2, p0, Lpg/n$a$c;->k:Lpg/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lmg/m;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lpg/n$a$c;->l:Lpg/n$a;

    invoke-static {v0}, Lpg/n$a;->k(Lpg/n$a;)Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lpg/n$a$c;->a()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method
