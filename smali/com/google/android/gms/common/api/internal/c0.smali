.class final Lcom/google/android/gms/common/api/internal/c0;
.super Lcom/google/android/gms/common/api/internal/h;
.source "SourceFile"


# instance fields
.field final synthetic d:Lcom/google/android/gms/common/api/internal/h$a;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/internal/h$a;[Lt9/c;ZI)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/c0;->d:Lcom/google/android/gms/common/api/internal/h$a;

    invoke-direct {p0, p2, p3, p4}, Lcom/google/android/gms/common/api/internal/h;-><init>([Lt9/c;ZI)V

    return-void
.end method


# virtual methods
.method protected final b(Lu9/a$b;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/c0;->d:Lcom/google/android/gms/common/api/internal/h$a;

    invoke-static {v0}, Lcom/google/android/gms/common/api/internal/h$a;->f(Lcom/google/android/gms/common/api/internal/h$a;)Lv9/i;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lv9/i;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
