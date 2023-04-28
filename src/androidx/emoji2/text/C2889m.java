package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import androidx.core.util.C2517g;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: androidx.emoji2.text.m */
/* loaded from: classes.dex */
public final class C2889m extends SpannableStringBuilder {

    /* renamed from: k */
    private final Class<?> f3910k;

    /* renamed from: l */
    private final List<C2890a> f3911l = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.emoji2.text.m$a */
    /* loaded from: classes.dex */
    public static class C2890a implements TextWatcher, SpanWatcher {

        /* renamed from: k */
        final Object f3912k;

        /* renamed from: l */
        private final AtomicInteger f3913l = new AtomicInteger(0);

        C2890a(Object obj) {
            this.f3912k = obj;
        }

        /* renamed from: b */
        private boolean m36362b(Object obj) {
            return obj instanceof AbstractC2878h;
        }

        /* renamed from: a */
        final void m36363a() {
            this.f3913l.incrementAndGet();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f3912k).afterTextChanged(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f3912k).beforeTextChanged(charSequence, i, i2, i3);
        }

        /* renamed from: c */
        final void m36361c() {
            this.f3913l.decrementAndGet();
        }

        @Override // android.text.SpanWatcher
        public void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
            if (this.f3913l.get() <= 0 || !m36362b(obj)) {
                ((SpanWatcher) this.f3912k).onSpanAdded(spannable, obj, i, i2);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
            if (this.f3913l.get() <= 0 || !m36362b(obj)) {
                ((SpanWatcher) this.f3912k).onSpanChanged(spannable, obj, i, i2, i3, i4);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
            if (this.f3913l.get() <= 0 || !m36362b(obj)) {
                ((SpanWatcher) this.f3912k).onSpanRemoved(spannable, obj, i, i2);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f3912k).onTextChanged(charSequence, i, i2, i3);
        }
    }

    C2889m(Class<?> cls, CharSequence charSequence) {
        super(charSequence);
        C2517g.m37587h(cls, "watcherClass cannot be null");
        this.f3910k = cls;
    }

    /* renamed from: b */
    private void m36371b() {
        for (int i = 0; i < this.f3911l.size(); i++) {
            this.f3911l.get(i).m36363a();
        }
    }

    /* renamed from: c */
    public static C2889m m36370c(Class<?> cls, CharSequence charSequence) {
        return new C2889m(cls, charSequence);
    }

    /* renamed from: e */
    private void m36368e() {
        for (int i = 0; i < this.f3911l.size(); i++) {
            this.f3911l.get(i).onTextChanged(this, 0, length(), length());
        }
    }

    /* renamed from: f */
    private C2890a m36367f(Object obj) {
        for (int i = 0; i < this.f3911l.size(); i++) {
            C2890a aVar = this.f3911l.get(i);
            if (aVar.f3912k == obj) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: g */
    private boolean m36366g(Class<?> cls) {
        return this.f3910k == cls;
    }

    /* renamed from: h */
    private boolean m36365h(Object obj) {
        return obj != null && m36366g(obj.getClass());
    }

    /* renamed from: i */
    private void m36364i() {
        for (int i = 0; i < this.f3911l.size(); i++) {
            this.f3911l.get(i).m36361c();
        }
    }

    /* renamed from: a */
    public void m36372a() {
        m36371b();
    }

    /* renamed from: d */
    public void m36369d() {
        m36364i();
        m36368e();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanEnd(Object obj) {
        C2890a f;
        if (m36365h(obj) && (f = m36367f(obj)) != null) {
            obj = f;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanFlags(Object obj) {
        C2890a f;
        if (m36365h(obj) && (f = m36367f(obj)) != null) {
            obj = f;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanStart(Object obj) {
        C2890a f;
        if (m36365h(obj) && (f = m36367f(obj)) != null) {
            obj = f;
        }
        return super.getSpanStart(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    @SuppressLint({"UnknownNullness"})
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        if (!m36366g(cls)) {
            return (T[]) super.getSpans(i, i2, cls);
        }
        C2890a[] aVarArr = (C2890a[]) super.getSpans(i, i2, C2890a.class);
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, aVarArr.length));
        for (int i3 = 0; i3 < aVarArr.length; i3++) {
            tArr[i3] = aVarArr[i3].f3912k;
        }
        return tArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        if (cls == null || m36366g(cls)) {
            cls = C2890a.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void removeSpan(Object obj) {
        C2890a aVar;
        if (m36365h(obj)) {
            aVar = m36367f(obj);
            if (aVar != null) {
                obj = aVar;
            }
        } else {
            aVar = null;
        }
        super.removeSpan(obj);
        if (aVar != null) {
            this.f3911l.remove(aVar);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (m36365h(obj)) {
            C2890a aVar = new C2890a(obj);
            this.f3911l.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    @SuppressLint({"UnknownNullness"})
    public CharSequence subSequence(int i, int i2) {
        return new C2889m(this.f3910k, this, i, i2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        m36371b();
        super.replace(i, i2, charSequence);
        m36364i();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    C2889m(Class<?> cls, CharSequence charSequence, int i, int i2) {
        super(charSequence, i, i2);
        C2517g.m37587h(cls, "watcherClass cannot be null");
        this.f3910k = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        m36371b();
        super.replace(i, i2, charSequence, i3, i4);
        m36364i();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}
