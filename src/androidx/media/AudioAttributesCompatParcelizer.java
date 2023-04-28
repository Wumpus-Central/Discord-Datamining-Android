package androidx.media;

import androidx.versionedparcelable.AbstractC3304a;

/* loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(AbstractC3304a aVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f4513a = (AudioAttributesImpl) aVar.m34726v(audioAttributesCompat.f4513a, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, AbstractC3304a aVar) {
        aVar.m34725x(false, false);
        aVar.m34740M(audioAttributesCompat.f4513a, 1);
    }
}
