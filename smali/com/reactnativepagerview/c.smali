.class public final synthetic Lcom/reactnativepagerview/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Landroidx/viewpager2/widget/f;

.field public final synthetic l:Lcom/reactnativepagerview/PagerViewViewManager;

.field public final synthetic m:Lcom/reactnativepagerview/a;


# direct methods
.method public synthetic constructor <init>(Landroidx/viewpager2/widget/f;Lcom/reactnativepagerview/PagerViewViewManager;Lcom/reactnativepagerview/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/reactnativepagerview/c;->k:Landroidx/viewpager2/widget/f;

    iput-object p2, p0, Lcom/reactnativepagerview/c;->l:Lcom/reactnativepagerview/PagerViewViewManager;

    iput-object p3, p0, Lcom/reactnativepagerview/c;->m:Lcom/reactnativepagerview/a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/reactnativepagerview/c;->k:Landroidx/viewpager2/widget/f;

    iget-object v1, p0, Lcom/reactnativepagerview/c;->l:Lcom/reactnativepagerview/PagerViewViewManager;

    iget-object v2, p0, Lcom/reactnativepagerview/c;->m:Lcom/reactnativepagerview/a;

    invoke-static {v0, v1, v2}, Lcom/reactnativepagerview/PagerViewViewManager;->a(Landroidx/viewpager2/widget/f;Lcom/reactnativepagerview/PagerViewViewManager;Lcom/reactnativepagerview/a;)V

    return-void
.end method
