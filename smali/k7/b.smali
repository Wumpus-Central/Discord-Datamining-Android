.class public final Lk7/b;
.super Lcom/google/android/exoplayer2/upstream/f$a;
.source "SourceFile"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field private final b:Lokhttp3/Call$Factory;

.field private final c:Ljava/lang/String;

.field private final d:Ld9/x;

.field private final e:Lokhttp3/CacheControl;


# direct methods
.method public constructor <init>(Lokhttp3/Call$Factory;Ljava/lang/String;Ld9/x;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, p3, v0}, Lk7/b;-><init>(Lokhttp3/Call$Factory;Ljava/lang/String;Ld9/x;Lokhttp3/CacheControl;)V

    return-void
.end method

.method public constructor <init>(Lokhttp3/Call$Factory;Ljava/lang/String;Ld9/x;Lokhttp3/CacheControl;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/google/android/exoplayer2/upstream/f$a;-><init>()V

    .line 3
    iput-object p1, p0, Lk7/b;->b:Lokhttp3/Call$Factory;

    .line 4
    iput-object p2, p0, Lk7/b;->c:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lk7/b;->d:Ld9/x;

    .line 6
    iput-object p4, p0, Lk7/b;->e:Lokhttp3/CacheControl;

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/exoplayer2/upstream/f$g;)Lcom/google/android/exoplayer2/upstream/f;
    .locals 0

    invoke-virtual {p0, p1}, Lk7/b;->c(Lcom/google/android/exoplayer2/upstream/f$g;)Lk7/a;

    move-result-object p1

    return-object p1
.end method

.method protected c(Lcom/google/android/exoplayer2/upstream/f$g;)Lk7/a;
    .locals 4

    .line 1
    new-instance v0, Lk7/a;

    .line 2
    .line 3
    iget-object v1, p0, Lk7/b;->b:Lokhttp3/Call$Factory;

    .line 4
    .line 5
    iget-object v2, p0, Lk7/b;->c:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Lk7/b;->e:Lokhttp3/CacheControl;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3, p1}, Lk7/a;-><init>(Lokhttp3/Call$Factory;Ljava/lang/String;Lokhttp3/CacheControl;Lcom/google/android/exoplayer2/upstream/f$g;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lk7/b;->d:Ld9/x;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ld9/f;->f(Ld9/x;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-object v0
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
.end method
