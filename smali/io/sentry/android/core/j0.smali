.class public final synthetic Lio/sentry/android/core/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lio/sentry/android/core/k0;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/core/k0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/android/core/j0;->a:Lio/sentry/android/core/k0;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lio/sentry/android/core/j0;->a:Lio/sentry/android/core/k0;

    invoke-static {v0}, Lio/sentry/android/core/k0;->a(Lio/sentry/android/core/k0;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
