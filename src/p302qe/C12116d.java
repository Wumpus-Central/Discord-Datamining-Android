package p302qe;

import android.media.MediaFormat;
import android.util.Log;
import ie.AbstractC8390a;
import ie.AbstractC8391b;
import je.C9568e;
import org.webrtc.MediaStreamTrack;
import p266oe.AbstractC11261c;
import p266oe.AbstractC11262d;
import pe.AbstractC11647i;
import pe.C11640c;

/* renamed from: qe.d */
/* loaded from: classes6.dex */
public class C12116d {

    /* renamed from: a */
    private static final String f27198a = "d";

    /* renamed from: a */
    public AbstractC12115c m7793a(int i, int i2, AbstractC11261c cVar, AbstractC8390a aVar, AbstractC11647i iVar, AbstractC8391b bVar, AbstractC11262d dVar, MediaFormat mediaFormat) {
        if (mediaFormat == null) {
            return new C12114b(cVar, i, dVar, i2);
        }
        String string = mediaFormat.getString("mime");
        if (string != null) {
            if (string.startsWith(MediaStreamTrack.VIDEO_TRACK_KIND) || string.startsWith(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                if (aVar == null) {
                    throw new C9568e(C9568e.EnumC9569a.DECODER_NOT_PROVIDED, mediaFormat, null, null);
                } else if (bVar == null) {
                    throw new C9568e(C9568e.EnumC9569a.ENCODER_NOT_PROVIDED, mediaFormat, null, null);
                }
            }
            if (string.startsWith(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                if (iVar != null) {
                    return new C12117e(cVar, i, dVar, i2, mediaFormat, iVar, aVar, bVar);
                }
                throw new C9568e(C9568e.EnumC9569a.RENDERER_NOT_PROVIDED, mediaFormat, null, null);
            } else if (string.startsWith(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                return new C12113a(cVar, i, dVar, i2, mediaFormat, iVar == null ? new C11640c(bVar) : iVar, aVar, bVar);
            } else {
                String str = f27198a;
                Log.i(str, "Unsupported track mime type: " + string + ", will use passthrough transcoder");
                return new C12114b(cVar, i, dVar, i2);
            }
        } else {
            throw new C9568e(C9568e.EnumC9569a.SOURCE_TRACK_MIME_TYPE_NOT_FOUND, mediaFormat, null, null);
        }
    }
}
