.class public final enum Lcom/discord/chat/bridge/MessageType;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/discord/serialization/IntEnum;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/chat/bridge/MessageType$Companion;,
        Lcom/discord/chat/bridge/MessageType$Serializer;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/discord/chat/bridge/MessageType;",
        ">;",
        "Lcom/discord/serialization/IntEnum;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u00080\u0008\u0087\u0001\u0018\u0000 52\u0008\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u000256B\u000f\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005R\u001b\u0010\u0006\u001a\u00020\u00078FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u0006\u0010\u0008R\u001b\u0010\u000b\u001a\u00020\u00078FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\n\u001a\u0004\u0008\u000b\u0010\u0008R\u001b\u0010\r\u001a\u00020\u00078FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\n\u001a\u0004\u0008\r\u0010\u0008R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017j\u0002\u0008\u0018j\u0002\u0008\u0019j\u0002\u0008\u001aj\u0002\u0008\u001bj\u0002\u0008\u001cj\u0002\u0008\u001dj\u0002\u0008\u001ej\u0002\u0008\u001fj\u0002\u0008 j\u0002\u0008!j\u0002\u0008\"j\u0002\u0008#j\u0002\u0008$j\u0002\u0008%j\u0002\u0008&j\u0002\u0008\'j\u0002\u0008(j\u0002\u0008)j\u0002\u0008*j\u0002\u0008+j\u0002\u0008,j\u0002\u0008-j\u0002\u0008.j\u0002\u0008/j\u0002\u00080j\u0002\u00081j\u0002\u00082j\u0002\u00083j\u0002\u00084\u00a8\u00067"
    }
    d2 = {
        "Lcom/discord/chat/bridge/MessageType;",
        "",
        "Lcom/discord/serialization/IntEnum;",
        "serialNumber",
        "",
        "(Ljava/lang/String;II)V",
        "isAutomodSystem",
        "",
        "()Z",
        "isAutomodSystem$delegate",
        "Lkotlin/Lazy;",
        "isCall",
        "isCall$delegate",
        "isSystem",
        "isSystem$delegate",
        "getSerialNumber",
        "()I",
        "DEFAULT",
        "RECIPIENT_ADD",
        "RECIPIENT_REMOVE",
        "CALL",
        "CHANNEL_NAME_CHANGE",
        "CHANNEL_ICON_CHANGE",
        "CHANNEL_PINNED_MESSAGE",
        "USER_JOIN",
        "USER_PREMIUM_GUILD_SUBSCRIPTION",
        "USER_PREMIUM_GUILD_SUBSCRIPTION_TIER_1",
        "USER_PREMIUM_GUILD_SUBSCRIPTION_TIER_2",
        "USER_PREMIUM_GUILD_SUBSCRIPTION_TIER_3",
        "CHANNEL_FOLLOW_ADD",
        "GUILD_STREAM",
        "GUILD_DISCOVERY_DISQUALIFIED",
        "GUILD_DISCOVERY_REQUALIFIED",
        "GUILD_DISCOVERY_GRACE_PERIOD_INITIAL_WARNING",
        "GUILD_DISCOVERY_GRACE_PERIOD_FINAL_WARNING",
        "THREAD_CREATED",
        "REPLY",
        "CHAT_INPUT_COMMAND",
        "THREAD_STARTER_MESSAGE",
        "GUILD_INVITE_REMINDER",
        "CONTEXT_MENU_COMMAND",
        "AUTO_MODERATION_ACTION",
        "ROLE_SUBSCRIPTION_PURCHASE",
        "INTERACTION_PREMIUM_UPSELL",
        "STAGE_START",
        "STAGE_END",
        "STAGE_SPEAKER",
        "STAGE_RAISE_HAND",
        "STAGE_TOPIC",
        "GUILD_APPLICATION_PREMIUM_SUBSCRIPTION",
        "PRIVATE_CHANNEL_INTEGRATION_ADDED",
        "PRIVATE_CHANNEL_INTEGRATION_REMOVED",
        "PREMIUM_REFERRAL",
        "Companion",
        "Serializer",
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

.annotation runtime Lwi/f;
    with = Lcom/discord/chat/bridge/MessageType$Serializer;
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/discord/chat/bridge/MessageType;

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

.field public static final enum AUTO_MODERATION_ACTION:Lcom/discord/chat/bridge/MessageType;

.field public static final enum CALL:Lcom/discord/chat/bridge/MessageType;

.field public static final enum CHANNEL_FOLLOW_ADD:Lcom/discord/chat/bridge/MessageType;

.field public static final enum CHANNEL_ICON_CHANGE:Lcom/discord/chat/bridge/MessageType;

.field public static final enum CHANNEL_NAME_CHANGE:Lcom/discord/chat/bridge/MessageType;

.field public static final enum CHANNEL_PINNED_MESSAGE:Lcom/discord/chat/bridge/MessageType;

.field public static final enum CHAT_INPUT_COMMAND:Lcom/discord/chat/bridge/MessageType;

.field public static final enum CONTEXT_MENU_COMMAND:Lcom/discord/chat/bridge/MessageType;

.field private static final CallTypes:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/discord/chat/bridge/MessageType;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/discord/chat/bridge/MessageType$Companion;

.field public static final enum DEFAULT:Lcom/discord/chat/bridge/MessageType;

.field public static final enum GUILD_APPLICATION_PREMIUM_SUBSCRIPTION:Lcom/discord/chat/bridge/MessageType;

.field public static final enum GUILD_DISCOVERY_DISQUALIFIED:Lcom/discord/chat/bridge/MessageType;

.field public static final enum GUILD_DISCOVERY_GRACE_PERIOD_FINAL_WARNING:Lcom/discord/chat/bridge/MessageType;

.field public static final enum GUILD_DISCOVERY_GRACE_PERIOD_INITIAL_WARNING:Lcom/discord/chat/bridge/MessageType;

.field public static final enum GUILD_DISCOVERY_REQUALIFIED:Lcom/discord/chat/bridge/MessageType;

.field public static final enum GUILD_INVITE_REMINDER:Lcom/discord/chat/bridge/MessageType;

.field public static final enum GUILD_STREAM:Lcom/discord/chat/bridge/MessageType;

.field public static final enum INTERACTION_PREMIUM_UPSELL:Lcom/discord/chat/bridge/MessageType;

.field public static final enum PREMIUM_REFERRAL:Lcom/discord/chat/bridge/MessageType;

.field public static final enum PRIVATE_CHANNEL_INTEGRATION_ADDED:Lcom/discord/chat/bridge/MessageType;

.field public static final enum PRIVATE_CHANNEL_INTEGRATION_REMOVED:Lcom/discord/chat/bridge/MessageType;

.field public static final enum RECIPIENT_ADD:Lcom/discord/chat/bridge/MessageType;

.field public static final enum RECIPIENT_REMOVE:Lcom/discord/chat/bridge/MessageType;

.field public static final enum REPLY:Lcom/discord/chat/bridge/MessageType;

.field public static final enum ROLE_SUBSCRIPTION_PURCHASE:Lcom/discord/chat/bridge/MessageType;

.field public static final enum STAGE_END:Lcom/discord/chat/bridge/MessageType;

.field public static final enum STAGE_RAISE_HAND:Lcom/discord/chat/bridge/MessageType;

.field public static final enum STAGE_SPEAKER:Lcom/discord/chat/bridge/MessageType;

.field public static final enum STAGE_START:Lcom/discord/chat/bridge/MessageType;

.field public static final enum STAGE_TOPIC:Lcom/discord/chat/bridge/MessageType;

.field private static final SystemTypes:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/discord/chat/bridge/MessageType;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum THREAD_CREATED:Lcom/discord/chat/bridge/MessageType;

.field public static final enum THREAD_STARTER_MESSAGE:Lcom/discord/chat/bridge/MessageType;

.field public static final enum USER_JOIN:Lcom/discord/chat/bridge/MessageType;

.field public static final enum USER_PREMIUM_GUILD_SUBSCRIPTION:Lcom/discord/chat/bridge/MessageType;

.field public static final enum USER_PREMIUM_GUILD_SUBSCRIPTION_TIER_1:Lcom/discord/chat/bridge/MessageType;

.field public static final enum USER_PREMIUM_GUILD_SUBSCRIPTION_TIER_2:Lcom/discord/chat/bridge/MessageType;

.field public static final enum USER_PREMIUM_GUILD_SUBSCRIPTION_TIER_3:Lcom/discord/chat/bridge/MessageType;


# instance fields
.field private final isAutomodSystem$delegate:Lkotlin/Lazy;

.field private final isCall$delegate:Lkotlin/Lazy;

.field private final isSystem$delegate:Lkotlin/Lazy;

.field private final serialNumber:I


# direct methods
.method private static final synthetic $values()[Lcom/discord/chat/bridge/MessageType;
    .locals 3

    const/16 v0, 0x24

    new-array v0, v0, [Lcom/discord/chat/bridge/MessageType;

    const/4 v1, 0x0

    sget-object v2, Lcom/discord/chat/bridge/MessageType;->DEFAULT:Lcom/discord/chat/bridge/MessageType;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/discord/chat/bridge/MessageType;->RECIPIENT_ADD:Lcom/discord/chat/bridge/MessageType;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/discord/chat/bridge/MessageType;->RECIPIENT_REMOVE:Lcom/discord/chat/bridge/MessageType;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lcom/discord/chat/bridge/MessageType;->CALL:Lcom/discord/chat/bridge/MessageType;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lcom/discord/chat/bridge/MessageType;->CHANNEL_NAME_CHANGE:Lcom/discord/chat/bridge/MessageType;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lcom/discord/chat/bridge/MessageType;->CHANNEL_ICON_CHANGE:Lcom/discord/chat/bridge/MessageType;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/discord/chat/bridge/MessageType;->CHANNEL_PINNED_MESSAGE:Lcom/discord/chat/bridge/MessageType;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/discord/chat/bridge/MessageType;->USER_JOIN:Lcom/discord/chat/bridge/MessageType;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lcom/discord/chat/bridge/MessageType;->USER_PREMIUM_GUILD_SUBSCRIPTION:Lcom/discord/chat/bridge/MessageType;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lcom/discord/chat/bridge/MessageType;->USER_PREMIUM_GUILD_SUBSCRIPTION_TIER_1:Lcom/discord/chat/bridge/MessageType;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lcom/discord/chat/bridge/MessageType;->USER_PREMIUM_GUILD_SUBSCRIPTION_TIER_2:Lcom/discord/chat/bridge/MessageType;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, Lcom/discord/chat/bridge/MessageType;->USER_PREMIUM_GUILD_SUBSCRIPTION_TIER_3:Lcom/discord/chat/bridge/MessageType;

    aput-object v2, v0, v1

    const/16 v1, 0xc

    sget-object v2, Lcom/discord/chat/bridge/MessageType;->CHANNEL_FOLLOW_ADD:Lcom/discord/chat/bridge/MessageType;

    aput-object v2, v0, v1

    const/16 v1, 0xd

    sget-object v2, Lcom/discord/chat/bridge/MessageType;->GUILD_STREAM:Lcom/discord/chat/bridge/MessageType;

    aput-object v2, v0, v1

    const/16 v1, 0xe

    sget-object v2, Lcom/discord/chat/bridge/MessageType;->GUILD_DISCOVERY_DISQUALIFIED:Lcom/discord/chat/bridge/MessageType;

    aput-object v2, v0, v1

    const/16 v1, 0xf

    sget-object v2, Lcom/discord/chat/bridge/MessageType;->GUILD_DISCOVERY_REQUALIFIED:Lcom/discord/chat/bridge/MessageType;

    aput-object v2, v0, v1

    const/16 v1, 0x10

    sget-object v2, Lcom/discord/chat/bridge/MessageType;->GUILD_DISCOVERY_GRACE_PERIOD_INITIAL_WARNING:Lcom/discord/chat/bridge/MessageType;

    aput-object v2, v0, v1

    const/16 v1, 0x11

    sget-object v2, Lcom/discord/chat/bridge/MessageType;->GUILD_DISCOVERY_GRACE_PERIOD_FINAL_WARNING:Lcom/discord/chat/bridge/MessageType;

    aput-object v2, v0, v1

    const/16 v1, 0x12

    sget-object v2, Lcom/discord/chat/bridge/MessageType;->THREAD_CREATED:Lcom/discord/chat/bridge/MessageType;

    aput-object v2, v0, v1

    const/16 v1, 0x13

    sget-object v2, Lcom/discord/chat/bridge/MessageType;->REPLY:Lcom/discord/chat/bridge/MessageType;

    aput-object v2, v0, v1

    const/16 v1, 0x14

    sget-object v2, Lcom/discord/chat/bridge/MessageType;->CHAT_INPUT_COMMAND:Lcom/discord/chat/bridge/MessageType;

    aput-object v2, v0, v1

    const/16 v1, 0x15

    sget-object v2, Lcom/discord/chat/bridge/MessageType;->THREAD_STARTER_MESSAGE:Lcom/discord/chat/bridge/MessageType;

    aput-object v2, v0, v1

    const/16 v1, 0x16

    sget-object v2, Lcom/discord/chat/bridge/MessageType;->GUILD_INVITE_REMINDER:Lcom/discord/chat/bridge/MessageType;

    aput-object v2, v0, v1

    const/16 v1, 0x17

    sget-object v2, Lcom/discord/chat/bridge/MessageType;->CONTEXT_MENU_COMMAND:Lcom/discord/chat/bridge/MessageType;

    aput-object v2, v0, v1

    const/16 v1, 0x18

    sget-object v2, Lcom/discord/chat/bridge/MessageType;->AUTO_MODERATION_ACTION:Lcom/discord/chat/bridge/MessageType;

    aput-object v2, v0, v1

    const/16 v1, 0x19

    sget-object v2, Lcom/discord/chat/bridge/MessageType;->ROLE_SUBSCRIPTION_PURCHASE:Lcom/discord/chat/bridge/MessageType;

    aput-object v2, v0, v1

    const/16 v1, 0x1a

    sget-object v2, Lcom/discord/chat/bridge/MessageType;->INTERACTION_PREMIUM_UPSELL:Lcom/discord/chat/bridge/MessageType;

    aput-object v2, v0, v1

    const/16 v1, 0x1b

    sget-object v2, Lcom/discord/chat/bridge/MessageType;->STAGE_START:Lcom/discord/chat/bridge/MessageType;

    aput-object v2, v0, v1

    const/16 v1, 0x1c

    sget-object v2, Lcom/discord/chat/bridge/MessageType;->STAGE_END:Lcom/discord/chat/bridge/MessageType;

    aput-object v2, v0, v1

    const/16 v1, 0x1d

    sget-object v2, Lcom/discord/chat/bridge/MessageType;->STAGE_SPEAKER:Lcom/discord/chat/bridge/MessageType;

    aput-object v2, v0, v1

    const/16 v1, 0x1e

    sget-object v2, Lcom/discord/chat/bridge/MessageType;->STAGE_RAISE_HAND:Lcom/discord/chat/bridge/MessageType;

    aput-object v2, v0, v1

    const/16 v1, 0x1f

    sget-object v2, Lcom/discord/chat/bridge/MessageType;->STAGE_TOPIC:Lcom/discord/chat/bridge/MessageType;

    aput-object v2, v0, v1

    const/16 v1, 0x20

    sget-object v2, Lcom/discord/chat/bridge/MessageType;->GUILD_APPLICATION_PREMIUM_SUBSCRIPTION:Lcom/discord/chat/bridge/MessageType;

    aput-object v2, v0, v1

    const/16 v1, 0x21

    sget-object v2, Lcom/discord/chat/bridge/MessageType;->PRIVATE_CHANNEL_INTEGRATION_ADDED:Lcom/discord/chat/bridge/MessageType;

    aput-object v2, v0, v1

    const/16 v1, 0x22

    sget-object v2, Lcom/discord/chat/bridge/MessageType;->PRIVATE_CHANNEL_INTEGRATION_REMOVED:Lcom/discord/chat/bridge/MessageType;

    aput-object v2, v0, v1

    const/16 v1, 0x23

    sget-object v2, Lcom/discord/chat/bridge/MessageType;->PREMIUM_REFERRAL:Lcom/discord/chat/bridge/MessageType;

    aput-object v2, v0, v1

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 31

    .line 1
    new-instance v0, Lcom/discord/chat/bridge/MessageType;

    .line 2
    .line 3
    const-string v1, "DEFAULT"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, Lcom/discord/chat/bridge/MessageType;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/discord/chat/bridge/MessageType;->DEFAULT:Lcom/discord/chat/bridge/MessageType;

    .line 10
    .line 11
    new-instance v0, Lcom/discord/chat/bridge/MessageType;

    .line 12
    .line 13
    const-string v1, "RECIPIENT_ADD"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v0, v1, v3, v3}, Lcom/discord/chat/bridge/MessageType;-><init>(Ljava/lang/String;II)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/discord/chat/bridge/MessageType;->RECIPIENT_ADD:Lcom/discord/chat/bridge/MessageType;

    .line 20
    .line 21
    new-instance v1, Lcom/discord/chat/bridge/MessageType;

    .line 22
    .line 23
    const-string v4, "RECIPIENT_REMOVE"

    .line 24
    .line 25
    const/4 v5, 0x2

    .line 26
    invoke-direct {v1, v4, v5, v5}, Lcom/discord/chat/bridge/MessageType;-><init>(Ljava/lang/String;II)V

    .line 27
    .line 28
    .line 29
    sput-object v1, Lcom/discord/chat/bridge/MessageType;->RECIPIENT_REMOVE:Lcom/discord/chat/bridge/MessageType;

    .line 30
    .line 31
    new-instance v4, Lcom/discord/chat/bridge/MessageType;

    .line 32
    .line 33
    const-string v6, "CALL"

    .line 34
    .line 35
    const/4 v7, 0x3

    .line 36
    invoke-direct {v4, v6, v7, v7}, Lcom/discord/chat/bridge/MessageType;-><init>(Ljava/lang/String;II)V

    .line 37
    .line 38
    .line 39
    sput-object v4, Lcom/discord/chat/bridge/MessageType;->CALL:Lcom/discord/chat/bridge/MessageType;

    .line 40
    .line 41
    new-instance v6, Lcom/discord/chat/bridge/MessageType;

    .line 42
    .line 43
    const-string v8, "CHANNEL_NAME_CHANGE"

    .line 44
    .line 45
    const/4 v9, 0x4

    .line 46
    invoke-direct {v6, v8, v9, v9}, Lcom/discord/chat/bridge/MessageType;-><init>(Ljava/lang/String;II)V

    .line 47
    .line 48
    .line 49
    sput-object v6, Lcom/discord/chat/bridge/MessageType;->CHANNEL_NAME_CHANGE:Lcom/discord/chat/bridge/MessageType;

    .line 50
    .line 51
    new-instance v8, Lcom/discord/chat/bridge/MessageType;

    .line 52
    .line 53
    const-string v10, "CHANNEL_ICON_CHANGE"

    .line 54
    .line 55
    const/4 v11, 0x5

    .line 56
    invoke-direct {v8, v10, v11, v11}, Lcom/discord/chat/bridge/MessageType;-><init>(Ljava/lang/String;II)V

    .line 57
    .line 58
    .line 59
    sput-object v8, Lcom/discord/chat/bridge/MessageType;->CHANNEL_ICON_CHANGE:Lcom/discord/chat/bridge/MessageType;

    .line 60
    .line 61
    new-instance v10, Lcom/discord/chat/bridge/MessageType;

    .line 62
    .line 63
    const-string v12, "CHANNEL_PINNED_MESSAGE"

    .line 64
    .line 65
    const/4 v13, 0x6

    .line 66
    invoke-direct {v10, v12, v13, v13}, Lcom/discord/chat/bridge/MessageType;-><init>(Ljava/lang/String;II)V

    .line 67
    .line 68
    .line 69
    sput-object v10, Lcom/discord/chat/bridge/MessageType;->CHANNEL_PINNED_MESSAGE:Lcom/discord/chat/bridge/MessageType;

    .line 70
    .line 71
    new-instance v12, Lcom/discord/chat/bridge/MessageType;

    .line 72
    .line 73
    const-string v14, "USER_JOIN"

    .line 74
    .line 75
    const/4 v15, 0x7

    .line 76
    invoke-direct {v12, v14, v15, v15}, Lcom/discord/chat/bridge/MessageType;-><init>(Ljava/lang/String;II)V

    .line 77
    .line 78
    .line 79
    sput-object v12, Lcom/discord/chat/bridge/MessageType;->USER_JOIN:Lcom/discord/chat/bridge/MessageType;

    .line 80
    .line 81
    new-instance v14, Lcom/discord/chat/bridge/MessageType;

    .line 82
    .line 83
    const-string v15, "USER_PREMIUM_GUILD_SUBSCRIPTION"

    .line 84
    .line 85
    const/16 v13, 0x8

    .line 86
    .line 87
    invoke-direct {v14, v15, v13, v13}, Lcom/discord/chat/bridge/MessageType;-><init>(Ljava/lang/String;II)V

    .line 88
    .line 89
    .line 90
    sput-object v14, Lcom/discord/chat/bridge/MessageType;->USER_PREMIUM_GUILD_SUBSCRIPTION:Lcom/discord/chat/bridge/MessageType;

    .line 91
    .line 92
    new-instance v15, Lcom/discord/chat/bridge/MessageType;

    .line 93
    .line 94
    const-string v13, "USER_PREMIUM_GUILD_SUBSCRIPTION_TIER_1"

    .line 95
    .line 96
    const/16 v11, 0x9

    .line 97
    .line 98
    invoke-direct {v15, v13, v11, v11}, Lcom/discord/chat/bridge/MessageType;-><init>(Ljava/lang/String;II)V

    .line 99
    .line 100
    .line 101
    sput-object v15, Lcom/discord/chat/bridge/MessageType;->USER_PREMIUM_GUILD_SUBSCRIPTION_TIER_1:Lcom/discord/chat/bridge/MessageType;

    .line 102
    .line 103
    new-instance v13, Lcom/discord/chat/bridge/MessageType;

    .line 104
    .line 105
    const-string v11, "USER_PREMIUM_GUILD_SUBSCRIPTION_TIER_2"

    .line 106
    .line 107
    const/16 v9, 0xa

    .line 108
    .line 109
    invoke-direct {v13, v11, v9, v9}, Lcom/discord/chat/bridge/MessageType;-><init>(Ljava/lang/String;II)V

    .line 110
    .line 111
    .line 112
    sput-object v13, Lcom/discord/chat/bridge/MessageType;->USER_PREMIUM_GUILD_SUBSCRIPTION_TIER_2:Lcom/discord/chat/bridge/MessageType;

    .line 113
    .line 114
    new-instance v11, Lcom/discord/chat/bridge/MessageType;

    .line 115
    .line 116
    const-string v9, "USER_PREMIUM_GUILD_SUBSCRIPTION_TIER_3"

    .line 117
    .line 118
    const/16 v7, 0xb

    .line 119
    .line 120
    invoke-direct {v11, v9, v7, v7}, Lcom/discord/chat/bridge/MessageType;-><init>(Ljava/lang/String;II)V

    .line 121
    .line 122
    .line 123
    sput-object v11, Lcom/discord/chat/bridge/MessageType;->USER_PREMIUM_GUILD_SUBSCRIPTION_TIER_3:Lcom/discord/chat/bridge/MessageType;

    .line 124
    .line 125
    new-instance v9, Lcom/discord/chat/bridge/MessageType;

    .line 126
    .line 127
    const-string v7, "CHANNEL_FOLLOW_ADD"

    .line 128
    .line 129
    const/16 v5, 0xc

    .line 130
    .line 131
    invoke-direct {v9, v7, v5, v5}, Lcom/discord/chat/bridge/MessageType;-><init>(Ljava/lang/String;II)V

    .line 132
    .line 133
    .line 134
    sput-object v9, Lcom/discord/chat/bridge/MessageType;->CHANNEL_FOLLOW_ADD:Lcom/discord/chat/bridge/MessageType;

    .line 135
    .line 136
    new-instance v7, Lcom/discord/chat/bridge/MessageType;

    .line 137
    .line 138
    const-string v5, "GUILD_STREAM"

    .line 139
    .line 140
    const/16 v3, 0xd

    .line 141
    .line 142
    invoke-direct {v7, v5, v3, v3}, Lcom/discord/chat/bridge/MessageType;-><init>(Ljava/lang/String;II)V

    .line 143
    .line 144
    .line 145
    sput-object v7, Lcom/discord/chat/bridge/MessageType;->GUILD_STREAM:Lcom/discord/chat/bridge/MessageType;

    .line 146
    .line 147
    new-instance v5, Lcom/discord/chat/bridge/MessageType;

    .line 148
    .line 149
    const-string v3, "GUILD_DISCOVERY_DISQUALIFIED"

    .line 150
    .line 151
    const/16 v2, 0xe

    .line 152
    .line 153
    invoke-direct {v5, v3, v2, v2}, Lcom/discord/chat/bridge/MessageType;-><init>(Ljava/lang/String;II)V

    .line 154
    .line 155
    .line 156
    sput-object v5, Lcom/discord/chat/bridge/MessageType;->GUILD_DISCOVERY_DISQUALIFIED:Lcom/discord/chat/bridge/MessageType;

    .line 157
    .line 158
    new-instance v3, Lcom/discord/chat/bridge/MessageType;

    .line 159
    .line 160
    const-string v2, "GUILD_DISCOVERY_REQUALIFIED"

    .line 161
    .line 162
    move-object/from16 v16, v0

    .line 163
    .line 164
    const/16 v0, 0xf

    .line 165
    .line 166
    invoke-direct {v3, v2, v0, v0}, Lcom/discord/chat/bridge/MessageType;-><init>(Ljava/lang/String;II)V

    .line 167
    .line 168
    .line 169
    sput-object v3, Lcom/discord/chat/bridge/MessageType;->GUILD_DISCOVERY_REQUALIFIED:Lcom/discord/chat/bridge/MessageType;

    .line 170
    .line 171
    new-instance v2, Lcom/discord/chat/bridge/MessageType;

    .line 172
    .line 173
    const-string v0, "GUILD_DISCOVERY_GRACE_PERIOD_INITIAL_WARNING"

    .line 174
    .line 175
    move-object/from16 v17, v3

    .line 176
    .line 177
    const/16 v3, 0x10

    .line 178
    .line 179
    invoke-direct {v2, v0, v3, v3}, Lcom/discord/chat/bridge/MessageType;-><init>(Ljava/lang/String;II)V

    .line 180
    .line 181
    .line 182
    sput-object v2, Lcom/discord/chat/bridge/MessageType;->GUILD_DISCOVERY_GRACE_PERIOD_INITIAL_WARNING:Lcom/discord/chat/bridge/MessageType;

    .line 183
    .line 184
    new-instance v0, Lcom/discord/chat/bridge/MessageType;

    .line 185
    .line 186
    const-string v3, "GUILD_DISCOVERY_GRACE_PERIOD_FINAL_WARNING"

    .line 187
    .line 188
    move-object/from16 v18, v2

    .line 189
    .line 190
    const/16 v2, 0x11

    .line 191
    .line 192
    invoke-direct {v0, v3, v2, v2}, Lcom/discord/chat/bridge/MessageType;-><init>(Ljava/lang/String;II)V

    .line 193
    .line 194
    .line 195
    sput-object v0, Lcom/discord/chat/bridge/MessageType;->GUILD_DISCOVERY_GRACE_PERIOD_FINAL_WARNING:Lcom/discord/chat/bridge/MessageType;

    .line 196
    .line 197
    new-instance v3, Lcom/discord/chat/bridge/MessageType;

    .line 198
    .line 199
    const-string v2, "THREAD_CREATED"

    .line 200
    .line 201
    move-object/from16 v19, v0

    .line 202
    .line 203
    const/16 v0, 0x12

    .line 204
    .line 205
    invoke-direct {v3, v2, v0, v0}, Lcom/discord/chat/bridge/MessageType;-><init>(Ljava/lang/String;II)V

    .line 206
    .line 207
    .line 208
    sput-object v3, Lcom/discord/chat/bridge/MessageType;->THREAD_CREATED:Lcom/discord/chat/bridge/MessageType;

    .line 209
    .line 210
    new-instance v2, Lcom/discord/chat/bridge/MessageType;

    .line 211
    .line 212
    const-string v0, "REPLY"

    .line 213
    .line 214
    move-object/from16 v20, v3

    .line 215
    .line 216
    const/16 v3, 0x13

    .line 217
    .line 218
    invoke-direct {v2, v0, v3, v3}, Lcom/discord/chat/bridge/MessageType;-><init>(Ljava/lang/String;II)V

    .line 219
    .line 220
    .line 221
    sput-object v2, Lcom/discord/chat/bridge/MessageType;->REPLY:Lcom/discord/chat/bridge/MessageType;

    .line 222
    .line 223
    new-instance v0, Lcom/discord/chat/bridge/MessageType;

    .line 224
    .line 225
    const-string v2, "CHAT_INPUT_COMMAND"

    .line 226
    .line 227
    const/16 v3, 0x14

    .line 228
    .line 229
    invoke-direct {v0, v2, v3, v3}, Lcom/discord/chat/bridge/MessageType;-><init>(Ljava/lang/String;II)V

    .line 230
    .line 231
    .line 232
    sput-object v0, Lcom/discord/chat/bridge/MessageType;->CHAT_INPUT_COMMAND:Lcom/discord/chat/bridge/MessageType;

    .line 233
    .line 234
    new-instance v0, Lcom/discord/chat/bridge/MessageType;

    .line 235
    .line 236
    const-string v2, "THREAD_STARTER_MESSAGE"

    .line 237
    .line 238
    const/16 v3, 0x15

    .line 239
    .line 240
    invoke-direct {v0, v2, v3, v3}, Lcom/discord/chat/bridge/MessageType;-><init>(Ljava/lang/String;II)V

    .line 241
    .line 242
    .line 243
    sput-object v0, Lcom/discord/chat/bridge/MessageType;->THREAD_STARTER_MESSAGE:Lcom/discord/chat/bridge/MessageType;

    .line 244
    .line 245
    new-instance v2, Lcom/discord/chat/bridge/MessageType;

    .line 246
    .line 247
    const/16 v3, 0x16

    .line 248
    .line 249
    move-object/from16 v21, v0

    .line 250
    .line 251
    const/16 v0, 0x16

    .line 252
    .line 253
    move-object/from16 v22, v5

    .line 254
    .line 255
    const-string v5, "GUILD_INVITE_REMINDER"

    .line 256
    .line 257
    invoke-direct {v2, v5, v3, v0}, Lcom/discord/chat/bridge/MessageType;-><init>(Ljava/lang/String;II)V

    .line 258
    .line 259
    .line 260
    sput-object v2, Lcom/discord/chat/bridge/MessageType;->GUILD_INVITE_REMINDER:Lcom/discord/chat/bridge/MessageType;

    .line 261
    .line 262
    new-instance v0, Lcom/discord/chat/bridge/MessageType;

    .line 263
    .line 264
    const/16 v3, 0x17

    .line 265
    .line 266
    const/16 v5, 0x17

    .line 267
    .line 268
    move-object/from16 v23, v2

    .line 269
    .line 270
    const-string v2, "CONTEXT_MENU_COMMAND"

    .line 271
    .line 272
    invoke-direct {v0, v2, v3, v5}, Lcom/discord/chat/bridge/MessageType;-><init>(Ljava/lang/String;II)V

    .line 273
    .line 274
    .line 275
    sput-object v0, Lcom/discord/chat/bridge/MessageType;->CONTEXT_MENU_COMMAND:Lcom/discord/chat/bridge/MessageType;

    .line 276
    .line 277
    new-instance v0, Lcom/discord/chat/bridge/MessageType;

    .line 278
    .line 279
    const/16 v2, 0x18

    .line 280
    .line 281
    const/16 v3, 0x18

    .line 282
    .line 283
    const-string v5, "AUTO_MODERATION_ACTION"

    .line 284
    .line 285
    invoke-direct {v0, v5, v2, v3}, Lcom/discord/chat/bridge/MessageType;-><init>(Ljava/lang/String;II)V

    .line 286
    .line 287
    .line 288
    sput-object v0, Lcom/discord/chat/bridge/MessageType;->AUTO_MODERATION_ACTION:Lcom/discord/chat/bridge/MessageType;

    .line 289
    .line 290
    new-instance v0, Lcom/discord/chat/bridge/MessageType;

    .line 291
    .line 292
    const/16 v2, 0x19

    .line 293
    .line 294
    const/16 v3, 0x19

    .line 295
    .line 296
    const-string v5, "ROLE_SUBSCRIPTION_PURCHASE"

    .line 297
    .line 298
    invoke-direct {v0, v5, v2, v3}, Lcom/discord/chat/bridge/MessageType;-><init>(Ljava/lang/String;II)V

    .line 299
    .line 300
    .line 301
    sput-object v0, Lcom/discord/chat/bridge/MessageType;->ROLE_SUBSCRIPTION_PURCHASE:Lcom/discord/chat/bridge/MessageType;

    .line 302
    .line 303
    new-instance v2, Lcom/discord/chat/bridge/MessageType;

    .line 304
    .line 305
    const/16 v3, 0x1a

    .line 306
    .line 307
    const/16 v5, 0x1a

    .line 308
    .line 309
    move-object/from16 v24, v0

    .line 310
    .line 311
    const-string v0, "INTERACTION_PREMIUM_UPSELL"

    .line 312
    .line 313
    invoke-direct {v2, v0, v3, v5}, Lcom/discord/chat/bridge/MessageType;-><init>(Ljava/lang/String;II)V

    .line 314
    .line 315
    .line 316
    sput-object v2, Lcom/discord/chat/bridge/MessageType;->INTERACTION_PREMIUM_UPSELL:Lcom/discord/chat/bridge/MessageType;

    .line 317
    .line 318
    new-instance v0, Lcom/discord/chat/bridge/MessageType;

    .line 319
    .line 320
    const/16 v2, 0x1b

    .line 321
    .line 322
    const/16 v3, 0x1b

    .line 323
    .line 324
    const-string v5, "STAGE_START"

    .line 325
    .line 326
    invoke-direct {v0, v5, v2, v3}, Lcom/discord/chat/bridge/MessageType;-><init>(Ljava/lang/String;II)V

    .line 327
    .line 328
    .line 329
    sput-object v0, Lcom/discord/chat/bridge/MessageType;->STAGE_START:Lcom/discord/chat/bridge/MessageType;

    .line 330
    .line 331
    new-instance v2, Lcom/discord/chat/bridge/MessageType;

    .line 332
    .line 333
    const/16 v3, 0x1c

    .line 334
    .line 335
    const/16 v5, 0x1c

    .line 336
    .line 337
    move-object/from16 v25, v0

    .line 338
    .line 339
    const-string v0, "STAGE_END"

    .line 340
    .line 341
    invoke-direct {v2, v0, v3, v5}, Lcom/discord/chat/bridge/MessageType;-><init>(Ljava/lang/String;II)V

    .line 342
    .line 343
    .line 344
    sput-object v2, Lcom/discord/chat/bridge/MessageType;->STAGE_END:Lcom/discord/chat/bridge/MessageType;

    .line 345
    .line 346
    new-instance v0, Lcom/discord/chat/bridge/MessageType;

    .line 347
    .line 348
    const/16 v3, 0x1d

    .line 349
    .line 350
    const/16 v5, 0x1d

    .line 351
    .line 352
    move-object/from16 v26, v2

    .line 353
    .line 354
    const-string v2, "STAGE_SPEAKER"

    .line 355
    .line 356
    invoke-direct {v0, v2, v3, v5}, Lcom/discord/chat/bridge/MessageType;-><init>(Ljava/lang/String;II)V

    .line 357
    .line 358
    .line 359
    sput-object v0, Lcom/discord/chat/bridge/MessageType;->STAGE_SPEAKER:Lcom/discord/chat/bridge/MessageType;

    .line 360
    .line 361
    new-instance v2, Lcom/discord/chat/bridge/MessageType;

    .line 362
    .line 363
    const/16 v3, 0x1e

    .line 364
    .line 365
    const/16 v5, 0x1e

    .line 366
    .line 367
    move-object/from16 v27, v0

    .line 368
    .line 369
    const-string v0, "STAGE_RAISE_HAND"

    .line 370
    .line 371
    invoke-direct {v2, v0, v3, v5}, Lcom/discord/chat/bridge/MessageType;-><init>(Ljava/lang/String;II)V

    .line 372
    .line 373
    .line 374
    sput-object v2, Lcom/discord/chat/bridge/MessageType;->STAGE_RAISE_HAND:Lcom/discord/chat/bridge/MessageType;

    .line 375
    .line 376
    new-instance v0, Lcom/discord/chat/bridge/MessageType;

    .line 377
    .line 378
    const/16 v3, 0x1f

    .line 379
    .line 380
    const/16 v5, 0x1f

    .line 381
    .line 382
    move-object/from16 v28, v2

    .line 383
    .line 384
    const-string v2, "STAGE_TOPIC"

    .line 385
    .line 386
    invoke-direct {v0, v2, v3, v5}, Lcom/discord/chat/bridge/MessageType;-><init>(Ljava/lang/String;II)V

    .line 387
    .line 388
    .line 389
    sput-object v0, Lcom/discord/chat/bridge/MessageType;->STAGE_TOPIC:Lcom/discord/chat/bridge/MessageType;

    .line 390
    .line 391
    new-instance v2, Lcom/discord/chat/bridge/MessageType;

    .line 392
    .line 393
    const/16 v3, 0x20

    .line 394
    .line 395
    const/16 v5, 0x20

    .line 396
    .line 397
    move-object/from16 v29, v0

    .line 398
    .line 399
    const-string v0, "GUILD_APPLICATION_PREMIUM_SUBSCRIPTION"

    .line 400
    .line 401
    invoke-direct {v2, v0, v3, v5}, Lcom/discord/chat/bridge/MessageType;-><init>(Ljava/lang/String;II)V

    .line 402
    .line 403
    .line 404
    sput-object v2, Lcom/discord/chat/bridge/MessageType;->GUILD_APPLICATION_PREMIUM_SUBSCRIPTION:Lcom/discord/chat/bridge/MessageType;

    .line 405
    .line 406
    new-instance v0, Lcom/discord/chat/bridge/MessageType;

    .line 407
    .line 408
    const/16 v3, 0x21

    .line 409
    .line 410
    const/16 v5, 0x21

    .line 411
    .line 412
    move-object/from16 v30, v2

    .line 413
    .line 414
    const-string v2, "PRIVATE_CHANNEL_INTEGRATION_ADDED"

    .line 415
    .line 416
    invoke-direct {v0, v2, v3, v5}, Lcom/discord/chat/bridge/MessageType;-><init>(Ljava/lang/String;II)V

    .line 417
    .line 418
    .line 419
    sput-object v0, Lcom/discord/chat/bridge/MessageType;->PRIVATE_CHANNEL_INTEGRATION_ADDED:Lcom/discord/chat/bridge/MessageType;

    .line 420
    .line 421
    new-instance v0, Lcom/discord/chat/bridge/MessageType;

    .line 422
    .line 423
    const/16 v2, 0x22

    .line 424
    .line 425
    const/16 v3, 0x22

    .line 426
    .line 427
    const-string v5, "PRIVATE_CHANNEL_INTEGRATION_REMOVED"

    .line 428
    .line 429
    invoke-direct {v0, v5, v2, v3}, Lcom/discord/chat/bridge/MessageType;-><init>(Ljava/lang/String;II)V

    .line 430
    .line 431
    .line 432
    sput-object v0, Lcom/discord/chat/bridge/MessageType;->PRIVATE_CHANNEL_INTEGRATION_REMOVED:Lcom/discord/chat/bridge/MessageType;

    .line 433
    .line 434
    new-instance v0, Lcom/discord/chat/bridge/MessageType;

    .line 435
    .line 436
    const/16 v2, 0x23

    .line 437
    .line 438
    const/16 v3, 0x23

    .line 439
    .line 440
    const-string v5, "PREMIUM_REFERRAL"

    .line 441
    .line 442
    invoke-direct {v0, v5, v2, v3}, Lcom/discord/chat/bridge/MessageType;-><init>(Ljava/lang/String;II)V

    .line 443
    .line 444
    .line 445
    sput-object v0, Lcom/discord/chat/bridge/MessageType;->PREMIUM_REFERRAL:Lcom/discord/chat/bridge/MessageType;

    .line 446
    .line 447
    invoke-static {}, Lcom/discord/chat/bridge/MessageType;->$values()[Lcom/discord/chat/bridge/MessageType;

    .line 448
    .line 449
    .line 450
    move-result-object v0

    .line 451
    sput-object v0, Lcom/discord/chat/bridge/MessageType;->$VALUES:[Lcom/discord/chat/bridge/MessageType;

    .line 452
    .line 453
    new-instance v0, Lcom/discord/chat/bridge/MessageType$Companion;

    .line 454
    .line 455
    const/4 v2, 0x0

    .line 456
    invoke-direct {v0, v2}, Lcom/discord/chat/bridge/MessageType$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 457
    .line 458
    .line 459
    sput-object v0, Lcom/discord/chat/bridge/MessageType;->Companion:Lcom/discord/chat/bridge/MessageType$Companion;

    .line 460
    .line 461
    const/16 v0, 0x1a

    .line 462
    .line 463
    new-array v0, v0, [Lcom/discord/chat/bridge/MessageType;

    .line 464
    .line 465
    const/4 v2, 0x0

    .line 466
    aput-object v1, v0, v2

    .line 467
    .line 468
    const/4 v1, 0x1

    .line 469
    aput-object v4, v0, v1

    .line 470
    .line 471
    const/4 v1, 0x2

    .line 472
    aput-object v6, v0, v1

    .line 473
    .line 474
    const/4 v1, 0x3

    .line 475
    aput-object v8, v0, v1

    .line 476
    .line 477
    const/4 v1, 0x4

    .line 478
    aput-object v10, v0, v1

    .line 479
    .line 480
    const/4 v1, 0x5

    .line 481
    aput-object v12, v0, v1

    .line 482
    .line 483
    const/4 v1, 0x6

    .line 484
    aput-object v14, v0, v1

    .line 485
    .line 486
    const/4 v1, 0x7

    .line 487
    aput-object v15, v0, v1

    .line 488
    .line 489
    const/16 v1, 0x8

    .line 490
    .line 491
    aput-object v13, v0, v1

    .line 492
    .line 493
    const/16 v1, 0x9

    .line 494
    .line 495
    aput-object v11, v0, v1

    .line 496
    .line 497
    const/16 v1, 0xa

    .line 498
    .line 499
    aput-object v9, v0, v1

    .line 500
    .line 501
    const/16 v1, 0xb

    .line 502
    .line 503
    aput-object v7, v0, v1

    .line 504
    .line 505
    const/16 v1, 0xc

    .line 506
    .line 507
    aput-object v22, v0, v1

    .line 508
    .line 509
    const/16 v1, 0xd

    .line 510
    .line 511
    aput-object v17, v0, v1

    .line 512
    .line 513
    const/16 v1, 0xe

    .line 514
    .line 515
    aput-object v18, v0, v1

    .line 516
    .line 517
    const/16 v1, 0xf

    .line 518
    .line 519
    aput-object v19, v0, v1

    .line 520
    .line 521
    const/16 v1, 0x10

    .line 522
    .line 523
    aput-object v20, v0, v1

    .line 524
    .line 525
    const/16 v1, 0x11

    .line 526
    .line 527
    aput-object v21, v0, v1

    .line 528
    .line 529
    const/16 v1, 0x12

    .line 530
    .line 531
    aput-object v23, v0, v1

    .line 532
    .line 533
    const/16 v1, 0x13

    .line 534
    .line 535
    aput-object v24, v0, v1

    .line 536
    .line 537
    const/16 v1, 0x14

    .line 538
    .line 539
    aput-object v25, v0, v1

    .line 540
    .line 541
    const/16 v1, 0x15

    .line 542
    .line 543
    aput-object v26, v0, v1

    .line 544
    .line 545
    const/16 v1, 0x16

    .line 546
    .line 547
    aput-object v27, v0, v1

    .line 548
    .line 549
    const/16 v1, 0x17

    .line 550
    .line 551
    aput-object v28, v0, v1

    .line 552
    .line 553
    const/16 v1, 0x18

    .line 554
    .line 555
    aput-object v29, v0, v1

    .line 556
    .line 557
    const/16 v1, 0x19

    .line 558
    .line 559
    aput-object v30, v0, v1

    .line 560
    .line 561
    move-object/from16 v1, v16

    .line 562
    .line 563
    invoke-static {v1, v0}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;[Ljava/lang/Enum;)Ljava/util/EnumSet;

    .line 564
    .line 565
    .line 566
    move-result-object v0

    .line 567
    const-string v1, "of(\n            RECIPIEN\u2026M_SUBSCRIPTION,\n        )"

    .line 568
    .line 569
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 570
    .line 571
    .line 572
    sput-object v0, Lcom/discord/chat/bridge/MessageType;->SystemTypes:Ljava/util/Set;

    .line 573
    .line 574
    invoke-static {v4, v7}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    .line 575
    .line 576
    .line 577
    move-result-object v0

    .line 578
    const-string v1, "of(\n            CALL,\n  \u2026  GUILD_STREAM,\n        )"

    .line 579
    .line 580
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 581
    .line 582
    .line 583
    sput-object v0, Lcom/discord/chat/bridge/MessageType;->CallTypes:Ljava/util/Set;

    .line 584
    .line 585
    sget-object v0, Llf/p;->l:Llf/p;

    .line 586
    .line 587
    sget-object v1, Lcom/discord/chat/bridge/MessageType$Companion$$cachedSerializer$delegate$1;->INSTANCE:Lcom/discord/chat/bridge/MessageType$Companion$$cachedSerializer$delegate$1;

    .line 588
    .line 589
    invoke-static {v0, v1}, Llf/m;->b(Llf/p;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 590
    .line 591
    .line 592
    move-result-object v0

    .line 593
    sput-object v0, Lcom/discord/chat/bridge/MessageType;->$cachedSerializer$delegate:Lkotlin/Lazy;

    .line 594
    .line 595
    return-void
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lcom/discord/chat/bridge/MessageType;->serialNumber:I

    .line 5
    .line 6
    new-instance p1, Lcom/discord/chat/bridge/MessageType$isSystem$2;

    .line 7
    .line 8
    invoke-direct {p1, p0}, Lcom/discord/chat/bridge/MessageType$isSystem$2;-><init>(Lcom/discord/chat/bridge/MessageType;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Llf/m;->a(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Lcom/discord/chat/bridge/MessageType;->isSystem$delegate:Lkotlin/Lazy;

    .line 16
    .line 17
    new-instance p1, Lcom/discord/chat/bridge/MessageType$isAutomodSystem$2;

    .line 18
    .line 19
    invoke-direct {p1, p0}, Lcom/discord/chat/bridge/MessageType$isAutomodSystem$2;-><init>(Lcom/discord/chat/bridge/MessageType;)V

    .line 20
    .line 21
    .line 22
    invoke-static {p1}, Llf/m;->a(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, Lcom/discord/chat/bridge/MessageType;->isAutomodSystem$delegate:Lkotlin/Lazy;

    .line 27
    .line 28
    new-instance p1, Lcom/discord/chat/bridge/MessageType$isCall$2;

    .line 29
    .line 30
    invoke-direct {p1, p0}, Lcom/discord/chat/bridge/MessageType$isCall$2;-><init>(Lcom/discord/chat/bridge/MessageType;)V

    .line 31
    .line 32
    .line 33
    invoke-static {p1}, Llf/m;->a(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iput-object p1, p0, Lcom/discord/chat/bridge/MessageType;->isCall$delegate:Lkotlin/Lazy;

    .line 38
    .line 39
    return-void
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
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
.end method

.method public static final synthetic access$get$cachedSerializer$delegate$cp()Lkotlin/Lazy;
    .locals 1

    sget-object v0, Lcom/discord/chat/bridge/MessageType;->$cachedSerializer$delegate:Lkotlin/Lazy;

    return-object v0
.end method

.method public static final synthetic access$getCallTypes$cp()Ljava/util/Set;
    .locals 1

    sget-object v0, Lcom/discord/chat/bridge/MessageType;->CallTypes:Ljava/util/Set;

    return-object v0
.end method

.method public static final synthetic access$getSystemTypes$cp()Ljava/util/Set;
    .locals 1

    sget-object v0, Lcom/discord/chat/bridge/MessageType;->SystemTypes:Ljava/util/Set;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/discord/chat/bridge/MessageType;
    .locals 1

    const-class v0, Lcom/discord/chat/bridge/MessageType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/discord/chat/bridge/MessageType;

    return-object p0
.end method

.method public static values()[Lcom/discord/chat/bridge/MessageType;
    .locals 1

    sget-object v0, Lcom/discord/chat/bridge/MessageType;->$VALUES:[Lcom/discord/chat/bridge/MessageType;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/discord/chat/bridge/MessageType;

    return-object v0
.end method


# virtual methods
.method public getSerialNumber()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/bridge/MessageType;->serialNumber:I

    return v0
.end method

.method public final isAutomodSystem()Z
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/MessageType;->isAutomodSystem$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final isCall()Z
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/MessageType;->isCall$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final isSystem()Z
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/MessageType;->isSystem$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method
