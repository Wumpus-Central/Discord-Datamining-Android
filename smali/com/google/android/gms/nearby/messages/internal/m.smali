.class final Lcom/google/android/gms/nearby/messages/internal/m;
.super Lcom/google/android/gms/nearby/messages/internal/t;
.source "SourceFile"


# instance fields
.field final synthetic c:Lcom/google/android/gms/common/api/internal/d;

.field final synthetic d:Lcom/google/android/gms/nearby/messages/internal/u;


# direct methods
.method constructor <init>(Lcom/google/android/gms/nearby/messages/internal/u;Lcom/google/android/gms/common/api/internal/d;Lcom/google/android/gms/common/api/internal/d;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/nearby/messages/internal/m;->d:Lcom/google/android/gms/nearby/messages/internal/u;

    iput-object p3, p0, Lcom/google/android/gms/nearby/messages/internal/m;->c:Lcom/google/android/gms/common/api/internal/d;

    invoke-direct {p0, p2}, Lcom/google/android/gms/nearby/messages/internal/t;-><init>(Lcom/google/android/gms/common/api/internal/d;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/m;->c:Lcom/google/android/gms/common/api/internal/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/d;->b()Lcom/google/android/gms/common/api/internal/d$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lcom/google/android/gms/nearby/messages/internal/m;->d:Lcom/google/android/gms/nearby/messages/internal/u;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Lu9/e;->n(Lcom/google/android/gms/common/api/internal/d$a;)Lcom/google/android/gms/tasks/Task;

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-super {p0}, Lcom/google/android/gms/nearby/messages/internal/t;->a()V

    .line 15
    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method
