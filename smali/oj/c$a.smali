.class final Loj/c$a;
.super Lokhttp3/ResponseBody;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Loj/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0008\u0002\u0018\u00002\u00020\u0001B\'\u0012\n\u0010\u0011\u001a\u00060\u000bR\u00020\u000c\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0012\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0008\u0010\u0005\u001a\u00020\u0004H\u0016J\u0008\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\tR\u001b\u0010\u0011\u001a\u00060\u000bR\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0014\u00a8\u0006\u0018"
    }
    d2 = {
        "Loj/c$a;",
        "Lokhttp3/ResponseBody;",
        "Lokhttp3/MediaType;",
        "contentType",
        "",
        "contentLength",
        "Lokio/BufferedSource;",
        "source",
        "k",
        "Lokio/BufferedSource;",
        "bodySource",
        "Lrj/d$d;",
        "Lrj/d;",
        "l",
        "Lrj/d$d;",
        "b",
        "()Lrj/d$d;",
        "snapshot",
        "",
        "m",
        "Ljava/lang/String;",
        "n",
        "<init>",
        "(Lrj/d$d;Ljava/lang/String;Ljava/lang/String;)V",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# instance fields
.field private final k:Lokio/BufferedSource;

.field private final l:Lrj/d$d;

.field private final m:Ljava/lang/String;

.field private final n:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lrj/d$d;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "snapshot"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lokhttp3/ResponseBody;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Loj/c$a;->l:Lrj/d$d;

    .line 10
    .line 11
    iput-object p2, p0, Loj/c$a;->m:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p3, p0, Loj/c$a;->n:Ljava/lang/String;

    .line 14
    .line 15
    const/4 p2, 0x1

    .line 16
    invoke-virtual {p1, p2}, Lrj/d$d;->f(I)Lokio/Source;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    new-instance p2, Loj/c$a$a;

    .line 21
    .line 22
    invoke-direct {p2, p0, p1, p1}, Loj/c$a$a;-><init>(Loj/c$a;Lokio/Source;Lokio/Source;)V

    .line 23
    .line 24
    .line 25
    invoke-static {p2}, Ldk/m;->d(Lokio/Source;)Lokio/BufferedSource;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, Loj/c$a;->k:Lokio/BufferedSource;

    .line 30
    .line 31
    return-void
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


# virtual methods
.method public final b()Lrj/d$d;
    .locals 1

    iget-object v0, p0, Loj/c$a;->l:Lrj/d$d;

    return-object v0
.end method

.method public contentLength()J
    .locals 3

    iget-object v0, p0, Loj/c$a;->n:Ljava/lang/String;

    const-wide/16 v1, -0x1

    if-eqz v0, :cond_0

    invoke-static {v0, v1, v2}, Lpj/c;->T(Ljava/lang/String;J)J

    move-result-wide v1

    :cond_0
    return-wide v1
.end method

.method public contentType()Lokhttp3/MediaType;
    .locals 2

    iget-object v0, p0, Loj/c$a;->m:Ljava/lang/String;

    if-eqz v0, :cond_0

    sget-object v1, Lokhttp3/MediaType;->g:Lokhttp3/MediaType$a;

    invoke-virtual {v1, v0}, Lokhttp3/MediaType$a;->b(Ljava/lang/String;)Lokhttp3/MediaType;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public source()Lokio/BufferedSource;
    .locals 1

    iget-object v0, p0, Loj/c$a;->k:Lokio/BufferedSource;

    return-object v0
.end method
