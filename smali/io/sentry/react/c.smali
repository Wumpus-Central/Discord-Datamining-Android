.class public final synthetic Lio/sentry/react/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/b2;


# instance fields
.field public final synthetic a:Lcom/facebook/react/bridge/ReadableMap;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/react/c;->a:Lcom/facebook/react/bridge/ReadableMap;

    iput-object p2, p0, Lio/sentry/react/c;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Lio/sentry/Scope;)V
    .locals 2

    iget-object v0, p0, Lio/sentry/react/c;->a:Lcom/facebook/react/bridge/ReadableMap;

    iget-object v1, p0, Lio/sentry/react/c;->b:Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lio/sentry/react/RNSentryModule;->b(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Lio/sentry/Scope;)V

    return-void
.end method
