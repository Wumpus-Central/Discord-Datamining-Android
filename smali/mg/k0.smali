.class public final Lmg/k0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmg/k0$a;,
        Lmg/k0$b;
    }
.end annotation


# instance fields
.field private final a:Lci/n;

.field private final b:Lmg/h0;

.field private final c:Lci/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lci/g<",
            "Llh/c;",
            "Lmg/l0;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lci/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lci/g<",
            "Lmg/k0$a;",
            "Lmg/e;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lci/n;Lmg/h0;)V
    .locals 1

    .line 1
    const-string v0, "storageManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "module"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lmg/k0;->a:Lci/n;

    .line 15
    .line 16
    iput-object p2, p0, Lmg/k0;->b:Lmg/h0;

    .line 17
    .line 18
    new-instance p2, Lmg/k0$d;

    .line 19
    .line 20
    invoke-direct {p2, p0}, Lmg/k0$d;-><init>(Lmg/k0;)V

    .line 21
    .line 22
    .line 23
    invoke-interface {p1, p2}, Lci/n;->h(Lkotlin/jvm/functions/Function1;)Lci/g;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    iput-object p2, p0, Lmg/k0;->c:Lci/g;

    .line 28
    .line 29
    new-instance p2, Lmg/k0$c;

    .line 30
    .line 31
    invoke-direct {p2, p0}, Lmg/k0$c;-><init>(Lmg/k0;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {p1, p2}, Lci/n;->h(Lkotlin/jvm/functions/Function1;)Lci/g;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, p0, Lmg/k0;->d:Lci/g;

    .line 39
    .line 40
    return-void
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
.end method

.method public static final synthetic a(Lmg/k0;)Lmg/h0;
    .locals 0

    iget-object p0, p0, Lmg/k0;->b:Lmg/h0;

    return-object p0
.end method

.method public static final synthetic b(Lmg/k0;)Lci/g;
    .locals 0

    iget-object p0, p0, Lmg/k0;->c:Lci/g;

    return-object p0
.end method

.method public static final synthetic c(Lmg/k0;)Lci/n;
    .locals 0

    iget-object p0, p0, Lmg/k0;->a:Lci/n;

    return-object p0
.end method


# virtual methods
.method public final d(Llh/b;Ljava/util/List;)Lmg/e;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llh/b;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)",
            "Lmg/e;"
        }
    .end annotation

    .line 1
    const-string v0, "classId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "typeParametersCount"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lmg/k0;->d:Lci/g;

    .line 12
    .line 13
    new-instance v1, Lmg/k0$a;

    .line 14
    .line 15
    invoke-direct {v1, p1, p2}, Lmg/k0$a;-><init>(Llh/b;Ljava/util/List;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Lmg/e;

    .line 23
    .line 24
    return-object p1
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
.end method
