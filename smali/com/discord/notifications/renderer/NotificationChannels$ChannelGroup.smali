.class final enum Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/notifications/renderer/NotificationChannels;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "ChannelGroup"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000b\u0008\u0082\u0001\u0018\u0000 \r2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0017\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\u0007j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;",
        "",
        "id",
        "",
        "groupId",
        "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V",
        "getGroupId",
        "()Ljava/lang/String;",
        "getId",
        "Realtime",
        "Social",
        "Server",
        "Other",
        "Companion",
        "notification_renderer_release"
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
.field private static final synthetic $VALUES:[Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;

.field public static final Companion:Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup$Companion;

.field public static final enum Other:Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;

.field public static final enum Realtime:Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;

.field public static final enum Server:Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;

.field public static final enum Social:Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;


# instance fields
.field private final groupId:Ljava/lang/String;

.field private final id:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;

    const/4 v1, 0x0

    sget-object v2, Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;->Realtime:Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;->Social:Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;->Server:Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;->Other:Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;

    aput-object v2, v0, v1

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;

    .line 2
    .line 3
    const-string v1, "realtime"

    .line 4
    .line 5
    const-string v2, "111_realtime"

    .line 6
    .line 7
    const-string v3, "Realtime"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v3, v4, v1, v2}, Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;->Realtime:Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;

    .line 14
    .line 15
    new-instance v0, Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;

    .line 16
    .line 17
    const-string v1, "social"

    .line 18
    .line 19
    const-string v2, "222_social"

    .line 20
    .line 21
    const-string v3, "Social"

    .line 22
    .line 23
    const/4 v4, 0x1

    .line 24
    invoke-direct {v0, v3, v4, v1, v2}, Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;->Social:Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;

    .line 28
    .line 29
    new-instance v0, Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;

    .line 30
    .line 31
    const-string v1, "server"

    .line 32
    .line 33
    const-string v2, "333_server"

    .line 34
    .line 35
    const-string v3, "Server"

    .line 36
    .line 37
    const/4 v4, 0x2

    .line 38
    invoke-direct {v0, v3, v4, v1, v2}, Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    sput-object v0, Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;->Server:Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;

    .line 42
    .line 43
    new-instance v0, Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;

    .line 44
    .line 45
    const-string v1, "other"

    .line 46
    .line 47
    const-string v2, "444_other"

    .line 48
    .line 49
    const-string v3, "Other"

    .line 50
    .line 51
    const/4 v4, 0x3

    .line 52
    invoke-direct {v0, v3, v4, v1, v2}, Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    sput-object v0, Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;->Other:Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;

    .line 56
    .line 57
    invoke-static {}, Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;->$values()[Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    sput-object v0, Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;->$VALUES:[Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;

    .line 62
    .line 63
    new-instance v0, Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup$Companion;

    .line 64
    .line 65
    const/4 v1, 0x0

    .line 66
    invoke-direct {v0, v1}, Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 67
    .line 68
    .line 69
    sput-object v0, Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;->Companion:Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup$Companion;

    .line 70
    .line 71
    return-void
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

    iput-object p3, p0, Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;->id:Ljava/lang/String;

    iput-object p4, p0, Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;->groupId:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;
    .locals 1

    const-class v0, Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;

    return-object p0
.end method

.method public static values()[Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;
    .locals 1

    sget-object v0, Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;->$VALUES:[Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;

    return-object v0
.end method


# virtual methods
.method public final getGroupId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;->groupId:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;->id:Ljava/lang/String;

    return-object v0
.end method
