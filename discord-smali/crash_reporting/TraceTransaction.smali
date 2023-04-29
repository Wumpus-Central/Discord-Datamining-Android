.class public final enum Lcom/discord/crash_reporting/TraceTransaction;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/discord/crash_reporting/TraceTransaction;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\u0007j\u0002\u0008\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/discord/crash_reporting/TraceTransaction;",
        "",
        "transactionName",
        "",
        "operation",
        "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V",
        "getOperation",
        "()Ljava/lang/String;",
        "getTransactionName",
        "NativeModuleInit",
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
.field private static final synthetic $VALUES:[Lcom/discord/crash_reporting/TraceTransaction;

.field public static final enum NativeModuleInit:Lcom/discord/crash_reporting/TraceTransaction;


# instance fields
.field private final operation:Ljava/lang/String;

.field private final transactionName:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/discord/crash_reporting/TraceTransaction;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/discord/crash_reporting/TraceTransaction;

    const/4 v1, 0x0

    sget-object v2, Lcom/discord/crash_reporting/TraceTransaction;->NativeModuleInit:Lcom/discord/crash_reporting/TraceTransaction;

    aput-object v2, v0, v1

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/discord/crash_reporting/TraceTransaction;

    const-string v1, "Content Appeared"

    const-string v2, "ui"

    const-string v3, "NativeModuleInit"

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/discord/crash_reporting/TraceTransaction;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/discord/crash_reporting/TraceTransaction;->NativeModuleInit:Lcom/discord/crash_reporting/TraceTransaction;

    invoke-static {}, Lcom/discord/crash_reporting/TraceTransaction;->$values()[Lcom/discord/crash_reporting/TraceTransaction;

    move-result-object v0

    sput-object v0, Lcom/discord/crash_reporting/TraceTransaction;->$VALUES:[Lcom/discord/crash_reporting/TraceTransaction;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/discord/crash_reporting/TraceTransaction;->transactionName:Ljava/lang/String;

    iput-object p4, p0, Lcom/discord/crash_reporting/TraceTransaction;->operation:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/discord/crash_reporting/TraceTransaction;
    .locals 1

    const-class v0, Lcom/discord/crash_reporting/TraceTransaction;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/discord/crash_reporting/TraceTransaction;

    return-object p0
.end method

.method public static values()[Lcom/discord/crash_reporting/TraceTransaction;
    .locals 1

    sget-object v0, Lcom/discord/crash_reporting/TraceTransaction;->$VALUES:[Lcom/discord/crash_reporting/TraceTransaction;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/discord/crash_reporting/TraceTransaction;

    return-object v0
.end method


# virtual methods
.method public final getOperation()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/crash_reporting/TraceTransaction;->operation:Ljava/lang/String;

    return-object v0
.end method

.method public final getTransactionName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/crash_reporting/TraceTransaction;->transactionName:Ljava/lang/String;

    return-object v0
.end method
