.class public final synthetic Lio/sentry/android/core/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lio/sentry/c2;

.field public final synthetic l:Lio/sentry/android/core/SentryAndroidOptions;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/c2;Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/android/core/x0;->k:Lio/sentry/c2;

    iput-object p2, p0, Lio/sentry/android/core/x0;->l:Lio/sentry/android/core/SentryAndroidOptions;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lio/sentry/android/core/x0;->k:Lio/sentry/c2;

    iget-object v1, p0, Lio/sentry/android/core/x0;->l:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-static {v0, v1}, Lio/sentry/android/core/y0;->a(Lio/sentry/c2;Lio/sentry/android/core/SentryAndroidOptions;)V

    return-void
.end method
