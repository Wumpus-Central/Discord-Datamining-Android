.class public final synthetic Lcom/discord/crash_reporting/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/b2;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lcom/discord/crash_reporting/CrashReporting$ErrorLevel;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/discord/crash_reporting/CrashReporting$ErrorLevel;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/crash_reporting/b;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/discord/crash_reporting/b;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/discord/crash_reporting/b;->c:Lcom/discord/crash_reporting/CrashReporting$ErrorLevel;

    return-void
.end method


# virtual methods
.method public final a(Lio/sentry/Scope;)V
    .locals 3

    iget-object v0, p0, Lcom/discord/crash_reporting/b;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/discord/crash_reporting/b;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/discord/crash_reporting/b;->c:Lcom/discord/crash_reporting/CrashReporting$ErrorLevel;

    invoke-static {v0, v1, v2, p1}, Lcom/discord/crash_reporting/CrashReporting;->a(Ljava/lang/String;Ljava/lang/String;Lcom/discord/crash_reporting/CrashReporting$ErrorLevel;Lio/sentry/Scope;)V

    return-void
.end method
