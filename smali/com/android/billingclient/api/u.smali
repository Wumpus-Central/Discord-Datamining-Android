.class public final synthetic Lcom/android/billingclient/api/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lu2/d;


# direct methods
.method public synthetic constructor <init>(Lu2/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/android/billingclient/api/u;->k:Lu2/d;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/android/billingclient/api/u;->k:Lu2/d;

    sget-object v1, Lcom/android/billingclient/api/k;->n:Lcom/android/billingclient/api/BillingResult;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0, v1, v2}, Lu2/d;->a(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V

    return-void
.end method
