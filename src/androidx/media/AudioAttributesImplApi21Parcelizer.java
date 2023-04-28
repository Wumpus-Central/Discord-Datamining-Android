package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.AbstractC3304a;

/* loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(AbstractC3304a aVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f4514a = (AudioAttributes) aVar.m34729r(audioAttributesImplApi21.f4514a, 1);
        audioAttributesImplApi21.f4515b = aVar.m34730p(audioAttributesImplApi21.f4515b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, AbstractC3304a aVar) {
        aVar.m34725x(false, false);
        aVar.m34744H(audioAttributesImplApi21.f4514a, 1);
        aVar.m34745F(audioAttributesImplApi21.f4515b, 2);
    }
}
