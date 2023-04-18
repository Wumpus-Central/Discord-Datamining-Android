.class public final synthetic Lio/sentry/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/util/h$a;


# instance fields
.field public final synthetic a:Lio/sentry/r;

.field public final synthetic b:Ljava/io/File;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/r;Ljava/io/File;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/p;->a:Lio/sentry/r;

    iput-object p2, p0, Lio/sentry/p;->b:Ljava/io/File;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lio/sentry/p;->a:Lio/sentry/r;

    iget-object v1, p0, Lio/sentry/p;->b:Ljava/io/File;

    check-cast p1, Lio/sentry/hints/f;

    invoke-static {v0, v1, p1}, Lio/sentry/r;->i(Lio/sentry/r;Ljava/io/File;Lio/sentry/hints/f;)V

    return-void
.end method
