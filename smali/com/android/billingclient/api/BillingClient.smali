.class public abstract Lcom/android/billingclient/api/BillingClient;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/billingclient/api/BillingClient$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static f(Landroid/content/Context;)Lcom/android/billingclient/api/BillingClient$a;
    .locals 2

    new-instance v0, Lcom/android/billingclient/api/BillingClient$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/android/billingclient/api/BillingClient$a;-><init>(Landroid/content/Context;Lv2/d0;)V

    return-object v0
.end method


# virtual methods
.method public abstract a(Lv2/b;Lv2/c;)V
.end method

.method public abstract b()V
.end method

.method public abstract c(Ljava/lang/String;)Lcom/android/billingclient/api/BillingResult;
.end method

.method public abstract d()Z
.end method

.method public abstract e(Landroid/app/Activity;Lcom/android/billingclient/api/BillingFlowParams;)Lcom/android/billingclient/api/BillingResult;
.end method

.method public abstract g(Lcom/android/billingclient/api/QueryProductDetailsParams;Lv2/d;)V
.end method

.method public abstract h(Ljava/lang/String;Lv2/e;)V
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract i(Lcom/android/billingclient/api/SkuDetailsParams;Lv2/g;)V
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract j(Lv2/a;)V
.end method
