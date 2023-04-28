package p229m8;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import p079e7.C6713c;
import p132h8.AbstractC7935a;
import p132h8.C7937c;

/* renamed from: m8.b */
/* loaded from: classes7.dex */
public class C10539b implements AbstractC7935a<C10539b> {

    /* renamed from: a */
    public final long f23304a;

    /* renamed from: b */
    public final long f23305b;

    /* renamed from: c */
    public final long f23306c;

    /* renamed from: d */
    public final boolean f23307d;

    /* renamed from: e */
    public final long f23308e;

    /* renamed from: f */
    public final long f23309f;

    /* renamed from: g */
    public final long f23310g;

    /* renamed from: h */
    public final long f23311h;

    /* renamed from: i */
    public final C10560n f23312i;

    /* renamed from: j */
    public final C10557k f23313j;

    /* renamed from: k */
    public final Uri f23314k;

    /* renamed from: l */
    public final C10545g f23315l;

    /* renamed from: m */
    private final List<C10544f> f23316m;

    public C10539b(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, C10545g gVar, C10560n nVar, C10557k kVar, Uri uri, List<C10544f> list) {
        List<C10544f> list2;
        this.f23304a = j;
        this.f23305b = j2;
        this.f23306c = j3;
        this.f23307d = z;
        this.f23308e = j4;
        this.f23309f = j5;
        this.f23310g = j6;
        this.f23311h = j7;
        this.f23315l = gVar;
        this.f23312i = nVar;
        this.f23314k = uri;
        this.f23313j = kVar;
        if (list == null) {
            list2 = Collections.emptyList();
        } else {
            list2 = list;
        }
        this.f23316m = list2;
    }

    /* renamed from: c */
    private static ArrayList<C10538a> m12923c(List<C10538a> list, LinkedList<C7937c> linkedList) {
        C7937c poll = linkedList.poll();
        int i = poll.f17034k;
        ArrayList<C10538a> arrayList = new ArrayList<>();
        do {
            int i2 = poll.f17035l;
            C10538a aVar = list.get(i2);
            List<AbstractC10547i> list2 = aVar.f23300c;
            ArrayList arrayList2 = new ArrayList();
            do {
                arrayList2.add(list2.get(poll.f17036m));
                poll = linkedList.poll();
                if (poll.f17034k != i) {
                    break;
                }
            } while (poll.f17035l == i2);
            arrayList.add(new C10538a(aVar.f23298a, aVar.f23299b, arrayList2, aVar.f23301d, aVar.f23302e, aVar.f23303f));
        } while (poll.f17034k == i);
        linkedList.addFirst(poll);
        return arrayList;
    }

    /* renamed from: b */
    public final C10539b mo7928a(List<C7937c> list) {
        long j;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new C7937c(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j2 = 0;
        int i = 0;
        while (true) {
            j = -9223372036854775807L;
            if (i >= m12921e()) {
                break;
            }
            if (((C7937c) linkedList.peek()).f17034k != i) {
                long f = m12920f(i);
                if (f != -9223372036854775807L) {
                    j2 += f;
                }
            } else {
                C10544f d = m12922d(i);
                arrayList.add(new C10544f(d.f23337a, d.f23338b - j2, m12923c(d.f23339c, linkedList), d.f23340d));
            }
            i++;
        }
        long j3 = this.f23305b;
        if (j3 != -9223372036854775807L) {
            j = j3 - j2;
        }
        return new C10539b(this.f23304a, j, this.f23306c, this.f23307d, this.f23308e, this.f23309f, this.f23310g, this.f23311h, this.f23315l, this.f23312i, this.f23313j, this.f23314k, arrayList);
    }

    /* renamed from: d */
    public final C10544f m12922d(int i) {
        return this.f23316m.get(i);
    }

    /* renamed from: e */
    public final int m12921e() {
        return this.f23316m.size();
    }

    /* renamed from: f */
    public final long m12920f(int i) {
        long j;
        long j2;
        if (i == this.f23316m.size() - 1) {
            j2 = this.f23305b;
            if (j2 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j = this.f23316m.get(i).f23338b;
        } else {
            j2 = this.f23316m.get(i + 1).f23338b;
            j = this.f23316m.get(i).f23338b;
        }
        return j2 - j;
    }

    /* renamed from: g */
    public final long m12919g(int i) {
        return C6713c.m24566c(m12920f(i));
    }
}
