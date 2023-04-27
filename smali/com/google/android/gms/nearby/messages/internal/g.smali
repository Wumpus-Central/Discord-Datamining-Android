.class public final synthetic Lcom/google/android/gms/nearby/messages/internal/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw9/i;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/nearby/messages/internal/u;

.field public final synthetic b:Lcom/google/android/gms/nearby/messages/internal/p;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/nearby/messages/internal/u;Lcom/google/android/gms/nearby/messages/internal/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/nearby/messages/internal/g;->a:Lcom/google/android/gms/nearby/messages/internal/u;

    iput-object p2, p0, Lcom/google/android/gms/nearby/messages/internal/g;->b:Lcom/google/android/gms/nearby/messages/internal/p;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/g;->a:Lcom/google/android/gms/nearby/messages/internal/u;

    iget-object v1, p0, Lcom/google/android/gms/nearby/messages/internal/g;->b:Lcom/google/android/gms/nearby/messages/internal/p;

    check-cast p1, Lcom/google/android/gms/nearby/messages/internal/b;

    check-cast p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual {v0, v1, p1, p2}, Lcom/google/android/gms/nearby/messages/internal/u;->D(Lcom/google/android/gms/nearby/messages/internal/p;Lcom/google/android/gms/nearby/messages/internal/b;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method
