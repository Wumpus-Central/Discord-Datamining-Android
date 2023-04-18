.class public Lq/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/i;


# instance fields
.field private final a:Z

.field private final b:I

.field private final c:Lu/c;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lr/f0;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 5
    .line 6
    .line 7
    move-result v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    const/4 v1, 0x1

    .line 9
    goto :goto_0

    .line 10
    :catch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v1, "Camera id is not an integer: "

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", unable to create CamcorderProfileProvider"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const-string v1, "Camera2CamcorderProfileProvider"

    .line 33
    .line 34
    invoke-static {v1, v0}, Landroidx/camera/core/r1;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    const/4 v0, -0x1

    .line 39
    :goto_0
    iput-boolean v1, p0, Lq/f;->a:Z

    .line 40
    .line 41
    iput v0, p0, Lq/f;->b:I

    .line 42
    .line 43
    invoke-static {p1, p2}, Lt/g;->a(Ljava/lang/String;Lr/f0;)Lw/g2;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    const-class p2, Lt/e;

    .line 48
    .line 49
    invoke-virtual {p1, p2}, Lw/g2;->b(Ljava/lang/Class;)Lw/f2;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    check-cast p1, Lt/e;

    .line 54
    .line 55
    new-instance p2, Lu/c;

    .line 56
    .line 57
    invoke-direct {p2, p1}, Lu/c;-><init>(Lt/e;)V

    .line 58
    .line 59
    .line 60
    iput-object p2, p0, Lq/f;->c:Lu/c;

    .line 61
    .line 62
    return-void
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

.method private b(I)Lw/j;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget v1, p0, Lq/f;->b:I

    .line 3
    .line 4
    invoke-static {v1, p1}, Landroid/media/CamcorderProfile;->get(II)Landroid/media/CamcorderProfile;

    .line 5
    .line 6
    .line 7
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    goto :goto_0

    .line 9
    :catch_0
    move-exception v1

    .line 10
    new-instance v2, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v3, "Unable to get CamcorderProfile by quality: "

    .line 16
    .line 17
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const-string v2, "Camera2CamcorderProfileProvider"

    .line 28
    .line 29
    invoke-static {v2, p1, v1}, Landroidx/camera/core/r1;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    move-object p1, v0

    .line 33
    :goto_0
    if-eqz p1, :cond_0

    .line 34
    .line 35
    invoke-static {p1}, Lw/j;->a(Landroid/media/CamcorderProfile;)Lw/j;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    :cond_0
    return-object v0
    .line 40
.end method


# virtual methods
.method public a(I)Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lq/f;->a:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iget v0, p0, Lq/f;->b:I

    .line 8
    .line 9
    invoke-static {v0, p1}, Landroid/media/CamcorderProfile;->hasProfile(II)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    return v1

    .line 16
    :cond_1
    iget-object v0, p0, Lq/f;->c:Lu/c;

    .line 17
    .line 18
    invoke-virtual {v0}, Lu/c;->a()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    invoke-direct {p0, p1}, Lq/f;->b(I)Lw/j;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iget-object v0, p0, Lq/f;->c:Lu/c;

    .line 29
    .line 30
    invoke-virtual {v0, p1}, Lu/c;->b(Lw/j;)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    return p1

    .line 35
    :cond_2
    const/4 p1, 0x1

    .line 36
    return p1
    .line 37
    .line 38
    .line 39
    .line 40
.end method

.method public get(I)Lw/j;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lq/f;->a:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return-object v1

    .line 7
    :cond_0
    iget v0, p0, Lq/f;->b:I

    .line 8
    .line 9
    invoke-static {v0, p1}, Landroid/media/CamcorderProfile;->hasProfile(II)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    return-object v1

    .line 16
    :cond_1
    invoke-direct {p0, p1}, Lq/f;->b(I)Lw/j;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object v0, p0, Lq/f;->c:Lu/c;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Lu/c;->b(Lw/j;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_2

    .line 27
    .line 28
    return-object v1

    .line 29
    :cond_2
    return-object p1
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
