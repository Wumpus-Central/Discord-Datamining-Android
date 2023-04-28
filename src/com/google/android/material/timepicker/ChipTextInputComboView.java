package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.C5661l;
import com.google.android.material.internal.C5665o;
import com.google.android.material.textfield.TextInputLayout;
import p083eb.C6807f;
import p083eb.C6809h;

/* loaded from: classes3.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: k */
    private final Chip f11363k;

    /* renamed from: l */
    private final TextInputLayout f11364l;

    /* renamed from: m */
    private final EditText f11365m;

    /* renamed from: n */
    private TextWatcher f11366n;

    /* renamed from: o */
    private TextView f11367o;

    /* renamed from: com.google.android.material.timepicker.ChipTextInputComboView$b */
    /* loaded from: classes3.dex */
    private class C5764b extends C5661l {
        private C5764b() {
        }

        @Override // com.google.android.material.internal.C5661l, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f11363k.setText(ChipTextInputComboView.this.m27422c("00"));
            } else {
                ChipTextInputComboView.this.f11363k.setText(ChipTextInputComboView.this.m27422c(editable));
            }
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public String m27422c(CharSequence charSequence) {
        return C5781d.m27384a(getResources(), charSequence);
    }

    /* renamed from: d */
    private void m27421d() {
        LocaleList locales;
        if (Build.VERSION.SDK_INT >= 24) {
            locales = getContext().getResources().getConfiguration().getLocales();
            this.f11365m.setImeHintLocales(locales);
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f11363k.isChecked();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m27421d();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        int i;
        this.f11363k.setChecked(z);
        EditText editText = this.f11365m;
        int i2 = 0;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        editText.setVisibility(i);
        Chip chip = this.f11363k;
        if (z) {
            i2 = 8;
        }
        chip.setVisibility(i2);
        if (isChecked()) {
            C5665o.m27823h(this.f11365m);
            if (!TextUtils.isEmpty(this.f11365m.getText())) {
                EditText editText2 = this.f11365m;
                editText2.setSelection(editText2.getText().length());
            }
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f11363k.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        this.f11363k.setTag(i, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f11363k.toggle();
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(C6809h.f14627g, (ViewGroup) this, false);
        this.f11363k = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(C6809h.f14628h, (ViewGroup) this, false);
        this.f11364l = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f11365m = editText;
        editText.setVisibility(4);
        C5764b bVar = new C5764b();
        this.f11366n = bVar;
        editText.addTextChangedListener(bVar);
        m27421d();
        addView(chip);
        addView(textInputLayout);
        this.f11367o = (TextView) findViewById(C6807f.f14603l);
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }
}
