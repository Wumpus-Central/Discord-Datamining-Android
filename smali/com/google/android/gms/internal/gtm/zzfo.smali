.class final Lcom/google/android/gms/internal/gtm/zzfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Lba/d;

.field private zzb:J


# direct methods
.method public constructor <init>(Lba/d;)V
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
    iput-object p1, p0, Lcom/google/android/gms/internal/gtm/zzfo;->zza:Lba/d;

    .line 8
    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
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
    .line 25
    .line 26
    .line 27
.end method


# virtual methods
.method public final zza()V
    .locals 2

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/internal/gtm/zzfo;->zzb:J

    return-void
.end method

.method public final zzb()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzfo;->zza:Lba/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lba/d;->b()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iput-wide v0, p0, Lcom/google/android/gms/internal/gtm/zzfo;->zzb:J

    .line 8
    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
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

.method public final zzc(J)Z
    .locals 6

    .line 1
    iget-wide v0, p0, Lcom/google/android/gms/internal/gtm/zzfo;->zzb:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzfo;->zza:Lba/d;

    .line 12
    .line 13
    invoke-interface {v0}, Lba/d;->b()J

    .line 14
    .line 15
    .line 16
    move-result-wide v2

    .line 17
    iget-wide v4, p0, Lcom/google/android/gms/internal/gtm/zzfo;->zzb:J

    .line 18
    .line 19
    sub-long/2addr v2, v4

    .line 20
    cmp-long p1, v2, p1

    .line 21
    .line 22
    if-lez p1, :cond_1

    .line 23
    .line 24
    return v1

    .line 25
    :cond_1
    const/4 p1, 0x0

    .line 26
    return p1
    .line 27
.end method
