package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.AbstractC3304a;

/* loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(AbstractC3304a aVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f4514a = (AudioAttributes) aVar.m34729r(audioAttributesImplApi26.f4514a, 1);
        audioAttributesImplApi26.f4515b = aVar.m34730p(audioAttributesImplApi26.f4515b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, AbstractC3304a aVar) {
        aVar.m34725x(false, false);
        aVar.m34744H(audioAttributesImplApi26.f4514a, 1);
        aVar.m34745F(audioAttributesImplApi26.f4515b, 2);
    }
}
