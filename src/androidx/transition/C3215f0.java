package androidx.transition;

import android.view.View;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.transition.f0 */
/* loaded from: classes.dex */
public class C3215f0 {

    /* renamed from: b */
    public View f5053b;

    /* renamed from: a */
    public final Map<String, Object> f5052a = new HashMap();

    /* renamed from: c */
    final ArrayList<Transition> f5054c = new ArrayList<>();

    @Deprecated
    public C3215f0() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3215f0)) {
            return false;
        }
        C3215f0 f0Var = (C3215f0) obj;
        if (this.f5053b != f0Var.f5053b || !this.f5052a.equals(f0Var.f5052a)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f5053b.hashCode() * 31) + this.f5052a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f5053b + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE) + "    values:";
        for (String str2 : this.f5052a.keySet()) {
            str = str + "    " + str2 + ": " + this.f5052a.get(str2) + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE;
        }
        return str;
    }

    public C3215f0(View view) {
        this.f5053b = view;
    }
}
