package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.AbstractC2694r0;
import androidx.core.view.C2733w0;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.material.datepicker.C5566a;
import com.google.android.material.internal.C5647d;
import com.google.android.material.internal.C5665o;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p071e.C6525a;
import p083eb.C6803b;
import p083eb.C6805d;
import p083eb.C6806e;
import p083eb.C6807f;
import p083eb.C6809h;
import p083eb.C6810i;
import p083eb.C6811j;
import p231mb.View$OnTouchListenerC10579a;
import p366ub.C13241b;
import p422xb.C14038g;

/* renamed from: com.google.android.material.datepicker.i */
/* loaded from: classes3.dex */
public final class C5588i<S> extends DialogFragment {

    /* renamed from: G */
    static final Object f37483G = "CONFIRM_BUTTON_TAG";

    /* renamed from: H */
    static final Object f37484H = "CANCEL_BUTTON_TAG";

    /* renamed from: I */
    static final Object f37485I = "TOGGLE_BUTTON_TAG";

    /* renamed from: A */
    private CharSequence f37486A;

    /* renamed from: B */
    private TextView f37487B;

    /* renamed from: C */
    private CheckableImageButton f37488C;

    /* renamed from: D */
    private C14038g f37489D;

    /* renamed from: E */
    private Button f37490E;

    /* renamed from: F */
    private boolean f37491F;

    /* renamed from: k */
    private final LinkedHashSet<AbstractC5594j<? super S>> f10826k = new LinkedHashSet<>();

    /* renamed from: l */
    private final LinkedHashSet<View.OnClickListener> f10827l = new LinkedHashSet<>();

    /* renamed from: m */
    private final LinkedHashSet<DialogInterface.OnCancelListener> f10828m = new LinkedHashSet<>();

    /* renamed from: n */
    private final LinkedHashSet<DialogInterface.OnDismissListener> f10829n = new LinkedHashSet<>();

    /* renamed from: o */
    private int f10830o;

    /* renamed from: p */
    private AbstractC5571d<S> f10831p;

    /* renamed from: q */
    private AbstractC5604p<S> f10832q;

    /* renamed from: r */
    private C5566a f10833r;

    /* renamed from: s */
    private C5576h<S> f10834s;

    /* renamed from: t */
    private int f10835t;

    /* renamed from: u */
    private CharSequence f10836u;

    /* renamed from: v */
    private boolean f10837v;

    /* renamed from: w */
    private int f10838w;

    /* renamed from: x */
    private int f10839x;

    /* renamed from: y */
    private CharSequence f10840y;

    /* renamed from: z */
    private int f10841z;

