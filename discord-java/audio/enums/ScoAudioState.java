package com.discord.audio.enums;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u000b\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\r"}, d2 = {"Lcom/discord/audio/enums/ScoAudioState;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "Disconnected", "Connected", "Connecting", "Error", "Companion", "Update", "audio_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public enum ScoAudioState {
    Disconnected(0),
    Connected(1),
    Connecting(2),
    Error(-1);
    
    public static final Companion Companion = new Companion(null);
    private final int value;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\t¨\u0006\r"}, d2 = {"Lcom/discord/audio/enums/ScoAudioState$Companion;", "", "()V", "from", "Lcom/discord/audio/enums/ScoAudioState;", "value", "", "getCurrentState", "intent", "Landroid/content/Intent;", "getPrevState", "getScoAudioUpdate", "Lcom/discord/audio/enums/ScoAudioState$Update;", "audio_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final ScoAudioState getCurrentState(Intent intent) {
            ScoAudioState from = from(intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", 0));
            q.d(from);
            return from;
        }

        private final ScoAudioState getPrevState(Intent intent) {
            ScoAudioState from = from(intent.getIntExtra("android.media.extra.SCO_AUDIO_PREVIOUS_STATE", 0));
            q.d(from);
            return from;
        }

        public final ScoAudioState from(int i10) {
            ScoAudioState[] values;
            boolean z10;
            for (ScoAudioState scoAudioState : ScoAudioState.values()) {
                if (scoAudioState.getValue() == i10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return scoAudioState;
                }
            }
            return null;
        }

        public final Update getScoAudioUpdate(Intent intent) {
            q.g(intent, "intent");
            if (q.b(intent.getAction(), "android.media.ACTION_SCO_AUDIO_STATE_UPDATED")) {
                return new Update(getCurrentState(intent), getPrevState(intent));
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/discord/audio/enums/ScoAudioState$Update;", "", "current", "Lcom/discord/audio/enums/ScoAudioState;", "previous", "(Lcom/discord/audio/enums/ScoAudioState;Lcom/discord/audio/enums/ScoAudioState;)V", "getCurrent", "()Lcom/discord/audio/enums/ScoAudioState;", "getPrevious", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "audio_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Update {
        private final ScoAudioState current;
        private final ScoAudioState previous;

        public Update(ScoAudioState current, ScoAudioState previous) {
            q.g(current, "current");
            q.g(previous, "previous");
            this.current = current;
            this.previous = previous;
        }

        public static /* synthetic */ Update copy$default(Update update, ScoAudioState scoAudioState, ScoAudioState scoAudioState2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                scoAudioState = update.current;
            }
            if ((i10 & 2) != 0) {
                scoAudioState2 = update.previous;
            }
            return update.copy(scoAudioState, scoAudioState2);
        }

        public final ScoAudioState component1() {
            return this.current;
        }

        public final ScoAudioState component2() {
            return this.previous;
        }

        public final Update copy(ScoAudioState current, ScoAudioState previous) {
            q.g(current, "current");
            q.g(previous, "previous");
            return new Update(current, previous);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Update)) {
                return false;
            }
            Update update = (Update) obj;
            return this.current == update.current && this.previous == update.previous;
        }

        public final ScoAudioState getCurrent() {
            return this.current;
        }

        public final ScoAudioState getPrevious() {
            return this.previous;
        }

        public int hashCode() {
            return (this.current.hashCode() * 31) + this.previous.hashCode();
        }

        public String toString() {
            ScoAudioState scoAudioState = this.previous;
            if (scoAudioState == ScoAudioState.Error) {
                return String.valueOf(this.current);
            }
            ScoAudioState scoAudioState2 = this.current;
            return "Update(" + scoAudioState + " -> " + scoAudioState2 + ")";
        }
    }

    ScoAudioState(int i10) {
        this.value = i10;
    }

    public final int getValue() {
        return this.value;
    }
}
