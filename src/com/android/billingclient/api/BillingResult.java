package com.android.billingclient.api;

import p377v2.C13411p;
import sa.C12844k;

/* loaded from: classes.dex */
public final class BillingResult {

    /* renamed from: a */
    private int f6783a;

    /* renamed from: b */
    private String f6784b;

    /* renamed from: com.android.billingclient.api.BillingResult$a */
    /* loaded from: classes.dex */
    public static class C4104a {

        /* renamed from: a */
        private int f6785a;

        /* renamed from: b */
        private String f6786b = "";

        /* synthetic */ C4104a(C13411p pVar) {
        }

        /* renamed from: a */
        public BillingResult m32797a() {
            BillingResult billingResult = new BillingResult();
            billingResult.f6783a = this.f6785a;
            billingResult.f6784b = this.f6786b;
            return billingResult;
        }

        /* renamed from: b */
        public C4104a m32796b(String str) {
            this.f6786b = str;
            return this;
        }

        /* renamed from: c */
        public C4104a m32795c(int i) {
            this.f6785a = i;
            return this;
        }
    }

    /* renamed from: b */
    public static C4104a m32800b() {
        return new C4104a(null);
    }

    /* renamed from: a */
    public int m32801a() {
        return this.f6783a;
    }

    public String toString() {
        String j = C12844k.m5288j(this.f6783a);
        String str = this.f6784b;
        return "Response Code: " + j + ", Debug Message: " + str;
    }
}
