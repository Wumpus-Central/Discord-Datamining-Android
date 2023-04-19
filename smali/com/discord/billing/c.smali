.class public final synthetic Lcom/discord/billing/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu2/c;


# instance fields
.field public final synthetic a:Lcom/discord/billing/BillingManager;

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(Lcom/discord/billing/BillingManager;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/billing/c;->a:Lcom/discord/billing/BillingManager;

    iput-object p2, p0, Lcom/discord/billing/c;->b:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lcom/discord/billing/c;->c:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final a(Lcom/android/billingclient/api/BillingResult;Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/discord/billing/c;->a:Lcom/discord/billing/BillingManager;

    iget-object v1, p0, Lcom/discord/billing/c;->b:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lcom/discord/billing/c;->c:Lkotlin/jvm/functions/Function0;

    invoke-static {v0, v1, v2, p1, p2}, Lcom/discord/billing/BillingManager;->a(Lcom/discord/billing/BillingManager;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/android/billingclient/api/BillingResult;Ljava/lang/String;)V

    return-void
.end method
