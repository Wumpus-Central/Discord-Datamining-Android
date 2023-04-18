.class Llj/g;
.super Ljava/io/Reader;
.source "SourceFile"


# instance fields
.field private final k:Ljava/io/PushbackInputStream;

.field private l:Ljava/io/BufferedReader;


# direct methods
.method constructor <init>(Ljava/io/InputStream;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/io/Reader;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Llj/g;->l:Ljava/io/BufferedReader;

    .line 6
    .line 7
    new-instance v0, Ljava/io/PushbackInputStream;

    .line 8
    .line 9
    const/4 v1, 0x3

    .line 10
    invoke-direct {v0, p1, v1}, Ljava/io/PushbackInputStream;-><init>(Ljava/io/InputStream;I)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Llj/g;->k:Ljava/io/PushbackInputStream;

    .line 14
    .line 15
    return-void
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

.method private b()V
    .locals 6

    .line 1
    iget-object v0, p0, Llj/g;->l:Ljava/io/BufferedReader;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x3

    .line 7
    new-array v1, v0, [B

    .line 8
    .line 9
    iget-object v2, p0, Llj/g;->k:Ljava/io/PushbackInputStream;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-virtual {v2, v1, v3, v0}, Ljava/io/PushbackInputStream;->read([BII)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-ne v2, v0, :cond_1

    .line 17
    .line 18
    aget-byte v0, v1, v3

    .line 19
    .line 20
    const/16 v4, -0x11

    .line 21
    .line 22
    if-ne v0, v4, :cond_1

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    aget-byte v4, v1, v0

    .line 26
    .line 27
    const/16 v5, -0x45

    .line 28
    .line 29
    if-ne v4, v5, :cond_1

    .line 30
    .line 31
    const/4 v4, 0x2

    .line 32
    aget-byte v4, v1, v4

    .line 33
    .line 34
    const/16 v5, -0x41

    .line 35
    .line 36
    if-ne v4, v5, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    move v0, v3

    .line 40
    :goto_0
    if-nez v0, :cond_2

    .line 41
    .line 42
    if-lez v2, :cond_2

    .line 43
    .line 44
    iget-object v0, p0, Llj/g;->k:Ljava/io/PushbackInputStream;

    .line 45
    .line 46
    invoke-virtual {v0, v1, v3, v2}, Ljava/io/PushbackInputStream;->unread([BII)V

    .line 47
    .line 48
    .line 49
    :cond_2
    new-instance v0, Ljava/io/BufferedReader;

    .line 50
    .line 51
    new-instance v1, Ljava/io/InputStreamReader;

    .line 52
    .line 53
    iget-object v2, p0, Llj/g;->k:Ljava/io/PushbackInputStream;

    .line 54
    .line 55
    const-string v3, "UTF-8"

    .line 56
    .line 57
    invoke-direct {v1, v2, v3}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 61
    .line 62
    .line 63
    iput-object v0, p0, Llj/g;->l:Ljava/io/BufferedReader;

    .line 64
    .line 65
    return-void
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


# virtual methods
.method public close()V
    .locals 1

    .line 1
    iget-object v0, p0, Llj/g;->l:Ljava/io/BufferedReader;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Llj/g;->k:Ljava/io/PushbackInputStream;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/io/PushbackInputStream;->close()V

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {v0}, Ljava/io/Reader;->close()V

    .line 12
    .line 13
    .line 14
    :goto_0
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
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-direct {p0}, Llj/g;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Llj/g;->l:Ljava/io/BufferedReader;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
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

.method public read([CII)I
    .locals 1

    .line 1
    invoke-direct {p0}, Llj/g;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Llj/g;->l:Ljava/io/BufferedReader;

    .line 5
    .line 6
    invoke-virtual {v0, p1, p2, p3}, Ljava/io/BufferedReader;->read([CII)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1
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

.method public ready()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Llj/g;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Llj/g;->l:Ljava/io/BufferedReader;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/io/BufferedReader;->ready()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    return v0
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
