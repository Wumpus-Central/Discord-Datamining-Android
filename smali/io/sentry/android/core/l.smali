.class public final synthetic Lio/sentry/android/core/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/Scope$b;


# instance fields
.field public final synthetic a:Lio/sentry/android/core/m;

.field public final synthetic b:Lio/sentry/Scope;

.field public final synthetic c:Lio/sentry/m0;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/core/m;Lio/sentry/Scope;Lio/sentry/m0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/android/core/l;->a:Lio/sentry/android/core/m;

    iput-object p2, p0, Lio/sentry/android/core/l;->b:Lio/sentry/Scope;

    iput-object p3, p0, Lio/sentry/android/core/l;->c:Lio/sentry/m0;

    return-void
.end method


# virtual methods
.method public final a(Lio/sentry/m0;)V
    .locals 3

    iget-object v0, p0, Lio/sentry/android/core/l;->a:Lio/sentry/android/core/m;

    iget-object v1, p0, Lio/sentry/android/core/l;->b:Lio/sentry/Scope;

    iget-object v2, p0, Lio/sentry/android/core/l;->c:Lio/sentry/m0;

    invoke-static {v0, v1, v2, p1}, Lio/sentry/android/core/m;->i(Lio/sentry/android/core/m;Lio/sentry/Scope;Lio/sentry/m0;Lio/sentry/m0;)V

    return-void
.end method
