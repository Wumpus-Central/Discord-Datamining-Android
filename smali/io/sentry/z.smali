.class public final synthetic Lio/sentry/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/b2;


# instance fields
.field public final synthetic a:Lio/sentry/m0;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/m0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/z;->a:Lio/sentry/m0;

    return-void
.end method


# virtual methods
.method public final a(Lio/sentry/Scope;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/z;->a:Lio/sentry/m0;

    invoke-static {v0, p1}, Lio/sentry/a0;->a(Lio/sentry/m0;Lio/sentry/Scope;)V

    return-void
.end method
