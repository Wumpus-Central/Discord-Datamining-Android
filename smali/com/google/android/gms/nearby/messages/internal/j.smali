.class public final synthetic Lcom/google/android/gms/nearby/messages/internal/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/nearby/messages/internal/p;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/nearby/messages/internal/u;

.field public final synthetic b:Lcom/google/android/gms/nearby/messages/Message;

.field public final synthetic c:Lcom/google/android/gms/nearby/messages/internal/r;

.field public final synthetic d:Lya/g;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/nearby/messages/internal/u;Lcom/google/android/gms/nearby/messages/Message;Lcom/google/android/gms/nearby/messages/internal/r;Lya/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/nearby/messages/internal/j;->a:Lcom/google/android/gms/nearby/messages/internal/u;

    iput-object p2, p0, Lcom/google/android/gms/nearby/messages/internal/j;->b:Lcom/google/android/gms/nearby/messages/Message;

    iput-object p3, p0, Lcom/google/android/gms/nearby/messages/internal/j;->c:Lcom/google/android/gms/nearby/messages/internal/r;

    iput-object p4, p0, Lcom/google/android/gms/nearby/messages/internal/j;->d:Lya/g;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/nearby/messages/internal/b;Lcom/google/android/gms/common/api/internal/d;)V
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/j;->a:Lcom/google/android/gms/nearby/messages/internal/u;

    iget-object v1, p0, Lcom/google/android/gms/nearby/messages/internal/j;->b:Lcom/google/android/gms/nearby/messages/Message;

    iget-object v2, p0, Lcom/google/android/gms/nearby/messages/internal/j;->c:Lcom/google/android/gms/nearby/messages/internal/r;

    iget-object v3, p0, Lcom/google/android/gms/nearby/messages/internal/j;->d:Lya/g;

    move-object v4, p1

    move-object v5, p2

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/nearby/messages/internal/u;->C(Lcom/google/android/gms/nearby/messages/Message;Lcom/google/android/gms/nearby/messages/internal/r;Lya/g;Lcom/google/android/gms/nearby/messages/internal/b;Lcom/google/android/gms/common/api/internal/d;)V

    return-void
.end method
