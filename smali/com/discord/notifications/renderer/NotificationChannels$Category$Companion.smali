.class public final Lcom/discord/notifications/renderer/NotificationChannels$Category$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/notifications/renderer/NotificationChannels$Category;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/notifications/renderer/NotificationChannels$Category$Companion$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/discord/notifications/renderer/NotificationChannels$Category$Companion;",
        "",
        "()V",
        "defaultLabel",
        "",
        "category",
        "Lcom/discord/notifications/renderer/NotificationChannels$Category;",
        "fromTrackingType",
        "trackingType",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/discord/notifications/renderer/NotificationChannels$Category$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final defaultLabel(Lcom/discord/notifications/renderer/NotificationChannels$Category;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "category"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/discord/notifications/renderer/NotificationChannels$Category$Companion$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    aget p1, v0, p1

    .line 13
    .line 14
    packed-switch p1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    const-string p1, "Other"

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :pswitch_0
    const-string p1, "Other server notifications"

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :pswitch_1
    const-string p1, "Event notifications"

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :pswitch_2
    const-string p1, "Forum notifications"

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :pswitch_3
    const-string p1, "Discord system messages"

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :pswitch_4
    const-string p1, "Stage notifications"

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :pswitch_5
    const-string p1, "Game detection"

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :pswitch_6
    const-string p1, "Social"

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :pswitch_7
    const-string p1, "Friend requests"

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :pswitch_8
    const-string p1, "Direct messages"

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :pswitch_9
    const-string p1, "Messages"

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :pswitch_a
    const-string p1, "Voice connected"

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :pswitch_b
    const-string p1, "Incoming calls"

    .line 54
    .line 55
    :goto_0
    return-object p1

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method

.method public final fromTrackingType(Ljava/lang/String;)Lcom/discord/notifications/renderer/NotificationChannels$Category;
    .locals 1

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    sparse-switch v0, :sswitch_data_0

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :sswitch_0
    const-string v0, "generic_missed_message"

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :sswitch_1
    const-string v0, "top_messages_push"

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-nez p1, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :sswitch_2
    const-string v0, "generic_home_featured_message"

    .line 30
    .line 31
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-nez p1, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :sswitch_3
    const-string v0, "GUILD_STREAM_START"

    .line 39
    .line 40
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-nez p1, :cond_2

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :sswitch_4
    const-string v0, "home_lifecycle_push"

    .line 48
    .line 49
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-nez p1, :cond_0

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    sget-object p1, Lcom/discord/notifications/renderer/NotificationChannels$Category;->OtherServerNotifications:Lcom/discord/notifications/renderer/NotificationChannels$Category;

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :sswitch_5
    const-string v0, "nudge_new_friend_dm_push"

    .line 60
    .line 61
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-nez p1, :cond_2

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :sswitch_6
    const-string v0, "suspicious_session"

    .line 69
    .line 70
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-nez p1, :cond_1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_1
    sget-object p1, Lcom/discord/notifications/renderer/NotificationChannels$Category;->SystemMessages:Lcom/discord/notifications/renderer/NotificationChannels$Category;

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :sswitch_7
    const-string v0, "generic_friend_request_reminder"

    .line 81
    .line 82
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    if-nez p1, :cond_2

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_2
    sget-object p1, Lcom/discord/notifications/renderer/NotificationChannels$Category;->Social:Lcom/discord/notifications/renderer/NotificationChannels$Category;

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_3
    :goto_0
    sget-object p1, Lcom/discord/notifications/renderer/NotificationChannels$Category;->Other:Lcom/discord/notifications/renderer/NotificationChannels$Category;

    .line 93
    .line 94
    :goto_1
    return-object p1

    .line 95
    :sswitch_data_0
    .sparse-switch
        -0x68e7aec5 -> :sswitch_7
        -0x5577884c -> :sswitch_6
        -0xbd8bd6e -> :sswitch_5
        0x1fd3d22f -> :sswitch_4
        0x4dfe07af -> :sswitch_3
        0x4ee6a3ee -> :sswitch_2
        0x552770c3 -> :sswitch_1
        0x5e4759cb -> :sswitch_0
    .end sparse-switch
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
.end method
