.class public final synthetic Lio/sentry/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lio/sentry/y;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/y;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/x;->a:Lio/sentry/y;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lio/sentry/x;->a:Lio/sentry/y;

    invoke-static {v0}, Lio/sentry/y;->a(Lio/sentry/y;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
