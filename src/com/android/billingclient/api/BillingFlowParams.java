package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import p377v2.C13405j;
import p377v2.C13406k;
import p377v2.C13407l;
import p377v2.C13408m;
import p377v2.C13409n;
import p377v2.C13410o;
import sa.AbstractC12830b0;
import sa.C12853t;

/* loaded from: classes.dex */
public class BillingFlowParams {

    /* renamed from: a */
    private boolean f6761a;

    /* renamed from: b */
    private String f6762b;

    /* renamed from: c */
    private String f6763c;

    /* renamed from: d */
    private C4102c f6764d;

    /* renamed from: e */
    private AbstractC12830b0 f6765e;

    /* renamed from: f */
    private ArrayList f6766f;

    /* renamed from: g */
    private boolean f6767g;

    /* renamed from: com.android.billingclient.api.BillingFlowParams$a */
    /* loaded from: classes.dex */
    public static class C4099a {

        /* renamed from: a */
        private String f6768a;

        /* renamed from: b */
        private String f6769b;

        /* renamed from: c */
        private List f6770c;

        /* renamed from: d */
        private ArrayList f6771d;

        /* renamed from: e */
        private boolean f6772e;

        /* renamed from: f */
        private C4102c.C4103a f6773f;

        /* synthetic */ C4099a(C13405j jVar) {
            C4102c.C4103a a = C4102c.m32813a();
            a.f6781b = true;
            this.f6773f = a;
        }

