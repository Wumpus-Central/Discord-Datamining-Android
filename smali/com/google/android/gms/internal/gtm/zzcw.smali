.class abstract Lcom/google/android/gms/internal/gtm/zzcw;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile zza:Landroid/os/Handler;


# instance fields
.field private final zzb:Lcom/google/android/gms/internal/gtm/zzbv;

.field private final zzc:Ljava/lang/Runnable;

.field private volatile zzd:J


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/gtm/zzbv;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lw9/p;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lcom/google/android/gms/internal/gtm/zzcw;->zzb:Lcom/google/android/gms/internal/gtm/zzbv;

    .line 8
    .line 9
    new-instance p1, Lcom/google/android/gms/internal/gtm/zzcv;

    .line 10
    .line 11
    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/gtm/zzcv;-><init>(Lcom/google/android/gms/internal/gtm/zzcw;)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/google/android/gms/internal/gtm/zzcw;->zzc:Ljava/lang/Runnable;

    .line 15
    .line 16
    return-void
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
.end method

.method static bridge synthetic zzc(Lcom/google/android/gms/internal/gtm/zzcw;)Lcom/google/android/gms/internal/gtm/zzbv;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/gtm/zzcw;->zzb:Lcom/google/android/gms/internal/gtm/zzbv;

    return-object p0
.end method

.method static bridge synthetic zzd(Lcom/google/android/gms/internal/gtm/zzcw;J)V
    .locals 0

    const-wide/16 p1, 0x0

    iput-wide p1, p0, Lcom/google/android/gms/internal/gtm/zzcw;->zzd:J

    return-void
.end method

.method private final zzi()Landroid/os/Handler;
    .locals 3

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/gtm/zzcw;->zza:Landroid/os/Handler;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/google/android/gms/internal/gtm/zzcw;->zza:Landroid/os/Handler;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    const-class v0, Lcom/google/android/gms/internal/gtm/zzcw;

    .line 9
    .line 10
    monitor-enter v0

    .line 11
    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/gtm/zzcw;->zza:Landroid/os/Handler;

    .line 12
    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    new-instance v1, Lcom/google/android/gms/internal/gtm/zzga;

    .line 16
    .line 17
    iget-object v2, p0, Lcom/google/android/gms/internal/gtm/zzcw;->zzb:Lcom/google/android/gms/internal/gtm/zzbv;

    .line 18
    .line 19
    invoke-virtual {v2}, Lcom/google/android/gms/internal/gtm/zzbv;->zza()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v2}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/gtm/zzga;-><init>(Landroid/os/Looper;)V

    .line 28
    .line 29
    .line 30
    sput-object v1, Lcom/google/android/gms/internal/gtm/zzcw;->zza:Landroid/os/Handler;

    .line 31
    .line 32
    :cond_1
    sget-object v1, Lcom/google/android/gms/internal/gtm/zzcw;->zza:Landroid/os/Handler;

    .line 33
    .line 34
    monitor-exit v0

    .line 35
    return-object v1

    .line 36
    :catchall_0
    move-exception v1

    .line 37
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    throw v1
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
.end method


# virtual methods
.method public abstract zza()V
.end method

.method public final zzb()J
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/google/android/gms/internal/gtm/zzcw;->zzd:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-wide v2

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzcw;->zzb:Lcom/google/android/gms/internal/gtm/zzbv;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/google/android/gms/internal/gtm/zzbv;->zzr()Lba/d;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {v0}, Lba/d;->a()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    iget-wide v2, p0, Lcom/google/android/gms/internal/gtm/zzcw;->zzd:J

    .line 21
    .line 22
    sub-long/2addr v0, v2

    .line 23
    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    return-wide v0
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
.end method

