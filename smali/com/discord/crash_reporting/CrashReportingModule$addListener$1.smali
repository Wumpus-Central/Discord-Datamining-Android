.class final Lcom/discord/crash_reporting/CrashReportingModule$addListener$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/crash_reporting/CrashReportingModule;->addListener(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function2<",
        "Lcom/discord/crash_reporting/system_logs/HistoricalProcessExitReason$Reason;",
        "Lcom/discord/crash_reporting/system_logs/SystemLogUtils$Tombstone;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n\u00a2\u0006\u0002\u0008\u0006"
    }
    d2 = {
        "<anonymous>",
        "",
        "reason",
        "Lcom/discord/crash_reporting/system_logs/HistoricalProcessExitReason$Reason;",
        "tombstone",
        "Lcom/discord/crash_reporting/system_logs/SystemLogUtils$Tombstone;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lcom/discord/crash_reporting/CrashReportingModule;


# direct methods
.method constructor <init>(Lcom/discord/crash_reporting/CrashReportingModule;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/crash_reporting/CrashReportingModule$addListener$1;->this$0:Lcom/discord/crash_reporting/CrashReportingModule;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/discord/crash_reporting/system_logs/HistoricalProcessExitReason$Reason;

    check-cast p2, Lcom/discord/crash_reporting/system_logs/SystemLogUtils$Tombstone;

    invoke-virtual {p0, p1, p2}, Lcom/discord/crash_reporting/CrashReportingModule$addListener$1;->invoke(Lcom/discord/crash_reporting/system_logs/HistoricalProcessExitReason$Reason;Lcom/discord/crash_reporting/system_logs/SystemLogUtils$Tombstone;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/discord/crash_reporting/system_logs/HistoricalProcessExitReason$Reason;Lcom/discord/crash_reporting/system_logs/SystemLogUtils$Tombstone;)V
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/discord/crash_reporting/CrashReportingModule$addListener$1;->this$0:Lcom/discord/crash_reporting/CrashReportingModule;

    invoke-static {v0}, Lcom/discord/crash_reporting/CrashReportingModule;->access$getReactEvents$p(Lcom/discord/crash_reporting/CrashReportingModule;)Lcom/discord/reactevents/ReactEvents;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/discord/crash_reporting/CrashReportingModule$addListener$1;->this$0:Lcom/discord/crash_reporting/CrashReportingModule;

    invoke-static {v1}, Lcom/discord/crash_reporting/CrashReportingModule;->access$getReactApplicationContext(Lcom/discord/crash_reporting/CrashReportingModule;)Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v1

    const-string v2, "reactApplicationContext"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    new-instance v2, Lcom/discord/crash_reporting/react_events/CrashReportEvent;

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-direct {v2, v3, p1, p2}, Lcom/discord/crash_reporting/react_events/CrashReportEvent;-><init>(Ljava/lang/Boolean;Lcom/discord/crash_reporting/system_logs/HistoricalProcessExitReason$Reason;Lcom/discord/crash_reporting/system_logs/SystemLogUtils$Tombstone;)V

    .line 5
    invoke-virtual {v0, v1, v2}, Lcom/discord/reactevents/ReactEvents;->emitModuleEvent(Landroid/content/Context;Lcom/discord/reactevents/ReactEvent;)V

    return-void
.end method
