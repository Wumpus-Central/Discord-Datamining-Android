.class public final synthetic Lcom/discord/crash_reporting/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/k2$a;


# instance fields
.field public final synthetic a:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/crash_reporting/a;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final a(Lio/sentry/o3;)V
    .locals 1

    iget-object v0, p0, Lcom/discord/crash_reporting/a;->a:Landroid/content/Context;

    check-cast p1, Lio/sentry/android/core/SentryAndroidOptions;

    invoke-static {v0, p1}, Lcom/discord/crash_reporting/CrashReporting;->b(Landroid/content/Context;Lio/sentry/android/core/SentryAndroidOptions;)V

    return-void
.end method
