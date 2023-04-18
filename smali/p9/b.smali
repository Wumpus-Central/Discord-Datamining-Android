.class public Lp9/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu9/k;


# instance fields
.field private k:Lcom/google/android/gms/common/api/Status;

.field private l:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;


# virtual methods
.method public a()Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;
    .locals 1

    iget-object v0, p0, Lp9/b;->l:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    return-object v0
.end method

.method public b()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lp9/b;->k:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method
