.class final enum Lcom/discord/notifications/renderer/NotificationChannels$Category;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/notifications/renderer/NotificationChannels;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "Category"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/notifications/renderer/NotificationChannels$Category$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/discord/notifications/renderer/NotificationChannels$Category;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0019\u0008\u0082\u0001\u0018\u0000 \u001f2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001fB+\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0013\u0010\u0008\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\rj\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017j\u0002\u0008\u0018j\u0002\u0008\u0019j\u0002\u0008\u001aj\u0002\u0008\u001bj\u0002\u0008\u001cj\u0002\u0008\u001dj\u0002\u0008\u001e\u00a8\u0006 "
    }
    d2 = {
        "Lcom/discord/notifications/renderer/NotificationChannels$Category;",
        "",
        "id",
        "",
        "importance",
        "",
        "group",
        "Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;",
        "legacyId",
        "(Ljava/lang/String;ILjava/lang/String;ILcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;Ljava/lang/String;)V",
        "getGroup",
        "()Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;",
        "getId",
        "()Ljava/lang/String;",
        "getImportance",
        "()I",
        "getLegacyId",
        "Calls",
        "MediaConnections",
        "Messages",
        "MessagesDirect",
        "FriendRequests",
        "Social",
        "GameDetection",
        "StageStart",
        "SystemMessages",
        "ForumThreadCreated",
        "GuildEventStart",
        "OtherServerNotifications",
        "OtherHighPriority",
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
.field private static final synthetic $VALUES:[Lcom/discord/notifications/renderer/NotificationChannels$Category;

.field public static final enum Calls:Lcom/discord/notifications/renderer/NotificationChannels$Category;

.field public static final Companion:Lcom/discord/notifications/renderer/NotificationChannels$Category$Companion;

.field public static final enum ForumThreadCreated:Lcom/discord/notifications/renderer/NotificationChannels$Category;

.field public static final enum FriendRequests:Lcom/discord/notifications/renderer/NotificationChannels$Category;

.field public static final enum GameDetection:Lcom/discord/notifications/renderer/NotificationChannels$Category;

.field public static final enum GuildEventStart:Lcom/discord/notifications/renderer/NotificationChannels$Category;

.field public static final enum MediaConnections:Lcom/discord/notifications/renderer/NotificationChannels$Category;

.field public static final enum Messages:Lcom/discord/notifications/renderer/NotificationChannels$Category;

.field public static final enum MessagesDirect:Lcom/discord/notifications/renderer/NotificationChannels$Category;

.field public static final enum Other:Lcom/discord/notifications/renderer/NotificationChannels$Category;

.field public static final enum OtherHighPriority:Lcom/discord/notifications/renderer/NotificationChannels$Category;

.field public static final enum OtherServerNotifications:Lcom/discord/notifications/renderer/NotificationChannels$Category;

.field public static final enum Social:Lcom/discord/notifications/renderer/NotificationChannels$Category;

.field public static final enum StageStart:Lcom/discord/notifications/renderer/NotificationChannels$Category;

.field public static final enum SystemMessages:Lcom/discord/notifications/renderer/NotificationChannels$Category;


# instance fields
.field private final group:Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;

.field private final id:Ljava/lang/String;

.field private final importance:I

.field private final legacyId:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/discord/notifications/renderer/NotificationChannels$Category;
    .locals 3

    const/16 v0, 0xe

    new-array v0, v0, [Lcom/discord/notifications/renderer/NotificationChannels$Category;

    const/4 v1, 0x0

    sget-object v2, Lcom/discord/notifications/renderer/NotificationChannels$Category;->Calls:Lcom/discord/notifications/renderer/NotificationChannels$Category;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/discord/notifications/renderer/NotificationChannels$Category;->MediaConnections:Lcom/discord/notifications/renderer/NotificationChannels$Category;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/discord/notifications/renderer/NotificationChannels$Category;->Messages:Lcom/discord/notifications/renderer/NotificationChannels$Category;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lcom/discord/notifications/renderer/NotificationChannels$Category;->MessagesDirect:Lcom/discord/notifications/renderer/NotificationChannels$Category;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lcom/discord/notifications/renderer/NotificationChannels$Category;->FriendRequests:Lcom/discord/notifications/renderer/NotificationChannels$Category;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lcom/discord/notifications/renderer/NotificationChannels$Category;->Social:Lcom/discord/notifications/renderer/NotificationChannels$Category;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/discord/notifications/renderer/NotificationChannels$Category;->GameDetection:Lcom/discord/notifications/renderer/NotificationChannels$Category;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/discord/notifications/renderer/NotificationChannels$Category;->StageStart:Lcom/discord/notifications/renderer/NotificationChannels$Category;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lcom/discord/notifications/renderer/NotificationChannels$Category;->SystemMessages:Lcom/discord/notifications/renderer/NotificationChannels$Category;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lcom/discord/notifications/renderer/NotificationChannels$Category;->ForumThreadCreated:Lcom/discord/notifications/renderer/NotificationChannels$Category;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lcom/discord/notifications/renderer/NotificationChannels$Category;->GuildEventStart:Lcom/discord/notifications/renderer/NotificationChannels$Category;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, Lcom/discord/notifications/renderer/NotificationChannels$Category;->OtherServerNotifications:Lcom/discord/notifications/renderer/NotificationChannels$Category;

    aput-object v2, v0, v1

    const/16 v1, 0xc

    sget-object v2, Lcom/discord/notifications/renderer/NotificationChannels$Category;->OtherHighPriority:Lcom/discord/notifications/renderer/NotificationChannels$Category;

    aput-object v2, v0, v1

    const/16 v1, 0xd

    sget-object v2, Lcom/discord/notifications/renderer/NotificationChannels$Category;->Other:Lcom/discord/notifications/renderer/NotificationChannels$Category;

    aput-object v2, v0, v1

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 24

    .line 1
    new-instance v7, Lcom/discord/notifications/renderer/NotificationChannels$Category;

    .line 2
    .line 3
    const-string v1, "Calls"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "calls"

    .line 7
    .line 8
    const/4 v4, 0x4

    .line 9
    sget-object v15, Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;->Realtime:Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;

    .line 10
    .line 11
    const-string v6, "Calls"

    .line 12
    .line 13
    move-object v0, v7

    .line 14
    move-object v5, v15

    .line 15
    invoke-direct/range {v0 .. v6}, Lcom/discord/notifications/renderer/NotificationChannels$Category;-><init>(Ljava/lang/String;ILjava/lang/String;ILcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    sput-object v7, Lcom/discord/notifications/renderer/NotificationChannels$Category;->Calls:Lcom/discord/notifications/renderer/NotificationChannels$Category;

    .line 19
    .line 20
    new-instance v0, Lcom/discord/notifications/renderer/NotificationChannels$Category;

    .line 21
    .line 22
    const-string v9, "MediaConnections"

    .line 23
    .line 24
    const/4 v10, 0x1

    .line 25
    const-string v11, "mediaConnections"

    .line 26
    .line 27
    const/4 v12, 0x3

    .line 28
    const-string v14, "Media Connections"

    .line 29
    .line 30
    move-object v8, v0

    .line 31
    move-object v13, v15

    .line 32
    invoke-direct/range {v8 .. v14}, Lcom/discord/notifications/renderer/NotificationChannels$Category;-><init>(Ljava/lang/String;ILjava/lang/String;ILcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lcom/discord/notifications/renderer/NotificationChannels$Category;->MediaConnections:Lcom/discord/notifications/renderer/NotificationChannels$Category;

    .line 36
    .line 37
    new-instance v0, Lcom/discord/notifications/renderer/NotificationChannels$Category;

    .line 38
    .line 39
    const-string v2, "Messages"

    .line 40
    .line 41
    const/4 v3, 0x2

    .line 42
    const-string v4, "messages"

    .line 43
    .line 44
    const/4 v5, 0x4

    .line 45
    sget-object v16, Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;->Server:Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;

    .line 46
    .line 47
    const-string v7, "Messages"

    .line 48
    .line 49
    move-object v1, v0

    .line 50
    move-object/from16 v6, v16

    .line 51
    .line 52
    invoke-direct/range {v1 .. v7}, Lcom/discord/notifications/renderer/NotificationChannels$Category;-><init>(Ljava/lang/String;ILjava/lang/String;ILcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    sput-object v0, Lcom/discord/notifications/renderer/NotificationChannels$Category;->Messages:Lcom/discord/notifications/renderer/NotificationChannels$Category;

    .line 56
    .line 57
    new-instance v0, Lcom/discord/notifications/renderer/NotificationChannels$Category;

    .line 58
    .line 59
    const-string v9, "MessagesDirect"

    .line 60
    .line 61
    const/4 v10, 0x3

    .line 62
    const-string v11, "directMessages"

    .line 63
    .line 64
    const/4 v12, 0x4

    .line 65
    sget-object v17, Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;->Social:Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;

    .line 66
    .line 67
    const-string v14, "DirectMessages"

    .line 68
    .line 69
    move-object v8, v0

    .line 70
    move-object/from16 v13, v17

    .line 71
    .line 72
    invoke-direct/range {v8 .. v14}, Lcom/discord/notifications/renderer/NotificationChannels$Category;-><init>(Ljava/lang/String;ILjava/lang/String;ILcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    sput-object v0, Lcom/discord/notifications/renderer/NotificationChannels$Category;->MessagesDirect:Lcom/discord/notifications/renderer/NotificationChannels$Category;

    .line 76
    .line 77
    new-instance v0, Lcom/discord/notifications/renderer/NotificationChannels$Category;

    .line 78
    .line 79
    const-string v2, "FriendRequests"

    .line 80
    .line 81
    const/4 v3, 0x4

    .line 82
    const-string v4, "friendRequests"

    .line 83
    .line 84
    const/4 v7, 0x0

    .line 85
    move-object v1, v0

    .line 86
    move-object/from16 v6, v17

    .line 87
    .line 88
    invoke-direct/range {v1 .. v7}, Lcom/discord/notifications/renderer/NotificationChannels$Category;-><init>(Ljava/lang/String;ILjava/lang/String;ILcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    sput-object v0, Lcom/discord/notifications/renderer/NotificationChannels$Category;->FriendRequests:Lcom/discord/notifications/renderer/NotificationChannels$Category;

    .line 92
    .line 93
    new-instance v0, Lcom/discord/notifications/renderer/NotificationChannels$Category;

    .line 94
    .line 95
    const-string v2, "Social"

    .line 96
    .line 97
    const/4 v3, 0x5

    .line 98
    const-string v4, "social"

    .line 99
    .line 100
    const/4 v5, 0x2

    .line 101
    const-string v7, "Social"

    .line 102
    .line 103
    move-object v1, v0

    .line 104
    invoke-direct/range {v1 .. v7}, Lcom/discord/notifications/renderer/NotificationChannels$Category;-><init>(Ljava/lang/String;ILjava/lang/String;ILcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    sput-object v0, Lcom/discord/notifications/renderer/NotificationChannels$Category;->Social:Lcom/discord/notifications/renderer/NotificationChannels$Category;

    .line 108
    .line 109
    new-instance v0, Lcom/discord/notifications/renderer/NotificationChannels$Category;

    .line 110
    .line 111
    const-string v9, "GameDetection"

    .line 112
    .line 113
    const/4 v10, 0x6

    .line 114
    const-string v11, "gameDetection"

    .line 115
    .line 116
    const/4 v12, 0x1

    .line 117
    const-string v14, "Game Detection"

    .line 118
    .line 119
    move-object v8, v0

    .line 120
    move-object v13, v15

    .line 121
    invoke-direct/range {v8 .. v14}, Lcom/discord/notifications/renderer/NotificationChannels$Category;-><init>(Ljava/lang/String;ILjava/lang/String;ILcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    sput-object v0, Lcom/discord/notifications/renderer/NotificationChannels$Category;->GameDetection:Lcom/discord/notifications/renderer/NotificationChannels$Category;

    .line 125
    .line 126
    new-instance v0, Lcom/discord/notifications/renderer/NotificationChannels$Category;

    .line 127
    .line 128
    const-string v7, "StageStart"

    .line 129
    .line 130
    const/4 v8, 0x7

    .line 131
    const-string v9, "stageLive"

    .line 132
    .line 133
    const/4 v10, 0x4

    .line 134
    const-string v12, "Stage Live"

    .line 135
    .line 136
    move-object v6, v0

    .line 137
    move-object/from16 v11, v16

    .line 138
    .line 139
    invoke-direct/range {v6 .. v12}, Lcom/discord/notifications/renderer/NotificationChannels$Category;-><init>(Ljava/lang/String;ILjava/lang/String;ILcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    sput-object v0, Lcom/discord/notifications/renderer/NotificationChannels$Category;->StageStart:Lcom/discord/notifications/renderer/NotificationChannels$Category;

    .line 143
    .line 144
    new-instance v0, Lcom/discord/notifications/renderer/NotificationChannels$Category;

    .line 145
    .line 146
    const-string v18, "SystemMessages"

    .line 147
    .line 148
    const/16 v19, 0x8

    .line 149
    .line 150
    const-string v20, "systemMessages"

    .line 151
    .line 152
    const/16 v21, 0x4

    .line 153
    .line 154
    sget-object v13, Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;->Other:Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;

    .line 155
    .line 156
    const/16 v23, 0x0

    .line 157
    .line 158
    move-object/from16 v17, v0

    .line 159
    .line 160
    move-object/from16 v22, v13

    .line 161
    .line 162
    invoke-direct/range {v17 .. v23}, Lcom/discord/notifications/renderer/NotificationChannels$Category;-><init>(Ljava/lang/String;ILjava/lang/String;ILcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    sput-object v0, Lcom/discord/notifications/renderer/NotificationChannels$Category;->SystemMessages:Lcom/discord/notifications/renderer/NotificationChannels$Category;

    .line 166
    .line 167
    new-instance v0, Lcom/discord/notifications/renderer/NotificationChannels$Category;

    .line 168
    .line 169
    const-string v7, "ForumThreadCreated"

    .line 170
    .line 171
    const/16 v8, 0x9

    .line 172
    .line 173
    const-string v9, "forumThreadCreated"

    .line 174
    .line 175
    const-string v12, "Forum Post Create"

    .line 176
    .line 177
    move-object v6, v0

    .line 178
    invoke-direct/range {v6 .. v12}, Lcom/discord/notifications/renderer/NotificationChannels$Category;-><init>(Ljava/lang/String;ILjava/lang/String;ILcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    sput-object v0, Lcom/discord/notifications/renderer/NotificationChannels$Category;->ForumThreadCreated:Lcom/discord/notifications/renderer/NotificationChannels$Category;

    .line 182
    .line 183
    new-instance v0, Lcom/discord/notifications/renderer/NotificationChannels$Category;

    .line 184
    .line 185
    const-string v7, "GuildEventStart"

    .line 186
    .line 187
    const/16 v8, 0xa

    .line 188
    .line 189
    const-string v9, "guildEventLive"

    .line 190
    .line 191
    const-string v12, "Guild Event Live"

    .line 192
    .line 193
    move-object v6, v0

    .line 194
    invoke-direct/range {v6 .. v12}, Lcom/discord/notifications/renderer/NotificationChannels$Category;-><init>(Ljava/lang/String;ILjava/lang/String;ILcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    sput-object v0, Lcom/discord/notifications/renderer/NotificationChannels$Category;->GuildEventStart:Lcom/discord/notifications/renderer/NotificationChannels$Category;

    .line 198
    .line 199
    new-instance v0, Lcom/discord/notifications/renderer/NotificationChannels$Category;

    .line 200
    .line 201
    const-string v7, "OtherServerNotifications"

    .line 202
    .line 203
    const/16 v8, 0xb

    .line 204
    .line 205
    const-string v9, "other"

    .line 206
    .line 207
    const/4 v10, 0x2

    .line 208
    const-string v12, "General"

    .line 209
    .line 210
    move-object v6, v0

    .line 211
    invoke-direct/range {v6 .. v12}, Lcom/discord/notifications/renderer/NotificationChannels$Category;-><init>(Ljava/lang/String;ILjava/lang/String;ILcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    sput-object v0, Lcom/discord/notifications/renderer/NotificationChannels$Category;->OtherServerNotifications:Lcom/discord/notifications/renderer/NotificationChannels$Category;

    .line 215
    .line 216
    new-instance v0, Lcom/discord/notifications/renderer/NotificationChannels$Category;

    .line 217
    .line 218
    const-string v2, "OtherHighPriority"

    .line 219
    .line 220
    const/16 v3, 0xc

    .line 221
    .line 222
    const-string v4, "otherHighPriority"

    .line 223
    .line 224
    const/4 v5, 0x4

    .line 225
    const-string v7, "GeneralHigh"

    .line 226
    .line 227
    move-object v1, v0

    .line 228
    move-object v6, v13

    .line 229
    invoke-direct/range {v1 .. v7}, Lcom/discord/notifications/renderer/NotificationChannels$Category;-><init>(Ljava/lang/String;ILjava/lang/String;ILcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    sput-object v0, Lcom/discord/notifications/renderer/NotificationChannels$Category;->OtherHighPriority:Lcom/discord/notifications/renderer/NotificationChannels$Category;

    .line 233
    .line 234
    new-instance v0, Lcom/discord/notifications/renderer/NotificationChannels$Category;

    .line 235
    .line 236
    const-string v2, "Other"

    .line 237
    .line 238
    const/16 v3, 0xd

    .line 239
    .line 240
    const-string v4, "default"

    .line 241
    .line 242
    const/4 v5, 0x1

    .line 243
    const/4 v7, 0x0

    .line 244
    move-object v1, v0

    .line 245
    invoke-direct/range {v1 .. v7}, Lcom/discord/notifications/renderer/NotificationChannels$Category;-><init>(Ljava/lang/String;ILjava/lang/String;ILcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    sput-object v0, Lcom/discord/notifications/renderer/NotificationChannels$Category;->Other:Lcom/discord/notifications/renderer/NotificationChannels$Category;

    .line 249
    .line 250
    invoke-static {}, Lcom/discord/notifications/renderer/NotificationChannels$Category;->$values()[Lcom/discord/notifications/renderer/NotificationChannels$Category;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    sput-object v0, Lcom/discord/notifications/renderer/NotificationChannels$Category;->$VALUES:[Lcom/discord/notifications/renderer/NotificationChannels$Category;

    .line 255
    .line 256
    new-instance v0, Lcom/discord/notifications/renderer/NotificationChannels$Category$Companion;

    .line 257
    .line 258
    const/4 v1, 0x0

    .line 259
    invoke-direct {v0, v1}, Lcom/discord/notifications/renderer/NotificationChannels$Category$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 260
    .line 261
    .line 262
    sput-object v0, Lcom/discord/notifications/renderer/NotificationChannels$Category;->Companion:Lcom/discord/notifications/renderer/NotificationChannels$Category$Companion;

    .line 263
    .line 264
    return-void
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
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;ILcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/discord/notifications/renderer/NotificationChannels$Category;->id:Ljava/lang/String;

    iput p4, p0, Lcom/discord/notifications/renderer/NotificationChannels$Category;->importance:I

    iput-object p5, p0, Lcom/discord/notifications/renderer/NotificationChannels$Category;->group:Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;

    iput-object p6, p0, Lcom/discord/notifications/renderer/NotificationChannels$Category;->legacyId:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;ILjava/lang/String;ILcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p7, 0x8

    if-eqz p7, :cond_0

    const/4 p6, 0x0

    :cond_0
    move-object v6, p6

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move v4, p4

    move-object v5, p5

    .line 2
    invoke-direct/range {v0 .. v6}, Lcom/discord/notifications/renderer/NotificationChannels$Category;-><init>(Ljava/lang/String;ILjava/lang/String;ILcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;Ljava/lang/String;)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/discord/notifications/renderer/NotificationChannels$Category;
    .locals 1

    const-class v0, Lcom/discord/notifications/renderer/NotificationChannels$Category;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/discord/notifications/renderer/NotificationChannels$Category;

    return-object p0
.end method

.method public static values()[Lcom/discord/notifications/renderer/NotificationChannels$Category;
    .locals 1

    sget-object v0, Lcom/discord/notifications/renderer/NotificationChannels$Category;->$VALUES:[Lcom/discord/notifications/renderer/NotificationChannels$Category;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/discord/notifications/renderer/NotificationChannels$Category;

    return-object v0
.end method


# virtual methods
.method public final getGroup()Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/renderer/NotificationChannels$Category;->group:Lcom/discord/notifications/renderer/NotificationChannels$ChannelGroup;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/renderer/NotificationChannels$Category;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getImportance()I
    .locals 1

    iget v0, p0, Lcom/discord/notifications/renderer/NotificationChannels$Category;->importance:I

    return v0
.end method

.method public final getLegacyId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/notifications/renderer/NotificationChannels$Category;->legacyId:Ljava/lang/String;

    return-object v0
.end method
