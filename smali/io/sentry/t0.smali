.class public final synthetic Lio/sentry/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/w0$b;


# instance fields
.field public final synthetic a:Lio/sentry/w0;

.field public final synthetic b:Lio/sentry/x0;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/w0;Lio/sentry/x0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/t0;->a:Lio/sentry/w0;

    iput-object p2, p0, Lio/sentry/t0;->b:Lio/sentry/x0;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lio/sentry/t0;->a:Lio/sentry/w0;

    iget-object v1, p0, Lio/sentry/t0;->b:Lio/sentry/x0;

    invoke-static {v0, v1}, Lio/sentry/w0;->a(Lio/sentry/w0;Lio/sentry/x0;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
