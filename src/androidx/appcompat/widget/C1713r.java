package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import p052d.C6379a;
import p071e.C6525a;

/* renamed from: androidx.appcompat.widget.r */
/* loaded from: classes.dex */
public class C1713r extends RadioButton {

    /* renamed from: k */
    private final C1680i f1466k;

    /* renamed from: l */
    private final AppCompatBackgroundHelper f1467l;

    /* renamed from: m */
    private final AppCompatTextHelper f1468m;

    /* renamed from: n */
    private AppCompatEmojiTextHelper f1469n;

    public C1713r(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6379a.f37741G);
    }

    private AppCompatEmojiTextHelper getEmojiTextViewHelper() {
        if (this.f1469n == null) {
            this.f1469n = new AppCompatEmojiTextHelper(this);
        }
        return this.f1469n;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1467l;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m40509b();
        }
        AppCompatTextHelper appCompatTextHelper = this.f1468m;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m40464b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C1680i iVar = this.f1466k;
        if (iVar != null) {
            return iVar.m40177b(compoundPaddingLeft);
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1467l;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.m40508c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1467l;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.m40507d();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        C1680i iVar = this.f1466k;
        if (iVar != null) {
            return iVar.m40176c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C1680i iVar = this.f1466k;
        if (iVar != null) {
            return iVar.m40175d();
        }
        return null;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m40490d(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1467l;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m40505f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1467l;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m40504g(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C1680i iVar = this.f1466k;
        if (iVar != null) {
            iVar.m40173f();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m40489e(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m40493a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1467l;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m40502i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1467l;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m40501j(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C1680i iVar = this.f1466k;
        if (iVar != null) {
            iVar.m40172g(colorStateList);
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C1680i iVar = this.f1466k;
        if (iVar != null) {
            iVar.m40171h(mode);
        }
    }

    public C1713r(Context context, AttributeSet attributeSet, int i) {
        super(C1689k1.m40131b(context), attributeSet, i);
        C1682i1.m40169a(this, getContext());
        C1680i iVar = new C1680i(this);
        this.f1466k = iVar;
        iVar.m40174e(attributeSet, i);
        AppCompatBackgroundHelper appCompatBackgroundHelper = new AppCompatBackgroundHelper(this);
        this.f1467l = appCompatBackgroundHelper;
        appCompatBackgroundHelper.m40506e(attributeSet, i);
        AppCompatTextHelper appCompatTextHelper = new AppCompatTextHelper(this);
        this.f1468m = appCompatTextHelper;
        appCompatTextHelper.m40453m(attributeSet, i);
        getEmojiTextViewHelper().m40491c(attributeSet, i);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(C6525a.m25364b(getContext(), i));
    }
}
