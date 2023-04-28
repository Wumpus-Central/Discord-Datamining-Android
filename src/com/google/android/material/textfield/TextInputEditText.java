package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.C1687k;
import com.google.android.material.internal.C5650g;
import com.google.android.material.internal.C5662m;
import p083eb.C6803b;
import p083eb.C6811j;
import p083eb.C6812k;
import p462zb.C14615a;

/* loaded from: classes3.dex */
public class TextInputEditText extends C1687k {

    /* renamed from: k */
    private final Rect f11206k;

    /* renamed from: l */
    private boolean f11207l;

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6803b.f14540n);
    }

    /* renamed from: a */
    private boolean m27658a(TextInputLayout textInputLayout) {
        return textInputLayout != null && this.f11207l;
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (m27658a(textInputLayout) && rect != null) {
            textInputLayout.getFocusedRect(this.f11206k);
            rect.bottom = this.f11206k.bottom;
        }
    }

    @Override // android.view.View
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (m27658a(textInputLayout)) {
            return textInputLayout.getGlobalVisibleRect(rect, point);
        }
        return super.getGlobalVisibleRect(rect, point);
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout == null || !textInputLayout.m27638O()) {
            return super.getHint();
        }
        return textInputLayout.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.m27638O() && super.getHint() == null && C5650g.m27868a()) {
            setHint("");
        }
    }

    @Override // androidx.appcompat.widget.C1687k, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        getTextInputLayout();
    }

    @Override // android.view.View
    public boolean requestRectangleOnScreen(Rect rect) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!m27658a(textInputLayout) || rect == null) {
            return super.requestRectangleOnScreen(rect);
        }
        this.f11206k.set(rect.left, rect.top, rect.right, rect.bottom + (textInputLayout.getHeight() - getHeight()));
        return super.requestRectangleOnScreen(this.f11206k);
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z) {
        this.f11207l = z;
    }

    public TextInputEditText(Context context, AttributeSet attributeSet, int i) {
        super(C14615a.m126c(context, attributeSet, i, 0), attributeSet, i);
        this.f11206k = new Rect();
        TypedArray h = C5662m.m27838h(context, attributeSet, C6812k.f14835t5, i, C6811j.f14661g, new int[0]);
        setTextInputLayoutFocusedRectEnabled(h.getBoolean(C6812k.f14843u5, false));
        h.recycle();
    }
}
