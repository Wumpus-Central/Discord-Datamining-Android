.class public final synthetic Lcom/discord/billing/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu2/d;


# instance fields
.field public final synthetic a:Lcom/discord/billing/BillingManager;

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Landroid/app/Activity;

.field public final synthetic i:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(Lcom/discord/billing/BillingManager;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/billing/a;->a:Lcom/discord/billing/BillingManager;

    iput-object p2, p0, Lcom/discord/billing/a;->b:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lcom/discord/billing/a;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/discord/billing/a;->d:Ljava/lang/String;

    iput-object p5, p0, Lcom/discord/billing/a;->e:Ljava/lang/String;

    iput-object p6, p0, Lcom/discord/billing/a;->f:Ljava/lang/String;

    iput-object p7, p0, Lcom/discord/billing/a;->g:Ljava/lang/String;

    iput-object p8, p0, Lcom/discord/billing/a;->h:Landroid/app/Activity;

    iput-object p9, p0, Lcom/discord/billing/a;->i:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final a(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V
    .locals 11

    iget-object v0, p0, Lcom/discord/billing/a;->a:Lcom/discord/billing/BillingManager;

    iget-object v1, p0, Lcom/discord/billing/a;->b:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lcom/discord/billing/a;->c:Ljava/lang/String;

    iget-object v3, p0, Lcom/discord/billing/a;->d:Ljava/lang/String;

    iget-object v4, p0, Lcom/discord/billing/a;->e:Ljava/lang/String;

    iget-object v5, p0, Lcom/discord/billing/a;->f:Ljava/lang/String;

    iget-object v6, p0, Lcom/discord/billing/a;->g:Ljava/lang/String;

    iget-object v7, p0, Lcom/discord/billing/a;->h:Landroid/app/Activity;

    iget-object v8, p0, Lcom/discord/billing/a;->i:Lkotlin/jvm/functions/Function0;

    move-object v9, p1

    move-object v10, p2

    invoke-static/range {v0 .. v10}, Lcom/discord/billing/BillingManager;->g(Lcom/discord/billing/BillingManager;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;Lkotlin/jvm/functions/Function0;Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V

    return-void
.end method
