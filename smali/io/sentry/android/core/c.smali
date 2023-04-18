.class public final synthetic Lio/sentry/android/core/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lio/sentry/android/core/g;

.field public final synthetic l:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/core/g;Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/android/core/c;->k:Lio/sentry/android/core/g;

    iput-object p2, p0, Lio/sentry/android/core/c;->l:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lio/sentry/android/core/c;->k:Lio/sentry/android/core/g;

    iget-object v1, p0, Lio/sentry/android/core/c;->l:Landroid/app/Activity;

    invoke-static {v0, v1}, Lio/sentry/android/core/g;->d(Lio/sentry/android/core/g;Landroid/app/Activity;)V

    return-void
.end method
