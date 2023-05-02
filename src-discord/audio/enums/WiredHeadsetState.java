package com.discord.audio.enums;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/discord/audio/enums/WiredHeadsetState;", "", "()V", "Companion", "PluggedIn", "Unplugged", "Lcom/discord/audio/enums/WiredHeadsetState$PluggedIn;", "Lcom/discord/audio/enums/WiredHeadsetState$Unplugged;", "audio_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class WiredHeadsetState {
    public static final Companion Companion = new Companion(null);
    public static final int HAS_MIC = 1;
    public static final int NO_MIC = 0;
    public static final int PLUGGED = 1;
    public static final int UNPLUGGED = 0;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u0016\u0010\u0003\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u0016\u0010\u0006\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0002R\u0016\u0010\b\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0002R\u0016\u0010\n\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0002¨\u0006\u0010"}, d2 = {"Lcom/discord/audio/enums/WiredHeadsetState$Companion;", "", "()V", "HAS_MIC", "", "getHAS_MIC$audio_release$annotations", "NO_MIC", "getNO_MIC$audio_release$annotations", "PLUGGED", "getPLUGGED$audio_release$annotations", "UNPLUGGED", "getUNPLUGGED$audio_release$annotations", "from", "Lcom/discord/audio/enums/WiredHeadsetState;", "intent", "Landroid/content/Intent;", "audio_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getHAS_MIC$audio_release$annotations() {
        }

        public static /* synthetic */ void getNO_MIC$audio_release$annotations() {
        }

        public static /* synthetic */ void getPLUGGED$audio_release$annotations() {
        }

        public static /* synthetic */ void getUNPLUGGED$audio_release$annotations() {
        }

        public final WiredHeadsetState from(Intent intent) {
            boolean z10;
            q.g(intent, "intent");
            if (q.b(intent.getAction(), "android.intent.action.HEADSET_PLUG")) {
                boolean z11 = false;
                if (intent.getIntExtra("state", 0) == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    return Unplugged.INSTANCE;
                }
                String stringExtra = intent.getStringExtra("name");
                if (stringExtra == null) {
                    stringExtra = "unknown";
                }
                if (intent.getIntExtra("microphone", 0) == 1) {
                    z11 = true;
                }
                return new PluggedIn(stringExtra, z11);
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/discord/audio/enums/WiredHeadsetState$PluggedIn;", "Lcom/discord/audio/enums/WiredHeadsetState;", "name", "", "hasMic", "", "(Ljava/lang/String;Z)V", "getHasMic", "()Z", "getName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "audio_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class PluggedIn extends WiredHeadsetState {
        private final boolean hasMic;
        private final String name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PluggedIn(String name, boolean z10) {
            super(null);
            q.g(name, "name");
            this.name = name;
            this.hasMic = z10;
        }

        public static /* synthetic */ PluggedIn copy$default(PluggedIn pluggedIn, String str, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = pluggedIn.name;
            }
            if ((i10 & 2) != 0) {
                z10 = pluggedIn.hasMic;
            }
            return pluggedIn.copy(str, z10);
        }

        public final String component1() {
            return this.name;
        }

        public final boolean component2() {
            return this.hasMic;
        }

        public final PluggedIn copy(String name, boolean z10) {
            q.g(name, "name");
            return new PluggedIn(name, z10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PluggedIn)) {
                return false;
            }
            PluggedIn pluggedIn = (PluggedIn) obj;
            return q.b(this.name, pluggedIn.name) && this.hasMic == pluggedIn.hasMic;
        }

        public final boolean getHasMic() {
            return this.hasMic;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            int hashCode = this.name.hashCode() * 31;
            boolean z10 = this.hasMic;
            if (z10) {
                z10 = true;
            }
            int i10 = z10 ? 1 : 0;
            int i11 = z10 ? 1 : 0;
            int i12 = z10 ? 1 : 0;
            return hashCode + i10;
        }

        public String toString() {
            String str = this.name;
            boolean z10 = this.hasMic;
            return "PluggedIn(name=" + str + ", hasMic=" + z10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/discord/audio/enums/WiredHeadsetState$Unplugged;", "Lcom/discord/audio/enums/WiredHeadsetState;", "()V", "toString", "", "audio_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Unplugged extends WiredHeadsetState {
        public static final Unplugged INSTANCE = new Unplugged();

        private Unplugged() {
            super(null);
        }

        public String toString() {
            return "WiredHeadsetState.Unplugged";
        }
    }

    private WiredHeadsetState() {
    }

    public /* synthetic */ WiredHeadsetState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
