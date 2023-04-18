.class public final synthetic Lio/sentry/react/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/b2;


# instance fields
.field public final synthetic a:Lcom/facebook/react/bridge/ReadableMap;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/react/a;->a:Lcom/facebook/react/bridge/ReadableMap;

    return-void
.end method


# virtual methods
.method public final a(Lio/sentry/Scope;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/react/a;->a:Lcom/facebook/react/bridge/ReadableMap;

    invoke-static {v0, p1}, Lio/sentry/react/RNSentryModule;->f(Lcom/facebook/react/bridge/ReadableMap;Lio/sentry/Scope;)V

    return-void
.end method
