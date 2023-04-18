.class public final synthetic Lio/sentry/u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/w0$b;


# instance fields
.field public final synthetic a:Lio/sentry/x0;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/x0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/u0;->a:Lio/sentry/x0;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lio/sentry/u0;->a:Lio/sentry/x0;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->F()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
