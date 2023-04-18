.class public final Lcom/discord/audio/DiscordAudioManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/audio/DiscordAudioManager$AudioDevice;,
        Lcom/discord/audio/DiscordAudioManager$BluetoothScoState;,
        Lcom/discord/audio/DiscordAudioManager$Companion;,
        Lcom/discord/audio/DiscordAudioManager$DeviceTypes;,
        Lcom/discord/audio/DiscordAudioManager$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b8\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0016\u0018\u0000 \u0092\u00012\u00020\u0001:\u0008\u0093\u0001\u0094\u0001\u0092\u0001\u0095\u0001BS\u0012\u0006\u00107\u001a\u000206\u0012\u0018\u0010:\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0004\u0012\u00020\u000409\u0012\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000409\u0012\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\u000409\u00a2\u0006\u0006\u0008\u0090\u0001\u0010\u0091\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0008\u0010\u0006\u001a\u00020\u0002H\u0002J\u0008\u0010\u0007\u001a\u00020\u0004H\u0002J\u0008\u0010\u0008\u001a\u00020\u0004H\u0002J\u0008\u0010\t\u001a\u00020\u0004H\u0002J\u0010\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0008\u0010\u000e\u001a\u00020\u0004H\u0003J\u0008\u0010\u000f\u001a\u00020\u0002H\u0002J\u0008\u0010\u0010\u001a\u00020\u0004H\u0002J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0008\u0010\u0013\u001a\u00020\u0004H\u0002J\u0008\u0010\u0014\u001a\u00020\u0004H\u0002J\u0016\u0010\u0018\u001a\u00020\u00042\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u0015H\u0002J\u0008\u0010\u0019\u001a\u00020\u0004H\u0002J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0003J\u0010\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH\u0003J\u0012\u0010!\u001a\u00020\u00042\u0008\u0010\u000b\u001a\u0004\u0018\u00010 H\u0003J\u0012\u0010$\u001a\u00020\u00042\u0008\u0010#\u001a\u0004\u0018\u00010\"H\u0003J\u0010\u0010\'\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%H\u0003J\u0010\u0010*\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(H\u0003J\u000e\u0010,\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\nJ\u0006\u0010-\u001a\u00020\u0004J\u0006\u0010.\u001a\u00020\u0004J\u000e\u0010/\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u00102\u001a\u00020\u00042\u0008\u0008\u0001\u00101\u001a\u000200J\u000f\u00105\u001a\u00020\u0004H\u0001\u00a2\u0006\u0004\u00083\u00104R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00087\u00108R)\u0010:\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0004\u0012\u00020\u0004098\u0006\u00a2\u0006\u000c\n\u0004\u0008:\u0010;\u001a\u0004\u0008<\u0010=R#\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004098\u0006\u00a2\u0006\u000c\n\u0004\u0008>\u0010;\u001a\u0004\u0008?\u0010=R#\u0010A\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\u0004098\u0006\u00a2\u0006\u000c\n\u0004\u0008A\u0010;\u001a\u0004\u0008B\u0010=R\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008D\u0010ER\u0014\u0010F\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008F\u0010GR\u0014\u0010H\u001a\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008H\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008K\u0010LR \u0010N\u001a\u00020M8\u0000X\u0081\u0004\u00a2\u0006\u0012\n\u0004\u0008N\u0010O\u0012\u0004\u0008R\u00104\u001a\u0004\u0008P\u0010QR \u0010T\u001a\u00020S8\u0000X\u0081\u0004\u00a2\u0006\u0012\n\u0004\u0008T\u0010U\u0012\u0004\u0008X\u00104\u001a\u0004\u0008V\u0010WR*\u0010Y\u001a\u0004\u0018\u00010\"8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0018\n\u0004\u0008Y\u0010Z\u0012\u0004\u0008_\u00104\u001a\u0004\u0008[\u0010\\\"\u0004\u0008]\u0010^R(\u0010a\u001a\u00020`8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0018\n\u0004\u0008a\u0010b\u0012\u0004\u0008g\u00104\u001a\u0004\u0008c\u0010d\"\u0004\u0008e\u0010fR*\u0010i\u001a\u0004\u0018\u00010h8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0018\n\u0004\u0008i\u0010j\u0012\u0004\u0008o\u00104\u001a\u0004\u0008k\u0010l\"\u0004\u0008m\u0010nR\u0018\u0010q\u001a\u0004\u0018\u00010p8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008q\u0010rR6\u0010t\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u00152\u000c\u0010s\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u00158\u0006@BX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008t\u0010u\u001a\u0004\u0008v\u0010w\"\u0004\u0008x\u0010yR*\u0010z\u001a\u00020\n2\u0006\u0010s\u001a\u00020\n8\u0006@BX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008z\u0010{\u001a\u0004\u0008|\u0010}\"\u0004\u0008~\u0010\u007fR\u001c\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0081\u0001\u0010\u0082\u0001R1\u0010\u0083\u0001\u001a\u00020@2\u0006\u0010s\u001a\u00020@8\u0006@BX\u0086\u000e\u00a2\u0006\u0018\n\u0006\u0008\u0083\u0001\u0010\u0084\u0001\u001a\u0006\u0008\u0085\u0001\u0010\u0086\u0001\"\u0006\u0008\u0087\u0001\u0010\u0088\u0001R\u001c\u0010\u0089\u0001\u001a\u00020@8\u0006\u00a2\u0006\u0010\n\u0006\u0008\u0089\u0001\u0010\u0084\u0001\u001a\u0006\u0008\u008a\u0001\u0010\u0086\u0001R\u0018\u0010\u008b\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\u008b\u0001\u0010{R\u0018\u0010\u008c\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\u008c\u0001\u0010GR\u0018\u0010\u008d\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\u008d\u0001\u0010GR\u0018\u0010\u008e\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\u008e\u0001\u0010GR\u0018\u0010\u008f\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\u008f\u0001\u0010G\u00a8\u0006\u0096\u0001"
    }
    d2 = {
        "Lcom/discord/audio/DiscordAudioManager;",
        "",
        "",
        "on",
        "",
        "setCommunicationModeOnInternal",
        "requestAudioFocus",
        "releaseAudioFocus",
        "startObservingVolumeChanges",
        "stopObservingVolumeChanges",
        "Lcom/discord/audio/DiscordAudioManager$DeviceTypes;",
        "device",
        "isValidOutputDevice",
        "setMicrophoneMute",
        "refreshBluetoothHeadset",
        "hasWiredHeadset",
        "registerAudioFocusListener",
        "setSpeakerphoneOn",
        "activateDevice",
        "startBluetoothSco",
        "stopBluetoothSco",
        "",
        "Lcom/discord/audio/DiscordAudioManager$AudioDevice;",
        "devices",
        "activateDefaultDevice",
        "updateDeviceActivation",
        "Lcom/discord/audio/enums/BluetoothProfileConnectionState$Update;",
        "connectionState",
        "onHeadsetConnectionStateUpdate",
        "Lcom/discord/audio/enums/BluetoothHeadsetAudioState$Update;",
        "audioState",
        "onHeadsetAudioStateUpdate",
        "Landroid/bluetooth/BluetoothDevice;",
        "onActiveDeviceUpdate",
        "Landroid/bluetooth/BluetoothHeadset;",
        "bluetoothHeadset",
        "onHeadsetProxyConnectionUpdate",
        "Lcom/discord/audio/enums/WiredHeadsetState;",
        "wiredHeadsetState",
        "onWiredHeadsetPlug",
        "Lcom/discord/audio/enums/ScoAudioState$Update;",
        "scoAudioStateUpdate",
        "onScoAudioStateUpdate",
        "deviceType",
        "setDevice",
        "makeEarpieceUnavailable",
        "resetEarpieceAvailability",
        "setCommunicationModeOn",
        "",
        "ratio",
        "setMediaVolume",
        "registerHandlers$audio_release",
        "()V",
        "registerHandlers",
        "Landroid/content/Context;",
        "context",
        "Landroid/content/Context;",
        "Lkotlin/Function1;",
        "onAudioDevicesUpdated",
        "Lkotlin/jvm/functions/Function1;",
        "getOnAudioDevicesUpdated",
        "()Lkotlin/jvm/functions/Function1;",
        "onActiveAudioDeviceChanged",
        "getOnActiveAudioDeviceChanged",
        "",
        "onCurrentMediaVolumeChanged",
        "getOnCurrentMediaVolumeChanged",
        "Landroid/media/AudioManager;",
        "audioManager",
        "Landroid/media/AudioManager;",
        "hasEarpiece",
        "Z",
        "instanceLock",
        "Ljava/lang/Object;",
        "Lcom/discord/async_init/AsyncInitThreadChecker;",
        "asyncInitThreadChecker",
        "Lcom/discord/async_init/AsyncInitThreadChecker;",
        "Lcom/discord/audio/bluetooth/BluetoothBroadcastReceiver;",
        "bluetoothBroadcastReceiver",
        "Lcom/discord/audio/bluetooth/BluetoothBroadcastReceiver;",
        "getBluetoothBroadcastReceiver$audio_release",
        "()Lcom/discord/audio/bluetooth/BluetoothBroadcastReceiver;",
        "getBluetoothBroadcastReceiver$audio_release$annotations",
        "Lcom/discord/audio/AudioManagerBroadcastReceiver;",
        "audioManagerBroadcastReceiver",
        "Lcom/discord/audio/AudioManagerBroadcastReceiver;",
        "getAudioManagerBroadcastReceiver$audio_release",
        "()Lcom/discord/audio/AudioManagerBroadcastReceiver;",
        "getAudioManagerBroadcastReceiver$audio_release$annotations",
        "bluetoothHeadsetProfileProxy",
        "Landroid/bluetooth/BluetoothHeadset;",
        "getBluetoothHeadsetProfileProxy$audio_release",
        "()Landroid/bluetooth/BluetoothHeadset;",
        "setBluetoothHeadsetProfileProxy$audio_release",
        "(Landroid/bluetooth/BluetoothHeadset;)V",
        "getBluetoothHeadsetProfileProxy$audio_release$annotations",
        "Lcom/discord/audio/DiscordAudioManager$BluetoothScoState;",
        "bluetoothScoState",
        "Lcom/discord/audio/DiscordAudioManager$BluetoothScoState;",
        "getBluetoothScoState$audio_release",
        "()Lcom/discord/audio/DiscordAudioManager$BluetoothScoState;",
        "setBluetoothScoState$audio_release",
        "(Lcom/discord/audio/DiscordAudioManager$BluetoothScoState;)V",
        "getBluetoothScoState$audio_release$annotations",
        "Landroid/media/AudioManager$OnAudioFocusChangeListener;",
        "audioFocusListener",
        "Landroid/media/AudioManager$OnAudioFocusChangeListener;",
        "getAudioFocusListener$audio_release",
        "()Landroid/media/AudioManager$OnAudioFocusChangeListener;",
        "setAudioFocusListener$audio_release",
        "(Landroid/media/AudioManager$OnAudioFocusChangeListener;)V",
        "getAudioFocusListener$audio_release$annotations",
        "Landroid/media/AudioFocusRequest;",
        "audioFocusRequest",
        "Landroid/media/AudioFocusRequest;",
        "value",
        "audioDevices",
        "Ljava/util/List;",
        "getAudioDevices",
        "()Ljava/util/List;",
        "setAudioDevices",
        "(Ljava/util/List;)V",
        "activeAudioDevice",
        "Lcom/discord/audio/DiscordAudioManager$DeviceTypes;",
        "getActiveAudioDevice",
        "()Lcom/discord/audio/DiscordAudioManager$DeviceTypes;",
        "setActiveAudioDevice",
        "(Lcom/discord/audio/DiscordAudioManager$DeviceTypes;)V",
        "Landroid/database/ContentObserver;",
        "mediaVolumeObserver",
        "Landroid/database/ContentObserver;",
        "currentMediaVolume",
        "I",
        "getCurrentMediaVolume",
        "()I",
        "setCurrentMediaVolume",
        "(I)V",
        "maxMediaVolume",
        "getMaxMediaVolume",
        "requestedAudioDevice",
        "savedIsSpeakerphoneOn",
        "savedIsMicrophoneMute",
        "savedIsBluetoothScoOn",
        "inDiscordRequestedCommunicationMode",
        "<init>",
        "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V",
        "Companion",
        "AudioDevice",
        "BluetoothScoState",
        "DeviceTypes",
        "audio_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final Companion:Lcom/discord/audio/DiscordAudioManager$Companion;

.field private static final DEFAULT_DEVICE_PRIORITIZATION:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/discord/audio/DiscordAudioManager$DeviceTypes;",
            ">;"
        }
    .end annotation
.end field

.field private static final TAG:Ljava/lang/String; = "DiscordAudioManager"


# instance fields
.field private activeAudioDevice:Lcom/discord/audio/DiscordAudioManager$DeviceTypes;

.field private final asyncInitThreadChecker:Lcom/discord/async_init/AsyncInitThreadChecker;

.field private audioDevices:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/discord/audio/DiscordAudioManager$AudioDevice;",
            ">;"
        }
    .end annotation
.end field

.field private audioFocusListener:Landroid/media/AudioManager$OnAudioFocusChangeListener;

.field private audioFocusRequest:Landroid/media/AudioFocusRequest;

.field private final audioManager:Landroid/media/AudioManager;

.field private final audioManagerBroadcastReceiver:Lcom/discord/audio/AudioManagerBroadcastReceiver;

.field private final bluetoothBroadcastReceiver:Lcom/discord/audio/bluetooth/BluetoothBroadcastReceiver;

.field private bluetoothHeadsetProfileProxy:Landroid/bluetooth/BluetoothHeadset;

.field private bluetoothScoState:Lcom/discord/audio/DiscordAudioManager$BluetoothScoState;

.field private final context:Landroid/content/Context;

.field private currentMediaVolume:I

.field private final hasEarpiece:Z

.field private inDiscordRequestedCommunicationMode:Z

.field private final instanceLock:Ljava/lang/Object;

.field private final maxMediaVolume:I

.field private mediaVolumeObserver:Landroid/database/ContentObserver;

.field private final onActiveAudioDeviceChanged:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/discord/audio/DiscordAudioManager$DeviceTypes;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final onAudioDevicesUpdated:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/util/List<",
            "Lcom/discord/audio/DiscordAudioManager$AudioDevice;",
            ">;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final onCurrentMediaVolumeChanged:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private requestedAudioDevice:Lcom/discord/audio/DiscordAudioManager$DeviceTypes;

.field private savedIsBluetoothScoOn:Z

.field private savedIsMicrophoneMute:Z

