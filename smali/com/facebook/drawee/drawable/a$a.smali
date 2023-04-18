.class Lcom/facebook/drawee/drawable/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/drawee/drawable/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/drawee/drawable/a;->a(I)Lcom/facebook/drawee/drawable/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:I

.field final synthetic l:Lcom/facebook/drawee/drawable/a;


# direct methods
.method constructor <init>(Lcom/facebook/drawee/drawable/a;I)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/drawee/drawable/a$a;->l:Lcom/facebook/drawee/drawable/a;

    iput p2, p0, Lcom/facebook/drawee/drawable/a$a;->k:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDrawable()Landroid/graphics/drawable/Drawable;
    .locals 2

    iget-object v0, p0, Lcom/facebook/drawee/drawable/a$a;->l:Lcom/facebook/drawee/drawable/a;

    iget v1, p0, Lcom/facebook/drawee/drawable/a$a;->k:I

    invoke-virtual {v0, v1}, Lcom/facebook/drawee/drawable/a;->b(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public setDrawable(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    .locals 2

    iget-object v0, p0, Lcom/facebook/drawee/drawable/a$a;->l:Lcom/facebook/drawee/drawable/a;

    iget v1, p0, Lcom/facebook/drawee/drawable/a$a;->k:I

    invoke-virtual {v0, v1, p1}, Lcom/facebook/drawee/drawable/a;->e(ILandroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1
.end method
