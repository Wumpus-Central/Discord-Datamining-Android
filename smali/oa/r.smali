.class public final Loa/r;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Loa/k;

.field private final b:Z

.field private final c:Loa/o;


# direct methods
.method private constructor <init>(Loa/o;ZLoa/k;I[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Loa/r;->c:Loa/o;

    iput-boolean p2, p0, Loa/r;->b:Z

    iput-object p3, p0, Loa/r;->a:Loa/k;

    return-void
.end method

.method static synthetic a(Loa/r;)Loa/k;
    .locals 0

    iget-object p0, p0, Loa/r;->a:Loa/k;

    return-object p0
.end method

.method public static c(Loa/k;)Loa/r;
    .locals 7

    new-instance v6, Loa/r;

    new-instance v1, Loa/o;

    invoke-direct {v1, p0}, Loa/o;-><init>(Loa/k;)V

    const/4 v2, 0x0

    sget-object v3, Loa/j;->b:Loa/j;

    const v4, 0x7fffffff

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Loa/r;-><init>(Loa/o;ZLoa/k;I[B)V

    return-object v6
.end method

.method static synthetic e(Loa/r;Ljava/lang/CharSequence;)Ljava/util/Iterator;
    .locals 0

    invoke-direct {p0, p1}, Loa/r;->h(Ljava/lang/CharSequence;)Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method static synthetic g(Loa/r;)Z
    .locals 0

    iget-boolean p0, p0, Loa/r;->b:Z

    return p0
.end method

.method private final h(Ljava/lang/CharSequence;)Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            ")",
            "Ljava/util/Iterator<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Loa/r;->c:Loa/o;

    new-instance v1, Loa/n;

    invoke-direct {v1, v0, p0, p1}, Loa/n;-><init>(Loa/o;Loa/r;Ljava/lang/CharSequence;)V

    return-object v1
.end method


# virtual methods
.method public final b()Loa/r;
    .locals 7

    new-instance v6, Loa/r;

    iget-object v1, p0, Loa/r;->c:Loa/o;

    const/4 v2, 0x1

    iget-object v3, p0, Loa/r;->a:Loa/k;

    const v4, 0x7fffffff

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Loa/r;-><init>(Loa/o;ZLoa/k;I[B)V

    return-object v6
.end method

.method public final d(Ljava/lang/CharSequence;)Ljava/lang/Iterable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            ")",
            "Ljava/lang/Iterable<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Loa/p;

    invoke-direct {v0, p0, p1}, Loa/p;-><init>(Loa/r;Ljava/lang/CharSequence;)V

    return-object v0
.end method

.method public final f(Ljava/lang/CharSequence;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Loa/r;->h(Ljava/lang/CharSequence;)Ljava/util/Iterator;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Ljava/lang/String;

    .line 24
    .line 25
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1
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
