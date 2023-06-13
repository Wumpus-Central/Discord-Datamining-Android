package com.discord.p000native.engine;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0007\u001e\u001f !\"#$B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u0011\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0086 J\u0011\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u000bH\u0086 J\t\u0010\f\u001a\u00020\u0006H\u0082 J\u0011\u0010\r\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u000eH\u0086 J\u0011\u0010\u000f\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0010H\u0086 J\u0011\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0086 J\u0011\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0016H\u0086 J\u0019\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u0018H\u0086 J\u0019\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u001aH\u0086 J\u0011\u0010\u001b\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u001cH\u0086 J\t\u0010\u001d\u001a\u00020\u0006H\u0086 R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/discord/native/engine/NativeSpeedTestConnection;", "", "()V", "nativeInstance", "", "dispose", "", "getEncryptionModes", "callback", "Lcom/discord/native/engine/NativeSpeedTestConnection$GetEncryptionModesCallback;", "getNetworkOverhead", "Lcom/discord/native/engine/NativeSpeedTestConnection$GetNetworkOverheadCallback;", "nativeDestroyInstance", "setOnPingCallback", "Lcom/discord/native/engine/NativeSpeedTestConnection$OnPingCallback;", "setOnPingTimeoutCallback", "Lcom/discord/native/engine/NativeSpeedTestConnection$OnPingTimeoutCallback;", "setPingInterval", "pingInterval", "", "setTransportOptions", "optionsJSON", "", "startSpeedTestReceiver", "Lcom/discord/native/engine/NativeSpeedTestConnection$StartSpeedTestReceiverCallback;", "startSpeedTestSender", "Lcom/discord/native/engine/NativeSpeedTestConnection$StartSpeedTestSenderCallback;", "stopSpeedTestReceiver", "Lcom/discord/native/engine/NativeSpeedTestConnection$StopSpeedTestReceiverCallback;", "stopSpeedTestSender", "GetEncryptionModesCallback", "GetNetworkOverheadCallback", "OnPingCallback", "OnPingTimeoutCallback", "StartSpeedTestReceiverCallback", "StartSpeedTestSenderCallback", "StopSpeedTestReceiverCallback", "android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: com.discord.native.engine.NativeSpeedTestConnection  reason: invalid package */
/* loaded from: classes7.dex */
public final class NativeSpeedTestConnection {
    private final long nativeInstance;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/discord/native/engine/NativeSpeedTestConnection$GetEncryptionModesCallback;", "", "onEncryptionModes", "", "modes", "", "", "([Ljava/lang/String;)V", "android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.discord.native.engine.NativeSpeedTestConnection$GetEncryptionModesCallback */
    /* loaded from: classes7.dex */
    public interface GetEncryptionModesCallback {
        void onEncryptionModes(String[] strArr);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/discord/native/engine/NativeSpeedTestConnection$GetNetworkOverheadCallback;", "", "onNetworkOverhead", "", "overhead", "", "android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.discord.native.engine.NativeSpeedTestConnection$GetNetworkOverheadCallback */
    /* loaded from: classes7.dex */
    public interface GetNetworkOverheadCallback {
        void onNetworkOverhead(int i10);
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H&¨\u0006\n"}, d2 = {"Lcom/discord/native/engine/NativeSpeedTestConnection$OnPingCallback;", "", "onPing", "", "ping", "", "server", "", ZeroconfModule.KEY_SERVICE_PORT, "seq", "android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.discord.native.engine.NativeSpeedTestConnection$OnPingCallback */
    /* loaded from: classes7.dex */
    public interface OnPingCallback {
        void onPing(int i10, String str, int i11, int i12);
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H&¨\u0006\n"}, d2 = {"Lcom/discord/native/engine/NativeSpeedTestConnection$OnPingTimeoutCallback;", "", "onPingTimeout", "", "server", "", ZeroconfModule.KEY_SERVICE_PORT, "", "seq", "timeout", "android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.discord.native.engine.NativeSpeedTestConnection$OnPingTimeoutCallback */
    /* loaded from: classes7.dex */
    public interface OnPingTimeoutCallback {
        void onPingTimeout(String str, int i10, int i11, int i12);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/discord/native/engine/NativeSpeedTestConnection$StartSpeedTestReceiverCallback;", "", "onReady", "", "android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.discord.native.engine.NativeSpeedTestConnection$StartSpeedTestReceiverCallback */
    /* loaded from: classes7.dex */
    public interface StartSpeedTestReceiverCallback {
        void onReady();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/discord/native/engine/NativeSpeedTestConnection$StartSpeedTestSenderCallback;", "", "onDone", "", "code", "", "description", "", "android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.discord.native.engine.NativeSpeedTestConnection$StartSpeedTestSenderCallback */
    /* loaded from: classes7.dex */
    public interface StartSpeedTestSenderCallback {
        void onDone(int i10, String str);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/discord/native/engine/NativeSpeedTestConnection$StopSpeedTestReceiverCallback;", "", "onResults", "", "version", "", "results", "", "android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.discord.native.engine.NativeSpeedTestConnection$StopSpeedTestReceiverCallback */
    /* loaded from: classes7.dex */
    public interface StopSpeedTestReceiverCallback {
        void onResults(int i10, String str);
    }

    private final native void nativeDestroyInstance();

    public final void dispose() {
        nativeDestroyInstance();
    }

    public final native void getEncryptionModes(GetEncryptionModesCallback getEncryptionModesCallback);

    public final native void getNetworkOverhead(GetNetworkOverheadCallback getNetworkOverheadCallback);

    public final native void setOnPingCallback(OnPingCallback onPingCallback);

    public final native void setOnPingTimeoutCallback(OnPingTimeoutCallback onPingTimeoutCallback);

    public final native void setPingInterval(int i10);

    public final native void setTransportOptions(String str);

    public final native void startSpeedTestReceiver(String str, StartSpeedTestReceiverCallback startSpeedTestReceiverCallback);

    public final native void startSpeedTestSender(String str, StartSpeedTestSenderCallback startSpeedTestSenderCallback);

    public final native void stopSpeedTestReceiver(StopSpeedTestReceiverCallback stopSpeedTestReceiverCallback);

    public final native void stopSpeedTestSender();
}
