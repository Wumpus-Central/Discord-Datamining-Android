.class public final synthetic Lio/sentry/android/core/a1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/k2$a;


# instance fields
.field public final synthetic a:Lio/sentry/g0;

.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Lio/sentry/k2$a;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/g0;Landroid/content/Context;Lio/sentry/k2$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/android/core/a1;->a:Lio/sentry/g0;

    iput-object p2, p0, Lio/sentry/android/core/a1;->b:Landroid/content/Context;

    iput-object p3, p0, Lio/sentry/android/core/a1;->c:Lio/sentry/k2$a;

    return-void
.end method


# virtual methods
.method public final a(Lio/sentry/o3;)V
    .locals 3

    iget-object v0, p0, Lio/sentry/android/core/a1;->a:Lio/sentry/g0;

    iget-object v1, p0, Lio/sentry/android/core/a1;->b:Landroid/content/Context;

    iget-object v2, p0, Lio/sentry/android/core/a1;->c:Lio/sentry/k2$a;

    check-cast p1, Lio/sentry/android/core/SentryAndroidOptions;

    invoke-static {v0, v1, v2, p1}, Lio/sentry/android/core/b1;->a(Lio/sentry/g0;Landroid/content/Context;Lio/sentry/k2$a;Lio/sentry/android/core/SentryAndroidOptions;)V

    return-void
.end method
