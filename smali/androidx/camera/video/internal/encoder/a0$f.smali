.class Landroidx/camera/video/internal/encoder/a0$f;
.super Landroid/media/MediaCodec$Callback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/video/internal/encoder/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "f"
.end annotation


# instance fields
.field private final a:Lp0/a;

.field private b:Z

.field private c:Z

.field private d:Z

.field private e:J

.field private f:J

.field private g:Z

.field final synthetic h:Landroidx/camera/video/internal/encoder/a0;


# direct methods
.method constructor <init>(Landroidx/camera/video/internal/encoder/a0;)V
    .locals 3

    .line 1
    iput-object p1, p0, Landroidx/camera/video/internal/encoder/a0$f;->h:Landroidx/camera/video/internal/encoder/a0;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/media/MediaCodec$Callback;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Landroidx/camera/video/internal/encoder/a0$f;->b:Z

    .line 8
    .line 9
    iput-boolean v0, p0, Landroidx/camera/video/internal/encoder/a0$f;->c:Z

    .line 10
    .line 11
    iput-boolean v0, p0, Landroidx/camera/video/internal/encoder/a0$f;->d:Z

    .line 12
    .line 13
    const-wide/16 v1, 0x0

    .line 14
    .line 15
    iput-wide v1, p0, Landroidx/camera/video/internal/encoder/a0$f;->e:J

    .line 16
    .line 17
    iput-wide v1, p0, Landroidx/camera/video/internal/encoder/a0$f;->f:J

    .line 18
    .line 19
    iput-boolean v0, p0, Landroidx/camera/video/internal/encoder/a0$f;->g:Z

    .line 20
    .line 21
    iget-boolean p1, p1, Landroidx/camera/video/internal/encoder/a0;->c:Z

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    const-class p1, Lm0/b;

    .line 26
    .line 27
    invoke-static {p1}, Lm0/d;->a(Ljava/lang/Class;)Lw/f2;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    new-instance p1, Lp0/a;

    .line 34
    .line 35
    invoke-direct {p1}, Lp0/a;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, Landroidx/camera/video/internal/encoder/a0$f;->a:Lp0/a;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const/4 p1, 0x0

    .line 42
    iput-object p1, p0, Landroidx/camera/video/internal/encoder/a0$f;->a:Lp0/a;

    .line 43
    .line 44
    :goto_0
    return-void
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
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
.end method

.method public static synthetic a(Landroidx/camera/video/internal/encoder/l;)V
    .locals 0

    invoke-static {p0}, Landroidx/camera/video/internal/encoder/a0$f;->r(Landroidx/camera/video/internal/encoder/l;)V

    return-void
.end method

