.class public final enum Lcom/discord/chat/bridge/row/LoadingActionType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/chat/bridge/row/LoadingActionType$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/discord/chat/bridge/row/LoadingActionType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0005\u0008\u0087\u0001\u0018\u0000 \u00052\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/discord/chat/bridge/row/LoadingActionType;",
        "",
        "(Ljava/lang/String;I)V",
        "LOAD_MORE_BEFORE",
        "LOAD_MORE_AFTER",
        "Companion",
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

.annotation runtime Lyi/f;
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/discord/chat/bridge/row/LoadingActionType;

.field private static final $cachedSerializer$delegate:Lkotlin/Lazy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/Lazy<",
            "Lkotlinx/serialization/KSerializer<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/discord/chat/bridge/row/LoadingActionType$Companion;

.field public static final enum LOAD_MORE_AFTER:Lcom/discord/chat/bridge/row/LoadingActionType;

.field public static final enum LOAD_MORE_BEFORE:Lcom/discord/chat/bridge/row/LoadingActionType;


# direct methods
.method private static final synthetic $values()[Lcom/discord/chat/bridge/row/LoadingActionType;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lcom/discord/chat/bridge/row/LoadingActionType;

    const/4 v1, 0x0

    sget-object v2, Lcom/discord/chat/bridge/row/LoadingActionType;->LOAD_MORE_BEFORE:Lcom/discord/chat/bridge/row/LoadingActionType;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/discord/chat/bridge/row/LoadingActionType;->LOAD_MORE_AFTER:Lcom/discord/chat/bridge/row/LoadingActionType;

    aput-object v2, v0, v1

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/discord/chat/bridge/row/LoadingActionType;

    .line 2
    .line 3
    const-string v1, "LOAD_MORE_BEFORE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcom/discord/chat/bridge/row/LoadingActionType;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/discord/chat/bridge/row/LoadingActionType;->LOAD_MORE_BEFORE:Lcom/discord/chat/bridge/row/LoadingActionType;

    .line 10
    .line 11
    new-instance v0, Lcom/discord/chat/bridge/row/LoadingActionType;

    .line 12
    .line 13
    const-string v1, "LOAD_MORE_AFTER"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lcom/discord/chat/bridge/row/LoadingActionType;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/discord/chat/bridge/row/LoadingActionType;->LOAD_MORE_AFTER:Lcom/discord/chat/bridge/row/LoadingActionType;

    .line 20
    .line 21
    invoke-static {}, Lcom/discord/chat/bridge/row/LoadingActionType;->$values()[Lcom/discord/chat/bridge/row/LoadingActionType;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lcom/discord/chat/bridge/row/LoadingActionType;->$VALUES:[Lcom/discord/chat/bridge/row/LoadingActionType;

    .line 26
    .line 27
    new-instance v0, Lcom/discord/chat/bridge/row/LoadingActionType$Companion;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-direct {v0, v1}, Lcom/discord/chat/bridge/row/LoadingActionType$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 31
    .line 32
    .line 33
    sput-object v0, Lcom/discord/chat/bridge/row/LoadingActionType;->Companion:Lcom/discord/chat/bridge/row/LoadingActionType$Companion;

    .line 34
    .line 35
    sget-object v0, Lnf/p;->l:Lnf/p;

    .line 36
    .line 37
    sget-object v1, Lcom/discord/chat/bridge/row/LoadingActionType$Companion$$cachedSerializer$delegate$1;->INSTANCE:Lcom/discord/chat/bridge/row/LoadingActionType$Companion$$cachedSerializer$delegate$1;

    .line 38
    .line 39
    invoke-static {v0, v1}, Lnf/m;->b(Lnf/p;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    sput-object v0, Lcom/discord/chat/bridge/row/LoadingActionType;->$cachedSerializer$delegate:Lkotlin/Lazy;

    .line 44
    .line 45
    return-void
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

.method public static final synthetic access$get$cachedSerializer$delegate$cp()Lkotlin/Lazy;
    .locals 1

    sget-object v0, Lcom/discord/chat/bridge/row/LoadingActionType;->$cachedSerializer$delegate:Lkotlin/Lazy;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/discord/chat/bridge/row/LoadingActionType;
    .locals 1

    const-class v0, Lcom/discord/chat/bridge/row/LoadingActionType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/discord/chat/bridge/row/LoadingActionType;

    return-object p0
.end method

.method public static values()[Lcom/discord/chat/bridge/row/LoadingActionType;
    .locals 1

    sget-object v0, Lcom/discord/chat/bridge/row/LoadingActionType;->$VALUES:[Lcom/discord/chat/bridge/row/LoadingActionType;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/discord/chat/bridge/row/LoadingActionType;

    return-object v0
.end method
