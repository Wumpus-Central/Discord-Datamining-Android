package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.VelocityTracker;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.C2733w0;
import androidx.recyclerview.widget.RecyclerView;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.util.List;
import p310r1.C12319b;

/* loaded from: classes.dex */
public class ItemTouchHelper extends RecyclerView.ItemDecoration implements RecyclerView.OnChildAttachStateChangeListener {

    /* renamed from: a */
    final List<View> f4598a;

    /* renamed from: b */
    private final float[] f4599b;

    /* renamed from: c */
    RecyclerView.ViewHolder f4600c;

    /* renamed from: d */
    private float f4601d;

    /* renamed from: e */
    private float f4602e;

    /* renamed from: f */
    float f4603f;

    /* renamed from: g */
    float f4604g;

    /* renamed from: h */
    private float f4605h;

    /* renamed from: i */
    private float f4606i;

    /* renamed from: j */
    int f4607j;

    /* renamed from: k */
    AbstractC3083c f4608k;

    /* renamed from: l */
    private int f4609l;

    /* renamed from: m */
    int f4610m;

    /* renamed from: n */
    List<C3086d> f4611n;

    /* renamed from: o */
    RecyclerView f4612o;

    /* renamed from: p */
    VelocityTracker f4613p;

    /* renamed from: q */
    private RecyclerView.ChildDrawingOrderCallback f4614q;

    /* renamed from: r */
    View f4615r;

    /* renamed from: s */
    int f4616s;

    /* renamed from: t */
    private long f4617t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.ItemTouchHelper$a */
    /* loaded from: classes.dex */
    public class C3081a extends C3086d {

        /* renamed from: o */
        final /* synthetic */ int f4618o;

