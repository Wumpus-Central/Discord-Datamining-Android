.class public final synthetic Lio/sentry/s1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/util/h$a;


# instance fields
.field public final synthetic a:Lio/sentry/u1;

.field public final synthetic b:Ljava/io/File;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/u1;Ljava/io/File;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/s1;->a:Lio/sentry/u1;

    iput-object p2, p0, Lio/sentry/s1;->b:Ljava/io/File;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lio/sentry/s1;->a:Lio/sentry/u1;

    iget-object v1, p0, Lio/sentry/s1;->b:Ljava/io/File;

    check-cast p1, Lio/sentry/hints/f;

    invoke-static {v0, v1, p1}, Lio/sentry/u1;->g(Lio/sentry/u1;Ljava/io/File;Lio/sentry/hints/f;)V

    return-void
.end method
