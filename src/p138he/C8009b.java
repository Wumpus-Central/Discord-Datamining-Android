package p138he;

import android.media.MediaFormat;
import java.util.ArrayList;
import java.util.List;

/* renamed from: he.b */
/* loaded from: classes6.dex */
public class C8009b {

    /* renamed from: a */
    private List<C8008a> f17284a = new ArrayList(2);

    /* renamed from: a */
    public void m20865a(MediaFormat mediaFormat) {
        C8008a aVar = new C8008a();
        aVar.m20867e(mediaFormat);
        this.f17284a.add(aVar);
    }

    /* renamed from: b */
    public List<C8008a> m20864b() {
        return this.f17284a;
    }

    /* renamed from: c */
    public void m20863c(int i, long j) {
        C8008a aVar = this.f17284a.get(i);
        aVar.m20869c(aVar.m20871a() + j);
    }

    /* renamed from: d */
    public void m20862d(int i, MediaFormat mediaFormat) {
        this.f17284a.get(i).m20866f(mediaFormat);
    }

    /* renamed from: e */
    public void m20861e(int i, String str, String str2) {
        C8008a aVar = this.f17284a.get(i);
        aVar.m20870b(str);
        aVar.m20868d(str2);
    }
}
