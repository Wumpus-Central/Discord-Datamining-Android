.class Lnet/time4j/calendar/KoreanCalendar$SPX;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Externalizable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/time4j/calendar/KoreanCalendar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "SPX"
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private transient k:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lnet/time4j/calendar/KoreanCalendar$SPX;->k:Ljava/lang/Object;

    return-void
.end method

.method private a(Ljava/io/ObjectInput;)Lnet/time4j/calendar/KoreanCalendar;
    .locals 4

    .line 1
    invoke-interface {p1}, Ljava/io/DataInput;->readByte()B

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-interface {p1}, Ljava/io/DataInput;->readByte()B

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-interface {p1}, Ljava/io/DataInput;->readByte()B

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-interface {p1}, Ljava/io/DataInput;->readBoolean()Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-interface {p1}, Ljava/io/DataInput;->readByte()B

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    invoke-static {v2}, Lnet/time4j/calendar/h;->e(I)Lnet/time4j/calendar/h;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    invoke-virtual {v2}, Lnet/time4j/calendar/h;->f()Lnet/time4j/calendar/h;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    :cond_0
    invoke-static {v0, v1, v2, p1}, Lnet/time4j/calendar/KoreanCalendar;->p0(IILnet/time4j/calendar/h;I)Lnet/time4j/calendar/KoreanCalendar;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1
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

.method private b(Ljava/io/ObjectOutput;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/time4j/calendar/KoreanCalendar$SPX;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lnet/time4j/calendar/f;

    .line 4
    .line 5
    invoke-virtual {v0}, Lnet/time4j/calendar/f;->Z()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-interface {p1, v1}, Ljava/io/DataOutput;->writeByte(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lnet/time4j/calendar/f;->j0()Lnet/time4j/calendar/c;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, Lnet/time4j/calendar/o;->getNumber()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-interface {p1, v1}, Ljava/io/DataOutput;->writeByte(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Lnet/time4j/calendar/f;->f0()Lnet/time4j/calendar/h;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, Lnet/time4j/calendar/h;->getNumber()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    invoke-interface {p1, v1}, Ljava/io/DataOutput;->writeByte(I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Lnet/time4j/calendar/f;->f0()Lnet/time4j/calendar/h;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Lnet/time4j/calendar/h;->c()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    invoke-interface {p1, v1}, Ljava/io/DataOutput;->writeBoolean(Z)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Lnet/time4j/calendar/f;->p()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeByte(I)V

    .line 50
    .line 51
    .line 52
    return-void
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

    iget-object v0, p0, Lnet/time4j/calendar/KoreanCalendar$SPX;->k:Ljava/lang/Object;

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
    const/16 v1, 0xf

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-direct {p0, p1}, Lnet/time4j/calendar/KoreanCalendar$SPX;->a(Ljava/io/ObjectInput;)Lnet/time4j/calendar/KoreanCalendar;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, Lnet/time4j/calendar/KoreanCalendar$SPX;->k:Ljava/lang/Object;

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    new-instance p1, Ljava/io/InvalidObjectException;

    .line 17
    .line 18
    const-string v0, "Unknown calendar type."

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public writeExternal(Ljava/io/ObjectOutput;)V
    .locals 1

    .line 1
    const/16 v0, 0xf

    .line 2
    .line 3
    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeByte(I)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lnet/time4j/calendar/KoreanCalendar$SPX;->b(Ljava/io/ObjectOutput;)V

    .line 7
    .line 8
    .line 9
    return-void
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
.end method
