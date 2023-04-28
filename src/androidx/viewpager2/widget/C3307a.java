package androidx.viewpager2.widget;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.viewpager2.widget.a */
/* loaded from: classes.dex */
public final class C3307a {

    /* renamed from: b */
    private static final ViewGroup.MarginLayoutParams f5290b;

    /* renamed from: a */
    private LinearLayoutManager f5291a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager2.widget.a$a */
    /* loaded from: classes.dex */
    public class C0070a implements Comparator<int[]> {
        C0070a() {
        }

        /* renamed from: b */
        public int compare(int[] iArr, int[] iArr2) {
            return iArr[0] - iArr2[0];
        }
    }

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f5290b = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3307a(LinearLayoutManager linearLayoutManager) {
        this.f5291a = linearLayoutManager;
    }

    /* renamed from: a */
    private boolean m34704a() {
        boolean z;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        int i2;
        int i3;
        int i4;
        int U = this.f5291a.m35477U();
        if (U == 0) {
            return true;
        }
        if (this.f5291a.m35547w2() == 0) {
            z = true;
        } else {
            z = false;
        }
        int[][] iArr = (int[][]) Array.newInstance(Integer.TYPE, U, 2);
        for (int i5 = 0; i5 < U; i5++) {
            View T = this.f5291a.m35480T(i5);
            if (T != null) {
                ViewGroup.LayoutParams layoutParams = T.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                } else {
                    marginLayoutParams = f5290b;
                }
                int[] iArr2 = iArr[i5];
                if (z) {
                    i2 = T.getLeft();
                    i = marginLayoutParams.leftMargin;
                } else {
                    i2 = T.getTop();
                    i = marginLayoutParams.topMargin;
                }
                iArr2[0] = i2 - i;
                int[] iArr3 = iArr[i5];
                if (z) {
                    i4 = T.getRight();
                    i3 = marginLayoutParams.rightMargin;
                } else {
                    i4 = T.getBottom();
                    i3 = marginLayoutParams.bottomMargin;
                }
                iArr3[1] = i4 + i3;
            } else {
                throw new IllegalStateException("null view contained in the view hierarchy");
            }
        }
        Arrays.sort(iArr, new C0070a());
        for (int i6 = 1; i6 < U; i6++) {
            if (iArr[i6 - 1][1] != iArr[i6][0]) {
                return false;
            }
        }
        int[] iArr4 = iArr[0];
        int i7 = iArr4[1];
        int i8 = iArr4[0];
        int i9 = i7 - i8;
        if (i8 > 0 || iArr[U - 1][1] < i9) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private boolean m34703b() {
        int U = this.f5291a.m35477U();
        for (int i = 0; i < U; i++) {
            if (m34702c(this.f5291a.m35480T(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m34702c(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (m34702c(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m34701d() {
        if ((!m34704a() || this.f5291a.m35477U() <= 1) && m34703b()) {
            return true;
        }
        return false;
    }
}
