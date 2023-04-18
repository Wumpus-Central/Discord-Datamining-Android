.class abstract Lka/m;
.super Lcom/google/android/gms/common/api/internal/b;
.source "SourceFile"


# direct methods
.method constructor <init>(Lu9/f;)V
    .locals 1

    sget-object v0, Ll9/a;->b:Lu9/a;

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

.method protected final bridge synthetic c(Lu9/a$b;)V
    .locals 1

    .line 1
    check-cast p1, Lka/n;

    .line 2
    .line 3
    invoke-virtual {p1}, Lw9/c;->x()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1}, Lw9/c;->C()Landroid/os/IInterface;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lka/s;

    .line 12
    .line 13
    invoke-virtual {p0, v0, p1}, Lka/m;->g(Landroid/content/Context;Lka/s;)V

    .line 14
    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method protected abstract g(Landroid/content/Context;Lka/s;)V
.end method
