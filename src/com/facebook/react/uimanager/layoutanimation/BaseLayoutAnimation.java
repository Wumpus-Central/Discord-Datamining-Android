package com.facebook.react.uimanager.layoutanimation;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import com.facebook.react.uimanager.IllegalViewOperationException;

/* loaded from: classes7.dex */
abstract class BaseLayoutAnimation extends AbstractLayoutAnimation {

    /* renamed from: com.facebook.react.uimanager.layoutanimation.BaseLayoutAnimation$1 */
    /* loaded from: classes7.dex */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: $SwitchMap$com$facebook$react$uimanager$layoutanimation$AnimatedPropertyType */
        static final /* synthetic */ int[] f37202x36728427;

        static {
            int[] iArr = new int[AnimatedPropertyType.values().length];
            f37202x36728427 = iArr;
            try {
                iArr[AnimatedPropertyType.OPACITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37202x36728427[AnimatedPropertyType.SCALE_XY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37202x36728427[AnimatedPropertyType.SCALE_X.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37202x36728427[AnimatedPropertyType.SCALE_Y.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // com.facebook.react.uimanager.layoutanimation.AbstractLayoutAnimation
    Animation createAnimationImpl(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        AnimatedPropertyType animatedPropertyType = this.mAnimatedProperty;
        if (animatedPropertyType != null) {
            int i5 = AnonymousClass1.f37202x36728427[animatedPropertyType.ordinal()];
            float f8 = 0.0f;
            if (i5 == 1) {
                if (isReverse()) {
                    f = view.getAlpha();
                } else {
                    f = 0.0f;
                }
                if (!isReverse()) {
                    f8 = view.getAlpha();
                }
                return new OpacityAnimation(view, f, f8);
            } else if (i5 == 2) {
                if (isReverse()) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.0f;
                }
                if (isReverse()) {
                    f3 = 0.0f;
                } else {
                    f3 = 1.0f;
                }
                return new ScaleAnimation(f2, f3, f2, f3, 1, 0.5f, 1, 0.5f);
            } else if (i5 == 3) {
                if (isReverse()) {
                    f4 = 1.0f;
                } else {
                    f4 = 0.0f;
                }
                if (isReverse()) {
                    f5 = 0.0f;
                } else {
                    f5 = 1.0f;
                }
                return new ScaleAnimation(f4, f5, 1.0f, 1.0f, 1, 0.5f, 1, 0.0f);
            } else if (i5 == 4) {
                if (isReverse()) {
                    f6 = 1.0f;
                } else {
                    f6 = 0.0f;
                }
                if (isReverse()) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                return new ScaleAnimation(1.0f, 1.0f, f6, f7, 1, 0.0f, 1, 0.5f);
            } else {
                throw new IllegalViewOperationException("Missing animation for property : " + this.mAnimatedProperty);
            }
        } else {
            throw new IllegalViewOperationException("Missing animated property from animation config");
        }
    }

    abstract boolean isReverse();

    @Override // com.facebook.react.uimanager.layoutanimation.AbstractLayoutAnimation
    boolean isValid() {
        return this.mDurationMs > 0 && this.mAnimatedProperty != null;
    }
}
