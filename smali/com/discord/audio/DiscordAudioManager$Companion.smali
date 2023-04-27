.class public final Lcom/discord/audio/DiscordAudioManager$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/audio/DiscordAudioManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0004R\u0017\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u000e\u0010\u0008\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/discord/audio/DiscordAudioManager$Companion;",
        "",
        "()V",
        "DEFAULT_DEVICE_PRIORITIZATION",
        "",
        "Lcom/discord/audio/DiscordAudioManager$DeviceTypes;",
        "getDEFAULT_DEVICE_PRIORITIZATION",
        "()Ljava/util/List;",
        "TAG",
        "",
        "getSupportedDevices",
        "Lcom/discord/audio/DiscordAudioManager$AudioDevice;",
        "audio_release"
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

    invoke-direct {p0}, Lcom/discord/audio/DiscordAudioManager$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final getDEFAULT_DEVICE_PRIORITIZATION()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/discord/audio/DiscordAudioManager$DeviceTypes;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/discord/audio/DiscordAudioManager;->access$getDEFAULT_DEVICE_PRIORITIZATION$cp()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final getSupportedDevices()Ljava/util/List;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/discord/audio/DiscordAudioManager$AudioDevice;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x4

    .line 2
    new-array v0, v0, [Lcom/discord/audio/DiscordAudioManager$AudioDevice;

    .line 3
    .line 4
    new-instance v8, Lcom/discord/audio/DiscordAudioManager$AudioDevice;

    .line 5
    .line 6
    sget-object v2, Lcom/discord/audio/DiscordAudioManager$DeviceTypes;->SPEAKERPHONE:Lcom/discord/audio/DiscordAudioManager$DeviceTypes;

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x0

    .line 11
    const/16 v6, 0xe

    .line 12
    .line 13
    const/4 v7, 0x0

    .line 14
    move-object v1, v8

    .line 15
    invoke-direct/range {v1 .. v7}, Lcom/discord/audio/DiscordAudioManager$AudioDevice;-><init>(Lcom/discord/audio/DiscordAudioManager$DeviceTypes;ZLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 16
    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    aput-object v8, v0, v1

    .line 20
    .line 21
    new-instance v1, Lcom/discord/audio/DiscordAudioManager$AudioDevice;

    .line 22
    .line 23
    sget-object v10, Lcom/discord/audio/DiscordAudioManager$DeviceTypes;->WIRED_HEADSET:Lcom/discord/audio/DiscordAudioManager$DeviceTypes;

    .line 24
    .line 25
    const/4 v11, 0x0

    .line 26
    const/4 v12, 0x0

    .line 27
    const/4 v13, 0x0

    .line 28
    const/16 v14, 0xe

    .line 29
    .line 30
    const/4 v15, 0x0

    .line 31
    move-object v9, v1

    .line 32
    invoke-direct/range {v9 .. v15}, Lcom/discord/audio/DiscordAudioManager$AudioDevice;-><init>(Lcom/discord/audio/DiscordAudioManager$DeviceTypes;ZLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 33
    .line 34
    .line 35
    const/4 v2, 0x1

    .line 36
    aput-object v1, v0, v2

    .line 37
    .line 38
    new-instance v1, Lcom/discord/audio/DiscordAudioManager$AudioDevice;

    .line 39
    .line 40
    sget-object v4, Lcom/discord/audio/DiscordAudioManager$DeviceTypes;->EARPIECE:Lcom/discord/audio/DiscordAudioManager$DeviceTypes;

    .line 41
    .line 42
    const/4 v5, 0x0

    .line 43
    const/4 v6, 0x0

    .line 44
    const/16 v8, 0xe

    .line 45
    .line 46
    const/4 v9, 0x0

    .line 47
    move-object v3, v1

    .line 48
    invoke-direct/range {v3 .. v9}, Lcom/discord/audio/DiscordAudioManager$AudioDevice;-><init>(Lcom/discord/audio/DiscordAudioManager$DeviceTypes;ZLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 49
    .line 50
    .line 51
    const/4 v2, 0x2

    .line 52
    aput-object v1, v0, v2

    .line 53
    .line 54
    new-instance v1, Lcom/discord/audio/DiscordAudioManager$AudioDevice;

    .line 55
    .line 56
    sget-object v4, Lcom/discord/audio/DiscordAudioManager$DeviceTypes;->BLUETOOTH_HEADSET:Lcom/discord/audio/DiscordAudioManager$DeviceTypes;

    .line 57
    .line 58
    move-object v3, v1

    .line 59
    invoke-direct/range {v3 .. v9}, Lcom/discord/audio/DiscordAudioManager$AudioDevice;-><init>(Lcom/discord/audio/DiscordAudioManager$DeviceTypes;ZLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 60
    .line 61
    .line 62
    const/4 v2, 0x3

    .line 63
    aput-object v1, v0, v2

    .line 64
    .line 65
    invoke-static {v0}, Lkotlin/collections/h;->l([Ljava/lang/Object;)Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    return-object v0
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
.end method
