.class public final synthetic Lcom/swmansion/rnscreens/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Landroid/app/Activity;

.field public final synthetic l:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/swmansion/rnscreens/y;->k:Landroid/app/Activity;

    iput-object p2, p0, Lcom/swmansion/rnscreens/y;->l:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/swmansion/rnscreens/y;->k:Landroid/app/Activity;

    iget-object v1, p0, Lcom/swmansion/rnscreens/y;->l:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/swmansion/rnscreens/z;->a(Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method
