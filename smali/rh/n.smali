.class public final Lrh/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldi/g1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrh/n$a;
    }
.end annotation


# static fields
.field public static final f:Lrh/n$a;


# instance fields
.field private final a:J

.field private final b:Lmg/h0;

.field private final c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ldi/g0;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ldi/o0;

.field private final e:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lrh/n$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lrh/n$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lrh/n;->f:Lrh/n$a;

    return-void
.end method

.method private constructor <init>(JLmg/h0;Ljava/util/Set;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lmg/h0;",
            "Ljava/util/Set<",
            "+",
            "Ldi/g0;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, Ldi/c1;->l:Ldi/c1$a;

    invoke-virtual {v0}, Ldi/c1$a;->h()Ldi/c1;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, p0, v1}, Ldi/h0;->e(Ldi/c1;Lrh/n;Z)Ldi/o0;

    move-result-object v0

    iput-object v0, p0, Lrh/n;->d:Ldi/o0;

    .line 3
    new-instance v0, Lrh/n$b;

    invoke-direct {v0, p0}, Lrh/n$b;-><init>(Lrh/n;)V

    invoke-static {v0}, Llf/m;->a(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lrh/n;->e:Lkotlin/Lazy;

    .line 4
    iput-wide p1, p0, Lrh/n;->a:J

    .line 5
    iput-object p3, p0, Lrh/n;->b:Lmg/h0;

    .line 6
    iput-object p4, p0, Lrh/n;->c:Ljava/util/Set;

    return-void
.end method

.method public synthetic constructor <init>(JLmg/h0;Ljava/util/Set;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lrh/n;-><init>(JLmg/h0;Ljava/util/Set;)V

    return-void
.end method

.method public static final synthetic c(Lrh/n;)Lmg/h0;
    .locals 0

    iget-object p0, p0, Lrh/n;->b:Lmg/h0;

    return-object p0
.end method

.method public static final synthetic d(Lrh/n;)Ldi/o0;
    .locals 0

    iget-object p0, p0, Lrh/n;->d:Ldi/o0;

    return-object p0
.end method

.method public static final synthetic e(Lrh/n;)J
    .locals 2

    iget-wide v0, p0, Lrh/n;->a:J

    return-wide v0
.end method

.method public static final synthetic f(Lrh/n;)Z
    .locals 0

    invoke-direct {p0}, Lrh/n;->i()Z

    move-result p0

    return p0
.end method

.method private final h()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ldi/g0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lrh/n;->e:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method private final i()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lrh/n;->b:Lmg/h0;

    .line 2
    .line 3
    invoke-static {v0}, Lrh/t;->a(Lmg/h0;)Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    instance-of v1, v0, Ljava/util/Collection;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Ldi/g0;

    .line 34
    .line 35
    iget-object v3, p0, Lrh/n;->c:Ljava/util/Set;

    .line 36
    .line 37
    invoke-interface {v3, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    xor-int/2addr v1, v2

    .line 42
    if-nez v1, :cond_1

    .line 43
    .line 44
    const/4 v2, 0x0

    .line 45
    :cond_2
    :goto_0
    return v2
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
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
.end method

.method private final j()Ljava/lang/String;
    .locals 11

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x5b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lrh/n;->c:Ljava/util/Set;

    const-string v3, ","

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    sget-object v8, Lrh/n$c;->k:Lrh/n$c;

    const/16 v9, 0x1e

    const/4 v10, 0x0

    invoke-static/range {v2 .. v10}, Lkotlin/collections/h;->e0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final g()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ldi/g0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lrh/n;->c:Ljava/util/Set;

    return-object v0
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

.method public n()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Ldi/g0;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lrh/n;->h()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public o()Ljg/h;
    .locals 1

    iget-object v0, p0, Lrh/n;->b:Lmg/h0;

    invoke-interface {v0}, Lmg/h0;->o()Ljg/h;

    move-result-object v0

    return-object v0
.end method

.method public p(Lei/g;)Ldi/g1;
    .locals 1

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
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

    const-string v1, "IntegerLiteralType"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Lrh/n;->j()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
