.class public final synthetic Lcom/discord/billing/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu2/d;


# instance fields
.field public final synthetic a:Lcom/discord/billing/BillingManager;

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lcom/discord/billing/BillingManager;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/billing/b;->a:Lcom/discord/billing/BillingManager;

    iput-object p2, p0, Lcom/discord/billing/b;->b:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lcom/discord/billing/b;->c:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final a(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V
    .locals 3

    iget-object v0, p0, Lcom/discord/billing/b;->a:Lcom/discord/billing/BillingManager;

    iget-object v1, p0, Lcom/discord/billing/b;->b:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lcom/discord/billing/b;->c:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2, p1, p2}, Lcom/discord/billing/BillingManager;->a(Lcom/discord/billing/BillingManager;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V

    return-void
.end method
