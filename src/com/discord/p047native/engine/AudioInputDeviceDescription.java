package com.discord.p047native.engine;

import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;

@Metadata(m15074d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m15073d2 = {"Lcom/discord/native/engine/AudioInputDeviceDescription;", "", "name", "", "guid", "(Ljava/lang/String;Ljava/lang/String;)V", "getGuid", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "android_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* renamed from: com.discord.native.engine.AudioInputDeviceDescription */
/* loaded from: classes5.dex */
public final class AudioInputDeviceDescription {
    private final String guid;
    private final String name;

    public AudioInputDeviceDescription(String name, String guid) {
        C9677q.m14633g(name, "name");
        C9677q.m14633g(guid, "guid");
        this.name = name;
        this.guid = guid;
    }

    public static /* synthetic */ AudioInputDeviceDescription copy$default(AudioInputDeviceDescription audioInputDeviceDescription, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = audioInputDeviceDescription.name;
        }
        if ((i & 2) != 0) {
            str2 = audioInputDeviceDescription.guid;
        }
        return audioInputDeviceDescription.copy(str, str2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.guid;
    }

    public final AudioInputDeviceDescription copy(String name, String guid) {
        C9677q.m14633g(name, "name");
        C9677q.m14633g(guid, "guid");
        return new AudioInputDeviceDescription(name, guid);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioInputDeviceDescription)) {
            return false;
        }
        AudioInputDeviceDescription audioInputDeviceDescription = (AudioInputDeviceDescription) obj;
        return C9677q.m14638b(this.name, audioInputDeviceDescription.name) && C9677q.m14638b(this.guid, audioInputDeviceDescription.guid);
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
        return "AudioInputDeviceDescription(name=" + this.name + ", guid=" + this.guid + ')';
    }
}
