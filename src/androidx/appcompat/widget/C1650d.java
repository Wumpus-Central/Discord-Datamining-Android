package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import androidx.core.widget.C2803l;
import p052d.C6379a;
import p071e.C6525a;

/* renamed from: androidx.appcompat.widget.d */
/* loaded from: classes.dex */
public class C1650d extends AutoCompleteTextView {

    /* renamed from: n */
    private static final int[] f1298n = {16843126};

    /* renamed from: k */
    private final AppCompatBackgroundHelper f1299k;

    /* renamed from: l */
    private final AppCompatTextHelper f1300l;

    /* renamed from: m */
    private final AppCompatEmojiEditTextHelper f1301m;

    public C1650d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6379a.f13110p);
    }

    /* renamed from: a */
    void m40282a(AppCompatEmojiEditTextHelper appCompatEmojiEditTextHelper) {
        KeyListener keyListener = getKeyListener();
        if (appCompatEmojiEditTextHelper.m40498b(keyListener)) {
            boolean isFocusable = super.isFocusable();
            int inputType = super.getInputType();
            KeyListener a = appCompatEmojiEditTextHelper.m40499a(keyListener);
            if (a != keyListener) {
                super.setKeyListener(a);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1299k;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m40509b();
        }
        AppCompatTextHelper appCompatTextHelper = this.f1300l;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m40464b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C2803l.m36672p(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1299k;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.m40508c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1299k;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.m40507d();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.f1301m.m40495e(C1690l.m40130a(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1299k;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m40505f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1299k;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m40504g(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C2803l.m36671q(this, callback));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C6525a.m25364b(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f1301m.m40494f(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f1301m.m40499a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1299k;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m40502i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1299k;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m40501j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        AppCompatTextHelper appCompatTextHelper = this.f1300l;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m40449q(context, i);
        }
    }

    public C1650d(Context context, AttributeSet attributeSet, int i) {
        super(C1689k1.m40131b(context), attributeSet, i);
        C1682i1.m40169a(this, getContext());
        C1698n1 v = C1698n1.m40105v(getContext(), attributeSet, f1298n, i, 0);
        if (v.m40108s(0)) {
            setDropDownBackgroundDrawable(v.m40120g(0));
        }
        v.m40104w();
        AppCompatBackgroundHelper appCompatBackgroundHelper = new AppCompatBackgroundHelper(this);
        this.f1299k = appCompatBackgroundHelper;
        appCompatBackgroundHelper.m40506e(attributeSet, i);
        AppCompatTextHelper appCompatTextHelper = new AppCompatTextHelper(this);
        this.f1300l = appCompatTextHelper;
        appCompatTextHelper.m40453m(attributeSet, i);
        appCompatTextHelper.m40464b();
        AppCompatEmojiEditTextHelper appCompatEmojiEditTextHelper = new AppCompatEmojiEditTextHelper(this);
        this.f1301m = appCompatEmojiEditTextHelper;
        appCompatEmojiEditTextHelper.m40496d(attributeSet, i);
        m40282a(appCompatEmojiEditTextHelper);
    }
}
