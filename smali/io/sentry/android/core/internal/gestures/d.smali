.class public final synthetic Lio/sentry/android/core/internal/gestures/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/b2;


# instance fields
.field public final synthetic a:Lio/sentry/android/core/internal/gestures/g;

.field public final synthetic b:Lio/sentry/m0;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/core/internal/gestures/g;Lio/sentry/m0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/android/core/internal/gestures/d;->a:Lio/sentry/android/core/internal/gestures/g;

    iput-object p2, p0, Lio/sentry/android/core/internal/gestures/d;->b:Lio/sentry/m0;

    return-void
.end method


# virtual methods
.method public final a(Lio/sentry/Scope;)V
    .locals 2

    iget-object v0, p0, Lio/sentry/android/core/internal/gestures/d;->a:Lio/sentry/android/core/internal/gestures/g;

    iget-object v1, p0, Lio/sentry/android/core/internal/gestures/d;->b:Lio/sentry/m0;

    invoke-static {v0, v1, p1}, Lio/sentry/android/core/internal/gestures/g;->a(Lio/sentry/android/core/internal/gestures/g;Lio/sentry/m0;Lio/sentry/Scope;)V

    return-void
.end method
