package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.p018os.C2458t;
import androidx.core.util.C2517g;
import androidx.core.view.AbstractC2679o0;
import androidx.core.view.C2549a;
import androidx.core.view.C2632g2;
import androidx.core.view.C2672n0;
import androidx.core.view.C2733w0;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.ScrollingView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.C2572b;
import androidx.recyclerview.widget.AdapterHelper;
import androidx.recyclerview.widget.C3149o;
import androidx.recyclerview.widget.ChildHelper;
import androidx.recyclerview.widget.GapWorker;
import androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate;
import androidx.recyclerview.widget.ViewInfoStore;
import com.facebook.react.uimanager.ViewDefaults;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p125h1.AbstractC7736a;
import p163j$.util.Spliterator;
import p310r1.C12318a;
import p310r1.C12319b;
import p310r1.C12321d;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements ScrollingView, AbstractC2679o0 {
    static final boolean DEBUG = false;
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    static final int MAX_SCROLL_DURATION = 2000;
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    RecyclerViewAccessibilityDelegate mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    Adapter mAdapter;
    AdapterHelper mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private ChildDrawingOrderCallback mChildDrawingOrderCallback;
    ChildHelper mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    private EdgeEffectFactory mEdgeEffectFactory;
    boolean mEnableFastScroller;
    boolean mFirstLayoutComplete;
    GapWorker mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private OnItemTouchListener mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    ItemAnimator mItemAnimator;
    private ItemAnimator.ItemAnimatorListener mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<ItemDecoration> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastAutoMeasureNonExactMeasuredHeight;
    private int mLastAutoMeasureNonExactMeasuredWidth;
    private boolean mLastAutoMeasureSkippedDueToExact;
    private int mLastTouchX;
    private int mLastTouchY;
    LayoutManager mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final RecyclerViewDataObserver mObserver;
    private List<OnChildAttachStateChangeListener> mOnChildAttachStateListeners;
    private OnFlingListener mOnFlingListener;
    private final ArrayList<OnItemTouchListener> mOnItemTouchListeners;
    final List<ViewHolder> mPendingAccessibilityImportanceChange;
    SavedState mPendingSavedState;
    boolean mPostedAnimatorRunner;
    GapWorker.LayoutPrefetchRegistryImpl mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final Recycler mRecycler;
    RecyclerListener mRecyclerListener;
    final List<RecyclerListener> mRecyclerListeners;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private OnScrollListener mScrollListener;
    private List<OnScrollListener> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private NestedScrollingChildHelper mScrollingChildHelper;
    final State mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final ViewFlinger mViewFlinger;
    private final ViewInfoStore.ProcessCallback mViewInfoProcessCallback;
    final ViewInfoStore mViewInfoStore;
    private static final int[] NESTED_SCROLLING_ATTRS = {16843830};
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = true;
    static final boolean POST_UPDATES_ON_ANIMATION = true;
    static final boolean ALLOW_THREAD_GAP_WORK = true;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = false;
    static final Interpolator sQuinticInterpolator = new animationInterpolatorC3103c();

    /* loaded from: classes.dex */
    public static abstract class Adapter<VH extends ViewHolder> {
        private final AdapterDataObservable mObservable = new AdapterDataObservable();
        private boolean mHasStableIds = false;
        private StateRestorationPolicy mStateRestorationPolicy = StateRestorationPolicy.ALLOW;

        /* loaded from: classes.dex */
        public enum StateRestorationPolicy {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public final void bindViewHolder(VH vh, int i) {
            boolean z;
            if (vh.mBindingAdapter == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                vh.mPosition = i;
                if (hasStableIds()) {
                    vh.mItemId = getItemId(i);
                }
                vh.setFlags(1, 519);
                C2458t.m37717a(RecyclerView.TRACE_BIND_VIEW_TAG);
            }
            vh.mBindingAdapter = this;
            onBindViewHolder(vh, i, vh.getUnmodifiedPayloads());
            if (z) {
                vh.clearPayload();
                ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
                if (layoutParams instanceof C3109i) {
                    ((C3109i) layoutParams).f4751m = true;
                }
                C2458t.m37716b();
            }
        }

        boolean canRestoreState() {
            int i = C3107g.f4747a[this.mStateRestorationPolicy.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i == 2 && getItemCount() <= 0) {
                return false;
            }
            return true;
        }

        public final VH createViewHolder(ViewGroup viewGroup, int i) {
            try {
                C2458t.m37717a(RecyclerView.TRACE_CREATE_VIEW_TAG);
                VH onCreateViewHolder = onCreateViewHolder(viewGroup, i);
                if (onCreateViewHolder.itemView.getParent() == null) {
                    onCreateViewHolder.mItemViewType = i;
                    return onCreateViewHolder;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                C2458t.m37716b();
            }
        }

        public int findRelativeAdapterPositionIn(Adapter<? extends ViewHolder> adapter, ViewHolder viewHolder, int i) {
            if (adapter == this) {
                return i;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i) {
            return -1L;
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public final StateRestorationPolicy getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        public final boolean hasObservers() {
            return this.mObservable.m35527a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.m35526b();
        }

        public final void notifyItemChanged(int i) {
            this.mObservable.m35524d(i, 1);
        }

        public final void notifyItemInserted(int i) {
            this.mObservable.m35522f(i, 1);
        }

        public final void notifyItemMoved(int i, int i2) {
            this.mObservable.m35525c(i, i2);
        }

        public final void notifyItemRangeChanged(int i, int i2) {
            this.mObservable.m35524d(i, i2);
        }

        public final void notifyItemRangeInserted(int i, int i2) {
            this.mObservable.m35522f(i, i2);
        }

        public final void notifyItemRangeRemoved(int i, int i2) {
            this.mObservable.m35521g(i, i2);
        }

        public final void notifyItemRemoved(int i) {
            this.mObservable.m35521g(i, 1);
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(VH vh, int i);

        public void onBindViewHolder(VH vh, int i, List<Object> list) {
            onBindViewHolder(vh, i);
        }

        public abstract VH onCreateViewHolder(ViewGroup viewGroup, int i);

        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(VH vh) {
            return false;
        }

        public void onViewAttachedToWindow(VH vh) {
        }

        public void onViewDetachedFromWindow(VH vh) {
        }

        public void onViewRecycled(VH vh) {
        }

        public void registerAdapterDataObserver(AdapterDataObserver adapterDataObserver) {
            this.mObservable.registerObserver(adapterDataObserver);
        }

        public void setHasStableIds(boolean z) {
            if (!hasObservers()) {
                this.mHasStableIds = z;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        public void setStateRestorationPolicy(StateRestorationPolicy stateRestorationPolicy) {
            this.mStateRestorationPolicy = stateRestorationPolicy;
            this.mObservable.m35520h();
        }

        public void unregisterAdapterDataObserver(AdapterDataObserver adapterDataObserver) {
            this.mObservable.unregisterObserver(adapterDataObserver);
        }

        public final void notifyItemChanged(int i, Object obj) {
            this.mObservable.m35523e(i, 1, obj);
        }

        public final void notifyItemRangeChanged(int i, int i2, Object obj) {
            this.mObservable.m35523e(i, i2, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class AdapterDataObservable extends Observable<AdapterDataObserver> {
        AdapterDataObservable() {
        }

        /* renamed from: a */
        public boolean m35527a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        /* renamed from: b */
        public void m35526b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).mo34633a();
            }
        }

        /* renamed from: c */
        public void m35525c(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).mo34656e(i, i2, 1);
            }
        }

        /* renamed from: d */
        public void m35524d(int i, int i2) {
            m35523e(i, i2, null);
        }

        /* renamed from: e */
        public void m35523e(int i, int i2, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).mo34658c(i, i2, obj);
            }
        }

        /* renamed from: f */
        public void m35522f(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).mo34657d(i, i2);
            }
        }

        /* renamed from: g */
        public void m35521g(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).mo34655f(i, i2);
            }
        }

        /* renamed from: h */
        public void m35520h() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).mo35364g();
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class AdapterDataObserver {
        /* renamed from: a */
        public void mo34633a() {
        }

        /* renamed from: b */
        public void mo34659b(int i, int i2) {
        }

        /* renamed from: c */
        public void mo34658c(int i, int i2, Object obj) {
            mo34659b(i, i2);
        }

        /* renamed from: d */
        public void mo34657d(int i, int i2) {
        }

        /* renamed from: e */
        public void mo34656e(int i, int i2, int i3) {
        }

        /* renamed from: f */
        public void mo34655f(int i, int i2) {
        }

        /* renamed from: g */
        public void mo35364g() {
        }
    }

    /* loaded from: classes.dex */
    public interface ChildDrawingOrderCallback {
        int onGetChildDrawingOrder(int i, int i2);
    }

    /* loaded from: classes.dex */
    public static class EdgeEffectFactory {
        /* renamed from: a */
        protected EdgeEffect m35519a(RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* loaded from: classes.dex */
    public static abstract class ItemAnimator {
        public static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        public static final int FLAG_CHANGED = 2;
        public static final int FLAG_INVALIDATED = 4;
        public static final int FLAG_MOVED = 2048;
        public static final int FLAG_REMOVED = 8;
        private ItemAnimatorListener mListener = null;
        private ArrayList<ItemAnimatorFinishedListener> mFinishedListeners = new ArrayList<>();
        private long mAddDuration = 120;
        private long mRemoveDuration = 120;
        private long mMoveDuration = 250;
        private long mChangeDuration = 250;

        /* loaded from: classes.dex */
        public interface ItemAnimatorFinishedListener {
            /* renamed from: a */
            void m35518a();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public interface ItemAnimatorListener {
            /* renamed from: a */
            void mo35321a(ViewHolder viewHolder);
        }

        /* loaded from: classes.dex */
        public static class ItemHolderInfo {

            /* renamed from: a */
            public int f4668a;

            /* renamed from: b */
            public int f4669b;

            /* renamed from: c */
            public int f4670c;

            /* renamed from: d */
            public int f4671d;

            /* renamed from: a */
            public ItemHolderInfo m35517a(ViewHolder viewHolder) {
                return m35516b(viewHolder, 0);
            }

            /* renamed from: b */
            public ItemHolderInfo m35516b(ViewHolder viewHolder, int i) {
                View view = viewHolder.itemView;
                this.f4668a = view.getLeft();
                this.f4669b = view.getTop();
                this.f4670c = view.getRight();
                this.f4671d = view.getBottom();
                return this;
            }
        }

        static int buildAdapterChangeFlagsForAnimations(ViewHolder viewHolder) {
            int i = viewHolder.mFlags & 14;
            if (viewHolder.isInvalid()) {
                return 4;
            }
            if ((i & 4) != 0) {
                return i;
            }
            int oldPosition = viewHolder.getOldPosition();
            int absoluteAdapterPosition = viewHolder.getAbsoluteAdapterPosition();
            if (oldPosition == -1 || absoluteAdapterPosition == -1 || oldPosition == absoluteAdapterPosition) {
                return i;
            }
            return i | FLAG_MOVED;
        }

        public abstract boolean animateAppearance(ViewHolder viewHolder, ItemHolderInfo itemHolderInfo, ItemHolderInfo itemHolderInfo2);

        public abstract boolean animateChange(ViewHolder viewHolder, ViewHolder viewHolder2, ItemHolderInfo itemHolderInfo, ItemHolderInfo itemHolderInfo2);

        public abstract boolean animateDisappearance(ViewHolder viewHolder, ItemHolderInfo itemHolderInfo, ItemHolderInfo itemHolderInfo2);

        public abstract boolean animatePersistence(ViewHolder viewHolder, ItemHolderInfo itemHolderInfo, ItemHolderInfo itemHolderInfo2);

        public boolean canReuseUpdatedViewHolder(ViewHolder viewHolder) {
            return true;
        }

        public boolean canReuseUpdatedViewHolder(ViewHolder viewHolder, List<Object> list) {
            return canReuseUpdatedViewHolder(viewHolder);
        }

        public final void dispatchAnimationFinished(ViewHolder viewHolder) {
            onAnimationFinished(viewHolder);
            ItemAnimatorListener itemAnimatorListener = this.mListener;
            if (itemAnimatorListener != null) {
                itemAnimatorListener.mo35321a(viewHolder);
            }
        }

        public final void dispatchAnimationStarted(ViewHolder viewHolder) {
            onAnimationStarted(viewHolder);
        }

        public final void dispatchAnimationsFinished() {
            int size = this.mFinishedListeners.size();
            for (int i = 0; i < size; i++) {
                this.mFinishedListeners.get(i).m35518a();
            }
            this.mFinishedListeners.clear();
        }

        public abstract void endAnimation(ViewHolder viewHolder);

        public abstract void endAnimations();

        public long getAddDuration() {
            return this.mAddDuration;
        }

        public long getChangeDuration() {
            return this.mChangeDuration;
        }

        public long getMoveDuration() {
            return this.mMoveDuration;
        }

        public long getRemoveDuration() {
            return this.mRemoveDuration;
        }

        public abstract boolean isRunning();

        public final boolean isRunning(ItemAnimatorFinishedListener itemAnimatorFinishedListener) {
            boolean isRunning = isRunning();
            if (itemAnimatorFinishedListener != null) {
                if (!isRunning) {
                    itemAnimatorFinishedListener.m35518a();
                } else {
                    this.mFinishedListeners.add(itemAnimatorFinishedListener);
                }
            }
            return isRunning;
        }

        public ItemHolderInfo obtainHolderInfo() {
            return new ItemHolderInfo();
        }

        public void onAnimationFinished(ViewHolder viewHolder) {
        }

        public void onAnimationStarted(ViewHolder viewHolder) {
        }

        public ItemHolderInfo recordPostLayoutInformation(State state, ViewHolder viewHolder) {
            return obtainHolderInfo().m35517a(viewHolder);
        }

        public ItemHolderInfo recordPreLayoutInformation(State state, ViewHolder viewHolder, int i, List<Object> list) {
            return obtainHolderInfo().m35517a(viewHolder);
        }

        public abstract void runPendingAnimations();

        public void setAddDuration(long j) {
            this.mAddDuration = j;
        }

        public void setChangeDuration(long j) {
            this.mChangeDuration = j;
        }

        void setListener(ItemAnimatorListener itemAnimatorListener) {
            this.mListener = itemAnimatorListener;
        }

        public void setMoveDuration(long j) {
            this.mMoveDuration = j;
        }

        public void setRemoveDuration(long j) {
            this.mRemoveDuration = j;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class ItemDecoration {
        @Deprecated
        public void getItemOffsets(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        @Deprecated
        public void onDraw(Canvas canvas, RecyclerView recyclerView) {
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, State state) {
            onDraw(canvas, recyclerView);
        }

        @Deprecated
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView) {
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, State state) {
            onDrawOver(canvas, recyclerView);
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, State state) {
            getItemOffsets(rect, ((C3109i) view.getLayoutParams()).m35320a(), recyclerView);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class LayoutManager {

        /* renamed from: A */
        private int f35744A;

        /* renamed from: B */
        private int f35745B;

        /* renamed from: k */
        ChildHelper f4672k;

        /* renamed from: l */
        RecyclerView f4673l;

        /* renamed from: m */
        private final C3149o.AbstractC3151b f4674m;

        /* renamed from: n */
        private final C3149o.AbstractC3151b f4675n;

        /* renamed from: o */
        C3149o f4676o;

        /* renamed from: p */
        C3149o f4677p;

        /* renamed from: q */
        SmoothScroller f4678q;

        /* renamed from: r */
        boolean f4679r = false;

        /* renamed from: s */
        boolean f4680s = false;

        /* renamed from: t */
        boolean f4681t = false;

        /* renamed from: u */
        private boolean f4682u = true;

        /* renamed from: v */
        private boolean f4683v = true;

        /* renamed from: w */
        int f4684w;

        /* renamed from: x */
        boolean f4685x;

        /* renamed from: y */
        private int f4686y;

        /* renamed from: z */
        private int f4687z;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$LayoutManager$a */
        /* loaded from: classes.dex */
        class C3094a implements C3149o.AbstractC3151b {
            C3094a() {
            }

            @Override // androidx.recyclerview.widget.C3149o.AbstractC3151b
            /* renamed from: a */
            public int mo35065a(View view) {
                return LayoutManager.this.m35466b0(view) - ((ViewGroup.MarginLayoutParams) ((C3109i) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.C3149o.AbstractC3151b
            /* renamed from: b */
            public int mo35064b() {
                return LayoutManager.this.getPaddingLeft();
            }

            @Override // androidx.recyclerview.widget.C3149o.AbstractC3151b
            /* renamed from: c */
            public int mo35063c() {
                return LayoutManager.this.m35428v0() - LayoutManager.this.getPaddingRight();
            }

            @Override // androidx.recyclerview.widget.C3149o.AbstractC3151b
            /* renamed from: d */
            public int mo35062d(View view) {
                return LayoutManager.this.m35463e0(view) + ((ViewGroup.MarginLayoutParams) ((C3109i) view.getLayoutParams())).rightMargin;
            }

            @Override // androidx.recyclerview.widget.C3149o.AbstractC3151b
            public View getChildAt(int i) {
                return LayoutManager.this.m35480T(i);
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$LayoutManager$b */
        /* loaded from: classes.dex */
        class C3095b implements C3149o.AbstractC3151b {
            C3095b() {
            }

            @Override // androidx.recyclerview.widget.C3149o.AbstractC3151b
            /* renamed from: a */
            public int mo35065a(View view) {
                return LayoutManager.this.m35462f0(view) - ((ViewGroup.MarginLayoutParams) ((C3109i) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.C3149o.AbstractC3151b
            /* renamed from: b */
            public int mo35064b() {
                return LayoutManager.this.getPaddingTop();
            }

            @Override // androidx.recyclerview.widget.C3149o.AbstractC3151b
            /* renamed from: c */
            public int mo35063c() {
                return LayoutManager.this.m35460h0() - LayoutManager.this.getPaddingBottom();
            }

            @Override // androidx.recyclerview.widget.C3149o.AbstractC3151b
            /* renamed from: d */
            public int mo35062d(View view) {
                return LayoutManager.this.m35468Z(view) + ((ViewGroup.MarginLayoutParams) ((C3109i) view.getLayoutParams())).bottomMargin;
            }

            @Override // androidx.recyclerview.widget.C3149o.AbstractC3151b
            public View getChildAt(int i) {
                return LayoutManager.this.m35480T(i);
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$LayoutManager$c */
        /* loaded from: classes.dex */
        public interface AbstractC3096c {
            /* renamed from: a */
            void mo35418a(int i, int i2);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$LayoutManager$d */
        /* loaded from: classes.dex */
        public static class C3097d {

            /* renamed from: a */
            public int f4690a;

            /* renamed from: b */
            public int f4691b;

            /* renamed from: c */
            public boolean f4692c;

            /* renamed from: d */
            public boolean f4693d;
        }

        public LayoutManager() {
            C3094a aVar = new C3094a();
            this.f4674m = aVar;
            C3095b bVar = new C3095b();
            this.f4675n = bVar;
            this.f4676o = new C3149o(aVar);
            this.f4677p = new C3149o(bVar);
        }

        /* renamed from: A0 */
        private boolean m35514A0(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int v0 = m35428v0() - getPaddingRight();
            int h0 = m35460h0() - getPaddingBottom();
            Rect rect = this.f4673l.mTempRect;
            m35467a0(focusedChild, rect);
            if (rect.left - i >= v0 || rect.right - i <= paddingLeft || rect.top - i2 >= h0 || rect.bottom - i2 <= paddingTop) {
                return false;
            }
            return true;
        }

        /* renamed from: E0 */
        private static boolean m35507E0(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    return true;
                }
                if (mode == 1073741824 && size == i) {
                    return true;
                }
                return false;
            } else if (size >= i) {
                return true;
            } else {
                return false;
            }
        }

        /* renamed from: E1 */
        private void m35506E1(Recycler recycler, int i, View view) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.shouldIgnore()) {
                if (!childViewHolderInt.isInvalid() || childViewHolderInt.isRemoved() || this.f4673l.mAdapter.hasStableIds()) {
                    m35501I(i);
                    recycler.m35401D(view);
                    this.f4673l.mViewInfoStore.m35184k(childViewHolderInt);
                    return;
                }
                m35419z1(i);
                recycler.m35402C(childViewHolderInt);
            }
        }

        /* renamed from: J */
        private void m35498J(int i, View view) {
            this.f4672k.m35672d(i);
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
            if (r5 == 1073741824) goto L_0x0020;
         */
        /* renamed from: V */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int m35475V(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L_0x001a
                if (r7 < 0) goto L_0x0011
                goto L_0x001c
            L_0x0011:
                if (r7 != r1) goto L_0x002f
                if (r5 == r2) goto L_0x0020
                if (r5 == 0) goto L_0x002f
                if (r5 == r3) goto L_0x0020
                goto L_0x002f
            L_0x001a:
                if (r7 < 0) goto L_0x001e
            L_0x001c:
                r5 = r3
                goto L_0x0031
            L_0x001e:
                if (r7 != r1) goto L_0x0022
            L_0x0020:
                r7 = r4
                goto L_0x0031
            L_0x0022:
                if (r7 != r0) goto L_0x002f
                if (r5 == r2) goto L_0x002c
                if (r5 != r3) goto L_0x0029
                goto L_0x002c
            L_0x0029:
                r7 = r4
                r5 = r6
                goto L_0x0031
            L_0x002c:
                r7 = r4
                r5 = r2
                goto L_0x0031
            L_0x002f:
                r5 = r6
                r7 = r5
            L_0x0031:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.LayoutManager.m35475V(int, int, int, int, boolean):int");
        }

        /* renamed from: W */
        private int[] m35474W(View view, Rect rect) {
            int[] iArr = new int[2];
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int v0 = m35428v0() - getPaddingRight();
            int h0 = m35460h0() - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i = left - paddingLeft;
            int min = Math.min(0, i);
            int i2 = top - paddingTop;
            int min2 = Math.min(0, i2);
            int i3 = width - v0;
            int max = Math.max(0, i3);
            int max2 = Math.max(0, height - h0);
            if (m35454k0() != 1) {
                if (min == 0) {
                    min = Math.min(i, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i3);
            }
            if (min2 == 0) {
                min2 = Math.min(i2, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        /* renamed from: p0 */
        public static C3097d m35443p0(Context context, AttributeSet attributeSet, int i, int i2) {
            C3097d dVar = new C3097d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C12321d.f27677f, i, i2);
            dVar.f4690a = obtainStyledAttributes.getInt(C12321d.f27678g, 1);
            dVar.f4691b = obtainStyledAttributes.getInt(C12321d.f27688q, 1);
            dVar.f4692c = obtainStyledAttributes.getBoolean(C12321d.f27687p, false);
            dVar.f4693d = obtainStyledAttributes.getBoolean(C12321d.f27689r, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        /* renamed from: q */
        private void m35442q(View view, int i, boolean z) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (z || childViewHolderInt.isRemoved()) {
                this.f4673l.mViewInfoStore.m35193b(childViewHolderInt);
            } else {
                this.f4673l.mViewInfoStore.m35179p(childViewHolderInt);
            }
            C3109i iVar = (C3109i) view.getLayoutParams();
            if (childViewHolderInt.wasReturnedFromScrap() || childViewHolderInt.isScrap()) {
                if (childViewHolderInt.isScrap()) {
                    childViewHolderInt.unScrap();
                } else {
                    childViewHolderInt.clearReturnedFromScrapFlag();
                }
                this.f4672k.m35673c(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f4673l) {
                int m = this.f4672k.m35663m(view);
                if (i == -1) {
                    i = this.f4672k.m35669g();
                }
                if (m == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f4673l.indexOfChild(view) + this.f4673l.exceptionLabel());
                } else if (m != i) {
                    this.f4673l.mLayout.m35497J0(m, i);
                }
            } else {
                this.f4672k.m35675a(view, i, false);
                iVar.f4751m = true;
                SmoothScroller smoothScroller = this.f4678q;
                if (smoothScroller != null && smoothScroller.isRunning()) {
                    this.f4678q.onChildAttachedToWindow(view);
                }
            }
            if (iVar.f4752n) {
                childViewHolderInt.itemView.invalidate();
                iVar.f4752n = false;
            }
        }

        /* renamed from: y */
        public static int m35422y(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode == Integer.MIN_VALUE) {
                return Math.min(size, Math.max(i2, i3));
            }
            if (mode != 1073741824) {
                return Math.max(i2, i3);
            }
            return size;
        }

        /* renamed from: A */
        public void mo35515A(int i, AbstractC3096c cVar) {
        }

        /* renamed from: A1 */
        public boolean m35513A1(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return mo34654B1(recyclerView, view, rect, z, false);
        }

        /* renamed from: B */
        public int mo29432B(State state) {
            return 0;
        }

        /* renamed from: B0 */
        public final boolean m35512B0() {
            return this.f4683v;
        }

        /* renamed from: B1 */
        public boolean mo34654B1(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] W = m35474W(view, rect);
            int i = W[0];
            int i2 = W[1];
            if ((z2 && !m35514A0(recyclerView, i, i2)) || (i == 0 && i2 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i, i2);
            } else {
                recyclerView.smoothScrollBy(i, i2);
            }
            return true;
        }

        /* renamed from: C */
        public int mo29430C(State state) {
            return 0;
        }

        /* renamed from: C0 */
        public boolean m35511C0(Recycler recycler, State state) {
            return false;
        }

        /* renamed from: C1 */
        public void m35510C1() {
            RecyclerView recyclerView = this.f4673l;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        /* renamed from: D */
        public int mo29428D(State state) {
            return 0;
        }

        /* renamed from: D0 */
        public boolean m35509D0() {
            return this.f4682u;
        }

        /* renamed from: D1 */
        public void m35508D1() {
            this.f4679r = true;
        }

        /* renamed from: E */
        public int mo29426E(State state) {
            return 0;
        }

        /* renamed from: F */
        public int mo29423F(State state) {
            return 0;
        }

        /* renamed from: F0 */
        public boolean m35505F0() {
            SmoothScroller smoothScroller = this.f4678q;
            return smoothScroller != null && smoothScroller.isRunning();
        }

        /* renamed from: F1 */
        public int mo29422F1(int i, Recycler recycler, State state) {
            return 0;
        }

        /* renamed from: G */
        public int mo29420G(State state) {
            return 0;
        }

        /* renamed from: G0 */
        public boolean m35504G0(View view, boolean z, boolean z2) {
            boolean z3;
            if (!this.f4676o.m35071b(view, 24579) || !this.f4677p.m35071b(view, 24579)) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z) {
                return z3;
            }
            return !z3;
        }

        /* renamed from: G1 */
        public void mo29419G1(int i) {
        }

        /* renamed from: H */
        public void m35503H(Recycler recycler) {
            for (int U = m35477U() - 1; U >= 0; U--) {
                m35506E1(recycler, U, m35480T(U));
            }
        }

        /* renamed from: H0 */
        public void m35502H0(View view, int i, int i2, int i3, int i4) {
            C3109i iVar = (C3109i) view.getLayoutParams();
            Rect rect = iVar.f4750l;
            view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) iVar).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) iVar).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) iVar).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) iVar).bottomMargin);
        }

        /* renamed from: H1 */
        public int mo29417H1(int i, Recycler recycler, State state) {
            return 0;
        }

        /* renamed from: I */
        public void m35501I(int i) {
            m35498J(i, m35480T(i));
        }

        /* renamed from: I0 */
        public void m35500I0(View view, int i, int i2) {
            C3109i iVar = (C3109i) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.f4673l.getItemDecorInsetsForChild(view);
            int i3 = i + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right;
            int i4 = i2 + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom;
            int V = m35475V(m35428v0(), m35426w0(), getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) iVar).leftMargin + ((ViewGroup.MarginLayoutParams) iVar).rightMargin + i3, ((ViewGroup.MarginLayoutParams) iVar).width, mo29358v());
            int V2 = m35475V(m35460h0(), m35458i0(), getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) iVar).topMargin + ((ViewGroup.MarginLayoutParams) iVar).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) iVar).height, mo29356w());
            if (m35487O1(view, V, V2, iVar)) {
                view.measure(V, V2);
            }
        }

        /* renamed from: I1 */
        void m35499I1(RecyclerView recyclerView) {
            m35496J1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        /* renamed from: J0 */
        public void m35497J0(int i, int i2) {
            View T = m35480T(i);
            if (T != null) {
                m35501I(i);
                m35437s(T, i2);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.f4673l.toString());
        }

        /* renamed from: J1 */
        void m35496J1(int i, int i2) {
            this.f35744A = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.f4686y = mode;
            if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.f35744A = 0;
            }
            this.f35745B = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f4687z = mode2;
            if (mode2 == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.f35745B = 0;
            }
        }

        /* renamed from: K */
        void m35495K(RecyclerView recyclerView) {
            this.f4680s = true;
            mo29407O0(recyclerView);
        }

        /* renamed from: K0 */
        public void mo35302K0(int i) {
            RecyclerView recyclerView = this.f4673l;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i);
            }
        }

        /* renamed from: K1 */
        public void m35494K1(int i, int i2) {
            this.f4673l.setMeasuredDimension(i, i2);
        }

        /* renamed from: L */
        void m35493L(RecyclerView recyclerView, Recycler recycler) {
            this.f4680s = false;
            mo29402Q0(recyclerView, recycler);
        }

        /* renamed from: L0 */
        public void mo35300L0(int i) {
            RecyclerView recyclerView = this.f4673l;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i);
            }
        }

        /* renamed from: L1 */
        public void mo35299L1(Rect rect, int i, int i2) {
            m35494K1(m35422y(i, rect.width() + getPaddingLeft() + getPaddingRight(), m35449n0()), m35422y(i2, rect.height() + getPaddingTop() + getPaddingBottom(), m35451m0()));
        }

        /* renamed from: M */
        public View m35492M(View view) {
            View findContainingItemView;
            RecyclerView recyclerView = this.f4673l;
            if (recyclerView == null || (findContainingItemView = recyclerView.findContainingItemView(view)) == null || this.f4672k.m35662n(findContainingItemView)) {
                return null;
            }
            return findContainingItemView;
        }

        /* renamed from: M0 */
        public void mo29411M0(Adapter adapter, Adapter adapter2) {
        }

        /* renamed from: M1 */
        void m35491M1(int i, int i2) {
            int U = m35477U();
            if (U == 0) {
                this.f4673l.defaultOnMeasure(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < U; i7++) {
                View T = m35480T(i7);
                Rect rect = this.f4673l.mTempRect;
                m35467a0(T, rect);
                int i8 = rect.left;
                if (i8 < i6) {
                    i6 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i4) {
                    i4 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i5) {
                    i5 = i11;
                }
            }
            this.f4673l.mTempRect.set(i6, i4, i3, i5);
            mo35299L1(this.f4673l.mTempRect, i, i2);
        }

        /* renamed from: N */
        public View mo35490N(int i) {
            int U = m35477U();
            for (int i2 = 0; i2 < U; i2++) {
                View T = m35480T(i2);
                ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(T);
                if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i && !childViewHolderInt.shouldIgnore() && (this.f4673l.mState.m35349e() || !childViewHolderInt.isRemoved())) {
                    return T;
                }
            }
            return null;
        }

        /* renamed from: N0 */
        public boolean m35489N0(RecyclerView recyclerView, ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        /* renamed from: N1 */
        void m35488N1(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f4673l = null;
                this.f4672k = null;
                this.f35744A = 0;
                this.f35745B = 0;
            } else {
                this.f4673l = recyclerView;
                this.f4672k = recyclerView.mChildHelper;
                this.f35744A = recyclerView.getWidth();
                this.f35745B = recyclerView.getHeight();
            }
            this.f4686y = 1073741824;
            this.f4687z = 1073741824;
        }

        /* renamed from: O */
        public abstract C3109i mo29408O();

        /* renamed from: O0 */
        public void mo29407O0(RecyclerView recyclerView) {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: O1 */
        public boolean m35487O1(View view, int i, int i2, C3109i iVar) {
            if (view.isLayoutRequested() || !this.f4682u || !m35507E0(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) iVar).width) || !m35507E0(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) iVar).height)) {
                return true;
            }
            return false;
        }

        /* renamed from: P */
        public C3109i mo29404P(Context context, AttributeSet attributeSet) {
            return new C3109i(context, attributeSet);
        }

        @Deprecated
        /* renamed from: P0 */
        public void m35486P0(RecyclerView recyclerView) {
        }

        /* renamed from: P1 */
        boolean mo35485P1() {
            return false;
        }

        /* renamed from: Q */
        public C3109i mo35293Q(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof C3109i) {
                return new C3109i((C3109i) layoutParams);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new C3109i((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new C3109i(layoutParams);
        }

        /* renamed from: Q0 */
        public void mo29402Q0(RecyclerView recyclerView, Recycler recycler) {
            m35486P0(recyclerView);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: Q1 */
        public boolean m35484Q1(View view, int i, int i2, C3109i iVar) {
            if (!this.f4682u || !m35507E0(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) iVar).width) || !m35507E0(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) iVar).height)) {
                return true;
            }
            return false;
        }

        /* renamed from: R */
        public int m35483R() {
            return -1;
        }

        /* renamed from: R0 */
        public View mo35291R0(View view, int i, Recycler recycler, State state) {
            return null;
        }

        /* renamed from: R1 */
        public void mo28122R1(RecyclerView recyclerView, State state, int i) {
            Log.e(RecyclerView.TAG, "You must override smoothScrollToPosition to support smooth scrolling");
        }

        /* renamed from: S */
        public int m35482S(View view) {
            return ((C3109i) view.getLayoutParams()).f4750l.bottom;
        }

        /* renamed from: S0 */
        public void mo35289S0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f4673l;
            m35479T0(recyclerView.mRecycler, recyclerView.mState, accessibilityEvent);
        }

        /* renamed from: S1 */
        public void m35481S1(SmoothScroller smoothScroller) {
            SmoothScroller smoothScroller2 = this.f4678q;
            if (!(smoothScroller2 == null || smoothScroller == smoothScroller2 || !smoothScroller2.isRunning())) {
                this.f4678q.stop();
            }
            this.f4678q = smoothScroller;
            smoothScroller.start(this.f4673l, this);
        }

        /* renamed from: T */
        public View m35480T(int i) {
            ChildHelper childHelper = this.f4672k;
            if (childHelper != null) {
                return childHelper.m35670f(i);
            }
            return null;
        }

        /* renamed from: T0 */
        public void m35479T0(Recycler recycler, State state, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f4673l;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z = true;
                if (!recyclerView.canScrollVertically(1) && !this.f4673l.canScrollVertically(-1) && !this.f4673l.canScrollHorizontally(-1) && !this.f4673l.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                Adapter adapter = this.f4673l.mAdapter;
                if (adapter != null) {
                    accessibilityEvent.setItemCount(adapter.getItemCount());
                }
            }
        }

        /* renamed from: T1 */
        void m35478T1() {
            SmoothScroller smoothScroller = this.f4678q;
            if (smoothScroller != null) {
                smoothScroller.stop();
            }
        }

        /* renamed from: U */
        public int m35477U() {
            ChildHelper childHelper = this.f4672k;
            if (childHelper != null) {
                return childHelper.m35669g();
            }
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: U0 */
        public void m35476U0(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            RecyclerView recyclerView = this.f4673l;
            mo34653V0(recyclerView.mRecycler, recyclerView.mState, accessibilityNodeInfoCompat);
        }

        /* renamed from: U1 */
        public boolean mo35286U1() {
            return false;
        }

        /* renamed from: V0 */
        public void mo34653V0(Recycler recycler, State state, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (this.f4673l.canScrollVertically(-1) || this.f4673l.canScrollHorizontally(-1)) {
                accessibilityNodeInfoCompat.m37390a(8192);
                accessibilityNodeInfoCompat.m37343x0(true);
            }
            if (this.f4673l.canScrollVertically(1) || this.f4673l.canScrollHorizontally(1)) {
                accessibilityNodeInfoCompat.m37390a(4096);
                accessibilityNodeInfoCompat.m37343x0(true);
            }
            accessibilityNodeInfoCompat.m37385c0(AccessibilityNodeInfoCompat.C2557b.m37333b(mo35439r0(recycler, state), mo35470Y(recycler, state), m35511C0(recycler, state), m35436s0(recycler, state)));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: W0 */
        public void m35473W0(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && !this.f4672k.m35662n(childViewHolderInt.itemView)) {
                RecyclerView recyclerView = this.f4673l;
                mo35471X0(recyclerView.mRecycler, recyclerView.mState, view, accessibilityNodeInfoCompat);
            }
        }

        /* renamed from: X */
        public boolean m35472X() {
            RecyclerView recyclerView = this.f4673l;
            return recyclerView != null && recyclerView.mClipToPadding;
        }

        /* renamed from: X0 */
        public void mo35471X0(Recycler recycler, State state, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        }

        /* renamed from: Y */
        public int mo35470Y(Recycler recycler, State state) {
            return -1;
        }

        /* renamed from: Y0 */
        public View m35469Y0(View view, int i) {
            return null;
        }

        /* renamed from: Z */
        public int m35468Z(View view) {
            return view.getBottom() + m35482S(view);
        }

        /* renamed from: Z0 */
        public void mo29390Z0(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: a0 */
        public void m35467a0(View view, Rect rect) {
            RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        }

        /* renamed from: a1 */
        public void mo35274a1(RecyclerView recyclerView) {
        }

        /* renamed from: b0 */
        public int m35466b0(View view) {
            return view.getLeft() - m35453l0(view);
        }

        /* renamed from: b1 */
        public void mo29386b1(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        /* renamed from: c0 */
        public int m35465c0(View view) {
            Rect rect = ((C3109i) view.getLayoutParams()).f4750l;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        /* renamed from: c1 */
        public void mo29384c1(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: d0 */
        public int m35464d0(View view) {
            Rect rect = ((C3109i) view.getLayoutParams()).f4750l;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        /* renamed from: d1 */
        public void mo29382d1(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: e0 */
        public int m35463e0(View view) {
            return view.getRight() + m35441q0(view);
        }

        /* renamed from: e1 */
        public void mo29380e1(RecyclerView recyclerView, int i, int i2, Object obj) {
            mo29382d1(recyclerView, i, i2);
        }

        /* renamed from: f0 */
        public int m35462f0(View view) {
            return view.getTop() - m35433t0(view);
        }

        /* renamed from: f1 */
        public void mo29378f1(Recycler recycler, State state) {
            Log.e(RecyclerView.TAG, "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        /* renamed from: g0 */
        public View m35461g0() {
            View focusedChild;
            RecyclerView recyclerView = this.f4673l;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f4672k.m35662n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        /* renamed from: g1 */
        public void mo29376g1(State state) {
        }

        public int getPaddingBottom() {
            RecyclerView recyclerView = this.f4673l;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int getPaddingEnd() {
            RecyclerView recyclerView = this.f4673l;
            if (recyclerView != null) {
                return C2733w0.m37055F(recyclerView);
            }
            return 0;
        }

        public int getPaddingLeft() {
            RecyclerView recyclerView = this.f4673l;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int getPaddingRight() {
            RecyclerView recyclerView = this.f4673l;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int getPaddingStart() {
            RecyclerView recyclerView = this.f4673l;
            if (recyclerView != null) {
                return C2733w0.m37053G(recyclerView);
            }
            return 0;
        }

        public int getPaddingTop() {
            RecyclerView recyclerView = this.f4673l;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        /* renamed from: h0 */
        public int m35460h0() {
            return this.f35745B;
        }

        /* renamed from: h1 */
        public void m35459h1(Recycler recycler, State state, int i, int i2) {
            this.f4673l.defaultOnMeasure(i, i2);
        }

        /* renamed from: i0 */
        public int m35458i0() {
            return this.f4687z;
        }

        @Deprecated
        /* renamed from: i1 */
        public boolean m35457i1(RecyclerView recyclerView, View view, View view2) {
            return m35505F0() || recyclerView.isComputingLayout();
        }

        /* renamed from: j0 */
        public int m35456j0() {
            Adapter adapter;
            RecyclerView recyclerView = this.f4673l;
            if (recyclerView != null) {
                adapter = recyclerView.getAdapter();
            } else {
                adapter = null;
            }
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        /* renamed from: j1 */
        public boolean m35455j1(RecyclerView recyclerView, State state, View view, View view2) {
            return m35457i1(recyclerView, view, view2);
        }

        /* renamed from: k0 */
        public int m35454k0() {
            return C2733w0.m37063B(this.f4673l);
        }

        /* renamed from: k1 */
        public void mo29371k1(Parcelable parcelable) {
        }

        /* renamed from: l0 */
        public int m35453l0(View view) {
            return ((C3109i) view.getLayoutParams()).f4750l.left;
        }

        /* renamed from: l1 */
        public Parcelable mo29369l1() {
            return null;
        }

        /* renamed from: m */
        public void m35452m(View view) {
            m35450n(view, -1);
        }

        /* renamed from: m0 */
        public int m35451m0() {
            return C2733w0.m37061C(this.f4673l);
        }

        /* renamed from: m1 */
        public void mo35260m1(int i) {
        }

        /* renamed from: n */
        public void m35450n(View view, int i) {
            m35442q(view, i, true);
        }

        /* renamed from: n0 */
        public int m35449n0() {
            return C2733w0.m37059D(this.f4673l);
        }

        /* renamed from: n1 */
        void m35448n1(SmoothScroller smoothScroller) {
            if (this.f4678q == smoothScroller) {
                this.f4678q = null;
            }
        }

        /* renamed from: o */
        public void m35447o(View view) {
            m35444p(view, -1);
        }

        /* renamed from: o0 */
        public int m35446o0(View view) {
            return ((C3109i) view.getLayoutParams()).m35320a();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: o1 */
        public boolean m35445o1(int i, Bundle bundle) {
            RecyclerView recyclerView = this.f4673l;
            return mo34652p1(recyclerView.mRecycler, recyclerView.mState, i, bundle);
        }

        /* renamed from: p */
        public void m35444p(View view, int i) {
            m35442q(view, i, false);
        }

        /* renamed from: p1 */
        public boolean mo34652p1(Recycler recycler, State state, int i, Bundle bundle) {
            int i2;
            int i3;
            int i4;
            int i5;
            RecyclerView recyclerView = this.f4673l;
            if (recyclerView == null) {
                return false;
            }
            if (i == 4096) {
                if (recyclerView.canScrollVertically(1)) {
                    i4 = (m35460h0() - getPaddingTop()) - getPaddingBottom();
                } else {
                    i4 = 0;
                }
                if (this.f4673l.canScrollHorizontally(1)) {
                    i5 = (m35428v0() - getPaddingLeft()) - getPaddingRight();
                    i2 = i4;
                    i3 = i5;
                }
                i2 = i4;
                i3 = 0;
            } else if (i != 8192) {
                i3 = 0;
                i2 = 0;
            } else {
                if (recyclerView.canScrollVertically(-1)) {
                    i4 = -((m35460h0() - getPaddingTop()) - getPaddingBottom());
                } else {
                    i4 = 0;
                }
                if (this.f4673l.canScrollHorizontally(-1)) {
                    i5 = -((m35428v0() - getPaddingLeft()) - getPaddingRight());
                    i2 = i4;
                    i3 = i5;
                }
                i2 = i4;
                i3 = 0;
            }
            if (i2 == 0 && i3 == 0) {
                return false;
            }
            this.f4673l.smoothScrollBy(i3, i2, null, Integer.MIN_VALUE, true);
            return true;
        }

        /* renamed from: q0 */
        public int m35441q0(View view) {
            return ((C3109i) view.getLayoutParams()).f4750l.right;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: q1 */
        public boolean m35440q1(View view, int i, Bundle bundle) {
            RecyclerView recyclerView = this.f4673l;
            return m35438r1(recyclerView.mRecycler, recyclerView.mState, view, i, bundle);
        }

        /* renamed from: r */
        public void mo35254r(String str) {
            RecyclerView recyclerView = this.f4673l;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        /* renamed from: r0 */
        public int mo35439r0(Recycler recycler, State state) {
            return -1;
        }

        /* renamed from: r1 */
        public boolean m35438r1(Recycler recycler, State state, View view, int i, Bundle bundle) {
            return false;
        }

        /* renamed from: s */
        public void m35437s(View view, int i) {
            m35434t(view, i, (C3109i) view.getLayoutParams());
        }

        /* renamed from: s0 */
        public int m35436s0(Recycler recycler, State state) {
            return 0;
        }

        /* renamed from: s1 */
        public void m35435s1() {
            for (int U = m35477U() - 1; U >= 0; U--) {
                this.f4672k.m35659q(U);
            }
        }

        /* renamed from: t */
        public void m35434t(View view, int i, C3109i iVar) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isRemoved()) {
                this.f4673l.mViewInfoStore.m35193b(childViewHolderInt);
            } else {
                this.f4673l.mViewInfoStore.m35179p(childViewHolderInt);
            }
            this.f4672k.m35673c(view, i, iVar, childViewHolderInt.isRemoved());
        }

        /* renamed from: t0 */
        public int m35433t0(View view) {
            return ((C3109i) view.getLayoutParams()).f4750l.top;
        }

        /* renamed from: t1 */
        public void m35432t1(Recycler recycler) {
            for (int U = m35477U() - 1; U >= 0; U--) {
                if (!RecyclerView.getChildViewHolderInt(m35480T(U)).shouldIgnore()) {
                    m35425w1(U, recycler);
                }
            }
        }

        /* renamed from: u */
        public void m35431u(View view, Rect rect) {
            RecyclerView recyclerView = this.f4673l;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view));
            }
        }

        /* renamed from: u0 */
        public void m35430u0(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((C3109i) view.getLayoutParams()).f4750l;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (!(this.f4673l == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
                RectF rectF = this.f4673l.mTempRectF;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* renamed from: u1 */
        void m35429u1(Recycler recycler) {
            int j = recycler.m35382j();
            for (int i = j - 1; i >= 0; i--) {
                View n = recycler.m35378n(i);
                ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(n);
                if (!childViewHolderInt.shouldIgnore()) {
                    childViewHolderInt.setIsRecyclable(false);
                    if (childViewHolderInt.isTmpDetached()) {
                        this.f4673l.removeDetachedView(n, false);
                    }
                    ItemAnimator itemAnimator = this.f4673l.mItemAnimator;
                    if (itemAnimator != null) {
                        itemAnimator.endAnimation(childViewHolderInt);
                    }
                    childViewHolderInt.setIsRecyclable(true);
                    recycler.m35367y(n);
                }
            }
            recycler.m35387e();
            if (j > 0) {
                this.f4673l.invalidate();
            }
        }

        /* renamed from: v */
        public boolean mo29358v() {
            return false;
        }

        /* renamed from: v0 */
        public int m35428v0() {
            return this.f35744A;
        }

        /* renamed from: v1 */
        public void m35427v1(View view, Recycler recycler) {
            m35420y1(view);
            recycler.m35403B(view);
        }

        /* renamed from: w */
        public boolean mo29356w() {
            return false;
        }

        /* renamed from: w0 */
        public int m35426w0() {
            return this.f4686y;
        }

        /* renamed from: w1 */
        public void m35425w1(int i, Recycler recycler) {
            View T = m35480T(i);
            m35419z1(i);
            recycler.m35403B(T);
        }

        /* renamed from: x */
        public boolean mo29354x(C3109i iVar) {
            return iVar != null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: x0 */
        public boolean m35424x0() {
            int U = m35477U();
            for (int i = 0; i < U; i++) {
                ViewGroup.LayoutParams layoutParams = m35480T(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: x1 */
        public boolean m35423x1(Runnable runnable) {
            RecyclerView recyclerView = this.f4673l;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        /* renamed from: y0 */
        public boolean m35421y0() {
            return this.f4680s;
        }

        /* renamed from: y1 */
        public void m35420y1(View view) {
            this.f4672k.m35660p(view);
        }

        /* renamed from: z */
        public void mo35245z(int i, int i2, State state, AbstractC3096c cVar) {
        }

        /* renamed from: z0 */
        public boolean mo29351z0() {
            return this.f4681t;
        }

        /* renamed from: z1 */
        public void m35419z1(int i) {
            if (m35480T(i) != null) {
                this.f4672k.m35659q(i);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface OnChildAttachStateChangeListener {
        void onChildViewAttachedToWindow(View view);

        void onChildViewDetachedFromWindow(View view);
    }

    /* loaded from: classes.dex */
    public static abstract class OnFlingListener {
        /* renamed from: a */
        public abstract boolean mo35081a(int i, int i2);
    }

    /* loaded from: classes.dex */
    public interface OnItemTouchListener {
        boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent);

        void onRequestDisallowInterceptTouchEvent(boolean z);

        void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent);
    }

    /* loaded from: classes.dex */
    public static abstract class OnScrollListener {
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* loaded from: classes.dex */
    public static class RecycledViewPool {

        /* renamed from: a */
        SparseArray<C3098a> f4694a = new SparseArray<>();

        /* renamed from: b */
        private int f4695b = 0;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.recyclerview.widget.RecyclerView$RecycledViewPool$a */
        /* loaded from: classes.dex */
        public static class C3098a {

            /* renamed from: a */
            final ArrayList<ViewHolder> f4696a = new ArrayList<>();

            /* renamed from: b */
            int f4697b = 5;

            /* renamed from: c */
            long f4698c = 0;

            /* renamed from: d */
            long f4699d = 0;

            C3098a() {
            }
        }

        /* renamed from: g */
        private C3098a m35411g(int i) {
            C3098a aVar = this.f4694a.get(i);
            if (aVar != null) {
                return aVar;
            }
            C3098a aVar2 = new C3098a();
            this.f4694a.put(i, aVar2);
            return aVar2;
        }

        /* renamed from: a */
        void m35417a() {
            this.f4695b++;
        }

        /* renamed from: b */
        public void m35416b() {
            for (int i = 0; i < this.f4694a.size(); i++) {
                this.f4694a.valueAt(i).f4696a.clear();
            }
        }

        /* renamed from: c */
        void m35415c() {
            this.f4695b--;
        }

        /* renamed from: d */
        void m35414d(int i, long j) {
            C3098a g = m35411g(i);
            g.f4699d = m35408j(g.f4699d, j);
        }

        /* renamed from: e */
        void m35413e(int i, long j) {
            C3098a g = m35411g(i);
            g.f4698c = m35408j(g.f4698c, j);
        }

        /* renamed from: f */
        public ViewHolder m35412f(int i) {
            C3098a aVar = this.f4694a.get(i);
            if (aVar == null || aVar.f4696a.isEmpty()) {
                return null;
            }
            ArrayList<ViewHolder> arrayList = aVar.f4696a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).isAttachedToTransitionOverlay()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        /* renamed from: h */
        void m35410h(Adapter adapter, Adapter adapter2, boolean z) {
            if (adapter != null) {
                m35415c();
            }
            if (!z && this.f4695b == 0) {
                m35416b();
            }
            if (adapter2 != null) {
                m35417a();
            }
        }

        /* renamed from: i */
        public void m35409i(ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            ArrayList<ViewHolder> arrayList = m35411g(itemViewType).f4696a;
            if (this.f4694a.get(itemViewType).f4697b > arrayList.size()) {
                viewHolder.resetInternal();
                arrayList.add(viewHolder);
            }
        }

        /* renamed from: j */
        long m35408j(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        /* renamed from: k */
        public void m35407k(int i, int i2) {
            C3098a g = m35411g(i);
            g.f4697b = i2;
            ArrayList<ViewHolder> arrayList = g.f4696a;
            while (arrayList.size() > i2) {
                arrayList.remove(arrayList.size() - 1);
            }
        }

        /* renamed from: l */
        boolean m35406l(int i, long j, long j2) {
            long j3 = m35411g(i).f4699d;
            return j3 == 0 || j + j3 < j2;
        }

        /* renamed from: m */
        boolean m35405m(int i, long j, long j2) {
            long j3 = m35411g(i).f4698c;
            return j3 == 0 || j + j3 < j2;
        }
    }

    /* loaded from: classes.dex */
    public final class Recycler {

        /* renamed from: a */
        final ArrayList<ViewHolder> f4700a;

        /* renamed from: d */
        private final List<ViewHolder> f4703d;

        /* renamed from: g */
        RecycledViewPool f4706g;

        /* renamed from: h */
        private ViewCacheExtension f4707h;

        /* renamed from: b */
        ArrayList<ViewHolder> f4701b = null;

        /* renamed from: c */
        final ArrayList<ViewHolder> f4702c = new ArrayList<>();

        /* renamed from: e */
        private int f4704e = 2;

        /* renamed from: f */
        int f4705f = 2;

        public Recycler() {
            ArrayList<ViewHolder> arrayList = new ArrayList<>();
            this.f4700a = arrayList;
            this.f4703d = Collections.unmodifiableList(arrayList);
        }

        /* renamed from: H */
        private boolean m35397H(ViewHolder viewHolder, int i, int i2, long j) {
            viewHolder.mBindingAdapter = null;
            viewHolder.mOwnerRecyclerView = RecyclerView.this;
            int itemViewType = viewHolder.getItemViewType();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j != RecyclerView.FOREVER_NS && !this.f4706g.m35406l(itemViewType, nanoTime, j)) {
                return false;
            }
            RecyclerView.this.mAdapter.bindViewHolder(viewHolder, i);
            this.f4706g.m35414d(viewHolder.getItemViewType(), RecyclerView.this.getNanoTime() - nanoTime);
            m35390b(viewHolder);
            if (!RecyclerView.this.mState.m35349e()) {
                return true;
            }
            viewHolder.mPreLayoutPosition = i2;
            return true;
        }

        /* renamed from: b */
        private void m35390b(ViewHolder viewHolder) {
            if (RecyclerView.this.isAccessibilityEnabled()) {
                View view = viewHolder.itemView;
                if (C2733w0.m36973z(view) == 0) {
                    C2733w0.m37064A0(view, 1);
                }
                RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate = RecyclerView.this.mAccessibilityDelegate;
                if (recyclerViewAccessibilityDelegate != null) {
                    C2549a a = recyclerViewAccessibilityDelegate.m35316a();
                    if (a instanceof RecyclerViewAccessibilityDelegate.C3110a) {
                        ((RecyclerViewAccessibilityDelegate.C3110a) a).m35313b(view);
                    }
                    C2733w0.m36990q0(view, a);
                }
            }
        }

        /* renamed from: q */
        private void m35375q(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    m35375q((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        /* renamed from: r */
        private void m35374r(ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            if (view instanceof ViewGroup) {
                m35375q((ViewGroup) view, false);
            }
        }

        /* renamed from: A */
        void m35404A(int i) {
            m35391a(this.f4702c.get(i), true);
            this.f4702c.remove(i);
        }

        /* renamed from: B */
        public void m35403B(View view) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.unScrap();
            } else if (childViewHolderInt.wasReturnedFromScrap()) {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            m35402C(childViewHolderInt);
            if (RecyclerView.this.mItemAnimator != null && !childViewHolderInt.isRecyclable()) {
                RecyclerView.this.mItemAnimator.endAnimation(childViewHolderInt);
            }
        }

        /* renamed from: C */
        void m35402C(ViewHolder viewHolder) {
            boolean z;
            boolean z2;
            boolean z3 = false;
            boolean z4 = true;
            if (viewHolder.isScrap() || viewHolder.itemView.getParent() != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Scrapped or attached views may not be recycled. isScrap:");
                sb2.append(viewHolder.isScrap());
                sb2.append(" isAttached:");
                if (viewHolder.itemView.getParent() != null) {
                    z3 = true;
                }
                sb2.append(z3);
                sb2.append(RecyclerView.this.exceptionLabel());
                throw new IllegalArgumentException(sb2.toString());
            } else if (viewHolder.isTmpDetached()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + viewHolder + RecyclerView.this.exceptionLabel());
            } else if (!viewHolder.shouldIgnore()) {
                boolean doesTransientStatePreventRecycling = viewHolder.doesTransientStatePreventRecycling();
                Adapter adapter = RecyclerView.this.mAdapter;
                if (adapter == null || !doesTransientStatePreventRecycling || !adapter.onFailedToRecycleView(viewHolder)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z || viewHolder.isRecyclable()) {
                    if (this.f4705f <= 0 || viewHolder.hasAnyOfTheFlags(526)) {
                        z2 = false;
                    } else {
                        int size = this.f4702c.size();
                        if (size >= this.f4705f && size > 0) {
                            m35404A(0);
                            size--;
                        }
                        if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0 && !RecyclerView.this.mPrefetchRegistry.m35635d(viewHolder.mPosition)) {
                            int i = size - 1;
                            while (i >= 0) {
                                if (!RecyclerView.this.mPrefetchRegistry.m35635d(this.f4702c.get(i).mPosition)) {
                                    break;
                                }
                                i--;
                            }
                            size = i + 1;
                        }
                        this.f4702c.add(size, viewHolder);
                        z2 = true;
                    }
                    if (!z2) {
                        m35391a(viewHolder, true);
                    } else {
                        z4 = false;
                    }
                    z3 = z2;
                } else {
                    z4 = false;
                }
                RecyclerView.this.mViewInfoStore.m35178q(viewHolder);
                if (!z3 && !z4 && doesTransientStatePreventRecycling) {
                    viewHolder.mBindingAdapter = null;
                    viewHolder.mOwnerRecyclerView = null;
                }
            } else {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.exceptionLabel());
            }
        }

        /* renamed from: D */
        void m35401D(View view) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.hasAnyOfTheFlags(12) && childViewHolderInt.isUpdated() && !RecyclerView.this.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (this.f4701b == null) {
                    this.f4701b = new ArrayList<>();
                }
                childViewHolderInt.setScrapContainer(this, true);
                this.f4701b.add(childViewHolderInt);
            } else if (!childViewHolderInt.isInvalid() || childViewHolderInt.isRemoved() || RecyclerView.this.mAdapter.hasStableIds()) {
                childViewHolderInt.setScrapContainer(this, false);
                this.f4700a.add(childViewHolderInt);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.exceptionLabel());
            }
        }

        /* renamed from: E */
        void m35400E(RecycledViewPool recycledViewPool) {
            RecycledViewPool recycledViewPool2 = this.f4706g;
            if (recycledViewPool2 != null) {
                recycledViewPool2.m35415c();
            }
            this.f4706g = recycledViewPool;
            if (recycledViewPool != null && RecyclerView.this.getAdapter() != null) {
                this.f4706g.m35417a();
            }
        }

        /* renamed from: F */
        void m35399F(ViewCacheExtension viewCacheExtension) {
            this.f4707h = viewCacheExtension;
        }

        /* renamed from: G */
        public void m35398G(int i) {
            this.f4704e = i;
            m35394K();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Removed duplicated region for block: B:104:0x0228 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0185  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x01a2  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x01c5  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x01d4  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x01fe  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x020c  */
        /* renamed from: I */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public androidx.recyclerview.widget.RecyclerView.ViewHolder m35396I(int r17, boolean r18, long r19) {
            /*
                Method dump skipped, instructions count: 615
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.Recycler.m35396I(int, boolean, long):androidx.recyclerview.widget.RecyclerView$ViewHolder");
        }

        /* renamed from: J */
        void m35395J(ViewHolder viewHolder) {
            if (viewHolder.mInChangeScrap) {
                this.f4701b.remove(viewHolder);
            } else {
                this.f4700a.remove(viewHolder);
            }
            viewHolder.mScrapContainer = null;
            viewHolder.mInChangeScrap = false;
            viewHolder.clearReturnedFromScrapFlag();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: K */
        public void m35394K() {
            int i;
            LayoutManager layoutManager = RecyclerView.this.mLayout;
            if (layoutManager != null) {
                i = layoutManager.f4684w;
            } else {
                i = 0;
            }
            this.f4705f = this.f4704e + i;
            for (int size = this.f4702c.size() - 1; size >= 0 && this.f4702c.size() > this.f4705f; size--) {
                m35404A(size);
            }
        }

        /* renamed from: L */
        boolean m35393L(ViewHolder viewHolder) {
            if (viewHolder.isRemoved()) {
                return RecyclerView.this.mState.m35349e();
            }
            int i = viewHolder.mPosition;
            if (i < 0 || i >= RecyclerView.this.mAdapter.getItemCount()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + viewHolder + RecyclerView.this.exceptionLabel());
            } else if (!RecyclerView.this.mState.m35349e() && RecyclerView.this.mAdapter.getItemViewType(viewHolder.mPosition) != viewHolder.getItemViewType()) {
                return false;
            } else {
                if (!RecyclerView.this.mAdapter.hasStableIds() || viewHolder.getItemId() == RecyclerView.this.mAdapter.getItemId(viewHolder.mPosition)) {
                    return true;
                }
                return false;
            }
        }

        /* renamed from: M */
        void m35392M(int i, int i2) {
            int i3;
            int i4 = i2 + i;
            for (int size = this.f4702c.size() - 1; size >= 0; size--) {
                ViewHolder viewHolder = this.f4702c.get(size);
                if (viewHolder != null && (i3 = viewHolder.mPosition) >= i && i3 < i4) {
                    viewHolder.addFlags(2);
                    m35404A(size);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public void m35391a(ViewHolder viewHolder, boolean z) {
            C2549a aVar;
            RecyclerView.clearNestedRecyclerViewIfNotNested(viewHolder);
            View view = viewHolder.itemView;
            RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate = RecyclerView.this.mAccessibilityDelegate;
            if (recyclerViewAccessibilityDelegate != null) {
                C2549a a = recyclerViewAccessibilityDelegate.m35316a();
                if (a instanceof RecyclerViewAccessibilityDelegate.C3110a) {
                    aVar = ((RecyclerViewAccessibilityDelegate.C3110a) a).m35314a(view);
                } else {
                    aVar = null;
                }
                C2733w0.m36990q0(view, aVar);
            }
            if (z) {
                m35385g(viewHolder);
            }
            viewHolder.mBindingAdapter = null;
            viewHolder.mOwnerRecyclerView = null;
            m35383i().m35409i(viewHolder);
        }

        /* renamed from: c */
        public void m35389c() {
            this.f4700a.clear();
            m35366z();
        }

        /* renamed from: d */
        void m35388d() {
            int size = this.f4702c.size();
            for (int i = 0; i < size; i++) {
                this.f4702c.get(i).clearOldPosition();
            }
            int size2 = this.f4700a.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.f4700a.get(i2).clearOldPosition();
            }
            ArrayList<ViewHolder> arrayList = this.f4701b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    this.f4701b.get(i3).clearOldPosition();
                }
            }
        }

        /* renamed from: e */
        void m35387e() {
            this.f4700a.clear();
            ArrayList<ViewHolder> arrayList = this.f4701b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        /* renamed from: f */
        public int m35386f(int i) {
            if (i < 0 || i >= RecyclerView.this.mState.m35352b()) {
                throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + RecyclerView.this.mState.m35352b() + RecyclerView.this.exceptionLabel());
            } else if (!RecyclerView.this.mState.m35349e()) {
                return i;
            } else {
                return RecyclerView.this.mAdapterHelper.m35690m(i);
            }
        }

        /* renamed from: g */
        void m35385g(ViewHolder viewHolder) {
            RecyclerListener recyclerListener = RecyclerView.this.mRecyclerListener;
            if (recyclerListener != null) {
                recyclerListener.m35365a(viewHolder);
            }
            int size = RecyclerView.this.mRecyclerListeners.size();
            for (int i = 0; i < size; i++) {
                RecyclerView.this.mRecyclerListeners.get(i).m35365a(viewHolder);
            }
            Adapter adapter = RecyclerView.this.mAdapter;
            if (adapter != null) {
                adapter.onViewRecycled(viewHolder);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mState != null) {
                recyclerView.mViewInfoStore.m35178q(viewHolder);
            }
        }

        /* renamed from: h */
        ViewHolder m35384h(int i) {
            int size;
            int m;
            ArrayList<ViewHolder> arrayList = this.f4701b;
            if (!(arrayList == null || (size = arrayList.size()) == 0)) {
                for (int i2 = 0; i2 < size; i2++) {
                    ViewHolder viewHolder = this.f4701b.get(i2);
                    if (!viewHolder.wasReturnedFromScrap() && viewHolder.getLayoutPosition() == i) {
                        viewHolder.addFlags(32);
                        return viewHolder;
                    }
                }
                if (RecyclerView.this.mAdapter.hasStableIds() && (m = RecyclerView.this.mAdapterHelper.m35690m(i)) > 0 && m < RecyclerView.this.mAdapter.getItemCount()) {
                    long itemId = RecyclerView.this.mAdapter.getItemId(m);
                    for (int i3 = 0; i3 < size; i3++) {
                        ViewHolder viewHolder2 = this.f4701b.get(i3);
                        if (!viewHolder2.wasReturnedFromScrap() && viewHolder2.getItemId() == itemId) {
                            viewHolder2.addFlags(32);
                            return viewHolder2;
                        }
                    }
                }
            }
            return null;
        }

        /* renamed from: i */
        RecycledViewPool m35383i() {
            if (this.f4706g == null) {
                this.f4706g = new RecycledViewPool();
            }
            return this.f4706g;
        }

        /* renamed from: j */
        int m35382j() {
            return this.f4700a.size();
        }

        /* renamed from: k */
        public List<ViewHolder> m35381k() {
            return this.f4703d;
        }

        /* renamed from: l */
        ViewHolder m35380l(long j, int i, boolean z) {
            for (int size = this.f4700a.size() - 1; size >= 0; size--) {
                ViewHolder viewHolder = this.f4700a.get(size);
                if (viewHolder.getItemId() == j && !viewHolder.wasReturnedFromScrap()) {
                    if (i == viewHolder.getItemViewType()) {
                        viewHolder.addFlags(32);
                        if (viewHolder.isRemoved() && !RecyclerView.this.mState.m35349e()) {
                            viewHolder.setFlags(2, 14);
                        }
                        return viewHolder;
                    } else if (!z) {
                        this.f4700a.remove(size);
                        RecyclerView.this.removeDetachedView(viewHolder.itemView, false);
                        m35367y(viewHolder.itemView);
                    }
                }
            }
            int size2 = this.f4702c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                ViewHolder viewHolder2 = this.f4702c.get(size2);
                if (viewHolder2.getItemId() == j && !viewHolder2.isAttachedToTransitionOverlay()) {
                    if (i == viewHolder2.getItemViewType()) {
                        if (!z) {
                            this.f4702c.remove(size2);
                        }
                        return viewHolder2;
                    } else if (!z) {
                        m35404A(size2);
                        return null;
                    }
                }
            }
        }

        /* renamed from: m */
        ViewHolder m35379m(int i, boolean z) {
            View e;
            int size = this.f4700a.size();
            for (int i2 = 0; i2 < size; i2++) {
                ViewHolder viewHolder = this.f4700a.get(i2);
                if (!viewHolder.wasReturnedFromScrap() && viewHolder.getLayoutPosition() == i && !viewHolder.isInvalid() && (RecyclerView.this.mState.f4725h || !viewHolder.isRemoved())) {
                    viewHolder.addFlags(32);
                    return viewHolder;
                }
            }
            if (z || (e = RecyclerView.this.mChildHelper.m35671e(i)) == null) {
                int size2 = this.f4702c.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ViewHolder viewHolder2 = this.f4702c.get(i3);
                    if (!viewHolder2.isInvalid() && viewHolder2.getLayoutPosition() == i && !viewHolder2.isAttachedToTransitionOverlay()) {
                        if (!z) {
                            this.f4702c.remove(i3);
                        }
                        return viewHolder2;
                    }
                }
                return null;
            }
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(e);
            RecyclerView.this.mChildHelper.m35657s(e);
            int m = RecyclerView.this.mChildHelper.m35663m(e);
            if (m != -1) {
                RecyclerView.this.mChildHelper.m35672d(m);
                m35401D(e);
                childViewHolderInt.addFlags(8224);
                return childViewHolderInt;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + childViewHolderInt + RecyclerView.this.exceptionLabel());
        }

        /* renamed from: n */
        View m35378n(int i) {
            return this.f4700a.get(i).itemView;
        }

        /* renamed from: o */
        public View m35377o(int i) {
            return m35376p(i, false);
        }

        /* renamed from: p */
        View m35376p(int i, boolean z) {
            return m35396I(i, z, RecyclerView.FOREVER_NS).itemView;
        }

        /* renamed from: s */
        void m35373s() {
            int size = this.f4702c.size();
            for (int i = 0; i < size; i++) {
                C3109i iVar = (C3109i) this.f4702c.get(i).itemView.getLayoutParams();
                if (iVar != null) {
                    iVar.f4751m = true;
                }
            }
        }

        /* renamed from: t */
        void m35372t() {
            int size = this.f4702c.size();
            for (int i = 0; i < size; i++) {
                ViewHolder viewHolder = this.f4702c.get(i);
                if (viewHolder != null) {
                    viewHolder.addFlags(6);
                    viewHolder.addChangePayload(null);
                }
            }
            Adapter adapter = RecyclerView.this.mAdapter;
            if (adapter == null || !adapter.hasStableIds()) {
                m35366z();
            }
        }

        /* renamed from: u */
        void m35371u(int i, int i2) {
            int size = this.f4702c.size();
            for (int i3 = 0; i3 < size; i3++) {
                ViewHolder viewHolder = this.f4702c.get(i3);
                if (viewHolder != null && viewHolder.mPosition >= i) {
                    viewHolder.offsetPosition(i2, false);
                }
            }
        }

        /* renamed from: v */
        void m35370v(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            if (i < i2) {
                i5 = -1;
                i4 = i;
                i3 = i2;
            } else {
                i5 = 1;
                i3 = i;
                i4 = i2;
            }
            int size = this.f4702c.size();
            for (int i7 = 0; i7 < size; i7++) {
                ViewHolder viewHolder = this.f4702c.get(i7);
                if (viewHolder != null && (i6 = viewHolder.mPosition) >= i4 && i6 <= i3) {
                    if (i6 == i) {
                        viewHolder.offsetPosition(i2 - i, false);
                    } else {
                        viewHolder.offsetPosition(i5, false);
                    }
                }
            }
        }

        /* renamed from: w */
        void m35369w(int i, int i2, boolean z) {
            int i3 = i + i2;
            for (int size = this.f4702c.size() - 1; size >= 0; size--) {
                ViewHolder viewHolder = this.f4702c.get(size);
                if (viewHolder != null) {
                    int i4 = viewHolder.mPosition;
                    if (i4 >= i3) {
                        viewHolder.offsetPosition(-i2, z);
                    } else if (i4 >= i) {
                        viewHolder.addFlags(8);
                        m35404A(size);
                    }
                }
            }
        }

        /* renamed from: x */
        void m35368x(Adapter adapter, Adapter adapter2, boolean z) {
            m35389c();
            m35383i().m35410h(adapter, adapter2, z);
        }

        /* renamed from: y */
        void m35367y(View view) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.mScrapContainer = null;
            childViewHolderInt.mInChangeScrap = false;
            childViewHolderInt.clearReturnedFromScrapFlag();
            m35402C(childViewHolderInt);
        }

        /* renamed from: z */
        void m35366z() {
            for (int size = this.f4702c.size() - 1; size >= 0; size--) {
                m35404A(size);
            }
            this.f4702c.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                RecyclerView.this.mPrefetchRegistry.m35637b();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface RecyclerListener {
        /* renamed from: a */
        void m35365a(ViewHolder viewHolder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class RecyclerViewDataObserver extends AdapterDataObserver {
        RecyclerViewDataObserver() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: a */
        public void mo34633a() {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mState.f4724g = true;
            recyclerView.processDataSetCompletelyChanged(true);
            if (!RecyclerView.this.mAdapterHelper.m35687p()) {
                RecyclerView.this.requestLayout();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: c */
        public void mo34658c(int i, int i2, Object obj) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.m35685r(i, i2, obj)) {
                m35363h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: d */
        public void mo34657d(int i, int i2) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.m35684s(i, i2)) {
                m35363h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: e */
        public void mo34656e(int i, int i2, int i3) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.m35683t(i, i2, i3)) {
                m35363h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: f */
        public void mo34655f(int i, int i2) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.m35682u(i, i2)) {
                m35363h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: g */
        public void mo35364g() {
            Adapter adapter;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mPendingSavedState != null && (adapter = recyclerView.mAdapter) != null && adapter.canRestoreState()) {
                RecyclerView.this.requestLayout();
            }
        }

        /* renamed from: h */
        void m35363h() {
            if (RecyclerView.POST_UPDATES_ON_ANIMATION) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mHasFixedSize && recyclerView.mIsAttached) {
                    C2733w0.m37006i0(recyclerView, recyclerView.mUpdateChildViewsRunnable);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.mAdapterUpdateDuringMeasure = true;
            recyclerView2.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class SmoothScroller {
        private LayoutManager mLayoutManager;
        private boolean mPendingInitialRun;
        private RecyclerView mRecyclerView;
        private boolean mRunning;
        private boolean mStarted;
        private View mTargetView;
        private int mTargetPosition = -1;
        private final Action mRecyclingAction = new Action(0, 0);

        /* loaded from: classes.dex */
        public static class Action {

            /* renamed from: a */
            private int f4711a;

            /* renamed from: b */
            private int f4712b;

            /* renamed from: c */
            private int f4713c;

            /* renamed from: d */
            private int f4714d;

            /* renamed from: e */
            private Interpolator f4715e;

            /* renamed from: f */
            private boolean f4716f;

            /* renamed from: g */
            private int f4717g;

            public Action(int i, int i2) {
                this(i, i2, Integer.MIN_VALUE, null);
            }

            /* renamed from: e */
            private void m35354e() {
                if (this.f4715e != null && this.f4713c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else if (this.f4713c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            /* renamed from: a */
            boolean m35358a() {
                return this.f4714d >= 0;
            }

            /* renamed from: b */
            public void m35357b(int i) {
                this.f4714d = i;
            }

            /* renamed from: c */
            void m35356c(RecyclerView recyclerView) {
                int i = this.f4714d;
                if (i >= 0) {
                    this.f4714d = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i);
                    this.f4716f = false;
                } else if (this.f4716f) {
                    m35354e();
                    recyclerView.mViewFlinger.m35341e(this.f4711a, this.f4712b, this.f4713c, this.f4715e);
                    int i2 = this.f4717g + 1;
                    this.f4717g = i2;
                    if (i2 > 10) {
                        Log.e(RecyclerView.TAG, "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f4716f = false;
                } else {
                    this.f4717g = 0;
                }
            }

            /* renamed from: d */
            public void m35355d(int i, int i2, int i3, Interpolator interpolator) {
                this.f4711a = i;
                this.f4712b = i2;
                this.f4713c = i3;
                this.f4715e = interpolator;
                this.f4716f = true;
            }

            public Action(int i, int i2, int i3, Interpolator interpolator) {
                this.f4714d = -1;
                this.f4716f = false;
                this.f4717g = 0;
                this.f4711a = i;
                this.f4712b = i2;
                this.f4713c = i3;
                this.f4715e = interpolator;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$SmoothScroller$a */
        /* loaded from: classes.dex */
        public interface AbstractC3100a {
            /* renamed from: a */
            PointF mo29388a(int i);
        }

        public PointF computeScrollVectorForPosition(int i) {
            LayoutManager layoutManager = getLayoutManager();
            if (layoutManager instanceof AbstractC3100a) {
                return ((AbstractC3100a) layoutManager).mo29388a(i);
            }
            Log.w(RecyclerView.TAG, "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + AbstractC3100a.class.getCanonicalName());
            return null;
        }

        public View findViewByPosition(int i) {
            return this.mRecyclerView.mLayout.mo35490N(i);
        }

        public int getChildCount() {
            return this.mRecyclerView.mLayout.m35477U();
        }

        public int getChildPosition(View view) {
            return this.mRecyclerView.getChildLayoutPosition(view);
        }

        public LayoutManager getLayoutManager() {
            return this.mLayoutManager;
        }

        public int getTargetPosition() {
            return this.mTargetPosition;
        }

        @Deprecated
        public void instantScrollToPosition(int i) {
            this.mRecyclerView.scrollToPosition(i);
        }

        public boolean isPendingInitialRun() {
            return this.mPendingInitialRun;
        }

        public boolean isRunning() {
            return this.mRunning;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public void normalize(PointF pointF) {
            float f = pointF.x;
            float f2 = pointF.y;
            float sqrt = (float) Math.sqrt((f * f) + (f2 * f2));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        void onAnimation(int i, int i2) {
            PointF computeScrollVectorForPosition;
            RecyclerView recyclerView = this.mRecyclerView;
            if (this.mTargetPosition == -1 || recyclerView == null) {
                stop();
            }
            if (this.mPendingInitialRun && this.mTargetView == null && this.mLayoutManager != null && (computeScrollVectorForPosition = computeScrollVectorForPosition(this.mTargetPosition)) != null) {
                float f = computeScrollVectorForPosition.x;
                if (!(f == 0.0f && computeScrollVectorForPosition.y == 0.0f)) {
                    recyclerView.scrollStep((int) Math.signum(f), (int) Math.signum(computeScrollVectorForPosition.y), null);
                }
            }
            this.mPendingInitialRun = false;
            View view = this.mTargetView;
            if (view != null) {
                if (getChildPosition(view) == this.mTargetPosition) {
                    onTargetFound(this.mTargetView, recyclerView.mState, this.mRecyclingAction);
                    this.mRecyclingAction.m35356c(recyclerView);
                    stop();
                } else {
                    Log.e(RecyclerView.TAG, "Passed over target position while smooth scrolling.");
                    this.mTargetView = null;
                }
            }
            if (this.mRunning) {
                onSeekTargetStep(i, i2, recyclerView.mState, this.mRecyclingAction);
                boolean a = this.mRecyclingAction.m35358a();
                this.mRecyclingAction.m35356c(recyclerView);
                if (a && this.mRunning) {
                    this.mPendingInitialRun = true;
                    recyclerView.mViewFlinger.m35342d();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public void onChildAttachedToWindow(View view) {
            if (getChildPosition(view) == getTargetPosition()) {
                this.mTargetView = view;
            }
        }

        protected abstract void onSeekTargetStep(int i, int i2, State state, Action action);

        protected abstract void onStart();

        protected abstract void onStop();

        protected abstract void onTargetFound(View view, State state, Action action);

        public void setTargetPosition(int i) {
            this.mTargetPosition = i;
        }

        void start(RecyclerView recyclerView, LayoutManager layoutManager) {
            recyclerView.mViewFlinger.m35340f();
            if (this.mStarted) {
                Log.w(RecyclerView.TAG, "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.mRecyclerView = recyclerView;
            this.mLayoutManager = layoutManager;
            int i = this.mTargetPosition;
            if (i != -1) {
                recyclerView.mState.f4718a = i;
                this.mRunning = true;
                this.mPendingInitialRun = true;
                this.mTargetView = findViewByPosition(getTargetPosition());
                onStart();
                this.mRecyclerView.mViewFlinger.m35342d();
                this.mStarted = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final void stop() {
            if (this.mRunning) {
                this.mRunning = false;
                onStop();
                this.mRecyclerView.mState.f4718a = -1;
                this.mTargetView = null;
                this.mTargetPosition = -1;
                this.mPendingInitialRun = false;
                this.mLayoutManager.m35448n1(this);
                this.mLayoutManager = null;
                this.mRecyclerView = null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class State {

        /* renamed from: b */
        private SparseArray<Object> f4719b;

        /* renamed from: m */
        int f4730m;

        /* renamed from: n */
        long f4731n;

        /* renamed from: o */
        int f4732o;

        /* renamed from: p */
        int f4733p;

        /* renamed from: q */
        int f4734q;

        /* renamed from: a */
        int f4718a = -1;

        /* renamed from: c */
        int f4720c = 0;

        /* renamed from: d */
        int f4721d = 0;

        /* renamed from: e */
        int f4722e = 1;

        /* renamed from: f */
        int f4723f = 0;

        /* renamed from: g */
        boolean f4724g = false;

        /* renamed from: h */
        boolean f4725h = false;

        /* renamed from: i */
        boolean f4726i = false;

        /* renamed from: j */
        boolean f4727j = false;

        /* renamed from: k */
        boolean f4728k = false;

        /* renamed from: l */
        boolean f4729l = false;

        /* renamed from: a */
        void m35353a(int i) {
            if ((this.f4722e & i) == 0) {
                throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f4722e));
            }
        }

        /* renamed from: b */
        public int m35352b() {
            if (this.f4725h) {
                return this.f4720c - this.f4721d;
            }
            return this.f4723f;
        }

        /* renamed from: c */
        public int m35351c() {
            return this.f4718a;
        }

        /* renamed from: d */
        public boolean m35350d() {
            return this.f4718a != -1;
        }

        /* renamed from: e */
        public boolean m35349e() {
            return this.f4725h;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: f */
        public void m35348f(Adapter adapter) {
            this.f4722e = 1;
            this.f4723f = adapter.getItemCount();
            this.f4725h = false;
            this.f4726i = false;
            this.f4727j = false;
        }

        /* renamed from: g */
        public boolean m35347g() {
            return this.f4729l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f4718a + ", mData=" + this.f4719b + ", mItemCount=" + this.f4723f + ", mIsMeasuring=" + this.f4727j + ", mPreviousLayoutItemCount=" + this.f4720c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f4721d + ", mStructureChanged=" + this.f4724g + ", mInPreLayout=" + this.f4725h + ", mRunSimpleAnimations=" + this.f4728k + ", mRunPredictiveAnimations=" + this.f4729l + '}';
        }
    }

    /* loaded from: classes.dex */
    public static abstract class ViewCacheExtension {
        /* renamed from: a */
        public abstract View m35346a(Recycler recycler, int i, int i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class ViewFlinger implements Runnable {

        /* renamed from: k */
        private int f4735k;

        /* renamed from: l */
        private int f4736l;

        /* renamed from: m */
        OverScroller f4737m;

        /* renamed from: n */
        Interpolator f4738n;

        /* renamed from: o */
        private boolean f4739o = false;

        /* renamed from: p */
        private boolean f4740p = false;

        ViewFlinger() {
            Interpolator interpolator = RecyclerView.sQuinticInterpolator;
            this.f4738n = interpolator;
            this.f4737m = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        /* renamed from: a */
        private int m35345a(int i, int i2) {
            boolean z;
            int i3;
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            if (abs > abs2) {
                z = true;
            } else {
                z = false;
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (z) {
                i3 = recyclerView.getWidth();
            } else {
                i3 = recyclerView.getHeight();
            }
            if (!z) {
                abs = abs2;
            }
            return Math.min((int) (((abs / i3) + 1.0f) * 300.0f), (int) RecyclerView.MAX_SCROLL_DURATION);
        }

        /* renamed from: c */
        private void m35343c() {
            RecyclerView.this.removeCallbacks(this);
            C2733w0.m37006i0(RecyclerView.this, this);
        }

        /* renamed from: b */
        public void m35344b(int i, int i2) {
            RecyclerView.this.setScrollState(2);
            this.f4736l = 0;
            this.f4735k = 0;
            Interpolator interpolator = this.f4738n;
            Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
            if (interpolator != interpolator2) {
                this.f4738n = interpolator2;
                this.f4737m = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f4737m.fling(0, 0, i, i2, Integer.MIN_VALUE, ViewDefaults.NUMBER_OF_LINES, Integer.MIN_VALUE, ViewDefaults.NUMBER_OF_LINES);
            m35342d();
        }

        /* renamed from: d */
        void m35342d() {
            if (this.f4739o) {
                this.f4740p = true;
            } else {
                m35343c();
            }
        }

        /* renamed from: e */
        public void m35341e(int i, int i2, int i3, Interpolator interpolator) {
            if (i3 == Integer.MIN_VALUE) {
                i3 = m35345a(i, i2);
            }
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            if (this.f4738n != interpolator) {
                this.f4738n = interpolator;
                this.f4737m = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f4736l = 0;
            this.f4735k = 0;
            RecyclerView.this.setScrollState(2);
            this.f4737m.startScroll(0, 0, i, i2, i3);
            m35342d();
        }

        /* renamed from: f */
        public void m35340f() {
            RecyclerView.this.removeCallbacks(this);
            this.f4737m.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            int i2;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            int i3;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mLayout == null) {
                m35340f();
                return;
            }
            this.f4740p = false;
            this.f4739o = true;
            recyclerView.consumePendingUpdateOperations();
            OverScroller overScroller = this.f4737m;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i4 = currX - this.f4735k;
                int i5 = currY - this.f4736l;
                this.f4735k = currX;
                this.f4736l = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.dispatchNestedPreScroll(i4, i5, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.mReusableIntPair;
                    i4 -= iArr2[0];
                    i5 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.considerReleasingGlowsOnScroll(i4, i5);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.mAdapter != null) {
                    int[] iArr3 = recyclerView3.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.scrollStep(i4, i5, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.mReusableIntPair;
                    i = iArr4[0];
                    i2 = iArr4[1];
                    i4 -= i;
                    i5 -= i2;
                    SmoothScroller smoothScroller = recyclerView4.mLayout.f4678q;
                    if (smoothScroller != null && !smoothScroller.isPendingInitialRun() && smoothScroller.isRunning()) {
                        int b = RecyclerView.this.mState.m35352b();
                        if (b == 0) {
                            smoothScroller.stop();
                        } else if (smoothScroller.getTargetPosition() >= b) {
                            smoothScroller.setTargetPosition(b - 1);
                            smoothScroller.onAnimation(i, i2);
                        } else {
                            smoothScroller.onAnimation(i, i2);
                        }
                    }
                } else {
                    i2 = 0;
                    i = 0;
                }
                if (!RecyclerView.this.mItemDecorations.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.dispatchNestedScroll(i, i2, i4, i5, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.mReusableIntPair;
                int i6 = i4 - iArr6[0];
                int i7 = i5 - iArr6[1];
                if (!(i == 0 && i2 == 0)) {
                    recyclerView6.dispatchOnScrolled(i, i2);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                if (overScroller.getCurrX() == overScroller.getFinalX()) {
                    z = true;
                } else {
                    z = false;
                }
                if (overScroller.getCurrY() == overScroller.getFinalY()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (overScroller.isFinished() || ((z || i6 != 0) && (z2 || i7 != 0))) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                SmoothScroller smoothScroller2 = RecyclerView.this.mLayout.f4678q;
                if (smoothScroller2 == null || !smoothScroller2.isPendingInitialRun()) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (z4 || !z3) {
                    m35342d();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    GapWorker gapWorker = recyclerView7.mGapWorker;
                    if (gapWorker != null) {
                        gapWorker.m35642f(recyclerView7, i, i2);
                    }
                } else {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i6 < 0) {
                            i3 = -currVelocity;
                        } else if (i6 > 0) {
                            i3 = currVelocity;
                        } else {
                            i3 = 0;
                        }
                        if (i7 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i7 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.absorbGlows(i3, currVelocity);
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        RecyclerView.this.mPrefetchRegistry.m35637b();
                    }
                }
            }
            SmoothScroller smoothScroller3 = RecyclerView.this.mLayout.f4678q;
            if (smoothScroller3 != null && smoothScroller3.isPendingInitialRun()) {
                smoothScroller3.onAnimation(0, 0);
            }
            this.f4739o = false;
            if (this.f4740p) {
                m35343c();
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.stopNestedScroll(1);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class ViewHolder {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        public final View itemView;
        Adapter<? extends ViewHolder> mBindingAdapter;
        int mFlags;
        WeakReference<RecyclerView> mNestedRecyclerView;
        RecyclerView mOwnerRecyclerView;
        int mPosition = -1;
        int mOldPosition = -1;
        long mItemId = -1;
        int mItemViewType = -1;
        int mPreLayoutPosition = -1;
        ViewHolder mShadowedHolder = null;
        ViewHolder mShadowingHolder = null;
        List<Object> mPayloads = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        Recycler mScrapContainer = null;
        boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;
        int mPendingAccessibilityState = -1;

        public ViewHolder(View view) {
            if (view != null) {
                this.itemView = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
            } else if ((1024 & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        void addFlags(int i) {
            this.mFlags = i | this.mFlags;
        }

        void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & 16) == 0 && C2733w0.m37032R(this.itemView);
        }

        void flagRemovedAndOffsetPosition(int i, int i2, boolean z) {
            addFlags(8);
            offsetPosition(i2, z);
            this.mPosition = i;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionInRecyclerView(this);
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        public final Adapter<? extends ViewHolder> getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            Adapter adapter;
            int adapterPositionInRecyclerView;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (adapterPositionInRecyclerView = this.mOwnerRecyclerView.getAdapterPositionInRecyclerView(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, adapterPositionInRecyclerView);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            if (list == null || list.size() == 0) {
                return FULLUPDATE_PAYLOADS;
            }
            return this.mUnmodifiedPayloads;
        }

        boolean hasAnyOfTheFlags(int i) {
            return (i & this.mFlags) != 0;
        }

        boolean isAdapterPositionUnknown() {
            return (this.mFlags & FLAG_ADAPTER_POSITION_UNKNOWN) != 0 || isInvalid();
        }

        boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            if ((this.mFlags & 16) != 0 || C2733w0.m37032R(this.itemView)) {
                return false;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        boolean isScrap() {
            return this.mScrapContainer != null;
        }

        boolean isTmpDetached() {
            return (this.mFlags & 256) != 0;
        }

        boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        void offsetPosition(int i, boolean z) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z) {
                this.mPreLayoutPosition += i;
            }
            this.mPosition += i;
            if (this.itemView.getLayoutParams() != null) {
                ((C3109i) this.itemView.getLayoutParams()).f4751m = true;
            }
        }

        void onEnteredHiddenState(RecyclerView recyclerView) {
            int i = this.mPendingAccessibilityState;
            if (i != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = C2733w0.m36973z(this.itemView);
            }
            recyclerView.setChildImportantForAccessibilityInternal(this, 4);
        }

        void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.setChildImportantForAccessibilityInternal(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        void setFlags(int i, int i2) {
            this.mFlags = (i & i2) | (this.mFlags & (~i2));
        }

        public final void setIsRecyclable(boolean z) {
            int i;
            int i2 = this.mIsRecyclableCount;
            if (z) {
                i = i2 - 1;
            } else {
                i = i2 + 1;
            }
            this.mIsRecyclableCount = i;
            if (i < 0) {
                this.mIsRecyclableCount = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z && i == 1) {
                this.mFlags |= 16;
            } else if (z && i == 0) {
                this.mFlags &= -17;
            }
        }

        void setScrapContainer(Recycler recycler, boolean z) {
            this.mScrapContainer = recycler;
            this.mInChangeScrap = z;
        }

        boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean shouldIgnore() {
            return (this.mFlags & FLAG_IGNORE) != 0;
        }

        void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            String str;
            String str2;
            if (getClass().isAnonymousClass()) {
                str = "ViewHolder";
            } else {
                str = getClass().getSimpleName();
            }
            StringBuilder sb2 = new StringBuilder(str + "{" + Integer.toHexString(hashCode()) + " position=" + this.mPosition + " id=" + this.mItemId + ", oldPos=" + this.mOldPosition + ", pLpos:" + this.mPreLayoutPosition);
            if (isScrap()) {
                sb2.append(" scrap ");
                if (this.mInChangeScrap) {
                    str2 = "[changeScrap]";
                } else {
                    str2 = "[attachedScrap]";
                }
                sb2.append(str2);
            }
            if (isInvalid()) {
                sb2.append(" invalid");
            }
            if (!isBound()) {
                sb2.append(" unbound");
            }
            if (needsUpdate()) {
                sb2.append(" update");
            }
            if (isRemoved()) {
                sb2.append(" removed");
            }
            if (shouldIgnore()) {
                sb2.append(" ignored");
            }
            if (isTmpDetached()) {
                sb2.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb2.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb2.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        void unScrap() {
            this.mScrapContainer.m35395J(this);
        }

        boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a */
    /* loaded from: classes.dex */
    class RunnableC3101a implements Runnable {
        RunnableC3101a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mFirstLayoutComplete && !recyclerView.isLayoutRequested()) {
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.mIsAttached) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.mLayoutSuppressed) {
                    recyclerView2.mLayoutWasDefered = true;
                } else {
                    recyclerView2.consumePendingUpdateOperations();
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b */
    /* loaded from: classes.dex */
    class RunnableC3102b implements Runnable {
        RunnableC3102b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ItemAnimator itemAnimator = RecyclerView.this.mItemAnimator;
            if (itemAnimator != null) {
                itemAnimator.runPendingAnimations();
            }
            RecyclerView.this.mPostedAnimatorRunner = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c  reason: invalid class name */
    /* loaded from: classes.dex */
    class animationInterpolatorC3103c implements Interpolator {
        animationInterpolatorC3103c() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d */
    /* loaded from: classes.dex */
    class C3104d implements ViewInfoStore.ProcessCallback {
        C3104d() {
        }

        @Override // androidx.recyclerview.widget.ViewInfoStore.ProcessCallback
        /* renamed from: a */
        public void mo35177a(ViewHolder viewHolder, ItemAnimator.ItemHolderInfo itemHolderInfo, ItemAnimator.ItemHolderInfo itemHolderInfo2) {
            RecyclerView.this.animateAppearance(viewHolder, itemHolderInfo, itemHolderInfo2);
        }

        @Override // androidx.recyclerview.widget.ViewInfoStore.ProcessCallback
        /* renamed from: b */
        public void mo35176b(ViewHolder viewHolder) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mLayout.m35427v1(viewHolder.itemView, recyclerView.mRecycler);
        }

        @Override // androidx.recyclerview.widget.ViewInfoStore.ProcessCallback
        /* renamed from: c */
        public void mo35175c(ViewHolder viewHolder, ItemAnimator.ItemHolderInfo itemHolderInfo, ItemAnimator.ItemHolderInfo itemHolderInfo2) {
            RecyclerView.this.mRecycler.m35395J(viewHolder);
            RecyclerView.this.animateDisappearance(viewHolder, itemHolderInfo, itemHolderInfo2);
        }

        @Override // androidx.recyclerview.widget.ViewInfoStore.ProcessCallback
        /* renamed from: d */
        public void mo35174d(ViewHolder viewHolder, ItemAnimator.ItemHolderInfo itemHolderInfo, ItemAnimator.ItemHolderInfo itemHolderInfo2) {
            viewHolder.setIsRecyclable(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mDataSetHasChangedAfterLayout) {
                if (recyclerView.mItemAnimator.animateChange(viewHolder, viewHolder, itemHolderInfo, itemHolderInfo2)) {
                    RecyclerView.this.postAnimationRunner();
                }
            } else if (recyclerView.mItemAnimator.animatePersistence(viewHolder, itemHolderInfo, itemHolderInfo2)) {
                RecyclerView.this.postAnimationRunner();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$e */
    /* loaded from: classes.dex */
    public class C3105e implements ChildHelper.AbstractC3066b {
        C3105e() {
        }

        @Override // androidx.recyclerview.widget.ChildHelper.AbstractC3066b
        /* renamed from: a */
        public void mo35339a(View view) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onEnteredHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.ChildHelper.AbstractC3066b
        /* renamed from: b */
        public ViewHolder mo35338b(View view) {
            return RecyclerView.getChildViewHolderInt(view);
        }

        @Override // androidx.recyclerview.widget.ChildHelper.AbstractC3066b
        /* renamed from: c */
        public void mo35337c(int i) {
            ViewHolder childViewHolderInt;
            View childAt = getChildAt(i);
            if (!(childAt == null || (childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt)) == null)) {
                if (!childViewHolderInt.isTmpDetached() || childViewHolderInt.shouldIgnore()) {
                    childViewHolderInt.addFlags(Spliterator.NONNULL);
                } else {
                    throw new IllegalArgumentException("called detach on an already detached child " + childViewHolderInt + RecyclerView.this.exceptionLabel());
                }
            }
            RecyclerView.this.detachViewFromParent(i);
        }

        @Override // androidx.recyclerview.widget.ChildHelper.AbstractC3066b
        /* renamed from: d */
        public void mo35336d(View view, int i) {
            RecyclerView.this.addView(view, i);
            RecyclerView.this.dispatchChildAttached(view);
        }

        @Override // androidx.recyclerview.widget.ChildHelper.AbstractC3066b
        /* renamed from: e */
        public void mo35335e() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                RecyclerView.this.dispatchChildDetached(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.ChildHelper.AbstractC3066b
        /* renamed from: f */
        public int mo35334f(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.ChildHelper.AbstractC3066b
        /* renamed from: g */
        public void mo35333g(View view) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.ChildHelper.AbstractC3066b
        public View getChildAt(int i) {
            return RecyclerView.this.getChildAt(i);
        }

        @Override // androidx.recyclerview.widget.ChildHelper.AbstractC3066b
        public int getChildCount() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.ChildHelper.AbstractC3066b
        /* renamed from: h */
        public void mo35332h(int i) {
            View childAt = RecyclerView.this.getChildAt(i);
            if (childAt != null) {
                RecyclerView.this.dispatchChildDetached(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i);
        }

        @Override // androidx.recyclerview.widget.ChildHelper.AbstractC3066b
        /* renamed from: i */
        public void mo35331i(View view, int i, ViewGroup.LayoutParams layoutParams) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                if (childViewHolderInt.isTmpDetached() || childViewHolderInt.shouldIgnore()) {
                    childViewHolderInt.clearTmpDetachFlag();
                } else {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + childViewHolderInt + RecyclerView.this.exceptionLabel());
                }
            }
            RecyclerView.this.attachViewToParent(view, i, layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$f */
    /* loaded from: classes.dex */
    public class C3106f implements AdapterHelper.AbstractC3063a {
        C3106f() {
        }

        @Override // androidx.recyclerview.widget.AdapterHelper.AbstractC3063a
        /* renamed from: a */
        public void mo35330a(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForMove(i, i2);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.AdapterHelper.AbstractC3063a
        /* renamed from: b */
        public void mo35329b(AdapterHelper.C3064b bVar) {
            m35322i(bVar);
        }

        @Override // androidx.recyclerview.widget.AdapterHelper.AbstractC3063a
        /* renamed from: c */
        public void mo35328c(AdapterHelper.C3064b bVar) {
            m35322i(bVar);
        }

        @Override // androidx.recyclerview.widget.AdapterHelper.AbstractC3063a
        /* renamed from: d */
        public void mo35327d(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForRemove(i, i2, false);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.AdapterHelper.AbstractC3063a
        /* renamed from: e */
        public void mo35326e(int i, int i2, Object obj) {
            RecyclerView.this.viewRangeUpdate(i, i2, obj);
            RecyclerView.this.mItemsChanged = true;
        }

        @Override // androidx.recyclerview.widget.AdapterHelper.AbstractC3063a
        /* renamed from: f */
        public ViewHolder mo35325f(int i) {
            ViewHolder findViewHolderForPosition = RecyclerView.this.findViewHolderForPosition(i, true);
            if (findViewHolderForPosition != null && !RecyclerView.this.mChildHelper.m35662n(findViewHolderForPosition.itemView)) {
                return findViewHolderForPosition;
            }
            return null;
        }

        @Override // androidx.recyclerview.widget.AdapterHelper.AbstractC3063a
        /* renamed from: g */
        public void mo35324g(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForInsert(i, i2);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.AdapterHelper.AbstractC3063a
        /* renamed from: h */
        public void mo35323h(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForRemove(i, i2, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mItemsAddedOrRemoved = true;
            recyclerView.mState.f4721d += i2;
        }

        /* renamed from: i */
        void m35322i(AdapterHelper.C3064b bVar) {
            int i = bVar.f4528a;
            if (i == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.mLayout.mo29390Z0(recyclerView, bVar.f4529b, bVar.f4531d);
            } else if (i == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.mLayout.mo29384c1(recyclerView2, bVar.f4529b, bVar.f4531d);
            } else if (i == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.mLayout.mo29380e1(recyclerView3, bVar.f4529b, bVar.f4531d, bVar.f4530c);
            } else if (i == 8) {
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.mLayout.mo29386b1(recyclerView4, bVar.f4529b, bVar.f4531d, 1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$g */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C3107g {

        /* renamed from: a */
        static final /* synthetic */ int[] f4747a;

        static {
            int[] iArr = new int[Adapter.StateRestorationPolicy.values().length];
            f4747a = iArr;
            try {
                iArr[Adapter.StateRestorationPolicy.PREVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4747a[Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$h */
    /* loaded from: classes.dex */
    private class C3108h implements ItemAnimator.ItemAnimatorListener {
        C3108h() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemAnimatorListener
        /* renamed from: a */
        public void mo35321a(ViewHolder viewHolder) {
            viewHolder.setIsRecyclable(true);
            if (viewHolder.mShadowedHolder != null && viewHolder.mShadowingHolder == null) {
                viewHolder.mShadowedHolder = null;
            }
            viewHolder.mShadowingHolder = null;
            if (!viewHolder.shouldBeKeptAsChild() && !RecyclerView.this.removeAnimatingView(viewHolder.itemView) && viewHolder.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(viewHolder.itemView, false);
            }
        }
    }

    static {
        Class<?> cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    private void addAnimatingView(ViewHolder viewHolder) {
        boolean z;
        View view = viewHolder.itemView;
        if (view.getParent() == this) {
            z = true;
        } else {
            z = false;
        }
        this.mRecycler.m35395J(getChildViewHolder(view));
        if (viewHolder.isTmpDetached()) {
            this.mChildHelper.m35673c(view, -1, view.getLayoutParams(), true);
        } else if (!z) {
            this.mChildHelper.m35674b(view, true);
        } else {
            this.mChildHelper.m35665k(view);
        }
    }

    private void animateChange(ViewHolder viewHolder, ViewHolder viewHolder2, ItemAnimator.ItemHolderInfo itemHolderInfo, ItemAnimator.ItemHolderInfo itemHolderInfo2, boolean z, boolean z2) {
        viewHolder.setIsRecyclable(false);
        if (z) {
            addAnimatingView(viewHolder);
        }
        if (viewHolder != viewHolder2) {
            if (z2) {
                addAnimatingView(viewHolder2);
            }
            viewHolder.mShadowedHolder = viewHolder2;
            addAnimatingView(viewHolder);
            this.mRecycler.m35395J(viewHolder);
            viewHolder2.setIsRecyclable(false);
            viewHolder2.mShadowingHolder = viewHolder;
        }
        if (this.mItemAnimator.animateChange(viewHolder, viewHolder2, itemHolderInfo, itemHolderInfo2)) {
            postAnimationRunner();
        }
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    static void clearNestedRecyclerViewIfNotNested(ViewHolder viewHolder) {
        WeakReference<RecyclerView> weakReference = viewHolder.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView != viewHolder.itemView) {
                    ViewParent parent = recyclerView.getParent();
                    if (parent instanceof View) {
                        recyclerView = (View) parent;
                    } else {
                        recyclerView = null;
                    }
                } else {
                    return;
                }
            }
            viewHolder.mNestedRecyclerView = null;
        }
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i, int i2) {
        ClassLoader classLoader;
        Object[] objArr;
        Constructor constructor;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String fullClassName = getFullClassName(context, trim);
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(fullClassName, false, classLoader).asSubclass(LayoutManager.class);
                    try {
                        constructor = asSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
                    } catch (NoSuchMethodException e) {
                        try {
                            constructor = asSubclass.getConstructor(new Class[0]);
                            objArr = null;
                        } catch (NoSuchMethodException e2) {
                            e2.initCause(e);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + fullClassName, e2);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((LayoutManager) constructor.newInstance(objArr));
                } catch (ClassCastException e3) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + fullClassName, e3);
                } catch (ClassNotFoundException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + fullClassName, e4);
                } catch (IllegalAccessException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + fullClassName, e5);
                } catch (InstantiationException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e6);
                } catch (InvocationTargetException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e7);
                }
            }
        }
    }

    private boolean didChildRangeChange(int i, int i2) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        if (iArr[0] == i && iArr[1] == i2) {
            return false;
        }
        return true;
    }

    private void dispatchContentChangedIfNecessary() {
        int i = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i != 0 && isAccessibilityEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(ItemAnimator.FLAG_MOVED);
            C2572b.m37324b(obtain, i);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    private void dispatchLayoutStep1() {
        boolean z = true;
        this.mState.m35353a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.f4727j = false;
        startInterceptRequestLayout();
        this.mViewInfoStore.m35189f();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        State state = this.mState;
        if (!state.f4728k || !this.mItemsChanged) {
            z = false;
        }
        state.f4726i = z;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        state.f4725h = state.f4729l;
        state.f4723f = this.mAdapter.getItemCount();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.f4728k) {
            int g = this.mChildHelper.m35669g();
            for (int i = 0; i < g; i++) {
                ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m35670f(i));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.hasStableIds())) {
                    this.mViewInfoStore.m35190e(childViewHolderInt, this.mItemAnimator.recordPreLayoutInformation(this.mState, childViewHolderInt, ItemAnimator.buildAdapterChangeFlagsForAnimations(childViewHolderInt), childViewHolderInt.getUnmodifiedPayloads()));
                    if (this.mState.f4726i && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.m35192c(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.f4729l) {
            saveOldPositions();
            State state2 = this.mState;
            boolean z2 = state2.f4724g;
            state2.f4724g = false;
            this.mLayout.mo29378f1(this.mRecycler, state2);
            this.mState.f4724g = z2;
            for (int i2 = 0; i2 < this.mChildHelper.m35669g(); i2++) {
                ViewHolder childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.m35670f(i2));
                if (!childViewHolderInt2.shouldIgnore() && !this.mViewInfoStore.m35186i(childViewHolderInt2)) {
                    int buildAdapterChangeFlagsForAnimations = ItemAnimator.buildAdapterChangeFlagsForAnimations(childViewHolderInt2);
                    boolean hasAnyOfTheFlags = childViewHolderInt2.hasAnyOfTheFlags(8192);
                    if (!hasAnyOfTheFlags) {
                        buildAdapterChangeFlagsForAnimations |= 4096;
                    }
                    ItemAnimator.ItemHolderInfo recordPreLayoutInformation = this.mItemAnimator.recordPreLayoutInformation(this.mState, childViewHolderInt2, buildAdapterChangeFlagsForAnimations, childViewHolderInt2.getUnmodifiedPayloads());
                    if (hasAnyOfTheFlags) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, recordPreLayoutInformation);
                    } else {
                        this.mViewInfoStore.m35194a(childViewHolderInt2, recordPreLayoutInformation);
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f4722e = 2;
    }

    private void dispatchLayoutStep2() {
        boolean z;
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.m35353a(6);
        this.mAdapterHelper.m35693j();
        this.mState.f4723f = this.mAdapter.getItemCount();
        this.mState.f4721d = 0;
        if (this.mPendingSavedState != null && this.mAdapter.canRestoreState()) {
            Parcelable parcelable = this.mPendingSavedState.f4710m;
            if (parcelable != null) {
                this.mLayout.mo29371k1(parcelable);
            }
            this.mPendingSavedState = null;
        }
        State state = this.mState;
        state.f4725h = false;
        this.mLayout.mo29378f1(this.mRecycler, state);
        State state2 = this.mState;
        state2.f4724g = false;
        if (!state2.f4728k || this.mItemAnimator == null) {
            z = false;
        } else {
            z = true;
        }
        state2.f4728k = z;
        state2.f4722e = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    private void dispatchLayoutStep3() {
        this.mState.m35353a(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        State state = this.mState;
        state.f4722e = 1;
        if (state.f4728k) {
            for (int g = this.mChildHelper.m35669g() - 1; g >= 0; g--) {
                ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m35670f(g));
                if (!childViewHolderInt.shouldIgnore()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    ItemAnimator.ItemHolderInfo recordPostLayoutInformation = this.mItemAnimator.recordPostLayoutInformation(this.mState, childViewHolderInt);
                    ViewHolder g2 = this.mViewInfoStore.m35188g(changedHolderKey);
                    if (g2 == null || g2.shouldIgnore()) {
                        this.mViewInfoStore.m35191d(childViewHolderInt, recordPostLayoutInformation);
                    } else {
                        boolean h = this.mViewInfoStore.m35187h(g2);
                        boolean h2 = this.mViewInfoStore.m35187h(childViewHolderInt);
                        if (!h || g2 != childViewHolderInt) {
                            ItemAnimator.ItemHolderInfo n = this.mViewInfoStore.m35181n(g2);
                            this.mViewInfoStore.m35191d(childViewHolderInt, recordPostLayoutInformation);
                            ItemAnimator.ItemHolderInfo m = this.mViewInfoStore.m35182m(childViewHolderInt);
                            if (n == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, g2);
                            } else {
                                animateChange(g2, childViewHolderInt, n, m, h, h2);
                            }
                        } else {
                            this.mViewInfoStore.m35191d(childViewHolderInt, recordPostLayoutInformation);
                        }
                    }
                }
            }
            this.mViewInfoStore.m35180o(this.mViewInfoProcessCallback);
        }
        this.mLayout.m35429u1(this.mRecycler);
        State state2 = this.mState;
        state2.f4720c = state2.f4723f;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        state2.f4728k = false;
        state2.f4729l = false;
        this.mLayout.f4679r = false;
        ArrayList<ViewHolder> arrayList = this.mRecycler.f4701b;
        if (arrayList != null) {
            arrayList.clear();
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager.f4685x) {
            layoutManager.f4684w = 0;
            layoutManager.f4685x = false;
            this.mRecycler.m35394K();
        }
        this.mLayout.mo29376g1(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mViewInfoStore.m35189f();
        int[] iArr = this.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        OnItemTouchListener onItemTouchListener = this.mInterceptingOnItemTouchListener;
        if (onItemTouchListener != null) {
            onItemTouchListener.onTouchEvent(this, motionEvent);
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.mInterceptingOnItemTouchListener = null;
            }
            return true;
        } else if (motionEvent.getAction() == 0) {
            return false;
        } else {
            return findInterceptingOnItemTouchListener(motionEvent);
        }
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            OnItemTouchListener onItemTouchListener = this.mOnItemTouchListeners.get(i);
            if (onItemTouchListener.onInterceptTouchEvent(this, motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = onItemTouchListener;
                return true;
            }
        }
        return false;
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int g = this.mChildHelper.m35669g();
        if (g == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = ViewDefaults.NUMBER_OF_LINES;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < g; i3++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m35670f(i3));
            if (!childViewHolderInt.shouldIgnore()) {
                int layoutPosition = childViewHolderInt.getLayoutPosition();
                if (layoutPosition < i) {
                    i = layoutPosition;
                }
                if (layoutPosition > i2) {
                    i2 = layoutPosition;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    static RecyclerView findNestedRecyclerView(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView findNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i));
            if (findNestedRecyclerView != null) {
                return findNestedRecyclerView;
            }
        }
        return null;
    }

    private View findNextViewToFocus() {
        ViewHolder findViewHolderForAdapterPosition;
        State state = this.mState;
        int i = state.f4730m;
        if (i == -1) {
            i = 0;
        }
        int b = state.m35352b();
        for (int i2 = i; i2 < b; i2++) {
            ViewHolder findViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i2);
            if (findViewHolderForAdapterPosition2 == null) {
                break;
            } else if (findViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                return findViewHolderForAdapterPosition2.itemView;
            }
        }
        int min = Math.min(b, i);
        while (true) {
            min--;
            if (min < 0 || (findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(min)) == null) {
                return null;
            }
            if (findViewHolderForAdapterPosition.itemView.hasFocusable()) {
                return findViewHolderForAdapterPosition.itemView;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ViewHolder getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((C3109i) view.getLayoutParams()).f4749k;
    }

    static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        C3109i iVar = (C3109i) view.getLayoutParams();
        Rect rect2 = iVar.f4750l;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) iVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) iVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) iVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) iVar).bottomMargin);
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id2 = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id2 = view.getId();
            }
        }
        return id2;
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(".")) {
            return str;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + str;
        }
    }

    private NestedScrollingChildHelper getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new NestedScrollingChildHelper(this);
        }
        return this.mScrollingChildHelper;
    }

    private void handleMissingPreInfoForChangeError(long j, ViewHolder viewHolder, ViewHolder viewHolder2) {
        int g = this.mChildHelper.m35669g();
        for (int i = 0; i < g; i++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m35670f(i));
            if (childViewHolderInt != viewHolder && getChangedHolderKey(childViewHolderInt) == j) {
                Adapter adapter = this.mAdapter;
                if (adapter == null || !adapter.hasStableIds()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + viewHolder + exceptionLabel());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + viewHolder + exceptionLabel());
            }
        }
        Log.e(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + viewHolder2 + " cannot be found but it is necessary for " + viewHolder + exceptionLabel());
    }

    private boolean hasUpdatedView() {
        int g = this.mChildHelper.m35669g();
        for (int i = 0; i < g; i++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m35670f(i));
            if (!(childViewHolderInt == null || childViewHolderInt.shouldIgnore() || !childViewHolderInt.isUpdated())) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    private void initAutofill() {
        if (C2733w0.m37065A(this) == 0) {
            C2733w0.m37062B0(this, 8);
        }
    }

    private void initChildrenHelper() {
        this.mChildHelper = new ChildHelper(new C3105e());
    }

    private boolean isPreferredNextFocus(View view, View view2, int i) {
        int i2;
        int i3;
        if (view2 == null || view2 == this || view2 == view || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        char c = 65535;
        if (this.mLayout.m35454k0() == 1) {
            i2 = -1;
        } else {
            i2 = 1;
        }
        Rect rect = this.mTempRect;
        int i4 = rect.left;
        Rect rect2 = this.mTempRect2;
        int i5 = rect2.left;
        if ((i4 < i5 || rect.right <= i5) && rect.right < rect2.right) {
            i3 = 1;
        } else {
            int i6 = rect.right;
            int i7 = rect2.right;
            if ((i6 > i7 || i4 >= i7) && i4 > i5) {
                i3 = -1;
            } else {
                i3 = 0;
            }
        }
        int i8 = rect.top;
        int i9 = rect2.top;
        if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
            c = 1;
        } else {
            int i10 = rect.bottom;
            int i11 = rect2.bottom;
            if ((i10 <= i11 && i8 < i11) || i8 <= i9) {
                c = 0;
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i != 130) {
                                throw new IllegalArgumentException("Invalid direction: " + i + exceptionLabel());
                            } else if (c > 0) {
                                return true;
                            } else {
                                return false;
                            }
                        } else if (i3 > 0) {
                            return true;
                        } else {
                            return false;
                        }
                    } else if (c < 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else if (i3 < 0) {
                    return true;
                } else {
                    return false;
                }
            } else if (c > 0 || (c == 0 && i3 * i2 > 0)) {
                return true;
            } else {
                return false;
            }
        } else if (c < 0 || (c == 0 && i3 * i2 < 0)) {
            return true;
        } else {
            return false;
        }
    }

    private void nestedScrollByInternal(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.mLayoutSuppressed) {
            int[] iArr = this.mReusableIntPair;
            int i8 = 0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean v = layoutManager.mo29358v();
            boolean w = this.mLayout.mo29356w();
            if (w) {
                i4 = v | 2;
            } else {
                i4 = v;
            }
            startNestedScroll(i4, i3);
            if (v) {
                i5 = i;
            } else {
                i5 = 0;
            }
            if (w) {
                i6 = i2;
            } else {
                i6 = 0;
            }
            if (dispatchNestedPreScroll(i5, i6, this.mReusableIntPair, this.mScrollOffset, i3)) {
                int[] iArr2 = this.mReusableIntPair;
                i -= iArr2[0];
                i2 -= iArr2[1];
            }
            if (v) {
                i7 = i;
            } else {
                i7 = 0;
            }
            if (w) {
                i8 = i2;
            }
            scrollByInternal(i7, i8, motionEvent, i3);
            GapWorker gapWorker = this.mGapWorker;
            if (!(gapWorker == null || (i == 0 && i2 == 0))) {
                gapWorker.m35642f(this, i, i2);
            }
            stopNestedScroll(i3);
        }
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.mScrollPointerId = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.mo35286U1();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.mDataSetHasChangedAfterLayout) {
            this.mAdapterHelper.m35678y();
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.mo35274a1(this);
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.m35680w();
        } else {
            this.mAdapterHelper.m35693j();
        }
        boolean z4 = false;
        if (this.mItemsAddedOrRemoved || this.mItemsChanged) {
            z = true;
        } else {
            z = false;
        }
        State state = this.mState;
        if (!this.mFirstLayoutComplete || this.mItemAnimator == null || ((!(z3 = this.mDataSetHasChangedAfterLayout) && !z && !this.mLayout.f4679r) || (z3 && !this.mAdapter.hasStableIds()))) {
            z2 = false;
        } else {
            z2 = true;
        }
        state.f4728k = z2;
        State state2 = this.mState;
        if (state2.f4728k && z && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled()) {
            z4 = true;
        }
        state2.f4729l = z4;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void pullGlows(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            if (r1 >= 0) goto L_0x0021
            r6.ensureLeftGlow()
            android.widget.EdgeEffect r1 = r6.mLeftGlow
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r2 - r9
            androidx.core.widget.C2790e.m36718c(r1, r4, r9)
        L_0x001f:
            r9 = r3
            goto L_0x003c
        L_0x0021:
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x003b
            r6.ensureRightGlow()
            android.widget.EdgeEffect r1 = r6.mRightGlow
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            androidx.core.widget.C2790e.m36718c(r1, r4, r9)
            goto L_0x001f
        L_0x003b:
            r9 = 0
        L_0x003c:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L_0x0056
            r6.ensureTopGlow()
            android.widget.EdgeEffect r9 = r6.mTopGlow
            float r1 = -r10
            int r2 = r6.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            int r2 = r6.getWidth()
            float r2 = (float) r2
            float r7 = r7 / r2
            androidx.core.widget.C2790e.m36718c(r9, r1, r7)
            goto L_0x0072
        L_0x0056:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x0071
            r6.ensureBottomGlow()
            android.widget.EdgeEffect r9 = r6.mBottomGlow
            int r1 = r6.getHeight()
            float r1 = (float) r1
            float r1 = r10 / r1
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r2 = r2 - r7
            androidx.core.widget.C2790e.m36718c(r9, r1, r2)
            goto L_0x0072
        L_0x0071:
            r3 = r9
        L_0x0072:
            if (r3 != 0) goto L_0x007c
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L_0x007c
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 == 0) goto L_0x007f
        L_0x007c:
            androidx.core.view.C2733w0.m37008h0(r6)
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.pullGlows(float, float, float, float):void");
    }

    private void recoverFocusFromState() {
        ViewHolder viewHolder;
        View findViewById;
        if (this.mPreserveFocusAfterLayout && this.mAdapter != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() != 131072 || !isFocused()) {
                if (!isFocused()) {
                    View focusedChild = getFocusedChild();
                    if (!IGNORE_DETACHED_FOCUSED_CHILD || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                        if (!this.mChildHelper.m35662n(focusedChild)) {
                            return;
                        }
                    } else if (this.mChildHelper.m35669g() == 0) {
                        requestFocus();
                        return;
                    }
                }
                View view = null;
                if (this.mState.f4731n == -1 || !this.mAdapter.hasStableIds()) {
                    viewHolder = null;
                } else {
                    viewHolder = findViewHolderForItemId(this.mState.f4731n);
                }
                if (viewHolder != null && !this.mChildHelper.m35662n(viewHolder.itemView) && viewHolder.itemView.hasFocusable()) {
                    view = viewHolder.itemView;
                } else if (this.mChildHelper.m35669g() > 0) {
                    view = findNextViewToFocus();
                }
                if (view != null) {
                    int i = this.mState.f4732o;
                    if (!(i == -1 || (findViewById = view.findViewById(i)) == null || !findViewById.isFocusable())) {
                        view = findViewById;
                    }
                    view.requestFocus();
                }
            }
        }
    }

    private void releaseGlows() {
        boolean z;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.mLeftGlow.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.mBottomGlow.isFinished();
        }
        if (z) {
            C2733w0.m37008h0(this);
        }
    }

    private void requestChildOnScreen(View view, View view2) {
        View view3;
        boolean z;
        if (view2 != null) {
            view3 = view2;
        } else {
            view3 = view;
        }
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C3109i) {
            C3109i iVar = (C3109i) layoutParams;
            if (!iVar.f4751m) {
                Rect rect = iVar.f4750l;
                Rect rect2 = this.mTempRect;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        LayoutManager layoutManager = this.mLayout;
        Rect rect3 = this.mTempRect;
        boolean z2 = !this.mFirstLayoutComplete;
        if (view2 == null) {
            z = true;
        } else {
            z = false;
        }
        layoutManager.mo34654B1(this, view, rect3, z2, z);
    }

    private void resetFocusInfo() {
        State state = this.mState;
        state.f4731n = -1L;
        state.f4730m = -1;
        state.f4732o = -1;
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void saveFocusInfo() {
        View view;
        long j;
        int i;
        ViewHolder viewHolder = null;
        if (!this.mPreserveFocusAfterLayout || !hasFocus() || this.mAdapter == null) {
            view = null;
        } else {
            view = getFocusedChild();
        }
        if (view != null) {
            viewHolder = findContainingViewHolder(view);
        }
        if (viewHolder == null) {
            resetFocusInfo();
            return;
        }
        State state = this.mState;
        if (this.mAdapter.hasStableIds()) {
            j = viewHolder.getItemId();
        } else {
            j = -1;
        }
        state.f4731n = j;
        State state2 = this.mState;
        if (this.mDataSetHasChangedAfterLayout) {
            i = -1;
        } else if (viewHolder.isRemoved()) {
            i = viewHolder.mOldPosition;
        } else {
            i = viewHolder.getAbsoluteAdapterPosition();
        }
        state2.f4730m = i;
        this.mState.f4732o = getDeepestFocusedViewWithId(viewHolder.itemView);
    }

    private void setAdapterInternal(Adapter adapter, boolean z, boolean z2) {
        Adapter adapter2 = this.mAdapter;
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z || z2) {
            removeAndRecycleViews();
        }
        this.mAdapterHelper.m35678y();
        Adapter adapter3 = this.mAdapter;
        this.mAdapter = adapter;
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.mObserver);
            adapter.onAttachedToRecyclerView(this);
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.mo29411M0(adapter3, this.mAdapter);
        }
        this.mRecycler.m35368x(adapter3, this.mAdapter, z);
        this.mState.f4724g = true;
    }

    private void stopScrollersInternal() {
        this.mViewFlinger.m35340f();
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.m35478T1();
        }
    }

    void absorbGlows(int i, int i2) {
        if (i < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i);
            }
        } else if (i > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i);
            }
        }
        if (i2 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i2);
            }
        }
        if (i != 0 || i2 != 0) {
            C2733w0.m37008h0(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null || !layoutManager.m35489N0(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    public void addItemDecoration(ItemDecoration itemDecoration, int i) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.mo35254r("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.mItemDecorations.add(itemDecoration);
        } else {
            this.mItemDecorations.add(i, itemDecoration);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(OnChildAttachStateChangeListener onChildAttachStateChangeListener) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(onChildAttachStateChangeListener);
    }

    public void addOnItemTouchListener(OnItemTouchListener onItemTouchListener) {
        this.mOnItemTouchListeners.add(onItemTouchListener);
    }

    public void addOnScrollListener(OnScrollListener onScrollListener) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(onScrollListener);
    }

    public void addRecyclerListener(RecyclerListener recyclerListener) {
        boolean z;
        if (recyclerListener != null) {
            z = true;
        } else {
            z = false;
        }
        C2517g.m37593b(z, "'listener' arg cannot be null.");
        this.mRecyclerListeners.add(recyclerListener);
    }

    void animateAppearance(ViewHolder viewHolder, ItemAnimator.ItemHolderInfo itemHolderInfo, ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        viewHolder.setIsRecyclable(false);
        if (this.mItemAnimator.animateAppearance(viewHolder, itemHolderInfo, itemHolderInfo2)) {
            postAnimationRunner();
        }
    }

    void animateDisappearance(ViewHolder viewHolder, ItemAnimator.ItemHolderInfo itemHolderInfo, ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        addAnimatingView(viewHolder);
        viewHolder.setIsRecyclable(false);
        if (this.mItemAnimator.animateDisappearance(viewHolder, itemHolderInfo, itemHolderInfo2)) {
            postAnimationRunner();
        }
    }

    void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str == null) {
            throw new IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling" + exceptionLabel());
        }
        throw new IllegalStateException(str + exceptionLabel());
    }

    void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + exceptionLabel());
            }
            throw new IllegalStateException(str);
        } else if (this.mDispatchScrollCounter > 0) {
            Log.w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + exceptionLabel()));
        }
    }

    boolean canReuseUpdatedViewHolder(ViewHolder viewHolder) {
        ItemAnimator itemAnimator = this.mItemAnimator;
        if (itemAnimator == null || itemAnimator.canReuseUpdatedViewHolder(viewHolder, viewHolder.getUnmodifiedPayloads())) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C3109i) && this.mLayout.mo29354x((C3109i) layoutParams);
    }

    void clearOldPositions() {
        int j = this.mChildHelper.m35666j();
        for (int i = 0; i < j; i++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m35667i(i));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        this.mRecycler.m35388d();
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<OnChildAttachStateChangeListener> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<OnScrollListener> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollExtent() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.mo29358v()) {
            return this.mLayout.mo29432B(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollOffset() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.mo29358v()) {
            return this.mLayout.mo29430C(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollRange() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.mo29358v()) {
            return this.mLayout.mo29428D(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollExtent() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.mo29356w()) {
            return this.mLayout.mo29426E(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollOffset() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.mo29356w()) {
            return this.mLayout.mo29423F(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollRange() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.mo29356w()) {
            return this.mLayout.mo29420G(this.mState);
        }
        return 0;
    }

    void considerReleasingGlowsOnScroll(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.mLeftGlow.onRelease();
            z = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.mRightGlow.onRelease();
            z |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.mTopGlow.onRelease();
            z |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.mBottomGlow.onRelease();
            z |= this.mBottomGlow.isFinished();
        }
        if (z) {
            C2733w0.m37008h0(this);
        }
    }

    void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            C2458t.m37717a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
            C2458t.m37716b();
        } else if (this.mAdapterHelper.m35687p()) {
            if (this.mAdapterHelper.m35688o(4) && !this.mAdapterHelper.m35688o(11)) {
                C2458t.m37717a(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                this.mAdapterHelper.m35680w();
                if (!this.mLayoutWasDefered) {
                    if (hasUpdatedView()) {
                        dispatchLayout();
                    } else {
                        this.mAdapterHelper.m35694i();
                    }
                }
                stopInterceptRequestLayout(true);
                onExitLayoutOrScroll();
                C2458t.m37716b();
            } else if (this.mAdapterHelper.m35687p()) {
                C2458t.m37717a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                dispatchLayout();
                C2458t.m37716b();
            }
        }
    }

    void defaultOnMeasure(int i, int i2) {
        setMeasuredDimension(LayoutManager.m35422y(i, getPaddingLeft() + getPaddingRight(), C2733w0.m37059D(this)), LayoutManager.m35422y(i2, getPaddingTop() + getPaddingBottom(), C2733w0.m37061C(this)));
    }

    void dispatchChildAttached(View view) {
        ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        Adapter adapter = this.mAdapter;
        if (!(adapter == null || childViewHolderInt == null)) {
            adapter.onViewAttachedToWindow(childViewHolderInt);
        }
        List<OnChildAttachStateChangeListener> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).onChildViewAttachedToWindow(view);
            }
        }
    }

    void dispatchChildDetached(View view) {
        ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        Adapter adapter = this.mAdapter;
        if (!(adapter == null || childViewHolderInt == null)) {
            adapter.onViewDetachedFromWindow(childViewHolderInt);
        }
        List<OnChildAttachStateChangeListener> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).onChildViewDetachedFromWindow(view);
            }
        }
    }

    void dispatchLayout() {
        boolean z;
        if (this.mAdapter == null) {
            Log.w(TAG, "No adapter attached; skipping layout");
        } else if (this.mLayout == null) {
            Log.e(TAG, "No layout manager attached; skipping layout");
        } else {
            this.mState.f4727j = false;
            if (!this.mLastAutoMeasureSkippedDueToExact || (this.mLastAutoMeasureNonExactMeasuredWidth == getWidth() && this.mLastAutoMeasureNonExactMeasuredHeight == getHeight())) {
                z = false;
            } else {
                z = true;
            }
            this.mLastAutoMeasureNonExactMeasuredWidth = 0;
            this.mLastAutoMeasureNonExactMeasuredHeight = 0;
            this.mLastAutoMeasureSkippedDueToExact = false;
            if (this.mState.f4722e == 1) {
                dispatchLayoutStep1();
                this.mLayout.m35499I1(this);
                dispatchLayoutStep2();
            } else if (this.mAdapterHelper.m35686q() || z || this.mLayout.m35428v0() != getWidth() || this.mLayout.m35460h0() != getHeight()) {
                this.mLayout.m35499I1(this);
                dispatchLayoutStep2();
            } else {
                this.mLayout.m35499I1(this);
            }
            dispatchLayoutStep3();
        }
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().m37550a(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().m37549b(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m37548c(i, i2, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().m37545f(i, i2, i3, i4, iArr);
    }

    void dispatchOnScrollStateChanged(int i) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.mo35260m1(i);
        }
        onScrollStateChanged(i);
        OnScrollListener onScrollListener = this.mScrollListener;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChanged(this, i);
        }
        List<OnScrollListener> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrollStateChanged(this, i);
            }
        }
    }

    void dispatchOnScrolled(int i, int i2) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        onScrolled(i, i2);
        OnScrollListener onScrollListener = this.mScrollListener;
        if (onScrollListener != null) {
            onScrollListener.onScrolled(this, i, i2);
        }
        List<OnScrollListener> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrolled(this, i, i2);
            }
        }
        this.mDispatchScrollCounter--;
    }

    void dispatchPendingImportantForAccessibilityChanges() {
        int i;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            ViewHolder viewHolder = this.mPendingAccessibilityImportanceChange.get(size);
            if (viewHolder.itemView.getParent() == this && !viewHolder.shouldIgnore() && (i = viewHolder.mPendingAccessibilityState) != -1) {
                C2733w0.m37064A0(viewHolder.itemView, i);
                viewHolder.mPendingAccessibilityState = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        int i2;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z4 = false;
        for (int i3 = 0; i3 < size; i3++) {
            this.mItemDecorations.get(i3).onDrawOver(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        boolean z5 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            if (this.mClipToPadding) {
                i2 = getPaddingBottom();
            } else {
                i2 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + i2, 0.0f);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            if (edgeEffect2 == null || !edgeEffect2.draw(canvas)) {
                z = false;
            } else {
                z = true;
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            if (edgeEffect4 == null || !edgeEffect4.draw(canvas)) {
                z3 = false;
            } else {
                z3 = true;
            }
            z |= z3;
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            if (this.mClipToPadding) {
                i = getPaddingTop();
            } else {
                i = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate(i, -width);
            EdgeEffect edgeEffect6 = this.mRightGlow;
            if (edgeEffect6 == null || !edgeEffect6.draw(canvas)) {
                z2 = false;
            } else {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z4 = true;
            }
            z |= z4;
            canvas.restoreToCount(save4);
        }
        if (z || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.isRunning()) {
            z5 = z;
        }
        if (z5) {
            C2733w0.m37008h0(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    void ensureBottomGlow() {
        if (this.mBottomGlow == null) {
            EdgeEffect a = this.mEdgeEffectFactory.m35519a(this, 3);
            this.mBottomGlow = a;
            if (this.mClipToPadding) {
                a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    void ensureLeftGlow() {
        if (this.mLeftGlow == null) {
            EdgeEffect a = this.mEdgeEffectFactory.m35519a(this, 0);
            this.mLeftGlow = a;
            if (this.mClipToPadding) {
                a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    void ensureRightGlow() {
        if (this.mRightGlow == null) {
            EdgeEffect a = this.mEdgeEffectFactory.m35519a(this, 2);
            this.mRightGlow = a;
            if (this.mClipToPadding) {
                a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    void ensureTopGlow() {
        if (this.mTopGlow == null) {
            EdgeEffect a = this.mEdgeEffectFactory.m35519a(this, 1);
            this.mTopGlow = a;
            if (this.mClipToPadding) {
                a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    final void fillRemainingScrollValues(State state) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.mViewFlinger.f4737m;
            state.f4733p = overScroller.getFinalX() - overScroller.getCurrX();
            state.f4734q = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        state.f4733p = 0;
        state.f4734q = 0;
    }

    public View findChildViewUnder(float f, float f2) {
        for (int g = this.mChildHelper.m35669g() - 1; g >= 0; g--) {
            View f3 = this.mChildHelper.m35670f(g);
            float translationX = f3.getTranslationX();
            float translationY = f3.getTranslationY();
            if (f >= f3.getLeft() + translationX && f <= f3.getRight() + translationX && f2 >= f3.getTop() + translationY && f2 <= f3.getBottom() + translationY) {
                return f3;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View findContainingItemView(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L_0x0004:
            if (r0 == 0) goto L_0x0014
            if (r0 == r2) goto L_0x0014
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L_0x0014
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L_0x0004
        L_0x0014:
            if (r0 != r2) goto L_0x0017
            goto L_0x0018
        L_0x0017:
            r3 = 0
        L_0x0018:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.findContainingItemView(android.view.View):android.view.View");
    }

    public ViewHolder findContainingViewHolder(View view) {
        View findContainingItemView = findContainingItemView(view);
        if (findContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(findContainingItemView);
    }

    public ViewHolder findViewHolderForAdapterPosition(int i) {
        ViewHolder viewHolder = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int j = this.mChildHelper.m35666j();
        for (int i2 = 0; i2 < j; i2++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m35667i(i2));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionInRecyclerView(childViewHolderInt) == i) {
                if (!this.mChildHelper.m35662n(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                viewHolder = childViewHolderInt;
            }
        }
        return viewHolder;
    }

    public ViewHolder findViewHolderForItemId(long j) {
        Adapter adapter = this.mAdapter;
        ViewHolder viewHolder = null;
        if (adapter != null && adapter.hasStableIds()) {
            int j2 = this.mChildHelper.m35666j();
            for (int i = 0; i < j2; i++) {
                ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m35667i(i));
                if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.getItemId() == j) {
                    if (!this.mChildHelper.m35662n(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    viewHolder = childViewHolderInt;
                }
            }
        }
        return viewHolder;
    }

    public ViewHolder findViewHolderForLayoutPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    @Deprecated
    public ViewHolder findViewHolderForPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    public boolean fling(int i, int i2) {
        boolean z;
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            Log.e(TAG, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        } else if (this.mLayoutSuppressed) {
            return false;
        } else {
            boolean v = layoutManager.mo29358v();
            boolean w = this.mLayout.mo29356w();
            if (!v || Math.abs(i) < this.mMinFlingVelocity) {
                i = 0;
            }
            if (!w || Math.abs(i2) < this.mMinFlingVelocity) {
                i2 = 0;
            }
            if (i == 0 && i2 == 0) {
                return false;
            }
            float f = i;
            float f2 = i2;
            if (!dispatchNestedPreFling(f, f2)) {
                if (v || w) {
                    z = true;
                } else {
                    z = false;
                }
                dispatchNestedFling(f, f2, z);
                OnFlingListener onFlingListener = this.mOnFlingListener;
                if (onFlingListener != null && onFlingListener.mo35081a(i, i2)) {
                    return true;
                }
                if (z) {
                    if (w) {
                        boolean z2 = v ? 1 : 0;
                        char c = v ? 1 : 0;
                        v = z2 | true;
                    }
                    int i3 = v ? 1 : 0;
                    int i4 = v ? 1 : 0;
                    int i5 = v ? 1 : 0;
                    startNestedScroll(i3, 1);
                    int i6 = this.mMaxFlingVelocity;
                    int max = Math.max(-i6, Math.min(i, i6));
                    int i7 = this.mMaxFlingVelocity;
                    this.mViewFlinger.m35344b(max, Math.max(-i7, Math.min(i2, i7)));
                    return true;
                }
            }
            return false;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i) {
        boolean z;
        View view2;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        int i3;
        View Y0 = this.mLayout.m35469Y0(view, i);
        if (Y0 != null) {
            return Y0;
        }
        boolean z5 = true;
        if (this.mAdapter == null || this.mLayout == null || isComputingLayout() || this.mLayoutSuppressed) {
            z = false;
        } else {
            z = true;
        }
        FocusFinder instance = FocusFinder.getInstance();
        if (!z || !(i == 2 || i == 1)) {
            View findNextFocus = instance.findNextFocus(this, view, i);
            if (findNextFocus != null || !z) {
                view2 = findNextFocus;
            } else {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                view2 = this.mLayout.mo35291R0(view, i, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
        } else {
            if (this.mLayout.mo29356w()) {
                if (i == 2) {
                    i3 = 130;
                } else {
                    i3 = 33;
                }
                if (instance.findNextFocus(this, view, i3) == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i = i3;
                }
            } else {
                z2 = false;
            }
            if (!z2 && this.mLayout.mo29358v()) {
                if (this.mLayout.m35454k0() == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (i == 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z3 ^ z4) {
                    i2 = 66;
                } else {
                    i2 = 17;
                }
                if (instance.findNextFocus(this, view, i2) != null) {
                    z5 = false;
                }
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i = i2;
                }
                z2 = z5;
            }
            if (z2) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.mo35291R0(view, i, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            view2 = instance.findNextFocus(this, view, i);
        }
        if (view2 == null || view2.hasFocusable()) {
            if (isPreferredNextFocus(view, view2, i)) {
                return view2;
            }
            return super.focusSearch(view, i);
        } else if (getFocusedChild() == null) {
            return super.focusSearch(view, i);
        } else {
            requestChildOnScreen(view2, null);
            return view;
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            return layoutManager.mo29408O();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            return layoutManager.mo29404P(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public Adapter getAdapter() {
        return this.mAdapter;
    }

    int getAdapterPositionInRecyclerView(ViewHolder viewHolder) {
        if (viewHolder.hasAnyOfTheFlags(524) || !viewHolder.isBound()) {
            return -1;
        }
        return this.mAdapterHelper.m35698e(viewHolder.mPosition);
    }

    @Override // android.view.View
    public int getBaseline() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            return layoutManager.m35483R();
        }
        return super.getBaseline();
    }

    long getChangedHolderKey(ViewHolder viewHolder) {
        return this.mAdapter.hasStableIds() ? viewHolder.getItemId() : viewHolder.mPosition;
    }

    public int getChildAdapterPosition(View view) {
        ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        ChildDrawingOrderCallback childDrawingOrderCallback = this.mChildDrawingOrderCallback;
        if (childDrawingOrderCallback == null) {
            return super.getChildDrawingOrder(i, i2);
        }
        return childDrawingOrderCallback.onGetChildDrawingOrder(i, i2);
    }

    public long getChildItemId(View view) {
        ViewHolder childViewHolderInt;
        Adapter adapter = this.mAdapter;
        if (adapter == null || !adapter.hasStableIds() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1L;
        }
        return childViewHolderInt.getItemId();
    }

    public int getChildLayoutPosition(View view) {
        ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(View view) {
        return getChildAdapterPosition(view);
    }

    public ViewHolder getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public RecyclerViewAccessibilityDelegate getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public EdgeEffectFactory getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    public ItemAnimator getItemAnimator() {
        return this.mItemAnimator;
    }

    Rect getItemDecorInsetsForChild(View view) {
        C3109i iVar = (C3109i) view.getLayoutParams();
        if (!iVar.f4751m) {
            return iVar.f4750l;
        }
        if (this.mState.m35349e() && (iVar.m35319b() || iVar.m35317f())) {
            return iVar.f4750l;
        }
        Rect rect = iVar.f4750l;
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i).getItemOffsets(this.mTempRect, view, this, this.mState);
            int i2 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i2 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        iVar.f4751m = false;
        return rect;
    }

    public ItemDecoration getItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i >= 0 && i < itemDecorationCount) {
            return this.mItemDecorations.get(i);
        }
        throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public LayoutManager getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0L;
    }

    public OnFlingListener getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public RecycledViewPool getRecycledViewPool() {
        return this.mRecycler.m35383i();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m37540k();
    }

    public boolean hasPendingAdapterUpdates() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.m35687p()) {
            return true;
        }
        return false;
    }

    void initAdapterManager() {
        this.mAdapterHelper = new AdapterHelper(new C3106f());
    }

    void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + exceptionLabel());
        }
        Resources resources = getContext().getResources();
        new C3130d(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(C12319b.f27665a), resources.getDimensionPixelSize(C12319b.f27667c), resources.getDimensionPixelOffset(C12319b.f27666b));
    }

    void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() != 0) {
            LayoutManager layoutManager = this.mLayout;
            if (layoutManager != null) {
                layoutManager.mo35254r("Cannot invalidate item decorations during a scroll or layout");
            }
            markItemDecorInsetsDirty();
            requestLayout();
        }
    }

    boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        ItemAnimator itemAnimator = this.mItemAnimator;
        return itemAnimator != null && itemAnimator.isRunning();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().m37538m();
    }

    void jumpToPositionForSmoothScroller(int i) {
        if (this.mLayout != null) {
            setScrollState(2);
            this.mLayout.mo29419G1(i);
            awakenScrollBars();
        }
    }

    void markItemDecorInsetsDirty() {
        int j = this.mChildHelper.m35666j();
        for (int i = 0; i < j; i++) {
            ((C3109i) this.mChildHelper.m35667i(i).getLayoutParams()).f4751m = true;
        }
        this.mRecycler.m35373s();
    }

    void markKnownViewsInvalid() {
        int j = this.mChildHelper.m35666j();
        for (int i = 0; i < j; i++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m35667i(i));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        this.mRecycler.m35372t();
    }

    public void nestedScrollBy(int i, int i2) {
        nestedScrollByInternal(i, i2, null, 1);
    }

    public void offsetChildrenHorizontal(int i) {
        int g = this.mChildHelper.m35669g();
        for (int i2 = 0; i2 < g; i2++) {
            this.mChildHelper.m35670f(i2).offsetLeftAndRight(i);
        }
    }

    public void offsetChildrenVertical(int i) {
        int g = this.mChildHelper.m35669g();
        for (int i2 = 0; i2 < g; i2++) {
            this.mChildHelper.m35670f(i2).offsetTopAndBottom(i);
        }
    }

    void offsetPositionRecordsForInsert(int i, int i2) {
        int j = this.mChildHelper.m35666j();
        for (int i3 = 0; i3 < j; i3++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m35667i(i3));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i) {
                childViewHolderInt.offsetPosition(i2, false);
                this.mState.f4724g = true;
            }
        }
        this.mRecycler.m35371u(i, i2);
        requestLayout();
    }

    void offsetPositionRecordsForMove(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int j = this.mChildHelper.m35666j();
        if (i < i2) {
            i5 = -1;
            i4 = i;
            i3 = i2;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i7 = 0; i7 < j; i7++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m35667i(i7));
            if (childViewHolderInt != null && (i6 = childViewHolderInt.mPosition) >= i4 && i6 <= i3) {
                if (i6 == i) {
                    childViewHolderInt.offsetPosition(i2 - i, false);
                } else {
                    childViewHolderInt.offsetPosition(i5, false);
                }
                this.mState.f4724g = true;
            }
        }
        this.mRecycler.m35370v(i, i2);
        requestLayout();
    }

    void offsetPositionRecordsForRemove(int i, int i2, boolean z) {
        int i3 = i + i2;
        int j = this.mChildHelper.m35666j();
        for (int i4 = 0; i4 < j; i4++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m35667i(i4));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                int i5 = childViewHolderInt.mPosition;
                if (i5 >= i3) {
                    childViewHolderInt.offsetPosition(-i2, z);
                    this.mState.f4724g = true;
                } else if (i5 >= i) {
                    childViewHolderInt.flagRemovedAndOffsetPosition(i - 1, -i2, z);
                    this.mState.f4724g = true;
                }
            }
        }
        this.mRecycler.m35369w(i, i2, z);
        requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
        if (r1 >= 30.0f) goto L_0x0050;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.mLayoutOrScrollCounter = r0
            r1 = 1
            r5.mIsAttached = r1
            boolean r2 = r5.mFirstLayoutComplete
            if (r2 == 0) goto L_0x0014
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r1 = r0
        L_0x0015:
            r5.mFirstLayoutComplete = r1
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r5.mLayout
            if (r1 == 0) goto L_0x001e
            r1.m35495K(r5)
        L_0x001e:
            r5.mPostedAnimatorRunner = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
            if (r0 == 0) goto L_0x0061
            java.lang.ThreadLocal<androidx.recyclerview.widget.GapWorker> r0 = androidx.recyclerview.widget.GapWorker.f4576o
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.GapWorker r1 = (androidx.recyclerview.widget.GapWorker) r1
            r5.mGapWorker = r1
            if (r1 != 0) goto L_0x005c
            androidx.recyclerview.widget.GapWorker r1 = new androidx.recyclerview.widget.GapWorker
            r1.<init>()
            r5.mGapWorker = r1
            android.view.Display r1 = androidx.core.view.C2733w0.m36981v(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L_0x004e
            if (r1 == 0) goto L_0x004e
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x004e
            goto L_0x0050
        L_0x004e:
            r1 = 1114636288(0x42700000, float:60.0)
        L_0x0050:
            androidx.recyclerview.widget.GapWorker r2 = r5.mGapWorker
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f4580m = r3
            r0.set(r2)
        L_0x005c:
            androidx.recyclerview.widget.GapWorker r0 = r5.mGapWorker
            r0.m35647a(r5)
        L_0x0061:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void onChildDetachedFromWindow(View view) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        GapWorker gapWorker;
        super.onDetachedFromWindow();
        ItemAnimator itemAnimator = this.mItemAnimator;
        if (itemAnimator != null) {
            itemAnimator.endAnimations();
        }
        stopScroll();
        this.mIsAttached = false;
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.m35493L(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.m35185j();
        if (ALLOW_THREAD_GAP_WORK && (gapWorker = this.mGapWorker) != null) {
            gapWorker.m35638j(this);
            this.mGapWorker = null;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mItemDecorations.get(i).onDraw(canvas, this, this.mState);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r5.mLayout
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = r5.mLayoutSuppressed
            if (r0 == 0) goto L_0x000b
            return r1
        L_0x000b:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L_0x0078
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L_0x003e
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r5.mLayout
            boolean r0 = r0.mo29356w()
            if (r0 == 0) goto L_0x002c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L_0x002d
        L_0x002c:
            r0 = r2
        L_0x002d:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r5.mLayout
            boolean r3 = r3.mo29358v()
            if (r3 == 0) goto L_0x003c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L_0x0064
        L_0x003c:
            r3 = r2
            goto L_0x0064
        L_0x003e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L_0x0062
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r5.mLayout
            boolean r3 = r3.mo29356w()
            if (r3 == 0) goto L_0x0057
            float r0 = -r0
            goto L_0x003c
        L_0x0057:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r5.mLayout
            boolean r3 = r3.mo29358v()
            if (r3 == 0) goto L_0x0062
            r3 = r0
            r0 = r2
            goto L_0x0064
        L_0x0062:
            r0 = r2
            r3 = r0
        L_0x0064:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x006c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0078
        L_0x006c:
            float r2 = r5.mScaledHorizontalScrollFactor
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.mScaledVerticalScrollFactor
            float r0 = r0 * r3
            int r0 = (int) r0
            r3 = 1
            r5.nestedScrollByInternal(r2, r0, r6, r3)
        L_0x0078:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            return false;
        }
        boolean v = layoutManager.mo29358v();
        boolean w = this.mLayout.mo29356w();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
            if (this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            if (w) {
                boolean z = v ? 1 : 0;
                char c = v ? 1 : 0;
                v = z | true;
            }
            int i = v ? 1 : 0;
            int i2 = v ? 1 : 0;
            int i3 = v ? 1 : 0;
            startNestedScroll(i, 0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (findPointerIndex < 0) {
                Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.mScrollState != 1) {
                int i4 = x2 - this.mInitialTouchX;
                int i5 = y2 - this.mInitialTouchY;
                if (!v || Math.abs(i4) <= this.mTouchSlop) {
                    objArr = null;
                } else {
                    this.mLastTouchX = x2;
                    objArr = 1;
                }
                if (w && Math.abs(i5) > this.mTouchSlop) {
                    this.mLastTouchY = y2;
                    objArr = 1;
                }
                if (objArr != null) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            cancelScroll();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x3;
            this.mInitialTouchX = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y3;
            this.mInitialTouchY = y3;
        } else if (actionMasked == 6) {
            onPointerUp(motionEvent);
        }
        if (this.mScrollState == 1) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C2458t.m37717a(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        C2458t.m37716b();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            defaultOnMeasure(i, i2);
            return;
        }
        boolean z = false;
        if (layoutManager.mo29351z0()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.mLayout.m35459h1(this.mRecycler, this.mState, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.mLastAutoMeasureSkippedDueToExact = z;
            if (!z && this.mAdapter != null) {
                if (this.mState.f4722e == 1) {
                    dispatchLayoutStep1();
                }
                this.mLayout.m35496J1(i, i2);
                this.mState.f4727j = true;
                dispatchLayoutStep2();
                this.mLayout.m35491M1(i, i2);
                if (this.mLayout.mo35485P1()) {
                    this.mLayout.m35496J1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.mState.f4727j = true;
                    dispatchLayoutStep2();
                    this.mLayout.m35491M1(i, i2);
                }
                this.mLastAutoMeasureNonExactMeasuredWidth = getMeasuredWidth();
                this.mLastAutoMeasureNonExactMeasuredHeight = getMeasuredHeight();
            }
        } else if (this.mHasFixedSize) {
            this.mLayout.m35459h1(this.mRecycler, this.mState, i, i2);
        } else {
            if (this.mAdapterUpdateDuringMeasure) {
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                processAdapterUpdatesAndSetAnimationFlags();
                onExitLayoutOrScroll();
                State state = this.mState;
                if (state.f4729l) {
                    state.f4725h = true;
                } else {
                    this.mAdapterHelper.m35693j();
                    this.mState.f4725h = false;
                }
                this.mAdapterUpdateDuringMeasure = false;
                stopInterceptRequestLayout(false);
            } else if (this.mState.f4729l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            Adapter adapter = this.mAdapter;
            if (adapter != null) {
                this.mState.f4723f = adapter.getItemCount();
            } else {
                this.mState.f4723f = 0;
            }
            startInterceptRequestLayout();
            this.mLayout.m35459h1(this.mRecycler, this.mState, i, i2);
            stopInterceptRequestLayout(false);
            this.mState.f4725h = false;
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.mPendingSavedState = savedState;
        super.onRestoreInstanceState(savedState.m21547a());
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.mPendingSavedState;
        if (savedState2 != null) {
            savedState.m35362b(savedState2);
        } else {
            LayoutManager layoutManager = this.mLayout;
            if (layoutManager != null) {
                savedState.f4710m = layoutManager.mo29369l1();
            } else {
                savedState.f4710m = null;
            }
        }
        return savedState;
    }

    public void onScrollStateChanged(int i) {
    }

    public void onScrolled(int i, int i2) {
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            invalidateGlows();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    void postAnimationRunner() {
        if (!this.mPostedAnimatorRunner && this.mIsAttached) {
            C2733w0.m37006i0(this, this.mItemAnimatorRunner);
            this.mPostedAnimatorRunner = true;
        }
    }

    void processDataSetCompletelyChanged(boolean z) {
        this.mDispatchItemsChangedEvent = z | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    void recordAnimationInfoIfBouncedHiddenView(ViewHolder viewHolder, ItemAnimator.ItemHolderInfo itemHolderInfo) {
        viewHolder.setFlags(0, 8192);
        if (this.mState.f4726i && viewHolder.isUpdated() && !viewHolder.isRemoved() && !viewHolder.shouldIgnore()) {
            this.mViewInfoStore.m35192c(getChangedHolderKey(viewHolder), viewHolder);
        }
        this.mViewInfoStore.m35190e(viewHolder, itemHolderInfo);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void removeAndRecycleViews() {
        ItemAnimator itemAnimator = this.mItemAnimator;
        if (itemAnimator != null) {
            itemAnimator.endAnimations();
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.m35432t1(this.mRecycler);
            this.mLayout.m35429u1(this.mRecycler);
        }
        this.mRecycler.m35389c();
    }

    boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        boolean r = this.mChildHelper.m35658r(view);
        if (r) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.m35395J(childViewHolderInt);
            this.mRecycler.m35402C(childViewHolderInt);
        }
        stopInterceptRequestLayout(!r);
        return r;
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z) {
        ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + childViewHolderInt + exceptionLabel());
            }
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z);
    }

    public void removeItemDecoration(ItemDecoration itemDecoration) {
        boolean z;
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.mo35254r("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(itemDecoration);
        if (this.mItemDecorations.isEmpty()) {
            if (getOverScrollMode() == 2) {
                z = true;
            } else {
                z = false;
            }
            setWillNotDraw(z);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i < 0 || i >= itemDecorationCount) {
            throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
        }
        removeItemDecoration(getItemDecorationAt(i));
    }

    public void removeOnChildAttachStateChangeListener(OnChildAttachStateChangeListener onChildAttachStateChangeListener) {
        List<OnChildAttachStateChangeListener> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.remove(onChildAttachStateChangeListener);
        }
    }

    public void removeOnItemTouchListener(OnItemTouchListener onItemTouchListener) {
        this.mOnItemTouchListeners.remove(onItemTouchListener);
        if (this.mInterceptingOnItemTouchListener == onItemTouchListener) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(OnScrollListener onScrollListener) {
        List<OnScrollListener> list = this.mScrollListeners;
        if (list != null) {
            list.remove(onScrollListener);
        }
    }

    public void removeRecyclerListener(RecyclerListener recyclerListener) {
        this.mRecyclerListeners.remove(recyclerListener);
    }

    void repositionShadowingViews() {
        ViewHolder viewHolder;
        int g = this.mChildHelper.m35669g();
        for (int i = 0; i < g; i++) {
            View f = this.mChildHelper.m35670f(i);
            ViewHolder childViewHolder = getChildViewHolder(f);
            if (!(childViewHolder == null || (viewHolder = childViewHolder.mShadowingHolder) == null)) {
                View view = viewHolder.itemView;
                int left = f.getLeft();
                int top = f.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.m35455j1(this, this.mState, view, view2) && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.mLayout.m35513A1(this, view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            this.mOnItemTouchListeners.get(i).onRequestDisallowInterceptTouchEvent(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth != 0 || this.mLayoutSuppressed) {
            this.mLayoutWasDefered = true;
        } else {
            super.requestLayout();
        }
    }

    void saveOldPositions() {
        int j = this.mChildHelper.m35666j();
        for (int i = 0; i < j; i++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m35667i(i));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.saveOldPosition();
            }
        }
    }

    @Override // android.view.View
    public void scrollBy(int i, int i2) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.mLayoutSuppressed) {
            boolean v = layoutManager.mo29358v();
            boolean w = this.mLayout.mo29356w();
            if (v || w) {
                if (!v) {
                    i = 0;
                }
                if (!w) {
                    i2 = 0;
                }
                scrollByInternal(i, i2, null, 0);
            }
        }
    }

    boolean scrollByInternal(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i, i2, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i8 = iArr2[0];
            int i9 = iArr2[1];
            i7 = i9;
            i6 = i8;
            i5 = i - i8;
            i4 = i2 - i9;
        } else {
            i7 = 0;
            i6 = 0;
            i5 = 0;
            i4 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i6, i7, i5, i4, this.mScrollOffset, i3, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i10 = iArr4[0];
        int i11 = i5 - i10;
        int i12 = iArr4[1];
        int i13 = i4 - i12;
        if (i10 == 0 && i12 == 0) {
            z = false;
        } else {
            z = true;
        }
        int i14 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        int i15 = iArr5[0];
        this.mLastTouchX = i14 - i15;
        int i16 = this.mLastTouchY;
        int i17 = iArr5[1];
        this.mLastTouchY = i16 - i17;
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + i15;
        iArr6[1] = iArr6[1] + i17;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !C2672n0.m37175a(motionEvent, 8194)) {
                pullGlows(motionEvent.getX(), i11, motionEvent.getY(), i13);
            }
            considerReleasingGlowsOnScroll(i, i2);
        }
        if (!(i6 == 0 && i7 == 0)) {
            dispatchOnScrolled(i6, i7);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (!z && i6 == 0 && i7 == 0) {
            return false;
        }
        return true;
    }

    void scrollStep(int i, int i2, int[] iArr) {
        int i3;
        int i4;
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        C2458t.m37717a(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        if (i != 0) {
            i3 = this.mLayout.mo29422F1(i, this.mRecycler, this.mState);
        } else {
            i3 = 0;
        }
        if (i2 != 0) {
            i4 = this.mLayout.mo29417H1(i2, this.mRecycler, this.mState);
        } else {
            i4 = 0;
        }
        C2458t.m37716b();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = i3;
            iArr[1] = i4;
        }
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        Log.w(TAG, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int i) {
        if (!this.mLayoutSuppressed) {
            stopScroll();
            LayoutManager layoutManager = this.mLayout;
            if (layoutManager == null) {
                Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            layoutManager.mo29419G1(i);
            awakenScrollBars();
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!shouldDeferAccessibilityEvent(accessibilityEvent)) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate) {
        this.mAccessibilityDelegate = recyclerViewAccessibilityDelegate;
        C2733w0.m36990q0(this, recyclerViewAccessibilityDelegate);
    }

    public void setAdapter(Adapter adapter) {
        setLayoutFrozen(false);
        setAdapterInternal(adapter, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(ChildDrawingOrderCallback childDrawingOrderCallback) {
        boolean z;
        if (childDrawingOrderCallback != this.mChildDrawingOrderCallback) {
            this.mChildDrawingOrderCallback = childDrawingOrderCallback;
            if (childDrawingOrderCallback != null) {
                z = true;
            } else {
                z = false;
            }
            setChildrenDrawingOrderEnabled(z);
        }
    }

    boolean setChildImportantForAccessibilityInternal(ViewHolder viewHolder, int i) {
        if (isComputingLayout()) {
            viewHolder.mPendingAccessibilityState = i;
            this.mPendingAccessibilityImportanceChange.add(viewHolder);
            return false;
        }
        C2733w0.m37064A0(viewHolder.itemView, i);
        return true;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z;
        super.setClipToPadding(z);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(EdgeEffectFactory edgeEffectFactory) {
        C2517g.m37588g(edgeEffectFactory);
        this.mEdgeEffectFactory = edgeEffectFactory;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z) {
        this.mHasFixedSize = z;
    }

    public void setItemAnimator(ItemAnimator itemAnimator) {
        ItemAnimator itemAnimator2 = this.mItemAnimator;
        if (itemAnimator2 != null) {
            itemAnimator2.endAnimations();
            this.mItemAnimator.setListener(null);
        }
        this.mItemAnimator = itemAnimator;
        if (itemAnimator != null) {
            itemAnimator.setListener(this.mItemAnimatorListener);
        }
    }

    public void setItemViewCacheSize(int i) {
        this.mRecycler.m35398G(i);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(LayoutManager layoutManager) {
        if (layoutManager != this.mLayout) {
            stopScroll();
            if (this.mLayout != null) {
                ItemAnimator itemAnimator = this.mItemAnimator;
                if (itemAnimator != null) {
                    itemAnimator.endAnimations();
                }
                this.mLayout.m35432t1(this.mRecycler);
                this.mLayout.m35429u1(this.mRecycler);
                this.mRecycler.m35389c();
                if (this.mIsAttached) {
                    this.mLayout.m35493L(this, this.mRecycler);
                }
                this.mLayout.m35488N1(null);
                this.mLayout = null;
            } else {
                this.mRecycler.m35389c();
            }
            this.mChildHelper.m35661o();
            this.mLayout = layoutManager;
            if (layoutManager != null) {
                if (layoutManager.f4673l == null) {
                    layoutManager.m35488N1(this);
                    if (this.mIsAttached) {
                        this.mLayout.m35495K(this);
                    }
                } else {
                    throw new IllegalArgumentException("LayoutManager " + layoutManager + " is already attached to a RecyclerView:" + layoutManager.f4673l.exceptionLabel());
                }
            }
            this.mRecycler.m35394K();
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().m37537n(z);
    }

    public void setOnFlingListener(OnFlingListener onFlingListener) {
        this.mOnFlingListener = onFlingListener;
    }

    @Deprecated
    public void setOnScrollListener(OnScrollListener onScrollListener) {
        this.mScrollListener = onScrollListener;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.mPreserveFocusAfterLayout = z;
    }

    public void setRecycledViewPool(RecycledViewPool recycledViewPool) {
        this.mRecycler.m35400E(recycledViewPool);
    }

    @Deprecated
    public void setRecyclerListener(RecyclerListener recyclerListener) {
        this.mRecyclerListener = recyclerListener;
    }

    void setScrollState(int i) {
        if (i != this.mScrollState) {
            this.mScrollState = i;
            if (i != 2) {
                stopScrollersInternal();
            }
            dispatchOnScrollStateChanged(i);
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i != 1) {
                Log.w(TAG, "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
            } else {
                this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(ViewCacheExtension viewCacheExtension) {
        this.mRecycler.m35399F(viewCacheExtension);
    }

    boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        int i;
        int i2 = 0;
        if (!isComputingLayout()) {
            return false;
        }
        if (accessibilityEvent != null) {
            i = C2572b.m37325a(accessibilityEvent);
        } else {
            i = 0;
        }
        if (i != 0) {
            i2 = i;
        }
        this.mEatenAccessibilityChangeFlags |= i2;
        return true;
    }

    public void smoothScrollBy(int i, int i2) {
        smoothScrollBy(i, i2, null);
    }

    public void smoothScrollToPosition(int i) {
        if (!this.mLayoutSuppressed) {
            LayoutManager layoutManager = this.mLayout;
            if (layoutManager == null) {
                Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                layoutManager.mo28122R1(this, this.mState, i);
            }
        }
    }

    void startInterceptRequestLayout() {
        int i = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i;
        if (i == 1 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().m37535p(i);
    }

    void stopInterceptRequestLayout(boolean z) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().m37533r();
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.mLayoutSuppressed = false;
                if (!(!this.mLayoutWasDefered || this.mLayout == null || this.mAdapter == null)) {
                    requestLayout();
                }
                this.mLayoutWasDefered = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.mLayoutSuppressed = true;
            this.mIgnoreMotionEventTillDown = true;
            stopScroll();
        }
    }

    public void swapAdapter(Adapter adapter, boolean z) {
        setLayoutFrozen(false);
        setAdapterInternal(adapter, true, z);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    void viewRangeUpdate(int i, int i2, Object obj) {
        int i3;
        int j = this.mChildHelper.m35666j();
        int i4 = i + i2;
        for (int i5 = 0; i5 < j; i5++) {
            View i6 = this.mChildHelper.m35667i(i5);
            ViewHolder childViewHolderInt = getChildViewHolderInt(i6);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && (i3 = childViewHolderInt.mPosition) >= i && i3 < i4) {
                childViewHolderInt.addFlags(2);
                childViewHolderInt.addChangePayload(obj);
                ((C3109i) i6.getLayoutParams()).f4751m = true;
            }
        }
        this.mRecycler.m35392M(i, i2);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C12318a.f27664a);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().m37547d(i, i2, iArr, iArr2, i3);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return getScrollingChildHelper().m37544g(i, i2, i3, i4, iArr, i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.recyclerview.widget.RecyclerView.ViewHolder findViewHolderForPosition(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.ChildHelper r0 = r5.mChildHelper
            int r0 = r0.m35666j()
            r1 = 0
            r2 = 0
        L_0x0008:
            if (r2 >= r0) goto L_0x003a
            androidx.recyclerview.widget.ChildHelper r3 = r5.mChildHelper
            android.view.View r3 = r3.m35667i(r2)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = getChildViewHolderInt(r3)
            if (r3 == 0) goto L_0x0037
            boolean r4 = r3.isRemoved()
            if (r4 != 0) goto L_0x0037
            if (r7 == 0) goto L_0x0023
            int r4 = r3.mPosition
            if (r4 == r6) goto L_0x002a
            goto L_0x0037
        L_0x0023:
            int r4 = r3.getLayoutPosition()
            if (r4 == r6) goto L_0x002a
            goto L_0x0037
        L_0x002a:
            androidx.recyclerview.widget.ChildHelper r1 = r5.mChildHelper
            android.view.View r4 = r3.itemView
            boolean r1 = r1.m35662n(r4)
            if (r1 == 0) goto L_0x0036
            r1 = r3
            goto L_0x0037
        L_0x0036:
            return r3
        L_0x0037:
            int r2 = r2 + 1
            goto L_0x0008
        L_0x003a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.findViewHolderForPosition(int, boolean):androidx.recyclerview.widget.RecyclerView$ViewHolder");
    }

    public boolean hasNestedScrollingParent(int i) {
        return getScrollingChildHelper().m37539l(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onExitLayoutOrScroll(boolean z) {
        int i = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i;
        if (i < 1) {
            this.mLayoutOrScrollCounter = 0;
            if (z) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator) {
        smoothScrollBy(i, i2, interpolator, Integer.MIN_VALUE);
    }

    public boolean startNestedScroll(int i, int i2) {
        return getScrollingChildHelper().m37534q(i, i2);
    }

    public void stopNestedScroll(int i) {
        getScrollingChildHelper().m37532s(i);
    }

    /* loaded from: classes.dex */
    public static class SavedState extends AbstractC7736a {
        public static final Parcelable.Creator<SavedState> CREATOR = new C3099a();

        /* renamed from: m */
        Parcelable f4710m;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$SavedState$a */
        /* loaded from: classes.dex */
        class C3099a implements Parcelable.ClassLoaderCreator<SavedState> {
            C3099a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f4710m = parcel.readParcelable(classLoader == null ? LayoutManager.class.getClassLoader() : classLoader);
        }

        /* renamed from: b */
        void m35362b(SavedState savedState) {
            this.f4710m = savedState.f4710m;
        }

        @Override // p125h1.AbstractC7736a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f4710m, 0);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mObserver = new RecyclerViewDataObserver();
        this.mRecycler = new Recycler();
        this.mViewInfoStore = new ViewInfoStore();
        this.mUpdateChildViewsRunnable = new RunnableC3101a();
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mRecyclerListeners = new ArrayList();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = new EdgeEffectFactory();
        this.mItemAnimator = new DefaultItemAnimator();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new ViewFlinger();
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new GapWorker.LayoutPrefetchRegistryImpl() : null;
        this.mState = new State();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new C3108h();
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new RunnableC3102b();
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mViewInfoProcessCallback = new C3104d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = C2632g2.m37252b(viewConfiguration, context);
        this.mScaledVerticalScrollFactor = C2632g2.m37250d(viewConfiguration, context);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.setListener(this.mItemAnimatorListener);
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        if (C2733w0.m36973z(this) == 0) {
            C2733w0.m37064A0(this, 1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new RecyclerViewAccessibilityDelegate(this));
        int[] iArr = C12321d.f27677f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        C2733w0.m36994o0(this, context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        String string = obtainStyledAttributes.getString(C12321d.f27686o);
        if (obtainStyledAttributes.getInt(C12321d.f27680i, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = obtainStyledAttributes.getBoolean(C12321d.f27679h, true);
        boolean z = obtainStyledAttributes.getBoolean(C12321d.f27681j, false);
        this.mEnableFastScroller = z;
        if (z) {
            initFastScroller((StateListDrawable) obtainStyledAttributes.getDrawable(C12321d.f27684m), obtainStyledAttributes.getDrawable(C12321d.f27685n), (StateListDrawable) obtainStyledAttributes.getDrawable(C12321d.f27682k), obtainStyledAttributes.getDrawable(C12321d.f27683l));
        }
        obtainStyledAttributes.recycle();
        createLayoutManager(context, string, attributeSet, i, 0);
        int[] iArr2 = NESTED_SCROLLING_ATTRS;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        C2733w0.m36994o0(this, context, iArr2, attributeSet, obtainStyledAttributes2, i, 0);
        boolean z2 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
    }

    public final void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().m37546e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator, int i3) {
        smoothScrollBy(i, i2, interpolator, i3, false);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$i */
    /* loaded from: classes.dex */
    public static class C3109i extends ViewGroup.MarginLayoutParams {

        /* renamed from: k */
        ViewHolder f4749k;

        /* renamed from: l */
        final Rect f4750l = new Rect();

        /* renamed from: m */
        boolean f4751m = true;

        /* renamed from: n */
        boolean f4752n = false;

        public C3109i(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: a */
        public int m35320a() {
            return this.f4749k.getLayoutPosition();
        }

        /* renamed from: b */
        public boolean m35319b() {
            return this.f4749k.isUpdated();
        }

        /* renamed from: e */
        public boolean m35318e() {
            return this.f4749k.isRemoved();
        }

        /* renamed from: f */
        public boolean m35317f() {
            return this.f4749k.isInvalid();
        }

        public C3109i(int i, int i2) {
            super(i, i2);
        }

        public C3109i(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C3109i(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C3109i(C3109i iVar) {
            super((ViewGroup.LayoutParams) iVar);
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            return layoutManager.mo35293Q(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    void smoothScrollBy(int i, int i2, Interpolator interpolator, int i3, boolean z) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.mLayoutSuppressed) {
            int i4 = 0;
            if (!layoutManager.mo29358v()) {
                i = 0;
            }
            if (!this.mLayout.mo29356w()) {
                i2 = 0;
            }
            if (i != 0 || i2 != 0) {
                if (i3 == Integer.MIN_VALUE || i3 > 0) {
                    if (z) {
                        if (i != 0) {
                            i4 = 1;
                        }
                        if (i2 != 0) {
                            i4 |= 2;
                        }
                        startNestedScroll(i4, 1);
                    }
                    this.mViewFlinger.m35341e(i, i2, i3, interpolator);
                    return;
                }
                scrollBy(i, i2);
            }
        }
    }

    public void addItemDecoration(ItemDecoration itemDecoration) {
        addItemDecoration(itemDecoration, -1);
    }
}
