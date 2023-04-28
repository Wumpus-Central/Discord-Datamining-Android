.class final Lcom/discord/crash_reporting/system_logs/SystemLogUtils$fetch$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/crash_reporting/system_logs/SystemLogUtils;->fetch(Lkotlin/text/Regex;Lkotlin/jvm/functions/Function1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
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
.field final synthetic $cb:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/util/LinkedList<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $filter:Lkotlin/text/Regex;

.field final synthetic $logErrors:Z

.field final synthetic $output:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/util/LinkedList;Lkotlin/text/Regex;ZLkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/LinkedList<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/text/Regex;",
            "Z",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/util/LinkedList<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/discord/crash_reporting/system_logs/SystemLogUtils$fetch$1;->$output:Ljava/util/LinkedList;

    iput-object p2, p0, Lcom/discord/crash_reporting/system_logs/SystemLogUtils$fetch$1;->$filter:Lkotlin/text/Regex;

    iput-boolean p3, p0, Lcom/discord/crash_reporting/system_logs/SystemLogUtils$fetch$1;->$logErrors:Z

    iput-object p4, p0, Lcom/discord/crash_reporting/system_logs/SystemLogUtils$fetch$1;->$cb:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/discord/crash_reporting/system_logs/SystemLogUtils$fetch$1;->invoke()V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 8

    const/4 v0, 0x0

    .line 2
    :try_start_0
    new-instance v1, Ljava/lang/ProcessBuilder;

    const-string v2, "/system/bin/logcat"

    const-string v3, "-d"

    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/ProcessBuilder;-><init>([Ljava/lang/String;)V

    const/4 v2, 0x1

    .line 3
    invoke-virtual {v1, v2}, Ljava/lang/ProcessBuilder;->redirectErrorStream(Z)Ljava/lang/ProcessBuilder;

    move-result-object v1

    .line 4
    invoke-virtual {v1}, Ljava/lang/ProcessBuilder;->start()Ljava/lang/Process;

    move-result-object v0

    .line 5
    sget-object v1, Lcom/discord/crash_reporting/system_logs/SystemLogUtils;->INSTANCE:Lcom/discord/crash_reporting/system_logs/SystemLogUtils;

    invoke-static {v1, v0}, Lcom/discord/crash_reporting/system_logs/SystemLogUtils;->access$waitFor(Lcom/discord/crash_reporting/system_logs/SystemLogUtils;Ljava/lang/Process;)V

    .line 6
    invoke-virtual {v0}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    move-result-object v2

    const-string v3, "logcatProcess.inputStream"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lri/d;->b:Ljava/nio/charset/Charset;

    new-instance v4, Ljava/io/InputStreamReader;

    invoke-direct {v4, v2, v3}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    instance-of v2, v4, Ljava/io/BufferedReader;

    if-eqz v2, :cond_0

    check-cast v4, Ljava/io/BufferedReader;

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/io/BufferedReader;

    const/16 v3, 0x2000

    invoke-direct {v2, v4, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V

    move-object v4, v2

    .line 7
    :goto_0
    iget-object v2, p0, Lcom/discord/crash_reporting/system_logs/SystemLogUtils$fetch$1;->$output:Ljava/util/LinkedList;

    iget-object v3, p0, Lcom/discord/crash_reporting/system_logs/SystemLogUtils$fetch$1;->$filter:Lkotlin/text/Regex;

    invoke-virtual {v1, v4, v2, v3}, Lcom/discord/crash_reporting/system_logs/SystemLogUtils;->processLogs$crash_reporting_release(Ljava/io/BufferedReader;Ljava/util/LinkedList;Lkotlin/text/Regex;)V

    .line 8
    invoke-virtual {v4}, Ljava/io/BufferedReader;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Process;->destroy()V

    goto :goto_3

    :catchall_0
    move-exception v1

    goto :goto_4

    :catch_0
    move-exception v1

    .line 10
    :try_start_1
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 11
    iget-boolean v2, p0, Lcom/discord/crash_reporting/system_logs/SystemLogUtils$fetch$1;->$logErrors:Z

    if-eqz v2, :cond_1

    .line 12
    iget-object v2, p0, Lcom/discord/crash_reporting/system_logs/SystemLogUtils$fetch$1;->$output:Ljava/util/LinkedList;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Exception getting system logs \'"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, "\'"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 13
    invoke-virtual {v1}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v1

    const-string v2, "e.stackTrace"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/discord/crash_reporting/system_logs/SystemLogUtils$fetch$1;->$output:Ljava/util/LinkedList;

    .line 14
    array-length v3, v1

    const/4 v4, 0x0

    :goto_2
    if-ge v4, v3, :cond_1

    aget-object v5, v1, v4

    .line 15
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "    "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_1
    if-eqz v0, :cond_2

    goto :goto_1

    .line 16
    :cond_2
    :goto_3
    iget-object v0, p0, Lcom/discord/crash_reporting/system_logs/SystemLogUtils$fetch$1;->$cb:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lcom/discord/crash_reporting/system_logs/SystemLogUtils$fetch$1;->$output:Ljava/util/LinkedList;

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :goto_4
    if-eqz v0, :cond_3

    .line 17
    invoke-virtual {v0}, Ljava/lang/Process;->destroy()V

    :cond_3
    throw v1
.end method
