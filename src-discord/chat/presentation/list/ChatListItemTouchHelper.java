package com.discord.chat.presentation.list;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.Pair;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.core.view.GestureDetectorCompat;
import androidx.core.view.w0;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import m0.b;


public class ChatListItemTouchHelper extends RecyclerView.ItemDecoration implements RecyclerView.OnChildAttachStateChangeListener {
    static final int ACTION_MODE_DRAG_MASK = 16711680;
    private static final int ACTION_MODE_IDLE_MASK = 255;
    static final int ACTION_MODE_SWIPE_MASK = 65280;
    public static final int ACTION_STATE_DRAG = 2;
    public static final int ACTION_STATE_IDLE = 0;
    public static final int ACTION_STATE_SWIPE = 1;
    private static final int ACTIVE_POINTER_ID_NONE = -1;
    public static final int ANIMATION_TYPE_DRAG = 8;
    public static final int ANIMATION_TYPE_SWIPE_CANCEL = 4;
    public static final int ANIMATION_TYPE_SWIPE_CANCEL_SPRINGY = 8;
    public static final int ANIMATION_TYPE_SWIPE_SUCCESS = 2;
    private static final boolean DEBUG = false;
    static final int DIRECTION_FLAG_COUNT = 8;
    public static final int DOWN = 2;
    public static final int END = 32;
    public static final int LEFT = 4;
    private static final int PIXELS_PER_SECOND = 1000;
    public static final int RIGHT = 8;
    public static final int START = 16;
    private static final String TAG = "ItemTouchHelper";
    public static final int UP = 1;
    ChatListCallback mCallback;
    private List<Integer> mDistances;
    private long mDragScrollStartTimeInMs;
    float mDx;
    float mDy;
    GestureDetectorCompat mGestureDetector;
    float mInitialTouchX;
    float mInitialTouchY;
    private ItemTouchHelperGestureListener mItemTouchHelperGestureListener;
    private float mMaxSwipeVelocity;
    RecyclerView mRecyclerView;
    int mSelectedFlags;
    private float mSelectedStartX;
    private float mSelectedStartY;
    private int mSlop;
    private List<RecyclerView.ViewHolder> mSwapTargets;
    private float mSwipeEscapeVelocity;
    private Rect mTmpRect;
    VelocityTracker mVelocityTracker;
    final List<View> mPendingCleanup = new ArrayList();
    private final float[] mTmpPosition = new float[2];
    RecyclerView.ViewHolder mSelected = null;
    int mActivePointerId = -1;
    private int mActionState = 0;
    List<RecoverAnimation> mRecoverAnimations = new ArrayList();
    final Runnable mScrollRunnable = new Runnable() { 
        @Override 
        public void run() {
            ChatListItemTouchHelper chatListItemTouchHelper = ChatListItemTouchHelper.this;
            if (chatListItemTouchHelper.mSelected != null && chatListItemTouchHelper.scrollIfNecessary()) {
                ChatListItemTouchHelper chatListItemTouchHelper2 = ChatListItemTouchHelper.this;
                RecyclerView.ViewHolder viewHolder = chatListItemTouchHelper2.mSelected;
                if (viewHolder != null) {
                    chatListItemTouchHelper2.moveIfNecessary(viewHolder);
                }
                ChatListItemTouchHelper chatListItemTouchHelper3 = ChatListItemTouchHelper.this;
                chatListItemTouchHelper3.mRecyclerView.removeCallbacks(chatListItemTouchHelper3.mScrollRunnable);
                w0.i0(ChatListItemTouchHelper.this.mRecyclerView, this);
            }
        }
    };
    private RecyclerView.ChildDrawingOrderCallback mChildDrawingOrderCallback = null;
    View mOverdrawChild = null;
    int mOverdrawChildPosition = -1;
    private final RecyclerView.OnItemTouchListener mOnItemTouchListener = new RecyclerView.OnItemTouchListener() { 
        @Override 
        public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
            int findPointerIndex;
            RecoverAnimation findAnimation;
            ChatListItemTouchHelper.this.mGestureDetector.a(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                ChatListItemTouchHelper.this.mActivePointerId = motionEvent.getPointerId(0);
                ChatListItemTouchHelper.this.mInitialTouchX = motionEvent.getX();
                ChatListItemTouchHelper.this.mInitialTouchY = motionEvent.getY();
                ChatListItemTouchHelper.this.obtainVelocityTracker();
                ChatListItemTouchHelper chatListItemTouchHelper = ChatListItemTouchHelper.this;
                if (chatListItemTouchHelper.mSelected == null && (findAnimation = chatListItemTouchHelper.findAnimation(motionEvent)) != null) {
                    ChatListItemTouchHelper chatListItemTouchHelper2 = ChatListItemTouchHelper.this;
                    chatListItemTouchHelper2.mInitialTouchX -= findAnimation.mX;
                    chatListItemTouchHelper2.mInitialTouchY -= findAnimation.mY;
                    chatListItemTouchHelper2.endRecoverAnimation(findAnimation.mViewHolder, true);
                    if (ChatListItemTouchHelper.this.mPendingCleanup.remove(findAnimation.mViewHolder.itemView)) {
                        ChatListItemTouchHelper chatListItemTouchHelper3 = ChatListItemTouchHelper.this;
                        chatListItemTouchHelper3.mCallback.clearView(chatListItemTouchHelper3.mRecyclerView, findAnimation.mViewHolder);
                    }
                    ChatListItemTouchHelper.this.select(findAnimation.mViewHolder, findAnimation.mActionState);
                    ChatListItemTouchHelper chatListItemTouchHelper4 = ChatListItemTouchHelper.this;
                    chatListItemTouchHelper4.updateDxDy(motionEvent, chatListItemTouchHelper4.mSelectedFlags, 0);
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                ChatListItemTouchHelper chatListItemTouchHelper5 = ChatListItemTouchHelper.this;
                chatListItemTouchHelper5.mCallback.onReleased(recyclerView, chatListItemTouchHelper5.mSelected);
                ChatListItemTouchHelper chatListItemTouchHelper6 = ChatListItemTouchHelper.this;
                chatListItemTouchHelper6.mActivePointerId = -1;
                chatListItemTouchHelper6.select(null, 0);
            } else {
                int i10 = ChatListItemTouchHelper.this.mActivePointerId;
                if (i10 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i10)) >= 0) {
                    ChatListItemTouchHelper.this.checkSelectForSwipe(actionMasked, motionEvent, findPointerIndex);
                }
            }
            VelocityTracker velocityTracker = ChatListItemTouchHelper.this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (ChatListItemTouchHelper.this.mSelected != null) {
                return true;
            }
            return false;
        }

        @Override 
        public void onRequestDisallowInterceptTouchEvent(boolean z10) {
            if (z10) {
                ChatListItemTouchHelper.this.select(null, 0);
            }
        }

        @Override 
        public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
            ChatListItemTouchHelper.this.mGestureDetector.a(motionEvent);
            VelocityTracker velocityTracker = ChatListItemTouchHelper.this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (ChatListItemTouchHelper.this.mActivePointerId != -1) {
                int actionMasked = motionEvent.getActionMasked();
                int findPointerIndex = motionEvent.findPointerIndex(ChatListItemTouchHelper.this.mActivePointerId);
                if (findPointerIndex >= 0) {
                    ChatListItemTouchHelper.this.checkSelectForSwipe(actionMasked, motionEvent, findPointerIndex);
                }
                ChatListItemTouchHelper chatListItemTouchHelper = ChatListItemTouchHelper.this;
                RecyclerView.ViewHolder viewHolder = chatListItemTouchHelper.mSelected;
                if (viewHolder != null) {
                    int i10 = 0;
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked == 3) {
                                VelocityTracker velocityTracker2 = chatListItemTouchHelper.mVelocityTracker;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.clear();
                                }
                            } else if (actionMasked == 6) {
                                int actionIndex = motionEvent.getActionIndex();
                                int pointerId = motionEvent.getPointerId(actionIndex);
                                ChatListItemTouchHelper chatListItemTouchHelper2 = ChatListItemTouchHelper.this;
                                if (pointerId == chatListItemTouchHelper2.mActivePointerId) {
                                    if (actionIndex == 0) {
                                        i10 = 1;
                                    }
                                    chatListItemTouchHelper2.mActivePointerId = motionEvent.getPointerId(i10);
                                    ChatListItemTouchHelper chatListItemTouchHelper3 = ChatListItemTouchHelper.this;
                                    chatListItemTouchHelper3.updateDxDy(motionEvent, chatListItemTouchHelper3.mSelectedFlags, actionIndex);
                                    return;
                                }
                                return;
                            } else {
                                return;
                            }
                        } else if (findPointerIndex >= 0) {
                            chatListItemTouchHelper.updateDxDy(motionEvent, chatListItemTouchHelper.mSelectedFlags, findPointerIndex);
                            ChatListItemTouchHelper.this.moveIfNecessary(viewHolder);
                            ChatListItemTouchHelper chatListItemTouchHelper4 = ChatListItemTouchHelper.this;
                            chatListItemTouchHelper4.mRecyclerView.removeCallbacks(chatListItemTouchHelper4.mScrollRunnable);
                            ChatListItemTouchHelper.this.mScrollRunnable.run();
                            ChatListItemTouchHelper.this.mRecyclerView.invalidate();
                            return;
                        } else {
                            return;
                        }
                    }
                    ChatListItemTouchHelper chatListItemTouchHelper5 = ChatListItemTouchHelper.this;
                    chatListItemTouchHelper5.mCallback.onReleased(recyclerView, chatListItemTouchHelper5.mSelected);
                    ChatListItemTouchHelper.this.select(null, 0);
                    ChatListItemTouchHelper.this.mActivePointerId = -1;
                }
            }
        }
    };

    
    
    public class ItemTouchHelperGestureListener extends GestureDetector.SimpleOnGestureListener {
        private boolean mShouldReactToLongPress = true;

        ItemTouchHelperGestureListener() {
        }

        void doNotReactToLongPress() {
            this.mShouldReactToLongPress = false;
        }

        @Override 
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override 
        public void onLongPress(MotionEvent motionEvent) {
            View findChildView;
            RecyclerView.ViewHolder childViewHolder;
            if (this.mShouldReactToLongPress && (findChildView = ChatListItemTouchHelper.this.findChildView(motionEvent)) != null && (childViewHolder = ChatListItemTouchHelper.this.mRecyclerView.getChildViewHolder(findChildView)) != null) {
                ChatListItemTouchHelper chatListItemTouchHelper = ChatListItemTouchHelper.this;
                if (chatListItemTouchHelper.mCallback.hasDragFlag(chatListItemTouchHelper.mRecyclerView, childViewHolder)) {
                    int pointerId = motionEvent.getPointerId(0);
                    int i10 = ChatListItemTouchHelper.this.mActivePointerId;
                    if (pointerId == i10) {
                        int findPointerIndex = motionEvent.findPointerIndex(i10);
                        float x10 = motionEvent.getX(findPointerIndex);
                        float y10 = motionEvent.getY(findPointerIndex);
                        ChatListItemTouchHelper chatListItemTouchHelper2 = ChatListItemTouchHelper.this;
                        chatListItemTouchHelper2.mInitialTouchX = x10;
                        chatListItemTouchHelper2.mInitialTouchY = y10;
                        chatListItemTouchHelper2.mDy = 0.0f;
                        chatListItemTouchHelper2.mDx = 0.0f;
                        if (chatListItemTouchHelper2.mCallback.isLongPressDragEnabled()) {
                            ChatListItemTouchHelper.this.select(childViewHolder, 2);
                        }
                    }
                }
            }
        }
    }

    
    
    public static class RecoverAnimation implements Animator.AnimatorListener {
        final int mActionState;
        final int mAnimationType;
        private float mFraction;
        boolean mIsPendingCleanup;
        final float mStartDx;
        final float mStartDy;
        final float mTargetX;
        final float mTargetY;
        final ValueAnimator mValueAnimator;
        final RecyclerView.ViewHolder mViewHolder;
        float mX;
        float mY;
        boolean mOverridden = false;
        boolean mEnded = false;

        RecoverAnimation(RecyclerView.ViewHolder viewHolder, int i10, int i11, float f10, float f11, float f12, float f13) {
            this.mActionState = i11;
            this.mAnimationType = i10;
            this.mViewHolder = viewHolder;
            this.mStartDx = f10;
            this.mStartDy = f11;
            this.mTargetX = f12;
            this.mTargetY = f13;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.mValueAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { 
                @Override 
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    RecoverAnimation.this.setFraction(valueAnimator.getAnimatedFraction());
                }
            });
            ofFloat.setTarget(viewHolder.itemView);
            if (i10 == 8) {
                ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            }
            ofFloat.addListener(this);
            setFraction(0.0f);
        }

        public void cancel() {
            this.mValueAnimator.cancel();
        }

        @Override 
        public void onAnimationCancel(Animator animator) {
            setFraction(1.0f);
        }

        @Override 
        public void onAnimationEnd(Animator animator) {
            if (!this.mEnded) {
                this.mViewHolder.setIsRecyclable(true);
            }
            this.mEnded = true;
        }

        @Override 
        public void onAnimationRepeat(Animator animator) {
        }

        @Override 
        public void onAnimationStart(Animator animator) {
        }

        public void setDuration(long j10) {
            this.mValueAnimator.setDuration(j10);
        }

        public void setFraction(float f10) {
            this.mFraction = f10;
        }

        public void start() {
            this.mViewHolder.setIsRecyclable(false);
            this.mValueAnimator.start();
        }

        public void update() {
            float f10 = this.mStartDx;
            float f11 = this.mTargetX;
            if (f10 == f11) {
                this.mX = this.mViewHolder.itemView.getTranslationX();
            } else {
                this.mX = f10 + (this.mFraction * (f11 - f10));
            }
            float f12 = this.mStartDy;
            float f13 = this.mTargetY;
            if (f12 == f13) {
                this.mY = this.mViewHolder.itemView.getTranslationY();
            } else {
                this.mY = f12 + (this.mFraction * (f13 - f12));
            }
        }
    }

    public ChatListItemTouchHelper(ChatListCallback chatListCallback) {
        this.mCallback = chatListCallback;
    }

    private void addChildDrawingOrderCallback() {
        if (this.mChildDrawingOrderCallback == null) {
            this.mChildDrawingOrderCallback = new RecyclerView.ChildDrawingOrderCallback() { 
                @Override 
                public int onGetChildDrawingOrder(int i10, int i11) {
                    ChatListItemTouchHelper chatListItemTouchHelper = ChatListItemTouchHelper.this;
                    View view = chatListItemTouchHelper.mOverdrawChild;
                    if (view == null) {
                        return i11;
                    }
                    int i12 = chatListItemTouchHelper.mOverdrawChildPosition;
                    if (i12 == -1) {
                        i12 = chatListItemTouchHelper.mRecyclerView.indexOfChild(view);
                        ChatListItemTouchHelper.this.mOverdrawChildPosition = i12;
                    }
                    if (i11 == i10 - 1) {
                        return i12;
                    }
                    if (i11 < i12) {
                        return i11;
                    }
                    return i11 + 1;
                }
            };
        }
        this.mRecyclerView.setChildDrawingOrderCallback(this.mChildDrawingOrderCallback);
    }

    private int checkHorizontalSwipe(RecyclerView.ViewHolder viewHolder, int i10) {
        int i11;
        if ((i10 & 12) == 0) {
            return 0;
        }
        int i12 = 8;
        if (this.mDx > 0.0f) {
            i11 = 8;
        } else {
            i11 = 4;
        }
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null && this.mActivePointerId > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.mCallback.getSwipeVelocityThreshold(this.mMaxSwipeVelocity));
            float xVelocity = this.mVelocityTracker.getXVelocity(this.mActivePointerId);
            float yVelocity = this.mVelocityTracker.getYVelocity(this.mActivePointerId);
            if (xVelocity <= 0.0f) {
                i12 = 4;
            }
            float abs = Math.abs(xVelocity);
            if ((i12 & i10) != 0 && i11 == i12 && abs >= this.mCallback.getSwipeEscapeVelocity(this.mSwipeEscapeVelocity) && abs > Math.abs(yVelocity)) {
                return i12;
            }
        }
        float width = this.mRecyclerView.getWidth() * this.mCallback.getSwipeThreshold(viewHolder);
        if ((i10 & i11) == 0 || Math.abs(this.mDx) <= width) {
            return 0;
        }
        return i11;
    }

    private int checkVerticalSwipe(RecyclerView.ViewHolder viewHolder, int i10) {
        int i11;
        if ((i10 & 3) == 0) {
            return 0;
        }
        int i12 = 2;
        if (this.mDy > 0.0f) {
            i11 = 2;
        } else {
            i11 = 1;
        }
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null && this.mActivePointerId > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.mCallback.getSwipeVelocityThreshold(this.mMaxSwipeVelocity));
            float xVelocity = this.mVelocityTracker.getXVelocity(this.mActivePointerId);
            float yVelocity = this.mVelocityTracker.getYVelocity(this.mActivePointerId);
            if (yVelocity <= 0.0f) {
                i12 = 1;
            }
            float abs = Math.abs(yVelocity);
            if ((i12 & i10) != 0 && i12 == i11 && abs >= this.mCallback.getSwipeEscapeVelocity(this.mSwipeEscapeVelocity) && abs > Math.abs(xVelocity)) {
                return i12;
            }
        }
        float height = this.mRecyclerView.getHeight() * this.mCallback.getSwipeThreshold(viewHolder);
        if ((i10 & i11) == 0 || Math.abs(this.mDy) <= height) {
            return 0;
        }
        return i11;
    }

    private void destroyCallbacks() {
        this.mRecyclerView.removeItemDecoration(this);
        this.mRecyclerView.removeOnItemTouchListener(this.mOnItemTouchListener);
        this.mRecyclerView.removeOnChildAttachStateChangeListener(this);
        for (int size = this.mRecoverAnimations.size() - 1; size >= 0; size--) {
            RecoverAnimation recoverAnimation = this.mRecoverAnimations.get(0);
            recoverAnimation.cancel();
            this.mCallback.clearView(this.mRecyclerView, recoverAnimation.mViewHolder);
        }
        this.mRecoverAnimations.clear();
        this.mOverdrawChild = null;
        this.mOverdrawChildPosition = -1;
        releaseVelocityTracker();
        stopGestureDetection();
    }

    private List<RecyclerView.ViewHolder> findSwapTargets(RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        List<RecyclerView.ViewHolder> list = this.mSwapTargets;
        if (list == null) {
            this.mSwapTargets = new ArrayList();
            this.mDistances = new ArrayList();
        } else {
            list.clear();
            this.mDistances.clear();
        }
        int boundingBoxMargin = this.mCallback.getBoundingBoxMargin();
        int round = Math.round(this.mSelectedStartX + this.mDx) - boundingBoxMargin;
        int round2 = Math.round(this.mSelectedStartY + this.mDy) - boundingBoxMargin;
        int i10 = boundingBoxMargin * 2;
        int width = viewHolder2.itemView.getWidth() + round + i10;
        int height = viewHolder2.itemView.getHeight() + round2 + i10;
        int i11 = (round + width) / 2;
        int i12 = (round2 + height) / 2;
        RecyclerView.LayoutManager layoutManager = this.mRecyclerView.getLayoutManager();
        int U = layoutManager.U();
        int i13 = 0;
        while (i13 < U) {
            View T = layoutManager.T(i13);
            if (T != viewHolder2.itemView && T.getBottom() >= round2 && T.getTop() <= height && T.getRight() >= round && T.getLeft() <= width) {
                RecyclerView.ViewHolder childViewHolder = this.mRecyclerView.getChildViewHolder(T);
                if (this.mCallback.canDropOver(this.mRecyclerView, this.mSelected, childViewHolder)) {
                    int abs = Math.abs(i11 - ((T.getLeft() + T.getRight()) / 2));
                    int abs2 = Math.abs(i12 - ((T.getTop() + T.getBottom()) / 2));
                    int i14 = (abs * abs) + (abs2 * abs2);
                    int size = this.mSwapTargets.size();
                    int i15 = 0;
                    for (int i16 = 0; i16 < size && i14 > this.mDistances.get(i16).intValue(); i16++) {
                        i15++;
                    }
                    this.mSwapTargets.add(i15, childViewHolder);
                    this.mDistances.add(i15, Integer.valueOf(i14));
                }
            }
            i13++;
            viewHolder2 = viewHolder;
        }
        return this.mSwapTargets;
    }

    private RecyclerView.ViewHolder findSwipedView(MotionEvent motionEvent) {
        View findChildView;
        RecyclerView.LayoutManager layoutManager = this.mRecyclerView.getLayoutManager();
        int i10 = this.mActivePointerId;
        if (i10 == -1) {
            return null;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i10);
        float abs = Math.abs(motionEvent.getX(findPointerIndex) - this.mInitialTouchX);
        float abs2 = Math.abs(motionEvent.getY(findPointerIndex) - this.mInitialTouchY);
        int i11 = this.mSlop;
        if (abs < i11 && abs2 < i11) {
            return null;
        }
        if (abs > abs2 && layoutManager.v()) {
            return null;
        }
        if ((abs2 <= abs || !layoutManager.w()) && (findChildView = findChildView(motionEvent)) != null) {
            return this.mRecyclerView.getChildViewHolder(findChildView);
        }
        return null;
    }

    private void getSelectedDxDy(float[] fArr) {
        if ((this.mSelectedFlags & 12) != 0) {
            fArr[0] = (this.mSelectedStartX + this.mDx) - this.mSelected.itemView.getLeft();
        } else {
            fArr[0] = this.mSelected.itemView.getTranslationX();
        }
        if ((this.mSelectedFlags & 3) != 0) {
            fArr[1] = (this.mSelectedStartY + this.mDy) - this.mSelected.itemView.getTop();
        } else {
            fArr[1] = this.mSelected.itemView.getTranslationY();
        }
    }

    private static boolean hitTest(View view, float f10, float f11, float f12, float f13) {
        if (f10 < f12 || f10 > f12 + view.getWidth() || f11 < f13 || f11 > f13 + view.getHeight()) {
            return false;
        }
        return true;
    }

    private void releaseVelocityTracker() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    private void setupCallbacks() {
        this.mSlop = ViewConfiguration.get(this.mRecyclerView.getContext()).getScaledTouchSlop();
        this.mRecyclerView.addItemDecoration(this);
        this.mRecyclerView.addOnItemTouchListener(this.mOnItemTouchListener);
        this.mRecyclerView.addOnChildAttachStateChangeListener(this);
        startGestureDetection();
    }

    private void startGestureDetection() {
        this.mItemTouchHelperGestureListener = new ItemTouchHelperGestureListener();
        this.mGestureDetector = new GestureDetectorCompat(this.mRecyclerView.getContext(), this.mItemTouchHelperGestureListener);
    }

    private void stopGestureDetection() {
        ItemTouchHelperGestureListener itemTouchHelperGestureListener = this.mItemTouchHelperGestureListener;
        if (itemTouchHelperGestureListener != null) {
            itemTouchHelperGestureListener.doNotReactToLongPress();
            this.mItemTouchHelperGestureListener = null;
        }
        if (this.mGestureDetector != null) {
            this.mGestureDetector = null;
        }
    }

    private int swipeIfNecessary(RecyclerView.ViewHolder viewHolder) {
        if (this.mActionState == 2) {
            return 0;
        }
        int movementFlags = this.mCallback.getMovementFlags(this.mRecyclerView, viewHolder);
        int convertToAbsoluteDirection = (this.mCallback.convertToAbsoluteDirection(movementFlags, w0.B(this.mRecyclerView)) & ACTION_MODE_SWIPE_MASK) >> 8;
        if (convertToAbsoluteDirection == 0) {
            return 0;
        }
        int i10 = (movementFlags & ACTION_MODE_SWIPE_MASK) >> 8;
        if (Math.abs(this.mDx) > Math.abs(this.mDy)) {
            int checkHorizontalSwipe = checkHorizontalSwipe(viewHolder, convertToAbsoluteDirection);
            if (checkHorizontalSwipe <= 0) {
                int checkVerticalSwipe = checkVerticalSwipe(viewHolder, convertToAbsoluteDirection);
                if (checkVerticalSwipe > 0) {
                    return checkVerticalSwipe;
                }
            } else if ((i10 & checkHorizontalSwipe) == 0) {
                return ItemTouchHelper.c.convertToRelativeDirection(checkHorizontalSwipe, w0.B(this.mRecyclerView));
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
                if ((i10 & checkHorizontalSwipe2) == 0) {
                    return ItemTouchHelper.c.convertToRelativeDirection(checkHorizontalSwipe2, w0.B(this.mRecyclerView));
                }
                return checkHorizontalSwipe2;
            }
        }
        return 0;
    }

    public void attachToRecyclerView(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.mRecyclerView;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                destroyCallbacks();
            }
            this.mRecyclerView = recyclerView;
            if (recyclerView != null) {
                Resources resources = recyclerView.getResources();
                this.mSwipeEscapeVelocity = resources.getDimension(b.f22906f);
                this.mMaxSwipeVelocity = resources.getDimension(b.f22905e);
                setupCallbacks();
            }
        }
    }

    void checkSelectForSwipe(int i10, MotionEvent motionEvent, int i11) {
        RecyclerView.ViewHolder findSwipedView;
        int absoluteMovementFlags;
        if (this.mSelected == null && i10 == 2 && this.mActionState != 2 && this.mCallback.isItemViewSwipeEnabled() && this.mRecyclerView.getScrollState() != 1 && (findSwipedView = findSwipedView(motionEvent)) != null && (absoluteMovementFlags = (this.mCallback.getAbsoluteMovementFlags(this.mRecyclerView, findSwipedView) & ACTION_MODE_SWIPE_MASK) >> 8) != 0) {
            float x10 = motionEvent.getX(i11);
            float y10 = motionEvent.getY(i11);
            float f10 = x10 - this.mInitialTouchX;
            float f11 = y10 - this.mInitialTouchY;
            float abs = Math.abs(f10);
            float abs2 = Math.abs(f11);
            int i12 = this.mSlop;
            if (abs >= i12 || abs2 >= i12) {
                if (abs > abs2) {
                    if (f10 < 0.0f && (absoluteMovementFlags & 4) == 0) {
                        return;
                    }
                    if (f10 > 0.0f && (absoluteMovementFlags & 8) == 0) {
                        return;
                    }
                } else if (f11 < 0.0f && (absoluteMovementFlags & 1) == 0) {
                    return;
                } else {
                    if (f11 > 0.0f && (absoluteMovementFlags & 2) == 0) {
                        return;
                    }
                }
                this.mDy = 0.0f;
                this.mDx = 0.0f;
                this.mActivePointerId = motionEvent.getPointerId(0);
                select(findSwipedView, 1);
            }
        }
    }

    void endRecoverAnimation(RecyclerView.ViewHolder viewHolder, boolean z10) {
        for (int size = this.mRecoverAnimations.size() - 1; size >= 0; size--) {
            RecoverAnimation recoverAnimation = this.mRecoverAnimations.get(size);
            if (recoverAnimation.mViewHolder == viewHolder) {
                recoverAnimation.mOverridden |= z10;
                if (!recoverAnimation.mEnded) {
                    recoverAnimation.cancel();
                }
                this.mRecoverAnimations.remove(size);
                return;
            }
        }
    }

    RecoverAnimation findAnimation(MotionEvent motionEvent) {
        if (this.mRecoverAnimations.isEmpty()) {
            return null;
        }
        View findChildView = findChildView(motionEvent);
        for (int size = this.mRecoverAnimations.size() - 1; size >= 0; size--) {
            RecoverAnimation recoverAnimation = this.mRecoverAnimations.get(size);
            if (recoverAnimation.mViewHolder.itemView == findChildView) {
                return recoverAnimation;
            }
        }
        return null;
    }

    View findChildView(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        RecyclerView.ViewHolder viewHolder = this.mSelected;
        if (viewHolder != null) {
            View view = viewHolder.itemView;
            if (hitTest(view, x10, y10, this.mSelectedStartX + this.mDx, this.mSelectedStartY + this.mDy)) {
                return view;
            }
        }
        for (int size = this.mRecoverAnimations.size() - 1; size >= 0; size--) {
            RecoverAnimation recoverAnimation = this.mRecoverAnimations.get(size);
            View view2 = recoverAnimation.mViewHolder.itemView;
            if (hitTest(view2, x10, y10, recoverAnimation.mX, recoverAnimation.mY)) {
                return view2;
            }
        }
        return this.mRecyclerView.findChildViewUnder(x10, y10);
    }

    @Override 
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        rect.setEmpty();
    }

    boolean hasRunningRecoverAnim() {
        int size = this.mRecoverAnimations.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!this.mRecoverAnimations.get(i10).mEnded) {
                return true;
            }
        }
        return false;
    }

    void moveIfNecessary(RecyclerView.ViewHolder viewHolder) {
        if (!this.mRecyclerView.isLayoutRequested() && this.mActionState == 2) {
            float moveThreshold = this.mCallback.getMoveThreshold(viewHolder);
            int i10 = (int) (this.mSelectedStartX + this.mDx);
            int i11 = (int) (this.mSelectedStartY + this.mDy);
            if (Math.abs(i11 - viewHolder.itemView.getTop()) >= viewHolder.itemView.getHeight() * moveThreshold || Math.abs(i10 - viewHolder.itemView.getLeft()) >= viewHolder.itemView.getWidth() * moveThreshold) {
                List<RecyclerView.ViewHolder> findSwapTargets = findSwapTargets(viewHolder);
                if (findSwapTargets.size() != 0) {
                    RecyclerView.ViewHolder chooseDropTarget = this.mCallback.chooseDropTarget(viewHolder, findSwapTargets, i10, i11);
                    if (chooseDropTarget == null) {
                        this.mSwapTargets.clear();
                        this.mDistances.clear();
                        return;
                    }
                    int absoluteAdapterPosition = chooseDropTarget.getAbsoluteAdapterPosition();
                    int absoluteAdapterPosition2 = viewHolder.getAbsoluteAdapterPosition();
                    if (this.mCallback.onMove(this.mRecyclerView, viewHolder, chooseDropTarget)) {
                        this.mCallback.onMoved(this.mRecyclerView, viewHolder, absoluteAdapterPosition2, chooseDropTarget, absoluteAdapterPosition, i10, i11);
                    }
                }
            }
        }
    }

    void obtainVelocityTracker() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.mVelocityTracker = VelocityTracker.obtain();
    }

    @Override 
    public void onChildViewAttachedToWindow(View view) {
    }

    @Override 
    public void onChildViewDetachedFromWindow(View view) {
        removeChildDrawingOrderCallbackIfNecessary(view);
        RecyclerView.ViewHolder childViewHolder = this.mRecyclerView.getChildViewHolder(view);
        if (childViewHolder != null) {
            RecyclerView.ViewHolder viewHolder = this.mSelected;
            if (viewHolder == null || childViewHolder != viewHolder) {
                endRecoverAnimation(childViewHolder, false);
                if (this.mPendingCleanup.remove(childViewHolder.itemView)) {
                    this.mCallback.clearView(this.mRecyclerView, childViewHolder);
                    return;
                }
                return;
            }
            select(null, 0);
        }
    }

    @Override 
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        float f10;
        float f11;
        this.mOverdrawChildPosition = -1;
        if (this.mSelected != null) {
            getSelectedDxDy(this.mTmpPosition);
            float[] fArr = this.mTmpPosition;
            float f12 = fArr[0];
            f10 = fArr[1];
            f11 = f12;
        } else {
            f11 = 0.0f;
            f10 = 0.0f;
        }
        this.mCallback.onDraw(canvas, recyclerView, this.mSelected, this.mRecoverAnimations, this.mActionState, f11, f10);
    }

    @Override 
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        float f10;
        float f11;
        if (this.mSelected != null) {
            getSelectedDxDy(this.mTmpPosition);
            float[] fArr = this.mTmpPosition;
            float f12 = fArr[0];
            f10 = fArr[1];
            f11 = f12;
        } else {
            f11 = 0.0f;
            f10 = 0.0f;
        }
        this.mCallback.onDrawOver(canvas, recyclerView, this.mSelected, this.mRecoverAnimations, this.mActionState, f11, f10);
    }

    void postDispatchSwipe(final RecoverAnimation recoverAnimation, final int i10) {
        this.mRecyclerView.post(new Runnable() { 
            @Override 
            public void run() {
                RecyclerView recyclerView = ChatListItemTouchHelper.this.mRecyclerView;
                if (recyclerView != null && recyclerView.isAttachedToWindow()) {
                    RecoverAnimation recoverAnimation2 = recoverAnimation;
                    if (!recoverAnimation2.mOverridden && recoverAnimation2.mViewHolder.getAbsoluteAdapterPosition() != -1) {
                        RecyclerView.ItemAnimator itemAnimator = ChatListItemTouchHelper.this.mRecyclerView.getItemAnimator();
                        if ((itemAnimator == null || !itemAnimator.isRunning(null)) && !ChatListItemTouchHelper.this.hasRunningRecoverAnim()) {
                            ChatListItemTouchHelper.this.mCallback.onSwiped(recoverAnimation.mViewHolder, i10);
                        } else {
                            ChatListItemTouchHelper.this.mRecyclerView.post(this);
                        }
                    }
                }
            }
        });
    }

    void removeChildDrawingOrderCallbackIfNecessary(View view) {
        if (view == this.mOverdrawChild) {
            this.mOverdrawChild = null;
            if (this.mChildDrawingOrderCallback != null) {
                this.mRecyclerView.setChildDrawingOrderCallback(null);
            }
        }
    }

    
    
    
    
    
    
    
    
    boolean scrollIfNecessary() {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.list.ChatListItemTouchHelper.scrollIfNecessary():boolean");
    }

    void select(RecyclerView.ViewHolder viewHolder, int i10) {
        boolean z10;
        boolean z11;
        final int i11;
        float f10;
        float f11;
        int i12;
        if (viewHolder != this.mSelected || i10 != this.mActionState) {
            this.mDragScrollStartTimeInMs = Long.MIN_VALUE;
            int i13 = this.mActionState;
            endRecoverAnimation(viewHolder, true);
            this.mActionState = i10;
            if (i10 == 2) {
                if (viewHolder != null) {
                    this.mOverdrawChild = viewHolder.itemView;
                    addChildDrawingOrderCallback();
                } else {
                    throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
                }
            }
            int i14 = (1 << ((i10 * 8) + 8)) - 1;
            final RecyclerView.ViewHolder viewHolder2 = this.mSelected;
            if (viewHolder2 != null) {
                if (viewHolder2.itemView.getParent() != null) {
                    if (!this.mCallback.shouldReturnToOriginalPosition() && i13 != 2) {
                        i11 = swipeIfNecessary(viewHolder2);
                    } else {
                        i11 = 0;
                    }
                    releaseVelocityTracker();
                    int i15 = 4;
                    if (i11 == 1 || i11 == 2) {
                        f11 = 0.0f;
                        f10 = Math.signum(this.mDy) * this.mRecyclerView.getHeight();
                    } else if (i11 == 4 || i11 == 8 || i11 == 16 || i11 == 32) {
                        f10 = 0.0f;
                        f11 = Math.signum(this.mDx) * this.mRecyclerView.getWidth();
                    } else {
                        f11 = 0.0f;
                        f10 = 0.0f;
                    }
                    if (i13 == 2) {
                        i12 = 8;
                    } else if (i11 > 0) {
                        i12 = 2;
                    } else {
                        if (this.mCallback.shouldUseSpringyExit()) {
                            i15 = 8;
                        }
                        i12 = i15;
                    }
                    getSelectedDxDy(this.mTmpPosition);
                    float[] fArr = this.mTmpPosition;
                    float f12 = fArr[0];
                    float f13 = fArr[1];
                    RecoverAnimation recoverAnimation = new RecoverAnimation(viewHolder2, i12, i13, f12, f13, f11, f10) { 
                        @Override 
                        public void onAnimationEnd(Animator animator) {
                            super.onAnimationEnd(animator);
                            if (!this.mOverridden) {
                                if (i11 <= 0) {
                                    ChatListItemTouchHelper chatListItemTouchHelper = ChatListItemTouchHelper.this;
                                    chatListItemTouchHelper.mCallback.clearView(chatListItemTouchHelper.mRecyclerView, viewHolder2);
                                } else {
                                    ChatListItemTouchHelper.this.mPendingCleanup.add(viewHolder2.itemView);
                                    this.mIsPendingCleanup = true;
                                    int i16 = i11;
                                    if (i16 > 0) {
                                        ChatListItemTouchHelper.this.postDispatchSwipe(this, i16);
                                    }
                                }
                                ChatListItemTouchHelper chatListItemTouchHelper2 = ChatListItemTouchHelper.this;
                                View view = chatListItemTouchHelper2.mOverdrawChild;
                                View view2 = viewHolder2.itemView;
                                if (view == view2) {
                                    chatListItemTouchHelper2.removeChildDrawingOrderCallbackIfNecessary(view2);
                                }
                            }
                        }
                    };
                    recoverAnimation.setDuration(this.mCallback.getAnimationDuration(this.mRecyclerView, i12, f11 - f12, f10 - f13));
                    this.mRecoverAnimations.add(recoverAnimation);
                    recoverAnimation.start();
                    z11 = true;
                } else {
                    removeChildDrawingOrderCallbackIfNecessary(viewHolder2.itemView);
                    this.mCallback.clearView(this.mRecyclerView, viewHolder2);
                    z11 = false;
                }
                this.mSelected = null;
                z10 = z11;
            } else {
                z10 = false;
            }
            if (viewHolder != null) {
                this.mSelectedFlags = (this.mCallback.getAbsoluteMovementFlags(this.mRecyclerView, viewHolder) & i14) >> (this.mActionState * 8);
                this.mSelectedStartX = viewHolder.itemView.getLeft();
                this.mSelectedStartY = viewHolder.itemView.getTop();
                this.mSelected = viewHolder;
                if (i10 == 2) {
                    viewHolder.itemView.performHapticFeedback(0);
                }
            }
            if (!z10) {
                this.mRecyclerView.getLayoutManager().D1();
            }
            this.mCallback.onSelectedChanged(this.mSelected, this.mActionState);
            this.mRecyclerView.invalidate();
        }
    }

    public void startDrag(RecyclerView.ViewHolder viewHolder) {
        if (this.mCallback.hasDragFlag(this.mRecyclerView, viewHolder) && viewHolder.itemView.getParent() == this.mRecyclerView) {
            obtainVelocityTracker();
            this.mDy = 0.0f;
            this.mDx = 0.0f;
            select(viewHolder, 2);
        }
    }

    void updateDxDy(MotionEvent motionEvent, int i10, int i11) {
        Pair effectiveDxDy = this.mCallback.getEffectiveDxDy(motionEvent.getX(i11) - this.mInitialTouchX, motionEvent.getY(i11) - this.mInitialTouchY);
        this.mDx = ((Float) effectiveDxDy.first).floatValue();
        this.mDy = ((Float) effectiveDxDy.second).floatValue();
        if ((i10 & 4) == 0) {
            this.mDx = Math.max(0.0f, this.mDx);
        }
        if ((i10 & 8) == 0) {
            this.mDx = Math.min(0.0f, this.mDx);
        }
        if ((i10 & 1) == 0) {
            this.mDy = Math.max(0.0f, this.mDy);
        }
        if ((i10 & 2) == 0) {
            this.mDy = Math.min(0.0f, this.mDy);
        }
    }
}
