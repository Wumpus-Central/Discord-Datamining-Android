.class public final Lac/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lac/l$b;,
        Lac/l$c;
    }
.end annotation


# instance fields
.field private final a:Lac/c;

.field private final b:Z

.field private final c:Lac/l$c;

.field private final d:I


# direct methods
.method private constructor <init>(Lac/l$c;)V
    .locals 3

    .line 1
    invoke-static {}, Lac/c;->h()Lac/c;

    move-result-object v0

    const v1, 0x7fffffff

    const/4 v2, 0x0

    invoke-direct {p0, p1, v2, v0, v1}, Lac/l;-><init>(Lac/l$c;ZLac/c;I)V

    return-void
.end method

.method private constructor <init>(Lac/l$c;ZLac/c;I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lac/l;->c:Lac/l$c;

    .line 4
    iput-boolean p2, p0, Lac/l;->b:Z

    .line 5
    iput-object p3, p0, Lac/l;->a:Lac/c;

    .line 6
    iput p4, p0, Lac/l;->d:I

    return-void
.end method

.method static synthetic a(Lac/l;)Lac/c;
    .locals 0

    iget-object p0, p0, Lac/l;->a:Lac/c;

    return-object p0
.end method

.method static synthetic b(Lac/l;)Z
    .locals 0

    iget-boolean p0, p0, Lac/l;->b:Z

    return p0
.end method

.method static synthetic c(Lac/l;)I
    .locals 0

    iget p0, p0, Lac/l;->d:I

    return p0
.end method

.method public static d(C)Lac/l;
    .locals 0

    invoke-static {p0}, Lac/c;->e(C)Lac/c;

    move-result-object p0

    invoke-static {p0}, Lac/l;->e(Lac/c;)Lac/l;

    move-result-object p0

    return-object p0
.end method

.method public static e(Lac/c;)Lac/l;
    .locals 2

    .line 1
    invoke-static {p0}, Lac/i;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lac/l;

    .line 5
    .line 6
    new-instance v1, Lac/l$a;

    .line 7
    .line 8
    invoke-direct {v1, p0}, Lac/l$a;-><init>(Lac/c;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1}, Lac/l;-><init>(Lac/l$c;)V

    .line 12
    .line 13
    .line 14
    return-object v0
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

.method private g(Ljava/lang/CharSequence;)Ljava/util/Iterator;
    .locals 1
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

    iget-object v0, p0, Lac/l;->c:Lac/l$c;

    invoke-interface {v0, p0, p1}, Lac/l$c;->a(Lac/l;Ljava/lang/CharSequence;)Ljava/util/Iterator;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public f(Ljava/lang/CharSequence;)Ljava/util/List;
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
    invoke-static {p1}, Lac/i;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Lac/l;->g(Ljava/lang/CharSequence;)Ljava/util/Iterator;

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
