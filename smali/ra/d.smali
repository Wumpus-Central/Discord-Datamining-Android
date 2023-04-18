.class final Lra/d;
.super Lra/f0;
.source "SourceFile"


# instance fields
.field private final transient m:Lra/e0;

.field private final transient n:[Ljava/lang/Object;

.field private final transient o:I


# direct methods
.method constructor <init>(Lra/e0;[Ljava/lang/Object;II)V
    .locals 0

    invoke-direct {p0}, Lra/f0;-><init>()V

    iput-object p1, p0, Lra/d;->m:Lra/e0;

    iput-object p2, p0, Lra/d;->n:[Ljava/lang/Object;

    iput p4, p0, Lra/d;->o:I

    return-void
.end method

.method static synthetic r(Lra/d;)I
    .locals 0

    iget p0, p0, Lra/d;->o:I

    return p0
.end method

.method static synthetic s(Lra/d;)[Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lra/d;->n:[Ljava/lang/Object;

    return-object p0
.end method


# virtual methods
.method final b([Ljava/lang/Object;I)I
    .locals 1

    invoke-virtual {p0}, Lra/y;->h()Lra/b0;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Lra/y;->b([Ljava/lang/Object;I)I

    move-result p1

    return p1
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Ljava/util/Map$Entry;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p1, Ljava/util/Map$Entry;

    .line 7
    .line 8
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    iget-object v2, p0, Lra/d;->m:Lra/e0;

    .line 19
    .line 20
    invoke-virtual {v2, v0}, Lra/e0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    const/4 p1, 0x1

    .line 31
    return p1

    .line 32
    :cond_0
    return v1
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

.method public final i()Lra/i;
    .locals 2

    invoke-virtual {p0}, Lra/y;->h()Lra/b0;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lra/b0;->v(I)Lra/j;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic iterator()Ljava/util/Iterator;
    .locals 2

    invoke-virtual {p0}, Lra/y;->h()Lra/b0;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lra/b0;->v(I)Lra/j;

    move-result-object v0

    return-object v0
.end method

.method final q()Lra/b0;
    .locals 1

    new-instance v0, Lra/c;

    invoke-direct {v0, p0}, Lra/c;-><init>(Lra/d;)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lra/d;->o:I

    return v0
.end method
