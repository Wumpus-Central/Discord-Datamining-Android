.class public final synthetic Lcom/google/android/gms/internal/gtm/zzfj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/gtm/zzfn;

.field public final synthetic zzb:I

.field public final synthetic zzc:Lcom/google/android/gms/internal/gtm/zzfb;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/gtm/zzfn;ILcom/google/android/gms/internal/gtm/zzfb;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/gtm/zzfj;->zza:Lcom/google/android/gms/internal/gtm/zzfn;

    iput p2, p0, Lcom/google/android/gms/internal/gtm/zzfj;->zzb:I

    iput-object p3, p0, Lcom/google/android/gms/internal/gtm/zzfj;->zzc:Lcom/google/android/gms/internal/gtm/zzfb;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/gtm/zzfj;->zza:Lcom/google/android/gms/internal/gtm/zzfn;

    iget v1, p0, Lcom/google/android/gms/internal/gtm/zzfj;->zzb:I

    iget-object v2, p0, Lcom/google/android/gms/internal/gtm/zzfj;->zzc:Lcom/google/android/gms/internal/gtm/zzfb;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/gtm/zzfn;->zzc(ILcom/google/android/gms/internal/gtm/zzfb;)V

    return-void
.end method
