.class final Lcom/google/android/gms/common/api/internal/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic k:I

.field final synthetic l:Lcom/google/android/gms/common/api/internal/t;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/internal/t;I)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/q;->l:Lcom/google/android/gms/common/api/internal/t;

    iput p2, p0, Lcom/google/android/gms/common/api/internal/q;->k:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/q;->l:Lcom/google/android/gms/common/api/internal/t;

    iget v1, p0, Lcom/google/android/gms/common/api/internal/q;->k:I

    invoke-static {v0, v1}, Lcom/google/android/gms/common/api/internal/t;->A(Lcom/google/android/gms/common/api/internal/t;I)V

    return-void
.end method
