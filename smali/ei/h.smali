.class public final Lei/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lmg/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmg/g0<",
            "Lei/p<",
            "Lei/x;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lmg/g0;

    const-string v1, "KotlinTypeRefiner"

    invoke-direct {v0, v1}, Lmg/g0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lei/h;->a:Lmg/g0;

    return-void
.end method

.method public static final a()Lmg/g0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lmg/g0<",
            "Lei/p<",
            "Lei/x;",
            ">;>;"
        }
    .end annotation

    sget-object v0, Lei/h;->a:Lmg/g0;

    return-object v0
.end method

.method public static final b(Lei/g;Ljava/lang/Iterable;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lei/g;",
            "Ljava/lang/Iterable<",
            "+",
            "Ldi/g0;",
            ">;)",
            "Ljava/util/List<",
            "Ldi/g0;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "types"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    const/16 v1, 0xa

    .line 14
    .line 15
    invoke-static {p1, v1}, Lkotlin/collections/h;->t(Ljava/lang/Iterable;I)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Ldi/g0;

    .line 37
    .line 38
    invoke-virtual {p0, v1}, Lei/g;->h(Lhi/i;)Ldi/g0;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    return-object v0
    .line 47
    .line 48
    .line 49
.end method
