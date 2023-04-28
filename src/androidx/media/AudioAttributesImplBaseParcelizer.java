package androidx.media;

import androidx.versionedparcelable.AbstractC3304a;

/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(AbstractC3304a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f4516a = aVar.m34730p(audioAttributesImplBase.f4516a, 1);
        audioAttributesImplBase.f4517b = aVar.m34730p(audioAttributesImplBase.f4517b, 2);
        audioAttributesImplBase.f4518c = aVar.m34730p(audioAttributesImplBase.f4518c, 3);
        audioAttributesImplBase.f4519d = aVar.m34730p(audioAttributesImplBase.f4519d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, AbstractC3304a aVar) {
        aVar.m34725x(false, false);
        aVar.m34745F(audioAttributesImplBase.f4516a, 1);
        aVar.m34745F(audioAttributesImplBase.f4517b, 2);
        aVar.m34745F(audioAttributesImplBase.f4518c, 3);
        aVar.m34745F(audioAttributesImplBase.f4519d, 4);
    }
}
