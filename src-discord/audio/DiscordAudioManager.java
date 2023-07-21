package com.discord.audio;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import androidx.core.content.a;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.discord.async_init.AsyncInitThreadChecker;
import com.discord.audio.bluetooth.BluetoothBroadcastReceiver;
import com.discord.audio.enums.BluetoothHeadsetAudioState;
import com.discord.audio.enums.BluetoothProfileConnectionState;
import com.discord.audio.enums.ScoAudioState;
import com.discord.audio.enums.WiredHeadsetState;
import com.discord.audio.utils.AudioPermissionsUtilsKt;
import com.discord.logging.Log;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.j;
import kotlin.collections.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import tf.c;

@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u0000 \u0092\u00012\u00020\u0001:\b\u0093\u0001\u0094\u0001\u0092\u0001\u0095\u0001BS\u0012\u0006\u00107\u001a\u000206\u0012\u0018\u0010:\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0004\u0012\u00020\u000409\u0012\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000409\u0012\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\u000409¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u000e\u001a\u00020\u0004H\u0003J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\b\u0010\u0010\u001a\u00020\u0004H\u0002J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\u0013\u001a\u00020\u0004H\u0002J\b\u0010\u0014\u001a\u00020\u0004H\u0002J\u0016\u0010\u0018\u001a\u00020\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002J\b\u0010\u0019\u001a\u00020\u0004H\u0002J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0003J\u0010\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH\u0003J\u0012\u0010!\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010 H\u0003J\u0012\u0010$\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\"H\u0003J\u0010\u0010'\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%H\u0003J\u0010\u0010*\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(H\u0003J\u000e\u0010,\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\nJ\u0006\u0010-\u001a\u00020\u0004J\u0006\u0010.\u001a\u00020\u0004J\u000e\u0010/\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u00102\u001a\u00020\u00042\b\b\u0001\u00101\u001a\u000200J\u000f\u00105\u001a\u00020\u0004H\u0001¢\u0006\u0004\b3\u00104R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R)\u0010:\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0004\u0012\u00020\u0004098\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R#\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004098\u0006¢\u0006\f\n\u0004\b>\u0010;\u001a\u0004\b?\u0010=R#\u0010A\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\u0004098\u0006¢\u0006\f\n\u0004\bA\u0010;\u001a\u0004\bB\u0010=R\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010F\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010H\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR \u0010N\u001a\u00020M8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bN\u0010O\u0012\u0004\bR\u00104\u001a\u0004\bP\u0010QR \u0010T\u001a\u00020S8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bT\u0010U\u0012\u0004\bX\u00104\u001a\u0004\bV\u0010WR*\u0010Y\u001a\u0004\u0018\u00010\"8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bY\u0010Z\u0012\u0004\b_\u00104\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R(\u0010a\u001a\u00020`8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\ba\u0010b\u0012\u0004\bg\u00104\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR*\u0010i\u001a\u0004\u0018\u00010h8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bi\u0010j\u0012\u0004\bo\u00104\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\u0018\u0010q\u001a\u0004\u0018\u00010p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR6\u0010t\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\f\u0010s\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR*\u0010z\u001a\u00020\n2\u0006\u0010s\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR\u001c\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R1\u0010\u0083\u0001\u001a\u00020@2\u0006\u0010s\u001a\u00020@8\u0006@BX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001c\u0010\u0089\u0001\u001a\u00020@8\u0006¢\u0006\u0010\n\u0006\b\u0089\u0001\u0010\u0084\u0001\u001a\u0006\b\u008a\u0001\u0010\u0086\u0001R\u0018\u0010\u008b\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008b\u0001\u0010{R\u0018\u0010\u008c\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008c\u0001\u0010GR\u0018\u0010\u008d\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008d\u0001\u0010GR\u0018\u0010\u008e\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008e\u0001\u0010GR\u0018\u0010\u008f\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008f\u0001\u0010G¨\u0006\u0096\u0001"}, d2 = {"Lcom/discord/audio/DiscordAudioManager;", "", "", ViewProps.ON, "", "setCommunicationModeOnInternal", "requestAudioFocus", "releaseAudioFocus", "startObservingVolumeChanges", "stopObservingVolumeChanges", "Lcom/discord/audio/DiscordAudioManager$DeviceTypes;", "device", "isValidOutputDevice", "setMicrophoneMute", "refreshBluetoothHeadset", "hasWiredHeadset", "registerAudioFocusListener", "setSpeakerphoneOn", "activateDevice", "startBluetoothSco", "stopBluetoothSco", "", "Lcom/discord/audio/DiscordAudioManager$AudioDevice;", "devices", "activateDefaultDevice", "updateDeviceActivation", "Lcom/discord/audio/enums/BluetoothProfileConnectionState$Update;", "connectionState", "onHeadsetConnectionStateUpdate", "Lcom/discord/audio/enums/BluetoothHeadsetAudioState$Update;", "audioState", "onHeadsetAudioStateUpdate", "Landroid/bluetooth/BluetoothDevice;", "onActiveDeviceUpdate", "Landroid/bluetooth/BluetoothHeadset;", "bluetoothHeadset", "onHeadsetProxyConnectionUpdate", "Lcom/discord/audio/enums/WiredHeadsetState;", "wiredHeadsetState", "onWiredHeadsetPlug", "Lcom/discord/audio/enums/ScoAudioState$Update;", "scoAudioStateUpdate", "onScoAudioStateUpdate", "deviceType", "setDevice", "makeEarpieceUnavailable", "resetEarpieceAvailability", "setCommunicationModeOn", "", "ratio", "setMediaVolume", "registerHandlers$audio_release", "()V", "registerHandlers", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Lkotlin/Function1;", "onAudioDevicesUpdated", "Lkotlin/jvm/functions/Function1;", "getOnAudioDevicesUpdated", "()Lkotlin/jvm/functions/Function1;", "onActiveAudioDeviceChanged", "getOnActiveAudioDeviceChanged", "", "onCurrentMediaVolumeChanged", "getOnCurrentMediaVolumeChanged", "Landroid/media/AudioManager;", "audioManager", "Landroid/media/AudioManager;", "hasEarpiece", "Z", "instanceLock", "Ljava/lang/Object;", "Lcom/discord/async_init/AsyncInitThreadChecker;", "asyncInitThreadChecker", "Lcom/discord/async_init/AsyncInitThreadChecker;", "Lcom/discord/audio/bluetooth/BluetoothBroadcastReceiver;", "bluetoothBroadcastReceiver", "Lcom/discord/audio/bluetooth/BluetoothBroadcastReceiver;", "getBluetoothBroadcastReceiver$audio_release", "()Lcom/discord/audio/bluetooth/BluetoothBroadcastReceiver;", "getBluetoothBroadcastReceiver$audio_release$annotations", "Lcom/discord/audio/AudioManagerBroadcastReceiver;", "audioManagerBroadcastReceiver", "Lcom/discord/audio/AudioManagerBroadcastReceiver;", "getAudioManagerBroadcastReceiver$audio_release", "()Lcom/discord/audio/AudioManagerBroadcastReceiver;", "getAudioManagerBroadcastReceiver$audio_release$annotations", "bluetoothHeadsetProfileProxy", "Landroid/bluetooth/BluetoothHeadset;", "getBluetoothHeadsetProfileProxy$audio_release", "()Landroid/bluetooth/BluetoothHeadset;", "setBluetoothHeadsetProfileProxy$audio_release", "(Landroid/bluetooth/BluetoothHeadset;)V", "getBluetoothHeadsetProfileProxy$audio_release$annotations", "Lcom/discord/audio/DiscordAudioManager$BluetoothScoState;", "bluetoothScoState", "Lcom/discord/audio/DiscordAudioManager$BluetoothScoState;", "getBluetoothScoState$audio_release", "()Lcom/discord/audio/DiscordAudioManager$BluetoothScoState;", "setBluetoothScoState$audio_release", "(Lcom/discord/audio/DiscordAudioManager$BluetoothScoState;)V", "getBluetoothScoState$audio_release$annotations", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "audioFocusListener", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "getAudioFocusListener$audio_release", "()Landroid/media/AudioManager$OnAudioFocusChangeListener;", "setAudioFocusListener$audio_release", "(Landroid/media/AudioManager$OnAudioFocusChangeListener;)V", "getAudioFocusListener$audio_release$annotations", "Landroid/media/AudioFocusRequest;", "audioFocusRequest", "Landroid/media/AudioFocusRequest;", "value", "audioDevices", "Ljava/util/List;", "getAudioDevices", "()Ljava/util/List;", "setAudioDevices", "(Ljava/util/List;)V", "activeAudioDevice", "Lcom/discord/audio/DiscordAudioManager$DeviceTypes;", "getActiveAudioDevice", "()Lcom/discord/audio/DiscordAudioManager$DeviceTypes;", "setActiveAudioDevice", "(Lcom/discord/audio/DiscordAudioManager$DeviceTypes;)V", "Landroid/database/ContentObserver;", "mediaVolumeObserver", "Landroid/database/ContentObserver;", "currentMediaVolume", "I", "getCurrentMediaVolume", "()I", "setCurrentMediaVolume", "(I)V", "maxMediaVolume", "getMaxMediaVolume", "requestedAudioDevice", "savedIsSpeakerphoneOn", "savedIsMicrophoneMute", "savedIsBluetoothScoOn", "inDiscordRequestedCommunicationMode", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Companion", "AudioDevice", "BluetoothScoState", "DeviceTypes", "audio_release"}, k = 1, mv = {1, 8, 0})

