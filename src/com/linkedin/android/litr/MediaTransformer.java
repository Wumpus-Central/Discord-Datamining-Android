package com.linkedin.android.litr;

import android.content.Context;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.linkedin.android.litr.C6007b;
import com.linkedin.android.litr.C6010d;
import ge.AbstractC7580a;
import ie.C8393d;
import ie.C8394e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import je.C9563b;
import je.C9565c;
import org.webrtc.MediaStreamTrack;
import p138he.C8008a;
import p266oe.AbstractC11261c;
import p266oe.C11258a;
import p266oe.C11259b;
import pe.C11640c;
import pe.C11645g;
import re.C12577f;
import re.C12580h;

/* loaded from: classes6.dex */
public class MediaTransformer {

    /* renamed from: e */
    private static final String f12156e = "MediaTransformer";

    /* renamed from: a */
    private final Context f12157a;

    /* renamed from: b */
    private final ExecutorService f12158b;

    /* renamed from: c */
    private final Looper f12159c;

    /* renamed from: d */
    private final Map<String, Future<?>> f12160d;

    public MediaTransformer(Context context) {
        this(context, Looper.getMainLooper(), Executors.newSingleThreadExecutor());
    }

    /* renamed from: b */
    private MediaFormat m26477b(AbstractC11261c cVar, int i, String str) {
        String str2;
        int i2;
        int i3;
        MediaFormat trackFormat = cVar.getTrackFormat(i);
        MediaFormat mediaFormat = null;
        if (trackFormat.containsKey("mime")) {
            str2 = trackFormat.getString("mime");
        } else {
            str2 = null;
        }
        if (str2 != null) {
            if (str2.startsWith(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                mediaFormat = MediaFormat.createVideoFormat(str2, trackFormat.getInteger("width"), trackFormat.getInteger("height"));
                mediaFormat.setInteger("bitrate", C12580h.m6483a(cVar, i));
                if (trackFormat.containsKey("i-frame-interval")) {
                    i3 = trackFormat.getInteger("i-frame-interval");
                } else {
                    i3 = 5;
                }
                mediaFormat.setInteger("i-frame-interval", i3);
                mediaFormat.setInteger("frame-rate", C12577f.m6490a(trackFormat, 30).intValue());
            } else if (str2.startsWith(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                if (m26475d(cVar, i, str)) {
                    str2 = m26476c(str);
                }
                mediaFormat = MediaFormat.createAudioFormat(str2, trackFormat.getInteger("sample-rate"), trackFormat.getInteger("channel-count"));
                if (trackFormat.containsKey("bitrate")) {
                    i2 = trackFormat.getInteger("bitrate");
                } else {
                    i2 = 256000;
                }
                mediaFormat.setInteger("bitrate", i2);
                if (trackFormat.containsKey("durationUs")) {
                    mediaFormat.setLong("durationUs", trackFormat.getLong("durationUs"));
                }
            }
        }
        return mediaFormat;
    }

    /* renamed from: c */
    private String m26476c(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c = 0;
                    break;
                }
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c = 1;
                    break;
                }
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c = 2;
                    break;
                }
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return "audio/mp4a-latm";
            case 2:
            case 3:
                return "audio/opus";
            default:
                return null;
        }
    }

    /* renamed from: d */
    private boolean m26475d(AbstractC11261c cVar, int i, String str) {
        if (str == null) {
            return false;
        }
        MediaFormat trackFormat = cVar.getTrackFormat(i);
        char c = 65535;
        switch (str.hashCode()) {
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c = 0;
                    break;
                }
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c = 1;
                    break;
                }
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c = 2;
                    break;
                }
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                if (!trackFormat.containsKey("mime") || !TextUtils.equals(trackFormat.getString("mime"), "audio/raw")) {
                    return false;
                }
                return true;
            case 2:
            case 3:
                if (!trackFormat.containsKey("mime") || TextUtils.equals(trackFormat.getString("mime"), "audio/opus") || TextUtils.equals(trackFormat.getString("mime"), "audio/vorbis")) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    /* renamed from: f */
    private boolean m26473f(MediaFormat mediaFormat, boolean z, boolean z2) {
        String str;
        if (mediaFormat.containsKey("mime")) {
            str = mediaFormat.getString("mime");
        } else {
            str = null;
        }
        return m26472g(str, z, z2);
    }

    /* renamed from: g */
    private boolean m26472g(String str, boolean z, boolean z2) {
        if (str == null) {
            Log.e(f12156e, "Mime type is null for track ");
            return false;
        } else if (z && str.startsWith(MediaStreamTrack.AUDIO_TRACK_KIND)) {
            return false;
        } else {
            if (!z2 || str.startsWith(MediaStreamTrack.VIDEO_TRACK_KIND) || str.startsWith(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public void m26478a(String str) {
        Future<?> future = this.f12160d.get(str);
        if (future != null && !future.isCancelled() && !future.isDone()) {
            future.cancel(true);
        }
    }

    /* renamed from: e */
    public void m26474e() {
        this.f12158b.shutdownNow();
    }

    /* renamed from: h */
    public void m26471h(String str, Uri uri, Uri uri2, MediaFormat mediaFormat, MediaFormat mediaFormat2, AbstractC7580a aVar, C6010d dVar) {
        List<C8008a> list;
        Throwable e;
        C6010d a = dVar == null ? new C6010d.C6012b().m26438a() : dVar;
        try {
            C11258a aVar2 = new C11258a(this.f12157a, uri, a.f12196d);
            int i = 0;
            for (int i2 = 0; i2 < aVar2.getTrackCount(); i2++) {
                if (m26473f(aVar2.getTrackFormat(i2), a.f12197e, a.f12198f)) {
                    i++;
                }
            }
            int i3 = mediaFormat != null && mediaFormat.containsKey("mime") && (TextUtils.equals(mediaFormat.getString("mime"), "video/x-vnd.on2.vp9") || TextUtils.equals(mediaFormat.getString("mime"), "video/x-vnd.on2.vp8")) ? 1 : 0;
            if (i > 0) {
                C11259b bVar = new C11259b(this.f12157a, uri2, i, aVar2.getOrientationHint(), i3);
                int trackCount = aVar2.getTrackCount();
                ArrayList arrayList = new ArrayList(trackCount);
                for (int i4 = 0; i4 < trackCount; i4++) {
                    MediaFormat trackFormat = aVar2.getTrackFormat(i4);
                    String string = trackFormat.containsKey("mime") ? trackFormat.getString("mime") : null;
                    if (m26472g(string, a.f12197e, a.f12198f)) {
                        C6007b.C0174b f = new C6007b.C0174b(aVar2, i4, bVar).m26450f(arrayList.size());
                        if (string.startsWith(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                            f.m26454b(new C8393d()).m26452d(new C11645g(a.f12194b)).m26453c(new C8394e()).m26451e(mediaFormat);
                        } else if (string.startsWith(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                            C8394e eVar = new C8394e();
                            f.m26454b(new C8393d()).m26453c(eVar).m26452d(new C11640c(eVar, a.f12195c)).m26451e(mediaFormat2);
                        } else {
                            try {
                                f.m26451e(null);
                            } catch (C9563b e2) {
                                e = e2;
                                list = null;
                                aVar.onError(str, e, list);
                                return;
                            } catch (C9565c e3) {
                                e = e3;
                                list = null;
                                aVar.onError(str, e, list);
                                return;
                            }
                        }
                        arrayList.add(f.m26455a());
                    }
                }
                m26470i(str, arrayList, aVar, a.f12193a);
                return;
            }
            throw new C9565c(C9565c.EnumC9566a.NO_OUTPUT_TRACKS, uri2, i3, new IllegalArgumentException("No output tracks left"));
        } catch (C9563b | C9565c e4) {
            e = e4;
            list = null;
        }
    }

    /* renamed from: i */
    public void m26470i(String str, List<C6007b> list, AbstractC7580a aVar, int i) {
        String str2;
        if (!this.f12160d.containsKey(str)) {
            int size = list.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    str2 = null;
                    break;
                }
                C6007b bVar = list.get(i2);
                MediaFormat trackFormat = bVar.m26461c().getTrackFormat(bVar.m26458f());
                MediaFormat g = bVar.m26457g();
                if (g != null && g.containsKey("mime") && g.getString("mime").startsWith(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                    str2 = g.getString("mime");
                    break;
                }
                if (trackFormat.containsKey("mime") && trackFormat.getString("mime").startsWith(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                    str2 = trackFormat.getString("mime");
                    break;
                }
                i2++;
            }
            for (int i3 = 0; i3 < size; i3++) {
                C6007b bVar2 = list.get(i3);
                if (bVar2.m26457g() == null && ((bVar2.m26459e() != null && bVar2.m26459e().mo9157a()) || m26475d(bVar2.m26461c(), bVar2.m26458f(), str2))) {
                    list.set(i3, new C6007b.C0174b(bVar2.m26461c(), bVar2.m26458f(), bVar2.m26460d()).m26450f(bVar2.m26456h()).m26454b(bVar2.m26463a()).m26453c(bVar2.m26462b()).m26452d(bVar2.m26459e()).m26451e(m26477b(bVar2.m26461c(), bVar2.m26458f(), str2)).m26455a());
                }
            }
            this.f12160d.put(str, this.f12158b.submit(new RunnableC6009c(str, list, i, new C6005a(this.f12160d, aVar, this.f12159c))));
            return;
        }
        throw new IllegalArgumentException("Request with id " + str + " already exists");
    }

    public MediaTransformer(Context context, Looper looper, ExecutorService executorService) {
        this.f12157a = context.getApplicationContext();
        this.f12160d = new HashMap(10);
        this.f12159c = looper;
        this.f12158b = executorService;
    }
}
