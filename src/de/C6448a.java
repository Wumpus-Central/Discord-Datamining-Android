package de;

import com.henninghall.date_picker.pickers.AbstractC5907a;
import ee.AbstractC6825g;
import p044ce.AbstractC3992e;

/* renamed from: de.a */
/* loaded from: classes6.dex */
public class C6448a implements AbstractC6457j {

    /* renamed from: a */
    private final AbstractC3992e f13533a;

    /* renamed from: de.a$a */
    /* loaded from: classes6.dex */
    class C0191a implements AbstractC5907a.AbstractC0168a {

        /* renamed from: a */
        final /* synthetic */ AbstractC6825g f13534a;

        C0191a(AbstractC6825g gVar) {
            this.f13534a = gVar;
        }

        @Override // com.henninghall.date_picker.pickers.AbstractC5907a.AbstractC0168a
        /* renamed from: a */
        public void mo25540a() {
            C6448a.this.f13533a.mo33164a(this.f13534a);
        }
    }

    public C6448a(AbstractC3992e eVar) {
        this.f13533a = eVar;
    }

    @Override // de.AbstractC6457j
    /* renamed from: a */
    public void mo25539a(AbstractC6825g gVar) {
        gVar.f14909d.setOnValueChangedListener(new C0191a(gVar));
    }
}
