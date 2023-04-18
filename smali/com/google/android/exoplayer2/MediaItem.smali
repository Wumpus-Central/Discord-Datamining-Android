.class public final Lcom/google/android/exoplayer2/MediaItem;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/exoplayer2/MediaItem$d;,
        Lcom/google/android/exoplayer2/MediaItem$h;,
        Lcom/google/android/exoplayer2/MediaItem$f;,
        Lcom/google/android/exoplayer2/MediaItem$g;,
        Lcom/google/android/exoplayer2/MediaItem$b;,
        Lcom/google/android/exoplayer2/MediaItem$e;,
        Lcom/google/android/exoplayer2/MediaItem$c;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lcom/google/android/exoplayer2/MediaItem$g;

.field public final c:Lcom/google/android/exoplayer2/MediaItem$f;

.field public final d:Lcom/google/android/exoplayer2/i0;

.field public final e:Lcom/google/android/exoplayer2/MediaItem$d;


# direct methods
.method private constructor <init>(Ljava/lang/String;Lcom/google/android/exoplayer2/MediaItem$d;Lcom/google/android/exoplayer2/MediaItem$g;Lcom/google/android/exoplayer2/MediaItem$f;Lcom/google/android/exoplayer2/i0;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/google/android/exoplayer2/MediaItem;->a:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lcom/google/android/exoplayer2/MediaItem;->b:Lcom/google/android/exoplayer2/MediaItem$g;

    .line 5
    iput-object p4, p0, Lcom/google/android/exoplayer2/MediaItem;->c:Lcom/google/android/exoplayer2/MediaItem$f;

    .line 6
    iput-object p5, p0, Lcom/google/android/exoplayer2/MediaItem;->d:Lcom/google/android/exoplayer2/i0;

    .line 7
    iput-object p2, p0, Lcom/google/android/exoplayer2/MediaItem;->e:Lcom/google/android/exoplayer2/MediaItem$d;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Lcom/google/android/exoplayer2/MediaItem$d;Lcom/google/android/exoplayer2/MediaItem$g;Lcom/google/android/exoplayer2/MediaItem$f;Lcom/google/android/exoplayer2/i0;Lcom/google/android/exoplayer2/MediaItem$a;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lcom/google/android/exoplayer2/MediaItem;-><init>(Ljava/lang/String;Lcom/google/android/exoplayer2/MediaItem$d;Lcom/google/android/exoplayer2/MediaItem$g;Lcom/google/android/exoplayer2/MediaItem$f;Lcom/google/android/exoplayer2/i0;)V

    return-void
.end method

.method public static b(Ljava/lang/String;)Lcom/google/android/exoplayer2/MediaItem;
    .locals 1

    new-instance v0, Lcom/google/android/exoplayer2/MediaItem$c;

    invoke-direct {v0}, Lcom/google/android/exoplayer2/MediaItem$c;-><init>()V

    invoke-virtual {v0, p0}, Lcom/google/android/exoplayer2/MediaItem$c;->j(Ljava/lang/String;)Lcom/google/android/exoplayer2/MediaItem$c;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/exoplayer2/MediaItem$c;->a()Lcom/google/android/exoplayer2/MediaItem;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Lcom/google/android/exoplayer2/MediaItem$c;
    .locals 2

    new-instance v0, Lcom/google/android/exoplayer2/MediaItem$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/exoplayer2/MediaItem$c;-><init>(Lcom/google/android/exoplayer2/MediaItem;Lcom/google/android/exoplayer2/MediaItem$a;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/google/android/exoplayer2/MediaItem;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lcom/google/android/exoplayer2/MediaItem;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/google/android/exoplayer2/MediaItem;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lcom/google/android/exoplayer2/MediaItem;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lf9/q0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    iget-object v1, p0, Lcom/google/android/exoplayer2/MediaItem;->e:Lcom/google/android/exoplayer2/MediaItem$d;

    .line 24
    .line 25
    iget-object v3, p1, Lcom/google/android/exoplayer2/MediaItem;->e:Lcom/google/android/exoplayer2/MediaItem$d;

    .line 26
    .line 27
    invoke-virtual {v1, v3}, Lcom/google/android/exoplayer2/MediaItem$d;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    iget-object v1, p0, Lcom/google/android/exoplayer2/MediaItem;->b:Lcom/google/android/exoplayer2/MediaItem$g;

    .line 34
    .line 35
    iget-object v3, p1, Lcom/google/android/exoplayer2/MediaItem;->b:Lcom/google/android/exoplayer2/MediaItem$g;

    .line 36
    .line 37
    invoke-static {v1, v3}, Lf9/q0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    iget-object v1, p0, Lcom/google/android/exoplayer2/MediaItem;->c:Lcom/google/android/exoplayer2/MediaItem$f;

    .line 44
    .line 45
    iget-object v3, p1, Lcom/google/android/exoplayer2/MediaItem;->c:Lcom/google/android/exoplayer2/MediaItem$f;

    .line 46
    .line 47
    invoke-static {v1, v3}, Lf9/q0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_2

    .line 52
    .line 53
    iget-object v1, p0, Lcom/google/android/exoplayer2/MediaItem;->d:Lcom/google/android/exoplayer2/i0;

    .line 54
    .line 55
    iget-object p1, p1, Lcom/google/android/exoplayer2/MediaItem;->d:Lcom/google/android/exoplayer2/i0;

    .line 56
    .line 57
    invoke-static {v1, p1}, Lf9/q0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-eqz p1, :cond_2

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    move v0, v2

    .line 65
    :goto_0
    return v0
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
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/MediaItem;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Lcom/google/android/exoplayer2/MediaItem;->b:Lcom/google/android/exoplayer2/MediaItem$g;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v1}, Lcom/google/android/exoplayer2/MediaItem$g;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v1, 0x0

    .line 19
    :goto_0
    add-int/2addr v0, v1

    .line 20
    mul-int/lit8 v0, v0, 0x1f

    .line 21
    .line 22
    iget-object v1, p0, Lcom/google/android/exoplayer2/MediaItem;->c:Lcom/google/android/exoplayer2/MediaItem$f;

    .line 23
    .line 24
    invoke-virtual {v1}, Lcom/google/android/exoplayer2/MediaItem$f;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    add-int/2addr v0, v1

    .line 29
    mul-int/lit8 v0, v0, 0x1f

    .line 30
    .line 31
    iget-object v1, p0, Lcom/google/android/exoplayer2/MediaItem;->e:Lcom/google/android/exoplayer2/MediaItem$d;

    .line 32
    .line 33
    invoke-virtual {v1}, Lcom/google/android/exoplayer2/MediaItem$d;->hashCode()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    add-int/2addr v0, v1

    .line 38
    mul-int/lit8 v0, v0, 0x1f

    .line 39
    .line 40
    iget-object v1, p0, Lcom/google/android/exoplayer2/MediaItem;->d:Lcom/google/android/exoplayer2/i0;

    .line 41
    .line 42
    invoke-virtual {v1}, Lcom/google/android/exoplayer2/i0;->hashCode()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    add-int/2addr v0, v1

    .line 47
    return v0
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
    .line 130
    .line 131
    .line 132
    .line 133
.end method
