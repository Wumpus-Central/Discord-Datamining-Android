.class public final Lyg/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lng/g;


# instance fields
.field private final k:Lyg/g;

.field private final l:Lch/d;

.field private final m:Z

.field private final n:Lci/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lci/h<",
            "Lch/a;",
            "Lng/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lyg/g;Lch/d;Z)V
    .locals 1

    const-string v0, "c"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "annotationOwner"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lyg/d;->k:Lyg/g;

    .line 3
    iput-object p2, p0, Lyg/d;->l:Lch/d;

    .line 4
    iput-boolean p3, p0, Lyg/d;->m:Z

    .line 5
    invoke-virtual {p1}, Lyg/g;->a()Lyg/b;

    move-result-object p1

    invoke-virtual {p1}, Lyg/b;->u()Lci/n;

    move-result-object p1

    new-instance p2, Lyg/d$a;

    invoke-direct {p2, p0}, Lyg/d$a;-><init>(Lyg/d;)V

    invoke-interface {p1, p2}, Lci/n;->i(Lkotlin/jvm/functions/Function1;)Lci/h;

    move-result-object p1

    iput-object p1, p0, Lyg/d;->n:Lci/h;

    return-void
.end method

.method public synthetic constructor <init>(Lyg/g;Lch/d;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lyg/d;-><init>(Lyg/g;Lch/d;Z)V

    return-void
.end method

.method public static final synthetic b(Lyg/d;)Z
    .locals 0

    iget-boolean p0, p0, Lyg/d;->m:Z

    return p0
.end method

.method public static final synthetic f(Lyg/d;)Lyg/g;
    .locals 0

    iget-object p0, p0, Lyg/d;->k:Lyg/g;

    return-object p0
.end method


# virtual methods
.method public a(Llh/c;)Lng/c;
    .locals 3

    .line 1
    const-string v0, "fqName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lyg/d;->l:Lch/d;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Lch/d;->a(Llh/c;)Lch/a;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v1, p0, Lyg/d;->n:Lci/h;

    .line 15
    .line 16
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lng/c;

    .line 21
    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    :cond_0
    sget-object v0, Lwg/c;->a:Lwg/c;

    .line 25
    .line 26
    iget-object v1, p0, Lyg/d;->l:Lch/d;

    .line 27
    .line 28
    iget-object v2, p0, Lyg/d;->k:Lyg/g;

    .line 29
    .line 30
    invoke-virtual {v0, p1, v1, v2}, Lwg/c;->a(Llh/c;Lch/d;Lyg/g;)Lng/c;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    :cond_1
    return-object v0
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

.method public isEmpty()Z
    .locals 1

    iget-object v0, p0, Lyg/d;->l:Lch/d;

    invoke-interface {v0}, Lch/d;->getAnnotations()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lyg/d;->l:Lch/d;

    invoke-interface {v0}, Lch/d;->k()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Lng/c;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lyg/d;->l:Lch/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lch/d;->getAnnotations()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lkotlin/collections/h;->K(Ljava/lang/Iterable;)Lkotlin/sequences/Sequence;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Lyg/d;->n:Lci/h;

    .line 12
    .line 13
    invoke-static {v0, v1}, Loi/j;->y(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v1, Lwg/c;->a:Lwg/c;

    .line 18
    .line 19
    sget-object v2, Ljg/k$a;->y:Llh/c;

    .line 20
    .line 21
    iget-object v3, p0, Lyg/d;->l:Lch/d;

    .line 22
    .line 23
    iget-object v4, p0, Lyg/d;->k:Lyg/g;

    .line 24
    .line 25
    invoke-virtual {v1, v2, v3, v4}, Lwg/c;->a(Llh/c;Lch/d;Lyg/g;)Lng/c;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-static {v0, v1}, Loi/j;->B(Lkotlin/sequences/Sequence;Ljava/lang/Object;)Lkotlin/sequences/Sequence;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v0}, Loi/j;->r(Lkotlin/sequences/Sequence;)Lkotlin/sequences/Sequence;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-interface {v0}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    return-object v0
    .line 42
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
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
.end method

.method public k(Llh/c;)Z
    .locals 0

    invoke-static {p0, p1}, Lng/g$b;->b(Lng/g;Llh/c;)Z

    move-result p1

    return p1
.end method
