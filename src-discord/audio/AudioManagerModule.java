package com.discord.audio;

import com.discord.audio.DiscordAudioManager;
import com.discord.audio.react.events.AudioManagerAudioDeviceChanged;
import com.discord.audio.react.events.AudioManagerAudioDevicesUpdated;
import com.discord.audio.react.events.AudioManagerMediaVolumeChanged;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import java.util.List;
import kg.x;
import kotlin.Metadata;
import kotlin.collections.k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.q;

@ReactModule(name = AudioManagerModule.NAME)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001%B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\b\u0010\u0016\u001a\u00020\u0010H\u0016J\b\u0010\u0017\u001a\u00020\u000eH\u0016J\b\u0010\u0018\u001a\u00020\u000eH\u0007J\u0010\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J\b\u0010\u001c\u001a\u00020\u000eH\u0007J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0010H\u0007J\u0010\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u001eH\u0007J\u0010\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020$H\u0007R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/discord/audio/AudioManagerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "audioManager", "Lcom/discord/audio/DiscordAudioManager;", "getAudioManager", "()Lcom/discord/audio/DiscordAudioManager;", "setAudioManager", "(Lcom/discord/audio/DiscordAudioManager;)V", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "addListener", "", "type", "", "getActiveAudioDevice", "cb", "Lcom/facebook/react/bridge/Callback;", "getAudioDevices", "getMediaVolume", "getName", "initialize", "makeEarpieceUnavailable", "removeListeners", "count", "", "resetEarpieceAvailability", "setActiveAudioDevice", "", "device", "setCommunicationModeOn", ViewProps.ON, "setMediaVolume", "volume", "", "Companion", "audio_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AudioManagerModule extends ReactContextBaseJavaModule {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "AudioManager";
    public DiscordAudioManager audioManager;
    private final ReactApplicationContext reactContext;
    private final ReactEvents reactEvents = new ReactEvents(x.a("android-audio-devices-updated", f0.b(AudioManagerAudioDevicesUpdated.class)), x.a("android-active-audio-device-changed", f0.b(AudioManagerAudioDeviceChanged.class)), x.a("android-current-media-volume-changed", f0.b(AudioManagerMediaVolumeChanged.class)));

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/discord/audio/AudioManagerModule$Companion;", "", "()V", "NAME", "", "convertDevices", "", "devices", "Lcom/discord/audio/DiscordAudioManager$AudioDevice;", "audio_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<String> convertDevices(List<DiscordAudioManager.AudioDevice> list) {
            int t10;
            ArrayList<DiscordAudioManager.AudioDevice> arrayList = new ArrayList();
            for (Object obj : list) {
                if (((DiscordAudioManager.AudioDevice) obj).isAvailable()) {
                    arrayList.add(obj);
                }
            }
            t10 = k.t(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(t10);
            for (DiscordAudioManager.AudioDevice audioDevice : arrayList) {
                arrayList2.add(audioDevice.getType().toString());
            }
            return arrayList2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioManagerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        q.g(reactContext, "reactContext");
        this.reactContext = reactContext;
    }

    @ReactMethod
    public final void addListener(String type) {
        q.g(type, "type");
    }

    @ReactMethod
    public final void getActiveAudioDevice(Callback cb2) {
        q.g(cb2, "cb");
        cb2.invoke(getAudioManager().getActiveAudioDevice().toString());
    }

    @ReactMethod
    public final void getAudioDevices(Callback cb2) {
        q.g(cb2, "cb");
        cb2.invoke(NativeArrayExtensionsKt.toNativeArray(Companion.convertDevices(getAudioManager().getAudioDevices())));
    }

    public final DiscordAudioManager getAudioManager() {
        DiscordAudioManager discordAudioManager = this.audioManager;
        if (discordAudioManager != null) {
            return discordAudioManager;
        }
        q.y("audioManager");
        return null;
    }

    @ReactMethod
    public final void getMediaVolume(Callback cb2) {
        q.g(cb2, "cb");
        cb2.invoke(Float.valueOf(getAudioManager().getCurrentMediaVolume() / getAudioManager().getMaxMediaVolume()));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        super.initialize();
        setAudioManager(new DiscordAudioManager(this.reactContext, new AudioManagerModule$initialize$1(this), new AudioManagerModule$initialize$2(this), new AudioManagerModule$initialize$3(this)));
    }

    @ReactMethod
    public final void makeEarpieceUnavailable() {
        getAudioManager().makeEarpieceUnavailable();
    }

    @ReactMethod
    public final void removeListeners(int i10) {
    }

    @ReactMethod
    public final void resetEarpieceAvailability() {
        getAudioManager().resetEarpieceAvailability();
    }

    @ReactMethod
    public final boolean setActiveAudioDevice(String device) {
        q.g(device, "device");
        return getAudioManager().setDevice(DiscordAudioManager.DeviceTypes.valueOf(device));
    }

    public final void setAudioManager(DiscordAudioManager discordAudioManager) {
        q.g(discordAudioManager, "<set-?>");
        this.audioManager = discordAudioManager;
    }

    @ReactMethod
    public final void setCommunicationModeOn(boolean z10) {
        getAudioManager().setCommunicationModeOn(z10);
    }

    @ReactMethod
    public final void setMediaVolume(float f10) {
        getAudioManager().setMediaVolume(f10);
    }
}
