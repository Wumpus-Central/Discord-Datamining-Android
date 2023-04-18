.class public final Lqa/f1;
.super Lya/u;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/common/api/internal/d;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/internal/d;)V
    .locals 0

    invoke-direct {p0}, Lya/u;-><init>()V

    iput-object p1, p0, Lqa/f1;->a:Lcom/google/android/gms/common/api/internal/d;

    return-void
.end method


# virtual methods
.method public final p(Z)V
    .locals 2

    iget-object v0, p0, Lqa/f1;->a:Lcom/google/android/gms/common/api/internal/d;

    new-instance v1, Lqa/e1;

    invoke-direct {v1, p0, p1}, Lqa/e1;-><init>(Lqa/f1;Z)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/d;->c(Lcom/google/android/gms/common/api/internal/d$b;)V

    return-void
.end method
