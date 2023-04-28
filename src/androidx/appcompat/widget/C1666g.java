package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.core.widget.C2803l;
import p052d.C6379a;
import p071e.C6525a;

/* renamed from: androidx.appcompat.widget.g */
/* loaded from: classes.dex */
public class C1666g extends CheckedTextView {

    /* renamed from: k */
    private final C1676h f1328k;

    /* renamed from: l */
    private final AppCompatBackgroundHelper f1329l;

    /* renamed from: m */
    private final AppCompatTextHelper f1330m;

    /* renamed from: n */
    private AppCompatEmojiTextHelper f1331n;

    public C1666g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6379a.f13113s);
    }

    private AppCompatEmojiTextHelper getEmojiTextViewHelper() {
        if (this.f1331n == null) {
            this.f1331n = new AppCompatEmojiTextHelper(this);
        }
        return this.f1331n;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatTextHelper appCompatTextHelper = this.f1330m;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m40464b();
        }
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1329l;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m40509b();
        }
        C1676h hVar = this.f1328k;
        if (hVar != null) {
            hVar.m40204a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C2803l.m36672p(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1329l;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.m40508c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1329l;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.m40507d();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C1676h hVar = this.f1328k;
        if (hVar != null) {
            return hVar.m40203b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C1676h hVar = this.f1328k;
        if (hVar != null) {
            return hVar.m40202c();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C1690l.m40130a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m40490d(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1329l;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m40505f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1329l;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m40504g(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C1676h hVar = this.f1328k;
        if (hVar != null) {
            hVar.m40200e();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C2803l.m36671q(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m40489e(z);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1329l;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m40502i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1329l;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m40501j(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C1676h hVar = this.f1328k;
        if (hVar != null) {
            hVar.m40199f(colorStateList);
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C1676h hVar = this.f1328k;
        if (hVar != null) {
            hVar.m40198g(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        AppCompatTextHelper appCompatTextHelper = this.f1330m;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m40449q(context, i);
        }
    }

    public C1666g(Context context, AttributeSet attributeSet, int i) {
        super(C1689k1.m40131b(context), attributeSet, i);
        C1682i1.m40169a(this, getContext());
        AppCompatTextHelper appCompatTextHelper = new AppCompatTextHelper(this);
        this.f1330m = appCompatTextHelper;
        appCompatTextHelper.m40453m(attributeSet, i);
        appCompatTextHelper.m40464b();
        AppCompatBackgroundHelper appCompatBackgroundHelper = new AppCompatBackgroundHelper(this);
        this.f1329l = appCompatBackgroundHelper;
        appCompatBackgroundHelper.m40506e(attributeSet, i);
        C1676h hVar = new C1676h(this);
        this.f1328k = hVar;
        hVar.m40201d(attributeSet, i);
        getEmojiTextViewHelper().m40491c(attributeSet, i);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C6525a.m25364b(getContext(), i));
    }
}
