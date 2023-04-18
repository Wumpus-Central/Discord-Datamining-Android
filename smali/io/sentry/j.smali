.class public final synthetic Lio/sentry/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/FilenameFilter;


# instance fields
.field public final synthetic a:Lio/sentry/k;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/j;->a:Lio/sentry/k;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/io/File;Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lio/sentry/j;->a:Lio/sentry/k;

    invoke-static {v0, p1, p2}, Lio/sentry/k;->b(Lio/sentry/k;Ljava/io/File;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method
