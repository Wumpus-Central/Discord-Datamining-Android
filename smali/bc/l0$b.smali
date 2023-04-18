.class public Lbc/l0$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbc/l0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field a:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "-TV;>;"
        }
    .end annotation
.end field

.field b:[Ljava/util/Map$Entry;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field c:I

.field d:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x4

    .line 1
    invoke-direct {p0, v0}, Lbc/l0$b;-><init>(I)V

    return-void
.end method

.method constructor <init>(I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-array p1, p1, [Ljava/util/Map$Entry;

    iput-object p1, p0, Lbc/l0$b;->b:[Ljava/util/Map$Entry;

    const/4 p1, 0x0

    .line 4
    iput p1, p0, Lbc/l0$b;->c:I

    .line 5
    iput-boolean p1, p0, Lbc/l0$b;->d:Z

    return-void
.end method

.method private c(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lbc/l0$b;->b:[Ljava/util/Map$Entry;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    if-le p1, v1, :cond_0

    .line 5
    .line 6
    array-length v1, v0

    .line 7
    invoke-static {v1, p1}, Lbc/d0$a;->a(II)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, [Ljava/util/Map$Entry;

    .line 16
    .line 17
    iput-object p1, p0, Lbc/l0$b;->b:[Ljava/util/Map$Entry;

    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    iput-boolean p1, p0, Lbc/l0$b;->d:Z

    .line 21
    .line 22
    :cond_0
    return-void
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method


# virtual methods
.method public a()Lbc/l0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lbc/l0<",
            "TK;TV;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lbc/l0$b;->b()Lbc/l0;

    move-result-object v0

    return-object v0
.end method

.method public b()Lbc/l0;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lbc/l0<",
            "TK;TV;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lbc/l0$b;->a:Ljava/util/Comparator;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-boolean v0, p0, Lbc/l0$b;->d:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lbc/l0$b;->b:[Ljava/util/Map$Entry;

    .line 11
    .line 12
    iget v2, p0, Lbc/l0$b;->c:I

    .line 13
    .line 14
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, [Ljava/util/Map$Entry;

    .line 19
    .line 20
    iput-object v0, p0, Lbc/l0$b;->b:[Ljava/util/Map$Entry;

    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Lbc/l0$b;->b:[Ljava/util/Map$Entry;

    .line 23
    .line 24
    iget v2, p0, Lbc/l0$b;->c:I

    .line 25
    .line 26
    iget-object v3, p0, Lbc/l0$b;->a:Ljava/util/Comparator;

    .line 27
    .line 28
    invoke-static {v3}, Lbc/r1;->a(Ljava/util/Comparator;)Lbc/r1;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-static {}, Lbc/h1;->n()Lac/f;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-virtual {v3, v4}, Lbc/r1;->j(Lac/f;)Lbc/r1;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-static {v0, v1, v2, v3}, Ljava/util/Arrays;->sort([Ljava/lang/Object;IILjava/util/Comparator;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    iget v0, p0, Lbc/l0$b;->c:I

    .line 44
    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    const/4 v2, 0x1

    .line 48
    if-eq v0, v2, :cond_2

    .line 49
    .line 50
    iput-boolean v2, p0, Lbc/l0$b;->d:Z

    .line 51
    .line 52
    iget-object v1, p0, Lbc/l0$b;->b:[Ljava/util/Map$Entry;

    .line 53
    .line 54
    invoke-static {v0, v1}, Lbc/v1;->w(I[Ljava/util/Map$Entry;)Lbc/l0;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    return-object v0

    .line 59
    :cond_2
    iget-object v0, p0, Lbc/l0$b;->b:[Ljava/util/Map$Entry;

    .line 60
    .line 61
    aget-object v0, v0, v1

    .line 62
    .line 63
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    check-cast v0, Ljava/util/Map$Entry;

    .line 67
    .line 68
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-static {v1, v0}, Lbc/l0;->s(Ljava/lang/Object;Ljava/lang/Object;)Lbc/l0;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    return-object v0

    .line 81
    :cond_3
    invoke-static {}, Lbc/l0;->r()Lbc/l0;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    return-object v0
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

.method public d(Ljava/lang/Object;Ljava/lang/Object;)Lbc/l0$b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)",
            "Lbc/l0$b<",
            "TK;TV;>;"
        }
    .end annotation

    .line 1
    iget v0, p0, Lbc/l0$b;->c:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-direct {p0, v0}, Lbc/l0$b;->c(I)V

    .line 6
    .line 7
    .line 8
    invoke-static {p1, p2}, Lbc/l0;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object p2, p0, Lbc/l0$b;->b:[Ljava/util/Map$Entry;

    .line 13
    .line 14
    iget v0, p0, Lbc/l0$b;->c:I

    .line 15
    .line 16
    add-int/lit8 v1, v0, 0x1

    .line 17
    .line 18
    iput v1, p0, Lbc/l0$b;->c:I

    .line 19
    .line 20
    aput-object p1, p2, v0

    .line 21
    .line 22
    return-object p0
    .line 23
    .line 24
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
