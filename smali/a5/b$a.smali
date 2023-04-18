.class La5/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll5/d$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La5/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:La5/b;


# direct methods
.method constructor <init>(La5/b;)V
    .locals 0

    iput-object p1, p0, La5/b$a;->a:La5/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ILandroid/graphics/Bitmap;)V
    .locals 0

    return-void
.end method

.method public b(I)Lcom/facebook/common/references/CloseableReference;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/facebook/common/references/CloseableReference<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, La5/b$a;->a:La5/b;

    invoke-static {v0}, La5/b;->b(La5/b;)Lx4/b;

    move-result-object v0

    invoke-interface {v0, p1}, Lx4/b;->c(I)Lcom/facebook/common/references/CloseableReference;

    move-result-object p1

    return-object p1
.end method
