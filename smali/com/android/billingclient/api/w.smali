.class public final synthetic Lcom/android/billingclient/api/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lu2/c;

.field public final synthetic l:Lu2/b;


# direct methods
.method public synthetic constructor <init>(Lu2/c;Lu2/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/android/billingclient/api/w;->k:Lu2/c;

    iput-object p2, p0, Lcom/android/billingclient/api/w;->l:Lu2/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/w;->k:Lu2/c;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/android/billingclient/api/w;->l:Lu2/b;

    .line 4
    .line 5
    sget-object v2, Lcom/android/billingclient/api/k;->n:Lcom/android/billingclient/api/BillingResult;

    .line 6
    .line 7
    invoke-virtual {v1}, Lu2/b;->a()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-interface {v0, v2, v1}, Lu2/c;->a(Lcom/android/billingclient/api/BillingResult;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method
