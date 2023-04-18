.class Lcom/horcrux/svg/m$a;
.super Lcom/facebook/imagepipeline/datasource/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/horcrux/svg/m;->d(Lcom/facebook/imagepipeline/core/ImagePipeline;Lcom/facebook/imagepipeline/request/ImageRequest;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/horcrux/svg/m;


# direct methods
.method constructor <init>(Lcom/horcrux/svg/m;)V
    .locals 0

    iput-object p1, p0, Lcom/horcrux/svg/m$a;->a:Lcom/horcrux/svg/m;

    invoke-direct {p0}, Lcom/facebook/imagepipeline/datasource/b;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailureImpl(Lcom/facebook/datasource/DataSource;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/horcrux/svg/m$a;->a:Lcom/horcrux/svg/m;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/horcrux/svg/m;->a(Lcom/horcrux/svg/m;)Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Lcom/facebook/datasource/DataSource;->c()Ljava/lang/Throwable;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const-string v0, "RNSVG: fetchDecodedImage failed!"

    .line 16
    .line 17
    new-array v1, v1, [Ljava/lang/Object;

    .line 18
    .line 19
    const-string v2, "ReactNative"

    .line 20
    .line 21
    invoke-static {v2, p1, v0, v1}, Lw3/a;->K(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void
    .line 25
    .line 26
    .line 27
.end method

.method public onNewResultImpl(Landroid/graphics/Bitmap;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/horcrux/svg/m$a;->a:Lcom/horcrux/svg/m;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/horcrux/svg/m;->a(Lcom/horcrux/svg/m;)Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/horcrux/svg/m$a;->a:Lcom/horcrux/svg/m;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/horcrux/svg/VirtualView;->getSvgView()Lcom/horcrux/svg/SvgView;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/horcrux/svg/SvgView;->invalidate()V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method
