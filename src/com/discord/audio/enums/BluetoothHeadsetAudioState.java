package com.discord.audio.enums;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import com.discord.audio.utils.ExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\n\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\f"}, m15073d2 = {"Lcom/discord/audio/enums/BluetoothHeadsetAudioState;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "Disconnected", "Connecting", "Connected", "Companion", "Update", "audio_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
public enum BluetoothHeadsetAudioState {
    Disconnected(10),
    Connecting(11),
    Connected(12);
    
    public static final Companion Companion = new Companion(null);
    private final int value;

    @Metadata(m15074d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, m15073d2 = {"Lcom/discord/audio/enums/BluetoothHeadsetAudioState$Companion;", "", "()V", "from", "Lcom/discord/audio/enums/BluetoothHeadsetAudioState;", "value", "", "getUpdate", "Lcom/discord/audio/enums/BluetoothHeadsetAudioState$Update;", "intent", "Landroid/content/Intent;", "audio_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final BluetoothHeadsetAudioState from(int i) {
            BluetoothHeadsetAudioState[] values;
            boolean z;
            for (BluetoothHeadsetAudioState bluetoothHeadsetAudioState : BluetoothHeadsetAudioState.values()) {
                if (bluetoothHeadsetAudioState.getValue() == i) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return bluetoothHeadsetAudioState;
                }
            }
            return null;
        }

        public final Update getUpdate(Intent intent) {
            BluetoothHeadsetAudioState bluetoothHeadsetAudioState;
            C9677q.m14633g(intent, "intent");
            if (C9677q.m14638b(intent.getAction(), "android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED")) {
                BluetoothDevice bluetoothDeviceExtra = ExtensionsKt.getBluetoothDeviceExtra(intent);
                Integer intExtraOrNull = ExtensionsKt.getIntExtraOrNull(intent, "android.bluetooth.profile.extra.PREVIOUS_STATE");
                BluetoothHeadsetAudioState bluetoothHeadsetAudioState2 = null;
                if (intExtraOrNull != null) {
                    bluetoothHeadsetAudioState = BluetoothHeadsetAudioState.Companion.from(intExtraOrNull.intValue());
                } else {
                    bluetoothHeadsetAudioState = null;
                }
                Integer intExtraOrNull2 = ExtensionsKt.getIntExtraOrNull(intent, "android.bluetooth.profile.extra.STATE");
                if (intExtraOrNull2 != null) {
                    bluetoothHeadsetAudioState2 = BluetoothHeadsetAudioState.Companion.from(intExtraOrNull2.intValue());
                }
                return new Update(bluetoothHeadsetAudioState2, bluetoothHeadsetAudioState, bluetoothDeviceExtra);
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    @Metadata(m15074d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m15073d2 = {"Lcom/discord/audio/enums/BluetoothHeadsetAudioState$Update;", "", "current", "Lcom/discord/audio/enums/BluetoothHeadsetAudioState;", "previous", "device", "Landroid/bluetooth/BluetoothDevice;", "(Lcom/discord/audio/enums/BluetoothHeadsetAudioState;Lcom/discord/audio/enums/BluetoothHeadsetAudioState;Landroid/bluetooth/BluetoothDevice;)V", "getCurrent", "()Lcom/discord/audio/enums/BluetoothHeadsetAudioState;", "getDevice", "()Landroid/bluetooth/BluetoothDevice;", "getPrevious", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "audio_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes.dex */
    public static final class Update {
        private final BluetoothHeadsetAudioState current;
        private final BluetoothDevice device;
        private final BluetoothHeadsetAudioState previous;

        public Update(BluetoothHeadsetAudioState bluetoothHeadsetAudioState, BluetoothHeadsetAudioState bluetoothHeadsetAudioState2, BluetoothDevice bluetoothDevice) {
            this.current = bluetoothHeadsetAudioState;
            this.previous = bluetoothHeadsetAudioState2;
            this.device = bluetoothDevice;
        }

        public static /* synthetic */ Update copy$default(Update update, BluetoothHeadsetAudioState bluetoothHeadsetAudioState, BluetoothHeadsetAudioState bluetoothHeadsetAudioState2, BluetoothDevice bluetoothDevice, int i, Object obj) {
            if ((i & 1) != 0) {
                bluetoothHeadsetAudioState = update.current;
            }
            if ((i & 2) != 0) {
                bluetoothHeadsetAudioState2 = update.previous;
            }
            if ((i & 4) != 0) {
                bluetoothDevice = update.device;
            }
            return update.copy(bluetoothHeadsetAudioState, bluetoothHeadsetAudioState2, bluetoothDevice);
        }

        public final BluetoothHeadsetAudioState component1() {
            return this.current;
        }

        public final BluetoothHeadsetAudioState component2() {
            return this.previous;
        }

        public final BluetoothDevice component3() {
            return this.device;
        }

        public final Update copy(BluetoothHeadsetAudioState bluetoothHeadsetAudioState, BluetoothHeadsetAudioState bluetoothHeadsetAudioState2, BluetoothDevice bluetoothDevice) {
            return new Update(bluetoothHeadsetAudioState, bluetoothHeadsetAudioState2, bluetoothDevice);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Update)) {
                return false;
            }
            Update update = (Update) obj;
            return this.current == update.current && this.previous == update.previous && C9677q.m14638b(this.device, update.device);
        }

        public final BluetoothHeadsetAudioState getCurrent() {
            return this.current;
        }

        public final BluetoothDevice getDevice() {
            return this.device;
        }

        public final BluetoothHeadsetAudioState getPrevious() {
            return this.previous;
        }

        public int hashCode() {
            BluetoothHeadsetAudioState bluetoothHeadsetAudioState = this.current;
            int i = 0;
            int hashCode = (bluetoothHeadsetAudioState == null ? 0 : bluetoothHeadsetAudioState.hashCode()) * 31;
            BluetoothHeadsetAudioState bluetoothHeadsetAudioState2 = this.previous;
            int hashCode2 = (hashCode + (bluetoothHeadsetAudioState2 == null ? 0 : bluetoothHeadsetAudioState2.hashCode())) * 31;
            BluetoothDevice bluetoothDevice = this.device;
            if (bluetoothDevice != null) {
                i = bluetoothDevice.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            BluetoothHeadsetAudioState bluetoothHeadsetAudioState = this.current;
            BluetoothHeadsetAudioState bluetoothHeadsetAudioState2 = this.previous;
            BluetoothDevice bluetoothDevice = this.device;
            return "Update(current=" + bluetoothHeadsetAudioState + ", previous=" + bluetoothHeadsetAudioState2 + ", device=" + bluetoothDevice + ")";
        }
    }

    BluetoothHeadsetAudioState(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
