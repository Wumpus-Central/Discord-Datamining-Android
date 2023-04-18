.class public final synthetic Lio/sentry/react/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/o3$b;


# instance fields
.field public final synthetic a:Lio/sentry/react/RNSentryModule;

.field public final synthetic b:Lio/sentry/android/core/SentryAndroidOptions;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/react/RNSentryModule;Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/react/d;->a:Lio/sentry/react/RNSentryModule;

    iput-object p2, p0, Lio/sentry/react/d;->b:Lio/sentry/android/core/SentryAndroidOptions;

    return-void
.end method


# virtual methods
.method public final a(Lio/sentry/j3;Lio/sentry/v;)Lio/sentry/j3;
    .locals 2

    iget-object v0, p0, Lio/sentry/react/d;->a:Lio/sentry/react/RNSentryModule;

    iget-object v1, p0, Lio/sentry/react/d;->b:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-static {v0, v1, p1, p2}, Lio/sentry/react/RNSentryModule;->g(Lio/sentry/react/RNSentryModule;Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/j3;Lio/sentry/v;)Lio/sentry/j3;

    move-result-object p1

    return-object p1
.end method
