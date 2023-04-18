.class final Lg9/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg9/e$a;
    }
.end annotation


# instance fields
.field private a:Lg9/e$a;

.field private b:Lg9/e$a;

.field private c:Z

.field private d:Z

.field private e:J

.field private f:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lg9/e$a;

    .line 5
    .line 6
    invoke-direct {v0}, Lg9/e$a;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lg9/e;->a:Lg9/e$a;

    .line 10
    .line 11
    new-instance v0, Lg9/e$a;

    .line 12
    .line 13
    invoke-direct {v0}, Lg9/e$a;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lg9/e;->b:Lg9/e$a;

    .line 17
    .line 18
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    iput-wide v0, p0, Lg9/e;->e:J

    .line 24
    .line 25
    return-void
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
.end method


# virtual methods
.method public a()J
    .locals 2

    invoke-virtual {p0}, Lg9/e;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lg9/e;->a:Lg9/e$a;

    invoke-virtual {v0}, Lg9/e$a;->a()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    :goto_0
    return-wide v0
.end method

.method public b()F
    .locals 4

    .line 1
    invoke-virtual {p0}, Lg9/e;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lg9/e;->a:Lg9/e$a;

    .line 8
    .line 9
    invoke-virtual {v0}, Lg9/e$a;->a()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    long-to-double v0, v0

    .line 14
    const-wide v2, 0x41cdcd6500000000L    # 1.0E9

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    div-double/2addr v2, v0

    .line 20
    double-to-float v0, v2

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/high16 v0, -0x40800000    # -1.0f

    .line 23
    .line 24
    :goto_0
    return v0
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
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lg9/e;->f:I

    return v0
.end method

.method public d()J
    .locals 2

    invoke-virtual {p0}, Lg9/e;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lg9/e;->a:Lg9/e$a;

    invoke-virtual {v0}, Lg9/e$a;->b()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    :goto_0
    return-wide v0
.end method

.method public e()Z
    .locals 1

    iget-object v0, p0, Lg9/e;->a:Lg9/e$a;

    invoke-virtual {v0}, Lg9/e$a;->e()Z

    move-result v0

    return v0
.end method

.method public f(J)V
    .locals 7

    .line 1
    iget-object v0, p0, Lg9/e;->a:Lg9/e$a;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lg9/e$a;->f(J)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lg9/e;->a:Lg9/e$a;

    .line 7
    .line 8
    invoke-virtual {v0}, Lg9/e$a;->e()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x1

    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-boolean v0, p0, Lg9/e;->d:Z

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    iput-boolean v2, p0, Lg9/e;->c:Z

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-wide v3, p0, Lg9/e;->e:J

    .line 24
    .line 25
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    cmp-long v0, v3, v5

    .line 31
    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    iget-boolean v0, p0, Lg9/e;->c:Z

    .line 35
    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    iget-object v0, p0, Lg9/e;->b:Lg9/e$a;

    .line 39
    .line 40
    invoke-virtual {v0}, Lg9/e$a;->d()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    :cond_1
    iget-object v0, p0, Lg9/e;->b:Lg9/e$a;

    .line 47
    .line 48
    invoke-virtual {v0}, Lg9/e$a;->g()V

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, Lg9/e;->b:Lg9/e$a;

    .line 52
    .line 53
    iget-wide v3, p0, Lg9/e;->e:J

    .line 54
    .line 55
    invoke-virtual {v0, v3, v4}, Lg9/e$a;->f(J)V

    .line 56
    .line 57
    .line 58
    :cond_2
    iput-boolean v1, p0, Lg9/e;->c:Z

    .line 59
    .line 60
    iget-object v0, p0, Lg9/e;->b:Lg9/e$a;

    .line 61
    .line 62
    invoke-virtual {v0, p1, p2}, Lg9/e$a;->f(J)V

    .line 63
    .line 64
    .line 65
    :cond_3
    :goto_0
    iget-boolean v0, p0, Lg9/e;->c:Z

    .line 66
    .line 67
    if-eqz v0, :cond_4

    .line 68
    .line 69
    iget-object v0, p0, Lg9/e;->b:Lg9/e$a;

    .line 70
    .line 71
    invoke-virtual {v0}, Lg9/e$a;->e()Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_4

    .line 76
    .line 77
    iget-object v0, p0, Lg9/e;->a:Lg9/e$a;

    .line 78
    .line 79
    iget-object v3, p0, Lg9/e;->b:Lg9/e$a;

    .line 80
    .line 81
    iput-object v3, p0, Lg9/e;->a:Lg9/e$a;

    .line 82
    .line 83
    iput-object v0, p0, Lg9/e;->b:Lg9/e$a;

    .line 84
    .line 85
    iput-boolean v2, p0, Lg9/e;->c:Z

    .line 86
    .line 87
    iput-boolean v2, p0, Lg9/e;->d:Z

    .line 88
    .line 89
    :cond_4
    iput-wide p1, p0, Lg9/e;->e:J

    .line 90
    .line 91
    iget-object p1, p0, Lg9/e;->a:Lg9/e$a;

    .line 92
    .line 93
    invoke-virtual {p1}, Lg9/e$a;->e()Z

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    if-eqz p1, :cond_5

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_5
    iget p1, p0, Lg9/e;->f:I

    .line 101
    .line 102
    add-int/lit8 v2, p1, 0x1

    .line 103
    .line 104
    :goto_1
    iput v2, p0, Lg9/e;->f:I

    .line 105
    .line 106
    return-void
    .line 107
.end method

.method public g()V
    .locals 3

    .line 1
    iget-object v0, p0, Lg9/e;->a:Lg9/e$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lg9/e$a;->g()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lg9/e;->b:Lg9/e$a;

    .line 7
    .line 8
    invoke-virtual {v0}, Lg9/e$a;->g()V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lg9/e;->c:Z

    .line 13
    .line 14
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    iput-wide v1, p0, Lg9/e;->e:J

    .line 20
    .line 21
    iput v0, p0, Lg9/e;->f:I

    .line 22
    .line 23
    return-void
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
.end method
