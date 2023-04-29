.class final Lcom/discord/crash_reporting/system_logs/SystemLogReport$reportLastCrash$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/crash_reporting/system_logs/SystemLogReport;->reportLastCrash$crash_reporting_release(Landroid/content/Context;Lkotlin/jvm/functions/Function2;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/discord/crash_reporting/system_logs/SystemLogUtils$Tombstone;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "crash",
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
.field final synthetic $cb:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Lcom/discord/crash_reporting/system_logs/HistoricalProcessExitReason$Reason;",
            "Lcom/discord/crash_reporting/system_logs/SystemLogUtils$Tombstone;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $context:Landroid/content/Context;


# direct methods
.method constructor <init>(Lkotlin/jvm/functions/Function2;Landroid/content/Context;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lcom/discord/crash_reporting/system_logs/HistoricalProcessExitReason$Reason;",
            "-",
            "Lcom/discord/crash_reporting/system_logs/SystemLogUtils$Tombstone;",
            "Lkotlin/Unit;",
            ">;",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/discord/crash_reporting/system_logs/SystemLogReport$reportLastCrash$1;->$cb:Lkotlin/jvm/functions/Function2;

    iput-object p2, p0, Lcom/discord/crash_reporting/system_logs/SystemLogReport$reportLastCrash$1;->$context:Landroid/content/Context;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/discord/crash_reporting/system_logs/SystemLogUtils$Tombstone;

    invoke-virtual {p0, p1}, Lcom/discord/crash_reporting/system_logs/SystemLogReport$reportLastCrash$1;->invoke(Lcom/discord/crash_reporting/system_logs/SystemLogUtils$Tombstone;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/discord/crash_reporting/system_logs/SystemLogUtils$Tombstone;)V
    .locals 7

    if-eqz p1, :cond_1

    .line 2
    iget-object v0, p0, Lcom/discord/crash_reporting/system_logs/SystemLogReport$reportLastCrash$1;->$context:Landroid/content/Context;

    .line 3
    invoke-virtual {p1}, Lcom/discord/crash_reporting/system_logs/SystemLogUtils$Tombstone;->getText()Ljava/lang/String;

    move-result-object v1

    const-string v2, "\n"

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lri/l;->z0(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 4
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 5
    sget-object v3, Lcom/discord/crash_reporting/system_logs/SystemLogReport;->INSTANCE:Lcom/discord/crash_reporting/system_logs/SystemLogReport;

    const-string v4, "Tombstone"

    invoke-static {v3, v2, v4}, Lcom/discord/crash_reporting/system_logs/SystemLogReport;->access$recordBreadcrumb(Lcom/discord/crash_reporting/system_logs/SystemLogReport;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 6
    :cond_0
    sget-object v1, Lcom/discord/crash_reporting/system_logs/SystemLogReport;->INSTANCE:Lcom/discord/crash_reporting/system_logs/SystemLogReport;

    invoke-virtual {p1}, Lcom/discord/crash_reporting/system_logs/SystemLogUtils$Tombstone;->getGroupHash()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Tombstone-Hash"

    invoke-static {v1, v2, v3}, Lcom/discord/crash_reporting/system_logs/SystemLogReport;->access$recordBreadcrumb(Lcom/discord/crash_reporting/system_logs/SystemLogReport;Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    invoke-virtual {p1}, Lcom/discord/crash_reporting/system_logs/SystemLogUtils$Tombstone;->getTextHash()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v0, v2}, Lcom/discord/crash_reporting/system_logs/SystemLogReport;->access$checkHashChanged(Lcom/discord/crash_reporting/system_logs/SystemLogReport;Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    .line 8
    :goto_1
    iget-object v1, p0, Lcom/discord/crash_reporting/system_logs/SystemLogReport$reportLastCrash$1;->$cb:Lkotlin/jvm/functions/Function2;

    sget-object v2, Lcom/discord/crash_reporting/system_logs/HistoricalProcessExitReason;->INSTANCE:Lcom/discord/crash_reporting/system_logs/HistoricalProcessExitReason;

    iget-object v3, p0, Lcom/discord/crash_reporting/system_logs/SystemLogReport$reportLastCrash$1;->$context:Landroid/content/Context;

    invoke-virtual {v2, v3}, Lcom/discord/crash_reporting/system_logs/HistoricalProcessExitReason;->lastReason(Landroid/content/Context;)Lcom/discord/crash_reporting/system_logs/HistoricalProcessExitReason$Reason;

    move-result-object v2

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    const/4 p1, 0x0

    :goto_2
    invoke-interface {v1, v2, p1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
