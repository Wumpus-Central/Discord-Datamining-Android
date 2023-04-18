.class final Lnet/time4j/tz/model/SPX;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Externalizable;


# static fields
.field private static final serialVersionUID:J = 0x5a945e837a50d1cdL


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
    iput-object p1, p0, Lnet/time4j/tz/model/SPX;->k:Ljava/lang/Object;

    .line 4
    iput p2, p0, Lnet/time4j/tz/model/SPX;->l:I

    return-void
.end method

.method private static a(Ljava/io/ObjectInput;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lnet/time4j/tz/model/a;

    .line 2
    .line 3
    invoke-static {p0}, Lnet/time4j/tz/model/SPX;->j(Ljava/io/ObjectInput;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, p0, v1, v1}, Lnet/time4j/tz/model/a;-><init>(Ljava/util/List;ZZ)V

    .line 9
    .line 10
    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
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

.method private static b(Ljava/io/ObjectInput;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {p0}, Lnet/time4j/tz/model/SPX;->j(Ljava/io/ObjectInput;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    check-cast v2, Lnet/time4j/tz/q;

    .line 11
    .line 12
    invoke-virtual {v2}, Lnet/time4j/tz/q;->h()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    invoke-static {v2}, Lnet/time4j/tz/p;->r(I)Lnet/time4j/tz/p;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-static {p0}, Lnet/time4j/tz/model/SPX;->h(Ljava/io/ObjectInput;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-static {v2, v0, p0, v1, v1}, Lnet/time4j/tz/model/l;->g(Lnet/time4j/tz/p;Ljava/util/List;Ljava/util/List;ZZ)Lnet/time4j/tz/m;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
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

.method private static c(Ljava/io/DataInput;)Lnet/time4j/tz/model/d;
    .locals 10

    .line 1
    invoke-interface {p0}, Ljava/io/DataInput;->readByte()B

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    and-int/lit16 v0, v0, 0xff

    .line 6
    .line 7
    ushr-int/lit8 v1, v0, 0x4

    .line 8
    .line 9
    invoke-static {v1}, Lnet/time4j/b0;->e(I)Lnet/time4j/b0;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    and-int/lit8 v0, v0, 0xf

    .line 14
    .line 15
    sget-object v1, Lnet/time4j/tz/model/i;->n:[Lnet/time4j/tz/model/i;

    .line 16
    .line 17
    rem-int/lit8 v2, v0, 0x3

    .line 18
    .line 19
    aget-object v7, v1, v2

    .line 20
    .line 21
    invoke-static {v0}, Lnet/time4j/tz/model/SPX;->i(I)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-interface {p0}, Ljava/io/DataInput;->readByte()B

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    and-int/lit16 v1, v1, 0xff

    .line 30
    .line 31
    ushr-int/lit8 v4, v1, 0x3

    .line 32
    .line 33
    and-int/lit8 v1, v1, 0x7

    .line 34
    .line 35
    invoke-static {v1}, Lnet/time4j/x0;->h(I)Lnet/time4j/x0;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    invoke-interface {p0}, Ljava/io/DataInput;->readByte()B

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    and-int/lit16 v1, v1, 0xff

    .line 44
    .line 45
    ushr-int/lit8 v2, v1, 0x7

    .line 46
    .line 47
    const/4 v6, 0x1

    .line 48
    if-ne v2, v6, :cond_0

    .line 49
    .line 50
    move v9, v6

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    const/4 v2, 0x0

    .line 53
    move v9, v2

    .line 54
    :goto_0
    const/16 v2, 0x3f

    .line 55
    .line 56
    and-int/2addr v1, v2

    .line 57
    const/4 v6, -0x1

    .line 58
    if-ne v0, v6, :cond_1

    .line 59
    .line 60
    invoke-static {p0}, Lnet/time4j/tz/model/SPX;->f(Ljava/io/DataInput;)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    :cond_1
    move v8, v0

    .line 65
    if-ne v1, v2, :cond_2

    .line 66
    .line 67
    invoke-interface {p0}, Ljava/io/DataInput;->readInt()I

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    move v6, p0

    .line 72
    goto :goto_1

    .line 73
    :cond_2
    mul-int/lit16 v1, v1, 0x708

    .line 74
    .line 75
    move v6, v1

    .line 76
    :goto_1
    new-instance p0, Lnet/time4j/tz/model/c;

    .line 77
    .line 78
    move-object v2, p0

    .line 79
    invoke-direct/range {v2 .. v9}, Lnet/time4j/tz/model/c;-><init>(Lnet/time4j/b0;ILnet/time4j/x0;ILnet/time4j/tz/model/i;IZ)V

    .line 80
    .line 81
    .line 82
    return-object p0
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method private static d(Ljava/io/DataInput;)Lnet/time4j/tz/model/d;
    .locals 10

    .line 1
    invoke-interface {p0}, Ljava/io/DataInput;->readByte()B

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    and-int/lit16 v0, v0, 0xff

    .line 6
    .line 7
    ushr-int/lit8 v1, v0, 0x4

    .line 8
    .line 9
    and-int/lit8 v0, v0, 0xf

    .line 10
    .line 11
    sget-object v2, Lnet/time4j/tz/model/i;->n:[Lnet/time4j/tz/model/i;

    .line 12
    .line 13
    rem-int/lit8 v3, v0, 0x3

    .line 14
    .line 15
    aget-object v8, v2, v3

    .line 16
    .line 17
    invoke-static {v0}, Lnet/time4j/tz/model/SPX;->i(I)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-interface {p0}, Ljava/io/DataInput;->readByte()B

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    and-int/lit16 v2, v2, 0xff

    .line 26
    .line 27
    ushr-int/lit8 v6, v2, 0x3

    .line 28
    .line 29
    and-int/lit8 v2, v2, 0x7

    .line 30
    .line 31
    invoke-static {v2}, Lnet/time4j/tz/model/SPX;->n(I)I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    const/4 v3, -0x1

    .line 36
    if-ne v0, v3, :cond_0

    .line 37
    .line 38
    invoke-static {p0}, Lnet/time4j/tz/model/SPX;->f(Ljava/io/DataInput;)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    :cond_0
    move v9, v0

    .line 43
    if-ne v2, v3, :cond_1

    .line 44
    .line 45
    invoke-interface {p0}, Ljava/io/DataInput;->readInt()I

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    move v7, p0

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    move v7, v2

    .line 52
    :goto_0
    new-instance p0, Lnet/time4j/tz/model/f;

    .line 53
    .line 54
    invoke-static {v1}, Lnet/time4j/b0;->e(I)Lnet/time4j/b0;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    move-object v4, p0

    .line 59
    invoke-direct/range {v4 .. v9}, Lnet/time4j/tz/model/f;-><init>(Lnet/time4j/b0;IILnet/time4j/tz/model/i;I)V

    .line 60
    .line 61
    .line 62
    return-object p0
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

.method private static e(Ljava/io/DataInput;)Lnet/time4j/tz/model/d;
    .locals 8

    .line 1
    invoke-interface {p0}, Ljava/io/DataInput;->readByte()B

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    and-int/lit16 v0, v0, 0xff

    .line 6
    .line 7
    ushr-int/lit8 v1, v0, 0x4

    .line 8
    .line 9
    invoke-static {v1}, Lnet/time4j/b0;->e(I)Lnet/time4j/b0;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    and-int/lit8 v0, v0, 0xf

    .line 14
    .line 15
    sget-object v1, Lnet/time4j/tz/model/i;->n:[Lnet/time4j/tz/model/i;

    .line 16
    .line 17
    rem-int/lit8 v2, v0, 0x3

    .line 18
    .line 19
    aget-object v6, v1, v2

    .line 20
    .line 21
    invoke-static {v0}, Lnet/time4j/tz/model/SPX;->i(I)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-interface {p0}, Ljava/io/DataInput;->readByte()B

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    and-int/lit16 v1, v1, 0xff

    .line 30
    .line 31
    ushr-int/lit8 v2, v1, 0x5

    .line 32
    .line 33
    invoke-static {v2}, Lnet/time4j/x0;->h(I)Lnet/time4j/x0;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    const/16 v2, 0x1f

    .line 38
    .line 39
    and-int/2addr v1, v2

    .line 40
    const/4 v5, -0x1

    .line 41
    if-ne v0, v5, :cond_0

    .line 42
    .line 43
    invoke-static {p0}, Lnet/time4j/tz/model/SPX;->f(Ljava/io/DataInput;)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    :cond_0
    move v7, v0

    .line 48
    if-ne v1, v2, :cond_1

    .line 49
    .line 50
    invoke-interface {p0}, Ljava/io/DataInput;->readInt()I

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    move v5, p0

    .line 55
    goto :goto_0

    .line 56
    :cond_1
    mul-int/lit16 v1, v1, 0xe10

    .line 57
    .line 58
    move v5, v1

    .line 59
    :goto_0
    new-instance p0, Lnet/time4j/tz/model/h;

    .line 60
    .line 61
    move-object v2, p0

    .line 62
    invoke-direct/range {v2 .. v7}, Lnet/time4j/tz/model/h;-><init>(Lnet/time4j/b0;Lnet/time4j/x0;ILnet/time4j/tz/model/i;I)V

    .line 63
    .line 64
    .line 65
    return-object p0
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

.method private static f(Ljava/io/DataInput;)I
    .locals 2

    .line 1
    invoke-interface {p0}, Ljava/io/DataInput;->readByte()B

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x7f

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-interface {p0}, Ljava/io/DataInput;->readInt()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0

    .line 14
    :cond_0
    mul-int/lit16 v0, v0, 0x384

    .line 15
    .line 16
    return v0
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

.method private static g(Ljava/io/ObjectInput;)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-interface {p0}, Ljava/io/DataInput;->readByte()B

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0xff

    .line 6
    .line 7
    and-int/2addr v0, v1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    invoke-interface {p0}, Ljava/io/DataInput;->readLong()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-interface {p0}, Ljava/io/DataInput;->readByte()B

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    and-int/2addr v2, v1

    .line 20
    invoke-interface {p0}, Ljava/io/DataInput;->readByte()B

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    and-int/2addr v1, v3

    .line 25
    shl-int/lit8 v0, v0, 0x10

    .line 26
    .line 27
    shl-int/lit8 v2, v2, 0x8

    .line 28
    .line 29
    add-int/2addr v0, v2

    .line 30
    add-int/2addr v0, v1

    .line 31
    int-to-long v0, v0

    .line 32
    const-wide/16 v2, 0x384

    .line 33
    .line 34
    mul-long/2addr v0, v2

    .line 35
    const-wide v2, -0x110bc5000L

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    add-long/2addr v0, v2

    .line 41
    :goto_0
    move-wide v3, v0

    .line 42
    invoke-static {p0}, Lnet/time4j/tz/model/SPX;->f(Ljava/io/DataInput;)I

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    invoke-static {p0}, Lnet/time4j/tz/model/SPX;->f(Ljava/io/DataInput;)I

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    invoke-static {p0}, Lnet/time4j/tz/model/SPX;->f(Ljava/io/DataInput;)I

    .line 51
    .line 52
    .line 53
    move-result v7

    .line 54
    new-instance v0, Lnet/time4j/tz/q;

    .line 55
    .line 56
    move-object v2, v0

    .line 57
    invoke-direct/range {v2 .. v7}, Lnet/time4j/tz/q;-><init>(JIII)V

    .line 58
    .line 59
    .line 60
    invoke-static {p0}, Lnet/time4j/tz/model/SPX;->h(Ljava/io/ObjectInput;)Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    new-instance v1, Lnet/time4j/tz/model/j;

    .line 65
    .line 66
    const/4 v2, 0x0

    .line 67
    invoke-direct {v1, v0, p0, v2}, Lnet/time4j/tz/model/j;-><init>(Lnet/time4j/tz/q;Ljava/util/List;Z)V

    .line 68
    .line 69
    .line 70
    return-object v1
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

.method private static h(Ljava/io/ObjectInput;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/ObjectInput;",
            ")",
            "Ljava/util/List<",
            "Lnet/time4j/tz/model/d;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Ljava/io/DataInput;->readByte()B

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 15
    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    const/4 v3, 0x0

    .line 19
    :goto_0
    if-ge v3, v0, :cond_3

    .line 20
    .line 21
    invoke-interface {p0}, Ljava/io/DataInput;->readByte()B

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    packed-switch v4, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    invoke-interface {p0}, Ljava/io/ObjectInput;->readObject()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    check-cast v4, Lnet/time4j/tz/model/d;

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :pswitch_0
    invoke-static {p0}, Lnet/time4j/tz/model/SPX;->e(Ljava/io/DataInput;)Lnet/time4j/tz/model/d;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    goto :goto_1

    .line 40
    :pswitch_1
    invoke-static {p0}, Lnet/time4j/tz/model/SPX;->c(Ljava/io/DataInput;)Lnet/time4j/tz/model/d;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    goto :goto_1

    .line 45
    :pswitch_2
    invoke-static {p0}, Lnet/time4j/tz/model/SPX;->d(Ljava/io/DataInput;)Lnet/time4j/tz/model/d;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    :goto_1
    if-eqz v2, :cond_2

    .line 50
    .line 51
    sget-object v5, Lnet/time4j/tz/model/k;->k:Lnet/time4j/tz/model/k;

    .line 52
    .line 53
    invoke-virtual {v5, v2, v4}, Lnet/time4j/tz/model/k;->a(Lnet/time4j/tz/model/d;Lnet/time4j/tz/model/d;)I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-gez v2, :cond_1

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_1
    new-instance p0, Ljava/io/InvalidObjectException;

    .line 61
    .line 62
    const-string v0, "Order of daylight saving rules is not ascending."

    .line 63
    .line 64
    invoke-direct {p0, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw p0

    .line 68
    :cond_2
    :goto_2
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    add-int/lit8 v3, v3, 0x1

    .line 72
    .line 73
    move-object v2, v4

    .line 74
    goto :goto_0

    .line 75
    :cond_3
    return-object v1

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x78
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method private static i(I)I
    .locals 2

    const/4 v0, 0x3

    div-int/2addr p0, v0

    if-eqz p0, :cond_3

    const/4 v1, 0x1

    if-eq p0, v1, :cond_2

    const/4 v1, 0x2

    if-eq p0, v1, :cond_1

    if-eq p0, v0, :cond_0

    const/4 p0, -0x1

    return p0

    :cond_0
    const/16 p0, 0x1c20

    return p0

    :cond_1
    const/16 p0, 0xe10

    return p0

    :cond_2
    const/16 p0, 0x708

    return p0

    :cond_3
    const/4 p0, 0x0

    return p0
.end method

.method private static j(Ljava/io/ObjectInput;)Ljava/util/List;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/ObjectInput;",
            ")",
            "Ljava/util/List<",
            "Lnet/time4j/tz/q;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-interface/range {p0 .. p0}, Ljava/io/DataInput;->readInt()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-static/range {p0 .. p0}, Lnet/time4j/tz/model/SPX;->f(Ljava/io/DataInput;)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/4 v3, 0x0

    .line 22
    const-wide/high16 v4, -0x8000000000000000L

    .line 23
    .line 24
    move v7, v2

    .line 25
    move v10, v3

    .line 26
    :goto_0
    if-ge v10, v0, :cond_9

    .line 27
    .line 28
    invoke-interface/range {p0 .. p0}, Ljava/io/DataInput;->readByte()B

    .line 29
    .line 30
    .line 31
    move-result v6

    .line 32
    const/4 v8, 0x1

    .line 33
    if-gez v6, :cond_1

    .line 34
    .line 35
    move v9, v8

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    move v9, v3

    .line 38
    :goto_1
    ushr-int/lit8 v11, v6, 0x5

    .line 39
    .line 40
    const/4 v12, 0x3

    .line 41
    and-int/2addr v11, v12

    .line 42
    ushr-int/lit8 v13, v6, 0x2

    .line 43
    .line 44
    and-int/lit8 v13, v13, 0x7

    .line 45
    .line 46
    invoke-static {v13}, Lnet/time4j/tz/model/SPX;->o(I)I

    .line 47
    .line 48
    .line 49
    move-result v13

    .line 50
    const/4 v14, -0x1

    .line 51
    if-ne v13, v14, :cond_2

    .line 52
    .line 53
    invoke-interface/range {p0 .. p0}, Ljava/io/DataInput;->readLong()J

    .line 54
    .line 55
    .line 56
    move-result-wide v13

    .line 57
    goto :goto_2

    .line 58
    :cond_2
    and-int/lit8 v6, v6, 0x3

    .line 59
    .line 60
    shl-int/lit8 v6, v6, 0x10

    .line 61
    .line 62
    invoke-interface/range {p0 .. p0}, Ljava/io/DataInput;->readByte()B

    .line 63
    .line 64
    .line 65
    move-result v14

    .line 66
    and-int/lit16 v14, v14, 0xff

    .line 67
    .line 68
    shl-int/lit8 v14, v14, 0x8

    .line 69
    .line 70
    or-int/2addr v6, v14

    .line 71
    invoke-interface/range {p0 .. p0}, Ljava/io/DataInput;->readByte()B

    .line 72
    .line 73
    .line 74
    move-result v14

    .line 75
    and-int/lit16 v14, v14, 0xff

    .line 76
    .line 77
    or-int/2addr v6, v14

    .line 78
    int-to-long v14, v6

    .line 79
    const-wide/32 v16, 0x15180

    .line 80
    .line 81
    .line 82
    mul-long v14, v14, v16

    .line 83
    .line 84
    const-wide v16, -0x110bc5000L

    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    add-long v14, v14, v16

    .line 90
    .line 91
    int-to-long v12, v13

    .line 92
    add-long/2addr v14, v12

    .line 93
    const-wide/16 v12, 0x1c20

    .line 94
    .line 95
    sub-long/2addr v14, v12

    .line 96
    int-to-long v12, v2

    .line 97
    sub-long/2addr v14, v12

    .line 98
    move-wide v13, v14

    .line 99
    :goto_2
    cmp-long v4, v13, v4

    .line 100
    .line 101
    if-lez v4, :cond_8

    .line 102
    .line 103
    if-eq v11, v8, :cond_5

    .line 104
    .line 105
    const/4 v4, 0x2

    .line 106
    if-eq v11, v4, :cond_4

    .line 107
    .line 108
    const/4 v4, 0x3

    .line 109
    if-eq v11, v4, :cond_3

    .line 110
    .line 111
    invoke-static/range {p0 .. p0}, Lnet/time4j/tz/model/SPX;->f(Ljava/io/DataInput;)I

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    goto :goto_3

    .line 116
    :cond_3
    const/16 v4, 0x1c20

    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_4
    const/16 v4, 0xe10

    .line 120
    .line 121
    :goto_3
    move v11, v4

    .line 122
    goto :goto_4

    .line 123
    :cond_5
    move v11, v3

    .line 124
    :goto_4
    if-eqz v9, :cond_6

    .line 125
    .line 126
    invoke-static/range {p0 .. p0}, Lnet/time4j/tz/model/SPX;->f(Ljava/io/DataInput;)I

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    :cond_6
    const v4, 0x7fffffff

    .line 131
    .line 132
    .line 133
    if-ne v11, v4, :cond_7

    .line 134
    .line 135
    move v4, v3

    .line 136
    goto :goto_5

    .line 137
    :cond_7
    move v4, v11

    .line 138
    :goto_5
    add-int v12, v2, v4

    .line 139
    .line 140
    new-instance v15, Lnet/time4j/tz/q;

    .line 141
    .line 142
    move-object v4, v15

    .line 143
    move-wide v5, v13

    .line 144
    move v8, v12

    .line 145
    move v9, v11

    .line 146
    invoke-direct/range {v4 .. v9}, Lnet/time4j/tz/q;-><init>(JIII)V

    .line 147
    .line 148
    .line 149
    invoke-interface {v1, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    add-int/lit8 v10, v10, 0x1

    .line 153
    .line 154
    move v7, v12

    .line 155
    move-wide v4, v13

    .line 156
    goto/16 :goto_0

    .line 157
    .line 158
    :cond_8
    new-instance v0, Ljava/io/StreamCorruptedException;

    .line 159
    .line 160
    const-string v1, "Wrong order of transitions."

    .line 161
    .line 162
    invoke-direct {v0, v1}, Ljava/io/StreamCorruptedException;-><init>(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    throw v0

    .line 166
    :cond_9
    return-object v1
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
.end method

.method private static k(I)I
    .locals 1

    if-eqz p0, :cond_6

    const/16 v0, 0xe10

    if-eq p0, v0, :cond_5

    const/16 v0, 0x1c20

    if-eq p0, v0, :cond_4

    const/16 v0, 0x2a30

    if-eq p0, v0, :cond_3

    const v0, 0x13560

    if-eq p0, v0, :cond_2

    const v0, 0x14370

    if-eq p0, v0, :cond_1

    const v0, 0x15180

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    const/4 p0, 0x7

    return p0

    :cond_1
    const/4 p0, 0x6

    return p0

    :cond_2
    const/4 p0, 0x5

    return p0

    :cond_3
    const/4 p0, 0x4

    return p0

    :cond_4
    const/4 p0, 0x3

    return p0

    :cond_5
    const/4 p0, 0x2

    return p0

    :cond_6
    const/4 p0, 0x1

    return p0
.end method

.method private static l(I)I
    .locals 1

    if-eqz p0, :cond_6

    const/16 v0, 0x3c

    if-eq p0, v0, :cond_5

    const/16 v0, 0xe10

    if-eq p0, v0, :cond_4

    const/16 v0, 0x1c20

    if-eq p0, v0, :cond_3

    const/16 v0, 0x2a30

    if-eq p0, v0, :cond_2

    const/16 v0, 0x3840

    if-eq p0, v0, :cond_1

    const/16 v0, 0x4650

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    const/4 p0, 0x7

    return p0

    :cond_1
    const/4 p0, 0x6

    return p0

    :cond_2
    const/4 p0, 0x5

    return p0

    :cond_3
    const/4 p0, 0x4

    return p0

    :cond_4
    const/4 p0, 0x3

    return p0

    :cond_5
    const/4 p0, 0x2

    return p0

    :cond_6
    const/4 p0, 0x1

    return p0
.end method

.method private static m(Lnet/time4j/tz/model/g;)I
    .locals 5

    invoke-virtual {p0}, Lnet/time4j/tz/model/d;->f()Lnet/time4j/g0;

    move-result-object v0

    sget-object v1, Lnet/time4j/g0;->J:Lnet/time4j/k0;

    invoke-virtual {v0, v1}, Lfj/q;->m(Lfj/p;)I

    move-result v0

    invoke-virtual {p0}, Lnet/time4j/tz/model/d;->c()J

    move-result-wide v1

    const-wide/32 v3, 0x15180

    mul-long/2addr v1, v3

    invoke-static {v1, v2}, Lnet/time4j/base/c;->g(J)I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method private static n(I)I
    .locals 0

    packed-switch p0, :pswitch_data_0

    const/4 p0, -0x1

    return p0

    :pswitch_0
    const p0, 0x15180

    return p0

    :pswitch_1
    const p0, 0x14370

    return p0

    :pswitch_2
    const p0, 0x13560

    return p0

    :pswitch_3
    const/16 p0, 0x2a30

    return p0

    :pswitch_4
    const/16 p0, 0x1c20

    return p0

    :pswitch_5
    const/16 p0, 0xe10

    return p0

    :pswitch_6
    const/4 p0, 0x0

    return p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static o(I)I
    .locals 0

    packed-switch p0, :pswitch_data_0

    const/4 p0, -0x1

    return p0

    :pswitch_0
    const/16 p0, 0x4650

    return p0

    :pswitch_1
    const/16 p0, 0x3840

    return p0

    :pswitch_2
    const/16 p0, 0x2a30

    return p0

    :pswitch_3
    const/16 p0, 0x1c20

    return p0

    :pswitch_4
    const/16 p0, 0xe10

    return p0

    :pswitch_5
    const/16 p0, 0x3c

    return p0

    :pswitch_6
    const/4 p0, 0x0

    return p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static p(Ljava/lang/Object;Ljava/io/ObjectOutput;)V
    .locals 0

    .line 1
    check-cast p0, Lnet/time4j/tz/model/a;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lnet/time4j/tz/model/a;->u(Ljava/io/ObjectOutput;)V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
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

.method private static q(Ljava/lang/Object;Ljava/io/ObjectOutput;)V
    .locals 0

    .line 1
    check-cast p0, Lnet/time4j/tz/model/b;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lnet/time4j/tz/model/b;->l(Ljava/io/ObjectOutput;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lnet/time4j/tz/model/b;->k()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-static {p0, p1}, Lnet/time4j/tz/model/SPX;->x(Ljava/util/List;Ljava/io/ObjectOutput;)V

    .line 11
    .line 12
    .line 13
    return-void
    .line 14
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

.method private static r(Ljava/lang/Object;Ljava/io/DataOutput;)V
    .locals 5

    .line 1
    check-cast p0, Lnet/time4j/tz/model/c;

    .line 2
    .line 3
    invoke-static {p0, p1}, Lnet/time4j/tz/model/SPX;->u(Lnet/time4j/tz/model/g;Ljava/io/DataOutput;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-virtual {p0}, Lnet/time4j/tz/model/c;->m()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    shl-int/lit8 v1, v1, 0x3

    .line 12
    .line 13
    invoke-virtual {p0}, Lnet/time4j/tz/model/c;->n()B

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    or-int/2addr v1, v2

    .line 18
    and-int/lit16 v1, v1, 0xff

    .line 19
    .line 20
    invoke-interface {p1, v1}, Ljava/io/DataOutput;->writeByte(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lnet/time4j/tz/model/c;->o()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    const/4 v2, 0x0

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    const/16 v1, 0x80

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move v1, v2

    .line 34
    :goto_0
    invoke-static {p0}, Lnet/time4j/tz/model/SPX;->m(Lnet/time4j/tz/model/g;)I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    rem-int/lit16 v4, v3, 0x708

    .line 39
    .line 40
    if-nez v4, :cond_1

    .line 41
    .line 42
    div-int/lit16 v2, v3, 0x708

    .line 43
    .line 44
    or-int/2addr v1, v2

    .line 45
    const/4 v2, 0x1

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    or-int/lit8 v1, v1, 0x3f

    .line 48
    .line 49
    :goto_1
    and-int/lit16 v1, v1, 0xff

    .line 50
    .line 51
    invoke-interface {p1, v1}, Ljava/io/DataOutput;->writeByte(I)V

    .line 52
    .line 53
    .line 54
    if-nez v0, :cond_2

    .line 55
    .line 56
    invoke-virtual {p0}, Lnet/time4j/tz/model/d;->e()I

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    invoke-static {p1, p0}, Lnet/time4j/tz/model/SPX;->v(Ljava/io/DataOutput;I)V

    .line 61
    .line 62
    .line 63
    :cond_2
    if-nez v2, :cond_3

    .line 64
    .line 65
    invoke-interface {p1, v3}, Ljava/io/DataOutput;->writeInt(I)V

    .line 66
    .line 67
    .line 68
    :cond_3
    return-void
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
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
.end method

.method private readResolve()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lnet/time4j/tz/model/SPX;->k:Ljava/lang/Object;

    return-object v0
.end method

.method private static s(Ljava/lang/Object;Ljava/io/DataOutput;)V
    .locals 4

    .line 1
    check-cast p0, Lnet/time4j/tz/model/f;

    .line 2
    .line 3
    invoke-static {p0, p1}, Lnet/time4j/tz/model/SPX;->u(Lnet/time4j/tz/model/g;Ljava/io/DataOutput;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-virtual {p0}, Lnet/time4j/tz/model/f;->m()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    shl-int/lit8 v1, v1, 0x3

    .line 12
    .line 13
    invoke-static {p0}, Lnet/time4j/tz/model/SPX;->m(Lnet/time4j/tz/model/g;)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-static {v2}, Lnet/time4j/tz/model/SPX;->k(I)I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    or-int/2addr v1, v3

    .line 22
    and-int/lit16 v1, v1, 0xff

    .line 23
    .line 24
    invoke-interface {p1, v1}, Ljava/io/DataOutput;->writeByte(I)V

    .line 25
    .line 26
    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {p0}, Lnet/time4j/tz/model/d;->e()I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    invoke-static {p1, p0}, Lnet/time4j/tz/model/SPX;->v(Ljava/io/DataOutput;I)V

    .line 34
    .line 35
    .line 36
    :cond_0
    if-nez v3, :cond_1

    .line 37
    .line 38
    invoke-interface {p1, v2}, Ljava/io/DataOutput;->writeInt(I)V

    .line 39
    .line 40
    .line 41
    :cond_1
    return-void
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
.end method

.method private static t(Ljava/lang/Object;Ljava/io/DataOutput;)V
    .locals 4

    .line 1
    check-cast p0, Lnet/time4j/tz/model/h;

    .line 2
    .line 3
    invoke-static {p0, p1}, Lnet/time4j/tz/model/SPX;->u(Lnet/time4j/tz/model/g;Ljava/io/DataOutput;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-virtual {p0}, Lnet/time4j/tz/model/h;->m()B

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    shl-int/lit8 v1, v1, 0x5

    .line 12
    .line 13
    invoke-static {p0}, Lnet/time4j/tz/model/SPX;->m(Lnet/time4j/tz/model/g;)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    rem-int/lit16 v3, v2, 0xe10

    .line 18
    .line 19
    if-nez v3, :cond_0

    .line 20
    .line 21
    div-int/lit16 v3, v2, 0xe10

    .line 22
    .line 23
    or-int/2addr v1, v3

    .line 24
    const/4 v3, 0x1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    or-int/lit8 v1, v1, 0x1f

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    :goto_0
    and-int/lit16 v1, v1, 0xff

    .line 30
    .line 31
    invoke-interface {p1, v1}, Ljava/io/DataOutput;->writeByte(I)V

    .line 32
    .line 33
    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    invoke-virtual {p0}, Lnet/time4j/tz/model/d;->e()I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    invoke-static {p1, p0}, Lnet/time4j/tz/model/SPX;->v(Ljava/io/DataOutput;I)V

    .line 41
    .line 42
    .line 43
    :cond_1
    if-nez v3, :cond_2

    .line 44
    .line 45
    invoke-interface {p1, v2}, Ljava/io/DataOutput;->writeInt(I)V

    .line 46
    .line 47
    .line 48
    :cond_2
    return-void
    .line 49
.end method

.method private static u(Lnet/time4j/tz/model/g;Ljava/io/DataOutput;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Lnet/time4j/tz/model/g;->k()B

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    shl-int/lit8 v0, v0, 0x4

    .line 6
    .line 7
    invoke-virtual {p0}, Lnet/time4j/tz/model/d;->d()Lnet/time4j/tz/model/i;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-virtual {p0}, Lnet/time4j/tz/model/d;->e()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    const/4 v2, 0x1

    .line 20
    if-eqz p0, :cond_3

    .line 21
    .line 22
    const/16 v3, 0x708

    .line 23
    .line 24
    if-eq p0, v3, :cond_2

    .line 25
    .line 26
    const/16 v3, 0xe10

    .line 27
    .line 28
    if-eq p0, v3, :cond_1

    .line 29
    .line 30
    const/16 v3, 0x1c20

    .line 31
    .line 32
    if-eq p0, v3, :cond_0

    .line 33
    .line 34
    add-int/lit8 v1, v1, 0xc

    .line 35
    .line 36
    or-int p0, v0, v1

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    goto :goto_1

    .line 40
    :cond_0
    add-int/lit8 v1, v1, 0x9

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    add-int/lit8 v1, v1, 0x6

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    add-int/lit8 v1, v1, 0x3

    .line 47
    .line 48
    :cond_3
    :goto_0
    or-int p0, v0, v1

    .line 49
    .line 50
    :goto_1
    and-int/lit16 p0, p0, 0xff

    .line 51
    .line 52
    invoke-interface {p1, p0}, Ljava/io/DataOutput;->writeByte(I)V

    .line 53
    .line 54
    .line 55
    return v2
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
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
.end method

.method private static v(Ljava/io/DataOutput;I)V
    .locals 1

    .line 1
    rem-int/lit16 v0, p1, 0x384

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    div-int/lit16 p1, p1, 0x384

    .line 6
    .line 7
    invoke-interface {p0, p1}, Ljava/io/DataOutput;->writeByte(I)V

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/16 v0, 0x7f

    .line 12
    .line 13
    invoke-interface {p0, v0}, Ljava/io/DataOutput;->writeByte(I)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p0, p1}, Ljava/io/DataOutput;->writeInt(I)V

    .line 17
    .line 18
    .line 19
    :goto_0
    return-void
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

.method private static w(Ljava/lang/Object;Ljava/io/ObjectOutput;)V
    .locals 13

    .line 1
    check-cast p0, Lnet/time4j/tz/model/j;

    .line 2
    .line 3
    invoke-virtual {p0}, Lnet/time4j/tz/model/j;->l()Lnet/time4j/tz/q;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lnet/time4j/tz/q;->f()J

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    const-wide v3, -0x110bc5000L

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    cmp-long v5, v1, v3

    .line 17
    .line 18
    const/16 v6, 0xff

    .line 19
    .line 20
    if-ltz v5, :cond_0

    .line 21
    .line 22
    const-wide v7, 0x26fbfac7bL

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    cmp-long v5, v1, v7

    .line 28
    .line 29
    if-gez v5, :cond_0

    .line 30
    .line 31
    const-wide/16 v7, 0x384

    .line 32
    .line 33
    rem-long v9, v1, v7

    .line 34
    .line 35
    const-wide/16 v11, 0x0

    .line 36
    .line 37
    cmp-long v5, v9, v11

    .line 38
    .line 39
    if-nez v5, :cond_0

    .line 40
    .line 41
    sub-long/2addr v1, v3

    .line 42
    div-long/2addr v1, v7

    .line 43
    long-to-int v1, v1

    .line 44
    ushr-int/lit8 v2, v1, 0x10

    .line 45
    .line 46
    and-int/2addr v2, v6

    .line 47
    invoke-interface {p1, v2}, Ljava/io/DataOutput;->writeByte(I)V

    .line 48
    .line 49
    .line 50
    ushr-int/lit8 v2, v1, 0x8

    .line 51
    .line 52
    and-int/2addr v2, v6

    .line 53
    invoke-interface {p1, v2}, Ljava/io/DataOutput;->writeByte(I)V

    .line 54
    .line 55
    .line 56
    and-int/2addr v1, v6

    .line 57
    invoke-interface {p1, v1}, Ljava/io/DataOutput;->writeByte(I)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    invoke-interface {p1, v6}, Ljava/io/DataOutput;->writeByte(I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Lnet/time4j/tz/q;->f()J

    .line 65
    .line 66
    .line 67
    move-result-wide v1

    .line 68
    invoke-interface {p1, v1, v2}, Ljava/io/DataOutput;->writeLong(J)V

    .line 69
    .line 70
    .line 71
    :goto_0
    invoke-virtual {v0}, Lnet/time4j/tz/q;->h()I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    invoke-static {p1, v1}, Lnet/time4j/tz/model/SPX;->v(Ljava/io/DataOutput;I)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Lnet/time4j/tz/q;->k()I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    invoke-static {p1, v1}, Lnet/time4j/tz/model/SPX;->v(Ljava/io/DataOutput;I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Lnet/time4j/tz/q;->e()I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    invoke-static {p1, v0}, Lnet/time4j/tz/model/SPX;->v(Ljava/io/DataOutput;I)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0}, Lnet/time4j/tz/model/j;->n()Ljava/util/List;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-static {p0, p1}, Lnet/time4j/tz/model/SPX;->x(Ljava/util/List;Ljava/io/ObjectOutput;)V

    .line 97
    .line 98
    .line 99
    return-void
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
.end method

.method private static x(Ljava/util/List;Ljava/io/ObjectOutput;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lnet/time4j/tz/model/d;",
            ">;",
            "Ljava/io/ObjectOutput;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeByte(I)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lnet/time4j/tz/model/d;

    .line 23
    .line 24
    invoke-virtual {v0}, Lnet/time4j/tz/model/d;->g()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-interface {p1, v1}, Ljava/io/DataOutput;->writeByte(I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Lnet/time4j/tz/model/d;->g()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    packed-switch v1, :pswitch_data_0

    .line 36
    .line 37
    .line 38
    invoke-interface {p1, v0}, Ljava/io/ObjectOutput;->writeObject(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :pswitch_0
    invoke-static {v0, p1}, Lnet/time4j/tz/model/SPX;->t(Ljava/lang/Object;Ljava/io/DataOutput;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :pswitch_1
    invoke-static {v0, p1}, Lnet/time4j/tz/model/SPX;->r(Ljava/lang/Object;Ljava/io/DataOutput;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :pswitch_2
    invoke-static {v0, p1}, Lnet/time4j/tz/model/SPX;->s(Ljava/lang/Object;Ljava/io/DataOutput;)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    return-void

    .line 55
    :pswitch_data_0
    .packed-switch 0x78
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
.end method

.method private static y(Lnet/time4j/tz/q;ILjava/io/DataOutput;)I
    .locals 13

    .line 1
    invoke-virtual {p0}, Lnet/time4j/tz/q;->j()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-eq v0, p1, :cond_0

    .line 8
    .line 9
    move v3, v1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v3, v2

    .line 12
    :goto_0
    if-eqz v3, :cond_1

    .line 13
    .line 14
    const/16 v4, 0x80

    .line 15
    .line 16
    int-to-byte v4, v4

    .line 17
    goto :goto_1

    .line 18
    :cond_1
    move v4, v2

    .line 19
    :goto_1
    invoke-virtual {p0}, Lnet/time4j/tz/q;->e()I

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    const/4 v6, 0x3

    .line 24
    if-eqz v5, :cond_4

    .line 25
    .line 26
    const/16 v1, 0xe10

    .line 27
    .line 28
    if-eq v5, v1, :cond_3

    .line 29
    .line 30
    const/16 v1, 0x1c20

    .line 31
    .line 32
    if-eq v5, v1, :cond_2

    .line 33
    .line 34
    move v1, v2

    .line 35
    goto :goto_2

    .line 36
    :cond_2
    move v1, v6

    .line 37
    goto :goto_2

    .line 38
    :cond_3
    const/4 v1, 0x2

    .line 39
    :cond_4
    :goto_2
    shl-int/lit8 v7, v1, 0x5

    .line 40
    .line 41
    or-int/2addr v4, v7

    .line 42
    int-to-byte v4, v4

    .line 43
    invoke-virtual {p0}, Lnet/time4j/tz/q;->f()J

    .line 44
    .line 45
    .line 46
    move-result-wide v7

    .line 47
    int-to-long v9, p1

    .line 48
    add-long/2addr v7, v9

    .line 49
    const-wide/16 v9, 0x1c20

    .line 50
    .line 51
    add-long/2addr v7, v9

    .line 52
    const-wide v9, -0x110bc5000L

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    cmp-long p1, v7, v9

    .line 58
    .line 59
    if-ltz p1, :cond_5

    .line 60
    .line 61
    const-wide v11, 0x434e22100L

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    cmp-long p1, v7, v11

    .line 67
    .line 68
    if-gez p1, :cond_5

    .line 69
    .line 70
    const p1, 0x15180

    .line 71
    .line 72
    .line 73
    invoke-static {v7, v8, p1}, Lnet/time4j/base/c;->d(JI)I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    invoke-static {p1}, Lnet/time4j/tz/model/SPX;->l(I)I

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    :cond_5
    shl-int/lit8 p1, v2, 0x2

    .line 82
    .line 83
    or-int/2addr p1, v4

    .line 84
    int-to-byte p1, p1

    .line 85
    if-nez v2, :cond_6

    .line 86
    .line 87
    invoke-interface {p2, p1}, Ljava/io/DataOutput;->writeByte(I)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0}, Lnet/time4j/tz/q;->f()J

    .line 91
    .line 92
    .line 93
    move-result-wide p0

    .line 94
    invoke-interface {p2, p0, p1}, Ljava/io/DataOutput;->writeLong(J)V

    .line 95
    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_6
    sub-long/2addr v7, v9

    .line 99
    const-wide/32 v9, 0x15180

    .line 100
    .line 101
    .line 102
    div-long/2addr v7, v9

    .line 103
    long-to-int p0, v7

    .line 104
    ushr-int/lit8 v2, p0, 0x10

    .line 105
    .line 106
    and-int/2addr v2, v6

    .line 107
    int-to-byte v2, v2

    .line 108
    or-int/2addr p1, v2

    .line 109
    int-to-byte p1, p1

    .line 110
    invoke-interface {p2, p1}, Ljava/io/DataOutput;->writeByte(I)V

    .line 111
    .line 112
    .line 113
    ushr-int/lit8 p1, p0, 0x8

    .line 114
    .line 115
    and-int/lit16 p1, p1, 0xff

    .line 116
    .line 117
    invoke-interface {p2, p1}, Ljava/io/DataOutput;->writeByte(I)V

    .line 118
    .line 119
    .line 120
    and-int/lit16 p0, p0, 0xff

    .line 121
    .line 122
    invoke-interface {p2, p0}, Ljava/io/DataOutput;->writeByte(I)V

    .line 123
    .line 124
    .line 125
    :goto_3
    if-nez v1, :cond_7

    .line 126
    .line 127
    invoke-static {p2, v5}, Lnet/time4j/tz/model/SPX;->v(Ljava/io/DataOutput;I)V

    .line 128
    .line 129
    .line 130
    :cond_7
    if-eqz v3, :cond_8

    .line 131
    .line 132
    invoke-static {p2, v0}, Lnet/time4j/tz/model/SPX;->v(Ljava/io/DataOutput;I)V

    .line 133
    .line 134
    .line 135
    :cond_8
    return v0
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
.end method

.method static z([Lnet/time4j/tz/q;ILjava/io/DataOutput;)V
    .locals 3

    .line 1
    array-length v0, p0

    .line 2
    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    .line 3
    .line 4
    .line 5
    move-result p1

    .line 6
    invoke-interface {p2, p1}, Ljava/io/DataOutput;->writeInt(I)V

    .line 7
    .line 8
    .line 9
    if-lez p1, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    aget-object v1, p0, v0

    .line 13
    .line 14
    invoke-virtual {v1}, Lnet/time4j/tz/q;->h()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-static {p2, v1}, Lnet/time4j/tz/model/SPX;->v(Ljava/io/DataOutput;I)V

    .line 19
    .line 20
    .line 21
    :goto_0
    if-ge v0, p1, :cond_0

    .line 22
    .line 23
    aget-object v2, p0, v0

    .line 24
    .line 25
    invoke-static {v2, v1, p2}, Lnet/time4j/tz/model/SPX;->y(Lnet/time4j/tz/q;ILjava/io/DataOutput;)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    add-int/lit8 v0, v0, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    return-void
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
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
.end method


# virtual methods
.method public readExternal(Ljava/io/ObjectInput;)V
    .locals 1

    .line 1
    invoke-interface {p1}, Ljava/io/DataInput;->readByte()B

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    :pswitch_0
    new-instance p1, Ljava/io/StreamCorruptedException;

    .line 9
    .line 10
    const-string v0, "Unknown serialized type."

    .line 11
    .line 12
    invoke-direct {p1, v0}, Ljava/io/StreamCorruptedException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    throw p1

    .line 16
    :pswitch_1
    invoke-static {p1}, Lnet/time4j/tz/model/SPX;->b(Ljava/io/ObjectInput;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Lnet/time4j/tz/model/SPX;->k:Ljava/lang/Object;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :pswitch_2
    invoke-static {p1}, Lnet/time4j/tz/model/SPX;->a(Ljava/io/ObjectInput;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Lnet/time4j/tz/model/SPX;->k:Ljava/lang/Object;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :pswitch_3
    invoke-static {p1}, Lnet/time4j/tz/model/SPX;->g(Ljava/io/ObjectInput;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iput-object p1, p0, Lnet/time4j/tz/model/SPX;->k:Ljava/lang/Object;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :pswitch_4
    invoke-static {p1}, Lnet/time4j/tz/model/SPX;->e(Ljava/io/DataInput;)Lnet/time4j/tz/model/d;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iput-object p1, p0, Lnet/time4j/tz/model/SPX;->k:Ljava/lang/Object;

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :pswitch_5
    invoke-static {p1}, Lnet/time4j/tz/model/SPX;->c(Ljava/io/DataInput;)Lnet/time4j/tz/model/d;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iput-object p1, p0, Lnet/time4j/tz/model/SPX;->k:Ljava/lang/Object;

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :pswitch_6
    invoke-static {p1}, Lnet/time4j/tz/model/SPX;->d(Ljava/io/DataInput;)Lnet/time4j/tz/model/d;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iput-object p1, p0, Lnet/time4j/tz/model/SPX;->k:Ljava/lang/Object;

    .line 56
    .line 57
    :goto_0
    return-void

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x78
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
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
    iget v0, p0, Lnet/time4j/tz/model/SPX;->l:I

    .line 2
    .line 3
    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeByte(I)V

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lnet/time4j/tz/model/SPX;->l:I

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    :pswitch_0
    new-instance p1, Ljava/io/InvalidClassException;

    .line 12
    .line 13
    const-string v0, "Unknown serialized type."

    .line 14
    .line 15
    invoke-direct {p1, v0}, Ljava/io/InvalidClassException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw p1

    .line 19
    :pswitch_1
    iget-object v0, p0, Lnet/time4j/tz/model/SPX;->k:Ljava/lang/Object;

    .line 20
    .line 21
    invoke-static {v0, p1}, Lnet/time4j/tz/model/SPX;->q(Ljava/lang/Object;Ljava/io/ObjectOutput;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :pswitch_2
    iget-object v0, p0, Lnet/time4j/tz/model/SPX;->k:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {v0, p1}, Lnet/time4j/tz/model/SPX;->p(Ljava/lang/Object;Ljava/io/ObjectOutput;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :pswitch_3
    iget-object v0, p0, Lnet/time4j/tz/model/SPX;->k:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {v0, p1}, Lnet/time4j/tz/model/SPX;->w(Ljava/lang/Object;Ljava/io/ObjectOutput;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :pswitch_4
    iget-object v0, p0, Lnet/time4j/tz/model/SPX;->k:Ljava/lang/Object;

    .line 38
    .line 39
    invoke-static {v0, p1}, Lnet/time4j/tz/model/SPX;->t(Ljava/lang/Object;Ljava/io/DataOutput;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :pswitch_5
    iget-object v0, p0, Lnet/time4j/tz/model/SPX;->k:Ljava/lang/Object;

    .line 44
    .line 45
    invoke-static {v0, p1}, Lnet/time4j/tz/model/SPX;->r(Ljava/lang/Object;Ljava/io/DataOutput;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :pswitch_6
    iget-object v0, p0, Lnet/time4j/tz/model/SPX;->k:Ljava/lang/Object;

    .line 50
    .line 51
    invoke-static {v0, p1}, Lnet/time4j/tz/model/SPX;->s(Ljava/lang/Object;Ljava/io/DataOutput;)V

    .line 52
    .line 53
    .line 54
    :goto_0
    return-void

    .line 55
    :pswitch_data_0
    .packed-switch 0x78
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
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
