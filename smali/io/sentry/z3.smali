.class public final synthetic Lio/sentry/z3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lio/sentry/f0;

.field public final synthetic l:Lio/sentry/o3;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/f0;Lio/sentry/o3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/z3;->k:Lio/sentry/f0;

    iput-object p2, p0, Lio/sentry/z3;->l:Lio/sentry/o3;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lio/sentry/z3;->k:Lio/sentry/f0;

    iget-object v1, p0, Lio/sentry/z3;->l:Lio/sentry/o3;

    invoke-static {v0, v1}, Lio/sentry/a4;->f(Lio/sentry/f0;Lio/sentry/o3;)V

    return-void
.end method
