package com.discord.p000native.engine;

import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/discord/native/engine/AudioOutputDeviceDescription;", "", "name", "", "guid", "(Ljava/lang/String;Ljava/lang/String;)V", "getGuid", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: com.discord.native.engine.AudioOutputDeviceDescription  reason: invalid package */
/* loaded from: classes8.dex */
public final class AudioOutputDeviceDescription {
    private final String guid;
    private final String name;

    public AudioOutputDeviceDescription(String name, String guid) {
        q.g(name, "name");
        q.g(guid, "guid");
        this.name = name;
        this.guid = guid;
    }

    public static /* synthetic */ AudioOutputDeviceDescription copy$default(AudioOutputDeviceDescription audioOutputDeviceDescription, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = audioOutputDeviceDescription.name;
        }
        if ((i10 & 2) != 0) {
            str2 = audioOutputDeviceDescription.guid;
        }
        return audioOutputDeviceDescription.copy(str, str2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.guid;
    }

    public final AudioOutputDeviceDescription copy(String name, String guid) {
        q.g(name, "name");
        q.g(guid, "guid");
        return new AudioOutputDeviceDescription(name, guid);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioOutputDeviceDescription)) {
            return false;
        }
        AudioOutputDeviceDescription audioOutputDeviceDescription = (AudioOutputDeviceDescription) obj;
        return q.b(this.name, audioOutputDeviceDescription.name) && q.b(this.guid, audioOutputDeviceDescription.guid);
    }

    public final String getGuid() {
        return this.guid;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.guid.hashCode();
    }

    public String toString() {
        return "AudioOutputDeviceDescription(name=" + this.name + ", guid=" + this.guid + ')';
    }
}
