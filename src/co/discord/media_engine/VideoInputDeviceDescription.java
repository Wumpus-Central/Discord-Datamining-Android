package co.discord.media_engine;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m15073d2 = {"Lco/discord/media_engine/VideoInputDeviceDescription;", "", "name", "", "guid", "facing", "Lco/discord/media_engine/VideoInputDeviceFacing;", "(Ljava/lang/String;Ljava/lang/String;Lco/discord/media_engine/VideoInputDeviceFacing;)V", "getFacing", "()Lco/discord/media_engine/VideoInputDeviceFacing;", "getGuid", "()Ljava/lang/String;", "getName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "android_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
public final class VideoInputDeviceDescription {
    private final VideoInputDeviceFacing facing;
    private final String guid;
    private final String name;

    public VideoInputDeviceDescription(String name, String guid, VideoInputDeviceFacing facing) {
        C9971q.m14633g(name, "name");
        C9971q.m14633g(guid, "guid");
        C9971q.m14633g(facing, "facing");
        this.name = name;
        this.guid = guid;
        this.facing = facing;
    }

    public static /* synthetic */ VideoInputDeviceDescription copy$default(VideoInputDeviceDescription videoInputDeviceDescription, String str, String str2, VideoInputDeviceFacing videoInputDeviceFacing, int i, Object obj) {
        if ((i & 1) != 0) {
            str = videoInputDeviceDescription.name;
        }
        if ((i & 2) != 0) {
            str2 = videoInputDeviceDescription.guid;
        }
        if ((i & 4) != 0) {
            videoInputDeviceFacing = videoInputDeviceDescription.facing;
        }
        return videoInputDeviceDescription.copy(str, str2, videoInputDeviceFacing);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.guid;
    }

    public final VideoInputDeviceFacing component3() {
        return this.facing;
    }

    public final VideoInputDeviceDescription copy(String name, String guid, VideoInputDeviceFacing facing) {
        C9971q.m14633g(name, "name");
        C9971q.m14633g(guid, "guid");
        C9971q.m14633g(facing, "facing");
        return new VideoInputDeviceDescription(name, guid, facing);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoInputDeviceDescription)) {
            return false;
        }
        VideoInputDeviceDescription videoInputDeviceDescription = (VideoInputDeviceDescription) obj;
        return C9971q.m14638b(this.name, videoInputDeviceDescription.name) && C9971q.m14638b(this.guid, videoInputDeviceDescription.guid) && this.facing == videoInputDeviceDescription.facing;
    }

    public final VideoInputDeviceFacing getFacing() {
        return this.facing;
    }

    public final String getGuid() {
        return this.guid;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + this.guid.hashCode()) * 31) + this.facing.hashCode();
    }

    public String toString() {
        return "VideoInputDeviceDescription(name=" + this.name + ", guid=" + this.guid + ", facing=" + this.facing + ')';
    }
}
