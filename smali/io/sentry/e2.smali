.class public final synthetic Lio/sentry/e2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/c2;


# instance fields
.field public final synthetic a:Lio/sentry/g0;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lio/sentry/k;

.field public final synthetic d:Ljava/io/File;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/g0;Ljava/lang/String;Lio/sentry/k;Ljava/io/File;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/e2;->a:Lio/sentry/g0;

    iput-object p2, p0, Lio/sentry/e2;->b:Ljava/lang/String;

    iput-object p3, p0, Lio/sentry/e2;->c:Lio/sentry/k;

    iput-object p4, p0, Lio/sentry/e2;->d:Ljava/io/File;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    iget-object v0, p0, Lio/sentry/e2;->a:Lio/sentry/g0;

    iget-object v1, p0, Lio/sentry/e2;->b:Ljava/lang/String;

    iget-object v2, p0, Lio/sentry/e2;->c:Lio/sentry/k;

    iget-object v3, p0, Lio/sentry/e2;->d:Ljava/io/File;

    invoke-static {v0, v1, v2, v3}, Lio/sentry/f2;->c(Lio/sentry/g0;Ljava/lang/String;Lio/sentry/k;Ljava/io/File;)V

    return-void
.end method
