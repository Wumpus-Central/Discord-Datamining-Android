.class Lcom/facebook/react/modules/toast/ToastModule$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/modules/toast/ToastModule;->showWithGravityAndOffset(Ljava/lang/String;DDDD)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/modules/toast/ToastModule;

.field final synthetic val$duration:I

.field final synthetic val$gravity:I

.field final synthetic val$message:Ljava/lang/String;

.field final synthetic val$xOffset:I

.field final synthetic val$yOffset:I


# direct methods
.method constructor <init>(Lcom/facebook/react/modules/toast/ToastModule;Ljava/lang/String;IIII)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/modules/toast/ToastModule$3;->this$0:Lcom/facebook/react/modules/toast/ToastModule;

    iput-object p2, p0, Lcom/facebook/react/modules/toast/ToastModule$3;->val$message:Ljava/lang/String;

    iput p3, p0, Lcom/facebook/react/modules/toast/ToastModule$3;->val$duration:I

    iput p4, p0, Lcom/facebook/react/modules/toast/ToastModule$3;->val$gravity:I

    iput p5, p0, Lcom/facebook/react/modules/toast/ToastModule$3;->val$xOffset:I

    iput p6, p0, Lcom/facebook/react/modules/toast/ToastModule$3;->val$yOffset:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/facebook/react/modules/toast/ToastModule$3;->this$0:Lcom/facebook/react/modules/toast/ToastModule;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/facebook/react/modules/toast/ToastModule;->access$200(Lcom/facebook/react/modules/toast/ToastModule;)Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/facebook/react/modules/toast/ToastModule$3;->val$message:Ljava/lang/String;

    .line 8
    .line 9
    iget v2, p0, Lcom/facebook/react/modules/toast/ToastModule$3;->val$duration:I

    .line 10
    .line 11
    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget v1, p0, Lcom/facebook/react/modules/toast/ToastModule$3;->val$gravity:I

    .line 16
    .line 17
    iget v2, p0, Lcom/facebook/react/modules/toast/ToastModule$3;->val$xOffset:I

    .line 18
    .line 19
    iget v3, p0, Lcom/facebook/react/modules/toast/ToastModule$3;->val$yOffset:I

    .line 20
    .line 21
    invoke-virtual {v0, v1, v2, v3}, Landroid/widget/Toast;->setGravity(III)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 25
    .line 26
    .line 27
    return-void
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
.end method
