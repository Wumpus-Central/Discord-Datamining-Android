.class public Lk9/d;
.super Lk9/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lk9/h<",
        "Lk9/d;",
        ">;"
    }
.end annotation


# instance fields
.field private final d:Lcom/google/android/gms/internal/gtm/zzbv;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/gtm/zzbv;)V
    .locals 2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/gtm/zzbv;->zzd()Lk9/n;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/gtm/zzbv;->zzr()Lba/d;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lk9/h;-><init>(Lk9/n;Lba/d;)V

    iput-object p1, p0, Lk9/d;->d:Lcom/google/android/gms/internal/gtm/zzbv;

    return-void
.end method


# virtual methods
.method final a()Lcom/google/android/gms/internal/gtm/zzbv;
    .locals 1

    iget-object v0, p0, Lk9/d;->d:Lcom/google/android/gms/internal/gtm/zzbv;

    return-object v0
.end method
