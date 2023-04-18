.class Lpg/n$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


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
        "Lkotlin/jvm/functions/Function1<",
        "Llh/f;",
        "Ljava/util/Collection<",
        "+",
        "Lmg/z0;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic k:Lpg/n;

.field final synthetic l:Lpg/n$a;


# direct methods
.method constructor <init>(Lpg/n$a;Lpg/n;)V
    .locals 0

    iput-object p1, p0, Lpg/n$a$a;->l:Lpg/n$a;

    iput-object p2, p0, Lpg/n$a$a;->k:Lpg/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Llh/f;)Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llh/f;",
            ")",
            "Ljava/util/Collection<",
            "+",
            "Lmg/z0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lpg/n$a$a;->l:Lpg/n$a;

    invoke-static {v0, p1}, Lpg/n$a;->i(Lpg/n$a;Llh/f;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Llh/f;

    invoke-virtual {p0, p1}, Lpg/n$a$a;->a(Llh/f;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method
