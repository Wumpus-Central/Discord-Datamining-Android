.class final Lka/i;
.super Lka/m;
.source "SourceFile"


# instance fields
.field final synthetic c:Lcom/google/android/gms/auth/api/credentials/Credential;


# direct methods
.method constructor <init>(Lka/l;Lu9/f;Lcom/google/android/gms/auth/api/credentials/Credential;)V
    .locals 0

    iput-object p3, p0, Lka/i;->c:Lcom/google/android/gms/auth/api/credentials/Credential;

    invoke-direct {p0, p2}, Lka/m;-><init>(Lu9/f;)V

    return-void
.end method


# virtual methods
.method protected final bridge synthetic createFailedResult(Lcom/google/android/gms/common/api/Status;)Lu9/k;
    .locals 0

    return-object p1
.end method

.method protected final g(Landroid/content/Context;Lka/s;)V
    .locals 2

    new-instance p1, Lka/k;

    invoke-direct {p1, p0}, Lka/k;-><init>(Lv9/c;)V

    new-instance v0, Lka/t;

    iget-object v1, p0, Lka/i;->c:Lcom/google/android/gms/auth/api/credentials/Credential;

    invoke-direct {v0, v1}, Lka/t;-><init>(Lcom/google/android/gms/auth/api/credentials/Credential;)V

    invoke-virtual {p2, p1, v0}, Lka/s;->f0(Lka/r;Lka/t;)V

    return-void
.end method
