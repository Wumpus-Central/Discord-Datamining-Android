.class public Lm9/a;
.super Lu9/j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lu9/j<",
        "Lm9/b;",
        ">;"
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lu9/j;-><init>()V

    return-void
.end method


# virtual methods
.method public c()Lcom/google/android/gms/auth/api/credentials/Credential;
    .locals 1

    invoke-virtual {p0}, Lu9/j;->a()Lu9/k;

    move-result-object v0

    check-cast v0, Lm9/b;

    invoke-interface {v0}, Lm9/b;->f()Lcom/google/android/gms/auth/api/credentials/Credential;

    move-result-object v0

    return-object v0
.end method
