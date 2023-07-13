package com.discord.audio.enums;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0080\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/discord/audio/enums/BluetoothBroadcastAction;", "", "action", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getAction", "()Ljava/lang/String;", "HeadsetConnectionStateChanged", "HeadsetAudioStateChanged", "AdapterConnectionStateChanged", "AdapterStateChanged", "ActiveDeviceChanged", "Companion", "audio_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public enum BluetoothBroadcastAction {
    HeadsetConnectionStateChanged("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED"),
    HeadsetAudioStateChanged("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED"),
    AdapterConnectionStateChanged("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED"),
    AdapterStateChanged("android.bluetooth.adapter.action.STATE_CHANGED"),
    ActiveDeviceChanged("android.bluetooth.headset.profile.action.ACTIVE_DEVICE_CHANGED");
    
    public static final Companion Companion = new Companion(null);
    private final String action;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/discord/audio/enums/BluetoothBroadcastAction$Companion;", "", "()V", "from", "Lcom/discord/audio/enums/BluetoothBroadcastAction;", "action", "", "audio_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final BluetoothBroadcastAction from(String action) {
            BluetoothBroadcastAction[] values;
            q.g(action, "action");
            for (BluetoothBroadcastAction bluetoothBroadcastAction : BluetoothBroadcastAction.values()) {
                if (q.b(bluetoothBroadcastAction.getAction(), action)) {
                    return bluetoothBroadcastAction;
                }
            }
            return null;
        }
    }

    BluetoothBroadcastAction(String str) {
        this.action = str;
    }

    public final String getAction() {
        return this.action;
    }
}
