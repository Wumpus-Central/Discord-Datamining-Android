.class public final synthetic Lio/sentry/v3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/Scope$b;


# instance fields
.field public final synthetic a:Lio/sentry/w3;

.field public final synthetic b:Lio/sentry/Scope;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/w3;Lio/sentry/Scope;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/v3;->a:Lio/sentry/w3;

    iput-object p2, p0, Lio/sentry/v3;->b:Lio/sentry/Scope;

    return-void
.end method


# virtual methods
.method public final a(Lio/sentry/m0;)V
    .locals 2

    iget-object v0, p0, Lio/sentry/v3;->a:Lio/sentry/w3;

    iget-object v1, p0, Lio/sentry/v3;->b:Lio/sentry/Scope;

    invoke-static {v0, v1, p1}, Lio/sentry/w3;->n(Lio/sentry/w3;Lio/sentry/Scope;Lio/sentry/m0;)V

    return-void
.end method
