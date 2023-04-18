.class public final synthetic Lcom/discord/audio/DiscordAudioManager$WhenMappings;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/audio/DiscordAudioManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = "WhenMappings"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic $EnumSwitchMapping$0:[I

.field public static final synthetic $EnumSwitchMapping$1:[I

.field public static final synthetic $EnumSwitchMapping$2:[I

.field public static final synthetic $EnumSwitchMapping$3:[I

.field public static final synthetic $EnumSwitchMapping$4:[I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    invoke-static {}, Lcom/discord/audio/DiscordAudioManager$DeviceTypes;->values()[Lcom/discord/audio/DiscordAudioManager$DeviceTypes;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    const/4 v1, 0x1

    :try_start_0
    sget-object v2, Lcom/discord/audio/DiscordAudioManager$DeviceTypes;->EARPIECE:Lcom/discord/audio/DiscordAudioManager$DeviceTypes;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aput v1, v0, v2
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 v2, 0x2

    :try_start_1
    sget-object v3, Lcom/discord/audio/DiscordAudioManager$DeviceTypes;->WIRED_HEADSET:Lcom/discord/audio/DiscordAudioManager$DeviceTypes;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aput v2, v0, v3
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    const/4 v3, 0x3

    :try_start_2
    sget-object v4, Lcom/discord/audio/DiscordAudioManager$DeviceTypes;->SPEAKERPHONE:Lcom/discord/audio/DiscordAudioManager$DeviceTypes;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v3, v0, v4
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    const/4 v4, 0x4

    :try_start_3
    sget-object v5, Lcom/discord/audio/DiscordAudioManager$DeviceTypes;->BLUETOOTH_HEADSET:Lcom/discord/audio/DiscordAudioManager$DeviceTypes;

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aput v4, v0, v5
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    :try_start_4
    sget-object v5, Lcom/discord/audio/DiscordAudioManager$DeviceTypes;->INVALID:Lcom/discord/audio/DiscordAudioManager$DeviceTypes;

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    const/4 v6, 0x5

    aput v6, v0, v5
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    :catch_4
    :try_start_5
    sget-object v5, Lcom/discord/audio/DiscordAudioManager$DeviceTypes;->DEFAULT:Lcom/discord/audio/DiscordAudioManager$DeviceTypes;

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    const/4 v6, 0x6

    aput v6, v0, v5
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_5

    :catch_5
    sput-object v0, Lcom/discord/audio/DiscordAudioManager$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-static {}, Lcom/discord/audio/enums/BluetoothProfileConnectionState;->values()[Lcom/discord/audio/enums/BluetoothProfileConnectionState;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_6
    sget-object v5, Lcom/discord/audio/enums/BluetoothProfileConnectionState;->Disconnected:Lcom/discord/audio/enums/BluetoothProfileConnectionState;

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aput v1, v0, v5
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_6

    :catch_6
    :try_start_7
    sget-object v5, Lcom/discord/audio/enums/BluetoothProfileConnectionState;->Connected:Lcom/discord/audio/enums/BluetoothProfileConnectionState;

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aput v2, v0, v5
    :try_end_7
    .catch Ljava/lang/NoSuchFieldError; {:try_start_7 .. :try_end_7} :catch_7

    :catch_7
    :try_start_8
    sget-object v5, Lcom/discord/audio/enums/BluetoothProfileConnectionState;->Connecting:Lcom/discord/audio/enums/BluetoothProfileConnectionState;

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aput v3, v0, v5
    :try_end_8
    .catch Ljava/lang/NoSuchFieldError; {:try_start_8 .. :try_end_8} :catch_8

    :catch_8
    :try_start_9
    sget-object v5, Lcom/discord/audio/enums/BluetoothProfileConnectionState;->Disconnecting:Lcom/discord/audio/enums/BluetoothProfileConnectionState;

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aput v4, v0, v5
    :try_end_9
    .catch Ljava/lang/NoSuchFieldError; {:try_start_9 .. :try_end_9} :catch_9

    :catch_9
    sput-object v0, Lcom/discord/audio/DiscordAudioManager$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-static {}, Lcom/discord/audio/enums/BluetoothHeadsetAudioState;->values()[Lcom/discord/audio/enums/BluetoothHeadsetAudioState;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_a
    sget-object v5, Lcom/discord/audio/enums/BluetoothHeadsetAudioState;->Connected:Lcom/discord/audio/enums/BluetoothHeadsetAudioState;

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aput v1, v0, v5
    :try_end_a
    .catch Ljava/lang/NoSuchFieldError; {:try_start_a .. :try_end_a} :catch_a

    :catch_a
    :try_start_b
    sget-object v5, Lcom/discord/audio/enums/BluetoothHeadsetAudioState;->Disconnected:Lcom/discord/audio/enums/BluetoothHeadsetAudioState;

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aput v2, v0, v5
    :try_end_b
    .catch Ljava/lang/NoSuchFieldError; {:try_start_b .. :try_end_b} :catch_b

    :catch_b
    :try_start_c
    sget-object v5, Lcom/discord/audio/enums/BluetoothHeadsetAudioState;->Connecting:Lcom/discord/audio/enums/BluetoothHeadsetAudioState;

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aput v3, v0, v5
    :try_end_c
    .catch Ljava/lang/NoSuchFieldError; {:try_start_c .. :try_end_c} :catch_c

    :catch_c
    sput-object v0, Lcom/discord/audio/DiscordAudioManager$WhenMappings;->$EnumSwitchMapping$2:[I

    invoke-static {}, Lcom/discord/audio/DiscordAudioManager$BluetoothScoState;->values()[Lcom/discord/audio/DiscordAudioManager$BluetoothScoState;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_d
    sget-object v5, Lcom/discord/audio/DiscordAudioManager$BluetoothScoState;->ON:Lcom/discord/audio/DiscordAudioManager$BluetoothScoState;

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aput v1, v0, v5
    :try_end_d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_d .. :try_end_d} :catch_d

    :catch_d
    :try_start_e
    sget-object v5, Lcom/discord/audio/DiscordAudioManager$BluetoothScoState;->TURNING_ON:Lcom/discord/audio/DiscordAudioManager$BluetoothScoState;

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aput v2, v0, v5
    :try_end_e
    .catch Ljava/lang/NoSuchFieldError; {:try_start_e .. :try_end_e} :catch_e

    :catch_e
    sput-object v0, Lcom/discord/audio/DiscordAudioManager$WhenMappings;->$EnumSwitchMapping$3:[I

    invoke-static {}, Lcom/discord/audio/enums/ScoAudioState;->values()[Lcom/discord/audio/enums/ScoAudioState;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_f
    sget-object v5, Lcom/discord/audio/enums/ScoAudioState;->Connected:Lcom/discord/audio/enums/ScoAudioState;

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aput v1, v0, v5
    :try_end_f
    .catch Ljava/lang/NoSuchFieldError; {:try_start_f .. :try_end_f} :catch_f

    :catch_f
    :try_start_10
    sget-object v1, Lcom/discord/audio/enums/ScoAudioState;->Disconnected:Lcom/discord/audio/enums/ScoAudioState;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v2, v0, v1
    :try_end_10
    .catch Ljava/lang/NoSuchFieldError; {:try_start_10 .. :try_end_10} :catch_10

    :catch_10
    :try_start_11
    sget-object v1, Lcom/discord/audio/enums/ScoAudioState;->Error:Lcom/discord/audio/enums/ScoAudioState;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v3, v0, v1
    :try_end_11
    .catch Ljava/lang/NoSuchFieldError; {:try_start_11 .. :try_end_11} :catch_11

    :catch_11
    :try_start_12
    sget-object v1, Lcom/discord/audio/enums/ScoAudioState;->Connecting:Lcom/discord/audio/enums/ScoAudioState;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v4, v0, v1
    :try_end_12
    .catch Ljava/lang/NoSuchFieldError; {:try_start_12 .. :try_end_12} :catch_12

    :catch_12
    sput-object v0, Lcom/discord/audio/DiscordAudioManager$WhenMappings;->$EnumSwitchMapping$4:[I

    return-void
.end method
