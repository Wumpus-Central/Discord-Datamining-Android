.class public Lf7/d0$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf7/d0$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf7/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field private final a:[Lf7/h;

.field private final b:Lf7/o0;

.field private final c:Lf7/q0;


# direct methods
.method public varargs constructor <init>([Lf7/h;)V
    .locals 2

    .line 1
    new-instance v0, Lf7/o0;

    invoke-direct {v0}, Lf7/o0;-><init>()V

    new-instance v1, Lf7/q0;

    invoke-direct {v1}, Lf7/q0;-><init>()V

    invoke-direct {p0, p1, v0, v1}, Lf7/d0$d;-><init>([Lf7/h;Lf7/o0;Lf7/q0;)V

    return-void
.end method

.method public constructor <init>([Lf7/h;Lf7/o0;Lf7/q0;)V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    array-length v0, p1

    add-int/lit8 v0, v0, 0x2

    new-array v0, v0, [Lf7/h;

    iput-object v0, p0, Lf7/d0$d;->a:[Lf7/h;

    const/4 v1, 0x0

    .line 4
    array-length v2, p1

    invoke-static {p1, v1, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 5
    iput-object p2, p0, Lf7/d0$d;->b:Lf7/o0;

    .line 6
    iput-object p3, p0, Lf7/d0$d;->c:Lf7/q0;

    .line 7
    array-length v1, p1

    aput-object p2, v0, v1

    .line 8
    array-length p1, p1

    add-int/lit8 p1, p1, 0x1

    aput-object p3, v0, p1

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/exoplayer2/PlaybackParameters;)Lcom/google/android/exoplayer2/PlaybackParameters;
    .locals 2

    .line 1
    iget-object v0, p0, Lf7/d0$d;->c:Lf7/q0;

    .line 2
    .line 3
    iget v1, p1, Lcom/google/android/exoplayer2/PlaybackParameters;->a:F

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lf7/q0;->i(F)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lf7/d0$d;->c:Lf7/q0;

    .line 9
    .line 10
    iget v1, p1, Lcom/google/android/exoplayer2/PlaybackParameters;->b:F

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lf7/q0;->h(F)V

    .line 13
    .line 14
    .line 15
    return-object p1
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
.end method

.method public b(J)J
    .locals 1

    iget-object v0, p0, Lf7/d0$d;->c:Lf7/q0;

    invoke-virtual {v0, p1, p2}, Lf7/q0;->a(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public c()J
    .locals 2

    iget-object v0, p0, Lf7/d0$d;->b:Lf7/o0;

    invoke-virtual {v0}, Lf7/o0;->p()J

    move-result-wide v0

    return-wide v0
.end method

.method public d(Z)Z
    .locals 1

    iget-object v0, p0, Lf7/d0$d;->b:Lf7/o0;

    invoke-virtual {v0, p1}, Lf7/o0;->v(Z)V

    return p1
.end method

.method public e()[Lf7/h;
    .locals 1

    iget-object v0, p0, Lf7/d0$d;->a:[Lf7/h;

    return-object v0
.end method
