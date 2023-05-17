package com.discord.notifications.renderer;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/discord/notifications/renderer/NotificationBehaviors;", "", "soundsEnabled", "", "vibrationsEnabled", "lightsEnabled", "(ZZZ)V", "getLightsEnabled", "()Z", "getSoundsEnabled", "getVibrationsEnabled", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "notification_renderer_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NotificationBehaviors {
    private final boolean lightsEnabled;
    private final boolean soundsEnabled;
    private final boolean vibrationsEnabled;

    public NotificationBehaviors(boolean z10, boolean z11, boolean z12) {
        this.soundsEnabled = z10;
        this.vibrationsEnabled = z11;
        this.lightsEnabled = z12;
    }

    public static /* synthetic */ NotificationBehaviors copy$default(NotificationBehaviors notificationBehaviors, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = notificationBehaviors.soundsEnabled;
        }
        if ((i10 & 2) != 0) {
            z11 = notificationBehaviors.vibrationsEnabled;
        }
        if ((i10 & 4) != 0) {
            z12 = notificationBehaviors.lightsEnabled;
        }
        return notificationBehaviors.copy(z10, z11, z12);
    }

    public final boolean component1() {
        return this.soundsEnabled;
    }

    public final boolean component2() {
        return this.vibrationsEnabled;
    }

    public final boolean component3() {
        return this.lightsEnabled;
    }

    public final NotificationBehaviors copy(boolean z10, boolean z11, boolean z12) {
        return new NotificationBehaviors(z10, z11, z12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationBehaviors)) {
            return false;
        }
        NotificationBehaviors notificationBehaviors = (NotificationBehaviors) obj;
        return this.soundsEnabled == notificationBehaviors.soundsEnabled && this.vibrationsEnabled == notificationBehaviors.vibrationsEnabled && this.lightsEnabled == notificationBehaviors.lightsEnabled;
    }

    public final boolean getLightsEnabled() {
        return this.lightsEnabled;
    }

    public final boolean getSoundsEnabled() {
        return this.soundsEnabled;
    }

    public final boolean getVibrationsEnabled() {
        return this.vibrationsEnabled;
    }

    public int hashCode() {
        boolean z10 = this.soundsEnabled;
        int i10 = 1;
        if (z10) {
            z10 = true;
        }
        int i11 = z10 ? 1 : 0;
        int i12 = z10 ? 1 : 0;
        int i13 = z10 ? 1 : 0;
        int i14 = i11 * 31;
        boolean z11 = this.vibrationsEnabled;
        if (z11) {
            z11 = true;
        }
        int i15 = z11 ? 1 : 0;
        int i16 = z11 ? 1 : 0;
        int i17 = z11 ? 1 : 0;
        int i18 = (i14 + i15) * 31;
        boolean z12 = this.lightsEnabled;
        if (!z12) {
            i10 = z12 ? 1 : 0;
        }
        return i18 + i10;
    }

    public String toString() {
        boolean z10 = this.soundsEnabled;
        boolean z11 = this.vibrationsEnabled;
        boolean z12 = this.lightsEnabled;
        return "NotificationBehaviors(soundsEnabled=" + z10 + ", vibrationsEnabled=" + z11 + ", lightsEnabled=" + z12 + ")";
    }
}
