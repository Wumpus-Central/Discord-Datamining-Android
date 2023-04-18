.class Lnet/time4j/tz/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnet/time4j/base/f;


# instance fields
.field private final k:J

.field private final l:I


# direct methods
.method private constructor <init>(JI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lnet/time4j/tz/i;->k:J

    .line 5
    .line 6
    iput p3, p0, Lnet/time4j/tz/i;->l:I

    .line 7
    .line 8
    return-void
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

.method static b(JI)Lnet/time4j/base/f;
    .locals 3

    new-instance v0, Lnet/time4j/tz/i;

    if-nez p2, :cond_0

    const-wide/16 v1, 0x1

    sub-long/2addr p0, v1

    :cond_0
    if-nez p2, :cond_1

    const p2, 0x3b9ac9ff

    goto :goto_0

    :cond_1
    add-int/lit8 p2, p2, -0x1

    :goto_0
    invoke-direct {v0, p0, p1, p2}, Lnet/time4j/tz/i;-><init>(JI)V

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lnet/time4j/tz/i;->l:I

    return v0
.end method

.method public u()J
    .locals 2

    iget-wide v0, p0, Lnet/time4j/tz/i;->k:J

    return-wide v0
.end method
