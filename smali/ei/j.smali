.class public final Lei/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqh/b;


# instance fields
.field private final a:Ldi/k1;

.field private b:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Ljava/util/List<",
            "+",
            "Ldi/v1;",
            ">;>;"
        }
    .end annotation
.end field

.field private final c:Lei/j;

.field private final d:Lmg/f1;

.field private final e:Lkotlin/Lazy;


# direct methods
.method public constructor <init>(Ldi/k1;Ljava/util/List;Lei/j;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldi/k1;",
            "Ljava/util/List<",
            "+",
            "Ldi/v1;",
            ">;",
            "Lei/j;",
            ")V"
        }
    .end annotation

    const-string v0, "projection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "supertypes"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    new-instance v3, Lei/j$a;

    invoke-direct {v3, p2}, Lei/j$a;-><init>(Ljava/util/List;)V

    const/4 v5, 0x0

    const/16 v6, 0x8

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v4, p3

    invoke-direct/range {v1 .. v7}, Lei/j;-><init>(Ldi/k1;Lkotlin/jvm/functions/Function0;Lei/j;Lmg/f1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Ldi/k1;Ljava/util/List;Lei/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 8
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lei/j;-><init>(Ldi/k1;Ljava/util/List;Lei/j;)V

    return-void
.end method

.method public constructor <init>(Ldi/k1;Lkotlin/jvm/functions/Function0;Lei/j;Lmg/f1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldi/k1;",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Ljava/util/List<",
            "+",
            "Ldi/v1;",
            ">;>;",
            "Lei/j;",
            "Lmg/f1;",
            ")V"
        }
    .end annotation

    const-string v0, "projection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lei/j;->a:Ldi/k1;

    .line 3
    iput-object p2, p0, Lei/j;->b:Lkotlin/jvm/functions/Function0;

    .line 4
    iput-object p3, p0, Lei/j;->c:Lei/j;

    .line 5
    iput-object p4, p0, Lei/j;->d:Lmg/f1;

    .line 6
    sget-object p1, Llf/p;->l:Llf/p;

    new-instance p2, Lei/j$b;

    invoke-direct {p2, p0}, Lei/j$b;-><init>(Lei/j;)V

    invoke-static {p1, p2}, Llf/m;->b(Llf/p;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lei/j;->e:Lkotlin/Lazy;

    return-void
.end method

.method public synthetic constructor <init>(Ldi/k1;Lkotlin/jvm/functions/Function0;Lei/j;Lmg/f1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x2

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    move-object p3, v0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    move-object p4, v0

    .line 7
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lei/j;-><init>(Ldi/k1;Lkotlin/jvm/functions/Function0;Lei/j;Lmg/f1;)V

    return-void
.end method

.method public static final synthetic c(Lei/j;)Lkotlin/jvm/functions/Function0;
    .locals 0

    iget-object p0, p0, Lei/j;->b:Lkotlin/jvm/functions/Function0;

    return-object p0
.end method

.method private final e()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ldi/v1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lei/j;->e:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public b()Ldi/k1;
    .locals 1

    iget-object v0, p0, Lei/j;->a:Ldi/k1;

    return-object v0
.end method

.method public d()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ldi/v1;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lei/j;->e()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const-class v1, Lei/j;

    .line 6
    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    goto :goto_0

    .line 14
    :cond_1
    const/4 v2, 0x0

    .line 15
    :goto_0
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x0

    .line 20
    if-nez v1, :cond_2

    .line 21
    .line 22
    return v2

    .line 23
    :cond_2
    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor"

    .line 24
    .line 25
    invoke-static {p1, v1}, Lkotlin/jvm/internal/q;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    check-cast p1, Lei/j;

    .line 29
    .line 30
    iget-object v1, p0, Lei/j;->c:Lei/j;

    .line 31
    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    move-object v1, p0

    .line 35
    :cond_3
    iget-object v3, p1, Lei/j;->c:Lei/j;

    .line 36
    .line 37
    if-nez v3, :cond_4

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_4
    move-object p1, v3

    .line 41
    :goto_1
    if-ne v1, p1, :cond_5

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_5
    move v0, v2

    .line 45
    :goto_2
    return v0
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method public final f(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Ldi/v1;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "supertypes"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lei/j$c;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lei/j$c;-><init>(Ljava/util/List;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lei/j;->b:Lkotlin/jvm/functions/Function0;

    .line 12
    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public g(Lei/g;)Lei/j;
    .locals 4

    .line 1
    const-string v0, "kotlinTypeRefiner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lei/j;->b()Ldi/k1;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {v0, p1}, Ldi/k1;->p(Lei/g;)Ldi/k1;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "projection.refine(kotlinTypeRefiner)"

    .line 15
    .line 16
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lei/j;->b:Lkotlin/jvm/functions/Function0;

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    new-instance v1, Lei/j$d;

    .line 24
    .line 25
    invoke-direct {v1, p0, p1}, Lei/j$d;-><init>(Lei/j;Lei/g;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v1, 0x0

    .line 30
    :goto_0
    iget-object p1, p0, Lei/j;->c:Lei/j;

    .line 31
    .line 32
    if-nez p1, :cond_1

    .line 33
    .line 34
    move-object p1, p0

    .line 35
    :cond_1
    iget-object v2, p0, Lei/j;->d:Lmg/f1;

    .line 36
    .line 37
    new-instance v3, Lei/j;

    .line 38
    .line 39
    invoke-direct {v3, v0, v1, p1, v2}, Lei/j;-><init>(Ldi/k1;Lkotlin/jvm/functions/Function0;Lei/j;Lmg/f1;)V

    .line 40
    .line 41
    .line 42
    return-object v3
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method public getParameters()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lmg/f1;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lei/j;->c:Lei/j;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lei/j;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    return v0
.end method

.method public bridge synthetic n()Ljava/util/Collection;
    .locals 1

    invoke-virtual {p0}, Lei/j;->d()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public o()Ljg/h;
    .locals 2

    invoke-virtual {p0}, Lei/j;->b()Ldi/k1;

    move-result-object v0

    invoke-interface {v0}, Ldi/k1;->getType()Ldi/g0;

    move-result-object v0

    const-string v1, "projection.type"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lii/a;->i(Ldi/g0;)Ljg/h;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic p(Lei/g;)Ldi/g1;
    .locals 0

    invoke-virtual {p0, p1}, Lei/j;->g(Lei/g;)Lei/j;

    move-result-object p1

    return-object p1
.end method

.method public q()Lmg/h;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public r()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CapturedType("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lei/j;->b()Ldi/k1;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
