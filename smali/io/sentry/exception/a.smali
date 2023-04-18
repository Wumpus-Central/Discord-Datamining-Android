.class public final Lio/sentry/exception/a;
.super Ljava/lang/RuntimeException;
.source "SourceFile"


# instance fields
.field private final k:Lio/sentry/protocol/h;

.field private final l:Ljava/lang/Throwable;

.field private final m:Ljava/lang/Thread;

.field private final n:Z


# direct methods
.method public constructor <init>(Lio/sentry/protocol/h;Ljava/lang/Throwable;Ljava/lang/Thread;)V
    .locals 1

    const/4 v0, 0x0

    .line 6
    invoke-direct {p0, p1, p2, p3, v0}, Lio/sentry/exception/a;-><init>(Lio/sentry/protocol/h;Ljava/lang/Throwable;Ljava/lang/Thread;Z)V

    return-void
.end method

.method public constructor <init>(Lio/sentry/protocol/h;Ljava/lang/Throwable;Ljava/lang/Thread;Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    const-string v0, "Mechanism is required."

    .line 2
    invoke-static {p1, v0}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/sentry/protocol/h;

    iput-object p1, p0, Lio/sentry/exception/a;->k:Lio/sentry/protocol/h;

    const-string p1, "Throwable is required."

    .line 3
    invoke-static {p2, p1}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    iput-object p1, p0, Lio/sentry/exception/a;->l:Ljava/lang/Throwable;

    const-string p1, "Thread is required."

    .line 4
    invoke-static {p3, p1}, Lio/sentry/util/k;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Thread;

    iput-object p1, p0, Lio/sentry/exception/a;->m:Ljava/lang/Thread;

    .line 5
    iput-boolean p4, p0, Lio/sentry/exception/a;->n:Z

    return-void
.end method


# virtual methods
.method public a()Lio/sentry/protocol/h;
    .locals 1

    iget-object v0, p0, Lio/sentry/exception/a;->k:Lio/sentry/protocol/h;

    return-object v0
.end method

.method public b()Ljava/lang/Thread;
    .locals 1

    iget-object v0, p0, Lio/sentry/exception/a;->m:Ljava/lang/Thread;

    return-object v0
.end method

.method public c()Ljava/lang/Throwable;
    .locals 1

    iget-object v0, p0, Lio/sentry/exception/a;->l:Ljava/lang/Throwable;

    return-object v0
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/exception/a;->n:Z

    return v0
.end method
