.class Lcom/facebook/react/devsupport/RedBoxContentView$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/devsupport/interfaces/RedBoxHandler$ReportCompletedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/devsupport/RedBoxContentView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/devsupport/RedBoxContentView;


# direct methods
.method constructor <init>(Lcom/facebook/react/devsupport/RedBoxContentView;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/devsupport/RedBoxContentView$1;->this$0:Lcom/facebook/react/devsupport/RedBoxContentView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onReportError(Landroid/text/SpannedString;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView$1;->this$0:Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lcom/facebook/react/devsupport/RedBoxContentView;->access$002(Lcom/facebook/react/devsupport/RedBoxContentView;Z)Z

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView$1;->this$0:Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/facebook/react/devsupport/RedBoxContentView;->access$100(Lcom/facebook/react/devsupport/RedBoxContentView;)Landroid/widget/Button;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Lc6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Landroid/widget/Button;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView$1;->this$0:Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 24
    .line 25
    invoke-static {v0}, Lcom/facebook/react/devsupport/RedBoxContentView;->access$200(Lcom/facebook/react/devsupport/RedBoxContentView;)Landroid/widget/ProgressBar;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, Lc6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Landroid/widget/ProgressBar;

    .line 34
    .line 35
    const/16 v1, 0x8

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView$1;->this$0:Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 41
    .line 42
    invoke-static {v0}, Lcom/facebook/react/devsupport/RedBoxContentView;->access$300(Lcom/facebook/react/devsupport/RedBoxContentView;)Landroid/widget/TextView;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-static {v0}, Lc6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Landroid/widget/TextView;

    .line 51
    .line 52
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 53
    .line 54
    .line 55
    return-void
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
.end method

.method public onReportSuccess(Landroid/text/SpannedString;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView$1;->this$0:Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lcom/facebook/react/devsupport/RedBoxContentView;->access$002(Lcom/facebook/react/devsupport/RedBoxContentView;Z)Z

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView$1;->this$0:Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/facebook/react/devsupport/RedBoxContentView;->access$100(Lcom/facebook/react/devsupport/RedBoxContentView;)Landroid/widget/Button;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Lc6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Landroid/widget/Button;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView$1;->this$0:Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 24
    .line 25
    invoke-static {v0}, Lcom/facebook/react/devsupport/RedBoxContentView;->access$200(Lcom/facebook/react/devsupport/RedBoxContentView;)Landroid/widget/ProgressBar;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, Lc6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Landroid/widget/ProgressBar;

    .line 34
    .line 35
    const/16 v1, 0x8

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView$1;->this$0:Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 41
    .line 42
    invoke-static {v0}, Lcom/facebook/react/devsupport/RedBoxContentView;->access$300(Lcom/facebook/react/devsupport/RedBoxContentView;)Landroid/widget/TextView;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-static {v0}, Lc6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Landroid/widget/TextView;

    .line 51
    .line 52
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 53
    .line 54
    .line 55
    return-void
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
.end method