.method public static synthetic b(Landroidx/camera/video/internal/encoder/a0$f;Landroid/media/MediaCodec$CodecException;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/video/internal/encoder/a0$f;->j(Landroid/media/MediaCodec$CodecException;)V

    return-void
.end method

.method public static synthetic c(Landroidx/camera/video/internal/encoder/a0$f;Ljava/util/concurrent/Executor;Landroidx/camera/video/internal/encoder/l;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/camera/video/internal/encoder/a0$f;->l(Ljava/util/concurrent/Executor;Landroidx/camera/video/internal/encoder/l;)V

    return-void
.end method

.method public static synthetic d(Landroidx/camera/video/internal/encoder/a0$f;I)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/video/internal/encoder/a0$f;->k(I)V

    return-void
.end method

.method public static synthetic e(Landroidx/camera/video/internal/encoder/a0$f;Landroid/media/MediaFormat;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/video/internal/encoder/a0$f;->p(Landroid/media/MediaFormat;)V

    return-void
.end method

.method public static synthetic f(Landroid/media/MediaFormat;)Landroid/media/MediaFormat;
    .locals 0

    invoke-static {p0}, Landroidx/camera/video/internal/encoder/a0$f;->n(Landroid/media/MediaFormat;)Landroid/media/MediaFormat;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Landroidx/camera/video/internal/encoder/l;Landroid/media/MediaFormat;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/camera/video/internal/encoder/a0$f;->o(Landroidx/camera/video/internal/encoder/l;Landroid/media/MediaFormat;)V

    return-void
.end method

.method public static synthetic h(Landroidx/camera/video/internal/encoder/l;Landroidx/camera/video/internal/encoder/g;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/camera/video/internal/encoder/a0$f;->q(Landroidx/camera/video/internal/encoder/l;Landroidx/camera/video/internal/encoder/g;)V

    return-void
.end method

.method public static synthetic i(Landroidx/camera/video/internal/encoder/a0$f;Landroid/media/MediaCodec$BufferInfo;Landroid/media/MediaCodec;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroidx/camera/video/internal/encoder/a0$f;->m(Landroid/media/MediaCodec$BufferInfo;Landroid/media/MediaCodec;I)V

    return-void
.end method

.method private synthetic j(Landroid/media/MediaCodec$CodecException;)V
    .locals 2

    .line 1
    sget-object v0, Landroidx/camera/video/internal/encoder/a0$b;->a:[I

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/camera/video/internal/encoder/a0$f;->h:Landroidx/camera/video/internal/encoder/a0;

    .line 4
    .line 5
    iget-object v1, v1, Landroidx/camera/video/internal/encoder/a0;->o:Landroidx/camera/video/internal/encoder/a0$e;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    aget v0, v0, v1

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    new-instance v0, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v1, "Unknown state: "

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Landroidx/camera/video/internal/encoder/a0$f;->h:Landroidx/camera/video/internal/encoder/a0;

    .line 29
    .line 30
    iget-object v1, v1, Landroidx/camera/video/internal/encoder/a0;->o:Landroidx/camera/video/internal/encoder/a0$e;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw p1

    .line 43
    :pswitch_0
    iget-object v0, p0, Landroidx/camera/video/internal/encoder/a0$f;->h:Landroidx/camera/video/internal/encoder/a0;

    .line 44
    .line 45
    invoke-virtual {v0, p1}, Landroidx/camera/video/internal/encoder/a0;->r(Landroid/media/MediaCodec$CodecException;)V

    .line 46
    .line 47
    .line 48
    :pswitch_1
    return-void

    .line 49
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
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
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
.end method

.method private synthetic k(I)V
    .locals 2

    .line 1
    sget-object v0, Landroidx/camera/video/internal/encoder/a0$b;->a:[I

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/camera/video/internal/encoder/a0$f;->h:Landroidx/camera/video/internal/encoder/a0;

    .line 4
    .line 5
    iget-object v1, v1, Landroidx/camera/video/internal/encoder/a0;->o:Landroidx/camera/video/internal/encoder/a0$e;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    aget v0, v0, v1

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    new-instance v0, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v1, "Unknown state: "

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Landroidx/camera/video/internal/encoder/a0$f;->h:Landroidx/camera/video/internal/encoder/a0;

    .line 29
    .line 30
    iget-object v1, v1, Landroidx/camera/video/internal/encoder/a0;->o:Landroidx/camera/video/internal/encoder/a0$e;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw p1

    .line 43
    :pswitch_0
    iget-object v0, p0, Landroidx/camera/video/internal/encoder/a0$f;->h:Landroidx/camera/video/internal/encoder/a0;

    .line 44
    .line 45
    iget-object v0, v0, Landroidx/camera/video/internal/encoder/a0;->h:Ljava/util/Queue;

    .line 46
    .line 47
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-interface {v0, p1}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    iget-object p1, p0, Landroidx/camera/video/internal/encoder/a0$f;->h:Landroidx/camera/video/internal/encoder/a0;

    .line 55
    .line 56
    invoke-virtual {p1}, Landroidx/camera/video/internal/encoder/a0;->I()V

    .line 57
    .line 58
    .line 59
    :pswitch_1
    return-void

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
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
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
.end method

.method private synthetic l(Ljava/util/concurrent/Executor;Landroidx/camera/video/internal/encoder/l;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/video/internal/encoder/a0$f;->h:Landroidx/camera/video/internal/encoder/a0;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/camera/video/internal/encoder/a0;->o:Landroidx/camera/video/internal/encoder/a0$e;

    .line 4
    .line 5
    sget-object v1, Landroidx/camera/video/internal/encoder/a0$e;->r:Landroidx/camera/video/internal/encoder/a0$e;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    :try_start_0
    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    new-instance v0, Landroidx/camera/video/internal/encoder/v0;

    .line 14
    .line 15
    invoke-direct {v0, p2}, Landroidx/camera/video/internal/encoder/v0;-><init>(Landroidx/camera/video/internal/encoder/l;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catch_0
    move-exception p1

    .line 23
    iget-object p2, p0, Landroidx/camera/video/internal/encoder/a0$f;->h:Landroidx/camera/video/internal/encoder/a0;

    .line 24
    .line 25
    iget-object p2, p2, Landroidx/camera/video/internal/encoder/a0;->a:Ljava/lang/String;

    .line 26
    .line 27
    const-string v0, "Unable to post to the supplied executor."

    .line 28
    .line 29
    invoke-static {p2, v0, p1}, Landroidx/camera/core/r1;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    :goto_0
    return-void
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
.end method

.method private synthetic m(Landroid/media/MediaCodec$BufferInfo;Landroid/media/MediaCodec;I)V
    .locals 8

    .line 1
    sget-object v0, Landroidx/camera/video/internal/encoder/a0$b;->a:[I

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/camera/video/internal/encoder/a0$f;->h:Landroidx/camera/video/internal/encoder/a0;

    .line 4
    .line 5
    iget-object v1, v1, Landroidx/camera/video/internal/encoder/a0;->o:Landroidx/camera/video/internal/encoder/a0$e;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    aget v0, v0, v1

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    new-instance p2, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string p3, "Unknown state: "

    .line 24
    .line 25
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object p3, p0, Landroidx/camera/video/internal/encoder/a0$f;->h:Landroidx/camera/video/internal/encoder/a0;

    .line 29
    .line 30
    iget-object p3, p3, Landroidx/camera/video/internal/encoder/a0;->o:Landroidx/camera/video/internal/encoder/a0$e;

    .line 31
    .line 32
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw p1

    .line 43
    :pswitch_0
    iget-object v0, p0, Landroidx/camera/video/internal/encoder/a0$f;->h:Landroidx/camera/video/internal/encoder/a0;

    .line 44
    .line 45
    iget-object v0, v0, Landroidx/camera/video/internal/encoder/a0;->b:Ljava/lang/Object;

    .line 46
    .line 47
    monitor-enter v0

    .line 48
    :try_start_0
    iget-object v1, p0, Landroidx/camera/video/internal/encoder/a0$f;->h:Landroidx/camera/video/internal/encoder/a0;

    .line 49
    .line 50
    iget-object v2, v1, Landroidx/camera/video/internal/encoder/a0;->m:Landroidx/camera/video/internal/encoder/l;

    .line 51
    .line 52
    iget-object v1, v1, Landroidx/camera/video/internal/encoder/a0;->n:Ljava/util/concurrent/Executor;

    .line 53
    .line 54
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    iget-object v0, p0, Landroidx/camera/video/internal/encoder/a0$f;->a:Lp0/a;

    .line 56
    .line 57
    if-eqz v0, :cond_0

    .line 58
    .line 59
    invoke-virtual {v0, p1}, Lp0/a;->a(Landroid/media/MediaCodec$BufferInfo;)V

    .line 60
    .line 61
    .line 62
    :cond_0
    iget-boolean v0, p0, Landroidx/camera/video/internal/encoder/a0$f;->b:Z

    .line 63
    .line 64
    const/4 v3, 0x1

    .line 65
    if-nez v0, :cond_1

    .line 66
    .line 67
    iput-boolean v3, p0, Landroidx/camera/video/internal/encoder/a0$f;->b:Z

    .line 68
    .line 69
    :try_start_1
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    new-instance v0, Landroidx/camera/video/internal/encoder/r0;

    .line 73
    .line 74
    invoke-direct {v0, v2}, Landroidx/camera/video/internal/encoder/r0;-><init>(Landroidx/camera/video/internal/encoder/l;)V

    .line 75
    .line 76
    .line 77
    invoke-interface {v1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_1 .. :try_end_1} :catch_0

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :catch_0
    move-exception v0

    .line 82
    iget-object v4, p0, Landroidx/camera/video/internal/encoder/a0$f;->h:Landroidx/camera/video/internal/encoder/a0;

    .line 83
    .line 84
    iget-object v4, v4, Landroidx/camera/video/internal/encoder/a0;->a:Ljava/lang/String;

    .line 85
    .line 86
    const-string v5, "Unable to post to the supplied executor."

    .line 87
    .line 88
    invoke-static {v4, v5, v0}, Landroidx/camera/core/r1;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 89
    .line 90
    .line 91
    :cond_1
    :goto_0
    invoke-direct {p0, p1}, Landroidx/camera/video/internal/encoder/a0$f;->t(Landroid/media/MediaCodec$BufferInfo;)Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-nez v0, :cond_4

    .line 96
    .line 97
    iget-boolean v0, p0, Landroidx/camera/video/internal/encoder/a0$f;->c:Z

    .line 98
    .line 99
    if-nez v0, :cond_2

    .line 100
    .line 101
    iput-boolean v3, p0, Landroidx/camera/video/internal/encoder/a0$f;->c:Z

    .line 102
    .line 103
    :cond_2
    iget-object v0, p0, Landroidx/camera/video/internal/encoder/a0$f;->h:Landroidx/camera/video/internal/encoder/a0;

    .line 104
    .line 105
    iget-wide v4, v0, Landroidx/camera/video/internal/encoder/a0;->q:J

    .line 106
    .line 107
    const-wide/16 v6, 0x0

    .line 108
    .line 109
    cmp-long v0, v4, v6

    .line 110
    .line 111
    if-lez v0, :cond_3

    .line 112
    .line 113
    iget-wide v6, p1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 114
    .line 115
    sub-long/2addr v6, v4

    .line 116
    iput-wide v6, p1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 117
    .line 118
    :cond_3
    iget-wide v4, p1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 119
    .line 120
    iput-wide v4, p0, Landroidx/camera/video/internal/encoder/a0$f;->f:J

    .line 121
    .line 122
    :try_start_2
    new-instance v0, Landroidx/camera/video/internal/encoder/g;

    .line 123
    .line 124
    invoke-direct {v0, p2, p3, p1}, Landroidx/camera/video/internal/encoder/g;-><init>(Landroid/media/MediaCodec;ILandroid/media/MediaCodec$BufferInfo;)V

    .line 125
    .line 126
    .line 127
    invoke-direct {p0, v0, v2, v1}, Landroidx/camera/video/internal/encoder/a0$f;->s(Landroidx/camera/video/internal/encoder/g;Landroidx/camera/video/internal/encoder/l;Ljava/util/concurrent/Executor;)V
    :try_end_2
    .catch Landroid/media/MediaCodec$CodecException; {:try_start_2 .. :try_end_2} :catch_1

    .line 128
    .line 129
    .line 130
    goto :goto_1

    .line 131
    :catch_1
    move-exception p1

    .line 132
    iget-object p2, p0, Landroidx/camera/video/internal/encoder/a0$f;->h:Landroidx/camera/video/internal/encoder/a0;

    .line 133
    .line 134
    invoke-virtual {p2, p1}, Landroidx/camera/video/internal/encoder/a0;->r(Landroid/media/MediaCodec$CodecException;)V

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :cond_4
    :try_start_3
    iget-object p2, p0, Landroidx/camera/video/internal/encoder/a0$f;->h:Landroidx/camera/video/internal/encoder/a0;

    .line 139
    .line 140
    iget-object p2, p2, Landroidx/camera/video/internal/encoder/a0;->e:Landroid/media/MediaCodec;

    .line 141
    .line 142
    const/4 v0, 0x0

    .line 143
    invoke-virtual {p2, p3, v0}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V
    :try_end_3
    .catch Landroid/media/MediaCodec$CodecException; {:try_start_3 .. :try_end_3} :catch_2

    .line 144
    .line 145
    .line 146
    :goto_1
    iget-boolean p2, p0, Landroidx/camera/video/internal/encoder/a0$f;->d:Z

    .line 147
    .line 148
    if-nez p2, :cond_5

    .line 149
    .line 150
    invoke-static {p1}, Landroidx/camera/video/internal/encoder/a0;->t(Landroid/media/MediaCodec$BufferInfo;)Z

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    if-eqz p1, :cond_5

    .line 155
    .line 156
    iput-boolean v3, p0, Landroidx/camera/video/internal/encoder/a0$f;->d:Z

    .line 157
    .line 158
    iget-object p1, p0, Landroidx/camera/video/internal/encoder/a0$f;->h:Landroidx/camera/video/internal/encoder/a0;

    .line 159
    .line 160
    new-instance p2, Landroidx/camera/video/internal/encoder/s0;

    .line 161
    .line 162
    invoke-direct {p2, p0, v1, v2}, Landroidx/camera/video/internal/encoder/s0;-><init>(Landroidx/camera/video/internal/encoder/a0$f;Ljava/util/concurrent/Executor;Landroidx/camera/video/internal/encoder/l;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p1, p2}, Landroidx/camera/video/internal/encoder/a0;->X(Ljava/lang/Runnable;)V

    .line 166
    .line 167
    .line 168
    goto :goto_2

    .line 169
    :catch_2
    move-exception p1

    .line 170
    iget-object p2, p0, Landroidx/camera/video/internal/encoder/a0$f;->h:Landroidx/camera/video/internal/encoder/a0;

    .line 171
    .line 172
    invoke-virtual {p2, p1}, Landroidx/camera/video/internal/encoder/a0;->r(Landroid/media/MediaCodec$CodecException;)V

    .line 173
    .line 174
    .line 175
    return-void

    .line 176
    :catchall_0
    move-exception p1

    .line 177
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 178
    throw p1

    .line 179
    :cond_5
    :goto_2
    :pswitch_1
    return-void

    .line 180
    nop

    .line 181
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
.end method

.method private static synthetic n(Landroid/media/MediaFormat;)Landroid/media/MediaFormat;
    .locals 0

    return-object p0
.end method

.method private static synthetic o(Landroidx/camera/video/internal/encoder/l;Landroid/media/MediaFormat;)V
    .locals 1

    new-instance v0, Landroidx/camera/video/internal/encoder/u0;

    invoke-direct {v0, p1}, Landroidx/camera/video/internal/encoder/u0;-><init>(Landroid/media/MediaFormat;)V

    invoke-interface {p0, v0}, Landroidx/camera/video/internal/encoder/l;->b(Landroidx/camera/video/internal/encoder/b1;)V

    return-void
.end method

.method private synthetic p(Landroid/media/MediaFormat;)V
    .locals 3

    .line 1
    sget-object v0, Landroidx/camera/video/internal/encoder/a0$b;->a:[I

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/camera/video/internal/encoder/a0$f;->h:Landroidx/camera/video/internal/encoder/a0;

    .line 4
    .line 5
    iget-object v1, v1, Landroidx/camera/video/internal/encoder/a0;->o:Landroidx/camera/video/internal/encoder/a0$e;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    aget v0, v0, v1

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    new-instance v0, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v1, "Unknown state: "

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Landroidx/camera/video/internal/encoder/a0$f;->h:Landroidx/camera/video/internal/encoder/a0;

    .line 29
    .line 30
    iget-object v1, v1, Landroidx/camera/video/internal/encoder/a0;->o:Landroidx/camera/video/internal/encoder/a0$e;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw p1

    .line 43
    :pswitch_0
    iget-object v0, p0, Landroidx/camera/video/internal/encoder/a0$f;->h:Landroidx/camera/video/internal/encoder/a0;

    .line 44
    .line 45
    iget-object v0, v0, Landroidx/camera/video/internal/encoder/a0;->b:Ljava/lang/Object;

    .line 46
    .line 47
    monitor-enter v0

    .line 48
    :try_start_0
    iget-object v1, p0, Landroidx/camera/video/internal/encoder/a0$f;->h:Landroidx/camera/video/internal/encoder/a0;

    .line 49
    .line 50
    iget-object v2, v1, Landroidx/camera/video/internal/encoder/a0;->m:Landroidx/camera/video/internal/encoder/l;

    .line 51
    .line 52
    iget-object v1, v1, Landroidx/camera/video/internal/encoder/a0;->n:Ljava/util/concurrent/Executor;

    .line 53
    .line 54
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    :try_start_1
    new-instance v0, Landroidx/camera/video/internal/encoder/q0;

    .line 56
    .line 57
    invoke-direct {v0, v2, p1}, Landroidx/camera/video/internal/encoder/q0;-><init>(Landroidx/camera/video/internal/encoder/l;Landroid/media/MediaFormat;)V

    .line 58
    .line 59
    .line 60
    invoke-interface {v1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_1 .. :try_end_1} :catch_0

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :catch_0
    move-exception p1

    .line 65
    iget-object v0, p0, Landroidx/camera/video/internal/encoder/a0$f;->h:Landroidx/camera/video/internal/encoder/a0;

    .line 66
    .line 67
    iget-object v0, v0, Landroidx/camera/video/internal/encoder/a0;->a:Ljava/lang/String;

    .line 68
    .line 69
    const-string v1, "Unable to post to the supplied executor."

    .line 70
    .line 71
    invoke-static {v0, v1, p1}, Landroidx/camera/core/r1;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :catchall_0
    move-exception p1

    .line 76
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 77
    throw p1

    .line 78
    :goto_0
    :pswitch_1
    return-void

    .line 79
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
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
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
.end method

.method private static synthetic q(Landroidx/camera/video/internal/encoder/l;Landroidx/camera/video/internal/encoder/g;)V
    .locals 0

    invoke-interface {p0, p1}, Landroidx/camera/video/internal/encoder/l;->e(Landroidx/camera/video/internal/encoder/e;)V

    return-void
.end method

.method private static synthetic r(Landroidx/camera/video/internal/encoder/l;)V
    .locals 0

    invoke-interface {p0}, Landroidx/camera/video/internal/encoder/l;->f()V

    return-void
.end method

.method private s(Landroidx/camera/video/internal/encoder/g;Landroidx/camera/video/internal/encoder/l;Ljava/util/concurrent/Executor;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/video/internal/encoder/a0$f;->h:Landroidx/camera/video/internal/encoder/a0;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/camera/video/internal/encoder/a0;->k:Ljava/util/Set;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Landroidx/camera/video/internal/encoder/g;->f()Lfc/b;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, Landroidx/camera/video/internal/encoder/a0$f$a;

    .line 13
    .line 14
    invoke-direct {v1, p0, p1}, Landroidx/camera/video/internal/encoder/a0$f$a;-><init>(Landroidx/camera/video/internal/encoder/a0$f;Landroidx/camera/video/internal/encoder/g;)V

    .line 15
    .line 16
    .line 17
    iget-object v2, p0, Landroidx/camera/video/internal/encoder/a0$f;->h:Landroidx/camera/video/internal/encoder/a0;

    .line 18
    .line 19
    iget-object v2, v2, Landroidx/camera/video/internal/encoder/a0;->g:Ljava/util/concurrent/Executor;

    .line 20
    .line 21
    invoke-static {v0, v1, v2}, Ly/f;->b(Lfc/b;Ly/c;Ljava/util/concurrent/Executor;)V

    .line 22
    .line 23
    .line 24
    :try_start_0
    new-instance v0, Landroidx/camera/video/internal/encoder/m0;

    .line 25
    .line 26
    invoke-direct {v0, p2, p1}, Landroidx/camera/video/internal/encoder/m0;-><init>(Landroidx/camera/video/internal/encoder/l;Landroidx/camera/video/internal/encoder/g;)V

    .line 27
    .line 28
    .line 29
    invoke-interface {p3, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catch_0
    move-exception p2

    .line 34
    iget-object p3, p0, Landroidx/camera/video/internal/encoder/a0$f;->h:Landroidx/camera/video/internal/encoder/a0;

    .line 35
    .line 36
    iget-object p3, p3, Landroidx/camera/video/internal/encoder/a0;->a:Ljava/lang/String;

    .line 37
    .line 38
    const-string v0, "Unable to post to the supplied executor."

    .line 39
    .line 40
    invoke-static {p3, v0, p2}, Landroidx/camera/core/r1;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Landroidx/camera/video/internal/encoder/g;->close()V

    .line 44
    .line 45
    .line 46
    :goto_0
    return-void
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
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
.end method

.method private t(Landroid/media/MediaCodec$BufferInfo;)Z
    .locals 6

    .line 1
    iget-boolean v0, p0, Landroidx/camera/video/internal/encoder/a0$f;->d:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object p1, p0, Landroidx/camera/video/internal/encoder/a0$f;->h:Landroidx/camera/video/internal/encoder/a0;

    .line 7
    .line 8
    iget-object p1, p1, Landroidx/camera/video/internal/encoder/a0;->a:Ljava/lang/String;

    .line 9
    .line 10
    const-string v0, "Drop buffer by already reach end of stream."

    .line 11
    .line 12
    invoke-static {p1, v0}, Landroidx/camera/core/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return v1

    .line 16
    :cond_0
    iget v0, p1, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 17
    .line 18
    if-gtz v0, :cond_1

    .line 19
    .line 20
    iget-object p1, p0, Landroidx/camera/video/internal/encoder/a0$f;->h:Landroidx/camera/video/internal/encoder/a0;

    .line 21
    .line 22
    iget-object p1, p1, Landroidx/camera/video/internal/encoder/a0;->a:Ljava/lang/String;

    .line 23
    .line 24
    const-string v0, "Drop buffer by invalid buffer size."

    .line 25
    .line 26
    invoke-static {p1, v0}, Landroidx/camera/core/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return v1

    .line 30
    :cond_1
    iget v0, p1, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 31
    .line 32
    and-int/lit8 v0, v0, 0x2

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    iget-object p1, p0, Landroidx/camera/video/internal/encoder/a0$f;->h:Landroidx/camera/video/internal/encoder/a0;

    .line 37
    .line 38
    iget-object p1, p1, Landroidx/camera/video/internal/encoder/a0;->a:Ljava/lang/String;

    .line 39
    .line 40
    const-string v0, "Drop buffer by codec config."

    .line 41
    .line 42
    invoke-static {p1, v0}, Landroidx/camera/core/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    return v1

    .line 46
    :cond_2
    iget-wide v2, p1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 47
    .line 48
    iget-wide v4, p0, Landroidx/camera/video/internal/encoder/a0$f;->e:J

    .line 49
    .line 50
    cmp-long v0, v2, v4

    .line 51
    .line 52
    if-gtz v0, :cond_3

    .line 53
    .line 54
    iget-object p1, p0, Landroidx/camera/video/internal/encoder/a0$f;->h:Landroidx/camera/video/internal/encoder/a0;

    .line 55
    .line 56
    iget-object p1, p1, Landroidx/camera/video/internal/encoder/a0;->a:Ljava/lang/String;

    .line 57
    .line 58
    const-string v0, "Drop buffer by out of order buffer from MediaCodec."

    .line 59
    .line 60
    invoke-static {p1, v0}, Landroidx/camera/core/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return v1

    .line 64
    :cond_3
    iput-wide v2, p0, Landroidx/camera/video/internal/encoder/a0$f;->e:J

    .line 65
    .line 66
    iget-object v0, p0, Landroidx/camera/video/internal/encoder/a0$f;->h:Landroidx/camera/video/internal/encoder/a0;

    .line 67
    .line 68
    iget-object v0, v0, Landroidx/camera/video/internal/encoder/a0;->p:Landroid/util/Range;

    .line 69
    .line 70
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-virtual {v0, v2}, Landroid/util/Range;->contains(Ljava/lang/Comparable;)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-nez v0, :cond_4

    .line 79
    .line 80
    iget-object p1, p0, Landroidx/camera/video/internal/encoder/a0$f;->h:Landroidx/camera/video/internal/encoder/a0;

    .line 81
    .line 82
    iget-object p1, p1, Landroidx/camera/video/internal/encoder/a0;->a:Ljava/lang/String;

    .line 83
    .line 84
    const-string v0, "Drop buffer by not in start-stop range."

    .line 85
    .line 86
    invoke-static {p1, v0}, Landroidx/camera/core/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    return v1

    .line 90
    :cond_4
    invoke-direct {p0, p1}, Landroidx/camera/video/internal/encoder/a0$f;->u(Landroid/media/MediaCodec$BufferInfo;)Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-eqz v0, :cond_5

    .line 95
    .line 96
    iget-object p1, p0, Landroidx/camera/video/internal/encoder/a0$f;->h:Landroidx/camera/video/internal/encoder/a0;

    .line 97
    .line 98
    iget-object p1, p1, Landroidx/camera/video/internal/encoder/a0;->a:Ljava/lang/String;

    .line 99
    .line 100
    const-string v0, "Drop buffer by pause."

    .line 101
    .line 102
    invoke-static {p1, v0}, Landroidx/camera/core/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    return v1

    .line 106
    :cond_5
    iget-boolean v0, p0, Landroidx/camera/video/internal/encoder/a0$f;->c:Z

    .line 107
    .line 108
    if-nez v0, :cond_6

    .line 109
    .line 110
    iget-object v0, p0, Landroidx/camera/video/internal/encoder/a0$f;->h:Landroidx/camera/video/internal/encoder/a0;

    .line 111
    .line 112
    iget-boolean v0, v0, Landroidx/camera/video/internal/encoder/a0;->c:Z

    .line 113
    .line 114
    if-eqz v0, :cond_6

    .line 115
    .line 116
    invoke-static {p1}, Landroidx/camera/video/internal/encoder/a0;->v(Landroid/media/MediaCodec$BufferInfo;)Z

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    if-nez p1, :cond_6

    .line 121
    .line 122
    iget-object p1, p0, Landroidx/camera/video/internal/encoder/a0$f;->h:Landroidx/camera/video/internal/encoder/a0;

    .line 123
    .line 124
    iget-object p1, p1, Landroidx/camera/video/internal/encoder/a0;->a:Ljava/lang/String;

    .line 125
    .line 126
    const-string v0, "Drop buffer by first video frame is not key frame."

    .line 127
    .line 128
    invoke-static {p1, v0}, Landroidx/camera/core/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    iget-object p1, p0, Landroidx/camera/video/internal/encoder/a0$f;->h:Landroidx/camera/video/internal/encoder/a0;

    .line 132
    .line 133
    invoke-virtual {p1}, Landroidx/camera/video/internal/encoder/a0;->O()V

    .line 134
    .line 135
    .line 136
    return v1

    .line 137
    :cond_6
    const/4 p1, 0x0

    .line 138
    return p1
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
.end method

.method private u(Landroid/media/MediaCodec$BufferInfo;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/camera/video/internal/encoder/a0$f;->h:Landroidx/camera/video/internal/encoder/a0;

    .line 2
    .line 3
    iget-wide v1, p1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 4
    .line 5
    invoke-virtual {v0, v1, v2}, Landroidx/camera/video/internal/encoder/a0;->Y(J)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Landroidx/camera/video/internal/encoder/a0$f;->h:Landroidx/camera/video/internal/encoder/a0;

    .line 9
    .line 10
    iget-wide v1, p1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 11
    .line 12
    invoke-virtual {v0, v1, v2}, Landroidx/camera/video/internal/encoder/a0;->u(J)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-boolean v1, p0, Landroidx/camera/video/internal/encoder/a0$f;->g:Z

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    iget-object p1, p0, Landroidx/camera/video/internal/encoder/a0$f;->h:Landroidx/camera/video/internal/encoder/a0;

    .line 24
    .line 25
    iget-object p1, p1, Landroidx/camera/video/internal/encoder/a0;->a:Ljava/lang/String;

    .line 26
    .line 27
    const-string v0, "Switch to pause state"

    .line 28
    .line 29
    invoke-static {p1, v0}, Landroidx/camera/core/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 p1, 0x1

    .line 33
    iput-boolean p1, p0, Landroidx/camera/video/internal/encoder/a0$f;->g:Z

    .line 34
    .line 35
    iget-object v0, p0, Landroidx/camera/video/internal/encoder/a0$f;->h:Landroidx/camera/video/internal/encoder/a0;

    .line 36
    .line 37
    iget-object v3, v0, Landroidx/camera/video/internal/encoder/a0;->b:Ljava/lang/Object;

    .line 38
    .line 39
    monitor-enter v3

    .line 40
    :try_start_0
    iget-object v0, p0, Landroidx/camera/video/internal/encoder/a0$f;->h:Landroidx/camera/video/internal/encoder/a0;

    .line 41
    .line 42
    iget-object v1, v0, Landroidx/camera/video/internal/encoder/a0;->n:Ljava/util/concurrent/Executor;

    .line 43
    .line 44
    iget-object v0, v0, Landroidx/camera/video/internal/encoder/a0;->m:Landroidx/camera/video/internal/encoder/l;

    .line 45
    .line 46
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    new-instance v3, Landroidx/camera/video/internal/encoder/t0;

    .line 48
    .line 49
    invoke-direct {v3, v0}, Landroidx/camera/video/internal/encoder/t0;-><init>(Landroidx/camera/video/internal/encoder/l;)V

    .line 50
    .line 51
    .line 52
    invoke-interface {v1, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Landroidx/camera/video/internal/encoder/a0$f;->h:Landroidx/camera/video/internal/encoder/a0;

    .line 56
    .line 57
    iget-object v1, v0, Landroidx/camera/video/internal/encoder/a0;->o:Landroidx/camera/video/internal/encoder/a0$e;

    .line 58
    .line 59
    sget-object v3, Landroidx/camera/video/internal/encoder/a0$e;->m:Landroidx/camera/video/internal/encoder/a0$e;

    .line 60
    .line 61
    if-ne v1, v3, :cond_4

    .line 62
    .line 63
    iget-object v0, v0, Landroidx/camera/video/internal/encoder/a0;->f:Landroidx/camera/video/internal/encoder/i;

    .line 64
    .line 65
    instance-of v1, v0, Landroidx/camera/video/internal/encoder/a0$d;

    .line 66
    .line 67
    if-eqz v1, :cond_0

    .line 68
    .line 69
    check-cast v0, Landroidx/camera/video/internal/encoder/a0$d;

    .line 70
    .line 71
    invoke-virtual {v0, v2}, Landroidx/camera/video/internal/encoder/a0$d;->z(Z)V

    .line 72
    .line 73
    .line 74
    :cond_0
    iget-object v0, p0, Landroidx/camera/video/internal/encoder/a0$f;->h:Landroidx/camera/video/internal/encoder/a0;

    .line 75
    .line 76
    invoke-virtual {v0, p1}, Landroidx/camera/video/internal/encoder/a0;->R(Z)V

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :catchall_0
    move-exception p1

    .line 81
    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 82
    throw p1

    .line 83
    :cond_1
    if-eqz v1, :cond_4

    .line 84
    .line 85
    if-nez v0, :cond_4

    .line 86
    .line 87
    iget-object v0, p0, Landroidx/camera/video/internal/encoder/a0$f;->h:Landroidx/camera/video/internal/encoder/a0;

    .line 88
    .line 89
    iget-boolean v0, v0, Landroidx/camera/video/internal/encoder/a0;->c:Z

    .line 90
    .line 91
    if-eqz v0, :cond_2

    .line 92
    .line 93
    invoke-static {p1}, Landroidx/camera/video/internal/encoder/a0;->v(Landroid/media/MediaCodec$BufferInfo;)Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-nez v0, :cond_2

    .line 98
    .line 99
    iget-object p1, p0, Landroidx/camera/video/internal/encoder/a0$f;->h:Landroidx/camera/video/internal/encoder/a0;

    .line 100
    .line 101
    iget-object p1, p1, Landroidx/camera/video/internal/encoder/a0;->a:Ljava/lang/String;

    .line 102
    .line 103
    const-string v0, "Not a key frame, don\'t switch to resume state."

    .line 104
    .line 105
    invoke-static {p1, v0}, Landroidx/camera/core/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    iget-object p1, p0, Landroidx/camera/video/internal/encoder/a0$f;->h:Landroidx/camera/video/internal/encoder/a0;

    .line 109
    .line 110
    invoke-virtual {p1}, Landroidx/camera/video/internal/encoder/a0;->O()V

    .line 111
    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_2
    iget-wide v0, p1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 115
    .line 116
    iget-object p1, p0, Landroidx/camera/video/internal/encoder/a0$f;->h:Landroidx/camera/video/internal/encoder/a0;

    .line 117
    .line 118
    iget-wide v3, p1, Landroidx/camera/video/internal/encoder/a0;->q:J

    .line 119
    .line 120
    sub-long/2addr v0, v3

    .line 121
    iget-wide v3, p0, Landroidx/camera/video/internal/encoder/a0$f;->f:J

    .line 122
    .line 123
    cmp-long v0, v0, v3

    .line 124
    .line 125
    if-lez v0, :cond_3

    .line 126
    .line 127
    iget-object p1, p1, Landroidx/camera/video/internal/encoder/a0;->a:Ljava/lang/String;

    .line 128
    .line 129
    const-string v0, "Switch to resume state"

    .line 130
    .line 131
    invoke-static {p1, v0}, Landroidx/camera/core/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    iput-boolean v2, p0, Landroidx/camera/video/internal/encoder/a0$f;->g:Z

    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_3
    iget-object p1, p1, Landroidx/camera/video/internal/encoder/a0;->a:Ljava/lang/String;

    .line 138
    .line 139
    const-string v0, "Adjusted time by pause duration is invalid."

    .line 140
    .line 141
    invoke-static {p1, v0}, Landroidx/camera/core/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    :cond_4
    :goto_0
    iget-boolean p1, p0, Landroidx/camera/video/internal/encoder/a0$f;->g:Z

    .line 145
    .line 146
    return p1
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
.end method


# virtual methods
.method public onError(Landroid/media/MediaCodec;Landroid/media/MediaCodec$CodecException;)V
    .locals 1

    iget-object p1, p0, Landroidx/camera/video/internal/encoder/a0$f;->h:Landroidx/camera/video/internal/encoder/a0;

    iget-object p1, p1, Landroidx/camera/video/internal/encoder/a0;->g:Ljava/util/concurrent/Executor;

    new-instance v0, Landroidx/camera/video/internal/encoder/l0;

    invoke-direct {v0, p0, p2}, Landroidx/camera/video/internal/encoder/l0;-><init>(Landroidx/camera/video/internal/encoder/a0$f;Landroid/media/MediaCodec$CodecException;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onInputBufferAvailable(Landroid/media/MediaCodec;I)V
    .locals 1

    iget-object p1, p0, Landroidx/camera/video/internal/encoder/a0$f;->h:Landroidx/camera/video/internal/encoder/a0;

    iget-object p1, p1, Landroidx/camera/video/internal/encoder/a0;->g:Ljava/util/concurrent/Executor;

    new-instance v0, Landroidx/camera/video/internal/encoder/o0;

    invoke-direct {v0, p0, p2}, Landroidx/camera/video/internal/encoder/o0;-><init>(Landroidx/camera/video/internal/encoder/a0$f;I)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onOutputBufferAvailable(Landroid/media/MediaCodec;ILandroid/media/MediaCodec$BufferInfo;)V
    .locals 2

    iget-object v0, p0, Landroidx/camera/video/internal/encoder/a0$f;->h:Landroidx/camera/video/internal/encoder/a0;

    iget-object v0, v0, Landroidx/camera/video/internal/encoder/a0;->g:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/camera/video/internal/encoder/n0;

    invoke-direct {v1, p0, p3, p1, p2}, Landroidx/camera/video/internal/encoder/n0;-><init>(Landroidx/camera/video/internal/encoder/a0$f;Landroid/media/MediaCodec$BufferInfo;Landroid/media/MediaCodec;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onOutputFormatChanged(Landroid/media/MediaCodec;Landroid/media/MediaFormat;)V
    .locals 1

    iget-object p1, p0, Landroidx/camera/video/internal/encoder/a0$f;->h:Landroidx/camera/video/internal/encoder/a0;

    iget-object p1, p1, Landroidx/camera/video/internal/encoder/a0;->g:Ljava/util/concurrent/Executor;

    new-instance v0, Landroidx/camera/video/internal/encoder/p0;

    invoke-direct {v0, p0, p2}, Landroidx/camera/video/internal/encoder/p0;-><init>(Landroidx/camera/video/internal/encoder/a0$f;Landroid/media/MediaFormat;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
