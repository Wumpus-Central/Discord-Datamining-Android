.class public final synthetic Lio/sentry/android/core/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lio/sentry/android/core/v;

.field public final synthetic l:Lio/sentry/m0;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/core/v;Lio/sentry/m0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/android/core/t;->k:Lio/sentry/android/core/v;

    iput-object p2, p0, Lio/sentry/android/core/t;->l:Lio/sentry/m0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lio/sentry/android/core/t;->k:Lio/sentry/android/core/v;

    iget-object v1, p0, Lio/sentry/android/core/t;->l:Lio/sentry/m0;

    invoke-static {v0, v1}, Lio/sentry/android/core/v;->d(Lio/sentry/android/core/v;Lio/sentry/m0;)V

    return-void
.end method
