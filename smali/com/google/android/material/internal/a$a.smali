.class Lcom/google/android/material/internal/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/material/internal/h$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/internal/a;->e(Lcom/google/android/material/internal/h;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/material/internal/h$a<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/material/internal/a;


# direct methods
.method constructor <init>(Lcom/google/android/material/internal/a;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/internal/a$a;->a:Lcom/google/android/material/internal/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Z)V
    .locals 0

    check-cast p1, Lcom/google/android/material/internal/h;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/material/internal/a$a;->b(Lcom/google/android/material/internal/h;Z)V

    return-void
.end method

.method public b(Lcom/google/android/material/internal/h;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;Z)V"
        }
    .end annotation

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iget-object p2, p0, Lcom/google/android/material/internal/a$a;->a:Lcom/google/android/material/internal/a;

    .line 4
    .line 5
    invoke-static {p2, p1}, Lcom/google/android/material/internal/a;->a(Lcom/google/android/material/internal/a;Lcom/google/android/material/internal/h;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object p2, p0, Lcom/google/android/material/internal/a$a;->a:Lcom/google/android/material/internal/a;

    .line 13
    .line 14
    invoke-static {p2}, Lcom/google/android/material/internal/a;->b(Lcom/google/android/material/internal/a;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-static {p2, p1, v0}, Lcom/google/android/material/internal/a;->c(Lcom/google/android/material/internal/a;Lcom/google/android/material/internal/h;Z)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    :goto_0
    iget-object p1, p0, Lcom/google/android/material/internal/a$a;->a:Lcom/google/android/material/internal/a;

    .line 25
    .line 26
    invoke-static {p1}, Lcom/google/android/material/internal/a;->d(Lcom/google/android/material/internal/a;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void
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
