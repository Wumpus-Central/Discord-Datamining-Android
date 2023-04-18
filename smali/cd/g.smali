.class public final Lcd/g;
.super Lcd/h;
.source "SourceFile"


# instance fields
.field private final c:Lcd/h;


# direct methods
.method public constructor <init>(Lcd/h;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcd/h;->d()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Lcd/h;->a()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-direct {p0, v0, v1}, Lcd/h;-><init>(II)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lcd/g;->c:Lcd/h;

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


# virtual methods
.method public b()[B
    .locals 5

    .line 1
    iget-object v0, p0, Lcd/g;->c:Lcd/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcd/h;->b()[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0}, Lcd/h;->d()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {p0}, Lcd/h;->a()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    mul-int/2addr v1, v2

    .line 16
    new-array v2, v1, [B

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    :goto_0
    if-ge v3, v1, :cond_0

    .line 20
    .line 21
    aget-byte v4, v0, v3

    .line 22
    .line 23
    and-int/lit16 v4, v4, 0xff

    .line 24
    .line 25
    rsub-int v4, v4, 0xff

    .line 26
    .line 27
    int-to-byte v4, v4

    .line 28
    aput-byte v4, v2, v3

    .line 29
    .line 30
    add-int/lit8 v3, v3, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    return-object v2
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
.end method

.method public c(I[B)[B
    .locals 2

    .line 1
    iget-object v0, p0, Lcd/g;->c:Lcd/h;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lcd/h;->c(I[B)[B

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0}, Lcd/h;->d()I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    const/4 v0, 0x0

    .line 12
    :goto_0
    if-ge v0, p2, :cond_0

    .line 13
    .line 14
    aget-byte v1, p1, v0

    .line 15
    .line 16
    and-int/lit16 v1, v1, 0xff

    .line 17
    .line 18
    rsub-int v1, v1, 0xff

    .line 19
    .line 20
    int-to-byte v1, v1

    .line 21
    aput-byte v1, p1, v0

    .line 22
    .line 23
    add-int/lit8 v0, v0, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-object p1
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

.method public e()Lcd/h;
    .locals 1

    iget-object v0, p0, Lcd/g;->c:Lcd/h;

    return-object v0
.end method

.method public f()Z
    .locals 1

    iget-object v0, p0, Lcd/g;->c:Lcd/h;

    invoke-virtual {v0}, Lcd/h;->f()Z

    move-result v0

    return v0
.end method

.method public g()Lcd/h;
    .locals 2

    new-instance v0, Lcd/g;

    iget-object v1, p0, Lcd/g;->c:Lcd/h;

    invoke-virtual {v1}, Lcd/h;->g()Lcd/h;

    move-result-object v1

    invoke-direct {v0, v1}, Lcd/g;-><init>(Lcd/h;)V

    return-object v0
.end method
