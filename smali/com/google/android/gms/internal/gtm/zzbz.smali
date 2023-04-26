.class final Lcom/google/android/gms/internal/gtm/zzbz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/gtm/zzcb;

.field final synthetic zzb:Lcom/google/android/gms/internal/gtm/zzey;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/gtm/zzcb;Lcom/google/android/gms/internal/gtm/zzey;[B)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/gtm/zzbz;->zza:Lcom/google/android/gms/internal/gtm/zzcb;

    iput-object p2, p0, Lcom/google/android/gms/internal/gtm/zzbz;->zzb:Lcom/google/android/gms/internal/gtm/zzey;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzbz;->zza:Lcom/google/android/gms/internal/gtm/zzcb;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/google/android/gms/internal/gtm/zzcb;->zza:Lcom/google/android/gms/internal/gtm/zzcc;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/gtm/zzcc;->zzg()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzbz;->zza:Lcom/google/android/gms/internal/gtm/zzcb;

    .line 12
    .line 13
    iget-object v0, v0, Lcom/google/android/gms/internal/gtm/zzcb;->zza:Lcom/google/android/gms/internal/gtm/zzcc;

    .line 14
    .line 15
    const-string v1, "Connected to service after a timeout"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/gtm/zzbr;->zzF(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzbz;->zza:Lcom/google/android/gms/internal/gtm/zzcb;

    .line 21
    .line 22
    iget-object v0, v0, Lcom/google/android/gms/internal/gtm/zzcb;->zza:Lcom/google/android/gms/internal/gtm/zzcc;

    .line 23
    .line 24
    iget-object v1, p0, Lcom/google/android/gms/internal/gtm/zzbz;->zzb:Lcom/google/android/gms/internal/gtm/zzey;

    .line 25
    .line 26
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/gtm/zzcc;->zzi(Lcom/google/android/gms/internal/gtm/zzcc;Lcom/google/android/gms/internal/gtm/zzey;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void
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
.end method