.field private savedIsSpeakerphoneOn:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/discord/audio/DiscordAudioManager$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/discord/audio/DiscordAudioManager$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/discord/audio/DiscordAudioManager;->Companion:Lcom/discord/audio/DiscordAudioManager$Companion;

    .line 8
    .line 9
    const/4 v0, 0x4

    .line 10
    new-array v0, v0, [Lcom/discord/audio/DiscordAudioManager$DeviceTypes;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    sget-object v2, Lcom/discord/audio/DiscordAudioManager$DeviceTypes;->EARPIECE:Lcom/discord/audio/DiscordAudioManager$DeviceTypes;

    .line 14
    .line 15
    aput-object v2, v0, v1

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    sget-object v2, Lcom/discord/audio/DiscordAudioManager$DeviceTypes;->SPEAKERPHONE:Lcom/discord/audio/DiscordAudioManager$DeviceTypes;

    .line 19
    .line 20
    aput-object v2, v0, v1

    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    sget-object v2, Lcom/discord/audio/DiscordAudioManager$DeviceTypes;->BLUETOOTH_HEADSET:Lcom/discord/audio/DiscordAudioManager$DeviceTypes;

    .line 24
    .line 25
    aput-object v2, v0, v1

    .line 26
    .line 27
    const/4 v1, 0x3

    .line 28
    sget-object v2, Lcom/discord/audio/DiscordAudioManager$DeviceTypes;->WIRED_HEADSET:Lcom/discord/audio/DiscordAudioManager$DeviceTypes;

    .line 29
    .line 30
    aput-object v2, v0, v1

    .line 31
    .line 32
    invoke-static {v0}, Lkotlin/collections/h;->l([Ljava/lang/Object;)Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    sput-object v0, Lcom/discord/audio/DiscordAudioManager;->DEFAULT_DEVICE_PRIORITIZATION:Ljava/util/List;

    .line 37
    .line 38
    return-void
    .line 39
    .line 40
.end method

.method public constructor <init>(Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/util/List<",
            "Lcom/discord/audio/DiscordAudioManager$AudioDevice;",
            ">;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/discord/audio/DiscordAudioManager$DeviceTypes;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onAudioDevicesUpdated"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "onActiveAudioDeviceChanged"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "onCurrentMediaVolumeChanged"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lcom/discord/audio/DiscordAudioManager;->context:Landroid/content/Context;

    .line 25
    .line 26
    iput-object p2, p0, Lcom/discord/audio/DiscordAudioManager;->onAudioDevicesUpdated:Lkotlin/jvm/functions/Function1;

    .line 27
    .line 28
    iput-object p3, p0, Lcom/discord/audio/DiscordAudioManager;->onActiveAudioDeviceChanged:Lkotlin/jvm/functions/Function1;

    .line 29
    .line 30
    iput-object p4, p0, Lcom/discord/audio/DiscordAudioManager;->onCurrentMediaVolumeChanged:Lkotlin/jvm/functions/Function1;

    .line 31
    .line 32
    const-class p2, Landroid/media/AudioManager;

    .line 33
    .line 34
    invoke-static {p1, p2}, Landroidx/core/content/a;->j(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    invoke-static {p2}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    check-cast p2, Landroid/media/AudioManager;

    .line 42
    .line 43
    iput-object p2, p0, Lcom/discord/audio/DiscordAudioManager;->audioManager:Landroid/media/AudioManager;

    .line 44
    .line 45
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    const-string p2, "android.hardware.telephony"

    .line 50
    .line 51
    invoke-virtual {p1, p2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    iput-boolean p1, p0, Lcom/discord/audio/DiscordAudioManager;->hasEarpiece:Z

    .line 56
    .line 57
    iput-object p0, p0, Lcom/discord/audio/DiscordAudioManager;->instanceLock:Ljava/lang/Object;

    .line 58
    .line 59
    new-instance p1, Lcom/discord/async_init/AsyncInitThreadChecker;

    .line 60
    .line 61
    const-string p2, "DiscordAudioManager"

    .line 62
    .line 63
    invoke-direct {p1, p2}, Lcom/discord/async_init/AsyncInitThreadChecker;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    iput-object p1, p0, Lcom/discord/audio/DiscordAudioManager;->asyncInitThreadChecker:Lcom/discord/async_init/AsyncInitThreadChecker;

    .line 67
    .line 68
    new-instance p1, Lcom/discord/audio/bluetooth/BluetoothBroadcastReceiver;

    .line 69
    .line 70
    new-instance p2, Lcom/discord/audio/DiscordAudioManager$bluetoothBroadcastReceiver$1;

    .line 71
    .line 72
    invoke-direct {p2, p0}, Lcom/discord/audio/DiscordAudioManager$bluetoothBroadcastReceiver$1;-><init>(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    new-instance p3, Lcom/discord/audio/DiscordAudioManager$bluetoothBroadcastReceiver$2;

    .line 76
    .line 77
    invoke-direct {p3, p0}, Lcom/discord/audio/DiscordAudioManager$bluetoothBroadcastReceiver$2;-><init>(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    new-instance p4, Lcom/discord/audio/DiscordAudioManager$bluetoothBroadcastReceiver$3;

    .line 81
    .line 82
    invoke-direct {p4, p0}, Lcom/discord/audio/DiscordAudioManager$bluetoothBroadcastReceiver$3;-><init>(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    new-instance v0, Lcom/discord/audio/DiscordAudioManager$bluetoothBroadcastReceiver$4;

    .line 86
    .line 87
    invoke-direct {v0, p0}, Lcom/discord/audio/DiscordAudioManager$bluetoothBroadcastReceiver$4;-><init>(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    invoke-direct {p1, p2, p3, p4, v0}, Lcom/discord/audio/bluetooth/BluetoothBroadcastReceiver;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 91
    .line 92
    .line 93
    iput-object p1, p0, Lcom/discord/audio/DiscordAudioManager;->bluetoothBroadcastReceiver:Lcom/discord/audio/bluetooth/BluetoothBroadcastReceiver;

    .line 94
    .line 95
    new-instance p1, Lcom/discord/audio/AudioManagerBroadcastReceiver;

    .line 96
    .line 97
    new-instance p2, Lcom/discord/audio/DiscordAudioManager$audioManagerBroadcastReceiver$1;

    .line 98
    .line 99
    invoke-direct {p2, p0}, Lcom/discord/audio/DiscordAudioManager$audioManagerBroadcastReceiver$1;-><init>(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    new-instance p3, Lcom/discord/audio/DiscordAudioManager$audioManagerBroadcastReceiver$2;

    .line 103
    .line 104
    invoke-direct {p3, p0}, Lcom/discord/audio/DiscordAudioManager$audioManagerBroadcastReceiver$2;-><init>(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    invoke-direct {p1, p2, p3}, Lcom/discord/audio/AudioManagerBroadcastReceiver;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 108
    .line 109
    .line 110
    iput-object p1, p0, Lcom/discord/audio/DiscordAudioManager;->audioManagerBroadcastReceiver:Lcom/discord/audio/AudioManagerBroadcastReceiver;

    .line 111
    .line 112
    new-instance p1, Landroid/os/Handler;

    .line 113
    .line 114
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 119
    .line 120
    .line 121
    new-instance p2, Lcom/discord/audio/j;

    .line 122
    .line 123
    invoke-direct {p2, p0}, Lcom/discord/audio/j;-><init>(Lcom/discord/audio/DiscordAudioManager;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 127
    .line 128
    .line 129
    sget-object p1, Lcom/discord/audio/DiscordAudioManager$BluetoothScoState;->INVALID:Lcom/discord/audio/DiscordAudioManager$BluetoothScoState;

    .line 130
    .line 131
    iput-object p1, p0, Lcom/discord/audio/DiscordAudioManager;->bluetoothScoState:Lcom/discord/audio/DiscordAudioManager$BluetoothScoState;

    .line 132
    .line 133
    sget-object p1, Lcom/discord/audio/DiscordAudioManager;->Companion:Lcom/discord/audio/DiscordAudioManager$Companion;

    .line 134
    .line 135
    invoke-virtual {p1}, Lcom/discord/audio/DiscordAudioManager$Companion;->getSupportedDevices()Ljava/util/List;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    new-instance p2, Ljava/util/ArrayList;

    .line 140
    .line 141
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 142
    .line 143
    .line 144
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 149
    .line 150
    .line 151
    move-result p3

    .line 152
    if-eqz p3, :cond_1

    .line 153
    .line 154
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p3

    .line 158
    move-object v0, p3

    .line 159
    check-cast v0, Lcom/discord/audio/DiscordAudioManager$AudioDevice;

    .line 160
    .line 161
    invoke-virtual {v0}, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->getType()Lcom/discord/audio/DiscordAudioManager$DeviceTypes;

    .line 162
    .line 163
    .line 164
    move-result-object p3

    .line 165
    sget-object p4, Lcom/discord/audio/DiscordAudioManager$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 166
    .line 167
    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    .line 168
    .line 169
    .line 170
    move-result p3

    .line 171
    aget p3, p4, p3

    .line 172
    .line 173
    packed-switch p3, :pswitch_data_0

    .line 174
    .line 175
    .line 176
    new-instance p1, Llf/q;

    .line 177
    .line 178
    invoke-direct {p1}, Llf/q;-><init>()V

    .line 179
    .line 180
    .line 181
    throw p1

    .line 182
    :pswitch_0
    const/4 p3, 0x0

    .line 183
    goto :goto_1

    .line 184
    :pswitch_1
    const/4 v1, 0x0

    .line 185
    const/4 v2, 0x0

    .line 186
    const/4 v3, 0x0

    .line 187
    const/4 v4, 0x0

    .line 188
    const/16 v5, 0xf

    .line 189
    .line 190
    const/4 v6, 0x0

    .line 191
    invoke-static/range {v0 .. v6}, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->copy$default(Lcom/discord/audio/DiscordAudioManager$AudioDevice;Lcom/discord/audio/DiscordAudioManager$DeviceTypes;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/discord/audio/DiscordAudioManager$AudioDevice;

    .line 192
    .line 193
    .line 194
    move-result-object p3

    .line 195
    goto :goto_1

    .line 196
    :pswitch_2
    const/4 v1, 0x0

    .line 197
    const/4 v2, 0x1

    .line 198
    const/4 v3, 0x0

    .line 199
    const/4 v4, 0x0

    .line 200
    const/16 v5, 0xd

    .line 201
    .line 202
    const/4 v6, 0x0

    .line 203
    invoke-static/range {v0 .. v6}, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->copy$default(Lcom/discord/audio/DiscordAudioManager$AudioDevice;Lcom/discord/audio/DiscordAudioManager$DeviceTypes;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/discord/audio/DiscordAudioManager$AudioDevice;

    .line 204
    .line 205
    .line 206
    move-result-object p3

    .line 207
    goto :goto_1

    .line 208
    :pswitch_3
    const/4 v1, 0x0

    .line 209
    invoke-direct {p0}, Lcom/discord/audio/DiscordAudioManager;->hasWiredHeadset()Z

    .line 210
    .line 211
    .line 212
    move-result v2

    .line 213
    const/4 v3, 0x0

    .line 214
    const/4 v4, 0x0

    .line 215
    const/16 v5, 0xd

    .line 216
    .line 217
    const/4 v6, 0x0

    .line 218
    invoke-static/range {v0 .. v6}, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->copy$default(Lcom/discord/audio/DiscordAudioManager$AudioDevice;Lcom/discord/audio/DiscordAudioManager$DeviceTypes;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/discord/audio/DiscordAudioManager$AudioDevice;

    .line 219
    .line 220
    .line 221
    move-result-object p3

    .line 222
    goto :goto_1

    .line 223
    :pswitch_4
    const/4 v1, 0x0

    .line 224
    iget-boolean v2, p0, Lcom/discord/audio/DiscordAudioManager;->hasEarpiece:Z

    .line 225
    .line 226
    const/4 v3, 0x0

    .line 227
    const/4 v4, 0x0

    .line 228
    const/16 v5, 0xd

    .line 229
    .line 230
    const/4 v6, 0x0

    .line 231
    invoke-static/range {v0 .. v6}, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->copy$default(Lcom/discord/audio/DiscordAudioManager$AudioDevice;Lcom/discord/audio/DiscordAudioManager$DeviceTypes;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/discord/audio/DiscordAudioManager$AudioDevice;

    .line 232
    .line 233
    .line 234
    move-result-object p3

    .line 235
    :goto_1
    if-eqz p3, :cond_0

    .line 236
    .line 237
    invoke-interface {p2, p3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    goto :goto_0

    .line 241
    :cond_1
    iput-object p2, p0, Lcom/discord/audio/DiscordAudioManager;->audioDevices:Ljava/util/List;

    .line 242
    .line 243
    sget-object p1, Lcom/discord/audio/DiscordAudioManager$DeviceTypes;->INVALID:Lcom/discord/audio/DiscordAudioManager$DeviceTypes;

    .line 244
    .line 245
    iput-object p1, p0, Lcom/discord/audio/DiscordAudioManager;->activeAudioDevice:Lcom/discord/audio/DiscordAudioManager$DeviceTypes;

    .line 246
    .line 247
    iget-object p1, p0, Lcom/discord/audio/DiscordAudioManager;->audioManager:Landroid/media/AudioManager;

    .line 248
    .line 249
    const/4 p2, 0x3

    .line 250
    invoke-virtual {p1, p2}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I

    .line 251
    .line 252
    .line 253
    move-result p1

    .line 254
    iput p1, p0, Lcom/discord/audio/DiscordAudioManager;->maxMediaVolume:I

    .line 255
    .line 256
    sget-object p1, Lcom/discord/audio/DiscordAudioManager$DeviceTypes;->DEFAULT:Lcom/discord/audio/DiscordAudioManager$DeviceTypes;

    .line 257
    .line 258
    iput-object p1, p0, Lcom/discord/audio/DiscordAudioManager;->requestedAudioDevice:Lcom/discord/audio/DiscordAudioManager$DeviceTypes;

    .line 259
    .line 260
    return-void

    .line 261
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
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
.end method

.method private static final _init_$lambda$0(Lcom/discord/audio/DiscordAudioManager;)V
    .locals 1

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/discord/audio/DiscordAudioManager;->registerHandlers$audio_release()V

    .line 7
    .line 8
    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method

.method public static synthetic a(Lcom/discord/audio/DiscordAudioManager;I)V
    .locals 0

    invoke-static {p0, p1}, Lcom/discord/audio/DiscordAudioManager;->registerAudioFocusListener$lambda$22(Lcom/discord/audio/DiscordAudioManager;I)V

    return-void
.end method

.method public static final synthetic access$getAudioManager$p(Lcom/discord/audio/DiscordAudioManager;)Landroid/media/AudioManager;
    .locals 0

    iget-object p0, p0, Lcom/discord/audio/DiscordAudioManager;->audioManager:Landroid/media/AudioManager;

    return-object p0
.end method

.method public static final synthetic access$getDEFAULT_DEVICE_PRIORITIZATION$cp()Ljava/util/List;
    .locals 1

    sget-object v0, Lcom/discord/audio/DiscordAudioManager;->DEFAULT_DEVICE_PRIORITIZATION:Ljava/util/List;

    return-object v0
.end method

.method public static final synthetic access$onActiveDeviceUpdate(Lcom/discord/audio/DiscordAudioManager;Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/discord/audio/DiscordAudioManager;->onActiveDeviceUpdate(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public static final synthetic access$onHeadsetAudioStateUpdate(Lcom/discord/audio/DiscordAudioManager;Lcom/discord/audio/enums/BluetoothHeadsetAudioState$Update;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/discord/audio/DiscordAudioManager;->onHeadsetAudioStateUpdate(Lcom/discord/audio/enums/BluetoothHeadsetAudioState$Update;)V

    return-void
.end method

.method public static final synthetic access$onHeadsetConnectionStateUpdate(Lcom/discord/audio/DiscordAudioManager;Lcom/discord/audio/enums/BluetoothProfileConnectionState$Update;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/discord/audio/DiscordAudioManager;->onHeadsetConnectionStateUpdate(Lcom/discord/audio/enums/BluetoothProfileConnectionState$Update;)V

    return-void
.end method

.method public static final synthetic access$onHeadsetProxyConnectionUpdate(Lcom/discord/audio/DiscordAudioManager;Landroid/bluetooth/BluetoothHeadset;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/discord/audio/DiscordAudioManager;->onHeadsetProxyConnectionUpdate(Landroid/bluetooth/BluetoothHeadset;)V

    return-void
.end method

.method public static final synthetic access$onScoAudioStateUpdate(Lcom/discord/audio/DiscordAudioManager;Lcom/discord/audio/enums/ScoAudioState$Update;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/discord/audio/DiscordAudioManager;->onScoAudioStateUpdate(Lcom/discord/audio/enums/ScoAudioState$Update;)V

    return-void
.end method

.method public static final synthetic access$onWiredHeadsetPlug(Lcom/discord/audio/DiscordAudioManager;Lcom/discord/audio/enums/WiredHeadsetState;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/discord/audio/DiscordAudioManager;->onWiredHeadsetPlug(Lcom/discord/audio/enums/WiredHeadsetState;)V

    return-void
.end method

.method public static final synthetic access$setCurrentMediaVolume(Lcom/discord/audio/DiscordAudioManager;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/discord/audio/DiscordAudioManager;->setCurrentMediaVolume(I)V

    return-void
.end method

.method private final activateDefaultDevice(Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/discord/audio/DiscordAudioManager$AudioDevice;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->instanceLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/discord/audio/DiscordAudioManager;->DEFAULT_DEVICE_PRIORITIZATION:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    invoke-interface {v1, v2}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :cond_0
    invoke-interface {v1}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    move-object v3, v2

    .line 25
    check-cast v3, Lcom/discord/audio/DiscordAudioManager$DeviceTypes;

    .line 26
    .line 27
    invoke-virtual {v3}, Lcom/discord/audio/DiscordAudioManager$DeviceTypes;->getValue()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    check-cast v3, Lcom/discord/audio/DiscordAudioManager$AudioDevice;

    .line 36
    .line 37
    invoke-virtual {v3}, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->isAvailable()Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    const/4 v2, 0x0

    .line 45
    :goto_0
    check-cast v2, Lcom/discord/audio/DiscordAudioManager$DeviceTypes;

    .line 46
    .line 47
    if-nez v2, :cond_2

    .line 48
    .line 49
    sget-object v2, Lcom/discord/audio/DiscordAudioManager$DeviceTypes;->SPEAKERPHONE:Lcom/discord/audio/DiscordAudioManager$DeviceTypes;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    :cond_2
    monitor-exit v0

    .line 52
    sget-object v3, Lcom/discord/logging/Log;->INSTANCE:Lcom/discord/logging/Log;

    .line 53
    .line 54
    const-string v4, "DiscordAudioManager"

    .line 55
    .line 56
    new-instance p1, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 59
    .line 60
    .line 61
    const-string v0, "Default device to activate: "

    .line 62
    .line 63
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    const/4 v6, 0x0

    .line 74
    const/4 v7, 0x4

    .line 75
    const/4 v8, 0x0

    .line 76
    invoke-static/range {v3 .. v8}, Lcom/discord/logging/Log;->i$default(Lcom/discord/logging/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    invoke-direct {p0, v2}, Lcom/discord/audio/DiscordAudioManager;->activateDevice(Lcom/discord/audio/DiscordAudioManager$DeviceTypes;)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :catchall_0
    move-exception p1

    .line 84
    monitor-exit v0

    .line 85
    throw p1
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
.end method

.method private final activateDevice(Lcom/discord/audio/DiscordAudioManager$DeviceTypes;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->instanceLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lcom/discord/audio/DiscordAudioManager;->inDiscordRequestedCommunicationMode:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    xor-int/2addr v1, v2

    .line 8
    monitor-exit v0

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    sget-object v3, Lcom/discord/logging/Log;->INSTANCE:Lcom/discord/logging/Log;

    .line 12
    .line 13
    const-string v4, "DiscordAudioManager"

    .line 14
    .line 15
    const-string v5, "Unable to activate audio output outside Discord-requested communication mode"

    .line 16
    .line 17
    const/4 v6, 0x0

    .line 18
    const/4 v7, 0x4

    .line 19
    const/4 v8, 0x0

    .line 20
    invoke-static/range {v3 .. v8}, Lcom/discord/logging/Log;->w$default(Lcom/discord/logging/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    sget-object v0, Lcom/discord/audio/DiscordAudioManager$DeviceTypes;->BLUETOOTH_HEADSET:Lcom/discord/audio/DiscordAudioManager$DeviceTypes;

    .line 25
    .line 26
    if-ne p1, v0, :cond_1

    .line 27
    .line 28
    invoke-direct {p0}, Lcom/discord/audio/DiscordAudioManager;->startBluetoothSco()V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-direct {p0}, Lcom/discord/audio/DiscordAudioManager;->stopBluetoothSco()V

    .line 33
    .line 34
    .line 35
    :goto_0
    sget-object v0, Lcom/discord/audio/DiscordAudioManager$DeviceTypes;->SPEAKERPHONE:Lcom/discord/audio/DiscordAudioManager$DeviceTypes;

    .line 36
    .line 37
    if-ne p1, v0, :cond_2

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    const/4 v2, 0x0

    .line 41
    :goto_1
    invoke-direct {p0, v2}, Lcom/discord/audio/DiscordAudioManager;->setSpeakerphoneOn(Z)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->instanceLock:Ljava/lang/Object;

    .line 45
    .line 46
    monitor-enter v0

    .line 47
    :try_start_1
    invoke-direct {p0, p1}, Lcom/discord/audio/DiscordAudioManager;->setActiveAudioDevice(Lcom/discord/audio/DiscordAudioManager$DeviceTypes;)V

    .line 48
    .line 49
    .line 50
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    .line 52
    monitor-exit v0

    .line 53
    sget-object v2, Lcom/discord/logging/Log;->INSTANCE:Lcom/discord/logging/Log;

    .line 54
    .line 55
    const-string v3, "DiscordAudioManager"

    .line 56
    .line 57
    new-instance v0, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 60
    .line 61
    .line 62
    const-string v1, "Activated device: "

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    const/4 v5, 0x0

    .line 75
    const/4 v6, 0x4

    .line 76
    const/4 v7, 0x0

    .line 77
    invoke-static/range {v2 .. v7}, Lcom/discord/logging/Log;->i$default(Lcom/discord/logging/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :catchall_0
    move-exception p1

    .line 82
    monitor-exit v0

    .line 83
    throw p1

    .line 84
    :catchall_1
    move-exception p1

    .line 85
    monitor-exit v0

    .line 86
    throw p1
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
.end method

.method public static synthetic b(Lcom/discord/audio/DiscordAudioManager;)V
    .locals 0

    invoke-static {p0}, Lcom/discord/audio/DiscordAudioManager;->_init_$lambda$0(Lcom/discord/audio/DiscordAudioManager;)V

    return-void
.end method

.method public static synthetic getAudioFocusListener$audio_release$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getAudioManagerBroadcastReceiver$audio_release$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getBluetoothBroadcastReceiver$audio_release$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getBluetoothHeadsetProfileProxy$audio_release$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getBluetoothScoState$audio_release$annotations()V
    .locals 0

    return-void
.end method

.method private final hasWiredHeadset()Z
    .locals 1

    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->audioManager:Landroid/media/AudioManager;

    invoke-virtual {v0}, Landroid/media/AudioManager;->isWiredHeadsetOn()Z

    move-result v0

    return v0
.end method

.method private final isValidOutputDevice(Lcom/discord/audio/DiscordAudioManager$DeviceTypes;)Z
    .locals 1

    .line 1
    sget-object v0, Lcom/discord/audio/DiscordAudioManager$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    aget p1, v0, p1

    .line 8
    .line 9
    packed-switch p1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance p1, Llf/q;

    .line 13
    .line 14
    invoke-direct {p1}, Llf/q;-><init>()V

    .line 15
    .line 16
    .line 17
    throw p1

    .line 18
    :pswitch_0
    const/4 p1, 0x0

    .line 19
    goto :goto_0

    .line 20
    :pswitch_1
    const/4 p1, 0x1

    .line 21
    :goto_0
    return p1

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method

.method private final onActiveDeviceUpdate(Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/discord/audio/DiscordAudioManager;->updateDeviceActivation()V

    :cond_0
    return-void
.end method

.method private final onHeadsetAudioStateUpdate(Lcom/discord/audio/enums/BluetoothHeadsetAudioState$Update;)V
    .locals 17
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Lcom/discord/audio/enums/BluetoothHeadsetAudioState$Update;->getCurrent()Lcom/discord/audio/enums/BluetoothHeadsetAudioState;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lcom/discord/audio/enums/BluetoothHeadsetAudioState;->Disconnected:Lcom/discord/audio/enums/BluetoothHeadsetAudioState;

    .line 10
    .line 11
    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/discord/audio/enums/BluetoothHeadsetAudioState$Update;->getDevice()Landroid/bluetooth/BluetoothDevice;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    sget-object v3, Lcom/discord/logging/Log;->INSTANCE:Lcom/discord/logging/Log;

    .line 16
    .line 17
    const-string v4, "DiscordAudioManager"

    .line 18
    .line 19
    const/4 v9, 0x0

    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    invoke-virtual {v2}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    move-object v5, v9

    .line 28
    :goto_0
    new-instance v6, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    const-string v7, "[onHeadsetAudioStateChanged] state: "

    .line 34
    .line 35
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v7, ", device: "

    .line 42
    .line 43
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    const/4 v6, 0x0

    .line 54
    const/4 v7, 0x4

    .line 55
    const/4 v8, 0x0

    .line 56
    invoke-static/range {v3 .. v8}, Lcom/discord/logging/Log;->i$default(Lcom/discord/logging/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    sget-object v3, Lcom/discord/audio/DiscordAudioManager$WhenMappings;->$EnumSwitchMapping$2:[I

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    aget v0, v3, v0

    .line 66
    .line 67
    const/4 v3, 0x1

    .line 68
    if-eq v0, v3, :cond_3

    .line 69
    .line 70
    const/4 v2, 0x2

    .line 71
    if-eq v0, v2, :cond_2

    .line 72
    .line 73
    goto :goto_5

    .line 74
    :cond_2
    invoke-direct/range {p0 .. p0}, Lcom/discord/audio/DiscordAudioManager;->updateDeviceActivation()V

    .line 75
    .line 76
    .line 77
    goto :goto_5

    .line 78
    :cond_3
    iget-object v3, v1, Lcom/discord/audio/DiscordAudioManager;->instanceLock:Ljava/lang/Object;

    .line 79
    .line 80
    monitor-enter v3

    .line 81
    :try_start_0
    iget-object v0, v1, Lcom/discord/audio/DiscordAudioManager;->audioDevices:Ljava/util/List;

    .line 82
    .line 83
    new-instance v4, Ljava/util/ArrayList;

    .line 84
    .line 85
    const/16 v5, 0xa

    .line 86
    .line 87
    invoke-static {v0, v5}, Lkotlin/collections/h;->t(Ljava/lang/Iterable;I)I

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 92
    .line 93
    .line 94
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v5

    .line 102
    if-eqz v5, :cond_7

    .line 103
    .line 104
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    move-object v10, v5

    .line 109
    check-cast v10, Lcom/discord/audio/DiscordAudioManager$AudioDevice;

    .line 110
    .line 111
    invoke-virtual {v10}, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->getType()Lcom/discord/audio/DiscordAudioManager$DeviceTypes;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    sget-object v6, Lcom/discord/audio/DiscordAudioManager$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 116
    .line 117
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 118
    .line 119
    .line 120
    move-result v5

    .line 121
    aget v5, v6, v5

    .line 122
    .line 123
    const/4 v6, 0x4

    .line 124
    if-ne v5, v6, :cond_6

    .line 125
    .line 126
    const/4 v11, 0x0

    .line 127
    const/4 v12, 0x1

    .line 128
    if-eqz v2, :cond_4

    .line 129
    .line 130
    invoke-virtual {v2}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v5

    .line 134
    move-object v13, v5

    .line 135
    goto :goto_2

    .line 136
    :cond_4
    move-object v13, v9

    .line 137
    :goto_2
    if-eqz v2, :cond_5

    .line 138
    .line 139
    invoke-virtual {v2}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    move-object v14, v5

    .line 144
    goto :goto_3

    .line 145
    :cond_5
    move-object v14, v9

    .line 146
    :goto_3
    const/4 v15, 0x1

    .line 147
    const/16 v16, 0x0

    .line 148
    .line 149
    invoke-static/range {v10 .. v16}, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->copy$default(Lcom/discord/audio/DiscordAudioManager$AudioDevice;Lcom/discord/audio/DiscordAudioManager$DeviceTypes;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/discord/audio/DiscordAudioManager$AudioDevice;

    .line 150
    .line 151
    .line 152
    move-result-object v5

    .line 153
    goto :goto_4

    .line 154
    :cond_6
    const/4 v11, 0x0

    .line 155
    const/4 v12, 0x0

    .line 156
    const/4 v13, 0x0

    .line 157
    const/4 v14, 0x0

    .line 158
    const/16 v15, 0xf

    .line 159
    .line 160
    const/16 v16, 0x0

    .line 161
    .line 162
    invoke-static/range {v10 .. v16}, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->copy$default(Lcom/discord/audio/DiscordAudioManager$AudioDevice;Lcom/discord/audio/DiscordAudioManager$DeviceTypes;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/discord/audio/DiscordAudioManager$AudioDevice;

    .line 163
    .line 164
    .line 165
    move-result-object v5

    .line 166
    :goto_4
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    goto :goto_1

    .line 170
    :cond_7
    invoke-direct {v1, v4}, Lcom/discord/audio/DiscordAudioManager;->setAudioDevices(Ljava/util/List;)V

    .line 171
    .line 172
    .line 173
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 174
    .line 175
    monitor-exit v3

    .line 176
    :goto_5
    return-void

    .line 177
    :catchall_0
    move-exception v0

    .line 178
    monitor-exit v3

    .line 179
    throw v0
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
.end method

.method private final onHeadsetConnectionStateUpdate(Lcom/discord/audio/enums/BluetoothProfileConnectionState$Update;)V
    .locals 18
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Lcom/discord/audio/enums/BluetoothProfileConnectionState$Update;->getCurrent()Lcom/discord/audio/enums/BluetoothProfileConnectionState;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lcom/discord/audio/enums/BluetoothProfileConnectionState;->Disconnected:Lcom/discord/audio/enums/BluetoothProfileConnectionState;

    .line 10
    .line 11
    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/discord/audio/enums/BluetoothProfileConnectionState$Update;->getDevice()Landroid/bluetooth/BluetoothDevice;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    sget-object v9, Lcom/discord/logging/Log;->INSTANCE:Lcom/discord/logging/Log;

    .line 16
    .line 17
    const-string v4, "DiscordAudioManager"

    .line 18
    .line 19
    const/4 v10, 0x0

    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    invoke-virtual {v2}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    move-object v3, v10

    .line 28
    :goto_0
    new-instance v5, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    const-string v6, "[onHeadsetConnectionStateChanged] state: "

    .line 34
    .line 35
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v6, ", device: "

    .line 42
    .line 43
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    const/4 v6, 0x0

    .line 54
    const/4 v7, 0x4

    .line 55
    const/4 v8, 0x0

    .line 56
    move-object v3, v9

    .line 57
    invoke-static/range {v3 .. v8}, Lcom/discord/logging/Log;->i$default(Lcom/discord/logging/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    sget-object v3, Lcom/discord/audio/DiscordAudioManager$WhenMappings;->$EnumSwitchMapping$1:[I

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    aget v3, v3, v4

    .line 67
    .line 68
    const/4 v4, 0x1

    .line 69
    if-eq v3, v4, :cond_5

    .line 70
    .line 71
    const/4 v2, 0x2

    .line 72
    if-eq v3, v2, :cond_3

    .line 73
    .line 74
    const/4 v2, 0x3

    .line 75
    if-eq v3, v2, :cond_2

    .line 76
    .line 77
    const/4 v2, 0x4

    .line 78
    if-eq v3, v2, :cond_2

    .line 79
    .line 80
    goto/16 :goto_2

    .line 81
    .line 82
    :cond_2
    const-string v4, "DiscordAudioManager"

    .line 83
    .line 84
    new-instance v2, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 87
    .line 88
    .line 89
    const-string v3, "[onHeadsetConnectionStateChanged] "

    .line 90
    .line 91
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    const-string v0, "..."

    .line 98
    .line 99
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    const/4 v6, 0x0

    .line 107
    const/4 v7, 0x4

    .line 108
    const/4 v8, 0x0

    .line 109
    move-object v3, v9

    .line 110
    invoke-static/range {v3 .. v8}, Lcom/discord/logging/Log;->i$default(Lcom/discord/logging/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    goto/16 :goto_2

    .line 114
    .line 115
    :cond_3
    iget-object v2, v1, Lcom/discord/audio/DiscordAudioManager;->instanceLock:Ljava/lang/Object;

    .line 116
    .line 117
    monitor-enter v2

    .line 118
    :try_start_0
    iget-object v0, v1, Lcom/discord/audio/DiscordAudioManager;->activeAudioDevice:Lcom/discord/audio/DiscordAudioManager$DeviceTypes;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 119
    .line 120
    monitor-exit v2

    .line 121
    sget-object v2, Lcom/discord/audio/DiscordAudioManager$DeviceTypes;->BLUETOOTH_HEADSET:Lcom/discord/audio/DiscordAudioManager$DeviceTypes;

    .line 122
    .line 123
    if-ne v0, v2, :cond_4

    .line 124
    .line 125
    invoke-direct/range {p0 .. p0}, Lcom/discord/audio/DiscordAudioManager;->refreshBluetoothHeadset()V

    .line 126
    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_4
    invoke-direct/range {p0 .. p0}, Lcom/discord/audio/DiscordAudioManager;->updateDeviceActivation()V

    .line 130
    .line 131
    .line 132
    goto :goto_2

    .line 133
    :catchall_0
    move-exception v0

    .line 134
    move-object v3, v0

    .line 135
    monitor-exit v2

    .line 136
    throw v3

    .line 137
    :cond_5
    iget-object v3, v1, Lcom/discord/audio/DiscordAudioManager;->instanceLock:Ljava/lang/Object;

    .line 138
    .line 139
    monitor-enter v3

    .line 140
    :try_start_1
    iget-object v0, v1, Lcom/discord/audio/DiscordAudioManager;->audioDevices:Ljava/util/List;

    .line 141
    .line 142
    new-instance v4, Ljava/util/ArrayList;

    .line 143
    .line 144
    const/16 v5, 0xa

    .line 145
    .line 146
    invoke-static {v0, v5}, Lkotlin/collections/h;->t(Ljava/lang/Iterable;I)I

    .line 147
    .line 148
    .line 149
    move-result v5

    .line 150
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 151
    .line 152
    .line 153
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 158
    .line 159
    .line 160
    move-result v5

    .line 161
    if-eqz v5, :cond_6

    .line 162
    .line 163
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v5

    .line 167
    move-object v11, v5

    .line 168
    check-cast v11, Lcom/discord/audio/DiscordAudioManager$AudioDevice;

    .line 169
    .line 170
    const/4 v12, 0x0

    .line 171
    const/4 v13, 0x0

    .line 172
    const/4 v14, 0x0

    .line 173
    const/4 v15, 0x0

    .line 174
    const/16 v16, 0xf

    .line 175
    .line 176
    const/16 v17, 0x0

    .line 177
    .line 178
    invoke-static/range {v11 .. v17}, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->copy$default(Lcom/discord/audio/DiscordAudioManager$AudioDevice;Lcom/discord/audio/DiscordAudioManager$DeviceTypes;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/discord/audio/DiscordAudioManager$AudioDevice;

    .line 179
    .line 180
    .line 181
    move-result-object v5

    .line 182
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 183
    .line 184
    .line 185
    goto :goto_1

    .line 186
    :cond_6
    monitor-exit v3

    .line 187
    sget-object v0, Lcom/discord/audio/DiscordAudioManager$DeviceTypes;->BLUETOOTH_HEADSET:Lcom/discord/audio/DiscordAudioManager$DeviceTypes;

    .line 188
    .line 189
    invoke-virtual {v0}, Lcom/discord/audio/DiscordAudioManager$DeviceTypes;->getValue()I

    .line 190
    .line 191
    .line 192
    move-result v3

    .line 193
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v3

    .line 197
    check-cast v3, Lcom/discord/audio/DiscordAudioManager$AudioDevice;

    .line 198
    .line 199
    invoke-virtual {v3}, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->getId()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v3

    .line 203
    if-eqz v3, :cond_8

    .line 204
    .line 205
    if-eqz v2, :cond_7

    .line 206
    .line 207
    invoke-virtual {v2}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v10

    .line 211
    :cond_7
    invoke-virtual {v0}, Lcom/discord/audio/DiscordAudioManager$DeviceTypes;->getValue()I

    .line 212
    .line 213
    .line 214
    move-result v0

    .line 215
    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    check-cast v0, Lcom/discord/audio/DiscordAudioManager$AudioDevice;

    .line 220
    .line 221
    invoke-virtual {v0}, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->getId()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    invoke-static {v10, v0}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result v0

    .line 229
    if-eqz v0, :cond_8

    .line 230
    .line 231
    invoke-direct/range {p0 .. p0}, Lcom/discord/audio/DiscordAudioManager;->updateDeviceActivation()V

    .line 232
    .line 233
    .line 234
    :cond_8
    :goto_2
    return-void

    .line 235
    :catchall_1
    move-exception v0

    .line 236
    monitor-exit v3

    .line 237
    throw v0
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
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
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
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
.end method

.method private final onHeadsetProxyConnectionUpdate(Landroid/bluetooth/BluetoothHeadset;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/audio/DiscordAudioManager;->bluetoothHeadsetProfileProxy:Landroid/bluetooth/BluetoothHeadset;

    return-void
.end method

.method private final onScoAudioStateUpdate(Lcom/discord/audio/enums/ScoAudioState$Update;)V
    .locals 10

    .line 1
    sget-object v6, Lcom/discord/logging/Log;->INSTANCE:Lcom/discord/logging/Log;

    .line 2
    .line 3
    const-string v1, "DiscordAudioManager"

    .line 4
    .line 5
    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->bluetoothScoState:Lcom/discord/audio/DiscordAudioManager$BluetoothScoState;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/discord/audio/DiscordAudioManager;->audioManager:Landroid/media/AudioManager;

    .line 8
    .line 9
    invoke-virtual {v2}, Landroid/media/AudioManager;->isBluetoothScoOn()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    new-instance v3, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string v4, "[onScoAudioStateUpdate] scoAudioStateUpdate = "

    .line 19
    .line 20
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v4, ", bluetoothScoState="

    .line 27
    .line 28
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v0, ", isBluetoothScoOn="

    .line 35
    .line 36
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    const/4 v3, 0x0

    .line 47
    const/4 v4, 0x4

    .line 48
    const/4 v5, 0x0

    .line 49
    move-object v0, v6

    .line 50
    invoke-static/range {v0 .. v5}, Lcom/discord/logging/Log;->i$default(Lcom/discord/logging/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Lcom/discord/audio/enums/ScoAudioState$Update;->getCurrent()Lcom/discord/audio/enums/ScoAudioState;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    sget-object v0, Lcom/discord/audio/DiscordAudioManager$WhenMappings;->$EnumSwitchMapping$4:[I

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    aget p1, v0, p1

    .line 64
    .line 65
    const/4 v0, 0x1

    .line 66
    if-eq p1, v0, :cond_5

    .line 67
    .line 68
    const/4 v1, 0x2

    .line 69
    if-eq p1, v1, :cond_0

    .line 70
    .line 71
    goto/16 :goto_2

    .line 72
    .line 73
    :cond_0
    iget-object p1, p0, Lcom/discord/audio/DiscordAudioManager;->bluetoothScoState:Lcom/discord/audio/DiscordAudioManager$BluetoothScoState;

    .line 74
    .line 75
    invoke-direct {p0}, Lcom/discord/audio/DiscordAudioManager;->stopBluetoothSco()V

    .line 76
    .line 77
    .line 78
    sget-object v2, Lcom/discord/audio/DiscordAudioManager$WhenMappings;->$EnumSwitchMapping$3:[I

    .line 79
    .line 80
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    aget p1, v2, p1

    .line 85
    .line 86
    if-eq p1, v0, :cond_4

    .line 87
    .line 88
    if-eq p1, v1, :cond_1

    .line 89
    .line 90
    goto/16 :goto_2

    .line 91
    .line 92
    :cond_1
    const-string v1, "DiscordAudioManager"

    .line 93
    .line 94
    iget-object p1, p0, Lcom/discord/audio/DiscordAudioManager;->audioManager:Landroid/media/AudioManager;

    .line 95
    .line 96
    invoke-virtual {p1}, Landroid/media/AudioManager;->getMode()I

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    new-instance v0, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 103
    .line 104
    .line 105
    const-string v2, "Unable to turn on SCO. Clearing Bluetooth device. mode: "

    .line 106
    .line 107
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    const/4 v3, 0x0

    .line 118
    const/4 v4, 0x4

    .line 119
    const/4 v5, 0x0

    .line 120
    move-object v0, v6

    .line 121
    invoke-static/range {v0 .. v5}, Lcom/discord/logging/Log;->i$default(Lcom/discord/logging/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    iget-object p1, p0, Lcom/discord/audio/DiscordAudioManager;->instanceLock:Ljava/lang/Object;

    .line 125
    .line 126
    monitor-enter p1

    .line 127
    :try_start_0
    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->audioDevices:Ljava/util/List;

    .line 128
    .line 129
    new-instance v1, Ljava/util/ArrayList;

    .line 130
    .line 131
    const/16 v2, 0xa

    .line 132
    .line 133
    invoke-static {v0, v2}, Lkotlin/collections/h;->t(Ljava/lang/Iterable;I)I

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 138
    .line 139
    .line 140
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    if-eqz v2, :cond_3

    .line 149
    .line 150
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    move-object v3, v2

    .line 155
    check-cast v3, Lcom/discord/audio/DiscordAudioManager$AudioDevice;

    .line 156
    .line 157
    invoke-virtual {v3}, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->getType()Lcom/discord/audio/DiscordAudioManager$DeviceTypes;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    sget-object v4, Lcom/discord/audio/DiscordAudioManager$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 162
    .line 163
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 164
    .line 165
    .line 166
    move-result v2

    .line 167
    aget v2, v4, v2

    .line 168
    .line 169
    const/4 v4, 0x4

    .line 170
    if-ne v2, v4, :cond_2

    .line 171
    .line 172
    const/4 v4, 0x0

    .line 173
    const/4 v5, 0x0

    .line 174
    const/4 v6, 0x0

    .line 175
    const/4 v7, 0x0

    .line 176
    const/4 v8, 0x1

    .line 177
    const/4 v9, 0x0

    .line 178
    invoke-static/range {v3 .. v9}, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->copy$default(Lcom/discord/audio/DiscordAudioManager$AudioDevice;Lcom/discord/audio/DiscordAudioManager$DeviceTypes;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/discord/audio/DiscordAudioManager$AudioDevice;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    goto :goto_1

    .line 183
    :cond_2
    const/4 v4, 0x0

    .line 184
    const/4 v5, 0x0

    .line 185
    const/4 v6, 0x0

    .line 186
    const/4 v7, 0x0

    .line 187
    const/16 v8, 0xf

    .line 188
    .line 189
    const/4 v9, 0x0

    .line 190
    invoke-static/range {v3 .. v9}, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->copy$default(Lcom/discord/audio/DiscordAudioManager$AudioDevice;Lcom/discord/audio/DiscordAudioManager$DeviceTypes;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/discord/audio/DiscordAudioManager$AudioDevice;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    :goto_1
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    goto :goto_0

    .line 198
    :cond_3
    invoke-direct {p0, v1}, Lcom/discord/audio/DiscordAudioManager;->setAudioDevices(Ljava/util/List;)V

    .line 199
    .line 200
    .line 201
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 202
    .line 203
    monitor-exit p1

    .line 204
    iget-object p1, p0, Lcom/discord/audio/DiscordAudioManager;->audioDevices:Ljava/util/List;

    .line 205
    .line 206
    invoke-direct {p0, p1}, Lcom/discord/audio/DiscordAudioManager;->activateDefaultDevice(Ljava/util/List;)V

    .line 207
    .line 208
    .line 209
    goto :goto_2

    .line 210
    :catchall_0
    move-exception v0

    .line 211
    monitor-exit p1

    .line 212
    throw v0

    .line 213
    :cond_4
    iget-object p1, p0, Lcom/discord/audio/DiscordAudioManager;->instanceLock:Ljava/lang/Object;

    .line 214
    .line 215
    monitor-enter p1

    .line 216
    :try_start_1
    iget-boolean v0, p0, Lcom/discord/audio/DiscordAudioManager;->inDiscordRequestedCommunicationMode:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 217
    .line 218
    monitor-exit p1

    .line 219
    if-eqz v0, :cond_6

    .line 220
    .line 221
    const-string v1, "DiscordAudioManager"

    .line 222
    .line 223
    const-string v2, "SCO off detected directly from ON. Refreshing Bluetooth device"

    .line 224
    .line 225
    const/4 v3, 0x0

    .line 226
    const/4 v4, 0x4

    .line 227
    const/4 v5, 0x0

    .line 228
    move-object v0, v6

    .line 229
    invoke-static/range {v0 .. v5}, Lcom/discord/logging/Log;->i$default(Lcom/discord/logging/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    invoke-direct {p0}, Lcom/discord/audio/DiscordAudioManager;->startBluetoothSco()V

    .line 233
    .line 234
    .line 235
    invoke-direct {p0}, Lcom/discord/audio/DiscordAudioManager;->updateDeviceActivation()V

    .line 236
    .line 237
    .line 238
    goto :goto_2

    .line 239
    :catchall_1
    move-exception v0

    .line 240
    monitor-exit p1

    .line 241
    throw v0

    .line 242
    :cond_5
    invoke-direct {p0}, Lcom/discord/audio/DiscordAudioManager;->startBluetoothSco()V

    .line 243
    .line 244
    .line 245
    :cond_6
    :goto_2
    return-void
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
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
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
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
.end method

.method private final onWiredHeadsetPlug(Lcom/discord/audio/enums/WiredHeadsetState;)V
    .locals 12

    .line 1
    sget-object v0, Lcom/discord/logging/Log;->INSTANCE:Lcom/discord/logging/Log;

    .line 2
    .line 3
    const-string v1, "DiscordAudioManager"

    .line 4
    .line 5
    new-instance v2, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v3, "[onWiredHeadsetPlug] wiredHeadsetState = "

    .line 11
    .line 12
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const/4 v3, 0x0

    .line 23
    const/4 v4, 0x4

    .line 24
    const/4 v5, 0x0

    .line 25
    invoke-static/range {v0 .. v5}, Lcom/discord/logging/Log;->i$default(Lcom/discord/logging/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    sget-object v0, Lcom/discord/audio/enums/WiredHeadsetState$Unplugged;->INSTANCE:Lcom/discord/audio/enums/WiredHeadsetState$Unplugged;

    .line 29
    .line 30
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const/4 v1, 0x2

    .line 35
    const/4 v2, 0x1

    .line 36
    const/16 v3, 0xa

    .line 37
    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    iget-object p1, p0, Lcom/discord/audio/DiscordAudioManager;->instanceLock:Ljava/lang/Object;

    .line 41
    .line 42
    monitor-enter p1

    .line 43
    :try_start_0
    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->audioDevices:Ljava/util/List;

    .line 44
    .line 45
    new-instance v4, Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-static {v0, v3}, Lkotlin/collections/h;->t(Ljava/lang/Iterable;I)I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 52
    .line 53
    .line 54
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    if-eqz v3, :cond_2

    .line 63
    .line 64
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    move-object v5, v3

    .line 69
    check-cast v5, Lcom/discord/audio/DiscordAudioManager$AudioDevice;

    .line 70
    .line 71
    invoke-virtual {v5}, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->getType()Lcom/discord/audio/DiscordAudioManager$DeviceTypes;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    sget-object v6, Lcom/discord/audio/DiscordAudioManager$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 76
    .line 77
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    aget v3, v6, v3

    .line 82
    .line 83
    if-eq v3, v2, :cond_1

    .line 84
    .line 85
    if-eq v3, v1, :cond_0

    .line 86
    .line 87
    const/4 v6, 0x0

    .line 88
    const/4 v7, 0x0

    .line 89
    const/4 v8, 0x0

    .line 90
    const/4 v9, 0x0

    .line 91
    const/16 v10, 0xf

    .line 92
    .line 93
    const/4 v11, 0x0

    .line 94
    invoke-static/range {v5 .. v11}, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->copy$default(Lcom/discord/audio/DiscordAudioManager$AudioDevice;Lcom/discord/audio/DiscordAudioManager$DeviceTypes;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/discord/audio/DiscordAudioManager$AudioDevice;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    goto :goto_1

    .line 99
    :cond_0
    const/4 v6, 0x0

    .line 100
    const/4 v7, 0x0

    .line 101
    const/4 v8, 0x0

    .line 102
    const/4 v9, 0x0

    .line 103
    const/16 v10, 0xd

    .line 104
    .line 105
    const/4 v11, 0x0

    .line 106
    invoke-static/range {v5 .. v11}, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->copy$default(Lcom/discord/audio/DiscordAudioManager$AudioDevice;Lcom/discord/audio/DiscordAudioManager$DeviceTypes;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/discord/audio/DiscordAudioManager$AudioDevice;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    goto :goto_1

    .line 111
    :cond_1
    const/4 v6, 0x0

    .line 112
    iget-boolean v7, p0, Lcom/discord/audio/DiscordAudioManager;->hasEarpiece:Z

    .line 113
    .line 114
    const/4 v8, 0x0

    .line 115
    const/4 v9, 0x0

    .line 116
    const/16 v10, 0xd

    .line 117
    .line 118
    const/4 v11, 0x0

    .line 119
    invoke-static/range {v5 .. v11}, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->copy$default(Lcom/discord/audio/DiscordAudioManager$AudioDevice;Lcom/discord/audio/DiscordAudioManager$DeviceTypes;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/discord/audio/DiscordAudioManager$AudioDevice;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    :goto_1
    invoke-interface {v4, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_2
    invoke-direct {p0, v4}, Lcom/discord/audio/DiscordAudioManager;->setAudioDevices(Ljava/util/List;)V

    .line 128
    .line 129
    .line 130
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 131
    .line 132
    monitor-exit p1

    .line 133
    goto :goto_4

    .line 134
    :catchall_0
    move-exception v0

    .line 135
    monitor-exit p1

    .line 136
    throw v0

    .line 137
    :cond_3
    instance-of p1, p1, Lcom/discord/audio/enums/WiredHeadsetState$PluggedIn;

    .line 138
    .line 139
    if-eqz p1, :cond_7

    .line 140
    .line 141
    iget-object p1, p0, Lcom/discord/audio/DiscordAudioManager;->instanceLock:Ljava/lang/Object;

    .line 142
    .line 143
    monitor-enter p1

    .line 144
    :try_start_1
    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->audioDevices:Ljava/util/List;

    .line 145
    .line 146
    new-instance v4, Ljava/util/ArrayList;

    .line 147
    .line 148
    invoke-static {v0, v3}, Lkotlin/collections/h;->t(Ljava/lang/Iterable;I)I

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 153
    .line 154
    .line 155
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 160
    .line 161
    .line 162
    move-result v3

    .line 163
    if-eqz v3, :cond_6

    .line 164
    .line 165
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    move-object v5, v3

    .line 170
    check-cast v5, Lcom/discord/audio/DiscordAudioManager$AudioDevice;

    .line 171
    .line 172
    invoke-virtual {v5}, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->getType()Lcom/discord/audio/DiscordAudioManager$DeviceTypes;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    sget-object v6, Lcom/discord/audio/DiscordAudioManager$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 177
    .line 178
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 179
    .line 180
    .line 181
    move-result v3

    .line 182
    aget v3, v6, v3

    .line 183
    .line 184
    if-eq v3, v2, :cond_5

    .line 185
    .line 186
    if-eq v3, v1, :cond_4

    .line 187
    .line 188
    const/4 v6, 0x0

    .line 189
    const/4 v7, 0x0

    .line 190
    const/4 v8, 0x0

    .line 191
    const/4 v9, 0x0

    .line 192
    const/16 v10, 0xf

    .line 193
    .line 194
    const/4 v11, 0x0

    .line 195
    invoke-static/range {v5 .. v11}, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->copy$default(Lcom/discord/audio/DiscordAudioManager$AudioDevice;Lcom/discord/audio/DiscordAudioManager$DeviceTypes;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/discord/audio/DiscordAudioManager$AudioDevice;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    goto :goto_3

    .line 200
    :cond_4
    const/4 v6, 0x0

    .line 201
    const/4 v7, 0x1

    .line 202
    const/4 v8, 0x0

    .line 203
    const/4 v9, 0x0

    .line 204
    const/16 v10, 0xd

    .line 205
    .line 206
    const/4 v11, 0x0

    .line 207
    invoke-static/range {v5 .. v11}, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->copy$default(Lcom/discord/audio/DiscordAudioManager$AudioDevice;Lcom/discord/audio/DiscordAudioManager$DeviceTypes;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/discord/audio/DiscordAudioManager$AudioDevice;

    .line 208
    .line 209
    .line 210
    move-result-object v3

    .line 211
    goto :goto_3

    .line 212
    :cond_5
    const/4 v6, 0x0

    .line 213
    const/4 v7, 0x0

    .line 214
    const/4 v8, 0x0

    .line 215
    const/4 v9, 0x0

    .line 216
    const/16 v10, 0xd

    .line 217
    .line 218
    const/4 v11, 0x0

    .line 219
    invoke-static/range {v5 .. v11}, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->copy$default(Lcom/discord/audio/DiscordAudioManager$AudioDevice;Lcom/discord/audio/DiscordAudioManager$DeviceTypes;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/discord/audio/DiscordAudioManager$AudioDevice;

    .line 220
    .line 221
    .line 222
    move-result-object v3

    .line 223
    :goto_3
    invoke-interface {v4, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    goto :goto_2

    .line 227
    :cond_6
    invoke-direct {p0, v4}, Lcom/discord/audio/DiscordAudioManager;->setAudioDevices(Ljava/util/List;)V

    .line 228
    .line 229
    .line 230
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 231
    .line 232
    monitor-exit p1

    .line 233
    goto :goto_4

    .line 234
    :catchall_1
    move-exception v0

    .line 235
    monitor-exit p1

    .line 236
    throw v0

    .line 237
    :cond_7
    :goto_4
    invoke-direct {p0}, Lcom/discord/audio/DiscordAudioManager;->updateDeviceActivation()V

    .line 238
    .line 239
    .line 240
    return-void
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
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
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
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
.end method

.method private final refreshBluetoothHeadset()V
    .locals 12
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->instanceLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/discord/audio/DiscordAudioManager;->audioDevices:Ljava/util/List;

    .line 5
    .line 6
    new-instance v2, Ljava/util/ArrayList;

    .line 7
    .line 8
    const/16 v3, 0xa

    .line 9
    .line 10
    invoke-static {v1, v3}, Lkotlin/collections/h;->t(Ljava/lang/Iterable;I)I

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_12

    .line 26
    .line 27
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    move-object v4, v3

    .line 32
    check-cast v4, Lcom/discord/audio/DiscordAudioManager$AudioDevice;

    .line 33
    .line 34
    invoke-virtual {v4}, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->getType()Lcom/discord/audio/DiscordAudioManager$DeviceTypes;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    sget-object v5, Lcom/discord/audio/DiscordAudioManager$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 39
    .line 40
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    aget v3, v5, v3

    .line 45
    .line 46
    const/4 v5, 0x4

    .line 47
    if-ne v3, v5, :cond_11

    .line 48
    .line 49
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 50
    .line 51
    const/16 v5, 0x1f

    .line 52
    .line 53
    const/4 v6, 0x0

    .line 54
    const/4 v7, 0x1

    .line 55
    const/4 v8, 0x0

    .line 56
    if-lt v3, v5, :cond_6

    .line 57
    .line 58
    iget-object v3, p0, Lcom/discord/audio/DiscordAudioManager;->audioManager:Landroid/media/AudioManager;

    .line 59
    .line 60
    invoke-static {v3}, Lcom/discord/audio/a;->a(Landroid/media/AudioManager;)Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    const-string v5, "audioManager.availableCommunicationDevices"

    .line 65
    .line 66
    invoke-static {v3, v5}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    if-eqz v5, :cond_3

    .line 78
    .line 79
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    move-object v9, v5

    .line 84
    check-cast v9, Landroid/media/AudioDeviceInfo;

    .line 85
    .line 86
    invoke-virtual {v9}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 87
    .line 88
    .line 89
    move-result v10

    .line 90
    const/16 v11, 0x1a

    .line 91
    .line 92
    if-eq v10, v11, :cond_2

    .line 93
    .line 94
    invoke-virtual {v9}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 95
    .line 96
    .line 97
    move-result v10

    .line 98
    const/16 v11, 0x8

    .line 99
    .line 100
    if-eq v10, v11, :cond_2

    .line 101
    .line 102
    invoke-virtual {v9}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 103
    .line 104
    .line 105
    move-result v9

    .line 106
    const/4 v10, 0x7

    .line 107
    if-ne v9, v10, :cond_1

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_1
    move v9, v6

    .line 111
    goto :goto_2

    .line 112
    :cond_2
    :goto_1
    move v9, v7

    .line 113
    :goto_2
    if-eqz v9, :cond_0

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_3
    move-object v5, v8

    .line 117
    :goto_3
    check-cast v5, Landroid/media/AudioDeviceInfo;

    .line 118
    .line 119
    if-eqz v5, :cond_5

    .line 120
    .line 121
    const/4 v3, 0x0

    .line 122
    const/4 v6, 0x1

    .line 123
    invoke-static {v5}, Lcom/discord/audio/b;->a(Landroid/media/AudioDeviceInfo;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v7

    .line 127
    invoke-virtual {v5}, Landroid/media/AudioDeviceInfo;->getProductName()Ljava/lang/CharSequence;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    if-eqz v5, :cond_4

    .line 132
    .line 133
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v5

    .line 137
    move-object v8, v5

    .line 138
    :cond_4
    const/4 v9, 0x1

    .line 139
    const/4 v10, 0x0

    .line 140
    move-object v5, v3

    .line 141
    invoke-static/range {v4 .. v10}, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->copy$default(Lcom/discord/audio/DiscordAudioManager$AudioDevice;Lcom/discord/audio/DiscordAudioManager$DeviceTypes;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/discord/audio/DiscordAudioManager$AudioDevice;

    .line 142
    .line 143
    .line 144
    move-result-object v3

    .line 145
    goto/16 :goto_b

    .line 146
    .line 147
    :cond_5
    const/4 v5, 0x0

    .line 148
    const/4 v6, 0x0

    .line 149
    const/4 v7, 0x0

    .line 150
    const/4 v8, 0x0

    .line 151
    const/16 v9, 0xf

    .line 152
    .line 153
    const/4 v10, 0x0

    .line 154
    invoke-static/range {v4 .. v10}, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->copy$default(Lcom/discord/audio/DiscordAudioManager$AudioDevice;Lcom/discord/audio/DiscordAudioManager$DeviceTypes;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/discord/audio/DiscordAudioManager$AudioDevice;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    goto/16 :goto_b

    .line 159
    .line 160
    :cond_6
    iget-object v3, p0, Lcom/discord/audio/DiscordAudioManager;->context:Landroid/content/Context;

    .line 161
    .line 162
    invoke-static {v3}, Lcom/discord/audio/utils/AudioPermissionsUtilsKt;->hasBluetoothPermission(Landroid/content/Context;)Z

    .line 163
    .line 164
    .line 165
    move-result v3

    .line 166
    if-nez v3, :cond_7

    .line 167
    .line 168
    const/4 v5, 0x0

    .line 169
    const/4 v6, 0x0

    .line 170
    const/4 v7, 0x0

    .line 171
    const/4 v8, 0x0

    .line 172
    const/16 v9, 0xf

    .line 173
    .line 174
    const/4 v10, 0x0

    .line 175
    invoke-static/range {v4 .. v10}, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->copy$default(Lcom/discord/audio/DiscordAudioManager$AudioDevice;Lcom/discord/audio/DiscordAudioManager$DeviceTypes;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/discord/audio/DiscordAudioManager$AudioDevice;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    goto/16 :goto_b

    .line 180
    .line 181
    :cond_7
    iget-object v3, p0, Lcom/discord/audio/DiscordAudioManager;->bluetoothHeadsetProfileProxy:Landroid/bluetooth/BluetoothHeadset;

    .line 182
    .line 183
    if-eqz v3, :cond_8

    .line 184
    .line 185
    invoke-static {v3}, Lcom/discord/audio/bluetooth/BluetoothHeadsetUtilsKt;->getActiveHeadset(Landroid/bluetooth/BluetoothHeadset;)Landroid/bluetooth/BluetoothDevice;

    .line 186
    .line 187
    .line 188
    move-result-object v3

    .line 189
    goto :goto_4

    .line 190
    :cond_8
    move-object v3, v8

    .line 191
    :goto_4
    iget-boolean v5, p0, Lcom/discord/audio/DiscordAudioManager;->inDiscordRequestedCommunicationMode:Z

    .line 192
    .line 193
    if-eqz v5, :cond_9

    .line 194
    .line 195
    iget-object v5, p0, Lcom/discord/audio/DiscordAudioManager;->activeAudioDevice:Lcom/discord/audio/DiscordAudioManager$DeviceTypes;

    .line 196
    .line 197
    sget-object v9, Lcom/discord/audio/DiscordAudioManager$DeviceTypes;->BLUETOOTH_HEADSET:Lcom/discord/audio/DiscordAudioManager$DeviceTypes;

    .line 198
    .line 199
    if-ne v5, v9, :cond_9

    .line 200
    .line 201
    if-eqz v3, :cond_e

    .line 202
    .line 203
    :goto_5
    move v6, v7

    .line 204
    goto :goto_9

    .line 205
    :cond_9
    iget-object v5, p0, Lcom/discord/audio/DiscordAudioManager;->context:Landroid/content/Context;

    .line 206
    .line 207
    const-class v9, Landroid/bluetooth/BluetoothManager;

    .line 208
    .line 209
    invoke-static {v5, v9}, Landroidx/core/content/a;->j(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v5

    .line 213
    check-cast v5, Landroid/bluetooth/BluetoothManager;

    .line 214
    .line 215
    if-eqz v5, :cond_a

    .line 216
    .line 217
    invoke-virtual {v5}, Landroid/bluetooth/BluetoothManager;->getAdapter()Landroid/bluetooth/BluetoothAdapter;

    .line 218
    .line 219
    .line 220
    move-result-object v5

    .line 221
    goto :goto_6

    .line 222
    :cond_a
    move-object v5, v8

    .line 223
    :goto_6
    if-eqz v5, :cond_b

    .line 224
    .line 225
    invoke-virtual {v5, v7}, Landroid/bluetooth/BluetoothAdapter;->getProfileConnectionState(I)I

    .line 226
    .line 227
    .line 228
    move-result v9

    .line 229
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 230
    .line 231
    .line 232
    move-result-object v9

    .line 233
    goto :goto_7

    .line 234
    :cond_b
    move-object v9, v8

    .line 235
    :goto_7
    if-eqz v5, :cond_c

    .line 236
    .line 237
    invoke-virtual {v5}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    .line 238
    .line 239
    .line 240
    move-result v5

    .line 241
    if-ne v5, v7, :cond_c

    .line 242
    .line 243
    move v5, v7

    .line 244
    goto :goto_8

    .line 245
    :cond_c
    move v5, v6

    .line 246
    :goto_8
    if-eqz v5, :cond_e

    .line 247
    .line 248
    if-nez v9, :cond_d

    .line 249
    .line 250
    goto :goto_9

    .line 251
    :cond_d
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 252
    .line 253
    .line 254
    move-result v5

    .line 255
    const/4 v9, 0x2

    .line 256
    if-ne v5, v9, :cond_e

    .line 257
    .line 258
    goto :goto_5

    .line 259
    :cond_e
    :goto_9
    const/4 v5, 0x0

    .line 260
    if-eqz v3, :cond_f

    .line 261
    .line 262
    invoke-virtual {v3}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v7

    .line 266
    goto :goto_a

    .line 267
    :cond_f
    move-object v7, v8

    .line 268
    :goto_a
    if-eqz v3, :cond_10

    .line 269
    .line 270
    invoke-virtual {v3}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v3

    .line 274
    move-object v8, v3

    .line 275
    :cond_10
    const/4 v9, 0x1

    .line 276
    const/4 v10, 0x0

    .line 277
    invoke-static/range {v4 .. v10}, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->copy$default(Lcom/discord/audio/DiscordAudioManager$AudioDevice;Lcom/discord/audio/DiscordAudioManager$DeviceTypes;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/discord/audio/DiscordAudioManager$AudioDevice;

    .line 278
    .line 279
    .line 280
    move-result-object v3

    .line 281
    goto :goto_b

    .line 282
    :cond_11
    const/4 v5, 0x0

    .line 283
    const/4 v6, 0x0

    .line 284
    const/4 v7, 0x0

    .line 285
    const/4 v8, 0x0

    .line 286
    const/16 v9, 0xf

    .line 287
    .line 288
    const/4 v10, 0x0

    .line 289
    invoke-static/range {v4 .. v10}, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->copy$default(Lcom/discord/audio/DiscordAudioManager$AudioDevice;Lcom/discord/audio/DiscordAudioManager$DeviceTypes;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/discord/audio/DiscordAudioManager$AudioDevice;

    .line 290
    .line 291
    .line 292
    move-result-object v3

    .line 293
    :goto_b
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 294
    .line 295
    .line 296
    goto/16 :goto_0

    .line 297
    .line 298
    :cond_12
    invoke-direct {p0, v2}, Lcom/discord/audio/DiscordAudioManager;->setAudioDevices(Ljava/util/List;)V

    .line 299
    .line 300
    .line 301
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 302
    .line 303
    monitor-exit v0

    .line 304
    return-void

    .line 305
    :catchall_0
    move-exception v1

    .line 306
    monitor-exit v0

    .line 307
    throw v1
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
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
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
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
.end method

.method private final registerAudioFocusListener()V
    .locals 2

    .line 1
    new-instance v0, Lcom/discord/audio/i;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/discord/audio/i;-><init>(Lcom/discord/audio/DiscordAudioManager;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/discord/audio/DiscordAudioManager;->instanceLock:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v1

    .line 9
    :try_start_0
    iput-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->audioFocusListener:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    .line 10
    .line 11
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    monitor-exit v1

    .line 14
    return-void

    .line 15
    :catchall_0
    move-exception v0

    .line 16
    monitor-exit v1

    .line 17
    throw v0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method

.method private static final registerAudioFocusListener$lambda$22(Lcom/discord/audio/DiscordAudioManager;I)V
    .locals 7

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lcom/discord/logging/Log;->INSTANCE:Lcom/discord/logging/Log;

    .line 7
    .line 8
    const-string v2, "DiscordAudioManager"

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v3, "[AudioFocus] new focus: "

    .line 16
    .line 17
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    const/4 v4, 0x0

    .line 28
    const/4 v5, 0x4

    .line 29
    const/4 v6, 0x0

    .line 30
    invoke-static/range {v1 .. v6}, Lcom/discord/logging/Log;->i$default(Lcom/discord/logging/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    const/4 v0, -0x3

    .line 34
    if-eq p1, v0, :cond_1

    .line 35
    .line 36
    const/4 v0, -0x2

    .line 37
    if-eq p1, v0, :cond_1

    .line 38
    .line 39
    const/4 v0, 0x1

    .line 40
    if-eq p1, v0, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-direct {p0, v0}, Lcom/discord/audio/DiscordAudioManager;->setCommunicationModeOnInternal(Z)V

    .line 44
    .line 45
    .line 46
    invoke-direct {p0}, Lcom/discord/audio/DiscordAudioManager;->updateDeviceActivation()V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    const/4 p1, 0x0

    .line 51
    invoke-direct {p0, p1}, Lcom/discord/audio/DiscordAudioManager;->setCommunicationModeOnInternal(Z)V

    .line 52
    .line 53
    .line 54
    :goto_0
    return-void
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
.end method

.method private final releaseAudioFocus()V
    .locals 10

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    if-lt v0, v1, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->instanceLock:Ljava/lang/Object;

    .line 10
    .line 11
    monitor-enter v0

    .line 12
    :try_start_0
    iget-object v1, p0, Lcom/discord/audio/DiscordAudioManager;->audioFocusRequest:Landroid/media/AudioFocusRequest;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    monitor-exit v0

    .line 15
    if-eqz v1, :cond_3

    .line 16
    .line 17
    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->audioManager:Landroid/media/AudioManager;

    .line 18
    .line 19
    invoke-static {v0, v1}, Lcom/discord/audio/c;->a(Landroid/media/AudioManager;Landroid/media/AudioFocusRequest;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-ne v0, v2, :cond_2

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception v1

    .line 27
    monitor-exit v0

    .line 28
    throw v1

    .line 29
    :cond_0
    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->instanceLock:Ljava/lang/Object;

    .line 30
    .line 31
    monitor-enter v0

    .line 32
    :try_start_1
    iget-object v1, p0, Lcom/discord/audio/DiscordAudioManager;->audioFocusListener:Landroid/media/AudioManager$OnAudioFocusChangeListener;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 33
    .line 34
    if-nez v1, :cond_1

    .line 35
    .line 36
    monitor-exit v0

    .line 37
    return-void

    .line 38
    :cond_1
    monitor-exit v0

    .line 39
    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->audioManager:Landroid/media/AudioManager;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->abandonAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-ne v0, v2, :cond_2

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    move v2, v3

    .line 49
    :goto_0
    move v3, v2

    .line 50
    :cond_3
    if-nez v3, :cond_4

    .line 51
    .line 52
    sget-object v4, Lcom/discord/logging/Log;->INSTANCE:Lcom/discord/logging/Log;

    .line 53
    .line 54
    const-string v5, "DiscordAudioManager"

    .line 55
    .line 56
    const-string v6, "Unable to releaseAudioFocus()"

    .line 57
    .line 58
    const/4 v7, 0x0

    .line 59
    const/4 v8, 0x4

    .line 60
    const/4 v9, 0x0

    .line 61
    invoke-static/range {v4 .. v9}, Lcom/discord/logging/Log;->w$default(Lcom/discord/logging/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    :cond_4
    return-void

    .line 65
    :catchall_1
    move-exception v1

    .line 66
    monitor-exit v0

    .line 67
    throw v1
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
.end method

.method private final requestAudioFocus()Z
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->instanceLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/discord/audio/DiscordAudioManager;->audioFocusListener:Landroid/media/AudioManager$OnAudioFocusChangeListener;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    monitor-exit v0

    .line 10
    return v2

    .line 11
    :cond_0
    monitor-exit v0

    .line 12
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 13
    .line 14
    const/16 v3, 0x1a

    .line 15
    .line 16
    const/4 v4, 0x1

    .line 17
    if-lt v0, v3, :cond_1

    .line 18
    .line 19
    new-instance v0, Landroid/media/AudioFocusRequest$Builder;

    .line 20
    .line 21
    invoke-direct {v0, v4}, Landroid/media/AudioFocusRequest$Builder;-><init>(I)V

    .line 22
    .line 23
    .line 24
    new-instance v3, Landroid/media/AudioAttributes$Builder;

    .line 25
    .line 26
    invoke-direct {v3}, Landroid/media/AudioAttributes$Builder;-><init>()V

    .line 27
    .line 28
    .line 29
    const/4 v5, 0x2

    .line 30
    invoke-virtual {v3, v5}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3, v4}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    .line 34
    .line 35
    .line 36
    invoke-static {v0, v4}, Lcom/discord/audio/d;->a(Landroid/media/AudioFocusRequest$Builder;Z)Landroid/media/AudioFocusRequest$Builder;

    .line 37
    .line 38
    .line 39
    new-instance v5, Landroid/os/Handler;

    .line 40
    .line 41
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    invoke-static {v6}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-direct {v5, v6}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 49
    .line 50
    .line 51
    invoke-static {v0, v1, v5}, Lcom/discord/audio/e;->a(Landroid/media/AudioFocusRequest$Builder;Landroid/media/AudioManager$OnAudioFocusChangeListener;Landroid/os/Handler;)Landroid/media/AudioFocusRequest$Builder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-static {v0, v1}, Lcom/discord/audio/f;->a(Landroid/media/AudioFocusRequest$Builder;Landroid/media/AudioAttributes;)Landroid/media/AudioFocusRequest$Builder;

    .line 59
    .line 60
    .line 61
    invoke-static {v0}, Lcom/discord/audio/g;->a(Landroid/media/AudioFocusRequest$Builder;)Landroid/media/AudioFocusRequest;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iput-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->audioFocusRequest:Landroid/media/AudioFocusRequest;

    .line 66
    .line 67
    iget-object v1, p0, Lcom/discord/audio/DiscordAudioManager;->audioManager:Landroid/media/AudioManager;

    .line 68
    .line 69
    invoke-static {v1, v0}, Lcom/discord/audio/h;->a(Landroid/media/AudioManager;Landroid/media/AudioFocusRequest;)I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-ne v0, v4, :cond_2

    .line 74
    .line 75
    :goto_0
    move v2, v4

    .line 76
    goto :goto_1

    .line 77
    :cond_1
    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->audioManager:Landroid/media/AudioManager;

    .line 78
    .line 79
    invoke-virtual {v0, v1, v2, v4}, Landroid/media/AudioManager;->requestAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;II)I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-ne v0, v4, :cond_2

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_2
    :goto_1
    if-nez v2, :cond_3

    .line 87
    .line 88
    sget-object v3, Lcom/discord/logging/Log;->INSTANCE:Lcom/discord/logging/Log;

    .line 89
    .line 90
    const-string v4, "DiscordAudioManager"

    .line 91
    .line 92
    const-string v5, "Unable to requestAudioFocus()"

    .line 93
    .line 94
    const/4 v6, 0x0

    .line 95
    const/4 v7, 0x4

    .line 96
    const/4 v8, 0x0

    .line 97
    invoke-static/range {v3 .. v8}, Lcom/discord/logging/Log;->w$default(Lcom/discord/logging/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    :cond_3
    return v2

    .line 101
    :catchall_0
    move-exception v1

    .line 102
    monitor-exit v0

    .line 103
    throw v1
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
.end method

.method private final setActiveAudioDevice(Lcom/discord/audio/DiscordAudioManager$DeviceTypes;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->activeAudioDevice:Lcom/discord/audio/DiscordAudioManager$DeviceTypes;

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    iput-object p1, p0, Lcom/discord/audio/DiscordAudioManager;->activeAudioDevice:Lcom/discord/audio/DiscordAudioManager$DeviceTypes;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->onActiveAudioDeviceChanged:Lkotlin/jvm/functions/Function1;

    .line 13
    .line 14
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    :cond_1
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method

.method private final setAudioDevices(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/discord/audio/DiscordAudioManager$AudioDevice;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->audioDevices:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    xor-int/lit8 v0, v0, 0x1

    .line 8
    .line 9
    iput-object p1, p0, Lcom/discord/audio/DiscordAudioManager;->audioDevices:Ljava/util/List;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->onAudioDevicesUpdated:Lkotlin/jvm/functions/Function1;

    .line 14
    .line 15
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method

.method private final setCommunicationModeOnInternal(Z)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->audioManager:Landroid/media/AudioManager;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x3

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v1, 0x0

    .line 8
    :goto_0
    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->setMode(I)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    .line 11
    :catch_0
    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->instanceLock:Ljava/lang/Object;

    .line 12
    .line 13
    monitor-enter v0

    .line 14
    :try_start_1
    iput-boolean p1, p0, Lcom/discord/audio/DiscordAudioManager;->inDiscordRequestedCommunicationMode:Z

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    .line 18
    monitor-exit v0

    .line 19
    return-void

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    monitor-exit v0

    .line 22
    throw p1
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method

.method private final setCurrentMediaVolume(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/discord/audio/DiscordAudioManager;->currentMediaVolume:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    iput p1, p0, Lcom/discord/audio/DiscordAudioManager;->currentMediaVolume:I

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->onCurrentMediaVolumeChanged:Lkotlin/jvm/functions/Function1;

    .line 13
    .line 14
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    :cond_1
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method

.method private final setMicrophoneMute(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->audioManager:Landroid/media/AudioManager;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/media/AudioManager;->isMicrophoneMute()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-ne v0, p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->audioManager:Landroid/media/AudioManager;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroid/media/AudioManager;->setMicrophoneMute(Z)V

    .line 13
    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method

.method private final setSpeakerphoneOn(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->audioManager:Landroid/media/AudioManager;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/media/AudioManager;->isSpeakerphoneOn()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-ne v0, p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->audioManager:Landroid/media/AudioManager;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroid/media/AudioManager;->setSpeakerphoneOn(Z)V

    .line 13
    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method

.method private final declared-synchronized startBluetoothSco()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->audioManager:Landroid/media/AudioManager;

    .line 3
    .line 4
    invoke-virtual {v0}, Landroid/media/AudioManager;->isBluetoothScoOn()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    sget-object v0, Lcom/discord/audio/DiscordAudioManager$BluetoothScoState;->ON:Lcom/discord/audio/DiscordAudioManager$BluetoothScoState;

    .line 11
    .line 12
    iput-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->bluetoothScoState:Lcom/discord/audio/DiscordAudioManager$BluetoothScoState;

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->bluetoothScoState:Lcom/discord/audio/DiscordAudioManager$BluetoothScoState;

    .line 15
    .line 16
    sget-object v1, Lcom/discord/audio/DiscordAudioManager$BluetoothScoState;->ON:Lcom/discord/audio/DiscordAudioManager$BluetoothScoState;

    .line 17
    .line 18
    if-eq v0, v1, :cond_2

    .line 19
    .line 20
    sget-object v1, Lcom/discord/audio/DiscordAudioManager$BluetoothScoState;->TURNING_ON:Lcom/discord/audio/DiscordAudioManager$BluetoothScoState;

    .line 21
    .line 22
    if-ne v0, v1, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    iput-object v1, p0, Lcom/discord/audio/DiscordAudioManager;->bluetoothScoState:Lcom/discord/audio/DiscordAudioManager$BluetoothScoState;

    .line 26
    .line 27
    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->audioManager:Landroid/media/AudioManager;

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/media/AudioManager;->startBluetoothSco()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    .line 32
    monitor-exit p0

    .line 33
    return-void

    .line 34
    :cond_2
    :goto_0
    monitor-exit p0

    .line 35
    return-void

    .line 36
    :catchall_0
    move-exception v0

    .line 37
    monitor-exit p0

    .line 38
    throw v0
    .line 39
    .line 40
.end method

.method private final startObservingVolumeChanges()V
    .locals 4

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v1, Landroid/os/Handler;

    .line 8
    .line 9
    invoke-direct {v1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v1, 0x0

    .line 14
    :goto_0
    new-instance v0, Lcom/discord/audio/DiscordAudioManager$startObservingVolumeChanges$volumeObserver$1;

    .line 15
    .line 16
    invoke-direct {v0, p0, v1}, Lcom/discord/audio/DiscordAudioManager$startObservingVolumeChanges$volumeObserver$1;-><init>(Lcom/discord/audio/DiscordAudioManager;Landroid/os/Handler;)V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lcom/discord/audio/DiscordAudioManager;->context:Landroid/content/Context;

    .line 20
    .line 21
    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    sget-object v2, Landroid/provider/Settings$System;->CONTENT_URI:Landroid/net/Uri;

    .line 26
    .line 27
    const/4 v3, 0x1

    .line 28
    invoke-virtual {v1, v2, v3, v0}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->mediaVolumeObserver:Landroid/database/ContentObserver;

    .line 32
    .line 33
    return-void
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method

.method private final declared-synchronized stopBluetoothSco()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->audioManager:Landroid/media/AudioManager;

    .line 3
    .line 4
    invoke-virtual {v0}, Landroid/media/AudioManager;->isBluetoothScoOn()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    sget-object v0, Lcom/discord/audio/DiscordAudioManager$BluetoothScoState;->OFF:Lcom/discord/audio/DiscordAudioManager$BluetoothScoState;

    .line 11
    .line 12
    iput-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->bluetoothScoState:Lcom/discord/audio/DiscordAudioManager$BluetoothScoState;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    monitor-exit p0

    .line 15
    return-void

    .line 16
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->bluetoothScoState:Lcom/discord/audio/DiscordAudioManager$BluetoothScoState;

    .line 17
    .line 18
    sget-object v1, Lcom/discord/audio/DiscordAudioManager$BluetoothScoState;->ON:Lcom/discord/audio/DiscordAudioManager$BluetoothScoState;

    .line 19
    .line 20
    if-eq v0, v1, :cond_1

    .line 21
    .line 22
    sget-object v1, Lcom/discord/audio/DiscordAudioManager$BluetoothScoState;->TURNING_ON:Lcom/discord/audio/DiscordAudioManager$BluetoothScoState;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    .line 24
    if-eq v0, v1, :cond_1

    .line 25
    .line 26
    monitor-exit p0

    .line 27
    return-void

    .line 28
    :cond_1
    :try_start_2
    sget-object v0, Lcom/discord/audio/DiscordAudioManager$BluetoothScoState;->TURNING_OFF:Lcom/discord/audio/DiscordAudioManager$BluetoothScoState;

    .line 29
    .line 30
    iput-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->bluetoothScoState:Lcom/discord/audio/DiscordAudioManager$BluetoothScoState;

    .line 31
    .line 32
    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->audioManager:Landroid/media/AudioManager;

    .line 33
    .line 34
    invoke-virtual {v0}, Landroid/media/AudioManager;->stopBluetoothSco()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 35
    .line 36
    .line 37
    monitor-exit p0

    .line 38
    return-void

    .line 39
    :catchall_0
    move-exception v0

    .line 40
    monitor-exit p0

    .line 41
    throw v0
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
.end method

.method private final stopObservingVolumeChanges()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->mediaVolumeObserver:Landroid/database/ContentObserver;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lcom/discord/audio/DiscordAudioManager;->context:Landroid/content/Context;

    .line 6
    .line 7
    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1, v0}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->mediaVolumeObserver:Landroid/database/ContentObserver;

    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method

.method private final updateDeviceActivation()V
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->instanceLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/discord/audio/DiscordAudioManager;->requestedAudioDevice:Lcom/discord/audio/DiscordAudioManager$DeviceTypes;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    invoke-direct {p0}, Lcom/discord/audio/DiscordAudioManager;->refreshBluetoothHeadset()V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->instanceLock:Ljava/lang/Object;

    .line 11
    .line 12
    monitor-enter v0

    .line 13
    :try_start_1
    iget-object v2, p0, Lcom/discord/audio/DiscordAudioManager;->audioDevices:Ljava/util/List;

    .line 14
    .line 15
    new-instance v3, Ljava/util/ArrayList;

    .line 16
    .line 17
    const/16 v4, 0xa

    .line 18
    .line 19
    invoke-static {v2, v4}, Lkotlin/collections/h;->t(Ljava/lang/Iterable;I)I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 24
    .line 25
    .line 26
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    if-eqz v4, :cond_0

    .line 35
    .line 36
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    move-object v5, v4

    .line 41
    check-cast v5, Lcom/discord/audio/DiscordAudioManager$AudioDevice;

    .line 42
    .line 43
    const/4 v6, 0x0

    .line 44
    const/4 v7, 0x0

    .line 45
    const/4 v8, 0x0

    .line 46
    const/4 v9, 0x0

    .line 47
    const/16 v10, 0xf

    .line 48
    .line 49
    const/4 v11, 0x0

    .line 50
    invoke-static/range {v5 .. v11}, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->copy$default(Lcom/discord/audio/DiscordAudioManager$AudioDevice;Lcom/discord/audio/DiscordAudioManager$DeviceTypes;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/discord/audio/DiscordAudioManager$AudioDevice;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    monitor-exit v0

    .line 59
    sget-object v0, Lcom/discord/audio/DiscordAudioManager$DeviceTypes;->DEFAULT:Lcom/discord/audio/DiscordAudioManager$DeviceTypes;

    .line 60
    .line 61
    if-eq v1, v0, :cond_2

    .line 62
    .line 63
    invoke-virtual {v1}, Lcom/discord/audio/DiscordAudioManager$DeviceTypes;->getValue()I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    check-cast v0, Lcom/discord/audio/DiscordAudioManager$AudioDevice;

    .line 72
    .line 73
    invoke-virtual {v0}, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->isAvailable()Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-nez v0, :cond_1

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_1
    invoke-direct {p0, v1}, Lcom/discord/audio/DiscordAudioManager;->activateDevice(Lcom/discord/audio/DiscordAudioManager$DeviceTypes;)V

    .line 81
    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_2
    :goto_1
    invoke-direct {p0, v3}, Lcom/discord/audio/DiscordAudioManager;->activateDefaultDevice(Ljava/util/List;)V

    .line 85
    .line 86
    .line 87
    :goto_2
    return-void

    .line 88
    :catchall_0
    move-exception v1

    .line 89
    monitor-exit v0

    .line 90
    throw v1

    .line 91
    :catchall_1
    move-exception v1

    .line 92
    monitor-exit v0

    .line 93
    throw v1
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
.end method


# virtual methods
.method public final getActiveAudioDevice()Lcom/discord/audio/DiscordAudioManager$DeviceTypes;
    .locals 1

    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->activeAudioDevice:Lcom/discord/audio/DiscordAudioManager$DeviceTypes;

    return-object v0
.end method

.method public final getAudioDevices()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/discord/audio/DiscordAudioManager$AudioDevice;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->audioDevices:Ljava/util/List;

    return-object v0
.end method

.method public final getAudioFocusListener$audio_release()Landroid/media/AudioManager$OnAudioFocusChangeListener;
    .locals 1

    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->audioFocusListener:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    return-object v0
.end method

.method public final getAudioManagerBroadcastReceiver$audio_release()Lcom/discord/audio/AudioManagerBroadcastReceiver;
    .locals 1

    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->audioManagerBroadcastReceiver:Lcom/discord/audio/AudioManagerBroadcastReceiver;

    return-object v0
.end method

.method public final getBluetoothBroadcastReceiver$audio_release()Lcom/discord/audio/bluetooth/BluetoothBroadcastReceiver;
    .locals 1

    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->bluetoothBroadcastReceiver:Lcom/discord/audio/bluetooth/BluetoothBroadcastReceiver;

    return-object v0
.end method

.method public final getBluetoothHeadsetProfileProxy$audio_release()Landroid/bluetooth/BluetoothHeadset;
    .locals 1

    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->bluetoothHeadsetProfileProxy:Landroid/bluetooth/BluetoothHeadset;

    return-object v0
.end method

.method public final getBluetoothScoState$audio_release()Lcom/discord/audio/DiscordAudioManager$BluetoothScoState;
    .locals 1

    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->bluetoothScoState:Lcom/discord/audio/DiscordAudioManager$BluetoothScoState;

    return-object v0
.end method

.method public final getCurrentMediaVolume()I
    .locals 1

    iget v0, p0, Lcom/discord/audio/DiscordAudioManager;->currentMediaVolume:I

    return v0
.end method

.method public final getMaxMediaVolume()I
    .locals 1

    iget v0, p0, Lcom/discord/audio/DiscordAudioManager;->maxMediaVolume:I

    return v0
.end method

.method public final getOnActiveAudioDeviceChanged()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/discord/audio/DiscordAudioManager$DeviceTypes;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->onActiveAudioDeviceChanged:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getOnAudioDevicesUpdated()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/util/List<",
            "Lcom/discord/audio/DiscordAudioManager$AudioDevice;",
            ">;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->onAudioDevicesUpdated:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getOnCurrentMediaVolumeChanged()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->onCurrentMediaVolumeChanged:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final declared-synchronized makeEarpieceUnavailable()V
    .locals 10

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->audioDevices:Ljava/util/List;

    .line 3
    .line 4
    sget-object v1, Lcom/discord/audio/DiscordAudioManager$DeviceTypes;->EARPIECE:Lcom/discord/audio/DiscordAudioManager$DeviceTypes;

    .line 5
    .line 6
    invoke-virtual {v1}, Lcom/discord/audio/DiscordAudioManager$DeviceTypes;->getValue()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lcom/discord/audio/DiscordAudioManager$AudioDevice;

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->isAvailable()Z

    .line 17
    .line 18
    .line 19
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    monitor-exit p0

    .line 23
    return-void

    .line 24
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->audioDevices:Ljava/util/List;

    .line 25
    .line 26
    new-instance v1, Ljava/util/ArrayList;

    .line 27
    .line 28
    const/16 v2, 0xa

    .line 29
    .line 30
    invoke-static {v0, v2}, Lkotlin/collections/h;->t(Ljava/lang/Iterable;I)I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 35
    .line 36
    .line 37
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_2

    .line 46
    .line 47
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    move-object v3, v2

    .line 52
    check-cast v3, Lcom/discord/audio/DiscordAudioManager$AudioDevice;

    .line 53
    .line 54
    invoke-virtual {v3}, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->getType()Lcom/discord/audio/DiscordAudioManager$DeviceTypes;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    sget-object v4, Lcom/discord/audio/DiscordAudioManager$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 59
    .line 60
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    aget v2, v4, v2

    .line 65
    .line 66
    const/4 v4, 0x1

    .line 67
    if-ne v2, v4, :cond_1

    .line 68
    .line 69
    const/4 v4, 0x0

    .line 70
    const/4 v5, 0x0

    .line 71
    const/4 v6, 0x0

    .line 72
    const/4 v7, 0x0

    .line 73
    const/16 v8, 0xd

    .line 74
    .line 75
    const/4 v9, 0x0

    .line 76
    invoke-static/range {v3 .. v9}, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->copy$default(Lcom/discord/audio/DiscordAudioManager$AudioDevice;Lcom/discord/audio/DiscordAudioManager$DeviceTypes;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/discord/audio/DiscordAudioManager$AudioDevice;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    goto :goto_1

    .line 81
    :cond_1
    const/4 v4, 0x0

    .line 82
    const/4 v5, 0x0

    .line 83
    const/4 v6, 0x0

    .line 84
    const/4 v7, 0x0

    .line 85
    const/16 v8, 0xf

    .line 86
    .line 87
    const/4 v9, 0x0

    .line 88
    invoke-static/range {v3 .. v9}, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->copy$default(Lcom/discord/audio/DiscordAudioManager$AudioDevice;Lcom/discord/audio/DiscordAudioManager$DeviceTypes;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/discord/audio/DiscordAudioManager$AudioDevice;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    :goto_1
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_2
    invoke-direct {p0, v1}, Lcom/discord/audio/DiscordAudioManager;->setAudioDevices(Ljava/util/List;)V

    .line 97
    .line 98
    .line 99
    invoke-direct {p0}, Lcom/discord/audio/DiscordAudioManager;->updateDeviceActivation()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 100
    .line 101
    .line 102
    monitor-exit p0

    .line 103
    return-void

    .line 104
    :catchall_0
    move-exception v0

    .line 105
    monitor-exit p0

    .line 106
    throw v0
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
.end method

.method public final registerHandlers$audio_release()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->audioManagerBroadcastReceiver:Lcom/discord/audio/AudioManagerBroadcastReceiver;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/discord/audio/DiscordAudioManager;->context:Landroid/content/Context;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/discord/audio/AudioManagerBroadcastReceiver;->register(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->bluetoothBroadcastReceiver:Lcom/discord/audio/bluetooth/BluetoothBroadcastReceiver;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/discord/audio/DiscordAudioManager;->context:Landroid/content/Context;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/discord/audio/bluetooth/BluetoothBroadcastReceiver;->register(Landroid/content/Context;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Lcom/discord/audio/DiscordAudioManager;->registerAudioFocusListener()V

    .line 16
    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method

.method public final declared-synchronized resetEarpieceAvailability()V
    .locals 10

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->audioDevices:Ljava/util/List;

    .line 3
    .line 4
    sget-object v1, Lcom/discord/audio/DiscordAudioManager$DeviceTypes;->EARPIECE:Lcom/discord/audio/DiscordAudioManager$DeviceTypes;

    .line 5
    .line 6
    invoke-virtual {v1}, Lcom/discord/audio/DiscordAudioManager$DeviceTypes;->getValue()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lcom/discord/audio/DiscordAudioManager$AudioDevice;

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->isAvailable()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iget-boolean v1, p0, Lcom/discord/audio/DiscordAudioManager;->hasEarpiece:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    if-ne v0, v1, :cond_0

    .line 23
    .line 24
    monitor-exit p0

    .line 25
    return-void

    .line 26
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->audioDevices:Ljava/util/List;

    .line 27
    .line 28
    new-instance v1, Ljava/util/ArrayList;

    .line 29
    .line 30
    const/16 v2, 0xa

    .line 31
    .line 32
    invoke-static {v0, v2}, Lkotlin/collections/h;->t(Ljava/lang/Iterable;I)I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 37
    .line 38
    .line 39
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_2

    .line 48
    .line 49
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    move-object v3, v2

    .line 54
    check-cast v3, Lcom/discord/audio/DiscordAudioManager$AudioDevice;

    .line 55
    .line 56
    invoke-virtual {v3}, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->getType()Lcom/discord/audio/DiscordAudioManager$DeviceTypes;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    sget-object v4, Lcom/discord/audio/DiscordAudioManager$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 61
    .line 62
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    aget v2, v4, v2

    .line 67
    .line 68
    const/4 v4, 0x1

    .line 69
    if-ne v2, v4, :cond_1

    .line 70
    .line 71
    const/4 v4, 0x0

    .line 72
    iget-boolean v5, p0, Lcom/discord/audio/DiscordAudioManager;->hasEarpiece:Z

    .line 73
    .line 74
    const/4 v6, 0x0

    .line 75
    const/4 v7, 0x0

    .line 76
    const/16 v8, 0xd

    .line 77
    .line 78
    const/4 v9, 0x0

    .line 79
    invoke-static/range {v3 .. v9}, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->copy$default(Lcom/discord/audio/DiscordAudioManager$AudioDevice;Lcom/discord/audio/DiscordAudioManager$DeviceTypes;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/discord/audio/DiscordAudioManager$AudioDevice;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    goto :goto_1

    .line 84
    :cond_1
    const/4 v4, 0x0

    .line 85
    const/4 v5, 0x0

    .line 86
    const/4 v6, 0x0

    .line 87
    const/4 v7, 0x0

    .line 88
    const/16 v8, 0xf

    .line 89
    .line 90
    const/4 v9, 0x0

    .line 91
    invoke-static/range {v3 .. v9}, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->copy$default(Lcom/discord/audio/DiscordAudioManager$AudioDevice;Lcom/discord/audio/DiscordAudioManager$DeviceTypes;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/discord/audio/DiscordAudioManager$AudioDevice;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    :goto_1
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_2
    invoke-direct {p0, v1}, Lcom/discord/audio/DiscordAudioManager;->setAudioDevices(Ljava/util/List;)V

    .line 100
    .line 101
    .line 102
    invoke-direct {p0}, Lcom/discord/audio/DiscordAudioManager;->updateDeviceActivation()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 103
    .line 104
    .line 105
    monitor-exit p0

    .line 106
    return-void

    .line 107
    :catchall_0
    move-exception v0

    .line 108
    monitor-exit p0

    .line 109
    throw v0
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
.end method

.method public final setAudioFocusListener$audio_release(Landroid/media/AudioManager$OnAudioFocusChangeListener;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/audio/DiscordAudioManager;->audioFocusListener:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    return-void
.end method

.method public final setBluetoothHeadsetProfileProxy$audio_release(Landroid/bluetooth/BluetoothHeadset;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/audio/DiscordAudioManager;->bluetoothHeadsetProfileProxy:Landroid/bluetooth/BluetoothHeadset;

    return-void
.end method

.method public final setBluetoothScoState$audio_release(Lcom/discord/audio/DiscordAudioManager$BluetoothScoState;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/discord/audio/DiscordAudioManager;->bluetoothScoState:Lcom/discord/audio/DiscordAudioManager$BluetoothScoState;

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method

.method public final setCommunicationModeOn(Z)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->asyncInitThreadChecker:Lcom/discord/async_init/AsyncInitThreadChecker;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/discord/async_init/AsyncInitThreadChecker;->checkIsOnValidThread()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->context:Landroid/content/Context;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/discord/audio/utils/AudioPermissionsUtilsKt;->hasModifyAudioSettingsPermission(Landroid/content/Context;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    sget-object v1, Lcom/discord/logging/Log;->INSTANCE:Lcom/discord/logging/Log;

    .line 15
    .line 16
    const-string v2, "DiscordAudioManager"

    .line 17
    .line 18
    const-string v3, "MODIFY_AUDIO_SETTINGS is missing. Client will run with reduced functionality"

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    const/4 v5, 0x4

    .line 22
    const/4 v6, 0x0

    .line 23
    invoke-static/range {v1 .. v6}, Lcom/discord/logging/Log;->w$default(Lcom/discord/logging/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    if-eqz p1, :cond_1

    .line 28
    .line 29
    invoke-direct {p0}, Lcom/discord/audio/DiscordAudioManager;->startObservingVolumeChanges()V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lcom/discord/audio/DiscordAudioManager;->audioManager:Landroid/media/AudioManager;

    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/media/AudioManager;->isSpeakerphoneOn()Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    iput-boolean p1, p0, Lcom/discord/audio/DiscordAudioManager;->savedIsSpeakerphoneOn:Z

    .line 39
    .line 40
    iget-object p1, p0, Lcom/discord/audio/DiscordAudioManager;->audioManager:Landroid/media/AudioManager;

    .line 41
    .line 42
    invoke-virtual {p1}, Landroid/media/AudioManager;->isMicrophoneMute()Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    iput-boolean p1, p0, Lcom/discord/audio/DiscordAudioManager;->savedIsMicrophoneMute:Z

    .line 47
    .line 48
    iget-object p1, p0, Lcom/discord/audio/DiscordAudioManager;->audioManager:Landroid/media/AudioManager;

    .line 49
    .line 50
    invoke-virtual {p1}, Landroid/media/AudioManager;->isBluetoothScoOn()Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    iput-boolean p1, p0, Lcom/discord/audio/DiscordAudioManager;->savedIsBluetoothScoOn:Z

    .line 55
    .line 56
    const/4 p1, 0x1

    .line 57
    invoke-direct {p0, p1}, Lcom/discord/audio/DiscordAudioManager;->setCommunicationModeOnInternal(Z)V

    .line 58
    .line 59
    .line 60
    invoke-direct {p0}, Lcom/discord/audio/DiscordAudioManager;->requestAudioFocus()Z

    .line 61
    .line 62
    .line 63
    invoke-direct {p0}, Lcom/discord/audio/DiscordAudioManager;->updateDeviceActivation()V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    invoke-direct {p0}, Lcom/discord/audio/DiscordAudioManager;->stopObservingVolumeChanges()V

    .line 68
    .line 69
    .line 70
    sget-object p1, Lcom/discord/audio/DiscordAudioManager$DeviceTypes;->INVALID:Lcom/discord/audio/DiscordAudioManager$DeviceTypes;

    .line 71
    .line 72
    invoke-direct {p0, p1}, Lcom/discord/audio/DiscordAudioManager;->activateDevice(Lcom/discord/audio/DiscordAudioManager$DeviceTypes;)V

    .line 73
    .line 74
    .line 75
    iget-object p1, p0, Lcom/discord/audio/DiscordAudioManager;->instanceLock:Ljava/lang/Object;

    .line 76
    .line 77
    monitor-enter p1

    .line 78
    :try_start_0
    sget-object v0, Lcom/discord/audio/DiscordAudioManager$DeviceTypes;->DEFAULT:Lcom/discord/audio/DiscordAudioManager$DeviceTypes;

    .line 79
    .line 80
    iput-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->requestedAudioDevice:Lcom/discord/audio/DiscordAudioManager$DeviceTypes;

    .line 81
    .line 82
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    .line 84
    monitor-exit p1

    .line 85
    const/4 p1, 0x0

    .line 86
    invoke-direct {p0, p1}, Lcom/discord/audio/DiscordAudioManager;->setCommunicationModeOnInternal(Z)V

    .line 87
    .line 88
    .line 89
    invoke-direct {p0}, Lcom/discord/audio/DiscordAudioManager;->releaseAudioFocus()V

    .line 90
    .line 91
    .line 92
    iget-boolean p1, p0, Lcom/discord/audio/DiscordAudioManager;->savedIsMicrophoneMute:Z

    .line 93
    .line 94
    invoke-direct {p0, p1}, Lcom/discord/audio/DiscordAudioManager;->setMicrophoneMute(Z)V

    .line 95
    .line 96
    .line 97
    iget-boolean p1, p0, Lcom/discord/audio/DiscordAudioManager;->savedIsSpeakerphoneOn:Z

    .line 98
    .line 99
    invoke-direct {p0, p1}, Lcom/discord/audio/DiscordAudioManager;->setSpeakerphoneOn(Z)V

    .line 100
    .line 101
    .line 102
    iget-boolean p1, p0, Lcom/discord/audio/DiscordAudioManager;->savedIsBluetoothScoOn:Z

    .line 103
    .line 104
    if-eqz p1, :cond_2

    .line 105
    .line 106
    invoke-direct {p0}, Lcom/discord/audio/DiscordAudioManager;->startBluetoothSco()V

    .line 107
    .line 108
    .line 109
    :cond_2
    :goto_0
    return-void

    .line 110
    :catchall_0
    move-exception v0

    .line 111
    monitor-exit p1

    .line 112
    throw v0
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
.end method

.method public final setDevice(Lcom/discord/audio/DiscordAudioManager$DeviceTypes;)Z
    .locals 14

    .line 1
    const-string v0, "deviceType"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->asyncInitThreadChecker:Lcom/discord/async_init/AsyncInitThreadChecker;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/discord/async_init/AsyncInitThreadChecker;->checkIsOnValidThread()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->context:Landroid/content/Context;

    .line 12
    .line 13
    invoke-static {v0}, Lcom/discord/audio/utils/AudioPermissionsUtilsKt;->hasModifyAudioSettingsPermission(Landroid/content/Context;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    sget-object v2, Lcom/discord/logging/Log;->INSTANCE:Lcom/discord/logging/Log;

    .line 21
    .line 22
    const-string v3, "DiscordAudioManager"

    .line 23
    .line 24
    const-string v4, "Can\'t setDevice, requires MODIFY_AUDIO_SETTINGS."

    .line 25
    .line 26
    const/4 v5, 0x0

    .line 27
    const/4 v6, 0x4

    .line 28
    const/4 v7, 0x0

    .line 29
    invoke-static/range {v2 .. v7}, Lcom/discord/logging/Log;->w$default(Lcom/discord/logging/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    return v1

    .line 33
    :cond_0
    sget-object v8, Lcom/discord/logging/Log;->INSTANCE:Lcom/discord/logging/Log;

    .line 34
    .line 35
    const-string v9, "DiscordAudioManager"

    .line 36
    .line 37
    new-instance v0, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    .line 42
    const-string v2, "setDevice(deviceType="

    .line 43
    .line 44
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v2, ")"

    .line 51
    .line 52
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v10

    .line 59
    const/4 v11, 0x0

    .line 60
    const/4 v12, 0x4

    .line 61
    const/4 v13, 0x0

    .line 62
    invoke-static/range {v8 .. v13}, Lcom/discord/logging/Log;->i$default(Lcom/discord/logging/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->instanceLock:Ljava/lang/Object;

    .line 66
    .line 67
    monitor-enter v0

    .line 68
    :try_start_0
    iget-object v2, p0, Lcom/discord/audio/DiscordAudioManager;->audioDevices:Ljava/util/List;

    .line 69
    .line 70
    new-instance v3, Ljava/util/ArrayList;

    .line 71
    .line 72
    const/16 v4, 0xa

    .line 73
    .line 74
    invoke-static {v2, v4}, Lkotlin/collections/h;->t(Ljava/lang/Iterable;I)I

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 79
    .line 80
    .line 81
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    if-eqz v4, :cond_1

    .line 90
    .line 91
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    move-object v5, v4

    .line 96
    check-cast v5, Lcom/discord/audio/DiscordAudioManager$AudioDevice;

    .line 97
    .line 98
    const/4 v6, 0x0

    .line 99
    const/4 v7, 0x0

    .line 100
    const/4 v8, 0x0

    .line 101
    const/4 v9, 0x0

    .line 102
    const/16 v10, 0xf

    .line 103
    .line 104
    const/4 v11, 0x0

    .line 105
    invoke-static/range {v5 .. v11}, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->copy$default(Lcom/discord/audio/DiscordAudioManager$AudioDevice;Lcom/discord/audio/DiscordAudioManager$DeviceTypes;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/discord/audio/DiscordAudioManager$AudioDevice;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 110
    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_1
    monitor-exit v0

    .line 114
    sget-object v0, Lcom/discord/audio/DiscordAudioManager$DeviceTypes;->DEFAULT:Lcom/discord/audio/DiscordAudioManager$DeviceTypes;

    .line 115
    .line 116
    const/4 v2, 0x1

    .line 117
    if-ne p1, v0, :cond_2

    .line 118
    .line 119
    iget-object p1, p0, Lcom/discord/audio/DiscordAudioManager;->instanceLock:Ljava/lang/Object;

    .line 120
    .line 121
    monitor-enter p1

    .line 122
    :try_start_1
    iput-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->requestedAudioDevice:Lcom/discord/audio/DiscordAudioManager$DeviceTypes;

    .line 123
    .line 124
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 125
    .line 126
    monitor-exit p1

    .line 127
    invoke-direct {p0, v3}, Lcom/discord/audio/DiscordAudioManager;->activateDefaultDevice(Ljava/util/List;)V

    .line 128
    .line 129
    .line 130
    return v2

    .line 131
    :catchall_0
    move-exception v0

    .line 132
    monitor-exit p1

    .line 133
    throw v0

    .line 134
    :cond_2
    invoke-direct {p0, p1}, Lcom/discord/audio/DiscordAudioManager;->isValidOutputDevice(Lcom/discord/audio/DiscordAudioManager$DeviceTypes;)Z

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    if-eqz v0, :cond_4

    .line 139
    .line 140
    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->instanceLock:Ljava/lang/Object;

    .line 141
    .line 142
    monitor-enter v0

    .line 143
    :try_start_2
    iget-object v3, p0, Lcom/discord/audio/DiscordAudioManager;->audioDevices:Ljava/util/List;

    .line 144
    .line 145
    invoke-virtual {p1}, Lcom/discord/audio/DiscordAudioManager$DeviceTypes;->getValue()I

    .line 146
    .line 147
    .line 148
    move-result v4

    .line 149
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    check-cast v3, Lcom/discord/audio/DiscordAudioManager$AudioDevice;

    .line 154
    .line 155
    invoke-virtual {v3}, Lcom/discord/audio/DiscordAudioManager$AudioDevice;->isAvailable()Z

    .line 156
    .line 157
    .line 158
    move-result v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 159
    xor-int/2addr v3, v2

    .line 160
    monitor-exit v0

    .line 161
    if-eqz v3, :cond_3

    .line 162
    .line 163
    goto :goto_1

    .line 164
    :cond_3
    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->instanceLock:Ljava/lang/Object;

    .line 165
    .line 166
    monitor-enter v0

    .line 167
    :try_start_3
    iput-object p1, p0, Lcom/discord/audio/DiscordAudioManager;->requestedAudioDevice:Lcom/discord/audio/DiscordAudioManager$DeviceTypes;

    .line 168
    .line 169
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 170
    .line 171
    monitor-exit v0

    .line 172
    invoke-direct {p0, p1}, Lcom/discord/audio/DiscordAudioManager;->activateDevice(Lcom/discord/audio/DiscordAudioManager$DeviceTypes;)V

    .line 173
    .line 174
    .line 175
    return v2

    .line 176
    :catchall_1
    move-exception p1

    .line 177
    monitor-exit v0

    .line 178
    throw p1

    .line 179
    :catchall_2
    move-exception p1

    .line 180
    monitor-exit v0

    .line 181
    throw p1

    .line 182
    :cond_4
    :goto_1
    return v1

    .line 183
    :catchall_3
    move-exception p1

    .line 184
    monitor-exit v0

    .line 185
    throw p1
    .line 186
    .line 187
    .line 188
    .line 189
.end method

.method public final setMediaVolume(F)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->asyncInitThreadChecker:Lcom/discord/async_init/AsyncInitThreadChecker;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/discord/async_init/AsyncInitThreadChecker;->checkIsOnValidThread()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    cmpg-float v0, v0, p1

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-gtz v0, :cond_0

    .line 11
    .line 12
    const/high16 v0, 0x3f800000    # 1.0f

    .line 13
    .line 14
    cmpg-float v0, p1, v0

    .line 15
    .line 16
    if-gtz v0, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v0, v1

    .line 21
    :goto_0
    if-nez v0, :cond_1

    .line 22
    .line 23
    sget-object v2, Lcom/discord/logging/Log;->INSTANCE:Lcom/discord/logging/Log;

    .line 24
    .line 25
    const-string v3, "DiscordAudioManager"

    .line 26
    .line 27
    new-instance v0, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    .line 31
    .line 32
    const-string v1, "Unexpected media volume ratio: "

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    const/4 v5, 0x0

    .line 45
    const/4 v6, 0x4

    .line 46
    const/4 v7, 0x0

    .line 47
    invoke-static/range {v2 .. v7}, Lcom/discord/logging/Log;->w$default(Lcom/discord/logging/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/discord/audio/DiscordAudioManager;->audioManager:Landroid/media/AudioManager;

    .line 52
    .line 53
    iget v2, p0, Lcom/discord/audio/DiscordAudioManager;->maxMediaVolume:I

    .line 54
    .line 55
    int-to-float v2, v2

    .line 56
    mul-float/2addr p1, v2

    .line 57
    invoke-static {p1}, Lzf/a;->a(F)I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    const/4 v2, 0x3

    .line 62
    invoke-virtual {v0, v2, p1, v1}, Landroid/media/AudioManager;->setStreamVolume(III)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :catch_0
    move-exception p1

    .line 67
    sget-object v0, Lcom/discord/logging/Log;->INSTANCE:Lcom/discord/logging/Log;

    .line 68
    .line 69
    const-string v1, "DiscordAudioManager"

    .line 70
    .line 71
    const-string v2, "Failed to set stream volume"

    .line 72
    .line 73
    invoke-virtual {v0, v1, v2, p1}, Lcom/discord/logging/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    :goto_1
    return-void
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
.end method
