.class public final synthetic Lcom/discord/billing/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu2/g;


# instance fields
.field public final synthetic a:Lcom/discord/billing/BillingManager;

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:Landroid/app/Activity;

.field public final synthetic h:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(Lcom/discord/billing/BillingManager;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/billing/d;->a:Lcom/discord/billing/BillingManager;

    iput-object p2, p0, Lcom/discord/billing/d;->b:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lcom/discord/billing/d;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/discord/billing/d;->d:Ljava/lang/String;

    iput-object p5, p0, Lcom/discord/billing/d;->e:Ljava/lang/String;

    iput-object p6, p0, Lcom/discord/billing/d;->f:Ljava/lang/String;

    iput-object p7, p0, Lcom/discord/billing/d;->g:Landroid/app/Activity;

    iput-object p8, p0, Lcom/discord/billing/d;->h:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final a(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V
    .locals 10

    iget-object v0, p0, Lcom/discord/billing/d;->a:Lcom/discord/billing/BillingManager;

    iget-object v1, p0, Lcom/discord/billing/d;->b:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lcom/discord/billing/d;->c:Ljava/lang/String;

    iget-object v3, p0, Lcom/discord/billing/d;->d:Ljava/lang/String;

    iget-object v4, p0, Lcom/discord/billing/d;->e:Ljava/lang/String;

    iget-object v5, p0, Lcom/discord/billing/d;->f:Ljava/lang/String;

    iget-object v6, p0, Lcom/discord/billing/d;->g:Landroid/app/Activity;

    iget-object v7, p0, Lcom/discord/billing/d;->h:Lkotlin/jvm/functions/Function0;

    move-object v8, p1

    move-object v9, p2

    invoke-static/range {v0 .. v9}, Lcom/discord/billing/BillingManager;->c(Lcom/discord/billing/BillingManager;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;Lkotlin/jvm/functions/Function0;Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V

    return-void
.end method
