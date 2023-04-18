.class public Lcom/facebook/react/views/imagehelper/MultiSourceHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/views/imagehelper/MultiSourceHelper$MultiSourceResult;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getBestSourceForSize(IILjava/util/List;)Lcom/facebook/react/views/imagehelper/MultiSourceHelper$MultiSourceResult;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List<",
            "Lcom/facebook/react/views/imagehelper/ImageSource;",
            ">;)",
            "Lcom/facebook/react/views/imagehelper/MultiSourceHelper$MultiSourceResult;"
        }
    .end annotation

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 1
    invoke-static {p0, p1, p2, v0, v1}, Lcom/facebook/react/views/imagehelper/MultiSourceHelper;->getBestSourceForSize(IILjava/util/List;D)Lcom/facebook/react/views/imagehelper/MultiSourceHelper$MultiSourceResult;

    move-result-object p0

    return-object p0
.end method

.method public static getBestSourceForSize(IILjava/util/List;D)Lcom/facebook/react/views/imagehelper/MultiSourceHelper$MultiSourceResult;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List<",
            "Lcom/facebook/react/views/imagehelper/ImageSource;",
            ">;D)",
            "Lcom/facebook/react/views/imagehelper/MultiSourceHelper$MultiSourceResult;"
        }
    .end annotation

    .line 2
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 3
    new-instance p0, Lcom/facebook/react/views/imagehelper/MultiSourceHelper$MultiSourceResult;

    invoke-direct {p0, v1, v1, v1}, Lcom/facebook/react/views/imagehelper/MultiSourceHelper$MultiSourceResult;-><init>(Lcom/facebook/react/views/imagehelper/ImageSource;Lcom/facebook/react/views/imagehelper/ImageSource;Lcom/facebook/react/views/imagehelper/MultiSourceHelper$1;)V

    return-object p0

    .line 4
    :cond_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    .line 5
    new-instance p0, Lcom/facebook/react/views/imagehelper/MultiSourceHelper$MultiSourceResult;

    const/4 p1, 0x0

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/facebook/react/views/imagehelper/ImageSource;

    invoke-direct {p0, p1, v1, v1}, Lcom/facebook/react/views/imagehelper/MultiSourceHelper$MultiSourceResult;-><init>(Lcom/facebook/react/views/imagehelper/ImageSource;Lcom/facebook/react/views/imagehelper/ImageSource;Lcom/facebook/react/views/imagehelper/MultiSourceHelper$1;)V

    return-object p0

    :cond_1
    if-lez p0, :cond_9

    if-gtz p1, :cond_2

    goto/16 :goto_1

    .line 6
    :cond_2
    invoke-static {}, Lcom/facebook/imagepipeline/core/b;->l()Lcom/facebook/imagepipeline/core/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/imagepipeline/core/b;->j()Lcom/facebook/imagepipeline/core/ImagePipeline;

    move-result-object v0

    mul-int/2addr p0, p1

    int-to-double p0, p0

    mul-double/2addr p0, p3

    .line 7
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const-wide p3, 0x7fefffffffffffffL    # Double.MAX_VALUE

    move-wide v2, p3

    move-object v4, v1

    move-object v5, v4

    :cond_3
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/react/views/imagehelper/ImageSource;

    .line 8
    invoke-virtual {v6}, Lcom/facebook/react/views/imagehelper/ImageSource;->getSize()D

    move-result-wide v7

    div-double/2addr v7, p0

    const-wide/high16 v9, 0x3ff0000000000000L    # 1.0

    sub-double/2addr v9, v7

    invoke-static {v9, v10}, Ljava/lang/Math;->abs(D)D

    move-result-wide v7

    cmpg-double v9, v7, p3

    if-gez v9, :cond_4

    .line 9
    invoke-virtual {v6}, Lcom/facebook/react/views/imagehelper/ImageSource;->isForceCached()Z

    move-result v9

    if-nez v9, :cond_4

    move-object v5, v6

    move-wide p3, v7

    :cond_4
    cmpg-double v9, v7, v2

    if-gez v9, :cond_6

    .line 10
    invoke-virtual {v6}, Lcom/facebook/react/views/imagehelper/ImageSource;->getUri()Landroid/net/Uri;

    move-result-object v9

    invoke-virtual {v0, v9}, Lcom/facebook/imagepipeline/core/ImagePipeline;->m(Landroid/net/Uri;)Z

    move-result v9

    if-nez v9, :cond_5

    .line 11
    invoke-virtual {v6}, Lcom/facebook/react/views/imagehelper/ImageSource;->getUri()Landroid/net/Uri;

    move-result-object v9

    invoke-virtual {v0, v9}, Lcom/facebook/imagepipeline/core/ImagePipeline;->o(Landroid/net/Uri;)Z

    move-result v9

    if-eqz v9, :cond_6

    :cond_5
    move-object v4, v6

    move-wide v2, v7

    .line 12
    :cond_6
    invoke-virtual {v6}, Lcom/facebook/react/views/imagehelper/ImageSource;->isForceCached()Z

    move-result v7

    if-eqz v7, :cond_3

    const-wide/16 v2, 0x0

    move-object v4, v6

    goto :goto_0

    :cond_7
    if-eqz v4, :cond_8

    if-eqz v5, :cond_8

    .line 13
    invoke-virtual {v4}, Lcom/facebook/react/views/imagehelper/ImageSource;->getSource()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v5}, Lcom/facebook/react/views/imagehelper/ImageSource;->getSource()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_8

    move-object v4, v1

    .line 14
    :cond_8
    new-instance p0, Lcom/facebook/react/views/imagehelper/MultiSourceHelper$MultiSourceResult;

    invoke-direct {p0, v5, v4, v1}, Lcom/facebook/react/views/imagehelper/MultiSourceHelper$MultiSourceResult;-><init>(Lcom/facebook/react/views/imagehelper/ImageSource;Lcom/facebook/react/views/imagehelper/ImageSource;Lcom/facebook/react/views/imagehelper/MultiSourceHelper$1;)V

    return-object p0

    .line 15
    :cond_9
    :goto_1
    new-instance p0, Lcom/facebook/react/views/imagehelper/MultiSourceHelper$MultiSourceResult;

    invoke-direct {p0, v1, v1, v1}, Lcom/facebook/react/views/imagehelper/MultiSourceHelper$MultiSourceResult;-><init>(Lcom/facebook/react/views/imagehelper/ImageSource;Lcom/facebook/react/views/imagehelper/ImageSource;Lcom/facebook/react/views/imagehelper/MultiSourceHelper$1;)V

    return-object p0
.end method
