package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import p052d.C6379a;

/* renamed from: androidx.appcompat.app.a */
/* loaded from: classes.dex */
public class DialogInterfaceC1509a extends DialogC1541j implements DialogInterface {

    /* renamed from: m */
    final AlertController f730m = new AlertController(getContext(), this, getWindow());

    /* renamed from: androidx.appcompat.app.a$a */
    /* loaded from: classes.dex */
    public static class C0014a {

        /* renamed from: a */
        private final AlertController.C1503b f731a;

        /* renamed from: b */
        private final int f732b;

        public C0014a(Context context) {
            this(context, DialogInterfaceC1509a.m40917f(context, 0));
        }

        /* renamed from: a */
        public C0014a m40916a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.C1503b bVar = this.f731a;
            bVar.f710w = listAdapter;
            bVar.f711x = onClickListener;
            return this;
        }

        /* renamed from: b */
        public C0014a m40915b(View view) {
            this.f731a.f694g = view;
            return this;
        }

        /* renamed from: c */
        public C0014a m40914c(Drawable drawable) {
            this.f731a.f691d = drawable;
            return this;
        }

        public DialogInterfaceC1509a create() {
            DialogInterfaceC1509a aVar = new DialogInterfaceC1509a(this.f731a.f688a, this.f732b);
            this.f731a.m40928a(aVar.f730m);
            aVar.setCancelable(this.f731a.f705r);
            if (this.f731a.f705r) {
                aVar.setCanceledOnTouchOutside(true);
            }
            aVar.setOnCancelListener(this.f731a.f706s);
            aVar.setOnDismissListener(this.f731a.f707t);
            DialogInterface.OnKeyListener onKeyListener = this.f731a.f708u;
            if (onKeyListener != null) {
                aVar.setOnKeyListener(onKeyListener);
            }
            return aVar;
        }

        /* renamed from: d */
        public C0014a m40913d(DialogInterface.OnKeyListener onKeyListener) {
            this.f731a.f708u = onKeyListener;
            return this;
        }

        /* renamed from: e */
        public C0014a m40912e(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C1503b bVar = this.f731a;
            bVar.f710w = listAdapter;
            bVar.f711x = onClickListener;
            bVar.f35118I = i;
            bVar.f35117H = true;
            return this;
        }

        public Context getContext() {
            return this.f731a.f688a;
        }

        public C0014a setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C1503b bVar = this.f731a;
            bVar.f699l = bVar.f688a.getText(i);
            this.f731a.f701n = onClickListener;
            return this;
        }

        public C0014a setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C1503b bVar = this.f731a;
            bVar.f696i = bVar.f688a.getText(i);
            this.f731a.f698k = onClickListener;
            return this;
        }

        public C0014a setTitle(CharSequence charSequence) {
            this.f731a.f693f = charSequence;
            return this;
        }

        public C0014a setView(View view) {
            AlertController.C1503b bVar = this.f731a;
            bVar.f713z = view;
            bVar.f712y = 0;
            bVar.f35114E = false;
            return this;
        }

        public C0014a(Context context, int i) {
            this.f731a = new AlertController.C1503b(new ContextThemeWrapper(context, DialogInterfaceC1509a.m40917f(context, i)));
            this.f732b = i;
        }
    }

    protected DialogInterfaceC1509a(Context context, int i) {
        super(context, m40917f(context, i));
    }

    /* renamed from: f */
    static int m40917f(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C6379a.f13109o, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: e */
    public ListView m40918e() {
        return this.f730m.m40951d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.DialogC1541j, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f730m.m40950e();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f730m.m40949f(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f730m.m40948g(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // androidx.appcompat.app.DialogC1541j, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f730m.m40939p(charSequence);
    }
}