    /* renamed from: com.google.android.material.datepicker.i$a */
    /* loaded from: classes3.dex */
    class View$OnClickListenerC5589a implements View.OnClickListener {
        View$OnClickListenerC5589a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = C5588i.this.f10826k.iterator();
            while (it.hasNext()) {
                ((AbstractC5594j) it.next()).m28160a(C5588i.this.m28169q());
            }
            C5588i.this.dismiss();
        }
    }

    /* renamed from: com.google.android.material.datepicker.i$b */
    /* loaded from: classes3.dex */
    class View$OnClickListenerC5590b implements View.OnClickListener {
        View$OnClickListenerC5590b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = C5588i.this.f10827l.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            C5588i.this.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.i$c */
    /* loaded from: classes3.dex */
    public class C5591c implements AbstractC2694r0 {

        /* renamed from: a */
        final /* synthetic */ int f10844a;

        /* renamed from: b */
        final /* synthetic */ View f10845b;

        /* renamed from: c */
        final /* synthetic */ int f10846c;

        C5591c(int i, View view, int i2) {
            this.f10844a = i;
            this.f10845b = view;
            this.f10846c = i2;
        }

        @Override // androidx.core.view.AbstractC2694r0
        /* renamed from: a */
        public WindowInsetsCompat mo13081a(View view, WindowInsetsCompat windowInsetsCompat) {
            int i = windowInsetsCompat.m37521f(WindowInsetsCompat.C2542m.m37455g()).f3327b;
            if (this.f10844a >= 0) {
                this.f10845b.getLayoutParams().height = this.f10844a + i;
                View view2 = this.f10845b;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            View view3 = this.f10845b;
            view3.setPadding(view3.getPaddingLeft(), this.f10846c + i, this.f10845b.getPaddingRight(), this.f10845b.getPaddingBottom());
            return windowInsetsCompat;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.i$d */
    /* loaded from: classes3.dex */
    public class C5592d extends AbstractC5603o<S> {
        C5592d() {
        }

        @Override // com.google.android.material.datepicker.AbstractC5603o
        /* renamed from: a */
        public void mo28125a(S s) {
            C5588i.this.m28162x();
            C5588i.this.f37490E.setEnabled(C5588i.this.m28172n().m28222I());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.i$e */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC5593e implements View.OnClickListener {
        View$OnClickListenerC5593e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C5588i.this.f37490E.setEnabled(C5588i.this.m28172n().m28222I());
            C5588i.this.f37488C.toggle();
            C5588i iVar = C5588i.this;
            iVar.m28161y(iVar.f37488C);
            C5588i.this.m28163w();
        }
    }

    /* renamed from: l */
    private static Drawable m28174l(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, C6525a.m25364b(context, C6806e.f14586b));
        stateListDrawable.addState(new int[0], C6525a.m25364b(context, C6806e.f14587c));
        return stateListDrawable;
    }

    /* renamed from: m */
    private void m28173m(Window window) {
        if (!this.f37491F) {
            View findViewById = requireView().findViewById(C6807f.f14597f);
            C5647d.m27876a(window, true, C5665o.m27828c(findViewById), null);
            C2733w0.m37058D0(findViewById, new C5591c(findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingTop()));
            this.f37491F = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public AbstractC5571d<S> m28172n() {
        if (this.f10831p == null) {
            this.f10831p = (AbstractC5571d) getArguments().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f10831p;
    }

    /* renamed from: p */
    private static int m28170p(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C6805d.f37993A);
        int i = C5597l.m28155f().f10857n;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(C6805d.f37995C) * i) + ((i - 1) * resources.getDimensionPixelOffset(C6805d.f37998F));
    }

    /* renamed from: r */
    private int m28168r(Context context) {
        int i = this.f10830o;
        if (i != 0) {
            return i;
        }
        return m28172n().m28219n(context);
    }

    /* renamed from: s */
    private void m28167s(Context context) {
        boolean z;
        this.f37488C.setTag(f37485I);
        this.f37488C.setImageDrawable(m28174l(context));
        CheckableImageButton checkableImageButton = this.f37488C;
        if (this.f10838w != 0) {
            z = true;
        } else {
            z = false;
        }
        checkableImageButton.setChecked(z);
        C2733w0.m36990q0(this.f37488C, null);
        m28161y(this.f37488C);
        this.f37488C.setOnClickListener(new View$OnClickListenerC5593e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public static boolean m28166t(Context context) {
        return m28164v(context, 16843277);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public static boolean m28165u(Context context) {
        return m28164v(context, C6803b.f37981A);
    }

    /* renamed from: v */
    static boolean m28164v(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C13241b.m4243d(context, C6803b.f14547u, C5576h.class.getCanonicalName()), new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public void m28163w() {
        AbstractC5604p<S> pVar;
        int r = m28168r(requireContext());
        this.f10834s = C5576h.m28189v(m28172n(), r, this.f10833r);
        if (this.f37488C.isChecked()) {
            pVar = C5595k.m28159f(m28172n(), r, this.f10833r);
        } else {
            pVar = this.f10834s;
        }
        this.f10832q = pVar;
        m28162x();
        FragmentTransaction m = getChildFragmentManager().m36122m();
        m.m36068n(C6807f.f14613v, this.f10832q);
        m.mo36045i();
        this.f10832q.mo28124d(new C5592d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public void m28162x() {
        String o = m28171o();
        this.f37487B.setContentDescription(String.format(getString(C6810i.f14647i), o));
        this.f37487B.setText(o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public void m28161y(CheckableImageButton checkableImageButton) {
        String str;
        if (this.f37488C.isChecked()) {
            str = checkableImageButton.getContext().getString(C6810i.f14650l);
        } else {
            str = checkableImageButton.getContext().getString(C6810i.f14652n);
        }
        this.f37488C.setContentDescription(str);
    }

    /* renamed from: o */
    public String m28171o() {
        return m28172n().m28218x(getContext());
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f10828m.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f10830o = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f10831p = (AbstractC5571d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f10833r = (C5566a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f10835t = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f10836u = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f10838w = bundle.getInt("INPUT_MODE_KEY");
        this.f10839x = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f10840y = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f10841z = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f37486A = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), m28168r(requireContext()));
        Context context = dialog.getContext();
        this.f10837v = m28166t(context);
        int d = C13241b.m4243d(context, C6803b.f14539m, C5588i.class.getCanonicalName());
        C14038g gVar = new C14038g(context, null, C6803b.f14547u, C6811j.f14673s);
        this.f37489D = gVar;
        gVar.m1991O(context);
        this.f37489D.m1981Y(ColorStateList.valueOf(d));
        this.f37489D.m1982X(C2733w0.m36979w(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        if (this.f10837v) {
            i = C6809h.f14638r;
        } else {
            i = C6809h.f14637q;
        }
        View inflate = layoutInflater.inflate(i, viewGroup);
        Context context = inflate.getContext();
        if (this.f10837v) {
            inflate.findViewById(C6807f.f14613v).setLayoutParams(new LinearLayout.LayoutParams(m28170p(context), -2));
        } else {
            inflate.findViewById(C6807f.f14614w).setLayoutParams(new LinearLayout.LayoutParams(m28170p(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(C6807f.f38017C);
        this.f37487B = textView;
        C2733w0.m36986s0(textView, 1);
        this.f37488C = (CheckableImageButton) inflate.findViewById(C6807f.f38018D);
        TextView textView2 = (TextView) inflate.findViewById(C6807f.f38019E);
        CharSequence charSequence = this.f10836u;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.f10835t);
        }
        m28167s(context);
        this.f37490E = (Button) inflate.findViewById(C6807f.f14594c);
        if (m28172n().m28222I()) {
            this.f37490E.setEnabled(true);
        } else {
            this.f37490E.setEnabled(false);
        }
        this.f37490E.setTag(f37483G);
        CharSequence charSequence2 = this.f10840y;
        if (charSequence2 != null) {
            this.f37490E.setText(charSequence2);
        } else {
            int i2 = this.f10839x;
            if (i2 != 0) {
                this.f37490E.setText(i2);
            }
        }
        this.f37490E.setOnClickListener(new View$OnClickListenerC5589a());
        Button button = (Button) inflate.findViewById(C6807f.f14592a);
        button.setTag(f37484H);
        CharSequence charSequence3 = this.f37486A;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i3 = this.f10841z;
            if (i3 != 0) {
                button.setText(i3);
            }
        }
        button.setOnClickListener(new View$OnClickListenerC5590b());
        return inflate;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f10829n.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f10830o);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f10831p);
        C5566a.C5567b bVar = new C5566a.C5567b(this.f10833r);
        if (this.f10834s.m28194q() != null) {
            bVar.m28228b(this.f10834s.m28194q().f10859p);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.m28229a());
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f10835t);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f10836u);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f10839x);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f10840y);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f10841z);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f37486A);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.f10837v) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f37489D);
            m28173m(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(C6805d.f37997E);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f37489D, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new View$OnTouchListenerC10579a(requireDialog(), rect));
        }
        m28163w();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        this.f10832q.m28123e();
        super.onStop();
    }

    /* renamed from: q */
    public final S m28169q() {
        return m28172n().getSelection();
    }
}
