.class final Lq9/l;
.super Lq9/e;
.source "SourceFile"


# instance fields
.field final synthetic a:Lq9/m;


# direct methods
.method constructor <init>(Lq9/m;)V
    .locals 0

    iput-object p1, p0, Lq9/l;->a:Lq9/m;

    invoke-direct {p0}, Lq9/e;-><init>()V

    return-void
.end method


# virtual methods
.method public final D(Lcom/google/android/gms/common/api/Status;)V
    .locals 1

    iget-object v0, p0, Lq9/l;->a:Lq9/m;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->setResult(Lu9/k;)V

    return-void
.end method
