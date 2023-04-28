package com.henninghall.date_picker.pickers;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.henninghall.date_picker.pickers.AbstractC5907a;
import p035c2.C3755a;
import p044ce.C3988a;

/* loaded from: classes6.dex */
public class IosClone extends C3755a implements AbstractC5907a {

    /* renamed from: P0 */
    private AbstractC5907a.AbstractC5908b f37608P0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.henninghall.date_picker.pickers.IosClone$a */
    /* loaded from: classes6.dex */
    public class C5905a implements C3755a.AbstractC3759e {

        /* renamed from: a */
        final /* synthetic */ AbstractC5907a f11761a;

        C5905a(AbstractC5907a aVar) {
            this.f11761a = aVar;
        }

        @Override // p035c2.C3755a.AbstractC3759e
        /* renamed from: a */
        public void mo26897a(C3755a aVar, int i, int i2) {
            C3988a.m33188g(this.f11761a, i2);
            if (IosClone.this.f37608P0 != null) {
                IosClone.this.f37608P0.mo26892a(this.f11761a, i, i2);
            }
        }
    }

    /* renamed from: com.henninghall.date_picker.pickers.IosClone$b */
    /* loaded from: classes6.dex */
    class C5906b implements C3755a.AbstractC3758d {

        /* renamed from: a */
        final /* synthetic */ AbstractC5907a.AbstractC0168a f11763a;

        C5906b(AbstractC5907a.AbstractC0168a aVar) {
            this.f11763a = aVar;
        }

        @Override // p035c2.C3755a.AbstractC3758d
        /* renamed from: a */
        public void mo26896a(C3755a aVar, int i, int i2) {
            this.f11763a.mo25540a();
        }
    }

    public IosClone(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m26900q0();
    }

    /* renamed from: q0 */
    private void m26900q0() {
        m26899r0();
        m26898s0();
    }

    /* renamed from: r0 */
    private void m26899r0() {
        C3988a.m33184k(this);
    }

    /* renamed from: s0 */
    private void m26898s0() {
        super.setOnValueChangeListenerInScrolling(new C5905a(this));
    }

    @Override // com.henninghall.date_picker.pickers.AbstractC5907a
    /* renamed from: c */
    public boolean mo26893c() {
        return super.m33676O();
    }

    @Override // com.henninghall.date_picker.pickers.AbstractC5907a
    public View getView() {
        return this;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C3988a.m33186i(this, accessibilityNodeInfo);
    }

    @Override // p035c2.C3755a, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (C3988a.m33185j(this)) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // com.henninghall.date_picker.pickers.AbstractC5907a
    public void setOnValueChangeListenerInScrolling(AbstractC5907a.AbstractC5908b bVar) {
        this.f37608P0 = bVar;
    }

    @Override // com.henninghall.date_picker.pickers.AbstractC5907a
    public void setOnValueChangedListener(AbstractC5907a.AbstractC0168a aVar) {
        super.setOnValueChangedListener(new C5906b(aVar));
    }

    @Override // com.henninghall.date_picker.pickers.AbstractC5907a
    public void setTextColor(String str) {
        int parseColor = Color.parseColor(str);
        setNormalTextColor(Color.parseColor("#70" + str.substring(1)));
        setSelectedTextColor(parseColor);
    }
}
