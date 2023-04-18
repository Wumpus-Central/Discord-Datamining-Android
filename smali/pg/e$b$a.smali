.class Lpg/e$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpg/e$b;->a()Ldi/o0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function0<",
        "Lwh/h;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic k:Lpg/e$b;


# direct methods
.method constructor <init>(Lpg/e$b;)V
    .locals 0

    iput-object p1, p0, Lpg/e$b$a;->k:Lpg/e$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lwh/h;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Scope for type parameter "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpg/e$b$a;->k:Lpg/e$b;

    iget-object v1, v1, Lpg/e$b;->k:Llh/f;

    invoke-virtual {v1}, Llh/f;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lpg/e$b$a;->k:Lpg/e$b;

    iget-object v1, v1, Lpg/e$b;->l:Lpg/e;

    invoke-virtual {v1}, Lpg/e;->getUpperBounds()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lwh/n;->j(Ljava/lang/String;Ljava/util/Collection;)Lwh/h;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lpg/e$b$a;->a()Lwh/h;

    move-result-object v0

    return-object v0
.end method
