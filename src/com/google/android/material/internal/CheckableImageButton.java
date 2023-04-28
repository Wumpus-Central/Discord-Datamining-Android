package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.appcompat.widget.C1693m;
import androidx.core.view.C2549a;
import androidx.core.view.C2733w0;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import p052d.C6379a;
import p125h1.AbstractC7736a;

/* loaded from: classes3.dex */
public class CheckableImageButton extends C1693m implements Checkable {

    /* renamed from: q */
    private static final int[] f10967q = {16842912};

    /* renamed from: n */
    private boolean f10968n;

    /* renamed from: o */
    private boolean f10969o;

    /* renamed from: p */
    private boolean f10970p;

    /* renamed from: com.google.android.material.internal.CheckableImageButton$a */
    /* loaded from: classes3.dex */
    class C5638a extends C2549a {
        C5638a() {
        }

        @Override // androidx.core.view.C2549a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // androidx.core.view.C2549a
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.m37392Y(CheckableImageButton.this.m27973a());
            accessibilityNodeInfoCompat.m37391Z(CheckableImageButton.this.isChecked());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.internal.CheckableImageButton$b */
    /* loaded from: classes3.dex */
    public static class C5639b extends AbstractC7736a {
        public static final Parcelable.Creator<C5639b> CREATOR = new C5640a();

        /* renamed from: m */
        boolean f10972m;

        /* renamed from: com.google.android.material.internal.CheckableImageButton$b$a */
        /* loaded from: classes3.dex */
        class C5640a implements Parcelable.ClassLoaderCreator<C5639b> {
            C5640a() {
            }

            /* renamed from: a */
            public C5639b createFromParcel(Parcel parcel) {
                return new C5639b(parcel, null);
            }

            /* renamed from: b */
            public C5639b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C5639b(parcel, classLoader);
            }

            /* renamed from: c */
            public C5639b[] newArray(int i) {
                return new C5639b[i];
            }
        }

        public C5639b(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: b */
        private void m27972b(Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f10972m = z;
        }

        @Override // p125h1.AbstractC7736a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f10972m ? 1 : 0);
        }

        public C5639b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m27972b(parcel);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6379a.f37737C);
    }

    /* renamed from: a */
    public boolean m27973a() {
        return this.f10969o;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f10968n;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i) {
        if (!this.f10968n) {
            return super.onCreateDrawableState(i);
        }
        int[] iArr = f10967q;
        return View.mergeDrawableStates(super.onCreateDrawableState(i + iArr.length), iArr);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C5639b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C5639b bVar = (C5639b) parcelable;
        super.onRestoreInstanceState(bVar.m21547a());
        setChecked(bVar.f10972m);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        C5639b bVar = new C5639b(super.onSaveInstanceState());
        bVar.f10972m = this.f10968n;
        return bVar;
    }

    public void setCheckable(boolean z) {
        if (this.f10969o != z) {
            this.f10969o = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.f10969o && this.f10968n != z) {
            this.f10968n = z;
            refreshDrawableState();
            sendAccessibilityEvent(RecyclerView.ItemAnimator.FLAG_MOVED);
        }
    }

    public void setPressable(boolean z) {
        this.f10970p = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.f10970p) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f10968n);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10969o = true;
        this.f10970p = true;
        C2733w0.m36990q0(this, new C5638a());
    }
}
