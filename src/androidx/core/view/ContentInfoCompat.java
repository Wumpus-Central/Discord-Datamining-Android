package androidx.core.view;

import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.ContentInfo;
import androidx.core.util.AbstractC2518h;
import androidx.core.util.C2517g;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ContentInfoCompat {

    /* renamed from: a */
    private final AbstractC2526f f3489a;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.ContentInfoCompat$c */
    /* loaded from: classes.dex */
    public interface AbstractC2523c {
        /* renamed from: a */
        void mo37560a(Uri uri);

        /* renamed from: b */
        void mo37559b(ClipData clipData);

        ContentInfoCompat build();

        /* renamed from: c */
        void mo37558c(int i);

        void setExtras(Bundle bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.ContentInfoCompat$e */
    /* loaded from: classes.dex */
    public static final class C2525e implements AbstractC2526f {

        /* renamed from: a */
        private final ContentInfo f3497a;

        C2525e(ContentInfo contentInfo) {
            this.f3497a = (ContentInfo) C2517g.m37588g(contentInfo);
        }

        @Override // androidx.core.view.ContentInfoCompat.AbstractC2526f
        public Bundle getExtras() {
            Bundle extras;
            extras = this.f3497a.getExtras();
            return extras;
        }

        @Override // androidx.core.view.ContentInfoCompat.AbstractC2526f
        /* renamed from: j */
        public int mo37557j() {
            int source;
            source = this.f3497a.getSource();
            return source;
        }

        @Override // androidx.core.view.ContentInfoCompat.AbstractC2526f
        /* renamed from: k */
        public Uri mo37556k() {
            Uri linkUri;
            linkUri = this.f3497a.getLinkUri();
            return linkUri;
        }

        @Override // androidx.core.view.ContentInfoCompat.AbstractC2526f
        /* renamed from: l */
        public ContentInfo mo37555l() {
            return this.f3497a;
        }

        @Override // androidx.core.view.ContentInfoCompat.AbstractC2526f
        /* renamed from: m */
        public ClipData mo37554m() {
            ClipData clip;
            clip = this.f3497a.getClip();
            return clip;
        }

        @Override // androidx.core.view.ContentInfoCompat.AbstractC2526f
        /* renamed from: n */
        public int mo37553n() {
            int flags;
            flags = this.f3497a.getFlags();
            return flags;
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f3497a + "}";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.ContentInfoCompat$f */
    /* loaded from: classes.dex */
    public interface AbstractC2526f {
        Bundle getExtras();

        /* renamed from: j */
        int mo37557j();

        /* renamed from: k */
        Uri mo37556k();

        /* renamed from: l */
        ContentInfo mo37555l();

        /* renamed from: m */
        ClipData mo37554m();

        /* renamed from: n */
        int mo37553n();
    }

    /* renamed from: androidx.core.view.ContentInfoCompat$g */
    /* loaded from: classes.dex */
    private static final class C2527g implements AbstractC2526f {

        /* renamed from: a */
        private final ClipData f3498a;

        /* renamed from: b */
        private final int f3499b;

        /* renamed from: c */
        private final int f3500c;

        /* renamed from: d */
        private final Uri f3501d;

        /* renamed from: e */
        private final Bundle f3502e;

        C2527g(C2524d dVar) {
            this.f3498a = (ClipData) C2517g.m37588g(dVar.f3492a);
            this.f3499b = C2517g.m37592c(dVar.f3493b, 0, 5, "source");
            this.f3500c = C2517g.m37589f(dVar.f3494c, 1);
            this.f3501d = dVar.f3495d;
            this.f3502e = dVar.f3496e;
        }

        @Override // androidx.core.view.ContentInfoCompat.AbstractC2526f
        public Bundle getExtras() {
            return this.f3502e;
        }

        @Override // androidx.core.view.ContentInfoCompat.AbstractC2526f
        /* renamed from: j */
        public int mo37557j() {
            return this.f3499b;
        }

        @Override // androidx.core.view.ContentInfoCompat.AbstractC2526f
        /* renamed from: k */
        public Uri mo37556k() {
            return this.f3501d;
        }

        @Override // androidx.core.view.ContentInfoCompat.AbstractC2526f
        /* renamed from: l */
        public ContentInfo mo37555l() {
            return null;
        }

        @Override // androidx.core.view.ContentInfoCompat.AbstractC2526f
        /* renamed from: m */
        public ClipData mo37554m() {
            return this.f3498a;
        }

        @Override // androidx.core.view.ContentInfoCompat.AbstractC2526f
        /* renamed from: n */
        public int mo37553n() {
            return this.f3500c;
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ContentInfoCompat{clip=");
            sb2.append(this.f3498a.getDescription());
            sb2.append(", source=");
            sb2.append(ContentInfoCompat.m37568j(this.f3499b));
            sb2.append(", flags=");
            sb2.append(ContentInfoCompat.m37576b(this.f3500c));
            String str2 = "";
            if (this.f3501d == null) {
                str = str2;
            } else {
                str = ", hasLinkUri(" + this.f3501d.toString().length() + ")";
            }
            sb2.append(str);
            if (this.f3502e != null) {
                str2 = ", hasExtras";
            }
            sb2.append(str2);
            sb2.append("}");
            return sb2.toString();
        }
    }

    ContentInfoCompat(AbstractC2526f fVar) {
        this.f3489a = fVar;
    }

    /* renamed from: a */
    static ClipData m37577a(ClipDescription clipDescription, List<ClipData.Item> list) {
        ClipData clipData = new ClipData(new ClipDescription(clipDescription), list.get(0));
        for (int i = 1; i < list.size(); i++) {
            clipData.addItem(list.get(i));
        }
        return clipData;
    }

    /* renamed from: b */
    static String m37576b(int i) {
        if ((i & 1) != 0) {
            return "FLAG_CONVERT_TO_PLAIN_TEXT";
        }
        return String.valueOf(i);
    }

    /* renamed from: h */
    static Pair<ClipData, ClipData> m37570h(ClipData clipData, AbstractC2518h<ClipData.Item> hVar) {
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (int i = 0; i < clipData.getItemCount(); i++) {
            ClipData.Item itemAt = clipData.getItemAt(i);
            if (hVar.test(itemAt)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(itemAt);
            } else {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(itemAt);
            }
        }
        if (arrayList == null) {
            return Pair.create(null, clipData);
        }
        if (arrayList2 == null) {
            return Pair.create(clipData, null);
        }
        return Pair.create(m37577a(clipData.getDescription(), arrayList), m37577a(clipData.getDescription(), arrayList2));
    }

    /* renamed from: j */
    static String m37568j(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    /* renamed from: l */
    public static ContentInfoCompat m37566l(ContentInfo contentInfo) {
        return new ContentInfoCompat(new C2525e(contentInfo));
    }

    /* renamed from: c */
    public ClipData m37575c() {
        return this.f3489a.mo37554m();
    }

    /* renamed from: d */
    public Bundle m37574d() {
        return this.f3489a.getExtras();
    }

    /* renamed from: e */
    public int m37573e() {
        return this.f3489a.mo37553n();
    }

    /* renamed from: f */
    public Uri m37572f() {
        return this.f3489a.mo37556k();
    }

    /* renamed from: g */
    public int m37571g() {
        return this.f3489a.mo37557j();
    }

    /* renamed from: i */
    public Pair<ContentInfoCompat, ContentInfoCompat> m37569i(AbstractC2518h<ClipData.Item> hVar) {
        ContentInfoCompat contentInfoCompat;
        ClipData m = this.f3489a.mo37554m();
        ContentInfoCompat contentInfoCompat2 = null;
        if (m.getItemCount() == 1) {
            boolean test = hVar.test(m.getItemAt(0));
            if (test) {
                contentInfoCompat = this;
            } else {
                contentInfoCompat = null;
            }
            if (!test) {
                contentInfoCompat2 = this;
            }
            return Pair.create(contentInfoCompat, contentInfoCompat2);
        }
        Pair<ClipData, ClipData> h = m37570h(m, hVar);
        if (h.first == null) {
            return Pair.create(null, this);
        }
        if (h.second == null) {
            return Pair.create(this, null);
        }
        return Pair.create(new C2521a(this).m37564b((ClipData) h.first).m37565a(), new C2521a(this).m37564b((ClipData) h.second).m37565a());
    }

    /* renamed from: k */
    public ContentInfo m37567k() {
        ContentInfo l = this.f3489a.mo37555l();
        Objects.requireNonNull(l);
        return l;
    }

    public String toString() {
        return this.f3489a.toString();
    }

    /* renamed from: androidx.core.view.ContentInfoCompat$b */
    /* loaded from: classes.dex */
    private static final class C2522b implements AbstractC2523c {

        /* renamed from: a */
        private final ContentInfo.Builder f3491a;

        C2522b(ClipData clipData, int i) {
            this.f3491a = new ContentInfo.Builder(clipData, i);
        }

        @Override // androidx.core.view.ContentInfoCompat.AbstractC2523c
        /* renamed from: a */
        public void mo37560a(Uri uri) {
            this.f3491a.setLinkUri(uri);
        }

        @Override // androidx.core.view.ContentInfoCompat.AbstractC2523c
        /* renamed from: b */
        public void mo37559b(ClipData clipData) {
            this.f3491a.setClip(clipData);
        }

        @Override // androidx.core.view.ContentInfoCompat.AbstractC2523c
        public ContentInfoCompat build() {
            ContentInfo build;
            build = this.f3491a.build();
            return new ContentInfoCompat(new C2525e(build));
        }

        @Override // androidx.core.view.ContentInfoCompat.AbstractC2523c
        /* renamed from: c */
        public void mo37558c(int i) {
            this.f3491a.setFlags(i);
        }

        @Override // androidx.core.view.ContentInfoCompat.AbstractC2523c
        public void setExtras(Bundle bundle) {
            this.f3491a.setExtras(bundle);
        }

        C2522b(ContentInfoCompat contentInfoCompat) {
            this.f3491a = new ContentInfo.Builder(contentInfoCompat.m37567k());
        }
    }

    /* renamed from: androidx.core.view.ContentInfoCompat$d */
    /* loaded from: classes.dex */
    private static final class C2524d implements AbstractC2523c {

        /* renamed from: a */
        ClipData f3492a;

        /* renamed from: b */
        int f3493b;

        /* renamed from: c */
        int f3494c;

        /* renamed from: d */
        Uri f3495d;

        /* renamed from: e */
        Bundle f3496e;

        C2524d(ClipData clipData, int i) {
            this.f3492a = clipData;
            this.f3493b = i;
        }

        @Override // androidx.core.view.ContentInfoCompat.AbstractC2523c
        /* renamed from: a */
        public void mo37560a(Uri uri) {
            this.f3495d = uri;
        }

        @Override // androidx.core.view.ContentInfoCompat.AbstractC2523c
        /* renamed from: b */
        public void mo37559b(ClipData clipData) {
            this.f3492a = clipData;
        }

        @Override // androidx.core.view.ContentInfoCompat.AbstractC2523c
        public ContentInfoCompat build() {
            return new ContentInfoCompat(new C2527g(this));
        }

        @Override // androidx.core.view.ContentInfoCompat.AbstractC2523c
        /* renamed from: c */
        public void mo37558c(int i) {
            this.f3494c = i;
        }

        @Override // androidx.core.view.ContentInfoCompat.AbstractC2523c
        public void setExtras(Bundle bundle) {
            this.f3496e = bundle;
        }

        C2524d(ContentInfoCompat contentInfoCompat) {
            this.f3492a = contentInfoCompat.m37575c();
            this.f3493b = contentInfoCompat.m37571g();
            this.f3494c = contentInfoCompat.m37573e();
            this.f3495d = contentInfoCompat.m37572f();
            this.f3496e = contentInfoCompat.m37574d();
        }
    }

    /* renamed from: androidx.core.view.ContentInfoCompat$a */
    /* loaded from: classes.dex */
    public static final class C2521a {

        /* renamed from: a */
        private final AbstractC2523c f3490a;

        public C2521a(ContentInfoCompat contentInfoCompat) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f3490a = new C2522b(contentInfoCompat);
            } else {
                this.f3490a = new C2524d(contentInfoCompat);
            }
        }

        /* renamed from: a */
        public ContentInfoCompat m37565a() {
            return this.f3490a.build();
        }

        /* renamed from: b */
        public C2521a m37564b(ClipData clipData) {
            this.f3490a.mo37559b(clipData);
            return this;
        }

        /* renamed from: c */
        public C2521a m37563c(Bundle bundle) {
            this.f3490a.setExtras(bundle);
            return this;
        }

        /* renamed from: d */
        public C2521a m37562d(int i) {
            this.f3490a.mo37558c(i);
            return this;
        }

        /* renamed from: e */
        public C2521a m37561e(Uri uri) {
            this.f3490a.mo37560a(uri);
            return this;
        }

        public C2521a(ClipData clipData, int i) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f3490a = new C2522b(clipData, i);
            } else {
                this.f3490a = new C2524d(clipData, i);
            }
        }
    }
}
