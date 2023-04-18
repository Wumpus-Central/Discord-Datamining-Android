.class final Lnet/time4j/tz/a;
.super Lnet/time4j/tz/l;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = -0x282c2278fb46c4d4L


# instance fields
.field private final fallback:Lnet/time4j/tz/l;

.field private final tzid:Lnet/time4j/tz/k;


# direct methods
.method constructor <init>(Lnet/time4j/tz/k;Lnet/time4j/tz/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/time4j/tz/l;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    iput-object p1, p0, Lnet/time4j/tz/a;->tzid:Lnet/time4j/tz/k;

    .line 9
    .line 10
    iput-object p2, p0, Lnet/time4j/tz/a;->fallback:Lnet/time4j/tz/l;

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    throw p1
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

    const/16 v1, 0xc

    invoke-direct {v0, p0, v1}, Lnet/time4j/tz/SPX;-><init>(Ljava/lang/Object;I)V

    return-object v0
.end method


# virtual methods
.method public A(Lnet/time4j/base/a;Lnet/time4j/base/g;)Lnet/time4j/tz/p;
    .locals 1

    iget-object v0, p0, Lnet/time4j/tz/a;->fallback:Lnet/time4j/tz/l;

    invoke-virtual {v0, p1, p2}, Lnet/time4j/tz/l;->A(Lnet/time4j/base/a;Lnet/time4j/base/g;)Lnet/time4j/tz/p;

    move-result-object p1

    return-object p1
.end method

.method public B(Lnet/time4j/base/f;)Lnet/time4j/tz/p;
    .locals 1

    iget-object v0, p0, Lnet/time4j/tz/a;->fallback:Lnet/time4j/tz/l;

    invoke-virtual {v0, p1}, Lnet/time4j/tz/l;->B(Lnet/time4j/base/f;)Lnet/time4j/tz/p;

    move-result-object p1

    return-object p1
.end method

.method public E()Lnet/time4j/tz/o;
    .locals 1

    iget-object v0, p0, Lnet/time4j/tz/a;->fallback:Lnet/time4j/tz/l;

    invoke-virtual {v0}, Lnet/time4j/tz/l;->E()Lnet/time4j/tz/o;

    move-result-object v0

    return-object v0
.end method

.method public I(Lnet/time4j/base/f;)Z
    .locals 1

    iget-object v0, p0, Lnet/time4j/tz/a;->fallback:Lnet/time4j/tz/l;

    invoke-virtual {v0, p1}, Lnet/time4j/tz/l;->I(Lnet/time4j/base/f;)Z

    move-result p1

    return p1
.end method

.method public J()Z
    .locals 1

    iget-object v0, p0, Lnet/time4j/tz/a;->fallback:Lnet/time4j/tz/l;

    invoke-virtual {v0}, Lnet/time4j/tz/l;->J()Z

    move-result v0

    return v0
.end method

.method public K(Lnet/time4j/base/a;Lnet/time4j/base/g;)Z
    .locals 1

    iget-object v0, p0, Lnet/time4j/tz/a;->fallback:Lnet/time4j/tz/l;

    invoke-virtual {v0, p1, p2}, Lnet/time4j/tz/l;->K(Lnet/time4j/base/a;Lnet/time4j/base/g;)Z

    move-result p1

    return p1
.end method

.method public Q(Lnet/time4j/tz/o;)Lnet/time4j/tz/l;
    .locals 3

    new-instance v0, Lnet/time4j/tz/a;

    iget-object v1, p0, Lnet/time4j/tz/a;->tzid:Lnet/time4j/tz/k;

    iget-object v2, p0, Lnet/time4j/tz/a;->fallback:Lnet/time4j/tz/l;

    invoke-virtual {v2, p1}, Lnet/time4j/tz/l;->Q(Lnet/time4j/tz/o;)Lnet/time4j/tz/l;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lnet/time4j/tz/a;-><init>(Lnet/time4j/tz/k;Lnet/time4j/tz/l;)V

    return-object v0
.end method

.method R()Lnet/time4j/tz/l;
    .locals 1

    iget-object v0, p0, Lnet/time4j/tz/a;->fallback:Lnet/time4j/tz/l;

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
    instance-of v1, p1, Lnet/time4j/tz/a;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_2

    .line 9
    .line 10
    check-cast p1, Lnet/time4j/tz/a;

    .line 11
    .line 12
    iget-object v1, p0, Lnet/time4j/tz/a;->tzid:Lnet/time4j/tz/k;

    .line 13
    .line 14
    invoke-interface {v1}, Lnet/time4j/tz/k;->a()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iget-object v3, p1, Lnet/time4j/tz/a;->tzid:Lnet/time4j/tz/k;

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
    iget-object v1, p0, Lnet/time4j/tz/a;->fallback:Lnet/time4j/tz/l;

    .line 31
    .line 32
    iget-object p1, p1, Lnet/time4j/tz/a;->fallback:Lnet/time4j/tz/l;

    .line 33
    .line 34
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    move v0, v2

    .line 42
    :goto_0
    return v0

    .line 43
    :cond_2
    return v2
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

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lnet/time4j/tz/a;->tzid:Lnet/time4j/tz/k;

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
    const-class v1, Lnet/time4j/tz/a;

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
    iget-object v1, p0, Lnet/time4j/tz/a;->tzid:Lnet/time4j/tz/k;

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
    const-string v1, ",fallback="

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Lnet/time4j/tz/a;->fallback:Lnet/time4j/tz/l;

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const/16 v1, 0x5d

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    return-object v0
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

.method public y()Lnet/time4j/tz/m;
    .locals 1

    iget-object v0, p0, Lnet/time4j/tz/a;->fallback:Lnet/time4j/tz/l;

    invoke-virtual {v0}, Lnet/time4j/tz/l;->y()Lnet/time4j/tz/m;

    move-result-object v0

    return-object v0
.end method

.method public z()Lnet/time4j/tz/k;
    .locals 1

    iget-object v0, p0, Lnet/time4j/tz/a;->tzid:Lnet/time4j/tz/k;

    return-object v0
.end method
