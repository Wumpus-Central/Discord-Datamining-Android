.class public final synthetic Lio/sentry/react/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/k2$a;


# instance fields
.field public final synthetic a:Lio/sentry/react/RNSentryModule;

.field public final synthetic b:Lcom/facebook/react/bridge/ReadableMap;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/react/RNSentryModule;Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/react/e;->a:Lio/sentry/react/RNSentryModule;

    iput-object p2, p0, Lio/sentry/react/e;->b:Lcom/facebook/react/bridge/ReadableMap;

    return-void
.end method


# virtual methods
.method public final a(Lio/sentry/o3;)V
    .locals 2

    iget-object v0, p0, Lio/sentry/react/e;->a:Lio/sentry/react/RNSentryModule;

    iget-object v1, p0, Lio/sentry/react/e;->b:Lcom/facebook/react/bridge/ReadableMap;

    check-cast p1, Lio/sentry/android/core/SentryAndroidOptions;

    invoke-static {v0, v1, p1}, Lio/sentry/react/RNSentryModule;->a(Lio/sentry/react/RNSentryModule;Lcom/facebook/react/bridge/ReadableMap;Lio/sentry/android/core/SentryAndroidOptions;)V

    return-void
.end method
