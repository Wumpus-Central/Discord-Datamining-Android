.class public final synthetic Lio/sentry/n2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/Scope$a;


# instance fields
.field public final synthetic a:Lio/sentry/o2;

.field public final synthetic b:Lio/sentry/j3;

.field public final synthetic c:Lio/sentry/v;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/o2;Lio/sentry/j3;Lio/sentry/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/n2;->a:Lio/sentry/o2;

    iput-object p2, p0, Lio/sentry/n2;->b:Lio/sentry/j3;

    iput-object p3, p0, Lio/sentry/n2;->c:Lio/sentry/v;

    return-void
.end method


# virtual methods
.method public final a(Lio/sentry/y3;)V
    .locals 3

    iget-object v0, p0, Lio/sentry/n2;->a:Lio/sentry/o2;

    iget-object v1, p0, Lio/sentry/n2;->b:Lio/sentry/j3;

    iget-object v2, p0, Lio/sentry/n2;->c:Lio/sentry/v;

    invoke-static {v0, v1, v2, p1}, Lio/sentry/o2;->i(Lio/sentry/o2;Lio/sentry/j3;Lio/sentry/v;Lio/sentry/y3;)V

    return-void
.end method
