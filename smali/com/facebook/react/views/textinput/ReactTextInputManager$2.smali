.class Lcom/facebook/react/views/textinput/ReactTextInputManager$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/views/textinput/ReactTextInputManager;->setContextMenuHidden(Lcom/facebook/react/views/textinput/ReactEditText;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/views/textinput/ReactTextInputManager;

.field final synthetic val$_contextMenuHidden:Z


# direct methods
.method constructor <init>(Lcom/facebook/react/views/textinput/ReactTextInputManager;Z)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$2;->this$0:Lcom/facebook/react/views/textinput/ReactTextInputManager;

    iput-boolean p2, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$2;->val$_contextMenuHidden:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLongClick(Landroid/view/View;)Z
    .locals 0

    iget-boolean p1, p0, Lcom/facebook/react/views/textinput/ReactTextInputManager$2;->val$_contextMenuHidden:Z

    return p1
.end method
