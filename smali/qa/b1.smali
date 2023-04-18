.class final Lqa/b1;
.super Lqa/d1;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/google/android/gms/common/api/Status;


# direct methods
.method constructor <init>(Lqa/c1;Lcom/google/android/gms/common/api/Status;)V
    .locals 0

    iput-object p2, p0, Lqa/b1;->a:Lcom/google/android/gms/common/api/Status;

    invoke-direct {p0}, Lqa/d1;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p1, Lv9/c;

    .line 2
    .line 3
    iget-object v0, p0, Lqa/b1;->a:Lcom/google/android/gms/common/api/Status;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->I()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lqa/b1;->a:Lcom/google/android/gms/common/api/Status;

    .line 12
    .line 13
    invoke-interface {p1, v0}, Lv9/c;->b(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iget-object v0, p0, Lqa/b1;->a:Lcom/google/android/gms/common/api/Status;

    .line 18
    .line 19
    invoke-interface {p1, v0}, Lv9/c;->a(Lcom/google/android/gms/common/api/Status;)V

    .line 20
    .line 21
    .line 22
    return-void
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method