.method public final zze(J)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzcw;->zzh()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const-wide/16 v0, 0x0

    .line 9
    .line 10
    cmp-long v2, p1, v0

    .line 11
    .line 12
    if-gez v2, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzcw;->zzf()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    iget-object v2, p0, Lcom/google/android/gms/internal/gtm/zzcw;->zzb:Lcom/google/android/gms/internal/gtm/zzbv;

    .line 19
    .line 20
    invoke-virtual {v2}, Lcom/google/android/gms/internal/gtm/zzbv;->zzr()Lba/d;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-interface {v2}, Lba/d;->a()J

    .line 25
    .line 26
    .line 27
    move-result-wide v2

    .line 28
    iget-wide v4, p0, Lcom/google/android/gms/internal/gtm/zzcw;->zzd:J

    .line 29
    .line 30
    sub-long/2addr v2, v4

    .line 31
    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    .line 32
    .line 33
    .line 34
    move-result-wide v2

    .line 35
    sub-long/2addr p1, v2

    .line 36
    cmp-long v2, p1, v0

    .line 37
    .line 38
    if-gez v2, :cond_2

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    move-wide v0, p1

    .line 42
    :goto_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/gtm/zzcw;->zzi()Landroid/os/Handler;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iget-object p2, p0, Lcom/google/android/gms/internal/gtm/zzcw;->zzc:Ljava/lang/Runnable;

    .line 47
    .line 48
    invoke-virtual {p1, p2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 49
    .line 50
    .line 51
    invoke-direct {p0}, Lcom/google/android/gms/internal/gtm/zzcw;->zzi()Landroid/os/Handler;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iget-object p2, p0, Lcom/google/android/gms/internal/gtm/zzcw;->zzc:Ljava/lang/Runnable;

    .line 56
    .line 57
    invoke-virtual {p1, p2, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-nez p1, :cond_3

    .line 62
    .line 63
    iget-object p1, p0, Lcom/google/android/gms/internal/gtm/zzcw;->zzb:Lcom/google/android/gms/internal/gtm/zzbv;

    .line 64
    .line 65
    invoke-virtual {p1}, Lcom/google/android/gms/internal/gtm/zzbv;->zzm()Lcom/google/android/gms/internal/gtm/zzfb;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    const-string p2, "Failed to adjust delayed post. time"

    .line 70
    .line 71
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-virtual {p1, p2, v0}, Lcom/google/android/gms/internal/gtm/zzbr;->zzK(Ljava/lang/String;Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    :cond_3
    return-void
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
.end method

.method public final zzf()V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, Lcom/google/android/gms/internal/gtm/zzcw;->zzd:J

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/google/android/gms/internal/gtm/zzcw;->zzi()Landroid/os/Handler;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lcom/google/android/gms/internal/gtm/zzcw;->zzc:Ljava/lang/Runnable;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 12
    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public final zzg(J)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gtm/zzcw;->zzf()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    cmp-long v0, p1, v0

    .line 7
    .line 8
    if-ltz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzcw;->zzb:Lcom/google/android/gms/internal/gtm/zzbv;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/google/android/gms/internal/gtm/zzbv;->zzr()Lba/d;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {v0}, Lba/d;->a()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    iput-wide v0, p0, Lcom/google/android/gms/internal/gtm/zzcw;->zzd:J

    .line 21
    .line 22
    invoke-direct {p0}, Lcom/google/android/gms/internal/gtm/zzcw;->zzi()Landroid/os/Handler;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object v1, p0, Lcom/google/android/gms/internal/gtm/zzcw;->zzc:Ljava/lang/Runnable;

    .line 27
    .line 28
    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzcw;->zzb:Lcom/google/android/gms/internal/gtm/zzbv;

    .line 35
    .line 36
    invoke-virtual {v0}, Lcom/google/android/gms/internal/gtm/zzbv;->zzm()Lcom/google/android/gms/internal/gtm/zzfb;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const-string v1, "Failed to schedule delayed post. time"

    .line 41
    .line 42
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/gtm/zzbr;->zzK(Ljava/lang/String;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    :cond_0
    return-void
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
.end method

.method public final zzh()Z
    .locals 4

    iget-wide v0, p0, Lcom/google/android/gms/internal/gtm/zzcw;->zzd:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
