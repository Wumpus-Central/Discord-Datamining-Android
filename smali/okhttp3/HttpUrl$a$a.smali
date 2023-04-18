.class public final Lokhttp3/HttpUrl$a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/HttpUrl$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000b\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ \u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u001c\u0010\u0008\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J \u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J \u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002R\u0014\u0010\u000b\u001a\u00020\u00028\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000f"
    }
    d2 = {
        "Lokhttp3/HttpUrl$a$a;",
        "",
        "",
        "input",
        "",
        "pos",
        "limit",
        "g",
        "h",
        "f",
        "e",
        "INVALID_HOST",
        "Ljava/lang/String;",
        "<init>",
        "()V",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lokhttp3/HttpUrl$a$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lokhttp3/HttpUrl$a$a;Ljava/lang/String;II)I
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lokhttp3/HttpUrl$a$a;->e(Ljava/lang/String;II)I

    move-result p0

    return p0
.end method

.method public static final synthetic b(Lokhttp3/HttpUrl$a$a;Ljava/lang/String;II)I
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lokhttp3/HttpUrl$a$a;->f(Ljava/lang/String;II)I

    move-result p0

    return p0
.end method

.method public static final synthetic c(Lokhttp3/HttpUrl$a$a;Ljava/lang/String;II)I
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lokhttp3/HttpUrl$a$a;->g(Ljava/lang/String;II)I

    move-result p0

    return p0
.end method

.method public static final synthetic d(Lokhttp3/HttpUrl$a$a;Ljava/lang/String;II)I
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lokhttp3/HttpUrl$a$a;->h(Ljava/lang/String;II)I

    move-result p0

    return p0
.end method

.method private final e(Ljava/lang/String;II)I
    .locals 13

    .line 1
    const/4 v0, -0x1

    .line 2
    :try_start_0
    sget-object v1, Lokhttp3/HttpUrl;->l:Lokhttp3/HttpUrl$b;

    .line 3
    .line 4
    const-string v5, ""

    .line 5
    .line 6
    const/4 v6, 0x0

    .line 7
    const/4 v7, 0x0

    .line 8
    const/4 v8, 0x0

    .line 9
    const/4 v9, 0x0

    .line 10
    const/4 v10, 0x0

    .line 11
    const/16 v11, 0xf8

    .line 12
    .line 13
    const/4 v12, 0x0

    .line 14
    move-object v2, p1

    .line 15
    move v3, p2

    .line 16
    move/from16 v4, p3

    .line 17
    .line 18
    invoke-static/range {v1 .. v12}, Lokhttp3/HttpUrl$b;->b(Lokhttp3/HttpUrl$b;Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    move-result v1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    const/4 v2, 0x1

    .line 27
    if-le v2, v1, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const v2, 0xffff

    .line 31
    .line 32
    .line 33
    if-lt v2, v1, :cond_1

    .line 34
    .line 35
    move v0, v1

    .line 36
    :catch_0
    :cond_1
    :goto_0
    return v0
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

.method private final f(Ljava/lang/String;II)I
    .locals 2

    .line 1
    :goto_0
    if-ge p2, p3, :cond_3

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x3a

    .line 8
    .line 9
    if-eq v0, v1, :cond_2

    .line 10
    .line 11
    const/16 v1, 0x5b

    .line 12
    .line 13
    if-eq v0, v1, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    add-int/lit8 p2, p2, 0x1

    .line 17
    .line 18
    if-ge p2, p3, :cond_1

    .line 19
    .line 20
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/16 v1, 0x5d

    .line 25
    .line 26
    if-ne v0, v1, :cond_0

    .line 27
    .line 28
    :cond_1
    :goto_1
    add-int/lit8 p2, p2, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    return p2

    .line 32
    :cond_3
    return p3
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

.method private final g(Ljava/lang/String;II)I
    .locals 7

    .line 1
    sub-int v0, p3, p2

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, -0x1

    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    return v2

    .line 8
    :cond_0
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/16 v1, 0x61

    .line 13
    .line 14
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->i(II)I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    const/16 v4, 0x5a

    .line 19
    .line 20
    const/16 v5, 0x7a

    .line 21
    .line 22
    const/16 v6, 0x41

    .line 23
    .line 24
    if-ltz v3, :cond_1

    .line 25
    .line 26
    invoke-static {v0, v5}, Lkotlin/jvm/internal/q;->i(II)I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-lez v3, :cond_2

    .line 31
    .line 32
    :cond_1
    invoke-static {v0, v6}, Lkotlin/jvm/internal/q;->i(II)I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-ltz v3, :cond_c

    .line 37
    .line 38
    invoke-static {v0, v4}, Lkotlin/jvm/internal/q;->i(II)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-lez v0, :cond_2

    .line 43
    .line 44
    goto :goto_5

    .line 45
    :cond_2
    :goto_0
    add-int/lit8 p2, p2, 0x1

    .line 46
    .line 47
    if-ge p2, p3, :cond_c

    .line 48
    .line 49
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-le v1, v0, :cond_3

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    if-lt v5, v0, :cond_4

    .line 57
    .line 58
    goto :goto_4

    .line 59
    :cond_4
    :goto_1
    if-le v6, v0, :cond_5

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_5
    if-lt v4, v0, :cond_6

    .line 63
    .line 64
    goto :goto_4

    .line 65
    :cond_6
    :goto_2
    const/16 v3, 0x30

    .line 66
    .line 67
    if-le v3, v0, :cond_7

    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_7
    const/16 v3, 0x39

    .line 71
    .line 72
    if-lt v3, v0, :cond_8

    .line 73
    .line 74
    goto :goto_4

    .line 75
    :cond_8
    :goto_3
    const/16 v3, 0x2b

    .line 76
    .line 77
    if-ne v0, v3, :cond_9

    .line 78
    .line 79
    goto :goto_4

    .line 80
    :cond_9
    const/16 v3, 0x2d

    .line 81
    .line 82
    if-ne v0, v3, :cond_a

    .line 83
    .line 84
    goto :goto_4

    .line 85
    :cond_a
    const/16 v3, 0x2e

    .line 86
    .line 87
    if-ne v0, v3, :cond_b

    .line 88
    .line 89
    :goto_4
    goto :goto_0

    .line 90
    :cond_b
    const/16 p1, 0x3a

    .line 91
    .line 92
    if-ne v0, p1, :cond_c

    .line 93
    .line 94
    move v2, p2

    .line 95
    :cond_c
    :goto_5
    return v2
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

.method private final h(Ljava/lang/String;II)I
    .locals 3

    const/4 v0, 0x0

    :goto_0
    if-ge p2, p3, :cond_1

    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x5c

    if-eq v1, v2, :cond_0

    const/16 v2, 0x2f

    if-ne v1, v2, :cond_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method
