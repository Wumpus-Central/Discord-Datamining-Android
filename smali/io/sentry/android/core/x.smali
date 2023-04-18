.class public final synthetic Lio/sentry/android/core/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/android/core/b$a;


# instance fields
.field public final synthetic a:Lio/sentry/android/core/y;

.field public final synthetic b:Lio/sentry/f0;

.field public final synthetic c:Lio/sentry/android/core/SentryAndroidOptions;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/core/y;Lio/sentry/f0;Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/android/core/x;->a:Lio/sentry/android/core/y;

    iput-object p2, p0, Lio/sentry/android/core/x;->b:Lio/sentry/f0;

    iput-object p3, p0, Lio/sentry/android/core/x;->c:Lio/sentry/android/core/SentryAndroidOptions;

    return-void
.end method


# virtual methods
.method public final a(Lio/sentry/android/core/e0;)V
    .locals 3

    iget-object v0, p0, Lio/sentry/android/core/x;->a:Lio/sentry/android/core/y;

    iget-object v1, p0, Lio/sentry/android/core/x;->b:Lio/sentry/f0;

    iget-object v2, p0, Lio/sentry/android/core/x;->c:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-static {v0, v1, v2, p1}, Lio/sentry/android/core/y;->f(Lio/sentry/android/core/y;Lio/sentry/f0;Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/android/core/e0;)V

    return-void
.end method
