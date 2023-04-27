.class final Lcom/google/android/gms/common/api/internal/a0;
.super Lcom/google/android/gms/common/api/internal/f;
.source "SourceFile"


# instance fields
.field final synthetic e:Lcom/google/android/gms/common/api/internal/g$a;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/internal/g$a;Lcom/google/android/gms/common/api/internal/d;[Lu9/c;ZI)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/a0;->e:Lcom/google/android/gms/common/api/internal/g$a;

    invoke-direct {p0, p2, p3, p4, p5}, Lcom/google/android/gms/common/api/internal/f;-><init>(Lcom/google/android/gms/common/api/internal/d;[Lu9/c;ZI)V

    return-void
.end method


# virtual methods
.method protected final d(Lv9/a$b;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv9/a$b;",
            "Lcom/google/android/gms/tasks/TaskCompletionSource<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/a0;->e:Lcom/google/android/gms/common/api/internal/g$a;

    invoke-static {v0}, Lcom/google/android/gms/common/api/internal/g$a;->f(Lcom/google/android/gms/common/api/internal/g$a;)Lw9/i;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lw9/i;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