public final class DiscordAudioManager {
    public static final Companion Companion = new Companion(null);
    private static final List<DeviceTypes> DEFAULT_DEVICE_PRIORITIZATION;
    private static final String TAG = "DiscordAudioManager";
    private DeviceTypes activeAudioDevice;
    private List<AudioDevice> audioDevices;
    private AudioManager.OnAudioFocusChangeListener audioFocusListener;
    private AudioFocusRequest audioFocusRequest;
    private final AudioManager audioManager;
    private BluetoothHeadset bluetoothHeadsetProfileProxy;
    private final Context context;
    private int currentMediaVolume;
    private final boolean hasEarpiece;
    private boolean inDiscordRequestedCommunicationMode;
    private final int maxMediaVolume;
    private ContentObserver mediaVolumeObserver;
    private final Function1<DeviceTypes, Unit> onActiveAudioDeviceChanged;
    private final Function1<List<AudioDevice>, Unit> onAudioDevicesUpdated;
    private final Function1<Integer, Unit> onCurrentMediaVolumeChanged;
    private DeviceTypes requestedAudioDevice;
    private boolean savedIsBluetoothScoOn;
    private boolean savedIsMicrophoneMute;
    private boolean savedIsSpeakerphoneOn;
    private final Object instanceLock = this;
    private final AsyncInitThreadChecker asyncInitThreadChecker = new AsyncInitThreadChecker(TAG);
    private final BluetoothBroadcastReceiver bluetoothBroadcastReceiver = new BluetoothBroadcastReceiver(new DiscordAudioManager$bluetoothBroadcastReceiver$1(this), new DiscordAudioManager$bluetoothBroadcastReceiver$2(this), new DiscordAudioManager$bluetoothBroadcastReceiver$3(this), new DiscordAudioManager$bluetoothBroadcastReceiver$4(this));
    private final AudioManagerBroadcastReceiver audioManagerBroadcastReceiver = new AudioManagerBroadcastReceiver(new DiscordAudioManager$audioManagerBroadcastReceiver$1(this), new DiscordAudioManager$audioManagerBroadcastReceiver$2(this));
    private BluetoothScoState bluetoothScoState = BluetoothScoState.INVALID;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/discord/audio/DiscordAudioManager$BluetoothScoState;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "INVALID", "OFF", "ON", "TURNING_ON", "TURNING_OFF", "audio_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public enum BluetoothScoState {
        INVALID(-1),
        OFF(0),
        ON(1),
        TURNING_ON(2),
        TURNING_OFF(3);
        
