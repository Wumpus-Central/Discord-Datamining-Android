.class public final synthetic Lio/sentry/android/core/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/o4;


# instance fields
.field public final synthetic a:Lio/sentry/android/core/m;

.field public final synthetic b:Ljava/lang/ref/WeakReference;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/core/m;Ljava/lang/ref/WeakReference;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/android/core/h;->a:Lio/sentry/android/core/m;

    iput-object p2, p0, Lio/sentry/android/core/h;->b:Ljava/lang/ref/WeakReference;

    iput-object p3, p0, Lio/sentry/android/core/h;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Lio/sentry/m0;)V
    .locals 3

    iget-object v0, p0, Lio/sentry/android/core/h;->a:Lio/sentry/android/core/m;

    iget-object v1, p0, Lio/sentry/android/core/h;->b:Ljava/lang/ref/WeakReference;

    iget-object v2, p0, Lio/sentry/android/core/h;->c:Ljava/lang/String;

    invoke-static {v0, v1, v2, p1}, Lio/sentry/android/core/m;->p(Lio/sentry/android/core/m;Ljava/lang/ref/WeakReference;Ljava/lang/String;Lio/sentry/m0;)V

    return-void
.end method
