.class abstract Lq9/n;
.super Lcom/google/android/gms/common/api/internal/b;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lu9/f;)V
    .locals 1

    sget-object v0, Ll9/a;->c:Lu9/a;

    invoke-direct {p0, v0, p1}, Lcom/google/android/gms/common/api/internal/b;-><init>(Lu9/a;Lu9/f;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic b(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lu9/k;

    invoke-super {p0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->setResult(Lu9/k;)V

    return-void
.end method
