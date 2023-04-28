.class public final enum Lcom/discord/crash_reporting/PerformanceTracing$MarkerEnd;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/crash_reporting/PerformanceTracing;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "MarkerEnd"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/discord/crash_reporting/PerformanceTracing$MarkerEnd;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0004\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/discord/crash_reporting/PerformanceTracing$MarkerEnd;",
        "",
        "(Ljava/lang/String;I)V",
        "START",
        "END",
        "crash_reporting_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/discord/crash_reporting/PerformanceTracing$MarkerEnd;

.field public static final enum END:Lcom/discord/crash_reporting/PerformanceTracing$MarkerEnd;

.field public static final enum START:Lcom/discord/crash_reporting/PerformanceTracing$MarkerEnd;


# direct methods
.method private static final synthetic $values()[Lcom/discord/crash_reporting/PerformanceTracing$MarkerEnd;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lcom/discord/crash_reporting/PerformanceTracing$MarkerEnd;

    const/4 v1, 0x0

    sget-object v2, Lcom/discord/crash_reporting/PerformanceTracing$MarkerEnd;->START:Lcom/discord/crash_reporting/PerformanceTracing$MarkerEnd;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/discord/crash_reporting/PerformanceTracing$MarkerEnd;->END:Lcom/discord/crash_reporting/PerformanceTracing$MarkerEnd;

    aput-object v2, v0, v1

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/discord/crash_reporting/PerformanceTracing$MarkerEnd;

    .line 2
    .line 3
    const-string v1, "START"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcom/discord/crash_reporting/PerformanceTracing$MarkerEnd;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/discord/crash_reporting/PerformanceTracing$MarkerEnd;->START:Lcom/discord/crash_reporting/PerformanceTracing$MarkerEnd;

    .line 10
    .line 11
    new-instance v0, Lcom/discord/crash_reporting/PerformanceTracing$MarkerEnd;

    .line 12
    .line 13
    const-string v1, "END"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lcom/discord/crash_reporting/PerformanceTracing$MarkerEnd;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/discord/crash_reporting/PerformanceTracing$MarkerEnd;->END:Lcom/discord/crash_reporting/PerformanceTracing$MarkerEnd;

    .line 20
    .line 21
    invoke-static {}, Lcom/discord/crash_reporting/PerformanceTracing$MarkerEnd;->$values()[Lcom/discord/crash_reporting/PerformanceTracing$MarkerEnd;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lcom/discord/crash_reporting/PerformanceTracing$MarkerEnd;->$VALUES:[Lcom/discord/crash_reporting/PerformanceTracing$MarkerEnd;

    .line 26
    .line 27
    return-void
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/discord/crash_reporting/PerformanceTracing$MarkerEnd;
    .locals 1

    const-class v0, Lcom/discord/crash_reporting/PerformanceTracing$MarkerEnd;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/discord/crash_reporting/PerformanceTracing$MarkerEnd;

    return-object p0
.end method

.method public static values()[Lcom/discord/crash_reporting/PerformanceTracing$MarkerEnd;
    .locals 1

    sget-object v0, Lcom/discord/crash_reporting/PerformanceTracing$MarkerEnd;->$VALUES:[Lcom/discord/crash_reporting/PerformanceTracing$MarkerEnd;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/discord/crash_reporting/PerformanceTracing$MarkerEnd;

    return-object v0
.end method
