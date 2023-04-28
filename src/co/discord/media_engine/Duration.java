package co.discord.media_engine;

import kotlin.Metadata;

@Metadata(m15074d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u001d"}, m15073d2 = {"Lco/discord/media_engine/Duration;", "", "listening", "", "speaking", "participation", "connected", "(IIII)V", "getConnected", "()I", "setConnected", "(I)V", "getListening", "setListening", "getParticipation", "setParticipation", "getSpeaking", "setSpeaking", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "android_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
final class Duration {
    private int connected;
    private int listening;
    private int participation;
    private int speaking;

    public Duration(int i, int i2, int i3, int i4) {
        this.listening = i;
        this.speaking = i2;
        this.participation = i3;
        this.connected = i4;
    }

    public static /* synthetic */ Duration copy$default(Duration duration, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = duration.listening;
        }
        if ((i5 & 2) != 0) {
            i2 = duration.speaking;
        }
        if ((i5 & 4) != 0) {
            i3 = duration.participation;
        }
        if ((i5 & 8) != 0) {
            i4 = duration.connected;
        }
        return duration.copy(i, i2, i3, i4);
    }

    public final int component1() {
        return this.listening;
    }

    public final int component2() {
        return this.speaking;
    }

    public final int component3() {
        return this.participation;
    }

    public final int component4() {
        return this.connected;
    }

    public final Duration copy(int i, int i2, int i3, int i4) {
        return new Duration(i, i2, i3, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Duration)) {
            return false;
        }
        Duration duration = (Duration) obj;
        return this.listening == duration.listening && this.speaking == duration.speaking && this.participation == duration.participation && this.connected == duration.connected;
    }

    public final int getConnected() {
        return this.connected;
    }

    public final int getListening() {
        return this.listening;
    }

    public final int getParticipation() {
        return this.participation;
    }

    public final int getSpeaking() {
        return this.speaking;
    }

    public int hashCode() {
        return (((((this.listening * 31) + this.speaking) * 31) + this.participation) * 31) + this.connected;
    }

    public final void setConnected(int i) {
        this.connected = i;
    }

    public final void setListening(int i) {
        this.listening = i;
    }

    public final void setParticipation(int i) {
        this.participation = i;
    }

    public final void setSpeaking(int i) {
        this.speaking = i;
    }

    public String toString() {
        return "Duration(listening=" + this.listening + ", speaking=" + this.speaking + ", participation=" + this.participation + ", connected=" + this.connected + ')';
    }
}
