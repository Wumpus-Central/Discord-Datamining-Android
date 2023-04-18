.class public final synthetic Lio/sentry/android/core/internal/util/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Thread$UncaughtExceptionHandler;


# instance fields
.field public final synthetic k:Lio/sentry/o3;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/o3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/android/core/internal/util/i;->k:Lio/sentry/o3;

    return-void
.end method


# virtual methods
.method public final uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/android/core/internal/util/i;->k:Lio/sentry/o3;

    invoke-static {v0, p1, p2}, Lio/sentry/android/core/internal/util/k;->b(Lio/sentry/o3;Ljava/lang/Thread;Ljava/lang/Throwable;)V

    return-void
.end method
