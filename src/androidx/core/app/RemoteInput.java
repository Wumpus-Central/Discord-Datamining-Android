package androidx.core.app;

import android.app.RemoteInput;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class RemoteInput {

    /* renamed from: a */
    private final String f3174a;

    /* renamed from: b */
    private final CharSequence f3175b;

    /* renamed from: c */
    private final CharSequence[] f3176c;

    /* renamed from: d */
    private final boolean f3177d;

    /* renamed from: e */
    private final int f3178e;

    /* renamed from: f */
    private final Bundle f3179f;

    /* renamed from: g */
    private final Set<String> f3180g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.RemoteInput$a */
    /* loaded from: classes.dex */
    public static class C2187a {
        /* renamed from: a */
        static void m38371a(Object obj, Intent intent, Bundle bundle) {
            android.app.RemoteInput.addResultsToIntent((android.app.RemoteInput[]) obj, intent, bundle);
        }

        /* renamed from: b */
        public static android.app.RemoteInput m38370b(RemoteInput remoteInput) {
            Set<String> e;
            RemoteInput.Builder addExtras = new RemoteInput.Builder(remoteInput.m38374j()).setLabel(remoteInput.m38375i()).setChoices(remoteInput.m38378f()).setAllowFreeFormInput(remoteInput.m38380d()).addExtras(remoteInput.m38376h());
            if (Build.VERSION.SDK_INT >= 26 && (e = remoteInput.m38379e()) != null) {
                for (String str : e) {
                    C2188b.m38364d(addExtras, str, true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                C2189c.m38362b(addExtras, remoteInput.m38377g());
            }
            return addExtras.build();
        }

        /* renamed from: c */
        static RemoteInput m38369c(Object obj) {
            Set<String> b;
            android.app.RemoteInput remoteInput = (android.app.RemoteInput) obj;
            C2190d a = new C2190d(remoteInput.getResultKey()).m38355g(remoteInput.getLabel()).m38357e(remoteInput.getChoices()).m38358d(remoteInput.getAllowFreeFormInput()).m38361a(remoteInput.getExtras());
            if (Build.VERSION.SDK_INT >= 26 && (b = C2188b.m38366b(remoteInput)) != null) {
                for (String str : b) {
                    a.m38359c(str, true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                a.m38356f(C2189c.m38363a(remoteInput));
            }
            return a.m38360b();
        }

        /* renamed from: d */
        static Bundle m38368d(Intent intent) {
            return android.app.RemoteInput.getResultsFromIntent(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.RemoteInput$b */
    /* loaded from: classes.dex */
    public static class C2188b {
        /* renamed from: a */
        static void m38367a(RemoteInput remoteInput, Intent intent, Map<String, Uri> map) {
            android.app.RemoteInput.addDataResultToIntent(RemoteInput.m38383a(remoteInput), intent, map);
        }

        /* renamed from: b */
        static Set<String> m38366b(Object obj) {
            Set<String> allowedDataTypes;
            allowedDataTypes = ((android.app.RemoteInput) obj).getAllowedDataTypes();
            return allowedDataTypes;
        }

        /* renamed from: c */
        static Map<String, Uri> m38365c(Intent intent, String str) {
            Map<String, Uri> dataResultsFromIntent;
            dataResultsFromIntent = android.app.RemoteInput.getDataResultsFromIntent(intent, str);
            return dataResultsFromIntent;
        }

        /* renamed from: d */
        static RemoteInput.Builder m38364d(RemoteInput.Builder builder, String str, boolean z) {
            RemoteInput.Builder allowDataType;
            allowDataType = builder.setAllowDataType(str, z);
            return allowDataType;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.RemoteInput$c */
    /* loaded from: classes.dex */
    public static class C2189c {
        /* renamed from: a */
        static int m38363a(Object obj) {
            int editChoicesBeforeSending;
            editChoicesBeforeSending = ((android.app.RemoteInput) obj).getEditChoicesBeforeSending();
            return editChoicesBeforeSending;
        }

        /* renamed from: b */
        static RemoteInput.Builder m38362b(RemoteInput.Builder builder, int i) {
            RemoteInput.Builder editChoicesBeforeSending;
            editChoicesBeforeSending = builder.setEditChoicesBeforeSending(i);
            return editChoicesBeforeSending;
        }
    }

    /* renamed from: androidx.core.app.RemoteInput$d */
    /* loaded from: classes.dex */
    public static final class C2190d {

        /* renamed from: a */
        private final String f3181a;

        /* renamed from: d */
        private CharSequence f3184d;

        /* renamed from: e */
        private CharSequence[] f3185e;

        /* renamed from: b */
        private final Set<String> f3182b = new HashSet();

        /* renamed from: c */
        private final Bundle f3183c = new Bundle();

        /* renamed from: f */
        private boolean f3186f = true;

        /* renamed from: g */
        private int f3187g = 0;

        public C2190d(String str) {
            if (str != null) {
                this.f3181a = str;
                return;
            }
            throw new IllegalArgumentException("Result key can't be null");
        }

        /* renamed from: a */
        public C2190d m38361a(Bundle bundle) {
            if (bundle != null) {
                this.f3183c.putAll(bundle);
            }
            return this;
        }

        /* renamed from: b */
        public RemoteInput m38360b() {
            return new RemoteInput(this.f3181a, this.f3184d, this.f3185e, this.f3186f, this.f3187g, this.f3183c, this.f3182b);
        }

        /* renamed from: c */
        public C2190d m38359c(String str, boolean z) {
            if (z) {
                this.f3182b.add(str);
            } else {
                this.f3182b.remove(str);
            }
            return this;
        }

        /* renamed from: d */
        public C2190d m38358d(boolean z) {
            this.f3186f = z;
            return this;
        }

        /* renamed from: e */
        public C2190d m38357e(CharSequence[] charSequenceArr) {
            this.f3185e = charSequenceArr;
            return this;
        }

        /* renamed from: f */
        public C2190d m38356f(int i) {
            this.f3187g = i;
            return this;
        }

        /* renamed from: g */
        public C2190d m38355g(CharSequence charSequence) {
            this.f3184d = charSequence;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RemoteInput(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z, int i, Bundle bundle, Set<String> set) {
        this.f3174a = str;
        this.f3175b = charSequence;
        this.f3176c = charSequenceArr;
        this.f3177d = z;
        this.f3178e = i;
        this.f3179f = bundle;
        this.f3180g = set;
        if (m38377g() == 2 && !m38380d()) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    /* renamed from: a */
    static android.app.RemoteInput m38383a(RemoteInput remoteInput) {
        return C2187a.m38370b(remoteInput);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static android.app.RemoteInput[] m38382b(RemoteInput[] remoteInputArr) {
        if (remoteInputArr == null) {
            return null;
        }
        android.app.RemoteInput[] remoteInputArr2 = new android.app.RemoteInput[remoteInputArr.length];
        for (int i = 0; i < remoteInputArr.length; i++) {
            remoteInputArr2[i] = m38383a(remoteInputArr[i]);
        }
        return remoteInputArr2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static RemoteInput m38381c(android.app.RemoteInput remoteInput) {
        return C2187a.m38369c(remoteInput);
    }

    /* renamed from: k */
    public static Bundle m38373k(Intent intent) {
        return C2187a.m38368d(intent);
    }

    /* renamed from: d */
    public boolean m38380d() {
        return this.f3177d;
    }

    /* renamed from: e */
    public Set<String> m38379e() {
        return this.f3180g;
    }

    /* renamed from: f */
    public CharSequence[] m38378f() {
        return this.f3176c;
    }

    /* renamed from: g */
    public int m38377g() {
        return this.f3178e;
    }

    /* renamed from: h */
    public Bundle m38376h() {
        return this.f3179f;
    }

    /* renamed from: i */
    public CharSequence m38375i() {
        return this.f3175b;
    }

    /* renamed from: j */
    public String m38374j() {
        return this.f3174a;
    }

    /* renamed from: l */
    public boolean m38372l() {
        if (m38380d() || ((m38378f() != null && m38378f().length != 0) || m38379e() == null || m38379e().isEmpty())) {
            return false;
        }
        return true;
    }
}
