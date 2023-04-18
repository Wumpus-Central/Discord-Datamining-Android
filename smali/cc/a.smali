.class public final Lcc/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcc/a$b;
    }
.end annotation


# static fields
.field private static final a:Ljava/io/OutputStream;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcc/a$a;

    invoke-direct {v0}, Lcc/a$a;-><init>()V

    sput-object v0, Lcc/a;->a:Ljava/io/OutputStream;

    return-void
.end method

.method private static a(Ljava/util/Queue;I)[B
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Queue<",
            "[B>;I)[B"
        }
    .end annotation

    .line 1
    new-array v0, p1, [B

    .line 2
    .line 3
    move v1, p1

    .line 4
    :goto_0
    if-lez v1, :cond_0

    .line 5
    .line 6
    invoke-interface {p0}, Ljava/util/Queue;->remove()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    check-cast v2, [B

    .line 11
    .line 12
    array-length v3, v2

    .line 13
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    sub-int v4, p1, v1

    .line 18
    .line 19
    const/4 v5, 0x0

    .line 20
    invoke-static {v2, v5, v0, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 21
    .line 22
    .line 23
    sub-int/2addr v1, v3

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-object v0
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

.method public static b(Ljava/io/InputStream;J)Ljava/io/InputStream;
    .locals 1

    new-instance v0, Lcc/a$b;

    invoke-direct {v0, p0, p1, p2}, Lcc/a$b;-><init>(Ljava/io/InputStream;J)V

    return-object v0
.end method

.method public static c(Ljava/io/InputStream;)[B
    .locals 2

    .line 1
    invoke-static {p0}, Lac/i;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayDeque;

    .line 5
    .line 6
    const/16 v1, 0x14

    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/util/ArrayDeque;-><init>(I)V

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-static {p0, v0, v1}, Lcc/a;->d(Ljava/io/InputStream;Ljava/util/Queue;I)[B

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
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

.method private static d(Ljava/io/InputStream;Ljava/util/Queue;I)[B
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/InputStream;",
            "Ljava/util/Queue<",
            "[B>;I)[B"
        }
    .end annotation

    .line 1
    const/16 v0, 0x2000

    .line 2
    .line 3
    :goto_0
    const/4 v1, -0x1

    .line 4
    const v2, 0x7ffffff7

    .line 5
    .line 6
    .line 7
    if-ge p2, v2, :cond_2

    .line 8
    .line 9
    sub-int/2addr v2, p2

    .line 10
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    new-array v3, v2, [B

    .line 15
    .line 16
    invoke-interface {p1, v3}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    :goto_1
    if-ge v4, v2, :cond_1

    .line 21
    .line 22
    sub-int v5, v2, v4

    .line 23
    .line 24
    invoke-virtual {p0, v3, v4, v5}, Ljava/io/InputStream;->read([BII)I

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    if-ne v5, v1, :cond_0

    .line 29
    .line 30
    invoke-static {p1, p2}, Lcc/a;->a(Ljava/util/Queue;I)[B

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :cond_0
    add-int/2addr v4, v5

    .line 36
    add-int/2addr p2, v5

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    const/4 v1, 0x2

    .line 39
    invoke-static {v0, v1}, Ldc/a;->d(II)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    goto :goto_0

    .line 44
    :cond_2
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-ne p0, v1, :cond_3

    .line 49
    .line 50
    invoke-static {p1, v2}, Lcc/a;->a(Ljava/util/Queue;I)[B

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0

    .line 55
    :cond_3
    new-instance p0, Ljava/lang/OutOfMemoryError;

    .line 56
    .line 57
    const-string p1, "input is too large to fit in a byte array"

    .line 58
    .line 59
    invoke-direct {p0, p1}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw p0
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
