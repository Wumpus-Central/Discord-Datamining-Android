package co.discord.media_engine;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m15073d2 = {"Lco/discord/media_engine/EncryptionSettings;", "", "mode", "", "secretKey", "", "(Ljava/lang/String;[I)V", "getMode", "()Ljava/lang/String;", "getSecretKey", "()[I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "android_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
public final class EncryptionSettings {
    private final String mode;
    private final int[] secretKey;

    public EncryptionSettings(String mode, int[] secretKey) {
        C9971q.m14633g(mode, "mode");
        C9971q.m14633g(secretKey, "secretKey");
        this.mode = mode;
        this.secretKey = secretKey;
    }

    public static /* synthetic */ EncryptionSettings copy$default(EncryptionSettings encryptionSettings, String str, int[] iArr, int i, Object obj) {
        if ((i & 1) != 0) {
            str = encryptionSettings.mode;
        }
        if ((i & 2) != 0) {
            iArr = encryptionSettings.secretKey;
        }
        return encryptionSettings.copy(str, iArr);
    }

    public final String component1() {
        return this.mode;
    }

    public final int[] component2() {
        return this.secretKey;
    }

    public final EncryptionSettings copy(String mode, int[] secretKey) {
        C9971q.m14633g(mode, "mode");
        C9971q.m14633g(secretKey, "secretKey");
        return new EncryptionSettings(mode, secretKey);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EncryptionSettings)) {
            return false;
        }
        EncryptionSettings encryptionSettings = (EncryptionSettings) obj;
        return C9971q.m14638b(this.mode, encryptionSettings.mode) && C9971q.m14638b(this.secretKey, encryptionSettings.secretKey);
    }

    public final String getMode() {
        return this.mode;
    }

    public final int[] getSecretKey() {
        return this.secretKey;
    }

    public int hashCode() {
        return (this.mode.hashCode() * 31) + Arrays.hashCode(this.secretKey);
    }

    public String toString() {
        return "EncryptionSettings(mode=" + this.mode + ", secretKey=" + Arrays.toString(this.secretKey) + ')';
    }
}
