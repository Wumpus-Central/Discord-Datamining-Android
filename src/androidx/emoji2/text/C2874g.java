package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.core.graphics.C2386c;
import androidx.emoji2.text.C2863d;
import androidx.emoji2.text.C2887l;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.emoji2.text.g */
/* loaded from: classes.dex */
public final class C2874g {

    /* renamed from: a */
    private final C2863d.C2871i f3869a;

    /* renamed from: b */
    private final C2887l f3870b;

    /* renamed from: c */
    private C2863d.AbstractC0053d f3871c;

    /* renamed from: d */
    private final boolean f3872d;

    /* renamed from: e */
    private final int[] f3873e;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.emoji2.text.g$a */
    /* loaded from: classes.dex */
    public static final class C2875a {
        /* renamed from: a */
        static int m36415a(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    i--;
                    if (i >= 0) {
                        char charAt = charSequence.charAt(i);
                        if (z) {
                            if (!Character.isHighSurrogate(charAt)) {
                                return -1;
                            }
                            i2--;
                        } else if (!Character.isSurrogate(charAt)) {
                            i2--;
                        } else if (Character.isHighSurrogate(charAt)) {
                            return -1;
                        } else {
                            z = true;
                        }
                    } else if (z) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
                return i;
            }
        }

        /* renamed from: b */
        static int m36414b(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    if (i < length) {
                        char charAt = charSequence.charAt(i);
                        if (z) {
                            if (!Character.isLowSurrogate(charAt)) {
                                return -1;
                            }
                            i2--;
                            i++;
                        } else if (!Character.isSurrogate(charAt)) {
                            i2--;
                            i++;
                        } else if (Character.isLowSurrogate(charAt)) {
                            return -1;
                        } else {
                            i++;
                            z = true;
                        }
                    } else if (z) {
                        return -1;
                    } else {
                        return length;
                    }
                }
                return i;
            }
        }
    }

    /* renamed from: androidx.emoji2.text.g$b */
    /* loaded from: classes.dex */
    public static class C2876b implements C2863d.AbstractC0053d {

        /* renamed from: b */
        private static final ThreadLocal<StringBuilder> f3874b = new ThreadLocal<>();

        /* renamed from: a */
        private final TextPaint f3875a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C2876b() {
            TextPaint textPaint = new TextPaint();
            this.f3875a = textPaint;
            textPaint.setTextSize(10.0f);
        }

        /* renamed from: b */
        private static StringBuilder m36412b() {
            ThreadLocal<StringBuilder> threadLocal = f3874b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            return threadLocal.get();
        }

        @Override // androidx.emoji2.text.C2863d.AbstractC0053d
        /* renamed from: a */
        public boolean mo36413a(CharSequence charSequence, int i, int i2, int i3) {
            StringBuilder b = m36412b();
            b.setLength(0);
            while (i < i2) {
                b.append(charSequence.charAt(i));
                i++;
            }
            return C2386c.m37915a(this.f3875a, b.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.emoji2.text.g$c */
    /* loaded from: classes.dex */
    public static final class C2877c {

        /* renamed from: a */
        private int f3876a = 1;

        /* renamed from: b */
        private final C2887l.C2888a f3877b;

        /* renamed from: c */
        private C2887l.C2888a f3878c;

        /* renamed from: d */
        private C2887l.C2888a f3879d;

        /* renamed from: e */
        private int f3880e;

        /* renamed from: f */
        private int f3881f;

        /* renamed from: g */
        private final boolean f3882g;

        /* renamed from: h */
        private final int[] f3883h;

        C2877c(C2887l.C2888a aVar, boolean z, int[] iArr) {
            this.f3877b = aVar;
            this.f3878c = aVar;
            this.f3882g = z;
            this.f3883h = iArr;
        }

        /* renamed from: d */
        private static boolean m36408d(int i) {
            return i == 65039;
        }

        /* renamed from: f */
        private static boolean m36406f(int i) {
            return i == 65038;
        }

        /* renamed from: g */
        private int m36405g() {
            this.f3876a = 1;
            this.f3878c = this.f3877b;
            this.f3881f = 0;
            return 1;
        }

        /* renamed from: h */
        private boolean m36404h() {
            if (this.f3878c.m36374b().m36425j() || m36408d(this.f3880e)) {
                return true;
            }
            if (this.f3882g) {
                if (this.f3883h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f3883h, this.f3878c.m36374b().m36433b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        int m36411a(int i) {
            C2887l.C2888a a = this.f3878c.m36375a(i);
            int i2 = 2;
            if (this.f3876a != 2) {
                if (a == null) {
                    i2 = m36405g();
                } else {
                    this.f3876a = 2;
                    this.f3878c = a;
                    this.f3881f = 1;
                }
            } else if (a != null) {
                this.f3878c = a;
                this.f3881f++;
            } else if (m36406f(i)) {
                i2 = m36405g();
            } else if (!m36408d(i)) {
                if (this.f3878c.m36374b() != null) {
                    i2 = 3;
                    if (this.f3881f != 1) {
                        this.f3879d = this.f3878c;
                        m36405g();
                    } else if (m36404h()) {
                        this.f3879d = this.f3878c;
                        m36405g();
                    } else {
                        i2 = m36405g();
                    }
                } else {
                    i2 = m36405g();
                }
            }
            this.f3880e = i;
            return i2;
        }

        /* renamed from: b */
        C2873f m36410b() {
            return this.f3878c.m36374b();
        }

        /* renamed from: c */
        C2873f m36409c() {
            return this.f3879d.m36374b();
        }

        /* renamed from: e */
        boolean m36407e() {
            if (this.f3876a != 2 || this.f3878c.m36374b() == null || (this.f3881f <= 1 && !m36404h())) {
                return false;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2874g(C2887l lVar, C2863d.C2871i iVar, C2863d.AbstractC0053d dVar, boolean z, int[] iArr) {
        this.f3869a = iVar;
        this.f3870b = lVar;
        this.f3871c = dVar;
        this.f3872d = z;
        this.f3873e = iArr;
    }

    /* renamed from: a */
    private void m36423a(Spannable spannable, C2873f fVar, int i, int i2) {
        spannable.setSpan(this.f3869a.m36435a(fVar), i, i2, 33);
    }

    /* renamed from: b */
    private static boolean m36422b(Editable editable, KeyEvent keyEvent, boolean z) {
        AbstractC2878h[] hVarArr;
        if (m36417g(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!m36418f(selectionStart, selectionEnd) && (hVarArr = (AbstractC2878h[]) editable.getSpans(selectionStart, selectionEnd, AbstractC2878h.class)) != null && hVarArr.length > 0) {
            for (AbstractC2878h hVar : hVarArr) {
                int spanStart = editable.getSpanStart(hVar);
                int spanEnd = editable.getSpanEnd(hVar);
                if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static boolean m36421c(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
        int i3;
        int i4;
        if (editable != null && inputConnection != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (m36418f(selectionStart, selectionEnd)) {
                return false;
            }
            if (z) {
                i4 = C2875a.m36415a(editable, selectionStart, Math.max(i, 0));
                i3 = C2875a.m36414b(editable, selectionEnd, Math.max(i2, 0));
                if (i4 == -1 || i3 == -1) {
                    return false;
                }
            } else {
                i4 = Math.max(selectionStart - i, 0);
                i3 = Math.min(selectionEnd + i2, editable.length());
            }
            AbstractC2878h[] hVarArr = (AbstractC2878h[]) editable.getSpans(i4, i3, AbstractC2878h.class);
            if (hVarArr != null && hVarArr.length > 0) {
                for (AbstractC2878h hVar : hVarArr) {
                    int spanStart = editable.getSpanStart(hVar);
                    int spanEnd = editable.getSpanEnd(hVar);
                    i4 = Math.min(spanStart, i4);
                    i3 = Math.max(spanEnd, i3);
                }
                int max = Math.max(i4, 0);
                int min = Math.min(i3, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(max, min);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static boolean m36420d(Editable editable, int i, KeyEvent keyEvent) {
        boolean z;
        if (i == 67) {
            z = m36422b(editable, keyEvent, false);
        } else if (i != 112) {
            z = false;
        } else {
            z = m36422b(editable, keyEvent, true);
        }
        if (!z) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    /* renamed from: e */
    private boolean m36419e(CharSequence charSequence, int i, int i2, C2873f fVar) {
        if (fVar.m36431d() == 0) {
            fVar.m36424k(this.f3871c.mo36413a(charSequence, i, i2, fVar.m36427h()));
        }
        if (fVar.m36431d() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private static boolean m36418f(int i, int i2) {
        return i == -1 || i2 == -1 || i != i2;
    }

    /* renamed from: g */
    private static boolean m36417g(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x010c, code lost:
        ((androidx.emoji2.text.C2889m) r11).m36369d();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041 A[Catch: all -> 0x0113, TryCatch #0 {all -> 0x0113, blocks: (B:7:0x000e, B:10:0x0013, B:12:0x0017, B:14:0x0024, B:16:0x002c, B:19:0x0032, B:21:0x003a, B:23:0x003d, B:25:0x0041, B:27:0x004d, B:28:0x0050, B:30:0x005d, B:36:0x006c, B:37:0x0078, B:41:0x0093, B:49:0x00a3, B:52:0x00af, B:53:0x00b4, B:54:0x00be, B:56:0x00c5, B:57:0x00ca, B:59:0x00d5, B:61:0x00dc, B:65:0x00e6, B:68:0x00f2, B:69:0x00f8), top: B:82:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f2 A[Catch: all -> 0x0113, TryCatch #0 {all -> 0x0113, blocks: (B:7:0x000e, B:10:0x0013, B:12:0x0017, B:14:0x0024, B:16:0x002c, B:19:0x0032, B:21:0x003a, B:23:0x003d, B:25:0x0041, B:27:0x004d, B:28:0x0050, B:30:0x005d, B:36:0x006c, B:37:0x0078, B:41:0x0093, B:49:0x00a3, B:52:0x00af, B:53:0x00b4, B:54:0x00be, B:56:0x00c5, B:57:0x00ca, B:59:0x00d5, B:61:0x00dc, B:65:0x00e6, B:68:0x00f2, B:69:0x00f8), top: B:82:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0104 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00ca A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x009a A[SYNTHETIC] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.CharSequence m36416h(java.lang.CharSequence r11, int r12, int r13, int r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.C2874g.m36416h(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
    }
}
