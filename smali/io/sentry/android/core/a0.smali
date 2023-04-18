.class public final synthetic Lio/sentry/android/core/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lio/sentry/android/core/c0;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/core/c0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/android/core/a0;->k:Lio/sentry/android/core/c0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lio/sentry/android/core/a0;->k:Lio/sentry/android/core/c0;

    invoke-static {v0}, Lio/sentry/android/core/c0;->f(Lio/sentry/android/core/c0;)V

    return-void
.end method
