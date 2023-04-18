.class public final synthetic Lcom/google/android/gms/internal/gtm/zzfk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/gtm/zzfn;

.field public final synthetic zzb:Lcom/google/android/gms/internal/gtm/zzfb;

.field public final synthetic zzc:Landroid/app/job/JobParameters;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/gtm/zzfn;Lcom/google/android/gms/internal/gtm/zzfb;Landroid/app/job/JobParameters;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/gtm/zzfk;->zza:Lcom/google/android/gms/internal/gtm/zzfn;

    iput-object p2, p0, Lcom/google/android/gms/internal/gtm/zzfk;->zzb:Lcom/google/android/gms/internal/gtm/zzfb;

    iput-object p3, p0, Lcom/google/android/gms/internal/gtm/zzfk;->zzc:Landroid/app/job/JobParameters;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzfk;->zza:Lcom/google/android/gms/internal/gtm/zzfn;

    iget-object v1, p0, Lcom/google/android/gms/internal/gtm/zzfk;->zzb:Lcom/google/android/gms/internal/gtm/zzfb;

    iget-object v2, p0, Lcom/google/android/gms/internal/gtm/zzfk;->zzc:Landroid/app/job/JobParameters;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/gtm/zzfn;->zzd(Lcom/google/android/gms/internal/gtm/zzfb;Landroid/app/job/JobParameters;)V

    return-void
.end method
