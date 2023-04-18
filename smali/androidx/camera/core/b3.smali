.class public final Landroidx/camera/core/b3;
.super Landroidx/camera/core/w2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/b3$b;,
        Landroidx/camera/core/b3$c;,
        Landroidx/camera/core/b3$d;,
        Landroidx/camera/core/b3$e;
    }
.end annotation


# static fields
.field public static final J:Landroidx/camera/core/b3$d;

.field private static final K:[I


# instance fields
.field private volatile A:I

.field private volatile B:Z

.field private C:I

.field private D:I

.field private E:I

.field private F:Lw/w0;

.field private final G:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private H:Landroidx/camera/core/b3$e;

.field private I:Ljava/lang/Throwable;

.field private final l:Ljava/lang/Object;

.field private final m:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final n:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private o:Landroid/os/HandlerThread;

.field private p:Landroid/os/Handler;

.field private q:Landroid/os/HandlerThread;

.field private r:Landroid/os/Handler;

.field s:Landroid/media/MediaCodec;

.field private t:Landroid/media/MediaCodec;

.field private u:Lfc/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfc/b<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private v:Lw/k2$b;

.field private w:I

.field private x:I

.field y:Landroid/view/Surface;

.field private volatile z:Landroid/media/AudioRecord;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroidx/camera/core/b3$d;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/camera/core/b3$d;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/camera/core/b3;->J:Landroidx/camera/core/b3$d;

    .line 7
    .line 8
    const/4 v0, 0x4

    .line 9
    new-array v0, v0, [I

    .line 10
    .line 11
    fill-array-data v0, :array_0

    .line 12
    .line 13
    .line 14
    sput-object v0, Landroidx/camera/core/b3;->K:[I

    .line 15
    .line 16
    return-void

    .line 17
    :array_0
    .array-data 4
        0x8
        0x6
        0x5
        0x4
    .end array-data
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
.end method

.method public static synthetic K(ZLandroid/media/MediaCodec;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/camera/core/b3;->R(ZLandroid/media/MediaCodec;)V

    return-void
.end method

.method public static synthetic L(Landroidx/camera/core/b3;)V
    .locals 0

    invoke-direct {p0}, Landroidx/camera/core/b3;->S()V

    return-void
.end method

.method public static synthetic M(Landroidx/camera/core/b3;)V
    .locals 0

    invoke-direct {p0}, Landroidx/camera/core/b3;->Q()V

    return-void
.end method

.method private N(Lw/z2;)Landroid/media/AudioRecord;
    .locals 11

    .line 1
    const-string v0, "VideoCapture"

    .line 2
    .line 3
    iget v1, p0, Landroidx/camera/core/b3;->C:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-ne v1, v2, :cond_0

    .line 7
    .line 8
    const/16 v1, 0x10

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/16 v1, 0xc

    .line 12
    .line 13
    :goto_0
    :try_start_0
    iget v3, p0, Landroidx/camera/core/b3;->D:I

    .line 14
    .line 15
    const/4 v9, 0x2

    .line 16
    invoke-static {v3, v1, v9}, Landroid/media/AudioRecord;->getMinBufferSize(III)I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-gtz v3, :cond_1

    .line 21
    .line 22
    invoke-virtual {p1}, Lw/z2;->H()I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    :cond_1
    move p1, v3

    .line 27
    new-instance v10, Landroid/media/AudioRecord;

    .line 28
    .line 29
    const/4 v4, 0x5

    .line 30
    iget v5, p0, Landroidx/camera/core/b3;->D:I

    .line 31
    .line 32
    const/4 v7, 0x2

    .line 33
    mul-int/lit8 v8, p1, 0x2

    .line 34
    .line 35
    move-object v3, v10

    .line 36
    move v6, v1

    .line 37
    invoke-direct/range {v3 .. v8}, Landroid/media/AudioRecord;-><init>(IIIII)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v10}, Landroid/media/AudioRecord;->getState()I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-ne v3, v2, :cond_2

    .line 45
    .line 46
    iput p1, p0, Landroidx/camera/core/b3;->A:I

    .line 47
    .line 48
    new-instance v2, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 51
    .line 52
    .line 53
    const-string v3, "source: 5 audioSampleRate: "

    .line 54
    .line 55
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget v3, p0, Landroidx/camera/core/b3;->D:I

    .line 59
    .line 60
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v3, " channelConfig: "

    .line 64
    .line 65
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string v1, " audioFormat: "

    .line 72
    .line 73
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string v1, " bufferSize: "

    .line 80
    .line 81
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-static {v0, p1}, Landroidx/camera/core/r1;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 92
    .line 93
    .line 94
    return-object v10

    .line 95
    :catch_0
    move-exception p1

    .line 96
    const-string v1, "Exception, keep trying."

    .line 97
    .line 98
    invoke-static {v0, v1, p1}, Landroidx/camera/core/r1;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 99
    .line 100
    .line 101
    :cond_2
    const/4 p1, 0x0

    .line 102
    return-object p1
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

.method private O()Landroid/media/MediaFormat;
    .locals 3

    .line 1
    iget v0, p0, Landroidx/camera/core/b3;->D:I

    .line 2
    .line 3
    iget v1, p0, Landroidx/camera/core/b3;->C:I

    .line 4
    .line 5
    const-string v2, "audio/mp4a-latm"

    .line 6
    .line 7
    invoke-static {v2, v0, v1}, Landroid/media/MediaFormat;->createAudioFormat(Ljava/lang/String;II)Landroid/media/MediaFormat;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "aac-profile"

    .line 12
    .line 13
    const/4 v2, 0x2

    .line 14
    invoke-virtual {v0, v1, v2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 15
    .line 16
    .line 17
    const-string v1, "bitrate"

    .line 18
    .line 19
    iget v2, p0, Landroidx/camera/core/b3;->E:I

    .line 20
    .line 21
    invoke-virtual {v0, v1, v2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 22
    .line 23
    .line 24
    return-object v0
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
.end method

.method private static P(Lw/z2;Landroid/util/Size;)Landroid/media/MediaFormat;
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    const-string v1, "video/avc"

    .line 10
    .line 11
    invoke-static {v1, v0, p1}, Landroid/media/MediaFormat;->createVideoFormat(Ljava/lang/String;II)Landroid/media/MediaFormat;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const-string v0, "color-format"

    .line 16
    .line 17
    const v1, 0x7f000789

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0, v1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lw/z2;->J()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const-string v1, "bitrate"

    .line 28
    .line 29
    invoke-virtual {p1, v1, v0}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 30
    .line 31
    .line 32
    const-string v0, "frame-rate"

    .line 33
    .line 34
    invoke-virtual {p0}, Lw/z2;->L()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    invoke-virtual {p1, v0, v1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 39
    .line 40
    .line 41
    const-string v0, "i-frame-interval"

    .line 42
    .line 43
    invoke-virtual {p0}, Lw/z2;->K()I

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    invoke-virtual {p1, v0, p0}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 48
    .line 49
    .line 50
    return-object p1
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

.method private synthetic Q()V
    .locals 0

    invoke-direct {p0}, Landroidx/camera/core/b3;->V()V

    return-void
.end method

.method private static synthetic R(ZLandroid/media/MediaCodec;)V
    .locals 0

    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/media/MediaCodec;->release()V

    :cond_0
    return-void
.end method

.method private synthetic S()V
    .locals 0

    invoke-virtual {p0}, Landroidx/camera/core/b3;->Y()V

    return-void
.end method

.method private T()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/core/b3;->q:Landroid/os/HandlerThread;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/os/HandlerThread;->quitSafely()Z

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/camera/core/b3;->t:Landroid/media/MediaCodec;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/media/MediaCodec;->release()V

    .line 12
    .line 13
    .line 14
    iput-object v1, p0, Landroidx/camera/core/b3;->t:Landroid/media/MediaCodec;

    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Landroidx/camera/core/b3;->z:Landroid/media/AudioRecord;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    iget-object v0, p0, Landroidx/camera/core/b3;->z:Landroid/media/AudioRecord;

    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/media/AudioRecord;->release()V

    .line 23
    .line 24
    .line 25
    iput-object v1, p0, Landroidx/camera/core/b3;->z:Landroid/media/AudioRecord;

    .line 26
    .line 27
    :cond_1
    return-void
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
.end method

.method private U(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/core/b3;->F:Lw/w0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v1, p0, Landroidx/camera/core/b3;->s:Landroid/media/MediaCodec;

    .line 7
    .line 8
    invoke-virtual {v0}, Lw/w0;->c()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Landroidx/camera/core/b3;->F:Lw/w0;

    .line 12
    .line 13
    invoke-virtual {v0}, Lw/w0;->i()Lfc/b;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v2, Landroidx/camera/core/y2;

    .line 18
    .line 19
    invoke-direct {v2, p1, v1}, Landroidx/camera/core/y2;-><init>(ZLandroid/media/MediaCodec;)V

    .line 20
    .line 21
    .line 22
    invoke-static {}, Lx/a;->d()Ljava/util/concurrent/ScheduledExecutorService;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-interface {v0, v2, v1}, Lfc/b;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 27
    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    iput-object v0, p0, Landroidx/camera/core/b3;->s:Landroid/media/MediaCodec;

    .line 33
    .line 34
    :cond_1
    iput-object v0, p0, Landroidx/camera/core/b3;->y:Landroid/view/Surface;

    .line 35
    .line 36
    iput-object v0, p0, Landroidx/camera/core/b3;->F:Lw/w0;

    .line 37
    .line 38
    return-void
    .line 39
    .line 40
.end method

.method private V()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/camera/core/b3;->o:Landroid/os/HandlerThread;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/os/HandlerThread;->quitSafely()Z

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Landroidx/camera/core/b3;->T()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Landroidx/camera/core/b3;->y:Landroid/view/Surface;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    invoke-direct {p0, v0}, Landroidx/camera/core/b3;->U(Z)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
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
.end method

.method private W(Landroid/util/Size;Ljava/lang/String;)V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    sget-object v1, Landroidx/camera/core/b3;->K:[I

    .line 3
    .line 4
    array-length v2, v1

    .line 5
    move v3, v0

    .line 6
    :goto_0
    if-ge v3, v2, :cond_1

    .line 7
    .line 8
    aget v4, v1, v3

    .line 9
    .line 10
    invoke-static {p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 11
    .line 12
    .line 13
    move-result v5

    .line 14
    invoke-static {v5, v4}, Landroid/media/CamcorderProfile;->hasProfile(II)Z

    .line 15
    .line 16
    .line 17
    move-result v5

    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    invoke-static {p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    invoke-static {v5, v4}, Landroid/media/CamcorderProfile;->get(II)Landroid/media/CamcorderProfile;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    iget v6, v4, Landroid/media/CamcorderProfile;->videoFrameWidth:I

    .line 33
    .line 34
    if-ne v5, v6, :cond_0

    .line 35
    .line 36
    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    iget v6, v4, Landroid/media/CamcorderProfile;->videoFrameHeight:I

    .line 41
    .line 42
    if-ne v5, v6, :cond_0

    .line 43
    .line 44
    iget p1, v4, Landroid/media/CamcorderProfile;->audioChannels:I

    .line 45
    .line 46
    iput p1, p0, Landroidx/camera/core/b3;->C:I

    .line 47
    .line 48
    iget p1, v4, Landroid/media/CamcorderProfile;->audioSampleRate:I

    .line 49
    .line 50
    iput p1, p0, Landroidx/camera/core/b3;->D:I

    .line 51
    .line 52
    iget p1, v4, Landroid/media/CamcorderProfile;->audioBitRate:I

    .line 53
    .line 54
    iput p1, p0, Landroidx/camera/core/b3;->E:I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 55
    .line 56
    const/4 p1, 0x1

    .line 57
    move v0, p1

    .line 58
    goto :goto_1

    .line 59
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :catch_0
    const-string p1, "VideoCapture"

    .line 63
    .line 64
    const-string p2, "The camera Id is not an integer because the camera may be a removable device. Use the default values for the audio related settings."

    .line 65
    .line 66
    invoke-static {p1, p2}, Landroidx/camera/core/r1;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    :cond_1
    :goto_1
    if-nez v0, :cond_2

    .line 70
    .line 71
    invoke-virtual {p0}, Landroidx/camera/core/w2;->f()Lw/x2;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    check-cast p1, Lw/z2;

    .line 76
    .line 77
    invoke-virtual {p1}, Lw/z2;->G()I

    .line 78
    .line 79
    .line 80
    move-result p2

    .line 81
    iput p2, p0, Landroidx/camera/core/b3;->C:I

    .line 82
    .line 83
    invoke-virtual {p1}, Lw/z2;->I()I

    .line 84
    .line 85
    .line 86
    move-result p2

    .line 87
    iput p2, p0, Landroidx/camera/core/b3;->D:I

    .line 88
    .line 89
    invoke-virtual {p1}, Lw/z2;->F()I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    iput p1, p0, Landroidx/camera/core/b3;->E:I

    .line 94
    .line 95
    :cond_2
    return-void
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
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
.end method


# virtual methods
.method public C()V
    .locals 0

    invoke-virtual {p0}, Landroidx/camera/core/b3;->Y()V

    return-void
.end method

.method protected D(Landroid/util/Size;)Landroid/util/Size;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/core/b3;->y:Landroid/view/Surface;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/camera/core/b3;->s:Landroid/media/MediaCodec;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/media/MediaCodec;->stop()V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Landroidx/camera/core/b3;->s:Landroid/media/MediaCodec;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/media/MediaCodec;->release()V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Landroidx/camera/core/b3;->t:Landroid/media/MediaCodec;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/media/MediaCodec;->stop()V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Landroidx/camera/core/b3;->t:Landroid/media/MediaCodec;

    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/media/MediaCodec;->release()V

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-direct {p0, v0}, Landroidx/camera/core/b3;->U(Z)V

    .line 27
    .line 28
    .line 29
    :cond_0
    :try_start_0
    const-string v0, "video/avc"

    .line 30
    .line 31
    invoke-static {v0}, Landroid/media/MediaCodec;->createEncoderByType(Ljava/lang/String;)Landroid/media/MediaCodec;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iput-object v0, p0, Landroidx/camera/core/b3;->s:Landroid/media/MediaCodec;

    .line 36
    .line 37
    const-string v0, "audio/mp4a-latm"

    .line 38
    .line 39
    invoke-static {v0}, Landroid/media/MediaCodec;->createEncoderByType(Ljava/lang/String;)Landroid/media/MediaCodec;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iput-object v0, p0, Landroidx/camera/core/b3;->t:Landroid/media/MediaCodec;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    .line 45
    invoke-virtual {p0}, Landroidx/camera/core/w2;->e()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {p0, v0, p1}, Landroidx/camera/core/b3;->X(Ljava/lang/String;Landroid/util/Size;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Landroidx/camera/core/w2;->q()V

    .line 53
    .line 54
    .line 55
    return-object p1

    .line 56
    :catch_0
    move-exception p1

    .line 57
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 58
    .line 59
    new-instance v1, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    .line 63
    .line 64
    const-string v2, "Unable to create MediaCodec due to: "

    .line 65
    .line 66
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw v0
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

.method X(Ljava/lang/String;Landroid/util/Size;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroidx/camera/core/w2;->f()Lw/x2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lw/z2;

    .line 6
    .line 7
    iget-object v1, p0, Landroidx/camera/core/b3;->s:Landroid/media/MediaCodec;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/media/MediaCodec;->reset()V

    .line 10
    .line 11
    .line 12
    sget-object v1, Landroidx/camera/core/b3$e;->k:Landroidx/camera/core/b3$e;

    .line 13
    .line 14
    iput-object v1, p0, Landroidx/camera/core/b3;->H:Landroidx/camera/core/b3$e;

    .line 15
    .line 16
    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/b3;->s:Landroid/media/MediaCodec;

    .line 17
    .line 18
    invoke-static {v0, p2}, Landroidx/camera/core/b3;->P(Lw/z2;Landroid/util/Size;)Landroid/media/MediaFormat;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const/4 v3, 0x1

    .line 23
    const/4 v4, 0x0

    .line 24
    invoke-virtual {v1, v2, v4, v4, v3}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V
    :try_end_0
    .catch Landroid/media/MediaCodec$CodecException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, Landroidx/camera/core/b3;->y:Landroid/view/Surface;

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    invoke-direct {p0, v2}, Landroidx/camera/core/b3;->U(Z)V

    .line 33
    .line 34
    .line 35
    :cond_0
    iget-object v1, p0, Landroidx/camera/core/b3;->s:Landroid/media/MediaCodec;

    .line 36
    .line 37
    invoke-virtual {v1}, Landroid/media/MediaCodec;->createInputSurface()Landroid/view/Surface;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iput-object v1, p0, Landroidx/camera/core/b3;->y:Landroid/view/Surface;

    .line 42
    .line 43
    invoke-static {v0}, Lw/k2$b;->o(Lw/x2;)Lw/k2$b;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    iput-object v5, p0, Landroidx/camera/core/b3;->v:Lw/k2$b;

    .line 48
    .line 49
    iget-object v5, p0, Landroidx/camera/core/b3;->F:Lw/w0;

    .line 50
    .line 51
    if-eqz v5, :cond_1

    .line 52
    .line 53
    invoke-virtual {v5}, Lw/w0;->c()V

    .line 54
    .line 55
    .line 56
    :cond_1
    new-instance v5, Lw/n1;

    .line 57
    .line 58
    iget-object v6, p0, Landroidx/camera/core/b3;->y:Landroid/view/Surface;

    .line 59
    .line 60
    invoke-virtual {p0}, Landroidx/camera/core/w2;->h()I

    .line 61
    .line 62
    .line 63
    move-result v7

    .line 64
    invoke-direct {v5, v6, p2, v7}, Lw/n1;-><init>(Landroid/view/Surface;Landroid/util/Size;I)V

    .line 65
    .line 66
    .line 67
    iput-object v5, p0, Landroidx/camera/core/b3;->F:Lw/w0;

    .line 68
    .line 69
    invoke-virtual {v5}, Lw/w0;->i()Lfc/b;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    new-instance v6, Landroidx/camera/core/a3;

    .line 77
    .line 78
    invoke-direct {v6, v1}, Landroidx/camera/core/a3;-><init>(Landroid/view/Surface;)V

    .line 79
    .line 80
    .line 81
    invoke-static {}, Lx/a;->d()Ljava/util/concurrent/ScheduledExecutorService;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-interface {v5, v6, v1}, Lfc/b;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 86
    .line 87
    .line 88
    iget-object v1, p0, Landroidx/camera/core/b3;->v:Lw/k2$b;

    .line 89
    .line 90
    iget-object v5, p0, Landroidx/camera/core/b3;->F:Lw/w0;

    .line 91
    .line 92
    invoke-virtual {v1, v5}, Lw/k2$b;->h(Lw/w0;)V

    .line 93
    .line 94
    .line 95
    iget-object v1, p0, Landroidx/camera/core/b3;->v:Lw/k2$b;

    .line 96
    .line 97
    new-instance v5, Landroidx/camera/core/b3$a;

    .line 98
    .line 99
    invoke-direct {v5, p0, p1, p2}, Landroidx/camera/core/b3$a;-><init>(Landroidx/camera/core/b3;Ljava/lang/String;Landroid/util/Size;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1, v5}, Lw/k2$b;->f(Lw/k2$c;)V

    .line 103
    .line 104
    .line 105
    iget-object v1, p0, Landroidx/camera/core/b3;->v:Lw/k2$b;

    .line 106
    .line 107
    invoke-virtual {v1}, Lw/k2$b;->m()Lw/k2;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-virtual {p0, v1}, Landroidx/camera/core/w2;->I(Lw/k2;)V

    .line 112
    .line 113
    .line 114
    iget-object v1, p0, Landroidx/camera/core/b3;->G:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 115
    .line 116
    invoke-virtual {v1, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 117
    .line 118
    .line 119
    invoke-direct {p0, p2, p1}, Landroidx/camera/core/b3;->W(Landroid/util/Size;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    iget-object p1, p0, Landroidx/camera/core/b3;->t:Landroid/media/MediaCodec;

    .line 123
    .line 124
    invoke-virtual {p1}, Landroid/media/MediaCodec;->reset()V

    .line 125
    .line 126
    .line 127
    iget-object p1, p0, Landroidx/camera/core/b3;->t:Landroid/media/MediaCodec;

    .line 128
    .line 129
    invoke-direct {p0}, Landroidx/camera/core/b3;->O()Landroid/media/MediaFormat;

    .line 130
    .line 131
    .line 132
    move-result-object p2

    .line 133
    invoke-virtual {p1, p2, v4, v4, v3}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    .line 134
    .line 135
    .line 136
    iget-object p1, p0, Landroidx/camera/core/b3;->z:Landroid/media/AudioRecord;

    .line 137
    .line 138
    if-eqz p1, :cond_2

    .line 139
    .line 140
    iget-object p1, p0, Landroidx/camera/core/b3;->z:Landroid/media/AudioRecord;

    .line 141
    .line 142
    invoke-virtual {p1}, Landroid/media/AudioRecord;->release()V

    .line 143
    .line 144
    .line 145
    :cond_2
    invoke-direct {p0, v0}, Landroidx/camera/core/b3;->N(Lw/z2;)Landroid/media/AudioRecord;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    iput-object p1, p0, Landroidx/camera/core/b3;->z:Landroid/media/AudioRecord;

    .line 150
    .line 151
    iget-object p1, p0, Landroidx/camera/core/b3;->z:Landroid/media/AudioRecord;

    .line 152
    .line 153
    if-nez p1, :cond_3

    .line 154
    .line 155
    const-string p1, "VideoCapture"

    .line 156
    .line 157
    const-string p2, "AudioRecord object cannot initialized correctly!"

    .line 158
    .line 159
    invoke-static {p1, p2}, Landroidx/camera/core/r1;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    iget-object p1, p0, Landroidx/camera/core/b3;->G:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 163
    .line 164
    invoke-virtual {p1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 165
    .line 166
    .line 167
    :cond_3
    iget-object p1, p0, Landroidx/camera/core/b3;->l:Ljava/lang/Object;

    .line 168
    .line 169
    monitor-enter p1

    .line 170
    const/4 p2, -0x1

    .line 171
    :try_start_1
    iput p2, p0, Landroidx/camera/core/b3;->w:I

    .line 172
    .line 173
    iput p2, p0, Landroidx/camera/core/b3;->x:I

    .line 174
    .line 175
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 176
    iput-boolean v2, p0, Landroidx/camera/core/b3;->B:Z

    .line 177
    .line 178
    return-void

    .line 179
    :catchall_0
    move-exception p2

    .line 180
    :try_start_2
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 181
    throw p2

    .line 182
    :catch_0
    move-exception p1

    .line 183
    goto :goto_0

    .line 184
    :catch_1
    move-exception p1

    .line 185
    :goto_0
    sget-object p2, Landroidx/camera/core/b3$e;->l:Landroidx/camera/core/b3$e;

    .line 186
    .line 187
    iput-object p2, p0, Landroidx/camera/core/b3;->H:Landroidx/camera/core/b3$e;

    .line 188
    .line 189
    iput-object p1, p0, Landroidx/camera/core/b3;->I:Ljava/lang/Throwable;

    .line 190
    .line 191
    return-void

    .line 192
    :catch_2
    move-exception p1

    .line 193
    invoke-static {p1}, Landroidx/camera/core/b3$b;->a(Landroid/media/MediaCodec$CodecException;)I

    .line 194
    .line 195
    .line 196
    move-result p2

    .line 197
    invoke-virtual {p1}, Landroid/media/MediaCodec$CodecException;->getDiagnosticInfo()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    const/16 v1, 0x44c

    .line 202
    .line 203
    if-ne p2, v1, :cond_4

    .line 204
    .line 205
    const-string v1, "VideoCapture"

    .line 206
    .line 207
    new-instance v2, Ljava/lang/StringBuilder;

    .line 208
    .line 209
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 210
    .line 211
    .line 212
    const-string v3, "CodecException: code: "

    .line 213
    .line 214
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    const-string p2, " diagnostic: "

    .line 221
    .line 222
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object p2

    .line 232
    invoke-static {v1, p2}, Landroidx/camera/core/r1;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    sget-object p2, Landroidx/camera/core/b3$e;->m:Landroidx/camera/core/b3$e;

    .line 236
    .line 237
    iput-object p2, p0, Landroidx/camera/core/b3;->H:Landroidx/camera/core/b3$e;

    .line 238
    .line 239
    goto :goto_1

    .line 240
    :cond_4
    const/16 v1, 0x44d

    .line 241
    .line 242
    if-ne p2, v1, :cond_5

    .line 243
    .line 244
    const-string v1, "VideoCapture"

    .line 245
    .line 246
    new-instance v2, Ljava/lang/StringBuilder;

    .line 247
    .line 248
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 249
    .line 250
    .line 251
    const-string v3, "CodecException: code: "

    .line 252
    .line 253
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    const-string p2, " diagnostic: "

    .line 260
    .line 261
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object p2

    .line 271
    invoke-static {v1, p2}, Landroidx/camera/core/r1;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    sget-object p2, Landroidx/camera/core/b3$e;->n:Landroidx/camera/core/b3$e;

    .line 275
    .line 276
    iput-object p2, p0, Landroidx/camera/core/b3;->H:Landroidx/camera/core/b3$e;

    .line 277
    .line 278
    :cond_5
    :goto_1
    iput-object p1, p0, Landroidx/camera/core/b3;->I:Ljava/lang/Throwable;

    .line 279
    .line 280
    return-void
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
.end method

.method public Y()V
    .locals 2

    .line 1
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    invoke-static {}, Lx/a;->d()Ljava/util/concurrent/ScheduledExecutorService;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Landroidx/camera/core/x2;

    .line 16
    .line 17
    invoke-direct {v1, p0}, Landroidx/camera/core/x2;-><init>(Landroidx/camera/core/b3;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    const-string v0, "VideoCapture"

    .line 25
    .line 26
    const-string v1, "stopRecording"

    .line 27
    .line 28
    invoke-static {v0, v1}, Landroidx/camera/core/r1;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Landroidx/camera/core/b3;->v:Lw/k2$b;

    .line 32
    .line 33
    invoke-virtual {v0}, Lw/k2$b;->n()V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Landroidx/camera/core/b3;->v:Lw/k2$b;

    .line 37
    .line 38
    iget-object v1, p0, Landroidx/camera/core/b3;->F:Lw/w0;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Lw/k2$b;->h(Lw/w0;)V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Landroidx/camera/core/b3;->v:Lw/k2$b;

    .line 44
    .line 45
    invoke-virtual {v0}, Lw/k2$b;->m()Lw/k2;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {p0, v0}, Landroidx/camera/core/w2;->I(Lw/k2;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Landroidx/camera/core/w2;->u()V

    .line 53
    .line 54
    .line 55
    iget-boolean v0, p0, Landroidx/camera/core/b3;->B:Z

    .line 56
    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    iget-object v0, p0, Landroidx/camera/core/b3;->G:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    const/4 v1, 0x1

    .line 66
    if-eqz v0, :cond_1

    .line 67
    .line 68
    iget-object v0, p0, Landroidx/camera/core/b3;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_1
    iget-object v0, p0, Landroidx/camera/core/b3;->m:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 75
    .line 76
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 77
    .line 78
    .line 79
    :cond_2
    :goto_0
    return-void
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
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
.end method

.method public g(ZLw/y2;)Lw/x2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lw/y2;",
            ")",
            "Lw/x2<",
            "*>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lw/y2$b;->n:Lw/y2$b;

    .line 2
    .line 3
    invoke-interface {p2, v0}, Lw/y2;->a(Lw/y2$b;)Lw/r0;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    sget-object p1, Landroidx/camera/core/b3;->J:Landroidx/camera/core/b3$d;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/camera/core/b3$d;->a()Lw/z2;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p2, p1}, Lw/q0;->b(Lw/r0;Lw/r0;)Lw/r0;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    :cond_0
    if-nez p2, :cond_1

    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    invoke-virtual {p0, p2}, Landroidx/camera/core/b3;->m(Lw/r0;)Lw/x2$a;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-interface {p1}, Lw/x2$a;->c()Lw/x2;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    :goto_0
    return-object p1
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
.end method

.method public m(Lw/r0;)Lw/x2$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw/r0;",
            ")",
            "Lw/x2$a<",
            "***>;"
        }
    .end annotation

    invoke-static {p1}, Landroidx/camera/core/b3$c;->e(Lw/r0;)Landroidx/camera/core/b3$c;

    move-result-object p1

    return-object p1
.end method

.method public w()V
    .locals 2

    .line 1
    new-instance v0, Landroid/os/HandlerThread;

    .line 2
    .line 3
    const-string v1, "CameraX-video encoding thread"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, Landroidx/camera/core/b3;->o:Landroid/os/HandlerThread;

    .line 9
    .line 10
    new-instance v0, Landroid/os/HandlerThread;

    .line 11
    .line 12
    const-string v1, "CameraX-audio encoding thread"

    .line 13
    .line 14
    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Landroidx/camera/core/b3;->q:Landroid/os/HandlerThread;

    .line 18
    .line 19
    iget-object v0, p0, Landroidx/camera/core/b3;->o:Landroid/os/HandlerThread;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 22
    .line 23
    .line 24
    new-instance v0, Landroid/os/Handler;

    .line 25
    .line 26
    iget-object v1, p0, Landroidx/camera/core/b3;->o:Landroid/os/HandlerThread;

    .line 27
    .line 28
    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Landroidx/camera/core/b3;->p:Landroid/os/Handler;

    .line 36
    .line 37
    iget-object v0, p0, Landroidx/camera/core/b3;->q:Landroid/os/HandlerThread;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 40
    .line 41
    .line 42
    new-instance v0, Landroid/os/Handler;

    .line 43
    .line 44
    iget-object v1, p0, Landroidx/camera/core/b3;->q:Landroid/os/HandlerThread;

    .line 45
    .line 46
    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 51
    .line 52
    .line 53
    iput-object v0, p0, Landroidx/camera/core/b3;->r:Landroid/os/Handler;

    .line 54
    .line 55
    return-void
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
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
.end method

.method public z()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/camera/core/b3;->Y()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/camera/core/b3;->u:Lfc/b;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v1, Landroidx/camera/core/z2;

    .line 9
    .line 10
    invoke-direct {v1, p0}, Landroidx/camera/core/z2;-><init>(Landroidx/camera/core/b3;)V

    .line 11
    .line 12
    .line 13
    invoke-static {}, Lx/a;->d()Ljava/util/concurrent/ScheduledExecutorService;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-interface {v0, v1, v2}, Lfc/b;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-direct {p0}, Landroidx/camera/core/b3;->V()V

    .line 22
    .line 23
    .line 24
    :goto_0
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
    .line 37
    .line 38
    .line 39
    .line 40
.end method
