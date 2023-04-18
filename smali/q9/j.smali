.class final Lq9/j;
.super Lq9/e;
.source "SourceFile"


# instance fields
.field final synthetic a:Lq9/k;


# direct methods
.method constructor <init>(Lq9/k;)V
    .locals 0

    iput-object p1, p0, Lq9/j;->a:Lq9/k;

    invoke-direct {p0}, Lq9/e;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(Lcom/google/android/gms/common/api/Status;)V
    .locals 1

    iget-object v0, p0, Lq9/j;->a:Lq9/k;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->setResult(Lu9/k;)V

    return-void
.end method
