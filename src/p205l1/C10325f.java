package p205l1;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.core.util.C2517g;
import androidx.emoji2.text.C2863d;

/* renamed from: l1.f */
/* loaded from: classes.dex */
public final class C10325f {

    /* renamed from: a */
    private final C10327b f22637a;

    /* renamed from: l1.f$a */
    /* loaded from: classes.dex */
    private static class C10326a extends C10327b {

        /* renamed from: a */
        private final TextView f22638a;

        /* renamed from: b */
        private final C10321d f22639b;

        /* renamed from: c */
        private boolean f22640c = true;

        C10326a(TextView textView) {
            this.f22638a = textView;
            this.f22639b = new C10321d(textView);
        }

        /* renamed from: f */
        private InputFilter[] m13620f(InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f22639b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f22639b;
            return inputFilterArr2;
        }

        /* renamed from: g */
        private SparseArray<InputFilter> m13619g(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArray = new SparseArray<>(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof C10321d) {
                    sparseArray.put(i, inputFilter);
                }
            }
            return sparseArray;
        }

        /* renamed from: h */
        private InputFilter[] m13618h(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> g = m13619g(inputFilterArr);
            if (g.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - g.size()];
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (g.indexOfKey(i2) < 0) {
                    inputFilterArr2[i] = inputFilterArr[i2];
                    i++;
                }
            }
            return inputFilterArr2;
        }

        /* renamed from: j */
        private TransformationMethod m13616j(TransformationMethod transformationMethod) {
            if (transformationMethod instanceof C10331h) {
                return ((C10331h) transformationMethod).m13600a();
            }
            return transformationMethod;
        }

        /* renamed from: k */
        private void m13615k() {
            this.f22638a.setFilters(mo13612a(this.f22638a.getFilters()));
        }

        /* renamed from: m */
        private TransformationMethod m13613m(TransformationMethod transformationMethod) {
            if (transformationMethod instanceof C10331h) {
                return transformationMethod;
            }
            if (transformationMethod instanceof PasswordTransformationMethod) {
                return transformationMethod;
            }
            return new C10331h(transformationMethod);
        }

        @Override // p205l1.C10325f.C10327b
        /* renamed from: a */
        InputFilter[] mo13612a(InputFilter[] inputFilterArr) {
            if (!this.f22640c) {
                return m13618h(inputFilterArr);
            }
            return m13620f(inputFilterArr);
        }

        @Override // p205l1.C10325f.C10327b
        /* renamed from: b */
        public boolean mo13611b() {
            return this.f22640c;
        }

        @Override // p205l1.C10325f.C10327b
        /* renamed from: c */
        void mo13610c(boolean z) {
            if (z) {
                m13614l();
            }
        }

        @Override // p205l1.C10325f.C10327b
        /* renamed from: d */
        void mo13609d(boolean z) {
            this.f22640c = z;
            m13614l();
            m13615k();
        }

        @Override // p205l1.C10325f.C10327b
        /* renamed from: e */
        TransformationMethod mo13608e(TransformationMethod transformationMethod) {
            if (this.f22640c) {
                return m13613m(transformationMethod);
            }
            return m13616j(transformationMethod);
        }

        /* renamed from: i */
        void m13617i(boolean z) {
            this.f22640c = z;
        }

        /* renamed from: l */
        void m13614l() {
            this.f22638a.setTransformationMethod(mo13608e(this.f22638a.getTransformationMethod()));
        }
    }

    /* renamed from: l1.f$b */
    /* loaded from: classes.dex */
    static class C10327b {
        C10327b() {
        }

        /* renamed from: a */
        InputFilter[] mo13612a(InputFilter[] inputFilterArr) {
            throw null;
        }

        /* renamed from: b */
        public boolean mo13611b() {
            throw null;
        }

        /* renamed from: c */
        void mo13610c(boolean z) {
            throw null;
        }

        /* renamed from: d */
        void mo13609d(boolean z) {
            throw null;
        }

        /* renamed from: e */
        TransformationMethod mo13608e(TransformationMethod transformationMethod) {
            throw null;
        }
    }

    /* renamed from: l1.f$c */
    /* loaded from: classes.dex */
    private static class C10328c extends C10327b {

        /* renamed from: a */
        private final C10326a f22641a;

        C10328c(TextView textView) {
            this.f22641a = new C10326a(textView);
        }

        /* renamed from: f */
        private boolean m13607f() {
            return !C2863d.m36458h();
        }

        @Override // p205l1.C10325f.C10327b
        /* renamed from: a */
        InputFilter[] mo13612a(InputFilter[] inputFilterArr) {
            if (m13607f()) {
                return inputFilterArr;
            }
            return this.f22641a.mo13612a(inputFilterArr);
        }

        @Override // p205l1.C10325f.C10327b
        /* renamed from: b */
        public boolean mo13611b() {
            return this.f22641a.mo13611b();
        }

        @Override // p205l1.C10325f.C10327b
        /* renamed from: c */
        void mo13610c(boolean z) {
            if (!m13607f()) {
                this.f22641a.mo13610c(z);
            }
        }

        @Override // p205l1.C10325f.C10327b
        /* renamed from: d */
        void mo13609d(boolean z) {
            if (m13607f()) {
                this.f22641a.m13617i(z);
            } else {
                this.f22641a.mo13609d(z);
            }
        }

        @Override // p205l1.C10325f.C10327b
        /* renamed from: e */
        TransformationMethod mo13608e(TransformationMethod transformationMethod) {
            if (m13607f()) {
                return transformationMethod;
            }
            return this.f22641a.mo13608e(transformationMethod);
        }
    }

    public C10325f(TextView textView, boolean z) {
        C2517g.m37587h(textView, "textView cannot be null");
        if (!z) {
            this.f22637a = new C10328c(textView);
        } else {
            this.f22637a = new C10326a(textView);
        }
    }

    /* renamed from: a */
    public InputFilter[] m13625a(InputFilter[] inputFilterArr) {
        return this.f22637a.mo13612a(inputFilterArr);
    }

    /* renamed from: b */
    public boolean m13624b() {
        return this.f22637a.mo13611b();
    }

    /* renamed from: c */
    public void m13623c(boolean z) {
        this.f22637a.mo13610c(z);
    }

    /* renamed from: d */
    public void m13622d(boolean z) {
        this.f22637a.mo13609d(z);
    }

    /* renamed from: e */
    public TransformationMethod m13621e(TransformationMethod transformationMethod) {
        return this.f22637a.mo13608e(transformationMethod);
    }
}
