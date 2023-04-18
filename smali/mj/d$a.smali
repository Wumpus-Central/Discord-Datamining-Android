.class Lmj/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmj/a;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmj/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x531333f862f313abL


# instance fields
.field private final _raw:J

.field private final _utc:J

.field private final date:Lnet/time4j/base/a;

.field private final shift:I


# direct methods
.method constructor <init>(Lmj/a;I)V
    .locals 4

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    invoke-interface {p1}, Lmj/b;->d()Lnet/time4j/base/a;

    move-result-object v0

    iput-object v0, p0, Lmj/d$a;->date:Lnet/time4j/base/a;

    .line 8
    invoke-interface {p1}, Lmj/b;->b()I

    move-result v0

    iput v0, p0, Lmj/d$a;->shift:I

    .line 9
    invoke-interface {p1}, Lmj/a;->a()J

    move-result-wide v0

    int-to-long v2, p2

    add-long/2addr v0, v2

    iput-wide v0, p0, Lmj/d$a;->_utc:J

    .line 10
    invoke-interface {p1}, Lmj/a;->a()J

    move-result-wide p1

    iput-wide p1, p0, Lmj/d$a;->_raw:J

    return-void
.end method

.method constructor <init>(Lnet/time4j/base/a;JJI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lmj/d$a;->date:Lnet/time4j/base/a;

    .line 3
    iput p6, p0, Lmj/d$a;->shift:I

    .line 4
    iput-wide p2, p0, Lmj/d$a;->_utc:J

    .line 5
    iput-wide p4, p0, Lmj/d$a;->_raw:J

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-wide v0, p0, Lmj/d$a;->_raw:J

    return-wide v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lmj/d$a;->shift:I

    return v0
.end method

.method public c()J
    .locals 2

    iget-wide v0, p0, Lmj/d$a;->_utc:J

    return-wide v0
.end method

.method public d()Lnet/time4j/base/a;
    .locals 1

    iget-object v0, p0, Lmj/d$a;->date:Lnet/time4j/base/a;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x80

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const-class v1, Lmj/b;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const/16 v1, 0x5b

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lmj/d$a;->date:Lnet/time4j/base/a;

    .line 23
    .line 24
    invoke-static {v1}, Lmj/d;->l(Lnet/time4j/base/a;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v1, ": utc="

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget-wide v1, p0, Lmj/d$a;->_utc:J

    .line 37
    .line 38
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v1, ", raw="

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    iget-wide v1, p0, Lmj/d$a;->_raw:J

    .line 47
    .line 48
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v1, " (shift="

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    iget v1, p0, Lmj/d$a;->shift:I

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v1, ")]"

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    return-object v0
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
