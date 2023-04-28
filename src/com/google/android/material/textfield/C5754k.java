package com.google.android.material.textfield;

import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.C5661l;
import com.google.android.material.textfield.TextInputLayout;
import p083eb.C6806e;
import p083eb.C6810i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.textfield.k */
/* loaded from: classes3.dex */
public class C5754k extends AbstractC5746f {

    /* renamed from: e */
    private final TextWatcher f11346e = new C5755a();

    /* renamed from: f */
    private final TextInputLayout.AbstractC5717f f11347f = new C5756b();

    /* renamed from: g */
    private final TextInputLayout.AbstractC5718g f11348g = new C5757c();

    /* renamed from: com.google.android.material.textfield.k$a */
    /* loaded from: classes3.dex */
    class C5755a extends C5661l {
        C5755a() {
        }

        @Override // com.google.android.material.internal.C5661l, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C5754k kVar = C5754k.this;
            kVar.f11312c.setChecked(!kVar.m27459g());
        }
    }

    /* renamed from: com.google.android.material.textfield.k$b */
    /* loaded from: classes3.dex */
    class C5756b implements TextInputLayout.AbstractC5717f {
        C5756b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.AbstractC5717f
        /* renamed from: a */
        public void mo27457a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            C5754k kVar = C5754k.this;
            kVar.f11312c.setChecked(!kVar.m27459g());
            editText.removeTextChangedListener(C5754k.this.f11346e);
            editText.addTextChangedListener(C5754k.this.f11346e);
        }
    }

    /* renamed from: com.google.android.material.textfield.k$c */
    /* loaded from: classes3.dex */
    class C5757c implements TextInputLayout.AbstractC5718g {

        /* renamed from: com.google.android.material.textfield.k$c$a */
        /* loaded from: classes3.dex */
        class RunnableC5758a implements Runnable {

            /* renamed from: k */
            final /* synthetic */ EditText f11352k;

            RunnableC5758a(EditText editText) {
                this.f11352k = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f11352k.removeTextChangedListener(C5754k.this.f11346e);
            }
        }

        C5757c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.AbstractC5718g
        /* renamed from: a */
        public void mo27456a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i == 1) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                editText.post(new RunnableC5758a(editText));
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.k$d */
    /* loaded from: classes3.dex */
    class View$OnClickListenerC5759d implements View.OnClickListener {
        View$OnClickListenerC5759d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EditText editText = C5754k.this.f11310a.getEditText();
            if (editText != null) {
                int selectionEnd = editText.getSelectionEnd();
                if (C5754k.this.m27459g()) {
                    editText.setTransformationMethod(null);
                } else {
                    editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                if (selectionEnd >= 0) {
                    editText.setSelection(selectionEnd);
                }
                C5754k.this.f11310a.m27632U();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5754k(TextInputLayout textInputLayout, int i) {
        super(textInputLayout, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public boolean m27459g() {
        EditText editText = this.f11310a.getEditText();
        if (editText == null || !(editText.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private static boolean m27458h(EditText editText) {
        if (editText == null || (editText.getInputType() != 16 && editText.getInputType() != 128 && editText.getInputType() != 144 && editText.getInputType() != 224)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.AbstractC5746f
    /* renamed from: a */
    public void mo27462a() {
        TextInputLayout textInputLayout = this.f11310a;
        int i = this.f11313d;
        if (i == 0) {
            i = C6806e.f14585a;
        }
        textInputLayout.setEndIconDrawable(i);
        TextInputLayout textInputLayout2 = this.f11310a;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(C6810i.f14654p));
        this.f11310a.setEndIconVisible(true);
        this.f11310a.setEndIconCheckable(true);
        this.f11310a.setEndIconOnClickListener(new View$OnClickListenerC5759d());
        this.f11310a.m27614g(this.f11347f);
        this.f11310a.m27612h(this.f11348g);
        EditText editText = this.f11310a.getEditText();
        if (m27458h(editText)) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
