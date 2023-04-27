.class final Lcom/google/android/gms/tasks/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
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
        "Lcom/google/android/gms/tasks/s<",
        "TTResult;>;"
    }
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/Executor;

.field private final b:Ldb/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldb/a<",
            "TTResult;TTContinuationResult;>;"
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
.method public constructor <init>(Ljava/util/concurrent/Executor;Ldb/a;Lcom/google/android/gms/tasks/w;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Ldb/a<",
            "TTResult;TTContinuationResult;>;",
            "Lcom/google/android/gms/tasks/w<",
            "TTContinuationResult;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/tasks/f;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lcom/google/android/gms/tasks/f;->b:Ldb/a;

    iput-object p3, p0, Lcom/google/android/gms/tasks/f;->c:Lcom/google/android/gms/tasks/w;

    return-void
.end method

.method static bridge synthetic a(Lcom/google/android/gms/tasks/f;)Ldb/a;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/tasks/f;->b:Ldb/a;

    return-object p0
.end method

.method static bridge synthetic c(Lcom/google/android/gms/tasks/f;)Lcom/google/android/gms/tasks/w;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/tasks/f;->c:Lcom/google/android/gms/tasks/w;

    return-object p0
.end method


# virtual methods
.method public final b(Lcom/google/android/gms/tasks/Task;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/tasks/Task<",
            "TTResult;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/tasks/f;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/google/android/gms/tasks/e;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/tasks/e;-><init>(Lcom/google/android/gms/tasks/f;Lcom/google/android/gms/tasks/Task;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
