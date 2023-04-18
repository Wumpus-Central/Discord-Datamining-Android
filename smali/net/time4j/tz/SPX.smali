.class final Lnet/time4j/tz/SPX;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Externalizable;


# static fields
.field private static final serialVersionUID:J = -0xde3794b7e47ba6cL


# instance fields
.field private transient k:Ljava/lang/Object;

.field private transient l:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lnet/time4j/tz/SPX;->k:Ljava/lang/Object;

    .line 4
    iput p2, p0, Lnet/time4j/tz/SPX;->l:I

    return-void
.end method

.method private a(Ljava/io/ObjectInput;B)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-interface {p1}, Ljava/io/ObjectInput;->readObject()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    check-cast p2, Lnet/time4j/tz/k;

    .line 6
    .line 7
    invoke-interface {p1}, Ljava/io/ObjectInput;->readObject()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lnet/time4j/tz/l;

    .line 12
    .line 13
    new-instance v0, Lnet/time4j/tz/a;

    .line 14
    .line 15
    invoke-direct {v0, p2, p1}, Lnet/time4j/tz/a;-><init>(Lnet/time4j/tz/k;Lnet/time4j/tz/l;)V

    .line 16
    .line 17
    .line 18
    return-object v0
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

.method private b(Ljava/io/ObjectInput;B)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-interface {p1}, Ljava/io/DataInput;->readInt()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    and-int/lit8 p2, p2, 0xf

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-ne p2, v1, :cond_0

    .line 9
    .line 10
    invoke-interface {p1}, Ljava/io/DataInput;->readInt()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    :goto_0
    invoke-static {v0, p1}, Lnet/time4j/tz/p;->s(II)Lnet/time4j/tz/p;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
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

