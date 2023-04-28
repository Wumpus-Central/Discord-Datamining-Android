package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import p052d.C6388j;
import p205l1.C10325f;

/* loaded from: classes.dex */
class AppCompatEmojiTextHelper {

    /* renamed from: a */
    private final TextView f1134a;

    /* renamed from: b */
    private final C10325f f1135b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppCompatEmojiTextHelper(TextView textView) {
        this.f1134a = textView;
        this.f1135b = new C10325f(textView, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public InputFilter[] m40493a(InputFilter[] inputFilterArr) {
        return this.f1135b.m13625a(inputFilterArr);
    }

    /* renamed from: b */
    public boolean m40492b() {
        return this.f1135b.m13624b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Finally extract failed */
    /* renamed from: c */
    public void m40491c(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f1134a.getContext().obtainStyledAttributes(attributeSet, C6388j.f13266g0, i, 0);
        try {
            int i2 = C6388j.f13336u0;
            boolean z = true;
            if (obtainStyledAttributes.hasValue(i2)) {
                z = obtainStyledAttributes.getBoolean(i2, true);
            }
            obtainStyledAttributes.recycle();
            m40489e(z);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m40490d(boolean z) {
        this.f1135b.m13623c(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m40489e(boolean z) {
        this.f1135b.m13622d(z);
    }

    /* renamed from: f */
    public TransformationMethod m40488f(TransformationMethod transformationMethod) {
        return this.f1135b.m13621e(transformationMethod);
    }
}
