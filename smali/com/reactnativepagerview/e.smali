.class public final synthetic Lcom/reactnativepagerview/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/viewpager2/widget/f$k;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroidx/viewpager2/widget/f;


# direct methods
.method public synthetic constructor <init>(ILandroidx/viewpager2/widget/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/reactnativepagerview/e;->a:I

    iput-object p2, p0, Lcom/reactnativepagerview/e;->b:Landroidx/viewpager2/widget/f;

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;F)V
    .locals 2

    iget v0, p0, Lcom/reactnativepagerview/e;->a:I

    iget-object v1, p0, Lcom/reactnativepagerview/e;->b:Landroidx/viewpager2/widget/f;

    invoke-static {v0, v1, p1, p2}, Lcom/reactnativepagerview/g;->b(ILandroidx/viewpager2/widget/f;Landroid/view/View;F)V

    return-void
.end method
