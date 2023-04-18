.class final Lf7/k0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf7/s$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf7/k0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lf7/k0;


# direct methods
.method private constructor <init>(Lf7/k0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lf7/k0$b;->a:Lf7/k0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lf7/k0;Lf7/k0$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lf7/k0$b;-><init>(Lf7/k0;)V

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 1

    iget-object v0, p0, Lf7/k0$b;->a:Lf7/k0;

    invoke-static {v0}, Lf7/k0;->m1(Lf7/k0;)Lf7/r$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lf7/r$a;->z(Z)V

    return-void
.end method

.method public b(J)V
    .locals 1

    iget-object v0, p0, Lf7/k0$b;->a:Lf7/k0;

    invoke-static {v0}, Lf7/k0;->m1(Lf7/k0;)Lf7/r$a;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lf7/r$a;->y(J)V

    return-void
.end method

.method public c(IJJ)V
    .locals 7

    iget-object v0, p0, Lf7/k0$b;->a:Lf7/k0;

    invoke-static {v0}, Lf7/k0;->m1(Lf7/k0;)Lf7/r$a;

    move-result-object v1

    move v2, p1

    move-wide v3, p2

    move-wide v5, p4

    invoke-virtual/range {v1 .. v6}, Lf7/r$a;->A(IJJ)V

    return-void
.end method

.method public d(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lf7/k0$b;->a:Lf7/k0;

    invoke-static {v0}, Lf7/k0;->m1(Lf7/k0;)Lf7/r$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lf7/r$a;->j(Ljava/lang/Exception;)V

    return-void
.end method

.method public e(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lf7/k0$b;->a:Lf7/k0;

    .line 2
    .line 3
    invoke-static {v0}, Lf7/k0;->n1(Lf7/k0;)Lcom/google/android/exoplayer2/t0$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lf7/k0$b;->a:Lf7/k0;

    .line 10
    .line 11
    invoke-static {v0}, Lf7/k0;->n1(Lf7/k0;)Lcom/google/android/exoplayer2/t0$a;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0, p1, p2}, Lcom/google/android/exoplayer2/t0$a;->b(J)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
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

.method public f()V
    .locals 1

    iget-object v0, p0, Lf7/k0$b;->a:Lf7/k0;

    invoke-virtual {v0}, Lf7/k0;->t1()V

    return-void
.end method

.method public g()V
    .locals 1

    .line 1
    iget-object v0, p0, Lf7/k0$b;->a:Lf7/k0;

    .line 2
    .line 3
    invoke-static {v0}, Lf7/k0;->n1(Lf7/k0;)Lcom/google/android/exoplayer2/t0$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lf7/k0$b;->a:Lf7/k0;

    .line 10
    .line 11
    invoke-static {v0}, Lf7/k0;->n1(Lf7/k0;)Lcom/google/android/exoplayer2/t0$a;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Lcom/google/android/exoplayer2/t0$a;->a()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
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
    .line 130
    .line 131
    .line 132
    .line 133
.end method