        /* renamed from: a */
        public BillingFlowParams m32827a() {
            boolean z;
            boolean z2;
            ArrayList arrayList;
            AbstractC12830b0 b0Var;
            ArrayList arrayList2 = this.f6771d;
            boolean z3 = true;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            List list = this.f6770c;
            if (list == null || list.isEmpty()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z && !z2) {
                throw new IllegalArgumentException("Details of the products must be provided.");
            } else if (!z || !z2) {
                if (!z) {
                    C4100b bVar = (C4100b) this.f6770c.get(0);
                    for (int i = 0; i < this.f6770c.size(); i++) {
                        C4100b bVar2 = (C4100b) this.f6770c.get(i);
                        if (bVar2 == null) {
                            throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                        } else if (i != 0 && !bVar2.m32820b().m32791d().equals(bVar.m32820b().m32791d()) && !bVar2.m32820b().m32791d().equals("play_pass_subs")) {
                            throw new IllegalArgumentException("All products should have same ProductType.");
                        }
                    }
                    String g = bVar.m32820b().m32788g();
                    for (C4100b bVar3 : this.f6770c) {
                        if (!(bVar.m32820b().m32791d().equals("play_pass_subs") || bVar3.m32820b().m32791d().equals("play_pass_subs") || g.equals(bVar3.m32820b().m32788g()))) {
                            throw new IllegalArgumentException("All products must have the same package name.");
                        }
                    }
                } else if (this.f6771d.contains(null)) {
                    throw new IllegalArgumentException("SKU cannot be null.");
                } else if (this.f6771d.size() > 1) {
                    SkuDetails skuDetails = (SkuDetails) this.f6771d.get(0);
                    String g2 = skuDetails.m32744g();
                    ArrayList arrayList3 = this.f6771d;
                    int size = arrayList3.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        SkuDetails skuDetails2 = (SkuDetails) arrayList3.get(i2);
                        if (!g2.equals("play_pass_subs") && !skuDetails2.m32744g().equals("play_pass_subs") && !g2.equals(skuDetails2.m32744g())) {
                            throw new IllegalArgumentException("SKUs should have the same type.");
                        }
                    }
                    String k = skuDetails.m32740k();
                    ArrayList arrayList4 = this.f6771d;
                    int size2 = arrayList4.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        SkuDetails skuDetails3 = (SkuDetails) arrayList4.get(i3);
                        if (!g2.equals("play_pass_subs") && !skuDetails3.m32744g().equals("play_pass_subs") && !k.equals(skuDetails3.m32740k())) {
                            throw new IllegalArgumentException("All SKUs must have the same package name.");
                        }
                    }
                }
                BillingFlowParams billingFlowParams = new BillingFlowParams(null);
                if ((!z || ((SkuDetails) this.f6771d.get(0)).m32740k().isEmpty()) && (!z2 || ((C4100b) this.f6770c.get(0)).m32820b().m32788g().isEmpty())) {
                    z3 = false;
                }
                billingFlowParams.f6761a = z3;
                billingFlowParams.f6762b = this.f6768a;
                billingFlowParams.f6763c = this.f6769b;
                billingFlowParams.f6764d = this.f6773f.m32807a();
                ArrayList arrayList5 = this.f6771d;
                if (arrayList5 != null) {
                    arrayList = new ArrayList(arrayList5);
                } else {
                    arrayList = new ArrayList();
                }
                billingFlowParams.f6766f = arrayList;
                billingFlowParams.f6767g = this.f6772e;
                List list2 = this.f6770c;
                if (list2 != null) {
                    b0Var = AbstractC12830b0.m5314t(list2);
                } else {
                    b0Var = AbstractC12830b0.m5313u();
                }
                billingFlowParams.f6765e = b0Var;
                return billingFlowParams;
            } else {
                throw new IllegalArgumentException("Set SkuDetails or ProductDetailsParams, not both.");
            }
        }

        /* renamed from: b */
        public C4099a m32826b(boolean z) {
            this.f6772e = z;
            return this;
        }

        /* renamed from: c */
        public C4099a m32825c(String str) {
            this.f6768a = str;
            return this;
        }

        /* renamed from: d */
        public C4099a m32824d(List<C4100b> list) {
            this.f6770c = new ArrayList(list);
            return this;
        }

        @Deprecated
        /* renamed from: e */
        public C4099a m32823e(SkuDetails skuDetails) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(skuDetails);
            this.f6771d = arrayList;
            return this;
        }

        /* renamed from: f */
        public C4099a m32822f(C4102c cVar) {
            this.f6773f = C4102c.m32811c(cVar);
            return this;
        }
    }

    /* renamed from: com.android.billingclient.api.BillingFlowParams$b */
    /* loaded from: classes.dex */
    public static final class C4100b {

        /* renamed from: a */
        private final ProductDetails f6774a;

        /* renamed from: b */
        private final String f6775b;

        /* renamed from: com.android.billingclient.api.BillingFlowParams$b$a */
        /* loaded from: classes.dex */
        public static class C4101a {

            /* renamed from: a */
            private ProductDetails f6776a;

            /* renamed from: b */
            private String f6777b;

            /* synthetic */ C4101a(C13406k kVar) {
            }

            /* renamed from: a */
            public C4100b m32818a() {
                C12853t.m5263c(this.f6776a, "ProductDetails is required for constructing ProductDetailsParams.");
                C12853t.m5263c(this.f6777b, "offerToken is required for constructing ProductDetailsParams.");
                return new C4100b(this, null);
            }

            /* renamed from: b */
            public C4101a m32817b(String str) {
                this.f6777b = str;
                return this;
            }

            /* renamed from: c */
            public C4101a m32816c(ProductDetails productDetails) {
                this.f6776a = productDetails;
                if (productDetails.m32793b() != null) {
                    productDetails.m32793b().getClass();
                    this.f6777b = productDetails.m32793b().m32782d();
                }
                return this;
            }
        }

        /* synthetic */ C4100b(C4101a aVar, C13407l lVar) {
            this.f6774a = aVar.f6776a;
            this.f6775b = aVar.f6777b;
        }

        /* renamed from: a */
        public static C4101a m32821a() {
            return new C4101a(null);
        }

        /* renamed from: b */
        public final ProductDetails m32820b() {
            return this.f6774a;
        }

        /* renamed from: c */
        public final String m32819c() {
            return this.f6775b;
        }
    }

    /* renamed from: com.android.billingclient.api.BillingFlowParams$c */
    /* loaded from: classes.dex */
    public static class C4102c {

        /* renamed from: a */
        private String f6778a;

        /* renamed from: b */
        private int f6779b = 0;

        /* renamed from: com.android.billingclient.api.BillingFlowParams$c$a */
        /* loaded from: classes.dex */
        public static class C4103a {

            /* renamed from: a */
            private String f6780a;

            /* renamed from: b */
            private boolean f6781b;

            /* renamed from: c */
            private int f6782c = 0;

            /* synthetic */ C4103a(C13408m mVar) {
            }

            /* renamed from: a */
            public C4102c m32807a() {
                boolean z;
                if (!TextUtils.isEmpty(this.f6780a) || !TextUtils.isEmpty(null)) {
                    z = true;
                } else {
                    z = false;
                }
                boolean isEmpty = true ^ TextUtils.isEmpty(null);
                if (z && isEmpty) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                } else if (this.f6781b || z || isEmpty) {
                    C4102c cVar = new C4102c(null);
                    cVar.f6778a = this.f6780a;
                    cVar.f6779b = this.f6782c;
                    return cVar;
                } else {
                    throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
            }

            /* renamed from: b */
            public C4103a m32806b(String str) {
                this.f6780a = str;
                return this;
            }

            @Deprecated
            /* renamed from: c */
            public C4103a m32805c(String str) {
                this.f6780a = str;
                return this;
            }

            /* renamed from: d */
            public C4103a m32804d(int i) {
                this.f6782c = i;
                return this;
            }

            @Deprecated
            /* renamed from: e */
            public C4103a m32803e(int i) {
                this.f6782c = i;
                return this;
            }
        }

        /* synthetic */ C4102c(C13409n nVar) {
        }

        /* renamed from: a */
        public static C4103a m32813a() {
            return new C4103a(null);
        }

        /* renamed from: c */
        static /* bridge */ /* synthetic */ C4103a m32811c(C4102c cVar) {
            C4103a a = m32813a();
            a.m32805c(cVar.f6778a);
            a.m32803e(cVar.f6779b);
            return a;
        }

        /* renamed from: b */
        final int m32812b() {
            return this.f6779b;
        }

        /* renamed from: d */
        final String m32810d() {
            return this.f6778a;
        }
    }

    private BillingFlowParams() {
    }

    /* synthetic */ BillingFlowParams(C13410o oVar) {
    }

    /* renamed from: a */
    public static C4099a m32843a() {
        return new C4099a(null);
    }

    /* renamed from: b */
    public final int m32842b() {
        return this.f6764d.m32812b();
    }

    /* renamed from: c */
    public final String m32841c() {
        return this.f6762b;
    }

    /* renamed from: d */
    public final String m32840d() {
        return this.f6763c;
    }

    /* renamed from: e */
    public final String m32839e() {
        return this.f6764d.m32810d();
    }

    /* renamed from: f */
    public final ArrayList m32838f() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f6766f);
        return arrayList;
    }

    /* renamed from: g */
    public final List m32837g() {
        return this.f6765e;
    }

    /* renamed from: o */
    public final boolean m32829o() {
        return this.f6767g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public final boolean m32828p() {
        return (this.f6762b == null && this.f6763c == null && this.f6764d.m32812b() == 0 && !this.f6761a && !this.f6767g) ? false : true;
    }
}
