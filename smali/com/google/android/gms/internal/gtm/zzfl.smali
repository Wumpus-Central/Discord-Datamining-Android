.class final Lcom/google/android/gms/internal/gtm/zzfl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/gtm/zzcz;


# instance fields
.field final synthetic zza:Ljava/lang/Runnable;

.field final synthetic zzb:Lcom/google/android/gms/internal/gtm/zzfn;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/gtm/zzfn;Ljava/lang/Runnable;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/gtm/zzfl;->zzb:Lcom/google/android/gms/internal/gtm/zzfn;

    iput-object p2, p0, Lcom/google/android/gms/internal/gtm/zzfl;->zza:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/google/android/gms/internal/gtm/zzfl;->zzb:Lcom/google/android/gms/internal/gtm/zzfn;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/google/android/gms/internal/gtm/zzfn;->zzb(Lcom/google/android/gms/internal/gtm/zzfn;)Landroid/os/Handler;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzfl;->zza:Ljava/lang/Runnable;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 10
    .line 11
    .line 12
    return-void
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
