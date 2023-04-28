package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import android.view.View;
import com.facebook.react.C5072R;
import com.facebook.react.common.ReactConstants;
import p414x3.C13925a;

/* loaded from: classes7.dex */
public class PointerEventHelper {
    public static final String POINTER_CANCEL = "topPointerCancel";
    public static final String POINTER_DOWN = "topPointerDown";
    public static final String POINTER_ENTER = "topPointerEnter";
    public static final String POINTER_LEAVE = "topPointerLeave";
    public static final String POINTER_MOVE = "topPointerMove";
    public static final String POINTER_TYPE_MOUSE = "mouse";
    public static final String POINTER_TYPE_PEN = "pen";
    public static final String POINTER_TYPE_TOUCH = "touch";
    public static final String POINTER_TYPE_UNKNOWN = "";
    public static final String POINTER_UP = "topPointerUp";
    private static final int X_FLAG_SUPPORTS_HOVER = 16777216;

    /* renamed from: com.facebook.react.uimanager.events.PointerEventHelper$1 */
    /* loaded from: classes7.dex */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: $SwitchMap$com$facebook$react$uimanager$events$PointerEventHelper$EVENT */
        static final /* synthetic */ int[] f37200x82302621;

        static {
            int[] iArr = new int[EVENT.values().length];
            f37200x82302621 = iArr;
            try {
                iArr[EVENT.LEAVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37200x82302621[EVENT.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37200x82302621[EVENT.MOVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37200x82302621[EVENT.ENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37200x82302621[EVENT.CANCEL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f37200x82302621[EVENT.UP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f37200x82302621[EVENT.DOWN_CAPTURE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f37200x82302621[EVENT.UP_CAPTURE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f37200x82302621[EVENT.CANCEL_CAPTURE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f37200x82302621[EVENT.ENTER_CAPTURE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f37200x82302621[EVENT.LEAVE_CAPTURE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f37200x82302621[EVENT.MOVE_CAPTURE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* loaded from: classes7.dex */
    public enum EVENT {
        CANCEL,
        CANCEL_CAPTURE,
        DOWN,
        DOWN_CAPTURE,
        ENTER,
        ENTER_CAPTURE,
        LEAVE,
        LEAVE_CAPTURE,
        MOVE,
        MOVE_CAPTURE,
        UP,
        UP_CAPTURE
    }

    public static String getDispatchableEventName(EVENT event) {
        switch (AnonymousClass1.f37200x82302621[event.ordinal()]) {
            case 1:
                return POINTER_LEAVE;
            case 2:
                return POINTER_DOWN;
            case 3:
                return POINTER_MOVE;
            case 4:
                return POINTER_ENTER;
            case 5:
                return POINTER_CANCEL;
            case 6:
                return POINTER_UP;
            default:
                C13925a.m2288j(ReactConstants.TAG, "No dispatchable event name for type: " + event);
                return null;
        }
    }

    public static int getEventCategory(String str) {
        if (str == null) {
            return 2;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1786514288:
                if (str.equals(POINTER_ENTER)) {
                    c = 0;
                    break;
                }
                break;
            case -1780335505:
                if (str.equals(POINTER_LEAVE)) {
                    c = 1;
                    break;
                }
                break;
            case -1304584214:
                if (str.equals(POINTER_DOWN)) {
                    c = 2;
                    break;
                }
                break;
            case -1304316135:
                if (str.equals(POINTER_MOVE)) {
                    c = 3;
                    break;
                }
                break;
            case -1065042973:
                if (str.equals(POINTER_UP)) {
                    c = 4;
                    break;
                }
                break;
            case 383186882:
                if (str.equals(POINTER_CANCEL)) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 3:
                return 4;
            case 2:
            case 4:
            case 5:
                return 3;
            default:
                return 2;
        }
    }

    public static String getW3CPointerType(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "" : POINTER_TYPE_MOUSE : POINTER_TYPE_PEN : POINTER_TYPE_TOUCH;
    }

    public static boolean isListening(View view, EVENT event) {
        Object obj;
        if (view == null) {
            return false;
        }
        switch (AnonymousClass1.f37200x82302621[event.ordinal()]) {
            case 1:
                obj = view.getTag(C5072R.C5074id.pointer_leave);
                break;
            case 2:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            case 3:
                obj = view.getTag(C5072R.C5074id.pointer_move);
                break;
            case 4:
                obj = view.getTag(C5072R.C5074id.pointer_enter);
                break;
            case 10:
                obj = view.getTag(C5072R.C5074id.pointer_enter_capture);
                break;
            case 11:
                obj = view.getTag(C5072R.C5074id.pointer_leave_capture);
                break;
            case 12:
                obj = view.getTag(C5072R.C5074id.pointer_move_capture);
                break;
            default:
                obj = null;
                break;
        }
        if (obj != null && (obj instanceof Boolean)) {
            return ((Boolean) obj).booleanValue();
        }
        return false;
    }

    public static boolean supportsHover(MotionEvent motionEvent) {
        boolean z;
        if ((motionEvent.getFlags() & X_FLAG_SUPPORTS_HOVER) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        String w3CPointerType = getW3CPointerType(motionEvent.getToolType(motionEvent.getActionIndex()));
        if (w3CPointerType.equals(POINTER_TYPE_MOUSE) || w3CPointerType.equals(POINTER_TYPE_PEN)) {
            return true;
        }
        w3CPointerType.equals(POINTER_TYPE_TOUCH);
        return false;
    }
}
