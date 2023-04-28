package pe;

import android.media.MediaFormat;
import com.linkedin.android.litr.render.OboeAudioProcessor;
import kotlin.Metadata;

@Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¨\u0006\t"}, m15073d2 = {"Lpe/b;", "", "Landroid/media/MediaFormat;", "sourceMediaFormat", "targetMediaFormat", "Lpe/a;", "a", "<init>", "()V", "litr_release"}, m15072k = 1, m15071mv = {1, 4, 2})
/* renamed from: pe.b */
/* loaded from: classes6.dex */
public final class C11639b {
    /* renamed from: a */
    public final AbstractC11638a m9174a(MediaFormat mediaFormat, MediaFormat mediaFormat2) {
        if (mediaFormat == null || mediaFormat2 == null || !mediaFormat.containsKey("sample-rate") || !mediaFormat2.containsKey("sample-rate") || !mediaFormat.containsKey("channel-count") || !mediaFormat2.containsKey("channel-count") || (mediaFormat.getInteger("sample-rate") == mediaFormat2.getInteger("sample-rate") && mediaFormat.getInteger("channel-count") == mediaFormat2.getInteger("channel-count"))) {
            return new C11646h();
        }
        return new OboeAudioProcessor(mediaFormat.getInteger("channel-count"), mediaFormat.getInteger("sample-rate"), mediaFormat2.getInteger("channel-count"), mediaFormat2.getInteger("sample-rate"));
    }
}
