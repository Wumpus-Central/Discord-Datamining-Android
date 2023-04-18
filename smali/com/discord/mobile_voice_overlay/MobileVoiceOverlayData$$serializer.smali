.class public final Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzi/f0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lzi/f0<",
        "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00040\u0003H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0015"
    }
    d2 = {
        "com/discord/mobile_voice_overlay/MobileVoiceOverlayData.$serializer",
        "Lzi/f0;",
        "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;",
        "",
        "Lkotlinx/serialization/KSerializer;",
        "childSerializers",
        "()[Lkotlinx/serialization/KSerializer;",
        "Lkotlinx/serialization/encoding/Decoder;",
        "decoder",
        "deserialize",
        "Lkotlinx/serialization/encoding/Encoder;",
        "encoder",
        "value",
        "",
        "serialize",
        "Lkotlinx/serialization/descriptors/SerialDescriptor;",
        "getDescriptor",
        "()Lkotlinx/serialization/descriptors/SerialDescriptor;",
        "descriptor",
        "<init>",
        "()V",
        "mobile_voice_overlay_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData$$serializer;

.field private static final synthetic descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData$$serializer;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData$$serializer;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData$$serializer;->INSTANCE:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData$$serializer;

    .line 7
    .line 8
    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    .line 9
    .line 10
    const-string v2, "com.discord.mobile_voice_overlay.MobileVoiceOverlayData"

    .line 11
    .line 12
    const/16 v3, 0xb

    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lzi/f0;I)V

    .line 15
    .line 16
    .line 17
    const-string v0, "users"

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v0, "extraUsers"

    .line 24
    .line 25
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const-string v0, "guildId"

    .line 29
    .line 30
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    const-string v0, "channelId"

    .line 34
    .line 35
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const-string v0, "channelName"

    .line 39
    .line 40
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    const-string v0, "guildName"

    .line 44
    .line 45
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    const-string v0, "deafened"

    .line 49
    .line 50
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 51
    .line 52
    .line 53
    const-string v0, "muted"

    .line 54
    .line 55
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 56
    .line 57
    .line 58
    const-string v0, "connectionQuality"

    .line 59
    .line 60
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 61
    .line 62
    .line 63
    const-string v0, "canGenerateInvite"

    .line 64
    .line 65
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 66
    .line 67
    .line 68
    const-string v0, "channelSelectorResults"

    .line 69
    .line 70
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 71
    .line 72
    .line 73
    sput-object v1, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData$$serializer;->descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    .line 74
    .line 75
    return-void
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
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public childSerializers()[Lkotlinx/serialization/KSerializer;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lkotlinx/serialization/KSerializer<",
            "*>;"
        }
    .end annotation

    .line 1
    const/16 v0, 0xb

    .line 2
    .line 3
    new-array v0, v0, [Lkotlinx/serialization/KSerializer;

    .line 4
    .line 5
    new-instance v1, Lzi/f;

    .line 6
    .line 7
    sget-object v2, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayDataUser$$serializer;->INSTANCE:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayDataUser$$serializer;

    .line 8
    .line 9
    invoke-direct {v1, v2}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    aput-object v1, v0, v2

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    sget-object v2, Lzi/m0;->a:Lzi/m0;

    .line 17
    .line 18
    aput-object v2, v0, v1

    .line 19
    .line 20
    sget-object v1, Lcom/discord/primitives/GuildId$$serializer;->INSTANCE:Lcom/discord/primitives/GuildId$$serializer;

    .line 21
    .line 22
    invoke-static {v1}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const/4 v2, 0x2

    .line 27
    aput-object v1, v0, v2

    .line 28
    .line 29
    const/4 v1, 0x3

    .line 30
    sget-object v2, Lcom/discord/primitives/ChannelId$$serializer;->INSTANCE:Lcom/discord/primitives/ChannelId$$serializer;

    .line 31
    .line 32
    aput-object v2, v0, v1

    .line 33
    .line 34
    sget-object v1, Lzi/a2;->a:Lzi/a2;

    .line 35
    .line 36
    const/4 v2, 0x4

    .line 37
    aput-object v1, v0, v2

    .line 38
    .line 39
    const/4 v2, 0x5

    .line 40
    aput-object v1, v0, v2

    .line 41
    .line 42
    sget-object v1, Lzi/h;->a:Lzi/h;

    .line 43
    .line 44
    const/4 v2, 0x6

    .line 45
    aput-object v1, v0, v2

    .line 46
    .line 47
    const/4 v2, 0x7

    .line 48
    aput-object v1, v0, v2

    .line 49
    .line 50
    sget-object v2, Lcom/discord/mobile_voice_overlay/ConnectionQuality;->Companion:Lcom/discord/mobile_voice_overlay/ConnectionQuality$Companion;

    .line 51
    .line 52
    invoke-virtual {v2}, Lcom/discord/mobile_voice_overlay/ConnectionQuality$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    const/16 v3, 0x8

    .line 57
    .line 58
    aput-object v2, v0, v3

    .line 59
    .line 60
    const/16 v2, 0x9

    .line 61
    .line 62
    aput-object v1, v0, v2

    .line 63
    .line 64
    new-instance v1, Lzi/f;

    .line 65
    .line 66
    sget-object v2, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlaySelectorResult$$serializer;->INSTANCE:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlaySelectorResult$$serializer;

    .line 67
    .line 68
    invoke-direct {v1, v2}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    .line 69
    .line 70
    .line 71
    const/16 v2, 0xa

    .line 72
    .line 73
    aput-object v1, v0, v2

    .line 74
    .line 75
    return-object v0
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
.end method

.method public deserialize(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;
    .locals 23

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual/range {p0 .. p0}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlinx/serialization/encoding/Decoder;->c(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/c;

    move-result-object v0

    invoke-interface {v0}, Lkotlinx/serialization/encoding/c;->y()Z

    move-result v2

    const/16 v3, 0xa

    const/16 v4, 0x9

    const/4 v5, 0x7

    const/4 v6, 0x6

    const/4 v7, 0x5

    const/4 v8, 0x3

    const/16 v9, 0x8

    const/4 v10, 0x4

    const/4 v11, 0x2

    const/4 v12, 0x1

    const/4 v13, 0x0

    const/4 v14, 0x0

    if-eqz v2, :cond_0

    new-instance v2, Lzi/f;

    sget-object v15, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayDataUser$$serializer;->INSTANCE:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayDataUser$$serializer;

    invoke-direct {v2, v15}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    invoke-interface {v0, v1, v13, v2, v14}, Lkotlinx/serialization/encoding/c;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v1, v12}, Lkotlinx/serialization/encoding/c;->k(Lkotlinx/serialization/descriptors/SerialDescriptor;I)I

    move-result v12

    sget-object v13, Lcom/discord/primitives/GuildId$$serializer;->INSTANCE:Lcom/discord/primitives/GuildId$$serializer;

    invoke-interface {v0, v1, v11, v13, v14}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    sget-object v13, Lcom/discord/primitives/ChannelId$$serializer;->INSTANCE:Lcom/discord/primitives/ChannelId$$serializer;

    invoke-interface {v0, v1, v8, v13, v14}, Lkotlinx/serialization/encoding/c;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    invoke-interface {v0, v1, v10}, Lkotlinx/serialization/encoding/c;->t(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;

    move-result-object v10

    invoke-interface {v0, v1, v7}, Lkotlinx/serialization/encoding/c;->t(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v0, v1, v6}, Lkotlinx/serialization/encoding/c;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v6

    invoke-interface {v0, v1, v5}, Lkotlinx/serialization/encoding/c;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v5

    sget-object v13, Lcom/discord/mobile_voice_overlay/ConnectionQuality;->Companion:Lcom/discord/mobile_voice_overlay/ConnectionQuality$Companion;

    invoke-virtual {v13}, Lcom/discord/mobile_voice_overlay/ConnectionQuality$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object v13

    invoke-interface {v0, v1, v9, v13, v14}, Lkotlinx/serialization/encoding/c;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    invoke-interface {v0, v1, v4}, Lkotlinx/serialization/encoding/c;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v4

    new-instance v13, Lzi/f;

    sget-object v15, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlaySelectorResult$$serializer;->INSTANCE:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlaySelectorResult$$serializer;

    invoke-direct {v13, v15}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    invoke-interface {v0, v1, v3, v13, v14}, Lkotlinx/serialization/encoding/c;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const/16 v13, 0x7ff

    move v15, v4

    move-object/from16 v20, v7

    move v7, v12

    move v12, v6

    move/from16 v22, v13

    move v13, v5

    move/from16 v5, v22

    goto/16 :goto_5

    :cond_0
    move/from16 v21, v12

    move v2, v13

    move v15, v2

    move/from16 v16, v15

    move-object v8, v14

    move-object v10, v8

    move-object v11, v10

    move-object v12, v11

    move-object/from16 v17, v12

    move-object/from16 v19, v17

    move-object/from16 v20, v19

    move/from16 v14, v16

    :goto_0
    if-eqz v21, :cond_1

    invoke-interface {v0, v1}, Lkotlinx/serialization/encoding/c;->x(Lkotlinx/serialization/descriptors/SerialDescriptor;)I

    move-result v7

    packed-switch v7, :pswitch_data_0

    new-instance v0, Lwi/n;

    invoke-direct {v0, v7}, Lwi/n;-><init>(I)V

    throw v0

    :pswitch_0
    new-instance v7, Lzi/f;

    sget-object v6, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlaySelectorResult$$serializer;->INSTANCE:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlaySelectorResult$$serializer;

    invoke-direct {v7, v6}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    invoke-interface {v0, v1, v3, v7, v10}, Lkotlinx/serialization/encoding/c;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    or-int/lit16 v13, v13, 0x400

    goto :goto_1

    :pswitch_1
    invoke-interface {v0, v1, v4}, Lkotlinx/serialization/encoding/c;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    or-int/lit16 v13, v13, 0x200

    goto :goto_1

    :pswitch_2
    sget-object v6, Lcom/discord/mobile_voice_overlay/ConnectionQuality;->Companion:Lcom/discord/mobile_voice_overlay/ConnectionQuality$Companion;

    invoke-virtual {v6}, Lcom/discord/mobile_voice_overlay/ConnectionQuality$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object v6

    invoke-interface {v0, v1, v9, v6, v8}, Lkotlinx/serialization/encoding/c;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    or-int/lit16 v13, v13, 0x100

    goto :goto_1

    :pswitch_3
    invoke-interface {v0, v1, v5}, Lkotlinx/serialization/encoding/c;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v14

    or-int/lit16 v13, v13, 0x80

    :goto_1
    const/4 v6, 0x6

    goto :goto_2

    :pswitch_4
    invoke-interface {v0, v1, v6}, Lkotlinx/serialization/encoding/c;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v15

    or-int/lit8 v13, v13, 0x40

    :goto_2
    const/4 v7, 0x5

    goto :goto_0

    :pswitch_5
    const/4 v7, 0x5

    invoke-interface {v0, v1, v7}, Lkotlinx/serialization/encoding/c;->t(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;

    move-result-object v20

    or-int/lit8 v13, v13, 0x20

    goto :goto_0

    :pswitch_6
    const/4 v3, 0x4

    const/4 v7, 0x5

    invoke-interface {v0, v1, v3}, Lkotlinx/serialization/encoding/c;->t(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;

    move-result-object v19

    or-int/lit8 v13, v13, 0x10

    const/16 v3, 0xa

    goto :goto_0

    :pswitch_7
    const/4 v7, 0x5

    sget-object v3, Lcom/discord/primitives/ChannelId$$serializer;->INSTANCE:Lcom/discord/primitives/ChannelId$$serializer;

    const/4 v4, 0x3

    invoke-interface {v0, v1, v4, v3, v11}, Lkotlinx/serialization/encoding/c;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    or-int/lit8 v13, v13, 0x8

    goto :goto_3

    :pswitch_8
    const/4 v4, 0x3

    const/4 v7, 0x5

    sget-object v3, Lcom/discord/primitives/GuildId$$serializer;->INSTANCE:Lcom/discord/primitives/GuildId$$serializer;

    const/4 v4, 0x2

    invoke-interface {v0, v1, v4, v3, v12}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    or-int/lit8 v13, v13, 0x4

    goto :goto_3

    :pswitch_9
    const/4 v3, 0x1

    const/4 v4, 0x2

    const/4 v7, 0x5

    invoke-interface {v0, v1, v3}, Lkotlinx/serialization/encoding/c;->k(Lkotlinx/serialization/descriptors/SerialDescriptor;I)I

    move-result v16

    or-int/lit8 v13, v13, 0x2

    :goto_3
    const/16 v3, 0xa

    const/16 v4, 0x9

    goto :goto_0

    :pswitch_a
    const/4 v4, 0x2

    const/4 v7, 0x5

    new-instance v3, Lzi/f;

    sget-object v4, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayDataUser$$serializer;->INSTANCE:Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayDataUser$$serializer;

    invoke-direct {v3, v4}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    move-object/from16 v4, v17

    const/4 v5, 0x0

    invoke-interface {v0, v1, v5, v3, v4}, Lkotlinx/serialization/encoding/c;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v17

    or-int/lit8 v13, v13, 0x1

    const/16 v3, 0xa

    goto :goto_4

    :pswitch_b
    move-object/from16 v4, v17

    const/4 v5, 0x0

    const/4 v7, 0x5

    move/from16 v21, v5

    :goto_4
    const/16 v4, 0x9

    const/4 v5, 0x7

    goto/16 :goto_0

    :cond_1
    move-object/from16 v4, v17

    move-object v9, v8

    move-object v3, v10

    move-object v8, v11

    move-object v11, v12

    move v5, v13

    move v13, v14

    move v12, v15

    move/from16 v7, v16

    move-object/from16 v10, v19

    move v15, v2

    move-object v2, v4

    :goto_5
    invoke-interface {v0, v1}, Lkotlinx/serialization/encoding/c;->b(Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    new-instance v0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;

    move-object v6, v2

    check-cast v6, Ljava/util/List;

    move-object v1, v11

    check-cast v1, Lcom/discord/primitives/GuildId;

    move-object v2, v8

    check-cast v2, Lcom/discord/primitives/ChannelId;

    move-object v14, v9

    check-cast v14, Lcom/discord/mobile_voice_overlay/ConnectionQuality;

    move-object/from16 v16, v3

    check-cast v16, Ljava/util/List;

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object v4, v0

    move-object v8, v1

    move-object v9, v2

    move-object/from16 v11, v20

    invoke-direct/range {v4 .. v18}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;-><init>(ILjava/util/List;ILcom/discord/primitives/GuildId;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Ljava/lang/String;ZZLcom/discord/mobile_voice_overlay/ConnectionQuality;ZLjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :pswitch_data_0
    .packed-switch -0x1
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
.end method

.method public bridge synthetic deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData$$serializer;->deserialize(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;
    .locals 1

    sget-object v0, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData$$serializer;->descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    return-object v0
.end method

.method public serialize(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlinx/serialization/encoding/Encoder;->c(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/CompositeEncoder;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;->write$Self(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    invoke-interface {p1, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->b(Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    return-void
.end method

.method public bridge synthetic serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;

    invoke-virtual {p0, p1, p2}, Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData$$serializer;->serialize(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;)V

    return-void
.end method

.method public typeParametersSerializers()[Lkotlinx/serialization/KSerializer;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lkotlinx/serialization/KSerializer<",
            "*>;"
        }
    .end annotation

    invoke-static {p0}, Lzi/f0$a;->a(Lzi/f0;)[Lkotlinx/serialization/KSerializer;

    move-result-object v0

    return-object v0
.end method
