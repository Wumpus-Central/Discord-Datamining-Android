.class final Lcom/google/android/gms/tasks/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcb/f;
.implements Lcb/e;
.implements Lcb/c;
.implements Lcom/google/android/gms/tasks/s;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<TResult:",
        "Ljava/lang/Object;",
        "TContinuationResult:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcb/f<",
        "TTContinuationResult;>;",
        "Lcb/e;",
        "Lcb/c;",
        "Lcom/google/android/gms/tasks/s;"
    }
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/Executor;

.field private final b:Lcb/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcb/a<",
            "TTResult;",
            "Lcom/google/android/gms/tasks/Task<",
            "TTContinuationResult;>;>;"
        }
    .end annotation
.end field

.field private final c:Lcom/google/android/gms/tasks/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/tasks/w<",
            "TTContinuationResult;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lcb/a;Lcom/google/android/gms/tasks/w;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lcb/a<",
            "TTResult;",
            "Lcom/google/android/gms/tasks/Task<",
            "TTContinuationResult;>;>;",
            "Lcom/google/android/gms/tasks/w<",
            "TTContinuationResult;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/tasks/h;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lcom/google/android/gms/tasks/h;->b:Lcb/a;

    iput-object p3, p0, Lcom/google/android/gms/tasks/h;->c:Lcom/google/android/gms/tasks/w;

    return-void
.end method

.method static bridge synthetic d(Lcom/google/android/gms/tasks/h;)Lcb/a;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/tasks/h;->b:Lcb/a;

    return-object p0
.end method

.method static bridge synthetic e(Lcom/google/android/gms/tasks/h;)Lcom/google/android/gms/tasks/w;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/tasks/h;->c:Lcom/google/android/gms/tasks/w;

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTContinuationResult;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/tasks/h;->c:Lcom/google/android/gms/tasks/w;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/tasks/w;->r(Ljava/lang/Object;)V

    return-void
.end method

.method public final b(Lcom/google/android/gms/tasks/Task;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/tasks/Task<",
            "TTResult;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/tasks/h;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/google/android/gms/tasks/g;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/tasks/g;-><init>(Lcom/google/android/gms/tasks/h;Lcom/google/android/gms/tasks/Task;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final c()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/tasks/h;->c:Lcom/google/android/gms/tasks/w;

    invoke-virtual {v0}, Lcom/google/android/gms/tasks/w;->s()Z

    return-void
.end method

.method public final onFailure(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/tasks/h;->c:Lcom/google/android/gms/tasks/w;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/tasks/w;->q(Ljava/lang/Exception;)V

    return-void
.end method
