.class public final Lod/e;
.super Lod/p;
.source "SourceFile"


# static fields
.field static final j:[I


# instance fields
.field private final i:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Lod/e;->j:[I

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 4
        0x0
        0xb
        0xd
        0xe
        0x13
        0x19
        0x1c
        0x15
        0x16
        0x1a
    .end array-data
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
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lod/p;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x4

    .line 5
    new-array v0, v0, [I

    .line 6
    .line 7
    iput-object v0, p0, Lod/e;->i:[I

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
.end method

.method private static r(Ljava/lang/StringBuilder;I)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    const/16 v2, 0xa

    .line 4
    .line 5
    if-ge v1, v2, :cond_1

    .line 6
    .line 7
    sget-object v2, Lod/e;->j:[I

    .line 8
    .line 9
    aget v2, v2, v1

    .line 10
    .line 11
    if-ne p1, v2, :cond_0

    .line 12
    .line 13
    add-int/lit8 v1, v1, 0x30

    .line 14
    .line 15
    int-to-char p1, v1

    .line 16
    invoke-virtual {p0, v0, p1}, Ljava/lang/StringBuilder;->insert(IC)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    invoke-static {}, Lcd/j;->a()Lcd/j;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    throw p0
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
.method protected k(Lgd/a;[ILjava/lang/StringBuilder;)I
    .locals 10

    .line 1
    iget-object v0, p0, Lod/e;->i:[I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aput v1, v0, v1

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    aput v1, v0, v2

    .line 8
    .line 9
    const/4 v3, 0x2

    .line 10
    aput v1, v0, v3

    .line 11
    .line 12
    const/4 v3, 0x3

    .line 13
    aput v1, v0, v3

    .line 14
    .line 15
    invoke-virtual {p1}, Lgd/a;->j()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    aget p2, p2, v2

    .line 20
    .line 21
    move v4, v1

    .line 22
    move v5, v4

    .line 23
    :goto_0
    const/4 v6, 0x6

    .line 24
    if-ge v4, v6, :cond_2

    .line 25
    .line 26
    if-ge p2, v3, :cond_2

    .line 27
    .line 28
    sget-object v6, Lod/p;->h:[[I

    .line 29
    .line 30
    invoke-static {p1, v0, p2, v6}, Lod/p;->i(Lgd/a;[II[[I)I

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    rem-int/lit8 v7, v6, 0xa

    .line 35
    .line 36
    add-int/lit8 v7, v7, 0x30

    .line 37
    .line 38
    int-to-char v7, v7

    .line 39
    invoke-virtual {p3, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    array-length v7, v0

    .line 43
    move v8, v1

    .line 44
    :goto_1
    if-ge v8, v7, :cond_0

    .line 45
    .line 46
    aget v9, v0, v8

    .line 47
    .line 48
    add-int/2addr p2, v9

    .line 49
    add-int/lit8 v8, v8, 0x1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_0
    const/16 v7, 0xa

    .line 53
    .line 54
    if-lt v6, v7, :cond_1

    .line 55
    .line 56
    rsub-int/lit8 v6, v4, 0x5

    .line 57
    .line 58
    shl-int v6, v2, v6

    .line 59
    .line 60
    or-int/2addr v5, v6

    .line 61
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    invoke-static {p3, v5}, Lod/e;->r(Ljava/lang/StringBuilder;I)V

    .line 65
    .line 66
    .line 67
    sget-object v4, Lod/p;->e:[I

    .line 68
    .line 69
    invoke-static {p1, p2, v2, v4}, Lod/p;->m(Lgd/a;IZ[I)[I

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    aget p2, p2, v2

    .line 74
    .line 75
    move v2, v1

    .line 76
    :goto_2
    if-ge v2, v6, :cond_4

    .line 77
    .line 78
    if-ge p2, v3, :cond_4

    .line 79
    .line 80
    sget-object v4, Lod/p;->g:[[I

    .line 81
    .line 82
    invoke-static {p1, v0, p2, v4}, Lod/p;->i(Lgd/a;[II[[I)I

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    add-int/lit8 v4, v4, 0x30

    .line 87
    .line 88
    int-to-char v4, v4

    .line 89
    invoke-virtual {p3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    array-length v4, v0

    .line 93
    move v5, v1

    .line 94
    :goto_3
    if-ge v5, v4, :cond_3

    .line 95
    .line 96
    aget v7, v0, v5

    .line 97
    .line 98
    add-int/2addr p2, v7

    .line 99
    add-int/lit8 v5, v5, 0x1

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_4
    return p2
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

.method p()Lcd/a;
    .locals 1

    sget-object v0, Lcd/a;->r:Lcd/a;

    return-object v0
.end method
