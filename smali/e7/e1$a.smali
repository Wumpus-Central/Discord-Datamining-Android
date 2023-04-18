.class public final Le7/e1$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le7/e1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:J

.field public final b:Lcom/google/android/exoplayer2/Timeline;

.field public final c:I

.field public final d:Lh8/u$a;

.field public final e:J

.field public final f:Lcom/google/android/exoplayer2/Timeline;

.field public final g:I

.field public final h:Lh8/u$a;

.field public final i:J

.field public final j:J


# direct methods
.method public constructor <init>(JLcom/google/android/exoplayer2/Timeline;ILh8/u$a;JLcom/google/android/exoplayer2/Timeline;ILh8/u$a;JJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Le7/e1$a;->a:J

    .line 5
    .line 6
    iput-object p3, p0, Le7/e1$a;->b:Lcom/google/android/exoplayer2/Timeline;

    .line 7
    .line 8
    iput p4, p0, Le7/e1$a;->c:I

    .line 9
    .line 10
    iput-object p5, p0, Le7/e1$a;->d:Lh8/u$a;

    .line 11
    .line 12
    iput-wide p6, p0, Le7/e1$a;->e:J

    .line 13
    .line 14
    iput-object p8, p0, Le7/e1$a;->f:Lcom/google/android/exoplayer2/Timeline;

    .line 15
    .line 16
    iput p9, p0, Le7/e1$a;->g:I

    .line 17
    .line 18
    iput-object p10, p0, Le7/e1$a;->h:Lh8/u$a;

    .line 19
    .line 20
    iput-wide p11, p0, Le7/e1$a;->i:J

    .line 21
    .line 22
    iput-wide p13, p0, Le7/e1$a;->j:J

    .line 23
    .line 24
    return-void
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
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_3

    .line 7
    .line 8
    const-class v2, Le7/e1$a;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    if-eq v2, v3, :cond_1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    check-cast p1, Le7/e1$a;

    .line 18
    .line 19
    iget-wide v2, p0, Le7/e1$a;->a:J

    .line 20
    .line 21
    iget-wide v4, p1, Le7/e1$a;->a:J

    .line 22
    .line 23
    cmp-long v2, v2, v4

    .line 24
    .line 25
    if-nez v2, :cond_2

    .line 26
    .line 27
    iget v2, p0, Le7/e1$a;->c:I

    .line 28
    .line 29
    iget v3, p1, Le7/e1$a;->c:I

    .line 30
    .line 31
    if-ne v2, v3, :cond_2

    .line 32
    .line 33
    iget-wide v2, p0, Le7/e1$a;->e:J

    .line 34
    .line 35
    iget-wide v4, p1, Le7/e1$a;->e:J

    .line 36
    .line 37
    cmp-long v2, v2, v4

    .line 38
    .line 39
    if-nez v2, :cond_2

    .line 40
    .line 41
    iget v2, p0, Le7/e1$a;->g:I

    .line 42
    .line 43
    iget v3, p1, Le7/e1$a;->g:I

    .line 44
    .line 45
    if-ne v2, v3, :cond_2

    .line 46
    .line 47
    iget-wide v2, p0, Le7/e1$a;->i:J

    .line 48
    .line 49
    iget-wide v4, p1, Le7/e1$a;->i:J

    .line 50
    .line 51
    cmp-long v2, v2, v4

    .line 52
    .line 53
    if-nez v2, :cond_2

    .line 54
    .line 55
    iget-wide v2, p0, Le7/e1$a;->j:J

    .line 56
    .line 57
    iget-wide v4, p1, Le7/e1$a;->j:J

    .line 58
    .line 59
    cmp-long v2, v2, v4

    .line 60
    .line 61
    if-nez v2, :cond_2

    .line 62
    .line 63
    iget-object v2, p0, Le7/e1$a;->b:Lcom/google/android/exoplayer2/Timeline;

    .line 64
    .line 65
    iget-object v3, p1, Le7/e1$a;->b:Lcom/google/android/exoplayer2/Timeline;

    .line 66
    .line 67
    invoke-static {v2, v3}, Lac/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-eqz v2, :cond_2

    .line 72
    .line 73
    iget-object v2, p0, Le7/e1$a;->d:Lh8/u$a;

    .line 74
    .line 75
    iget-object v3, p1, Le7/e1$a;->d:Lh8/u$a;

    .line 76
    .line 77
    invoke-static {v2, v3}, Lac/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-eqz v2, :cond_2

    .line 82
    .line 83
    iget-object v2, p0, Le7/e1$a;->f:Lcom/google/android/exoplayer2/Timeline;

    .line 84
    .line 85
    iget-object v3, p1, Le7/e1$a;->f:Lcom/google/android/exoplayer2/Timeline;

    .line 86
    .line 87
    invoke-static {v2, v3}, Lac/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-eqz v2, :cond_2

    .line 92
    .line 93
    iget-object v2, p0, Le7/e1$a;->h:Lh8/u$a;

    .line 94
    .line 95
    iget-object p1, p1, Le7/e1$a;->h:Lh8/u$a;

    .line 96
    .line 97
    invoke-static {v2, p1}, Lac/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    if-eqz p1, :cond_2

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_2
    move v0, v1

    .line 105
    :goto_0
    return v0

    .line 106
    :cond_3
    :goto_1
    return v1
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
    .locals 3

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    new-array v0, v0, [Ljava/lang/Object;

    .line 4
    .line 5
    iget-wide v1, p0, Le7/e1$a;->a:J

    .line 6
    .line 7
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v2, 0x0

    .line 12
    aput-object v1, v0, v2

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    iget-object v2, p0, Le7/e1$a;->b:Lcom/google/android/exoplayer2/Timeline;

    .line 16
    .line 17
    aput-object v2, v0, v1

    .line 18
    .line 19
    iget v1, p0, Le7/e1$a;->c:I

    .line 20
    .line 21
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const/4 v2, 0x2

    .line 26
    aput-object v1, v0, v2

    .line 27
    .line 28
    const/4 v1, 0x3

    .line 29
    iget-object v2, p0, Le7/e1$a;->d:Lh8/u$a;

    .line 30
    .line 31
    aput-object v2, v0, v1

    .line 32
    .line 33
    iget-wide v1, p0, Le7/e1$a;->e:J

    .line 34
    .line 35
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    const/4 v2, 0x4

    .line 40
    aput-object v1, v0, v2

    .line 41
    .line 42
    const/4 v1, 0x5

    .line 43
    iget-object v2, p0, Le7/e1$a;->f:Lcom/google/android/exoplayer2/Timeline;

    .line 44
    .line 45
    aput-object v2, v0, v1

    .line 46
    .line 47
    iget v1, p0, Le7/e1$a;->g:I

    .line 48
    .line 49
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    const/4 v2, 0x6

    .line 54
    aput-object v1, v0, v2

    .line 55
    .line 56
    const/4 v1, 0x7

    .line 57
    iget-object v2, p0, Le7/e1$a;->h:Lh8/u$a;

    .line 58
    .line 59
    aput-object v2, v0, v1

    .line 60
    .line 61
    iget-wide v1, p0, Le7/e1$a;->i:J

    .line 62
    .line 63
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    const/16 v2, 0x8

    .line 68
    .line 69
    aput-object v1, v0, v2

    .line 70
    .line 71
    iget-wide v1, p0, Le7/e1$a;->j:J

    .line 72
    .line 73
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    const/16 v2, 0x9

    .line 78
    .line 79
    aput-object v1, v0, v2

    .line 80
    .line 81
    invoke-static {v0}, Lac/h;->b([Ljava/lang/Object;)I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    return v0
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
