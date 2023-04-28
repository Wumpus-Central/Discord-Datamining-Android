package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p052d.C6379a;

/* renamed from: androidx.appcompat.widget.v */
/* loaded from: classes.dex */
public class C1732v extends SeekBar {
    private final AppCompatSeekBarHelper mAppCompatSeekBarHelper;

    public C1732v(Context context) {
        this(context, null);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.mAppCompatSeekBarHelper.m40473h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.mAppCompatSeekBarHelper.m40472i();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.mAppCompatSeekBarHelper.m40474g(canvas);
    }

    public C1732v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6379a.f37744J);
    }

    public C1732v(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C1682i1.m40169a(this, getContext());
        AppCompatSeekBarHelper appCompatSeekBarHelper = new AppCompatSeekBarHelper(this);
        this.mAppCompatSeekBarHelper = appCompatSeekBarHelper;
        appCompatSeekBarHelper.mo40062c(attributeSet, i);
    }
}
