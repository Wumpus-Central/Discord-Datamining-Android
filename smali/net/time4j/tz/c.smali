.class final Lnet/time4j/tz/c;
.super Lnet/time4j/tz/l;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = 0x1821d8c1a900067dL


# instance fields
.field private final transient F:Lnet/time4j/tz/k;

.field private final transient G:Lnet/time4j/tz/m;

.field private final transient H:Lnet/time4j/tz/o;


# direct methods
.method constructor <init>(Lnet/time4j/tz/k;Lnet/time4j/tz/m;)V
    .locals 1

    .line 1
    sget-object v0, Lnet/time4j/tz/l;->n:Lnet/time4j/tz/o;

    invoke-direct {p0, p1, p2, v0}, Lnet/time4j/tz/c;-><init>(Lnet/time4j/tz/k;Lnet/time4j/tz/m;Lnet/time4j/tz/o;)V

    return-void
.end method

.method constructor <init>(Lnet/time4j/tz/k;Lnet/time4j/tz/m;Lnet/time4j/tz/o;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Lnet/time4j/tz/l;-><init>()V

    if-eqz p1, :cond_4

    .line 3
    instance-of v0, p1, Lnet/time4j/tz/p;

    if-eqz v0, :cond_1

    .line 4
    invoke-interface {p2}, Lnet/time4j/tz/m;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Fixed zonal offset can\'t be combined with offset transitions: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 6
    invoke-interface {p1}, Lnet/time4j/tz/k;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    :goto_0
    if-eqz p2, :cond_3

    if-eqz p3, :cond_2

    .line 7
    iput-object p1, p0, Lnet/time4j/tz/c;->F:Lnet/time4j/tz/k;

    .line 8
    iput-object p2, p0, Lnet/time4j/tz/c;->G:Lnet/time4j/tz/m;

    .line 9
    iput-object p3, p0, Lnet/time4j/tz/c;->H:Lnet/time4j/tz/o;

    return-void

    .line 10
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Missing transition strategy."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 11
    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Missing timezone history."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 12
    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Missing timezone id."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Serialization proxy required."

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private writeReplace()Ljava/lang/Object;
    .locals 2

    new-instance v0, Lnet/time4j/tz/SPX;

    const/16 v1, 0xe

    invoke-direct {v0, p0, v1}, Lnet/time4j/tz/SPX;-><init>(Ljava/lang/Object;I)V

    return-object v0
.end method


# virtual methods
.method public A(Lnet/time4j/base/a;Lnet/time4j/base/g;)Lnet/time4j/tz/p;
    .locals 3

    .line 1
    iget-object v0, p0, Lnet/time4j/tz/c;->G:Lnet/time4j/tz/m;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lnet/time4j/tz/m;->c(Lnet/time4j/base/a;Lnet/time4j/base/g;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x1

    .line 12
    if-ne v1, v2, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Lnet/time4j/tz/p;

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    iget-object v0, p0, Lnet/time4j/tz/c;->G:Lnet/time4j/tz/m;

    .line 23
    .line 24
    invoke-interface {v0, p1, p2}, Lnet/time4j/tz/m;->a(Lnet/time4j/base/a;Lnet/time4j/base/g;)Lnet/time4j/tz/q;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1}, Lnet/time4j/tz/q;->k()I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    invoke-static {p1}, Lnet/time4j/tz/p;->r(I)Lnet/time4j/tz/p;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    return-object p1
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

.method public B(Lnet/time4j/base/f;)Lnet/time4j/tz/p;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/time4j/tz/c;->G:Lnet/time4j/tz/m;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lnet/time4j/tz/m;->d(Lnet/time4j/base/f;)Lnet/time4j/tz/q;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lnet/time4j/tz/c;->G:Lnet/time4j/tz/m;

    .line 10
    .line 11
    invoke-interface {p1}, Lnet/time4j/tz/m;->b()Lnet/time4j/tz/p;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p1}, Lnet/time4j/tz/q;->k()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-static {p1}, Lnet/time4j/tz/p;->r(I)Lnet/time4j/tz/p;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    :goto_0
    return-object p1
    .line 25
    .line 26
    .line 27
.end method

.method public E()Lnet/time4j/tz/o;
    .locals 1

    iget-object v0, p0, Lnet/time4j/tz/c;->H:Lnet/time4j/tz/o;

    return-object v0
.end method