.method private c(B)Ljava/lang/Object;
    .locals 2

    .line 1
    and-int/lit8 p1, p1, 0xf

    .line 2
    .line 3
    invoke-static {}, Lnet/time4j/tz/b;->values()[Lnet/time4j/tz/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    div-int/lit8 v1, p1, 0x2

    .line 8
    .line 9
    aget-object v0, v0, v1

    .line 10
    .line 11
    invoke-static {}, Lnet/time4j/tz/g;->values()[Lnet/time4j/tz/g;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    rem-int/lit8 p1, p1, 0x2

    .line 16
    .line 17
    aget-object p1, v1, p1

    .line 18
    .line 19
    invoke-static {v0, p1}, Lnet/time4j/tz/n;->d(Lnet/time4j/tz/b;Lnet/time4j/tz/g;)Lnet/time4j/tz/n;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method private d(Ljava/io/ObjectInput;B)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-interface {p1}, Ljava/io/ObjectInput;->readObject()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lnet/time4j/tz/k;

    .line 6
    .line 7
    invoke-interface {p1}, Ljava/io/ObjectInput;->readObject()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Lnet/time4j/tz/m;

    .line 12
    .line 13
    sget-object v2, Lnet/time4j/tz/l;->n:Lnet/time4j/tz/o;

    .line 14
    .line 15
    and-int/lit8 p2, p2, 0xf

    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    if-ne p2, v3, :cond_0

    .line 19
    .line 20
    invoke-interface {p1}, Ljava/io/ObjectInput;->readObject()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    move-object v2, p1

    .line 25
    check-cast v2, Lnet/time4j/tz/o;

    .line 26
    .line 27
    :cond_0
    new-instance p1, Lnet/time4j/tz/c;

    .line 28
    .line 29
    invoke-direct {p1, v0, v1, v2}, Lnet/time4j/tz/c;-><init>(Lnet/time4j/tz/k;Lnet/time4j/tz/m;Lnet/time4j/tz/o;)V

    .line 30
    .line 31
    .line 32
    return-object p1
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

.method private e(Ljava/io/ObjectOutput;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/time4j/tz/SPX;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lnet/time4j/tz/a;

    .line 4
    .line 5
    const/16 v1, 0xc0

    .line 6
    .line 7
    invoke-interface {p1, v1}, Ljava/io/DataOutput;->writeByte(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lnet/time4j/tz/a;->z()Lnet/time4j/tz/k;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-interface {p1, v1}, Ljava/io/ObjectOutput;->writeObject(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lnet/time4j/tz/a;->R()Lnet/time4j/tz/l;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {p1, v0}, Ljava/io/ObjectOutput;->writeObject(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void
    .line 25
    .line 26
    .line 27
.end method

.method private f(Ljava/io/ObjectOutput;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lnet/time4j/tz/SPX;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lnet/time4j/tz/p;

    .line 4
    .line 5
    invoke-virtual {v0}, Lnet/time4j/tz/p;->k()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v1, 0x0

    .line 14
    :goto_0
    if-eqz v1, :cond_1

    .line 15
    .line 16
    const/16 v2, 0xf1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    const/16 v2, 0xf0

    .line 20
    .line 21
    :goto_1
    invoke-interface {p1, v2}, Ljava/io/DataOutput;->writeByte(I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lnet/time4j/tz/p;->l()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    invoke-interface {p1, v2}, Ljava/io/DataOutput;->writeInt(I)V

    .line 29
    .line 30
    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    invoke-virtual {v0}, Lnet/time4j/tz/p;->k()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeInt(I)V

    .line 38
    .line 39
    .line 40
    :cond_2
    return-void
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

.method private g(Ljava/io/ObjectOutput;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/time4j/tz/SPX;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lnet/time4j/tz/n;

    .line 4
    .line 5
    invoke-virtual {v0}, Lnet/time4j/tz/n;->c()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    or-int/lit16 v0, v0, 0xd0

    .line 10
    .line 11
    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeByte(I)V

    .line 12
    .line 13
    .line 14
    return-void
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

.method private h(Ljava/io/ObjectOutput;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lnet/time4j/tz/SPX;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lnet/time4j/tz/c;

    .line 4
    .line 5
    invoke-virtual {v0}, Lnet/time4j/tz/c;->E()Lnet/time4j/tz/o;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget-object v2, Lnet/time4j/tz/l;->n:Lnet/time4j/tz/o;

    .line 10
    .line 11
    if-eq v1, v2, :cond_0

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v1, 0x0

    .line 16
    :goto_0
    if-eqz v1, :cond_1

    .line 17
    .line 18
    const/16 v2, 0xe1

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    const/16 v2, 0xe0

    .line 22
    .line 23
    :goto_1
    invoke-interface {p1, v2}, Ljava/io/DataOutput;->writeByte(I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Lnet/time4j/tz/c;->z()Lnet/time4j/tz/k;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-interface {p1, v2}, Ljava/io/ObjectOutput;->writeObject(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Lnet/time4j/tz/c;->y()Lnet/time4j/tz/m;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-interface {p1, v2}, Ljava/io/ObjectOutput;->writeObject(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    if-eqz v1, :cond_2

    .line 41
    .line 42
    invoke-virtual {v0}, Lnet/time4j/tz/c;->E()Lnet/time4j/tz/o;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-interface {p1, v0}, Ljava/io/ObjectOutput;->writeObject(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    :cond_2
    return-void
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

.method private readResolve()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lnet/time4j/tz/SPX;->k:Ljava/lang/Object;

    return-object v0
.end method


# virtual methods
.method public readExternal(Ljava/io/ObjectInput;)V
    .locals 2

    .line 1
    invoke-interface {p1}, Ljava/io/DataInput;->readByte()B

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    and-int/lit16 v1, v0, 0xff

    .line 6
    .line 7
    shr-int/lit8 v1, v1, 0x4

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance p1, Ljava/io/StreamCorruptedException;

    .line 13
    .line 14
    const-string v0, "Unknown serialized type."

    .line 15
    .line 16
    invoke-direct {p1, v0}, Ljava/io/StreamCorruptedException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p1

    .line 20
    :pswitch_0
    invoke-direct {p0, p1, v0}, Lnet/time4j/tz/SPX;->b(Ljava/io/ObjectInput;B)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, Lnet/time4j/tz/SPX;->k:Ljava/lang/Object;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :pswitch_1
    invoke-direct {p0, p1, v0}, Lnet/time4j/tz/SPX;->d(Ljava/io/ObjectInput;B)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iput-object p1, p0, Lnet/time4j/tz/SPX;->k:Ljava/lang/Object;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :pswitch_2
    invoke-direct {p0, v0}, Lnet/time4j/tz/SPX;->c(B)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, p0, Lnet/time4j/tz/SPX;->k:Ljava/lang/Object;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :pswitch_3
    invoke-direct {p0, p1, v0}, Lnet/time4j/tz/SPX;->a(Ljava/io/ObjectInput;B)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iput-object p1, p0, Lnet/time4j/tz/SPX;->k:Ljava/lang/Object;

    .line 46
    .line 47
    :goto_0
    return-void

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public writeExternal(Ljava/io/ObjectOutput;)V
    .locals 1

    .line 1
    iget v0, p0, Lnet/time4j/tz/SPX;->l:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/io/InvalidClassException;

    .line 7
    .line 8
    const-string v0, "Unknown serialized type."

    .line 9
    .line 10
    invoke-direct {p1, v0}, Ljava/io/InvalidClassException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p1

    .line 14
    :pswitch_0
    invoke-direct {p0, p1}, Lnet/time4j/tz/SPX;->f(Ljava/io/ObjectOutput;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :pswitch_1
    invoke-direct {p0, p1}, Lnet/time4j/tz/SPX;->h(Ljava/io/ObjectOutput;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :pswitch_2
    invoke-direct {p0, p1}, Lnet/time4j/tz/SPX;->g(Ljava/io/ObjectOutput;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :pswitch_3
    invoke-direct {p0, p1}, Lnet/time4j/tz/SPX;->e(Ljava/io/ObjectOutput;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    return-void

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
