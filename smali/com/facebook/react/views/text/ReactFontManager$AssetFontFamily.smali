.class Lcom/facebook/react/views/text/ReactFontManager$AssetFontFamily;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/views/text/ReactFontManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "AssetFontFamily"
.end annotation


# instance fields
.field private mTypefaceSparseArray:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Landroid/graphics/Typeface;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Landroid/util/SparseArray;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Landroid/util/SparseArray;-><init>(I)V

    iput-object v0, p0, Lcom/facebook/react/views/text/ReactFontManager$AssetFontFamily;->mTypefaceSparseArray:Landroid/util/SparseArray;

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/react/views/text/ReactFontManager$1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/views/text/ReactFontManager$AssetFontFamily;-><init>()V

    return-void
.end method


# virtual methods
.method public getTypefaceForStyle(I)Landroid/graphics/Typeface;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/text/ReactFontManager$AssetFontFamily;->mTypefaceSparseArray:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Typeface;

    return-object p1
.end method

.method public setTypefaceForStyle(ILandroid/graphics/Typeface;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/text/ReactFontManager$AssetFontFamily;->mTypefaceSparseArray:Landroid/util/SparseArray;

    invoke-virtual {v0, p1, p2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-void
.end method
