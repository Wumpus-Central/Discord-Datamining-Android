package com.swmansion.reanimated.transitions;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.transition.AbstractC3197d1;
import androidx.transition.C3191c0;
import androidx.transition.C3204f;
import androidx.transition.C3217g;
import androidx.transition.C3226h;
import androidx.transition.C3269x;
import androidx.transition.Transition;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewProps;

/* loaded from: classes8.dex */
class TransitionUtils {
    TransitionUtils() {
    }

    private static void configureTransition(Transition transition, ReadableMap readableMap) {
        if (readableMap.hasKey("durationMs")) {
            transition.setDuration(readableMap.getInt("durationMs"));
        }
        if (readableMap.hasKey("interpolation")) {
            String string = readableMap.getString("interpolation");
            if (string.equals("easeIn")) {
                transition.setInterpolator(new AccelerateInterpolator());
            } else if (string.equals("easeOut")) {
                transition.setInterpolator(new DecelerateInterpolator());
            } else if (string.equals("easeInOut")) {
                transition.setInterpolator(new AccelerateDecelerateInterpolator());
            } else if (string.equals("linear")) {
                transition.setInterpolator(new LinearInterpolator());
            } else {
                throw new JSApplicationIllegalArgumentException("Invalid interpolation type " + string);
            }
        }
        if (readableMap.hasKey("propagation")) {
            String string2 = readableMap.getString("propagation");
            SaneSidePropagation saneSidePropagation = new SaneSidePropagation();
            if (ViewProps.TOP.equals(string2)) {
                saneSidePropagation.setSide(80);
            } else if (ViewProps.BOTTOM.equals(string2)) {
                saneSidePropagation.setSide(48);
            } else if (ViewProps.LEFT.equals(string2)) {
                saneSidePropagation.setSide(5);
            } else if (ViewProps.RIGHT.equals(string2)) {
                saneSidePropagation.setSide(3);
            }
            transition.setPropagation(saneSidePropagation);
        } else {
            transition.setPropagation(null);
        }
        if (readableMap.hasKey("delayMs")) {
            transition.setStartDelay(readableMap.getInt("delayMs"));
        }
    }

    private static AbstractC3197d1 createTransition(String str) {
        if (str == null || ViewProps.NONE.equals(str)) {
            return null;
        }
        if ("fade".equals(str)) {
            return new C3226h(3);
        }
        if ("scale".equals(str)) {
            return new Scale();
        }
        if ("slide-top".equals(str)) {
            return new C3269x(48);
        }
        if ("slide-bottom".equals(str)) {
            return new C3269x(80);
        }
        if ("slide-right".equals(str)) {
            return new C3269x(5);
        }
        if ("slide-left".equals(str)) {
            return new C3269x(3);
        }
        throw new JSApplicationIllegalArgumentException("Invalid transition type " + str);
    }

    static AbstractC3197d1 createVisibilityTransition(String str) {
        if (str == null || ViewProps.NONE.equals(str)) {
            return null;
        }
        if ("fade".equals(str)) {
            return new C3226h(3);
        }
        if ("scale".equals(str)) {
            return new Scale();
        }
        if ("slide-top".equals(str)) {
            return new C3269x(48);
        }
        if ("slide-bottom".equals(str)) {
            return new C3269x(80);
        }
        if ("slide-right".equals(str)) {
            return new C3269x(5);
        }
        if ("slide-left".equals(str)) {
            return new C3269x(3);
        }
        throw new JSApplicationIllegalArgumentException("Invalid transition type " + str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Transition inflate(ReadableMap readableMap) {
        String string = readableMap.getString("type");
        if ("group".equals(string)) {
            return inflateGroup(readableMap);
        }
        if ("in".equals(string)) {
            return inflateIn(readableMap);
        }
        if ("out".equals(string)) {
            return inflateOut(readableMap);
        }
        if ("change".equals(string)) {
            return inflateChange(readableMap);
        }
        throw new JSApplicationIllegalArgumentException("Unrecognized transition type " + string);
    }

    private static Transition inflateChange(ReadableMap readableMap) {
        C3204f fVar = new C3204f();
        C3217g gVar = new C3217g();
        configureTransition(fVar, readableMap);
        configureTransition(gVar, readableMap);
        return new C3191c0().m34968h(fVar).m34968h(gVar);
    }

    private static Transition inflateGroup(ReadableMap readableMap) {
        C3191c0 c0Var = new C3191c0();
        if (!readableMap.hasKey("sequence") || !readableMap.getBoolean("sequence")) {
            c0Var.m34957u(0);
        } else {
            c0Var.m34957u(1);
        }
        ReadableArray array = readableMap.getArray("transitions");
        int size = array.size();
        for (int i = 0; i < size; i++) {
            Transition inflate = inflate(array.getMap(i));
            if (inflate != null) {
                c0Var.m34968h(inflate);
            }
        }
        return c0Var;
    }

    private static Transition inflateIn(ReadableMap readableMap) {
        AbstractC3197d1 createTransition = createTransition(readableMap.getString("animation"));
        if (createTransition == null) {
            return null;
        }
        createTransition.setMode(1);
        configureTransition(createTransition, readableMap);
        return createTransition;
    }

    private static Transition inflateOut(ReadableMap readableMap) {
        AbstractC3197d1 createTransition = createTransition(readableMap.getString("animation"));
        if (createTransition == null) {
            return null;
        }
        createTransition.setMode(2);
        configureTransition(createTransition, readableMap);
        return createTransition;
    }
}
