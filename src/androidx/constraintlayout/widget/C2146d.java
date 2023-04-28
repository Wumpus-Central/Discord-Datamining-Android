package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: androidx.constraintlayout.widget.d */
/* loaded from: classes.dex */
public class C2146d extends View {

    /* renamed from: k */
    private int f2808k;

    /* renamed from: l */
    private View f2809l;

    /* renamed from: m */
    private int f2810m;

    /* renamed from: a */
    public void m38748a(ConstraintLayout constraintLayout) {
        if (this.f2809l != null) {
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) this.f2809l.getLayoutParams();
            layoutParams2.f2656n0.m38949A0(0);
            ConstraintWidget.EnumC2121b w = layoutParams.f2656n0.m38883w();
            ConstraintWidget.EnumC2121b bVar = ConstraintWidget.EnumC2121b.FIXED;
            if (w != bVar) {
                layoutParams.f2656n0.m38947B0(layoutParams2.f2656n0.m38932N());
            }
            if (layoutParams.f2656n0.m38935K() != bVar) {
                layoutParams.f2656n0.m38915e0(layoutParams2.f2656n0.m38889t());
            }
            layoutParams2.f2656n0.m38949A0(8);
        }
    }

    /* renamed from: b */
    public void m38747b(ConstraintLayout constraintLayout) {
        if (this.f2808k == -1 && !isInEditMode()) {
            setVisibility(this.f2810m);
        }
        View findViewById = constraintLayout.findViewById(this.f2808k);
        this.f2809l = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.LayoutParams) findViewById.getLayoutParams()).f2632b0 = true;
            this.f2809l.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f2809l;
    }

    public int getEmptyVisibility() {
        return this.f2810m;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((width / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((height / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i) {
        View findViewById;
        if (this.f2808k != i) {
            View view = this.f2809l;
            if (view != null) {
                view.setVisibility(0);
                ((ConstraintLayout.LayoutParams) this.f2809l.getLayoutParams()).f2632b0 = false;
                this.f2809l = null;
            }
            this.f2808k = i;
            if (i != -1 && (findViewById = ((View) getParent()).findViewById(i)) != null) {
                findViewById.setVisibility(8);
            }
        }
    }

    public void setEmptyVisibility(int i) {
        this.f2810m = i;
    }
}
