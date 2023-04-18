.class public final synthetic Lio/sentry/w2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lio/sentry/h3$a;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/h3$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/w2;->a:Lio/sentry/h3$a;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lio/sentry/w2;->a:Lio/sentry/h3$a;

    invoke-static {v0}, Lio/sentry/h3;->j(Lio/sentry/h3$a;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