        private final int value;

        BluetoothScoState(int i10) {
            this.value = i10;
        }

        public final int getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/discord/audio/DiscordAudioManager$Companion;", "", "()V", "DEFAULT_DEVICE_PRIORITIZATION", "", "Lcom/discord/audio/DiscordAudioManager$DeviceTypes;", "getDEFAULT_DEVICE_PRIORITIZATION", "()Ljava/util/List;", "TAG", "", "getSupportedDevices", "Lcom/discord/audio/DiscordAudioManager$AudioDevice;", "audio_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<DeviceTypes> getDEFAULT_DEVICE_PRIORITIZATION() {
            return DiscordAudioManager.DEFAULT_DEVICE_PRIORITIZATION;
        }

        public final List<AudioDevice> getSupportedDevices() {
            List<AudioDevice> k10;
            k10 = j.k(new AudioDevice(DeviceTypes.SPEAKERPHONE, false, null, null, 14, null), new AudioDevice(DeviceTypes.WIRED_HEADSET, false, null, null, 14, null), new AudioDevice(DeviceTypes.EARPIECE, false, null, null, 14, null), new AudioDevice(DeviceTypes.BLUETOOTH_HEADSET, false, null, null, 14, null));
            return k10;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/discord/audio/DiscordAudioManager$DeviceTypes;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "DEFAULT", "INVALID", "SPEAKERPHONE", "WIRED_HEADSET", "EARPIECE", "BLUETOOTH_HEADSET", "audio_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public enum DeviceTypes {
        DEFAULT(-2),
        INVALID(-1),
        SPEAKERPHONE(0),
        WIRED_HEADSET(1),
        EARPIECE(2),
        BLUETOOTH_HEADSET(3);
        
        private final int value;

        DeviceTypes(int i10) {
            this.value = i10;
        }

        public final int getValue() {
            return this.value;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    
    public  class WhenMappings {
        public static final  int[] $EnumSwitchMapping$0;
        public static final  int[] $EnumSwitchMapping$1;
        public static final  int[] $EnumSwitchMapping$2;
        public static final  int[] $EnumSwitchMapping$3;
        public static final  int[] $EnumSwitchMapping$4;

        static {
            int[] iArr = new int[DeviceTypes.values().length];
            try {
                iArr[DeviceTypes.EARPIECE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DeviceTypes.WIRED_HEADSET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DeviceTypes.SPEAKERPHONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DeviceTypes.BLUETOOTH_HEADSET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DeviceTypes.INVALID.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DeviceTypes.DEFAULT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BluetoothProfileConnectionState.values().length];
            try {
                iArr2[BluetoothProfileConnectionState.Disconnected.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[BluetoothProfileConnectionState.Connected.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[BluetoothProfileConnectionState.Connecting.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[BluetoothProfileConnectionState.Disconnecting.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[BluetoothHeadsetAudioState.values().length];
            try {
                iArr3[BluetoothHeadsetAudioState.Connected.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[BluetoothHeadsetAudioState.Disconnected.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[BluetoothHeadsetAudioState.Connecting.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[BluetoothScoState.values().length];
            try {
                iArr4[BluetoothScoState.ON.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[BluetoothScoState.TURNING_ON.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[ScoAudioState.values().length];
            try {
                iArr5[ScoAudioState.Connected.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr5[ScoAudioState.Disconnected.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr5[ScoAudioState.Error.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr5[ScoAudioState.Connecting.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$4 = iArr5;
        }
    }

    static {
        List<DeviceTypes> k10;
        k10 = j.k(DeviceTypes.EARPIECE, DeviceTypes.SPEAKERPHONE, DeviceTypes.BLUETOOTH_HEADSET, DeviceTypes.WIRED_HEADSET);
        DEFAULT_DEVICE_PRIORITIZATION = k10;
    }

    
    public DiscordAudioManager(Context context, Function1<? super List<AudioDevice>, Unit> onAudioDevicesUpdated, Function1<? super DeviceTypes, Unit> onActiveAudioDeviceChanged, Function1<? super Integer, Unit> onCurrentMediaVolumeChanged) {
        AudioDevice audioDevice;
        q.g(context, "context");
        q.g(onAudioDevicesUpdated, "onAudioDevicesUpdated");
        q.g(onActiveAudioDeviceChanged, "onActiveAudioDeviceChanged");
        q.g(onCurrentMediaVolumeChanged, "onCurrentMediaVolumeChanged");
        this.context = context;
        this.onAudioDevicesUpdated = onAudioDevicesUpdated;
        this.onActiveAudioDeviceChanged = onActiveAudioDeviceChanged;
        this.onCurrentMediaVolumeChanged = onCurrentMediaVolumeChanged;
        Object i10 = a.i(context, AudioManager.class);
        q.d(i10);
        this.audioManager = (AudioManager) i10;
        this.hasEarpiece = context.getPackageManager().hasSystemFeature("android.hardware.telephony");
        new Handler(Looper.getMainLooper()).post(new Runnable() { 
            @Override 
            public final void run() {
                DiscordAudioManager._init_$lambda$0(DiscordAudioManager.this);
            }
        });
        List<AudioDevice> supportedDevices = Companion.getSupportedDevices();
        ArrayList arrayList = new ArrayList();
        for (AudioDevice audioDevice2 : supportedDevices) {
            switch (WhenMappings.$EnumSwitchMapping$0[audioDevice2.getType().ordinal()]) {
                case 1:
                    audioDevice = AudioDevice.copy$default(audioDevice2, null, this.hasEarpiece, null, null, 13, null);
                    break;
                case 2:
                    audioDevice = AudioDevice.copy$default(audioDevice2, null, hasWiredHeadset(), null, null, 13, null);
                    break;
                case 3:
                    audioDevice = AudioDevice.copy$default(audioDevice2, null, true, null, null, 13, null);
                    break;
                case 4:
                    audioDevice = AudioDevice.copy$default(audioDevice2, null, false, null, null, 15, null);
                    break;
                case 5:
                case 6:
                    audioDevice = null;
                    break;
                default:
                    throw new ff.q();
            }
            if (audioDevice != null) {
                arrayList.add(audioDevice);
            }
        }
        this.audioDevices = arrayList;
        this.activeAudioDevice = DeviceTypes.INVALID;
        this.maxMediaVolume = this.audioManager.getStreamMaxVolume(3);
        this.requestedAudioDevice = DeviceTypes.DEFAULT;
    }

    
    public static final void _init_$lambda$0(DiscordAudioManager this$0) {
        q.g(this$0, "this$0");
        this$0.registerHandlers$audio_release();
    }

    private final void activateDefaultDevice(List<AudioDevice> list) {
        DeviceTypes deviceTypes;
        DeviceTypes deviceTypes2;
        synchronized (this.instanceLock) {
            List<DeviceTypes> list2 = DEFAULT_DEVICE_PRIORITIZATION;
            ListIterator<DeviceTypes> listIterator = list2.listIterator(list2.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    deviceTypes = null;
                    break;
                }
                deviceTypes = listIterator.previous();
                if (list.get(deviceTypes.getValue()).isAvailable()) {
                    break;
                }
            }
            deviceTypes2 = deviceTypes;
            if (deviceTypes2 == null) {
                deviceTypes2 = DeviceTypes.SPEAKERPHONE;
            }
        }
        Log log = Log.INSTANCE;
        Log.i$default(log, TAG, "Default device to activate: " + deviceTypes2, (Throwable) null, 4, (Object) null);
        activateDevice(deviceTypes2);
    }

    private final void activateDevice(DeviceTypes deviceTypes) {
        boolean z10;
        boolean z11;
        synchronized (this.instanceLock) {
            z10 = true;
            z11 = !this.inDiscordRequestedCommunicationMode;
        }
        if (z11) {
            Log.w$default(Log.INSTANCE, TAG, "Unable to activate audio output outside Discord-requested communication mode", (Throwable) null, 4, (Object) null);
            return;
        }
        if (deviceTypes == DeviceTypes.BLUETOOTH_HEADSET) {
            startBluetoothSco();
        } else {
            stopBluetoothSco();
        }
        if (deviceTypes != DeviceTypes.SPEAKERPHONE) {
            z10 = false;
        }
        setSpeakerphoneOn(z10);
        synchronized (this.instanceLock) {
            setActiveAudioDevice(deviceTypes);
            Unit unit = Unit.f20664a;
        }
        Log.i$default(Log.INSTANCE, TAG, "Activated device: " + deviceTypes, (Throwable) null, 4, (Object) null);
    }

    public static  void getAudioFocusListener$audio_release$annotations() {
    }

    public static  void getAudioManagerBroadcastReceiver$audio_release$annotations() {
    }

    public static  void getBluetoothBroadcastReceiver$audio_release$annotations() {
    }

    public static  void getBluetoothHeadsetProfileProxy$audio_release$annotations() {
    }

    public static  void getBluetoothScoState$audio_release$annotations() {
    }

    private final boolean hasWiredHeadset() {
        return this.audioManager.isWiredHeadsetOn();
    }

    private final boolean isValidOutputDevice(DeviceTypes deviceTypes) {
        switch (WhenMappings.$EnumSwitchMapping$0[deviceTypes.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return true;
            case 5:
            case 6:
                return false;
            default:
                throw new ff.q();
        }
    }

    
    public final void onActiveDeviceUpdate(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice != null) {
            updateDeviceActivation();
        }
    }

    
    @SuppressLint({"MissingPermission"})
    public final void onHeadsetAudioStateUpdate(BluetoothHeadsetAudioState.Update update) {
        String str;
        int s10;
        AudioDevice audioDevice;
        String str2;
        String str3;
        BluetoothHeadsetAudioState current = update.getCurrent();
        if (current == null) {
            current = BluetoothHeadsetAudioState.Disconnected;
        }
        BluetoothDevice device = update.getDevice();
        Log log = Log.INSTANCE;
        if (device != null) {
            str = device.getName();
        } else {
            str = null;
        }
        Log.i$default(log, TAG, "[onHeadsetAudioStateChanged] state: " + current + ", device: " + str, (Throwable) null, 4, (Object) null);
        int i10 = WhenMappings.$EnumSwitchMapping$2[current.ordinal()];
        if (i10 == 1) {
            synchronized (this.instanceLock) {
                List<AudioDevice> list = this.audioDevices;
                s10 = k.s(list, 10);
                ArrayList arrayList = new ArrayList(s10);
                for (AudioDevice audioDevice2 : list) {
                    if (WhenMappings.$EnumSwitchMapping$0[audioDevice2.getType().ordinal()] == 4) {
                        if (device != null) {
                            str2 = device.getAddress();
                        } else {
                            str2 = null;
                        }
                        if (device != null) {
                            str3 = device.getName();
                        } else {
                            str3 = null;
                        }
                        audioDevice = AudioDevice.copy$default(audioDevice2, null, true, str2, str3, 1, null);
                    } else {
                        audioDevice = AudioDevice.copy$default(audioDevice2, null, false, null, null, 15, null);
                    }
                    arrayList.add(audioDevice);
                }
                setAudioDevices(arrayList);
                Unit unit = Unit.f20664a;
            }
        } else if (i10 == 2) {
            updateDeviceActivation();
        }
    }

    
    @SuppressLint({"MissingPermission"})
    public final void onHeadsetConnectionStateUpdate(BluetoothProfileConnectionState.Update update) {
        String str;
        ArrayList arrayList;
        int s10;
        DeviceTypes deviceTypes;
        BluetoothProfileConnectionState current = update.getCurrent();
        if (current == null) {
            current = BluetoothProfileConnectionState.Disconnected;
        }
        BluetoothDevice device = update.getDevice();
        Log log = Log.INSTANCE;
        String str2 = null;
        if (device != null) {
            str = device.getName();
        } else {
            str = null;
        }
        Log.i$default(log, TAG, "[onHeadsetConnectionStateChanged] state: " + current + ", device: " + str, (Throwable) null, 4, (Object) null);
        int i10 = WhenMappings.$EnumSwitchMapping$1[current.ordinal()];
        if (i10 == 1) {
            synchronized (this.instanceLock) {
                List<AudioDevice> list = this.audioDevices;
                s10 = k.s(list, 10);
                arrayList = new ArrayList(s10);
                for (AudioDevice audioDevice : list) {
                    arrayList.add(AudioDevice.copy$default(audioDevice, null, false, null, null, 15, null));
                }
            }
            DeviceTypes deviceTypes2 = DeviceTypes.BLUETOOTH_HEADSET;
            if (((AudioDevice) arrayList.get(deviceTypes2.getValue())).getId() != null) {
                if (device != null) {
                    str2 = device.getAddress();
                }
                if (q.b(str2, ((AudioDevice) arrayList.get(deviceTypes2.getValue())).getId())) {
                    updateDeviceActivation();
                }
            }
        } else if (i10 == 2) {
            synchronized (this.instanceLock) {
                deviceTypes = this.activeAudioDevice;
            }
            if (deviceTypes == DeviceTypes.BLUETOOTH_HEADSET) {
                refreshBluetoothHeadset();
            } else {
                updateDeviceActivation();
            }
        } else if (i10 == 3 || i10 == 4) {
            Log.i$default(log, TAG, "[onHeadsetConnectionStateChanged] " + current + "...", (Throwable) null, 4, (Object) null);
        }
    }

    
    public final void onHeadsetProxyConnectionUpdate(BluetoothHeadset bluetoothHeadset) {
        this.bluetoothHeadsetProfileProxy = bluetoothHeadset;
    }

    
    public final void onScoAudioStateUpdate(ScoAudioState.Update update) {
        boolean z10;
        int s10;
        AudioDevice audioDevice;
        Log log = Log.INSTANCE;
        BluetoothScoState bluetoothScoState = this.bluetoothScoState;
        boolean isBluetoothScoOn = this.audioManager.isBluetoothScoOn();
        Log.i$default(log, TAG, "[onScoAudioStateUpdate] scoAudioStateUpdate = " + update + ", bluetoothScoState=" + bluetoothScoState + ", isBluetoothScoOn=" + isBluetoothScoOn, (Throwable) null, 4, (Object) null);
        int i10 = WhenMappings.$EnumSwitchMapping$4[update.getCurrent().ordinal()];
        if (i10 == 1) {
            startBluetoothSco();
        } else if (i10 == 2) {
            BluetoothScoState bluetoothScoState2 = this.bluetoothScoState;
            stopBluetoothSco();
            int i11 = WhenMappings.$EnumSwitchMapping$3[bluetoothScoState2.ordinal()];
            if (i11 == 1) {
                synchronized (this.instanceLock) {
                    z10 = this.inDiscordRequestedCommunicationMode;
                }
                if (z10) {
                    Log.i$default(log, TAG, "SCO off detected directly from ON. Refreshing Bluetooth device", (Throwable) null, 4, (Object) null);
                    startBluetoothSco();
                    updateDeviceActivation();
                }
            } else if (i11 == 2) {
                int mode = this.audioManager.getMode();
                Log.i$default(log, TAG, "Unable to turn on SCO. Clearing Bluetooth device. mode: " + mode, (Throwable) null, 4, (Object) null);
                synchronized (this.instanceLock) {
                    List<AudioDevice> list = this.audioDevices;
                    s10 = k.s(list, 10);
                    ArrayList arrayList = new ArrayList(s10);
                    for (AudioDevice audioDevice2 : list) {
                        if (WhenMappings.$EnumSwitchMapping$0[audioDevice2.getType().ordinal()] == 4) {
                            audioDevice = AudioDevice.copy$default(audioDevice2, null, false, null, null, 1, null);
                        } else {
                            audioDevice = AudioDevice.copy$default(audioDevice2, null, false, null, null, 15, null);
                        }
                        arrayList.add(audioDevice);
                    }
                    setAudioDevices(arrayList);
                    Unit unit = Unit.f20664a;
                }
                activateDefaultDevice(this.audioDevices);
            }
        }
    }

    
    public final void onWiredHeadsetPlug(WiredHeadsetState wiredHeadsetState) {
        int s10;
        AudioDevice audioDevice;
        int s11;
        AudioDevice audioDevice2;
        Log log = Log.INSTANCE;
        Log.i$default(log, TAG, "[onWiredHeadsetPlug] wiredHeadsetState = " + wiredHeadsetState, (Throwable) null, 4, (Object) null);
        if (q.b(wiredHeadsetState, WiredHeadsetState.Unplugged.INSTANCE)) {
            synchronized (this.instanceLock) {
                List<AudioDevice> list = this.audioDevices;
                s11 = k.s(list, 10);
                ArrayList arrayList = new ArrayList(s11);
                for (AudioDevice audioDevice3 : list) {
                    int i10 = WhenMappings.$EnumSwitchMapping$0[audioDevice3.getType().ordinal()];
                    if (i10 == 1) {
                        audioDevice2 = AudioDevice.copy$default(audioDevice3, null, this.hasEarpiece, null, null, 13, null);
                    } else if (i10 != 2) {
                        audioDevice2 = AudioDevice.copy$default(audioDevice3, null, false, null, null, 15, null);
                    } else {
                        audioDevice2 = AudioDevice.copy$default(audioDevice3, null, false, null, null, 13, null);
                    }
                    arrayList.add(audioDevice2);
                }
                setAudioDevices(arrayList);
                Unit unit = Unit.f20664a;
            }
        } else if (wiredHeadsetState instanceof WiredHeadsetState.PluggedIn) {
            synchronized (this.instanceLock) {
                List<AudioDevice> list2 = this.audioDevices;
                s10 = k.s(list2, 10);
                ArrayList arrayList2 = new ArrayList(s10);
                for (AudioDevice audioDevice4 : list2) {
                    int i11 = WhenMappings.$EnumSwitchMapping$0[audioDevice4.getType().ordinal()];
                    if (i11 == 1) {
                        audioDevice = AudioDevice.copy$default(audioDevice4, null, false, null, null, 13, null);
                    } else if (i11 != 2) {
                        audioDevice = AudioDevice.copy$default(audioDevice4, null, false, null, null, 15, null);
                    } else {
                        audioDevice = AudioDevice.copy$default(audioDevice4, null, true, null, null, 13, null);
                    }
                    arrayList2.add(audioDevice);
                }
                setAudioDevices(arrayList2);
                Unit unit2 = Unit.f20664a;
            }
        }
        updateDeviceActivation();
    }

    
    
    @android.annotation.SuppressLint({"MissingPermission"})
    
    private final void refreshBluetoothHeadset() {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.audio.DiscordAudioManager.refreshBluetoothHeadset():void");
    }

    private final void registerAudioFocusListener() {
        AudioManager.OnAudioFocusChangeListener iVar = new AudioManager.OnAudioFocusChangeListener() { 
            @Override 
            public final void onAudioFocusChange(int i10) {
                DiscordAudioManager.registerAudioFocusListener$lambda$22(DiscordAudioManager.this, i10);
            }
        };
        synchronized (this.instanceLock) {
            this.audioFocusListener = iVar;
            Unit unit = Unit.f20664a;
        }
    }

    
    public static final void registerAudioFocusListener$lambda$22(DiscordAudioManager this$0, int i10) {
        q.g(this$0, "this$0");
        Log log = Log.INSTANCE;
        Log.i$default(log, TAG, "[AudioFocus] new focus: " + i10, (Throwable) null, 4, (Object) null);
        if (i10 == -3 || i10 == -2) {
            this$0.setCommunicationModeOnInternal(false);
        } else if (i10 == 1) {
            this$0.setCommunicationModeOnInternal(true);
            this$0.updateDeviceActivation();
        }
    }

    
    
    
    
    
    private final void releaseAudioFocus() {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.audio.DiscordAudioManager.releaseAudioFocus():void");
    }

    
    
    
    
    
    
    
    private final boolean requestAudioFocus() {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.audio.DiscordAudioManager.requestAudioFocus():boolean");
    }

    private final void setActiveAudioDevice(DeviceTypes deviceTypes) {
        boolean z10;
        if (this.activeAudioDevice != deviceTypes) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.activeAudioDevice = deviceTypes;
        if (z10) {
            this.onActiveAudioDeviceChanged.invoke(deviceTypes);
        }
    }

    private final void setAudioDevices(List<AudioDevice> list) {
        boolean z10 = !q.b(this.audioDevices, list);
        this.audioDevices = list;
        if (z10) {
            this.onAudioDevicesUpdated.invoke(list);
        }
    }

    private final void setCommunicationModeOnInternal(boolean z10) {
        int i10;
        try {
            AudioManager audioManager = this.audioManager;
            if (z10) {
                i10 = 3;
            } else {
                i10 = 0;
            }
            audioManager.setMode(i10);
        } catch (SecurityException unused) {
        }
        synchronized (this.instanceLock) {
            this.inDiscordRequestedCommunicationMode = z10;
            Unit unit = Unit.f20664a;
        }
    }

    
    public final void setCurrentMediaVolume(int i10) {
        boolean z10;
        if (this.currentMediaVolume != i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.currentMediaVolume = i10;
        if (z10) {
            this.onCurrentMediaVolumeChanged.invoke(Integer.valueOf(i10));
        }
    }

    private final void setMicrophoneMute(boolean z10) {
        if (this.audioManager.isMicrophoneMute() != z10) {
            this.audioManager.setMicrophoneMute(z10);
        }
    }

    private final void setSpeakerphoneOn(boolean z10) {
        if (this.audioManager.isSpeakerphoneOn() != z10) {
            this.audioManager.setSpeakerphoneOn(z10);
        }
    }

    private final synchronized void startBluetoothSco() {
        BluetoothScoState bluetoothScoState;
        if (this.audioManager.isBluetoothScoOn()) {
            this.bluetoothScoState = BluetoothScoState.ON;
        }
        BluetoothScoState bluetoothScoState2 = this.bluetoothScoState;
        if (!(bluetoothScoState2 == BluetoothScoState.ON || bluetoothScoState2 == (bluetoothScoState = BluetoothScoState.TURNING_ON))) {
            this.bluetoothScoState = bluetoothScoState;
            this.audioManager.startBluetoothSco();
        }
    }

    private final void startObservingVolumeChanges() {
        final Handler handler;
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            handler = new Handler(myLooper);
        } else {
            handler = null;
        }
        ContentObserver discordAudioManager$startObservingVolumeChanges$volumeObserver$1 = new ContentObserver(handler) { 
            @Override 
            public void onChange(boolean z10) {
                AudioManager audioManager;
                super.onChange(z10);
                DiscordAudioManager discordAudioManager = DiscordAudioManager.this;
                audioManager = discordAudioManager.audioManager;
                discordAudioManager.setCurrentMediaVolume(audioManager.getStreamVolume(3));
            }
        };
        this.context.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, discordAudioManager$startObservingVolumeChanges$volumeObserver$1);
        this.mediaVolumeObserver = discordAudioManager$startObservingVolumeChanges$volumeObserver$1;
    }

    private final synchronized void stopBluetoothSco() {
        if (!this.audioManager.isBluetoothScoOn()) {
            this.bluetoothScoState = BluetoothScoState.OFF;
            return;
        }
        BluetoothScoState bluetoothScoState = this.bluetoothScoState;
        if (bluetoothScoState == BluetoothScoState.ON || bluetoothScoState == BluetoothScoState.TURNING_ON) {
            this.bluetoothScoState = BluetoothScoState.TURNING_OFF;
            this.audioManager.stopBluetoothSco();
        }
    }

    private final void stopObservingVolumeChanges() {
        ContentObserver contentObserver = this.mediaVolumeObserver;
        if (contentObserver != null) {
            this.context.getContentResolver().unregisterContentObserver(contentObserver);
        }
        this.mediaVolumeObserver = null;
    }

    private final void updateDeviceActivation() {
        DeviceTypes deviceTypes;
        ArrayList arrayList;
        int s10;
        synchronized (this.instanceLock) {
            deviceTypes = this.requestedAudioDevice;
        }
        refreshBluetoothHeadset();
        synchronized (this.instanceLock) {
            List<AudioDevice> list = this.audioDevices;
            s10 = k.s(list, 10);
            arrayList = new ArrayList(s10);
            for (AudioDevice audioDevice : list) {
                arrayList.add(AudioDevice.copy$default(audioDevice, null, false, null, null, 15, null));
            }
        }
        if (deviceTypes == DeviceTypes.DEFAULT || !arrayList.get(deviceTypes.getValue()).isAvailable()) {
            activateDefaultDevice(arrayList);
        } else {
            activateDevice(deviceTypes);
        }
    }

    public final DeviceTypes getActiveAudioDevice() {
        return this.activeAudioDevice;
    }

    public final List<AudioDevice> getAudioDevices() {
        return this.audioDevices;
    }

    public final AudioManager.OnAudioFocusChangeListener getAudioFocusListener$audio_release() {
        return this.audioFocusListener;
    }

    public final AudioManagerBroadcastReceiver getAudioManagerBroadcastReceiver$audio_release() {
        return this.audioManagerBroadcastReceiver;
    }

    public final BluetoothBroadcastReceiver getBluetoothBroadcastReceiver$audio_release() {
        return this.bluetoothBroadcastReceiver;
    }

    public final BluetoothHeadset getBluetoothHeadsetProfileProxy$audio_release() {
        return this.bluetoothHeadsetProfileProxy;
    }

    public final BluetoothScoState getBluetoothScoState$audio_release() {
        return this.bluetoothScoState;
    }

    public final int getCurrentMediaVolume() {
        return this.currentMediaVolume;
    }

    public final int getMaxMediaVolume() {
        return this.maxMediaVolume;
    }

    public final Function1<DeviceTypes, Unit> getOnActiveAudioDeviceChanged() {
        return this.onActiveAudioDeviceChanged;
    }

    public final Function1<List<AudioDevice>, Unit> getOnAudioDevicesUpdated() {
        return this.onAudioDevicesUpdated;
    }

    public final Function1<Integer, Unit> getOnCurrentMediaVolumeChanged() {
        return this.onCurrentMediaVolumeChanged;
    }

    public final synchronized void makeEarpieceUnavailable() {
        int s10;
        AudioDevice audioDevice;
        if (this.audioDevices.get(DeviceTypes.EARPIECE.getValue()).isAvailable()) {
            List<AudioDevice> list = this.audioDevices;
            s10 = k.s(list, 10);
            ArrayList arrayList = new ArrayList(s10);
            for (AudioDevice audioDevice2 : list) {
                if (WhenMappings.$EnumSwitchMapping$0[audioDevice2.getType().ordinal()] == 1) {
                    audioDevice = AudioDevice.copy$default(audioDevice2, null, false, null, null, 13, null);
                } else {
                    audioDevice = AudioDevice.copy$default(audioDevice2, null, false, null, null, 15, null);
                }
                arrayList.add(audioDevice);
            }
            setAudioDevices(arrayList);
            updateDeviceActivation();
        }
    }

    public final void registerHandlers$audio_release() {
        this.audioManagerBroadcastReceiver.register(this.context);
        this.bluetoothBroadcastReceiver.register(this.context);
        registerAudioFocusListener();
    }

    public final synchronized void resetEarpieceAvailability() {
        int s10;
        AudioDevice audioDevice;
        if (this.audioDevices.get(DeviceTypes.EARPIECE.getValue()).isAvailable() != this.hasEarpiece) {
            List<AudioDevice> list = this.audioDevices;
            s10 = k.s(list, 10);
            ArrayList arrayList = new ArrayList(s10);
            for (AudioDevice audioDevice2 : list) {
                if (WhenMappings.$EnumSwitchMapping$0[audioDevice2.getType().ordinal()] == 1) {
                    audioDevice = AudioDevice.copy$default(audioDevice2, null, this.hasEarpiece, null, null, 13, null);
                } else {
                    audioDevice = AudioDevice.copy$default(audioDevice2, null, false, null, null, 15, null);
                }
                arrayList.add(audioDevice);
            }
            setAudioDevices(arrayList);
            updateDeviceActivation();
        }
    }

    public final void setAudioFocusListener$audio_release(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        this.audioFocusListener = onAudioFocusChangeListener;
    }

    public final void setBluetoothHeadsetProfileProxy$audio_release(BluetoothHeadset bluetoothHeadset) {
        this.bluetoothHeadsetProfileProxy = bluetoothHeadset;
    }

    public final void setBluetoothScoState$audio_release(BluetoothScoState bluetoothScoState) {
        q.g(bluetoothScoState, "<set-?>");
        this.bluetoothScoState = bluetoothScoState;
    }

    public final void setCommunicationModeOn(boolean z10) {
        this.asyncInitThreadChecker.checkIsOnValidThread();
        if (!AudioPermissionsUtilsKt.hasModifyAudioSettingsPermission(this.context)) {
            Log.w$default(Log.INSTANCE, TAG, "MODIFY_AUDIO_SETTINGS is missing. Client will run with reduced functionality", (Throwable) null, 4, (Object) null);
        } else if (z10) {
            startObservingVolumeChanges();
            this.savedIsSpeakerphoneOn = this.audioManager.isSpeakerphoneOn();
            this.savedIsMicrophoneMute = this.audioManager.isMicrophoneMute();
            this.savedIsBluetoothScoOn = this.audioManager.isBluetoothScoOn();
            setCommunicationModeOnInternal(true);
            requestAudioFocus();
            updateDeviceActivation();
        } else {
            stopObservingVolumeChanges();
            activateDevice(DeviceTypes.INVALID);
            synchronized (this.instanceLock) {
                this.requestedAudioDevice = DeviceTypes.DEFAULT;
                Unit unit = Unit.f20664a;
            }
            setCommunicationModeOnInternal(false);
            releaseAudioFocus();
            setMicrophoneMute(this.savedIsMicrophoneMute);
            setSpeakerphoneOn(this.savedIsSpeakerphoneOn);
            if (this.savedIsBluetoothScoOn) {
                startBluetoothSco();
            }
        }
    }

    public final boolean setDevice(DeviceTypes deviceType) {
        ArrayList arrayList;
        int s10;
        boolean z10;
        q.g(deviceType, "deviceType");
        this.asyncInitThreadChecker.checkIsOnValidThread();
        if (!AudioPermissionsUtilsKt.hasModifyAudioSettingsPermission(this.context)) {
            Log.w$default(Log.INSTANCE, TAG, "Can't setDevice, requires MODIFY_AUDIO_SETTINGS.", (Throwable) null, 4, (Object) null);
            return false;
        }
        Log.i$default(Log.INSTANCE, TAG, "setDevice(deviceType=" + deviceType + ")", (Throwable) null, 4, (Object) null);
        synchronized (this.instanceLock) {
            List<AudioDevice> list = this.audioDevices;
            s10 = k.s(list, 10);
            arrayList = new ArrayList(s10);
            for (AudioDevice audioDevice : list) {
                arrayList.add(AudioDevice.copy$default(audioDevice, null, false, null, null, 15, null));
            }
        }
        DeviceTypes deviceTypes = DeviceTypes.DEFAULT;
        if (deviceType == deviceTypes) {
            synchronized (this.instanceLock) {
                this.requestedAudioDevice = deviceTypes;
                Unit unit = Unit.f20664a;
            }
            activateDefaultDevice(arrayList);
            return true;
        }
        if (isValidOutputDevice(deviceType)) {
            synchronized (this.instanceLock) {
                z10 = !this.audioDevices.get(deviceType.getValue()).isAvailable();
            }
            if (!z10) {
                synchronized (this.instanceLock) {
                    this.requestedAudioDevice = deviceType;
                    Unit unit2 = Unit.f20664a;
                }
                activateDevice(deviceType);
                return true;
            }
        }
        return false;
    }

    public final void setMediaVolume(float f10) {
        boolean z10;
        int b10;
        this.asyncInitThreadChecker.checkIsOnValidThread();
        if (0.0f > f10 || f10 > 1.0f) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            Log.w$default(Log.INSTANCE, TAG, "Unexpected media volume ratio: " + f10, (Throwable) null, 4, (Object) null);
            return;
        }
        try {
            AudioManager audioManager = this.audioManager;
            b10 = c.b(f10 * this.maxMediaVolume);
            audioManager.setStreamVolume(3, b10, 0);
        } catch (SecurityException e10) {
            Log.INSTANCE.w(TAG, "Failed to set stream volume", e10);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/discord/audio/DiscordAudioManager$AudioDevice;", "", "type", "Lcom/discord/audio/DiscordAudioManager$DeviceTypes;", "isAvailable", "", "id", "", ZeroconfModule.KEY_SERVICE_NAME, "(Lcom/discord/audio/DiscordAudioManager$DeviceTypes;ZLjava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "()Z", "getName", "getType", "()Lcom/discord/audio/DiscordAudioManager$DeviceTypes;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "audio_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class AudioDevice {

        
        private final String f6832id;
        private final boolean isAvailable;
        private final String name;
        private final DeviceTypes type;

        public AudioDevice() {
            this(null, false, null, null, 15, null);
        }

        public AudioDevice(DeviceTypes type, boolean z10, String str, String str2) {
            q.g(type, "type");
            this.type = type;
            this.isAvailable = z10;
            this.f6832id = str;
            this.name = str2;
        }

        public static  AudioDevice copy$default(AudioDevice audioDevice, DeviceTypes deviceTypes, boolean z10, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                deviceTypes = audioDevice.type;
            }
            if ((i10 & 2) != 0) {
                z10 = audioDevice.isAvailable;
            }
            if ((i10 & 4) != 0) {
                str = audioDevice.f6832id;
            }
            if ((i10 & 8) != 0) {
                str2 = audioDevice.name;
            }
            return audioDevice.copy(deviceTypes, z10, str, str2);
        }

        public final DeviceTypes component1() {
            return this.type;
        }

        public final boolean component2() {
            return this.isAvailable;
        }

        public final String component3() {
            return this.f6832id;
        }

        public final String component4() {
            return this.name;
        }

        public final AudioDevice copy(DeviceTypes type, boolean z10, String str, String str2) {
            q.g(type, "type");
            return new AudioDevice(type, z10, str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AudioDevice)) {
                return false;
            }
            AudioDevice audioDevice = (AudioDevice) obj;
            return this.type == audioDevice.type && this.isAvailable == audioDevice.isAvailable && q.b(this.f6832id, audioDevice.f6832id) && q.b(this.name, audioDevice.name);
        }

        public final String getId() {
            return this.f6832id;
        }

        public final String getName() {
            return this.name;
        }

        public final DeviceTypes getType() {
            return this.type;
        }

        public int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            boolean z10 = this.isAvailable;
            if (z10) {
                z10 = true;
            }
            int i10 = z10 ? 1 : 0;
            int i11 = z10 ? 1 : 0;
            int i12 = z10 ? 1 : 0;
            int i13 = (hashCode + i10) * 31;
            String str = this.f6832id;
            int i14 = 0;
            int hashCode2 = (i13 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.name;
            if (str2 != null) {
                i14 = str2.hashCode();
            }
            return hashCode2 + i14;
        }

        public final boolean isAvailable() {
            return this.isAvailable;
        }

        public String toString() {
            DeviceTypes deviceTypes = this.type;
            boolean z10 = this.isAvailable;
            String str = this.f6832id;
            String str2 = this.name;
            return "AudioDevice(type=" + deviceTypes + ", isAvailable=" + z10 + ", id=" + str + ", name=" + str2 + ")";
        }

        public  AudioDevice(DeviceTypes deviceTypes, boolean z10, String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? DeviceTypes.INVALID : deviceTypes, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : str2);
        }
    }
}
