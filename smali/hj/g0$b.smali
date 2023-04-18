.class Lhj/g0$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhj/g0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private final a:C

.field private final b:Lhj/g0$b;

.field private final c:Lhj/g0$b;

.field private final d:Lhj/g0$b;

.field private final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnet/time4j/tz/k;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(C)V
    .locals 6

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move v1, p1

    .line 2
    invoke-direct/range {v0 .. v5}, Lhj/g0$b;-><init>(CLhj/g0$b;Lhj/g0$b;Lhj/g0$b;Ljava/util/List;)V

    return-void
.end method

.method synthetic constructor <init>(CLhj/g0$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lhj/g0$b;-><init>(C)V

    return-void
.end method

.method private constructor <init>(CLhj/g0$b;Lhj/g0$b;Lhj/g0$b;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(C",
            "Lhj/g0$b;",
            "Lhj/g0$b;",
            "Lhj/g0$b;",
            "Ljava/util/List<",
            "Lnet/time4j/tz/k;",
            ">;)V"
        }
    .end annotation

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-char p1, p0, Lhj/g0$b;->a:C

    .line 5
    iput-object p2, p0, Lhj/g0$b;->b:Lhj/g0$b;

    .line 6
    iput-object p3, p0, Lhj/g0$b;->c:Lhj/g0$b;

    .line 7
    iput-object p4, p0, Lhj/g0$b;->d:Lhj/g0$b;

    .line 8
    iput-object p5, p0, Lhj/g0$b;->e:Ljava/util/List;

    return-void
.end method

.method static synthetic a(Lhj/g0$b;)C
    .locals 0

    iget-char p0, p0, Lhj/g0$b;->a:C

    return p0
.end method

.method static synthetic b(Lhj/g0$b;)Lhj/g0$b;
    .locals 0

    iget-object p0, p0, Lhj/g0$b;->b:Lhj/g0$b;

    return-object p0
.end method

.method static synthetic c(Lhj/g0$b;)Lhj/g0$b;
    .locals 0

    iget-object p0, p0, Lhj/g0$b;->d:Lhj/g0$b;

    return-object p0
.end method

.method static synthetic d(Lhj/g0$b;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lhj/g0$b;->e:Ljava/util/List;

    return-object p0
.end method

.method static synthetic e(Lhj/g0$b;)Lhj/g0$b;
    .locals 0

    iget-object p0, p0, Lhj/g0$b;->c:Lhj/g0$b;

    return-object p0
.end method

.method static synthetic f(Lhj/g0$b;Lhj/g0$b;)Lhj/g0$b;
    .locals 0

    invoke-direct {p0, p1}, Lhj/g0$b;->k(Lhj/g0$b;)Lhj/g0$b;

    move-result-object p0

    return-object p0
.end method

.method static synthetic g(Lhj/g0$b;Lhj/g0$b;)Lhj/g0$b;
    .locals 0

    invoke-direct {p0, p1}, Lhj/g0$b;->m(Lhj/g0$b;)Lhj/g0$b;

    move-result-object p0

    return-object p0
.end method

.method static synthetic h(Lhj/g0$b;Lhj/g0$b;)Lhj/g0$b;
    .locals 0

    invoke-direct {p0, p1}, Lhj/g0$b;->l(Lhj/g0$b;)Lhj/g0$b;

    move-result-object p0

    return-object p0
.end method

.method static synthetic i(Lhj/g0$b;Lnet/time4j/tz/k;)Lhj/g0$b;
    .locals 0

    invoke-direct {p0, p1}, Lhj/g0$b;->j(Lnet/time4j/tz/k;)Lhj/g0$b;

    move-result-object p0

    return-object p0
.end method

.method private j(Lnet/time4j/tz/k;)Lhj/g0$b;
    .locals 6

    .line 1
    new-instance v5, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lhj/g0$b;->e:Ljava/util/List;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-interface {v5, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-interface {v5, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    new-instance p1, Lhj/g0$b;

    .line 17
    .line 18
    iget-char v1, p0, Lhj/g0$b;->a:C

    .line 19
    .line 20
    iget-object v2, p0, Lhj/g0$b;->b:Lhj/g0$b;

    .line 21
    .line 22
    iget-object v3, p0, Lhj/g0$b;->c:Lhj/g0$b;

    .line 23
    .line 24
    iget-object v4, p0, Lhj/g0$b;->d:Lhj/g0$b;

    .line 25
    .line 26
    move-object v0, p1

    .line 27
    invoke-direct/range {v0 .. v5}, Lhj/g0$b;-><init>(CLhj/g0$b;Lhj/g0$b;Lhj/g0$b;Ljava/util/List;)V

    .line 28
    .line 29
    .line 30
    return-object p1
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

.method private k(Lhj/g0$b;)Lhj/g0$b;
    .locals 7

    new-instance v6, Lhj/g0$b;

    iget-char v1, p0, Lhj/g0$b;->a:C

    iget-object v3, p0, Lhj/g0$b;->c:Lhj/g0$b;

    iget-object v4, p0, Lhj/g0$b;->d:Lhj/g0$b;

    iget-object v5, p0, Lhj/g0$b;->e:Ljava/util/List;

    move-object v0, v6

    move-object v2, p1

    invoke-direct/range {v0 .. v5}, Lhj/g0$b;-><init>(CLhj/g0$b;Lhj/g0$b;Lhj/g0$b;Ljava/util/List;)V

    return-object v6
.end method

.method private l(Lhj/g0$b;)Lhj/g0$b;
    .locals 7

    new-instance v6, Lhj/g0$b;

    iget-char v1, p0, Lhj/g0$b;->a:C

    iget-object v2, p0, Lhj/g0$b;->b:Lhj/g0$b;

    iget-object v4, p0, Lhj/g0$b;->d:Lhj/g0$b;

    iget-object v5, p0, Lhj/g0$b;->e:Ljava/util/List;

    move-object v0, v6

    move-object v3, p1

    invoke-direct/range {v0 .. v5}, Lhj/g0$b;-><init>(CLhj/g0$b;Lhj/g0$b;Lhj/g0$b;Ljava/util/List;)V

    return-object v6
.end method

.method private m(Lhj/g0$b;)Lhj/g0$b;
    .locals 7

    new-instance v6, Lhj/g0$b;

    iget-char v1, p0, Lhj/g0$b;->a:C

    iget-object v2, p0, Lhj/g0$b;->b:Lhj/g0$b;

    iget-object v3, p0, Lhj/g0$b;->c:Lhj/g0$b;

    iget-object v5, p0, Lhj/g0$b;->e:Ljava/util/List;

    move-object v0, v6

    move-object v4, p1

    invoke-direct/range {v0 .. v5}, Lhj/g0$b;-><init>(CLhj/g0$b;Lhj/g0$b;Lhj/g0$b;Ljava/util/List;)V

    return-object v6
.end method
