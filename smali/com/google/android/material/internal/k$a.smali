.class Lcom/google/android/material/internal/k$a;
.super Ltb/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/internal/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/material/internal/k;


# direct methods
.method constructor <init>(Lcom/google/android/material/internal/k;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/internal/k$a;->a:Lcom/google/android/material/internal/k;

    invoke-direct {p0}, Ltb/f;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/google/android/material/internal/k$a;->a:Lcom/google/android/material/internal/k;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-static {p1, v0}, Lcom/google/android/material/internal/k;->a(Lcom/google/android/material/internal/k;Z)Z

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lcom/google/android/material/internal/k$a;->a:Lcom/google/android/material/internal/k;

    .line 8
    .line 9
    invoke-static {p1}, Lcom/google/android/material/internal/k;->b(Lcom/google/android/material/internal/k;)Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Lcom/google/android/material/internal/k$b;

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-interface {p1}, Lcom/google/android/material/internal/k$b;->a()V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
    .line 25
    .line 26
    .line 27
.end method

.method public b(Landroid/graphics/Typeface;Z)V
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/google/android/material/internal/k$a;->a:Lcom/google/android/material/internal/k;

    .line 5
    .line 6
    const/4 p2, 0x1

    .line 7
    invoke-static {p1, p2}, Lcom/google/android/material/internal/k;->a(Lcom/google/android/material/internal/k;Z)Z

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lcom/google/android/material/internal/k$a;->a:Lcom/google/android/material/internal/k;

    .line 11
    .line 12
    invoke-static {p1}, Lcom/google/android/material/internal/k;->b(Lcom/google/android/material/internal/k;)Ljava/lang/ref/WeakReference;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Lcom/google/android/material/internal/k$b;

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    invoke-interface {p1}, Lcom/google/android/material/internal/k$b;->a()V

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
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
