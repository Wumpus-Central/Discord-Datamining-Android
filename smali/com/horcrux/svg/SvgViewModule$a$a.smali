.class Lcom/horcrux/svg/SvgViewModule$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/horcrux/svg/SvgViewModule$a;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Lcom/horcrux/svg/SvgViewModule$a;


# direct methods
.method constructor <init>(Lcom/horcrux/svg/SvgViewModule$a;)V
    .locals 0

    iput-object p1, p0, Lcom/horcrux/svg/SvgViewModule$a$a;->k:Lcom/horcrux/svg/SvgViewModule$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/horcrux/svg/SvgViewModule$a$a;->k:Lcom/horcrux/svg/SvgViewModule$a;

    .line 2
    .line 3
    iget v0, v0, Lcom/horcrux/svg/SvgViewModule$a;->k:I

    .line 4
    .line 5
    invoke-static {v0}, Lcom/horcrux/svg/SvgViewManager;->getSvgViewByTag(I)Lcom/horcrux/svg/SvgView;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    new-instance v1, Lcom/horcrux/svg/SvgViewModule$a$a$a;

    .line 13
    .line 14
    invoke-direct {v1, p0}, Lcom/horcrux/svg/SvgViewModule$a$a$a;-><init>(Lcom/horcrux/svg/SvgViewModule$a$a;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lcom/horcrux/svg/SvgView;->setToDataUrlTask(Ljava/lang/Runnable;)V

    .line 18
    .line 19
    .line 20
    return-void
    .line 21
    .line 22
    .line 23
.end method
