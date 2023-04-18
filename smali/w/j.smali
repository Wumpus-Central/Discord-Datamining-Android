.class public abstract Lw/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:I = -0x1


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/media/CamcorderProfile;)Lw/j;
    .locals 14

    new-instance v13, Lw/a;

    iget v1, p0, Landroid/media/CamcorderProfile;->duration:I

    iget v2, p0, Landroid/media/CamcorderProfile;->quality:I

    iget v3, p0, Landroid/media/CamcorderProfile;->fileFormat:I

    iget v4, p0, Landroid/media/CamcorderProfile;->videoCodec:I

    iget v5, p0, Landroid/media/CamcorderProfile;->videoBitRate:I

    iget v6, p0, Landroid/media/CamcorderProfile;->videoFrameRate:I

    iget v7, p0, Landroid/media/CamcorderProfile;->videoFrameWidth:I

    iget v8, p0, Landroid/media/CamcorderProfile;->videoFrameHeight:I

    iget v9, p0, Landroid/media/CamcorderProfile;->audioCodec:I

    iget v10, p0, Landroid/media/CamcorderProfile;->audioBitRate:I

    iget v11, p0, Landroid/media/CamcorderProfile;->audioSampleRate:I

    iget v12, p0, Landroid/media/CamcorderProfile;->audioChannels:I

    move-object v0, v13

    invoke-direct/range {v0 .. v12}, Lw/a;-><init>(IIIIIIIIIIII)V

    return-object v13
.end method


# virtual methods
.method public abstract b()I
.end method

.method public abstract c()I
.end method

.method public abstract d()I
.end method

.method public e()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lw/j;->d()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    return-object v0

    :pswitch_0
    const-string v0, "audio/opus"

    return-object v0

    :pswitch_1
    const-string v0, "audio/vorbis"

    return-object v0

    :pswitch_2
    const-string v0, "audio/mp4a-latm"

    return-object v0

    :pswitch_3
    const-string v0, "audio/amr-wb"

    return-object v0

    :pswitch_4
    const-string v0, "audio/3gpp"

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public abstract f()I
.end method

.method public abstract g()I
.end method

.method public abstract h()I
.end method

.method public abstract i()I
.end method

.method public j()I
    .locals 3

    .line 1
    invoke-virtual {p0}, Lw/j;->d()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x3

    .line 6
    if-eq v0, v1, :cond_2

    .line 7
    .line 8
    const/4 v1, 0x4

    .line 9
    const/4 v2, 0x5

    .line 10
    if-eq v0, v1, :cond_1

    .line 11
    .line 12
    if-eq v0, v2, :cond_0

    .line 13
    .line 14
    sget v0, Lw/j;->a:I

    .line 15
    .line 16
    return v0

    .line 17
    :cond_0
    const/16 v0, 0x27

    .line 18
    .line 19
    return v0

    .line 20
    :cond_1
    return v2

    .line 21
    :cond_2
    const/4 v0, 0x2

    .line 22
    return v0
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

.method public abstract k()I
.end method

.method public abstract l()I
.end method

.method public m()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lw/j;->l()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const-string v0, "video/hevc"

    return-object v0

    :cond_1
    const-string v0, "video/x-vnd.on2.vp8"

    return-object v0

    :cond_2
    const-string v0, "video/mp4v-es"

    return-object v0

    :cond_3
    const-string v0, "video/avc"

    return-object v0

    :cond_4
    const-string v0, "video/3gpp"

    return-object v0
.end method

.method public abstract n()I
.end method

.method public abstract o()I
.end method

.method public abstract p()I
.end method
