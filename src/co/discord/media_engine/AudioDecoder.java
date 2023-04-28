package co.discord.media_engine;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0002\u0010\nJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\tHÆ\u0003JG\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\tHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0013¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0013¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\f¨\u0006%"}, m15073d2 = {"Lco/discord/media_engine/AudioDecoder;", "", "type", "", "name", "", "freq", "channels", "params", "", "(ILjava/lang/String;IILjava/util/Map;)V", "getChannels", "()I", "getFreq", "getName", "()Ljava/lang/String;", "getParams", "()Ljava/util/Map;", "paramsKeys", "", "getParamsKeys", "()[Ljava/lang/String;", "[Ljava/lang/String;", "paramsValues", "getParamsValues", "getType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "android_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
public final class AudioDecoder {
    private final int channels;
    private final int freq;
    private final String name;
    private final Map<String, String> params;
    private final String[] paramsKeys;
    private final String[] paramsValues;
    private final int type;

    public AudioDecoder(int i, String name, int i2, int i3, Map<String, String> params) {
        C9971q.m14633g(name, "name");
        C9971q.m14633g(params, "params");
        this.type = i;
        this.name = name;
        this.freq = i2;
        this.channels = i3;
        this.params = params;
        this.paramsKeys = (String[]) params.keySet().toArray(new String[0]);
        this.paramsValues = (String[]) params.values().toArray(new String[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AudioDecoder copy$default(AudioDecoder audioDecoder, int i, String str, int i2, int i3, Map map, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = audioDecoder.type;
        }
        if ((i4 & 2) != 0) {
            str = audioDecoder.name;
        }
        if ((i4 & 4) != 0) {
            i2 = audioDecoder.freq;
        }
        if ((i4 & 8) != 0) {
            i3 = audioDecoder.channels;
        }
        if ((i4 & 16) != 0) {
            map = audioDecoder.params;
        }
        return audioDecoder.copy(i, str, i2, i3, map);
    }

    public final int component1() {
        return this.type;
    }

    public final String component2() {
        return this.name;
    }

    public final int component3() {
        return this.freq;
    }

    public final int component4() {
        return this.channels;
    }

    public final Map<String, String> component5() {
        return this.params;
    }

    public final AudioDecoder copy(int i, String name, int i2, int i3, Map<String, String> params) {
        C9971q.m14633g(name, "name");
        C9971q.m14633g(params, "params");
        return new AudioDecoder(i, name, i2, i3, params);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioDecoder)) {
            return false;
        }
        AudioDecoder audioDecoder = (AudioDecoder) obj;
        return this.type == audioDecoder.type && C9971q.m14638b(this.name, audioDecoder.name) && this.freq == audioDecoder.freq && this.channels == audioDecoder.channels && C9971q.m14638b(this.params, audioDecoder.params);
    }

    public final int getChannels() {
        return this.channels;
    }

    public final int getFreq() {
        return this.freq;
    }

    public final String getName() {
        return this.name;
    }

    public final Map<String, String> getParams() {
        return this.params;
    }

    public final String[] getParamsKeys() {
        return this.paramsKeys;
    }

    public final String[] getParamsValues() {
        return this.paramsValues;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((this.type * 31) + this.name.hashCode()) * 31) + this.freq) * 31) + this.channels) * 31) + this.params.hashCode();
    }

    public String toString() {
        return "AudioDecoder(type=" + this.type + ", name=" + this.name + ", freq=" + this.freq + ", channels=" + this.channels + ", params=" + this.params + ')';
    }
}
