.class public abstract Lcd/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:I

.field private final b:I


# direct methods
.method protected constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcd/h;->a:I

    .line 5
    .line 6
    iput p2, p0, Lcd/h;->b:I

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


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lcd/h;->b:I

    return v0
.end method

.method public abstract b()[B
.end method

.method public abstract c(I[B)[B
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Lcd/h;->a:I

    return v0
.end method

.method public e()Lcd/h;
    .locals 1

    new-instance v0, Lcd/g;

    invoke-direct {v0, p0}, Lcd/g;-><init>(Lcd/h;)V

    return-object v0
.end method

.method public f()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public g()Lcd/h;
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "This luminance source does not support rotation by 90 degrees."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    .line 1
    iget v0, p0, Lcd/h;->a:I

    .line 2
    .line 3
    new-array v1, v0, [B

    .line 4
    .line 5
    new-instance v2, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    iget v3, p0, Lcd/h;->b:I

    .line 8
    .line 9
    add-int/lit8 v0, v0, 0x1

    .line 10
    .line 11
    mul-int/2addr v3, v0

    .line 12
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    move v3, v0

    .line 17
    :goto_0
    iget v4, p0, Lcd/h;->b:I

    .line 18
    .line 19
    if-ge v3, v4, :cond_4

    .line 20
    .line 21
    invoke-virtual {p0, v3, v1}, Lcd/h;->c(I[B)[B

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    move v4, v0

    .line 26
    :goto_1
    iget v5, p0, Lcd/h;->a:I

    .line 27
    .line 28
    if-ge v4, v5, :cond_3

    .line 29
    .line 30
    aget-byte v5, v1, v4

    .line 31
    .line 32
    and-int/lit16 v5, v5, 0xff

    .line 33
    .line 34
    const/16 v6, 0x40

    .line 35
    .line 36
    if-ge v5, v6, :cond_0

    .line 37
    .line 38
    const/16 v5, 0x23

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_0
    const/16 v6, 0x80

    .line 42
    .line 43
    if-ge v5, v6, :cond_1

    .line 44
    .line 45
    const/16 v5, 0x2b

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_1
    const/16 v6, 0xc0

    .line 49
    .line 50
    if-ge v5, v6, :cond_2

    .line 51
    .line 52
    const/16 v5, 0x2e

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    const/16 v5, 0x20

    .line 56
    .line 57
    :goto_2
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    add-int/lit8 v4, v4, 0x1

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    const/16 v4, 0xa

    .line 64
    .line 65
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    add-int/lit8 v3, v3, 0x1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_4
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    return-object v0
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
