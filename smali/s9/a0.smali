.class public final synthetic Ls9/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcb/d;


# instance fields
.field public final synthetic a:Ls9/c;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/util/concurrent/ScheduledFuture;


# direct methods
.method public synthetic constructor <init>(Ls9/c;Ljava/lang/String;Ljava/util/concurrent/ScheduledFuture;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls9/a0;->a:Ls9/c;

    iput-object p2, p0, Ls9/a0;->b:Ljava/lang/String;

    iput-object p3, p0, Ls9/a0;->c:Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/tasks/Task;)V
    .locals 3

    iget-object v0, p0, Ls9/a0;->a:Ls9/c;

    iget-object v1, p0, Ls9/a0;->b:Ljava/lang/String;

    iget-object v2, p0, Ls9/a0;->c:Ljava/util/concurrent/ScheduledFuture;

    invoke-virtual {v0, v1, v2, p1}, Ls9/c;->e(Ljava/lang/String;Ljava/util/concurrent/ScheduledFuture;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method
