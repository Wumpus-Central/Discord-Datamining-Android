.class Lk5/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll5/d$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk5/e;->d(Lj5/c;Landroid/graphics/Bitmap$Config;I)Lcom/facebook/common/references/CloseableReference;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lk5/e;


# direct methods
.method constructor <init>(Lk5/e;)V
    .locals 0

    iput-object p1, p0, Lk5/e$a;->a:Lk5/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ILandroid/graphics/Bitmap;)V
    .locals 0

    return-void
.end method

.method public b(I)Lcom/facebook/common/references/CloseableReference;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/facebook/common/references/CloseableReference<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method
