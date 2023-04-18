.class final Lcom/google/android/gms/tasks/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic k:Lcom/google/android/gms/tasks/Task;

.field final synthetic l:Lcom/google/android/gms/tasks/r;


# direct methods
.method constructor <init>(Lcom/google/android/gms/tasks/r;Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/tasks/q;->l:Lcom/google/android/gms/tasks/r;

    iput-object p2, p0, Lcom/google/android/gms/tasks/q;->k:Lcom/google/android/gms/tasks/Task;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/tasks/q;->l:Lcom/google/android/gms/tasks/r;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/android/gms/tasks/r;->d(Lcom/google/android/gms/tasks/r;)Lcb/h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/google/android/gms/tasks/q;->k:Lcom/google/android/gms/tasks/Task;

    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/google/android/gms/tasks/Task;->k()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v0, v1}, Lcb/h;->a(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 14
    .line 15
    .line 16
    move-result-object v0
    :try_end_0
    .catch Lcb/g; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lcom/google/android/gms/tasks/q;->l:Lcom/google/android/gms/tasks/r;

    .line 20
    .line 21
    new-instance v1, Ljava/lang/NullPointerException;

    .line 22
    .line 23
    const-string v2, "Continuation returned null"

    .line 24
    .line 25
    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/r;->onFailure(Ljava/lang/Exception;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    sget-object v1, Lcom/google/android/gms/tasks/a;->b:Ljava/util/concurrent/Executor;

    .line 33
    .line 34
    iget-object v2, p0, Lcom/google/android/gms/tasks/q;->l:Lcom/google/android/gms/tasks/r;

    .line 35
    .line 36
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/tasks/Task;->g(Ljava/util/concurrent/Executor;Lcb/f;)Lcom/google/android/gms/tasks/Task;

    .line 37
    .line 38
    .line 39
    iget-object v2, p0, Lcom/google/android/gms/tasks/q;->l:Lcom/google/android/gms/tasks/r;

    .line 40
    .line 41
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/tasks/Task;->e(Ljava/util/concurrent/Executor;Lcb/e;)Lcom/google/android/gms/tasks/Task;

    .line 42
    .line 43
    .line 44
    iget-object v2, p0, Lcom/google/android/gms/tasks/q;->l:Lcom/google/android/gms/tasks/r;

    .line 45
    .line 46
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/tasks/Task;->a(Ljava/util/concurrent/Executor;Lcb/c;)Lcom/google/android/gms/tasks/Task;

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :catch_0
    move-exception v0

    .line 51
    iget-object v1, p0, Lcom/google/android/gms/tasks/q;->l:Lcom/google/android/gms/tasks/r;

    .line 52
    .line 53
    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/r;->onFailure(Ljava/lang/Exception;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :catch_1
    iget-object v0, p0, Lcom/google/android/gms/tasks/q;->l:Lcom/google/android/gms/tasks/r;

    .line 58
    .line 59
    invoke-virtual {v0}, Lcom/google/android/gms/tasks/r;->c()V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :catch_2
    move-exception v0

    .line 64
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    instance-of v1, v1, Ljava/lang/Exception;

    .line 69
    .line 70
    if-eqz v1, :cond_1

    .line 71
    .line 72
    iget-object v1, p0, Lcom/google/android/gms/tasks/q;->l:Lcom/google/android/gms/tasks/r;

    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    check-cast v0, Ljava/lang/Exception;

    .line 79
    .line 80
    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/r;->onFailure(Ljava/lang/Exception;)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/tasks/q;->l:Lcom/google/android/gms/tasks/r;

    .line 85
    .line 86
    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/r;->onFailure(Ljava/lang/Exception;)V

    .line 87
    .line 88
    .line 89
    return-void
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
.end method
