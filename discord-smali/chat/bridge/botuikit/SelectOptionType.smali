.class public final enum Lcom/discord/chat/bridge/botuikit/SelectOptionType;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/discord/serialization/IntEnum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/discord/chat/bridge/botuikit/SelectOptionType;",
        ">;",
        "Lcom/discord/serialization/IntEnum;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\t\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/discord/chat/bridge/botuikit/SelectOptionType;",
        "",
        "Lcom/discord/serialization/IntEnum;",
        "serialNumber",
        "",
        "(Ljava/lang/String;II)V",
        "getSerialNumber",
        "()I",
        "UNKNOWN",
        "STRING",
        "USER",
        "ROLE",
        "CHANNEL",
        "chat_release"
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
.field private static final synthetic $VALUES:[Lcom/discord/chat/bridge/botuikit/SelectOptionType;

.field public static final enum CHANNEL:Lcom/discord/chat/bridge/botuikit/SelectOptionType;

.field public static final enum ROLE:Lcom/discord/chat/bridge/botuikit/SelectOptionType;

.field public static final enum STRING:Lcom/discord/chat/bridge/botuikit/SelectOptionType;

.field public static final enum UNKNOWN:Lcom/discord/chat/bridge/botuikit/SelectOptionType;

.field public static final enum USER:Lcom/discord/chat/bridge/botuikit/SelectOptionType;


# instance fields
.field private final serialNumber:I


# direct methods
.method private static final synthetic $values()[Lcom/discord/chat/bridge/botuikit/SelectOptionType;
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Lcom/discord/chat/bridge/botuikit/SelectOptionType;

    const/4 v1, 0x0

    sget-object v2, Lcom/discord/chat/bridge/botuikit/SelectOptionType;->UNKNOWN:Lcom/discord/chat/bridge/botuikit/SelectOptionType;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/discord/chat/bridge/botuikit/SelectOptionType;->STRING:Lcom/discord/chat/bridge/botuikit/SelectOptionType;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/discord/chat/bridge/botuikit/SelectOptionType;->USER:Lcom/discord/chat/bridge/botuikit/SelectOptionType;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lcom/discord/chat/bridge/botuikit/SelectOptionType;->ROLE:Lcom/discord/chat/bridge/botuikit/SelectOptionType;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lcom/discord/chat/bridge/botuikit/SelectOptionType;->CHANNEL:Lcom/discord/chat/bridge/botuikit/SelectOptionType;

    aput-object v2, v0, v1

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/discord/chat/bridge/botuikit/SelectOptionType;

    .line 2
    .line 3
    const-string v1, "UNKNOWN"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, Lcom/discord/chat/bridge/botuikit/SelectOptionType;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/discord/chat/bridge/botuikit/SelectOptionType;->UNKNOWN:Lcom/discord/chat/bridge/botuikit/SelectOptionType;

    .line 10
    .line 11
    new-instance v0, Lcom/discord/chat/bridge/botuikit/SelectOptionType;

    .line 12
    .line 13
    const-string v1, "STRING"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2, v2}, Lcom/discord/chat/bridge/botuikit/SelectOptionType;-><init>(Ljava/lang/String;II)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/discord/chat/bridge/botuikit/SelectOptionType;->STRING:Lcom/discord/chat/bridge/botuikit/SelectOptionType;

    .line 20
    .line 21
    new-instance v0, Lcom/discord/chat/bridge/botuikit/SelectOptionType;

    .line 22
    .line 23
    const-string v1, "USER"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2, v2}, Lcom/discord/chat/bridge/botuikit/SelectOptionType;-><init>(Ljava/lang/String;II)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lcom/discord/chat/bridge/botuikit/SelectOptionType;->USER:Lcom/discord/chat/bridge/botuikit/SelectOptionType;

    .line 30
    .line 31
    new-instance v0, Lcom/discord/chat/bridge/botuikit/SelectOptionType;

    .line 32
    .line 33
    const-string v1, "ROLE"

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, v1, v2, v2}, Lcom/discord/chat/bridge/botuikit/SelectOptionType;-><init>(Ljava/lang/String;II)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lcom/discord/chat/bridge/botuikit/SelectOptionType;->ROLE:Lcom/discord/chat/bridge/botuikit/SelectOptionType;

    .line 40
    .line 41
    new-instance v0, Lcom/discord/chat/bridge/botuikit/SelectOptionType;

    .line 42
    .line 43
    const-string v1, "CHANNEL"

    .line 44
    .line 45
    const/4 v2, 0x4

    .line 46
    invoke-direct {v0, v1, v2, v2}, Lcom/discord/chat/bridge/botuikit/SelectOptionType;-><init>(Ljava/lang/String;II)V

    .line 47
    .line 48
    .line 49
    sput-object v0, Lcom/discord/chat/bridge/botuikit/SelectOptionType;->CHANNEL:Lcom/discord/chat/bridge/botuikit/SelectOptionType;

    .line 50
    .line 51
    invoke-static {}, Lcom/discord/chat/bridge/botuikit/SelectOptionType;->$values()[Lcom/discord/chat/bridge/botuikit/SelectOptionType;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sput-object v0, Lcom/discord/chat/bridge/botuikit/SelectOptionType;->$VALUES:[Lcom/discord/chat/bridge/botuikit/SelectOptionType;

    .line 56
    .line 57
    return-void
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

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/discord/chat/bridge/botuikit/SelectOptionType;->serialNumber:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/discord/chat/bridge/botuikit/SelectOptionType;
    .locals 1

    const-class v0, Lcom/discord/chat/bridge/botuikit/SelectOptionType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/discord/chat/bridge/botuikit/SelectOptionType;

    return-object p0
.end method

.method public static values()[Lcom/discord/chat/bridge/botuikit/SelectOptionType;
    .locals 1

    sget-object v0, Lcom/discord/chat/bridge/botuikit/SelectOptionType;->$VALUES:[Lcom/discord/chat/bridge/botuikit/SelectOptionType;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/discord/chat/bridge/botuikit/SelectOptionType;

    return-object v0
.end method


# virtual methods
.method public getSerialNumber()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/bridge/botuikit/SelectOptionType;->serialNumber:I

    return v0
.end method
