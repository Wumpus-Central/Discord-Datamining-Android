.class final Lnet/time4j/tz/j;
.super Lnet/time4j/tz/l;
.source "SourceFile"

# interfaces
.implements Lnet/time4j/tz/m;


# static fields
.field private static final F:Lnet/time4j/tz/j;

.field private static final serialVersionUID:J = 0x6c58daac73d8cdf2L


# instance fields
.field private final offset:Lnet/time4j/tz/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lnet/time4j/tz/j;

    sget-object v1, Lnet/time4j/tz/p;->u:Lnet/time4j/tz/p;

    invoke-direct {v0, v1}, Lnet/time4j/tz/j;-><init>(Lnet/time4j/tz/p;)V

    sput-object v0, Lnet/time4j/tz/j;->F:Lnet/time4j/tz/j;

    return-void
.end method

.method private constructor <init>(Lnet/time4j/tz/p;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lnet/time4j/tz/l;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lnet/time4j/tz/p;->k()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iput-object p1, p0, Lnet/time4j/tz/j;->offset:Lnet/time4j/tz/p;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {p1}, Lnet/time4j/tz/p;->l()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-virtual {p1}, Lnet/time4j/tz/p;->k()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-gez p1, :cond_1

    .line 22
    .line 23
    add-int/lit8 v0, v0, -0x1

    .line 24
    .line 25
    :cond_1
    invoke-static {v0}, Lnet/time4j/tz/p;->r(I)Lnet/time4j/tz/p;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, Lnet/time4j/tz/j;->offset:Lnet/time4j/tz/p;

    .line 30
    .line 31
    :goto_0
    return-void
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

.method static R(Lnet/time4j/tz/p;)Lnet/time4j/tz/j;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lnet/time4j/tz/p;->l()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lnet/time4j/tz/p;->k()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    sget-object p0, Lnet/time4j/tz/j;->F:Lnet/time4j/tz/j;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    new-instance v0, Lnet/time4j/tz/j;

    .line 17
    .line 18
    invoke-direct {v0, p0}, Lnet/time4j/tz/j;-><init>(Lnet/time4j/tz/p;)V

    .line 19
    .line 20
    .line 21
    return-object v0
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lnet/time4j/tz/j;->offset:Lnet/time4j/tz/p;

    .line 5
    .line 6
    invoke-virtual {p1}, Lnet/time4j/tz/p;->k()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    new-instance p1, Ljava/io/InvalidObjectException;

    .line 14
    .line 15
    const-string v0, "Fractional offset is invalid."

    .line 16
    .line 17
    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p1
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method


# virtual methods
.method public A(Lnet/time4j/base/a;Lnet/time4j/base/g;)Lnet/time4j/tz/p;
    .locals 0

    iget-object p1, p0, Lnet/time4j/tz/j;->offset:Lnet/time4j/tz/p;

    return-object p1
.end method

.method public B(Lnet/time4j/base/f;)Lnet/time4j/tz/p;
    .locals 0

    iget-object p1, p0, Lnet/time4j/tz/j;->offset:Lnet/time4j/tz/p;

    return-object p1
.end method

.method public E()Lnet/time4j/tz/o;
    .locals 1

    sget-object v0, Lnet/time4j/tz/l;->n:Lnet/time4j/tz/o;

    return-object v0
.end method

.method public I(Lnet/time4j/base/f;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public J()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public K(Lnet/time4j/base/a;Lnet/time4j/base/g;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public Q(Lnet/time4j/tz/o;)Lnet/time4j/tz/l;
    .locals 0

    return-object p0
.end method

.method public a(Lnet/time4j/base/a;Lnet/time4j/base/g;)Lnet/time4j/tz/q;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public b()Lnet/time4j/tz/p;
    .locals 1

    iget-object v0, p0, Lnet/time4j/tz/j;->offset:Lnet/time4j/tz/p;

    return-object v0
.end method

.method public c(Lnet/time4j/base/a;Lnet/time4j/base/g;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/time4j/base/a;",
            "Lnet/time4j/base/g;",
            ")",
            "Ljava/util/List<",
            "Lnet/time4j/tz/p;",
            ">;"
        }
    .end annotation

    iget-object p1, p0, Lnet/time4j/tz/j;->offset:Lnet/time4j/tz/p;

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public d(Lnet/time4j/base/f;)Lnet/time4j/tz/q;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public e()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    instance-of v0, p1, Lnet/time4j/tz/j;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    check-cast p1, Lnet/time4j/tz/j;

    .line 10
    .line 11
    iget-object v0, p0, Lnet/time4j/tz/j;->offset:Lnet/time4j/tz/p;

    .line 12
    .line 13
    iget-object p1, p1, Lnet/time4j/tz/j;->offset:Lnet/time4j/tz/p;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lnet/time4j/tz/p;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1

    .line 20
    :cond_1
    const/4 p1, 0x0

    .line 21
    return p1
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lnet/time4j/tz/j;->offset:Lnet/time4j/tz/p;

    invoke-virtual {v0}, Lnet/time4j/tz/p;->hashCode()I

    move-result v0

    return v0
.end method

.method public isEmpty()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const/16 v1, 0x5b

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-class v1, Lnet/time4j/tz/j;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const/16 v1, 0x3a

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, Lnet/time4j/tz/j;->offset:Lnet/time4j/tz/p;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const/16 v1, 0x5d

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

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

.method public w(Lnet/time4j/tz/d;Ljava/util/Locale;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p1}, Lnet/time4j/tz/d;->a()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lnet/time4j/tz/j;->offset:Lnet/time4j/tz/p;

    .line 8
    .line 9
    invoke-virtual {p1}, Lnet/time4j/tz/p;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object p1, p0, Lnet/time4j/tz/j;->offset:Lnet/time4j/tz/p;

    .line 15
    .line 16
    invoke-virtual {p1}, Lnet/time4j/tz/p;->a()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    :goto_0
    return-object p1
    .line 21
    .line 22
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

.method public y()Lnet/time4j/tz/m;
    .locals 0

    return-object p0
.end method

.method public z()Lnet/time4j/tz/k;
    .locals 1

    iget-object v0, p0, Lnet/time4j/tz/j;->offset:Lnet/time4j/tz/p;

    return-object v0
.end method
