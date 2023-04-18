.class Landroidx/fragment/app/c$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/c;->x(Ljava/util/List;Ljava/util/List;ZLandroidx/fragment/app/s$e;Landroidx/fragment/app/s$e;)Ljava/util/Map;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Landroidx/fragment/app/q;

.field final synthetic l:Landroid/view/View;

.field final synthetic m:Landroid/graphics/Rect;

.field final synthetic n:Landroidx/fragment/app/c;


# direct methods
.method constructor <init>(Landroidx/fragment/app/c;Landroidx/fragment/app/q;Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/c$h;->n:Landroidx/fragment/app/c;

    iput-object p2, p0, Landroidx/fragment/app/c$h;->k:Landroidx/fragment/app/q;

    iput-object p3, p0, Landroidx/fragment/app/c$h;->l:Landroid/view/View;

    iput-object p4, p0, Landroidx/fragment/app/c$h;->m:Landroid/graphics/Rect;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/c$h;->k:Landroidx/fragment/app/q;

    iget-object v1, p0, Landroidx/fragment/app/c$h;->l:Landroid/view/View;

    iget-object v2, p0, Landroidx/fragment/app/c$h;->m:Landroid/graphics/Rect;

    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/q;->k(Landroid/view/View;Landroid/graphics/Rect;)V

    return-void
.end method