        /* renamed from: p */
        final /* synthetic */ RecyclerView.ViewHolder f4619p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3081a(RecyclerView.ViewHolder viewHolder, int i, int i2, float f, float f2, float f3, float f4, int i3, RecyclerView.ViewHolder viewHolder2) {
            super(viewHolder, i, i2, f, f2, f3, f4);
            this.f4618o = i3;
            this.f4619p = viewHolder2;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.C3086d, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (!this.f4635l) {
                if (this.f4618o <= 0) {
                    ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
                    itemTouchHelper.f4608k.clearView(itemTouchHelper.f4612o, this.f4619p);
                } else {
                    ItemTouchHelper.this.f4598a.add(this.f4619p.itemView);
                    this.f4632i = true;
                    int i = this.f4618o;
                    if (i > 0) {
                        ItemTouchHelper.this.m35602a(this, i);
                    }
                }
                ItemTouchHelper itemTouchHelper2 = ItemTouchHelper.this;
                View view = itemTouchHelper2.f4615r;
                View view2 = this.f4619p.itemView;
                if (view == view2) {
                    itemTouchHelper2.removeChildDrawingOrderCallbackIfNecessary(view2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.ItemTouchHelper$b */
    /* loaded from: classes.dex */
    public class RunnableC3082b implements Runnable {

        /* renamed from: k */
        final /* synthetic */ C3086d f4621k;

        /* renamed from: l */
        final /* synthetic */ int f4622l;

        RunnableC3082b(C3086d dVar, int i) {
            this.f4621k = dVar;
            this.f4622l = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = ItemTouchHelper.this.f4612o;
            if (recyclerView != null && recyclerView.isAttachedToWindow()) {
                C3086d dVar = this.f4621k;
                if (!dVar.f4635l && dVar.f4628e.getAbsoluteAdapterPosition() != -1) {
                    RecyclerView.ItemAnimator itemAnimator = ItemTouchHelper.this.f4612o.getItemAnimator();
                    if ((itemAnimator == null || !itemAnimator.isRunning(null)) && !ItemTouchHelper.this.hasRunningRecoverAnim()) {
                        ItemTouchHelper.this.f4608k.onSwiped(this.f4621k.f4628e, this.f4622l);
                    } else {
                        ItemTouchHelper.this.f4612o.post(this);
                    }
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.ItemTouchHelper$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC3083c {
        private static final int ABS_HORIZONTAL_DIR_FLAGS = 789516;
        public static final int DEFAULT_DRAG_ANIMATION_DURATION = 200;
        public static final int DEFAULT_SWIPE_ANIMATION_DURATION = 250;
        private static final long DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS = 2000;
        static final int RELATIVE_DIR_FLAGS = 3158064;
        private static final Interpolator sDragScrollInterpolator = new animationInterpolatorC3084a();
        private static final Interpolator sDragViewScrollCapInterpolator = new animationInterpolatorC3085b();
        private int mCachedMaxScrollSpeed = -1;

        /* renamed from: androidx.recyclerview.widget.ItemTouchHelper$c$a  reason: invalid class name */
        /* loaded from: classes.dex */
        class animationInterpolatorC3084a implements Interpolator {
            animationInterpolatorC3084a() {
            }

            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                return f * f * f * f * f;
            }
        }

        /* renamed from: androidx.recyclerview.widget.ItemTouchHelper$c$b  reason: invalid class name */
        /* loaded from: classes.dex */
        class animationInterpolatorC3085b implements Interpolator {
            animationInterpolatorC3085b() {
            }

            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        }

        public static int convertToRelativeDirection(int i, int i2) {
            int i3;
            int i4 = i & ABS_HORIZONTAL_DIR_FLAGS;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 << 2;
            } else {
                int i6 = i4 << 1;
                i5 |= (-789517) & i6;
                i3 = (i6 & ABS_HORIZONTAL_DIR_FLAGS) << 2;
            }
            return i5 | i3;
        }

        public static ItemTouchUIUtil getDefaultUIUtil() {
            return C3134e.f4857a;
        }

        private int getMaxDragScroll(RecyclerView recyclerView) {
            if (this.mCachedMaxScrollSpeed == -1) {
                this.mCachedMaxScrollSpeed = recyclerView.getResources().getDimensionPixelSize(C12319b.f27668d);
            }
            return this.mCachedMaxScrollSpeed;
        }

        public static int makeFlag(int i, int i2) {
            return i2 << (i * 8);
        }

        public static int makeMovementFlags(int i, int i2) {
            int makeFlag = makeFlag(0, i2 | i);
            return makeFlag(2, i) | makeFlag(1, i2) | makeFlag;
        }

        public boolean canDropOver(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            return true;
        }

        public RecyclerView.ViewHolder chooseDropTarget(RecyclerView.ViewHolder viewHolder, List<RecyclerView.ViewHolder> list, int i, int i2) {
            int bottom;
            int abs;
            int top;
            int abs2;
            int left;
            int abs3;
            int right;
            int abs4;
            int width = i + viewHolder.itemView.getWidth();
            int height = i2 + viewHolder.itemView.getHeight();
            int left2 = i - viewHolder.itemView.getLeft();
            int top2 = i2 - viewHolder.itemView.getTop();
            int size = list.size();
            RecyclerView.ViewHolder viewHolder2 = null;
            int i3 = -1;
            for (int i4 = 0; i4 < size; i4++) {
                RecyclerView.ViewHolder viewHolder3 = list.get(i4);
                if (left2 > 0 && (right = viewHolder3.itemView.getRight() - width) < 0 && viewHolder3.itemView.getRight() > viewHolder.itemView.getRight() && (abs4 = Math.abs(right)) > i3) {
                    viewHolder2 = viewHolder3;
                    i3 = abs4;
                }
                if (left2 < 0 && (left = viewHolder3.itemView.getLeft() - i) > 0 && viewHolder3.itemView.getLeft() < viewHolder.itemView.getLeft() && (abs3 = Math.abs(left)) > i3) {
                    viewHolder2 = viewHolder3;
                    i3 = abs3;
                }
                if (top2 < 0 && (top = viewHolder3.itemView.getTop() - i2) > 0 && viewHolder3.itemView.getTop() < viewHolder.itemView.getTop() && (abs2 = Math.abs(top)) > i3) {
                    viewHolder2 = viewHolder3;
                    i3 = abs2;
                }
                if (top2 > 0 && (bottom = viewHolder3.itemView.getBottom() - height) < 0 && viewHolder3.itemView.getBottom() > viewHolder.itemView.getBottom() && (abs = Math.abs(bottom)) > i3) {
                    viewHolder2 = viewHolder3;
                    i3 = abs;
                }
            }
            return viewHolder2;
        }

        public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            C3134e.f4857a.mo35129a(viewHolder.itemView);
        }

        public int convertToAbsoluteDirection(int i, int i2) {
            int i3;
            int i4 = i & RELATIVE_DIR_FLAGS;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 >> 2;
            } else {
                int i6 = i4 >> 1;
                i5 |= (-3158065) & i6;
                i3 = (i6 & RELATIVE_DIR_FLAGS) >> 2;
            }
            return i5 | i3;
        }

        final int getAbsoluteMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            return convertToAbsoluteDirection(getMovementFlags(recyclerView, viewHolder), C2733w0.m37063B(recyclerView));
        }

        public long getAnimationDuration(RecyclerView recyclerView, int i, float f, float f2) {
            RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator == null) {
                if (i == 8) {
                    return 200L;
                }
                return 250L;
            } else if (i == 8) {
                return itemAnimator.getMoveDuration();
            } else {
                return itemAnimator.getRemoveDuration();
            }
        }

        public int getBoundingBoxMargin() {
            return 0;
        }

        public float getMoveThreshold(RecyclerView.ViewHolder viewHolder) {
            return 0.5f;
        }

        public abstract int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder);

        public float getSwipeEscapeVelocity(float f) {
            return f;
        }

        public float getSwipeThreshold(RecyclerView.ViewHolder viewHolder) {
            return 0.5f;
        }

        public float getSwipeVelocityThreshold(float f) {
            return f;
        }

        boolean hasDragFlag(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            return (getAbsoluteMovementFlags(recyclerView, viewHolder) & 16711680) != 0;
        }

        boolean hasSwipeFlag(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            return (getAbsoluteMovementFlags(recyclerView, viewHolder) & 65280) != 0;
        }

        public int interpolateOutOfBoundsScroll(RecyclerView recyclerView, int i, int i2, int i3, long j) {
            float f = 1.0f;
            int signum = (int) (((int) Math.signum(i2)) * getMaxDragScroll(recyclerView) * sDragViewScrollCapInterpolator.getInterpolation(Math.min(1.0f, (Math.abs(i2) * 1.0f) / i)));
            if (j <= DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS) {
                f = ((float) j) / 2000.0f;
            }
            int interpolation = (int) (signum * sDragScrollInterpolator.getInterpolation(f));
            if (interpolation != 0) {
                return interpolation;
            }
            if (i2 > 0) {
                return 1;
            }
            return -1;
        }

        public boolean isItemViewSwipeEnabled() {
            return true;
        }

        public boolean isLongPressDragEnabled() {
            return true;
        }

        public void onChildDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
            C3134e.f4857a.mo35127c(canvas, recyclerView, viewHolder.itemView, f, f2, i, z);
        }

        public void onChildDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
            C3134e.f4857a.mo35126d(canvas, recyclerView, viewHolder.itemView, f, f2, i, z);
        }