.method public I(Lnet/time4j/base/f;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lnet/time4j/tz/c;->G:Lnet/time4j/tz/m;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lnet/time4j/tz/m;->d(Lnet/time4j/base/f;)Lnet/time4j/tz/q;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v0, 0x0

    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    return v0

    .line 11
    :cond_0
    invoke-virtual {p1}, Lnet/time4j/tz/q;->e()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x1

    .line 16
    if-lez v1, :cond_1

    .line 17
    .line 18
    return v2

    .line 19
    :cond_1
    if-gez v1, :cond_2

    .line 20
    .line 21
    return v0

    .line 22
    :cond_2
    iget-object v1, p0, Lnet/time4j/tz/c;->G:Lnet/time4j/tz/m;

    .line 23
    .line 24
    invoke-interface {v1}, Lnet/time4j/tz/m;->e()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_3

    .line 29
    .line 30
    return v0

    .line 31
    :cond_3
    invoke-virtual {p1}, Lnet/time4j/tz/q;->f()J

    .line 32
    .line 33
    .line 34
    move-result-wide v3

    .line 35
    invoke-static {v3, v4, v0}, Lnet/time4j/tz/i;->b(JI)Lnet/time4j/base/f;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    iget-object v3, p0, Lnet/time4j/tz/c;->G:Lnet/time4j/tz/m;

    .line 40
    .line 41
    invoke-interface {v3, v1}, Lnet/time4j/tz/m;->d(Lnet/time4j/base/f;)Lnet/time4j/tz/q;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    if-nez v3, :cond_4

    .line 46
    .line 47
    return v0

    .line 48
    :cond_4
    invoke-virtual {v3}, Lnet/time4j/tz/q;->j()I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    invoke-virtual {p1}, Lnet/time4j/tz/q;->j()I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-ne v4, p1, :cond_6

    .line 57
    .line 58
    invoke-virtual {v3}, Lnet/time4j/tz/q;->e()I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-gez p1, :cond_5

    .line 63
    .line 64
    move v0, v2

    .line 65
    :cond_5
    return v0

    .line 66
    :cond_6
    invoke-virtual {p0, v1}, Lnet/time4j/tz/c;->I(Lnet/time4j/base/f;)Z

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    return p1
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

.method public J()Z
    .locals 1

    iget-object v0, p0, Lnet/time4j/tz/c;->G:Lnet/time4j/tz/m;

    invoke-interface {v0}, Lnet/time4j/tz/m;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public K(Lnet/time4j/base/a;Lnet/time4j/base/g;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/time4j/tz/c;->G:Lnet/time4j/tz/m;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lnet/time4j/tz/m;->a(Lnet/time4j/base/a;Lnet/time4j/base/g;)Lnet/time4j/tz/q;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Lnet/time4j/tz/q;->l()Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    :goto_0
    return p1
    .line 19
    .line 20
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

.method public Q(Lnet/time4j/tz/o;)Lnet/time4j/tz/l;
    .locals 3

    .line 1
    iget-object v0, p0, Lnet/time4j/tz/c;->H:Lnet/time4j/tz/o;

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Lnet/time4j/tz/c;

    .line 7
    .line 8
    iget-object v1, p0, Lnet/time4j/tz/c;->F:Lnet/time4j/tz/k;

    .line 9
    .line 10
    iget-object v2, p0, Lnet/time4j/tz/c;->G:Lnet/time4j/tz/m;

    .line 11
    .line 12
    invoke-direct {v0, v1, v2, p1}, Lnet/time4j/tz/c;-><init>(Lnet/time4j/tz/k;Lnet/time4j/tz/m;Lnet/time4j/tz/o;)V

    .line 13
    .line 14
    .line 15
    return-object v0
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
    instance-of v1, p1, Lnet/time4j/tz/c;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_2

    .line 9
    .line 10
    check-cast p1, Lnet/time4j/tz/c;

    .line 11
    .line 12
    iget-object v1, p0, Lnet/time4j/tz/c;->F:Lnet/time4j/tz/k;

    .line 13
    .line 14
    invoke-interface {v1}, Lnet/time4j/tz/k;->a()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iget-object v3, p1, Lnet/time4j/tz/c;->F:Lnet/time4j/tz/k;

    .line 19
    .line 20
    invoke-interface {v3}, Lnet/time4j/tz/k;->a()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    iget-object v1, p0, Lnet/time4j/tz/c;->G:Lnet/time4j/tz/m;

    .line 31
    .line 32
    iget-object v3, p1, Lnet/time4j/tz/c;->G:Lnet/time4j/tz/m;

    .line 33
    .line 34
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    iget-object v1, p0, Lnet/time4j/tz/c;->H:Lnet/time4j/tz/o;

    .line 41
    .line 42
    iget-object p1, p1, Lnet/time4j/tz/c;->H:Lnet/time4j/tz/o;

    .line 43
    .line 44
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-eqz p1, :cond_1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    move v0, v2

    .line 52
    :goto_0
    return v0

    .line 53
    :cond_2
    return v2
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

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lnet/time4j/tz/c;->F:Lnet/time4j/tz/k;

    invoke-interface {v0}, Lnet/time4j/tz/k;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

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
    const-class v1, Lnet/time4j/tz/c;

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
    iget-object v1, p0, Lnet/time4j/tz/c;->F:Lnet/time4j/tz/k;

    .line 28
    .line 29
    invoke-interface {v1}, Lnet/time4j/tz/k;->a()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v1, ",history={"

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Lnet/time4j/tz/c;->G:Lnet/time4j/tz/m;

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v1, "},strategy="

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    iget-object v1, p0, Lnet/time4j/tz/c;->H:Lnet/time4j/tz/o;

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const/16 v1, 0x5d

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    return-object v0
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

.method public y()Lnet/time4j/tz/m;
    .locals 1

    iget-object v0, p0, Lnet/time4j/tz/c;->G:Lnet/time4j/tz/m;

    return-object v0
.end method

.method public z()Lnet/time4j/tz/k;
    .locals 1

    iget-object v0, p0, Lnet/time4j/tz/c;->F:Lnet/time4j/tz/k;

    return-object v0
.end method
