.class public final synthetic Lcom/discord/billing/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu2/f;


# instance fields
.field public final synthetic a:Lcom/discord/billing/BillingManager;


# direct methods
.method public synthetic constructor <init>(Lcom/discord/billing/BillingManager;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/billing/e;->a:Lcom/discord/billing/BillingManager;

    return-void
.end method


# virtual methods
.method public final a(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V
    .locals 1

    iget-object v0, p0, Lcom/discord/billing/e;->a:Lcom/discord/billing/BillingManager;

    invoke-static {v0, p1, p2}, Lcom/discord/billing/BillingManager;->e(Lcom/discord/billing/BillingManager;Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V

    return-void
.end method
