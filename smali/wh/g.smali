.class public final Lwh/g;
.super Lwh/a;
.source "SourceFile"


# instance fields
.field private final b:Lci/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lci/i<",
            "Lwh/h;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lci/n;Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lci/n;",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Lwh/h;",
            ">;)V"
        }
    .end annotation

    const-string v0, "storageManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getScope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Lwh/a;-><init>()V

    .line 4
    new-instance v0, Lwh/g$a;

    invoke-direct {v0, p2}, Lwh/g$a;-><init>(Lkotlin/jvm/functions/Function0;)V

    invoke-interface {p1, v0}, Lci/n;->d(Lkotlin/jvm/functions/Function0;)Lci/i;

    move-result-object p1

    iput-object p1, p0, Lwh/g;->b:Lci/i;

    return-void
.end method

.method public synthetic constructor <init>(Lci/n;Lkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    .line 1
    sget-object p1, Lci/f;->e:Lci/n;

    const-string p3, "NO_LOCKS"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2}, Lwh/g;-><init>(Lci/n;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Lwh/h;",
            ">;)V"
        }
    .end annotation

    const-string v0, "getScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, p1, v1, v0}, Lwh/g;-><init>(Lci/n;Lkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method protected i()Lwh/h;
    .locals 1

    iget-object v0, p0, Lwh/g;->b:Lci/i;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwh/h;

    return-object v0
.end method