        void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, List<C3086d> list, int i, float f, float f2) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C3086d dVar = list.get(i2);
                dVar.m35597e();
                int save = canvas.save();
                onChildDraw(canvas, recyclerView, dVar.f4628e, dVar.f4633j, dVar.f4634k, dVar.f4629f, false);
                canvas.restoreToCount(save);
            }
            if (viewHolder != null) {
                int save2 = canvas.save();
                onChildDraw(canvas, recyclerView, viewHolder, f, f2, i, true);
                canvas.restoreToCount(save2);
            }
        }

        void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, List<C3086d> list, int i, float f, float f2) {
            int size = list.size();
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                C3086d dVar = list.get(i2);
                int save = canvas.save();
                onChildDrawOver(canvas, recyclerView, dVar.f4628e, dVar.f4633j, dVar.f4634k, dVar.f4629f, false);
                canvas.restoreToCount(save);
            }
            if (viewHolder != null) {
                int save2 = canvas.save();
                onChildDrawOver(canvas, recyclerView, viewHolder, f, f2, i, true);
                canvas.restoreToCount(save2);
            }
            for (int i3 = size - 1; i3 >= 0; i3--) {
                C3086d dVar2 = list.get(i3);
                boolean z2 = dVar2.f4636m;
                if (z2 && !dVar2.f4632i) {
                    list.remove(i3);
                } else if (!z2) {
                    z = true;
                }
            }
            if (z) {
                recyclerView.invalidate();
            }
        }

        public abstract boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2);

        public void onMoved(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, int i, RecyclerView.ViewHolder viewHolder2, int i2, int i3, int i4) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof AbstractC3088e) {
                ((AbstractC3088e) layoutManager).mo35567d(viewHolder.itemView, viewHolder2.itemView, i3, i4);
                return;
            }
            if (layoutManager.mo29358v()) {
                if (layoutManager.m35466b0(viewHolder2.itemView) <= recyclerView.getPaddingLeft()) {
                    recyclerView.scrollToPosition(i2);
                }
                if (layoutManager.m35463e0(viewHolder2.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.scrollToPosition(i2);
                }
            }
            if (layoutManager.mo29356w()) {
                if (layoutManager.m35462f0(viewHolder2.itemView) <= recyclerView.getPaddingTop()) {
                    recyclerView.scrollToPosition(i2);
                }
                if (layoutManager.m35468Z(viewHolder2.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.scrollToPosition(i2);
                }
            }
        }

        public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i) {
            if (viewHolder != null) {
                C3134e.f4857a.mo35128b(viewHolder.itemView);
            }
        }

        public abstract void onSwiped(RecyclerView.ViewHolder viewHolder, int i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.ItemTouchHelper$d */
    /* loaded from: classes.dex */
    public static class C3086d implements Animator.AnimatorListener {

        /* renamed from: a */
        final float f4624a;

        /* renamed from: b */
        final float f4625b;

        /* renamed from: c */
        final float f4626c;

        /* renamed from: d */
        final float f4627d;

        /* renamed from: e */
        final RecyclerView.ViewHolder f4628e;

        /* renamed from: f */
        final int f4629f;

        /* renamed from: g */
        final ValueAnimator f4630g;

        /* renamed from: h */
        final int f4631h;

        /* renamed from: i */
        boolean f4632i;

        /* renamed from: j */
        float f4633j;

        /* renamed from: k */
        float f4634k;

        /* renamed from: l */
        boolean f4635l = false;

        /* renamed from: m */
        boolean f4636m = false;

        /* renamed from: n */
        private float f4637n;

        /* renamed from: androidx.recyclerview.widget.ItemTouchHelper$d$a */
        /* loaded from: classes.dex */
        class C3087a implements ValueAnimator.AnimatorUpdateListener {
            C3087a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C3086d.this.m35599c(valueAnimator.getAnimatedFraction());
            }
        }

        C3086d(RecyclerView.ViewHolder viewHolder, int i, int i2, float f, float f2, float f3, float f4) {
            this.f4629f = i2;
            this.f4631h = i;
            this.f4628e = viewHolder;
            this.f4624a = f;
            this.f4625b = f2;
            this.f4626c = f3;
            this.f4627d = f4;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f4630g = ofFloat;
            ofFloat.addUpdateListener(new C3087a());
            ofFloat.setTarget(viewHolder.itemView);
            ofFloat.addListener(this);
            m35599c(0.0f);
        }

        /* renamed from: a */
        public void m35601a() {
            this.f4630g.cancel();
        }

        /* renamed from: b */
        public void m35600b(long j) {
            this.f4630g.setDuration(j);
        }

        /* renamed from: c */
        public void m35599c(float f) {
            this.f4637n = f;
        }

        /* renamed from: d */
        public void m35598d() {
            this.f4628e.setIsRecyclable(false);
            this.f4630g.start();
        }

        /* renamed from: e */
        public void m35597e() {
            float f = this.f4624a;
            float f2 = this.f4626c;
            if (f == f2) {
                this.f4633j = this.f4628e.itemView.getTranslationX();
            } else {
                this.f4633j = f + (this.f4637n * (f2 - f));
            }
            float f3 = this.f4625b;
            float f4 = this.f4627d;
            if (f3 == f4) {
                this.f4634k = this.f4628e.itemView.getTranslationY();
            } else {
                this.f4634k = f3 + (this.f4637n * (f4 - f3));
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            m35599c(1.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f4636m) {
                this.f4628e.setIsRecyclable(true);
            }
            this.f4636m = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.ItemTouchHelper$e */
    /* loaded from: classes.dex */
    public interface AbstractC3088e {
        /* renamed from: d */
        void mo35567d(View view, View view2, int i, int i2);
    }

    private void addChildDrawingOrderCallback() {
    }

    private int checkHorizontalSwipe(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        if ((i & 12) == 0) {
            return 0;
        }
        int i3 = 8;
        if (this.f4603f > 0.0f) {
            i2 = 8;
        } else {
            i2 = 4;
        }
        VelocityTracker velocityTracker = this.f4613p;
        if (velocityTracker != null && this.f4607j > -1) {
            velocityTracker.computeCurrentVelocity(RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, this.f4608k.getSwipeVelocityThreshold(this.f4602e));
            float xVelocity = this.f4613p.getXVelocity(this.f4607j);
            float yVelocity = this.f4613p.getYVelocity(this.f4607j);
            if (xVelocity <= 0.0f) {
                i3 = 4;
            }
            float abs = Math.abs(xVelocity);
            if ((i3 & i) != 0 && i2 == i3 && abs >= this.f4608k.getSwipeEscapeVelocity(this.f4601d) && abs > Math.abs(yVelocity)) {
                return i3;
            }
        }
        float width = this.f4612o.getWidth() * this.f4608k.getSwipeThreshold(viewHolder);
        if ((i & i2) == 0 || Math.abs(this.f4603f) <= width) {
            return 0;
        }
        return i2;
    }

    private int checkVerticalSwipe(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        if ((i & 3) == 0) {
            return 0;
        }
        int i3 = 2;
        if (this.f4604g > 0.0f) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        VelocityTracker velocityTracker = this.f4613p;
        if (velocityTracker != null && this.f4607j > -1) {
            velocityTracker.computeCurrentVelocity(RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, this.f4608k.getSwipeVelocityThreshold(this.f4602e));
            float xVelocity = this.f4613p.getXVelocity(this.f4607j);
            float yVelocity = this.f4613p.getYVelocity(this.f4607j);
            if (yVelocity <= 0.0f) {
                i3 = 1;
            }
            float abs = Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i2 && abs >= this.f4608k.getSwipeEscapeVelocity(this.f4601d) && abs > Math.abs(xVelocity)) {
                return i3;
            }
        }
        float height = this.f4612o.getHeight() * this.f4608k.getSwipeThreshold(viewHolder);
        if ((i & i2) == 0 || Math.abs(this.f4604g) <= height) {
            return 0;
        }
        return i2;
    }

    private void getSelectedDxDy(float[] fArr) {
        if ((this.f4610m & 12) != 0) {
            fArr[0] = (this.f4605h + this.f4603f) - this.f4600c.itemView.getLeft();
        } else {
            fArr[0] = this.f4600c.itemView.getTranslationX();
        }
        if ((this.f4610m & 3) != 0) {
            fArr[1] = (this.f4606i + this.f4604g) - this.f4600c.itemView.getTop();
        } else {
            fArr[1] = this.f4600c.itemView.getTranslationY();
        }
    }

    private void releaseVelocityTracker() {
        VelocityTracker velocityTracker = this.f4613p;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f4613p = null;
        }
    }

    private int swipeIfNecessary(RecyclerView.ViewHolder viewHolder) {
        if (this.f4609l == 2) {
            return 0;
        }
        int movementFlags = this.f4608k.getMovementFlags(this.f4612o, viewHolder);
        int convertToAbsoluteDirection = (this.f4608k.convertToAbsoluteDirection(movementFlags, C2733w0.m37063B(this.f4612o)) & 65280) >> 8;
        if (convertToAbsoluteDirection == 0) {
            return 0;
        }
        int i = (movementFlags & 65280) >> 8;
        if (Math.abs(this.f4603f) > Math.abs(this.f4604g)) {
            int checkHorizontalSwipe = checkHorizontalSwipe(viewHolder, convertToAbsoluteDirection);
            if (checkHorizontalSwipe <= 0) {
                int checkVerticalSwipe = checkVerticalSwipe(viewHolder, convertToAbsoluteDirection);
                if (checkVerticalSwipe > 0) {
                    return checkVerticalSwipe;
                }
            } else if ((i & checkHorizontalSwipe) == 0) {
                return AbstractC3083c.convertToRelativeDirection(checkHorizontalSwipe, C2733w0.m37063B(this.f4612o));
            } else {
                return checkHorizontalSwipe;
            }
        } else {
            int checkVerticalSwipe2 = checkVerticalSwipe(viewHolder, convertToAbsoluteDirection);
            if (checkVerticalSwipe2 > 0) {
                return checkVerticalSwipe2;
            }
            int checkHorizontalSwipe2 = checkHorizontalSwipe(viewHolder, convertToAbsoluteDirection);
            if (checkHorizontalSwipe2 > 0) {
                if ((i & checkHorizontalSwipe2) == 0) {
                    return AbstractC3083c.convertToRelativeDirection(checkHorizontalSwipe2, C2733w0.m37063B(this.f4612o));
                }
                return checkHorizontalSwipe2;
            }
        }
        return 0;
    }

    /* renamed from: a */
    void m35602a(C3086d dVar, int i) {
        this.f4612o.post(new RunnableC3082b(dVar, i));
    }

    void endRecoverAnimation(RecyclerView.ViewHolder viewHolder, boolean z) {
        for (int size = this.f4611n.size() - 1; size >= 0; size--) {
            C3086d dVar = this.f4611n.get(size);
            if (dVar.f4628e == viewHolder) {
                dVar.f4635l |= z;
                if (!dVar.f4636m) {
                    dVar.m35601a();
                }
                this.f4611n.remove(size);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        rect.setEmpty();
    }

    boolean hasRunningRecoverAnim() {
        int size = this.f4611n.size();
        for (int i = 0; i < size; i++) {
            if (!this.f4611n.get(i).f4636m) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public void onChildViewAttachedToWindow(View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public void onChildViewDetachedFromWindow(View view) {
        removeChildDrawingOrderCallbackIfNecessary(view);
        RecyclerView.ViewHolder childViewHolder = this.f4612o.getChildViewHolder(view);
        if (childViewHolder != null) {
            RecyclerView.ViewHolder viewHolder = this.f4600c;
            if (viewHolder == null || childViewHolder != viewHolder) {
                endRecoverAnimation(childViewHolder, false);
                if (this.f4598a.remove(childViewHolder.itemView)) {
                    this.f4608k.clearView(this.f4612o, childViewHolder);
                    return;
                }
                return;
            }
            select(null, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        float f;
        float f2;
        this.f4616s = -1;
        if (this.f4600c != null) {
            getSelectedDxDy(this.f4599b);
            float[] fArr = this.f4599b;
            float f3 = fArr[0];
            f = fArr[1];
            f2 = f3;
        } else {
            f2 = 0.0f;
            f = 0.0f;
        }
        this.f4608k.onDraw(canvas, recyclerView, this.f4600c, this.f4611n, this.f4609l, f2, f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        float f;
        float f2;
        if (this.f4600c != null) {
            getSelectedDxDy(this.f4599b);
            float[] fArr = this.f4599b;
            float f3 = fArr[0];
            f = fArr[1];
            f2 = f3;
        } else {
            f2 = 0.0f;
            f = 0.0f;
        }
        this.f4608k.onDrawOver(canvas, recyclerView, this.f4600c, this.f4611n, this.f4609l, f2, f);
    }

    void removeChildDrawingOrderCallbackIfNecessary(View view) {
        if (view == this.f4615r) {
            this.f4615r = null;
            if (this.f4614q != null) {
                this.f4612o.setChildDrawingOrderCallback(null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void select(androidx.recyclerview.widget.RecyclerView.ViewHolder r24, int r25) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.ItemTouchHelper.select(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }
}
