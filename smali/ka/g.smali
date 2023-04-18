.class final Lka/g;
.super Lka/e;
.source "SourceFile"


# instance fields
.field final synthetic a:Lka/h;


# direct methods
.method constructor <init>(Lka/h;)V
    .locals 0

    iput-object p1, p0, Lka/g;->a:Lka/h;

    invoke-direct {p0}, Lka/e;-><init>()V

    return-void
.end method


# virtual methods
.method public final U(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/auth/api/credentials/Credential;)V
    .locals 2

    iget-object v0, p0, Lka/g;->a:Lka/h;

    new-instance v1, Lka/f;

    invoke-direct {v1, p1, p2}, Lka/f;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/auth/api/credentials/Credential;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->setResult(Lu9/k;)V

    return-void
.end method

.method public final c(Lcom/google/android/gms/common/api/Status;)V
    .locals 3

    iget-object v0, p0, Lka/g;->a:Lka/h;

    new-instance v1, Lka/f;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lka/f;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/auth/api/credentials/Credential;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->setResult(Lu9/k;)V

    return-void
.end method
