.class public final Lka/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm9/c;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lu9/f;Lcom/google/android/gms/auth/api/credentials/Credential;)Lu9/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu9/f;",
            "Lcom/google/android/gms/auth/api/credentials/Credential;",
            ")",
            "Lu9/g<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "client must not be null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw9/p;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    const-string v0, "credential must not be null"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lw9/p;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    new-instance v0, Lka/i;

    .line 12
    .line 13
    invoke-direct {v0, p0, p1, p2}, Lka/i;-><init>(Lka/l;Lu9/f;Lcom/google/android/gms/auth/api/credentials/Credential;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v0}, Lu9/f;->b(Lcom/google/android/gms/common/api/internal/b;)Lcom/google/android/gms/common/api/internal/b;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
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
.end method

.method public final b(Lu9/f;Lcom/google/android/gms/auth/api/credentials/a;)Lu9/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu9/f;",
            "Lcom/google/android/gms/auth/api/credentials/a;",
            ")",
            "Lu9/g<",
            "Lm9/b;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "client must not be null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw9/p;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    const-string v0, "request must not be null"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lw9/p;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    new-instance v0, Lka/h;

    .line 12
    .line 13
    invoke-direct {v0, p0, p1, p2}, Lka/h;-><init>(Lka/l;Lu9/f;Lcom/google/android/gms/auth/api/credentials/a;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v0}, Lu9/f;->a(Lcom/google/android/gms/common/api/internal/b;)Lcom/google/android/gms/common/api/internal/b;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
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
.end method

.method public final c(Lu9/f;Lcom/google/android/gms/auth/api/credentials/Credential;)Lu9/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu9/f;",
            "Lcom/google/android/gms/auth/api/credentials/Credential;",
            ")",
            "Lu9/g<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "client must not be null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw9/p;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    const-string v0, "credential must not be null"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lw9/p;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    new-instance v0, Lka/j;

    .line 12
    .line 13
    invoke-direct {v0, p0, p1, p2}, Lka/j;-><init>(Lka/l;Lu9/f;Lcom/google/android/gms/auth/api/credentials/Credential;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v0}, Lu9/f;->b(Lcom/google/android/gms/common/api/internal/b;)Lcom/google/android/gms/common/api/internal/b;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
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
.end method
