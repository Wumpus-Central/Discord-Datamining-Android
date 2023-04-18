.class public final synthetic Lcom/swmansion/rnscreens/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Landroid/view/Window;

.field public final synthetic l:I


# direct methods
.method public synthetic constructor <init>(Landroid/view/Window;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/swmansion/rnscreens/x;->k:Landroid/view/Window;

    iput p2, p0, Lcom/swmansion/rnscreens/x;->l:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/swmansion/rnscreens/x;->k:Landroid/view/Window;

    iget v1, p0, Lcom/swmansion/rnscreens/x;->l:I

    invoke-static {v0, v1}, Lcom/swmansion/rnscreens/z;->c(Landroid/view/Window;I)V

    return-void
.end method
